package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_phase.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTPhaseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPhaseCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_phase";
    }
    
    public String getTableSqlName() {
        return "t_phase";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(40)}
     * @param phaseid The value of phaseid as equal.
     */
    public void setPhaseid_Equal(String phaseid) {
        regPhaseid(CK_EQ, fRES(phaseid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phaseid The value of phaseid as notEqual.
     */
    public void setPhaseid_NotEqual(String phaseid) {
        regPhaseid(CK_NE, fRES(phaseid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phaseid The value of phaseid as greaterThan.
     */
    public void setPhaseid_GreaterThan(String phaseid) {
        regPhaseid(CK_GT, fRES(phaseid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phaseid The value of phaseid as lessThan.
     */
    public void setPhaseid_LessThan(String phaseid) {
        regPhaseid(CK_LT, fRES(phaseid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phaseid The value of phaseid as greaterEqual.
     */
    public void setPhaseid_GreaterEqual(String phaseid) {
        regPhaseid(CK_GE, fRES(phaseid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phaseid The value of phaseid as lessEqual.
     */
    public void setPhaseid_LessEqual(String phaseid) {
        regPhaseid(CK_LE, fRES(phaseid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param phaseid The value of phaseid as prefixSearch.
     */
    public void setPhaseid_PrefixSearch(String phaseid) {
        regPhaseid(CK_PS, fRES(phaseid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phaseid The value of phaseid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhaseid_LikeSearch(String phaseid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(phaseid), getCValuePhaseid(), "PhaseID", "Phaseid", "phaseid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phaseidList The collection of phaseid as inScope.
     */
    public void setPhaseid_InScope(Collection<String> phaseidList) {
        regPhaseid(CK_INS, cTL(phaseidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phaseid The collection of phaseid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPhaseid_InScope(String phaseid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(phaseid), getCValuePhaseid(), "PhaseID", "Phaseid", "phaseid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPhaseid_IsNull() { regPhaseid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPhaseid_IsNotNull() { regPhaseid(CK_ISNN, DUMMY_OBJECT); }

    protected void regPhaseid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePhaseid(), "PhaseID", "Phaseid", "phaseid");
    }
    protected void registerInlinePhaseid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePhaseid(), "PhaseID", "Phaseid", "phaseid");
    }
    abstract protected ConditionValue getCValuePhaseid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param phasename The value of phasename as equal.
     */
    public void setPhasename_Equal(String phasename) {
        regPhasename(CK_EQ, fRES(phasename));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasename The value of phasename as notEqual.
     */
    public void setPhasename_NotEqual(String phasename) {
        regPhasename(CK_NE, fRES(phasename));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasename The value of phasename as greaterThan.
     */
    public void setPhasename_GreaterThan(String phasename) {
        regPhasename(CK_GT, fRES(phasename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasename The value of phasename as lessThan.
     */
    public void setPhasename_LessThan(String phasename) {
        regPhasename(CK_LT, fRES(phasename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasename The value of phasename as greaterEqual.
     */
    public void setPhasename_GreaterEqual(String phasename) {
        regPhasename(CK_GE, fRES(phasename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasename The value of phasename as lessEqual.
     */
    public void setPhasename_LessEqual(String phasename) {
        regPhasename(CK_LE, fRES(phasename));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasename The value of phasename as prefixSearch.
     */
    public void setPhasename_PrefixSearch(String phasename) {
        regPhasename(CK_PS, fRES(phasename));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phasename The value of phasename as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhasename_LikeSearch(String phasename, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(phasename), getCValuePhasename(), "PhaseName", "Phasename", "phasename", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phasenameList The collection of phasename as inScope.
     */
    public void setPhasename_InScope(Collection<String> phasenameList) {
        regPhasename(CK_INS, cTL(phasenameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phasename The collection of phasename as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPhasename_InScope(String phasename, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(phasename), getCValuePhasename(), "PhaseName", "Phasename", "phasename", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPhasename_IsNull() { regPhasename(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPhasename_IsNotNull() { regPhasename(CK_ISNN, DUMMY_OBJECT); }

    protected void regPhasename(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePhasename(), "PhaseName", "Phasename", "phasename");
    }
    protected void registerInlinePhasename(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePhasename(), "PhaseName", "Phasename", "phasename");
    }
    abstract protected ConditionValue getCValuePhasename();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param phasenotes The value of phasenotes as equal.
     */
    public void setPhasenotes_Equal(String phasenotes) {
        regPhasenotes(CK_EQ, fRES(phasenotes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasenotes The value of phasenotes as notEqual.
     */
    public void setPhasenotes_NotEqual(String phasenotes) {
        regPhasenotes(CK_NE, fRES(phasenotes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasenotes The value of phasenotes as greaterThan.
     */
    public void setPhasenotes_GreaterThan(String phasenotes) {
        regPhasenotes(CK_GT, fRES(phasenotes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasenotes The value of phasenotes as lessThan.
     */
    public void setPhasenotes_LessThan(String phasenotes) {
        regPhasenotes(CK_LT, fRES(phasenotes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasenotes The value of phasenotes as greaterEqual.
     */
    public void setPhasenotes_GreaterEqual(String phasenotes) {
        regPhasenotes(CK_GE, fRES(phasenotes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasenotes The value of phasenotes as lessEqual.
     */
    public void setPhasenotes_LessEqual(String phasenotes) {
        regPhasenotes(CK_LE, fRES(phasenotes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasenotes The value of phasenotes as prefixSearch.
     */
    public void setPhasenotes_PrefixSearch(String phasenotes) {
        regPhasenotes(CK_PS, fRES(phasenotes));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phasenotes The value of phasenotes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhasenotes_LikeSearch(String phasenotes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(phasenotes), getCValuePhasenotes(), "PhaseNotes", "Phasenotes", "phasenotes", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phasenotesList The collection of phasenotes as inScope.
     */
    public void setPhasenotes_InScope(Collection<String> phasenotesList) {
        regPhasenotes(CK_INS, cTL(phasenotesList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phasenotes The collection of phasenotes as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPhasenotes_InScope(String phasenotes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(phasenotes), getCValuePhasenotes(), "PhaseNotes", "Phasenotes", "phasenotes", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPhasenotes_IsNull() { regPhasenotes(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPhasenotes_IsNotNull() { regPhasenotes(CK_ISNN, DUMMY_OBJECT); }

    protected void regPhasenotes(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePhasenotes(), "PhaseNotes", "Phasenotes", "phasenotes");
    }
    protected void registerInlinePhasenotes(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePhasenotes(), "PhaseNotes", "Phasenotes", "phasenotes");
    }
    abstract protected ConditionValue getCValuePhasenotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param phasestyle The value of phasestyle as equal.
     */
    public void setPhasestyle_Equal(String phasestyle) {
        regPhasestyle(CK_EQ, fRES(phasestyle));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasestyle The value of phasestyle as notEqual.
     */
    public void setPhasestyle_NotEqual(String phasestyle) {
        regPhasestyle(CK_NE, fRES(phasestyle));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasestyle The value of phasestyle as greaterThan.
     */
    public void setPhasestyle_GreaterThan(String phasestyle) {
        regPhasestyle(CK_GT, fRES(phasestyle));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasestyle The value of phasestyle as lessThan.
     */
    public void setPhasestyle_LessThan(String phasestyle) {
        regPhasestyle(CK_LT, fRES(phasestyle));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasestyle The value of phasestyle as greaterEqual.
     */
    public void setPhasestyle_GreaterEqual(String phasestyle) {
        regPhasestyle(CK_GE, fRES(phasestyle));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasestyle The value of phasestyle as lessEqual.
     */
    public void setPhasestyle_LessEqual(String phasestyle) {
        regPhasestyle(CK_LE, fRES(phasestyle));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasestyle The value of phasestyle as prefixSearch.
     */
    public void setPhasestyle_PrefixSearch(String phasestyle) {
        regPhasestyle(CK_PS, fRES(phasestyle));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phasestyle The value of phasestyle as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhasestyle_LikeSearch(String phasestyle, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(phasestyle), getCValuePhasestyle(), "PhaseStyle", "Phasestyle", "phasestyle", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phasestyleList The collection of phasestyle as inScope.
     */
    public void setPhasestyle_InScope(Collection<String> phasestyleList) {
        regPhasestyle(CK_INS, cTL(phasestyleList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phasestyle The collection of phasestyle as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPhasestyle_InScope(String phasestyle, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(phasestyle), getCValuePhasestyle(), "PhaseStyle", "Phasestyle", "phasestyle", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPhasestyle_IsNull() { regPhasestyle(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPhasestyle_IsNotNull() { regPhasestyle(CK_ISNN, DUMMY_OBJECT); }

    protected void regPhasestyle(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePhasestyle(), "PhaseStyle", "Phasestyle", "phasestyle");
    }
    protected void registerInlinePhasestyle(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePhasestyle(), "PhaseStyle", "Phasestyle", "phasestyle");
    }
    abstract protected ConditionValue getCValuePhasestyle();
    
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param phasecontent The value of phasecontent as equal.
     */
    public void setPhasecontent_Equal(String phasecontent) {
        regPhasecontent(CK_EQ, fRES(phasecontent));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasecontent The value of phasecontent as notEqual.
     */
    public void setPhasecontent_NotEqual(String phasecontent) {
        regPhasecontent(CK_NE, fRES(phasecontent));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasecontent The value of phasecontent as greaterThan.
     */
    public void setPhasecontent_GreaterThan(String phasecontent) {
        regPhasecontent(CK_GT, fRES(phasecontent));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasecontent The value of phasecontent as lessThan.
     */
    public void setPhasecontent_LessThan(String phasecontent) {
        regPhasecontent(CK_LT, fRES(phasecontent));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasecontent The value of phasecontent as greaterEqual.
     */
    public void setPhasecontent_GreaterEqual(String phasecontent) {
        regPhasecontent(CK_GE, fRES(phasecontent));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasecontent The value of phasecontent as lessEqual.
     */
    public void setPhasecontent_LessEqual(String phasecontent) {
        regPhasecontent(CK_LE, fRES(phasecontent));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param phasecontent The value of phasecontent as prefixSearch.
     */
    public void setPhasecontent_PrefixSearch(String phasecontent) {
        regPhasecontent(CK_PS, fRES(phasecontent));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phasecontent The value of phasecontent as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhasecontent_LikeSearch(String phasecontent, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(phasecontent), getCValuePhasecontent(), "PhaseContent", "Phasecontent", "phasecontent", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phasecontentList The collection of phasecontent as inScope.
     */
    public void setPhasecontent_InScope(Collection<String> phasecontentList) {
        regPhasecontent(CK_INS, cTL(phasecontentList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phasecontent The collection of phasecontent as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPhasecontent_InScope(String phasecontent, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(phasecontent), getCValuePhasecontent(), "PhaseContent", "Phasecontent", "phasecontent", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPhasecontent_IsNull() { regPhasecontent(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPhasecontent_IsNotNull() { regPhasecontent(CK_ISNN, DUMMY_OBJECT); }

    protected void regPhasecontent(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePhasecontent(), "PhaseContent", "Phasecontent", "phasecontent");
    }
    protected void registerInlinePhasecontent(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePhasecontent(), "PhaseContent", "Phasecontent", "phasecontent");
    }
    abstract protected ConditionValue getCValuePhasecontent();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TPhaseCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TPhaseCQ.class.getName(); }
}
