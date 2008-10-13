package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_secgrouppermission(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     GroupID, PermissionID
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
public abstract class BsTSecgrouppermission implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_secgrouppermission. */
    public static final String TABLE = "t_secgrouppermission";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'GroupID'. {UQ : VARCHAR(40)} */
    protected String _groupid;

    /** The attribute of the column 'PermissionID'. {UQ : INTEGER} */
    protected java.lang.Integer _permissionid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSecgrouppermission() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_secgrouppermission";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TSecgrouppermission";
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
        if (other == null || !(other instanceof BsTSecgrouppermission)) { return false; }
        final BsTSecgrouppermission otherEntity = (BsTSecgrouppermission)other;
        if (!helpComparingValue(getGroupid(), otherEntity.getGroupid())) { return false; }
        if (!helpComparingValue(getPermissionid(), otherEntity.getPermissionid())) { return false; }
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
        if (this.getGroupid() != null) { result = result + this.getGroupid().hashCode(); }
        if (this.getPermissionid() != null) { result = result + this.getPermissionid().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getGroupid());
        sb.append(delimiter).append(getPermissionid());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

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

    /** The column annotation for S2Dao. {UQ : INTEGER} */
    public static final String permissionid_COLUMN = "PermissionID";

    /**
     * Get the value of the column 'PermissionID'. <br />
     * {UQ : INTEGER}
     * @return The value of the column 'PermissionID'. (Nullable)
     */
    public java.lang.Integer getPermissionid() {
        return _permissionid;
    }

    /**
     * Set the value of the column 'PermissionID'. <br />
     * {UQ : INTEGER}
     * @param permissionid The value of the column 'PermissionID'. (Nullable)
     */
    public void setPermissionid(java.lang.Integer permissionid) {
        _modifiedProperties.addPropertyName("permissionid");
        this._permissionid = permissionid;
    }

}
