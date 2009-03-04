package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;
import jp.sourceforge.ea2ddl.dao.exentity.*;

/**
 * The entity of t_operationparams that the type is TABLE. <br />
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
 *     T_OPERATION
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     tOperation
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTOperationparams implements Entity, Serializable {

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
    /** OperationID: {UQ : INTEGER : FK to T_OPERATION} */
    protected java.lang.Integer _operationid;

    /** Name: {UQ : VARCHAR(255)} */
    protected String _name;

    /** Type: {VARCHAR(255)} */
    protected String _type;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** Pos: {INTEGER} */
    protected java.lang.Integer _pos;

    /** Style: {VARCHAR(255)} */
    protected String _style;

    /** Kind: {VARCHAR(12)} */
    protected String _kind;

    /** Classifier: {VARCHAR(50)} */
    protected String _classifier;

    /** ea_guid: {VARCHAR(50)} */
    protected String _eaGuid;

    /** StyleEx: {LONGCHAR(2147483647)} */
    protected String _styleex;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_operationparams";
    }

    public String getTablePropertyName() { // as JavaBeansRule
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
    /** t_operation as 'TOperation'. */
    protected TOperation _parentTOperation;

    /**
     * t_operation as 'TOperation'. {without lazy-load}
     * @return The entity of foreign property 'TOperation'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public TOperation getTOperation() {
        return _parentTOperation;
    }

    /**
     * t_operation as 'TOperation'.
     * @param tOperation The entity of foreign property 'TOperation'. (Nullable)
     */
    public void setTOperation(TOperation tOperation) {
        _parentTOperation = tOperation;
    }

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
    /**
     * OperationID: {UQ : INTEGER : FK to T_OPERATION} <br />
     * @return The value of the column 'OperationID'. (Nullable)
     */
    public java.lang.Integer getOperationid() {
        return _operationid;
    }

    /**
     * OperationID: {UQ : INTEGER : FK to T_OPERATION} <br />
     * @param operationid The value of the column 'OperationID'. (Nullable)
     */
    public void setOperationid(java.lang.Integer operationid) {
        _modifiedProperties.addPropertyName("operationid");
        this._operationid = operationid;
    }

    /**
     * Name: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Name: {UQ : VARCHAR(255)} <br />
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /**
     * Type: {VARCHAR(255)} <br />
     * @return The value of the column 'Type'. (Nullable)
     */
    public String getType() {
        return _type;
    }

    /**
     * Type: {VARCHAR(255)} <br />
     * @param type The value of the column 'Type'. (Nullable)
     */
    public void setType(String type) {
        _modifiedProperties.addPropertyName("type");
        this._type = type;
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
     * Pos: {INTEGER} <br />
     * @return The value of the column 'Pos'. (Nullable)
     */
    public java.lang.Integer getPos() {
        return _pos;
    }

    /**
     * Pos: {INTEGER} <br />
     * @param pos The value of the column 'Pos'. (Nullable)
     */
    public void setPos(java.lang.Integer pos) {
        _modifiedProperties.addPropertyName("pos");
        this._pos = pos;
    }

    /**
     * Style: {VARCHAR(255)} <br />
     * @return The value of the column 'Style'. (Nullable)
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Style: {VARCHAR(255)} <br />
     * @param style The value of the column 'Style'. (Nullable)
     */
    public void setStyle(String style) {
        _modifiedProperties.addPropertyName("style");
        this._style = style;
    }

    /**
     * Kind: {VARCHAR(12)} <br />
     * @return The value of the column 'Kind'. (Nullable)
     */
    public String getKind() {
        return _kind;
    }

    /**
     * Kind: {VARCHAR(12)} <br />
     * @param kind The value of the column 'Kind'. (Nullable)
     */
    public void setKind(String kind) {
        _modifiedProperties.addPropertyName("kind");
        this._kind = kind;
    }

    /**
     * Classifier: {VARCHAR(50)} <br />
     * @return The value of the column 'Classifier'. (Nullable)
     */
    public String getClassifier() {
        return _classifier;
    }

    /**
     * Classifier: {VARCHAR(50)} <br />
     * @param classifier The value of the column 'Classifier'. (Nullable)
     */
    public void setClassifier(String classifier) {
        _modifiedProperties.addPropertyName("classifier");
        this._classifier = classifier;
    }

    /**
     * ea_guid: {VARCHAR(50)} <br />
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * ea_guid: {VARCHAR(50)} <br />
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
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
}
