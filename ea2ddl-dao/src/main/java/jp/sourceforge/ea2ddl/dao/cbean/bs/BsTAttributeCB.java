package jp.sourceforge.ea2ddl.dao.cbean.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.AbstractConditionBean;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import jp.sourceforge.ea2ddl.dao.allcommon.DBFluteConfig;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.ImplementedSqlClauseCreator;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;
import jp.sourceforge.ea2ddl.dao.cbean.nss.*;

/**
 * The base condition-bean of t_attribute.
 * @author DBFlute(AutoGenerator)
 */
public class BsTAttributeCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();
    protected TAttributeCQ _conditionQuery;

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        return new ImplementedSqlClauseCreator().createSqlClause(this);
    }
    
    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return _dbmetaProvider;
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_attribute";
    }

    public String getTableSqlName() {
        return "t_attribute";
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
    public TAttributeCQ query() {
        return getConditionQuery();
    }

    public TAttributeCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TAttributeCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
        }
        return _conditionQuery;
    }

    /**
     * {@inheritDoc}
     * @return The conditionQuery of the local table as interface. (NotNull)
     */
    public ConditionQuery localCQ() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union'.
     * <pre>
     * cb.query().union(new UnionQuery&lt;TAttributeCB&gt;() {
     *     public void query(TAttributeCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TAttributeCB> unionQuery) {
        final TAttributeCB cb = new TAttributeCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TAttributeCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TAttributeCB&gt;() {
     *     public void query(TAttributeCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TAttributeCB> unionQuery) {
        final TAttributeCB cb = new TAttributeCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TAttributeCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============
    protected TObjectNss _nssTObject;
    public TObjectNss getNssTObject() {
        if (_nssTObject == null) { _nssTObject = new TObjectNss(null); }
        return _nssTObject;
    }
    public TObjectNss setupSelect_TObject() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryTObject(); } });
        if (_nssTObject == null || !_nssTObject.hasConditionQuery())
        { _nssTObject = new TObjectNss(query().queryTObject()); }
        return _nssTObject;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TAttributeCQ>() {
            public boolean has() { return true; } public TAttributeCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<TAttributeCQ> {
        protected SpQyCall<TAttributeCQ> _myQyCall;
        protected TObjectCB.Specification _tObject;
        public Specification(ConditionBean baseCB, SpQyCall<TAttributeCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnObjectId() { doColumn("Object_ID"); }
        public void columnName() { doColumn("Name"); }
        public void columnScope() { doColumn("Scope"); }
        public void columnStereotype() { doColumn("Stereotype"); }
        public void columnContainment() { doColumn("Containment"); }
        public void columnIsstatic() { doColumn("IsStatic"); }
        public void columnIscollection() { doColumn("IsCollection"); }
        public void columnIsordered() { doColumn("IsOrdered"); }
        public void columnAllowduplicates() { doColumn("AllowDuplicates"); }
        public void columnLowerbound() { doColumn("LowerBound"); }
        public void columnUpperbound() { doColumn("UpperBound"); }
        public void columnContainer() { doColumn("Container"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnDerived() { doColumn("Derived"); }
        public void columnId() { doColumn("ID"); }
        public void columnPos() { doColumn("Pos"); }
        public void columnGenoption() { doColumn("GenOption"); }
        public void columnLength() { doColumn("Length"); }
        public void columnPrecision() { doColumn("Precision"); }
        public void columnScale() { doColumn("Scale"); }
        public void columnStyle() { doColumn("Style"); }
        public void columnClassifier() { doColumn("Classifier"); }
        public void columnType() { doColumn("Type"); }
        public void columnEaGuid() { doColumn("ea_guid"); }
        public void columnStyleex() { doColumn("StyleEx"); }
        protected void doSpecifyRequiredColumn() {
            if (_myQyCall.qy().hasConditionQueryTObject()) {
                columnObjectId();// FK
            }
        }
        protected String getTableDbName() { return "t_attribute"; }
        public TObjectCB.Specification specifyTObject() {
            assertForeign("tObject");
            if (_tObject == null) {
                _tObject = new TObjectCB.Specification(_baseCB, new SpQyCall<TObjectCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryTObject(); }
                    public TObjectCQ qy() { return _myQyCall.qy().queryTObject(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _tObject;
        }
    }

    // ===================================================================================
    //                                                                         Display SQL
    //                                                                         ===========
    @Override
    protected String getLogDateFormat() { return DBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return DBFluteConfig.getInstance().getLogTimestampFormat(); }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TAttributeCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TAttributeCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
