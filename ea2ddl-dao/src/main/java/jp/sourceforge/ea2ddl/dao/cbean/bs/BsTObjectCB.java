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
 * The base condition-bean of t_object.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjectCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_object";
    }

    public String getTableSqlName() {
        return "t_object";
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
    public TObjectCQ query() {
        return getConditionQuery();
    }

    public TObjectCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TObjectCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TObjectCB&gt;() {
     *     public void query(TObjectCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TObjectCB> unionQuery) {
        final TObjectCB cb = new TObjectCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TObjectCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TObjectCB&gt;() {
     *     public void query(TObjectCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TObjectCB> unionQuery) {
        final TObjectCB cb = new TObjectCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TObjectCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TObjectCB> unionQuery).
     */
    public void union(TObjectCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TObjectCB> unionQuery).
     */
    public void unionAll(TObjectCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TObjectCQ>() {
            public boolean has() { return true; } public TObjectCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TObjectCQ> {
        protected SpQyCall<TObjectCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TObjectCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnObjectId() { doColumn("Object_ID"); }
        public void columnObjectType() { doColumn("Object_Type"); }
        public void columnDiagramId() { doColumn("Diagram_ID"); }
        public void columnName() { doColumn("Name"); }
        public void columnAlias() { doColumn("Alias"); }
        public void columnAuthor() { doColumn("Author"); }
        public void columnVersion() { doColumn("Version"); }
        public void columnNote() { doColumn("Note"); }
        public void columnPackageId() { doColumn("Package_ID"); }
        public void columnStereotype() { doColumn("Stereotype"); }
        public void columnNtype() { doColumn("NType"); }
        public void columnComplexity() { doColumn("Complexity"); }
        public void columnEffort() { doColumn("Effort"); }
        public void columnStyle() { doColumn("Style"); }
        public void columnBackcolor() { doColumn("Backcolor"); }
        public void columnBorderstyle() { doColumn("BorderStyle"); }
        public void columnBorderwidth() { doColumn("BorderWidth"); }
        public void columnFontcolor() { doColumn("Fontcolor"); }
        public void columnBordercolor() { doColumn("Bordercolor"); }
        public void columnCreateddate() { doColumn("CreatedDate"); }
        public void columnModifieddate() { doColumn("ModifiedDate"); }
        public void columnStatus() { doColumn("Status"); }
        public void columnTagged() { doColumn("Tagged"); }
        public void columnPdata1() { doColumn("PDATA1"); }
        public void columnPdata2() { doColumn("PDATA2"); }
        public void columnPdata3() { doColumn("PDATA3"); }
        public void columnPdata4() { doColumn("PDATA4"); }
        public void columnPdata5() { doColumn("PDATA5"); }
        public void columnConcurrency() { doColumn("Concurrency"); }
        public void columnVisibility() { doColumn("Visibility"); }
        public void columnPersistence() { doColumn("Persistence"); }
        public void columnCardinality() { doColumn("Cardinality"); }
        public void columnGentype() { doColumn("GenType"); }
        public void columnGenfile() { doColumn("GenFile"); }
        public void columnHeader1() { doColumn("Header1"); }
        public void columnHeader2() { doColumn("Header2"); }
        public void columnPhase() { doColumn("Phase"); }
        public void columnScope() { doColumn("Scope"); }
        public void columnGenoption() { doColumn("GenOption"); }
        public void columnGenlinks() { doColumn("GenLinks"); }
        public void columnClassifier() { doColumn("Classifier"); }
        public void columnEaGuid() { doColumn("ea_guid"); }
        public void columnParentid() { doColumn("ParentID"); }
        public void columnRunstate() { doColumn("RunState"); }
        public void columnClassifierGuid() { doColumn("Classifier_guid"); }
        public void columnTpos() { doColumn("TPos"); }
        public void columnIsroot() { doColumn("IsRoot"); }
        public void columnIsleaf() { doColumn("IsLeaf"); }
        public void columnIsspec() { doColumn("IsSpec"); }
        public void columnIsactive() { doColumn("IsActive"); }
        public void columnStateflags() { doColumn("StateFlags"); }
        public void columnPackageflags() { doColumn("PackageFlags"); }
        public void columnMultiplicity() { doColumn("Multiplicity"); }
        public void columnStyleex() { doColumn("StyleEx"); }
        public void columnActionflags() { doColumn("ActionFlags"); }
        public void columnEventflags() { doColumn("EventFlags"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_object"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TObjectCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TObjectCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
