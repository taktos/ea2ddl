package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_ocf(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     ObjectType, ComplexityWeight
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
public abstract class BsTOcf implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_ocf. */
    public static final String TABLE = "t_ocf";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'ObjectType'. {VARCHAR(50)} */
    protected String _objecttype;

    /** The attribute of the column 'ComplexityWeight'. {DOUBLE} */
    protected java.math.BigDecimal _complexityweight;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTOcf() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_ocf";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TOcf";
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
        if (other == null || !(other instanceof BsTOcf)) { return false; }
        final BsTOcf otherEntity = (BsTOcf)other;
        if (!helpComparingValue(getObjecttype(), otherEntity.getObjecttype())) { return false; }
        if (!helpComparingValue(getComplexityweight(), otherEntity.getComplexityweight())) { return false; }
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
        if (this.getObjecttype() != null) { result = result + this.getObjecttype().hashCode(); }
        if (this.getComplexityweight() != null) { result = result + this.getComplexityweight().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getObjecttype());
        sb.append(delimiter).append(getComplexityweight());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String objecttype_COLUMN = "ObjectType";

    /**
     * Get the value of the column 'ObjectType'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'ObjectType'. (Nullable)
     */
    public String getObjecttype() {
        return _objecttype;
    }

    /**
     * Set the value of the column 'ObjectType'. <br />
     * {VARCHAR(50)}
     * @param objecttype The value of the column 'ObjectType'. (Nullable)
     */
    public void setObjecttype(String objecttype) {
        _modifiedProperties.addPropertyName("objecttype");
        this._objecttype = objecttype;
    }

    /** The column annotation for S2Dao. {DOUBLE} */
    public static final String complexityweight_COLUMN = "ComplexityWeight";

    /**
     * Get the value of the column 'ComplexityWeight'. <br />
     * {DOUBLE}
     * @return The value of the column 'ComplexityWeight'. (Nullable)
     */
    public java.math.BigDecimal getComplexityweight() {
        return _complexityweight;
    }

    /**
     * Set the value of the column 'ComplexityWeight'. <br />
     * {DOUBLE}
     * @param complexityweight The value of the column 'ComplexityWeight'. (Nullable)
     */
    public void setComplexityweight(java.math.BigDecimal complexityweight) {
        _modifiedProperties.addPropertyName("complexityweight");
        this._complexityweight = complexityweight;
    }

}
