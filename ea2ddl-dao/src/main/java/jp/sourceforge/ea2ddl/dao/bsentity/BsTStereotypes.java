package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_stereotypes(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Stereotype, AppliesTo, Description, MFEnabled, MFPath, Metafile, Style, ea_guid, VisualType
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
public abstract class BsTStereotypes implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_stereotypes. */
    public static final String TABLE = "t_stereotypes";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Stereotype'. {UQ : VARCHAR(255)} */
    protected String _stereotype;

    /** The attribute of the column 'AppliesTo'. {UQ : VARCHAR(255)} */
    protected String _appliesto;

    /** The attribute of the column 'Description'. {VARCHAR(255)} */
    protected String _description;

    /** The attribute of the column 'MFEnabled'. {BIT : NotNull} */
    protected Boolean _mfenabled;

    /** The attribute of the column 'MFPath'. {VARCHAR(255)} */
    protected String _mfpath;

    /** The attribute of the column 'Metafile'. {LONGBINARY} */
    protected byte[] _metafile;

    /** The attribute of the column 'Style'. {LONGCHAR(2147483647)} */
    protected String _style;

    /** The attribute of the column 'ea_guid'. {VARCHAR(50)} */
    protected String _eaGuid;

    /** The attribute of the column 'VisualType'. {VARCHAR(100)} */
    protected String _visualtype;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStereotypes() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_stereotypes";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TStereotypes";
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
        if (other == null || !(other instanceof BsTStereotypes)) { return false; }
        final BsTStereotypes otherEntity = (BsTStereotypes)other;
        if (!helpComparingValue(getStereotype(), otherEntity.getStereotype())) { return false; }
        if (!helpComparingValue(getAppliesto(), otherEntity.getAppliesto())) { return false; }
        if (!helpComparingValue(getDescription(), otherEntity.getDescription())) { return false; }
        if (!helpComparingValue(getMfenabled(), otherEntity.getMfenabled())) { return false; }
        if (!helpComparingValue(getMfpath(), otherEntity.getMfpath())) { return false; }
        if (!helpComparingValue(getMetafile(), otherEntity.getMetafile())) { return false; }
        if (!helpComparingValue(getStyle(), otherEntity.getStyle())) { return false; }
        if (!helpComparingValue(getEaGuid(), otherEntity.getEaGuid())) { return false; }
        if (!helpComparingValue(getVisualtype(), otherEntity.getVisualtype())) { return false; }
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
        if (this.getStereotype() != null) { result = result + this.getStereotype().hashCode(); }
        if (this.getAppliesto() != null) { result = result + this.getAppliesto().hashCode(); }
        if (this.getDescription() != null) { result = result + this.getDescription().hashCode(); }
        if (this.getMfenabled() != null) { result = result + this.getMfenabled().hashCode(); }
        if (this.getMfpath() != null) { result = result + this.getMfpath().hashCode(); }
        if (this.getMetafile() != null) { result = result + this.getMetafile().hashCode(); }
        if (this.getStyle() != null) { result = result + this.getStyle().hashCode(); }
        if (this.getEaGuid() != null) { result = result + this.getEaGuid().hashCode(); }
        if (this.getVisualtype() != null) { result = result + this.getVisualtype().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getStereotype());
        sb.append(delimiter).append(getAppliesto());
        sb.append(delimiter).append(getDescription());
        sb.append(delimiter).append(getMfenabled());
        sb.append(delimiter).append(getMfpath());
        sb.append(delimiter).append(getMetafile());
        sb.append(delimiter).append(getStyle());
        sb.append(delimiter).append(getEaGuid());
        sb.append(delimiter).append(getVisualtype());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : VARCHAR(255)} */
    public static final String stereotype_COLUMN = "Stereotype";

    /**
     * Get the value of the column 'Stereotype'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'Stereotype'. (Nullable)
     */
    public String getStereotype() {
        return _stereotype;
    }

    /**
     * Set the value of the column 'Stereotype'. <br />
     * {UQ : VARCHAR(255)}
     * @param stereotype The value of the column 'Stereotype'. (Nullable)
     */
    public void setStereotype(String stereotype) {
        _modifiedProperties.addPropertyName("stereotype");
        this._stereotype = stereotype;
    }

    /** The column annotation for S2Dao. {UQ : VARCHAR(255)} */
    public static final String appliesto_COLUMN = "AppliesTo";

    /**
     * Get the value of the column 'AppliesTo'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'AppliesTo'. (Nullable)
     */
    public String getAppliesto() {
        return _appliesto;
    }

    /**
     * Set the value of the column 'AppliesTo'. <br />
     * {UQ : VARCHAR(255)}
     * @param appliesto The value of the column 'AppliesTo'. (Nullable)
     */
    public void setAppliesto(String appliesto) {
        _modifiedProperties.addPropertyName("appliesto");
        this._appliesto = appliesto;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String description_COLUMN = "Description";

    /**
     * Get the value of the column 'Description'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Description'. (Nullable)
     */
    public String getDescription() {
        return _description;
    }

    /**
     * Set the value of the column 'Description'. <br />
     * {VARCHAR(255)}
     * @param description The value of the column 'Description'. (Nullable)
     */
    public void setDescription(String description) {
        _modifiedProperties.addPropertyName("description");
        this._description = description;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String mfenabled_COLUMN = "MFEnabled";

    /**
     * Get the value of the column 'MFEnabled'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'MFEnabled'. (Nullable)
     */
    public Boolean getMfenabled() {
        return _mfenabled;
    }

    /**
     * Set the value of the column 'MFEnabled'. <br />
     * {BIT : NotNull}
     * @param mfenabled The value of the column 'MFEnabled'. (Nullable)
     */
    public void setMfenabled(Boolean mfenabled) {
        _modifiedProperties.addPropertyName("mfenabled");
        this._mfenabled = mfenabled;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String mfpath_COLUMN = "MFPath";

    /**
     * Get the value of the column 'MFPath'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'MFPath'. (Nullable)
     */
    public String getMfpath() {
        return _mfpath;
    }

    /**
     * Set the value of the column 'MFPath'. <br />
     * {VARCHAR(255)}
     * @param mfpath The value of the column 'MFPath'. (Nullable)
     */
    public void setMfpath(String mfpath) {
        _modifiedProperties.addPropertyName("mfpath");
        this._mfpath = mfpath;
    }

    /** The column annotation for S2Dao. {LONGBINARY} */
    public static final String metafile_COLUMN = "Metafile";

    /**
     * Get the value of the column 'Metafile'. <br />
     * {LONGBINARY}
     * @return The value of the column 'Metafile'. (Nullable)
     */
    public byte[] getMetafile() {
        return _metafile;
    }

    /**
     * Set the value of the column 'Metafile'. <br />
     * {LONGBINARY}
     * @param metafile The value of the column 'Metafile'. (Nullable)
     */
    public void setMetafile(byte[] metafile) {
        _modifiedProperties.addPropertyName("metafile");
        this._metafile = metafile;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String style_COLUMN = "Style";

    /**
     * Get the value of the column 'Style'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Style'. (Nullable)
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Set the value of the column 'Style'. <br />
     * {LONGCHAR(2147483647)}
     * @param style The value of the column 'Style'. (Nullable)
     */
    public void setStyle(String style) {
        _modifiedProperties.addPropertyName("style");
        this._style = style;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String eaGuid_COLUMN = "ea_guid";

    /**
     * Get the value of the column 'ea_guid'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * Set the value of the column 'ea_guid'. <br />
     * {VARCHAR(50)}
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
    }

    /** The column annotation for S2Dao. {VARCHAR(100)} */
    public static final String visualtype_COLUMN = "VisualType";

    /**
     * Get the value of the column 'VisualType'. <br />
     * {VARCHAR(100)}
     * @return The value of the column 'VisualType'. (Nullable)
     */
    public String getVisualtype() {
        return _visualtype;
    }

    /**
     * Set the value of the column 'VisualType'. <br />
     * {VARCHAR(100)}
     * @param visualtype The value of the column 'VisualType'. (Nullable)
     */
    public void setVisualtype(String visualtype) {
        _modifiedProperties.addPropertyName("visualtype");
        this._visualtype = visualtype;
    }

}
