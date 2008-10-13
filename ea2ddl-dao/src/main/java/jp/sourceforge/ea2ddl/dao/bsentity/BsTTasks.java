package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_tasks(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     TaskID, Name, TaskType, NOTES, Priority, Status, Owner, StartDate, EndDate, Phase, History, Percent, TotalTime, ActualTime, AssignedTo
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
public abstract class BsTTasks implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_tasks. */
    public static final String TABLE = "t_tasks";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'TaskID'. {UQ : COUNTER : NotNull} */
    protected java.lang.Integer _taskid;

    /** The attribute of the column 'Name'. {VARCHAR(255)} */
    protected String _name;

    /** The attribute of the column 'TaskType'. {VARCHAR(255)} */
    protected String _tasktype;

    /** The attribute of the column 'NOTES'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'Priority'. {VARCHAR(255)} */
    protected String _priority;

    /** The attribute of the column 'Status'. {VARCHAR(255)} */
    protected String _status;

    /** The attribute of the column 'Owner'. {VARCHAR(255)} */
    protected String _owner;

    /** The attribute of the column 'StartDate'. {DATETIME} */
    protected java.sql.Timestamp _startdate;

    /** The attribute of the column 'EndDate'. {DATETIME} */
    protected java.sql.Timestamp _enddate;

    /** The attribute of the column 'Phase'. {VARCHAR(50)} */
    protected String _phase;

    /** The attribute of the column 'History'. {LONGCHAR(2147483647)} */
    protected String _history;

    /** The attribute of the column 'Percent'. {INTEGER} */
    protected java.lang.Integer _percent;

    /** The attribute of the column 'TotalTime'. {INTEGER} */
    protected java.lang.Integer _totaltime;

    /** The attribute of the column 'ActualTime'. {INTEGER} */
    protected java.lang.Integer _actualtime;

    /** The attribute of the column 'AssignedTo'. {VARCHAR(100)} */
    protected String _assignedto;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTasks() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_tasks";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TTasks";
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
        if (other == null || !(other instanceof BsTTasks)) { return false; }
        final BsTTasks otherEntity = (BsTTasks)other;
        if (!helpComparingValue(getTaskid(), otherEntity.getTaskid())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getTasktype(), otherEntity.getTasktype())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getPriority(), otherEntity.getPriority())) { return false; }
        if (!helpComparingValue(getStatus(), otherEntity.getStatus())) { return false; }
        if (!helpComparingValue(getOwner(), otherEntity.getOwner())) { return false; }
        if (!helpComparingValue(getStartdate(), otherEntity.getStartdate())) { return false; }
        if (!helpComparingValue(getEnddate(), otherEntity.getEnddate())) { return false; }
        if (!helpComparingValue(getPhase(), otherEntity.getPhase())) { return false; }
        if (!helpComparingValue(getHistory(), otherEntity.getHistory())) { return false; }
        if (!helpComparingValue(getPercent(), otherEntity.getPercent())) { return false; }
        if (!helpComparingValue(getTotaltime(), otherEntity.getTotaltime())) { return false; }
        if (!helpComparingValue(getActualtime(), otherEntity.getActualtime())) { return false; }
        if (!helpComparingValue(getAssignedto(), otherEntity.getAssignedto())) { return false; }
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
        if (this.getTaskid() != null) { result = result + this.getTaskid().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getTasktype() != null) { result = result + this.getTasktype().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getPriority() != null) { result = result + this.getPriority().hashCode(); }
        if (this.getStatus() != null) { result = result + this.getStatus().hashCode(); }
        if (this.getOwner() != null) { result = result + this.getOwner().hashCode(); }
        if (this.getStartdate() != null) { result = result + this.getStartdate().hashCode(); }
        if (this.getEnddate() != null) { result = result + this.getEnddate().hashCode(); }
        if (this.getPhase() != null) { result = result + this.getPhase().hashCode(); }
        if (this.getHistory() != null) { result = result + this.getHistory().hashCode(); }
        if (this.getPercent() != null) { result = result + this.getPercent().hashCode(); }
        if (this.getTotaltime() != null) { result = result + this.getTotaltime().hashCode(); }
        if (this.getActualtime() != null) { result = result + this.getActualtime().hashCode(); }
        if (this.getAssignedto() != null) { result = result + this.getAssignedto().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getTaskid());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getTasktype());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getPriority());
        sb.append(delimiter).append(getStatus());
        sb.append(delimiter).append(getOwner());
        sb.append(delimiter).append(getStartdate());
        sb.append(delimiter).append(getEnddate());
        sb.append(delimiter).append(getPhase());
        sb.append(delimiter).append(getHistory());
        sb.append(delimiter).append(getPercent());
        sb.append(delimiter).append(getTotaltime());
        sb.append(delimiter).append(getActualtime());
        sb.append(delimiter).append(getAssignedto());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : COUNTER : NotNull} */
    public static final String taskid_COLUMN = "TaskID";

    /**
     * Get the value of the column 'TaskID'. <br />
     * {UQ : COUNTER : NotNull}
     * @return The value of the column 'TaskID'. (Nullable)
     */
    public java.lang.Integer getTaskid() {
        return _taskid;
    }

    /**
     * Set the value of the column 'TaskID'. <br />
     * {UQ : COUNTER : NotNull}
     * @param taskid The value of the column 'TaskID'. (Nullable)
     */
    public void setTaskid(java.lang.Integer taskid) {
        _modifiedProperties.addPropertyName("taskid");
        this._taskid = taskid;
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
    public static final String tasktype_COLUMN = "TaskType";

    /**
     * Get the value of the column 'TaskType'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'TaskType'. (Nullable)
     */
    public String getTasktype() {
        return _tasktype;
    }

    /**
     * Set the value of the column 'TaskType'. <br />
     * {VARCHAR(255)}
     * @param tasktype The value of the column 'TaskType'. (Nullable)
     */
    public void setTasktype(String tasktype) {
        _modifiedProperties.addPropertyName("tasktype");
        this._tasktype = tasktype;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String notes_COLUMN = "NOTES";

    /**
     * Get the value of the column 'NOTES'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'NOTES'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * Set the value of the column 'NOTES'. <br />
     * {LONGCHAR(2147483647)}
     * @param notes The value of the column 'NOTES'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String priority_COLUMN = "Priority";

    /**
     * Get the value of the column 'Priority'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Priority'. (Nullable)
     */
    public String getPriority() {
        return _priority;
    }

    /**
     * Set the value of the column 'Priority'. <br />
     * {VARCHAR(255)}
     * @param priority The value of the column 'Priority'. (Nullable)
     */
    public void setPriority(String priority) {
        _modifiedProperties.addPropertyName("priority");
        this._priority = priority;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String status_COLUMN = "Status";

    /**
     * Get the value of the column 'Status'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Status'. (Nullable)
     */
    public String getStatus() {
        return _status;
    }

    /**
     * Set the value of the column 'Status'. <br />
     * {VARCHAR(255)}
     * @param status The value of the column 'Status'. (Nullable)
     */
    public void setStatus(String status) {
        _modifiedProperties.addPropertyName("status");
        this._status = status;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String owner_COLUMN = "Owner";

    /**
     * Get the value of the column 'Owner'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Owner'. (Nullable)
     */
    public String getOwner() {
        return _owner;
    }

    /**
     * Set the value of the column 'Owner'. <br />
     * {VARCHAR(255)}
     * @param owner The value of the column 'Owner'. (Nullable)
     */
    public void setOwner(String owner) {
        _modifiedProperties.addPropertyName("owner");
        this._owner = owner;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String startdate_COLUMN = "StartDate";

    /**
     * Get the value of the column 'StartDate'. <br />
     * {DATETIME}
     * @return The value of the column 'StartDate'. (Nullable)
     */
    public java.sql.Timestamp getStartdate() {
        return _startdate;
    }

    /**
     * Set the value of the column 'StartDate'. <br />
     * {DATETIME}
     * @param startdate The value of the column 'StartDate'. (Nullable)
     */
    public void setStartdate(java.sql.Timestamp startdate) {
        _modifiedProperties.addPropertyName("startdate");
        this._startdate = startdate;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String enddate_COLUMN = "EndDate";

    /**
     * Get the value of the column 'EndDate'. <br />
     * {DATETIME}
     * @return The value of the column 'EndDate'. (Nullable)
     */
    public java.sql.Timestamp getEnddate() {
        return _enddate;
    }

    /**
     * Set the value of the column 'EndDate'. <br />
     * {DATETIME}
     * @param enddate The value of the column 'EndDate'. (Nullable)
     */
    public void setEnddate(java.sql.Timestamp enddate) {
        _modifiedProperties.addPropertyName("enddate");
        this._enddate = enddate;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String phase_COLUMN = "Phase";

    /**
     * Get the value of the column 'Phase'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Phase'. (Nullable)
     */
    public String getPhase() {
        return _phase;
    }

    /**
     * Set the value of the column 'Phase'. <br />
     * {VARCHAR(50)}
     * @param phase The value of the column 'Phase'. (Nullable)
     */
    public void setPhase(String phase) {
        _modifiedProperties.addPropertyName("phase");
        this._phase = phase;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String history_COLUMN = "History";

    /**
     * Get the value of the column 'History'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'History'. (Nullable)
     */
    public String getHistory() {
        return _history;
    }

    /**
     * Set the value of the column 'History'. <br />
     * {LONGCHAR(2147483647)}
     * @param history The value of the column 'History'. (Nullable)
     */
    public void setHistory(String history) {
        _modifiedProperties.addPropertyName("history");
        this._history = history;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String percent_COLUMN = "Percent";

    /**
     * Get the value of the column 'Percent'. <br />
     * {INTEGER}
     * @return The value of the column 'Percent'. (Nullable)
     */
    public java.lang.Integer getPercent() {
        return _percent;
    }

    /**
     * Set the value of the column 'Percent'. <br />
     * {INTEGER}
     * @param percent The value of the column 'Percent'. (Nullable)
     */
    public void setPercent(java.lang.Integer percent) {
        _modifiedProperties.addPropertyName("percent");
        this._percent = percent;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String totaltime_COLUMN = "TotalTime";

    /**
     * Get the value of the column 'TotalTime'. <br />
     * {INTEGER}
     * @return The value of the column 'TotalTime'. (Nullable)
     */
    public java.lang.Integer getTotaltime() {
        return _totaltime;
    }

    /**
     * Set the value of the column 'TotalTime'. <br />
     * {INTEGER}
     * @param totaltime The value of the column 'TotalTime'. (Nullable)
     */
    public void setTotaltime(java.lang.Integer totaltime) {
        _modifiedProperties.addPropertyName("totaltime");
        this._totaltime = totaltime;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String actualtime_COLUMN = "ActualTime";

    /**
     * Get the value of the column 'ActualTime'. <br />
     * {INTEGER}
     * @return The value of the column 'ActualTime'. (Nullable)
     */
    public java.lang.Integer getActualtime() {
        return _actualtime;
    }

    /**
     * Set the value of the column 'ActualTime'. <br />
     * {INTEGER}
     * @param actualtime The value of the column 'ActualTime'. (Nullable)
     */
    public void setActualtime(java.lang.Integer actualtime) {
        _modifiedProperties.addPropertyName("actualtime");
        this._actualtime = actualtime;
    }

    /** The column annotation for S2Dao. {VARCHAR(100)} */
    public static final String assignedto_COLUMN = "AssignedTo";

    /**
     * Get the value of the column 'AssignedTo'. <br />
     * {VARCHAR(100)}
     * @return The value of the column 'AssignedTo'. (Nullable)
     */
    public String getAssignedto() {
        return _assignedto;
    }

    /**
     * Set the value of the column 'AssignedTo'. <br />
     * {VARCHAR(100)}
     * @param assignedto The value of the column 'AssignedTo'. (Nullable)
     */
    public void setAssignedto(String assignedto) {
        _modifiedProperties.addPropertyName("assignedto");
        this._assignedto = assignedto;
    }

}
