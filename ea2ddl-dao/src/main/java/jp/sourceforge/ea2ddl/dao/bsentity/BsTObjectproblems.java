package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_objectproblems that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_ID, Problem, ProblemType, DateReported, Status, ProblemNotes, ReportedBy, ResolvedBy, DateResolved, Version, ResolverNotes, Priority, Severity
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
public abstract class BsTObjectproblems implements Entity, Serializable {

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
    /** Object_ID: {UQ : INTEGER} */
    protected java.lang.Integer _objectId;

    /** Problem: {UQ : VARCHAR(255)} */
    protected String _problem;

    /** ProblemType: {UQ : VARCHAR(255)} */
    protected String _problemtype;

    /** DateReported: {DATETIME} */
    protected java.sql.Timestamp _datereported;

    /** Status: {VARCHAR(50)} */
    protected String _status;

    /** ProblemNotes: {LONGCHAR(2147483647)} */
    protected String _problemnotes;

    /** ReportedBy: {VARCHAR(255)} */
    protected String _reportedby;

    /** ResolvedBy: {VARCHAR(255)} */
    protected String _resolvedby;

    /** DateResolved: {DATETIME} */
    protected java.sql.Timestamp _dateresolved;

    /** Version: {VARCHAR(50)} */
    protected String _version;

    /** ResolverNotes: {LONGCHAR(2147483647)} */
    protected String _resolvernotes;

    /** Priority: {VARCHAR(50)} */
    protected String _priority;

