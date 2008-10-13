package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_trxtypes(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Description, NumericWeight, Notes, TRX, TRX_ID, Style
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
public abstract class BsTTrxtypes implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_trxtypes. */
    public static final String TABLE = "t_trxtypes";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Description'. {VARCHAR(50)} */
    protected String _description;

    /** The attribute of the column 'NumericWeight'. {DOUBLE} */
    protected java.math.BigDecimal _numericweight;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'TRX'. {VARCHAR(255)} */
    protected String _trx;

    /** The attribute of the column 'TRX_ID'. {UQ : COUNTER : NotNull} */
    protected java.lang.Integer _trxId;

    /** The attribute of the column 'Style'. {LONGCHAR(2147483647)} */
    protected String _style;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrxtypes() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_trxtypes";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TTrxtypes";
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
        if (other == null || !(other instanceof BsTTrxtypes)) { return false; }
        final BsTTrxtypes otherEntity = (BsTTrxtypes)other;
        if (!helpComparingValue(getDescription(), otherEntity.getDescription())) { return false; }
        if (!helpComparingValue(getNumericweight(), otherEntity.getNumericweight())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getTrx(), otherEntity.getTrx())) { return false; }
        if (!helpComparingValue(getTrxId(), otherEntity.getTrxId())) { return false; }
        if (!helpComparingValue(getStyle(), otherEntity.getStyle())) { return false; }
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
        if (this.getDescription() != null) { result = result + this.getDescription().hashCode(); }
        if (this.getNumericweight() != null) { result = result + this.getNumericweight().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getTrx() != null) { result = result + this.getTrx().hashCode(); }
        if (this.getTrxId() != null) { result = result + this.getTrxId().hashCode(); }
        if (this.getStyle() != null) { result = result + this.getStyle().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getDescription());
        sb.append(delimiter).append(getNumericweight());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getTrx());
        sb.append(delimiter).append(getTrxId());
        sb.append(delimiter).append(getStyle());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String description_COLUMN = "Description";

    /**
     * Get the value of the column 'Description'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Description'. (Nullable)
     */
    public String getDescription() {
        return _description;
    }

    /**
     * Set the value of the column 'Description'. <br />
     * {VARCHAR(50)}
     * @param description The value of the column 'Description'. (Nullable)
     */
    public void setDescription(String description) {
        _modifiedProperties.addPropertyName("description");
        this._description = description;
    }

    /** The column annotation for S2Dao. {DOUBLE} */
    public static final String numericweight_COLUMN = "NumericWeight";

    /**
     * Get the value of the column 'NumericWeight'. <br />
     * {DOUBLE}
     * @return The value of the column 'NumericWeight'. (Nullable)
     */
    public java.math.BigDecimal getNumericweight() {
        return _numericweight;
    }

    /**
     * Set the value of the column 'NumericWeight'. <br />
     * {DOUBLE}
     * @param numericweight The value of the column 'NumericWeight'. (Nullable)
     */
    public void setNumericweight(java.math.BigDecimal numericweight) {
        _modifiedProperties.addPropertyName("numericweight");
        this._numericweight = numericweight;
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

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String trx_COLUMN = "TRX";

    /**
     * Get the value of the column 'TRX'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'TRX'. (Nullable)
     */
    public String getTrx() {
        return _trx;
    }

    /**
     * Set the value of the column 'TRX'. <br />
     * {VARCHAR(255)}
     * @param trx The value of the column 'TRX'. (Nullable)
     */
    public void setTrx(String trx) {
        _modifiedProperties.addPropertyName("trx");
        this._trx = trx;
    }

    /** The column annotation for S2Dao. {UQ : COUNTER : NotNull} */
    public static final String trxId_COLUMN = "TRX_ID";

    /**
     * Get the value of the column 'TRX_ID'. <br />
     * {UQ : COUNTER : NotNull}
     * @return The value of the column 'TRX_ID'. (Nullable)
     */
    public java.lang.Integer getTrxId() {
        return _trxId;
    }

    /**
     * Set the value of the column 'TRX_ID'. <br />
     * {UQ : COUNTER : NotNull}
     * @param trxId The value of the column 'TRX_ID'. (Nullable)
     */
    public void setTrxId(java.lang.Integer trxId) {
        _modifiedProperties.addPropertyName("trxId");
        this._trxId = trxId;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String style_COLUMN = "Style";

    /**
     * Get the value of the column 'Style'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Style'. (Nullable)
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Set the value of the column 'Style'. <br />
     * {LONGCHAR(2147483647)}
     * @param style The value of the column 'Style'. (Nullable)
     */
    public void setStyle(String style) {
        _modifiedProperties.addPropertyName("style");
        this._style = style;
    }

}
