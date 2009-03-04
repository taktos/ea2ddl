package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;
import jp.sourceforge.ea2ddl.dao.exentity.*;

/**
 * The entity of t_connector that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     Connector_ID
 * 
 * [column]
 *     Connector_ID, Name, Direction, Notes, Connector_Type, SubType, SourceCard, SourceAccess, SourceElement, DestCard, DestAccess, DestElement, SourceRole, SourceRoleType, SourceRoleNote, SourceContainment, SourceIsAggregate, SourceIsOrdered, SourceQualifier, DestRole, DestRoleType, DestRoleNote, DestContainment, DestIsAggregate, DestIsOrdered, DestQualifier, Start_Object_ID, End_Object_ID, Top_Start_Label, Top_Mid_Label, Top_End_Label, Btm_Start_Label, Btm_Mid_Label, Btm_End_Label, Start_Edge, End_Edge, PtStartX, PtStartY, PtEndX, PtEndY, SeqNo, HeadStyle, LineStyle, RouteStyle, IsBold, LineColor, Stereotype, VirtualInheritance, LinkAccess, PDATA1, PDATA2, PDATA3, PDATA4, PDATA5, DiagramID, ea_guid, SourceConstraint, DestConstraint, SourceIsNavigable, DestIsNavigable, IsRoot, IsLeaf, IsSpec, SourceChangeable, DestChangeable, SourceTS, DestTS, StateFlags, ActionFlags, IsSignal, IsStimulus, DispatchAction, Target2, StyleEx, SourceStereotype, DestStereotype, SourceStyle, DestStyle, EventFlags
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     t_operation, t_object
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     tOperationBySourcerole, tOperationByDestrole, tObjectByStartObjectId, tObjectByEndObjectId
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTConnector implements Entity, Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** Connector_ID: {PK : UQ : NotNull : COUNTER} */
    protected java.lang.Integer _connectorId;

    /** Name: {VARCHAR(255)} */
    protected String _name;

    /** Direction: {VARCHAR(50)} */
    protected String _direction;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** Connector_Type: {VARCHAR(50)} */
    protected String _connectorType;

    /** SubType: {VARCHAR(50)} */
    protected String _subtype;

    /** SourceCard: {VARCHAR(50)} */
    protected String _sourcecard;

    /** SourceAccess: {VARCHAR(50)} */
    protected String _sourceaccess;

    /** SourceElement: {VARCHAR(50)} */
    protected String _sourceelement;

    /** DestCard: {VARCHAR(50)} */
    protected String _destcard;

    /** DestAccess: {VARCHAR(50)} */
    protected String _destaccess;

    /** DestElement: {VARCHAR(50)} */
    protected String _destelement;

    /** SourceRole: {VARCHAR(255) : FK to t_operation} */
    protected String _sourcerole;

    /** SourceRoleType: {VARCHAR(50)} */
    protected String _sourceroletype;

    /** SourceRoleNote: {LONGCHAR(2147483647)} */
    protected String _sourcerolenote;

    /** SourceContainment: {VARCHAR(50)} */
    protected String _sourcecontainment;

    /** SourceIsAggregate: {INTEGER} */
    protected java.lang.Integer _sourceisaggregate;

    /** SourceIsOrdered: {INTEGER} */
    protected java.lang.Integer _sourceisordered;

    /** SourceQualifier: {VARCHAR(50)} */
    protected String _sourcequalifier;

    /** DestRole: {VARCHAR(255) : FK to t_operation} */
    protected String _destrole;

    /** DestRoleType: {VARCHAR(50)} */
    protected String _destroletype;

    /** DestRoleNote: {LONGCHAR(2147483647)} */
    protected String _destrolenote;

    /** DestContainment: {VARCHAR(50)} */
    protected String _destcontainment;

    /** DestIsAggregate: {INTEGER} */
    protected java.lang.Integer _destisaggregate;

    /** DestIsOrdered: {INTEGER} */
    protected java.lang.Integer _destisordered;

    /** DestQualifier: {VARCHAR(50)} */
    protected String _destqualifier;

    /** Start_Object_ID: {INTEGER : FK to t_object} */
    protected java.lang.Integer _startObjectId;

    /** End_Object_ID: {INTEGER : FK to t_object} */
    protected java.lang.Integer _endObjectId;

    /** Top_Start_Label: {VARCHAR(50)} */
    protected String _topStartLabel;

    /** Top_Mid_Label: {VARCHAR(50)} */
    protected String _topMidLabel;

    /** Top_End_Label: {VARCHAR(50)} */
    protected String _topEndLabel;

    /** Btm_Start_Label: {VARCHAR(50)} */
    protected String _btmStartLabel;

    /** Btm_Mid_Label: {VARCHAR(50)} */
    protected String _btmMidLabel;

    /** Btm_End_Label: {VARCHAR(50)} */
    protected String _btmEndLabel;

    /** Start_Edge: {INTEGER} */
    protected java.lang.Integer _startEdge;

    /** End_Edge: {INTEGER} */
    protected java.lang.Integer _endEdge;

    /** PtStartX: {INTEGER} */
    protected java.lang.Integer _ptstartx;

    /** PtStartY: {INTEGER} */
    protected java.lang.Integer _ptstarty;

    /** PtEndX: {INTEGER} */
    protected java.lang.Integer _ptendx;

    /** PtEndY: {INTEGER} */
    protected java.lang.Integer _ptendy;

    /** SeqNo: {INTEGER} */
    protected java.lang.Integer _seqno;

    /** HeadStyle: {INTEGER} */
    protected java.lang.Integer _headstyle;

    /** LineStyle: {INTEGER} */
    protected java.lang.Integer _linestyle;

    /** RouteStyle: {INTEGER} */
    protected java.lang.Integer _routestyle;

    /** IsBold: {INTEGER} */
    protected java.lang.Integer _isbold;

    /** LineColor: {INTEGER} */
    protected java.lang.Integer _linecolor;

    /** Stereotype: {VARCHAR(50)} */
    protected String _stereotype;

    /** VirtualInheritance: {VARCHAR(1)} */
    protected String _virtualinheritance;

    /** LinkAccess: {VARCHAR(50)} */
    protected String _linkaccess;

    /** PDATA1: {VARCHAR(255)} */
    protected String _pdata1;

    /** PDATA2: {VARCHAR(255)} */
    protected String _pdata2;

    /** PDATA3: {VARCHAR(255)} */
    protected String _pdata3;

    /** PDATA4: {VARCHAR(255)} */
    protected String _pdata4;

    /** PDATA5: {VARCHAR(255)} */
    protected String _pdata5;

    /** DiagramID: {INTEGER} */
    protected java.lang.Integer _diagramid;

    /** ea_guid: {UQ : VARCHAR(40)} */
    protected String _eaGuid;

    /** SourceConstraint: {VARCHAR(255)} */
    protected String _sourceconstraint;

    /** DestConstraint: {VARCHAR(255)} */
    protected String _destconstraint;

    /** SourceIsNavigable: {NotNull : BIT} */
    protected Boolean _sourceisnavigable;

    /** DestIsNavigable: {NotNull : BIT} */
    protected Boolean _destisnavigable;

    /** IsRoot: {NotNull : BIT} */
    protected Boolean _isroot;

    /** IsLeaf: {NotNull : BIT} */
    protected Boolean _isleaf;

    /** IsSpec: {NotNull : BIT} */
    protected Boolean _isspec;

    /** SourceChangeable: {VARCHAR(12)} */
    protected String _sourcechangeable;

    /** DestChangeable: {VARCHAR(12)} */
    protected String _destchangeable;

    /** SourceTS: {VARCHAR(12)} */
    protected String _sourcets;

    /** DestTS: {VARCHAR(12)} */
    protected String _destts;

    /** StateFlags: {VARCHAR(255)} */
    protected String _stateflags;

    /** ActionFlags: {VARCHAR(255)} */
    protected String _actionflags;

    /** IsSignal: {NotNull : BIT} */
    protected Boolean _issignal;

    /** IsStimulus: {NotNull : BIT} */
    protected Boolean _isstimulus;

    /** DispatchAction: {VARCHAR(255)} */
    protected String _dispatchaction;

    /** Target2: {INTEGER} */
    protected java.lang.Integer _target2;

    /** StyleEx: {LONGCHAR(2147483647)} */
    protected String _styleex;

    /** SourceStereotype: {VARCHAR(255)} */
    protected String _sourcestereotype;

    /** DestStereotype: {VARCHAR(255)} */
    protected String _deststereotype;

    /** SourceStyle: {LONGCHAR(2147483647)} */
    protected String _sourcestyle;

    /** DestStyle: {LONGCHAR(2147483647)} */
    protected String _deststyle;

    /** EventFlags: {VARCHAR(255)} */
    protected String _eventflags;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_connector";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TConnector";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                          Classification Classifying
    //                                                          ==========================
    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** t_operation as 'TOperationBySourcerole'. */
    protected TOperation _parentTOperationBySourcerole;

    /**
     * t_operation as 'TOperationBySourcerole'. {without lazy-load}
     * @return The entity of foreign property 'TOperationBySourcerole'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public TOperation getTOperationBySourcerole() {
        return _parentTOperationBySourcerole;
    }

    /**
     * t_operation as 'TOperationBySourcerole'.
     * @param tOperationBySourcerole The entity of foreign property 'TOperationBySourcerole'. (Nullable)
     */
    public void setTOperationBySourcerole(TOperation tOperationBySourcerole) {
        _parentTOperationBySourcerole = tOperationBySourcerole;
    }

    /** t_operation as 'TOperationByDestrole'. */
    protected TOperation _parentTOperationByDestrole;

    /**
     * t_operation as 'TOperationByDestrole'. {without lazy-load}
     * @return The entity of foreign property 'TOperationByDestrole'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public TOperation getTOperationByDestrole() {
        return _parentTOperationByDestrole;
    }

    /**
     * t_operation as 'TOperationByDestrole'.
     * @param tOperationByDestrole The entity of foreign property 'TOperationByDestrole'. (Nullable)
     */
    public void setTOperationByDestrole(TOperation tOperationByDestrole) {
        _parentTOperationByDestrole = tOperationByDestrole;
    }

    /** t_object as 'TObjectByStartObjectId'. */
    protected TObject _parentTObjectByStartObjectId;

    /**
     * t_object as 'TObjectByStartObjectId'. {without lazy-load}
     * @return The entity of foreign property 'TObjectByStartObjectId'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public TObject getTObjectByStartObjectId() {
        return _parentTObjectByStartObjectId;
    }

    /**
     * t_object as 'TObjectByStartObjectId'.
     * @param tObjectByStartObjectId The entity of foreign property 'TObjectByStartObjectId'. (Nullable)
     */
    public void setTObjectByStartObjectId(TObject tObjectByStartObjectId) {
        _parentTObjectByStartObjectId = tObjectByStartObjectId;
    }

    /** t_object as 'TObjectByEndObjectId'. */
    protected TObject _parentTObjectByEndObjectId;

    /**
     * t_object as 'TObjectByEndObjectId'. {without lazy-load}
     * @return The entity of foreign property 'TObjectByEndObjectId'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public TObject getTObjectByEndObjectId() {
        return _parentTObjectByEndObjectId;
    }

    /**
     * t_object as 'TObjectByEndObjectId'.
     * @param tObjectByEndObjectId The entity of foreign property 'TObjectByEndObjectId'. (Nullable)
     */
    public void setTObjectByEndObjectId(TObject tObjectByEndObjectId) {
        _parentTObjectByEndObjectId = tObjectByEndObjectId;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        if (_connectorId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> getModifiedPropertyNames() {
        return _modifiedProperties.getPropertyNames();
    }

    protected EntityModifiedProperties newEntityModifiedProperties() {
        return new EntityModifiedProperties();
    }

    public void clearModifiedPropertyNames() {
        _modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !_modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * If the primary-key of the other is same as this one, returns true.
     * @param other Other entity.
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTConnector)) { return false; }
        BsTConnector otherEntity = (BsTConnector)other;
        if (!helpComparingValue(getConnectorId(), otherEntity.getConnectorId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * Calculates hash-code from primary-key.
     * @return Hash-code from primary-keys.
     */
    public int hashCode() {
        int result = 17;
        if (this.getConnectorId() != null) { result = result + getConnectorId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getConnectorId());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getDirection());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getConnectorType());
        sb.append(delimiter).append(getSubtype());
        sb.append(delimiter).append(getSourcecard());
        sb.append(delimiter).append(getSourceaccess());
        sb.append(delimiter).append(getSourceelement());
        sb.append(delimiter).append(getDestcard());
        sb.append(delimiter).append(getDestaccess());
        sb.append(delimiter).append(getDestelement());
        sb.append(delimiter).append(getSourcerole());
        sb.append(delimiter).append(getSourceroletype());
        sb.append(delimiter).append(getSourcerolenote());
        sb.append(delimiter).append(getSourcecontainment());
        sb.append(delimiter).append(getSourceisaggregate());
        sb.append(delimiter).append(getSourceisordered());
        sb.append(delimiter).append(getSourcequalifier());
        sb.append(delimiter).append(getDestrole());
        sb.append(delimiter).append(getDestroletype());
        sb.append(delimiter).append(getDestrolenote());
        sb.append(delimiter).append(getDestcontainment());
        sb.append(delimiter).append(getDestisaggregate());
        sb.append(delimiter).append(getDestisordered());
        sb.append(delimiter).append(getDestqualifier());
        sb.append(delimiter).append(getStartObjectId());
        sb.append(delimiter).append(getEndObjectId());
        sb.append(delimiter).append(getTopStartLabel());
        sb.append(delimiter).append(getTopMidLabel());
        sb.append(delimiter).append(getTopEndLabel());
        sb.append(delimiter).append(getBtmStartLabel());
        sb.append(delimiter).append(getBtmMidLabel());
        sb.append(delimiter).append(getBtmEndLabel());
        sb.append(delimiter).append(getStartEdge());
        sb.append(delimiter).append(getEndEdge());
        sb.append(delimiter).append(getPtstartx());
        sb.append(delimiter).append(getPtstarty());
        sb.append(delimiter).append(getPtendx());
        sb.append(delimiter).append(getPtendy());
        sb.append(delimiter).append(getSeqno());
        sb.append(delimiter).append(getHeadstyle());
        sb.append(delimiter).append(getLinestyle());
        sb.append(delimiter).append(getRoutestyle());
        sb.append(delimiter).append(getIsbold());
        sb.append(delimiter).append(getLinecolor());
        sb.append(delimiter).append(getStereotype());
        sb.append(delimiter).append(getVirtualinheritance());
        sb.append(delimiter).append(getLinkaccess());
        sb.append(delimiter).append(getPdata1());
        sb.append(delimiter).append(getPdata2());
        sb.append(delimiter).append(getPdata3());
        sb.append(delimiter).append(getPdata4());
        sb.append(delimiter).append(getPdata5());
        sb.append(delimiter).append(getDiagramid());
        sb.append(delimiter).append(getEaGuid());
        sb.append(delimiter).append(getSourceconstraint());
        sb.append(delimiter).append(getDestconstraint());
        sb.append(delimiter).append(getSourceisnavigable());
        sb.append(delimiter).append(getDestisnavigable());
        sb.append(delimiter).append(getIsroot());
        sb.append(delimiter).append(getIsleaf());
        sb.append(delimiter).append(getIsspec());
        sb.append(delimiter).append(getSourcechangeable());
        sb.append(delimiter).append(getDestchangeable());
        sb.append(delimiter).append(getSourcets());
        sb.append(delimiter).append(getDestts());
        sb.append(delimiter).append(getStateflags());
        sb.append(delimiter).append(getActionflags());
        sb.append(delimiter).append(getIssignal());
        sb.append(delimiter).append(getIsstimulus());
        sb.append(delimiter).append(getDispatchaction());
        sb.append(delimiter).append(getTarget2());
        sb.append(delimiter).append(getStyleex());
        sb.append(delimiter).append(getSourcestereotype());
        sb.append(delimiter).append(getDeststereotype());
        sb.append(delimiter).append(getSourcestyle());
        sb.append(delimiter).append(getDeststyle());
        sb.append(delimiter).append(getEventflags());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Connector_ID: {PK : UQ : NotNull : COUNTER} <br />
     * @return The value of the column 'Connector_ID'. (Nullable)
     */
    public java.lang.Integer getConnectorId() {
        return _connectorId;
    }

    /**
     * Connector_ID: {PK : UQ : NotNull : COUNTER} <br />
     * @param connectorId The value of the column 'Connector_ID'. (Nullable)
     */
    public void setConnectorId(java.lang.Integer connectorId) {
        _modifiedProperties.addPropertyName("connectorId");
        this._connectorId = connectorId;
    }

    /**
     * Name: {VARCHAR(255)} <br />
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Name: {VARCHAR(255)} <br />
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /**
     * Direction: {VARCHAR(50)} <br />
     * @return The value of the column 'Direction'. (Nullable)
     */
    public String getDirection() {
        return _direction;
    }

    /**
     * Direction: {VARCHAR(50)} <br />
     * @param direction The value of the column 'Direction'. (Nullable)
     */
    public void setDirection(String direction) {
        _modifiedProperties.addPropertyName("direction");
        this._direction = direction;
    }

    /**
     * Notes: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Notes'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * Notes: {LONGCHAR(2147483647)} <br />
     * @param notes The value of the column 'Notes'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

    /**
     * Connector_Type: {VARCHAR(50)} <br />
     * @return The value of the column 'Connector_Type'. (Nullable)
     */
    public String getConnectorType() {
        return _connectorType;
    }

    /**
     * Connector_Type: {VARCHAR(50)} <br />
     * @param connectorType The value of the column 'Connector_Type'. (Nullable)
     */
    public void setConnectorType(String connectorType) {
        _modifiedProperties.addPropertyName("connectorType");
        this._connectorType = connectorType;
    }

    /**
     * SubType: {VARCHAR(50)} <br />
     * @return The value of the column 'SubType'. (Nullable)
     */
    public String getSubtype() {
        return _subtype;
    }

    /**
     * SubType: {VARCHAR(50)} <br />
     * @param subtype The value of the column 'SubType'. (Nullable)
     */
    public void setSubtype(String subtype) {
        _modifiedProperties.addPropertyName("subtype");
        this._subtype = subtype;
    }

    /**
     * SourceCard: {VARCHAR(50)} <br />
     * @return The value of the column 'SourceCard'. (Nullable)
     */
    public String getSourcecard() {
        return _sourcecard;
    }

    /**
     * SourceCard: {VARCHAR(50)} <br />
     * @param sourcecard The value of the column 'SourceCard'. (Nullable)
     */
    public void setSourcecard(String sourcecard) {
        _modifiedProperties.addPropertyName("sourcecard");
        this._sourcecard = sourcecard;
    }

    /**
     * SourceAccess: {VARCHAR(50)} <br />
     * @return The value of the column 'SourceAccess'. (Nullable)
     */
    public String getSourceaccess() {
        return _sourceaccess;
    }

    /**
     * SourceAccess: {VARCHAR(50)} <br />
     * @param sourceaccess The value of the column 'SourceAccess'. (Nullable)
     */
    public void setSourceaccess(String sourceaccess) {
        _modifiedProperties.addPropertyName("sourceaccess");
        this._sourceaccess = sourceaccess;
    }

    /**
     * SourceElement: {VARCHAR(50)} <br />
     * @return The value of the column 'SourceElement'. (Nullable)
     */
    public String getSourceelement() {
        return _sourceelement;
    }

    /**
     * SourceElement: {VARCHAR(50)} <br />
     * @param sourceelement The value of the column 'SourceElement'. (Nullable)
     */
    public void setSourceelement(String sourceelement) {
        _modifiedProperties.addPropertyName("sourceelement");
        this._sourceelement = sourceelement;
    }

    /**
     * DestCard: {VARCHAR(50)} <br />
     * @return The value of the column 'DestCard'. (Nullable)
     */
    public String getDestcard() {
        return _destcard;
    }

    /**
     * DestCard: {VARCHAR(50)} <br />
     * @param destcard The value of the column 'DestCard'. (Nullable)
     */
    public void setDestcard(String destcard) {
        _modifiedProperties.addPropertyName("destcard");
        this._destcard = destcard;
    }

    /**
     * DestAccess: {VARCHAR(50)} <br />
     * @return The value of the column 'DestAccess'. (Nullable)
     */
    public String getDestaccess() {
        return _destaccess;
    }

    /**
     * DestAccess: {VARCHAR(50)} <br />
     * @param destaccess The value of the column 'DestAccess'. (Nullable)
     */
    public void setDestaccess(String destaccess) {
        _modifiedProperties.addPropertyName("destaccess");
        this._destaccess = destaccess;
    }

    /**
     * DestElement: {VARCHAR(50)} <br />
     * @return The value of the column 'DestElement'. (Nullable)
     */
    public String getDestelement() {
        return _destelement;
    }

    /**
     * DestElement: {VARCHAR(50)} <br />
     * @param destelement The value of the column 'DestElement'. (Nullable)
     */
    public void setDestelement(String destelement) {
        _modifiedProperties.addPropertyName("destelement");
        this._destelement = destelement;
    }

    /**
     * SourceRole: {VARCHAR(255) : FK to t_operation} <br />
     * @return The value of the column 'SourceRole'. (Nullable)
     */
    public String getSourcerole() {
        return _sourcerole;
    }

    /**
     * SourceRole: {VARCHAR(255) : FK to t_operation} <br />
     * @param sourcerole The value of the column 'SourceRole'. (Nullable)
     */
    public void setSourcerole(String sourcerole) {
        _modifiedProperties.addPropertyName("sourcerole");
        this._sourcerole = sourcerole;
    }

    /**
     * SourceRoleType: {VARCHAR(50)} <br />
     * @return The value of the column 'SourceRoleType'. (Nullable)
     */
    public String getSourceroletype() {
        return _sourceroletype;
    }

    /**
     * SourceRoleType: {VARCHAR(50)} <br />
     * @param sourceroletype The value of the column 'SourceRoleType'. (Nullable)
     */
    public void setSourceroletype(String sourceroletype) {
        _modifiedProperties.addPropertyName("sourceroletype");
        this._sourceroletype = sourceroletype;
    }

    /**
     * SourceRoleNote: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'SourceRoleNote'. (Nullable)
     */
    public String getSourcerolenote() {
        return _sourcerolenote;
    }

    /**
     * SourceRoleNote: {LONGCHAR(2147483647)} <br />
     * @param sourcerolenote The value of the column 'SourceRoleNote'. (Nullable)
     */
    public void setSourcerolenote(String sourcerolenote) {
        _modifiedProperties.addPropertyName("sourcerolenote");
        this._sourcerolenote = sourcerolenote;
    }

    /**
     * SourceContainment: {VARCHAR(50)} <br />
     * @return The value of the column 'SourceContainment'. (Nullable)
     */
    public String getSourcecontainment() {
        return _sourcecontainment;
    }

    /**
     * SourceContainment: {VARCHAR(50)} <br />
     * @param sourcecontainment The value of the column 'SourceContainment'. (Nullable)
     */
    public void setSourcecontainment(String sourcecontainment) {
        _modifiedProperties.addPropertyName("sourcecontainment");
        this._sourcecontainment = sourcecontainment;
    }

    /**
     * SourceIsAggregate: {INTEGER} <br />
     * @return The value of the column 'SourceIsAggregate'. (Nullable)
     */
    public java.lang.Integer getSourceisaggregate() {
        return _sourceisaggregate;
    }

    /**
     * SourceIsAggregate: {INTEGER} <br />
     * @param sourceisaggregate The value of the column 'SourceIsAggregate'. (Nullable)
     */
    public void setSourceisaggregate(java.lang.Integer sourceisaggregate) {
        _modifiedProperties.addPropertyName("sourceisaggregate");
        this._sourceisaggregate = sourceisaggregate;
    }

    /**
     * SourceIsOrdered: {INTEGER} <br />
     * @return The value of the column 'SourceIsOrdered'. (Nullable)
     */
    public java.lang.Integer getSourceisordered() {
        return _sourceisordered;
    }

    /**
     * SourceIsOrdered: {INTEGER} <br />
     * @param sourceisordered The value of the column 'SourceIsOrdered'. (Nullable)
     */
    public void setSourceisordered(java.lang.Integer sourceisordered) {
        _modifiedProperties.addPropertyName("sourceisordered");
        this._sourceisordered = sourceisordered;
    }

    /**
     * SourceQualifier: {VARCHAR(50)} <br />
     * @return The value of the column 'SourceQualifier'. (Nullable)
     */
    public String getSourcequalifier() {
        return _sourcequalifier;
    }

    /**
     * SourceQualifier: {VARCHAR(50)} <br />
     * @param sourcequalifier The value of the column 'SourceQualifier'. (Nullable)
     */
    public void setSourcequalifier(String sourcequalifier) {
        _modifiedProperties.addPropertyName("sourcequalifier");
        this._sourcequalifier = sourcequalifier;
    }

    /**
     * DestRole: {VARCHAR(255) : FK to t_operation} <br />
     * @return The value of the column 'DestRole'. (Nullable)
     */
    public String getDestrole() {
        return _destrole;
    }

    /**
     * DestRole: {VARCHAR(255) : FK to t_operation} <br />
     * @param destrole The value of the column 'DestRole'. (Nullable)
     */
    public void setDestrole(String destrole) {
        _modifiedProperties.addPropertyName("destrole");
        this._destrole = destrole;
    }

    /**
     * DestRoleType: {VARCHAR(50)} <br />
     * @return The value of the column 'DestRoleType'. (Nullable)
     */
    public String getDestroletype() {
        return _destroletype;
    }

    /**
     * DestRoleType: {VARCHAR(50)} <br />
     * @param destroletype The value of the column 'DestRoleType'. (Nullable)
     */
    public void setDestroletype(String destroletype) {
        _modifiedProperties.addPropertyName("destroletype");
        this._destroletype = destroletype;
    }

    /**
     * DestRoleNote: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'DestRoleNote'. (Nullable)
     */
    public String getDestrolenote() {
        return _destrolenote;
    }

    /**
     * DestRoleNote: {LONGCHAR(2147483647)} <br />
     * @param destrolenote The value of the column 'DestRoleNote'. (Nullable)
     */
    public void setDestrolenote(String destrolenote) {
        _modifiedProperties.addPropertyName("destrolenote");
        this._destrolenote = destrolenote;
    }

    /**
     * DestContainment: {VARCHAR(50)} <br />
     * @return The value of the column 'DestContainment'. (Nullable)
     */
    public String getDestcontainment() {
        return _destcontainment;
    }

    /**
     * DestContainment: {VARCHAR(50)} <br />
     * @param destcontainment The value of the column 'DestContainment'. (Nullable)
     */
    public void setDestcontainment(String destcontainment) {
        _modifiedProperties.addPropertyName("destcontainment");
        this._destcontainment = destcontainment;
    }

    /**
     * DestIsAggregate: {INTEGER} <br />
     * @return The value of the column 'DestIsAggregate'. (Nullable)
     */
    public java.lang.Integer getDestisaggregate() {
        return _destisaggregate;
    }

    /**
     * DestIsAggregate: {INTEGER} <br />
     * @param destisaggregate The value of the column 'DestIsAggregate'. (Nullable)
     */
    public void setDestisaggregate(java.lang.Integer destisaggregate) {
        _modifiedProperties.addPropertyName("destisaggregate");
        this._destisaggregate = destisaggregate;
    }

    /**
     * DestIsOrdered: {INTEGER} <br />
     * @return The value of the column 'DestIsOrdered'. (Nullable)
     */
    public java.lang.Integer getDestisordered() {
        return _destisordered;
    }

    /**
     * DestIsOrdered: {INTEGER} <br />
     * @param destisordered The value of the column 'DestIsOrdered'. (Nullable)
     */
    public void setDestisordered(java.lang.Integer destisordered) {
        _modifiedProperties.addPropertyName("destisordered");
        this._destisordered = destisordered;
    }

    /**
     * DestQualifier: {VARCHAR(50)} <br />
     * @return The value of the column 'DestQualifier'. (Nullable)
     */
    public String getDestqualifier() {
        return _destqualifier;
    }

    /**
     * DestQualifier: {VARCHAR(50)} <br />
     * @param destqualifier The value of the column 'DestQualifier'. (Nullable)
     */
    public void setDestqualifier(String destqualifier) {
        _modifiedProperties.addPropertyName("destqualifier");
        this._destqualifier = destqualifier;
    }

    /**
     * Start_Object_ID: {INTEGER : FK to t_object} <br />
     * @return The value of the column 'Start_Object_ID'. (Nullable)
     */
    public java.lang.Integer getStartObjectId() {
        return _startObjectId;
    }

    /**
     * Start_Object_ID: {INTEGER : FK to t_object} <br />
     * @param startObjectId The value of the column 'Start_Object_ID'. (Nullable)
     */
    public void setStartObjectId(java.lang.Integer startObjectId) {
        _modifiedProperties.addPropertyName("startObjectId");
        this._startObjectId = startObjectId;
    }

    /**
     * End_Object_ID: {INTEGER : FK to t_object} <br />
     * @return The value of the column 'End_Object_ID'. (Nullable)
     */
    public java.lang.Integer getEndObjectId() {
        return _endObjectId;
    }

    /**
     * End_Object_ID: {INTEGER : FK to t_object} <br />
     * @param endObjectId The value of the column 'End_Object_ID'. (Nullable)
     */
    public void setEndObjectId(java.lang.Integer endObjectId) {
        _modifiedProperties.addPropertyName("endObjectId");
        this._endObjectId = endObjectId;
    }

    /**
     * Top_Start_Label: {VARCHAR(50)} <br />
     * @return The value of the column 'Top_Start_Label'. (Nullable)
     */
    public String getTopStartLabel() {
        return _topStartLabel;
    }

    /**
     * Top_Start_Label: {VARCHAR(50)} <br />
     * @param topStartLabel The value of the column 'Top_Start_Label'. (Nullable)
     */
    public void setTopStartLabel(String topStartLabel) {
        _modifiedProperties.addPropertyName("topStartLabel");
        this._topStartLabel = topStartLabel;
    }

    /**
     * Top_Mid_Label: {VARCHAR(50)} <br />
     * @return The value of the column 'Top_Mid_Label'. (Nullable)
     */
    public String getTopMidLabel() {
        return _topMidLabel;
    }

    /**
     * Top_Mid_Label: {VARCHAR(50)} <br />
     * @param topMidLabel The value of the column 'Top_Mid_Label'. (Nullable)
     */
    public void setTopMidLabel(String topMidLabel) {
        _modifiedProperties.addPropertyName("topMidLabel");
        this._topMidLabel = topMidLabel;
    }

    /**
     * Top_End_Label: {VARCHAR(50)} <br />
     * @return The value of the column 'Top_End_Label'. (Nullable)
     */
    public String getTopEndLabel() {
        return _topEndLabel;
    }

    /**
     * Top_End_Label: {VARCHAR(50)} <br />
     * @param topEndLabel The value of the column 'Top_End_Label'. (Nullable)
     */
    public void setTopEndLabel(String topEndLabel) {
        _modifiedProperties.addPropertyName("topEndLabel");
        this._topEndLabel = topEndLabel;
    }

    /**
     * Btm_Start_Label: {VARCHAR(50)} <br />
     * @return The value of the column 'Btm_Start_Label'. (Nullable)
     */
    public String getBtmStartLabel() {
        return _btmStartLabel;
    }

    /**
     * Btm_Start_Label: {VARCHAR(50)} <br />
     * @param btmStartLabel The value of the column 'Btm_Start_Label'. (Nullable)
     */
    public void setBtmStartLabel(String btmStartLabel) {
        _modifiedProperties.addPropertyName("btmStartLabel");
        this._btmStartLabel = btmStartLabel;
    }

    /**
     * Btm_Mid_Label: {VARCHAR(50)} <br />
     * @return The value of the column 'Btm_Mid_Label'. (Nullable)
     */
    public String getBtmMidLabel() {
        return _btmMidLabel;
    }

    /**
     * Btm_Mid_Label: {VARCHAR(50)} <br />
     * @param btmMidLabel The value of the column 'Btm_Mid_Label'. (Nullable)
     */
    public void setBtmMidLabel(String btmMidLabel) {
        _modifiedProperties.addPropertyName("btmMidLabel");
        this._btmMidLabel = btmMidLabel;
    }

    /**
     * Btm_End_Label: {VARCHAR(50)} <br />
     * @return The value of the column 'Btm_End_Label'. (Nullable)
     */
    public String getBtmEndLabel() {
        return _btmEndLabel;
    }

    /**
     * Btm_End_Label: {VARCHAR(50)} <br />
     * @param btmEndLabel The value of the column 'Btm_End_Label'. (Nullable)
     */
    public void setBtmEndLabel(String btmEndLabel) {
        _modifiedProperties.addPropertyName("btmEndLabel");
        this._btmEndLabel = btmEndLabel;
    }

    /**
     * Start_Edge: {INTEGER} <br />
     * @return The value of the column 'Start_Edge'. (Nullable)
     */
    public java.lang.Integer getStartEdge() {
        return _startEdge;
    }

    /**
     * Start_Edge: {INTEGER} <br />
     * @param startEdge The value of the column 'Start_Edge'. (Nullable)
     */
    public void setStartEdge(java.lang.Integer startEdge) {
        _modifiedProperties.addPropertyName("startEdge");
        this._startEdge = startEdge;
    }

    /**
     * End_Edge: {INTEGER} <br />
     * @return The value of the column 'End_Edge'. (Nullable)
     */
    public java.lang.Integer getEndEdge() {
        return _endEdge;
    }

    /**
     * End_Edge: {INTEGER} <br />
     * @param endEdge The value of the column 'End_Edge'. (Nullable)
     */
    public void setEndEdge(java.lang.Integer endEdge) {
        _modifiedProperties.addPropertyName("endEdge");
        this._endEdge = endEdge;
    }

    /**
     * PtStartX: {INTEGER} <br />
     * @return The value of the column 'PtStartX'. (Nullable)
     */
    public java.lang.Integer getPtstartx() {
        return _ptstartx;
    }

    /**
     * PtStartX: {INTEGER} <br />
     * @param ptstartx The value of the column 'PtStartX'. (Nullable)
     */
    public void setPtstartx(java.lang.Integer ptstartx) {
        _modifiedProperties.addPropertyName("ptstartx");
        this._ptstartx = ptstartx;
    }

    /**
     * PtStartY: {INTEGER} <br />
     * @return The value of the column 'PtStartY'. (Nullable)
     */
    public java.lang.Integer getPtstarty() {
        return _ptstarty;
    }

    /**
     * PtStartY: {INTEGER} <br />
     * @param ptstarty The value of the column 'PtStartY'. (Nullable)
     */
    public void setPtstarty(java.lang.Integer ptstarty) {
        _modifiedProperties.addPropertyName("ptstarty");
        this._ptstarty = ptstarty;
    }

    /**
     * PtEndX: {INTEGER} <br />
     * @return The value of the column 'PtEndX'. (Nullable)
     */
    public java.lang.Integer getPtendx() {
        return _ptendx;
    }

    /**
     * PtEndX: {INTEGER} <br />
     * @param ptendx The value of the column 'PtEndX'. (Nullable)
     */
    public void setPtendx(java.lang.Integer ptendx) {
        _modifiedProperties.addPropertyName("ptendx");
        this._ptendx = ptendx;
    }

    /**
     * PtEndY: {INTEGER} <br />
     * @return The value of the column 'PtEndY'. (Nullable)
     */
    public java.lang.Integer getPtendy() {
        return _ptendy;
    }

    /**
     * PtEndY: {INTEGER} <br />
     * @param ptendy The value of the column 'PtEndY'. (Nullable)
     */
    public void setPtendy(java.lang.Integer ptendy) {
        _modifiedProperties.addPropertyName("ptendy");
        this._ptendy = ptendy;
    }

    /**
     * SeqNo: {INTEGER} <br />
     * @return The value of the column 'SeqNo'. (Nullable)
     */
    public java.lang.Integer getSeqno() {
        return _seqno;
    }

    /**
     * SeqNo: {INTEGER} <br />
     * @param seqno The value of the column 'SeqNo'. (Nullable)
     */
    public void setSeqno(java.lang.Integer seqno) {
        _modifiedProperties.addPropertyName("seqno");
        this._seqno = seqno;
    }

    /**
     * HeadStyle: {INTEGER} <br />
     * @return The value of the column 'HeadStyle'. (Nullable)
     */
    public java.lang.Integer getHeadstyle() {
        return _headstyle;
    }

    /**
     * HeadStyle: {INTEGER} <br />
     * @param headstyle The value of the column 'HeadStyle'. (Nullable)
     */
    public void setHeadstyle(java.lang.Integer headstyle) {
        _modifiedProperties.addPropertyName("headstyle");
        this._headstyle = headstyle;
    }

    /**
     * LineStyle: {INTEGER} <br />
     * @return The value of the column 'LineStyle'. (Nullable)
     */
    public java.lang.Integer getLinestyle() {
        return _linestyle;
    }

    /**
     * LineStyle: {INTEGER} <br />
     * @param linestyle The value of the column 'LineStyle'. (Nullable)
     */
    public void setLinestyle(java.lang.Integer linestyle) {
        _modifiedProperties.addPropertyName("linestyle");
        this._linestyle = linestyle;
    }

    /**
     * RouteStyle: {INTEGER} <br />
     * @return The value of the column 'RouteStyle'. (Nullable)
     */
    public java.lang.Integer getRoutestyle() {
        return _routestyle;
    }

    /**
     * RouteStyle: {INTEGER} <br />
     * @param routestyle The value of the column 'RouteStyle'. (Nullable)
     */
    public void setRoutestyle(java.lang.Integer routestyle) {
        _modifiedProperties.addPropertyName("routestyle");
        this._routestyle = routestyle;
    }

    /**
     * IsBold: {INTEGER} <br />
     * @return The value of the column 'IsBold'. (Nullable)
     */
    public java.lang.Integer getIsbold() {
        return _isbold;
    }

    /**
     * IsBold: {INTEGER} <br />
     * @param isbold The value of the column 'IsBold'. (Nullable)
     */
    public void setIsbold(java.lang.Integer isbold) {
        _modifiedProperties.addPropertyName("isbold");
        this._isbold = isbold;
    }

    /**
     * LineColor: {INTEGER} <br />
     * @return The value of the column 'LineColor'. (Nullable)
     */
    public java.lang.Integer getLinecolor() {
        return _linecolor;
    }

    /**
     * LineColor: {INTEGER} <br />
     * @param linecolor The value of the column 'LineColor'. (Nullable)
     */
    public void setLinecolor(java.lang.Integer linecolor) {
        _modifiedProperties.addPropertyName("linecolor");
        this._linecolor = linecolor;
    }

    /**
     * Stereotype: {VARCHAR(50)} <br />
     * @return The value of the column 'Stereotype'. (Nullable)
     */
    public String getStereotype() {
        return _stereotype;
    }

    /**
     * Stereotype: {VARCHAR(50)} <br />
     * @param stereotype The value of the column 'Stereotype'. (Nullable)
     */
    public void setStereotype(String stereotype) {
        _modifiedProperties.addPropertyName("stereotype");
        this._stereotype = stereotype;
    }

    /**
     * VirtualInheritance: {VARCHAR(1)} <br />
     * @return The value of the column 'VirtualInheritance'. (Nullable)
     */
    public String getVirtualinheritance() {
        return _virtualinheritance;
    }

    /**
     * VirtualInheritance: {VARCHAR(1)} <br />
     * @param virtualinheritance The value of the column 'VirtualInheritance'. (Nullable)
     */
    public void setVirtualinheritance(String virtualinheritance) {
        _modifiedProperties.addPropertyName("virtualinheritance");
        this._virtualinheritance = virtualinheritance;
    }

    /**
     * LinkAccess: {VARCHAR(50)} <br />
     * @return The value of the column 'LinkAccess'. (Nullable)
     */
    public String getLinkaccess() {
        return _linkaccess;
    }

    /**
     * LinkAccess: {VARCHAR(50)} <br />
     * @param linkaccess The value of the column 'LinkAccess'. (Nullable)
     */
    public void setLinkaccess(String linkaccess) {
        _modifiedProperties.addPropertyName("linkaccess");
        this._linkaccess = linkaccess;
    }

    /**
     * PDATA1: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA1'. (Nullable)
     */
    public String getPdata1() {
        return _pdata1;
    }

    /**
     * PDATA1: {VARCHAR(255)} <br />
     * @param pdata1 The value of the column 'PDATA1'. (Nullable)
     */
    public void setPdata1(String pdata1) {
        _modifiedProperties.addPropertyName("pdata1");
        this._pdata1 = pdata1;
    }

    /**
     * PDATA2: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA2'. (Nullable)
     */
    public String getPdata2() {
        return _pdata2;
    }

    /**
     * PDATA2: {VARCHAR(255)} <br />
     * @param pdata2 The value of the column 'PDATA2'. (Nullable)
     */
    public void setPdata2(String pdata2) {
        _modifiedProperties.addPropertyName("pdata2");
        this._pdata2 = pdata2;
    }

    /**
     * PDATA3: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA3'. (Nullable)
     */
    public String getPdata3() {
        return _pdata3;
    }

    /**
     * PDATA3: {VARCHAR(255)} <br />
     * @param pdata3 The value of the column 'PDATA3'. (Nullable)
     */
    public void setPdata3(String pdata3) {
        _modifiedProperties.addPropertyName("pdata3");
        this._pdata3 = pdata3;
    }

    /**
     * PDATA4: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA4'. (Nullable)
     */
    public String getPdata4() {
        return _pdata4;
    }

    /**
     * PDATA4: {VARCHAR(255)} <br />
     * @param pdata4 The value of the column 'PDATA4'. (Nullable)
     */
    public void setPdata4(String pdata4) {
        _modifiedProperties.addPropertyName("pdata4");
        this._pdata4 = pdata4;
    }

    /**
     * PDATA5: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA5'. (Nullable)
     */
    public String getPdata5() {
        return _pdata5;
    }

    /**
     * PDATA5: {VARCHAR(255)} <br />
     * @param pdata5 The value of the column 'PDATA5'. (Nullable)
     */
    public void setPdata5(String pdata5) {
        _modifiedProperties.addPropertyName("pdata5");
        this._pdata5 = pdata5;
    }

    /**
     * DiagramID: {INTEGER} <br />
     * @return The value of the column 'DiagramID'. (Nullable)
     */
    public java.lang.Integer getDiagramid() {
        return _diagramid;
    }

    /**
     * DiagramID: {INTEGER} <br />
     * @param diagramid The value of the column 'DiagramID'. (Nullable)
     */
    public void setDiagramid(java.lang.Integer diagramid) {
        _modifiedProperties.addPropertyName("diagramid");
        this._diagramid = diagramid;
    }

    /**
     * ea_guid: {UQ : VARCHAR(40)} <br />
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * ea_guid: {UQ : VARCHAR(40)} <br />
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
    }

    /**
     * SourceConstraint: {VARCHAR(255)} <br />
     * @return The value of the column 'SourceConstraint'. (Nullable)
     */
    public String getSourceconstraint() {
        return _sourceconstraint;
    }

    /**
     * SourceConstraint: {VARCHAR(255)} <br />
     * @param sourceconstraint The value of the column 'SourceConstraint'. (Nullable)
     */
    public void setSourceconstraint(String sourceconstraint) {
        _modifiedProperties.addPropertyName("sourceconstraint");
        this._sourceconstraint = sourceconstraint;
    }

    /**
     * DestConstraint: {VARCHAR(255)} <br />
     * @return The value of the column 'DestConstraint'. (Nullable)
     */
    public String getDestconstraint() {
        return _destconstraint;
    }

    /**
     * DestConstraint: {VARCHAR(255)} <br />
     * @param destconstraint The value of the column 'DestConstraint'. (Nullable)
     */
    public void setDestconstraint(String destconstraint) {
        _modifiedProperties.addPropertyName("destconstraint");
        this._destconstraint = destconstraint;
    }

    /**
     * SourceIsNavigable: {NotNull : BIT} <br />
     * @return The value of the column 'SourceIsNavigable'. (Nullable)
     */
    public Boolean getSourceisnavigable() {
        return _sourceisnavigable;
    }

    /**
     * SourceIsNavigable: {NotNull : BIT} <br />
     * @param sourceisnavigable The value of the column 'SourceIsNavigable'. (Nullable)
     */
    public void setSourceisnavigable(Boolean sourceisnavigable) {
        _modifiedProperties.addPropertyName("sourceisnavigable");
        this._sourceisnavigable = sourceisnavigable;
    }

    /**
     * DestIsNavigable: {NotNull : BIT} <br />
     * @return The value of the column 'DestIsNavigable'. (Nullable)
     */
    public Boolean getDestisnavigable() {
        return _destisnavigable;
    }

    /**
     * DestIsNavigable: {NotNull : BIT} <br />
     * @param destisnavigable The value of the column 'DestIsNavigable'. (Nullable)
     */
    public void setDestisnavigable(Boolean destisnavigable) {
        _modifiedProperties.addPropertyName("destisnavigable");
        this._destisnavigable = destisnavigable;
    }

    /**
     * IsRoot: {NotNull : BIT} <br />
     * @return The value of the column 'IsRoot'. (Nullable)
     */
    public Boolean getIsroot() {
        return _isroot;
    }

    /**
     * IsRoot: {NotNull : BIT} <br />
     * @param isroot The value of the column 'IsRoot'. (Nullable)
     */
    public void setIsroot(Boolean isroot) {
        _modifiedProperties.addPropertyName("isroot");
        this._isroot = isroot;
    }

    /**
     * IsLeaf: {NotNull : BIT} <br />
     * @return The value of the column 'IsLeaf'. (Nullable)
     */
    public Boolean getIsleaf() {
        return _isleaf;
    }

    /**
     * IsLeaf: {NotNull : BIT} <br />
     * @param isleaf The value of the column 'IsLeaf'. (Nullable)
     */
    public void setIsleaf(Boolean isleaf) {
        _modifiedProperties.addPropertyName("isleaf");
        this._isleaf = isleaf;
    }

    /**
     * IsSpec: {NotNull : BIT} <br />
     * @return The value of the column 'IsSpec'. (Nullable)
     */
    public Boolean getIsspec() {
        return _isspec;
    }

    /**
     * IsSpec: {NotNull : BIT} <br />
     * @param isspec The value of the column 'IsSpec'. (Nullable)
     */
    public void setIsspec(Boolean isspec) {
        _modifiedProperties.addPropertyName("isspec");
        this._isspec = isspec;
    }

    /**
     * SourceChangeable: {VARCHAR(12)} <br />
     * @return The value of the column 'SourceChangeable'. (Nullable)
     */
    public String getSourcechangeable() {
        return _sourcechangeable;
    }

    /**
     * SourceChangeable: {VARCHAR(12)} <br />
     * @param sourcechangeable The value of the column 'SourceChangeable'. (Nullable)
     */
    public void setSourcechangeable(String sourcechangeable) {
        _modifiedProperties.addPropertyName("sourcechangeable");
        this._sourcechangeable = sourcechangeable;
    }

    /**
     * DestChangeable: {VARCHAR(12)} <br />
     * @return The value of the column 'DestChangeable'. (Nullable)
     */
    public String getDestchangeable() {
        return _destchangeable;
    }

    /**
     * DestChangeable: {VARCHAR(12)} <br />
     * @param destchangeable The value of the column 'DestChangeable'. (Nullable)
     */
    public void setDestchangeable(String destchangeable) {
        _modifiedProperties.addPropertyName("destchangeable");
        this._destchangeable = destchangeable;
    }

    /**
     * SourceTS: {VARCHAR(12)} <br />
     * @return The value of the column 'SourceTS'. (Nullable)
     */
    public String getSourcets() {
        return _sourcets;
    }

    /**
     * SourceTS: {VARCHAR(12)} <br />
     * @param sourcets The value of the column 'SourceTS'. (Nullable)
     */
    public void setSourcets(String sourcets) {
        _modifiedProperties.addPropertyName("sourcets");
        this._sourcets = sourcets;
    }

    /**
     * DestTS: {VARCHAR(12)} <br />
     * @return The value of the column 'DestTS'. (Nullable)
     */
    public String getDestts() {
        return _destts;
    }

    /**
     * DestTS: {VARCHAR(12)} <br />
     * @param destts The value of the column 'DestTS'. (Nullable)
     */
    public void setDestts(String destts) {
        _modifiedProperties.addPropertyName("destts");
        this._destts = destts;
    }

    /**
     * StateFlags: {VARCHAR(255)} <br />
     * @return The value of the column 'StateFlags'. (Nullable)
     */
    public String getStateflags() {
        return _stateflags;
    }

    /**
     * StateFlags: {VARCHAR(255)} <br />
     * @param stateflags The value of the column 'StateFlags'. (Nullable)
     */
    public void setStateflags(String stateflags) {
        _modifiedProperties.addPropertyName("stateflags");
        this._stateflags = stateflags;
    }

    /**
     * ActionFlags: {VARCHAR(255)} <br />
     * @return The value of the column 'ActionFlags'. (Nullable)
     */
    public String getActionflags() {
        return _actionflags;
    }

    /**
     * ActionFlags: {VARCHAR(255)} <br />
     * @param actionflags The value of the column 'ActionFlags'. (Nullable)
     */
    public void setActionflags(String actionflags) {
        _modifiedProperties.addPropertyName("actionflags");
        this._actionflags = actionflags;
    }

    /**
     * IsSignal: {NotNull : BIT} <br />
     * @return The value of the column 'IsSignal'. (Nullable)
     */
    public Boolean getIssignal() {
        return _issignal;
    }

    /**
     * IsSignal: {NotNull : BIT} <br />
     * @param issignal The value of the column 'IsSignal'. (Nullable)
     */
    public void setIssignal(Boolean issignal) {
        _modifiedProperties.addPropertyName("issignal");
        this._issignal = issignal;
    }

    /**
     * IsStimulus: {NotNull : BIT} <br />
     * @return The value of the column 'IsStimulus'. (Nullable)
     */
    public Boolean getIsstimulus() {
        return _isstimulus;
    }

    /**
     * IsStimulus: {NotNull : BIT} <br />
     * @param isstimulus The value of the column 'IsStimulus'. (Nullable)
     */
    public void setIsstimulus(Boolean isstimulus) {
        _modifiedProperties.addPropertyName("isstimulus");
        this._isstimulus = isstimulus;
    }

    /**
     * DispatchAction: {VARCHAR(255)} <br />
     * @return The value of the column 'DispatchAction'. (Nullable)
     */
    public String getDispatchaction() {
        return _dispatchaction;
    }

    /**
     * DispatchAction: {VARCHAR(255)} <br />
     * @param dispatchaction The value of the column 'DispatchAction'. (Nullable)
     */
    public void setDispatchaction(String dispatchaction) {
        _modifiedProperties.addPropertyName("dispatchaction");
        this._dispatchaction = dispatchaction;
    }

    /**
     * Target2: {INTEGER} <br />
     * @return The value of the column 'Target2'. (Nullable)
     */
    public java.lang.Integer getTarget2() {
        return _target2;
    }

    /**
     * Target2: {INTEGER} <br />
     * @param target2 The value of the column 'Target2'. (Nullable)
     */
    public void setTarget2(java.lang.Integer target2) {
        _modifiedProperties.addPropertyName("target2");
        this._target2 = target2;
    }

    /**
     * StyleEx: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'StyleEx'. (Nullable)
     */
    public String getStyleex() {
        return _styleex;
    }

    /**
     * StyleEx: {LONGCHAR(2147483647)} <br />
     * @param styleex The value of the column 'StyleEx'. (Nullable)
     */
    public void setStyleex(String styleex) {
        _modifiedProperties.addPropertyName("styleex");
        this._styleex = styleex;
    }

    /**
     * SourceStereotype: {VARCHAR(255)} <br />
     * @return The value of the column 'SourceStereotype'. (Nullable)
     */
    public String getSourcestereotype() {
        return _sourcestereotype;
    }

    /**
     * SourceStereotype: {VARCHAR(255)} <br />
     * @param sourcestereotype The value of the column 'SourceStereotype'. (Nullable)
     */
    public void setSourcestereotype(String sourcestereotype) {
        _modifiedProperties.addPropertyName("sourcestereotype");
        this._sourcestereotype = sourcestereotype;
    }

    /**
     * DestStereotype: {VARCHAR(255)} <br />
     * @return The value of the column 'DestStereotype'. (Nullable)
     */
    public String getDeststereotype() {
        return _deststereotype;
    }

    /**
     * DestStereotype: {VARCHAR(255)} <br />
     * @param deststereotype The value of the column 'DestStereotype'. (Nullable)
     */
    public void setDeststereotype(String deststereotype) {
        _modifiedProperties.addPropertyName("deststereotype");
        this._deststereotype = deststereotype;
    }

    /**
     * SourceStyle: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'SourceStyle'. (Nullable)
     */
    public String getSourcestyle() {
        return _sourcestyle;
    }

    /**
     * SourceStyle: {LONGCHAR(2147483647)} <br />
     * @param sourcestyle The value of the column 'SourceStyle'. (Nullable)
     */
    public void setSourcestyle(String sourcestyle) {
        _modifiedProperties.addPropertyName("sourcestyle");
        this._sourcestyle = sourcestyle;
    }

    /**
     * DestStyle: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'DestStyle'. (Nullable)
     */
    public String getDeststyle() {
        return _deststyle;
    }

    /**
     * DestStyle: {LONGCHAR(2147483647)} <br />
     * @param deststyle The value of the column 'DestStyle'. (Nullable)
     */
    public void setDeststyle(String deststyle) {
        _modifiedProperties.addPropertyName("deststyle");
        this._deststyle = deststyle;
    }

    /**
     * EventFlags: {VARCHAR(255)} <br />
     * @return The value of the column 'EventFlags'. (Nullable)
     */
    public String getEventflags() {
        return _eventflags;
    }

    /**
     * EventFlags: {VARCHAR(255)} <br />
     * @param eventflags The value of the column 'EventFlags'. (Nullable)
     */
    public void setEventflags(String eventflags) {
        _modifiedProperties.addPropertyName("eventflags");
        this._eventflags = eventflags;
    }
}
