package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_operationparams(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     OperationID, Name, Type, Notes, Pos, Style, Kind, Classifier, ea_guid, StyleEx
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
public abstract class BsTOperationparams implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_operationparams. */
    public static final String TABLE = "t_operationparams";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'OperationID'. {UQ : INTEGER} */
    protected java.lang.Integer _operationid;

    /** The attribute of the column 'Name'. {UQ : VARCHAR(255)} */
    protected String _name;

    /** The attribute of the column 'Type'. {VARCHAR(255)} */
    protected String _type;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'Pos'. {INTEGER} */
    protected java.lang.Integer _pos;

    /** The attribute of the column 'Style'. {VARCHAR(255)} */
    protected String _style;

    /** The attribute of the column 'Kind'. {VARCHAR(12)} */
    protected String _kind;

    /** The attribute of the column 'Classifier'. {VARCHAR(50)} */
    protected String _classifier;

    /** The attribute of the column 'ea_guid'. {VARCHAR(50)} */
    protected String _eaGuid;

    /** The attribute of the column 'StyleEx'. {LONGCHAR(2147483647)} */
    protected String _styleex;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTOperationparams() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_operationparams";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TOperationparams";
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
        if (other == null || !(other instanceof BsTOperationparams)) { return false; }
        final BsTOperationparams otherEntity = (BsTOperationparams)other;
        if (!helpComparingValue(getOperationid(), otherEntity.getOperationid())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getType(), otherEntity.getType())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getPos(), otherEntity.getPos())) { return false; }
        if (!helpComparingValue(getStyle(), otherEntity.getStyle())) { return false; }
        if (!helpComparingValue(getKind(), otherEntity.getKind())) { return false; }
        if (!helpComparingValue(getClassifier(), otherEntity.getClassifier())) { return false; }
        if (!helpComparingValue(getEaGuid(), otherEntity.getEaGuid())) { return false; }
        if (!helpComparingValue(getStyleex(), otherEntity.getStyleex())) { return false; }
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
        if (this.getOperationid() != null) { result = result + this.getOperationid().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getType() != null) { result = result + this.getType().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getPos() != null) { result = result + this.getPos().hashCode(); }
        if (this.getStyle() != null) { result = result + this.getStyle().hashCode(); }
        if (this.getKind() != null) { result = result + this.getKind().hashCode(); }
        if (this.getClassifier() != null) { result = result + this.getClassifier().hashCode(); }
        if (this.getEaGuid() != null) { result = result + this.getEaGuid().hashCode(); }
        if (this.getStyleex() != null) { result = result + this.getStyleex().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getOperationid());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getType());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getPos());
        sb.append(delimiter).append(getStyle());
        sb.append(delimiter).append(getKind());
        sb.append(delimiter).append(getClassifier());
        sb.append(delimiter).append(getEaGuid());
        sb.append(delimiter).append(getStyleex());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : INTEGER} */
    public static final String operationid_COLUMN = "OperationID";

    /**
     * Get the value of the column 'OperationID'. <br />
     * {UQ : INTEGER}
     * @return The value of the column 'OperationID'. (Nullable)
     */
    public java.lang.Integer getOperationid() {
        return _operationid;
    }

    /**
     * Set the value of the column 'OperationID'. <br />
     * {UQ : INTEGER}
     * @param operationid The value of the column 'OperationID'. (Nullable)
     */
    public void setOperationid(java.lang.Integer operationid) {
        _modifiedProperties.addPropertyName("operationid");
        this._operationid = operationid;
    }

    /** The column annotation for S2Dao. {UQ : VARCHAR(255)} */
    public static final String name_COLUMN = "Name";

    /**
     * Get the value of the column 'Name'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Set the value of the column 'Name'. <br />
     * {UQ : VARCHAR(255)}
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String type_COLUMN = "Type";

    /**
     * Get the value of the column 'Type'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Type'. (Nullable)
     */
    public String getType() {
        return _type;
    }

    /**
     * Set the value of the column 'Type'. <br />
     * {VARCHAR(255)}
     * @param type The value of the column 'Type'. (Nullable)
     */
    public void setType(String type) {
        _modifiedProperties.addPropertyName("type");
        this._type = type;
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

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String pos_COLUMN = "Pos";

    /**
     * Get the value of the column 'Pos'. <br />
     * {INTEGER}
     * @return The value of the column 'Pos'. (Nullable)
     */
    public java.lang.Integer getPos() {
        return _pos;
    }

    /**
     * Set the value of the column 'Pos'. <br />
     * {INTEGER}
     * @param pos The value of the column 'Pos'. (Nullable)
     */
    public void setPos(java.lang.Integer pos) {
        _modifiedProperties.addPropertyName("pos");
        this._pos = pos;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String style_COLUMN = "Style";

    /**
     * Get the value of the column 'Style'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Style'. (Nullable)
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Set the value of the column 'Style'. <br />
     * {VARCHAR(255)}
     * @param style The value of the column 'Style'. (Nullable)
     */
    public void setStyle(String style) {
        _modifiedProperties.addPropertyName("style");
        this._style = style;
    }

    /** The column annotation for S2Dao. {VARCHAR(12)} */
    public static final String kind_COLUMN = "Kind";

    /**
     * Get the value of the column 'Kind'. <br />
     * {VARCHAR(12)}
     * @return The value of the column 'Kind'. (Nullable)
     */
    public String getKind() {
        return _kind;
    }

    /**
     * Set the value of the column 'Kind'. <br />
     * {VARCHAR(12)}
     * @param kind The value of the column 'Kind'. (Nullable)
     */
    public void setKind(String kind) {
        _modifiedProperties.addPropertyName("kind");
        this._kind = kind;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String classifier_COLUMN = "Classifier";

    /**
     * Get the value of the column 'Classifier'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Classifier'. (Nullable)
     */
    public String getClassifier() {
        return _classifier;
    }

    /**
     * Set the value of the column 'Classifier'. <br />
     * {VARCHAR(50)}
     * @param classifier The value of the column 'Classifier'. (Nullable)
     */
    public void setClassifier(String classifier) {
        _modifiedProperties.addPropertyName("classifier");
        this._classifier = classifier;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String eaGuid_COLUMN = "ea_guid";

    /**
     * Get the value of the column 'ea_guid'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * Set the value of the column 'ea_guid'. <br />
     * {VARCHAR(50)}
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
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

}
