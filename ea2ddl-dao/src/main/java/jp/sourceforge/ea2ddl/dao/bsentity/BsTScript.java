package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_script that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     ScriptID, ScriptCategory, ScriptName, ScriptAuthor, Notes, Script
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
public abstract class BsTScript implements Entity, Serializable {

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
    /** ScriptID: {UQ : NotNull : COUNTER} */
    protected java.lang.Integer _scriptid;

    /** ScriptCategory: {VARCHAR(100)} */
    protected String _scriptcategory;

    /** ScriptName: {VARCHAR(150)} */
    protected String _scriptname;

    /** ScriptAuthor: {VARCHAR(255)} */
    protected String _scriptauthor;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** Script: {LONGCHAR(2147483647)} */
    protected String _script;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_script";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TScript";
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
        if (other == null || !(other instanceof BsTScript)) { return false; }
        final BsTScript otherEntity = (BsTScript)other;
        if (!helpComparingValue(getScriptid(), otherEntity.getScriptid())) { return false; }
        if (!helpComparingValue(getScriptcategory(), otherEntity.getScriptcategory())) { return false; }
        if (!helpComparingValue(getScriptname(), otherEntity.getScriptname())) { return false; }
        if (!helpComparingValue(getScriptauthor(), otherEntity.getScriptauthor())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getScript(), otherEntity.getScript())) { return false; }
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
        if (this.getScriptid() != null) { result = result + this.getScriptid().hashCode(); }
        if (this.getScriptcategory() != null) { result = result + this.getScriptcategory().hashCode(); }
        if (this.getScriptname() != null) { result = result + this.getScriptname().hashCode(); }
        if (this.getScriptauthor() != null) { result = result + this.getScriptauthor().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getScript() != null) { result = result + this.getScript().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getScriptid());
        sb.append(delimiter).append(getScriptcategory());
        sb.append(delimiter).append(getScriptname());
        sb.append(delimiter).append(getScriptauthor());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getScript());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * ScriptID: {UQ : NotNull : COUNTER} <br />
     * @return The value of the column 'ScriptID'. (Nullable)
     */
    public java.lang.Integer getScriptid() {
        return _scriptid;
    }

    /**
     * ScriptID: {UQ : NotNull : COUNTER} <br />
     * @param scriptid The value of the column 'ScriptID'. (Nullable)
     */
    public void setScriptid(java.lang.Integer scriptid) {
        _modifiedProperties.addPropertyName("scriptid");
        this._scriptid = scriptid;
    }

    /**
     * ScriptCategory: {VARCHAR(100)} <br />
     * @return The value of the column 'ScriptCategory'. (Nullable)
     */
    public String getScriptcategory() {
        return _scriptcategory;
    }

    /**
     * ScriptCategory: {VARCHAR(100)} <br />
     * @param scriptcategory The value of the column 'ScriptCategory'. (Nullable)
     */
    public void setScriptcategory(String scriptcategory) {
        _modifiedProperties.addPropertyName("scriptcategory");
        this._scriptcategory = scriptcategory;
    }

    /**
     * ScriptName: {VARCHAR(150)} <br />
     * @return The value of the column 'ScriptName'. (Nullable)
     */
    public String getScriptname() {
        return _scriptname;
    }

    /**
     * ScriptName: {VARCHAR(150)} <br />
     * @param scriptname The value of the column 'ScriptName'. (Nullable)
     */
    public void setScriptname(String scriptname) {
        _modifiedProperties.addPropertyName("scriptname");
        this._scriptname = scriptname;
    }

    /**
     * ScriptAuthor: {VARCHAR(255)} <br />
     * @return The value of the column 'ScriptAuthor'. (Nullable)
     */
    public String getScriptauthor() {
        return _scriptauthor;
    }

    /**
     * ScriptAuthor: {VARCHAR(255)} <br />
     * @param scriptauthor The value of the column 'ScriptAuthor'. (Nullable)
     */
    public void setScriptauthor(String scriptauthor) {
        _modifiedProperties.addPropertyName("scriptauthor");
        this._scriptauthor = scriptauthor;
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
     * Script: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Script'. (Nullable)
     */
    public String getScript() {
        return _script;
    }

    /**
     * Script: {LONGCHAR(2147483647)} <br />
     * @param script The value of the column 'Script'. (Nullable)
     */
    public void setScript(String script) {
        _modifiedProperties.addPropertyName("script");
        this._script = script;
    }
}
