package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_ecf(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     ECFID, Description, Weight, Value, Notes
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
public abstract class BsTEcf implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_ecf. */
    public static final String TABLE = "t_ecf";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'ECFID'. {UQ : VARCHAR(12)} */
    protected String _ecfid;

    /** The attribute of the column 'Description'. {VARCHAR(50)} */
    protected String _description;

    /** The attribute of the column 'Weight'. {DOUBLE} */
    protected java.math.BigDecimal _weight;

    /** The attribute of the column 'Value'. {DOUBLE} */
    protected java.math.BigDecimal _value;

    /** The attribute of the column 'Notes'. {VARCHAR(255)} */
    protected String _notes;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTEcf() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_ecf";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TEcf";
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
        if (other == null || !(other instanceof BsTEcf)) { return false; }
        final BsTEcf otherEntity = (BsTEcf)other;
        if (!helpComparingValue(getEcfid(), otherEntity.getEcfid())) { return false; }
        if (!helpComparingValue(getDescription(), otherEntity.getDescription())) { return false; }
        if (!helpComparingValue(getWeight(), otherEntity.getWeight())) { return false; }
        if (!helpComparingValue(getValue(), otherEntity.getValue())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
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
        if (this.getEcfid() != null) { result = result + this.getEcfid().hashCode(); }
        if (this.getDescription() != null) { result = result + this.getDescription().hashCode(); }
        if (this.getWeight() != null) { result = result + this.getWeight().hashCode(); }
        if (this.getValue() != null) { result = result + this.getValue().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getEcfid());
        sb.append(delimiter).append(getDescription());
        sb.append(delimiter).append(getWeight());
        sb.append(delimiter).append(getValue());
        sb.append(delimiter).append(getNotes());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : VARCHAR(12)} */
    public static final String ecfid_COLUMN = "ECFID";

    /**
     * Get the value of the column 'ECFID'. <br />
     * {UQ : VARCHAR(12)}
     * @return The value of the column 'ECFID'. (Nullable)
     */
    public String getEcfid() {
        return _ecfid;
    }

    /**
     * Set the value of the column 'ECFID'. <br />
     * {UQ : VARCHAR(12)}
     * @param ecfid The value of the column 'ECFID'. (Nullable)
     */
    public void setEcfid(String ecfid) {
        _modifiedProperties.addPropertyName("ecfid");
        this._ecfid = ecfid;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String description_COLUMN = "Description";

    /**
     * Get the value of the column 'Description'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Description'. (Nullable)
     */
    public String getDescription() {
        return _description;
    }

    /**
     * Set the value of the column 'Description'. <br />
     * {VARCHAR(50)}
     * @param description The value of the column 'Description'. (Nullable)
     */
    public void setDescription(String description) {
        _modifiedProperties.addPropertyName("description");
        this._description = description;
    }

    /** The column annotation for S2Dao. {DOUBLE} */
    public static final String weight_COLUMN = "Weight";

    /**
     * Get the value of the column 'Weight'. <br />
     * {DOUBLE}
     * @return The value of the column 'Weight'. (Nullable)
     */
    public java.math.BigDecimal getWeight() {
        return _weight;
    }

    /**
     * Set the value of the column 'Weight'. <br />
     * {DOUBLE}
     * @param weight The value of the column 'Weight'. (Nullable)
     */
    public void setWeight(java.math.BigDecimal weight) {
        _modifiedProperties.addPropertyName("weight");
        this._weight = weight;
    }

    /** The column annotation for S2Dao. {DOUBLE} */
    public static final String value_COLUMN = "Value";

    /**
     * Get the value of the column 'Value'. <br />
     * {DOUBLE}
     * @return The value of the column 'Value'. (Nullable)
     */
    public java.math.BigDecimal getValue() {
        return _value;
    }

    /**
     * Set the value of the column 'Value'. <br />
     * {DOUBLE}
     * @param value The value of the column 'Value'. (Nullable)
     */
    public void setValue(java.math.BigDecimal value) {
        _modifiedProperties.addPropertyName("value");
        this._value = value;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String notes_COLUMN = "Notes";

    /**
     * Get the value of the column 'Notes'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Notes'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * Set the value of the column 'Notes'. <br />
     * {VARCHAR(255)}
     * @param notes The value of the column 'Notes'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

}
