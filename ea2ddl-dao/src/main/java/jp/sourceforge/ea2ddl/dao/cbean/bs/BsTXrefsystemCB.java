package jp.sourceforge.ea2ddl.dao.cbean.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.AbstractConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionQuery;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.SubQuery;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.UnionQuery;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-bean of t_xrefsystem.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTXrefsystemCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TXrefsystemCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_xrefsystem";
    }

    public String getTableSqlName() {
        return "t_xrefsystem";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {

        String msg = "This table has no primary-keys: " + getTableDbName();
        throw new IllegalStateException(msg);

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public ConditionBean addOrderBy_PK_Asc() {
        String msg = "This table has no primary-keys: " + getTableDbName();
        throw new IllegalStateException(msg);
    }

    public ConditionBean addOrderBy_PK_Desc() {
        String msg = "This table has no primary-keys: " + getTableDbName();
        throw new IllegalStateException(msg);
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public TXrefsystemCQ query() {
        return getConditionQuery();
    }

    public TXrefsystemCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TXrefsystemCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
        }
        return _conditionQuery;
    }

    public ConditionQuery getConditionQueryAsInterface() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union'.
     * <pre>
     * cb.query().union(new UnionQuery&lt;TXrefsystemCB&gt;() {
     *     public void query(TXrefsystemCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TXrefsystemCB> unionQuery) {
        final TXrefsystemCB cb = new TXrefsystemCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TXrefsystemCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TXrefsystemCB&gt;() {
     *     public void query(TXrefsystemCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TXrefsystemCB> unionQuery) {
        final TXrefsystemCB cb = new TXrefsystemCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TXrefsystemCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TXrefsystemCB> unionQuery).
     */
    public void union(TXrefsystemCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TXrefsystemCB> unionQuery).
     */
    public void unionAll(TXrefsystemCQ unionQuery) {
        query().xsetUnionAllQuery(unionQuery);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TXrefsystemCQ>() {
            public boolean has() { return true; } public TXrefsystemCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TXrefsystemCQ> {
        protected SpQyCall<TXrefsystemCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TXrefsystemCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnXrefid() { doColumn("XrefID"); }
        public void columnToolid() { doColumn("ToolID"); }
        public void columnName() { doColumn("Name"); }
        public void columnType() { doColumn("Type"); }
        public void columnVisibility() { doColumn("Visibility"); }
        public void columnNamespace() { doColumn("Namespace"); }
        public void columnRequirement() { doColumn("Requirement"); }
        public void columnConstraint() { doColumn("Constraint"); }
        public void columnBehavior() { doColumn("Behavior"); }
        public void columnPartition() { doColumn("Partition"); }
        public void columnDescription() { doColumn("Description"); }
        public void columnClient() { doColumn("Client"); }
        public void columnSupplier() { doColumn("Supplier"); }
        public void columnLink() { doColumn("Link"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_xrefsystem"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TXrefsystemCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TXrefsystemCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
