package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_umlpattern(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PatternID, PatternCategory, PatternName, Style, Notes, PatternXML, Version
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
public abstract class BsTUmlpattern implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_umlpattern. */
    public static final String TABLE = "t_umlpattern";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'PatternID'. {COUNTER : NotNull} */
    protected java.lang.Integer _patternid;

    /** The attribute of the column 'PatternCategory'. {VARCHAR(100)} */
    protected String _patterncategory;

    /** The attribute of the column 'PatternName'. {VARCHAR(150)} */
    protected String _patternname;

    /** The attribute of the column 'Style'. {VARCHAR(255)} */
    protected String _style;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'PatternXML'. {LONGCHAR(2147483647)} */
    protected String _patternxml;

    /** The attribute of the column 'Version'. {VARCHAR(50)} */
    protected String _version;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTUmlpattern() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_umlpattern";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TUmlpattern";
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
        if (other == null || !(other instanceof BsTUmlpattern)) { return false; }
        final BsTUmlpattern otherEntity = (BsTUmlpattern)other;
        if (!helpComparingValue(getPatternid(), otherEntity.getPatternid())) { return false; }
        if (!helpComparingValue(getPatterncategory(), otherEntity.getPatterncategory())) { return false; }
        if (!helpComparingValue(getPatternname(), otherEntity.getPatternname())) { return false; }
        if (!helpComparingValue(getStyle(), otherEntity.getStyle())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getPatternxml(), otherEntity.getPatternxml())) { return false; }
        if (!helpComparingValue(getVersion(), otherEntity.getVersion())) { return false; }
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
        if (this.getPatternid() != null) { result = result + this.getPatternid().hashCode(); }
        if (this.getPatterncategory() != null) { result = result + this.getPatterncategory().hashCode(); }
        if (this.getPatternname() != null) { result = result + this.getPatternname().hashCode(); }
        if (this.getStyle() != null) { result = result + this.getStyle().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getPatternxml() != null) { result = result + this.getPatternxml().hashCode(); }
        if (this.getVersion() != null) { result = result + this.getVersion().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getPatternid());
        sb.append(delimiter).append(getPatterncategory());
        sb.append(delimiter).append(getPatternname());
        sb.append(delimiter).append(getStyle());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getPatternxml());
        sb.append(delimiter).append(getVersion());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {COUNTER : NotNull} */
    public static final String patternid_COLUMN = "PatternID";

    /**
     * Get the value of the column 'PatternID'. <br />
     * {COUNTER : NotNull}
     * @return The value of the column 'PatternID'. (Nullable)
     */
    public java.lang.Integer getPatternid() {
        return _patternid;
    }

    /**
     * Set the value of the column 'PatternID'. <br />
     * {COUNTER : NotNull}
     * @param patternid The value of the column 'PatternID'. (Nullable)
     */
    public void setPatternid(java.lang.Integer patternid) {
        _modifiedProperties.addPropertyName("patternid");
        this._patternid = patternid;
    }

    /** The column annotation for S2Dao. {VARCHAR(100)} */
    public static final String patterncategory_COLUMN = "PatternCategory";

    /**
     * Get the value of the column 'PatternCategory'. <br />
     * {VARCHAR(100)}
     * @return The value of the column 'PatternCategory'. (Nullable)
     */
    public String getPatterncategory() {
        return _patterncategory;
    }

    /**
     * Set the value of the column 'PatternCategory'. <br />
     * {VARCHAR(100)}
     * @param patterncategory The value of the column 'PatternCategory'. (Nullable)
     */
    public void setPatterncategory(String patterncategory) {
        _modifiedProperties.addPropertyName("patterncategory");
        this._patterncategory = patterncategory;
    }

    /** The column annotation for S2Dao. {VARCHAR(150)} */
    public static final String patternname_COLUMN = "PatternName";

    /**
     * Get the value of the column 'PatternName'. <br />
     * {VARCHAR(150)}
     * @return The value of the column 'PatternName'. (Nullable)
     */
    public String getPatternname() {
        return _patternname;
    }

    /**
     * Set the value of the column 'PatternName'. <br />
     * {VARCHAR(150)}
     * @param patternname The value of the column 'PatternName'. (Nullable)
     */
    public void setPatternname(String patternname) {
        _modifiedProperties.addPropertyName("patternname");
        this._patternname = patternname;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String style_COLUMN = "Style";

    /**
     * Get the value of the column 'Style'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Style'. (Nullable)
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Set the value of the column 'Style'. <br />
     * {VARCHAR(255)}
     * @param style The value of the column 'Style'. (Nullable)
     */
    public void setStyle(String style) {
        _modifiedProperties.addPropertyName("style");
        this._style = style;
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

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String patternxml_COLUMN = "PatternXML";

    /**
     * Get the value of the column 'PatternXML'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'PatternXML'. (Nullable)
     */
    public String getPatternxml() {
        return _patternxml;
    }

    /**
     * Set the value of the column 'PatternXML'. <br />
     * {LONGCHAR(2147483647)}
     * @param patternxml The value of the column 'PatternXML'. (Nullable)
     */
    public void setPatternxml(String patternxml) {
        _modifiedProperties.addPropertyName("patternxml");
        this._patternxml = patternxml;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String version_COLUMN = "Version";

    /**
     * Get the value of the column 'Version'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Version'. (Nullable)
     */
    public String getVersion() {
        return _version;
    }

    /**
     * Set the value of the column 'Version'. <br />
     * {VARCHAR(50)}
     * @param version The value of the column 'Version'. (Nullable)
     */
    public void setVersion(String version) {
        _modifiedProperties.addPropertyName("version");
        this._version = version;
    }

}
