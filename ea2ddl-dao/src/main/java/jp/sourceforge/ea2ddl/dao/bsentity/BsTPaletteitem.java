package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_paletteitem(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PaletteID, ItemID
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
public abstract class BsTPaletteitem implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_paletteitem. */
    public static final String TABLE = "t_paletteitem";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'PaletteID'. {INTEGER} */
    protected java.lang.Integer _paletteid;

    /** The attribute of the column 'ItemID'. {INTEGER} */
    protected java.lang.Integer _itemid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPaletteitem() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_paletteitem";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TPaletteitem";
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
        if (other == null || !(other instanceof BsTPaletteitem)) { return false; }
        final BsTPaletteitem otherEntity = (BsTPaletteitem)other;
        if (!helpComparingValue(getPaletteid(), otherEntity.getPaletteid())) { return false; }
        if (!helpComparingValue(getItemid(), otherEntity.getItemid())) { return false; }
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
        if (this.getPaletteid() != null) { result = result + this.getPaletteid().hashCode(); }
        if (this.getItemid() != null) { result = result + this.getItemid().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getPaletteid());
        sb.append(delimiter).append(getItemid());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String paletteid_COLUMN = "PaletteID";

    /**
     * Get the value of the column 'PaletteID'. <br />
     * {INTEGER}
     * @return The value of the column 'PaletteID'. (Nullable)
     */
    public java.lang.Integer getPaletteid() {
        return _paletteid;
    }

    /**
     * Set the value of the column 'PaletteID'. <br />
     * {INTEGER}
     * @param paletteid The value of the column 'PaletteID'. (Nullable)
     */
    public void setPaletteid(java.lang.Integer paletteid) {
        _modifiedProperties.addPropertyName("paletteid");
        this._paletteid = paletteid;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String itemid_COLUMN = "ItemID";

    /**
     * Get the value of the column 'ItemID'. <br />
     * {INTEGER}
     * @return The value of the column 'ItemID'. (Nullable)
     */
    public java.lang.Integer getItemid() {
        return _itemid;
    }

    /**
     * Set the value of the column 'ItemID'. <br />
     * {INTEGER}
     * @param itemid The value of the column 'ItemID'. (Nullable)
     */
    public void setItemid(java.lang.Integer itemid) {
        _modifiedProperties.addPropertyName("itemid");
        this._itemid = itemid;
    }

}
