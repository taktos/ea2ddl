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
 * The base condition-bean of t_tasks.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTTasksCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTasksCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_tasks";
    }

    public String getTableSqlName() {
        return "t_tasks";
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
    public TTasksCQ query() {
        return getConditionQuery();
    }

    public TTasksCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TTasksCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TTasksCB&gt;() {
     *     public void query(TTasksCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TTasksCB> unionQuery) {
        final TTasksCB cb = new TTasksCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TTasksCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TTasksCB&gt;() {
     *     public void query(TTasksCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TTasksCB> unionQuery) {
        final TTasksCB cb = new TTasksCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TTasksCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TTasksCB> unionQuery).
     */
    public void union(TTasksCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TTasksCB> unionQuery).
     */
    public void unionAll(TTasksCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TTasksCQ>() {
            public boolean has() { return true; } public TTasksCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TTasksCQ> {
        protected SpQyCall<TTasksCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TTasksCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnTaskid() { doColumn("TaskID"); }
        public void columnName() { doColumn("Name"); }
        public void columnTasktype() { doColumn("TaskType"); }
        public void columnNotes() { doColumn("NOTES"); }
        public void columnPriority() { doColumn("Priority"); }
        public void columnStatus() { doColumn("Status"); }
        public void columnOwner() { doColumn("Owner"); }
        public void columnStartdate() { doColumn("StartDate"); }
        public void columnEnddate() { doColumn("EndDate"); }
        public void columnPhase() { doColumn("Phase"); }
        public void columnHistory() { doColumn("History"); }
        public void columnPercent() { doColumn("Percent"); }
        public void columnTotaltime() { doColumn("TotalTime"); }
        public void columnActualtime() { doColumn("ActualTime"); }
        public void columnAssignedto() { doColumn("AssignedTo"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_tasks"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TTasksCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TTasksCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
