package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_clients that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Name, Organisation, Phone1, Phone2, Mobile, Fax, Email, Roles, Notes
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
public abstract class BsTClients implements Entity, Serializable {

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
    /** Name: {UQ : VARCHAR(255)} */
    protected String _name;

    /** Organisation: {VARCHAR(255)} */
    protected String _organisation;

    /** Phone1: {VARCHAR(50)} */
    protected String _phone1;

    /** Phone2: {VARCHAR(50)} */
    protected String _phone2;

    /** Mobile: {VARCHAR(50)} */
    protected String _mobile;

    /** Fax: {VARCHAR(50)} */
    protected String _fax;

    /** Email: {VARCHAR(50)} */
    protected String _email;

    /** Roles: {VARCHAR(255)} */
    protected String _roles;

    /** Notes: {VARCHAR(255)} */
    protected String _notes;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_clients";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TClients";
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
        if (other == null || !(other instanceof BsTClients)) { return false; }
        final BsTClients otherEntity = (BsTClients)other;
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getOrganisation(), otherEntity.getOrganisation())) { return false; }
        if (!helpComparingValue(getPhone1(), otherEntity.getPhone1())) { return false; }
        if (!helpComparingValue(getPhone2(), otherEntity.getPhone2())) { return false; }
        if (!helpComparingValue(getMobile(), otherEntity.getMobile())) { return false; }
        if (!helpComparingValue(getFax(), otherEntity.getFax())) { return false; }
        if (!helpComparingValue(getEmail(), otherEntity.getEmail())) { return false; }
        if (!helpComparingValue(getRoles(), otherEntity.getRoles())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
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
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getOrganisation() != null) { result = result + this.getOrganisation().hashCode(); }
        if (this.getPhone1() != null) { result = result + this.getPhone1().hashCode(); }
        if (this.getPhone2() != null) { result = result + this.getPhone2().hashCode(); }
        if (this.getMobile() != null) { result = result + this.getMobile().hashCode(); }
        if (this.getFax() != null) { result = result + this.getFax().hashCode(); }
        if (this.getEmail() != null) { result = result + this.getEmail().hashCode(); }
        if (this.getRoles() != null) { result = result + this.getRoles().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getOrganisation());
        sb.append(delimiter).append(getPhone1());
        sb.append(delimiter).append(getPhone2());
        sb.append(delimiter).append(getMobile());
        sb.append(delimiter).append(getFax());
        sb.append(delimiter).append(getEmail());
        sb.append(delimiter).append(getRoles());
        sb.append(delimiter).append(getNotes());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Name: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Name: {UQ : VARCHAR(255)} <br />
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /**
     * Organisation: {VARCHAR(255)} <br />
     * @return The value of the column 'Organisation'. (Nullable)
     */
    public String getOrganisation() {
        return _organisation;
    }

    /**
     * Organisation: {VARCHAR(255)} <br />
     * @param organisation The value of the column 'Organisation'. (Nullable)
     */
    public void setOrganisation(String organisation) {
        _modifiedProperties.addPropertyName("organisation");
        this._organisation = organisation;
    }

    /**
     * Phone1: {VARCHAR(50)} <br />
     * @return The value of the column 'Phone1'. (Nullable)
     */
    public String getPhone1() {
        return _phone1;
    }

    /**
     * Phone1: {VARCHAR(50)} <br />
     * @param phone1 The value of the column 'Phone1'. (Nullable)
     */
    public void setPhone1(String phone1) {
        _modifiedProperties.addPropertyName("phone1");
        this._phone1 = phone1;
    }

    /**
     * Phone2: {VARCHAR(50)} <br />
     * @return The value of the column 'Phone2'. (Nullable)
     */
    public String getPhone2() {
        return _phone2;
    }

    /**
     * Phone2: {VARCHAR(50)} <br />
     * @param phone2 The value of the column 'Phone2'. (Nullable)
     */
    public void setPhone2(String phone2) {
        _modifiedProperties.addPropertyName("phone2");
        this._phone2 = phone2;
    }

    /**
     * Mobile: {VARCHAR(50)} <br />
     * @return The value of the column 'Mobile'. (Nullable)
     */
    public String getMobile() {
        return _mobile;
    }

    /**
     * Mobile: {VARCHAR(50)} <br />
     * @param mobile The value of the column 'Mobile'. (Nullable)
     */
    public void setMobile(String mobile) {
        _modifiedProperties.addPropertyName("mobile");
        this._mobile = mobile;
    }

    /**
     * Fax: {VARCHAR(50)} <br />
     * @return The value of the column 'Fax'. (Nullable)
     */
    public String getFax() {
        return _fax;
    }

    /**
     * Fax: {VARCHAR(50)} <br />
     * @param fax The value of the column 'Fax'. (Nullable)
     */
    public void setFax(String fax) {
        _modifiedProperties.addPropertyName("fax");
        this._fax = fax;
    }

    /**
     * Email: {VARCHAR(50)} <br />
     * @return The value of the column 'Email'. (Nullable)
     */
    public String getEmail() {
        return _email;
    }

    /**
     * Email: {VARCHAR(50)} <br />
     * @param email The value of the column 'Email'. (Nullable)
     */
    public void setEmail(String email) {
        _modifiedProperties.addPropertyName("email");
        this._email = email;
    }

    /**
     * Roles: {VARCHAR(255)} <br />
     * @return The value of the column 'Roles'. (Nullable)
     */
    public String getRoles() {
        return _roles;
    }

    /**
     * Roles: {VARCHAR(255)} <br />
     * @param roles The value of the column 'Roles'. (Nullable)
     */
    public void setRoles(String roles) {
        _modifiedProperties.addPropertyName("roles");
        this._roles = roles;
    }

    /**
     * Notes: {VARCHAR(255)} <br />
     * @return The value of the column 'Notes'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * Notes: {VARCHAR(255)} <br />
     * @param notes The value of the column 'Notes'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }
}
