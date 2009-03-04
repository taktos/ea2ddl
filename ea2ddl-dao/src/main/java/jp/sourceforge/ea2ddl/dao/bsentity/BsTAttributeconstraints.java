package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_attributeconstraints that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_ID, Constraint, AttName, Type, Notes, ID
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
public abstract class BsTAttributeconstraints implements Entity, Serializable {

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
    /** Object_ID: {INTEGER} */
    protected java.lang.Integer _objectId;

    /** Constraint: {UQ : VARCHAR(255)} */
    protected String _constraint;

    /** AttName: {VARCHAR(255)} */
    protected String _attname;

    /** Type: {VARCHAR(255)} */
    protected String _type;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** ID: {UQ : INTEGER} */
    protected java.lang.Integer _id;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_attributeconstraints";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TAttributeconstraints";
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
        if (other == null || !(other instanceof BsTAttributeconstraints)) { return false; }
        final BsTAttributeconstraints otherEntity = (BsTAttributeconstraints)other;
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getConstraint(), otherEntity.getConstraint())) { return false; }
        if (!helpComparingValue(getAttname(), otherEntity.getAttname())) { return false; }
        if (!helpComparingValue(getType(), otherEntity.getType())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getId(), otherEntity.getId())) { return false; }
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
        if (this.getObjectId() != null) { result = result + this.getObjectId().hashCode(); }
        if (this.getConstraint() != null) { result = result + this.getConstraint().hashCode(); }
        if (this.getAttname() != null) { result = result + this.getAttname().hashCode(); }
        if (this.getType() != null) { result = result + this.getType().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getId() != null) { result = result + this.getId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getConstraint());
        sb.append(delimiter).append(getAttname());
        sb.append(delimiter).append(getType());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getId());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * Constraint: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'Constraint'. (Nullable)
     */
    public String getConstraint() {
        return _constraint;
    }

    /**
     * Constraint: {UQ : VARCHAR(255)} <br />
     * @param constraint The value of the column 'Constraint'. (Nullable)
     */
    public void setConstraint(String constraint) {
        _modifiedProperties.addPropertyName("constraint");
        this._constraint = constraint;
    }

    /**
     * AttName: {VARCHAR(255)} <br />
     * @return The value of the column 'AttName'. (Nullable)
     */
    public String getAttname() {
        return _attname;
    }

    /**
     * AttName: {VARCHAR(255)} <br />
     * @param attname The value of the column 'AttName'. (Nullable)
     */
    public void setAttname(String attname) {
        _modifiedProperties.addPropertyName("attname");
        this._attname = attname;
    }

    /**
     * Type: {VARCHAR(255)} <br />
     * @return The value of the column 'Type'. (Nullable)
     */
    public String getType() {
        return _type;
    }

    /**
     * Type: {VARCHAR(255)} <br />
     * @param type The value of the column 'Type'. (Nullable)
     */
    public void setType(String type) {
        _modifiedProperties.addPropertyName("type");
        this._type = type;
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
     * ID: {UQ : INTEGER} <br />
     * @return The value of the column 'ID'. (Nullable)
     */
    public java.lang.Integer getId() {
        return _id;
    }

    /**
     * ID: {UQ : INTEGER} <br />
     * @param id The value of the column 'ID'. (Nullable)
     */
    public void setId(java.lang.Integer id) {
        _modifiedProperties.addPropertyName("id");
        this._id = id;
    }
}
