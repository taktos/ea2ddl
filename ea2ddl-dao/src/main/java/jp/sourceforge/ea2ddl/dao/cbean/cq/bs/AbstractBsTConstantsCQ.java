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
 * The abstract condition-query of t_constants.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTConstantsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTConstantsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_constants";
    }
    
    public String getTableSqlName() {
        return "t_constants";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(50)}
     * @param constantname The value of constantname as equal.
     */
    public void setConstantname_Equal(String constantname) {
        regConstantname(CK_EQ, fRES(constantname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constantname The value of constantname as notEqual.
     */
    public void setConstantname_NotEqual(String constantname) {
        regConstantname(CK_NE, fRES(constantname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constantname The value of constantname as greaterThan.
     */
    public void setConstantname_GreaterThan(String constantname) {
        regConstantname(CK_GT, fRES(constantname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constantname The value of constantname as lessThan.
     */
    public void setConstantname_LessThan(String constantname) {
        regConstantname(CK_LT, fRES(constantname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constantname The value of constantname as greaterEqual.
     */
    public void setConstantname_GreaterEqual(String constantname) {
        regConstantname(CK_GE, fRES(constantname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constantname The value of constantname as lessEqual.
     */
    public void setConstantname_LessEqual(String constantname) {
        regConstantname(CK_LE, fRES(constantname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constantname The value of constantname as prefixSearch.
     */
    public void setConstantname_PrefixSearch(String constantname) {
        regConstantname(CK_PS, fRES(constantname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constantnameList The collection of constantname as inScope.
     */
    public void setConstantname_InScope(Collection<String> constantnameList) {
        regConstantname(CK_INS, cTL(constantnameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constantname The value of constantname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstantname_LikeSearch(String constantname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(constantname), getCValueConstantname(), "ConstantName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constantname The value of constantname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConstantname_NotLikeSearch(String constantname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(constantname), getCValueConstantname(), "ConstantName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setConstantname_IsNull() { regConstantname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setConstantname_IsNotNull() { regConstantname(CK_ISNN, DOBJ); }

    protected void regConstantname(ConditionKey k, Object v) { regQ(k, v, getCValueConstantname(), "ConstantName"); }
    abstract protected ConditionValue getCValueConstantname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param constantvalue The value of constantvalue as equal.
     */
    public void setConstantvalue_Equal(String constantvalue) {
        regConstantvalue(CK_EQ, fRES(constantvalue));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constantvalue The value of constantvalue as notEqual.
     */
    public void setConstantvalue_NotEqual(String constantvalue) {
        regConstantvalue(CK_NE, fRES(constantvalue));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constantvalue The value of constantvalue as greaterThan.
     */
    public void setConstantvalue_GreaterThan(String constantvalue) {
        regConstantvalue(CK_GT, fRES(constantvalue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constantvalue The value of constantvalue as lessThan.
     */
    public void setConstantvalue_LessThan(String constantvalue) {
        regConstantvalue(CK_LT, fRES(constantvalue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constantvalue The value of constantvalue as greaterEqual.
     */
    public void setConstantvalue_GreaterEqual(String constantvalue) {
        regConstantvalue(CK_GE, fRES(constantvalue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constantvalue The value of constantvalue as lessEqual.
     */
    public void setConstantvalue_LessEqual(String constantvalue) {
        regConstantvalue(CK_LE, fRES(constantvalue));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constantvalue The value of constantvalue as prefixSearch.
     */
    public void setConstantvalue_PrefixSearch(String constantvalue) {
        regConstantvalue(CK_PS, fRES(constantvalue));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constantvalueList The collection of constantvalue as inScope.
     */
    public void setConstantvalue_InScope(Collection<String> constantvalueList) {
        regConstantvalue(CK_INS, cTL(constantvalueList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constantvalue The value of constantvalue as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstantvalue_LikeSearch(String constantvalue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(constantvalue), getCValueConstantvalue(), "ConstantValue", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constantvalue The value of constantvalue as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConstantvalue_NotLikeSearch(String constantvalue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(constantvalue), getCValueConstantvalue(), "ConstantValue", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setConstantvalue_IsNull() { regConstantvalue(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setConstantvalue_IsNotNull() { regConstantvalue(CK_ISNN, DOBJ); }

    protected void regConstantvalue(ConditionKey k, Object v) { regQ(k, v, getCValueConstantvalue(), "ConstantValue"); }
    abstract protected ConditionValue getCValueConstantvalue();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TConstantsCB.class.getName(); }
    String xCQ() { return TConstantsCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
