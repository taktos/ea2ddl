package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_objectrequires(TABLE).
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
@SuppressWarnings("unchecked")
public abstract class BsTObjectrequires implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_objectrequires. */
    public static final String TABLE = "t_objectrequires";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'ReqID'. {UQ : COUNTER : NotNull} */
    protected java.lang.Integer _reqid;

    /** The attribute of the column 'Object_ID'. {INTEGER} */
    protected java.lang.Integer _objectId;

    /** The attribute of the column 'Requirement'. {VARCHAR(255)} */
    protected String _requirement;

    /** The attribute of the column 'ReqType'. {VARCHAR(255)} */
    protected String _reqtype;

    /** The attribute of the column 'Status'. {VARCHAR(50)} */
    protected String _status;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'Stability'. {VARCHAR(50)} */
    protected String _stability;

    /** The attribute of the column 'Difficulty'. {VARCHAR(50)} */
    protected String _difficulty;

    /** The attribute of the column 'Priority'. {VARCHAR(50)} */
    protected String _priority;

    /** The attribute of the column 'LastUpdate'. {DATETIME} */
    protected java.sql.Timestamp _lastupdate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectrequires() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectrequires";
    }

    public String getTablePropertyName() {// as JavaBeansRule
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

    /** The column annotation for S2Dao. {UQ : COUNTER : NotNull} */
    public static final String reqid_COLUMN = "ReqID";

    /**
     * Get the value of the column 'ReqID'. <br />
     * {UQ : COUNTER : NotNull}
     * @return The value of the column 'ReqID'. (Nullable)
     */
    public java.lang.Integer getReqid() {
        return _reqid;
    }

    /**
     * Set the value of the column 'ReqID'. <br />
     * {UQ : COUNTER : NotNull}
     * @param reqid The value of the column 'ReqID'. (Nullable)
     */
    public void setReqid(java.lang.Integer reqid) {
        _modifiedProperties.addPropertyName("reqid");
        this._reqid = reqid;
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

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String requirement_COLUMN = "Requirement";

    /**
     * Get the value of the column 'Requirement'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Requirement'. (Nullable)
     */
    public String getRequirement() {
        return _requirement;
    }

    /**
     * Set the value of the column 'Requirement'. <br />
     * {VARCHAR(255)}
     * @param requirement The value of the column 'Requirement'. (Nullable)
     */
    public void setRequirement(String requirement) {
        _modifiedProperties.addPropertyName("requirement");
        this._requirement = requirement;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String reqtype_COLUMN = "ReqType";

    /**
     * Get the value of the column 'ReqType'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'ReqType'. (Nullable)
     */
    public String getReqtype() {
        return _reqtype;
    }

    /**
     * Set the value of the column 'ReqType'. <br />
     * {VARCHAR(255)}
     * @param reqtype The value of the column 'ReqType'. (Nullable)
     */
    public void setReqtype(String reqtype) {
        _modifiedProperties.addPropertyName("reqtype");
        this._reqtype = reqtype;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String status_COLUMN = "Status";

    /**
     * Get the value of the column 'Status'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Status'. (Nullable)
     */
    public String getStatus() {
        return _status;
    }

    /**
     * Set the value of the column 'Status'. <br />
     * {VARCHAR(50)}
     * @param status The value of the column 'Status'. (Nullable)
     */
    public void setStatus(String status) {
        _modifiedProperties.addPropertyName("status");
        this._status = status;
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

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String stability_COLUMN = "Stability";

    /**
     * Get the value of the column 'Stability'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Stability'. (Nullable)
     */
    public String getStability() {
        return _stability;
    }

    /**
     * Set the value of the column 'Stability'. <br />
     * {VARCHAR(50)}
     * @param stability The value of the column 'Stability'. (Nullable)
     */
    public void setStability(String stability) {
        _modifiedProperties.addPropertyName("stability");
        this._stability = stability;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String difficulty_COLUMN = "Difficulty";

    /**
     * Get the value of the column 'Difficulty'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Difficulty'. (Nullable)
     */
    public String getDifficulty() {
        return _difficulty;
    }

    /**
     * Set the value of the column 'Difficulty'. <br />
     * {VARCHAR(50)}
     * @param difficulty The value of the column 'Difficulty'. (Nullable)
     */
    public void setDifficulty(String difficulty) {
        _modifiedProperties.addPropertyName("difficulty");
        this._difficulty = difficulty;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String priority_COLUMN = "Priority";

    /**
     * Get the value of the column 'Priority'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Priority'. (Nullable)
     */
    public String getPriority() {
        return _priority;
    }

    /**
     * Set the value of the column 'Priority'. <br />
     * {VARCHAR(50)}
     * @param priority The value of the column 'Priority'. (Nullable)
     */
    public void setPriority(String priority) {
        _modifiedProperties.addPropertyName("priority");
        this._priority = priority;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String lastupdate_COLUMN = "LastUpdate";

    /**
     * Get the value of the column 'LastUpdate'. <br />
     * {DATETIME}
     * @return The value of the column 'LastUpdate'. (Nullable)
     */
    public java.sql.Timestamp getLastupdate() {
        return _lastupdate;
    }

    /**
     * Set the value of the column 'LastUpdate'. <br />
     * {DATETIME}
     * @param lastupdate The value of the column 'LastUpdate'. (Nullable)
     */
    public void setLastupdate(java.sql.Timestamp lastupdate) {
        _modifiedProperties.addPropertyName("lastupdate");
        this._lastupdate = lastupdate;
    }

}
