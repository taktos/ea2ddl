package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_tasks.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTasksCQ extends AbstractBsTTasksCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTasksCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTasksCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_tasks) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TTasksCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TTasksCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_tasks on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TTasksCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TTasksCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _taskid;
    public ConditionValue getTaskid() {
        if (_taskid == null) { _taskid = new ConditionValue(); }
        return _taskid;
    }
    protected ConditionValue getCValueTaskid() { return getTaskid(); }

    public BsTTasksCQ addOrderBy_Taskid_Asc() { regOBA("TaskID"); return this; }
    public BsTTasksCQ addOrderBy_Taskid_Desc() { regOBD("TaskID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    public BsTTasksCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTTasksCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _tasktype;
    public ConditionValue getTasktype() {
        if (_tasktype == null) { _tasktype = new ConditionValue(); }
        return _tasktype;
    }
    protected ConditionValue getCValueTasktype() { return getTasktype(); }

    public BsTTasksCQ addOrderBy_Tasktype_Asc() { regOBA("TaskType"); return this; }
    public BsTTasksCQ addOrderBy_Tasktype_Desc() { regOBD("TaskType"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTTasksCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }
    public BsTTasksCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

    protected ConditionValue _priority;
    public ConditionValue getPriority() {
        if (_priority == null) { _priority = new ConditionValue(); }
        return _priority;
    }
    protected ConditionValue getCValuePriority() { return getPriority(); }

    public BsTTasksCQ addOrderBy_Priority_Asc() { regOBA("Priority"); return this; }
    public BsTTasksCQ addOrderBy_Priority_Desc() { regOBD("Priority"); return this; }

    protected ConditionValue _status;
    public ConditionValue getStatus() {
        if (_status == null) { _status = new ConditionValue(); }
        return _status;
    }
    protected ConditionValue getCValueStatus() { return getStatus(); }

    public BsTTasksCQ addOrderBy_Status_Asc() { regOBA("Status"); return this; }
    public BsTTasksCQ addOrderBy_Status_Desc() { regOBD("Status"); return this; }

    protected ConditionValue _owner;
    public ConditionValue getOwner() {
        if (_owner == null) { _owner = new ConditionValue(); }
        return _owner;
    }
    protected ConditionValue getCValueOwner() { return getOwner(); }

    public BsTTasksCQ addOrderBy_Owner_Asc() { regOBA("Owner"); return this; }
    public BsTTasksCQ addOrderBy_Owner_Desc() { regOBD("Owner"); return this; }

    protected ConditionValue _startdate;
    public ConditionValue getStartdate() {
        if (_startdate == null) { _startdate = new ConditionValue(); }
        return _startdate;
    }
    protected ConditionValue getCValueStartdate() { return getStartdate(); }

    public BsTTasksCQ addOrderBy_Startdate_Asc() { regOBA("StartDate"); return this; }
    public BsTTasksCQ addOrderBy_Startdate_Desc() { regOBD("StartDate"); return this; }

    protected ConditionValue _enddate;
    public ConditionValue getEnddate() {
        if (_enddate == null) { _enddate = new ConditionValue(); }
        return _enddate;
    }
    protected ConditionValue getCValueEnddate() { return getEnddate(); }

    public BsTTasksCQ addOrderBy_Enddate_Asc() { regOBA("EndDate"); return this; }
    public BsTTasksCQ addOrderBy_Enddate_Desc() { regOBD("EndDate"); return this; }

    protected ConditionValue _phase;
    public ConditionValue getPhase() {
        if (_phase == null) { _phase = new ConditionValue(); }
        return _phase;
    }
    protected ConditionValue getCValuePhase() { return getPhase(); }

    public BsTTasksCQ addOrderBy_Phase_Asc() { regOBA("Phase"); return this; }
    public BsTTasksCQ addOrderBy_Phase_Desc() { regOBD("Phase"); return this; }

    protected ConditionValue _history;
    public ConditionValue getHistory() {
        if (_history == null) { _history = new ConditionValue(); }
        return _history;
    }
    protected ConditionValue getCValueHistory() { return getHistory(); }

    public BsTTasksCQ addOrderBy_History_Asc() { regOBA("History"); return this; }
    public BsTTasksCQ addOrderBy_History_Desc() { regOBD("History"); return this; }

    protected ConditionValue _percent;
    public ConditionValue getPercent() {
        if (_percent == null) { _percent = new ConditionValue(); }
        return _percent;
    }
    protected ConditionValue getCValuePercent() { return getPercent(); }

    public BsTTasksCQ addOrderBy_Percent_Asc() { regOBA("Percent"); return this; }
    public BsTTasksCQ addOrderBy_Percent_Desc() { regOBD("Percent"); return this; }

    protected ConditionValue _totaltime;
    public ConditionValue getTotaltime() {
        if (_totaltime == null) { _totaltime = new ConditionValue(); }
        return _totaltime;
    }
    protected ConditionValue getCValueTotaltime() { return getTotaltime(); }

    public BsTTasksCQ addOrderBy_Totaltime_Asc() { regOBA("TotalTime"); return this; }
    public BsTTasksCQ addOrderBy_Totaltime_Desc() { regOBD("TotalTime"); return this; }

    protected ConditionValue _actualtime;
    public ConditionValue getActualtime() {
        if (_actualtime == null) { _actualtime = new ConditionValue(); }
        return _actualtime;
    }
    protected ConditionValue getCValueActualtime() { return getActualtime(); }

    public BsTTasksCQ addOrderBy_Actualtime_Asc() { regOBA("ActualTime"); return this; }
    public BsTTasksCQ addOrderBy_Actualtime_Desc() { regOBD("ActualTime"); return this; }

    protected ConditionValue _assignedto;
    public ConditionValue getAssignedto() {
        if (_assignedto == null) { _assignedto = new ConditionValue(); }
        return _assignedto;
    }
    protected ConditionValue getCValueAssignedto() { return getAssignedto(); }

    public BsTTasksCQ addOrderBy_Assignedto_Asc() { regOBA("AssignedTo"); return this; }
    public BsTTasksCQ addOrderBy_Assignedto_Desc() { regOBD("AssignedTo"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTTasksCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTTasksCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TTasksCB.class.getName(); }
    String xCQ() { return TTasksCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
