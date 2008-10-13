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
 * The base condition-bean of t_issues.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTIssuesCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TIssuesCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_issues";
    }

    public String getTableSqlName() {
        return "t_issues";
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
    public TIssuesCQ query() {
        return getConditionQuery();
    }

    public TIssuesCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TIssuesCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TIssuesCB&gt;() {
     *     public void query(TIssuesCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TIssuesCB> unionQuery) {
        final TIssuesCB cb = new TIssuesCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TIssuesCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TIssuesCB&gt;() {
     *     public void query(TIssuesCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TIssuesCB> unionQuery) {
        final TIssuesCB cb = new TIssuesCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TIssuesCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TIssuesCB> unionQuery).
     */
    public void union(TIssuesCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TIssuesCB> unionQuery).
     */
    public void unionAll(TIssuesCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TIssuesCQ>() {
            public boolean has() { return true; } public TIssuesCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TIssuesCQ> {
        protected SpQyCall<TIssuesCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TIssuesCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnIssue() { doColumn("Issue"); }
        public void columnIssuedate() { doColumn("IssueDate"); }
        public void columnOwner() { doColumn("Owner"); }
        public void columnStatus() { doColumn("Status"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnResolver() { doColumn("Resolver"); }
        public void columnDateresolved() { doColumn("DateResolved"); }
        public void columnResolution() { doColumn("Resolution"); }
        public void columnIssueid() { doColumn("IssueID"); }
        public void columnCategory() { doColumn("Category"); }
        public void columnPriority() { doColumn("Priority"); }
        public void columnSeverity() { doColumn("Severity"); }
        public void columnIssuetype() { doColumn("IssueType"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_issues"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TIssuesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TIssuesCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
