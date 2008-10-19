package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;
import jp.sourceforge.ea2ddl.dao.exentity.*;

/**
 * The entity of t_objectproperties(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PropertyID, Object_ID, Property, Value, Notes, ea_guid
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
 *     t_object
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     tObject
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsTObjectproperties implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_objectproperties. */
    public static final String TABLE = "t_objectproperties";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'PropertyID'. {UQ : COUNTER : NotNull} */
    protected java.lang.Integer _propertyid;

    /** The attribute of the column 'Object_ID'. {INTEGER : FK to t_object} */
    protected java.lang.Integer _objectId;

    /** The attribute of the column 'Property'. {VARCHAR(255)} */
    protected String _property;

    /** The attribute of the column 'Value'. {VARCHAR(255)} */
    protected String _value;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'ea_guid'. {VARCHAR(40)} */
    protected String _eaGuid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectproperties() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectproperties";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TObjectproperties";
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
    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [TObject]
    // * * * * * * * * */
    public static final int TObject_RELNO = 0;
    public static final String TObject_RELKEYS = "Object_ID:Object_ID";

    /** The entity of foreign property 'TObject'. */
    protected TObject _parentTObject;

    /**
     * Get the entity of foreign property 'TObject'. {without lazy-load}
     * @return The entity of foreign property 'TObject'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public TObject getTObject() {
        return _parentTObject;
    }

    /**
     * Set the entity of foreign property 'TObject'.
     * @param tObject The entity of foreign property 'TObject'. (Nullable)
     */
    public void setTObject(TObject tObject) {
        _parentTObject = tObject;
    }

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
        if (other == null || !(other instanceof BsTObjectproperties)) { return false; }
        final BsTObjectproperties otherEntity = (BsTObjectproperties)other;
        if (!helpComparingValue(getPropertyid(), otherEntity.getPropertyid())) { return false; }
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getProperty(), otherEntity.getProperty())) { return false; }
        if (!helpComparingValue(getValue(), otherEntity.getValue())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getEaGuid(), otherEntity.getEaGuid())) { return false; }
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
        if (this.getPropertyid() != null) { result = result + this.getPropertyid().hashCode(); }
        if (this.getObjectId() != null) { result = result + this.getObjectId().hashCode(); }
        if (this.getProperty() != null) { result = result + this.getProperty().hashCode(); }
        if (this.getValue() != null) { result = result + this.getValue().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getEaGuid() != null) { result = result + this.getEaGuid().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getPropertyid());
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getProperty());
        sb.append(delimiter).append(getValue());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getEaGuid());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : COUNTER : NotNull} */
    public static final String propertyid_COLUMN = "PropertyID";

    /**
     * Get the value of the column 'PropertyID'. <br />
     * {UQ : COUNTER : NotNull}
     * @return The value of the column 'PropertyID'. (Nullable)
     */
    public java.lang.Integer getPropertyid() {
        return _propertyid;
    }

    /**
     * Set the value of the column 'PropertyID'. <br />
     * {UQ : COUNTER : NotNull}
     * @param propertyid The value of the column 'PropertyID'. (Nullable)
     */
    public void setPropertyid(java.lang.Integer propertyid) {
        _modifiedProperties.addPropertyName("propertyid");
        this._propertyid = propertyid;
    }

    /** The column annotation for S2Dao. {INTEGER : FK to t_object} */
    public static final String objectId_COLUMN = "Object_ID";

    /**
     * Get the value of the column 'Object_ID'. <br />
     * {INTEGER : FK to t_object}
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Set the value of the column 'Object_ID'. <br />
     * {INTEGER : FK to t_object}
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String property_COLUMN = "Property";

    /**
     * Get the value of the column 'Property'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Property'. (Nullable)
     */
    public String getProperty() {
        return _property;
    }

    /**
     * Set the value of the column 'Property'. <br />
     * {VARCHAR(255)}
     * @param property The value of the column 'Property'. (Nullable)
     */
    public void setProperty(String property) {
        _modifiedProperties.addPropertyName("property");
        this._property = property;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String value_COLUMN = "Value";

    /**
     * Get the value of the column 'Value'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Value'. (Nullable)
     */
    public String getValue() {
        return _value;
    }

    /**
     * Set the value of the column 'Value'. <br />
     * {VARCHAR(255)}
     * @param value The value of the column 'Value'. (Nullable)
     */
    public void setValue(String value) {
        _modifiedProperties.addPropertyName("value");
        this._value = value;
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

    /** The column annotation for S2Dao. {VARCHAR(40)} */
    public static final String eaGuid_COLUMN = "ea_guid";

    /**
     * Get the value of the column 'ea_guid'. <br />
     * {VARCHAR(40)}
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * Set the value of the column 'ea_guid'. <br />
     * {VARCHAR(40)}
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
    }

}
