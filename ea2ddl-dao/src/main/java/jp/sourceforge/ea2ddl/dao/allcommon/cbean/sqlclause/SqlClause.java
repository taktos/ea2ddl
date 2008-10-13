package jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.ConditionKey;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.ConditionOption;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;

/**
 * The interface of SQL-clause.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface SqlClause {

    // =====================================================================================
    //                                                                                Clause
    //                                                                                ======
    // -----------------------------------------------------
    //                                       Complete Clause
    //                                       ---------------
    /**
     * Get the clause of all parts.
     * <pre>
	 * # select [base-table-columns], [join-table-columns]
     * #   from [base-table] left outer join [join-table] [join-alias] on [join-condition]
     * #  where [base-table].[column] = [value] and [join-alias].[column] is null
     * #  order by [base-table].[column] asc, [join-alias].[column] desc
     * #  for update
     * </pre>
     * @return The clause of all parts. (NotNull)
     */
    public String getClause();

    /**
     * Get clause of all parts as PK-only.
     * <pre>
	 * # select [base-table-columns], [join-table-columns]
     * #   from [base-table] left outer join [join-table] [join-alias] on [join-condition]
     * #  where [base-table].[column] = [value] and [join-alias].[column] is null
     * #  order by [base-table].[column] asc, [join-alias].[column] desc
     * #  for update
     * </pre>
     * @return The clause of all parts as PK-Only. (NotNull)
     */
	public String getClausePKOnly();

    // -----------------------------------------------------
    //                                       Fragment Clause
    //                                       ---------------
    /**
     * Get from-where clause without select and orderBy and sqlSuffix. 
	 * For subQuery and selectCount.
	 * <p>
	 * You should handle UnionSelectClauseMark and UnionWhereClauseMark and UnionWhereFirstConditionMark in clause.
	 * </p>
     * @return The 'from-where' clause(contains union) without 'select' and 'orderBy' and 'sqlSuffix'. (NotNull)
     */
    public String getClauseFromWhereWithUnionTemplate();
	
    /**
     * Get from-where clause without select and orderBy and sqlSuffix as template. 
	 * For subQuery and selectCount.
     * <p>
	 * You should handle UnionSelectClauseMark and UnionWhereClauseMark and UnionWhereFirstConditionMark
	 * and WhereClauseMark and WhereFirstConditionMark in clause.
	 * </p>
     * @return The 'from-where' clause(contains union) without 'select' and 'orderBy' and 'sqlSuffix'. (NotNull)
     */
    public String getClauseFromWhereWithWhereUnionTemplate();

    // =====================================================================================
    //                                                                          Clause Parts
    //                                                                          ============
	/**
     * Get the clause of 'select'. This is an internal method.
     * @return The clause of select. {[select ...] from table...} (NotNull)
     */
	public String getSelectClause();
	
	/**
     * Get The clause of 'select' as PK-only. This is an internal method.
     * @return The clause of select PK-only. {[select ...] from table...} (NotNull)
     */
	public String getSelectClausePKOnly();
	
    /**
     * Get the hint of 'select'. This is an internal method.
     * @return The hint of 'select'. {select [select-hint] * from table...} (NotNull)
     */
    public String getSelectHint();

    /**
     * Get the clause of included-select-column. This is an internal method.
     * @return The clause of included-select-column. {select ... , [included-select-column clause] from table...} (NotNull)
     */
    public String getIncludedSelectColumnClause();

    /**
     * Get the clause of 'from'. This is an internal method.
     * @return The clause of 'from'. (NotNull)
     */
    public String getFromClause();

    /**
     * Get the clause of from-base-table. This is an internal method.
     * @return The hint of from-base-table. {select * from table [from-base-table-hint] where ...} (NotNull)
     */
    public String getFromBaseTableHint();

    /**
     * Get the hint of 'from'. This is an internal method.
     * @return The hint of 'from'. {select * from table left outer join ... on ... [from-hint] where ...} (NotNull)
     */
    public String getFromHint();

    /**
     * Get the clause of 'where'. This is an internal method.
     * @return The clause of 'where'. (NotNull)
     */
    public String getWhereClause();

    /**
     * Get the clause of 'order-by'. This is an internal method.
     * @return The clause of 'order-by'. (NotNull)
     */
    public String getOrderByClause();

    /**
     * Get the suffix of SQL. This is an internal method.
     * @return The suffix of SQL. {select * from table where ... order by ... [sql-suffix]} (NotNull)
     */
    public String getSqlSuffix();

    // ===================================================================================
    //                                                                          Copy Parts
    //                                                                          ==========
    /**
     * Copy included-select-column.
     * @param sqlClause SQL-clause. (NotNull)
     */
    public void copyIncludedSelectColumn(SqlClause sqlClause);

	// ===================================================================================
    //                                                                SelectedSelectColumn
    //                                                                ====================
    /**
     * Register selected-select-column.
     * @param foreignTableAliasName The alias name of foreign table. (NotNull)
	 * @param localTableName The table name of local. (NotNull)
	 * @param foreignPropertyName The property name of foreign table. (NotNull)
     * @param localRelationPath The path of local relation. (Nullable)
     */
    public void registerSelectedSelectColumn(String foreignTableAliasName
			                               , String localTableName
										   , String foreignPropertyName
										   , String localRelationPath);
	
    // ===================================================================================
    //                                                                IncludedSelectColumn
    //                                                                ====================
    /**
     * Ignore included-select-column.
     */
    public void ignoreIncludedSelectColumn();

    /**
     * Make included-select-column effective.
     */
    public void makeIncludedSelectColumnEffective();

    /**
     * Register included-select-column.
     * @param aliasName The alias name of the included-select-column. (NotNull)
     * @param realColumnName The real column name of the included-select-column. (NotNull)
     */
    public void registerIncludedSelectColumn(String aliasName, String realColumnName);

    // ===================================================================================
    //                                                                           OuterJoin
    //                                                                           =========
    /**
     * Register outer-join.
     * @param joinTableName The name of join table. {left outer join [joinTableName]} (NotNull)
     * @param aliasName The alias name of join table. {left outer join joinTableName [aliasName]} (NotNull and Unique per invoking method)
     * @param joinOnMap Map that has conditions of on-clause. (NotNull)
     */
    public void registerOuterJoin(String joinTableName, String aliasName, Map<String, String> joinOnMap);

    // ===================================================================================
    //                                                                               Where
    //                                                                               =====
    /**
     * Register 'where' clause.
     * @param columnFullName The full name of column. {[table-name].[column-name]}. (NotNull)
     * @param key Condition-key. (NotNull)
     * @param value Condition-value. (NotNull)
     */
    public void registerWhereClause(String columnFullName, ConditionKey key, ConditionValue value);

    /**
     * Register 'where' clause.
     * @param columnFullName The full name of column. {[table-name].[column-name]}. (NotNull)
     * @param key Condition-key. (NotNull)
     * @param value Condition-value. (NotNull)
     * @param option Condition-option. (NotNull)
     */
    public void registerWhereClause(String columnFullName, ConditionKey key, ConditionValue value, ConditionOption option);

    /**
     * Register 'where' clause.
     * @param clause The clause of 'where'. (NotNull)
     */
    public void registerWhereClause(String clause);

    /**
     * Exchange first The clause of 'where' for last one.
     */
    public void exchangeFirstWhereClauseForLastOne();

    // ===================================================================================
    //                                                                         InlineWhere
    //                                                                         ===========
    public void registerBaseTableInlineWhereClause(String columnName, ConditionKey key, ConditionValue value);
    public void registerBaseTableInlineWhereClause(String columnName, ConditionKey key, ConditionValue value, ConditionOption option);
    public void registerBaseTableInlineWhereClause(String value);
    public void registerOuterJoinInlineWhereClause(String aliasName, String columnName, ConditionKey key, ConditionValue value, boolean onClauseInline);
    public void registerOuterJoinInlineWhereClause(String aliasName, String columnName, ConditionKey key, ConditionValue value, ConditionOption option, boolean onClauseInline);
    public void registerOuterJoinInlineWhereClause(String aliasName, String value, boolean onClauseInline);

    // ===================================================================================
    //                                                             AdditionalConditionAsOr
    //                                                             =======================
    public void makeAdditionalConditionAsOrEffective();
    public void ignoreAdditionalConditionAsOr();

    // ===================================================================================
    //                                                                             OrderBy
    //                                                                             =======
    public OrderByClause getSqlComponentOfOrderByClause();
    public SqlClause clearOrderBy();
    public SqlClause ignoreOrderBy();
    public SqlClause makeOrderByEffective();
	
    /**
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @param registeredOrderByProperty Registered-order-by-property. ([table-name].[column-name]) (Nullable)
     * @param ascOrDesc Is it ascend or descend?
     */
    public void registerOrderBy(String orderByProperty, String registeredOrderByProperty, boolean ascOrDesc);
	
    /**
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @param registeredOrderByProperty Registered-order-by-property. ([table-name].[column-name]) (Nullable)
     * @param ascOrDesc Is it ascend or descend?
     */
    public void reverseOrderBy_Or_OverrideOrderBy(String orderByProperty, String registeredOrderByProperty, boolean ascOrDesc);

	public void addNullsFirstToPreviousOrderBy();
	public void addNullsLastToPreviousOrderBy();
	
    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    public void registerUnionQuery(String unionClause, boolean unionAll);

    // ===================================================================================
    //                                                                          FetchScope
    //                                                                          ==========
    /**
     * Fetch first.
     * @param fetchSize Fetch-size. (NotMinus)
     * @return this. (NotNull)
     */
    public SqlClause fetchFirst(int fetchSize);

    /**
     * Fetch scope.
     * @param fetchStartIndex Fetch-start-index. 0 origin. (NotMinus)
     * @param fetchSize Fetch-size. (NotMinus)
     * @return this. (NotNull)
     */
    public SqlClause fetchScope(int fetchStartIndex, int fetchSize);

    /**
     * Fetch page.
     * <p>
     * When you invoke this, it is normally necessary to invoke 'fetchFirst()' or 'fetchScope()' ahead of that.
     * But you also can use default-fetch-size without invoking 'fetchFirst()' or 'fetchScope()'.
     * If you invoke this, your SQL returns [fetch-size] records from [fetch-start-index] calculated by [fetch-page-number].
     * </p>
     * @param fetchPageNumber Fetch-page-number. 1 origin. (NotMinus & NotZero: If minus or zero, set one.)
     * @return this. (NotNull)
     */
    public SqlClause fetchPage(int fetchPageNumber);

    /**
     * Get fetch start index.
     * @return Fetch start index.
     */
    public int getFetchStartIndex();

    /**
     * Get fetch size.
     * @return Fetch size.
     */
    public int getFetchSize();

    /**
     * Get fetch page number.
     * @return Fetch page number.
     */
    public int getFetchPageNumber();

    /**
     * Get page start index.
     * @return Page start index. 0 origin. (NotMinus)
     */
    public int getPageStartIndex();

    /**
     * Get page end index.
     * @return Page end index. 0 origin. (NotMinus)
     */
    public int getPageEndIndex();

    /**
     * Is fetch scope effective?
     * @return Determiantion.
     */
    public boolean isFetchScopeEffective();

    /**
     * Ignore fetch-scope.
     * @return this. (NotNull)
     */
    public SqlClause ignoreFetchScope();

    /**
     * Make fetch-scope effective.
     * @return this. (NotNull)
     */
    public SqlClause makeFetchScopeEffective();

    /**
     * Is fetch start index supported?
     * @return Determination.
     */
    public boolean isFetchStartIndexSupported();

    /**
     * Is fetch size supported?
     * @return Determination.
     */
    public boolean isFetchSizeSupported();

    // ===================================================================================
    //                                                                     Fetch Narrowing
    //                                                                     ===============
    /**
     * Is fetch-narrowing effective?
     * @return Determiantion.
     */
    public boolean isFetchNarrowingEffective();

    /**
     * Get fetch-narrowing skip-start-index.
     * @return Skip-start-index.
     */
    public int getFetchNarrowingSkipStartIndex();

    /**
     * Get fetch-narrowing loop-count.
     * @return Loop-count.
     */
    public int getFetchNarrowingLoopCount();

    // ===================================================================================
    //                                                                                Lock
    //                                                                                ====
    /**
     * Lock for update.
     * <p>
     * If you invoke this, your SQL lock target records for update.
     * It depends whether this method supports this on the database type.
     * </p>
     * @return this. (NotNull)
     */
    public SqlClause lockForUpdate();

    // ===================================================================================
    //                                                                            Resolver
    //                                                                            ========
    /**
     * Resolve join alias name.
     * @param relationPath Relation path. (NotNull)
     * @param cqNestNo The nest no of condition query.
     * @return Resolved join alias name. (NotNull)
     */
    public String resolveJoinAliasName(String relationPath, int cqNestNo);

    /**
     * Resolve nest level expression.
     * @param name Name. (NotNull)
     * @param cqNestNo The nest no of condition query.
     * @return Resolved name about nest level. (NotNull)
     */
    public String resolveNestLevelExpression(String name, int cqNestNo);

    /**
     * Resolve relation no.
     * @param baseTableName The table name of base. (NotNull)
     * @param foreignPropertyName The property name of foreign. (NotNull)
     * @return Resolved relation no.
     */
    public int resolveRelationNo(String baseTableName, String foreignPropertyName);

	// ===================================================================================
    //                                                                    Table Alias Info
    //                                                                    ================
	public String getLocalTableAliasName();
	public String getForeignTableAliasPrefix();

	// ===================================================================================
    //                                                                       Template Mark
    //                                                                       =============
	public String getWhereClauseMark();
	public String getWhereFirstConditionMark();
	public String getUnionSelectClauseMark();
	public String getUnionWhereClauseMark();
	public String getUnionWhereFirstConditionMark();
	
    // ===================================================================================
    //                                                          Where Clause Simple Filter
    //                                                          ==========================
    public void addWhereClauseSimpleFilter(WhereClauseSimpleFilter whereClauseSimpleFilter);
	
    // ===================================================================================
    //                                                               Selected Foreign Info
    //                                                               =====================
	public boolean isSelectedForeignInfoEmpty();
	public boolean hasSelectedForeignInfo(String relationPath);
	public void registerSelectedForeignInfo(String relationPath, String foreignPropertyName);
	
    // ===================================================================================
    //                                                                       Format Clause
    //                                                                       =============
	public boolean isFormatClauseEffective();
    public void makeFormatClauseEffective();
	
    // ===================================================================================
    //                                                                    Sub Query Indent
    //                                                                    ================
    public String resolveSubQueryBeginMark(String subQueryIdentity);
    public String resolveSubQueryEndMark(String subQueryIdentity);
    public String filterSubQueryIndent(String sql);
	
    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                       Specification
    //                                                                       =============
    public void specifySelectColumn(String tableAliasName, String columnName);
    public void specifyDeriveSubQuery(String aliasName, String deriveSubQuery);
	public boolean hasSpecifiedDeriveSubQuery(String aliasName);
    public String getSpecifiedColumnNameAsOne();
    public void clearSpecifiedSelectColumn();
    
    // [DBFlute-0.7.5]
    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * @param columnParameterMap The map of column parameters. (NotNull)
     * @return The clause of query update. (Nullable: If columnParameterMap is empty, return null)
     */
    public String getClauseQueryUpdate(Map<String, String> columnParameterMap);
    public String getClauseQueryDelete();

    // [DBFlute-0.7.7]
    // ===================================================================================
    //                                                                   Unique Constraint
    //                                                                   =================
    /**
     * Is the SQLException from unique constraint? {Use both SQLState and ErrorCode}
     * @param sqlState SQLState of the SQLException. (Nullable)
     * @param errorCode ErrorCode of the SQLException. (Nullable)
     * @return Is the SQLException from unique constraint?
     */	
    public boolean isUniqueConstraintException(String sqlState, Integer errorCode);
}
