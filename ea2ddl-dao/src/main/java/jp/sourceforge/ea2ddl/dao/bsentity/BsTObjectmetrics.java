package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_objectmetrics that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_ID, Metric, MetricType, EValue, Notes
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
public abstract class BsTObjectmetrics implements Entity, Serializable {

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

    /** Metric: {UQ : VARCHAR(255)} */
    protected String _metric;

    /** MetricType: {VARCHAR(12)} */
    protected String _metrictype;

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
        return "t_objectmetrics";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TObjectmetrics";
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
        if (other == null || !(other instanceof BsTObjectmetrics)) { return false; }
        final BsTObjectmetrics otherEntity = (BsTObjectmetrics)other;
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getMetric(), otherEntity.getMetric())) { return false; }
        if (!helpComparingValue(getMetrictype(), otherEntity.getMetrictype())) { return false; }
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
        if (this.getMetric() != null) { result = result + this.getMetric().hashCode(); }
        if (this.getMetrictype() != null) { result = result + this.getMetrictype().hashCode(); }
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
        sb.append(delimiter).append(getMetric());
        sb.append(delimiter).append(getMetrictype());
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
     * Metric: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'Metric'. (Nullable)
     */
    public String getMetric() {
        return _metric;
    }

    /**
     * Metric: {UQ : VARCHAR(255)} <br />
     * @param metric The value of the column 'Metric'. (Nullable)
     */
    public void setMetric(String metric) {
        _modifiedProperties.addPropertyName("metric");
        this._metric = metric;
    }

    /**
     * MetricType: {VARCHAR(12)} <br />
     * @return The value of the column 'MetricType'. (Nullable)
     */
    public String getMetrictype() {
        return _metrictype;
    }

    /**
     * MetricType: {VARCHAR(12)} <br />
     * @param metrictype The value of the column 'MetricType'. (Nullable)
     */
    public void setMetrictype(String metrictype) {
        _modifiedProperties.addPropertyName("metrictype");
        this._metrictype = metrictype;
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
