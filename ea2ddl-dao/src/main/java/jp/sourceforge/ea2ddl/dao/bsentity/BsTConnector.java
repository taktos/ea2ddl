package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_connector(TABLE).
 * <pre>
 * [primary-key]
 *     
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
 *     
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsTConnector implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_connector. */
    public static final String TABLE = "t_connector";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Connector_ID'. {UQ : COUNTER : NotNull} */
    protected java.lang.Integer _connectorId;

    /** The attribute of the column 'Name'. {VARCHAR(255)} */
    protected String _name;

    /** The attribute of the column 'Direction'. {VARCHAR(50)} */
    protected String _direction;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'Connector_Type'. {VARCHAR(50)} */
    protected String _connectorType;

    /** The attribute of the column 'SubType'. {VARCHAR(50)} */
    protected String _subtype;

    /** The attribute of the column 'SourceCard'. {VARCHAR(50)} */
    protected String _sourcecard;

    /** The attribute of the column 'SourceAccess'. {VARCHAR(50)} */
    protected String _sourceaccess;

    /** The attribute of the column 'SourceElement'. {VARCHAR(50)} */
    protected String _sourceelement;

    /** The attribute of the column 'DestCard'. {VARCHAR(50)} */
    protected String _destcard;

    /** The attribute of the column 'DestAccess'. {VARCHAR(50)} */
    protected String _destaccess;

    /** The attribute of the column 'DestElement'. {VARCHAR(50)} */
    protected String _destelement;

    /** The attribute of the column 'SourceRole'. {VARCHAR(255)} */
    protected String _sourcerole;

    /** The attribute of the column 'SourceRoleType'. {VARCHAR(50)} */
    protected String _sourceroletype;

    /** The attribute of the column 'SourceRoleNote'. {LONGCHAR(2147483647)} */
    protected String _sourcerolenote;

    /** The attribute of the column 'SourceContainment'. {VARCHAR(50)} */
    protected String _sourcecontainment;

    /** The attribute of the column 'SourceIsAggregate'. {INTEGER} */
    protected java.lang.Integer _sourceisaggregate;

    /** The attribute of the column 'SourceIsOrdered'. {INTEGER} */
    protected java.lang.Integer _sourceisordered;

    /** The attribute of the column 'SourceQualifier'. {VARCHAR(50)} */
    protected String _sourcequalifier;

    /** The attribute of the column 'DestRole'. {VARCHAR(255)} */
    protected String _destrole;

    /** The attribute of the column 'DestRoleType'. {VARCHAR(50)} */
    protected String _destroletype;

    /** The attribute of the column 'DestRoleNote'. {LONGCHAR(2147483647)} */
    protected String _destrolenote;

    /** The attribute of the column 'DestContainment'. {VARCHAR(50)} */
    protected String _destcontainment;

    /** The attribute of the column 'DestIsAggregate'. {INTEGER} */
    protected java.lang.Integer _destisaggregate;

    /** The attribute of the column 'DestIsOrdered'. {INTEGER} */
    protected java.lang.Integer _destisordered;

    /** The attribute of the column 'DestQualifier'. {VARCHAR(50)} */
    protected String _destqualifier;

    /** The attribute of the column 'Start_Object_ID'. {INTEGER} */
    protected java.lang.Integer _startObjectId;

    /** The attribute of the column 'End_Object_ID'. {INTEGER} */
    protected java.lang.Integer _endObjectId;

    /** The attribute of the column 'Top_Start_Label'. {VARCHAR(50)} */
    protected String _topStartLabel;

    /** The attribute of the column 'Top_Mid_Label'. {VARCHAR(50)} */
    protected String _topMidLabel;

    /** The attribute of the column 'Top_End_Label'. {VARCHAR(50)} */
    protected String _topEndLabel;

    /** The attribute of the column 'Btm_Start_Label'. {VARCHAR(50)} */
    protected String _btmStartLabel;

    /** The attribute of the column 'Btm_Mid_Label'. {VARCHAR(50)} */
    protected String _btmMidLabel;

    /** The attribute of the column 'Btm_End_Label'. {VARCHAR(50)} */
    protected String _btmEndLabel;

    /** The attribute of the column 'Start_Edge'. {INTEGER} */
    protected java.lang.Integer _startEdge;

    /** The attribute of the column 'End_Edge'. {INTEGER} */
    protected java.lang.Integer _endEdge;

    /** The attribute of the column 'PtStartX'. {INTEGER} */
    protected java.lang.Integer _ptstartx;

    /** The attribute of the column 'PtStartY'. {INTEGER} */
    protected java.lang.Integer _ptstarty;

    /** The attribute of the column 'PtEndX'. {INTEGER} */
    protected java.lang.Integer _ptendx;

    /** The attribute of the column 'PtEndY'. {INTEGER} */
    protected java.lang.Integer _ptendy;

    /** The attribute of the column 'SeqNo'. {INTEGER} */
    protected java.lang.Integer _seqno;

    /** The attribute of the column 'HeadStyle'. {INTEGER} */
    protected java.lang.Integer _headstyle;

    /** The attribute of the column 'LineStyle'. {INTEGER} */
    protected java.lang.Integer _linestyle;

    /** The attribute of the column 'RouteStyle'. {INTEGER} */
    protected java.lang.Integer _routestyle;

    /** The attribute of the column 'IsBold'. {INTEGER} */
    protected java.lang.Integer _isbold;

    /** The attribute of the column 'LineColor'. {INTEGER} */
    protected java.lang.Integer _linecolor;

    /** The attribute of the column 'Stereotype'. {VARCHAR(50)} */
    protected String _stereotype;

    /** The attribute of the column 'VirtualInheritance'. {VARCHAR(1)} */
    protected String _virtualinheritance;

    /** The attribute of the column 'LinkAccess'. {VARCHAR(50)} */
    protected String _linkaccess;

    /** The attribute of the column 'PDATA1'. {VARCHAR(255)} */
    protected String _pdata1;

    /** The attribute of the column 'PDATA2'. {VARCHAR(255)} */
    protected String _pdata2;

    /** The attribute of the column 'PDATA3'. {VARCHAR(255)} */
    protected String _pdata3;

    /** The attribute of the column 'PDATA4'. {VARCHAR(255)} */
    protected String _pdata4;

    /** The attribute of the column 'PDATA5'. {VARCHAR(255)} */
    protected String _pdata5;

    /** The attribute of the column 'DiagramID'. {INTEGER} */
    protected java.lang.Integer _diagramid;

    /** The attribute of the column 'ea_guid'. {UQ : VARCHAR(40)} */
    protected String _eaGuid;

    /** The attribute of the column 'SourceConstraint'. {VARCHAR(255)} */
    protected String _sourceconstraint;

    /** The attribute of the column 'DestConstraint'. {VARCHAR(255)} */
    protected String _destconstraint;

    /** The attribute of the column 'SourceIsNavigable'. {BIT : NotNull} */
    protected Boolean _sourceisnavigable;

    /** The attribute of the column 'DestIsNavigable'. {BIT : NotNull} */
    protected Boolean _destisnavigable;

    /** The attribute of the column 'IsRoot'. {BIT : NotNull} */
    protected Boolean _isroot;

    /** The attribute of the column 'IsLeaf'. {BIT : NotNull} */
    protected Boolean _isleaf;

    /** The attribute of the column 'IsSpec'. {BIT : NotNull} */
    protected Boolean _isspec;

    /** The attribute of the column 'SourceChangeable'. {VARCHAR(12)} */
    protected String _sourcechangeable;

    /** The attribute of the column 'DestChangeable'. {VARCHAR(12)} */
    protected String _destchangeable;

    /** The attribute of the column 'SourceTS'. {VARCHAR(12)} */
    protected String _sourcets;

    /** The attribute of the column 'DestTS'. {VARCHAR(12)} */
    protected String _destts;

    /** The attribute of the column 'StateFlags'. {VARCHAR(255)} */
    protected String _stateflags;

    /** The attribute of the column 'ActionFlags'. {VARCHAR(255)} */
    protected String _actionflags;

    /** The attribute of the column 'IsSignal'. {BIT : NotNull} */
    protected Boolean _issignal;

    /** The attribute of the column 'IsStimulus'. {BIT : NotNull} */
    protected Boolean _isstimulus;

    /** The attribute of the column 'DispatchAction'. {VARCHAR(255)} */
    protected String _dispatchaction;

    /** The attribute of the column 'Target2'. {INTEGER} */
    protected java.lang.Integer _target2;

    /** The attribute of the column 'StyleEx'. {LONGCHAR(2147483647)} */
    protected String _styleex;

    /** The attribute of the column 'SourceStereotype'. {VARCHAR(255)} */
    protected String _sourcestereotype;

    /** The attribute of the column 'DestStereotype'. {VARCHAR(255)} */
    protected String _deststereotype;

    /** The attribute of the column 'SourceStyle'. {LONGCHAR(2147483647)} */
    protected String _sourcestyle;

    /** The attribute of the column 'DestStyle'. {LONGCHAR(2147483647)} */
    protected String _deststyle;

    /** The attribute of the column 'EventFlags'. {VARCHAR(255)} */
    protected String _eventflags;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTConnector() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_connector";
    }

    public String getTablePropertyName() {// as JavaBeansRule
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        return false;
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
     * If the all-column value of the other is same as this one, returns true.
     * @param other Other entity. (Nullable)
     * @return Comparing result. If other is null, returns false.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTConnector)) { return false; }
        final BsTConnector otherEntity = (BsTConnector)other;
        if (!helpComparingValue(getConnectorId(), otherEntity.getConnectorId())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getDirection(), otherEntity.getDirection())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getConnectorType(), otherEntity.getConnectorType())) { return false; }
        if (!helpComparingValue(getSubtype(), otherEntity.getSubtype())) { return false; }
        if (!helpComparingValue(getSourcecard(), otherEntity.getSourcecard())) { return false; }
        if (!helpComparingValue(getSourceaccess(), otherEntity.getSourceaccess())) { return false; }
        if (!helpComparingValue(getSourceelement(), otherEntity.getSourceelement())) { return false; }
        if (!helpComparingValue(getDestcard(), otherEntity.getDestcard())) { return false; }
        if (!helpComparingValue(getDestaccess(), otherEntity.getDestaccess())) { return false; }
        if (!helpComparingValue(getDestelement(), otherEntity.getDestelement())) { return false; }
        if (!helpComparingValue(getSourcerole(), otherEntity.getSourcerole())) { return false; }
        if (!helpComparingValue(getSourceroletype(), otherEntity.getSourceroletype())) { return false; }
        if (!helpComparingValue(getSourcerolenote(), otherEntity.getSourcerolenote())) { return false; }
        if (!helpComparingValue(getSourcecontainment(), otherEntity.getSourcecontainment())) { return false; }
        if (!helpComparingValue(getSourceisaggregate(), otherEntity.getSourceisaggregate())) { return false; }
        if (!helpComparingValue(getSourceisordered(), otherEntity.getSourceisordered())) { return false; }
        if (!helpComparingValue(getSourcequalifier(), otherEntity.getSourcequalifier())) { return false; }
        if (!helpComparingValue(getDestrole(), otherEntity.getDestrole())) { return false; }
        if (!helpComparingValue(getDestroletype(), otherEntity.getDestroletype())) { return false; }
        if (!helpComparingValue(getDestrolenote(), otherEntity.getDestrolenote())) { return false; }
        if (!helpComparingValue(getDestcontainment(), otherEntity.getDestcontainment())) { return false; }
        if (!helpComparingValue(getDestisaggregate(), otherEntity.getDestisaggregate())) { return false; }
        if (!helpComparingValue(getDestisordered(), otherEntity.getDestisordered())) { return false; }
        if (!helpComparingValue(getDestqualifier(), otherEntity.getDestqualifier())) { return false; }
        if (!helpComparingValue(getStartObjectId(), otherEntity.getStartObjectId())) { return false; }
        if (!helpComparingValue(getEndObjectId(), otherEntity.getEndObjectId())) { return false; }
        if (!helpComparingValue(getTopStartLabel(), otherEntity.getTopStartLabel())) { return false; }
        if (!helpComparingValue(getTopMidLabel(), otherEntity.getTopMidLabel())) { return false; }
        if (!helpComparingValue(getTopEndLabel(), otherEntity.getTopEndLabel())) { return false; }
        if (!helpComparingValue(getBtmStartLabel(), otherEntity.getBtmStartLabel())) { return false; }
        if (!helpComparingValue(getBtmMidLabel(), otherEntity.getBtmMidLabel())) { return false; }
        if (!helpComparingValue(getBtmEndLabel(), otherEntity.getBtmEndLabel())) { return false; }
        if (!helpComparingValue(getStartEdge(), otherEntity.getStartEdge())) { return false; }
        if (!helpComparingValue(getEndEdge(), otherEntity.getEndEdge())) { return false; }
        if (!helpComparingValue(getPtstartx(), otherEntity.getPtstartx())) { return false; }
        if (!helpComparingValue(getPtstarty(), otherEntity.getPtstarty())) { return false; }
        if (!helpComparingValue(getPtendx(), otherEntity.getPtendx())) { return false; }
        if (!helpComparingValue(getPtendy(), otherEntity.getPtendy())) { return false; }
        if (!helpComparingValue(getSeqno(), otherEntity.getSeqno())) { return false; }
        if (!helpComparingValue(getHeadstyle(), otherEntity.getHeadstyle())) { return false; }
        if (!helpComparingValue(getLinestyle(), otherEntity.getLinestyle())) { return false; }
        if (!helpComparingValue(getRoutestyle(), otherEntity.getRoutestyle())) { return false; }
        if (!helpComparingValue(getIsbold(), otherEntity.getIsbold())) { return false; }
        if (!helpComparingValue(getLinecolor(), otherEntity.getLinecolor())) { return false; }
        if (!helpComparingValue(getStereotype(), otherEntity.getStereotype())) { return false; }
        if (!helpComparingValue(getVirtualinheritance(), otherEntity.getVirtualinheritance())) { return false; }
        if (!helpComparingValue(getLinkaccess(), otherEntity.getLinkaccess())) { return false; }
        if (!helpComparingValue(getPdata1(), otherEntity.getPdata1())) { return false; }
        if (!helpComparingValue(getPdata2(), otherEntity.getPdata2())) { return false; }
        if (!helpComparingValue(getPdata3(), otherEntity.getPdata3())) { return false; }
        if (!helpComparingValue(getPdata4(), otherEntity.getPdata4())) { return false; }
        if (!helpComparingValue(getPdata5(), otherEntity.getPdata5())) { return false; }
        if (!helpComparingValue(getDiagramid(), otherEntity.getDiagramid())) { return false; }
        if (!helpComparingValue(getEaGuid(), otherEntity.getEaGuid())) { return false; }
        if (!helpComparingValue(getSourceconstraint(), otherEntity.getSourceconstraint())) { return false; }
        if (!helpComparingValue(getDestconstraint(), otherEntity.getDestconstraint())) { return false; }
        if (!helpComparingValue(getSourceisnavigable(), otherEntity.getSourceisnavigable())) { return false; }
        if (!helpComparingValue(getDestisnavigable(), otherEntity.getDestisnavigable())) { return false; }
        if (!helpComparingValue(getIsroot(), otherEntity.getIsroot())) { return false; }
        if (!helpComparingValue(getIsleaf(), otherEntity.getIsleaf())) { return false; }
        if (!helpComparingValue(getIsspec(), otherEntity.getIsspec())) { return false; }
        if (!helpComparingValue(getSourcechangeable(), otherEntity.getSourcechangeable())) { return false; }
        if (!helpComparingValue(getDestchangeable(), otherEntity.getDestchangeable())) { return false; }
        if (!helpComparingValue(getSourcets(), otherEntity.getSourcets())) { return false; }
        if (!helpComparingValue(getDestts(), otherEntity.getDestts())) { return false; }
        if (!helpComparingValue(getStateflags(), otherEntity.getStateflags())) { return false; }
        if (!helpComparingValue(getActionflags(), otherEntity.getActionflags())) { return false; }
        if (!helpComparingValue(getIssignal(), otherEntity.getIssignal())) { return false; }
        if (!helpComparingValue(getIsstimulus(), otherEntity.getIsstimulus())) { return false; }
        if (!helpComparingValue(getDispatchaction(), otherEntity.getDispatchaction())) { return false; }
        if (!helpComparingValue(getTarget2(), otherEntity.getTarget2())) { return false; }
        if (!helpComparingValue(getStyleex(), otherEntity.getStyleex())) { return false; }
        if (!helpComparingValue(getSourcestereotype(), otherEntity.getSourcestereotype())) { return false; }
        if (!helpComparingValue(getDeststereotype(), otherEntity.getDeststereotype())) { return false; }
        if (!helpComparingValue(getSourcestyle(), otherEntity.getSourcestyle())) { return false; }
        if (!helpComparingValue(getDeststyle(), otherEntity.getDeststyle())) { return false; }
        if (!helpComparingValue(getEventflags(), otherEntity.getEventflags())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * Calculates hash-code from all columns.
     * @return Hash-code from all-columns.
     */
    public int hashCode() {
        int result = 17;
        if (this.getConnectorId() != null) { result = result + this.getConnectorId().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getDirection() != null) { result = result + this.getDirection().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getConnectorType() != null) { result = result + this.getConnectorType().hashCode(); }
        if (this.getSubtype() != null) { result = result + this.getSubtype().hashCode(); }
        if (this.getSourcecard() != null) { result = result + this.getSourcecard().hashCode(); }
        if (this.getSourceaccess() != null) { result = result + this.getSourceaccess().hashCode(); }
        if (this.getSourceelement() != null) { result = result + this.getSourceelement().hashCode(); }
        if (this.getDestcard() != null) { result = result + this.getDestcard().hashCode(); }
        if (this.getDestaccess() != null) { result = result + this.getDestaccess().hashCode(); }
        if (this.getDestelement() != null) { result = result + this.getDestelement().hashCode(); }
        if (this.getSourcerole() != null) { result = result + this.getSourcerole().hashCode(); }
        if (this.getSourceroletype() != null) { result = result + this.getSourceroletype().hashCode(); }
        if (this.getSourcerolenote() != null) { result = result + this.getSourcerolenote().hashCode(); }
        if (this.getSourcecontainment() != null) { result = result + this.getSourcecontainment().hashCode(); }
        if (this.getSourceisaggregate() != null) { result = result + this.getSourceisaggregate().hashCode(); }
        if (this.getSourceisordered() != null) { result = result + this.getSourceisordered().hashCode(); }
        if (this.getSourcequalifier() != null) { result = result + this.getSourcequalifier().hashCode(); }
        if (this.getDestrole() != null) { result = result + this.getDestrole().hashCode(); }
        if (this.getDestroletype() != null) { result = result + this.getDestroletype().hashCode(); }
        if (this.getDestrolenote() != null) { result = result + this.getDestrolenote().hashCode(); }
        if (this.getDestcontainment() != null) { result = result + this.getDestcontainment().hashCode(); }
        if (this.getDestisaggregate() != null) { result = result + this.getDestisaggregate().hashCode(); }
        if (this.getDestisordered() != null) { result = result + this.getDestisordered().hashCode(); }
        if (this.getDestqualifier() != null) { result = result + this.getDestqualifier().hashCode(); }
        if (this.getStartObjectId() != null) { result = result + this.getStartObjectId().hashCode(); }
        if (this.getEndObjectId() != null) { result = result + this.getEndObjectId().hashCode(); }
        if (this.getTopStartLabel() != null) { result = result + this.getTopStartLabel().hashCode(); }
        if (this.getTopMidLabel() != null) { result = result + this.getTopMidLabel().hashCode(); }
        if (this.getTopEndLabel() != null) { result = result + this.getTopEndLabel().hashCode(); }
        if (this.getBtmStartLabel() != null) { result = result + this.getBtmStartLabel().hashCode(); }
        if (this.getBtmMidLabel() != null) { result = result + this.getBtmMidLabel().hashCode(); }
        if (this.getBtmEndLabel() != null) { result = result + this.getBtmEndLabel().hashCode(); }
        if (this.getStartEdge() != null) { result = result + this.getStartEdge().hashCode(); }
        if (this.getEndEdge() != null) { result = result + this.getEndEdge().hashCode(); }
        if (this.getPtstartx() != null) { result = result + this.getPtstartx().hashCode(); }
        if (this.getPtstarty() != null) { result = result + this.getPtstarty().hashCode(); }
        if (this.getPtendx() != null) { result = result + this.getPtendx().hashCode(); }
        if (this.getPtendy() != null) { result = result + this.getPtendy().hashCode(); }
        if (this.getSeqno() != null) { result = result + this.getSeqno().hashCode(); }
        if (this.getHeadstyle() != null) { result = result + this.getHeadstyle().hashCode(); }
        if (this.getLinestyle() != null) { result = result + this.getLinestyle().hashCode(); }
        if (this.getRoutestyle() != null) { result = result + this.getRoutestyle().hashCode(); }
        if (this.getIsbold() != null) { result = result + this.getIsbold().hashCode(); }
        if (this.getLinecolor() != null) { result = result + this.getLinecolor().hashCode(); }
        if (this.getStereotype() != null) { result = result + this.getStereotype().hashCode(); }
        if (this.getVirtualinheritance() != null) { result = result + this.getVirtualinheritance().hashCode(); }
        if (this.getLinkaccess() != null) { result = result + this.getLinkaccess().hashCode(); }
        if (this.getPdata1() != null) { result = result + this.getPdata1().hashCode(); }
        if (this.getPdata2() != null) { result = result + this.getPdata2().hashCode(); }
        if (this.getPdata3() != null) { result = result + this.getPdata3().hashCode(); }
        if (this.getPdata4() != null) { result = result + this.getPdata4().hashCode(); }
        if (this.getPdata5() != null) { result = result + this.getPdata5().hashCode(); }
        if (this.getDiagramid() != null) { result = result + this.getDiagramid().hashCode(); }
        if (this.getEaGuid() != null) { result = result + this.getEaGuid().hashCode(); }
        if (this.getSourceconstraint() != null) { result = result + this.getSourceconstraint().hashCode(); }
        if (this.getDestconstraint() != null) { result = result + this.getDestconstraint().hashCode(); }
        if (this.getSourceisnavigable() != null) { result = result + this.getSourceisnavigable().hashCode(); }
        if (this.getDestisnavigable() != null) { result = result + this.getDestisnavigable().hashCode(); }
        if (this.getIsroot() != null) { result = result + this.getIsroot().hashCode(); }
        if (this.getIsleaf() != null) { result = result + this.getIsleaf().hashCode(); }
        if (this.getIsspec() != null) { result = result + this.getIsspec().hashCode(); }
        if (this.getSourcechangeable() != null) { result = result + this.getSourcechangeable().hashCode(); }
        if (this.getDestchangeable() != null) { result = result + this.getDestchangeable().hashCode(); }
        if (this.getSourcets() != null) { result = result + this.getSourcets().hashCode(); }
        if (this.getDestts() != null) { result = result + this.getDestts().hashCode(); }
        if (this.getStateflags() != null) { result = result + this.getStateflags().hashCode(); }
        if (this.getActionflags() != null) { result = result + this.getActionflags().hashCode(); }
        if (this.getIssignal() != null) { result = result + this.getIssignal().hashCode(); }
        if (this.getIsstimulus() != null) { result = result + this.getIsstimulus().hashCode(); }
        if (this.getDispatchaction() != null) { result = result + this.getDispatchaction().hashCode(); }
        if (this.getTarget2() != null) { result = result + this.getTarget2().hashCode(); }
        if (this.getStyleex() != null) { result = result + this.getStyleex().hashCode(); }
        if (this.getSourcestereotype() != null) { result = result + this.getSourcestereotype().hashCode(); }
        if (this.getDeststereotype() != null) { result = result + this.getDeststereotype().hashCode(); }
        if (this.getSourcestyle() != null) { result = result + this.getSourcestyle().hashCode(); }
        if (this.getDeststyle() != null) { result = result + this.getDeststyle().hashCode(); }
        if (this.getEventflags() != null) { result = result + this.getEventflags().hashCode(); }
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

    /** The column annotation for S2Dao. {UQ : COUNTER : NotNull} */
    public static final String connectorId_COLUMN = "Connector_ID";

    /**
     * Get the value of the column 'Connector_ID'. <br />
     * {UQ : COUNTER : NotNull}
     * @return The value of the column 'Connector_ID'. (Nullable)
     */
    public java.lang.Integer getConnectorId() {
        return _connectorId;
    }

    /**
     * Set the value of the column 'Connector_ID'. <br />
     * {UQ : COUNTER : NotNull}
     * @param connectorId The value of the column 'Connector_ID'. (Nullable)
     */
    public void setConnectorId(java.lang.Integer connectorId) {
        _modifiedProperties.addPropertyName("connectorId");
        this._connectorId = connectorId;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String name_COLUMN = "Name";

    /**
     * Get the value of the column 'Name'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Set the value of the column 'Name'. <br />
     * {VARCHAR(255)}
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String direction_COLUMN = "Direction";

    /**
     * Get the value of the column 'Direction'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Direction'. (Nullable)
     */
    public String getDirection() {
        return _direction;
    }

    /**
     * Set the value of the column 'Direction'. <br />
     * {VARCHAR(50)}
     * @param direction The value of the column 'Direction'. (Nullable)
     */
    public void setDirection(String direction) {
        _modifiedProperties.addPropertyName("direction");
        this._direction = direction;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String notes_COLUMN = "Notes";

    /**
     * Get the value of the column 'Notes'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Notes'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * Set the value of the column 'Notes'. <br />
     * {LONGCHAR(2147483647)}
     * @param notes The value of the column 'Notes'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String connectorType_COLUMN = "Connector_Type";

    /**
     * Get the value of the column 'Connector_Type'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Connector_Type'. (Nullable)
     */
    public String getConnectorType() {
        return _connectorType;
    }

    /**
     * Set the value of the column 'Connector_Type'. <br />
     * {VARCHAR(50)}
     * @param connectorType The value of the column 'Connector_Type'. (Nullable)
     */
    public void setConnectorType(String connectorType) {
        _modifiedProperties.addPropertyName("connectorType");
        this._connectorType = connectorType;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String subtype_COLUMN = "SubType";

    /**
     * Get the value of the column 'SubType'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'SubType'. (Nullable)
     */
    public String getSubtype() {
        return _subtype;
    }

    /**
     * Set the value of the column 'SubType'. <br />
     * {VARCHAR(50)}
     * @param subtype The value of the column 'SubType'. (Nullable)
     */
    public void setSubtype(String subtype) {
        _modifiedProperties.addPropertyName("subtype");
        this._subtype = subtype;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String sourcecard_COLUMN = "SourceCard";

    /**
     * Get the value of the column 'SourceCard'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'SourceCard'. (Nullable)
     */
    public String getSourcecard() {
        return _sourcecard;
    }

    /**
     * Set the value of the column 'SourceCard'. <br />
     * {VARCHAR(50)}
     * @param sourcecard The value of the column 'SourceCard'. (Nullable)
     */
    public void setSourcecard(String sourcecard) {
        _modifiedProperties.addPropertyName("sourcecard");
        this._sourcecard = sourcecard;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String sourceaccess_COLUMN = "SourceAccess";

    /**
     * Get the value of the column 'SourceAccess'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'SourceAccess'. (Nullable)
     */
    public String getSourceaccess() {
        return _sourceaccess;
    }

    /**
     * Set the value of the column 'SourceAccess'. <br />
     * {VARCHAR(50)}
     * @param sourceaccess The value of the column 'SourceAccess'. (Nullable)
     */
    public void setSourceaccess(String sourceaccess) {
        _modifiedProperties.addPropertyName("sourceaccess");
        this._sourceaccess = sourceaccess;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String sourceelement_COLUMN = "SourceElement";

    /**
     * Get the value of the column 'SourceElement'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'SourceElement'. (Nullable)
     */
    public String getSourceelement() {
        return _sourceelement;
    }

    /**
     * Set the value of the column 'SourceElement'. <br />
     * {VARCHAR(50)}
     * @param sourceelement The value of the column 'SourceElement'. (Nullable)
     */
    public void setSourceelement(String sourceelement) {
        _modifiedProperties.addPropertyName("sourceelement");
        this._sourceelement = sourceelement;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String destcard_COLUMN = "DestCard";

    /**
     * Get the value of the column 'DestCard'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'DestCard'. (Nullable)
     */
    public String getDestcard() {
        return _destcard;
    }

    /**
     * Set the value of the column 'DestCard'. <br />
     * {VARCHAR(50)}
     * @param destcard The value of the column 'DestCard'. (Nullable)
     */
    public void setDestcard(String destcard) {
        _modifiedProperties.addPropertyName("destcard");
        this._destcard = destcard;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String destaccess_COLUMN = "DestAccess";

    /**
     * Get the value of the column 'DestAccess'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'DestAccess'. (Nullable)
     */
    public String getDestaccess() {
        return _destaccess;
    }

    /**
     * Set the value of the column 'DestAccess'. <br />
     * {VARCHAR(50)}
     * @param destaccess The value of the column 'DestAccess'. (Nullable)
     */
    public void setDestaccess(String destaccess) {
        _modifiedProperties.addPropertyName("destaccess");
        this._destaccess = destaccess;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String destelement_COLUMN = "DestElement";

    /**
     * Get the value of the column 'DestElement'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'DestElement'. (Nullable)
     */
    public String getDestelement() {
        return _destelement;
    }

    /**
     * Set the value of the column 'DestElement'. <br />
     * {VARCHAR(50)}
     * @param destelement The value of the column 'DestElement'. (Nullable)
     */
    public void setDestelement(String destelement) {
        _modifiedProperties.addPropertyName("destelement");
        this._destelement = destelement;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String sourcerole_COLUMN = "SourceRole";

    /**
     * Get the value of the column 'SourceRole'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'SourceRole'. (Nullable)
     */
    public String getSourcerole() {
        return _sourcerole;
    }

    /**
     * Set the value of the column 'SourceRole'. <br />
     * {VARCHAR(255)}
     * @param sourcerole The value of the column 'SourceRole'. (Nullable)
     */
    public void setSourcerole(String sourcerole) {
        _modifiedProperties.addPropertyName("sourcerole");
        this._sourcerole = sourcerole;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String sourceroletype_COLUMN = "SourceRoleType";

    /**
     * Get the value of the column 'SourceRoleType'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'SourceRoleType'. (Nullable)
     */
    public String getSourceroletype() {
        return _sourceroletype;
    }

    /**
     * Set the value of the column 'SourceRoleType'. <br />
     * {VARCHAR(50)}
     * @param sourceroletype The value of the column 'SourceRoleType'. (Nullable)
     */
    public void setSourceroletype(String sourceroletype) {
        _modifiedProperties.addPropertyName("sourceroletype");
        this._sourceroletype = sourceroletype;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String sourcerolenote_COLUMN = "SourceRoleNote";

    /**
     * Get the value of the column 'SourceRoleNote'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'SourceRoleNote'. (Nullable)
     */
    public String getSourcerolenote() {
        return _sourcerolenote;
    }

    /**
     * Set the value of the column 'SourceRoleNote'. <br />
     * {LONGCHAR(2147483647)}
     * @param sourcerolenote The value of the column 'SourceRoleNote'. (Nullable)
     */
    public void setSourcerolenote(String sourcerolenote) {
        _modifiedProperties.addPropertyName("sourcerolenote");
        this._sourcerolenote = sourcerolenote;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String sourcecontainment_COLUMN = "SourceContainment";

    /**
     * Get the value of the column 'SourceContainment'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'SourceContainment'. (Nullable)
     */
    public String getSourcecontainment() {
        return _sourcecontainment;
    }

    /**
     * Set the value of the column 'SourceContainment'. <br />
     * {VARCHAR(50)}
     * @param sourcecontainment The value of the column 'SourceContainment'. (Nullable)
     */
    public void setSourcecontainment(String sourcecontainment) {
        _modifiedProperties.addPropertyName("sourcecontainment");
        this._sourcecontainment = sourcecontainment;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String sourceisaggregate_COLUMN = "SourceIsAggregate";

    /**
     * Get the value of the column 'SourceIsAggregate'. <br />
     * {INTEGER}
     * @return The value of the column 'SourceIsAggregate'. (Nullable)
     */
    public java.lang.Integer getSourceisaggregate() {
        return _sourceisaggregate;
    }

    /**
     * Set the value of the column 'SourceIsAggregate'. <br />
     * {INTEGER}
     * @param sourceisaggregate The value of the column 'SourceIsAggregate'. (Nullable)
     */
    public void setSourceisaggregate(java.lang.Integer sourceisaggregate) {
        _modifiedProperties.addPropertyName("sourceisaggregate");
        this._sourceisaggregate = sourceisaggregate;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String sourceisordered_COLUMN = "SourceIsOrdered";

    /**
     * Get the value of the column 'SourceIsOrdered'. <br />
     * {INTEGER}
     * @return The value of the column 'SourceIsOrdered'. (Nullable)
     */
    public java.lang.Integer getSourceisordered() {
        return _sourceisordered;
    }

    /**
     * Set the value of the column 'SourceIsOrdered'. <br />
     * {INTEGER}
     * @param sourceisordered The value of the column 'SourceIsOrdered'. (Nullable)
     */
    public void setSourceisordered(java.lang.Integer sourceisordered) {
        _modifiedProperties.addPropertyName("sourceisordered");
        this._sourceisordered = sourceisordered;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String sourcequalifier_COLUMN = "SourceQualifier";

    /**
     * Get the value of the column 'SourceQualifier'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'SourceQualifier'. (Nullable)
     */
    public String getSourcequalifier() {
        return _sourcequalifier;
    }

    /**
     * Set the value of the column 'SourceQualifier'. <br />
     * {VARCHAR(50)}
     * @param sourcequalifier The value of the column 'SourceQualifier'. (Nullable)
     */
    public void setSourcequalifier(String sourcequalifier) {
        _modifiedProperties.addPropertyName("sourcequalifier");
        this._sourcequalifier = sourcequalifier;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String destrole_COLUMN = "DestRole";

    /**
     * Get the value of the column 'DestRole'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'DestRole'. (Nullable)
     */
    public String getDestrole() {
        return _destrole;
    }

    /**
     * Set the value of the column 'DestRole'. <br />
     * {VARCHAR(255)}
     * @param destrole The value of the column 'DestRole'. (Nullable)
     */
    public void setDestrole(String destrole) {
        _modifiedProperties.addPropertyName("destrole");
        this._destrole = destrole;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String destroletype_COLUMN = "DestRoleType";

    /**
     * Get the value of the column 'DestRoleType'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'DestRoleType'. (Nullable)
     */
    public String getDestroletype() {
        return _destroletype;
    }

    /**
     * Set the value of the column 'DestRoleType'. <br />
     * {VARCHAR(50)}
     * @param destroletype The value of the column 'DestRoleType'. (Nullable)
     */
    public void setDestroletype(String destroletype) {
        _modifiedProperties.addPropertyName("destroletype");
        this._destroletype = destroletype;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String destrolenote_COLUMN = "DestRoleNote";

    /**
     * Get the value of the column 'DestRoleNote'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'DestRoleNote'. (Nullable)
     */
    public String getDestrolenote() {
        return _destrolenote;
    }

    /**
     * Set the value of the column 'DestRoleNote'. <br />
     * {LONGCHAR(2147483647)}
     * @param destrolenote The value of the column 'DestRoleNote'. (Nullable)
     */
    public void setDestrolenote(String destrolenote) {
        _modifiedProperties.addPropertyName("destrolenote");
        this._destrolenote = destrolenote;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String destcontainment_COLUMN = "DestContainment";

    /**
     * Get the value of the column 'DestContainment'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'DestContainment'. (Nullable)
     */
    public String getDestcontainment() {
        return _destcontainment;
    }

    /**
     * Set the value of the column 'DestContainment'. <br />
     * {VARCHAR(50)}
     * @param destcontainment The value of the column 'DestContainment'. (Nullable)
     */
    public void setDestcontainment(String destcontainment) {
        _modifiedProperties.addPropertyName("destcontainment");
        this._destcontainment = destcontainment;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String destisaggregate_COLUMN = "DestIsAggregate";

    /**
     * Get the value of the column 'DestIsAggregate'. <br />
     * {INTEGER}
     * @return The value of the column 'DestIsAggregate'. (Nullable)
     */
    public java.lang.Integer getDestisaggregate() {
        return _destisaggregate;
    }

    /**
     * Set the value of the column 'DestIsAggregate'. <br />
     * {INTEGER}
     * @param destisaggregate The value of the column 'DestIsAggregate'. (Nullable)
     */
    public void setDestisaggregate(java.lang.Integer destisaggregate) {
        _modifiedProperties.addPropertyName("destisaggregate");
        this._destisaggregate = destisaggregate;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String destisordered_COLUMN = "DestIsOrdered";

    /**
     * Get the value of the column 'DestIsOrdered'. <br />
     * {INTEGER}
     * @return The value of the column 'DestIsOrdered'. (Nullable)
     */
    public java.lang.Integer getDestisordered() {
        return _destisordered;
    }

    /**
     * Set the value of the column 'DestIsOrdered'. <br />
     * {INTEGER}
     * @param destisordered The value of the column 'DestIsOrdered'. (Nullable)
     */
    public void setDestisordered(java.lang.Integer destisordered) {
        _modifiedProperties.addPropertyName("destisordered");
        this._destisordered = destisordered;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String destqualifier_COLUMN = "DestQualifier";

    /**
     * Get the value of the column 'DestQualifier'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'DestQualifier'. (Nullable)
     */
    public String getDestqualifier() {
        return _destqualifier;
    }

    /**
     * Set the value of the column 'DestQualifier'. <br />
     * {VARCHAR(50)}
     * @param destqualifier The value of the column 'DestQualifier'. (Nullable)
     */
    public void setDestqualifier(String destqualifier) {
        _modifiedProperties.addPropertyName("destqualifier");
        this._destqualifier = destqualifier;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String startObjectId_COLUMN = "Start_Object_ID";

    /**
     * Get the value of the column 'Start_Object_ID'. <br />
     * {INTEGER}
     * @return The value of the column 'Start_Object_ID'. (Nullable)
     */
    public java.lang.Integer getStartObjectId() {
        return _startObjectId;
    }

    /**
     * Set the value of the column 'Start_Object_ID'. <br />
     * {INTEGER}
     * @param startObjectId The value of the column 'Start_Object_ID'. (Nullable)
     */
    public void setStartObjectId(java.lang.Integer startObjectId) {
        _modifiedProperties.addPropertyName("startObjectId");
        this._startObjectId = startObjectId;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String endObjectId_COLUMN = "End_Object_ID";

    /**
     * Get the value of the column 'End_Object_ID'. <br />
     * {INTEGER}
     * @return The value of the column 'End_Object_ID'. (Nullable)
     */
    public java.lang.Integer getEndObjectId() {
        return _endObjectId;
    }

    /**
     * Set the value of the column 'End_Object_ID'. <br />
     * {INTEGER}
     * @param endObjectId The value of the column 'End_Object_ID'. (Nullable)
     */
    public void setEndObjectId(java.lang.Integer endObjectId) {
        _modifiedProperties.addPropertyName("endObjectId");
        this._endObjectId = endObjectId;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String topStartLabel_COLUMN = "Top_Start_Label";

    /**
     * Get the value of the column 'Top_Start_Label'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Top_Start_Label'. (Nullable)
     */
    public String getTopStartLabel() {
        return _topStartLabel;
    }

    /**
     * Set the value of the column 'Top_Start_Label'. <br />
     * {VARCHAR(50)}
     * @param topStartLabel The value of the column 'Top_Start_Label'. (Nullable)
     */
    public void setTopStartLabel(String topStartLabel) {
        _modifiedProperties.addPropertyName("topStartLabel");
        this._topStartLabel = topStartLabel;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String topMidLabel_COLUMN = "Top_Mid_Label";

    /**
     * Get the value of the column 'Top_Mid_Label'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Top_Mid_Label'. (Nullable)
     */
    public String getTopMidLabel() {
        return _topMidLabel;
    }

    /**
     * Set the value of the column 'Top_Mid_Label'. <br />
     * {VARCHAR(50)}
     * @param topMidLabel The value of the column 'Top_Mid_Label'. (Nullable)
     */
    public void setTopMidLabel(String topMidLabel) {
        _modifiedProperties.addPropertyName("topMidLabel");
        this._topMidLabel = topMidLabel;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String topEndLabel_COLUMN = "Top_End_Label";

    /**
     * Get the value of the column 'Top_End_Label'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Top_End_Label'. (Nullable)
     */
    public String getTopEndLabel() {
        return _topEndLabel;
    }

    /**
     * Set the value of the column 'Top_End_Label'. <br />
     * {VARCHAR(50)}
     * @param topEndLabel The value of the column 'Top_End_Label'. (Nullable)
     */
    public void setTopEndLabel(String topEndLabel) {
        _modifiedProperties.addPropertyName("topEndLabel");
        this._topEndLabel = topEndLabel;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String btmStartLabel_COLUMN = "Btm_Start_Label";

    /**
     * Get the value of the column 'Btm_Start_Label'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Btm_Start_Label'. (Nullable)
     */
    public String getBtmStartLabel() {
        return _btmStartLabel;
    }

    /**
     * Set the value of the column 'Btm_Start_Label'. <br />
     * {VARCHAR(50)}
     * @param btmStartLabel The value of the column 'Btm_Start_Label'. (Nullable)
     */
    public void setBtmStartLabel(String btmStartLabel) {
        _modifiedProperties.addPropertyName("btmStartLabel");
        this._btmStartLabel = btmStartLabel;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String btmMidLabel_COLUMN = "Btm_Mid_Label";

    /**
     * Get the value of the column 'Btm_Mid_Label'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Btm_Mid_Label'. (Nullable)
     */
    public String getBtmMidLabel() {
        return _btmMidLabel;
    }

    /**
     * Set the value of the column 'Btm_Mid_Label'. <br />
     * {VARCHAR(50)}
     * @param btmMidLabel The value of the column 'Btm_Mid_Label'. (Nullable)
     */
    public void setBtmMidLabel(String btmMidLabel) {
        _modifiedProperties.addPropertyName("btmMidLabel");
        this._btmMidLabel = btmMidLabel;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String btmEndLabel_COLUMN = "Btm_End_Label";

    /**
     * Get the value of the column 'Btm_End_Label'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Btm_End_Label'. (Nullable)
     */
    public String getBtmEndLabel() {
        return _btmEndLabel;
    }

    /**
     * Set the value of the column 'Btm_End_Label'. <br />
     * {VARCHAR(50)}
     * @param btmEndLabel The value of the column 'Btm_End_Label'. (Nullable)
     */
    public void setBtmEndLabel(String btmEndLabel) {
        _modifiedProperties.addPropertyName("btmEndLabel");
        this._btmEndLabel = btmEndLabel;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String startEdge_COLUMN = "Start_Edge";

    /**
     * Get the value of the column 'Start_Edge'. <br />
     * {INTEGER}
     * @return The value of the column 'Start_Edge'. (Nullable)
     */
    public java.lang.Integer getStartEdge() {
        return _startEdge;
    }

    /**
     * Set the value of the column 'Start_Edge'. <br />
     * {INTEGER}
     * @param startEdge The value of the column 'Start_Edge'. (Nullable)
     */
    public void setStartEdge(java.lang.Integer startEdge) {
        _modifiedProperties.addPropertyName("startEdge");
        this._startEdge = startEdge;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String endEdge_COLUMN = "End_Edge";

    /**
     * Get the value of the column 'End_Edge'. <br />
     * {INTEGER}
     * @return The value of the column 'End_Edge'. (Nullable)
     */
    public java.lang.Integer getEndEdge() {
        return _endEdge;
    }

    /**
     * Set the value of the column 'End_Edge'. <br />
     * {INTEGER}
     * @param endEdge The value of the column 'End_Edge'. (Nullable)
     */
    public void setEndEdge(java.lang.Integer endEdge) {
        _modifiedProperties.addPropertyName("endEdge");
        this._endEdge = endEdge;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String ptstartx_COLUMN = "PtStartX";

    /**
     * Get the value of the column 'PtStartX'. <br />
     * {INTEGER}
     * @return The value of the column 'PtStartX'. (Nullable)
     */
    public java.lang.Integer getPtstartx() {
        return _ptstartx;
    }

    /**
     * Set the value of the column 'PtStartX'. <br />
     * {INTEGER}
     * @param ptstartx The value of the column 'PtStartX'. (Nullable)
     */
    public void setPtstartx(java.lang.Integer ptstartx) {
        _modifiedProperties.addPropertyName("ptstartx");
        this._ptstartx = ptstartx;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String ptstarty_COLUMN = "PtStartY";

    /**
     * Get the value of the column 'PtStartY'. <br />
     * {INTEGER}
     * @return The value of the column 'PtStartY'. (Nullable)
     */
    public java.lang.Integer getPtstarty() {
        return _ptstarty;
    }

    /**
     * Set the value of the column 'PtStartY'. <br />
     * {INTEGER}
     * @param ptstarty The value of the column 'PtStartY'. (Nullable)
     */
    public void setPtstarty(java.lang.Integer ptstarty) {
        _modifiedProperties.addPropertyName("ptstarty");
        this._ptstarty = ptstarty;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String ptendx_COLUMN = "PtEndX";

    /**
     * Get the value of the column 'PtEndX'. <br />
     * {INTEGER}
     * @return The value of the column 'PtEndX'. (Nullable)
     */
    public java.lang.Integer getPtendx() {
        return _ptendx;
    }

    /**
     * Set the value of the column 'PtEndX'. <br />
     * {INTEGER}
     * @param ptendx The value of the column 'PtEndX'. (Nullable)
     */
    public void setPtendx(java.lang.Integer ptendx) {
        _modifiedProperties.addPropertyName("ptendx");
        this._ptendx = ptendx;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String ptendy_COLUMN = "PtEndY";

    /**
     * Get the value of the column 'PtEndY'. <br />
     * {INTEGER}
     * @return The value of the column 'PtEndY'. (Nullable)
     */
    public java.lang.Integer getPtendy() {
        return _ptendy;
    }

    /**
     * Set the value of the column 'PtEndY'. <br />
     * {INTEGER}
     * @param ptendy The value of the column 'PtEndY'. (Nullable)
     */
    public void setPtendy(java.lang.Integer ptendy) {
        _modifiedProperties.addPropertyName("ptendy");
        this._ptendy = ptendy;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String seqno_COLUMN = "SeqNo";

    /**
     * Get the value of the column 'SeqNo'. <br />
     * {INTEGER}
     * @return The value of the column 'SeqNo'. (Nullable)
     */
    public java.lang.Integer getSeqno() {
        return _seqno;
    }

    /**
     * Set the value of the column 'SeqNo'. <br />
     * {INTEGER}
     * @param seqno The value of the column 'SeqNo'. (Nullable)
     */
    public void setSeqno(java.lang.Integer seqno) {
        _modifiedProperties.addPropertyName("seqno");
        this._seqno = seqno;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String headstyle_COLUMN = "HeadStyle";

    /**
     * Get the value of the column 'HeadStyle'. <br />
     * {INTEGER}
     * @return The value of the column 'HeadStyle'. (Nullable)
     */
    public java.lang.Integer getHeadstyle() {
        return _headstyle;
    }

    /**
     * Set the value of the column 'HeadStyle'. <br />
     * {INTEGER}
     * @param headstyle The value of the column 'HeadStyle'. (Nullable)
     */
    public void setHeadstyle(java.lang.Integer headstyle) {
        _modifiedProperties.addPropertyName("headstyle");
        this._headstyle = headstyle;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String linestyle_COLUMN = "LineStyle";

    /**
     * Get the value of the column 'LineStyle'. <br />
     * {INTEGER}
     * @return The value of the column 'LineStyle'. (Nullable)
     */
    public java.lang.Integer getLinestyle() {
        return _linestyle;
    }

    /**
     * Set the value of the column 'LineStyle'. <br />
     * {INTEGER}
     * @param linestyle The value of the column 'LineStyle'. (Nullable)
     */
    public void setLinestyle(java.lang.Integer linestyle) {
        _modifiedProperties.addPropertyName("linestyle");
        this._linestyle = linestyle;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String routestyle_COLUMN = "RouteStyle";

    /**
     * Get the value of the column 'RouteStyle'. <br />
     * {INTEGER}
     * @return The value of the column 'RouteStyle'. (Nullable)
     */
    public java.lang.Integer getRoutestyle() {
        return _routestyle;
    }

    /**
     * Set the value of the column 'RouteStyle'. <br />
     * {INTEGER}
     * @param routestyle The value of the column 'RouteStyle'. (Nullable)
     */
    public void setRoutestyle(java.lang.Integer routestyle) {
        _modifiedProperties.addPropertyName("routestyle");
        this._routestyle = routestyle;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String isbold_COLUMN = "IsBold";

    /**
     * Get the value of the column 'IsBold'. <br />
     * {INTEGER}
     * @return The value of the column 'IsBold'. (Nullable)
     */
    public java.lang.Integer getIsbold() {
        return _isbold;
    }

    /**
     * Set the value of the column 'IsBold'. <br />
     * {INTEGER}
     * @param isbold The value of the column 'IsBold'. (Nullable)
     */
    public void setIsbold(java.lang.Integer isbold) {
        _modifiedProperties.addPropertyName("isbold");
        this._isbold = isbold;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String linecolor_COLUMN = "LineColor";

    /**
     * Get the value of the column 'LineColor'. <br />
     * {INTEGER}
     * @return The value of the column 'LineColor'. (Nullable)
     */
    public java.lang.Integer getLinecolor() {
        return _linecolor;
    }

    /**
     * Set the value of the column 'LineColor'. <br />
     * {INTEGER}
     * @param linecolor The value of the column 'LineColor'. (Nullable)
     */
    public void setLinecolor(java.lang.Integer linecolor) {
        _modifiedProperties.addPropertyName("linecolor");
        this._linecolor = linecolor;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String stereotype_COLUMN = "Stereotype";

    /**
     * Get the value of the column 'Stereotype'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Stereotype'. (Nullable)
     */
    public String getStereotype() {
        return _stereotype;
    }

    /**
     * Set the value of the column 'Stereotype'. <br />
     * {VARCHAR(50)}
     * @param stereotype The value of the column 'Stereotype'. (Nullable)
     */
    public void setStereotype(String stereotype) {
        _modifiedProperties.addPropertyName("stereotype");
        this._stereotype = stereotype;
    }

    /** The column annotation for S2Dao. {VARCHAR(1)} */
    public static final String virtualinheritance_COLUMN = "VirtualInheritance";

    /**
     * Get the value of the column 'VirtualInheritance'. <br />
     * {VARCHAR(1)}
     * @return The value of the column 'VirtualInheritance'. (Nullable)
     */
    public String getVirtualinheritance() {
        return _virtualinheritance;
    }

    /**
     * Set the value of the column 'VirtualInheritance'. <br />
     * {VARCHAR(1)}
     * @param virtualinheritance The value of the column 'VirtualInheritance'. (Nullable)
     */
    public void setVirtualinheritance(String virtualinheritance) {
        _modifiedProperties.addPropertyName("virtualinheritance");
        this._virtualinheritance = virtualinheritance;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String linkaccess_COLUMN = "LinkAccess";

    /**
     * Get the value of the column 'LinkAccess'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'LinkAccess'. (Nullable)
     */
    public String getLinkaccess() {
        return _linkaccess;
    }

    /**
     * Set the value of the column 'LinkAccess'. <br />
     * {VARCHAR(50)}
     * @param linkaccess The value of the column 'LinkAccess'. (Nullable)
     */
    public void setLinkaccess(String linkaccess) {
        _modifiedProperties.addPropertyName("linkaccess");
        this._linkaccess = linkaccess;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata1_COLUMN = "PDATA1";

    /**
     * Get the value of the column 'PDATA1'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA1'. (Nullable)
     */
    public String getPdata1() {
        return _pdata1;
    }

    /**
     * Set the value of the column 'PDATA1'. <br />
     * {VARCHAR(255)}
     * @param pdata1 The value of the column 'PDATA1'. (Nullable)
     */
    public void setPdata1(String pdata1) {
        _modifiedProperties.addPropertyName("pdata1");
        this._pdata1 = pdata1;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata2_COLUMN = "PDATA2";

    /**
     * Get the value of the column 'PDATA2'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA2'. (Nullable)
     */
    public String getPdata2() {
        return _pdata2;
    }

    /**
     * Set the value of the column 'PDATA2'. <br />
     * {VARCHAR(255)}
     * @param pdata2 The value of the column 'PDATA2'. (Nullable)
     */
    public void setPdata2(String pdata2) {
        _modifiedProperties.addPropertyName("pdata2");
        this._pdata2 = pdata2;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata3_COLUMN = "PDATA3";

    /**
     * Get the value of the column 'PDATA3'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA3'. (Nullable)
     */
    public String getPdata3() {
        return _pdata3;
    }

    /**
     * Set the value of the column 'PDATA3'. <br />
     * {VARCHAR(255)}
     * @param pdata3 The value of the column 'PDATA3'. (Nullable)
     */
    public void setPdata3(String pdata3) {
        _modifiedProperties.addPropertyName("pdata3");
        this._pdata3 = pdata3;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata4_COLUMN = "PDATA4";

    /**
     * Get the value of the column 'PDATA4'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA4'. (Nullable)
     */
    public String getPdata4() {
        return _pdata4;
    }

    /**
     * Set the value of the column 'PDATA4'. <br />
     * {VARCHAR(255)}
     * @param pdata4 The value of the column 'PDATA4'. (Nullable)
     */
    public void setPdata4(String pdata4) {
        _modifiedProperties.addPropertyName("pdata4");
        this._pdata4 = pdata4;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata5_COLUMN = "PDATA5";

    /**
     * Get the value of the column 'PDATA5'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA5'. (Nullable)
     */
    public String getPdata5() {
        return _pdata5;
    }

    /**
     * Set the value of the column 'PDATA5'. <br />
     * {VARCHAR(255)}
     * @param pdata5 The value of the column 'PDATA5'. (Nullable)
     */
    public void setPdata5(String pdata5) {
        _modifiedProperties.addPropertyName("pdata5");
        this._pdata5 = pdata5;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String diagramid_COLUMN = "DiagramID";

    /**
     * Get the value of the column 'DiagramID'. <br />
     * {INTEGER}
     * @return The value of the column 'DiagramID'. (Nullable)
     */
    public java.lang.Integer getDiagramid() {
        return _diagramid;
    }

    /**
     * Set the value of the column 'DiagramID'. <br />
     * {INTEGER}
     * @param diagramid The value of the column 'DiagramID'. (Nullable)
     */
    public void setDiagramid(java.lang.Integer diagramid) {
        _modifiedProperties.addPropertyName("diagramid");
        this._diagramid = diagramid;
    }

    /** The column annotation for S2Dao. {UQ : VARCHAR(40)} */
    public static final String eaGuid_COLUMN = "ea_guid";

    /**
     * Get the value of the column 'ea_guid'. <br />
     * {UQ : VARCHAR(40)}
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * Set the value of the column 'ea_guid'. <br />
     * {UQ : VARCHAR(40)}
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String sourceconstraint_COLUMN = "SourceConstraint";

    /**
     * Get the value of the column 'SourceConstraint'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'SourceConstraint'. (Nullable)
     */
    public String getSourceconstraint() {
        return _sourceconstraint;
    }

    /**
     * Set the value of the column 'SourceConstraint'. <br />
     * {VARCHAR(255)}
     * @param sourceconstraint The value of the column 'SourceConstraint'. (Nullable)
     */
    public void setSourceconstraint(String sourceconstraint) {
        _modifiedProperties.addPropertyName("sourceconstraint");
        this._sourceconstraint = sourceconstraint;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String destconstraint_COLUMN = "DestConstraint";

    /**
     * Get the value of the column 'DestConstraint'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'DestConstraint'. (Nullable)
     */
    public String getDestconstraint() {
        return _destconstraint;
    }

    /**
     * Set the value of the column 'DestConstraint'. <br />
     * {VARCHAR(255)}
     * @param destconstraint The value of the column 'DestConstraint'. (Nullable)
     */
    public void setDestconstraint(String destconstraint) {
        _modifiedProperties.addPropertyName("destconstraint");
        this._destconstraint = destconstraint;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String sourceisnavigable_COLUMN = "SourceIsNavigable";

    /**
     * Get the value of the column 'SourceIsNavigable'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'SourceIsNavigable'. (Nullable)
     */
    public Boolean getSourceisnavigable() {
        return _sourceisnavigable;
    }

    /**
     * Set the value of the column 'SourceIsNavigable'. <br />
     * {BIT : NotNull}
     * @param sourceisnavigable The value of the column 'SourceIsNavigable'. (Nullable)
     */
    public void setSourceisnavigable(Boolean sourceisnavigable) {
        _modifiedProperties.addPropertyName("sourceisnavigable");
        this._sourceisnavigable = sourceisnavigable;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String destisnavigable_COLUMN = "DestIsNavigable";

    /**
     * Get the value of the column 'DestIsNavigable'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'DestIsNavigable'. (Nullable)
     */
    public Boolean getDestisnavigable() {
        return _destisnavigable;
    }

    /**
     * Set the value of the column 'DestIsNavigable'. <br />
     * {BIT : NotNull}
     * @param destisnavigable The value of the column 'DestIsNavigable'. (Nullable)
     */
    public void setDestisnavigable(Boolean destisnavigable) {
        _modifiedProperties.addPropertyName("destisnavigable");
        this._destisnavigable = destisnavigable;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String isroot_COLUMN = "IsRoot";

    /**
     * Get the value of the column 'IsRoot'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'IsRoot'. (Nullable)
     */
    public Boolean getIsroot() {
        return _isroot;
    }

    /**
     * Set the value of the column 'IsRoot'. <br />
     * {BIT : NotNull}
     * @param isroot The value of the column 'IsRoot'. (Nullable)
     */
    public void setIsroot(Boolean isroot) {
        _modifiedProperties.addPropertyName("isroot");
        this._isroot = isroot;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String isleaf_COLUMN = "IsLeaf";

    /**
     * Get the value of the column 'IsLeaf'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'IsLeaf'. (Nullable)
     */
    public Boolean getIsleaf() {
        return _isleaf;
    }

    /**
     * Set the value of the column 'IsLeaf'. <br />
     * {BIT : NotNull}
     * @param isleaf The value of the column 'IsLeaf'. (Nullable)
     */
    public void setIsleaf(Boolean isleaf) {
        _modifiedProperties.addPropertyName("isleaf");
        this._isleaf = isleaf;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String isspec_COLUMN = "IsSpec";

    /**
     * Get the value of the column 'IsSpec'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'IsSpec'. (Nullable)
     */
    public Boolean getIsspec() {
        return _isspec;
    }

    /**
     * Set the value of the column 'IsSpec'. <br />
     * {BIT : NotNull}
     * @param isspec The value of the column 'IsSpec'. (Nullable)
     */
    public void setIsspec(Boolean isspec) {
        _modifiedProperties.addPropertyName("isspec");
        this._isspec = isspec;
    }

    /** The column annotation for S2Dao. {VARCHAR(12)} */
    public static final String sourcechangeable_COLUMN = "SourceChangeable";

    /**
     * Get the value of the column 'SourceChangeable'. <br />
     * {VARCHAR(12)}
     * @return The value of the column 'SourceChangeable'. (Nullable)
     */
    public String getSourcechangeable() {
        return _sourcechangeable;
    }

    /**
     * Set the value of the column 'SourceChangeable'. <br />
     * {VARCHAR(12)}
     * @param sourcechangeable The value of the column 'SourceChangeable'. (Nullable)
     */
    public void setSourcechangeable(String sourcechangeable) {
        _modifiedProperties.addPropertyName("sourcechangeable");
        this._sourcechangeable = sourcechangeable;
    }

    /** The column annotation for S2Dao. {VARCHAR(12)} */
    public static final String destchangeable_COLUMN = "DestChangeable";

    /**
     * Get the value of the column 'DestChangeable'. <br />
     * {VARCHAR(12)}
     * @return The value of the column 'DestChangeable'. (Nullable)
     */
    public String getDestchangeable() {
        return _destchangeable;
    }

    /**
     * Set the value of the column 'DestChangeable'. <br />
     * {VARCHAR(12)}
     * @param destchangeable The value of the column 'DestChangeable'. (Nullable)
     */
    public void setDestchangeable(String destchangeable) {
        _modifiedProperties.addPropertyName("destchangeable");
        this._destchangeable = destchangeable;
    }

    /** The column annotation for S2Dao. {VARCHAR(12)} */
    public static final String sourcets_COLUMN = "SourceTS";

    /**
     * Get the value of the column 'SourceTS'. <br />
     * {VARCHAR(12)}
     * @return The value of the column 'SourceTS'. (Nullable)
     */
    public String getSourcets() {
        return _sourcets;
    }

    /**
     * Set the value of the column 'SourceTS'. <br />
     * {VARCHAR(12)}
     * @param sourcets The value of the column 'SourceTS'. (Nullable)
     */
    public void setSourcets(String sourcets) {
        _modifiedProperties.addPropertyName("sourcets");
        this._sourcets = sourcets;
    }

    /** The column annotation for S2Dao. {VARCHAR(12)} */
    public static final String destts_COLUMN = "DestTS";

    /**
     * Get the value of the column 'DestTS'. <br />
     * {VARCHAR(12)}
     * @return The value of the column 'DestTS'. (Nullable)
     */
    public String getDestts() {
        return _destts;
    }

    /**
     * Set the value of the column 'DestTS'. <br />
     * {VARCHAR(12)}
     * @param destts The value of the column 'DestTS'. (Nullable)
     */
    public void setDestts(String destts) {
        _modifiedProperties.addPropertyName("destts");
        this._destts = destts;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String stateflags_COLUMN = "StateFlags";

    /**
     * Get the value of the column 'StateFlags'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'StateFlags'. (Nullable)
     */
    public String getStateflags() {
        return _stateflags;
    }

    /**
     * Set the value of the column 'StateFlags'. <br />
     * {VARCHAR(255)}
     * @param stateflags The value of the column 'StateFlags'. (Nullable)
     */
    public void setStateflags(String stateflags) {
        _modifiedProperties.addPropertyName("stateflags");
        this._stateflags = stateflags;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String actionflags_COLUMN = "ActionFlags";

    /**
     * Get the value of the column 'ActionFlags'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'ActionFlags'. (Nullable)
     */
    public String getActionflags() {
        return _actionflags;
    }

    /**
     * Set the value of the column 'ActionFlags'. <br />
     * {VARCHAR(255)}
     * @param actionflags The value of the column 'ActionFlags'. (Nullable)
     */
    public void setActionflags(String actionflags) {
        _modifiedProperties.addPropertyName("actionflags");
        this._actionflags = actionflags;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String issignal_COLUMN = "IsSignal";

    /**
     * Get the value of the column 'IsSignal'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'IsSignal'. (Nullable)
     */
    public Boolean getIssignal() {
        return _issignal;
    }

    /**
     * Set the value of the column 'IsSignal'. <br />
     * {BIT : NotNull}
     * @param issignal The value of the column 'IsSignal'. (Nullable)
     */
    public void setIssignal(Boolean issignal) {
        _modifiedProperties.addPropertyName("issignal");
        this._issignal = issignal;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String isstimulus_COLUMN = "IsStimulus";

    /**
     * Get the value of the column 'IsStimulus'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'IsStimulus'. (Nullable)
     */
    public Boolean getIsstimulus() {
        return _isstimulus;
    }

    /**
     * Set the value of the column 'IsStimulus'. <br />
     * {BIT : NotNull}
     * @param isstimulus The value of the column 'IsStimulus'. (Nullable)
     */
    public void setIsstimulus(Boolean isstimulus) {
        _modifiedProperties.addPropertyName("isstimulus");
        this._isstimulus = isstimulus;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String dispatchaction_COLUMN = "DispatchAction";

    /**
     * Get the value of the column 'DispatchAction'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'DispatchAction'. (Nullable)
     */
    public String getDispatchaction() {
        return _dispatchaction;
    }

    /**
     * Set the value of the column 'DispatchAction'. <br />
     * {VARCHAR(255)}
     * @param dispatchaction The value of the column 'DispatchAction'. (Nullable)
     */
    public void setDispatchaction(String dispatchaction) {
        _modifiedProperties.addPropertyName("dispatchaction");
        this._dispatchaction = dispatchaction;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String target2_COLUMN = "Target2";

    /**
     * Get the value of the column 'Target2'. <br />
     * {INTEGER}
     * @return The value of the column 'Target2'. (Nullable)
     */
    public java.lang.Integer getTarget2() {
        return _target2;
    }

    /**
     * Set the value of the column 'Target2'. <br />
     * {INTEGER}
     * @param target2 The value of the column 'Target2'. (Nullable)
     */
    public void setTarget2(java.lang.Integer target2) {
        _modifiedProperties.addPropertyName("target2");
        this._target2 = target2;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String styleex_COLUMN = "StyleEx";

    /**
     * Get the value of the column 'StyleEx'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'StyleEx'. (Nullable)
     */
    public String getStyleex() {
        return _styleex;
    }

    /**
     * Set the value of the column 'StyleEx'. <br />
     * {LONGCHAR(2147483647)}
     * @param styleex The value of the column 'StyleEx'. (Nullable)
     */
    public void setStyleex(String styleex) {
        _modifiedProperties.addPropertyName("styleex");
        this._styleex = styleex;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String sourcestereotype_COLUMN = "SourceStereotype";

    /**
     * Get the value of the column 'SourceStereotype'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'SourceStereotype'. (Nullable)
     */
    public String getSourcestereotype() {
        return _sourcestereotype;
    }

    /**
     * Set the value of the column 'SourceStereotype'. <br />
     * {VARCHAR(255)}
     * @param sourcestereotype The value of the column 'SourceStereotype'. (Nullable)
     */
    public void setSourcestereotype(String sourcestereotype) {
        _modifiedProperties.addPropertyName("sourcestereotype");
        this._sourcestereotype = sourcestereotype;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String deststereotype_COLUMN = "DestStereotype";

    /**
     * Get the value of the column 'DestStereotype'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'DestStereotype'. (Nullable)
     */
    public String getDeststereotype() {
        return _deststereotype;
    }

    /**
     * Set the value of the column 'DestStereotype'. <br />
     * {VARCHAR(255)}
     * @param deststereotype The value of the column 'DestStereotype'. (Nullable)
     */
    public void setDeststereotype(String deststereotype) {
        _modifiedProperties.addPropertyName("deststereotype");
        this._deststereotype = deststereotype;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String sourcestyle_COLUMN = "SourceStyle";

    /**
     * Get the value of the column 'SourceStyle'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'SourceStyle'. (Nullable)
     */
    public String getSourcestyle() {
        return _sourcestyle;
    }

    /**
     * Set the value of the column 'SourceStyle'. <br />
     * {LONGCHAR(2147483647)}
     * @param sourcestyle The value of the column 'SourceStyle'. (Nullable)
     */
    public void setSourcestyle(String sourcestyle) {
        _modifiedProperties.addPropertyName("sourcestyle");
        this._sourcestyle = sourcestyle;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String deststyle_COLUMN = "DestStyle";

    /**
     * Get the value of the column 'DestStyle'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'DestStyle'. (Nullable)
     */
    public String getDeststyle() {
        return _deststyle;
    }

    /**
     * Set the value of the column 'DestStyle'. <br />
     * {LONGCHAR(2147483647)}
     * @param deststyle The value of the column 'DestStyle'. (Nullable)
     */
    public void setDeststyle(String deststyle) {
        _modifiedProperties.addPropertyName("deststyle");
        this._deststyle = deststyle;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String eventflags_COLUMN = "EventFlags";

    /**
     * Get the value of the column 'EventFlags'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'EventFlags'. (Nullable)
     */
    public String getEventflags() {
        return _eventflags;
    }

    /**
     * Set the value of the column 'EventFlags'. <br />
     * {VARCHAR(255)}
     * @param eventflags The value of the column 'EventFlags'. (Nullable)
     */
    public void setEventflags(String eventflags) {
        _modifiedProperties.addPropertyName("eventflags");
        this._eventflags = eventflags;
    }

}
