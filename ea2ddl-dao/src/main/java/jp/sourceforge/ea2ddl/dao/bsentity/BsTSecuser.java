package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_secuser(TABLE).
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
@SuppressWarnings("unchecked")
public abstract class BsTSecuser implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_secuser. */
    public static final String TABLE = "t_secuser";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'UserID'. {UQ : VARCHAR(40)} */
    protected String _userid;

    /** The attribute of the column 'UserLogin'. {VARCHAR(32)} */
    protected String _userlogin;

    /** The attribute of the column 'FirstName'. {VARCHAR(50)} */
    protected String _firstname;

    /** The attribute of the column 'Surname'. {VARCHAR(50)} */
    protected String _surname;

    /** The attribute of the column 'Department'. {VARCHAR(50)} */
    protected String _department;

    /** The attribute of the column 'Password'. {VARCHAR(12)} */
    protected String _password;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSecuser() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_secuser";
    }

    public String getTablePropertyName() {// as JavaBeansRule
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

    /** The column annotation for S2Dao. {VARCHAR(32)} */
    public static final String userlogin_COLUMN = "UserLogin";

    /**
     * Get the value of the column 'UserLogin'. <br />
     * {VARCHAR(32)}
     * @return The value of the column 'UserLogin'. (Nullable)
     */
    public String getUserlogin() {
        return _userlogin;
    }

    /**
     * Set the value of the column 'UserLogin'. <br />
     * {VARCHAR(32)}
     * @param userlogin The value of the column 'UserLogin'. (Nullable)
     */
    public void setUserlogin(String userlogin) {
        _modifiedProperties.addPropertyName("userlogin");
        this._userlogin = userlogin;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String firstname_COLUMN = "FirstName";

    /**
     * Get the value of the column 'FirstName'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'FirstName'. (Nullable)
     */
    public String getFirstname() {
        return _firstname;
    }

    /**
     * Set the value of the column 'FirstName'. <br />
     * {VARCHAR(50)}
     * @param firstname The value of the column 'FirstName'. (Nullable)
     */
    public void setFirstname(String firstname) {
        _modifiedProperties.addPropertyName("firstname");
        this._firstname = firstname;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String surname_COLUMN = "Surname";

    /**
     * Get the value of the column 'Surname'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Surname'. (Nullable)
     */
    public String getSurname() {
        return _surname;
    }

    /**
     * Set the value of the column 'Surname'. <br />
     * {VARCHAR(50)}
     * @param surname The value of the column 'Surname'. (Nullable)
     */
    public void setSurname(String surname) {
        _modifiedProperties.addPropertyName("surname");
        this._surname = surname;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String department_COLUMN = "Department";

    /**
     * Get the value of the column 'Department'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Department'. (Nullable)
     */
    public String getDepartment() {
        return _department;
    }

    /**
     * Set the value of the column 'Department'. <br />
     * {VARCHAR(50)}
     * @param department The value of the column 'Department'. (Nullable)
     */
    public void setDepartment(String department) {
        _modifiedProperties.addPropertyName("department");
        this._department = department;
    }

    /** The column annotation for S2Dao. {VARCHAR(12)} */
    public static final String password_COLUMN = "Password";

    /**
     * Get the value of the column 'Password'. <br />
     * {VARCHAR(12)}
     * @return The value of the column 'Password'. (Nullable)
     */
    public String getPassword() {
        return _password;
    }

    /**
     * Set the value of the column 'Password'. <br />
     * {VARCHAR(12)}
     * @param password The value of the column 'Password'. (Nullable)
     */
    public void setPassword(String password) {
        _modifiedProperties.addPropertyName("password");
        this._password = password;
    }

}
