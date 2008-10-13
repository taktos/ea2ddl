package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_tasks.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTTasksCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTasksCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_tasks";
    }
    
    public String getTableSqlName() {
        return "t_tasks";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : COUNTER : NotNull}
     * @param taskid The value of taskid as equal.
     */
    public void setTaskid_Equal(java.lang.Integer taskid) {
        regTaskid(CK_EQ, taskid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param taskid The value of taskid as notEqual.
     */
    public void setTaskid_NotEqual(java.lang.Integer taskid) {
        regTaskid(CK_NE, taskid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param taskid The value of taskid as greaterThan.
     */
    public void setTaskid_GreaterThan(java.lang.Integer taskid) {
        regTaskid(CK_GT, taskid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param taskid The value of taskid as lessThan.
     */
    public void setTaskid_LessThan(java.lang.Integer taskid) {
        regTaskid(CK_LT, taskid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param taskid The value of taskid as greaterEqual.
     */
    public void setTaskid_GreaterEqual(java.lang.Integer taskid) {
        regTaskid(CK_GE, taskid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param taskid The value of taskid as lessEqual.
     */
    public void setTaskid_LessEqual(java.lang.Integer taskid) {
        regTaskid(CK_LE, taskid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param taskidList The collection of taskid as inScope.
     */
    public void setTaskid_InScope(Collection<java.lang.Integer> taskidList) {
        regTaskid(CK_INS, cTL(taskidList));
    }

    protected void regTaskid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTaskid(), "TaskID", "Taskid", "taskid");
    }
    protected void registerInlineTaskid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTaskid(), "TaskID", "Taskid", "taskid");
    }
    abstract protected ConditionValue getCValueTaskid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param name The value of name as equal.
     */
    public void setName_Equal(String name) {
        regName(CK_EQ, fRES(name));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as notEqual.
     */
    public void setName_NotEqual(String name) {
        regName(CK_NE, fRES(name));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(String name) {
        regName(CK_PS, fRES(name));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(name), getCValueName(), "Name", "Name", "name", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param nameList The collection of name as inScope.
     */
    public void setName_InScope(Collection<String> nameList) {
        regName(CK_INS, cTL(nameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param name The collection of name as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setName_InScope(String name, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(name), getCValueName(), "Name", "Name", "name", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setName_IsNull() { regName(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DUMMY_OBJECT); }

    protected void regName(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueName(), "Name", "Name", "name");
    }
    protected void registerInlineName(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueName(), "Name", "Name", "name");
    }
    abstract protected ConditionValue getCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param tasktype The value of tasktype as equal.
     */
    public void setTasktype_Equal(String tasktype) {
        regTasktype(CK_EQ, fRES(tasktype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tasktype The value of tasktype as notEqual.
     */
    public void setTasktype_NotEqual(String tasktype) {
        regTasktype(CK_NE, fRES(tasktype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param tasktype The value of tasktype as greaterThan.
     */
    public void setTasktype_GreaterThan(String tasktype) {
        regTasktype(CK_GT, fRES(tasktype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param tasktype The value of tasktype as lessThan.
     */
    public void setTasktype_LessThan(String tasktype) {
        regTasktype(CK_LT, fRES(tasktype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tasktype The value of tasktype as greaterEqual.
     */
    public void setTasktype_GreaterEqual(String tasktype) {
        regTasktype(CK_GE, fRES(tasktype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tasktype The value of tasktype as lessEqual.
     */
    public void setTasktype_LessEqual(String tasktype) {
        regTasktype(CK_LE, fRES(tasktype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param tasktype The value of tasktype as prefixSearch.
     */
    public void setTasktype_PrefixSearch(String tasktype) {
        regTasktype(CK_PS, fRES(tasktype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param tasktype The value of tasktype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTasktype_LikeSearch(String tasktype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(tasktype), getCValueTasktype(), "TaskType", "Tasktype", "tasktype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param tasktypeList The collection of tasktype as inScope.
     */
    public void setTasktype_InScope(Collection<String> tasktypeList) {
        regTasktype(CK_INS, cTL(tasktypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param tasktype The collection of tasktype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTasktype_InScope(String tasktype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(tasktype), getCValueTasktype(), "TaskType", "Tasktype", "tasktype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTasktype_IsNull() { regTasktype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTasktype_IsNotNull() { regTasktype(CK_ISNN, DUMMY_OBJECT); }

    protected void regTasktype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTasktype(), "TaskType", "Tasktype", "tasktype");
    }
    protected void registerInlineTasktype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTasktype(), "TaskType", "Tasktype", "tasktype");
    }
    abstract protected ConditionValue getCValueTasktype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(String notes) {
        regNotes(CK_EQ, fRES(notes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(String notes) {
        regNotes(CK_NE, fRES(notes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(String notes) {
        regNotes(CK_PS, fRES(notes));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(notes), getCValueNotes(), "NOTES", "Notes", "notes", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(Collection<String> notesList) {
        regNotes(CK_INS, cTL(notesList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notes The collection of notes as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setNotes_InScope(String notes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(notes), getCValueNotes(), "NOTES", "Notes", "notes", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DUMMY_OBJECT); }

    protected void regNotes(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNotes(), "NOTES", "Notes", "notes");
    }
    protected void registerInlineNotes(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNotes(), "NOTES", "Notes", "notes");
    }
    abstract protected ConditionValue getCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param priority The value of priority as equal.
     */
    public void setPriority_Equal(String priority) {
        regPriority(CK_EQ, fRES(priority));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param priority The value of priority as notEqual.
     */
    public void setPriority_NotEqual(String priority) {
        regPriority(CK_NE, fRES(priority));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param priority The value of priority as greaterThan.
     */
    public void setPriority_GreaterThan(String priority) {
        regPriority(CK_GT, fRES(priority));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param priority The value of priority as lessThan.
     */
    public void setPriority_LessThan(String priority) {
        regPriority(CK_LT, fRES(priority));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param priority The value of priority as greaterEqual.
     */
    public void setPriority_GreaterEqual(String priority) {
        regPriority(CK_GE, fRES(priority));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param priority The value of priority as lessEqual.
     */
    public void setPriority_LessEqual(String priority) {
        regPriority(CK_LE, fRES(priority));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param priority The value of priority as prefixSearch.
     */
    public void setPriority_PrefixSearch(String priority) {
        regPriority(CK_PS, fRES(priority));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param priority The value of priority as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPriority_LikeSearch(String priority, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(priority), getCValuePriority(), "Priority", "Priority", "priority", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param priorityList The collection of priority as inScope.
     */
    public void setPriority_InScope(Collection<String> priorityList) {
        regPriority(CK_INS, cTL(priorityList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param priority The collection of priority as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPriority_InScope(String priority, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(priority), getCValuePriority(), "Priority", "Priority", "priority", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPriority_IsNull() { regPriority(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPriority_IsNotNull() { regPriority(CK_ISNN, DUMMY_OBJECT); }

    protected void regPriority(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePriority(), "Priority", "Priority", "priority");
    }
    protected void registerInlinePriority(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePriority(), "Priority", "Priority", "priority");
    }
    abstract protected ConditionValue getCValuePriority();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param status The value of status as equal.
     */
    public void setStatus_Equal(String status) {
        regStatus(CK_EQ, fRES(status));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as notEqual.
     */
    public void setStatus_NotEqual(String status) {
        regStatus(CK_NE, fRES(status));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as greaterThan.
     */
    public void setStatus_GreaterThan(String status) {
        regStatus(CK_GT, fRES(status));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as lessThan.
     */
    public void setStatus_LessThan(String status) {
        regStatus(CK_LT, fRES(status));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as greaterEqual.
     */
    public void setStatus_GreaterEqual(String status) {
        regStatus(CK_GE, fRES(status));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as lessEqual.
     */
    public void setStatus_LessEqual(String status) {
        regStatus(CK_LE, fRES(status));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as prefixSearch.
     */
    public void setStatus_PrefixSearch(String status) {
        regStatus(CK_PS, fRES(status));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param status The value of status as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatus_LikeSearch(String status, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(status), getCValueStatus(), "Status", "Status", "status", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param statusList The collection of status as inScope.
     */
    public void setStatus_InScope(Collection<String> statusList) {
        regStatus(CK_INS, cTL(statusList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param status The collection of status as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStatus_InScope(String status, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(status), getCValueStatus(), "Status", "Status", "status", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStatus_IsNull() { regStatus(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStatus_IsNotNull() { regStatus(CK_ISNN, DUMMY_OBJECT); }

    protected void regStatus(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStatus(), "Status", "Status", "status");
    }
    protected void registerInlineStatus(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStatus(), "Status", "Status", "status");
    }
    abstract protected ConditionValue getCValueStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param owner The value of owner as equal.
     */
    public void setOwner_Equal(String owner) {
        regOwner(CK_EQ, fRES(owner));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param owner The value of owner as notEqual.
     */
    public void setOwner_NotEqual(String owner) {
        regOwner(CK_NE, fRES(owner));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param owner The value of owner as greaterThan.
     */
    public void setOwner_GreaterThan(String owner) {
        regOwner(CK_GT, fRES(owner));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param owner The value of owner as lessThan.
     */
    public void setOwner_LessThan(String owner) {
        regOwner(CK_LT, fRES(owner));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param owner The value of owner as greaterEqual.
     */
    public void setOwner_GreaterEqual(String owner) {
        regOwner(CK_GE, fRES(owner));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param owner The value of owner as lessEqual.
     */
    public void setOwner_LessEqual(String owner) {
        regOwner(CK_LE, fRES(owner));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param owner The value of owner as prefixSearch.
     */
    public void setOwner_PrefixSearch(String owner) {
        regOwner(CK_PS, fRES(owner));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param owner The value of owner as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwner_LikeSearch(String owner, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(owner), getCValueOwner(), "Owner", "Owner", "owner", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param ownerList The collection of owner as inScope.
     */
    public void setOwner_InScope(Collection<String> ownerList) {
        regOwner(CK_INS, cTL(ownerList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param owner The collection of owner as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setOwner_InScope(String owner, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(owner), getCValueOwner(), "Owner", "Owner", "owner", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setOwner_IsNull() { regOwner(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setOwner_IsNotNull() { regOwner(CK_ISNN, DUMMY_OBJECT); }

    protected void regOwner(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueOwner(), "Owner", "Owner", "owner");
    }
    protected void registerInlineOwner(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueOwner(), "Owner", "Owner", "owner");
    }
    abstract protected ConditionValue getCValueOwner();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param startdate The value of startdate as equal.
     */
    public void setStartdate_Equal(java.sql.Timestamp startdate) {
        regStartdate(CK_EQ, startdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param startdate The value of startdate as greaterThan.
     */
    public void setStartdate_GreaterThan(java.sql.Timestamp startdate) {
        regStartdate(CK_GT, startdate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param startdate The value of startdate as lessThan.
     */
    public void setStartdate_LessThan(java.sql.Timestamp startdate) {
        regStartdate(CK_LT, startdate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param startdate The value of startdate as greaterEqual.
     */
    public void setStartdate_GreaterEqual(java.sql.Timestamp startdate) {
        regStartdate(CK_GE, startdate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param startdate The value of startdate as lessEqual.
     */
    public void setStartdate_LessEqual(java.sql.Timestamp startdate) {
        regStartdate(CK_LE, startdate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of startdate. (Nullable)
     * @param toDate The to-date of startdate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setStartdate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueStartdate(), "StartDate", "Startdate", "startdate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of startdate. (Nullable)
     * @param toDate The to-date of startdate. (Nullable)
     */
    public void setStartdate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setStartdate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStartdate_IsNull() { regStartdate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStartdate_IsNotNull() { regStartdate(CK_ISNN, DUMMY_OBJECT); }

    protected void regStartdate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStartdate(), "StartDate", "Startdate", "startdate");
    }
    protected void registerInlineStartdate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStartdate(), "StartDate", "Startdate", "startdate");
    }
    abstract protected ConditionValue getCValueStartdate();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param enddate The value of enddate as equal.
     */
    public void setEnddate_Equal(java.sql.Timestamp enddate) {
        regEnddate(CK_EQ, enddate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param enddate The value of enddate as greaterThan.
     */
    public void setEnddate_GreaterThan(java.sql.Timestamp enddate) {
        regEnddate(CK_GT, enddate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param enddate The value of enddate as lessThan.
     */
    public void setEnddate_LessThan(java.sql.Timestamp enddate) {
        regEnddate(CK_LT, enddate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param enddate The value of enddate as greaterEqual.
     */
    public void setEnddate_GreaterEqual(java.sql.Timestamp enddate) {
        regEnddate(CK_GE, enddate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param enddate The value of enddate as lessEqual.
     */
    public void setEnddate_LessEqual(java.sql.Timestamp enddate) {
        regEnddate(CK_LE, enddate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of enddate. (Nullable)
     * @param toDate The to-date of enddate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setEnddate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueEnddate(), "EndDate", "Enddate", "enddate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of enddate. (Nullable)
     * @param toDate The to-date of enddate. (Nullable)
     */
    public void setEnddate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setEnddate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setEnddate_IsNull() { regEnddate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setEnddate_IsNotNull() { regEnddate(CK_ISNN, DUMMY_OBJECT); }

    protected void regEnddate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueEnddate(), "EndDate", "Enddate", "enddate");
    }
    protected void registerInlineEnddate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueEnddate(), "EndDate", "Enddate", "enddate");
    }
    abstract protected ConditionValue getCValueEnddate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param phase The value of phase as equal.
     */
    public void setPhase_Equal(String phase) {
        regPhase(CK_EQ, fRES(phase));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phase The value of phase as notEqual.
     */
    public void setPhase_NotEqual(String phase) {
        regPhase(CK_NE, fRES(phase));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phase The value of phase as greaterThan.
     */
    public void setPhase_GreaterThan(String phase) {
        regPhase(CK_GT, fRES(phase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phase The value of phase as lessThan.
     */
    public void setPhase_LessThan(String phase) {
        regPhase(CK_LT, fRES(phase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phase The value of phase as greaterEqual.
     */
    public void setPhase_GreaterEqual(String phase) {
        regPhase(CK_GE, fRES(phase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phase The value of phase as lessEqual.
     */
    public void setPhase_LessEqual(String phase) {
        regPhase(CK_LE, fRES(phase));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param phase The value of phase as prefixSearch.
     */
    public void setPhase_PrefixSearch(String phase) {
        regPhase(CK_PS, fRES(phase));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phase The value of phase as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhase_LikeSearch(String phase, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(phase), getCValuePhase(), "Phase", "Phase", "phase", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phaseList The collection of phase as inScope.
     */
    public void setPhase_InScope(Collection<String> phaseList) {
        regPhase(CK_INS, cTL(phaseList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phase The collection of phase as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPhase_InScope(String phase, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(phase), getCValuePhase(), "Phase", "Phase", "phase", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPhase_IsNull() { regPhase(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPhase_IsNotNull() { regPhase(CK_ISNN, DUMMY_OBJECT); }

    protected void regPhase(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePhase(), "Phase", "Phase", "phase");
    }
    protected void registerInlinePhase(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePhase(), "Phase", "Phase", "phase");
    }
    abstract protected ConditionValue getCValuePhase();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param history The value of history as equal.
     */
    public void setHistory_Equal(String history) {
        regHistory(CK_EQ, fRES(history));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param history The value of history as notEqual.
     */
    public void setHistory_NotEqual(String history) {
        regHistory(CK_NE, fRES(history));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param history The value of history as greaterThan.
     */
    public void setHistory_GreaterThan(String history) {
        regHistory(CK_GT, fRES(history));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param history The value of history as lessThan.
     */
    public void setHistory_LessThan(String history) {
        regHistory(CK_LT, fRES(history));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param history The value of history as greaterEqual.
     */
    public void setHistory_GreaterEqual(String history) {
        regHistory(CK_GE, fRES(history));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param history The value of history as lessEqual.
     */
    public void setHistory_LessEqual(String history) {
        regHistory(CK_LE, fRES(history));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param history The value of history as prefixSearch.
     */
    public void setHistory_PrefixSearch(String history) {
        regHistory(CK_PS, fRES(history));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param history The value of history as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHistory_LikeSearch(String history, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(history), getCValueHistory(), "History", "History", "history", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param historyList The collection of history as inScope.
     */
    public void setHistory_InScope(Collection<String> historyList) {
        regHistory(CK_INS, cTL(historyList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param history The collection of history as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setHistory_InScope(String history, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(history), getCValueHistory(), "History", "History", "history", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setHistory_IsNull() { regHistory(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setHistory_IsNotNull() { regHistory(CK_ISNN, DUMMY_OBJECT); }

    protected void regHistory(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueHistory(), "History", "History", "history");
    }
    protected void registerInlineHistory(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueHistory(), "History", "History", "history");
    }
    abstract protected ConditionValue getCValueHistory();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param percent The value of percent as equal.
     */
    public void setPercent_Equal(java.lang.Integer percent) {
        regPercent(CK_EQ, percent);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param percent The value of percent as notEqual.
     */
    public void setPercent_NotEqual(java.lang.Integer percent) {
        regPercent(CK_NE, percent);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param percent The value of percent as greaterThan.
     */
    public void setPercent_GreaterThan(java.lang.Integer percent) {
        regPercent(CK_GT, percent);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param percent The value of percent as lessThan.
     */
    public void setPercent_LessThan(java.lang.Integer percent) {
        regPercent(CK_LT, percent);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param percent The value of percent as greaterEqual.
     */
    public void setPercent_GreaterEqual(java.lang.Integer percent) {
        regPercent(CK_GE, percent);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param percent The value of percent as lessEqual.
     */
    public void setPercent_LessEqual(java.lang.Integer percent) {
        regPercent(CK_LE, percent);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param percentList The collection of percent as inScope.
     */
    public void setPercent_InScope(Collection<java.lang.Integer> percentList) {
        regPercent(CK_INS, cTL(percentList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPercent_IsNull() { regPercent(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPercent_IsNotNull() { regPercent(CK_ISNN, DUMMY_OBJECT); }

    protected void regPercent(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePercent(), "Percent", "Percent", "percent");
    }
    protected void registerInlinePercent(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePercent(), "Percent", "Percent", "percent");
    }
    abstract protected ConditionValue getCValuePercent();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param totaltime The value of totaltime as equal.
     */
    public void setTotaltime_Equal(java.lang.Integer totaltime) {
        regTotaltime(CK_EQ, totaltime);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param totaltime The value of totaltime as notEqual.
     */
    public void setTotaltime_NotEqual(java.lang.Integer totaltime) {
        regTotaltime(CK_NE, totaltime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param totaltime The value of totaltime as greaterThan.
     */
    public void setTotaltime_GreaterThan(java.lang.Integer totaltime) {
        regTotaltime(CK_GT, totaltime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param totaltime The value of totaltime as lessThan.
     */
    public void setTotaltime_LessThan(java.lang.Integer totaltime) {
        regTotaltime(CK_LT, totaltime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param totaltime The value of totaltime as greaterEqual.
     */
    public void setTotaltime_GreaterEqual(java.lang.Integer totaltime) {
        regTotaltime(CK_GE, totaltime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param totaltime The value of totaltime as lessEqual.
     */
    public void setTotaltime_LessEqual(java.lang.Integer totaltime) {
        regTotaltime(CK_LE, totaltime);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param totaltimeList The collection of totaltime as inScope.
     */
    public void setTotaltime_InScope(Collection<java.lang.Integer> totaltimeList) {
        regTotaltime(CK_INS, cTL(totaltimeList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTotaltime_IsNull() { regTotaltime(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTotaltime_IsNotNull() { regTotaltime(CK_ISNN, DUMMY_OBJECT); }

    protected void regTotaltime(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTotaltime(), "TotalTime", "Totaltime", "totaltime");
    }
    protected void registerInlineTotaltime(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTotaltime(), "TotalTime", "Totaltime", "totaltime");
    }
    abstract protected ConditionValue getCValueTotaltime();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param actualtime The value of actualtime as equal.
     */
    public void setActualtime_Equal(java.lang.Integer actualtime) {
        regActualtime(CK_EQ, actualtime);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param actualtime The value of actualtime as notEqual.
     */
    public void setActualtime_NotEqual(java.lang.Integer actualtime) {
        regActualtime(CK_NE, actualtime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param actualtime The value of actualtime as greaterThan.
     */
    public void setActualtime_GreaterThan(java.lang.Integer actualtime) {
        regActualtime(CK_GT, actualtime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param actualtime The value of actualtime as lessThan.
     */
    public void setActualtime_LessThan(java.lang.Integer actualtime) {
        regActualtime(CK_LT, actualtime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param actualtime The value of actualtime as greaterEqual.
     */
    public void setActualtime_GreaterEqual(java.lang.Integer actualtime) {
        regActualtime(CK_GE, actualtime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param actualtime The value of actualtime as lessEqual.
     */
    public void setActualtime_LessEqual(java.lang.Integer actualtime) {
        regActualtime(CK_LE, actualtime);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param actualtimeList The collection of actualtime as inScope.
     */
    public void setActualtime_InScope(Collection<java.lang.Integer> actualtimeList) {
        regActualtime(CK_INS, cTL(actualtimeList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setActualtime_IsNull() { regActualtime(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setActualtime_IsNotNull() { regActualtime(CK_ISNN, DUMMY_OBJECT); }

    protected void regActualtime(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueActualtime(), "ActualTime", "Actualtime", "actualtime");
    }
    protected void registerInlineActualtime(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueActualtime(), "ActualTime", "Actualtime", "actualtime");
    }
    abstract protected ConditionValue getCValueActualtime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param assignedto The value of assignedto as equal.
     */
    public void setAssignedto_Equal(String assignedto) {
        regAssignedto(CK_EQ, fRES(assignedto));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param assignedto The value of assignedto as notEqual.
     */
    public void setAssignedto_NotEqual(String assignedto) {
        regAssignedto(CK_NE, fRES(assignedto));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param assignedto The value of assignedto as greaterThan.
     */
    public void setAssignedto_GreaterThan(String assignedto) {
        regAssignedto(CK_GT, fRES(assignedto));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param assignedto The value of assignedto as lessThan.
     */
    public void setAssignedto_LessThan(String assignedto) {
        regAssignedto(CK_LT, fRES(assignedto));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param assignedto The value of assignedto as greaterEqual.
     */
    public void setAssignedto_GreaterEqual(String assignedto) {
        regAssignedto(CK_GE, fRES(assignedto));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param assignedto The value of assignedto as lessEqual.
     */
    public void setAssignedto_LessEqual(String assignedto) {
        regAssignedto(CK_LE, fRES(assignedto));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param assignedto The value of assignedto as prefixSearch.
     */
    public void setAssignedto_PrefixSearch(String assignedto) {
        regAssignedto(CK_PS, fRES(assignedto));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param assignedto The value of assignedto as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssignedto_LikeSearch(String assignedto, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(assignedto), getCValueAssignedto(), "AssignedTo", "Assignedto", "assignedto", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param assignedtoList The collection of assignedto as inScope.
     */
    public void setAssignedto_InScope(Collection<String> assignedtoList) {
        regAssignedto(CK_INS, cTL(assignedtoList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param assignedto The collection of assignedto as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setAssignedto_InScope(String assignedto, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(assignedto), getCValueAssignedto(), "AssignedTo", "Assignedto", "assignedto", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setAssignedto_IsNull() { regAssignedto(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setAssignedto_IsNotNull() { regAssignedto(CK_ISNN, DUMMY_OBJECT); }

    protected void regAssignedto(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAssignedto(), "AssignedTo", "Assignedto", "assignedto");
    }
    protected void registerInlineAssignedto(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAssignedto(), "AssignedTo", "Assignedto", "assignedto");
    }
    abstract protected ConditionValue getCValueAssignedto();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TTasksCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TTasksCQ.class.getName(); }
}
