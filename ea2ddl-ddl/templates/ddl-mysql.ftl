<#comment>
<#list tableList as table>
<#list table.foreignKeyList as fk>ALTER TABLE ${table.name} DROP CONSTRAINT ${fk.name}
;
</#list>
</#list>
<#list tableList as table>
DROP TABLE ${table.name};
</#list>
</#comment>

<#list tableList as table>
CREATE TABLE ${table.name} (
<#list table.columnList as column>	${column.name} ${column.definition}<#if column.alias?? || column.note??> COMMENT '<#if column.alias??>${column.alias}:</#if><#if column.note??>${column.note}</#if>'</#if><#if column_has_next>,</#if>
</#list>
<#if !table.suppressCommonColumn>
	, create_user		VARCHAR(20)	NOT NULL
	, create_datetime	DATETIME	NOT NULL
	, update_user		VARCHAR(20)	NOT NULL
	, update_datetime	DATETIME	NOT NULL
	, version_no		INTEGER		NOT NULL
</#if>
<#if table.primaryKey??>
	, CONSTRAINT PRIMARY KEY (<#list table.primaryKey.columnNameList as columnName>${columnName}<#if columnName_has_next>,</#if></#list>)
</#if>
<#list table.uniqueList as unique>
	, CONSTRAINT UNIQUE KEY$ {unique.name} (<#list unique.columnNameList as columnName>${columnName}<#if columnName_has_next>,</#if></#list>)
</#list>
<#list table.indexList as index>
	, INDEX ${index.name} (<#list index.columnList as columnName>${columnName}<#if columnName_has_next>,</#if></#list>)
</#list>
) ENGINE=InnoDB<#if table.alias?? || table.note??> COMMENT='<#if table.alias??>${table.alias}:</#if><#if table.note??>${table.note}</#if>'</#if>
;

</#list>

<#list tableList as table>
<#list table.foreignKeyList as fk>ALTER TABLE ${table.name} ADD CONSTRAINT ${fk.name}
	FOREIGN KEY (<#list fk.columnNameList as columnName>${columnName}<#if columnName_has_next>,</#if></#list>)
	REFERENCES ${fk.targetTable} (<#list fk.targetColumnNameList as columnName>${columnName}<#if columnName_has_next>,</#if></#list>)
;
</#list>
</#list>
