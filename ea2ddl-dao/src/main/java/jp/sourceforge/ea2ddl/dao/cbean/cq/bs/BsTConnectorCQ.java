package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_connector.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTConnectorCQ extends AbstractBsTConnectorCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TConnectorCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTConnectorCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_connector) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TConnectorCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TConnectorCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_connector on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TConnectorCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TConnectorCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _connectorId;
    public ConditionValue getConnectorId() {
        if (_connectorId == null) { _connectorId = new ConditionValue(); }
        return _connectorId;
    }
    protected ConditionValue getCValueConnectorId() { return getConnectorId(); }
          
    public BsTConnectorCQ addOrderBy_ConnectorId_Asc() { regOBA("Connector_ID"); return this; }
    public BsTConnectorCQ addOrderBy_ConnectorId_Desc() { regOBD("Connector_ID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }
    
    public BsTConnectorCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTConnectorCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _direction;
    public ConditionValue getDirection() {
        if (_direction == null) { _direction = new ConditionValue(); }
        return _direction;
    }
    protected ConditionValue getCValueDirection() { return getDirection(); }
    
    public BsTConnectorCQ addOrderBy_Direction_Asc() { regOBA("Direction"); return this; }
    public BsTConnectorCQ addOrderBy_Direction_Desc() { regOBD("Direction"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTConnectorCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTConnectorCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _connectorType;
    public ConditionValue getConnectorType() {
        if (_connectorType == null) { _connectorType = new ConditionValue(); }
        return _connectorType;
    }
    protected ConditionValue getCValueConnectorType() { return getConnectorType(); }
    
    public BsTConnectorCQ addOrderBy_ConnectorType_Asc() { regOBA("Connector_Type"); return this; }
    public BsTConnectorCQ addOrderBy_ConnectorType_Desc() { regOBD("Connector_Type"); return this; }

    protected ConditionValue _subtype;
    public ConditionValue getSubtype() {
        if (_subtype == null) { _subtype = new ConditionValue(); }
        return _subtype;
    }
    protected ConditionValue getCValueSubtype() { return getSubtype(); }
    
    public BsTConnectorCQ addOrderBy_Subtype_Asc() { regOBA("SubType"); return this; }
    public BsTConnectorCQ addOrderBy_Subtype_Desc() { regOBD("SubType"); return this; }

    protected ConditionValue _sourcecard;
    public ConditionValue getSourcecard() {
        if (_sourcecard == null) { _sourcecard = new ConditionValue(); }
        return _sourcecard;
    }
    protected ConditionValue getCValueSourcecard() { return getSourcecard(); }
    
    public BsTConnectorCQ addOrderBy_Sourcecard_Asc() { regOBA("SourceCard"); return this; }
    public BsTConnectorCQ addOrderBy_Sourcecard_Desc() { regOBD("SourceCard"); return this; }

    protected ConditionValue _sourceaccess;
    public ConditionValue getSourceaccess() {
        if (_sourceaccess == null) { _sourceaccess = new ConditionValue(); }
        return _sourceaccess;
    }
    protected ConditionValue getCValueSourceaccess() { return getSourceaccess(); }
    
    public BsTConnectorCQ addOrderBy_Sourceaccess_Asc() { regOBA("SourceAccess"); return this; }
    public BsTConnectorCQ addOrderBy_Sourceaccess_Desc() { regOBD("SourceAccess"); return this; }

    protected ConditionValue _sourceelement;
    public ConditionValue getSourceelement() {
        if (_sourceelement == null) { _sourceelement = new ConditionValue(); }
        return _sourceelement;
    }
    protected ConditionValue getCValueSourceelement() { return getSourceelement(); }
    
    public BsTConnectorCQ addOrderBy_Sourceelement_Asc() { regOBA("SourceElement"); return this; }
    public BsTConnectorCQ addOrderBy_Sourceelement_Desc() { regOBD("SourceElement"); return this; }

    protected ConditionValue _destcard;
    public ConditionValue getDestcard() {
        if (_destcard == null) { _destcard = new ConditionValue(); }
        return _destcard;
    }
    protected ConditionValue getCValueDestcard() { return getDestcard(); }
    
    public BsTConnectorCQ addOrderBy_Destcard_Asc() { regOBA("DestCard"); return this; }
    public BsTConnectorCQ addOrderBy_Destcard_Desc() { regOBD("DestCard"); return this; }

    protected ConditionValue _destaccess;
    public ConditionValue getDestaccess() {
        if (_destaccess == null) { _destaccess = new ConditionValue(); }
        return _destaccess;
    }
    protected ConditionValue getCValueDestaccess() { return getDestaccess(); }
    
    public BsTConnectorCQ addOrderBy_Destaccess_Asc() { regOBA("DestAccess"); return this; }
    public BsTConnectorCQ addOrderBy_Destaccess_Desc() { regOBD("DestAccess"); return this; }

    protected ConditionValue _destelement;
    public ConditionValue getDestelement() {
        if (_destelement == null) { _destelement = new ConditionValue(); }
        return _destelement;
    }
    protected ConditionValue getCValueDestelement() { return getDestelement(); }
    
    public BsTConnectorCQ addOrderBy_Destelement_Asc() { regOBA("DestElement"); return this; }
    public BsTConnectorCQ addOrderBy_Destelement_Desc() { regOBD("DestElement"); return this; }

    protected ConditionValue _sourcerole;
    public ConditionValue getSourcerole() {
        if (_sourcerole == null) { _sourcerole = new ConditionValue(); }
        return _sourcerole;
    }
    protected ConditionValue getCValueSourcerole() { return getSourcerole(); }

    protected Map<String, TOperationCQ> _sourcerole_InScopeSubQuery_TOperationBySourceroleMap;
    public Map<String, TOperationCQ> getSourcerole_InScopeSubQuery_TOperationBySourcerole() { return _sourcerole_InScopeSubQuery_TOperationBySourceroleMap; }
    public String keepSourcerole_InScopeSubQuery_TOperationBySourcerole(TOperationCQ subQuery) {
        if (_sourcerole_InScopeSubQuery_TOperationBySourceroleMap == null) { _sourcerole_InScopeSubQuery_TOperationBySourceroleMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_sourcerole_InScopeSubQuery_TOperationBySourceroleMap.size() + 1);
        _sourcerole_InScopeSubQuery_TOperationBySourceroleMap.put(key, subQuery); return "sourcerole_InScopeSubQuery_TOperationBySourcerole." + key;
    }
    
    public BsTConnectorCQ addOrderBy_Sourcerole_Asc() { regOBA("SourceRole"); return this; }
    public BsTConnectorCQ addOrderBy_Sourcerole_Desc() { regOBD("SourceRole"); return this; }

    protected ConditionValue _sourceroletype;
    public ConditionValue getSourceroletype() {
        if (_sourceroletype == null) { _sourceroletype = new ConditionValue(); }
        return _sourceroletype;
    }
    protected ConditionValue getCValueSourceroletype() { return getSourceroletype(); }
    
    public BsTConnectorCQ addOrderBy_Sourceroletype_Asc() { regOBA("SourceRoleType"); return this; }
    public BsTConnectorCQ addOrderBy_Sourceroletype_Desc() { regOBD("SourceRoleType"); return this; }

    protected ConditionValue _sourcerolenote;
    public ConditionValue getSourcerolenote() {
        if (_sourcerolenote == null) { _sourcerolenote = new ConditionValue(); }
        return _sourcerolenote;
    }
    protected ConditionValue getCValueSourcerolenote() { return getSourcerolenote(); }
    
    public BsTConnectorCQ addOrderBy_Sourcerolenote_Asc() { regOBA("SourceRoleNote"); return this; }
    public BsTConnectorCQ addOrderBy_Sourcerolenote_Desc() { regOBD("SourceRoleNote"); return this; }

    protected ConditionValue _sourcecontainment;
    public ConditionValue getSourcecontainment() {
        if (_sourcecontainment == null) { _sourcecontainment = new ConditionValue(); }
        return _sourcecontainment;
    }
    protected ConditionValue getCValueSourcecontainment() { return getSourcecontainment(); }
    
    public BsTConnectorCQ addOrderBy_Sourcecontainment_Asc() { regOBA("SourceContainment"); return this; }
    public BsTConnectorCQ addOrderBy_Sourcecontainment_Desc() { regOBD("SourceContainment"); return this; }

    protected ConditionValue _sourceisaggregate;
    public ConditionValue getSourceisaggregate() {
        if (_sourceisaggregate == null) { _sourceisaggregate = new ConditionValue(); }
        return _sourceisaggregate;
    }
    protected ConditionValue getCValueSourceisaggregate() { return getSourceisaggregate(); }
          
    public BsTConnectorCQ addOrderBy_Sourceisaggregate_Asc() { regOBA("SourceIsAggregate"); return this; }
    public BsTConnectorCQ addOrderBy_Sourceisaggregate_Desc() { regOBD("SourceIsAggregate"); return this; }

    protected ConditionValue _sourceisordered;
    public ConditionValue getSourceisordered() {
        if (_sourceisordered == null) { _sourceisordered = new ConditionValue(); }
        return _sourceisordered;
    }
    protected ConditionValue getCValueSourceisordered() { return getSourceisordered(); }
          
    public BsTConnectorCQ addOrderBy_Sourceisordered_Asc() { regOBA("SourceIsOrdered"); return this; }
    public BsTConnectorCQ addOrderBy_Sourceisordered_Desc() { regOBD("SourceIsOrdered"); return this; }

    protected ConditionValue _sourcequalifier;
    public ConditionValue getSourcequalifier() {
        if (_sourcequalifier == null) { _sourcequalifier = new ConditionValue(); }
        return _sourcequalifier;
    }
    protected ConditionValue getCValueSourcequalifier() { return getSourcequalifier(); }
    
    public BsTConnectorCQ addOrderBy_Sourcequalifier_Asc() { regOBA("SourceQualifier"); return this; }
    public BsTConnectorCQ addOrderBy_Sourcequalifier_Desc() { regOBD("SourceQualifier"); return this; }

    protected ConditionValue _destrole;
    public ConditionValue getDestrole() {
        if (_destrole == null) { _destrole = new ConditionValue(); }
        return _destrole;
    }
    protected ConditionValue getCValueDestrole() { return getDestrole(); }

    protected Map<String, TOperationCQ> _destrole_InScopeSubQuery_TOperationByDestroleMap;
    public Map<String, TOperationCQ> getDestrole_InScopeSubQuery_TOperationByDestrole() { return _destrole_InScopeSubQuery_TOperationByDestroleMap; }
    public String keepDestrole_InScopeSubQuery_TOperationByDestrole(TOperationCQ subQuery) {
        if (_destrole_InScopeSubQuery_TOperationByDestroleMap == null) { _destrole_InScopeSubQuery_TOperationByDestroleMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_destrole_InScopeSubQuery_TOperationByDestroleMap.size() + 1);
        _destrole_InScopeSubQuery_TOperationByDestroleMap.put(key, subQuery); return "destrole_InScopeSubQuery_TOperationByDestrole." + key;
    }
    
    public BsTConnectorCQ addOrderBy_Destrole_Asc() { regOBA("DestRole"); return this; }
    public BsTConnectorCQ addOrderBy_Destrole_Desc() { regOBD("DestRole"); return this; }

    protected ConditionValue _destroletype;
    public ConditionValue getDestroletype() {
        if (_destroletype == null) { _destroletype = new ConditionValue(); }
        return _destroletype;
    }
    protected ConditionValue getCValueDestroletype() { return getDestroletype(); }
    
    public BsTConnectorCQ addOrderBy_Destroletype_Asc() { regOBA("DestRoleType"); return this; }
    public BsTConnectorCQ addOrderBy_Destroletype_Desc() { regOBD("DestRoleType"); return this; }

    protected ConditionValue _destrolenote;
    public ConditionValue getDestrolenote() {
        if (_destrolenote == null) { _destrolenote = new ConditionValue(); }
        return _destrolenote;
    }
    protected ConditionValue getCValueDestrolenote() { return getDestrolenote(); }
    
    public BsTConnectorCQ addOrderBy_Destrolenote_Asc() { regOBA("DestRoleNote"); return this; }
    public BsTConnectorCQ addOrderBy_Destrolenote_Desc() { regOBD("DestRoleNote"); return this; }

    protected ConditionValue _destcontainment;
    public ConditionValue getDestcontainment() {
        if (_destcontainment == null) { _destcontainment = new ConditionValue(); }
        return _destcontainment;
    }
    protected ConditionValue getCValueDestcontainment() { return getDestcontainment(); }
    
    public BsTConnectorCQ addOrderBy_Destcontainment_Asc() { regOBA("DestContainment"); return this; }
    public BsTConnectorCQ addOrderBy_Destcontainment_Desc() { regOBD("DestContainment"); return this; }

    protected ConditionValue _destisaggregate;
    public ConditionValue getDestisaggregate() {
        if (_destisaggregate == null) { _destisaggregate = new ConditionValue(); }
        return _destisaggregate;
    }
    protected ConditionValue getCValueDestisaggregate() { return getDestisaggregate(); }
          
    public BsTConnectorCQ addOrderBy_Destisaggregate_Asc() { regOBA("DestIsAggregate"); return this; }
    public BsTConnectorCQ addOrderBy_Destisaggregate_Desc() { regOBD("DestIsAggregate"); return this; }

    protected ConditionValue _destisordered;
    public ConditionValue getDestisordered() {
        if (_destisordered == null) { _destisordered = new ConditionValue(); }
        return _destisordered;
    }
    protected ConditionValue getCValueDestisordered() { return getDestisordered(); }
          
    public BsTConnectorCQ addOrderBy_Destisordered_Asc() { regOBA("DestIsOrdered"); return this; }
    public BsTConnectorCQ addOrderBy_Destisordered_Desc() { regOBD("DestIsOrdered"); return this; }

    protected ConditionValue _destqualifier;
    public ConditionValue getDestqualifier() {
        if (_destqualifier == null) { _destqualifier = new ConditionValue(); }
        return _destqualifier;
    }
    protected ConditionValue getCValueDestqualifier() { return getDestqualifier(); }
    
    public BsTConnectorCQ addOrderBy_Destqualifier_Asc() { regOBA("DestQualifier"); return this; }
    public BsTConnectorCQ addOrderBy_Destqualifier_Desc() { regOBD("DestQualifier"); return this; }

    protected ConditionValue _startObjectId;
    public ConditionValue getStartObjectId() {
        if (_startObjectId == null) { _startObjectId = new ConditionValue(); }
        return _startObjectId;
    }
    protected ConditionValue getCValueStartObjectId() { return getStartObjectId(); }
          
    protected Map<String, TObjectCQ> _startObjectId_InScopeSubQuery_TObjectByStartObjectIdMap;
    public Map<String, TObjectCQ> getStartObjectId_InScopeSubQuery_TObjectByStartObjectId() { return _startObjectId_InScopeSubQuery_TObjectByStartObjectIdMap; }
    public String keepStartObjectId_InScopeSubQuery_TObjectByStartObjectId(TObjectCQ subQuery) {
        if (_startObjectId_InScopeSubQuery_TObjectByStartObjectIdMap == null) { _startObjectId_InScopeSubQuery_TObjectByStartObjectIdMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_startObjectId_InScopeSubQuery_TObjectByStartObjectIdMap.size() + 1);
        _startObjectId_InScopeSubQuery_TObjectByStartObjectIdMap.put(key, subQuery); return "startObjectId_InScopeSubQuery_TObjectByStartObjectId." + key;
    }
      
    public BsTConnectorCQ addOrderBy_StartObjectId_Asc() { regOBA("Start_Object_ID"); return this; }
    public BsTConnectorCQ addOrderBy_StartObjectId_Desc() { regOBD("Start_Object_ID"); return this; }

    protected ConditionValue _endObjectId;
    public ConditionValue getEndObjectId() {
        if (_endObjectId == null) { _endObjectId = new ConditionValue(); }
        return _endObjectId;
    }
    protected ConditionValue getCValueEndObjectId() { return getEndObjectId(); }
          
    protected Map<String, TObjectCQ> _endObjectId_InScopeSubQuery_TObjectByEndObjectIdMap;
    public Map<String, TObjectCQ> getEndObjectId_InScopeSubQuery_TObjectByEndObjectId() { return _endObjectId_InScopeSubQuery_TObjectByEndObjectIdMap; }
    public String keepEndObjectId_InScopeSubQuery_TObjectByEndObjectId(TObjectCQ subQuery) {
        if (_endObjectId_InScopeSubQuery_TObjectByEndObjectIdMap == null) { _endObjectId_InScopeSubQuery_TObjectByEndObjectIdMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_endObjectId_InScopeSubQuery_TObjectByEndObjectIdMap.size() + 1);
        _endObjectId_InScopeSubQuery_TObjectByEndObjectIdMap.put(key, subQuery); return "endObjectId_InScopeSubQuery_TObjectByEndObjectId." + key;
    }
      
    public BsTConnectorCQ addOrderBy_EndObjectId_Asc() { regOBA("End_Object_ID"); return this; }
    public BsTConnectorCQ addOrderBy_EndObjectId_Desc() { regOBD("End_Object_ID"); return this; }

    protected ConditionValue _topStartLabel;
    public ConditionValue getTopStartLabel() {
        if (_topStartLabel == null) { _topStartLabel = new ConditionValue(); }
        return _topStartLabel;
    }
    protected ConditionValue getCValueTopStartLabel() { return getTopStartLabel(); }
    
    public BsTConnectorCQ addOrderBy_TopStartLabel_Asc() { regOBA("Top_Start_Label"); return this; }
    public BsTConnectorCQ addOrderBy_TopStartLabel_Desc() { regOBD("Top_Start_Label"); return this; }

    protected ConditionValue _topMidLabel;
    public ConditionValue getTopMidLabel() {
        if (_topMidLabel == null) { _topMidLabel = new ConditionValue(); }
        return _topMidLabel;
    }
    protected ConditionValue getCValueTopMidLabel() { return getTopMidLabel(); }
    
    public BsTConnectorCQ addOrderBy_TopMidLabel_Asc() { regOBA("Top_Mid_Label"); return this; }
    public BsTConnectorCQ addOrderBy_TopMidLabel_Desc() { regOBD("Top_Mid_Label"); return this; }

    protected ConditionValue _topEndLabel;
    public ConditionValue getTopEndLabel() {
        if (_topEndLabel == null) { _topEndLabel = new ConditionValue(); }
        return _topEndLabel;
    }
    protected ConditionValue getCValueTopEndLabel() { return getTopEndLabel(); }
    
    public BsTConnectorCQ addOrderBy_TopEndLabel_Asc() { regOBA("Top_End_Label"); return this; }
    public BsTConnectorCQ addOrderBy_TopEndLabel_Desc() { regOBD("Top_End_Label"); return this; }

    protected ConditionValue _btmStartLabel;
    public ConditionValue getBtmStartLabel() {
        if (_btmStartLabel == null) { _btmStartLabel = new ConditionValue(); }
        return _btmStartLabel;
    }
    protected ConditionValue getCValueBtmStartLabel() { return getBtmStartLabel(); }
    
    public BsTConnectorCQ addOrderBy_BtmStartLabel_Asc() { regOBA("Btm_Start_Label"); return this; }
    public BsTConnectorCQ addOrderBy_BtmStartLabel_Desc() { regOBD("Btm_Start_Label"); return this; }

    protected ConditionValue _btmMidLabel;
    public ConditionValue getBtmMidLabel() {
        if (_btmMidLabel == null) { _btmMidLabel = new ConditionValue(); }
        return _btmMidLabel;
    }
    protected ConditionValue getCValueBtmMidLabel() { return getBtmMidLabel(); }
    
    public BsTConnectorCQ addOrderBy_BtmMidLabel_Asc() { regOBA("Btm_Mid_Label"); return this; }
    public BsTConnectorCQ addOrderBy_BtmMidLabel_Desc() { regOBD("Btm_Mid_Label"); return this; }

    protected ConditionValue _btmEndLabel;
    public ConditionValue getBtmEndLabel() {
        if (_btmEndLabel == null) { _btmEndLabel = new ConditionValue(); }
        return _btmEndLabel;
    }
    protected ConditionValue getCValueBtmEndLabel() { return getBtmEndLabel(); }
    
    public BsTConnectorCQ addOrderBy_BtmEndLabel_Asc() { regOBA("Btm_End_Label"); return this; }
    public BsTConnectorCQ addOrderBy_BtmEndLabel_Desc() { regOBD("Btm_End_Label"); return this; }

    protected ConditionValue _startEdge;
    public ConditionValue getStartEdge() {
        if (_startEdge == null) { _startEdge = new ConditionValue(); }
        return _startEdge;
    }
    protected ConditionValue getCValueStartEdge() { return getStartEdge(); }
          
    public BsTConnectorCQ addOrderBy_StartEdge_Asc() { regOBA("Start_Edge"); return this; }
    public BsTConnectorCQ addOrderBy_StartEdge_Desc() { regOBD("Start_Edge"); return this; }

    protected ConditionValue _endEdge;
    public ConditionValue getEndEdge() {
        if (_endEdge == null) { _endEdge = new ConditionValue(); }
        return _endEdge;
    }
    protected ConditionValue getCValueEndEdge() { return getEndEdge(); }
          
    public BsTConnectorCQ addOrderBy_EndEdge_Asc() { regOBA("End_Edge"); return this; }
    public BsTConnectorCQ addOrderBy_EndEdge_Desc() { regOBD("End_Edge"); return this; }

    protected ConditionValue _ptstartx;
    public ConditionValue getPtstartx() {
        if (_ptstartx == null) { _ptstartx = new ConditionValue(); }
        return _ptstartx;
    }
    protected ConditionValue getCValuePtstartx() { return getPtstartx(); }
          
    public BsTConnectorCQ addOrderBy_Ptstartx_Asc() { regOBA("PtStartX"); return this; }
    public BsTConnectorCQ addOrderBy_Ptstartx_Desc() { regOBD("PtStartX"); return this; }

    protected ConditionValue _ptstarty;
    public ConditionValue getPtstarty() {
        if (_ptstarty == null) { _ptstarty = new ConditionValue(); }
        return _ptstarty;
    }
    protected ConditionValue getCValuePtstarty() { return getPtstarty(); }
          
    public BsTConnectorCQ addOrderBy_Ptstarty_Asc() { regOBA("PtStartY"); return this; }
    public BsTConnectorCQ addOrderBy_Ptstarty_Desc() { regOBD("PtStartY"); return this; }

    protected ConditionValue _ptendx;
    public ConditionValue getPtendx() {
        if (_ptendx == null) { _ptendx = new ConditionValue(); }
        return _ptendx;
    }
    protected ConditionValue getCValuePtendx() { return getPtendx(); }
          
    public BsTConnectorCQ addOrderBy_Ptendx_Asc() { regOBA("PtEndX"); return this; }
    public BsTConnectorCQ addOrderBy_Ptendx_Desc() { regOBD("PtEndX"); return this; }

    protected ConditionValue _ptendy;
    public ConditionValue getPtendy() {
        if (_ptendy == null) { _ptendy = new ConditionValue(); }
        return _ptendy;
    }
    protected ConditionValue getCValuePtendy() { return getPtendy(); }
          
    public BsTConnectorCQ addOrderBy_Ptendy_Asc() { regOBA("PtEndY"); return this; }
    public BsTConnectorCQ addOrderBy_Ptendy_Desc() { regOBD("PtEndY"); return this; }

    protected ConditionValue _seqno;
    public ConditionValue getSeqno() {
        if (_seqno == null) { _seqno = new ConditionValue(); }
        return _seqno;
    }
    protected ConditionValue getCValueSeqno() { return getSeqno(); }
          
    public BsTConnectorCQ addOrderBy_Seqno_Asc() { regOBA("SeqNo"); return this; }
    public BsTConnectorCQ addOrderBy_Seqno_Desc() { regOBD("SeqNo"); return this; }

    protected ConditionValue _headstyle;
    public ConditionValue getHeadstyle() {
        if (_headstyle == null) { _headstyle = new ConditionValue(); }
        return _headstyle;
    }
    protected ConditionValue getCValueHeadstyle() { return getHeadstyle(); }
          
    public BsTConnectorCQ addOrderBy_Headstyle_Asc() { regOBA("HeadStyle"); return this; }
    public BsTConnectorCQ addOrderBy_Headstyle_Desc() { regOBD("HeadStyle"); return this; }

    protected ConditionValue _linestyle;
    public ConditionValue getLinestyle() {
        if (_linestyle == null) { _linestyle = new ConditionValue(); }
        return _linestyle;
    }
    protected ConditionValue getCValueLinestyle() { return getLinestyle(); }
          
    public BsTConnectorCQ addOrderBy_Linestyle_Asc() { regOBA("LineStyle"); return this; }
    public BsTConnectorCQ addOrderBy_Linestyle_Desc() { regOBD("LineStyle"); return this; }

    protected ConditionValue _routestyle;
    public ConditionValue getRoutestyle() {
        if (_routestyle == null) { _routestyle = new ConditionValue(); }
        return _routestyle;
    }
    protected ConditionValue getCValueRoutestyle() { return getRoutestyle(); }
          
    public BsTConnectorCQ addOrderBy_Routestyle_Asc() { regOBA("RouteStyle"); return this; }
    public BsTConnectorCQ addOrderBy_Routestyle_Desc() { regOBD("RouteStyle"); return this; }

    protected ConditionValue _isbold;
    public ConditionValue getIsbold() {
        if (_isbold == null) { _isbold = new ConditionValue(); }
        return _isbold;
    }
    protected ConditionValue getCValueIsbold() { return getIsbold(); }
          
    public BsTConnectorCQ addOrderBy_Isbold_Asc() { regOBA("IsBold"); return this; }
    public BsTConnectorCQ addOrderBy_Isbold_Desc() { regOBD("IsBold"); return this; }

    protected ConditionValue _linecolor;
    public ConditionValue getLinecolor() {
        if (_linecolor == null) { _linecolor = new ConditionValue(); }
        return _linecolor;
    }
    protected ConditionValue getCValueLinecolor() { return getLinecolor(); }
          
    public BsTConnectorCQ addOrderBy_Linecolor_Asc() { regOBA("LineColor"); return this; }
    public BsTConnectorCQ addOrderBy_Linecolor_Desc() { regOBD("LineColor"); return this; }

    protected ConditionValue _stereotype;
    public ConditionValue getStereotype() {
        if (_stereotype == null) { _stereotype = new ConditionValue(); }
        return _stereotype;
    }
    protected ConditionValue getCValueStereotype() { return getStereotype(); }
    
    public BsTConnectorCQ addOrderBy_Stereotype_Asc() { regOBA("Stereotype"); return this; }
    public BsTConnectorCQ addOrderBy_Stereotype_Desc() { regOBD("Stereotype"); return this; }

    protected ConditionValue _virtualinheritance;
    public ConditionValue getVirtualinheritance() {
        if (_virtualinheritance == null) { _virtualinheritance = new ConditionValue(); }
        return _virtualinheritance;
    }
    protected ConditionValue getCValueVirtualinheritance() { return getVirtualinheritance(); }
    
    public BsTConnectorCQ addOrderBy_Virtualinheritance_Asc() { regOBA("VirtualInheritance"); return this; }
    public BsTConnectorCQ addOrderBy_Virtualinheritance_Desc() { regOBD("VirtualInheritance"); return this; }

    protected ConditionValue _linkaccess;
    public ConditionValue getLinkaccess() {
        if (_linkaccess == null) { _linkaccess = new ConditionValue(); }
        return _linkaccess;
    }
    protected ConditionValue getCValueLinkaccess() { return getLinkaccess(); }
    
    public BsTConnectorCQ addOrderBy_Linkaccess_Asc() { regOBA("LinkAccess"); return this; }
    public BsTConnectorCQ addOrderBy_Linkaccess_Desc() { regOBD("LinkAccess"); return this; }

    protected ConditionValue _pdata1;
    public ConditionValue getPdata1() {
        if (_pdata1 == null) { _pdata1 = new ConditionValue(); }
        return _pdata1;
    }
    protected ConditionValue getCValuePdata1() { return getPdata1(); }
    
    public BsTConnectorCQ addOrderBy_Pdata1_Asc() { regOBA("PDATA1"); return this; }
    public BsTConnectorCQ addOrderBy_Pdata1_Desc() { regOBD("PDATA1"); return this; }

    protected ConditionValue _pdata2;
    public ConditionValue getPdata2() {
        if (_pdata2 == null) { _pdata2 = new ConditionValue(); }
        return _pdata2;
    }
    protected ConditionValue getCValuePdata2() { return getPdata2(); }
    
    public BsTConnectorCQ addOrderBy_Pdata2_Asc() { regOBA("PDATA2"); return this; }
    public BsTConnectorCQ addOrderBy_Pdata2_Desc() { regOBD("PDATA2"); return this; }

    protected ConditionValue _pdata3;
    public ConditionValue getPdata3() {
        if (_pdata3 == null) { _pdata3 = new ConditionValue(); }
        return _pdata3;
    }
    protected ConditionValue getCValuePdata3() { return getPdata3(); }
    
    public BsTConnectorCQ addOrderBy_Pdata3_Asc() { regOBA("PDATA3"); return this; }
    public BsTConnectorCQ addOrderBy_Pdata3_Desc() { regOBD("PDATA3"); return this; }

    protected ConditionValue _pdata4;
    public ConditionValue getPdata4() {
        if (_pdata4 == null) { _pdata4 = new ConditionValue(); }
        return _pdata4;
    }
    protected ConditionValue getCValuePdata4() { return getPdata4(); }
    
    public BsTConnectorCQ addOrderBy_Pdata4_Asc() { regOBA("PDATA4"); return this; }
    public BsTConnectorCQ addOrderBy_Pdata4_Desc() { regOBD("PDATA4"); return this; }

    protected ConditionValue _pdata5;
    public ConditionValue getPdata5() {
        if (_pdata5 == null) { _pdata5 = new ConditionValue(); }
        return _pdata5;
    }
    protected ConditionValue getCValuePdata5() { return getPdata5(); }
    
    public BsTConnectorCQ addOrderBy_Pdata5_Asc() { regOBA("PDATA5"); return this; }
    public BsTConnectorCQ addOrderBy_Pdata5_Desc() { regOBD("PDATA5"); return this; }

    protected ConditionValue _diagramid;
    public ConditionValue getDiagramid() {
        if (_diagramid == null) { _diagramid = new ConditionValue(); }
        return _diagramid;
    }
    protected ConditionValue getCValueDiagramid() { return getDiagramid(); }
          
    public BsTConnectorCQ addOrderBy_Diagramid_Asc() { regOBA("DiagramID"); return this; }
    public BsTConnectorCQ addOrderBy_Diagramid_Desc() { regOBD("DiagramID"); return this; }

    protected ConditionValue _eaGuid;
    public ConditionValue getEaGuid() {
        if (_eaGuid == null) { _eaGuid = new ConditionValue(); }
        return _eaGuid;
    }
    protected ConditionValue getCValueEaGuid() { return getEaGuid(); }
    
    public BsTConnectorCQ addOrderBy_EaGuid_Asc() { regOBA("ea_guid"); return this; }
    public BsTConnectorCQ addOrderBy_EaGuid_Desc() { regOBD("ea_guid"); return this; }

    protected ConditionValue _sourceconstraint;
    public ConditionValue getSourceconstraint() {
        if (_sourceconstraint == null) { _sourceconstraint = new ConditionValue(); }
        return _sourceconstraint;
    }
    protected ConditionValue getCValueSourceconstraint() { return getSourceconstraint(); }
    
    public BsTConnectorCQ addOrderBy_Sourceconstraint_Asc() { regOBA("SourceConstraint"); return this; }
    public BsTConnectorCQ addOrderBy_Sourceconstraint_Desc() { regOBD("SourceConstraint"); return this; }

    protected ConditionValue _destconstraint;
    public ConditionValue getDestconstraint() {
        if (_destconstraint == null) { _destconstraint = new ConditionValue(); }
        return _destconstraint;
    }
    protected ConditionValue getCValueDestconstraint() { return getDestconstraint(); }
    
    public BsTConnectorCQ addOrderBy_Destconstraint_Asc() { regOBA("DestConstraint"); return this; }
    public BsTConnectorCQ addOrderBy_Destconstraint_Desc() { regOBD("DestConstraint"); return this; }

    protected ConditionValue _sourceisnavigable;
    public ConditionValue getSourceisnavigable() {
        if (_sourceisnavigable == null) { _sourceisnavigable = new ConditionValue(); }
        return _sourceisnavigable;
    }
    protected ConditionValue getCValueSourceisnavigable() { return getSourceisnavigable(); }
    
    public BsTConnectorCQ addOrderBy_Sourceisnavigable_Asc() { regOBA("SourceIsNavigable"); return this; }
    public BsTConnectorCQ addOrderBy_Sourceisnavigable_Desc() { regOBD("SourceIsNavigable"); return this; }

    protected ConditionValue _destisnavigable;
    public ConditionValue getDestisnavigable() {
        if (_destisnavigable == null) { _destisnavigable = new ConditionValue(); }
        return _destisnavigable;
    }
    protected ConditionValue getCValueDestisnavigable() { return getDestisnavigable(); }
    
    public BsTConnectorCQ addOrderBy_Destisnavigable_Asc() { regOBA("DestIsNavigable"); return this; }
    public BsTConnectorCQ addOrderBy_Destisnavigable_Desc() { regOBD("DestIsNavigable"); return this; }

    protected ConditionValue _isroot;
    public ConditionValue getIsroot() {
        if (_isroot == null) { _isroot = new ConditionValue(); }
        return _isroot;
    }
    protected ConditionValue getCValueIsroot() { return getIsroot(); }
    
    public BsTConnectorCQ addOrderBy_Isroot_Asc() { regOBA("IsRoot"); return this; }
    public BsTConnectorCQ addOrderBy_Isroot_Desc() { regOBD("IsRoot"); return this; }

    protected ConditionValue _isleaf;
    public ConditionValue getIsleaf() {
        if (_isleaf == null) { _isleaf = new ConditionValue(); }
        return _isleaf;
    }
    protected ConditionValue getCValueIsleaf() { return getIsleaf(); }
    
    public BsTConnectorCQ addOrderBy_Isleaf_Asc() { regOBA("IsLeaf"); return this; }
    public BsTConnectorCQ addOrderBy_Isleaf_Desc() { regOBD("IsLeaf"); return this; }

    protected ConditionValue _isspec;
    public ConditionValue getIsspec() {
        if (_isspec == null) { _isspec = new ConditionValue(); }
        return _isspec;
    }
    protected ConditionValue getCValueIsspec() { return getIsspec(); }
    
    public BsTConnectorCQ addOrderBy_Isspec_Asc() { regOBA("IsSpec"); return this; }
    public BsTConnectorCQ addOrderBy_Isspec_Desc() { regOBD("IsSpec"); return this; }

    protected ConditionValue _sourcechangeable;
    public ConditionValue getSourcechangeable() {
        if (_sourcechangeable == null) { _sourcechangeable = new ConditionValue(); }
        return _sourcechangeable;
    }
    protected ConditionValue getCValueSourcechangeable() { return getSourcechangeable(); }
    
    public BsTConnectorCQ addOrderBy_Sourcechangeable_Asc() { regOBA("SourceChangeable"); return this; }
    public BsTConnectorCQ addOrderBy_Sourcechangeable_Desc() { regOBD("SourceChangeable"); return this; }

    protected ConditionValue _destchangeable;
    public ConditionValue getDestchangeable() {
        if (_destchangeable == null) { _destchangeable = new ConditionValue(); }
        return _destchangeable;
    }
    protected ConditionValue getCValueDestchangeable() { return getDestchangeable(); }
    
    public BsTConnectorCQ addOrderBy_Destchangeable_Asc() { regOBA("DestChangeable"); return this; }
    public BsTConnectorCQ addOrderBy_Destchangeable_Desc() { regOBD("DestChangeable"); return this; }

    protected ConditionValue _sourcets;
    public ConditionValue getSourcets() {
        if (_sourcets == null) { _sourcets = new ConditionValue(); }
        return _sourcets;
    }
    protected ConditionValue getCValueSourcets() { return getSourcets(); }
    
    public BsTConnectorCQ addOrderBy_Sourcets_Asc() { regOBA("SourceTS"); return this; }
    public BsTConnectorCQ addOrderBy_Sourcets_Desc() { regOBD("SourceTS"); return this; }

    protected ConditionValue _destts;
    public ConditionValue getDestts() {
        if (_destts == null) { _destts = new ConditionValue(); }
        return _destts;
    }
    protected ConditionValue getCValueDestts() { return getDestts(); }
    
    public BsTConnectorCQ addOrderBy_Destts_Asc() { regOBA("DestTS"); return this; }
    public BsTConnectorCQ addOrderBy_Destts_Desc() { regOBD("DestTS"); return this; }

    protected ConditionValue _stateflags;
    public ConditionValue getStateflags() {
        if (_stateflags == null) { _stateflags = new ConditionValue(); }
        return _stateflags;
    }
    protected ConditionValue getCValueStateflags() { return getStateflags(); }
    
    public BsTConnectorCQ addOrderBy_Stateflags_Asc() { regOBA("StateFlags"); return this; }
    public BsTConnectorCQ addOrderBy_Stateflags_Desc() { regOBD("StateFlags"); return this; }

    protected ConditionValue _actionflags;
    public ConditionValue getActionflags() {
        if (_actionflags == null) { _actionflags = new ConditionValue(); }
        return _actionflags;
    }
    protected ConditionValue getCValueActionflags() { return getActionflags(); }
    
    public BsTConnectorCQ addOrderBy_Actionflags_Asc() { regOBA("ActionFlags"); return this; }
    public BsTConnectorCQ addOrderBy_Actionflags_Desc() { regOBD("ActionFlags"); return this; }

    protected ConditionValue _issignal;
    public ConditionValue getIssignal() {
        if (_issignal == null) { _issignal = new ConditionValue(); }
        return _issignal;
    }
    protected ConditionValue getCValueIssignal() { return getIssignal(); }
    
    public BsTConnectorCQ addOrderBy_Issignal_Asc() { regOBA("IsSignal"); return this; }
    public BsTConnectorCQ addOrderBy_Issignal_Desc() { regOBD("IsSignal"); return this; }

    protected ConditionValue _isstimulus;
    public ConditionValue getIsstimulus() {
        if (_isstimulus == null) { _isstimulus = new ConditionValue(); }
        return _isstimulus;
    }
    protected ConditionValue getCValueIsstimulus() { return getIsstimulus(); }
    
    public BsTConnectorCQ addOrderBy_Isstimulus_Asc() { regOBA("IsStimulus"); return this; }
    public BsTConnectorCQ addOrderBy_Isstimulus_Desc() { regOBD("IsStimulus"); return this; }

    protected ConditionValue _dispatchaction;
    public ConditionValue getDispatchaction() {
        if (_dispatchaction == null) { _dispatchaction = new ConditionValue(); }
        return _dispatchaction;
    }
    protected ConditionValue getCValueDispatchaction() { return getDispatchaction(); }
    
    public BsTConnectorCQ addOrderBy_Dispatchaction_Asc() { regOBA("DispatchAction"); return this; }
    public BsTConnectorCQ addOrderBy_Dispatchaction_Desc() { regOBD("DispatchAction"); return this; }

    protected ConditionValue _target2;
    public ConditionValue getTarget2() {
        if (_target2 == null) { _target2 = new ConditionValue(); }
        return _target2;
    }
    protected ConditionValue getCValueTarget2() { return getTarget2(); }
          
    public BsTConnectorCQ addOrderBy_Target2_Asc() { regOBA("Target2"); return this; }
    public BsTConnectorCQ addOrderBy_Target2_Desc() { regOBD("Target2"); return this; }

    protected ConditionValue _styleex;
    public ConditionValue getStyleex() {
        if (_styleex == null) { _styleex = new ConditionValue(); }
        return _styleex;
    }
    protected ConditionValue getCValueStyleex() { return getStyleex(); }
    
    public BsTConnectorCQ addOrderBy_Styleex_Asc() { regOBA("StyleEx"); return this; }
    public BsTConnectorCQ addOrderBy_Styleex_Desc() { regOBD("StyleEx"); return this; }

    protected ConditionValue _sourcestereotype;
    public ConditionValue getSourcestereotype() {
        if (_sourcestereotype == null) { _sourcestereotype = new ConditionValue(); }
        return _sourcestereotype;
    }
    protected ConditionValue getCValueSourcestereotype() { return getSourcestereotype(); }
    
    public BsTConnectorCQ addOrderBy_Sourcestereotype_Asc() { regOBA("SourceStereotype"); return this; }
    public BsTConnectorCQ addOrderBy_Sourcestereotype_Desc() { regOBD("SourceStereotype"); return this; }

    protected ConditionValue _deststereotype;
    public ConditionValue getDeststereotype() {
        if (_deststereotype == null) { _deststereotype = new ConditionValue(); }
        return _deststereotype;
    }
    protected ConditionValue getCValueDeststereotype() { return getDeststereotype(); }
    
    public BsTConnectorCQ addOrderBy_Deststereotype_Asc() { regOBA("DestStereotype"); return this; }
    public BsTConnectorCQ addOrderBy_Deststereotype_Desc() { regOBD("DestStereotype"); return this; }

    protected ConditionValue _sourcestyle;
    public ConditionValue getSourcestyle() {
        if (_sourcestyle == null) { _sourcestyle = new ConditionValue(); }
        return _sourcestyle;
    }
    protected ConditionValue getCValueSourcestyle() { return getSourcestyle(); }
    
    public BsTConnectorCQ addOrderBy_Sourcestyle_Asc() { regOBA("SourceStyle"); return this; }
    public BsTConnectorCQ addOrderBy_Sourcestyle_Desc() { regOBD("SourceStyle"); return this; }

    protected ConditionValue _deststyle;
    public ConditionValue getDeststyle() {
        if (_deststyle == null) { _deststyle = new ConditionValue(); }
        return _deststyle;
    }
    protected ConditionValue getCValueDeststyle() { return getDeststyle(); }
    
    public BsTConnectorCQ addOrderBy_Deststyle_Asc() { regOBA("DestStyle"); return this; }
    public BsTConnectorCQ addOrderBy_Deststyle_Desc() { regOBD("DestStyle"); return this; }

    protected ConditionValue _eventflags;
    public ConditionValue getEventflags() {
        if (_eventflags == null) { _eventflags = new ConditionValue(); }
        return _eventflags;
    }
    protected ConditionValue getCValueEventflags() { return getEventflags(); }
    
    public BsTConnectorCQ addOrderBy_Eventflags_Asc() { regOBA("EventFlags"); return this; }
    public BsTConnectorCQ addOrderBy_Eventflags_Desc() { regOBD("EventFlags"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTConnectorCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTConnectorCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        TConnectorCQ baseQuery = (TConnectorCQ)baseQueryAsSuper;
        TConnectorCQ unionQuery = (TConnectorCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryTOperationBySourcerole()) {
            unionQuery.queryTOperationBySourcerole().reflectRelationOnUnionQuery(baseQuery.queryTOperationBySourcerole(), unionQuery.queryTOperationBySourcerole());
        }
        if (baseQuery.hasConditionQueryTOperationByDestrole()) {
            unionQuery.queryTOperationByDestrole().reflectRelationOnUnionQuery(baseQuery.queryTOperationByDestrole(), unionQuery.queryTOperationByDestrole());
        }
        if (baseQuery.hasConditionQueryTObjectByStartObjectId()) {
            unionQuery.queryTObjectByStartObjectId().reflectRelationOnUnionQuery(baseQuery.queryTObjectByStartObjectId(), unionQuery.queryTObjectByStartObjectId());
        }
        if (baseQuery.hasConditionQueryTObjectByEndObjectId()) {
            unionQuery.queryTObjectByEndObjectId().reflectRelationOnUnionQuery(baseQuery.queryTObjectByEndObjectId(), unionQuery.queryTObjectByEndObjectId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    
    public TOperationCQ queryTOperationBySourcerole() {
        return getConditionQueryTOperationBySourcerole();
    }
    protected TOperationCQ _conditionQueryTOperationBySourcerole;
    public TOperationCQ getConditionQueryTOperationBySourcerole() {
        if (_conditionQueryTOperationBySourcerole == null) {
            _conditionQueryTOperationBySourcerole = createQueryTOperationBySourcerole();
            setupOuterJoin_TOperationBySourcerole();
        }
        return _conditionQueryTOperationBySourcerole;
    }
    protected void setupOuterJoin_TOperationBySourcerole() {
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("SourceRole"), getConditionQueryTOperationBySourcerole().getRealColumnName("Name"));
        registerOuterJoin(getConditionQueryTOperationBySourcerole(), joinOnMap);
    }
    protected TOperationCQ createQueryTOperationBySourcerole() {
        String nrp = resolveNextRelationPath("t_connector", "tOperationBySourcerole");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        TOperationCQ cq = new TOperationCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("tOperationBySourcerole"); cq.xsetRelationPath(nrp); return cq;
    }
    public boolean hasConditionQueryTOperationBySourcerole() {
        return _conditionQueryTOperationBySourcerole != null;
    }
    
    public TOperationCQ queryTOperationByDestrole() {
        return getConditionQueryTOperationByDestrole();
    }
    protected TOperationCQ _conditionQueryTOperationByDestrole;
    public TOperationCQ getConditionQueryTOperationByDestrole() {
        if (_conditionQueryTOperationByDestrole == null) {
            _conditionQueryTOperationByDestrole = createQueryTOperationByDestrole();
            setupOuterJoin_TOperationByDestrole();
        }
        return _conditionQueryTOperationByDestrole;
    }
    protected void setupOuterJoin_TOperationByDestrole() {
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("DestRole"), getConditionQueryTOperationByDestrole().getRealColumnName("Name"));
        registerOuterJoin(getConditionQueryTOperationByDestrole(), joinOnMap);
    }
    protected TOperationCQ createQueryTOperationByDestrole() {
        String nrp = resolveNextRelationPath("t_connector", "tOperationByDestrole");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        TOperationCQ cq = new TOperationCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("tOperationByDestrole"); cq.xsetRelationPath(nrp); return cq;
    }
    public boolean hasConditionQueryTOperationByDestrole() {
        return _conditionQueryTOperationByDestrole != null;
    }
    
    public TObjectCQ queryTObjectByStartObjectId() {
        return getConditionQueryTObjectByStartObjectId();
    }
    protected TObjectCQ _conditionQueryTObjectByStartObjectId;
    public TObjectCQ getConditionQueryTObjectByStartObjectId() {
        if (_conditionQueryTObjectByStartObjectId == null) {
            _conditionQueryTObjectByStartObjectId = createQueryTObjectByStartObjectId();
            setupOuterJoin_TObjectByStartObjectId();
        }
        return _conditionQueryTObjectByStartObjectId;
    }
    protected void setupOuterJoin_TObjectByStartObjectId() {
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("Start_Object_ID"), getConditionQueryTObjectByStartObjectId().getRealColumnName("Object_ID"));
        registerOuterJoin(getConditionQueryTObjectByStartObjectId(), joinOnMap);
    }
    protected TObjectCQ createQueryTObjectByStartObjectId() {
        String nrp = resolveNextRelationPath("t_connector", "tObjectByStartObjectId");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        TObjectCQ cq = new TObjectCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("tObjectByStartObjectId"); cq.xsetRelationPath(nrp); return cq;
    }
    public boolean hasConditionQueryTObjectByStartObjectId() {
        return _conditionQueryTObjectByStartObjectId != null;
    }
    
    public TObjectCQ queryTObjectByEndObjectId() {
        return getConditionQueryTObjectByEndObjectId();
    }
    protected TObjectCQ _conditionQueryTObjectByEndObjectId;
    public TObjectCQ getConditionQueryTObjectByEndObjectId() {
        if (_conditionQueryTObjectByEndObjectId == null) {
            _conditionQueryTObjectByEndObjectId = createQueryTObjectByEndObjectId();
            setupOuterJoin_TObjectByEndObjectId();
        }
        return _conditionQueryTObjectByEndObjectId;
    }
    protected void setupOuterJoin_TObjectByEndObjectId() {
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("End_Object_ID"), getConditionQueryTObjectByEndObjectId().getRealColumnName("Object_ID"));
        registerOuterJoin(getConditionQueryTObjectByEndObjectId(), joinOnMap);
    }
    protected TObjectCQ createQueryTObjectByEndObjectId() {
        String nrp = resolveNextRelationPath("t_connector", "tObjectByEndObjectId");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        TObjectCQ cq = new TObjectCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("tObjectByEndObjectId"); cq.xsetRelationPath(nrp); return cq;
    }
    public boolean hasConditionQueryTObjectByEndObjectId() {
        return _conditionQueryTObjectByEndObjectId != null;
    }


    protected String getConditionQueryClassNameInternally() { return TConnectorCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
