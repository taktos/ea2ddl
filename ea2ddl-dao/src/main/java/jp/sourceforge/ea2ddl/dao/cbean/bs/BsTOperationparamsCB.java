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
 * The base condition-bean of t_operationparams.
 * @author DBFlute(AutoGenerator)
 */
public class BsTOperationparamsCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();
    protected TOperationparamsCQ _conditionQuery;

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
        return "t_operationparams";
    }

    public String getTableSqlName() {
        return "t_operationparams";
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
    public TOperationparamsCQ query() {
        return getConditionQuery();
    }

    public TOperationparamsCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TOperationparamsCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TOperationparamsCB&gt;() {
     *     public void query(TOperationparamsCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TOperationparamsCB> unionQuery) {
        final TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TOperationparamsCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TOperationparamsCB&gt;() {
     *     public void query(TOperationparamsCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TOperationparamsCB> unionQuery) {
        final TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TOperationparamsCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============
    protected TOperationNss _nssTOperation;
    public TOperationNss getNssTOperation() {
        if (_nssTOperation == null) { _nssTOperation = new TOperationNss(null); }
        return _nssTOperation;
    }
    public TOperationNss setupSelect_TOperation() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryTOperation(); } });
        if (_nssTOperation == null || !_nssTOperation.hasConditionQuery())
        { _nssTOperation = new TOperationNss(query().queryTOperation()); }
        return _nssTOperation;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TOperationparamsCQ>() {
            public boolean has() { return true; } public TOperationparamsCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<TOperationparamsCQ> {
        protected SpQyCall<TOperationparamsCQ> _myQyCall;
        protected TOperationCB.Specification _tOperation;
        public Specification(ConditionBean baseCB, SpQyCall<TOperationparamsCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnOperationid() { doColumn("OperationID"); }
        public void columnName() { doColumn("Name"); }
        public void columnType() { doColumn("Type"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnPos() { doColumn("Pos"); }
        public void columnStyle() { doColumn("Style"); }
        public void columnKind() { doColumn("Kind"); }
        public void columnClassifier() { doColumn("Classifier"); }
        public void columnEaGuid() { doColumn("ea_guid"); }
        public void columnStyleex() { doColumn("StyleEx"); }
        protected void doSpecifyRequiredColumn() {
            if (_myQyCall.qy().hasConditionQueryTOperation()) {
                columnOperationid();// FK
            }
        }
        protected String getTableDbName() { return "t_operationparams"; }
        public TOperationCB.Specification specifyTOperation() {
            assertForeign("tOperation");
            if (_tOperation == null) {
                _tOperation = new TOperationCB.Specification(_baseCB, new SpQyCall<TOperationCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryTOperation(); }
                    public TOperationCQ qy() { return _myQyCall.qy().queryTOperation(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _tOperation;
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
    protected String getConditionBeanClassNameInternally() { return TOperationparamsCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TOperationparamsCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
