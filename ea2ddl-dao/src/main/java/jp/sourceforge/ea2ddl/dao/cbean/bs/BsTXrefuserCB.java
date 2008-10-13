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
 * The base condition-bean of t_xrefuser.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTXrefuserCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TXrefuserCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_xrefuser";
    }

    public String getTableSqlName() {
        return "t_xrefuser";
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
    public TXrefuserCQ query() {
        return getConditionQuery();
    }

    public TXrefuserCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TXrefuserCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TXrefuserCB&gt;() {
     *     public void query(TXrefuserCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TXrefuserCB> unionQuery) {
        final TXrefuserCB cb = new TXrefuserCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TXrefuserCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TXrefuserCB&gt;() {
     *     public void query(TXrefuserCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TXrefuserCB> unionQuery) {
        final TXrefuserCB cb = new TXrefuserCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TXrefuserCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TXrefuserCB> unionQuery).
     */
    public void union(TXrefuserCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TXrefuserCB> unionQuery).
     */
    public void unionAll(TXrefuserCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TXrefuserCQ>() {
            public boolean has() { return true; } public TXrefuserCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TXrefuserCQ> {
        protected SpQyCall<TXrefuserCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TXrefuserCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
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
        protected String getTableDbName() { return "t_xrefuser"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TXrefuserCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TXrefuserCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
