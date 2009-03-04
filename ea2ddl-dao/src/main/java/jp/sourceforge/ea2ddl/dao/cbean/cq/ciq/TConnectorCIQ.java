package jp.sourceforge.ea2ddl.dao.cbean.cq.ciq;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.bs.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The condition-inline-query of t_connector.
 * @author DBFlute(AutoGenerator)
 */
public class TConnectorCIQ extends AbstractBsTConnectorCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTConnectorCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TConnectorCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTConnectorCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.getForeignPropertyName();// Accept foreign property name.
        _relationPath = _myCQ.getRelationPath();// Accept relation path.
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        throw new UnsupportedOperationException("InlineQuery must not need UNION method: " + baseQueryAsSuper + " : " + unionQueryAsSuper);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(String whereClause) {
        registerInlineWhereClause(whereClause);
    }

    @Override
    protected String getInScopeSubQueryRealColumnName(String columnName) {
        if (_onClauseInline) {
            throw new UnsupportedOperationException("InScopeSubQuery of on-clause is unsupported");
        }
        return _onClauseInline ? getRealAliasName() + "." + columnName : columnName;
    }

    @Override
    protected void registerExistsSubQuery(ConditionQuery subQuery
            , String columnName, String relatedColumnName, String propertyName) {
        throw new UnsupportedOperationException("Sorry! ExistsSubQuery at inline view is unsupported. So please use InScopeSubQyery.");
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueConnectorId() {
        return _myCQ.getConnectorId();
    }
    protected ConditionValue getCValueName() {
        return _myCQ.getName();
    }
    protected ConditionValue getCValueDirection() {
        return _myCQ.getDirection();
    }
    protected ConditionValue getCValueNotes() {
        return _myCQ.getNotes();
    }
    protected ConditionValue getCValueConnectorType() {
        return _myCQ.getConnectorType();
    }
    protected ConditionValue getCValueSubtype() {
        return _myCQ.getSubtype();
    }
    protected ConditionValue getCValueSourcecard() {
        return _myCQ.getSourcecard();
    }
    protected ConditionValue getCValueSourceaccess() {
        return _myCQ.getSourceaccess();
    }
    protected ConditionValue getCValueSourceelement() {
        return _myCQ.getSourceelement();
    }
    protected ConditionValue getCValueDestcard() {
        return _myCQ.getDestcard();
    }
    protected ConditionValue getCValueDestaccess() {
        return _myCQ.getDestaccess();
    }
    protected ConditionValue getCValueDestelement() {
        return _myCQ.getDestelement();
    }
    protected ConditionValue getCValueSourcerole() {
        return _myCQ.getSourcerole();
    }
    public String keepSourcerole_InScopeSubQuery_TOperationBySourcerole(TOperationCQ subQuery) {
        return _myCQ.keepSourcerole_InScopeSubQuery_TOperationBySourcerole(subQuery);
    }
    protected ConditionValue getCValueSourceroletype() {
        return _myCQ.getSourceroletype();
    }
    protected ConditionValue getCValueSourcerolenote() {
        return _myCQ.getSourcerolenote();
    }
    protected ConditionValue getCValueSourcecontainment() {
        return _myCQ.getSourcecontainment();
    }
    protected ConditionValue getCValueSourceisaggregate() {
        return _myCQ.getSourceisaggregate();
    }
    protected ConditionValue getCValueSourceisordered() {
        return _myCQ.getSourceisordered();
    }
    protected ConditionValue getCValueSourcequalifier() {
        return _myCQ.getSourcequalifier();
    }
    protected ConditionValue getCValueDestrole() {
        return _myCQ.getDestrole();
    }
    public String keepDestrole_InScopeSubQuery_TOperationByDestrole(TOperationCQ subQuery) {
        return _myCQ.keepDestrole_InScopeSubQuery_TOperationByDestrole(subQuery);
    }
    protected ConditionValue getCValueDestroletype() {
        return _myCQ.getDestroletype();
    }
    protected ConditionValue getCValueDestrolenote() {
        return _myCQ.getDestrolenote();
    }
    protected ConditionValue getCValueDestcontainment() {
        return _myCQ.getDestcontainment();
    }
    protected ConditionValue getCValueDestisaggregate() {
        return _myCQ.getDestisaggregate();
    }
    protected ConditionValue getCValueDestisordered() {
        return _myCQ.getDestisordered();
    }
    protected ConditionValue getCValueDestqualifier() {
        return _myCQ.getDestqualifier();
    }
    protected ConditionValue getCValueStartObjectId() {
        return _myCQ.getStartObjectId();
    }
    public String keepStartObjectId_InScopeSubQuery_TObjectByStartObjectId(TObjectCQ subQuery) {
        return _myCQ.keepStartObjectId_InScopeSubQuery_TObjectByStartObjectId(subQuery);
    }
    protected ConditionValue getCValueEndObjectId() {
        return _myCQ.getEndObjectId();
    }
    public String keepEndObjectId_InScopeSubQuery_TObjectByEndObjectId(TObjectCQ subQuery) {
        return _myCQ.keepEndObjectId_InScopeSubQuery_TObjectByEndObjectId(subQuery);
    }
    protected ConditionValue getCValueTopStartLabel() {
        return _myCQ.getTopStartLabel();
    }
    protected ConditionValue getCValueTopMidLabel() {
        return _myCQ.getTopMidLabel();
    }
    protected ConditionValue getCValueTopEndLabel() {
        return _myCQ.getTopEndLabel();
    }
    protected ConditionValue getCValueBtmStartLabel() {
        return _myCQ.getBtmStartLabel();
    }
    protected ConditionValue getCValueBtmMidLabel() {
        return _myCQ.getBtmMidLabel();
    }
    protected ConditionValue getCValueBtmEndLabel() {
        return _myCQ.getBtmEndLabel();
    }
    protected ConditionValue getCValueStartEdge() {
        return _myCQ.getStartEdge();
    }
    protected ConditionValue getCValueEndEdge() {
        return _myCQ.getEndEdge();
    }
    protected ConditionValue getCValuePtstartx() {
        return _myCQ.getPtstartx();
    }
    protected ConditionValue getCValuePtstarty() {
        return _myCQ.getPtstarty();
    }
    protected ConditionValue getCValuePtendx() {
        return _myCQ.getPtendx();
    }
    protected ConditionValue getCValuePtendy() {
        return _myCQ.getPtendy();
    }
    protected ConditionValue getCValueSeqno() {
        return _myCQ.getSeqno();
    }
    protected ConditionValue getCValueHeadstyle() {
        return _myCQ.getHeadstyle();
    }
    protected ConditionValue getCValueLinestyle() {
        return _myCQ.getLinestyle();
    }
    protected ConditionValue getCValueRoutestyle() {
        return _myCQ.getRoutestyle();
    }
    protected ConditionValue getCValueIsbold() {
        return _myCQ.getIsbold();
    }
    protected ConditionValue getCValueLinecolor() {
        return _myCQ.getLinecolor();
    }
    protected ConditionValue getCValueStereotype() {
        return _myCQ.getStereotype();
    }
    protected ConditionValue getCValueVirtualinheritance() {
        return _myCQ.getVirtualinheritance();
    }
    protected ConditionValue getCValueLinkaccess() {
        return _myCQ.getLinkaccess();
    }
    protected ConditionValue getCValuePdata1() {
        return _myCQ.getPdata1();
    }
    protected ConditionValue getCValuePdata2() {
        return _myCQ.getPdata2();
    }
    protected ConditionValue getCValuePdata3() {
        return _myCQ.getPdata3();
    }
    protected ConditionValue getCValuePdata4() {
        return _myCQ.getPdata4();
    }
    protected ConditionValue getCValuePdata5() {
        return _myCQ.getPdata5();
    }
    protected ConditionValue getCValueDiagramid() {
        return _myCQ.getDiagramid();
    }
    protected ConditionValue getCValueEaGuid() {
        return _myCQ.getEaGuid();
    }
    protected ConditionValue getCValueSourceconstraint() {
        return _myCQ.getSourceconstraint();
    }
    protected ConditionValue getCValueDestconstraint() {
        return _myCQ.getDestconstraint();
    }
    protected ConditionValue getCValueSourceisnavigable() {
        return _myCQ.getSourceisnavigable();
    }
    protected ConditionValue getCValueDestisnavigable() {
        return _myCQ.getDestisnavigable();
    }
    protected ConditionValue getCValueIsroot() {
        return _myCQ.getIsroot();
    }
    protected ConditionValue getCValueIsleaf() {
        return _myCQ.getIsleaf();
    }
    protected ConditionValue getCValueIsspec() {
        return _myCQ.getIsspec();
    }
    protected ConditionValue getCValueSourcechangeable() {
        return _myCQ.getSourcechangeable();
    }
    protected ConditionValue getCValueDestchangeable() {
        return _myCQ.getDestchangeable();
    }
    protected ConditionValue getCValueSourcets() {
        return _myCQ.getSourcets();
    }
    protected ConditionValue getCValueDestts() {
        return _myCQ.getDestts();
    }
    protected ConditionValue getCValueStateflags() {
        return _myCQ.getStateflags();
    }
    protected ConditionValue getCValueActionflags() {
        return _myCQ.getActionflags();
    }
    protected ConditionValue getCValueIssignal() {
        return _myCQ.getIssignal();
    }
    protected ConditionValue getCValueIsstimulus() {
        return _myCQ.getIsstimulus();
    }
    protected ConditionValue getCValueDispatchaction() {
        return _myCQ.getDispatchaction();
    }
    protected ConditionValue getCValueTarget2() {
        return _myCQ.getTarget2();
    }
    protected ConditionValue getCValueStyleex() {
        return _myCQ.getStyleex();
    }
    protected ConditionValue getCValueSourcestereotype() {
        return _myCQ.getSourcestereotype();
    }
    protected ConditionValue getCValueDeststereotype() {
        return _myCQ.getDeststereotype();
    }
    protected ConditionValue getCValueSourcestyle() {
        return _myCQ.getSourcestyle();
    }
    protected ConditionValue getCValueDeststyle() {
        return _myCQ.getDeststyle();
    }
    protected ConditionValue getCValueEventflags() {
        return _myCQ.getEventflags();
    }

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    public String keepScalarSubQuery(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("ScalarSubQuery at inline() is unsupported! Sorry!");
    }

    // ===================================================================================
    //                                                             MySelf InScope SubQuery
    //                                                             =======================
    public String keepMyselfInScopeSubQuery(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("MyselfInScopeSubQuery at inline() is unsupported! Sorry!");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xiCB() { return TConnectorCB.class.getName(); }
    String xiCQ() { return TConnectorCQ.class.getName(); }
}
