package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_objectmetrics(TABLE).
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
@SuppressWarnings("unchecked")
public abstract class BsTObjectmetrics implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_objectmetrics. */
    public static final String TABLE = "t_objectmetrics";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Object_ID'. {UQ : INTEGER} */
    protected java.lang.Integer _objectId;

    /** The attribute of the column 'Metric'. {UQ : VARCHAR(255)} */
    protected String _metric;

    /** The attribute of the column 'MetricType'. {VARCHAR(12)} */
    protected String _metrictype;

    /** The attribute of the column 'EValue'. {DOUBLE} */
    protected java.math.BigDecimal _evalue;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectmetrics() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectmetrics";
    }

    public String getTablePropertyName() {// as JavaBeansRule
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
    public static final String metric_COLUMN = "Metric";

    /**
     * Get the value of the column 'Metric'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'Metric'. (Nullable)
     */
    public String getMetric() {
        return _metric;
    }

    /**
     * Set the value of the column 'Metric'. <br />
     * {UQ : VARCHAR(255)}
     * @param metric The value of the column 'Metric'. (Nullable)
     */
    public void setMetric(String metric) {
        _modifiedProperties.addPropertyName("metric");
        this._metric = metric;
    }

    /** The column annotation for S2Dao. {VARCHAR(12)} */
    public static final String metrictype_COLUMN = "MetricType";

    /**
     * Get the value of the column 'MetricType'. <br />
     * {VARCHAR(12)}
     * @return The value of the column 'MetricType'. (Nullable)
     */
    public String getMetrictype() {
        return _metrictype;
    }

    /**
     * Set the value of the column 'MetricType'. <br />
     * {VARCHAR(12)}
     * @param metrictype The value of the column 'MetricType'. (Nullable)
     */
    public void setMetrictype(String metrictype) {
        _modifiedProperties.addPropertyName("metrictype");
        this._metrictype = metrictype;
    }

    /** The column annotation for S2Dao. {DOUBLE} */
    public static final String evalue_COLUMN = "EValue";

    /**
     * Get the value of the column 'EValue'. <br />
     * {DOUBLE}
     * @return The value of the column 'EValue'. (Nullable)
     */
    public java.math.BigDecimal getEvalue() {
        return _evalue;
    }

    /**
     * Set the value of the column 'EValue'. <br />
     * {DOUBLE}
     * @param evalue The value of the column 'EValue'. (Nullable)
     */
    public void setEvalue(java.math.BigDecimal evalue) {
        _modifiedProperties.addPropertyName("evalue");
        this._evalue = evalue;
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

}
