package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_scenariotypes(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     ScenarioType, Description, NumericWeight, Notes
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
public abstract class BsTScenariotypes implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_scenariotypes. */
    public static final String TABLE = "t_scenariotypes";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'ScenarioType'. {UQ : VARCHAR(12)} */
    protected String _scenariotype;

    /** The attribute of the column 'Description'. {VARCHAR(50)} */
    protected String _description;

    /** The attribute of the column 'NumericWeight'. {DOUBLE} */
    protected java.math.BigDecimal _numericweight;

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
    public BsTScenariotypes() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_scenariotypes";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TScenariotypes";
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
        if (other == null || !(other instanceof BsTScenariotypes)) { return false; }
        final BsTScenariotypes otherEntity = (BsTScenariotypes)other;
        if (!helpComparingValue(getScenariotype(), otherEntity.getScenariotype())) { return false; }
        if (!helpComparingValue(getDescription(), otherEntity.getDescription())) { return false; }
        if (!helpComparingValue(getNumericweight(), otherEntity.getNumericweight())) { return false; }
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
        if (this.getScenariotype() != null) { result = result + this.getScenariotype().hashCode(); }
        if (this.getDescription() != null) { result = result + this.getDescription().hashCode(); }
        if (this.getNumericweight() != null) { result = result + this.getNumericweight().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getScenariotype());
        sb.append(delimiter).append(getDescription());
        sb.append(delimiter).append(getNumericweight());
        sb.append(delimiter).append(getNotes());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : VARCHAR(12)} */
    public static final String scenariotype_COLUMN = "ScenarioType";

    /**
     * Get the value of the column 'ScenarioType'. <br />
     * {UQ : VARCHAR(12)}
     * @return The value of the column 'ScenarioType'. (Nullable)
     */
    public String getScenariotype() {
        return _scenariotype;
    }

    /**
     * Set the value of the column 'ScenarioType'. <br />
     * {UQ : VARCHAR(12)}
     * @param scenariotype The value of the column 'ScenarioType'. (Nullable)
     */
    public void setScenariotype(String scenariotype) {
        _modifiedProperties.addPropertyName("scenariotype");
        this._scenariotype = scenariotype;
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
    public static final String numericweight_COLUMN = "NumericWeight";

    /**
     * Get the value of the column 'NumericWeight'. <br />
     * {DOUBLE}
     * @return The value of the column 'NumericWeight'. (Nullable)
     */
    public java.math.BigDecimal getNumericweight() {
        return _numericweight;
    }

    /**
     * Set the value of the column 'NumericWeight'. <br />
     * {DOUBLE}
     * @param numericweight The value of the column 'NumericWeight'. (Nullable)
     */
    public void setNumericweight(java.math.BigDecimal numericweight) {
        _modifiedProperties.addPropertyName("numericweight");
        this._numericweight = numericweight;
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
