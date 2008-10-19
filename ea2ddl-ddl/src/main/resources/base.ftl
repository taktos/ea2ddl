<#list tableList as table>
DROP TABLE ${table.name};
</#list>

<#list tableList as table>
CREATE TABLE ${table.name} (
<#list table.columnList as column>	${column.name} ${column.definition}<#if column_has_next>,</#if>
</#list>
)
;
<#if table.primaryKey??>ALTER TABLE ${table.name} ADD CONSTRAINT ${table.primaryKey.name}
	PRIMARY KEY (<#list table.primaryKey.columnNameList as columnName>${columnName}<#if columnName_has_next>,</#if></#list>)
;
</#if>
<#list table.uniqueList as unique>ALTER TABLE ${table.name} ADD CONSTRAINT ${unique.name}
	UNIQUE (<#list unique.columnNameList as columnName>${columnName}<#if columnName_has_next>,</#if></#list>)
;
</#list>
<#if table.comment??>
COMMENT ON TABLE ${table.name} IS '${table.comment}'
;
</#if>
<#list table.columnList as column>
<#if column.comment??>
COMMENT ON COLUMN ${table.name}.${column.name} IS '${column.comment}'
;
</#if>
</#list>

</#list>

<#list tableList as table>
<#list table.foreignKeyList as fk>ALTER TABLE ${table.name} ADD CONSTRAINT ${fk.name}
	FOREIGN KEY (<#list fk.columnNameList as columnName>${columnName}<#if columnName_has_next>,</#if></#list>)
	REFERENCES ${fk.targetTable} (<#list fk.targetColumnNameList as columnName>${columnName}<#if columnName_has_next>,</#if></#list>)
;
</#list>
</#list>