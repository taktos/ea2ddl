package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_connectorconstraint that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     ConnectorID, Constraint, ConstraintType, Notes
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
public abstract class BsTConnectorconstraint implements Entity, Serializable {

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
    /** ConnectorID: {UQ : INTEGER} */
    protected java.lang.Integer _connectorid;

    /** Constraint: {UQ : VARCHAR(255)} */
    protected String _constraint;

    /** ConstraintType: {VARCHAR(50)} */
    protected String _constrainttype;

    /** Notes: {LONGCHAR(2147483647)} */
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
        return "t_connectorconstraint";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TConnectorconstraint";
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
        if (other == null || !(other instanceof BsTConnectorconstraint)) { return false; }
        final BsTConnectorconstraint otherEntity = (BsTConnectorconstraint)other;
        if (!helpComparingValue(getConnectorid(), otherEntity.getConnectorid())) { return false; }
        if (!helpComparingValue(getConstraint(), otherEntity.getConstraint())) { return false; }
        if (!helpComparingValue(getConstrainttype(), otherEntity.getConstrainttype())) { return false; }
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
        if (this.getConnectorid() != null) { result = result + this.getConnectorid().hashCode(); }
        if (this.getConstraint() != null) { result = result + this.getConstraint().hashCode(); }
        if (this.getConstrainttype() != null) { result = result + this.getConstrainttype().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getConnectorid());
        sb.append(delimiter).append(getConstraint());
        sb.append(delimiter).append(getConstrainttype());
        sb.append(delimiter).append(getNotes());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * ConnectorID: {UQ : INTEGER} <br />
     * @return The value of the column 'ConnectorID'. (Nullable)
     */
    public java.lang.Integer getConnectorid() {
        return _connectorid;
    }

    /**
     * ConnectorID: {UQ : INTEGER} <br />
     * @param connectorid The value of the column 'ConnectorID'. (Nullable)
     */
    public void setConnectorid(java.lang.Integer connectorid) {
        _modifiedProperties.addPropertyName("connectorid");
        this._connectorid = connectorid;
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
     * ConstraintType: {VARCHAR(50)} <br />
     * @return The value of the column 'ConstraintType'. (Nullable)
     */
    public String getConstrainttype() {
        return _constrainttype;
    }

    /**
     * ConstraintType: {VARCHAR(50)} <br />
     * @param constrainttype The value of the column 'ConstraintType'. (Nullable)
     */
    public void setConstrainttype(String constrainttype) {
        _modifiedProperties.addPropertyName("constrainttype");
        this._constrainttype = constrainttype;
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
}
