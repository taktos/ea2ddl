package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_rules(TABLE).
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
@SuppressWarnings("unchecked")
public abstract class BsTRules implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_rules. */
    public static final String TABLE = "t_rules";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'RuleID'. {UQ : VARCHAR(50)} */
    protected String _ruleid;

    /** The attribute of the column 'RuleName'. {VARCHAR(255)} */
    protected String _rulename;

    /** The attribute of the column 'RuleType'. {VARCHAR(255)} */
    protected String _ruletype;

    /** The attribute of the column 'RuleActive'. {INTEGER} */
    protected java.lang.Integer _ruleactive;

    /** The attribute of the column 'ErrorMsg'. {VARCHAR(255)} */
    protected String _errormsg;

    /** The attribute of the column 'Flags'. {VARCHAR(255)} */
    protected String _flags;

    /** The attribute of the column 'RuleOCL'. {LONGCHAR(2147483647)} */
    protected String _ruleocl;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'RuleXML'. {LONGCHAR(2147483647)} */
    protected String _rulexml;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTRules() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_rules";
    }

    public String getTablePropertyName() {// as JavaBeansRule
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

    /** The column annotation for S2Dao. {UQ : VARCHAR(50)} */
    public static final String ruleid_COLUMN = "RuleID";

    /**
     * Get the value of the column 'RuleID'. <br />
     * {UQ : VARCHAR(50)}
     * @return The value of the column 'RuleID'. (Nullable)
     */
    public String getRuleid() {
        return _ruleid;
    }

    /**
     * Set the value of the column 'RuleID'. <br />
     * {UQ : VARCHAR(50)}
     * @param ruleid The value of the column 'RuleID'. (Nullable)
     */
    public void setRuleid(String ruleid) {
        _modifiedProperties.addPropertyName("ruleid");
        this._ruleid = ruleid;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String rulename_COLUMN = "RuleName";

    /**
     * Get the value of the column 'RuleName'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'RuleName'. (Nullable)
     */
    public String getRulename() {
        return _rulename;
    }

    /**
     * Set the value of the column 'RuleName'. <br />
     * {VARCHAR(255)}
     * @param rulename The value of the column 'RuleName'. (Nullable)
     */
    public void setRulename(String rulename) {
        _modifiedProperties.addPropertyName("rulename");
        this._rulename = rulename;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String ruletype_COLUMN = "RuleType";

    /**
     * Get the value of the column 'RuleType'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'RuleType'. (Nullable)
     */
    public String getRuletype() {
        return _ruletype;
    }

    /**
     * Set the value of the column 'RuleType'. <br />
     * {VARCHAR(255)}
     * @param ruletype The value of the column 'RuleType'. (Nullable)
     */
    public void setRuletype(String ruletype) {
        _modifiedProperties.addPropertyName("ruletype");
        this._ruletype = ruletype;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String ruleactive_COLUMN = "RuleActive";

    /**
     * Get the value of the column 'RuleActive'. <br />
     * {INTEGER}
     * @return The value of the column 'RuleActive'. (Nullable)
     */
    public java.lang.Integer getRuleactive() {
        return _ruleactive;
    }

    /**
     * Set the value of the column 'RuleActive'. <br />
     * {INTEGER}
     * @param ruleactive The value of the column 'RuleActive'. (Nullable)
     */
    public void setRuleactive(java.lang.Integer ruleactive) {
        _modifiedProperties.addPropertyName("ruleactive");
        this._ruleactive = ruleactive;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String errormsg_COLUMN = "ErrorMsg";

    /**
     * Get the value of the column 'ErrorMsg'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'ErrorMsg'. (Nullable)
     */
    public String getErrormsg() {
        return _errormsg;
    }

    /**
     * Set the value of the column 'ErrorMsg'. <br />
     * {VARCHAR(255)}
     * @param errormsg The value of the column 'ErrorMsg'. (Nullable)
     */
    public void setErrormsg(String errormsg) {
        _modifiedProperties.addPropertyName("errormsg");
        this._errormsg = errormsg;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String flags_COLUMN = "Flags";

    /**
     * Get the value of the column 'Flags'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Flags'. (Nullable)
     */
    public String getFlags() {
        return _flags;
    }

    /**
     * Set the value of the column 'Flags'. <br />
     * {VARCHAR(255)}
     * @param flags The value of the column 'Flags'. (Nullable)
     */
    public void setFlags(String flags) {
        _modifiedProperties.addPropertyName("flags");
        this._flags = flags;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String ruleocl_COLUMN = "RuleOCL";

    /**
     * Get the value of the column 'RuleOCL'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'RuleOCL'. (Nullable)
     */
    public String getRuleocl() {
        return _ruleocl;
    }

    /**
     * Set the value of the column 'RuleOCL'. <br />
     * {LONGCHAR(2147483647)}
     * @param ruleocl The value of the column 'RuleOCL'. (Nullable)
     */
    public void setRuleocl(String ruleocl) {
        _modifiedProperties.addPropertyName("ruleocl");
        this._ruleocl = ruleocl;
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
    public static final String rulexml_COLUMN = "RuleXML";

    /**
     * Get the value of the column 'RuleXML'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'RuleXML'. (Nullable)
     */
    public String getRulexml() {
        return _rulexml;
    }

    /**
     * Set the value of the column 'RuleXML'. <br />
     * {LONGCHAR(2147483647)}
     * @param rulexml The value of the column 'RuleXML'. (Nullable)
     */
    public void setRulexml(String rulexml) {
        _modifiedProperties.addPropertyName("rulexml");
        this._rulexml = rulexml;
    }

}
