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
 * The base condition-bean of t_rtfreport.
 * @author DBFlute(AutoGenerator)
 */
public class BsTRtfreportCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();
    protected TRtfreportCQ _conditionQuery;

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
        return "t_rtfreport";
    }

    public String getTableSqlName() {
        return "t_rtfreport";
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
    public TRtfreportCQ query() {
        return getConditionQuery();
    }

    public TRtfreportCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TRtfreportCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TRtfreportCB&gt;() {
     *     public void query(TRtfreportCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TRtfreportCB> unionQuery) {
        final TRtfreportCB cb = new TRtfreportCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TRtfreportCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TRtfreportCB&gt;() {
     *     public void query(TRtfreportCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TRtfreportCB> unionQuery) {
        final TRtfreportCB cb = new TRtfreportCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TRtfreportCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TRtfreportCQ>() {
            public boolean has() { return true; } public TRtfreportCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<TRtfreportCQ> {
        protected SpQyCall<TRtfreportCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TRtfreportCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnTemplateid() { doColumn("TemplateID"); }
        public void columnRootpackage() { doColumn("RootPackage"); }
        public void columnFilename() { doColumn("Filename"); }
        public void columnDetails() { doColumn("Details"); }
        public void columnProcesschildren() { doColumn("ProcessChildren"); }
        public void columnShowdiagrams() { doColumn("ShowDiagrams"); }
        public void columnHeading() { doColumn("Heading"); }
        public void columnRequirements() { doColumn("Requirements"); }
        public void columnAssociations() { doColumn("Associations"); }
        public void columnScenarios() { doColumn("Scenarios"); }
        public void columnChilddiagrams() { doColumn("ChildDiagrams"); }
        public void columnAttributes() { doColumn("Attributes"); }
        public void columnMethods() { doColumn("Methods"); }
        public void columnImagetype() { doColumn("ImageType"); }
        public void columnPaging() { doColumn("Paging"); }
        public void columnIntro() { doColumn("Intro"); }
        public void columnResources() { doColumn("Resources"); }
        public void columnConstraints() { doColumn("Constraints"); }
        public void columnTagged() { doColumn("Tagged"); }
        public void columnShowtag() { doColumn("ShowTag"); }
        public void columnShowalias() { doColumn("ShowAlias"); }
        public void columnPdata1() { doColumn("PDATA1"); }
        public void columnPdata2() { doColumn("PDATA2"); }
        public void columnPdata3() { doColumn("PDATA3"); }
        public void columnPdata4() { doColumn("PDATA4"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_rtfreport"; }
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
    protected String getConditionBeanClassNameInternally() { return TRtfreportCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TRtfreportCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
