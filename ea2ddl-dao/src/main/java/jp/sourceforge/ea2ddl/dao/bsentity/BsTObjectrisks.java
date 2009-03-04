package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_objectrisks that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_ID, Risk, RiskType, EValue, Notes
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
public abstract class BsTObjectrisks implements Entity, Serializable {

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
    /** Object_ID: {UQ : INTEGER} */
    protected java.lang.Integer _objectId;

    /** Risk: {UQ : VARCHAR(255)} */
    protected String _risk;

    /** RiskType: {VARCHAR(12)} */
    protected String _risktype;

    /** EValue: {DOUBLE} */
    protected java.math.BigDecimal _evalue;

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
        return "t_objectrisks";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TObjectrisks";
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
        if (other == null || !(other instanceof BsTObjectrisks)) { return false; }
        final BsTObjectrisks otherEntity = (BsTObjectrisks)other;
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getRisk(), otherEntity.getRisk())) { return false; }
        if (!helpComparingValue(getRisktype(), otherEntity.getRisktype())) { return false; }
        if (!helpComparingValue(getEvalue(), otherEntity.getEvalue())) { return false; }
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
        if (this.getObjectId() != null) { result = result + this.getObjectId().hashCode(); }
        if (this.getRisk() != null) { result = result + this.getRisk().hashCode(); }
        if (this.getRisktype() != null) { result = result + this.getRisktype().hashCode(); }
        if (this.getEvalue() != null) { result = result + this.getEvalue().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getRisk());
        sb.append(delimiter).append(getRisktype());
        sb.append(delimiter).append(getEvalue());
        sb.append(delimiter).append(getNotes());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Object_ID: {UQ : INTEGER} <br />
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Object_ID: {UQ : INTEGER} <br />
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /**
     * Risk: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'Risk'. (Nullable)
     */
    public String getRisk() {
        return _risk;
    }

    /**
     * Risk: {UQ : VARCHAR(255)} <br />
     * @param risk The value of the column 'Risk'. (Nullable)
     */
    public void setRisk(String risk) {
        _modifiedProperties.addPropertyName("risk");
        this._risk = risk;
    }

    /**
     * RiskType: {VARCHAR(12)} <br />
     * @return The value of the column 'RiskType'. (Nullable)
     */
    public String getRisktype() {
        return _risktype;
    }

    /**
     * RiskType: {VARCHAR(12)} <br />
     * @param risktype The value of the column 'RiskType'. (Nullable)
     */
    public void setRisktype(String risktype) {
        _modifiedProperties.addPropertyName("risktype");
        this._risktype = risktype;
    }

    /**
     * EValue: {DOUBLE} <br />
     * @return The value of the column 'EValue'. (Nullable)
     */
    public java.math.BigDecimal getEvalue() {
        return _evalue;
    }

    /**
     * EValue: {DOUBLE} <br />
     * @param evalue The value of the column 'EValue'. (Nullable)
     */
    public void setEvalue(java.math.BigDecimal evalue) {
        _modifiedProperties.addPropertyName("evalue");
        this._evalue = evalue;
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
