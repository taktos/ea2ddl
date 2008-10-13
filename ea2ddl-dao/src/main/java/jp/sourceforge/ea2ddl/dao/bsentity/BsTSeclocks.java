package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_seclocks(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     UserID, GroupID, EntityType, EntityID, Timestamp, LockType
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
public abstract class BsTSeclocks implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_seclocks. */
    public static final String TABLE = "t_seclocks";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'UserID'. {VARCHAR(40)} */
    protected String _userid;

    /** The attribute of the column 'GroupID'. {VARCHAR(40)} */
    protected String _groupid;

    /** The attribute of the column 'EntityType'. {VARCHAR(32)} */
    protected String _entitytype;

    /** The attribute of the column 'EntityID'. {UQ : VARCHAR(40)} */
    protected String _entityid;

    /** The attribute of the column 'Timestamp'. {DATETIME} */
    protected java.sql.Timestamp _timestamp;

    /** The attribute of the column 'LockType'. {VARCHAR(255)} */
    protected String _locktype;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSeclocks() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_seclocks";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TSeclocks";
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
        if (other == null || !(other instanceof BsTSeclocks)) { return false; }
        final BsTSeclocks otherEntity = (BsTSeclocks)other;
        if (!helpComparingValue(getUserid(), otherEntity.getUserid())) { return false; }
        if (!helpComparingValue(getGroupid(), otherEntity.getGroupid())) { return false; }
        if (!helpComparingValue(getEntitytype(), otherEntity.getEntitytype())) { return false; }
        if (!helpComparingValue(getEntityid(), otherEntity.getEntityid())) { return false; }
        if (!helpComparingValue(getTimestamp(), otherEntity.getTimestamp())) { return false; }
        if (!helpComparingValue(getLocktype(), otherEntity.getLocktype())) { return false; }
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
        if (this.getUserid() != null) { result = result + this.getUserid().hashCode(); }
        if (this.getGroupid() != null) { result = result + this.getGroupid().hashCode(); }
        if (this.getEntitytype() != null) { result = result + this.getEntitytype().hashCode(); }
        if (this.getEntityid() != null) { result = result + this.getEntityid().hashCode(); }
        if (this.getTimestamp() != null) { result = result + this.getTimestamp().hashCode(); }
        if (this.getLocktype() != null) { result = result + this.getLocktype().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getUserid());
        sb.append(delimiter).append(getGroupid());
        sb.append(delimiter).append(getEntitytype());
        sb.append(delimiter).append(getEntityid());
        sb.append(delimiter).append(getTimestamp());
        sb.append(delimiter).append(getLocktype());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {VARCHAR(40)} */
    public static final String userid_COLUMN = "UserID";

    /**
     * Get the value of the column 'UserID'. <br />
     * {VARCHAR(40)}
     * @return The value of the column 'UserID'. (Nullable)
     */
    public String getUserid() {
        return _userid;
    }

    /**
     * Set the value of the column 'UserID'. <br />
     * {VARCHAR(40)}
     * @param userid The value of the column 'UserID'. (Nullable)
     */
    public void setUserid(String userid) {
        _modifiedProperties.addPropertyName("userid");
        this._userid = userid;
    }

    /** The column annotation for S2Dao. {VARCHAR(40)} */
    public static final String groupid_COLUMN = "GroupID";

    /**
     * Get the value of the column 'GroupID'. <br />
     * {VARCHAR(40)}
     * @return The value of the column 'GroupID'. (Nullable)
     */
    public String getGroupid() {
        return _groupid;
    }

    /**
     * Set the value of the column 'GroupID'. <br />
     * {VARCHAR(40)}
     * @param groupid The value of the column 'GroupID'. (Nullable)
     */
    public void setGroupid(String groupid) {
        _modifiedProperties.addPropertyName("groupid");
        this._groupid = groupid;
    }

    /** The column annotation for S2Dao. {VARCHAR(32)} */
    public static final String entitytype_COLUMN = "EntityType";

    /**
     * Get the value of the column 'EntityType'. <br />
     * {VARCHAR(32)}
     * @return The value of the column 'EntityType'. (Nullable)
     */
    public String getEntitytype() {
        return _entitytype;
    }

    /**
     * Set the value of the column 'EntityType'. <br />
     * {VARCHAR(32)}
     * @param entitytype The value of the column 'EntityType'. (Nullable)
     */
    public void setEntitytype(String entitytype) {
        _modifiedProperties.addPropertyName("entitytype");
        this._entitytype = entitytype;
    }

    /** The column annotation for S2Dao. {UQ : VARCHAR(40)} */
    public static final String entityid_COLUMN = "EntityID";

    /**
     * Get the value of the column 'EntityID'. <br />
     * {UQ : VARCHAR(40)}
     * @return The value of the column 'EntityID'. (Nullable)
     */
    public String getEntityid() {
        return _entityid;
    }

    /**
     * Set the value of the column 'EntityID'. <br />
     * {UQ : VARCHAR(40)}
     * @param entityid The value of the column 'EntityID'. (Nullable)
     */
    public void setEntityid(String entityid) {
        _modifiedProperties.addPropertyName("entityid");
        this._entityid = entityid;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String timestamp_COLUMN = "Timestamp";

    /**
     * Get the value of the column 'Timestamp'. <br />
     * {DATETIME}
     * @return The value of the column 'Timestamp'. (Nullable)
     */
    public java.sql.Timestamp getTimestamp() {
        return _timestamp;
    }

    /**
     * Set the value of the column 'Timestamp'. <br />
     * {DATETIME}
     * @param timestamp The value of the column 'Timestamp'. (Nullable)
     */
    public void setTimestamp(java.sql.Timestamp timestamp) {
        _modifiedProperties.addPropertyName("timestamp");
        this._timestamp = timestamp;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String locktype_COLUMN = "LockType";

    /**
     * Get the value of the column 'LockType'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'LockType'. (Nullable)
     */
    public String getLocktype() {
        return _locktype;
    }

    /**
     * Set the value of the column 'LockType'. <br />
     * {VARCHAR(255)}
     * @param locktype The value of the column 'LockType'. (Nullable)
     */
    public void setLocktype(String locktype) {
        _modifiedProperties.addPropertyName("locktype");
        this._locktype = locktype;
    }

}
