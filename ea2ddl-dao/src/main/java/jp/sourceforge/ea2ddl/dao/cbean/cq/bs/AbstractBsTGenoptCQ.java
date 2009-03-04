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
 * The abstract condition-query of t_genopt.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTGenoptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTGenoptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_genopt";
    }
    
    public String getTableSqlName() {
        return "t_genopt";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(12)}
     * @param appliesto The value of appliesto as equal.
     */
    public void setAppliesto_Equal(String appliesto) {
        regAppliesto(CK_EQ, fRES(appliesto));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as notEqual.
     */
    public void setAppliesto_NotEqual(String appliesto) {
        regAppliesto(CK_NE, fRES(appliesto));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as greaterThan.
     */
    public void setAppliesto_GreaterThan(String appliesto) {
        regAppliesto(CK_GT, fRES(appliesto));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as lessThan.
     */
    public void setAppliesto_LessThan(String appliesto) {
        regAppliesto(CK_LT, fRES(appliesto));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as greaterEqual.
     */
    public void setAppliesto_GreaterEqual(String appliesto) {
        regAppliesto(CK_GE, fRES(appliesto));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as lessEqual.
     */
    public void setAppliesto_LessEqual(String appliesto) {
        regAppliesto(CK_LE, fRES(appliesto));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as prefixSearch.
     */
    public void setAppliesto_PrefixSearch(String appliesto) {
        regAppliesto(CK_PS, fRES(appliesto));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param appliestoList The collection of appliesto as inScope.
     */
    public void setAppliesto_InScope(Collection<String> appliestoList) {
        regAppliesto(CK_INS, cTL(appliestoList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param appliesto The value of appliesto as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAppliesto_LikeSearch(String appliesto, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(appliesto), getCValueAppliesto(), "AppliesTo", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param appliesto The value of appliesto as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAppliesto_NotLikeSearch(String appliesto, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(appliesto), getCValueAppliesto(), "AppliesTo", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setAppliesto_IsNull() { regAppliesto(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setAppliesto_IsNotNull() { regAppliesto(CK_ISNN, DOBJ); }

    protected void regAppliesto(ConditionKey k, Object v) { regQ(k, v, getCValueAppliesto(), "AppliesTo"); }
    abstract protected ConditionValue getCValueAppliesto();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param option The value of option as equal.
     */
    public void setOption_Equal(String option) {
        regOption(CK_EQ, fRES(option));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param option The value of option as notEqual.
     */
    public void setOption_NotEqual(String option) {
        regOption(CK_NE, fRES(option));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param option The value of option as greaterThan.
     */
    public void setOption_GreaterThan(String option) {
        regOption(CK_GT, fRES(option));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param option The value of option as lessThan.
     */
    public void setOption_LessThan(String option) {
        regOption(CK_LT, fRES(option));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param option The value of option as greaterEqual.
     */
    public void setOption_GreaterEqual(String option) {
        regOption(CK_GE, fRES(option));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param option The value of option as lessEqual.
     */
    public void setOption_LessEqual(String option) {
        regOption(CK_LE, fRES(option));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param option The value of option as prefixSearch.
     */
    public void setOption_PrefixSearch(String option) {
        regOption(CK_PS, fRES(option));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param optionList The collection of option as inScope.
     */
    public void setOption_InScope(Collection<String> optionList) {
        regOption(CK_INS, cTL(optionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param option The value of option as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOption_LikeSearch(String option, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(option), getCValueOption(), "Option", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param option The value of option as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOption_NotLikeSearch(String option, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(option), getCValueOption(), "Option", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setOption_IsNull() { regOption(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setOption_IsNotNull() { regOption(CK_ISNN, DOBJ); }

    protected void regOption(ConditionKey k, Object v) { regQ(k, v, getCValueOption(), "Option"); }
    abstract protected ConditionValue getCValueOption();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TGenoptCB.class.getName(); }
    String xCQ() { return TGenoptCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
