package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TConnector;

/**
 * The DB meta of t_connector. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TConnectorDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TConnectorDbm _instance = new TConnectorDbm();
    private TConnectorDbm() {}
    public static TConnectorDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_connector"; }
    public String getTablePropertyName() { return "TConnector"; }
    public String getTableSqlName() { return "t_connector"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnConnectorId = cci("Connector_ID", null, "connectorId", java.lang.Integer.class, true, false, null, null);
    protected ColumnInfo _columnName = cci("Name", null, "name", String.class, false, false, 255, 0);
    protected ColumnInfo _columnDirection = cci("Direction", null, "direction", String.class, false, false, 50, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnConnectorType = cci("Connector_Type", null, "connectorType", String.class, false, false, 50, 0);
    protected ColumnInfo _columnSubtype = cci("SubType", null, "subtype", String.class, false, false, 50, 0);
    protected ColumnInfo _columnSourcecard = cci("SourceCard", null, "sourcecard", String.class, false, false, 50, 0);
    protected ColumnInfo _columnSourceaccess = cci("SourceAccess", null, "sourceaccess", String.class, false, false, 50, 0);
    protected ColumnInfo _columnSourceelement = cci("SourceElement", null, "sourceelement", String.class, false, false, 50, 0);
    protected ColumnInfo _columnDestcard = cci("DestCard", null, "destcard", String.class, false, false, 50, 0);
    protected ColumnInfo _columnDestaccess = cci("DestAccess", null, "destaccess", String.class, false, false, 50, 0);
    protected ColumnInfo _columnDestelement = cci("DestElement", null, "destelement", String.class, false, false, 50, 0);
    protected ColumnInfo _columnSourcerole = cci("SourceRole", null, "sourcerole", String.class, false, false, 255, 0);
    protected ColumnInfo _columnSourceroletype = cci("SourceRoleType", null, "sourceroletype", String.class, false, false, 50, 0);
    protected ColumnInfo _columnSourcerolenote = cci("SourceRoleNote", null, "sourcerolenote", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnSourcecontainment = cci("SourceContainment", null, "sourcecontainment", String.class, false, false, 50, 0);
    protected ColumnInfo _columnSourceisaggregate = cci("SourceIsAggregate", null, "sourceisaggregate", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnSourceisordered = cci("SourceIsOrdered", null, "sourceisordered", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnSourcequalifier = cci("SourceQualifier", null, "sourcequalifier", String.class, false, false, 50, 0);
    protected ColumnInfo _columnDestrole = cci("DestRole", null, "destrole", String.class, false, false, 255, 0);
    protected ColumnInfo _columnDestroletype = cci("DestRoleType", null, "destroletype", String.class, false, false, 50, 0);
    protected ColumnInfo _columnDestrolenote = cci("DestRoleNote", null, "destrolenote", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnDestcontainment = cci("DestContainment", null, "destcontainment", String.class, false, false, 50, 0);
    protected ColumnInfo _columnDestisaggregate = cci("DestIsAggregate", null, "destisaggregate", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnDestisordered = cci("DestIsOrdered", null, "destisordered", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnDestqualifier = cci("DestQualifier", null, "destqualifier", String.class, false, false, 50, 0);
    protected ColumnInfo _columnStartObjectId = cci("Start_Object_ID", null, "startObjectId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnEndObjectId = cci("End_Object_ID", null, "endObjectId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnTopStartLabel = cci("Top_Start_Label", null, "topStartLabel", String.class, false, false, 50, 0);
    protected ColumnInfo _columnTopMidLabel = cci("Top_Mid_Label", null, "topMidLabel", String.class, false, false, 50, 0);
    protected ColumnInfo _columnTopEndLabel = cci("Top_End_Label", null, "topEndLabel", String.class, false, false, 50, 0);
    protected ColumnInfo _columnBtmStartLabel = cci("Btm_Start_Label", null, "btmStartLabel", String.class, false, false, 50, 0);
    protected ColumnInfo _columnBtmMidLabel = cci("Btm_Mid_Label", null, "btmMidLabel", String.class, false, false, 50, 0);
    protected ColumnInfo _columnBtmEndLabel = cci("Btm_End_Label", null, "btmEndLabel", String.class, false, false, 50, 0);
    protected ColumnInfo _columnStartEdge = cci("Start_Edge", null, "startEdge", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnEndEdge = cci("End_Edge", null, "endEdge", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnPtstartx = cci("PtStartX", null, "ptstartx", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnPtstarty = cci("PtStartY", null, "ptstarty", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnPtendx = cci("PtEndX", null, "ptendx", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnPtendy = cci("PtEndY", null, "ptendy", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnSeqno = cci("SeqNo", null, "seqno", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnHeadstyle = cci("HeadStyle", null, "headstyle", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnLinestyle = cci("LineStyle", null, "linestyle", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnRoutestyle = cci("RouteStyle", null, "routestyle", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnIsbold = cci("IsBold", null, "isbold", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnLinecolor = cci("LineColor", null, "linecolor", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnStereotype = cci("Stereotype", null, "stereotype", String.class, false, false, 50, 0);
    protected ColumnInfo _columnVirtualinheritance = cci("VirtualInheritance", null, "virtualinheritance", String.class, false, false, 1, 0);
    protected ColumnInfo _columnLinkaccess = cci("LinkAccess", null, "linkaccess", String.class, false, false, 50, 0);
    protected ColumnInfo _columnPdata1 = cci("PDATA1", null, "pdata1", String.class, false, false, 255, 0);
    protected ColumnInfo _columnPdata2 = cci("PDATA2", null, "pdata2", String.class, false, false, 255, 0);
    protected ColumnInfo _columnPdata3 = cci("PDATA3", null, "pdata3", String.class, false, false, 255, 0);
    protected ColumnInfo _columnPdata4 = cci("PDATA4", null, "pdata4", String.class, false, false, 255, 0);
    protected ColumnInfo _columnPdata5 = cci("PDATA5", null, "pdata5", String.class, false, false, 255, 0);
    protected ColumnInfo _columnDiagramid = cci("DiagramID", null, "diagramid", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnEaGuid = cci("ea_guid", null, "eaGuid", String.class, false, false, 40, 0);
    protected ColumnInfo _columnSourceconstraint = cci("SourceConstraint", null, "sourceconstraint", String.class, false, false, 255, 0);
    protected ColumnInfo _columnDestconstraint = cci("DestConstraint", null, "destconstraint", String.class, false, false, 255, 0);
    protected ColumnInfo _columnSourceisnavigable = cci("SourceIsNavigable", null, "sourceisnavigable", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnDestisnavigable = cci("DestIsNavigable", null, "destisnavigable", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnIsroot = cci("IsRoot", null, "isroot", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnIsleaf = cci("IsLeaf", null, "isleaf", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnIsspec = cci("IsSpec", null, "isspec", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnSourcechangeable = cci("SourceChangeable", null, "sourcechangeable", String.class, false, false, 12, 0);
    protected ColumnInfo _columnDestchangeable = cci("DestChangeable", null, "destchangeable", String.class, false, false, 12, 0);
    protected ColumnInfo _columnSourcets = cci("SourceTS", null, "sourcets", String.class, false, false, 12, 0);
    protected ColumnInfo _columnDestts = cci("DestTS", null, "destts", String.class, false, false, 12, 0);
    protected ColumnInfo _columnStateflags = cci("StateFlags", null, "stateflags", String.class, false, false, 255, 0);
    protected ColumnInfo _columnActionflags = cci("ActionFlags", null, "actionflags", String.class, false, false, 255, 0);
    protected ColumnInfo _columnIssignal = cci("IsSignal", null, "issignal", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnIsstimulus = cci("IsStimulus", null, "isstimulus", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnDispatchaction = cci("DispatchAction", null, "dispatchaction", String.class, false, false, 255, 0);
    protected ColumnInfo _columnTarget2 = cci("Target2", null, "target2", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnStyleex = cci("StyleEx", null, "styleex", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnSourcestereotype = cci("SourceStereotype", null, "sourcestereotype", String.class, false, false, 255, 0);
    protected ColumnInfo _columnDeststereotype = cci("DestStereotype", null, "deststereotype", String.class, false, false, 255, 0);
    protected ColumnInfo _columnSourcestyle = cci("SourceStyle", null, "sourcestyle", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnDeststyle = cci("DestStyle", null, "deststyle", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnEventflags = cci("EventFlags", null, "eventflags", String.class, false, false, 255, 0);

    public ColumnInfo columnConnectorId() { return _columnConnectorId; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnDirection() { return _columnDirection; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnConnectorType() { return _columnConnectorType; }
    public ColumnInfo columnSubtype() { return _columnSubtype; }
    public ColumnInfo columnSourcecard() { return _columnSourcecard; }
    public ColumnInfo columnSourceaccess() { return _columnSourceaccess; }
    public ColumnInfo columnSourceelement() { return _columnSourceelement; }
    public ColumnInfo columnDestcard() { return _columnDestcard; }
    public ColumnInfo columnDestaccess() { return _columnDestaccess; }
    public ColumnInfo columnDestelement() { return _columnDestelement; }
    public ColumnInfo columnSourcerole() { return _columnSourcerole; }
    public ColumnInfo columnSourceroletype() { return _columnSourceroletype; }
    public ColumnInfo columnSourcerolenote() { return _columnSourcerolenote; }
    public ColumnInfo columnSourcecontainment() { return _columnSourcecontainment; }
    public ColumnInfo columnSourceisaggregate() { return _columnSourceisaggregate; }
    public ColumnInfo columnSourceisordered() { return _columnSourceisordered; }
    public ColumnInfo columnSourcequalifier() { return _columnSourcequalifier; }
    public ColumnInfo columnDestrole() { return _columnDestrole; }
    public ColumnInfo columnDestroletype() { return _columnDestroletype; }
    public ColumnInfo columnDestrolenote() { return _columnDestrolenote; }
    public ColumnInfo columnDestcontainment() { return _columnDestcontainment; }
    public ColumnInfo columnDestisaggregate() { return _columnDestisaggregate; }
    public ColumnInfo columnDestisordered() { return _columnDestisordered; }
    public ColumnInfo columnDestqualifier() { return _columnDestqualifier; }
    public ColumnInfo columnStartObjectId() { return _columnStartObjectId; }
    public ColumnInfo columnEndObjectId() { return _columnEndObjectId; }
    public ColumnInfo columnTopStartLabel() { return _columnTopStartLabel; }
    public ColumnInfo columnTopMidLabel() { return _columnTopMidLabel; }
    public ColumnInfo columnTopEndLabel() { return _columnTopEndLabel; }
    public ColumnInfo columnBtmStartLabel() { return _columnBtmStartLabel; }
    public ColumnInfo columnBtmMidLabel() { return _columnBtmMidLabel; }
    public ColumnInfo columnBtmEndLabel() { return _columnBtmEndLabel; }
    public ColumnInfo columnStartEdge() { return _columnStartEdge; }
    public ColumnInfo columnEndEdge() { return _columnEndEdge; }
    public ColumnInfo columnPtstartx() { return _columnPtstartx; }
    public ColumnInfo columnPtstarty() { return _columnPtstarty; }
    public ColumnInfo columnPtendx() { return _columnPtendx; }
    public ColumnInfo columnPtendy() { return _columnPtendy; }
    public ColumnInfo columnSeqno() { return _columnSeqno; }
    public ColumnInfo columnHeadstyle() { return _columnHeadstyle; }
    public ColumnInfo columnLinestyle() { return _columnLinestyle; }
    public ColumnInfo columnRoutestyle() { return _columnRoutestyle; }
    public ColumnInfo columnIsbold() { return _columnIsbold; }
    public ColumnInfo columnLinecolor() { return _columnLinecolor; }
    public ColumnInfo columnStereotype() { return _columnStereotype; }
    public ColumnInfo columnVirtualinheritance() { return _columnVirtualinheritance; }
    public ColumnInfo columnLinkaccess() { return _columnLinkaccess; }
    public ColumnInfo columnPdata1() { return _columnPdata1; }
    public ColumnInfo columnPdata2() { return _columnPdata2; }
    public ColumnInfo columnPdata3() { return _columnPdata3; }
    public ColumnInfo columnPdata4() { return _columnPdata4; }
    public ColumnInfo columnPdata5() { return _columnPdata5; }
    public ColumnInfo columnDiagramid() { return _columnDiagramid; }
    public ColumnInfo columnEaGuid() { return _columnEaGuid; }
    public ColumnInfo columnSourceconstraint() { return _columnSourceconstraint; }
    public ColumnInfo columnDestconstraint() { return _columnDestconstraint; }
    public ColumnInfo columnSourceisnavigable() { return _columnSourceisnavigable; }
    public ColumnInfo columnDestisnavigable() { return _columnDestisnavigable; }
    public ColumnInfo columnIsroot() { return _columnIsroot; }
    public ColumnInfo columnIsleaf() { return _columnIsleaf; }
    public ColumnInfo columnIsspec() { return _columnIsspec; }
    public ColumnInfo columnSourcechangeable() { return _columnSourcechangeable; }
    public ColumnInfo columnDestchangeable() { return _columnDestchangeable; }
    public ColumnInfo columnSourcets() { return _columnSourcets; }
    public ColumnInfo columnDestts() { return _columnDestts; }
    public ColumnInfo columnStateflags() { return _columnStateflags; }
    public ColumnInfo columnActionflags() { return _columnActionflags; }
    public ColumnInfo columnIssignal() { return _columnIssignal; }
    public ColumnInfo columnIsstimulus() { return _columnIsstimulus; }
    public ColumnInfo columnDispatchaction() { return _columnDispatchaction; }
    public ColumnInfo columnTarget2() { return _columnTarget2; }
    public ColumnInfo columnStyleex() { return _columnStyleex; }
    public ColumnInfo columnSourcestereotype() { return _columnSourcestereotype; }
    public ColumnInfo columnDeststereotype() { return _columnDeststereotype; }
    public ColumnInfo columnSourcestyle() { return _columnSourcestyle; }
    public ColumnInfo columnDeststyle() { return _columnDeststyle; }
    public ColumnInfo columnEventflags() { return _columnEventflags; }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnConnectorId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignTOperationBySourcerole() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSourcerole(), TOperationDbm.getInstance().columnName());
        return cfi("TOperationBySourcerole", this, TOperationDbm.getInstance(), map, 0, false);
    }
    public ForeignInfo foreignTOperationByDestrole() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnDestrole(), TOperationDbm.getInstance().columnName());
        return cfi("TOperationByDestrole", this, TOperationDbm.getInstance(), map, 1, false);
    }
    public ForeignInfo foreignTObjectByStartObjectId() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnStartObjectId(), TObjectDbm.getInstance().columnObjectId());
        return cfi("TObjectByStartObjectId", this, TObjectDbm.getInstance(), map, 2, false);
    }
    public ForeignInfo foreignTObjectByEndObjectId() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnEndObjectId(), TObjectDbm.getInstance().columnObjectId());
        return cfi("TObjectByEndObjectId", this, TObjectDbm.getInstance(), map, 3, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TConnector"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TConnectorCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TConnectorDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TConnectorBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TConnector> getEntityType() { return TConnector.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TConnector newMyEntity() { return new TConnector(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TConnector)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TConnector)entity, columnValueMap, _epsMap); }
    public void acceptColumnValueMapString(Entity entity, String columnValueMapString)
    { MapStringUtil.acceptColumnValueMapString(columnValueMapString, entity); }

    // -----------------------------------------------------
    //                                               Extract
    //                                               -------
    public String extractPrimaryKeyMapString(Entity entity) { return MapStringUtil.extractPrimaryKeyMapString(entity); }
    public String extractPrimaryKeyMapString(Entity entity, String startBrace, String endBrace, String delimiter, String equal)
    { return doExtractPrimaryKeyMapString(entity, startBrace, endBrace, delimiter, equal); }
    public String extractColumnValueMapString(Entity entity) { return MapStringUtil.extractColumnValueMapString(entity); }
    public String extractColumnValueMapString(Entity entity, String startBrace, String endBrace, String delimiter, String equal)
    { return doExtractColumnValueMapString(entity, startBrace, endBrace, delimiter, equal); }

    // -----------------------------------------------------
    //                                               Convert
    //                                               -------
    public List<Object> convertToColumnValueList(Entity entity) { return newArrayList(convertToColumnValueMap(entity).values()); }
    public Map<String, Object> convertToColumnValueMap(Entity entity) { return doConvertToColumnValueMap(entity); }
    public List<String> convertToColumnStringValueList(Entity entity) { return newArrayList(convertToColumnStringValueMap(entity).values()); }
    public Map<String, String> convertToColumnStringValueMap(Entity entity) { return doConvertToColumnStringValueMap(entity); }

    // ===================================================================================
    //                                                               Entity Property Setup
    //                                                               =====================
    // It's very INTERNAL!
    protected Map<String, Eps<TConnector>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsConnectorId(), columnConnectorId());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsDirection(), columnDirection());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsConnectorType(), columnConnectorType());
        setupEps(_epsMap, new EpsSubtype(), columnSubtype());
        setupEps(_epsMap, new EpsSourcecard(), columnSourcecard());
        setupEps(_epsMap, new EpsSourceaccess(), columnSourceaccess());
        setupEps(_epsMap, new EpsSourceelement(), columnSourceelement());
        setupEps(_epsMap, new EpsDestcard(), columnDestcard());
        setupEps(_epsMap, new EpsDestaccess(), columnDestaccess());
        setupEps(_epsMap, new EpsDestelement(), columnDestelement());
        setupEps(_epsMap, new EpsSourcerole(), columnSourcerole());
        setupEps(_epsMap, new EpsSourceroletype(), columnSourceroletype());
        setupEps(_epsMap, new EpsSourcerolenote(), columnSourcerolenote());
        setupEps(_epsMap, new EpsSourcecontainment(), columnSourcecontainment());
        setupEps(_epsMap, new EpsSourceisaggregate(), columnSourceisaggregate());
        setupEps(_epsMap, new EpsSourceisordered(), columnSourceisordered());
        setupEps(_epsMap, new EpsSourcequalifier(), columnSourcequalifier());
        setupEps(_epsMap, new EpsDestrole(), columnDestrole());
        setupEps(_epsMap, new EpsDestroletype(), columnDestroletype());
        setupEps(_epsMap, new EpsDestrolenote(), columnDestrolenote());
        setupEps(_epsMap, new EpsDestcontainment(), columnDestcontainment());
        setupEps(_epsMap, new EpsDestisaggregate(), columnDestisaggregate());
        setupEps(_epsMap, new EpsDestisordered(), columnDestisordered());
        setupEps(_epsMap, new EpsDestqualifier(), columnDestqualifier());
        setupEps(_epsMap, new EpsStartObjectId(), columnStartObjectId());
        setupEps(_epsMap, new EpsEndObjectId(), columnEndObjectId());
        setupEps(_epsMap, new EpsTopStartLabel(), columnTopStartLabel());
        setupEps(_epsMap, new EpsTopMidLabel(), columnTopMidLabel());
        setupEps(_epsMap, new EpsTopEndLabel(), columnTopEndLabel());
        setupEps(_epsMap, new EpsBtmStartLabel(), columnBtmStartLabel());
        setupEps(_epsMap, new EpsBtmMidLabel(), columnBtmMidLabel());
        setupEps(_epsMap, new EpsBtmEndLabel(), columnBtmEndLabel());
        setupEps(_epsMap, new EpsStartEdge(), columnStartEdge());
        setupEps(_epsMap, new EpsEndEdge(), columnEndEdge());
        setupEps(_epsMap, new EpsPtstartx(), columnPtstartx());
        setupEps(_epsMap, new EpsPtstarty(), columnPtstarty());
        setupEps(_epsMap, new EpsPtendx(), columnPtendx());
        setupEps(_epsMap, new EpsPtendy(), columnPtendy());
        setupEps(_epsMap, new EpsSeqno(), columnSeqno());
        setupEps(_epsMap, new EpsHeadstyle(), columnHeadstyle());
        setupEps(_epsMap, new EpsLinestyle(), columnLinestyle());
        setupEps(_epsMap, new EpsRoutestyle(), columnRoutestyle());
        setupEps(_epsMap, new EpsIsbold(), columnIsbold());
        setupEps(_epsMap, new EpsLinecolor(), columnLinecolor());
        setupEps(_epsMap, new EpsStereotype(), columnStereotype());
        setupEps(_epsMap, new EpsVirtualinheritance(), columnVirtualinheritance());
        setupEps(_epsMap, new EpsLinkaccess(), columnLinkaccess());
        setupEps(_epsMap, new EpsPdata1(), columnPdata1());
        setupEps(_epsMap, new EpsPdata2(), columnPdata2());
        setupEps(_epsMap, new EpsPdata3(), columnPdata3());
        setupEps(_epsMap, new EpsPdata4(), columnPdata4());
        setupEps(_epsMap, new EpsPdata5(), columnPdata5());
        setupEps(_epsMap, new EpsDiagramid(), columnDiagramid());
        setupEps(_epsMap, new EpsEaGuid(), columnEaGuid());
        setupEps(_epsMap, new EpsSourceconstraint(), columnSourceconstraint());
        setupEps(_epsMap, new EpsDestconstraint(), columnDestconstraint());
        setupEps(_epsMap, new EpsSourceisnavigable(), columnSourceisnavigable());
        setupEps(_epsMap, new EpsDestisnavigable(), columnDestisnavigable());
        setupEps(_epsMap, new EpsIsroot(), columnIsroot());
        setupEps(_epsMap, new EpsIsleaf(), columnIsleaf());
        setupEps(_epsMap, new EpsIsspec(), columnIsspec());
        setupEps(_epsMap, new EpsSourcechangeable(), columnSourcechangeable());
        setupEps(_epsMap, new EpsDestchangeable(), columnDestchangeable());
        setupEps(_epsMap, new EpsSourcets(), columnSourcets());
        setupEps(_epsMap, new EpsDestts(), columnDestts());
        setupEps(_epsMap, new EpsStateflags(), columnStateflags());
        setupEps(_epsMap, new EpsActionflags(), columnActionflags());
        setupEps(_epsMap, new EpsIssignal(), columnIssignal());
        setupEps(_epsMap, new EpsIsstimulus(), columnIsstimulus());
        setupEps(_epsMap, new EpsDispatchaction(), columnDispatchaction());
        setupEps(_epsMap, new EpsTarget2(), columnTarget2());
        setupEps(_epsMap, new EpsStyleex(), columnStyleex());
        setupEps(_epsMap, new EpsSourcestereotype(), columnSourcestereotype());
        setupEps(_epsMap, new EpsDeststereotype(), columnDeststereotype());
        setupEps(_epsMap, new EpsSourcestyle(), columnSourcestyle());
        setupEps(_epsMap, new EpsDeststyle(), columnDeststyle());
        setupEps(_epsMap, new EpsEventflags(), columnEventflags());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TConnector)entity, value); }

    public static class EpsConnectorId implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setConnectorId((java.lang.Integer)v); } }
    public static class EpsName implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setName((String)v); } }
    public static class EpsDirection implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDirection((String)v); } }
    public static class EpsNotes implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setNotes((String)v); } }
    public static class EpsConnectorType implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setConnectorType((String)v); } }
    public static class EpsSubtype implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSubtype((String)v); } }
    public static class EpsSourcecard implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourcecard((String)v); } }
    public static class EpsSourceaccess implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourceaccess((String)v); } }
    public static class EpsSourceelement implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourceelement((String)v); } }
    public static class EpsDestcard implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestcard((String)v); } }
    public static class EpsDestaccess implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestaccess((String)v); } }
    public static class EpsDestelement implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestelement((String)v); } }
    public static class EpsSourcerole implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourcerole((String)v); } }
    public static class EpsSourceroletype implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourceroletype((String)v); } }
    public static class EpsSourcerolenote implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourcerolenote((String)v); } }
    public static class EpsSourcecontainment implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourcecontainment((String)v); } }
    public static class EpsSourceisaggregate implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourceisaggregate((java.lang.Integer)v); } }
    public static class EpsSourceisordered implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourceisordered((java.lang.Integer)v); } }
    public static class EpsSourcequalifier implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourcequalifier((String)v); } }
    public static class EpsDestrole implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestrole((String)v); } }
    public static class EpsDestroletype implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestroletype((String)v); } }
    public static class EpsDestrolenote implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestrolenote((String)v); } }
    public static class EpsDestcontainment implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestcontainment((String)v); } }
    public static class EpsDestisaggregate implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestisaggregate((java.lang.Integer)v); } }
    public static class EpsDestisordered implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestisordered((java.lang.Integer)v); } }
    public static class EpsDestqualifier implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestqualifier((String)v); } }
    public static class EpsStartObjectId implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setStartObjectId((java.lang.Integer)v); } }
    public static class EpsEndObjectId implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setEndObjectId((java.lang.Integer)v); } }
    public static class EpsTopStartLabel implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setTopStartLabel((String)v); } }
    public static class EpsTopMidLabel implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setTopMidLabel((String)v); } }
    public static class EpsTopEndLabel implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setTopEndLabel((String)v); } }
    public static class EpsBtmStartLabel implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setBtmStartLabel((String)v); } }
    public static class EpsBtmMidLabel implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setBtmMidLabel((String)v); } }
    public static class EpsBtmEndLabel implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setBtmEndLabel((String)v); } }
    public static class EpsStartEdge implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setStartEdge((java.lang.Integer)v); } }
    public static class EpsEndEdge implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setEndEdge((java.lang.Integer)v); } }
    public static class EpsPtstartx implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setPtstartx((java.lang.Integer)v); } }
    public static class EpsPtstarty implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setPtstarty((java.lang.Integer)v); } }
    public static class EpsPtendx implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setPtendx((java.lang.Integer)v); } }
    public static class EpsPtendy implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setPtendy((java.lang.Integer)v); } }
    public static class EpsSeqno implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSeqno((java.lang.Integer)v); } }
    public static class EpsHeadstyle implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setHeadstyle((java.lang.Integer)v); } }
    public static class EpsLinestyle implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setLinestyle((java.lang.Integer)v); } }
    public static class EpsRoutestyle implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setRoutestyle((java.lang.Integer)v); } }
    public static class EpsIsbold implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setIsbold((java.lang.Integer)v); } }
    public static class EpsLinecolor implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setLinecolor((java.lang.Integer)v); } }
    public static class EpsStereotype implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setStereotype((String)v); } }
    public static class EpsVirtualinheritance implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setVirtualinheritance((String)v); } }
    public static class EpsLinkaccess implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setLinkaccess((String)v); } }
    public static class EpsPdata1 implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setPdata1((String)v); } }
    public static class EpsPdata2 implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setPdata2((String)v); } }
    public static class EpsPdata3 implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setPdata3((String)v); } }
    public static class EpsPdata4 implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setPdata4((String)v); } }
    public static class EpsPdata5 implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setPdata5((String)v); } }
    public static class EpsDiagramid implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDiagramid((java.lang.Integer)v); } }
    public static class EpsEaGuid implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setEaGuid((String)v); } }
    public static class EpsSourceconstraint implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourceconstraint((String)v); } }
    public static class EpsDestconstraint implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestconstraint((String)v); } }
    public static class EpsSourceisnavigable implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourceisnavigable((Boolean)v); } }
    public static class EpsDestisnavigable implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestisnavigable((Boolean)v); } }
    public static class EpsIsroot implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setIsroot((Boolean)v); } }
    public static class EpsIsleaf implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setIsleaf((Boolean)v); } }
    public static class EpsIsspec implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setIsspec((Boolean)v); } }
    public static class EpsSourcechangeable implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourcechangeable((String)v); } }
    public static class EpsDestchangeable implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestchangeable((String)v); } }
    public static class EpsSourcets implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourcets((String)v); } }
    public static class EpsDestts implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDestts((String)v); } }
    public static class EpsStateflags implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setStateflags((String)v); } }
    public static class EpsActionflags implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setActionflags((String)v); } }
    public static class EpsIssignal implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setIssignal((Boolean)v); } }
    public static class EpsIsstimulus implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setIsstimulus((Boolean)v); } }
    public static class EpsDispatchaction implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDispatchaction((String)v); } }
    public static class EpsTarget2 implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setTarget2((java.lang.Integer)v); } }
    public static class EpsStyleex implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setStyleex((String)v); } }
    public static class EpsSourcestereotype implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourcestereotype((String)v); } }
    public static class EpsDeststereotype implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDeststereotype((String)v); } }
    public static class EpsSourcestyle implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setSourcestyle((String)v); } }
    public static class EpsDeststyle implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setDeststyle((String)v); } }
    public static class EpsEventflags implements Eps<TConnector>
    { public void setup(TConnector e, Object v) { e.setEventflags((String)v); } }
}
