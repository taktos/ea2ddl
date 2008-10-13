package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of usys_system(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Property, Value
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
public abstract class BsUsysSystem implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is usys_system. */
    public static final String TABLE = "usys_system";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Property'. {UQ : VARCHAR(50)} */
    protected String _property;

    /** The attribute of the column 'Value'. {VARCHAR(50)} */
    protected String _value;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUsysSystem() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "usys_system";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "usysSystem";
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
        if (other == null || !(other instanceof BsUsysSystem)) { return false; }
        final BsUsysSystem otherEntity = (BsUsysSystem)other;
        if (!helpComparingValue(getProperty(), otherEntity.getProperty())) { return false; }
        if (!helpComparingValue(getValue(), otherEntity.getValue())) { return false; }
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
        if (this.getProperty() != null) { result = result + this.getProperty().hashCode(); }
        if (this.getValue() != null) { result = result + this.getValue().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getProperty());
        sb.append(delimiter).append(getValue());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : VARCHAR(50)} */
    public static final String property_COLUMN = "Property";

    /**
     * Get the value of the column 'Property'. <br />
     * {UQ : VARCHAR(50)}
     * @return The value of the column 'Property'. (Nullable)
     */
    public String getProperty() {
        return _property;
    }

    /**
     * Set the value of the column 'Property'. <br />
     * {UQ : VARCHAR(50)}
     * @param property The value of the column 'Property'. (Nullable)
     */
    public void setProperty(String property) {
        _modifiedProperties.addPropertyName("property");
        this._property = property;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String value_COLUMN = "Value";

    /**
     * Get the value of the column 'Value'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Value'. (Nullable)
     */
    public String getValue() {
        return _value;
    }

    /**
     * Set the value of the column 'Value'. <br />
     * {VARCHAR(50)}
     * @param value The value of the column 'Value'. (Nullable)
     */
    public void setValue(String value) {
        _modifiedProperties.addPropertyName("value");
        this._value = value;
    }

}
