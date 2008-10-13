package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_objectrequires.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTObjectrequiresCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectrequiresCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectrequires";
    }
    
    public String getTableSqlName() {
        return "t_objectrequires";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : COUNTER : NotNull}
     * @param reqid The value of reqid as equal.
     */
    public void setReqid_Equal(java.lang.Integer reqid) {
        regReqid(CK_EQ, reqid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param reqid The value of reqid as notEqual.
     */
    public void setReqid_NotEqual(java.lang.Integer reqid) {
        regReqid(CK_NE, reqid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param reqid The value of reqid as greaterThan.
     */
    public void setReqid_GreaterThan(java.lang.Integer reqid) {
        regReqid(CK_GT, reqid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param reqid The value of reqid as lessThan.
     */
    public void setReqid_LessThan(java.lang.Integer reqid) {
        regReqid(CK_LT, reqid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param reqid The value of reqid as greaterEqual.
     */
    public void setReqid_GreaterEqual(java.lang.Integer reqid) {
        regReqid(CK_GE, reqid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param reqid The value of reqid as lessEqual.
     */
    public void setReqid_LessEqual(java.lang.Integer reqid) {
        regReqid(CK_LE, reqid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param reqidList The collection of reqid as inScope.
     */
    public void setReqid_InScope(Collection<java.lang.Integer> reqidList) {
        regReqid(CK_INS, cTL(reqidList));
    }

    protected void regReqid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueReqid(), "ReqID", "Reqid", "reqid");
    }
    protected void registerInlineReqid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueReqid(), "ReqID", "Reqid", "reqid");
    }
    abstract protected ConditionValue getCValueReqid();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param objectId The value of objectId as equal.
     */
    public void setObjectId_Equal(java.lang.Integer objectId) {
        regObjectId(CK_EQ, objectId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as notEqual.
     */
    public void setObjectId_NotEqual(java.lang.Integer objectId) {
        regObjectId(CK_NE, objectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as greaterThan.
     */
    public void setObjectId_GreaterThan(java.lang.Integer objectId) {
        regObjectId(CK_GT, objectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as lessThan.
     */
    public void setObjectId_LessThan(java.lang.Integer objectId) {
        regObjectId(CK_LT, objectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as greaterEqual.
     */
    public void setObjectId_GreaterEqual(java.lang.Integer objectId) {
        regObjectId(CK_GE, objectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as lessEqual.
     */
    public void setObjectId_LessEqual(java.lang.Integer objectId) {
        regObjectId(CK_LE, objectId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param objectIdList The collection of objectId as inScope.
     */
    public void setObjectId_InScope(Collection<java.lang.Integer> objectIdList) {
        regObjectId(CK_INS, cTL(objectIdList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setObjectId_IsNull() { regObjectId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setObjectId_IsNotNull() { regObjectId(CK_ISNN, DUMMY_OBJECT); }

    protected void regObjectId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueObjectId(), "Object_ID", "ObjectId", "objectId");
    }
    protected void registerInlineObjectId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueObjectId(), "Object_ID", "ObjectId", "objectId");
    }
    abstract protected ConditionValue getCValueObjectId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param requirement The value of requirement as equal.
     */
    public void setRequirement_Equal(String requirement) {
        regRequirement(CK_EQ, fRES(requirement));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param requirement The value of requirement as notEqual.
     */
    public void setRequirement_NotEqual(String requirement) {
        regRequirement(CK_NE, fRES(requirement));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param requirement The value of requirement as greaterThan.
     */
    public void setRequirement_GreaterThan(String requirement) {
        regRequirement(CK_GT, fRES(requirement));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param requirement The value of requirement as lessThan.
     */
    public void setRequirement_LessThan(String requirement) {
        regRequirement(CK_LT, fRES(requirement));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param requirement The value of requirement as greaterEqual.
     */
    public void setRequirement_GreaterEqual(String requirement) {
        regRequirement(CK_GE, fRES(requirement));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param requirement The value of requirement as lessEqual.
     */
    public void setRequirement_LessEqual(String requirement) {
        regRequirement(CK_LE, fRES(requirement));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param requirement The value of requirement as prefixSearch.
     */
    public void setRequirement_PrefixSearch(String requirement) {
        regRequirement(CK_PS, fRES(requirement));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param requirement The value of requirement as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRequirement_LikeSearch(String requirement, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(requirement), getCValueRequirement(), "Requirement", "Requirement", "requirement", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param requirementList The collection of requirement as inScope.
     */
    public void setRequirement_InScope(Collection<String> requirementList) {
        regRequirement(CK_INS, cTL(requirementList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param requirement The collection of requirement as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setRequirement_InScope(String requirement, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(requirement), getCValueRequirement(), "Requirement", "Requirement", "requirement", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRequirement_IsNull() { regRequirement(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRequirement_IsNotNull() { regRequirement(CK_ISNN, DUMMY_OBJECT); }

    protected void regRequirement(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRequirement(), "Requirement", "Requirement", "requirement");
    }
    protected void registerInlineRequirement(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRequirement(), "Requirement", "Requirement", "requirement");
    }
    abstract protected ConditionValue getCValueRequirement();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param reqtype The value of reqtype as equal.
     */
    public void setReqtype_Equal(String reqtype) {
        regReqtype(CK_EQ, fRES(reqtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param reqtype The value of reqtype as notEqual.
     */
    public void setReqtype_NotEqual(String reqtype) {
        regReqtype(CK_NE, fRES(reqtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param reqtype The value of reqtype as greaterThan.
     */
    public void setReqtype_GreaterThan(String reqtype) {
        regReqtype(CK_GT, fRES(reqtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param reqtype The value of reqtype as lessThan.
     */
    public void setReqtype_LessThan(String reqtype) {
        regReqtype(CK_LT, fRES(reqtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param reqtype The value of reqtype as greaterEqual.
     */
    public void setReqtype_GreaterEqual(String reqtype) {
        regReqtype(CK_GE, fRES(reqtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param reqtype The value of reqtype as lessEqual.
     */
    public void setReqtype_LessEqual(String reqtype) {
        regReqtype(CK_LE, fRES(reqtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param reqtype The value of reqtype as prefixSearch.
     */
    public void setReqtype_PrefixSearch(String reqtype) {
        regReqtype(CK_PS, fRES(reqtype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param reqtype The value of reqtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReqtype_LikeSearch(String reqtype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(reqtype), getCValueReqtype(), "ReqType", "Reqtype", "reqtype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param reqtypeList The collection of reqtype as inScope.
     */
    public void setReqtype_InScope(Collection<String> reqtypeList) {
        regReqtype(CK_INS, cTL(reqtypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param reqtype The collection of reqtype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setReqtype_InScope(String reqtype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(reqtype), getCValueReqtype(), "ReqType", "Reqtype", "reqtype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setReqtype_IsNull() { regReqtype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setReqtype_IsNotNull() { regReqtype(CK_ISNN, DUMMY_OBJECT); }

    protected void regReqtype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueReqtype(), "ReqType", "Reqtype", "reqtype");
    }
    protected void registerInlineReqtype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueReqtype(), "ReqType", "Reqtype", "reqtype");
    }
    abstract protected ConditionValue getCValueReqtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
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
        registerLikeSearchQuery(CK_LS, fRES(notes), getCValueNotes(), "Notes", "Notes", "notes", likeSearchOption);
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
        registerInScopeQuery(CK_INS, fRES(notes), getCValueNotes(), "Notes", "Notes", "notes", inScopeOption);
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
        registerQuery(key, value, getCValueNotes(), "Notes", "Notes", "notes");
    }
    protected void registerInlineNotes(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNotes(), "Notes", "Notes", "notes");
    }
    abstract protected ConditionValue getCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param stability The value of stability as equal.
     */
    public void setStability_Equal(String stability) {
        regStability(CK_EQ, fRES(stability));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stability The value of stability as notEqual.
     */
    public void setStability_NotEqual(String stability) {
        regStability(CK_NE, fRES(stability));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param stability The value of stability as greaterThan.
     */
    public void setStability_GreaterThan(String stability) {
        regStability(CK_GT, fRES(stability));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param stability The value of stability as lessThan.
     */
    public void setStability_LessThan(String stability) {
        regStability(CK_LT, fRES(stability));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stability The value of stability as greaterEqual.
     */
    public void setStability_GreaterEqual(String stability) {
        regStability(CK_GE, fRES(stability));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stability The value of stability as lessEqual.
     */
    public void setStability_LessEqual(String stability) {
        regStability(CK_LE, fRES(stability));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param stability The value of stability as prefixSearch.
     */
    public void setStability_PrefixSearch(String stability) {
        regStability(CK_PS, fRES(stability));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stability The value of stability as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStability_LikeSearch(String stability, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(stability), getCValueStability(), "Stability", "Stability", "stability", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stabilityList The collection of stability as inScope.
     */
    public void setStability_InScope(Collection<String> stabilityList) {
        regStability(CK_INS, cTL(stabilityList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stability The collection of stability as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStability_InScope(String stability, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(stability), getCValueStability(), "Stability", "Stability", "stability", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStability_IsNull() { regStability(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStability_IsNotNull() { regStability(CK_ISNN, DUMMY_OBJECT); }

    protected void regStability(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStability(), "Stability", "Stability", "stability");
    }
    protected void registerInlineStability(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStability(), "Stability", "Stability", "stability");
    }
    abstract protected ConditionValue getCValueStability();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param difficulty The value of difficulty as equal.
     */
    public void setDifficulty_Equal(String difficulty) {
        regDifficulty(CK_EQ, fRES(difficulty));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param difficulty The value of difficulty as notEqual.
     */
    public void setDifficulty_NotEqual(String difficulty) {
        regDifficulty(CK_NE, fRES(difficulty));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param difficulty The value of difficulty as greaterThan.
     */
    public void setDifficulty_GreaterThan(String difficulty) {
        regDifficulty(CK_GT, fRES(difficulty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param difficulty The value of difficulty as lessThan.
     */
    public void setDifficulty_LessThan(String difficulty) {
        regDifficulty(CK_LT, fRES(difficulty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param difficulty The value of difficulty as greaterEqual.
     */
    public void setDifficulty_GreaterEqual(String difficulty) {
        regDifficulty(CK_GE, fRES(difficulty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param difficulty The value of difficulty as lessEqual.
     */
    public void setDifficulty_LessEqual(String difficulty) {
        regDifficulty(CK_LE, fRES(difficulty));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param difficulty The value of difficulty as prefixSearch.
     */
    public void setDifficulty_PrefixSearch(String difficulty) {
        regDifficulty(CK_PS, fRES(difficulty));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param difficulty The value of difficulty as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDifficulty_LikeSearch(String difficulty, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(difficulty), getCValueDifficulty(), "Difficulty", "Difficulty", "difficulty", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param difficultyList The collection of difficulty as inScope.
     */
    public void setDifficulty_InScope(Collection<String> difficultyList) {
        regDifficulty(CK_INS, cTL(difficultyList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param difficulty The collection of difficulty as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDifficulty_InScope(String difficulty, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(difficulty), getCValueDifficulty(), "Difficulty", "Difficulty", "difficulty", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDifficulty_IsNull() { regDifficulty(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDifficulty_IsNotNull() { regDifficulty(CK_ISNN, DUMMY_OBJECT); }

    protected void regDifficulty(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDifficulty(), "Difficulty", "Difficulty", "difficulty");
    }
    protected void registerInlineDifficulty(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDifficulty(), "Difficulty", "Difficulty", "difficulty");
    }
    abstract protected ConditionValue getCValueDifficulty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
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
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param lastupdate The value of lastupdate as equal.
     */
    public void setLastupdate_Equal(java.sql.Timestamp lastupdate) {
        regLastupdate(CK_EQ, lastupdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param lastupdate The value of lastupdate as greaterThan.
     */
    public void setLastupdate_GreaterThan(java.sql.Timestamp lastupdate) {
        regLastupdate(CK_GT, lastupdate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param lastupdate The value of lastupdate as lessThan.
     */
    public void setLastupdate_LessThan(java.sql.Timestamp lastupdate) {
        regLastupdate(CK_LT, lastupdate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param lastupdate The value of lastupdate as greaterEqual.
     */
    public void setLastupdate_GreaterEqual(java.sql.Timestamp lastupdate) {
        regLastupdate(CK_GE, lastupdate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param lastupdate The value of lastupdate as lessEqual.
     */
    public void setLastupdate_LessEqual(java.sql.Timestamp lastupdate) {
        regLastupdate(CK_LE, lastupdate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of lastupdate. (Nullable)
     * @param toDate The to-date of lastupdate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLastupdate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueLastupdate(), "LastUpdate", "Lastupdate", "lastupdate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of lastupdate. (Nullable)
     * @param toDate The to-date of lastupdate. (Nullable)
     */
    public void setLastupdate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setLastupdate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setLastupdate_IsNull() { regLastupdate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setLastupdate_IsNotNull() { regLastupdate(CK_ISNN, DUMMY_OBJECT); }

    protected void regLastupdate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueLastupdate(), "LastUpdate", "Lastupdate", "lastupdate");
    }
    protected void registerInlineLastupdate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLastupdate(), "LastUpdate", "Lastupdate", "lastupdate");
    }
    abstract protected ConditionValue getCValueLastupdate();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TObjectrequiresCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TObjectrequiresCQ.class.getName(); }
}
