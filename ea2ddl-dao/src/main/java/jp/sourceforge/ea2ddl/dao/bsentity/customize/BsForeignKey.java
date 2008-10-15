package jp.sourceforge.ea2ddl.dao.bsentity.customize;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;

/**
 * The entity of ForeignKey(null).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Connector_ID, Start_Object_ID, Name, End_Object_ID
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
public abstract class BsForeignKey implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is ForeignKey. */
    public static final String TABLE = "ForeignKey";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Connector_ID'. {COUNTER(10,0)} */
    protected java.lang.Integer _connectorId;

    /** The attribute of the column 'Start_Object_ID'. {INTEGER(10,0)} */
    protected java.lang.Integer _startObjectId;

    /** The attribute of the column 'Name'. {VARCHAR(255,0)} */
    protected String _name;

    /** The attribute of the column 'End_Object_ID'. {INTEGER(10,0)} */
    protected java.lang.Integer _endObjectId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsForeignKey() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "ForeignKey";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "foreignKey";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public DBMeta getDBMeta() {
        return jp.sourceforge.ea2ddl.dao.bsentity.customize.dbmeta.ForeignKeyDbm.getInstance();
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
        if (other == null || !(other instanceof BsForeignKey)) { return false; }
        final BsForeignKey otherEntity = (BsForeignKey)other;
        if (!helpComparingValue(getConnectorId(), otherEntity.getConnectorId())) { return false; }
        if (!helpComparingValue(getStartObjectId(), otherEntity.getStartObjectId())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getEndObjectId(), otherEntity.getEndObjectId())) { return false; }
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
        if (this.getConnectorId() != null) { result = result + this.getConnectorId().hashCode(); }
        if (this.getStartObjectId() != null) { result = result + this.getStartObjectId().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getEndObjectId() != null) { result = result + this.getEndObjectId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getConnectorId());
        sb.append(delimiter).append(getStartObjectId());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getEndObjectId());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {COUNTER(10,0)} */
    public static final String connectorId_COLUMN = "Connector_ID";

    /**
     * Get the value of the column 'Connector_ID'. <br />
     * {COUNTER(10,0)}
     * @return The value of the column 'Connector_ID'. (Nullable)
     */
    public java.lang.Integer getConnectorId() {
        return _connectorId;
    }

    /**
     * Set the value of the column 'Connector_ID'. <br />
     * {COUNTER(10,0)}
     * @param connectorId The value of the column 'Connector_ID'. (Nullable)
     */
    public void setConnectorId(java.lang.Integer connectorId) {
        _modifiedProperties.addPropertyName("connectorId");
        this._connectorId = connectorId;
    }

    /** The column annotation for S2Dao. {INTEGER(10,0)} */
    public static final String startObjectId_COLUMN = "Start_Object_ID";

    /**
     * Get the value of the column 'Start_Object_ID'. <br />
     * {INTEGER(10,0)}
     * @return The value of the column 'Start_Object_ID'. (Nullable)
     */
    public java.lang.Integer getStartObjectId() {
        return _startObjectId;
    }

    /**
     * Set the value of the column 'Start_Object_ID'. <br />
     * {INTEGER(10,0)}
     * @param startObjectId The value of the column 'Start_Object_ID'. (Nullable)
     */
    public void setStartObjectId(java.lang.Integer startObjectId) {
        _modifiedProperties.addPropertyName("startObjectId");
        this._startObjectId = startObjectId;
    }

    /** The column annotation for S2Dao. {VARCHAR(255,0)} */
    public static final String name_COLUMN = "Name";

    /**
     * Get the value of the column 'Name'. <br />
     * {VARCHAR(255,0)}
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Set the value of the column 'Name'. <br />
     * {VARCHAR(255,0)}
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /** The column annotation for S2Dao. {INTEGER(10,0)} */
    public static final String endObjectId_COLUMN = "End_Object_ID";

    /**
     * Get the value of the column 'End_Object_ID'. <br />
     * {INTEGER(10,0)}
     * @return The value of the column 'End_Object_ID'. (Nullable)
     */
    public java.lang.Integer getEndObjectId() {
        return _endObjectId;
    }

    /**
     * Set the value of the column 'End_Object_ID'. <br />
     * {INTEGER(10,0)}
     * @param endObjectId The value of the column 'End_Object_ID'. (Nullable)
     */
    public void setEndObjectId(java.lang.Integer endObjectId) {
        _modifiedProperties.addPropertyName("endObjectId");
        this._endObjectId = endObjectId;
    }

}
