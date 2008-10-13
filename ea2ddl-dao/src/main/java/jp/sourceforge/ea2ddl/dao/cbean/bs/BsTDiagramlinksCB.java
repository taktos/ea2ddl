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
 * The base condition-bean of t_diagramlinks.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTDiagramlinksCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TDiagramlinksCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_diagramlinks";
    }

    public String getTableSqlName() {
        return "t_diagramlinks";
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
    public TDiagramlinksCQ query() {
        return getConditionQuery();
    }

    public TDiagramlinksCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TDiagramlinksCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TDiagramlinksCB&gt;() {
     *     public void query(TDiagramlinksCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TDiagramlinksCB> unionQuery) {
        final TDiagramlinksCB cb = new TDiagramlinksCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TDiagramlinksCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TDiagramlinksCB&gt;() {
     *     public void query(TDiagramlinksCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TDiagramlinksCB> unionQuery) {
        final TDiagramlinksCB cb = new TDiagramlinksCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TDiagramlinksCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TDiagramlinksCB> unionQuery).
     */
    public void union(TDiagramlinksCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TDiagramlinksCB> unionQuery).
     */
    public void unionAll(TDiagramlinksCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TDiagramlinksCQ>() {
            public boolean has() { return true; } public TDiagramlinksCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TDiagramlinksCQ> {
        protected SpQyCall<TDiagramlinksCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TDiagramlinksCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnDiagramid() { doColumn("DiagramID"); }
        public void columnConnectorid() { doColumn("ConnectorID"); }
        public void columnGeometry() { doColumn("Geometry"); }
        public void columnStyle() { doColumn("Style"); }
        public void columnHidden() { doColumn("Hidden"); }
        public void columnPath() { doColumn("Path"); }
        public void columnInstanceId() { doColumn("Instance_ID"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_diagramlinks"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TDiagramlinksCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TDiagramlinksCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
