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
 * The base condition-bean of t_connector.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTConnectorCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TConnectorCQ _conditionQuery;

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
    public TConnectorCQ query() {
        return getConditionQuery();
    }

    public TConnectorCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TConnectorCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TConnectorCB> unionQuery).
     */
    public void union(TConnectorCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TConnectorCB> unionQuery).
     */
    public void unionAll(TConnectorCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TConnectorCQ>() {
            public boolean has() { return true; } public TConnectorCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TConnectorCQ> {
        protected SpQyCall<TConnectorCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TConnectorCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
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
        }
        protected String getTableDbName() { return "t_connector"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TConnectorCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TConnectorCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
