package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_complexitytypes that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Complexity, NumericWeight
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
public abstract class BsTComplexitytypes implements Entity, Serializable {

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
    /** Complexity: {UQ : VARCHAR(50)} */
    protected String _complexity;

    /** NumericWeight: {INTEGER} */
    protected java.lang.Integer _numericweight;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_complexitytypes";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TComplexitytypes";
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
        if (other == null || !(other instanceof BsTComplexitytypes)) { return false; }
        final BsTComplexitytypes otherEntity = (BsTComplexitytypes)other;
        if (!helpComparingValue(getComplexity(), otherEntity.getComplexity())) { return false; }
        if (!helpComparingValue(getNumericweight(), otherEntity.getNumericweight())) { return false; }
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
        if (this.getComplexity() != null) { result = result + this.getComplexity().hashCode(); }
        if (this.getNumericweight() != null) { result = result + this.getNumericweight().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getComplexity());
        sb.append(delimiter).append(getNumericweight());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Complexity: {UQ : VARCHAR(50)} <br />
     * @return The value of the column 'Complexity'. (Nullable)
     */
    public String getComplexity() {
        return _complexity;
    }

    /**
     * Complexity: {UQ : VARCHAR(50)} <br />
     * @param complexity The value of the column 'Complexity'. (Nullable)
     */
    public void setComplexity(String complexity) {
        _modifiedProperties.addPropertyName("complexity");
        this._complexity = complexity;
    }

    /**
     * NumericWeight: {INTEGER} <br />
     * @return The value of the column 'NumericWeight'. (Nullable)
     */
    public java.lang.Integer getNumericweight() {
        return _numericweight;
    }

    /**
     * NumericWeight: {INTEGER} <br />
     * @param numericweight The value of the column 'NumericWeight'. (Nullable)
     */
    public void setNumericweight(java.lang.Integer numericweight) {
        _modifiedProperties.addPropertyName("numericweight");
        this._numericweight = numericweight;
    }
}
