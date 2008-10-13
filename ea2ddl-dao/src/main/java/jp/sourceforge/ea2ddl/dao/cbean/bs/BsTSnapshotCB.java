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
 * The base condition-bean of t_snapshot.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTSnapshotCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TSnapshotCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_snapshot";
    }

    public String getTableSqlName() {
        return "t_snapshot";
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
    public TSnapshotCQ query() {
        return getConditionQuery();
    }

    public TSnapshotCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TSnapshotCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TSnapshotCB&gt;() {
     *     public void query(TSnapshotCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TSnapshotCB> unionQuery) {
        final TSnapshotCB cb = new TSnapshotCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TSnapshotCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TSnapshotCB&gt;() {
     *     public void query(TSnapshotCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TSnapshotCB> unionQuery) {
        final TSnapshotCB cb = new TSnapshotCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TSnapshotCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TSnapshotCB> unionQuery).
     */
    public void union(TSnapshotCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TSnapshotCB> unionQuery).
     */
    public void unionAll(TSnapshotCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TSnapshotCQ>() {
            public boolean has() { return true; } public TSnapshotCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TSnapshotCQ> {
        protected SpQyCall<TSnapshotCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TSnapshotCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnSnapshotid() { doColumn("SnapshotID"); }
        public void columnSeriesid() { doColumn("SeriesID"); }
        public void columnPosition() { doColumn("Position"); }
        public void columnSnapshotname() { doColumn("SnapshotName"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnStyle() { doColumn("Style"); }
        public void columnElementid() { doColumn("ElementID"); }
        public void columnElementtype() { doColumn("ElementType"); }
        public void columnStrcontent() { doColumn("StrContent"); }
        public void columnBincontent1() { doColumn("BinContent1"); }
        public void columnBincontent2() { doColumn("BinContent2"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_snapshot"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TSnapshotCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TSnapshotCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
