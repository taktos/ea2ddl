package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_rules that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     RuleID, RuleName, RuleType, RuleActive, ErrorMsg, Flags, RuleOCL, Notes, RuleXML
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
public abstract class BsTRules implements Entity, Serializable {

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
    /** RuleID: {UQ : VARCHAR(50)} */
    protected String _ruleid;

    /** RuleName: {VARCHAR(255)} */
    protected String _rulename;

    /** RuleType: {VARCHAR(255)} */
    protected String _ruletype;

    /** RuleActive: {INTEGER} */
    protected java.lang.Integer _ruleactive;

    /** ErrorMsg: {VARCHAR(255)} */
    protected String _errormsg;

    /** Flags: {VARCHAR(255)} */
    protected String _flags;

    /** RuleOCL: {LONGCHAR(2147483647)} */
    protected String _ruleocl;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** RuleXML: {LONGCHAR(2147483647)} */
    protected String _rulexml;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_rules";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TRules";
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
        if (other == null || !(other instanceof BsTRules)) { return false; }
        final BsTRules otherEntity = (BsTRules)other;
        if (!helpComparingValue(getRuleid(), otherEntity.getRuleid())) { return false; }
        if (!helpComparingValue(getRulename(), otherEntity.getRulename())) { return false; }
        if (!helpComparingValue(getRuletype(), otherEntity.getRuletype())) { return false; }
        if (!helpComparingValue(getRuleactive(), otherEntity.getRuleactive())) { return false; }
        if (!helpComparingValue(getErrormsg(), otherEntity.getErrormsg())) { return false; }
        if (!helpComparingValue(getFlags(), otherEntity.getFlags())) { return false; }
        if (!helpComparingValue(getRuleocl(), otherEntity.getRuleocl())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getRulexml(), otherEntity.getRulexml())) { return false; }
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
        if (this.getRuleid() != null) { result = result + this.getRuleid().hashCode(); }
        if (this.getRulename() != null) { result = result + this.getRulename().hashCode(); }
        if (this.getRuletype() != null) { result = result + this.getRuletype().hashCode(); }
        if (this.getRuleactive() != null) { result = result + this.getRuleactive().hashCode(); }
        if (this.getErrormsg() != null) { result = result + this.getErrormsg().hashCode(); }
        if (this.getFlags() != null) { result = result + this.getFlags().hashCode(); }
        if (this.getRuleocl() != null) { result = result + this.getRuleocl().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getRulexml() != null) { result = result + this.getRulexml().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getRuleid());
        sb.append(delimiter).append(getRulename());
        sb.append(delimiter).append(getRuletype());
        sb.append(delimiter).append(getRuleactive());
        sb.append(delimiter).append(getErrormsg());
        sb.append(delimiter).append(getFlags());
        sb.append(delimiter).append(getRuleocl());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getRulexml());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * RuleID: {UQ : VARCHAR(50)} <br />
     * @return The value of the column 'RuleID'. (Nullable)
     */
    public String getRuleid() {
        return _ruleid;
    }

    /**
     * RuleID: {UQ : VARCHAR(50)} <br />
     * @param ruleid The value of the column 'RuleID'. (Nullable)
     */
    public void setRuleid(String ruleid) {
        _modifiedProperties.addPropertyName("ruleid");
        this._ruleid = ruleid;
    }

    /**
     * RuleName: {VARCHAR(255)} <br />
     * @return The value of the column 'RuleName'. (Nullable)
     */
    public String getRulename() {
        return _rulename;
    }

    /**
     * RuleName: {VARCHAR(255)} <br />
     * @param rulename The value of the column 'RuleName'. (Nullable)
     */
    public void setRulename(String rulename) {
        _modifiedProperties.addPropertyName("rulename");
        this._rulename = rulename;
    }

    /**
     * RuleType: {VARCHAR(255)} <br />
     * @return The value of the column 'RuleType'. (Nullable)
     */
    public String getRuletype() {
        return _ruletype;
    }

    /**
     * RuleType: {VARCHAR(255)} <br />
     * @param ruletype The value of the column 'RuleType'. (Nullable)
     */
    public void setRuletype(String ruletype) {
        _modifiedProperties.addPropertyName("ruletype");
        this._ruletype = ruletype;
    }

    /**
     * RuleActive: {INTEGER} <br />
     * @return The value of the column 'RuleActive'. (Nullable)
     */
    public java.lang.Integer getRuleactive() {
        return _ruleactive;
    }

    /**
     * RuleActive: {INTEGER} <br />
     * @param ruleactive The value of the column 'RuleActive'. (Nullable)
     */
    public void setRuleactive(java.lang.Integer ruleactive) {
        _modifiedProperties.addPropertyName("ruleactive");
        this._ruleactive = ruleactive;
    }

    /**
     * ErrorMsg: {VARCHAR(255)} <br />
     * @return The value of the column 'ErrorMsg'. (Nullable)
     */
    public String getErrormsg() {
        return _errormsg;
    }

    /**
     * ErrorMsg: {VARCHAR(255)} <br />
     * @param errormsg The value of the column 'ErrorMsg'. (Nullable)
     */
    public void setErrormsg(String errormsg) {
        _modifiedProperties.addPropertyName("errormsg");
        this._errormsg = errormsg;
    }

    /**
     * Flags: {VARCHAR(255)} <br />
     * @return The value of the column 'Flags'. (Nullable)
     */
    public String getFlags() {
        return _flags;
    }

    /**
     * Flags: {VARCHAR(255)} <br />
     * @param flags The value of the column 'Flags'. (Nullable)
     */
    public void setFlags(String flags) {
        _modifiedProperties.addPropertyName("flags");
        this._flags = flags;
    }

    /**
     * RuleOCL: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'RuleOCL'. (Nullable)
     */
    public String getRuleocl() {
        return _ruleocl;
    }

    /**
     * RuleOCL: {LONGCHAR(2147483647)} <br />
     * @param ruleocl The value of the column 'RuleOCL'. (Nullable)
     */
    public void setRuleocl(String ruleocl) {
        _modifiedProperties.addPropertyName("ruleocl");
        this._ruleocl = ruleocl;
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
     * RuleXML: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'RuleXML'. (Nullable)
     */
    public String getRulexml() {
        return _rulexml;
    }

    /**
     * RuleXML: {LONGCHAR(2147483647)} <br />
     * @param rulexml The value of the column 'RuleXML'. (Nullable)
     */
    public void setRulexml(String rulexml) {
        _modifiedProperties.addPropertyName("rulexml");
        this._rulexml = rulexml;
    }
}
