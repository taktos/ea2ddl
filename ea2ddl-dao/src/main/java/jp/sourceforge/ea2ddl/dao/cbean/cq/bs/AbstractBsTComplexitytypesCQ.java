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
 * The abstract condition-query of t_complexitytypes.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTComplexitytypesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTComplexitytypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_complexitytypes";
    }
    
    public String getTableSqlName() {
        return "t_complexitytypes";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(50)}
     * @param complexity The value of complexity as equal.
     */
    public void setComplexity_Equal(String complexity) {
        regComplexity(CK_EQ, fRES(complexity));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param complexity The value of complexity as notEqual.
     */
    public void setComplexity_NotEqual(String complexity) {
        regComplexity(CK_NE, fRES(complexity));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param complexity The value of complexity as greaterThan.
     */
    public void setComplexity_GreaterThan(String complexity) {
        regComplexity(CK_GT, fRES(complexity));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param complexity The value of complexity as lessThan.
     */
    public void setComplexity_LessThan(String complexity) {
        regComplexity(CK_LT, fRES(complexity));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param complexity The value of complexity as greaterEqual.
     */
    public void setComplexity_GreaterEqual(String complexity) {
        regComplexity(CK_GE, fRES(complexity));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param complexity The value of complexity as lessEqual.
     */
    public void setComplexity_LessEqual(String complexity) {
        regComplexity(CK_LE, fRES(complexity));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param complexity The value of complexity as prefixSearch.
     */
    public void setComplexity_PrefixSearch(String complexity) {
        regComplexity(CK_PS, fRES(complexity));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param complexityList The collection of complexity as inScope.
     */
    public void setComplexity_InScope(Collection<String> complexityList) {
        regComplexity(CK_INS, cTL(complexityList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param complexity The value of complexity as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComplexity_LikeSearch(String complexity, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(complexity), getCValueComplexity(), "Complexity", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param complexity The value of complexity as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setComplexity_NotLikeSearch(String complexity, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(complexity), getCValueComplexity(), "Complexity", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setComplexity_IsNull() { regComplexity(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setComplexity_IsNotNull() { regComplexity(CK_ISNN, DOBJ); }

    protected void regComplexity(ConditionKey k, Object v) { regQ(k, v, getCValueComplexity(), "Complexity"); }
    abstract protected ConditionValue getCValueComplexity();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param numericweight The value of numericweight as equal.
     */
    public void setNumericweight_Equal(java.lang.Integer numericweight) {
        regNumericweight(CK_EQ, numericweight);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param numericweight The value of numericweight as notEqual.
     */
    public void setNumericweight_NotEqual(java.lang.Integer numericweight) {
        regNumericweight(CK_NE, numericweight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param numericweight The value of numericweight as greaterThan.
     */
    public void setNumericweight_GreaterThan(java.lang.Integer numericweight) {
        regNumericweight(CK_GT, numericweight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param numericweight The value of numericweight as lessThan.
     */
    public void setNumericweight_LessThan(java.lang.Integer numericweight) {
        regNumericweight(CK_LT, numericweight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param numericweight The value of numericweight as greaterEqual.
     */
    public void setNumericweight_GreaterEqual(java.lang.Integer numericweight) {
        regNumericweight(CK_GE, numericweight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNumericweight_IsNull() { regNumericweight(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNumericweight_IsNotNull() { regNumericweight(CK_ISNN, DOBJ); }

    protected void regNumericweight(ConditionKey k, Object v) { regQ(k, v, getCValueNumericweight(), "NumericWeight"); }
    abstract protected ConditionValue getCValueNumericweight();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TComplexitytypesCB.class.getName(); }
    String xCQ() { return TComplexitytypesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
