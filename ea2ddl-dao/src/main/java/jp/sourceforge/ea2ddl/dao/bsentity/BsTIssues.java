package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_issues that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Issue, IssueDate, Owner, Status, Notes, Resolver, DateResolved, Resolution, IssueID, Category, Priority, Severity, IssueType
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
public abstract class BsTIssues implements Entity, Serializable {

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
    /** Issue: {VARCHAR(255)} */
    protected String _issue;

    /** IssueDate: {DATETIME} */
    protected java.sql.Timestamp _issuedate;

    /** Owner: {VARCHAR(255)} */
    protected String _owner;

    /** Status: {VARCHAR(50)} */
    protected String _status;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** Resolver: {VARCHAR(255)} */
    protected String _resolver;

    /** DateResolved: {DATETIME} */
    protected java.sql.Timestamp _dateresolved;

    /** Resolution: {LONGCHAR(2147483647)} */
    protected String _resolution;

    /** IssueID: {UQ : NotNull : COUNTER} */
    protected java.lang.Integer _issueid;

    /** Category: {VARCHAR(255)} */
    protected String _category;

    /** Priority: {VARCHAR(50)} */
    protected String _priority;

    /** Severity: {VARCHAR(50)} */
    protected String _severity;

    /** IssueType: {VARCHAR(100)} */
    protected String _issuetype;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_issues";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TIssues";
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
        if (other == null || !(other instanceof BsTIssues)) { return false; }
        final BsTIssues otherEntity = (BsTIssues)other;
        if (!helpComparingValue(getIssue(), otherEntity.getIssue())) { return false; }
        if (!helpComparingValue(getIssuedate(), otherEntity.getIssuedate())) { return false; }
        if (!helpComparingValue(getOwner(), otherEntity.getOwner())) { return false; }
        if (!helpComparingValue(getStatus(), otherEntity.getStatus())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getResolver(), otherEntity.getResolver())) { return false; }
        if (!helpComparingValue(getDateresolved(), otherEntity.getDateresolved())) { return false; }
        if (!helpComparingValue(getResolution(), otherEntity.getResolution())) { return false; }
        if (!helpComparingValue(getIssueid(), otherEntity.getIssueid())) { return false; }
        if (!helpComparingValue(getCategory(), otherEntity.getCategory())) { return false; }
        if (!helpComparingValue(getPriority(), otherEntity.getPriority())) { return false; }
        if (!helpComparingValue(getSeverity(), otherEntity.getSeverity())) { return false; }
        if (!helpComparingValue(getIssuetype(), otherEntity.getIssuetype())) { return false; }
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
        if (this.getIssue() != null) { result = result + this.getIssue().hashCode(); }
        if (this.getIssuedate() != null) { result = result + this.getIssuedate().hashCode(); }
        if (this.getOwner() != null) { result = result + this.getOwner().hashCode(); }
        if (this.getStatus() != null) { result = result + this.getStatus().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getResolver() != null) { result = result + this.getResolver().hashCode(); }
        if (this.getDateresolved() != null) { result = result + this.getDateresolved().hashCode(); }
        if (this.getResolution() != null) { result = result + this.getResolution().hashCode(); }
        if (this.getIssueid() != null) { result = result + this.getIssueid().hashCode(); }
        if (this.getCategory() != null) { result = result + this.getCategory().hashCode(); }
        if (this.getPriority() != null) { result = result + this.getPriority().hashCode(); }
        if (this.getSeverity() != null) { result = result + this.getSeverity().hashCode(); }
        if (this.getIssuetype() != null) { result = result + this.getIssuetype().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getIssue());
        sb.append(delimiter).append(getIssuedate());
        sb.append(delimiter).append(getOwner());
        sb.append(delimiter).append(getStatus());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getResolver());
        sb.append(delimiter).append(getDateresolved());
        sb.append(delimiter).append(getResolution());
        sb.append(delimiter).append(getIssueid());
        sb.append(delimiter).append(getCategory());
        sb.append(delimiter).append(getPriority());
        sb.append(delimiter).append(getSeverity());
        sb.append(delimiter).append(getIssuetype());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Issue: {VARCHAR(255)} <br />
     * @return The value of the column 'Issue'. (Nullable)
     */
    public String getIssue() {
        return _issue;
    }

    /**
     * Issue: {VARCHAR(255)} <br />
     * @param issue The value of the column 'Issue'. (Nullable)
     */
    public void setIssue(String issue) {
        _modifiedProperties.addPropertyName("issue");
        this._issue = issue;
    }

    /**
     * IssueDate: {DATETIME} <br />
     * @return The value of the column 'IssueDate'. (Nullable)
     */
    public java.sql.Timestamp getIssuedate() {
        return _issuedate;
    }

    /**
     * IssueDate: {DATETIME} <br />
     * @param issuedate The value of the column 'IssueDate'. (Nullable)
     */
    public void setIssuedate(java.sql.Timestamp issuedate) {
        _modifiedProperties.addPropertyName("issuedate");
        this._issuedate = issuedate;
    }

    /**
     * Owner: {VARCHAR(255)} <br />
     * @return The value of the column 'Owner'. (Nullable)
     */
    public String getOwner() {
        return _owner;
    }

    /**
     * Owner: {VARCHAR(255)} <br />
     * @param owner The value of the column 'Owner'. (Nullable)
     */
    public void setOwner(String owner) {
        _modifiedProperties.addPropertyName("owner");
        this._owner = owner;
    }

    /**
     * Status: {VARCHAR(50)} <br />
     * @return The value of the column 'Status'. (Nullable)
     */
    public String getStatus() {
        return _status;
    }

    /**
     * Status: {VARCHAR(50)} <br />
     * @param status The value of the column 'Status'. (Nullable)
     */
    public void setStatus(String status) {
        _modifiedProperties.addPropertyName("status");
        this._status = status;
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
     * Resolver: {VARCHAR(255)} <br />
     * @return The value of the column 'Resolver'. (Nullable)
     */
    public String getResolver() {
        return _resolver;
    }

    /**
     * Resolver: {VARCHAR(255)} <br />
     * @param resolver The value of the column 'Resolver'. (Nullable)
     */
    public void setResolver(String resolver) {
        _modifiedProperties.addPropertyName("resolver");
        this._resolver = resolver;
    }

    /**
     * DateResolved: {DATETIME} <br />
     * @return The value of the column 'DateResolved'. (Nullable)
     */
    public java.sql.Timestamp getDateresolved() {
        return _dateresolved;
    }

    /**
     * DateResolved: {DATETIME} <br />
     * @param dateresolved The value of the column 'DateResolved'. (Nullable)
     */
    public void setDateresolved(java.sql.Timestamp dateresolved) {
        _modifiedProperties.addPropertyName("dateresolved");
        this._dateresolved = dateresolved;
    }

    /**
     * Resolution: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Resolution'. (Nullable)
     */
    public String getResolution() {
        return _resolution;
    }

    /**
     * Resolution: {LONGCHAR(2147483647)} <br />
     * @param resolution The value of the column 'Resolution'. (Nullable)
     */
    public void setResolution(String resolution) {
        _modifiedProperties.addPropertyName("resolution");
        this._resolution = resolution;
    }

    /**
     * IssueID: {UQ : NotNull : COUNTER} <br />
     * @return The value of the column 'IssueID'. (Nullable)
     */
    public java.lang.Integer getIssueid() {
        return _issueid;
    }

    /**
     * IssueID: {UQ : NotNull : COUNTER} <br />
     * @param issueid The value of the column 'IssueID'. (Nullable)
     */
    public void setIssueid(java.lang.Integer issueid) {
        _modifiedProperties.addPropertyName("issueid");
        this._issueid = issueid;
    }

    /**
     * Category: {VARCHAR(255)} <br />
     * @return The value of the column 'Category'. (Nullable)
     */
    public String getCategory() {
        return _category;
    }

    /**
     * Category: {VARCHAR(255)} <br />
     * @param category The value of the column 'Category'. (Nullable)
     */
    public void setCategory(String category) {
        _modifiedProperties.addPropertyName("category");
        this._category = category;
    }

    /**
     * Priority: {VARCHAR(50)} <br />
     * @return The value of the column 'Priority'. (Nullable)
     */
    public String getPriority() {
        return _priority;
    }

    /**
     * Priority: {VARCHAR(50)} <br />
     * @param priority The value of the column 'Priority'. (Nullable)
     */
    public void setPriority(String priority) {
        _modifiedProperties.addPropertyName("priority");
        this._priority = priority;
    }

    /**
     * Severity: {VARCHAR(50)} <br />
     * @return The value of the column 'Severity'. (Nullable)
     */
    public String getSeverity() {
        return _severity;
    }

    /**
     * Severity: {VARCHAR(50)} <br />
     * @param severity The value of the column 'Severity'. (Nullable)
     */
    public void setSeverity(String severity) {
        _modifiedProperties.addPropertyName("severity");
        this._severity = severity;
    }

    /**
     * IssueType: {VARCHAR(100)} <br />
     * @return The value of the column 'IssueType'. (Nullable)
     */
    public String getIssuetype() {
        return _issuetype;
    }

    /**
     * IssueType: {VARCHAR(100)} <br />
     * @param issuetype The value of the column 'IssueType'. (Nullable)
     */
    public void setIssuetype(String issuetype) {
        _modifiedProperties.addPropertyName("issuetype");
        this._issuetype = issuetype;
    }
}
