package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_objecttests that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_ID, Test, TestClass, TestType, Notes, InputData, AcceptanceCriteria, Status, DateRun, Results, RunBy, CheckBy
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
public abstract class BsTObjecttests implements Entity, Serializable {

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

    /** Test: {UQ : VARCHAR(255)} */
    protected String _test;

    /** TestClass: {UQ : INTEGER} */
    protected java.lang.Integer _testclass;

    /** TestType: {VARCHAR(50)} */
    protected String _testtype;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** InputData: {LONGCHAR(2147483647)} */
    protected String _inputdata;

    /** AcceptanceCriteria: {LONGCHAR(2147483647)} */
    protected String _acceptancecriteria;

    /** Status: {VARCHAR(32)} */
    protected String _status;

    /** DateRun: {DATETIME} */
    protected java.sql.Timestamp _daterun;

    /** Results: {LONGCHAR(2147483647)} */
    protected String _results;

    /** RunBy: {VARCHAR(255)} */
    protected String _runby;

    /** CheckBy: {VARCHAR(255)} */
    protected String _checkby;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objecttests";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TObjecttests";
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
        if (other == null || !(other instanceof BsTObjecttests)) { return false; }
        final BsTObjecttests otherEntity = (BsTObjecttests)other;
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getTest(), otherEntity.getTest())) { return false; }
        if (!helpComparingValue(getTestclass(), otherEntity.getTestclass())) { return false; }
        if (!helpComparingValue(getTesttype(), otherEntity.getTesttype())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getInputdata(), otherEntity.getInputdata())) { return false; }
        if (!helpComparingValue(getAcceptancecriteria(), otherEntity.getAcceptancecriteria())) { return false; }
        if (!helpComparingValue(getStatus(), otherEntity.getStatus())) { return false; }
        if (!helpComparingValue(getDaterun(), otherEntity.getDaterun())) { return false; }
        if (!helpComparingValue(getResults(), otherEntity.getResults())) { return false; }
        if (!helpComparingValue(getRunby(), otherEntity.getRunby())) { return false; }
        if (!helpComparingValue(getCheckby(), otherEntity.getCheckby())) { return false; }
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
        if (this.getTest() != null) { result = result + this.getTest().hashCode(); }
        if (this.getTestclass() != null) { result = result + this.getTestclass().hashCode(); }
        if (this.getTesttype() != null) { result = result + this.getTesttype().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getInputdata() != null) { result = result + this.getInputdata().hashCode(); }
        if (this.getAcceptancecriteria() != null) { result = result + this.getAcceptancecriteria().hashCode(); }
        if (this.getStatus() != null) { result = result + this.getStatus().hashCode(); }
        if (this.getDaterun() != null) { result = result + this.getDaterun().hashCode(); }
        if (this.getResults() != null) { result = result + this.getResults().hashCode(); }
        if (this.getRunby() != null) { result = result + this.getRunby().hashCode(); }
        if (this.getCheckby() != null) { result = result + this.getCheckby().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getTest());
        sb.append(delimiter).append(getTestclass());
        sb.append(delimiter).append(getTesttype());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getInputdata());
        sb.append(delimiter).append(getAcceptancecriteria());
        sb.append(delimiter).append(getStatus());
        sb.append(delimiter).append(getDaterun());
        sb.append(delimiter).append(getResults());
        sb.append(delimiter).append(getRunby());
        sb.append(delimiter).append(getCheckby());
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
     * Test: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'Test'. (Nullable)
     */
    public String getTest() {
        return _test;
    }

    /**
     * Test: {UQ : VARCHAR(255)} <br />
     * @param test The value of the column 'Test'. (Nullable)
     */
    public void setTest(String test) {
        _modifiedProperties.addPropertyName("test");
        this._test = test;
    }

    /**
     * TestClass: {UQ : INTEGER} <br />
     * @return The value of the column 'TestClass'. (Nullable)
     */
    public java.lang.Integer getTestclass() {
        return _testclass;
    }

    /**
     * TestClass: {UQ : INTEGER} <br />
     * @param testclass The value of the column 'TestClass'. (Nullable)
     */
    public void setTestclass(java.lang.Integer testclass) {
        _modifiedProperties.addPropertyName("testclass");
        this._testclass = testclass;
    }

    /**
     * TestType: {VARCHAR(50)} <br />
     * @return The value of the column 'TestType'. (Nullable)
     */
    public String getTesttype() {
        return _testtype;
    }

    /**
     * TestType: {VARCHAR(50)} <br />
     * @param testtype The value of the column 'TestType'. (Nullable)
     */
    public void setTesttype(String testtype) {
        _modifiedProperties.addPropertyName("testtype");
        this._testtype = testtype;
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
     * InputData: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'InputData'. (Nullable)
     */
    public String getInputdata() {
        return _inputdata;
    }

    /**
     * InputData: {LONGCHAR(2147483647)} <br />
     * @param inputdata The value of the column 'InputData'. (Nullable)
     */
    public void setInputdata(String inputdata) {
        _modifiedProperties.addPropertyName("inputdata");
        this._inputdata = inputdata;
    }

    /**
     * AcceptanceCriteria: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'AcceptanceCriteria'. (Nullable)
     */
    public String getAcceptancecriteria() {
        return _acceptancecriteria;
    }

    /**
     * AcceptanceCriteria: {LONGCHAR(2147483647)} <br />
     * @param acceptancecriteria The value of the column 'AcceptanceCriteria'. (Nullable)
     */
    public void setAcceptancecriteria(String acceptancecriteria) {
        _modifiedProperties.addPropertyName("acceptancecriteria");
        this._acceptancecriteria = acceptancecriteria;
    }

    /**
     * Status: {VARCHAR(32)} <br />
     * @return The value of the column 'Status'. (Nullable)
     */
    public String getStatus() {
        return _status;
    }

    /**
     * Status: {VARCHAR(32)} <br />
     * @param status The value of the column 'Status'. (Nullable)
     */
    public void setStatus(String status) {
        _modifiedProperties.addPropertyName("status");
        this._status = status;
    }

    /**
     * DateRun: {DATETIME} <br />
     * @return The value of the column 'DateRun'. (Nullable)
     */
    public java.sql.Timestamp getDaterun() {
        return _daterun;
    }

    /**
     * DateRun: {DATETIME} <br />
     * @param daterun The value of the column 'DateRun'. (Nullable)
     */
    public void setDaterun(java.sql.Timestamp daterun) {
        _modifiedProperties.addPropertyName("daterun");
        this._daterun = daterun;
    }

    /**
     * Results: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Results'. (Nullable)
     */
    public String getResults() {
        return _results;
    }

    /**
     * Results: {LONGCHAR(2147483647)} <br />
     * @param results The value of the column 'Results'. (Nullable)
     */
    public void setResults(String results) {
        _modifiedProperties.addPropertyName("results");
        this._results = results;
    }

    /**
     * RunBy: {VARCHAR(255)} <br />
     * @return The value of the column 'RunBy'. (Nullable)
     */
    public String getRunby() {
        return _runby;
    }

    /**
     * RunBy: {VARCHAR(255)} <br />
     * @param runby The value of the column 'RunBy'. (Nullable)
     */
    public void setRunby(String runby) {
        _modifiedProperties.addPropertyName("runby");
        this._runby = runby;
    }

    /**
     * CheckBy: {VARCHAR(255)} <br />
     * @return The value of the column 'CheckBy'. (Nullable)
     */
    public String getCheckby() {
        return _checkby;
    }

    /**
     * CheckBy: {VARCHAR(255)} <br />
     * @param checkby The value of the column 'CheckBy'. (Nullable)
     */
    public void setCheckby(String checkby) {
        _modifiedProperties.addPropertyName("checkby");
        this._checkby = checkby;
    }
}
