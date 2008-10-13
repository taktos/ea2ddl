package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_issues.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTIssuesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTIssuesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_issues";
    }
    
    public String getTableSqlName() {
        return "t_issues";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param issue The value of issue as equal.
     */
    public void setIssue_Equal(String issue) {
        regIssue(CK_EQ, fRES(issue));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param issue The value of issue as notEqual.
     */
    public void setIssue_NotEqual(String issue) {
        regIssue(CK_NE, fRES(issue));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param issue The value of issue as greaterThan.
     */
    public void setIssue_GreaterThan(String issue) {
        regIssue(CK_GT, fRES(issue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param issue The value of issue as lessThan.
     */
    public void setIssue_LessThan(String issue) {
        regIssue(CK_LT, fRES(issue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param issue The value of issue as greaterEqual.
     */
    public void setIssue_GreaterEqual(String issue) {
        regIssue(CK_GE, fRES(issue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param issue The value of issue as lessEqual.
     */
    public void setIssue_LessEqual(String issue) {
        regIssue(CK_LE, fRES(issue));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param issue The value of issue as prefixSearch.
     */
    public void setIssue_PrefixSearch(String issue) {
        regIssue(CK_PS, fRES(issue));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param issue The value of issue as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIssue_LikeSearch(String issue, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(issue), getCValueIssue(), "Issue", "Issue", "issue", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param issueList The collection of issue as inScope.
     */
    public void setIssue_InScope(Collection<String> issueList) {
        regIssue(CK_INS, cTL(issueList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param issue The collection of issue as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setIssue_InScope(String issue, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(issue), getCValueIssue(), "Issue", "Issue", "issue", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setIssue_IsNull() { regIssue(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setIssue_IsNotNull() { regIssue(CK_ISNN, DUMMY_OBJECT); }

    protected void regIssue(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIssue(), "Issue", "Issue", "issue");
    }
    protected void registerInlineIssue(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIssue(), "Issue", "Issue", "issue");
    }
    abstract protected ConditionValue getCValueIssue();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param issuedate The value of issuedate as equal.
     */
    public void setIssuedate_Equal(java.sql.Timestamp issuedate) {
        regIssuedate(CK_EQ, issuedate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param issuedate The value of issuedate as greaterThan.
     */
    public void setIssuedate_GreaterThan(java.sql.Timestamp issuedate) {
        regIssuedate(CK_GT, issuedate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param issuedate The value of issuedate as lessThan.
     */
    public void setIssuedate_LessThan(java.sql.Timestamp issuedate) {
        regIssuedate(CK_LT, issuedate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param issuedate The value of issuedate as greaterEqual.
     */
    public void setIssuedate_GreaterEqual(java.sql.Timestamp issuedate) {
        regIssuedate(CK_GE, issuedate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param issuedate The value of issuedate as lessEqual.
     */
    public void setIssuedate_LessEqual(java.sql.Timestamp issuedate) {
        regIssuedate(CK_LE, issuedate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of issuedate. (Nullable)
     * @param toDate The to-date of issuedate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setIssuedate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueIssuedate(), "IssueDate", "Issuedate", "issuedate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of issuedate. (Nullable)
     * @param toDate The to-date of issuedate. (Nullable)
     */
    public void setIssuedate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setIssuedate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setIssuedate_IsNull() { regIssuedate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setIssuedate_IsNotNull() { regIssuedate(CK_ISNN, DUMMY_OBJECT); }

    protected void regIssuedate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIssuedate(), "IssueDate", "Issuedate", "issuedate");
    }
    protected void registerInlineIssuedate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIssuedate(), "IssueDate", "Issuedate", "issuedate");
    }
    abstract protected ConditionValue getCValueIssuedate();

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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param resolver The value of resolver as equal.
     */
    public void setResolver_Equal(String resolver) {
        regResolver(CK_EQ, fRES(resolver));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param resolver The value of resolver as notEqual.
     */
    public void setResolver_NotEqual(String resolver) {
        regResolver(CK_NE, fRES(resolver));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param resolver The value of resolver as greaterThan.
     */
    public void setResolver_GreaterThan(String resolver) {
        regResolver(CK_GT, fRES(resolver));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param resolver The value of resolver as lessThan.
     */
    public void setResolver_LessThan(String resolver) {
        regResolver(CK_LT, fRES(resolver));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param resolver The value of resolver as greaterEqual.
     */
    public void setResolver_GreaterEqual(String resolver) {
        regResolver(CK_GE, fRES(resolver));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param resolver The value of resolver as lessEqual.
     */
    public void setResolver_LessEqual(String resolver) {
        regResolver(CK_LE, fRES(resolver));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param resolver The value of resolver as prefixSearch.
     */
    public void setResolver_PrefixSearch(String resolver) {
        regResolver(CK_PS, fRES(resolver));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param resolver The value of resolver as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setResolver_LikeSearch(String resolver, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(resolver), getCValueResolver(), "Resolver", "Resolver", "resolver", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param resolverList The collection of resolver as inScope.
     */
    public void setResolver_InScope(Collection<String> resolverList) {
        regResolver(CK_INS, cTL(resolverList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param resolver The collection of resolver as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setResolver_InScope(String resolver, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(resolver), getCValueResolver(), "Resolver", "Resolver", "resolver", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setResolver_IsNull() { regResolver(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setResolver_IsNotNull() { regResolver(CK_ISNN, DUMMY_OBJECT); }

    protected void regResolver(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueResolver(), "Resolver", "Resolver", "resolver");
    }
    protected void registerInlineResolver(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueResolver(), "Resolver", "Resolver", "resolver");
    }
    abstract protected ConditionValue getCValueResolver();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param dateresolved The value of dateresolved as equal.
     */
    public void setDateresolved_Equal(java.sql.Timestamp dateresolved) {
        regDateresolved(CK_EQ, dateresolved);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param dateresolved The value of dateresolved as greaterThan.
     */
    public void setDateresolved_GreaterThan(java.sql.Timestamp dateresolved) {
        regDateresolved(CK_GT, dateresolved);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param dateresolved The value of dateresolved as lessThan.
     */
    public void setDateresolved_LessThan(java.sql.Timestamp dateresolved) {
        regDateresolved(CK_LT, dateresolved);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param dateresolved The value of dateresolved as greaterEqual.
     */
    public void setDateresolved_GreaterEqual(java.sql.Timestamp dateresolved) {
        regDateresolved(CK_GE, dateresolved);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param dateresolved The value of dateresolved as lessEqual.
     */
    public void setDateresolved_LessEqual(java.sql.Timestamp dateresolved) {
        regDateresolved(CK_LE, dateresolved);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of dateresolved. (Nullable)
     * @param toDate The to-date of dateresolved. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDateresolved_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueDateresolved(), "DateResolved", "Dateresolved", "dateresolved", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of dateresolved. (Nullable)
     * @param toDate The to-date of dateresolved. (Nullable)
     */
    public void setDateresolved_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setDateresolved_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDateresolved_IsNull() { regDateresolved(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDateresolved_IsNotNull() { regDateresolved(CK_ISNN, DUMMY_OBJECT); }

    protected void regDateresolved(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDateresolved(), "DateResolved", "Dateresolved", "dateresolved");
    }
    protected void registerInlineDateresolved(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDateresolved(), "DateResolved", "Dateresolved", "dateresolved");
    }
    abstract protected ConditionValue getCValueDateresolved();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param resolution The value of resolution as equal.
     */
    public void setResolution_Equal(String resolution) {
        regResolution(CK_EQ, fRES(resolution));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param resolution The value of resolution as notEqual.
     */
    public void setResolution_NotEqual(String resolution) {
        regResolution(CK_NE, fRES(resolution));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param resolution The value of resolution as greaterThan.
     */
    public void setResolution_GreaterThan(String resolution) {
        regResolution(CK_GT, fRES(resolution));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param resolution The value of resolution as lessThan.
     */
    public void setResolution_LessThan(String resolution) {
        regResolution(CK_LT, fRES(resolution));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param resolution The value of resolution as greaterEqual.
     */
    public void setResolution_GreaterEqual(String resolution) {
        regResolution(CK_GE, fRES(resolution));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param resolution The value of resolution as lessEqual.
     */
    public void setResolution_LessEqual(String resolution) {
        regResolution(CK_LE, fRES(resolution));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param resolution The value of resolution as prefixSearch.
     */
    public void setResolution_PrefixSearch(String resolution) {
        regResolution(CK_PS, fRES(resolution));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param resolution The value of resolution as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setResolution_LikeSearch(String resolution, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(resolution), getCValueResolution(), "Resolution", "Resolution", "resolution", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param resolutionList The collection of resolution as inScope.
     */
    public void setResolution_InScope(Collection<String> resolutionList) {
        regResolution(CK_INS, cTL(resolutionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param resolution The collection of resolution as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setResolution_InScope(String resolution, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(resolution), getCValueResolution(), "Resolution", "Resolution", "resolution", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setResolution_IsNull() { regResolution(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setResolution_IsNotNull() { regResolution(CK_ISNN, DUMMY_OBJECT); }

    protected void regResolution(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueResolution(), "Resolution", "Resolution", "resolution");
    }
    protected void registerInlineResolution(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueResolution(), "Resolution", "Resolution", "resolution");
    }
    abstract protected ConditionValue getCValueResolution();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : COUNTER : NotNull}
     * @param issueid The value of issueid as equal.
     */
    public void setIssueid_Equal(java.lang.Integer issueid) {
        regIssueid(CK_EQ, issueid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param issueid The value of issueid as notEqual.
     */
    public void setIssueid_NotEqual(java.lang.Integer issueid) {
        regIssueid(CK_NE, issueid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param issueid The value of issueid as greaterThan.
     */
    public void setIssueid_GreaterThan(java.lang.Integer issueid) {
        regIssueid(CK_GT, issueid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param issueid The value of issueid as lessThan.
     */
    public void setIssueid_LessThan(java.lang.Integer issueid) {
        regIssueid(CK_LT, issueid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param issueid The value of issueid as greaterEqual.
     */
    public void setIssueid_GreaterEqual(java.lang.Integer issueid) {
        regIssueid(CK_GE, issueid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param issueid The value of issueid as lessEqual.
     */
    public void setIssueid_LessEqual(java.lang.Integer issueid) {
        regIssueid(CK_LE, issueid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param issueidList The collection of issueid as inScope.
     */
    public void setIssueid_InScope(Collection<java.lang.Integer> issueidList) {
        regIssueid(CK_INS, cTL(issueidList));
    }

    protected void regIssueid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIssueid(), "IssueID", "Issueid", "issueid");
    }
    protected void registerInlineIssueid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIssueid(), "IssueID", "Issueid", "issueid");
    }
    abstract protected ConditionValue getCValueIssueid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param category The value of category as equal.
     */
    public void setCategory_Equal(String category) {
        regCategory(CK_EQ, fRES(category));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as notEqual.
     */
    public void setCategory_NotEqual(String category) {
        regCategory(CK_NE, fRES(category));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as greaterThan.
     */
    public void setCategory_GreaterThan(String category) {
        regCategory(CK_GT, fRES(category));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as lessThan.
     */
    public void setCategory_LessThan(String category) {
        regCategory(CK_LT, fRES(category));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as greaterEqual.
     */
    public void setCategory_GreaterEqual(String category) {
        regCategory(CK_GE, fRES(category));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as lessEqual.
     */
    public void setCategory_LessEqual(String category) {
        regCategory(CK_LE, fRES(category));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as prefixSearch.
     */
    public void setCategory_PrefixSearch(String category) {
        regCategory(CK_PS, fRES(category));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param category The value of category as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCategory_LikeSearch(String category, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(category), getCValueCategory(), "Category", "Category", "category", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param categoryList The collection of category as inScope.
     */
    public void setCategory_InScope(Collection<String> categoryList) {
        regCategory(CK_INS, cTL(categoryList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param category The collection of category as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setCategory_InScope(String category, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(category), getCValueCategory(), "Category", "Category", "category", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCategory_IsNull() { regCategory(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCategory_IsNotNull() { regCategory(CK_ISNN, DUMMY_OBJECT); }

    protected void regCategory(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCategory(), "Category", "Category", "category");
    }
    protected void registerInlineCategory(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCategory(), "Category", "Category", "category");
    }
    abstract protected ConditionValue getCValueCategory();

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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param severity The value of severity as equal.
     */
    public void setSeverity_Equal(String severity) {
        regSeverity(CK_EQ, fRES(severity));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param severity The value of severity as notEqual.
     */
    public void setSeverity_NotEqual(String severity) {
        regSeverity(CK_NE, fRES(severity));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param severity The value of severity as greaterThan.
     */
    public void setSeverity_GreaterThan(String severity) {
        regSeverity(CK_GT, fRES(severity));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param severity The value of severity as lessThan.
     */
    public void setSeverity_LessThan(String severity) {
        regSeverity(CK_LT, fRES(severity));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param severity The value of severity as greaterEqual.
     */
    public void setSeverity_GreaterEqual(String severity) {
        regSeverity(CK_GE, fRES(severity));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param severity The value of severity as lessEqual.
     */
    public void setSeverity_LessEqual(String severity) {
        regSeverity(CK_LE, fRES(severity));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param severity The value of severity as prefixSearch.
     */
    public void setSeverity_PrefixSearch(String severity) {
        regSeverity(CK_PS, fRES(severity));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param severity The value of severity as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSeverity_LikeSearch(String severity, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(severity), getCValueSeverity(), "Severity", "Severity", "severity", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param severityList The collection of severity as inScope.
     */
    public void setSeverity_InScope(Collection<String> severityList) {
        regSeverity(CK_INS, cTL(severityList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param severity The collection of severity as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setSeverity_InScope(String severity, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(severity), getCValueSeverity(), "Severity", "Severity", "severity", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setSeverity_IsNull() { regSeverity(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setSeverity_IsNotNull() { regSeverity(CK_ISNN, DUMMY_OBJECT); }

    protected void regSeverity(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueSeverity(), "Severity", "Severity", "severity");
    }
    protected void registerInlineSeverity(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueSeverity(), "Severity", "Severity", "severity");
    }
    abstract protected ConditionValue getCValueSeverity();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param issuetype The value of issuetype as equal.
     */
    public void setIssuetype_Equal(String issuetype) {
        regIssuetype(CK_EQ, fRES(issuetype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param issuetype The value of issuetype as notEqual.
     */
    public void setIssuetype_NotEqual(String issuetype) {
        regIssuetype(CK_NE, fRES(issuetype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param issuetype The value of issuetype as greaterThan.
     */
    public void setIssuetype_GreaterThan(String issuetype) {
        regIssuetype(CK_GT, fRES(issuetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param issuetype The value of issuetype as lessThan.
     */
    public void setIssuetype_LessThan(String issuetype) {
        regIssuetype(CK_LT, fRES(issuetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param issuetype The value of issuetype as greaterEqual.
     */
    public void setIssuetype_GreaterEqual(String issuetype) {
        regIssuetype(CK_GE, fRES(issuetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param issuetype The value of issuetype as lessEqual.
     */
    public void setIssuetype_LessEqual(String issuetype) {
        regIssuetype(CK_LE, fRES(issuetype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param issuetype The value of issuetype as prefixSearch.
     */
    public void setIssuetype_PrefixSearch(String issuetype) {
        regIssuetype(CK_PS, fRES(issuetype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param issuetype The value of issuetype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIssuetype_LikeSearch(String issuetype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(issuetype), getCValueIssuetype(), "IssueType", "Issuetype", "issuetype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param issuetypeList The collection of issuetype as inScope.
     */
    public void setIssuetype_InScope(Collection<String> issuetypeList) {
        regIssuetype(CK_INS, cTL(issuetypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param issuetype The collection of issuetype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setIssuetype_InScope(String issuetype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(issuetype), getCValueIssuetype(), "IssueType", "Issuetype", "issuetype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setIssuetype_IsNull() { regIssuetype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setIssuetype_IsNotNull() { regIssuetype(CK_ISNN, DUMMY_OBJECT); }

    protected void regIssuetype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIssuetype(), "IssueType", "Issuetype", "issuetype");
    }
    protected void registerInlineIssuetype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIssuetype(), "IssueType", "Issuetype", "issuetype");
    }
    abstract protected ConditionValue getCValueIssuetype();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TIssuesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TIssuesCQ.class.getName(); }
}
