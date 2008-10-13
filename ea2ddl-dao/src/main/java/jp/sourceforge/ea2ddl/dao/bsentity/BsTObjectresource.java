package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_objectresource(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_ID, Resource, Role, Time, Notes, PercentComplete, DateStart, DateEnd, History, ExpectedHours, ActualHours
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
public abstract class BsTObjectresource implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_objectresource. */
    public static final String TABLE = "t_objectresource";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Object_ID'. {UQ : INTEGER} */
    protected java.lang.Integer _objectId;

    /** The attribute of the column 'Resource'. {UQ : VARCHAR(255)} */
    protected String _resource;

    /** The attribute of the column 'Role'. {UQ : VARCHAR(255)} */
    protected String _role;

    /** The attribute of the column 'Time'. {DOUBLE} */
    protected java.math.BigDecimal _time;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'PercentComplete'. {SMALLINT} */
    protected java.lang.Integer _percentcomplete;

    /** The attribute of the column 'DateStart'. {DATETIME} */
    protected java.sql.Timestamp _datestart;

    /** The attribute of the column 'DateEnd'. {DATETIME} */
    protected java.sql.Timestamp _dateend;

    /** The attribute of the column 'History'. {LONGCHAR(2147483647)} */
    protected String _history;

    /** The attribute of the column 'ExpectedHours'. {INTEGER} */
    protected java.lang.Integer _expectedhours;

    /** The attribute of the column 'ActualHours'. {INTEGER} */
    protected java.lang.Integer _actualhours;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectresource() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectresource";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TObjectresource";
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
        if (other == null || !(other instanceof BsTObjectresource)) { return false; }
        final BsTObjectresource otherEntity = (BsTObjectresource)other;
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getResource(), otherEntity.getResource())) { return false; }
        if (!helpComparingValue(getRole(), otherEntity.getRole())) { return false; }
        if (!helpComparingValue(getTime(), otherEntity.getTime())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getPercentcomplete(), otherEntity.getPercentcomplete())) { return false; }
        if (!helpComparingValue(getDatestart(), otherEntity.getDatestart())) { return false; }
        if (!helpComparingValue(getDateend(), otherEntity.getDateend())) { return false; }
        if (!helpComparingValue(getHistory(), otherEntity.getHistory())) { return false; }
        if (!helpComparingValue(getExpectedhours(), otherEntity.getExpectedhours())) { return false; }
        if (!helpComparingValue(getActualhours(), otherEntity.getActualhours())) { return false; }
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
        if (this.getObjectId() != null) { result = result + this.getObjectId().hashCode(); }
        if (this.getResource() != null) { result = result + this.getResource().hashCode(); }
        if (this.getRole() != null) { result = result + this.getRole().hashCode(); }
        if (this.getTime() != null) { result = result + this.getTime().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getPercentcomplete() != null) { result = result + this.getPercentcomplete().hashCode(); }
        if (this.getDatestart() != null) { result = result + this.getDatestart().hashCode(); }
        if (this.getDateend() != null) { result = result + this.getDateend().hashCode(); }
        if (this.getHistory() != null) { result = result + this.getHistory().hashCode(); }
        if (this.getExpectedhours() != null) { result = result + this.getExpectedhours().hashCode(); }
        if (this.getActualhours() != null) { result = result + this.getActualhours().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getResource());
        sb.append(delimiter).append(getRole());
        sb.append(delimiter).append(getTime());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getPercentcomplete());
        sb.append(delimiter).append(getDatestart());
        sb.append(delimiter).append(getDateend());
        sb.append(delimiter).append(getHistory());
        sb.append(delimiter).append(getExpectedhours());
        sb.append(delimiter).append(getActualhours());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : INTEGER} */
    public static final String objectId_COLUMN = "Object_ID";

    /**
     * Get the value of the column 'Object_ID'. <br />
     * {UQ : INTEGER}
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Set the value of the column 'Object_ID'. <br />
     * {UQ : INTEGER}
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /** The column annotation for S2Dao. {UQ : VARCHAR(255)} */
    public static final String resource_COLUMN = "Resource";

    /**
     * Get the value of the column 'Resource'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'Resource'. (Nullable)
     */
    public String getResource() {
        return _resource;
    }

    /**
     * Set the value of the column 'Resource'. <br />
     * {UQ : VARCHAR(255)}
     * @param resource The value of the column 'Resource'. (Nullable)
     */
    public void setResource(String resource) {
        _modifiedProperties.addPropertyName("resource");
        this._resource = resource;
    }

    /** The column annotation for S2Dao. {UQ : VARCHAR(255)} */
    public static final String role_COLUMN = "Role";

    /**
     * Get the value of the column 'Role'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'Role'. (Nullable)
     */
    public String getRole() {
        return _role;
    }

    /**
     * Set the value of the column 'Role'. <br />
     * {UQ : VARCHAR(255)}
     * @param role The value of the column 'Role'. (Nullable)
     */
    public void setRole(String role) {
        _modifiedProperties.addPropertyName("role");
        this._role = role;
    }

    /** The column annotation for S2Dao. {DOUBLE} */
    public static final String time_COLUMN = "Time";

    /**
     * Get the value of the column 'Time'. <br />
     * {DOUBLE}
     * @return The value of the column 'Time'. (Nullable)
     */
    public java.math.BigDecimal getTime() {
        return _time;
    }

    /**
     * Set the value of the column 'Time'. <br />
     * {DOUBLE}
     * @param time The value of the column 'Time'. (Nullable)
     */
    public void setTime(java.math.BigDecimal time) {
        _modifiedProperties.addPropertyName("time");
        this._time = time;
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

    /** The column annotation for S2Dao. {SMALLINT} */
    public static final String percentcomplete_COLUMN = "PercentComplete";

    /**
     * Get the value of the column 'PercentComplete'. <br />
     * {SMALLINT}
     * @return The value of the column 'PercentComplete'. (Nullable)
     */
    public java.lang.Integer getPercentcomplete() {
        return _percentcomplete;
    }

    /**
     * Set the value of the column 'PercentComplete'. <br />
     * {SMALLINT}
     * @param percentcomplete The value of the column 'PercentComplete'. (Nullable)
     */
    public void setPercentcomplete(java.lang.Integer percentcomplete) {
        _modifiedProperties.addPropertyName("percentcomplete");
        this._percentcomplete = percentcomplete;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String datestart_COLUMN = "DateStart";

    /**
     * Get the value of the column 'DateStart'. <br />
     * {DATETIME}
     * @return The value of the column 'DateStart'. (Nullable)
     */
    public java.sql.Timestamp getDatestart() {
        return _datestart;
    }

    /**
     * Set the value of the column 'DateStart'. <br />
     * {DATETIME}
     * @param datestart The value of the column 'DateStart'. (Nullable)
     */
    public void setDatestart(java.sql.Timestamp datestart) {
        _modifiedProperties.addPropertyName("datestart");
        this._datestart = datestart;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String dateend_COLUMN = "DateEnd";

    /**
     * Get the value of the column 'DateEnd'. <br />
     * {DATETIME}
     * @return The value of the column 'DateEnd'. (Nullable)
     */
    public java.sql.Timestamp getDateend() {
        return _dateend;
    }

    /**
     * Set the value of the column 'DateEnd'. <br />
     * {DATETIME}
     * @param dateend The value of the column 'DateEnd'. (Nullable)
     */
    public void setDateend(java.sql.Timestamp dateend) {
        _modifiedProperties.addPropertyName("dateend");
        this._dateend = dateend;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String history_COLUMN = "History";

    /**
     * Get the value of the column 'History'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'History'. (Nullable)
     */
    public String getHistory() {
        return _history;
    }

    /**
     * Set the value of the column 'History'. <br />
     * {LONGCHAR(2147483647)}
     * @param history The value of the column 'History'. (Nullable)
     */
    public void setHistory(String history) {
        _modifiedProperties.addPropertyName("history");
        this._history = history;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String expectedhours_COLUMN = "ExpectedHours";

    /**
     * Get the value of the column 'ExpectedHours'. <br />
     * {INTEGER}
     * @return The value of the column 'ExpectedHours'. (Nullable)
     */
    public java.lang.Integer getExpectedhours() {
        return _expectedhours;
    }

    /**
     * Set the value of the column 'ExpectedHours'. <br />
     * {INTEGER}
     * @param expectedhours The value of the column 'ExpectedHours'. (Nullable)
     */
    public void setExpectedhours(java.lang.Integer expectedhours) {
        _modifiedProperties.addPropertyName("expectedhours");
        this._expectedhours = expectedhours;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String actualhours_COLUMN = "ActualHours";

    /**
     * Get the value of the column 'ActualHours'. <br />
     * {INTEGER}
     * @return The value of the column 'ActualHours'. (Nullable)
     */
    public java.lang.Integer getActualhours() {
        return _actualhours;
    }

    /**
     * Set the value of the column 'ActualHours'. <br />
     * {INTEGER}
     * @param actualhours The value of the column 'ActualHours'. (Nullable)
     */
    public void setActualhours(java.lang.Integer actualhours) {
        _modifiedProperties.addPropertyName("actualhours");
        this._actualhours = actualhours;
    }

}
