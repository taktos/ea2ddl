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
 * The base condition-bean of t_diagram.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTDiagramCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TDiagramCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_diagram";
    }

    public String getTableSqlName() {
        return "t_diagram";
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
    public TDiagramCQ query() {
        return getConditionQuery();
    }

    public TDiagramCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TDiagramCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TDiagramCB&gt;() {
     *     public void query(TDiagramCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TDiagramCB> unionQuery) {
        final TDiagramCB cb = new TDiagramCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TDiagramCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TDiagramCB&gt;() {
     *     public void query(TDiagramCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TDiagramCB> unionQuery) {
        final TDiagramCB cb = new TDiagramCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TDiagramCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TDiagramCB> unionQuery).
     */
    public void union(TDiagramCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TDiagramCB> unionQuery).
     */
    public void unionAll(TDiagramCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TDiagramCQ>() {
            public boolean has() { return true; } public TDiagramCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TDiagramCQ> {
        protected SpQyCall<TDiagramCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TDiagramCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnDiagramId() { doColumn("Diagram_ID"); }
        public void columnPackageId() { doColumn("Package_ID"); }
        public void columnParentid() { doColumn("ParentID"); }
        public void columnDiagramType() { doColumn("Diagram_Type"); }
        public void columnName() { doColumn("Name"); }
        public void columnVersion() { doColumn("Version"); }
        public void columnAuthor() { doColumn("Author"); }
        public void columnShowdetails() { doColumn("ShowDetails"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnStereotype() { doColumn("Stereotype"); }
        public void columnAttpub() { doColumn("AttPub"); }
        public void columnAttpri() { doColumn("AttPri"); }
        public void columnAttpro() { doColumn("AttPro"); }
        public void columnOrientation() { doColumn("Orientation"); }
        public void columnCx() { doColumn("cx"); }
        public void columnCy() { doColumn("cy"); }
        public void columnScale() { doColumn("Scale"); }
        public void columnCreateddate() { doColumn("CreatedDate"); }
        public void columnModifieddate() { doColumn("ModifiedDate"); }
        public void columnHtmlpath() { doColumn("HTMLPath"); }
        public void columnShowforeign() { doColumn("ShowForeign"); }
        public void columnShowborder() { doColumn("ShowBorder"); }
        public void columnShowpackagecontents() { doColumn("ShowPackageContents"); }
        public void columnPdata() { doColumn("PDATA"); }
        public void columnLocked() { doColumn("Locked"); }
        public void columnEaGuid() { doColumn("ea_guid"); }
        public void columnTpos() { doColumn("TPos"); }
        public void columnSwimlanes() { doColumn("Swimlanes"); }
        public void columnStyleex() { doColumn("StyleEx"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_diagram"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TDiagramCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TDiagramCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
