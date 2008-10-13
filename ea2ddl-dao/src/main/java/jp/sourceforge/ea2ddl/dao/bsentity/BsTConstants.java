package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_constants(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     ConstantName, ConstantValue
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
public abstract class BsTConstants implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_constants. */
    public static final String TABLE = "t_constants";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'ConstantName'. {UQ : VARCHAR(50)} */
    protected String _constantname;

    /** The attribute of the column 'ConstantValue'. {VARCHAR(255)} */
    protected String _constantvalue;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTConstants() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_constants";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TConstants";
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
        if (other == null || !(other instanceof BsTConstants)) { return false; }
        final BsTConstants otherEntity = (BsTConstants)other;
        if (!helpComparingValue(getConstantname(), otherEntity.getConstantname())) { return false; }
        if (!helpComparingValue(getConstantvalue(), otherEntity.getConstantvalue())) { return false; }
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
        if (this.getConstantname() != null) { result = result + this.getConstantname().hashCode(); }
        if (this.getConstantvalue() != null) { result = result + this.getConstantvalue().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getConstantname());
        sb.append(delimiter).append(getConstantvalue());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : VARCHAR(50)} */
    public static final String constantname_COLUMN = "ConstantName";

    /**
     * Get the value of the column 'ConstantName'. <br />
     * {UQ : VARCHAR(50)}
     * @return The value of the column 'ConstantName'. (Nullable)
     */
    public String getConstantname() {
        return _constantname;
    }

    /**
     * Set the value of the column 'ConstantName'. <br />
     * {UQ : VARCHAR(50)}
     * @param constantname The value of the column 'ConstantName'. (Nullable)
     */
    public void setConstantname(String constantname) {
        _modifiedProperties.addPropertyName("constantname");
        this._constantname = constantname;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String constantvalue_COLUMN = "ConstantValue";

    /**
     * Get the value of the column 'ConstantValue'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'ConstantValue'. (Nullable)
     */
    public String getConstantvalue() {
        return _constantvalue;
    }

    /**
     * Set the value of the column 'ConstantValue'. <br />
     * {VARCHAR(255)}
     * @param constantvalue The value of the column 'ConstantValue'. (Nullable)
     */
    public void setConstantvalue(String constantvalue) {
        _modifiedProperties.addPropertyName("constantvalue");
        this._constantvalue = constantvalue;
    }

}
