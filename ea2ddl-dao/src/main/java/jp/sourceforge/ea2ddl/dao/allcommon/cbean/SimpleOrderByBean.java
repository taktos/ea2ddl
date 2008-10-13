package jp.sourceforge.ea2ddl.dao.allcommon.cbean;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.OrderByClause;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;

/**
 * @deprecated
 */
public class SimpleOrderByBean implements OrderByBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SQL clause instance. */
    protected final SqlClause _sqlClause;
    {
        _sqlClause = ConditionBeanContext.createSqlClause("Dummy");
    }

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     */
    public SimpleOrderByBean() {
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    /**
     * Get sql-clause.
     * 
     * @return Sql clause. (NotNull)
     */
    protected SqlClause getSqlClause() {
        return _sqlClause;
    }

    // ===================================================================================
    //                                                                     Select Resource
    //                                                                     ===============
    /**
     * Check safety result.
     * 
     * @param safetyMaxResultSize Safety max result size. (If zero or minus, ignore checking)
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        throw new UnsupportedOperationException();
    }

    // ===================================================================================
    //                                                                             OrderBy
    //                                                                             =======
    /**
     * The implementation.
     * 
     * @return Sql component of order-by clause. (NotNull)
     */
    public OrderByClause getSqlComponentOfOrderByClause() {
        return getSqlClause().getSqlComponentOfOrderByClause();
    }

    /**
     * The implementation.
     * 
     * @return Order-by clause. (NotNull)
     */
    public String getOrderByClause() {
        return getSqlClause().getOrderByClause();
    }

    /**
     * The implementation.
     * 
     * @return this. (NotNull)
     */
    public OrderByBean clearOrderBy() {
        getSqlClause().clearOrderBy();
        return this;
    }

    /**
     * The implementation.
     * 
     * @return this. (NotNull)
     */
    public OrderByBean ignoreOrderBy() {
        getSqlClause().ignoreOrderBy();
        return this;
    }

    /**
     * The implementation.
     * 
     * @return this. (NotNull)
     */
    public OrderByBean makeOrderByEffective() {
        getSqlClause().makeOrderByEffective();
        return this;
    }
    /**
     * Register order-by-asc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     * @deprecated
     */
    public OrderByBean registerOrderByAsc(String orderByProperty) {
        getSqlClause().registerOrderBy(orderByProperty, orderByProperty, true);
        return this;
    }

    /**
     * Register order-by-desc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     * @deprecated
     */
    public OrderByBean registerOrderByDesc(String orderByProperty) {
        getSqlClause().registerOrderBy(orderByProperty, orderByProperty, false);
        return this;
    }

    /**
     * Reverse order-by or Override order-by asc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     * @deprecated
     */
    public OrderByBean reverseOrderBy_Or_OverrideOrderByAsc(String orderByProperty) {
        getSqlClause().reverseOrderBy_Or_OverrideOrderBy(orderByProperty, orderByProperty, true);
        return this;
    }

    /**
     * Reverse order-by or Override order-by desc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     * @deprecated
     */
    public OrderByBean reverseOrderBy_Or_OverrideOrderByDesc(String orderByProperty) {
        getSqlClause().reverseOrderBy_Or_OverrideOrderBy(orderByProperty, orderByProperty, false);
        return this;
    }
}
