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

/**
 * The base condition-bean of t_constants.
 * @author DBFlute(AutoGenerator)
 */
public class BsTConstantsCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();
    protected TConstantsCQ _conditionQuery;

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
        return "t_constants";
    }

    public String getTableSqlName() {
        return "t_constants";
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
    public TConstantsCQ query() {
        return getConditionQuery();
    }

    public TConstantsCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TConstantsCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TConstantsCB&gt;() {
     *     public void query(TConstantsCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TConstantsCB> unionQuery) {
        final TConstantsCB cb = new TConstantsCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TConstantsCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TConstantsCB&gt;() {
     *     public void query(TConstantsCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TConstantsCB> unionQuery) {
        final TConstantsCB cb = new TConstantsCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TConstantsCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TConstantsCQ>() {
            public boolean has() { return true; } public TConstantsCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<TConstantsCQ> {
        protected SpQyCall<TConstantsCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TConstantsCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnConstantname() { doColumn("ConstantName"); }
        public void columnConstantvalue() { doColumn("ConstantValue"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_constants"; }
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
    protected String getConditionBeanClassNameInternally() { return TConstantsCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TConstantsCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
