package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_objecttypes that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_Type, Description, DesignObject, ImageID
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
public abstract class BsTObjecttypes implements Entity, Serializable {

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
    /** Object_Type: {UQ : VARCHAR(50)} */
    protected String _objectType;

    /** Description: {VARCHAR(255)} */
    protected String _description;

    /** DesignObject: {NotNull : BIT} */
    protected Boolean _designobject;

    /** ImageID: {SMALLINT} */
    protected java.lang.Integer _imageid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objecttypes";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TObjecttypes";
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
        if (other == null || !(other instanceof BsTObjecttypes)) { return false; }
        final BsTObjecttypes otherEntity = (BsTObjecttypes)other;
        if (!helpComparingValue(getObjectType(), otherEntity.getObjectType())) { return false; }
        if (!helpComparingValue(getDescription(), otherEntity.getDescription())) { return false; }
        if (!helpComparingValue(getDesignobject(), otherEntity.getDesignobject())) { return false; }
        if (!helpComparingValue(getImageid(), otherEntity.getImageid())) { return false; }
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
        if (this.getObjectType() != null) { result = result + this.getObjectType().hashCode(); }
        if (this.getDescription() != null) { result = result + this.getDescription().hashCode(); }
        if (this.getDesignobject() != null) { result = result + this.getDesignobject().hashCode(); }
        if (this.getImageid() != null) { result = result + this.getImageid().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getObjectType());
        sb.append(delimiter).append(getDescription());
        sb.append(delimiter).append(getDesignobject());
        sb.append(delimiter).append(getImageid());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Object_Type: {UQ : VARCHAR(50)} <br />
     * @return The value of the column 'Object_Type'. (Nullable)
     */
    public String getObjectType() {
        return _objectType;
    }

    /**
     * Object_Type: {UQ : VARCHAR(50)} <br />
     * @param objectType The value of the column 'Object_Type'. (Nullable)
     */
    public void setObjectType(String objectType) {
        _modifiedProperties.addPropertyName("objectType");
        this._objectType = objectType;
    }

    /**
     * Description: {VARCHAR(255)} <br />
     * @return The value of the column 'Description'. (Nullable)
     */
    public String getDescription() {
        return _description;
    }

    /**
     * Description: {VARCHAR(255)} <br />
     * @param description The value of the column 'Description'. (Nullable)
     */
    public void setDescription(String description) {
        _modifiedProperties.addPropertyName("description");
        this._description = description;
    }

    /**
     * DesignObject: {NotNull : BIT} <br />
     * @return The value of the column 'DesignObject'. (Nullable)
     */
    public Boolean getDesignobject() {
        return _designobject;
    }

    /**
     * DesignObject: {NotNull : BIT} <br />
     * @param designobject The value of the column 'DesignObject'. (Nullable)
     */
    public void setDesignobject(Boolean designobject) {
        _modifiedProperties.addPropertyName("designobject");
        this._designobject = designobject;
    }

    /**
     * ImageID: {SMALLINT} <br />
     * @return The value of the column 'ImageID'. (Nullable)
     */
    public java.lang.Integer getImageid() {
        return _imageid;
    }

    /**
     * ImageID: {SMALLINT} <br />
     * @param imageid The value of the column 'ImageID'. (Nullable)
     */
    public void setImageid(java.lang.Integer imageid) {
        _modifiedProperties.addPropertyName("imageid");
        this._imageid = imageid;
    }
}
