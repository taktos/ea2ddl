package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_objecttests(TABLE).
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
@SuppressWarnings("unchecked")
public abstract class BsTObjecttests implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_objecttests. */
    public static final String TABLE = "t_objecttests";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Object_ID'. {UQ : INTEGER} */
    protected java.lang.Integer _objectId;

    /** The attribute of the column 'Test'. {UQ : VARCHAR(255)} */
    protected String _test;

    /** The attribute of the column 'TestClass'. {UQ : INTEGER} */
    protected java.lang.Integer _testclass;

    /** The attribute of the column 'TestType'. {VARCHAR(50)} */
    protected String _testtype;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'InputData'. {LONGCHAR(2147483647)} */
    protected String _inputdata;

    /** The attribute of the column 'AcceptanceCriteria'. {LONGCHAR(2147483647)} */
    protected String _acceptancecriteria;

    /** The attribute of the column 'Status'. {VARCHAR(32)} */
    protected String _status;

    /** The attribute of the column 'DateRun'. {DATETIME} */
    protected java.sql.Timestamp _daterun;

    /** The attribute of the column 'Results'. {LONGCHAR(2147483647)} */
    protected String _results;

    /** The attribute of the column 'RunBy'. {VARCHAR(255)} */
    protected String _runby;

    /** The attribute of the column 'CheckBy'. {VARCHAR(255)} */
    protected String _checkby;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjecttests() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objecttests";
    }

    public String getTablePropertyName() {// as JavaBeansRule
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

    /** The column annotation for S2Dao. {UQ : INTEGER} */
    public static final String objectId_COLUMN = "Object_ID";

    /**
     * Get the value of the column 'Object_ID'. <br />
     * {UQ : INTEGER}
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Set the value of the column 'Object_ID'. <br />
     * {UQ : INTEGER}
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /** The column annotation for S2Dao. {UQ : VARCHAR(255)} */
    public static final String test_COLUMN = "Test";

    /**
     * Get the value of the column 'Test'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'Test'. (Nullable)
     */
    public String getTest() {
        return _test;
    }

    /**
     * Set the value of the column 'Test'. <br />
     * {UQ : VARCHAR(255)}
     * @param test The value of the column 'Test'. (Nullable)
     */
    public void setTest(String test) {
        _modifiedProperties.addPropertyName("test");
        this._test = test;
    }

    /** The column annotation for S2Dao. {UQ : INTEGER} */
    public static final String testclass_COLUMN = "TestClass";

    /**
     * Get the value of the column 'TestClass'. <br />
     * {UQ : INTEGER}
     * @return The value of the column 'TestClass'. (Nullable)
     */
    public java.lang.Integer getTestclass() {
        return _testclass;
    }

    /**
     * Set the value of the column 'TestClass'. <br />
     * {UQ : INTEGER}
     * @param testclass The value of the column 'TestClass'. (Nullable)
     */
    public void setTestclass(java.lang.Integer testclass) {
        _modifiedProperties.addPropertyName("testclass");
        this._testclass = testclass;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String testtype_COLUMN = "TestType";

    /**
     * Get the value of the column 'TestType'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'TestType'. (Nullable)
     */
    public String getTesttype() {
        return _testtype;
    }

    /**
     * Set the value of the column 'TestType'. <br />
     * {VARCHAR(50)}
     * @param testtype The value of the column 'TestType'. (Nullable)
     */
    public void setTesttype(String testtype) {
        _modifiedProperties.addPropertyName("testtype");
        this._testtype = testtype;
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
    public static final String inputdata_COLUMN = "InputData";

    /**
     * Get the value of the column 'InputData'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'InputData'. (Nullable)
     */
    public String getInputdata() {
        return _inputdata;
    }

    /**
     * Set the value of the column 'InputData'. <br />
     * {LONGCHAR(2147483647)}
     * @param inputdata The value of the column 'InputData'. (Nullable)
     */
    public void setInputdata(String inputdata) {
        _modifiedProperties.addPropertyName("inputdata");
        this._inputdata = inputdata;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String acceptancecriteria_COLUMN = "AcceptanceCriteria";

    /**
     * Get the value of the column 'AcceptanceCriteria'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'AcceptanceCriteria'. (Nullable)
     */
    public String getAcceptancecriteria() {
        return _acceptancecriteria;
    }

    /**
     * Set the value of the column 'AcceptanceCriteria'. <br />
     * {LONGCHAR(2147483647)}
     * @param acceptancecriteria The value of the column 'AcceptanceCriteria'. (Nullable)
     */
    public void setAcceptancecriteria(String acceptancecriteria) {
        _modifiedProperties.addPropertyName("acceptancecriteria");
        this._acceptancecriteria = acceptancecriteria;
    }

    /** The column annotation for S2Dao. {VARCHAR(32)} */
    public static final String status_COLUMN = "Status";

    /**
     * Get the value of the column 'Status'. <br />
     * {VARCHAR(32)}
     * @return The value of the column 'Status'. (Nullable)
     */
    public String getStatus() {
        return _status;
    }

    /**
     * Set the value of the column 'Status'. <br />
     * {VARCHAR(32)}
     * @param status The value of the column 'Status'. (Nullable)
     */
    public void setStatus(String status) {
        _modifiedProperties.addPropertyName("status");
        this._status = status;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String daterun_COLUMN = "DateRun";

    /**
     * Get the value of the column 'DateRun'. <br />
     * {DATETIME}
     * @return The value of the column 'DateRun'. (Nullable)
     */
    public java.sql.Timestamp getDaterun() {
        return _daterun;
    }

    /**
     * Set the value of the column 'DateRun'. <br />
     * {DATETIME}
     * @param daterun The value of the column 'DateRun'. (Nullable)
     */
    public void setDaterun(java.sql.Timestamp daterun) {
        _modifiedProperties.addPropertyName("daterun");
        this._daterun = daterun;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String results_COLUMN = "Results";

    /**
     * Get the value of the column 'Results'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Results'. (Nullable)
     */
    public String getResults() {
        return _results;
    }

    /**
     * Set the value of the column 'Results'. <br />
     * {LONGCHAR(2147483647)}
     * @param results The value of the column 'Results'. (Nullable)
     */
    public void setResults(String results) {
        _modifiedProperties.addPropertyName("results");
        this._results = results;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String runby_COLUMN = "RunBy";

    /**
     * Get the value of the column 'RunBy'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'RunBy'. (Nullable)
     */
    public String getRunby() {
        return _runby;
    }

    /**
     * Set the value of the column 'RunBy'. <br />
     * {VARCHAR(255)}
     * @param runby The value of the column 'RunBy'. (Nullable)
     */
    public void setRunby(String runby) {
        _modifiedProperties.addPropertyName("runby");
        this._runby = runby;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String checkby_COLUMN = "CheckBy";

    /**
     * Get the value of the column 'CheckBy'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'CheckBy'. (Nullable)
     */
    public String getCheckby() {
        return _checkby;
    }

    /**
     * Set the value of the column 'CheckBy'. <br />
     * {VARCHAR(255)}
     * @param checkby The value of the column 'CheckBy'. (Nullable)
     */
    public void setCheckby(String checkby) {
        _modifiedProperties.addPropertyName("checkby");
        this._checkby = checkby;
    }

}
