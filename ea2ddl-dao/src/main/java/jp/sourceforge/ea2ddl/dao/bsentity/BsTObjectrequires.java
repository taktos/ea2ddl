package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_objectrequires that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     ReqID, Object_ID, Requirement, ReqType, Status, Notes, Stability, Difficulty, Priority, LastUpdate
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
public abstract class BsTObjectrequires implements Entity, Serializable {

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
    /** ReqID: {UQ : NotNull : COUNTER} */
    protected java.lang.Integer _reqid;

    /** Object_ID: {INTEGER} */
    protected java.lang.Integer _objectId;

    /** Requirement: {VARCHAR(255)} */
    protected String _requirement;

    /** ReqType: {VARCHAR(255)} */
    protected String _reqtype;

    /** Status: {VARCHAR(50)} */
    protected String _status;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** Stability: {VARCHAR(50)} */
    protected String _stability;

    /** Difficulty: {VARCHAR(50)} */
    protected String _difficulty;

    /** Priority: {VARCHAR(50)} */
    protected String _priority;

    /** LastUpdate: {DATETIME} */
    protected java.sql.Timestamp _lastupdate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectrequires";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TObjectrequires";
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
        if (other == null || !(other instanceof BsTObjectrequires)) { return false; }
        final BsTObjectrequires otherEntity = (BsTObjectrequires)other;
        if (!helpComparingValue(getReqid(), otherEntity.getReqid())) { return false; }
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getRequirement(), otherEntity.getRequirement())) { return false; }
        if (!helpComparingValue(getReqtype(), otherEntity.getReqtype())) { return false; }
        if (!helpComparingValue(getStatus(), otherEntity.getStatus())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getStability(), otherEntity.getStability())) { return false; }
        if (!helpComparingValue(getDifficulty(), otherEntity.getDifficulty())) { return false; }
        if (!helpComparingValue(getPriority(), otherEntity.getPriority())) { return false; }
        if (!helpComparingValue(getLastupdate(), otherEntity.getLastupdate())) { return false; }
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
        if (this.getReqid() != null) { result = result + this.getReqid().hashCode(); }
        if (this.getObjectId() != null) { result = result + this.getObjectId().hashCode(); }
        if (this.getRequirement() != null) { result = result + this.getRequirement().hashCode(); }
        if (this.getReqtype() != null) { result = result + this.getReqtype().hashCode(); }
        if (this.getStatus() != null) { result = result + this.getStatus().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getStability() != null) { result = result + this.getStability().hashCode(); }
        if (this.getDifficulty() != null) { result = result + this.getDifficulty().hashCode(); }
        if (this.getPriority() != null) { result = result + this.getPriority().hashCode(); }
        if (this.getLastupdate() != null) { result = result + this.getLastupdate().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getReqid());
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getRequirement());
        sb.append(delimiter).append(getReqtype());
        sb.append(delimiter).append(getStatus());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getStability());
        sb.append(delimiter).append(getDifficulty());
        sb.append(delimiter).append(getPriority());
        sb.append(delimiter).append(getLastupdate());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * ReqID: {UQ : NotNull : COUNTER} <br />
     * @return The value of the column 'ReqID'. (Nullable)
     */
    public java.lang.Integer getReqid() {
        return _reqid;
    }

    /**
     * ReqID: {UQ : NotNull : COUNTER} <br />
     * @param reqid The value of the column 'ReqID'. (Nullable)
     */
    public void setReqid(java.lang.Integer reqid) {
        _modifiedProperties.addPropertyName("reqid");
        this._reqid = reqid;
    }

    /**
     * Object_ID: {INTEGER} <br />
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Object_ID: {INTEGER} <br />
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /**
     * Requirement: {VARCHAR(255)} <br />
     * @return The value of the column 'Requirement'. (Nullable)
     */
    public String getRequirement() {
        return _requirement;
    }

    /**
     * Requirement: {VARCHAR(255)} <br />
     * @param requirement The value of the column 'Requirement'. (Nullable)
     */
    public void setRequirement(String requirement) {
        _modifiedProperties.addPropertyName("requirement");
        this._requirement = requirement;
    }

    /**
     * ReqType: {VARCHAR(255)} <br />
     * @return The value of the column 'ReqType'. (Nullable)
     */
    public String getReqtype() {
        return _reqtype;
    }

    /**
     * ReqType: {VARCHAR(255)} <br />
     * @param reqtype The value of the column 'ReqType'. (Nullable)
     */
    public void setReqtype(String reqtype) {
        _modifiedProperties.addPropertyName("reqtype");
        this._reqtype = reqtype;
    }

    /**
     * Status: {VARCHAR(50)} <br />
     * @return The value of the column 'Status'. (Nullable)
     */
    public String getStatus() {
        return _status;
    }

    /**
     * Status: {VARCHAR(50)} <br />
     * @param status The value of the column 'Status'. (Nullable)
     */
    public void setStatus(String status) {
        _modifiedProperties.addPropertyName("status");
        this._status = status;
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
     * Stability: {VARCHAR(50)} <br />
     * @return The value of the column 'Stability'. (Nullable)
     */
    public String getStability() {
        return _stability;
    }

    /**
     * Stability: {VARCHAR(50)} <br />
     * @param stability The value of the column 'Stability'. (Nullable)
     */
    public void setStability(String stability) {
        _modifiedProperties.addPropertyName("stability");
        this._stability = stability;
    }

    /**
     * Difficulty: {VARCHAR(50)} <br />
     * @return The value of the column 'Difficulty'. (Nullable)
     */
    public String getDifficulty() {
        return _difficulty;
    }

    /**
     * Difficulty: {VARCHAR(50)} <br />
     * @param difficulty The value of the column 'Difficulty'. (Nullable)
     */
    public void setDifficulty(String difficulty) {
        _modifiedProperties.addPropertyName("difficulty");
        this._difficulty = difficulty;
    }

    /**
     * Priority: {VARCHAR(50)} <br />
     * @return The value of the column 'Priority'. (Nullable)
     */
    public String getPriority() {
        return _priority;
    }

    /**
     * Priority: {VARCHAR(50)} <br />
     * @param priority The value of the column 'Priority'. (Nullable)
     */
    public void setPriority(String priority) {
        _modifiedProperties.addPropertyName("priority");
        this._priority = priority;
    }

    /**
     * LastUpdate: {DATETIME} <br />
     * @return The value of the column 'LastUpdate'. (Nullable)
     */
    public java.sql.Timestamp getLastupdate() {
        return _lastupdate;
    }

    /**
     * LastUpdate: {DATETIME} <br />
     * @param lastupdate The value of the column 'LastUpdate'. (Nullable)
     */
    public void setLastupdate(java.sql.Timestamp lastupdate) {
        _modifiedProperties.addPropertyName("lastupdate");
        this._lastupdate = lastupdate;
    }
}
