package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_operationtag that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PropertyID, ElementID, Property, VALUE, NOTES, ea_guid
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
public abstract class BsTOperationtag implements Entity, Serializable {

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
    /** PropertyID: {UQ : NotNull : COUNTER} */
    protected java.lang.Integer _propertyid;

    /** ElementID: {INTEGER} */
    protected java.lang.Integer _elementid;

    /** Property: {VARCHAR(255)} */
    protected String _property;

    /** VALUE: {VARCHAR(255)} */
    protected String _value;

    /** NOTES: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** ea_guid: {VARCHAR(40)} */
    protected String _eaGuid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_operationtag";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TOperationtag";
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
        if (other == null || !(other instanceof BsTOperationtag)) { return false; }
        final BsTOperationtag otherEntity = (BsTOperationtag)other;
        if (!helpComparingValue(getPropertyid(), otherEntity.getPropertyid())) { return false; }
        if (!helpComparingValue(getElementid(), otherEntity.getElementid())) { return false; }
        if (!helpComparingValue(getProperty(), otherEntity.getProperty())) { return false; }
        if (!helpComparingValue(getValue(), otherEntity.getValue())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getEaGuid(), otherEntity.getEaGuid())) { return false; }
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
        if (this.getPropertyid() != null) { result = result + this.getPropertyid().hashCode(); }
        if (this.getElementid() != null) { result = result + this.getElementid().hashCode(); }
        if (this.getProperty() != null) { result = result + this.getProperty().hashCode(); }
        if (this.getValue() != null) { result = result + this.getValue().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getEaGuid() != null) { result = result + this.getEaGuid().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getPropertyid());
        sb.append(delimiter).append(getElementid());
        sb.append(delimiter).append(getProperty());
        sb.append(delimiter).append(getValue());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getEaGuid());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * PropertyID: {UQ : NotNull : COUNTER} <br />
     * @return The value of the column 'PropertyID'. (Nullable)
     */
    public java.lang.Integer getPropertyid() {
        return _propertyid;
    }

    /**
     * PropertyID: {UQ : NotNull : COUNTER} <br />
     * @param propertyid The value of the column 'PropertyID'. (Nullable)
     */
    public void setPropertyid(java.lang.Integer propertyid) {
        _modifiedProperties.addPropertyName("propertyid");
        this._propertyid = propertyid;
    }

    /**
     * ElementID: {INTEGER} <br />
     * @return The value of the column 'ElementID'. (Nullable)
     */
    public java.lang.Integer getElementid() {
        return _elementid;
    }

    /**
     * ElementID: {INTEGER} <br />
     * @param elementid The value of the column 'ElementID'. (Nullable)
     */
    public void setElementid(java.lang.Integer elementid) {
        _modifiedProperties.addPropertyName("elementid");
        this._elementid = elementid;
    }

    /**
     * Property: {VARCHAR(255)} <br />
     * @return The value of the column 'Property'. (Nullable)
     */
    public String getProperty() {
        return _property;
    }

    /**
     * Property: {VARCHAR(255)} <br />
     * @param property The value of the column 'Property'. (Nullable)
     */
    public void setProperty(String property) {
        _modifiedProperties.addPropertyName("property");
        this._property = property;
    }

    /**
     * VALUE: {VARCHAR(255)} <br />
     * @return The value of the column 'VALUE'. (Nullable)
     */
    public String getValue() {
        return _value;
    }

    /**
     * VALUE: {VARCHAR(255)} <br />
     * @param value The value of the column 'VALUE'. (Nullable)
     */
    public void setValue(String value) {
        _modifiedProperties.addPropertyName("value");
        this._value = value;
    }

    /**
     * NOTES: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'NOTES'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * NOTES: {LONGCHAR(2147483647)} <br />
     * @param notes The value of the column 'NOTES'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

    /**
     * ea_guid: {VARCHAR(40)} <br />
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * ea_guid: {VARCHAR(40)} <br />
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
    }
}
