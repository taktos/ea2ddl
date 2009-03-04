package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_tasks that the type is TABLE. <br />
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
public abstract class BsTTasks implements Entity, Serializable {

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
    /** TaskID: {UQ : NotNull : COUNTER} */
    protected java.lang.Integer _taskid;

    /** Name: {VARCHAR(255)} */
    protected String _name;

    /** TaskType: {VARCHAR(255)} */
    protected String _tasktype;

    /** NOTES: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** Priority: {VARCHAR(255)} */
    protected String _priority;

    /** Status: {VARCHAR(255)} */
    protected String _status;

    /** Owner: {VARCHAR(255)} */
    protected String _owner;

    /** StartDate: {DATETIME} */
    protected java.sql.Timestamp _startdate;

    /** EndDate: {DATETIME} */
    protected java.sql.Timestamp _enddate;

    /** Phase: {VARCHAR(50)} */
    protected String _phase;

    /** History: {LONGCHAR(2147483647)} */
    protected String _history;

    /** Percent: {INTEGER} */
    protected java.lang.Integer _percent;

    /** TotalTime: {INTEGER} */
    protected java.lang.Integer _totaltime;

    /** ActualTime: {INTEGER} */
    protected java.lang.Integer _actualtime;

    /** AssignedTo: {VARCHAR(100)} */
    protected String _assignedto;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_tasks";
    }

    public String getTablePropertyName() { // as JavaBeansRule
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
    /**
     * TaskID: {UQ : NotNull : COUNTER} <br />
     * @return The value of the column 'TaskID'. (Nullable)
     */
    public java.lang.Integer getTaskid() {
        return _taskid;
    }

    /**
     * TaskID: {UQ : NotNull : COUNTER} <br />
     * @param taskid The value of the column 'TaskID'. (Nullable)
     */
    public void setTaskid(java.lang.Integer taskid) {
        _modifiedProperties.addPropertyName("taskid");
        this._taskid = taskid;
    }

    /**
     * Name: {VARCHAR(255)} <br />
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Name: {VARCHAR(255)} <br />
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /**
     * TaskType: {VARCHAR(255)} <br />
     * @return The value of the column 'TaskType'. (Nullable)
     */
    public String getTasktype() {
        return _tasktype;
    }

    /**
     * TaskType: {VARCHAR(255)} <br />
     * @param tasktype The value of the column 'TaskType'. (Nullable)
     */
    public void setTasktype(String tasktype) {
        _modifiedProperties.addPropertyName("tasktype");
        this._tasktype = tasktype;
    }

    /**
     * NOTES: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'NOTES'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * NOTES: {LONGCHAR(2147483647)} <br />
     * @param notes The value of the column 'NOTES'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

    /**
     * Priority: {VARCHAR(255)} <br />
     * @return The value of the column 'Priority'. (Nullable)
     */
    public String getPriority() {
        return _priority;
    }

    /**
     * Priority: {VARCHAR(255)} <br />
     * @param priority The value of the column 'Priority'. (Nullable)
     */
    public void setPriority(String priority) {
        _modifiedProperties.addPropertyName("priority");
        this._priority = priority;
    }

    /**
     * Status: {VARCHAR(255)} <br />
     * @return The value of the column 'Status'. (Nullable)
     */
    public String getStatus() {
        return _status;
    }

    /**
     * Status: {VARCHAR(255)} <br />
     * @param status The value of the column 'Status'. (Nullable)
     */
    public void setStatus(String status) {
        _modifiedProperties.addPropertyName("status");
        this._status = status;
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
     * StartDate: {DATETIME} <br />
     * @return The value of the column 'StartDate'. (Nullable)
     */
    public java.sql.Timestamp getStartdate() {
        return _startdate;
    }

    /**
     * StartDate: {DATETIME} <br />
     * @param startdate The value of the column 'StartDate'. (Nullable)
     */
    public void setStartdate(java.sql.Timestamp startdate) {
        _modifiedProperties.addPropertyName("startdate");
        this._startdate = startdate;
    }

    /**
     * EndDate: {DATETIME} <br />
     * @return The value of the column 'EndDate'. (Nullable)
     */
    public java.sql.Timestamp getEnddate() {
        return _enddate;
    }

    /**
     * EndDate: {DATETIME} <br />
     * @param enddate The value of the column 'EndDate'. (Nullable)
     */
    public void setEnddate(java.sql.Timestamp enddate) {
        _modifiedProperties.addPropertyName("enddate");
        this._enddate = enddate;
    }

    /**
     * Phase: {VARCHAR(50)} <br />
     * @return The value of the column 'Phase'. (Nullable)
     */
    public String getPhase() {
        return _phase;
    }

    /**
     * Phase: {VARCHAR(50)} <br />
     * @param phase The value of the column 'Phase'. (Nullable)
     */
    public void setPhase(String phase) {
        _modifiedProperties.addPropertyName("phase");
        this._phase = phase;
    }

    /**
     * History: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'History'. (Nullable)
     */
    public String getHistory() {
        return _history;
    }

    /**
     * History: {LONGCHAR(2147483647)} <br />
     * @param history The value of the column 'History'. (Nullable)
     */
    public void setHistory(String history) {
        _modifiedProperties.addPropertyName("history");
        this._history = history;
    }

    /**
     * Percent: {INTEGER} <br />
     * @return The value of the column 'Percent'. (Nullable)
     */
    public java.lang.Integer getPercent() {
        return _percent;
    }

    /**
     * Percent: {INTEGER} <br />
     * @param percent The value of the column 'Percent'. (Nullable)
     */
    public void setPercent(java.lang.Integer percent) {
        _modifiedProperties.addPropertyName("percent");
        this._percent = percent;
    }

    /**
     * TotalTime: {INTEGER} <br />
     * @return The value of the column 'TotalTime'. (Nullable)
     */
    public java.lang.Integer getTotaltime() {
        return _totaltime;
    }

    /**
     * TotalTime: {INTEGER} <br />
     * @param totaltime The value of the column 'TotalTime'. (Nullable)
     */
    public void setTotaltime(java.lang.Integer totaltime) {
        _modifiedProperties.addPropertyName("totaltime");
        this._totaltime = totaltime;
    }

    /**
     * ActualTime: {INTEGER} <br />
     * @return The value of the column 'ActualTime'. (Nullable)
     */
    public java.lang.Integer getActualtime() {
        return _actualtime;
    }

    /**
     * ActualTime: {INTEGER} <br />
     * @param actualtime The value of the column 'ActualTime'. (Nullable)
     */
    public void setActualtime(java.lang.Integer actualtime) {
        _modifiedProperties.addPropertyName("actualtime");
        this._actualtime = actualtime;
    }

    /**
     * AssignedTo: {VARCHAR(100)} <br />
     * @return The value of the column 'AssignedTo'. (Nullable)
     */
    public String getAssignedto() {
        return _assignedto;
    }

    /**
     * AssignedTo: {VARCHAR(100)} <br />
     * @param assignedto The value of the column 'AssignedTo'. (Nullable)
     */
    public void setAssignedto(String assignedto) {
        _modifiedProperties.addPropertyName("assignedto");
        this._assignedto = assignedto;
    }
}
