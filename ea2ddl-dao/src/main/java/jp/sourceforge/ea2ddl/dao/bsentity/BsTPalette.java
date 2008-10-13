package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_palette(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PaletteID, Name, Type
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
public abstract class BsTPalette implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_palette. */
    public static final String TABLE = "t_palette";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'PaletteID'. {COUNTER : NotNull} */
    protected java.lang.Integer _paletteid;

    /** The attribute of the column 'Name'. {VARCHAR(255)} */
    protected String _name;

    /** The attribute of the column 'Type'. {VARCHAR(255)} */
    protected String _type;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPalette() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_palette";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TPalette";
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
        if (other == null || !(other instanceof BsTPalette)) { return false; }
        final BsTPalette otherEntity = (BsTPalette)other;
        if (!helpComparingValue(getPaletteid(), otherEntity.getPaletteid())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getType(), otherEntity.getType())) { return false; }
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
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getType() != null) { result = result + this.getType().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getPaletteid());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getType());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {COUNTER : NotNull} */
    public static final String paletteid_COLUMN = "PaletteID";

    /**
     * Get the value of the column 'PaletteID'. <br />
     * {COUNTER : NotNull}
     * @return The value of the column 'PaletteID'. (Nullable)
     */
    public java.lang.Integer getPaletteid() {
        return _paletteid;
    }

    /**
     * Set the value of the column 'PaletteID'. <br />
     * {COUNTER : NotNull}
     * @param paletteid The value of the column 'PaletteID'. (Nullable)
     */
    public void setPaletteid(java.lang.Integer paletteid) {
        _modifiedProperties.addPropertyName("paletteid");
        this._paletteid = paletteid;
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

}
