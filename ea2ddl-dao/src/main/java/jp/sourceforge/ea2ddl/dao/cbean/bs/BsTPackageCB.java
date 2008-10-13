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
 * The base condition-bean of t_package.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTPackageCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPackageCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_package";
    }

    public String getTableSqlName() {
        return "t_package";
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
    public TPackageCQ query() {
        return getConditionQuery();
    }

    public TPackageCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TPackageCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TPackageCB&gt;() {
     *     public void query(TPackageCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TPackageCB> unionQuery) {
        final TPackageCB cb = new TPackageCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TPackageCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TPackageCB&gt;() {
     *     public void query(TPackageCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TPackageCB> unionQuery) {
        final TPackageCB cb = new TPackageCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TPackageCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TPackageCB> unionQuery).
     */
    public void union(TPackageCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TPackageCB> unionQuery).
     */
    public void unionAll(TPackageCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TPackageCQ>() {
            public boolean has() { return true; } public TPackageCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TPackageCQ> {
        protected SpQyCall<TPackageCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TPackageCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnPackageId() { doColumn("Package_ID"); }
        public void columnName() { doColumn("Name"); }
        public void columnParentId() { doColumn("Parent_ID"); }
        public void columnCreateddate() { doColumn("CreatedDate"); }
        public void columnModifieddate() { doColumn("ModifiedDate"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnEaGuid() { doColumn("ea_guid"); }
        public void columnXmlpath() { doColumn("XMLPath"); }
        public void columnIscontrolled() { doColumn("IsControlled"); }
        public void columnLastloaddate() { doColumn("LastLoadDate"); }
        public void columnLastsavedate() { doColumn("LastSaveDate"); }
        public void columnVersion() { doColumn("Version"); }
        public void columnPkgowner() { doColumn("PkgOwner"); }
        public void columnUmlversion() { doColumn("UMLVersion"); }
        public void columnUsedtd() { doColumn("UseDTD"); }
        public void columnLogxml() { doColumn("LogXML"); }
        public void columnCodepath() { doColumn("CodePath"); }
        public void columnNamespace() { doColumn("Namespace"); }
        public void columnTpos() { doColumn("TPos"); }
        public void columnPackageflags() { doColumn("PackageFlags"); }
        public void columnBatchsave() { doColumn("BatchSave"); }
        public void columnBatchload() { doColumn("BatchLoad"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_package"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TPackageCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TPackageCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
