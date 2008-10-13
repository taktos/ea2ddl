package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_secusergroup(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     UserID, GroupID
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
public abstract class BsTSecusergroup implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_secusergroup. */
    public static final String TABLE = "t_secusergroup";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'UserID'. {UQ : VARCHAR(40)} */
    protected String _userid;

    /** The attribute of the column 'GroupID'. {UQ : VARCHAR(40)} */
    protected String _groupid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSecusergroup() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_secusergroup";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TSecusergroup";
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
        if (other == null || !(other instanceof BsTSecusergroup)) { return false; }
        final BsTSecusergroup otherEntity = (BsTSecusergroup)other;
        if (!helpComparingValue(getUserid(), otherEntity.getUserid())) { return false; }
        if (!helpComparingValue(getGroupid(), otherEntity.getGroupid())) { return false; }
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
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : VARCHAR(40)} */
    public static final String userid_COLUMN = "UserID";

    /**
     * Get the value of the column 'UserID'. <br />
     * {UQ : VARCHAR(40)}
     * @return The value of the column 'UserID'. (Nullable)
     */
    public String getUserid() {
        return _userid;
    }

    /**
     * Set the value of the column 'UserID'. <br />
     * {UQ : VARCHAR(40)}
     * @param userid The value of the column 'UserID'. (Nullable)
     */
    public void setUserid(String userid) {
        _modifiedProperties.addPropertyName("userid");
        this._userid = userid;
    }

    /** The column annotation for S2Dao. {UQ : VARCHAR(40)} */
    public static final String groupid_COLUMN = "GroupID";

    /**
     * Get the value of the column 'GroupID'. <br />
     * {UQ : VARCHAR(40)}
     * @return The value of the column 'GroupID'. (Nullable)
     */
    public String getGroupid() {
        return _groupid;
    }

    /**
     * Set the value of the column 'GroupID'. <br />
     * {UQ : VARCHAR(40)}
     * @param groupid The value of the column 'GroupID'. (Nullable)
     */
    public void setGroupid(String groupid) {
        _modifiedProperties.addPropertyName("groupid");
        this._groupid = groupid;
    }

}
