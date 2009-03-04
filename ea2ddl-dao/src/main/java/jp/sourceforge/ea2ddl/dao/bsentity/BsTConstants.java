package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_constants that the type is TABLE. <br />
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
public abstract class BsTConstants implements Entity, Serializable {

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
    /** ConstantName: {UQ : VARCHAR(50)} */
    protected String _constantname;

    /** ConstantValue: {VARCHAR(255)} */
    protected String _constantvalue;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_constants";
    }

    public String getTablePropertyName() { // as JavaBeansRule
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
    /**
     * ConstantName: {UQ : VARCHAR(50)} <br />
     * @return The value of the column 'ConstantName'. (Nullable)
     */
    public String getConstantname() {
        return _constantname;
    }

    /**
     * ConstantName: {UQ : VARCHAR(50)} <br />
     * @param constantname The value of the column 'ConstantName'. (Nullable)
     */
    public void setConstantname(String constantname) {
        _modifiedProperties.addPropertyName("constantname");
        this._constantname = constantname;
    }

    /**
     * ConstantValue: {VARCHAR(255)} <br />
     * @return The value of the column 'ConstantValue'. (Nullable)
     */
    public String getConstantvalue() {
        return _constantvalue;
    }

    /**
     * ConstantValue: {VARCHAR(255)} <br />
     * @param constantvalue The value of the column 'ConstantValue'. (Nullable)
     */
    public void setConstantvalue(String constantvalue) {
        _modifiedProperties.addPropertyName("constantvalue");
        this._constantvalue = constantvalue;
    }
}
