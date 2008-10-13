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
 * The base condition-bean of t_diagramobjects.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTDiagramobjectsCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TDiagramobjectsCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_diagramobjects";
    }

    public String getTableSqlName() {
        return "t_diagramobjects";
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
    public TDiagramobjectsCQ query() {
        return getConditionQuery();
    }

    public TDiagramobjectsCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TDiagramobjectsCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TDiagramobjectsCB&gt;() {
     *     public void query(TDiagramobjectsCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TDiagramobjectsCB> unionQuery) {
        final TDiagramobjectsCB cb = new TDiagramobjectsCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TDiagramobjectsCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TDiagramobjectsCB&gt;() {
     *     public void query(TDiagramobjectsCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TDiagramobjectsCB> unionQuery) {
        final TDiagramobjectsCB cb = new TDiagramobjectsCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TDiagramobjectsCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TDiagramobjectsCB> unionQuery).
     */
    public void union(TDiagramobjectsCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TDiagramobjectsCB> unionQuery).
     */
    public void unionAll(TDiagramobjectsCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TDiagramobjectsCQ>() {
            public boolean has() { return true; } public TDiagramobjectsCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TDiagramobjectsCQ> {
        protected SpQyCall<TDiagramobjectsCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TDiagramobjectsCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnDiagramId() { doColumn("Diagram_ID"); }
        public void columnObjectId() { doColumn("Object_ID"); }
        public void columnRecttop() { doColumn("RectTop"); }
        public void columnRectleft() { doColumn("RectLeft"); }
        public void columnRectright() { doColumn("RectRight"); }
        public void columnRectbottom() { doColumn("RectBottom"); }
        public void columnSequence() { doColumn("Sequence"); }
        public void columnObjectstyle() { doColumn("ObjectStyle"); }
        public void columnInstanceId() { doColumn("Instance_ID"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_diagramobjects"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TDiagramobjectsCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TDiagramobjectsCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
