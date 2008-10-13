package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_diagramobjects(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Diagram_ID, Object_ID, RectTop, RectLeft, RectRight, RectBottom, Sequence, ObjectStyle, Instance_ID
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
public abstract class BsTDiagramobjects implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_diagramobjects. */
    public static final String TABLE = "t_diagramobjects";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Diagram_ID'. {INTEGER} */
    protected java.lang.Integer _diagramId;

    /** The attribute of the column 'Object_ID'. {INTEGER} */
    protected java.lang.Integer _objectId;

    /** The attribute of the column 'RectTop'. {INTEGER} */
    protected java.lang.Integer _recttop;

    /** The attribute of the column 'RectLeft'. {INTEGER} */
    protected java.lang.Integer _rectleft;

    /** The attribute of the column 'RectRight'. {INTEGER} */
    protected java.lang.Integer _rectright;

    /** The attribute of the column 'RectBottom'. {INTEGER} */
    protected java.lang.Integer _rectbottom;

    /** The attribute of the column 'Sequence'. {INTEGER} */
    protected java.lang.Integer _sequence;

    /** The attribute of the column 'ObjectStyle'. {VARCHAR(255)} */
    protected String _objectstyle;

    /** The attribute of the column 'Instance_ID'. {UQ : COUNTER : NotNull} */
    protected java.lang.Integer _instanceId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTDiagramobjects() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_diagramobjects";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TDiagramobjects";
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
        if (other == null || !(other instanceof BsTDiagramobjects)) { return false; }
        final BsTDiagramobjects otherEntity = (BsTDiagramobjects)other;
        if (!helpComparingValue(getDiagramId(), otherEntity.getDiagramId())) { return false; }
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getRecttop(), otherEntity.getRecttop())) { return false; }
        if (!helpComparingValue(getRectleft(), otherEntity.getRectleft())) { return false; }
        if (!helpComparingValue(getRectright(), otherEntity.getRectright())) { return false; }
        if (!helpComparingValue(getRectbottom(), otherEntity.getRectbottom())) { return false; }
        if (!helpComparingValue(getSequence(), otherEntity.getSequence())) { return false; }
        if (!helpComparingValue(getObjectstyle(), otherEntity.getObjectstyle())) { return false; }
        if (!helpComparingValue(getInstanceId(), otherEntity.getInstanceId())) { return false; }
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
        if (this.getDiagramId() != null) { result = result + this.getDiagramId().hashCode(); }
        if (this.getObjectId() != null) { result = result + this.getObjectId().hashCode(); }
        if (this.getRecttop() != null) { result = result + this.getRecttop().hashCode(); }
        if (this.getRectleft() != null) { result = result + this.getRectleft().hashCode(); }
        if (this.getRectright() != null) { result = result + this.getRectright().hashCode(); }
        if (this.getRectbottom() != null) { result = result + this.getRectbottom().hashCode(); }
        if (this.getSequence() != null) { result = result + this.getSequence().hashCode(); }
        if (this.getObjectstyle() != null) { result = result + this.getObjectstyle().hashCode(); }
        if (this.getInstanceId() != null) { result = result + this.getInstanceId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getDiagramId());
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getRecttop());
        sb.append(delimiter).append(getRectleft());
        sb.append(delimiter).append(getRectright());
        sb.append(delimiter).append(getRectbottom());
        sb.append(delimiter).append(getSequence());
        sb.append(delimiter).append(getObjectstyle());
        sb.append(delimiter).append(getInstanceId());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String diagramId_COLUMN = "Diagram_ID";

    /**
     * Get the value of the column 'Diagram_ID'. <br />
     * {INTEGER}
     * @return The value of the column 'Diagram_ID'. (Nullable)
     */
    public java.lang.Integer getDiagramId() {
        return _diagramId;
    }

    /**
     * Set the value of the column 'Diagram_ID'. <br />
     * {INTEGER}
     * @param diagramId The value of the column 'Diagram_ID'. (Nullable)
     */
    public void setDiagramId(java.lang.Integer diagramId) {
        _modifiedProperties.addPropertyName("diagramId");
        this._diagramId = diagramId;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String objectId_COLUMN = "Object_ID";

    /**
     * Get the value of the column 'Object_ID'. <br />
     * {INTEGER}
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Set the value of the column 'Object_ID'. <br />
     * {INTEGER}
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String recttop_COLUMN = "RectTop";

    /**
     * Get the value of the column 'RectTop'. <br />
     * {INTEGER}
     * @return The value of the column 'RectTop'. (Nullable)
     */
    public java.lang.Integer getRecttop() {
        return _recttop;
    }

    /**
     * Set the value of the column 'RectTop'. <br />
     * {INTEGER}
     * @param recttop The value of the column 'RectTop'. (Nullable)
     */
    public void setRecttop(java.lang.Integer recttop) {
        _modifiedProperties.addPropertyName("recttop");
        this._recttop = recttop;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String rectleft_COLUMN = "RectLeft";

    /**
     * Get the value of the column 'RectLeft'. <br />
     * {INTEGER}
     * @return The value of the column 'RectLeft'. (Nullable)
     */
    public java.lang.Integer getRectleft() {
        return _rectleft;
    }

    /**
     * Set the value of the column 'RectLeft'. <br />
     * {INTEGER}
     * @param rectleft The value of the column 'RectLeft'. (Nullable)
     */
    public void setRectleft(java.lang.Integer rectleft) {
        _modifiedProperties.addPropertyName("rectleft");
        this._rectleft = rectleft;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String rectright_COLUMN = "RectRight";

    /**
     * Get the value of the column 'RectRight'. <br />
     * {INTEGER}
     * @return The value of the column 'RectRight'. (Nullable)
     */
    public java.lang.Integer getRectright() {
        return _rectright;
    }

    /**
     * Set the value of the column 'RectRight'. <br />
     * {INTEGER}
     * @param rectright The value of the column 'RectRight'. (Nullable)
     */
    public void setRectright(java.lang.Integer rectright) {
        _modifiedProperties.addPropertyName("rectright");
        this._rectright = rectright;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String rectbottom_COLUMN = "RectBottom";

    /**
     * Get the value of the column 'RectBottom'. <br />
     * {INTEGER}
     * @return The value of the column 'RectBottom'. (Nullable)
     */
    public java.lang.Integer getRectbottom() {
        return _rectbottom;
    }

    /**
     * Set the value of the column 'RectBottom'. <br />
     * {INTEGER}
     * @param rectbottom The value of the column 'RectBottom'. (Nullable)
     */
    public void setRectbottom(java.lang.Integer rectbottom) {
        _modifiedProperties.addPropertyName("rectbottom");
        this._rectbottom = rectbottom;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String sequence_COLUMN = "Sequence";

    /**
     * Get the value of the column 'Sequence'. <br />
     * {INTEGER}
     * @return The value of the column 'Sequence'. (Nullable)
     */
    public java.lang.Integer getSequence() {
        return _sequence;
    }

    /**
     * Set the value of the column 'Sequence'. <br />
     * {INTEGER}
     * @param sequence The value of the column 'Sequence'. (Nullable)
     */
    public void setSequence(java.lang.Integer sequence) {
        _modifiedProperties.addPropertyName("sequence");
        this._sequence = sequence;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String objectstyle_COLUMN = "ObjectStyle";

    /**
     * Get the value of the column 'ObjectStyle'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'ObjectStyle'. (Nullable)
     */
    public String getObjectstyle() {
        return _objectstyle;
    }

    /**
     * Set the value of the column 'ObjectStyle'. <br />
     * {VARCHAR(255)}
     * @param objectstyle The value of the column 'ObjectStyle'. (Nullable)
     */
    public void setObjectstyle(String objectstyle) {
        _modifiedProperties.addPropertyName("objectstyle");
        this._objectstyle = objectstyle;
    }

    /** The column annotation for S2Dao. {UQ : COUNTER : NotNull} */
    public static final String instanceId_COLUMN = "Instance_ID";

    /**
     * Get the value of the column 'Instance_ID'. <br />
     * {UQ : COUNTER : NotNull}
     * @return The value of the column 'Instance_ID'. (Nullable)
     */
    public java.lang.Integer getInstanceId() {
        return _instanceId;
    }

    /**
     * Set the value of the column 'Instance_ID'. <br />
     * {UQ : COUNTER : NotNull}
     * @param instanceId The value of the column 'Instance_ID'. (Nullable)
     */
    public void setInstanceId(java.lang.Integer instanceId) {
        _modifiedProperties.addPropertyName("instanceId");
        this._instanceId = instanceId;
    }

}
