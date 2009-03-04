package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import jp.sourceforge.ea2ddl.dao.allcommon.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_objectrequires.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTObjectrequiresCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectrequiresCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return _dbmetaProvider;
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : NotNull : COUNTER}
     * @param reqid The value of reqid as equal.
     */
    public void setReqid_Equal(java.lang.Integer reqid) {
        regReqid(CK_EQ, reqid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param reqid The value of reqid as notEqual.
     */
    public void setReqid_NotEqual(java.lang.Integer reqid) {
        regReqid(CK_NE, reqid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param reqid The value of reqid as greaterThan.
     */
    public void setReqid_GreaterThan(java.lang.Integer reqid) {
        regReqid(CK_GT, reqid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param reqid The value of reqid as lessThan.
     */
    public void setReqid_LessThan(java.lang.Integer reqid) {
        regReqid(CK_LT, reqid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param reqid The value of reqid as greaterEqual.
     */
    public void setReqid_GreaterEqual(java.lang.Integer reqid) {
        regReqid(CK_GE, reqid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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

    protected void regReqid(ConditionKey k, Object v) { regQ(k, v, getCValueReqid(), "ReqID"); }
    abstract protected ConditionValue getCValueReqid();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param objectId The value of objectId as equal.
     */
    public void setObjectId_Equal(java.lang.Integer objectId) {
        regObjectId(CK_EQ, objectId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as notEqual.
     */
    public void setObjectId_NotEqual(java.lang.Integer objectId) {
        regObjectId(CK_NE, objectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as greaterThan.
     */
    public void setObjectId_GreaterThan(java.lang.Integer objectId) {
        regObjectId(CK_GT, objectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as lessThan.
     */
    public void setObjectId_LessThan(java.lang.Integer objectId) {
        regObjectId(CK_LT, objectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as greaterEqual.
     */
    public void setObjectId_GreaterEqual(java.lang.Integer objectId) {
        regObjectId(CK_GE, objectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setObjectId_IsNull() { regObjectId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setObjectId_IsNotNull() { regObjectId(CK_ISNN, DOBJ); }

    protected void regObjectId(ConditionKey k, Object v) { regQ(k, v, getCValueObjectId(), "Object_ID"); }
    abstract protected ConditionValue getCValueObjectId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param requirement The value of requirement as equal.
     */
    public void setRequirement_Equal(String requirement) {
        regRequirement(CK_EQ, fRES(requirement));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param requirement The value of requirement as notEqual.
     */
    public void setRequirement_NotEqual(String requirement) {
        regRequirement(CK_NE, fRES(requirement));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param requirement The value of requirement as greaterThan.
     */
    public void setRequirement_GreaterThan(String requirement) {
        regRequirement(CK_GT, fRES(requirement));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param requirement The value of requirement as lessThan.
     */
    public void setRequirement_LessThan(String requirement) {
        regRequirement(CK_LT, fRES(requirement));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param requirement The value of requirement as greaterEqual.
     */
    public void setRequirement_GreaterEqual(String requirement) {
        regRequirement(CK_GE, fRES(requirement));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param requirement The value of requirement as lessEqual.
     */
    public void setRequirement_LessEqual(String requirement) {
        regRequirement(CK_LE, fRES(requirement));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param requirement The value of requirement as prefixSearch.
     */
    public void setRequirement_PrefixSearch(String requirement) {
        regRequirement(CK_PS, fRES(requirement));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param requirementList The collection of requirement as inScope.
     */
    public void setRequirement_InScope(Collection<String> requirementList) {
        regRequirement(CK_INS, cTL(requirementList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param requirement The value of requirement as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRequirement_LikeSearch(String requirement, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(requirement), getCValueRequirement(), "Requirement", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param requirement The value of requirement as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRequirement_NotLikeSearch(String requirement, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(requirement), getCValueRequirement(), "Requirement", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRequirement_IsNull() { regRequirement(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRequirement_IsNotNull() { regRequirement(CK_ISNN, DOBJ); }

    protected void regRequirement(ConditionKey k, Object v) { regQ(k, v, getCValueRequirement(), "Requirement"); }
    abstract protected ConditionValue getCValueRequirement();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param reqtype The value of reqtype as equal.
     */
    public void setReqtype_Equal(String reqtype) {
        regReqtype(CK_EQ, fRES(reqtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param reqtype The value of reqtype as notEqual.
     */
    public void setReqtype_NotEqual(String reqtype) {
        regReqtype(CK_NE, fRES(reqtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param reqtype The value of reqtype as greaterThan.
     */
    public void setReqtype_GreaterThan(String reqtype) {
        regReqtype(CK_GT, fRES(reqtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param reqtype The value of reqtype as lessThan.
     */
    public void setReqtype_LessThan(String reqtype) {
        regReqtype(CK_LT, fRES(reqtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param reqtype The value of reqtype as greaterEqual.
     */
    public void setReqtype_GreaterEqual(String reqtype) {
        regReqtype(CK_GE, fRES(reqtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param reqtype The value of reqtype as lessEqual.
     */
    public void setReqtype_LessEqual(String reqtype) {
        regReqtype(CK_LE, fRES(reqtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param reqtype The value of reqtype as prefixSearch.
     */
    public void setReqtype_PrefixSearch(String reqtype) {
        regReqtype(CK_PS, fRES(reqtype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param reqtypeList The collection of reqtype as inScope.
     */
    public void setReqtype_InScope(Collection<String> reqtypeList) {
        regReqtype(CK_INS, cTL(reqtypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param reqtype The value of reqtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReqtype_LikeSearch(String reqtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reqtype), getCValueReqtype(), "ReqType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param reqtype The value of reqtype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReqtype_NotLikeSearch(String reqtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reqtype), getCValueReqtype(), "ReqType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setReqtype_IsNull() { regReqtype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setReqtype_IsNotNull() { regReqtype(CK_ISNN, DOBJ); }

    protected void regReqtype(ConditionKey k, Object v) { regQ(k, v, getCValueReqtype(), "ReqType"); }
    abstract protected ConditionValue getCValueReqtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param status The value of status as equal.
     */
    public void setStatus_Equal(String status) {
        regStatus(CK_EQ, fRES(status));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as notEqual.
     */
    public void setStatus_NotEqual(String status) {
        regStatus(CK_NE, fRES(status));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as greaterThan.
     */
    public void setStatus_GreaterThan(String status) {
        regStatus(CK_GT, fRES(status));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as lessThan.
     */
    public void setStatus_LessThan(String status) {
        regStatus(CK_LT, fRES(status));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as greaterEqual.
     */
    public void setStatus_GreaterEqual(String status) {
        regStatus(CK_GE, fRES(status));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as lessEqual.
     */
    public void setStatus_LessEqual(String status) {
        regStatus(CK_LE, fRES(status));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as prefixSearch.
     */
    public void setStatus_PrefixSearch(String status) {
        regStatus(CK_PS, fRES(status));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param statusList The collection of status as inScope.
     */
    public void setStatus_InScope(Collection<String> statusList) {
        regStatus(CK_INS, cTL(statusList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param status The value of status as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatus_LikeSearch(String status, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(status), getCValueStatus(), "Status", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param status The value of status as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStatus_NotLikeSearch(String status, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(status), getCValueStatus(), "Status", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStatus_IsNull() { regStatus(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStatus_IsNotNull() { regStatus(CK_ISNN, DOBJ); }

    protected void regStatus(ConditionKey k, Object v) { regQ(k, v, getCValueStatus(), "Status"); }
    abstract protected ConditionValue getCValueStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(String notes) {
        regNotes(CK_EQ, fRES(notes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(String notes) {
        regNotes(CK_NE, fRES(notes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(String notes) {
        regNotes(CK_PS, fRES(notes));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(Collection<String> notesList) {
        regNotes(CK_INS, cTL(notesList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey k, Object v) { regQ(k, v, getCValueNotes(), "Notes"); }
    abstract protected ConditionValue getCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param stability The value of stability as equal.
     */
    public void setStability_Equal(String stability) {
        regStability(CK_EQ, fRES(stability));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stability The value of stability as notEqual.
     */
    public void setStability_NotEqual(String stability) {
        regStability(CK_NE, fRES(stability));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stability The value of stability as greaterThan.
     */
    public void setStability_GreaterThan(String stability) {
        regStability(CK_GT, fRES(stability));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stability The value of stability as lessThan.
     */
    public void setStability_LessThan(String stability) {
        regStability(CK_LT, fRES(stability));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stability The value of stability as greaterEqual.
     */
    public void setStability_GreaterEqual(String stability) {
        regStability(CK_GE, fRES(stability));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stability The value of stability as lessEqual.
     */
    public void setStability_LessEqual(String stability) {
        regStability(CK_LE, fRES(stability));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stability The value of stability as prefixSearch.
     */
    public void setStability_PrefixSearch(String stability) {
        regStability(CK_PS, fRES(stability));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stabilityList The collection of stability as inScope.
     */
    public void setStability_InScope(Collection<String> stabilityList) {
        regStability(CK_INS, cTL(stabilityList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stability The value of stability as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStability_LikeSearch(String stability, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stability), getCValueStability(), "Stability", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stability The value of stability as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStability_NotLikeSearch(String stability, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stability), getCValueStability(), "Stability", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStability_IsNull() { regStability(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStability_IsNotNull() { regStability(CK_ISNN, DOBJ); }

    protected void regStability(ConditionKey k, Object v) { regQ(k, v, getCValueStability(), "Stability"); }
    abstract protected ConditionValue getCValueStability();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param difficulty The value of difficulty as equal.
     */
    public void setDifficulty_Equal(String difficulty) {
        regDifficulty(CK_EQ, fRES(difficulty));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param difficulty The value of difficulty as notEqual.
     */
    public void setDifficulty_NotEqual(String difficulty) {
        regDifficulty(CK_NE, fRES(difficulty));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param difficulty The value of difficulty as greaterThan.
     */
    public void setDifficulty_GreaterThan(String difficulty) {
        regDifficulty(CK_GT, fRES(difficulty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param difficulty The value of difficulty as lessThan.
     */
    public void setDifficulty_LessThan(String difficulty) {
        regDifficulty(CK_LT, fRES(difficulty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param difficulty The value of difficulty as greaterEqual.
     */
    public void setDifficulty_GreaterEqual(String difficulty) {
        regDifficulty(CK_GE, fRES(difficulty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param difficulty The value of difficulty as lessEqual.
     */
    public void setDifficulty_LessEqual(String difficulty) {
        regDifficulty(CK_LE, fRES(difficulty));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param difficulty The value of difficulty as prefixSearch.
     */
    public void setDifficulty_PrefixSearch(String difficulty) {
        regDifficulty(CK_PS, fRES(difficulty));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param difficultyList The collection of difficulty as inScope.
     */
    public void setDifficulty_InScope(Collection<String> difficultyList) {
        regDifficulty(CK_INS, cTL(difficultyList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param difficulty The value of difficulty as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDifficulty_LikeSearch(String difficulty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(difficulty), getCValueDifficulty(), "Difficulty", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param difficulty The value of difficulty as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDifficulty_NotLikeSearch(String difficulty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(difficulty), getCValueDifficulty(), "Difficulty", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDifficulty_IsNull() { regDifficulty(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDifficulty_IsNotNull() { regDifficulty(CK_ISNN, DOBJ); }

    protected void regDifficulty(ConditionKey k, Object v) { regQ(k, v, getCValueDifficulty(), "Difficulty"); }
    abstract protected ConditionValue getCValueDifficulty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param priority The value of priority as equal.
     */
    public void setPriority_Equal(String priority) {
        regPriority(CK_EQ, fRES(priority));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param priority The value of priority as notEqual.
     */
    public void setPriority_NotEqual(String priority) {
        regPriority(CK_NE, fRES(priority));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param priority The value of priority as greaterThan.
     */
    public void setPriority_GreaterThan(String priority) {
        regPriority(CK_GT, fRES(priority));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param priority The value of priority as lessThan.
     */
    public void setPriority_LessThan(String priority) {
        regPriority(CK_LT, fRES(priority));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param priority The value of priority as greaterEqual.
     */
    public void setPriority_GreaterEqual(String priority) {
        regPriority(CK_GE, fRES(priority));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param priority The value of priority as lessEqual.
     */
    public void setPriority_LessEqual(String priority) {
        regPriority(CK_LE, fRES(priority));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param priority The value of priority as prefixSearch.
     */
    public void setPriority_PrefixSearch(String priority) {
        regPriority(CK_PS, fRES(priority));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param priorityList The collection of priority as inScope.
     */
    public void setPriority_InScope(Collection<String> priorityList) {
        regPriority(CK_INS, cTL(priorityList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param priority The value of priority as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPriority_LikeSearch(String priority, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(priority), getCValuePriority(), "Priority", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param priority The value of priority as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPriority_NotLikeSearch(String priority, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(priority), getCValuePriority(), "Priority", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPriority_IsNull() { regPriority(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPriority_IsNotNull() { regPriority(CK_ISNN, DOBJ); }

    protected void regPriority(ConditionKey k, Object v) { regQ(k, v, getCValuePriority(), "Priority"); }
    abstract protected ConditionValue getCValuePriority();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param lastupdate The value of lastupdate as equal.
     */
    public void setLastupdate_Equal(java.sql.Timestamp lastupdate) {
        regLastupdate(CK_EQ, lastupdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param lastupdate The value of lastupdate as greaterThan.
     */
    public void setLastupdate_GreaterThan(java.sql.Timestamp lastupdate) {
        regLastupdate(CK_GT, lastupdate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param lastupdate The value of lastupdate as lessThan.
     */
    public void setLastupdate_LessThan(java.sql.Timestamp lastupdate) {
        regLastupdate(CK_LT, lastupdate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param lastupdate The value of lastupdate as greaterEqual.
     */
    public void setLastupdate_GreaterEqual(java.sql.Timestamp lastupdate) {
        regLastupdate(CK_GE, lastupdate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param lastupdate The value of lastupdate as lessEqual.
     */
    public void setLastupdate_LessEqual(java.sql.Timestamp lastupdate) {
        regLastupdate(CK_LE, lastupdate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of lastupdate. (Nullable)
     * @param toDate The to-date of lastupdate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLastupdate_FromTo(java.util.Date fromDate, java.util.Date toDate, FromToOption fromToOption) {
        regFTQ((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueLastupdate(), "LastUpdate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of lastupdate. (Nullable)
     * @param toDate The to-date of lastupdate. (Nullable)
     */
    public void setLastupdate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setLastupdate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setLastupdate_IsNull() { regLastupdate(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setLastupdate_IsNotNull() { regLastupdate(CK_ISNN, DOBJ); }

    protected void regLastupdate(ConditionKey k, Object v) { regQ(k, v, getCValueLastupdate(), "LastUpdate"); }
    abstract protected ConditionValue getCValueLastupdate();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TObjectrequiresCB.class.getName(); }
    String xCQ() { return TObjectrequiresCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
