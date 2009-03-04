package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_objectresource that the type is TABLE. <br />
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
public abstract class BsTObjectresource implements Entity, Serializable {

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
    /** Object_ID: {UQ : INTEGER} */
    protected java.lang.Integer _objectId;

    /** Resource: {UQ : VARCHAR(255)} */
    protected String _resource;

    /** Role: {UQ : VARCHAR(255)} */
    protected String _role;

    /** Time: {DOUBLE} */
    protected java.math.BigDecimal _time;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** PercentComplete: {SMALLINT} */
    protected java.lang.Integer _percentcomplete;

    /** DateStart: {DATETIME} */
    protected java.sql.Timestamp _datestart;

    /** DateEnd: {DATETIME} */
    protected java.sql.Timestamp _dateend;

    /** History: {LONGCHAR(2147483647)} */
    protected String _history;

    /** ExpectedHours: {INTEGER} */
    protected java.lang.Integer _expectedhours;

    /** ActualHours: {INTEGER} */
    protected java.lang.Integer _actualhours;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectresource";
    }

    public String getTablePropertyName() { // as JavaBeansRule
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
    /**
     * Object_ID: {UQ : INTEGER} <br />
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Object_ID: {UQ : INTEGER} <br />
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /**
     * Resource: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'Resource'. (Nullable)
     */
    public String getResource() {
        return _resource;
    }

    /**
     * Resource: {UQ : VARCHAR(255)} <br />
     * @param resource The value of the column 'Resource'. (Nullable)
     */
    public void setResource(String resource) {
        _modifiedProperties.addPropertyName("resource");
        this._resource = resource;
    }

    /**
     * Role: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'Role'. (Nullable)
     */
    public String getRole() {
        return _role;
    }

    /**
     * Role: {UQ : VARCHAR(255)} <br />
     * @param role The value of the column 'Role'. (Nullable)
     */
    public void setRole(String role) {
        _modifiedProperties.addPropertyName("role");
        this._role = role;
    }

    /**
     * Time: {DOUBLE} <br />
     * @return The value of the column 'Time'. (Nullable)
     */
    public java.math.BigDecimal getTime() {
        return _time;
    }

    /**
     * Time: {DOUBLE} <br />
     * @param time The value of the column 'Time'. (Nullable)
     */
    public void setTime(java.math.BigDecimal time) {
        _modifiedProperties.addPropertyName("time");
        this._time = time;
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
     * PercentComplete: {SMALLINT} <br />
     * @return The value of the column 'PercentComplete'. (Nullable)
     */
    public java.lang.Integer getPercentcomplete() {
        return _percentcomplete;
    }

    /**
     * PercentComplete: {SMALLINT} <br />
     * @param percentcomplete The value of the column 'PercentComplete'. (Nullable)
     */
    public void setPercentcomplete(java.lang.Integer percentcomplete) {
        _modifiedProperties.addPropertyName("percentcomplete");
        this._percentcomplete = percentcomplete;
    }

    /**
     * DateStart: {DATETIME} <br />
     * @return The value of the column 'DateStart'. (Nullable)
     */
    public java.sql.Timestamp getDatestart() {
        return _datestart;
    }

    /**
     * DateStart: {DATETIME} <br />
     * @param datestart The value of the column 'DateStart'. (Nullable)
     */
    public void setDatestart(java.sql.Timestamp datestart) {
        _modifiedProperties.addPropertyName("datestart");
        this._datestart = datestart;
    }

    /**
     * DateEnd: {DATETIME} <br />
     * @return The value of the column 'DateEnd'. (Nullable)
     */
    public java.sql.Timestamp getDateend() {
        return _dateend;
    }

    /**
     * DateEnd: {DATETIME} <br />
     * @param dateend The value of the column 'DateEnd'. (Nullable)
     */
    public void setDateend(java.sql.Timestamp dateend) {
        _modifiedProperties.addPropertyName("dateend");
        this._dateend = dateend;
    }

    /**
     * History: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'History'. (Nullable)
     */
    public String getHistory() {
        return _history;
    }

    /**
     * History: {LONGCHAR(2147483647)} <br />
     * @param history The value of the column 'History'. (Nullable)
     */
    public void setHistory(String history) {
        _modifiedProperties.addPropertyName("history");
        this._history = history;
    }

    /**
     * ExpectedHours: {INTEGER} <br />
     * @return The value of the column 'ExpectedHours'. (Nullable)
     */
    public java.lang.Integer getExpectedhours() {
        return _expectedhours;
    }

    /**
     * ExpectedHours: {INTEGER} <br />
     * @param expectedhours The value of the column 'ExpectedHours'. (Nullable)
     */
    public void setExpectedhours(java.lang.Integer expectedhours) {
        _modifiedProperties.addPropertyName("expectedhours");
        this._expectedhours = expectedhours;
    }

    /**
     * ActualHours: {INTEGER} <br />
     * @return The value of the column 'ActualHours'. (Nullable)
     */
    public java.lang.Integer getActualhours() {
        return _actualhours;
    }

    /**
     * ActualHours: {INTEGER} <br />
     * @param actualhours The value of the column 'ActualHours'. (Nullable)
     */
    public void setActualhours(java.lang.Integer actualhours) {
        _modifiedProperties.addPropertyName("actualhours");
        this._actualhours = actualhours;
    }
}
