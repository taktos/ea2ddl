package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_genopt.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTGenoptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTGenoptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_genopt";
    }
    
    public String getTableSqlName() {
        return "t_genopt";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(12)}
     * @param appliesto The value of appliesto as equal.
     */
    public void setAppliesto_Equal(String appliesto) {
        regAppliesto(CK_EQ, fRES(appliesto));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as notEqual.
     */
    public void setAppliesto_NotEqual(String appliesto) {
        regAppliesto(CK_NE, fRES(appliesto));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as greaterThan.
     */
    public void setAppliesto_GreaterThan(String appliesto) {
        regAppliesto(CK_GT, fRES(appliesto));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as lessThan.
     */
    public void setAppliesto_LessThan(String appliesto) {
        regAppliesto(CK_LT, fRES(appliesto));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as greaterEqual.
     */
    public void setAppliesto_GreaterEqual(String appliesto) {
        regAppliesto(CK_GE, fRES(appliesto));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as lessEqual.
     */
    public void setAppliesto_LessEqual(String appliesto) {
        regAppliesto(CK_LE, fRES(appliesto));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as prefixSearch.
     */
    public void setAppliesto_PrefixSearch(String appliesto) {
        regAppliesto(CK_PS, fRES(appliesto));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param appliesto The value of appliesto as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAppliesto_LikeSearch(String appliesto, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(appliesto), getCValueAppliesto(), "AppliesTo", "Appliesto", "appliesto", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param appliestoList The collection of appliesto as inScope.
     */
    public void setAppliesto_InScope(Collection<String> appliestoList) {
        regAppliesto(CK_INS, cTL(appliestoList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param appliesto The collection of appliesto as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setAppliesto_InScope(String appliesto, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(appliesto), getCValueAppliesto(), "AppliesTo", "Appliesto", "appliesto", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setAppliesto_IsNull() { regAppliesto(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setAppliesto_IsNotNull() { regAppliesto(CK_ISNN, DUMMY_OBJECT); }

    protected void regAppliesto(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAppliesto(), "AppliesTo", "Appliesto", "appliesto");
    }
    protected void registerInlineAppliesto(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAppliesto(), "AppliesTo", "Appliesto", "appliesto");
    }
    abstract protected ConditionValue getCValueAppliesto();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param option The value of option as equal.
     */
    public void setOption_Equal(String option) {
        regOption(CK_EQ, fRES(option));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param option The value of option as notEqual.
     */
    public void setOption_NotEqual(String option) {
        regOption(CK_NE, fRES(option));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param option The value of option as greaterThan.
     */
    public void setOption_GreaterThan(String option) {
        regOption(CK_GT, fRES(option));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param option The value of option as lessThan.
     */
    public void setOption_LessThan(String option) {
        regOption(CK_LT, fRES(option));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param option The value of option as greaterEqual.
     */
    public void setOption_GreaterEqual(String option) {
        regOption(CK_GE, fRES(option));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param option The value of option as lessEqual.
     */
    public void setOption_LessEqual(String option) {
        regOption(CK_LE, fRES(option));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param option The value of option as prefixSearch.
     */
    public void setOption_PrefixSearch(String option) {
        regOption(CK_PS, fRES(option));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param option The value of option as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOption_LikeSearch(String option, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(option), getCValueOption(), "Option", "Option", "option", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param optionList The collection of option as inScope.
     */
    public void setOption_InScope(Collection<String> optionList) {
        regOption(CK_INS, cTL(optionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param option The collection of option as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setOption_InScope(String option, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(option), getCValueOption(), "Option", "Option", "option", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setOption_IsNull() { regOption(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setOption_IsNotNull() { regOption(CK_ISNN, DUMMY_OBJECT); }

    protected void regOption(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueOption(), "Option", "Option", "option");
    }
    protected void registerInlineOption(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueOption(), "Option", "Option", "option");
    }
    abstract protected ConditionValue getCValueOption();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TGenoptCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TGenoptCQ.class.getName(); }
}
