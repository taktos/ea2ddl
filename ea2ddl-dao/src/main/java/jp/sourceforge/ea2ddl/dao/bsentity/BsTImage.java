package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_image(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     ImageID, Name, Type, Image
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
public abstract class BsTImage implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_image. */
    public static final String TABLE = "t_image";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'ImageID'. {COUNTER : NotNull} */
    protected java.lang.Integer _imageid;

    /** The attribute of the column 'Name'. {VARCHAR(255)} */
    protected String _name;

    /** The attribute of the column 'Type'. {VARCHAR(255)} */
    protected String _type;

    /** The attribute of the column 'Image'. {LONGBINARY} */
    protected byte[] _image;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTImage() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_image";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TImage";
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
        if (other == null || !(other instanceof BsTImage)) { return false; }
        final BsTImage otherEntity = (BsTImage)other;
        if (!helpComparingValue(getImageid(), otherEntity.getImageid())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getType(), otherEntity.getType())) { return false; }
        if (!helpComparingValue(getImage(), otherEntity.getImage())) { return false; }
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
        if (this.getImageid() != null) { result = result + this.getImageid().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getType() != null) { result = result + this.getType().hashCode(); }
        if (this.getImage() != null) { result = result + this.getImage().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getImageid());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getType());
        sb.append(delimiter).append(getImage());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {COUNTER : NotNull} */
    public static final String imageid_COLUMN = "ImageID";

    /**
     * Get the value of the column 'ImageID'. <br />
     * {COUNTER : NotNull}
     * @return The value of the column 'ImageID'. (Nullable)
     */
    public java.lang.Integer getImageid() {
        return _imageid;
    }

    /**
     * Set the value of the column 'ImageID'. <br />
     * {COUNTER : NotNull}
     * @param imageid The value of the column 'ImageID'. (Nullable)
     */
    public void setImageid(java.lang.Integer imageid) {
        _modifiedProperties.addPropertyName("imageid");
        this._imageid = imageid;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String name_COLUMN = "Name";

    /**
     * Get the value of the column 'Name'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Set the value of the column 'Name'. <br />
     * {VARCHAR(255)}
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String type_COLUMN = "Type";

    /**
     * Get the value of the column 'Type'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Type'. (Nullable)
     */
    public String getType() {
        return _type;
    }

    /**
     * Set the value of the column 'Type'. <br />
     * {VARCHAR(255)}
     * @param type The value of the column 'Type'. (Nullable)
     */
    public void setType(String type) {
        _modifiedProperties.addPropertyName("type");
        this._type = type;
    }

    /** The column annotation for S2Dao. {LONGBINARY} */
    public static final String image_COLUMN = "Image";

    /**
     * Get the value of the column 'Image'. <br />
     * {LONGBINARY}
     * @return The value of the column 'Image'. (Nullable)
     */
    public byte[] getImage() {
        return _image;
    }

    /**
     * Set the value of the column 'Image'. <br />
     * {LONGBINARY}
     * @param image The value of the column 'Image'. (Nullable)
     */
    public void setImage(byte[] image) {
        _modifiedProperties.addPropertyName("image");
        this._image = image;
    }

}
