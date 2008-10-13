package jp.sourceforge.ea2ddl.dao.allcommon.cbean;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;

/**
 * The condition-query as interface.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public interface ConditionQuery {

    // ===================================================================================
    //                                                                  Important Accessor
    //                                                                  ==================
    /**
     * Get table DB-name.
     * @return Table DB-name. (NotNull)
     */
    public String getTableDbName();
	
    /**
     * Get table SQL-name.
     * @return Table SQL-name. (NotNull)
     */
    public String getTableSqlName();

    /**
     * Get real alias name(that has nest level mark).
     * @return Real alias name. (NotNull)
     */
    public String getRealAliasName();

    /**
     * Get real column name(with real alias name).
     * @param columnName Column name without alias name. (NotNull)
     * @return Real column name. (NotNull)
     */
    public String getRealColumnName(String columnName);

    /**
     * Get child query.
     * @return Child query. (Nullable)
     */
    public ConditionQuery getChildQuery();

    /**
     * Get sql clause.
     * @return Sql clause. (NotNull)
     */
    public SqlClause getSqlClause();

    /**
     * Get alias name.
     * @return Alias name. (NotNull)
     */
    public String getAliasName();

    /**
     * Get nest level.
     * @return Nest level.
     */
    public int getNestLevel();

    /**
     * Get next nest level.
     * @return Next nest level.
     */
    public int getNextNestLevel();

    /**
     * Is base query?
     * @param query Condition query. (NotNull)
     * @return Determination.
     */
    public boolean isBaseQuery(ConditionQuery query);

	/**
	 * Get the level of subQuery.
	 * @return The level of subQuery.
	 */
	public int getSubQueryLevel();
	
    /**
     * Get the property name of foreign relation.
     * @return The property name of foreign relation. (NotNull)
     */
    public String getForeignPropertyName();

    /**
     * Get the path of foreign relation.
     * @return The path of foreign relation. (NotNull)
     */
    public String getRelationPath();

    // ===================================================================================
    //                                                                 Reflection Invoking
    //                                                                 ===================
    /**
     * Invoke getting value.
     * @param columnFlexibleName The flexible name of the column. (NotNull and NotEmpty)
     * @return The conditionValue. (NotNull)
     */
    public ConditionValue invokeValue(String columnFlexibleName);

    /**
     * Invoke setting query. {ResolveRelation}
     * @param columnFlexibleName The flexible name of the column allowed to contain relations. (NotNull and NotEmpty)
     * @param conditionKeyName The name of the conditionKey. (NotNull)
     * @param value The value of the condition. (NotNull)
     */
    public void invokeQuery(String columnFlexibleName, String conditionKeyName, Object value);

    /**
     * Invoke adding orderBy. {ResolveRelation}
     * @param columnFlexibleName The flexible name of the column allowed to contain relations. (NotNull and NotEmpty)
     * @param isAsc Is it ascend?
     */
    public void invokeOrderBy(String columnFlexibleName, boolean isAsc);

    /**
     * Invoke getting foreign conditionQuery.
     * @param foreignPropertyName The property name of the foreign relation. (NotNull and NotEmpty)
     * @return The conditionQuery of the foreign relation as interface. (NotNull)
     */
    public ConditionQuery invokeForeignCQ(String foreignPropertyName);
}
