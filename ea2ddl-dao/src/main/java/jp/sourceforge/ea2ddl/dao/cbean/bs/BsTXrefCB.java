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
 * The base condition-bean of t_xref.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTXrefCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TXrefCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_xref";
    }

    public String getTableSqlName() {
        return "t_xref";
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
    public TXrefCQ query() {
        return getConditionQuery();
    }

    public TXrefCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TXrefCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TXrefCB&gt;() {
     *     public void query(TXrefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TXrefCB> unionQuery) {
        final TXrefCB cb = new TXrefCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TXrefCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TXrefCB&gt;() {
     *     public void query(TXrefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TXrefCB> unionQuery) {
        final TXrefCB cb = new TXrefCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TXrefCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TXrefCB> unionQuery).
     */
    public void union(TXrefCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TXrefCB> unionQuery).
     */
    public void unionAll(TXrefCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TXrefCQ>() {
            public boolean has() { return true; } public TXrefCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TXrefCQ> {
        protected SpQyCall<TXrefCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TXrefCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnXrefid() { doColumn("XrefID"); }
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
        protected String getTableDbName() { return "t_xref"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TXrefCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TXrefCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
