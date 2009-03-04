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
 * The base condition-bean of t_operation.
 * @author DBFlute(AutoGenerator)
 */
public class BsTOperationCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();
    protected TOperationCQ _conditionQuery;

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
        return "t_operation";
    }

    public String getTableSqlName() {
        return "t_operation";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
        {
            Object obj = primaryKeyMap.get("OperationID");
            if (obj instanceof java.lang.Integer) {
                query().setOperationid_Equal((java.lang.Integer)obj);
            } else {
                query().setOperationid_Equal(new java.lang.Integer((String)obj));
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_Operationid_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_Operationid_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public TOperationCQ query() {
        return getConditionQuery();
    }

    public TOperationCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TOperationCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TOperationCB&gt;() {
     *     public void query(TOperationCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TOperationCB> unionQuery) {
        final TOperationCB cb = new TOperationCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TOperationCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TOperationCB&gt;() {
     *     public void query(TOperationCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TOperationCB> unionQuery) {
        final TOperationCB cb = new TOperationCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TOperationCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TOperationCQ>() {
            public boolean has() { return true; } public TOperationCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<TOperationCQ> {
        protected SpQyCall<TOperationCQ> _myQyCall;
        protected TObjectCB.Specification _tObject;
        public Specification(ConditionBean baseCB, SpQyCall<TOperationCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnOperationid() { doColumn("OperationID"); }
        public void columnObjectId() { doColumn("Object_ID"); }
        public void columnName() { doColumn("Name"); }
        public void columnScope() { doColumn("Scope"); }
        public void columnType() { doColumn("Type"); }
        public void columnReturnarray() { doColumn("ReturnArray"); }
        public void columnStereotype() { doColumn("Stereotype"); }
        public void columnIsstatic() { doColumn("IsStatic"); }
        public void columnConcurrency() { doColumn("Concurrency"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnBehaviour() { doColumn("Behaviour"); }
        public void columnGenoption() { doColumn("GenOption"); }
        public void columnPos() { doColumn("Pos"); }
        public void columnStyle() { doColumn("Style"); }
        public void columnPure() { doColumn("Pure"); }
        public void columnClassifier() { doColumn("Classifier"); }
        public void columnCode() { doColumn("Code"); }
        public void columnIsroot() { doColumn("IsRoot"); }
        public void columnIsleaf() { doColumn("IsLeaf"); }
        public void columnIsquery() { doColumn("IsQuery"); }
        public void columnStateflags() { doColumn("StateFlags"); }
        public void columnEaGuid() { doColumn("ea_guid"); }
        public void columnStyleex() { doColumn("StyleEx"); }
        protected void doSpecifyRequiredColumn() {
            columnOperationid();// PK
            if (_myQyCall.qy().hasConditionQueryTObject()) {
                columnObjectId();// FK
            }
        }
        protected String getTableDbName() { return "t_operation"; }
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
        public RAFunction<TOperationparamsCB, TOperationCQ> derivedTOperationparamsList() {
            return new RAFunction<TOperationparamsCB, TOperationCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<TOperationparamsCB, TOperationCQ>() {
                public void setup(String function, SubQuery<TOperationparamsCB> subQuery, TOperationCQ cq, String aliasName) {
                    cq.xsderiveTOperationparamsList(function, subQuery, aliasName); } }, _dbmetaProvider);
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
    protected String getConditionBeanClassNameInternally() { return TOperationCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TOperationCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
