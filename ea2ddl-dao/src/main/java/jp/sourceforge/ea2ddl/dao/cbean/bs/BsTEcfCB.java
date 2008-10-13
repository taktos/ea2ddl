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
 * The base condition-bean of t_ecf.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTEcfCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TEcfCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_ecf";
    }

    public String getTableSqlName() {
        return "t_ecf";
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
    public TEcfCQ query() {
        return getConditionQuery();
    }

    public TEcfCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TEcfCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TEcfCB&gt;() {
     *     public void query(TEcfCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TEcfCB> unionQuery) {
        final TEcfCB cb = new TEcfCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TEcfCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TEcfCB&gt;() {
     *     public void query(TEcfCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TEcfCB> unionQuery) {
        final TEcfCB cb = new TEcfCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TEcfCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TEcfCB> unionQuery).
     */
    public void union(TEcfCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TEcfCB> unionQuery).
     */
    public void unionAll(TEcfCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TEcfCQ>() {
            public boolean has() { return true; } public TEcfCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TEcfCQ> {
        protected SpQyCall<TEcfCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TEcfCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnEcfid() { doColumn("ECFID"); }
        public void columnDescription() { doColumn("Description"); }
        public void columnWeight() { doColumn("Weight"); }
        public void columnValue() { doColumn("Value"); }
        public void columnNotes() { doColumn("Notes"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_ecf"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TEcfCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TEcfCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}