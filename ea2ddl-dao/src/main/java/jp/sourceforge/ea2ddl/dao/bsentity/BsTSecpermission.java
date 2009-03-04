package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_secpermission that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PermissionID, PermissionName
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
public abstract class BsTSecpermission implements Entity, Serializable {

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
    /** PermissionID: {UQ : INTEGER} */
    protected java.lang.Integer _permissionid;

    /** PermissionName: {VARCHAR(50)} */
    protected String _permissionname;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_secpermission";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TSecpermission";
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
        if (other == null || !(other instanceof BsTSecpermission)) { return false; }
        final BsTSecpermission otherEntity = (BsTSecpermission)other;
        if (!helpComparingValue(getPermissionid(), otherEntity.getPermissionid())) { return false; }
        if (!helpComparingValue(getPermissionname(), otherEntity.getPermissionname())) { return false; }
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
        if (this.getPermissionid() != null) { result = result + this.getPermissionid().hashCode(); }
        if (this.getPermissionname() != null) { result = result + this.getPermissionname().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getPermissionid());
        sb.append(delimiter).append(getPermissionname());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * PermissionID: {UQ : INTEGER} <br />
     * @return The value of the column 'PermissionID'. (Nullable)
     */
    public java.lang.Integer getPermissionid() {
        return _permissionid;
    }

    /**
     * PermissionID: {UQ : INTEGER} <br />
     * @param permissionid The value of the column 'PermissionID'. (Nullable)
     */
    public void setPermissionid(java.lang.Integer permissionid) {
        _modifiedProperties.addPropertyName("permissionid");
        this._permissionid = permissionid;
    }

    /**
     * PermissionName: {VARCHAR(50)} <br />
     * @return The value of the column 'PermissionName'. (Nullable)
     */
    public String getPermissionname() {
        return _permissionname;
    }

    /**
     * PermissionName: {VARCHAR(50)} <br />
     * @param permissionname The value of the column 'PermissionName'. (Nullable)
     */
    public void setPermissionname(String permissionname) {
        _modifiedProperties.addPropertyName("permissionname");
        this._permissionname = permissionname;
    }
}