    /** Severity: {VARCHAR(50)} */
    protected String _severity;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectproblems";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TObjectproblems";
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
        if (other == null || !(other instanceof BsTObjectproblems)) { return false; }
        final BsTObjectproblems otherEntity = (BsTObjectproblems)other;
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getProblem(), otherEntity.getProblem())) { return false; }
        if (!helpComparingValue(getProblemtype(), otherEntity.getProblemtype())) { return false; }
        if (!helpComparingValue(getDatereported(), otherEntity.getDatereported())) { return false; }
        if (!helpComparingValue(getStatus(), otherEntity.getStatus())) { return false; }
        if (!helpComparingValue(getProblemnotes(), otherEntity.getProblemnotes())) { return false; }
        if (!helpComparingValue(getReportedby(), otherEntity.getReportedby())) { return false; }
        if (!helpComparingValue(getResolvedby(), otherEntity.getResolvedby())) { return false; }
        if (!helpComparingValue(getDateresolved(), otherEntity.getDateresolved())) { return false; }
        if (!helpComparingValue(getVersion(), otherEntity.getVersion())) { return false; }
        if (!helpComparingValue(getResolvernotes(), otherEntity.getResolvernotes())) { return false; }
        if (!helpComparingValue(getPriority(), otherEntity.getPriority())) { return false; }
        if (!helpComparingValue(getSeverity(), otherEntity.getSeverity())) { return false; }
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
        if (this.getObjectId() != null) { result = result + this.getObjectId().hashCode(); }
        if (this.getProblem() != null) { result = result + this.getProblem().hashCode(); }
        if (this.getProblemtype() != null) { result = result + this.getProblemtype().hashCode(); }
        if (this.getDatereported() != null) { result = result + this.getDatereported().hashCode(); }
        if (this.getStatus() != null) { result = result + this.getStatus().hashCode(); }
        if (this.getProblemnotes() != null) { result = result + this.getProblemnotes().hashCode(); }
        if (this.getReportedby() != null) { result = result + this.getReportedby().hashCode(); }
        if (this.getResolvedby() != null) { result = result + this.getResolvedby().hashCode(); }
        if (this.getDateresolved() != null) { result = result + this.getDateresolved().hashCode(); }
        if (this.getVersion() != null) { result = result + this.getVersion().hashCode(); }
        if (this.getResolvernotes() != null) { result = result + this.getResolvernotes().hashCode(); }
        if (this.getPriority() != null) { result = result + this.getPriority().hashCode(); }
        if (this.getSeverity() != null) { result = result + this.getSeverity().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getProblem());
        sb.append(delimiter).append(getProblemtype());
        sb.append(delimiter).append(getDatereported());
        sb.append(delimiter).append(getStatus());
        sb.append(delimiter).append(getProblemnotes());
        sb.append(delimiter).append(getReportedby());
        sb.append(delimiter).append(getResolvedby());
        sb.append(delimiter).append(getDateresolved());
        sb.append(delimiter).append(getVersion());
        sb.append(delimiter).append(getResolvernotes());
        sb.append(delimiter).append(getPriority());
        sb.append(delimiter).append(getSeverity());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Object_ID: {UQ : INTEGER} <br />
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Object_ID: {UQ : INTEGER} <br />
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /**
     * Problem: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'Problem'. (Nullable)
     */
    public String getProblem() {
        return _problem;
    }

    /**
     * Problem: {UQ : VARCHAR(255)} <br />
     * @param problem The value of the column 'Problem'. (Nullable)
     */
    public void setProblem(String problem) {
        _modifiedProperties.addPropertyName("problem");
        this._problem = problem;
    }

    /**
     * ProblemType: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'ProblemType'. (Nullable)
     */
    public String getProblemtype() {
        return _problemtype;
    }

    /**
     * ProblemType: {UQ : VARCHAR(255)} <br />
     * @param problemtype The value of the column 'ProblemType'. (Nullable)
     */
    public void setProblemtype(String problemtype) {
        _modifiedProperties.addPropertyName("problemtype");
        this._problemtype = problemtype;
    }

    /**
     * DateReported: {DATETIME} <br />
     * @return The value of the column 'DateReported'. (Nullable)
     */
    public java.sql.Timestamp getDatereported() {
        return _datereported;
    }

    /**
     * DateReported: {DATETIME} <br />
     * @param datereported The value of the column 'DateReported'. (Nullable)
     */
    public void setDatereported(java.sql.Timestamp datereported) {
        _modifiedProperties.addPropertyName("datereported");
        this._datereported = datereported;
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
     * ProblemNotes: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'ProblemNotes'. (Nullable)
     */
    public String getProblemnotes() {
        return _problemnotes;
    }

    /**
     * ProblemNotes: {LONGCHAR(2147483647)} <br />
     * @param problemnotes The value of the column 'ProblemNotes'. (Nullable)
     */
    public void setProblemnotes(String problemnotes) {
        _modifiedProperties.addPropertyName("problemnotes");
        this._problemnotes = problemnotes;
    }

    /**
     * ReportedBy: {VARCHAR(255)} <br />
     * @return The value of the column 'ReportedBy'. (Nullable)
     */
    public String getReportedby() {
        return _reportedby;
    }

    /**
     * ReportedBy: {VARCHAR(255)} <br />
     * @param reportedby The value of the column 'ReportedBy'. (Nullable)
     */
    public void setReportedby(String reportedby) {
        _modifiedProperties.addPropertyName("reportedby");
        this._reportedby = reportedby;
    }

    /**
     * ResolvedBy: {VARCHAR(255)} <br />
     * @return The value of the column 'ResolvedBy'. (Nullable)
     */
    public String getResolvedby() {
        return _resolvedby;
    }

    /**
     * ResolvedBy: {VARCHAR(255)} <br />
     * @param resolvedby The value of the column 'ResolvedBy'. (Nullable)
     */
    public void setResolvedby(String resolvedby) {
        _modifiedProperties.addPropertyName("resolvedby");
        this._resolvedby = resolvedby;
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

    /**
     * ResolverNotes: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'ResolverNotes'. (Nullable)
     */
    public String getResolvernotes() {
        return _resolvernotes;
    }

    /**
     * ResolverNotes: {LONGCHAR(2147483647)} <br />
     * @param resolvernotes The value of the column 'ResolverNotes'. (Nullable)
     */
    public void setResolvernotes(String resolvernotes) {
        _modifiedProperties.addPropertyName("resolvernotes");
        this._resolvernotes = resolvernotes;
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
}
