package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_umlpattern that the type is TABLE. <br />
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
public abstract class BsTUmlpattern implements Entity, Serializable {

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
    /** PatternID: {NotNull : COUNTER} */
    protected java.lang.Integer _patternid;

    /** PatternCategory: {VARCHAR(100)} */
    protected String _patterncategory;

    /** PatternName: {VARCHAR(150)} */
    protected String _patternname;

    /** Style: {VARCHAR(255)} */
    protected String _style;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** PatternXML: {LONGCHAR(2147483647)} */
    protected String _patternxml;

    /** Version: {VARCHAR(50)} */
    protected String _version;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_umlpattern";
    }

    public String getTablePropertyName() { // as JavaBeansRule
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
    /**
     * PatternID: {NotNull : COUNTER} <br />
     * @return The value of the column 'PatternID'. (Nullable)
     */
    public java.lang.Integer getPatternid() {
        return _patternid;
    }

    /**
     * PatternID: {NotNull : COUNTER} <br />
     * @param patternid The value of the column 'PatternID'. (Nullable)
     */
    public void setPatternid(java.lang.Integer patternid) {
        _modifiedProperties.addPropertyName("patternid");
        this._patternid = patternid;
    }

    /**
     * PatternCategory: {VARCHAR(100)} <br />
     * @return The value of the column 'PatternCategory'. (Nullable)
     */
    public String getPatterncategory() {
        return _patterncategory;
    }

    /**
     * PatternCategory: {VARCHAR(100)} <br />
     * @param patterncategory The value of the column 'PatternCategory'. (Nullable)
     */
    public void setPatterncategory(String patterncategory) {
        _modifiedProperties.addPropertyName("patterncategory");
        this._patterncategory = patterncategory;
    }

    /**
     * PatternName: {VARCHAR(150)} <br />
     * @return The value of the column 'PatternName'. (Nullable)
     */
    public String getPatternname() {
        return _patternname;
    }

    /**
     * PatternName: {VARCHAR(150)} <br />
     * @param patternname The value of the column 'PatternName'. (Nullable)
     */
    public void setPatternname(String patternname) {
        _modifiedProperties.addPropertyName("patternname");
        this._patternname = patternname;
    }

    /**
     * Style: {VARCHAR(255)} <br />
     * @return The value of the column 'Style'. (Nullable)
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Style: {VARCHAR(255)} <br />
     * @param style The value of the column 'Style'. (Nullable)
     */
    public void setStyle(String style) {
        _modifiedProperties.addPropertyName("style");
        this._style = style;
    }

    /**
     * Notes: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Notes'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * Notes: {LONGCHAR(2147483647)} <br />
     * @param notes The value of the column 'Notes'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

    /**
     * PatternXML: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'PatternXML'. (Nullable)
     */
    public String getPatternxml() {
        return _patternxml;
    }

    /**
     * PatternXML: {LONGCHAR(2147483647)} <br />
     * @param patternxml The value of the column 'PatternXML'. (Nullable)
     */
    public void setPatternxml(String patternxml) {
        _modifiedProperties.addPropertyName("patternxml");
        this._patternxml = patternxml;
    }

    /**
     * Version: {VARCHAR(50)} <br />
     * @return The value of the column 'Version'. (Nullable)
     */
    public String getVersion() {
        return _version;
    }

    /**
     * Version: {VARCHAR(50)} <br />
     * @param version The value of the column 'Version'. (Nullable)
     */
    public void setVersion(String version) {
        _modifiedProperties.addPropertyName("version");
        this._version = version;
    }
}
