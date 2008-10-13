package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_objectconstraint(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_ID, Constraint, ConstraintType, Weight, Notes, Status
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
public abstract class BsTObjectconstraint implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_objectconstraint. */
    public static final String TABLE = "t_objectconstraint";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Object_ID'. {UQ : INTEGER} */
    protected java.lang.Integer _objectId;

    /** The attribute of the column 'Constraint'. {UQ : VARCHAR(255)} */
    protected String _constraint;

    /** The attribute of the column 'ConstraintType'. {UQ : VARCHAR(30)} */
    protected String _constrainttype;

    /** The attribute of the column 'Weight'. {DOUBLE} */
    protected java.math.BigDecimal _weight;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'Status'. {VARCHAR(50)} */
    protected String _status;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectconstraint() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectconstraint";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TObjectconstraint";
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
        if (other == null || !(other instanceof BsTObjectconstraint)) { return false; }
        final BsTObjectconstraint otherEntity = (BsTObjectconstraint)other;
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getConstraint(), otherEntity.getConstraint())) { return false; }
        if (!helpComparingValue(getConstrainttype(), otherEntity.getConstrainttype())) { return false; }
        if (!helpComparingValue(getWeight(), otherEntity.getWeight())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getStatus(), otherEntity.getStatus())) { return false; }
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
        if (this.getConstrainttype() != null) { result = result + this.getConstrainttype().hashCode(); }
        if (this.getWeight() != null) { result = result + this.getWeight().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getStatus() != null) { result = result + this.getStatus().hashCode(); }
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
        sb.append(delimiter).append(getConstrainttype());
        sb.append(delimiter).append(getWeight());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getStatus());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : INTEGER} */
    public static final String objectId_COLUMN = "Object_ID";

    /**
     * Get the value of the column 'Object_ID'. <br />
     * {UQ : INTEGER}
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Set the value of the column 'Object_ID'. <br />
     * {UQ : INTEGER}
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /** The column annotation for S2Dao. {UQ : VARCHAR(255)} */
    public static final String constraint_COLUMN = "Constraint";

    /**
     * Get the value of the column 'Constraint'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'Constraint'. (Nullable)
     */
    public String getConstraint() {
        return _constraint;
    }

    /**
     * Set the value of the column 'Constraint'. <br />
     * {UQ : VARCHAR(255)}
     * @param constraint The value of the column 'Constraint'. (Nullable)
     */
    public void setConstraint(String constraint) {
        _modifiedProperties.addPropertyName("constraint");
        this._constraint = constraint;
    }

    /** The column annotation for S2Dao. {UQ : VARCHAR(30)} */
    public static final String constrainttype_COLUMN = "ConstraintType";

    /**
     * Get the value of the column 'ConstraintType'. <br />
     * {UQ : VARCHAR(30)}
     * @return The value of the column 'ConstraintType'. (Nullable)
     */
    public String getConstrainttype() {
        return _constrainttype;
    }

    /**
     * Set the value of the column 'ConstraintType'. <br />
     * {UQ : VARCHAR(30)}
     * @param constrainttype The value of the column 'ConstraintType'. (Nullable)
     */
    public void setConstrainttype(String constrainttype) {
        _modifiedProperties.addPropertyName("constrainttype");
        this._constrainttype = constrainttype;
    }

    /** The column annotation for S2Dao. {DOUBLE} */
    public static final String weight_COLUMN = "Weight";

    /**
     * Get the value of the column 'Weight'. <br />
     * {DOUBLE}
     * @return The value of the column 'Weight'. (Nullable)
     */
    public java.math.BigDecimal getWeight() {
        return _weight;
    }

    /**
     * Set the value of the column 'Weight'. <br />
     * {DOUBLE}
     * @param weight The value of the column 'Weight'. (Nullable)
     */
    public void setWeight(java.math.BigDecimal weight) {
        _modifiedProperties.addPropertyName("weight");
        this._weight = weight;
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

}
