package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_stereotypes that the type is TABLE. <br />
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
public abstract class BsTStereotypes implements Entity, Serializable {

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
    /** Stereotype: {UQ : VARCHAR(255)} */
    protected String _stereotype;

    /** AppliesTo: {UQ : VARCHAR(255)} */
    protected String _appliesto;

    /** Description: {VARCHAR(255)} */
    protected String _description;

    /** MFEnabled: {NotNull : BIT} */
    protected Boolean _mfenabled;

    /** MFPath: {VARCHAR(255)} */
    protected String _mfpath;

    /** Metafile: {LONGBINARY} */
    protected byte[] _metafile;

    /** Style: {LONGCHAR(2147483647)} */
    protected String _style;

    /** ea_guid: {VARCHAR(50)} */
    protected String _eaGuid;

    /** VisualType: {VARCHAR(100)} */
    protected String _visualtype;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_stereotypes";
    }

    public String getTablePropertyName() { // as JavaBeansRule
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
    /**
     * Stereotype: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'Stereotype'. (Nullable)
     */
    public String getStereotype() {
        return _stereotype;
    }

    /**
     * Stereotype: {UQ : VARCHAR(255)} <br />
     * @param stereotype The value of the column 'Stereotype'. (Nullable)
     */
    public void setStereotype(String stereotype) {
        _modifiedProperties.addPropertyName("stereotype");
        this._stereotype = stereotype;
    }

    /**
     * AppliesTo: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'AppliesTo'. (Nullable)
     */
    public String getAppliesto() {
        return _appliesto;
    }

    /**
     * AppliesTo: {UQ : VARCHAR(255)} <br />
     * @param appliesto The value of the column 'AppliesTo'. (Nullable)
     */
    public void setAppliesto(String appliesto) {
        _modifiedProperties.addPropertyName("appliesto");
        this._appliesto = appliesto;
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
     * MFEnabled: {NotNull : BIT} <br />
     * @return The value of the column 'MFEnabled'. (Nullable)
     */
    public Boolean getMfenabled() {
        return _mfenabled;
    }

    /**
     * MFEnabled: {NotNull : BIT} <br />
     * @param mfenabled The value of the column 'MFEnabled'. (Nullable)
     */
    public void setMfenabled(Boolean mfenabled) {
        _modifiedProperties.addPropertyName("mfenabled");
        this._mfenabled = mfenabled;
    }

    /**
     * MFPath: {VARCHAR(255)} <br />
     * @return The value of the column 'MFPath'. (Nullable)
     */
    public String getMfpath() {
        return _mfpath;
    }

    /**
     * MFPath: {VARCHAR(255)} <br />
     * @param mfpath The value of the column 'MFPath'. (Nullable)
     */
    public void setMfpath(String mfpath) {
        _modifiedProperties.addPropertyName("mfpath");
        this._mfpath = mfpath;
    }

    /**
     * Metafile: {LONGBINARY} <br />
     * @return The value of the column 'Metafile'. (Nullable)
     */
    public byte[] getMetafile() {
        return _metafile;
    }

    /**
     * Metafile: {LONGBINARY} <br />
     * @param metafile The value of the column 'Metafile'. (Nullable)
     */
    public void setMetafile(byte[] metafile) {
        _modifiedProperties.addPropertyName("metafile");
        this._metafile = metafile;
    }

    /**
     * Style: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Style'. (Nullable)
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Style: {LONGCHAR(2147483647)} <br />
     * @param style The value of the column 'Style'. (Nullable)
     */
    public void setStyle(String style) {
        _modifiedProperties.addPropertyName("style");
        this._style = style;
    }

    /**
     * ea_guid: {VARCHAR(50)} <br />
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * ea_guid: {VARCHAR(50)} <br />
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
    }

    /**
     * VisualType: {VARCHAR(100)} <br />
     * @return The value of the column 'VisualType'. (Nullable)
     */
    public String getVisualtype() {
        return _visualtype;
    }

    /**
     * VisualType: {VARCHAR(100)} <br />
     * @param visualtype The value of the column 'VisualType'. (Nullable)
     */
    public void setVisualtype(String visualtype) {
        _modifiedProperties.addPropertyName("visualtype");
        this._visualtype = visualtype;
    }
}
