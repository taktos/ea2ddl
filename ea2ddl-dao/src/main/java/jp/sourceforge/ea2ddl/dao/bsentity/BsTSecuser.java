package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_secuser that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     UserID, UserLogin, FirstName, Surname, Department, Password
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
public abstract class BsTSecuser implements Entity, Serializable {

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
    /** UserID: {UQ : VARCHAR(40)} */
    protected String _userid;

    /** UserLogin: {VARCHAR(32)} */
    protected String _userlogin;

    /** FirstName: {VARCHAR(50)} */
    protected String _firstname;

    /** Surname: {VARCHAR(50)} */
    protected String _surname;

    /** Department: {VARCHAR(50)} */
    protected String _department;

    /** Password: {VARCHAR(12)} */
    protected String _password;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_secuser";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TSecuser";
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
        if (other == null || !(other instanceof BsTSecuser)) { return false; }
        final BsTSecuser otherEntity = (BsTSecuser)other;
        if (!helpComparingValue(getUserid(), otherEntity.getUserid())) { return false; }
        if (!helpComparingValue(getUserlogin(), otherEntity.getUserlogin())) { return false; }
        if (!helpComparingValue(getFirstname(), otherEntity.getFirstname())) { return false; }
        if (!helpComparingValue(getSurname(), otherEntity.getSurname())) { return false; }
        if (!helpComparingValue(getDepartment(), otherEntity.getDepartment())) { return false; }
        if (!helpComparingValue(getPassword(), otherEntity.getPassword())) { return false; }
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
        if (this.getUserlogin() != null) { result = result + this.getUserlogin().hashCode(); }
        if (this.getFirstname() != null) { result = result + this.getFirstname().hashCode(); }
        if (this.getSurname() != null) { result = result + this.getSurname().hashCode(); }
        if (this.getDepartment() != null) { result = result + this.getDepartment().hashCode(); }
        if (this.getPassword() != null) { result = result + this.getPassword().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getUserid());
        sb.append(delimiter).append(getUserlogin());
        sb.append(delimiter).append(getFirstname());
        sb.append(delimiter).append(getSurname());
        sb.append(delimiter).append(getDepartment());
        sb.append(delimiter).append(getPassword());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * UserID: {UQ : VARCHAR(40)} <br />
     * @return The value of the column 'UserID'. (Nullable)
     */
    public String getUserid() {
        return _userid;
    }

    /**
     * UserID: {UQ : VARCHAR(40)} <br />
     * @param userid The value of the column 'UserID'. (Nullable)
     */
    public void setUserid(String userid) {
        _modifiedProperties.addPropertyName("userid");
        this._userid = userid;
    }

    /**
     * UserLogin: {VARCHAR(32)} <br />
     * @return The value of the column 'UserLogin'. (Nullable)
     */
    public String getUserlogin() {
        return _userlogin;
    }

    /**
     * UserLogin: {VARCHAR(32)} <br />
     * @param userlogin The value of the column 'UserLogin'. (Nullable)
     */
    public void setUserlogin(String userlogin) {
        _modifiedProperties.addPropertyName("userlogin");
        this._userlogin = userlogin;
    }

    /**
     * FirstName: {VARCHAR(50)} <br />
     * @return The value of the column 'FirstName'. (Nullable)
     */
    public String getFirstname() {
        return _firstname;
    }

    /**
     * FirstName: {VARCHAR(50)} <br />
     * @param firstname The value of the column 'FirstName'. (Nullable)
     */
    public void setFirstname(String firstname) {
        _modifiedProperties.addPropertyName("firstname");
        this._firstname = firstname;
    }

    /**
     * Surname: {VARCHAR(50)} <br />
     * @return The value of the column 'Surname'. (Nullable)
     */
    public String getSurname() {
        return _surname;
    }

    /**
     * Surname: {VARCHAR(50)} <br />
     * @param surname The value of the column 'Surname'. (Nullable)
     */
    public void setSurname(String surname) {
        _modifiedProperties.addPropertyName("surname");
        this._surname = surname;
    }

    /**
     * Department: {VARCHAR(50)} <br />
     * @return The value of the column 'Department'. (Nullable)
     */
    public String getDepartment() {
        return _department;
    }

    /**
     * Department: {VARCHAR(50)} <br />
     * @param department The value of the column 'Department'. (Nullable)
     */
    public void setDepartment(String department) {
        _modifiedProperties.addPropertyName("department");
        this._department = department;
    }

    /**
     * Password: {VARCHAR(12)} <br />
     * @return The value of the column 'Password'. (Nullable)
     */
    public String getPassword() {
        return _password;
    }

    /**
     * Password: {VARCHAR(12)} <br />
     * @param password The value of the column 'Password'. (Nullable)
     */
    public void setPassword(String password) {
        _modifiedProperties.addPropertyName("password");
        this._password = password;
    }
}
