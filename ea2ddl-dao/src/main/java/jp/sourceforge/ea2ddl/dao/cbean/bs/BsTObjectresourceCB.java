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
 * The base condition-bean of t_objectresource.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjectresourceCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectresourceCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectresource";
    }

    public String getTableSqlName() {
        return "t_objectresource";
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
    public TObjectresourceCQ query() {
        return getConditionQuery();
    }

    public TObjectresourceCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TObjectresourceCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TObjectresourceCB&gt;() {
     *     public void query(TObjectresourceCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TObjectresourceCB> unionQuery) {
        final TObjectresourceCB cb = new TObjectresourceCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TObjectresourceCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TObjectresourceCB&gt;() {
     *     public void query(TObjectresourceCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TObjectresourceCB> unionQuery) {
        final TObjectresourceCB cb = new TObjectresourceCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TObjectresourceCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TObjectresourceCB> unionQuery).
     */
    public void union(TObjectresourceCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TObjectresourceCB> unionQuery).
     */
    public void unionAll(TObjectresourceCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TObjectresourceCQ>() {
            public boolean has() { return true; } public TObjectresourceCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TObjectresourceCQ> {
        protected SpQyCall<TObjectresourceCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TObjectresourceCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnObjectId() { doColumn("Object_ID"); }
        public void columnResource() { doColumn("Resource"); }
        public void columnRole() { doColumn("Role"); }
        public void columnTime() { doColumn("Time"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnPercentcomplete() { doColumn("PercentComplete"); }
        public void columnDatestart() { doColumn("DateStart"); }
        public void columnDateend() { doColumn("DateEnd"); }
        public void columnHistory() { doColumn("History"); }
        public void columnExpectedhours() { doColumn("ExpectedHours"); }
        public void columnActualhours() { doColumn("ActualHours"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_objectresource"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TObjectresourceCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TObjectresourceCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
