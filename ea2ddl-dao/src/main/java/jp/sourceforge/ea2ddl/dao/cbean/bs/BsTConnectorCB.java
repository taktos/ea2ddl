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
 * The base condition-bean of t_connector.
 * @author DBFlute(AutoGenerator)
 */
public class BsTConnectorCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();
    protected TConnectorCQ _conditionQuery;

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
        return "t_connector";
    }

    public String getTableSqlName() {
        return "t_connector";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
        {
            Object obj = primaryKeyMap.get("Connector_ID");
            if (obj instanceof java.lang.Integer) {
                query().setConnectorId_Equal((java.lang.Integer)obj);
            } else {
                query().setConnectorId_Equal(new java.lang.Integer((String)obj));
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ConnectorId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ConnectorId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public TConnectorCQ query() {
        return getConditionQuery();
    }

    public TConnectorCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TConnectorCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TConnectorCB&gt;() {
     *     public void query(TConnectorCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TConnectorCB> unionQuery) {
        final TConnectorCB cb = new TConnectorCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TConnectorCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TConnectorCB&gt;() {
     *     public void query(TConnectorCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TConnectorCB> unionQuery) {
        final TConnectorCB cb = new TConnectorCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TConnectorCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============
    protected TOperationNss _nssTOperationBySourcerole;
    public TOperationNss getNssTOperationBySourcerole() {
        if (_nssTOperationBySourcerole == null) { _nssTOperationBySourcerole = new TOperationNss(null); }
        return _nssTOperationBySourcerole;
    }
    public TOperationNss setupSelect_TOperationBySourcerole() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryTOperationBySourcerole(); } });
        if (_nssTOperationBySourcerole == null || !_nssTOperationBySourcerole.hasConditionQuery())
        { _nssTOperationBySourcerole = new TOperationNss(query().queryTOperationBySourcerole()); }
        return _nssTOperationBySourcerole;
    }
    protected TOperationNss _nssTOperationByDestrole;
    public TOperationNss getNssTOperationByDestrole() {
        if (_nssTOperationByDestrole == null) { _nssTOperationByDestrole = new TOperationNss(null); }
        return _nssTOperationByDestrole;
    }
    public TOperationNss setupSelect_TOperationByDestrole() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryTOperationByDestrole(); } });
        if (_nssTOperationByDestrole == null || !_nssTOperationByDestrole.hasConditionQuery())
        { _nssTOperationByDestrole = new TOperationNss(query().queryTOperationByDestrole()); }
        return _nssTOperationByDestrole;
    }
    protected TObjectNss _nssTObjectByStartObjectId;
    public TObjectNss getNssTObjectByStartObjectId() {
        if (_nssTObjectByStartObjectId == null) { _nssTObjectByStartObjectId = new TObjectNss(null); }
        return _nssTObjectByStartObjectId;
    }
    public TObjectNss setupSelect_TObjectByStartObjectId() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryTObjectByStartObjectId(); } });
        if (_nssTObjectByStartObjectId == null || !_nssTObjectByStartObjectId.hasConditionQuery())
        { _nssTObjectByStartObjectId = new TObjectNss(query().queryTObjectByStartObjectId()); }
        return _nssTObjectByStartObjectId;
    }
    protected TObjectNss _nssTObjectByEndObjectId;
    public TObjectNss getNssTObjectByEndObjectId() {
        if (_nssTObjectByEndObjectId == null) { _nssTObjectByEndObjectId = new TObjectNss(null); }
        return _nssTObjectByEndObjectId;
    }
    public TObjectNss setupSelect_TObjectByEndObjectId() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryTObjectByEndObjectId(); } });
        if (_nssTObjectByEndObjectId == null || !_nssTObjectByEndObjectId.hasConditionQuery())
        { _nssTObjectByEndObjectId = new TObjectNss(query().queryTObjectByEndObjectId()); }
        return _nssTObjectByEndObjectId;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TConnectorCQ>() {
            public boolean has() { return true; } public TConnectorCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<TConnectorCQ> {
        protected SpQyCall<TConnectorCQ> _myQyCall;
        protected TOperationCB.Specification _tOperationBySourcerole;
        protected TOperationCB.Specification _tOperationByDestrole;
        protected TObjectCB.Specification _tObjectByStartObjectId;
        protected TObjectCB.Specification _tObjectByEndObjectId;
        public Specification(ConditionBean baseCB, SpQyCall<TConnectorCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnConnectorId() { doColumn("Connector_ID"); }
        public void columnName() { doColumn("Name"); }
        public void columnDirection() { doColumn("Direction"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnConnectorType() { doColumn("Connector_Type"); }
        public void columnSubtype() { doColumn("SubType"); }
        public void columnSourcecard() { doColumn("SourceCard"); }
        public void columnSourceaccess() { doColumn("SourceAccess"); }
        public void columnSourceelement() { doColumn("SourceElement"); }
        public void columnDestcard() { doColumn("DestCard"); }
        public void columnDestaccess() { doColumn("DestAccess"); }
        public void columnDestelement() { doColumn("DestElement"); }
        public void columnSourcerole() { doColumn("SourceRole"); }
        public void columnSourceroletype() { doColumn("SourceRoleType"); }
        public void columnSourcerolenote() { doColumn("SourceRoleNote"); }
        public void columnSourcecontainment() { doColumn("SourceContainment"); }
        public void columnSourceisaggregate() { doColumn("SourceIsAggregate"); }
        public void columnSourceisordered() { doColumn("SourceIsOrdered"); }
        public void columnSourcequalifier() { doColumn("SourceQualifier"); }
        public void columnDestrole() { doColumn("DestRole"); }
        public void columnDestroletype() { doColumn("DestRoleType"); }
        public void columnDestrolenote() { doColumn("DestRoleNote"); }
        public void columnDestcontainment() { doColumn("DestContainment"); }
        public void columnDestisaggregate() { doColumn("DestIsAggregate"); }
        public void columnDestisordered() { doColumn("DestIsOrdered"); }
        public void columnDestqualifier() { doColumn("DestQualifier"); }
        public void columnStartObjectId() { doColumn("Start_Object_ID"); }
        public void columnEndObjectId() { doColumn("End_Object_ID"); }
        public void columnTopStartLabel() { doColumn("Top_Start_Label"); }
        public void columnTopMidLabel() { doColumn("Top_Mid_Label"); }
        public void columnTopEndLabel() { doColumn("Top_End_Label"); }
        public void columnBtmStartLabel() { doColumn("Btm_Start_Label"); }
        public void columnBtmMidLabel() { doColumn("Btm_Mid_Label"); }
        public void columnBtmEndLabel() { doColumn("Btm_End_Label"); }
        public void columnStartEdge() { doColumn("Start_Edge"); }
        public void columnEndEdge() { doColumn("End_Edge"); }
        public void columnPtstartx() { doColumn("PtStartX"); }
        public void columnPtstarty() { doColumn("PtStartY"); }
        public void columnPtendx() { doColumn("PtEndX"); }
        public void columnPtendy() { doColumn("PtEndY"); }
        public void columnSeqno() { doColumn("SeqNo"); }
        public void columnHeadstyle() { doColumn("HeadStyle"); }
        public void columnLinestyle() { doColumn("LineStyle"); }
        public void columnRoutestyle() { doColumn("RouteStyle"); }
        public void columnIsbold() { doColumn("IsBold"); }
        public void columnLinecolor() { doColumn("LineColor"); }
        public void columnStereotype() { doColumn("Stereotype"); }
        public void columnVirtualinheritance() { doColumn("VirtualInheritance"); }
        public void columnLinkaccess() { doColumn("LinkAccess"); }
        public void columnPdata1() { doColumn("PDATA1"); }
        public void columnPdata2() { doColumn("PDATA2"); }
        public void columnPdata3() { doColumn("PDATA3"); }
        public void columnPdata4() { doColumn("PDATA4"); }
        public void columnPdata5() { doColumn("PDATA5"); }
        public void columnDiagramid() { doColumn("DiagramID"); }
        public void columnEaGuid() { doColumn("ea_guid"); }
        public void columnSourceconstraint() { doColumn("SourceConstraint"); }
        public void columnDestconstraint() { doColumn("DestConstraint"); }
        public void columnSourceisnavigable() { doColumn("SourceIsNavigable"); }
        public void columnDestisnavigable() { doColumn("DestIsNavigable"); }
        public void columnIsroot() { doColumn("IsRoot"); }
        public void columnIsleaf() { doColumn("IsLeaf"); }
        public void columnIsspec() { doColumn("IsSpec"); }
        public void columnSourcechangeable() { doColumn("SourceChangeable"); }
        public void columnDestchangeable() { doColumn("DestChangeable"); }
        public void columnSourcets() { doColumn("SourceTS"); }
        public void columnDestts() { doColumn("DestTS"); }
        public void columnStateflags() { doColumn("StateFlags"); }
        public void columnActionflags() { doColumn("ActionFlags"); }
        public void columnIssignal() { doColumn("IsSignal"); }
        public void columnIsstimulus() { doColumn("IsStimulus"); }
        public void columnDispatchaction() { doColumn("DispatchAction"); }
        public void columnTarget2() { doColumn("Target2"); }
        public void columnStyleex() { doColumn("StyleEx"); }
        public void columnSourcestereotype() { doColumn("SourceStereotype"); }
        public void columnDeststereotype() { doColumn("DestStereotype"); }
        public void columnSourcestyle() { doColumn("SourceStyle"); }
        public void columnDeststyle() { doColumn("DestStyle"); }
        public void columnEventflags() { doColumn("EventFlags"); }
        protected void doSpecifyRequiredColumn() {
            columnConnectorId();// PK
            if (_myQyCall.qy().hasConditionQueryTOperationBySourcerole()) {
                columnSourcerole();// FK
            }
            if (_myQyCall.qy().hasConditionQueryTOperationByDestrole()) {
                columnDestrole();// FK
            }
            if (_myQyCall.qy().hasConditionQueryTObjectByStartObjectId()) {
                columnStartObjectId();// FK
            }
            if (_myQyCall.qy().hasConditionQueryTObjectByEndObjectId()) {
                columnEndObjectId();// FK
            }
        }
        protected String getTableDbName() { return "t_connector"; }
        public TOperationCB.Specification specifyTOperationBySourcerole() {
            assertForeign("tOperationBySourcerole");
            if (_tOperationBySourcerole == null) {
                _tOperationBySourcerole = new TOperationCB.Specification(_baseCB, new SpQyCall<TOperationCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryTOperationBySourcerole(); }
                    public TOperationCQ qy() { return _myQyCall.qy().queryTOperationBySourcerole(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _tOperationBySourcerole;
        }
        public TOperationCB.Specification specifyTOperationByDestrole() {
            assertForeign("tOperationByDestrole");
            if (_tOperationByDestrole == null) {
                _tOperationByDestrole = new TOperationCB.Specification(_baseCB, new SpQyCall<TOperationCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryTOperationByDestrole(); }
                    public TOperationCQ qy() { return _myQyCall.qy().queryTOperationByDestrole(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _tOperationByDestrole;
        }
        public TObjectCB.Specification specifyTObjectByStartObjectId() {
            assertForeign("tObjectByStartObjectId");
            if (_tObjectByStartObjectId == null) {
                _tObjectByStartObjectId = new TObjectCB.Specification(_baseCB, new SpQyCall<TObjectCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryTObjectByStartObjectId(); }
                    public TObjectCQ qy() { return _myQyCall.qy().queryTObjectByStartObjectId(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _tObjectByStartObjectId;
        }
        public TObjectCB.Specification specifyTObjectByEndObjectId() {
            assertForeign("tObjectByEndObjectId");
            if (_tObjectByEndObjectId == null) {
                _tObjectByEndObjectId = new TObjectCB.Specification(_baseCB, new SpQyCall<TObjectCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryTObjectByEndObjectId(); }
                    public TObjectCQ qy() { return _myQyCall.qy().queryTObjectByEndObjectId(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _tObjectByEndObjectId;
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
    protected String getConditionBeanClassNameInternally() { return TConnectorCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TConnectorCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
