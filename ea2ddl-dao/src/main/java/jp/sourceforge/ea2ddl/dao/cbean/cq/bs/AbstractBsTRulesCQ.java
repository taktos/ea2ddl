package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_rules.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTRulesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTRulesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_rules";
    }
    
    public String getTableSqlName() {
        return "t_rules";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(50)}
     * @param ruleid The value of ruleid as equal.
     */
    public void setRuleid_Equal(String ruleid) {
        regRuleid(CK_EQ, fRES(ruleid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruleid The value of ruleid as notEqual.
     */
    public void setRuleid_NotEqual(String ruleid) {
        regRuleid(CK_NE, fRES(ruleid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruleid The value of ruleid as greaterThan.
     */
    public void setRuleid_GreaterThan(String ruleid) {
        regRuleid(CK_GT, fRES(ruleid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruleid The value of ruleid as lessThan.
     */
    public void setRuleid_LessThan(String ruleid) {
        regRuleid(CK_LT, fRES(ruleid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruleid The value of ruleid as greaterEqual.
     */
    public void setRuleid_GreaterEqual(String ruleid) {
        regRuleid(CK_GE, fRES(ruleid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruleid The value of ruleid as lessEqual.
     */
    public void setRuleid_LessEqual(String ruleid) {
        regRuleid(CK_LE, fRES(ruleid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruleid The value of ruleid as prefixSearch.
     */
    public void setRuleid_PrefixSearch(String ruleid) {
        regRuleid(CK_PS, fRES(ruleid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param ruleid The value of ruleid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRuleid_LikeSearch(String ruleid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(ruleid), getCValueRuleid(), "RuleID", "Ruleid", "ruleid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param ruleidList The collection of ruleid as inScope.
     */
    public void setRuleid_InScope(Collection<String> ruleidList) {
        regRuleid(CK_INS, cTL(ruleidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param ruleid The collection of ruleid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setRuleid_InScope(String ruleid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(ruleid), getCValueRuleid(), "RuleID", "Ruleid", "ruleid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRuleid_IsNull() { regRuleid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRuleid_IsNotNull() { regRuleid(CK_ISNN, DUMMY_OBJECT); }

    protected void regRuleid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRuleid(), "RuleID", "Ruleid", "ruleid");
    }
    protected void registerInlineRuleid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRuleid(), "RuleID", "Ruleid", "ruleid");
    }
    abstract protected ConditionValue getCValueRuleid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param rulename The value of rulename as equal.
     */
    public void setRulename_Equal(String rulename) {
        regRulename(CK_EQ, fRES(rulename));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param rulename The value of rulename as notEqual.
     */
    public void setRulename_NotEqual(String rulename) {
        regRulename(CK_NE, fRES(rulename));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param rulename The value of rulename as greaterThan.
     */
    public void setRulename_GreaterThan(String rulename) {
        regRulename(CK_GT, fRES(rulename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param rulename The value of rulename as lessThan.
     */
    public void setRulename_LessThan(String rulename) {
        regRulename(CK_LT, fRES(rulename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param rulename The value of rulename as greaterEqual.
     */
    public void setRulename_GreaterEqual(String rulename) {
        regRulename(CK_GE, fRES(rulename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param rulename The value of rulename as lessEqual.
     */
    public void setRulename_LessEqual(String rulename) {
        regRulename(CK_LE, fRES(rulename));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param rulename The value of rulename as prefixSearch.
     */
    public void setRulename_PrefixSearch(String rulename) {
        regRulename(CK_PS, fRES(rulename));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param rulename The value of rulename as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRulename_LikeSearch(String rulename, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(rulename), getCValueRulename(), "RuleName", "Rulename", "rulename", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param rulenameList The collection of rulename as inScope.
     */
    public void setRulename_InScope(Collection<String> rulenameList) {
        regRulename(CK_INS, cTL(rulenameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param rulename The collection of rulename as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setRulename_InScope(String rulename, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(rulename), getCValueRulename(), "RuleName", "Rulename", "rulename", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRulename_IsNull() { regRulename(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRulename_IsNotNull() { regRulename(CK_ISNN, DUMMY_OBJECT); }

    protected void regRulename(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRulename(), "RuleName", "Rulename", "rulename");
    }
    protected void registerInlineRulename(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRulename(), "RuleName", "Rulename", "rulename");
    }
    abstract protected ConditionValue getCValueRulename();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param ruletype The value of ruletype as equal.
     */
    public void setRuletype_Equal(String ruletype) {
        regRuletype(CK_EQ, fRES(ruletype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruletype The value of ruletype as notEqual.
     */
    public void setRuletype_NotEqual(String ruletype) {
        regRuletype(CK_NE, fRES(ruletype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruletype The value of ruletype as greaterThan.
     */
    public void setRuletype_GreaterThan(String ruletype) {
        regRuletype(CK_GT, fRES(ruletype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruletype The value of ruletype as lessThan.
     */
    public void setRuletype_LessThan(String ruletype) {
        regRuletype(CK_LT, fRES(ruletype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruletype The value of ruletype as greaterEqual.
     */
    public void setRuletype_GreaterEqual(String ruletype) {
        regRuletype(CK_GE, fRES(ruletype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruletype The value of ruletype as lessEqual.
     */
    public void setRuletype_LessEqual(String ruletype) {
        regRuletype(CK_LE, fRES(ruletype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruletype The value of ruletype as prefixSearch.
     */
    public void setRuletype_PrefixSearch(String ruletype) {
        regRuletype(CK_PS, fRES(ruletype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param ruletype The value of ruletype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRuletype_LikeSearch(String ruletype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(ruletype), getCValueRuletype(), "RuleType", "Ruletype", "ruletype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param ruletypeList The collection of ruletype as inScope.
     */
    public void setRuletype_InScope(Collection<String> ruletypeList) {
        regRuletype(CK_INS, cTL(ruletypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param ruletype The collection of ruletype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setRuletype_InScope(String ruletype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(ruletype), getCValueRuletype(), "RuleType", "Ruletype", "ruletype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRuletype_IsNull() { regRuletype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRuletype_IsNotNull() { regRuletype(CK_ISNN, DUMMY_OBJECT); }

    protected void regRuletype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRuletype(), "RuleType", "Ruletype", "ruletype");
    }
    protected void registerInlineRuletype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRuletype(), "RuleType", "Ruletype", "ruletype");
    }
    abstract protected ConditionValue getCValueRuletype();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param ruleactive The value of ruleactive as equal.
     */
    public void setRuleactive_Equal(java.lang.Integer ruleactive) {
        regRuleactive(CK_EQ, ruleactive);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param ruleactive The value of ruleactive as notEqual.
     */
    public void setRuleactive_NotEqual(java.lang.Integer ruleactive) {
        regRuleactive(CK_NE, ruleactive);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param ruleactive The value of ruleactive as greaterThan.
     */
    public void setRuleactive_GreaterThan(java.lang.Integer ruleactive) {
        regRuleactive(CK_GT, ruleactive);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param ruleactive The value of ruleactive as lessThan.
     */
    public void setRuleactive_LessThan(java.lang.Integer ruleactive) {
        regRuleactive(CK_LT, ruleactive);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param ruleactive The value of ruleactive as greaterEqual.
     */
    public void setRuleactive_GreaterEqual(java.lang.Integer ruleactive) {
        regRuleactive(CK_GE, ruleactive);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param ruleactive The value of ruleactive as lessEqual.
     */
    public void setRuleactive_LessEqual(java.lang.Integer ruleactive) {
        regRuleactive(CK_LE, ruleactive);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param ruleactiveList The collection of ruleactive as inScope.
     */
    public void setRuleactive_InScope(Collection<java.lang.Integer> ruleactiveList) {
        regRuleactive(CK_INS, cTL(ruleactiveList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRuleactive_IsNull() { regRuleactive(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRuleactive_IsNotNull() { regRuleactive(CK_ISNN, DUMMY_OBJECT); }

    protected void regRuleactive(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRuleactive(), "RuleActive", "Ruleactive", "ruleactive");
    }
    protected void registerInlineRuleactive(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRuleactive(), "RuleActive", "Ruleactive", "ruleactive");
    }
    abstract protected ConditionValue getCValueRuleactive();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param errormsg The value of errormsg as equal.
     */
    public void setErrormsg_Equal(String errormsg) {
        regErrormsg(CK_EQ, fRES(errormsg));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param errormsg The value of errormsg as notEqual.
     */
    public void setErrormsg_NotEqual(String errormsg) {
        regErrormsg(CK_NE, fRES(errormsg));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param errormsg The value of errormsg as greaterThan.
     */
    public void setErrormsg_GreaterThan(String errormsg) {
        regErrormsg(CK_GT, fRES(errormsg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param errormsg The value of errormsg as lessThan.
     */
    public void setErrormsg_LessThan(String errormsg) {
        regErrormsg(CK_LT, fRES(errormsg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param errormsg The value of errormsg as greaterEqual.
     */
    public void setErrormsg_GreaterEqual(String errormsg) {
        regErrormsg(CK_GE, fRES(errormsg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param errormsg The value of errormsg as lessEqual.
     */
    public void setErrormsg_LessEqual(String errormsg) {
        regErrormsg(CK_LE, fRES(errormsg));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param errormsg The value of errormsg as prefixSearch.
     */
    public void setErrormsg_PrefixSearch(String errormsg) {
        regErrormsg(CK_PS, fRES(errormsg));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param errormsg The value of errormsg as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrormsg_LikeSearch(String errormsg, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(errormsg), getCValueErrormsg(), "ErrorMsg", "Errormsg", "errormsg", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param errormsgList The collection of errormsg as inScope.
     */
    public void setErrormsg_InScope(Collection<String> errormsgList) {
        regErrormsg(CK_INS, cTL(errormsgList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param errormsg The collection of errormsg as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setErrormsg_InScope(String errormsg, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(errormsg), getCValueErrormsg(), "ErrorMsg", "Errormsg", "errormsg", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setErrormsg_IsNull() { regErrormsg(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setErrormsg_IsNotNull() { regErrormsg(CK_ISNN, DUMMY_OBJECT); }

    protected void regErrormsg(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueErrormsg(), "ErrorMsg", "Errormsg", "errormsg");
    }
    protected void registerInlineErrormsg(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueErrormsg(), "ErrorMsg", "Errormsg", "errormsg");
    }
    abstract protected ConditionValue getCValueErrormsg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param flags The value of flags as equal.
     */
    public void setFlags_Equal(String flags) {
        regFlags(CK_EQ, fRES(flags));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param flags The value of flags as notEqual.
     */
    public void setFlags_NotEqual(String flags) {
        regFlags(CK_NE, fRES(flags));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param flags The value of flags as greaterThan.
     */
    public void setFlags_GreaterThan(String flags) {
        regFlags(CK_GT, fRES(flags));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param flags The value of flags as lessThan.
     */
    public void setFlags_LessThan(String flags) {
        regFlags(CK_LT, fRES(flags));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param flags The value of flags as greaterEqual.
     */
    public void setFlags_GreaterEqual(String flags) {
        regFlags(CK_GE, fRES(flags));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param flags The value of flags as lessEqual.
     */
    public void setFlags_LessEqual(String flags) {
        regFlags(CK_LE, fRES(flags));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param flags The value of flags as prefixSearch.
     */
    public void setFlags_PrefixSearch(String flags) {
        regFlags(CK_PS, fRES(flags));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param flags The value of flags as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFlags_LikeSearch(String flags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(flags), getCValueFlags(), "Flags", "Flags", "flags", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param flagsList The collection of flags as inScope.
     */
    public void setFlags_InScope(Collection<String> flagsList) {
        regFlags(CK_INS, cTL(flagsList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param flags The collection of flags as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setFlags_InScope(String flags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(flags), getCValueFlags(), "Flags", "Flags", "flags", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setFlags_IsNull() { regFlags(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setFlags_IsNotNull() { regFlags(CK_ISNN, DUMMY_OBJECT); }

    protected void regFlags(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFlags(), "Flags", "Flags", "flags");
    }
    protected void registerInlineFlags(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFlags(), "Flags", "Flags", "flags");
    }
    abstract protected ConditionValue getCValueFlags();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param ruleocl The value of ruleocl as equal.
     */
    public void setRuleocl_Equal(String ruleocl) {
        regRuleocl(CK_EQ, fRES(ruleocl));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruleocl The value of ruleocl as notEqual.
     */
    public void setRuleocl_NotEqual(String ruleocl) {
        regRuleocl(CK_NE, fRES(ruleocl));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruleocl The value of ruleocl as greaterThan.
     */
    public void setRuleocl_GreaterThan(String ruleocl) {
        regRuleocl(CK_GT, fRES(ruleocl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruleocl The value of ruleocl as lessThan.
     */
    public void setRuleocl_LessThan(String ruleocl) {
        regRuleocl(CK_LT, fRES(ruleocl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruleocl The value of ruleocl as greaterEqual.
     */
    public void setRuleocl_GreaterEqual(String ruleocl) {
        regRuleocl(CK_GE, fRES(ruleocl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruleocl The value of ruleocl as lessEqual.
     */
    public void setRuleocl_LessEqual(String ruleocl) {
        regRuleocl(CK_LE, fRES(ruleocl));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param ruleocl The value of ruleocl as prefixSearch.
     */
    public void setRuleocl_PrefixSearch(String ruleocl) {
        regRuleocl(CK_PS, fRES(ruleocl));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param ruleocl The value of ruleocl as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRuleocl_LikeSearch(String ruleocl, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(ruleocl), getCValueRuleocl(), "RuleOCL", "Ruleocl", "ruleocl", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param ruleoclList The collection of ruleocl as inScope.
     */
    public void setRuleocl_InScope(Collection<String> ruleoclList) {
        regRuleocl(CK_INS, cTL(ruleoclList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param ruleocl The collection of ruleocl as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setRuleocl_InScope(String ruleocl, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(ruleocl), getCValueRuleocl(), "RuleOCL", "Ruleocl", "ruleocl", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRuleocl_IsNull() { regRuleocl(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRuleocl_IsNotNull() { regRuleocl(CK_ISNN, DUMMY_OBJECT); }

    protected void regRuleocl(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRuleocl(), "RuleOCL", "Ruleocl", "ruleocl");
    }
    protected void registerInlineRuleocl(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRuleocl(), "RuleOCL", "Ruleocl", "ruleocl");
    }
    abstract protected ConditionValue getCValueRuleocl();

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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param rulexml The value of rulexml as equal.
     */
    public void setRulexml_Equal(String rulexml) {
        regRulexml(CK_EQ, fRES(rulexml));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param rulexml The value of rulexml as notEqual.
     */
    public void setRulexml_NotEqual(String rulexml) {
        regRulexml(CK_NE, fRES(rulexml));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param rulexml The value of rulexml as greaterThan.
     */
    public void setRulexml_GreaterThan(String rulexml) {
        regRulexml(CK_GT, fRES(rulexml));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param rulexml The value of rulexml as lessThan.
     */
    public void setRulexml_LessThan(String rulexml) {
        regRulexml(CK_LT, fRES(rulexml));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param rulexml The value of rulexml as greaterEqual.
     */
    public void setRulexml_GreaterEqual(String rulexml) {
        regRulexml(CK_GE, fRES(rulexml));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param rulexml The value of rulexml as lessEqual.
     */
    public void setRulexml_LessEqual(String rulexml) {
        regRulexml(CK_LE, fRES(rulexml));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param rulexml The value of rulexml as prefixSearch.
     */
    public void setRulexml_PrefixSearch(String rulexml) {
        regRulexml(CK_PS, fRES(rulexml));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param rulexml The value of rulexml as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRulexml_LikeSearch(String rulexml, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(rulexml), getCValueRulexml(), "RuleXML", "Rulexml", "rulexml", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param rulexmlList The collection of rulexml as inScope.
     */
    public void setRulexml_InScope(Collection<String> rulexmlList) {
        regRulexml(CK_INS, cTL(rulexmlList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param rulexml The collection of rulexml as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setRulexml_InScope(String rulexml, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(rulexml), getCValueRulexml(), "RuleXML", "Rulexml", "rulexml", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRulexml_IsNull() { regRulexml(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRulexml_IsNotNull() { regRulexml(CK_ISNN, DUMMY_OBJECT); }

    protected void regRulexml(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRulexml(), "RuleXML", "Rulexml", "rulexml");
    }
    protected void registerInlineRulexml(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRulexml(), "RuleXML", "Rulexml", "rulexml");
    }
    abstract protected ConditionValue getCValueRulexml();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TRulesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TRulesCQ.class.getName(); }
}
