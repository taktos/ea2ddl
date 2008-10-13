package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_complexitytypes.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTComplexitytypesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTComplexitytypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_complexitytypes";
    }
    
    public String getTableSqlName() {
        return "t_complexitytypes";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(50)}
     * @param complexity The value of complexity as equal.
     */
    public void setComplexity_Equal(String complexity) {
        regComplexity(CK_EQ, fRES(complexity));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param complexity The value of complexity as notEqual.
     */
    public void setComplexity_NotEqual(String complexity) {
        regComplexity(CK_NE, fRES(complexity));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param complexity The value of complexity as greaterThan.
     */
    public void setComplexity_GreaterThan(String complexity) {
        regComplexity(CK_GT, fRES(complexity));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param complexity The value of complexity as lessThan.
     */
    public void setComplexity_LessThan(String complexity) {
        regComplexity(CK_LT, fRES(complexity));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param complexity The value of complexity as greaterEqual.
     */
    public void setComplexity_GreaterEqual(String complexity) {
        regComplexity(CK_GE, fRES(complexity));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param complexity The value of complexity as lessEqual.
     */
    public void setComplexity_LessEqual(String complexity) {
        regComplexity(CK_LE, fRES(complexity));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param complexity The value of complexity as prefixSearch.
     */
    public void setComplexity_PrefixSearch(String complexity) {
        regComplexity(CK_PS, fRES(complexity));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param complexity The value of complexity as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComplexity_LikeSearch(String complexity, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(complexity), getCValueComplexity(), "Complexity", "Complexity", "complexity", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param complexityList The collection of complexity as inScope.
     */
    public void setComplexity_InScope(Collection<String> complexityList) {
        regComplexity(CK_INS, cTL(complexityList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param complexity The collection of complexity as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setComplexity_InScope(String complexity, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(complexity), getCValueComplexity(), "Complexity", "Complexity", "complexity", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setComplexity_IsNull() { regComplexity(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setComplexity_IsNotNull() { regComplexity(CK_ISNN, DUMMY_OBJECT); }

    protected void regComplexity(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueComplexity(), "Complexity", "Complexity", "complexity");
    }
    protected void registerInlineComplexity(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueComplexity(), "Complexity", "Complexity", "complexity");
    }
    abstract protected ConditionValue getCValueComplexity();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param numericweight The value of numericweight as equal.
     */
    public void setNumericweight_Equal(java.lang.Integer numericweight) {
        regNumericweight(CK_EQ, numericweight);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param numericweight The value of numericweight as notEqual.
     */
    public void setNumericweight_NotEqual(java.lang.Integer numericweight) {
        regNumericweight(CK_NE, numericweight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param numericweight The value of numericweight as greaterThan.
     */
    public void setNumericweight_GreaterThan(java.lang.Integer numericweight) {
        regNumericweight(CK_GT, numericweight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param numericweight The value of numericweight as lessThan.
     */
    public void setNumericweight_LessThan(java.lang.Integer numericweight) {
        regNumericweight(CK_LT, numericweight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param numericweight The value of numericweight as greaterEqual.
     */
    public void setNumericweight_GreaterEqual(java.lang.Integer numericweight) {
        regNumericweight(CK_GE, numericweight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param numericweight The value of numericweight as lessEqual.
     */
    public void setNumericweight_LessEqual(java.lang.Integer numericweight) {
        regNumericweight(CK_LE, numericweight);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param numericweightList The collection of numericweight as inScope.
     */
    public void setNumericweight_InScope(Collection<java.lang.Integer> numericweightList) {
        regNumericweight(CK_INS, cTL(numericweightList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNumericweight_IsNull() { regNumericweight(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNumericweight_IsNotNull() { regNumericweight(CK_ISNN, DUMMY_OBJECT); }

    protected void regNumericweight(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNumericweight(), "NumericWeight", "Numericweight", "numericweight");
    }
    protected void registerInlineNumericweight(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNumericweight(), "NumericWeight", "Numericweight", "numericweight");
    }
    abstract protected ConditionValue getCValueNumericweight();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TComplexitytypesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TComplexitytypesCQ.class.getName(); }
}
