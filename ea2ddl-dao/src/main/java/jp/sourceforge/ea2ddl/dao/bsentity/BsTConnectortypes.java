package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_connectortypes that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Connector_Type, Description
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
public abstract class BsTConnectortypes implements Entity, Serializable {

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
    /** Connector_Type: {UQ : VARCHAR(50)} */
    protected String _connectorType;

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
        return "t_connectortypes";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TConnectortypes";
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
        if (other == null || !(other instanceof BsTConnectortypes)) { return false; }
        final BsTConnectortypes otherEntity = (BsTConnectortypes)other;
        if (!helpComparingValue(getConnectorType(), otherEntity.getConnectorType())) { return false; }
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
        if (this.getConnectorType() != null) { result = result + this.getConnectorType().hashCode(); }
        if (this.getDescription() != null) { result = result + this.getDescription().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getConnectorType());
        sb.append(delimiter).append(getDescription());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Connector_Type: {UQ : VARCHAR(50)} <br />
     * @return The value of the column 'Connector_Type'. (Nullable)
     */
    public String getConnectorType() {
        return _connectorType;
    }

    /**
     * Connector_Type: {UQ : VARCHAR(50)} <br />
     * @param connectorType The value of the column 'Connector_Type'. (Nullable)
     */
    public void setConnectorType(String connectorType) {
        _modifiedProperties.addPropertyName("connectorType");
        this._connectorType = connectorType;
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
