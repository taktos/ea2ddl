package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_primitives that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Datatype, Description
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
public abstract class BsTPrimitives implements Entity, Serializable {

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
    /** Datatype: {UQ : VARCHAR(50)} */
    protected String _datatype;

    /** Description: {VARCHAR(50)} */
    protected String _description;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_primitives";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TPrimitives";
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
        if (other == null || !(other instanceof BsTPrimitives)) { return false; }
        final BsTPrimitives otherEntity = (BsTPrimitives)other;
        if (!helpComparingValue(getDatatype(), otherEntity.getDatatype())) { return false; }
        if (!helpComparingValue(getDescription(), otherEntity.getDescription())) { return false; }
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
        if (this.getDatatype() != null) { result = result + this.getDatatype().hashCode(); }
        if (this.getDescription() != null) { result = result + this.getDescription().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getDatatype());
        sb.append(delimiter).append(getDescription());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Datatype: {UQ : VARCHAR(50)} <br />
     * @return The value of the column 'Datatype'. (Nullable)
     */
    public String getDatatype() {
        return _datatype;
    }

    /**
     * Datatype: {UQ : VARCHAR(50)} <br />
     * @param datatype The value of the column 'Datatype'. (Nullable)
     */
    public void setDatatype(String datatype) {
        _modifiedProperties.addPropertyName("datatype");
        this._datatype = datatype;
    }

    /**
     * Description: {VARCHAR(50)} <br />
     * @return The value of the column 'Description'. (Nullable)
     */
    public String getDescription() {
        return _description;
    }

    /**
     * Description: {VARCHAR(50)} <br />
     * @param description The value of the column 'Description'. (Nullable)
     */
    public void setDescription(String description) {
        _modifiedProperties.addPropertyName("description");
        this._description = description;
    }
}
