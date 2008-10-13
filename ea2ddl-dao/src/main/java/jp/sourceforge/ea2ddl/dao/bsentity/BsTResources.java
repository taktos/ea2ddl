package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_resources(TABLE).
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
@SuppressWarnings("unchecked")
public abstract class BsTResources implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_resources. */
    public static final String TABLE = "t_resources";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Name'. {UQ : VARCHAR(255)} */
    protected String _name;

    /** The attribute of the column 'Organisation'. {VARCHAR(255)} */
    protected String _organisation;

    /** The attribute of the column 'Phone1'. {VARCHAR(50)} */
    protected String _phone1;

    /** The attribute of the column 'Phone2'. {VARCHAR(50)} */
    protected String _phone2;

    /** The attribute of the column 'Mobile'. {VARCHAR(50)} */
    protected String _mobile;

    /** The attribute of the column 'Fax'. {VARCHAR(50)} */
    protected String _fax;

    /** The attribute of the column 'Email'. {VARCHAR(255)} */
    protected String _email;

    /** The attribute of the column 'Roles'. {VARCHAR(255)} */
    protected String _roles;

    /** The attribute of the column 'Notes'. {VARCHAR(255)} */
    protected String _notes;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTResources() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_resources";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TResources";
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
        if (other == null || !(other instanceof BsTResources)) { return false; }
        final BsTResources otherEntity = (BsTResources)other;
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

    /** The column annotation for S2Dao. {UQ : VARCHAR(255)} */
    public static final String name_COLUMN = "Name";

    /**
     * Get the value of the column 'Name'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Set the value of the column 'Name'. <br />
     * {UQ : VARCHAR(255)}
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String organisation_COLUMN = "Organisation";

    /**
     * Get the value of the column 'Organisation'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Organisation'. (Nullable)
     */
    public String getOrganisation() {
        return _organisation;
    }

    /**
     * Set the value of the column 'Organisation'. <br />
     * {VARCHAR(255)}
     * @param organisation The value of the column 'Organisation'. (Nullable)
     */
    public void setOrganisation(String organisation) {
        _modifiedProperties.addPropertyName("organisation");
        this._organisation = organisation;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String phone1_COLUMN = "Phone1";

    /**
     * Get the value of the column 'Phone1'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Phone1'. (Nullable)
     */
    public String getPhone1() {
        return _phone1;
    }

    /**
     * Set the value of the column 'Phone1'. <br />
     * {VARCHAR(50)}
     * @param phone1 The value of the column 'Phone1'. (Nullable)
     */
    public void setPhone1(String phone1) {
        _modifiedProperties.addPropertyName("phone1");
        this._phone1 = phone1;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String phone2_COLUMN = "Phone2";

    /**
     * Get the value of the column 'Phone2'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Phone2'. (Nullable)
     */
    public String getPhone2() {
        return _phone2;
    }

    /**
     * Set the value of the column 'Phone2'. <br />
     * {VARCHAR(50)}
     * @param phone2 The value of the column 'Phone2'. (Nullable)
     */
    public void setPhone2(String phone2) {
        _modifiedProperties.addPropertyName("phone2");
        this._phone2 = phone2;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String mobile_COLUMN = "Mobile";

    /**
     * Get the value of the column 'Mobile'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Mobile'. (Nullable)
     */
    public String getMobile() {
        return _mobile;
    }

    /**
     * Set the value of the column 'Mobile'. <br />
     * {VARCHAR(50)}
     * @param mobile The value of the column 'Mobile'. (Nullable)
     */
    public void setMobile(String mobile) {
        _modifiedProperties.addPropertyName("mobile");
        this._mobile = mobile;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String fax_COLUMN = "Fax";

    /**
     * Get the value of the column 'Fax'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Fax'. (Nullable)
     */
    public String getFax() {
        return _fax;
    }

    /**
     * Set the value of the column 'Fax'. <br />
     * {VARCHAR(50)}
     * @param fax The value of the column 'Fax'. (Nullable)
     */
    public void setFax(String fax) {
        _modifiedProperties.addPropertyName("fax");
        this._fax = fax;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String email_COLUMN = "Email";

    /**
     * Get the value of the column 'Email'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Email'. (Nullable)
     */
    public String getEmail() {
        return _email;
    }

    /**
     * Set the value of the column 'Email'. <br />
     * {VARCHAR(255)}
     * @param email The value of the column 'Email'. (Nullable)
     */
    public void setEmail(String email) {
        _modifiedProperties.addPropertyName("email");
        this._email = email;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String roles_COLUMN = "Roles";

    /**
     * Get the value of the column 'Roles'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Roles'. (Nullable)
     */
    public String getRoles() {
        return _roles;
    }

    /**
     * Set the value of the column 'Roles'. <br />
     * {VARCHAR(255)}
     * @param roles The value of the column 'Roles'. (Nullable)
     */
    public void setRoles(String roles) {
        _modifiedProperties.addPropertyName("roles");
        this._roles = roles;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String notes_COLUMN = "Notes";

    /**
     * Get the value of the column 'Notes'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Notes'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * Set the value of the column 'Notes'. <br />
     * {VARCHAR(255)}
     * @param notes The value of the column 'Notes'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

}
