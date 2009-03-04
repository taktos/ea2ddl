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
 * The abstract condition-query of t_objectproblems.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTObjectproblemsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectproblemsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_objectproblems";
    }
    
    public String getTableSqlName() {
        return "t_objectproblems";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : INTEGER}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(255)}
     * @param problem The value of problem as equal.
     */
    public void setProblem_Equal(String problem) {
        regProblem(CK_EQ, fRES(problem));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problem The value of problem as notEqual.
     */
    public void setProblem_NotEqual(String problem) {
        regProblem(CK_NE, fRES(problem));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problem The value of problem as greaterThan.
     */
    public void setProblem_GreaterThan(String problem) {
        regProblem(CK_GT, fRES(problem));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problem The value of problem as lessThan.
     */
    public void setProblem_LessThan(String problem) {
        regProblem(CK_LT, fRES(problem));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problem The value of problem as greaterEqual.
     */
    public void setProblem_GreaterEqual(String problem) {
        regProblem(CK_GE, fRES(problem));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problem The value of problem as lessEqual.
     */
    public void setProblem_LessEqual(String problem) {
        regProblem(CK_LE, fRES(problem));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problem The value of problem as prefixSearch.
     */
    public void setProblem_PrefixSearch(String problem) {
        regProblem(CK_PS, fRES(problem));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param problemList The collection of problem as inScope.
     */
    public void setProblem_InScope(Collection<String> problemList) {
        regProblem(CK_INS, cTL(problemList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param problem The value of problem as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProblem_LikeSearch(String problem, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(problem), getCValueProblem(), "Problem", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param problem The value of problem as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProblem_NotLikeSearch(String problem, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(problem), getCValueProblem(), "Problem", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setProblem_IsNull() { regProblem(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setProblem_IsNotNull() { regProblem(CK_ISNN, DOBJ); }

    protected void regProblem(ConditionKey k, Object v) { regQ(k, v, getCValueProblem(), "Problem"); }
    abstract protected ConditionValue getCValueProblem();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(255)}
     * @param problemtype The value of problemtype as equal.
     */
    public void setProblemtype_Equal(String problemtype) {
        regProblemtype(CK_EQ, fRES(problemtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problemtype The value of problemtype as notEqual.
     */
    public void setProblemtype_NotEqual(String problemtype) {
        regProblemtype(CK_NE, fRES(problemtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problemtype The value of problemtype as greaterThan.
     */
    public void setProblemtype_GreaterThan(String problemtype) {
        regProblemtype(CK_GT, fRES(problemtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problemtype The value of problemtype as lessThan.
     */
    public void setProblemtype_LessThan(String problemtype) {
        regProblemtype(CK_LT, fRES(problemtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problemtype The value of problemtype as greaterEqual.
     */
    public void setProblemtype_GreaterEqual(String problemtype) {
        regProblemtype(CK_GE, fRES(problemtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problemtype The value of problemtype as lessEqual.
     */
    public void setProblemtype_LessEqual(String problemtype) {
        regProblemtype(CK_LE, fRES(problemtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problemtype The value of problemtype as prefixSearch.
     */
    public void setProblemtype_PrefixSearch(String problemtype) {
        regProblemtype(CK_PS, fRES(problemtype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param problemtypeList The collection of problemtype as inScope.
     */
    public void setProblemtype_InScope(Collection<String> problemtypeList) {
        regProblemtype(CK_INS, cTL(problemtypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param problemtype The value of problemtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProblemtype_LikeSearch(String problemtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(problemtype), getCValueProblemtype(), "ProblemType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param problemtype The value of problemtype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProblemtype_NotLikeSearch(String problemtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(problemtype), getCValueProblemtype(), "ProblemType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setProblemtype_IsNull() { regProblemtype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setProblemtype_IsNotNull() { regProblemtype(CK_ISNN, DOBJ); }

    protected void regProblemtype(ConditionKey k, Object v) { regQ(k, v, getCValueProblemtype(), "ProblemType"); }
    abstract protected ConditionValue getCValueProblemtype();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param datereported The value of datereported as equal.
     */
    public void setDatereported_Equal(java.sql.Timestamp datereported) {
        regDatereported(CK_EQ, datereported);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param datereported The value of datereported as greaterThan.
     */
    public void setDatereported_GreaterThan(java.sql.Timestamp datereported) {
        regDatereported(CK_GT, datereported);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param datereported The value of datereported as lessThan.
     */
    public void setDatereported_LessThan(java.sql.Timestamp datereported) {
        regDatereported(CK_LT, datereported);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param datereported The value of datereported as greaterEqual.
     */
    public void setDatereported_GreaterEqual(java.sql.Timestamp datereported) {
        regDatereported(CK_GE, datereported);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param datereported The value of datereported as lessEqual.
     */
    public void setDatereported_LessEqual(java.sql.Timestamp datereported) {
        regDatereported(CK_LE, datereported);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of datereported. (Nullable)
     * @param toDate The to-date of datereported. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDatereported_FromTo(java.util.Date fromDate, java.util.Date toDate, FromToOption fromToOption) {
        regFTQ((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueDatereported(), "DateReported", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of datereported. (Nullable)
     * @param toDate The to-date of datereported. (Nullable)
     */
    public void setDatereported_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setDatereported_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDatereported_IsNull() { regDatereported(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDatereported_IsNotNull() { regDatereported(CK_ISNN, DOBJ); }

    protected void regDatereported(ConditionKey k, Object v) { regQ(k, v, getCValueDatereported(), "DateReported"); }
    abstract protected ConditionValue getCValueDatereported();

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
     * @param problemnotes The value of problemnotes as equal.
     */
    public void setProblemnotes_Equal(String problemnotes) {
        regProblemnotes(CK_EQ, fRES(problemnotes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problemnotes The value of problemnotes as notEqual.
     */
    public void setProblemnotes_NotEqual(String problemnotes) {
        regProblemnotes(CK_NE, fRES(problemnotes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problemnotes The value of problemnotes as greaterThan.
     */
    public void setProblemnotes_GreaterThan(String problemnotes) {
        regProblemnotes(CK_GT, fRES(problemnotes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problemnotes The value of problemnotes as lessThan.
     */
    public void setProblemnotes_LessThan(String problemnotes) {
        regProblemnotes(CK_LT, fRES(problemnotes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problemnotes The value of problemnotes as greaterEqual.
     */
    public void setProblemnotes_GreaterEqual(String problemnotes) {
        regProblemnotes(CK_GE, fRES(problemnotes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problemnotes The value of problemnotes as lessEqual.
     */
    public void setProblemnotes_LessEqual(String problemnotes) {
        regProblemnotes(CK_LE, fRES(problemnotes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param problemnotes The value of problemnotes as prefixSearch.
     */
    public void setProblemnotes_PrefixSearch(String problemnotes) {
        regProblemnotes(CK_PS, fRES(problemnotes));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param problemnotesList The collection of problemnotes as inScope.
     */
    public void setProblemnotes_InScope(Collection<String> problemnotesList) {
        regProblemnotes(CK_INS, cTL(problemnotesList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param problemnotes The value of problemnotes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProblemnotes_LikeSearch(String problemnotes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(problemnotes), getCValueProblemnotes(), "ProblemNotes", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param problemnotes The value of problemnotes as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProblemnotes_NotLikeSearch(String problemnotes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(problemnotes), getCValueProblemnotes(), "ProblemNotes", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setProblemnotes_IsNull() { regProblemnotes(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setProblemnotes_IsNotNull() { regProblemnotes(CK_ISNN, DOBJ); }

    protected void regProblemnotes(ConditionKey k, Object v) { regQ(k, v, getCValueProblemnotes(), "ProblemNotes"); }
    abstract protected ConditionValue getCValueProblemnotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param reportedby The value of reportedby as equal.
     */
    public void setReportedby_Equal(String reportedby) {
        regReportedby(CK_EQ, fRES(reportedby));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param reportedby The value of reportedby as notEqual.
     */
    public void setReportedby_NotEqual(String reportedby) {
        regReportedby(CK_NE, fRES(reportedby));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param reportedby The value of reportedby as greaterThan.
     */
    public void setReportedby_GreaterThan(String reportedby) {
        regReportedby(CK_GT, fRES(reportedby));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param reportedby The value of reportedby as lessThan.
     */
    public void setReportedby_LessThan(String reportedby) {
        regReportedby(CK_LT, fRES(reportedby));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param reportedby The value of reportedby as greaterEqual.
     */
    public void setReportedby_GreaterEqual(String reportedby) {
        regReportedby(CK_GE, fRES(reportedby));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param reportedby The value of reportedby as lessEqual.
     */
    public void setReportedby_LessEqual(String reportedby) {
        regReportedby(CK_LE, fRES(reportedby));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param reportedby The value of reportedby as prefixSearch.
     */
    public void setReportedby_PrefixSearch(String reportedby) {
        regReportedby(CK_PS, fRES(reportedby));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param reportedbyList The collection of reportedby as inScope.
     */
    public void setReportedby_InScope(Collection<String> reportedbyList) {
        regReportedby(CK_INS, cTL(reportedbyList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param reportedby The value of reportedby as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportedby_LikeSearch(String reportedby, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportedby), getCValueReportedby(), "ReportedBy", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param reportedby The value of reportedby as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportedby_NotLikeSearch(String reportedby, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportedby), getCValueReportedby(), "ReportedBy", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setReportedby_IsNull() { regReportedby(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setReportedby_IsNotNull() { regReportedby(CK_ISNN, DOBJ); }

    protected void regReportedby(ConditionKey k, Object v) { regQ(k, v, getCValueReportedby(), "ReportedBy"); }
    abstract protected ConditionValue getCValueReportedby();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param resolvedby The value of resolvedby as equal.
     */
    public void setResolvedby_Equal(String resolvedby) {
        regResolvedby(CK_EQ, fRES(resolvedby));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param resolvedby The value of resolvedby as notEqual.
     */
    public void setResolvedby_NotEqual(String resolvedby) {
        regResolvedby(CK_NE, fRES(resolvedby));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param resolvedby The value of resolvedby as greaterThan.
     */
    public void setResolvedby_GreaterThan(String resolvedby) {
        regResolvedby(CK_GT, fRES(resolvedby));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param resolvedby The value of resolvedby as lessThan.
     */
    public void setResolvedby_LessThan(String resolvedby) {
        regResolvedby(CK_LT, fRES(resolvedby));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param resolvedby The value of resolvedby as greaterEqual.
     */
    public void setResolvedby_GreaterEqual(String resolvedby) {
        regResolvedby(CK_GE, fRES(resolvedby));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param resolvedby The value of resolvedby as lessEqual.
     */
    public void setResolvedby_LessEqual(String resolvedby) {
        regResolvedby(CK_LE, fRES(resolvedby));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param resolvedby The value of resolvedby as prefixSearch.
     */
    public void setResolvedby_PrefixSearch(String resolvedby) {
        regResolvedby(CK_PS, fRES(resolvedby));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param resolvedbyList The collection of resolvedby as inScope.
     */
    public void setResolvedby_InScope(Collection<String> resolvedbyList) {
        regResolvedby(CK_INS, cTL(resolvedbyList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param resolvedby The value of resolvedby as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setResolvedby_LikeSearch(String resolvedby, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(resolvedby), getCValueResolvedby(), "ResolvedBy", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param resolvedby The value of resolvedby as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setResolvedby_NotLikeSearch(String resolvedby, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(resolvedby), getCValueResolvedby(), "ResolvedBy", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setResolvedby_IsNull() { regResolvedby(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setResolvedby_IsNotNull() { regResolvedby(CK_ISNN, DOBJ); }

    protected void regResolvedby(ConditionKey k, Object v) { regQ(k, v, getCValueResolvedby(), "ResolvedBy"); }
    abstract protected ConditionValue getCValueResolvedby();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param dateresolved The value of dateresolved as equal.
     */
    public void setDateresolved_Equal(java.sql.Timestamp dateresolved) {
        regDateresolved(CK_EQ, dateresolved);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param dateresolved The value of dateresolved as greaterThan.
     */
    public void setDateresolved_GreaterThan(java.sql.Timestamp dateresolved) {
        regDateresolved(CK_GT, dateresolved);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param dateresolved The value of dateresolved as lessThan.
     */
    public void setDateresolved_LessThan(java.sql.Timestamp dateresolved) {
        regDateresolved(CK_LT, dateresolved);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param dateresolved The value of dateresolved as greaterEqual.
     */
    public void setDateresolved_GreaterEqual(java.sql.Timestamp dateresolved) {
        regDateresolved(CK_GE, dateresolved);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param dateresolved The value of dateresolved as lessEqual.
     */
    public void setDateresolved_LessEqual(java.sql.Timestamp dateresolved) {
        regDateresolved(CK_LE, dateresolved);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of dateresolved. (Nullable)
     * @param toDate The to-date of dateresolved. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDateresolved_FromTo(java.util.Date fromDate, java.util.Date toDate, FromToOption fromToOption) {
        regFTQ((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueDateresolved(), "DateResolved", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of dateresolved. (Nullable)
     * @param toDate The to-date of dateresolved. (Nullable)
     */
    public void setDateresolved_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setDateresolved_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDateresolved_IsNull() { regDateresolved(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDateresolved_IsNotNull() { regDateresolved(CK_ISNN, DOBJ); }

    protected void regDateresolved(ConditionKey k, Object v) { regQ(k, v, getCValueDateresolved(), "DateResolved"); }
    abstract protected ConditionValue getCValueDateresolved();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param version The value of version as equal.
     */
    public void setVersion_Equal(String version) {
        regVersion(CK_EQ, fRES(version));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as notEqual.
     */
    public void setVersion_NotEqual(String version) {
        regVersion(CK_NE, fRES(version));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as greaterThan.
     */
    public void setVersion_GreaterThan(String version) {
        regVersion(CK_GT, fRES(version));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as lessThan.
     */
    public void setVersion_LessThan(String version) {
        regVersion(CK_LT, fRES(version));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as greaterEqual.
     */
    public void setVersion_GreaterEqual(String version) {
        regVersion(CK_GE, fRES(version));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as lessEqual.
     */
    public void setVersion_LessEqual(String version) {
        regVersion(CK_LE, fRES(version));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as prefixSearch.
     */
    public void setVersion_PrefixSearch(String version) {
        regVersion(CK_PS, fRES(version));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param versionList The collection of version as inScope.
     */
    public void setVersion_InScope(Collection<String> versionList) {
        regVersion(CK_INS, cTL(versionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param version The value of version as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVersion_LikeSearch(String version, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(version), getCValueVersion(), "Version", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param version The value of version as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVersion_NotLikeSearch(String version, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(version), getCValueVersion(), "Version", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setVersion_IsNull() { regVersion(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setVersion_IsNotNull() { regVersion(CK_ISNN, DOBJ); }

    protected void regVersion(ConditionKey k, Object v) { regQ(k, v, getCValueVersion(), "Version"); }
    abstract protected ConditionValue getCValueVersion();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param resolvernotes The value of resolvernotes as equal.
     */
    public void setResolvernotes_Equal(String resolvernotes) {
        regResolvernotes(CK_EQ, fRES(resolvernotes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param resolvernotes The value of resolvernotes as notEqual.
     */
    public void setResolvernotes_NotEqual(String resolvernotes) {
        regResolvernotes(CK_NE, fRES(resolvernotes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param resolvernotes The value of resolvernotes as greaterThan.
     */
    public void setResolvernotes_GreaterThan(String resolvernotes) {
        regResolvernotes(CK_GT, fRES(resolvernotes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param resolvernotes The value of resolvernotes as lessThan.
     */
    public void setResolvernotes_LessThan(String resolvernotes) {
        regResolvernotes(CK_LT, fRES(resolvernotes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param resolvernotes The value of resolvernotes as greaterEqual.
     */
    public void setResolvernotes_GreaterEqual(String resolvernotes) {
        regResolvernotes(CK_GE, fRES(resolvernotes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param resolvernotes The value of resolvernotes as lessEqual.
     */
    public void setResolvernotes_LessEqual(String resolvernotes) {
        regResolvernotes(CK_LE, fRES(resolvernotes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param resolvernotes The value of resolvernotes as prefixSearch.
     */
    public void setResolvernotes_PrefixSearch(String resolvernotes) {
        regResolvernotes(CK_PS, fRES(resolvernotes));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param resolvernotesList The collection of resolvernotes as inScope.
     */
    public void setResolvernotes_InScope(Collection<String> resolvernotesList) {
        regResolvernotes(CK_INS, cTL(resolvernotesList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param resolvernotes The value of resolvernotes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setResolvernotes_LikeSearch(String resolvernotes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(resolvernotes), getCValueResolvernotes(), "ResolverNotes", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param resolvernotes The value of resolvernotes as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setResolvernotes_NotLikeSearch(String resolvernotes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(resolvernotes), getCValueResolvernotes(), "ResolverNotes", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setResolvernotes_IsNull() { regResolvernotes(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setResolvernotes_IsNotNull() { regResolvernotes(CK_ISNN, DOBJ); }

    protected void regResolvernotes(ConditionKey k, Object v) { regQ(k, v, getCValueResolvernotes(), "ResolverNotes"); }
    abstract protected ConditionValue getCValueResolvernotes();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param severity The value of severity as equal.
     */
    public void setSeverity_Equal(String severity) {
        regSeverity(CK_EQ, fRES(severity));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param severity The value of severity as notEqual.
     */
    public void setSeverity_NotEqual(String severity) {
        regSeverity(CK_NE, fRES(severity));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param severity The value of severity as greaterThan.
     */
    public void setSeverity_GreaterThan(String severity) {
        regSeverity(CK_GT, fRES(severity));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param severity The value of severity as lessThan.
     */
    public void setSeverity_LessThan(String severity) {
        regSeverity(CK_LT, fRES(severity));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param severity The value of severity as greaterEqual.
     */
    public void setSeverity_GreaterEqual(String severity) {
        regSeverity(CK_GE, fRES(severity));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param severity The value of severity as lessEqual.
     */
    public void setSeverity_LessEqual(String severity) {
        regSeverity(CK_LE, fRES(severity));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param severity The value of severity as prefixSearch.
     */
    public void setSeverity_PrefixSearch(String severity) {
        regSeverity(CK_PS, fRES(severity));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param severityList The collection of severity as inScope.
     */
    public void setSeverity_InScope(Collection<String> severityList) {
        regSeverity(CK_INS, cTL(severityList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param severity The value of severity as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSeverity_LikeSearch(String severity, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(severity), getCValueSeverity(), "Severity", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param severity The value of severity as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSeverity_NotLikeSearch(String severity, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(severity), getCValueSeverity(), "Severity", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSeverity_IsNull() { regSeverity(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSeverity_IsNotNull() { regSeverity(CK_ISNN, DOBJ); }

    protected void regSeverity(ConditionKey k, Object v) { regQ(k, v, getCValueSeverity(), "Severity"); }
    abstract protected ConditionValue getCValueSeverity();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TObjectproblemsCB.class.getName(); }
    String xCQ() { return TObjectproblemsCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
