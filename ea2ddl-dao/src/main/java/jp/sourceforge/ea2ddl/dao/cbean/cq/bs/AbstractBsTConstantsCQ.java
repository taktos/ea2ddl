package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_constants.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTConstantsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTConstantsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(50)}
     * @param constantname The value of constantname as equal.
     */
    public void setConstantname_Equal(String constantname) {
        regConstantname(CK_EQ, fRES(constantname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constantname The value of constantname as notEqual.
     */
    public void setConstantname_NotEqual(String constantname) {
        regConstantname(CK_NE, fRES(constantname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param constantname The value of constantname as greaterThan.
     */
    public void setConstantname_GreaterThan(String constantname) {
        regConstantname(CK_GT, fRES(constantname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param constantname The value of constantname as lessThan.
     */
    public void setConstantname_LessThan(String constantname) {
        regConstantname(CK_LT, fRES(constantname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constantname The value of constantname as greaterEqual.
     */
    public void setConstantname_GreaterEqual(String constantname) {
        regConstantname(CK_GE, fRES(constantname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constantname The value of constantname as lessEqual.
     */
    public void setConstantname_LessEqual(String constantname) {
        regConstantname(CK_LE, fRES(constantname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param constantname The value of constantname as prefixSearch.
     */
    public void setConstantname_PrefixSearch(String constantname) {
        regConstantname(CK_PS, fRES(constantname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constantname The value of constantname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstantname_LikeSearch(String constantname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(constantname), getCValueConstantname(), "ConstantName", "Constantname", "constantname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constantnameList The collection of constantname as inScope.
     */
    public void setConstantname_InScope(Collection<String> constantnameList) {
        regConstantname(CK_INS, cTL(constantnameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constantname The collection of constantname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setConstantname_InScope(String constantname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(constantname), getCValueConstantname(), "ConstantName", "Constantname", "constantname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setConstantname_IsNull() { regConstantname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setConstantname_IsNotNull() { regConstantname(CK_ISNN, DUMMY_OBJECT); }

    protected void regConstantname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueConstantname(), "ConstantName", "Constantname", "constantname");
    }
    protected void registerInlineConstantname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueConstantname(), "ConstantName", "Constantname", "constantname");
    }
    abstract protected ConditionValue getCValueConstantname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param constantvalue The value of constantvalue as equal.
     */
    public void setConstantvalue_Equal(String constantvalue) {
        regConstantvalue(CK_EQ, fRES(constantvalue));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constantvalue The value of constantvalue as notEqual.
     */
    public void setConstantvalue_NotEqual(String constantvalue) {
        regConstantvalue(CK_NE, fRES(constantvalue));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param constantvalue The value of constantvalue as greaterThan.
     */
    public void setConstantvalue_GreaterThan(String constantvalue) {
        regConstantvalue(CK_GT, fRES(constantvalue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param constantvalue The value of constantvalue as lessThan.
     */
    public void setConstantvalue_LessThan(String constantvalue) {
        regConstantvalue(CK_LT, fRES(constantvalue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constantvalue The value of constantvalue as greaterEqual.
     */
    public void setConstantvalue_GreaterEqual(String constantvalue) {
        regConstantvalue(CK_GE, fRES(constantvalue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constantvalue The value of constantvalue as lessEqual.
     */
    public void setConstantvalue_LessEqual(String constantvalue) {
        regConstantvalue(CK_LE, fRES(constantvalue));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param constantvalue The value of constantvalue as prefixSearch.
     */
    public void setConstantvalue_PrefixSearch(String constantvalue) {
        regConstantvalue(CK_PS, fRES(constantvalue));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constantvalue The value of constantvalue as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstantvalue_LikeSearch(String constantvalue, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(constantvalue), getCValueConstantvalue(), "ConstantValue", "Constantvalue", "constantvalue", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constantvalueList The collection of constantvalue as inScope.
     */
    public void setConstantvalue_InScope(Collection<String> constantvalueList) {
        regConstantvalue(CK_INS, cTL(constantvalueList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constantvalue The collection of constantvalue as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setConstantvalue_InScope(String constantvalue, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(constantvalue), getCValueConstantvalue(), "ConstantValue", "Constantvalue", "constantvalue", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setConstantvalue_IsNull() { regConstantvalue(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setConstantvalue_IsNotNull() { regConstantvalue(CK_ISNN, DUMMY_OBJECT); }

    protected void regConstantvalue(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueConstantvalue(), "ConstantValue", "Constantvalue", "constantvalue");
    }
    protected void registerInlineConstantvalue(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueConstantvalue(), "ConstantValue", "Constantvalue", "constantvalue");
    }
    abstract protected ConditionValue getCValueConstantvalue();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TConstantsCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TConstantsCQ.class.getName(); }
}
