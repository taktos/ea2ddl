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
 * The abstract condition-query of t_testclass.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTestclassCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTestclassCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_testclass";
    }
    
    public String getTableSqlName() {
        return "t_testclass";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(50)}
     * @param testclass The value of testclass as equal.
     */
    public void setTestclass_Equal(String testclass) {
        regTestclass(CK_EQ, fRES(testclass));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testclass The value of testclass as notEqual.
     */
    public void setTestclass_NotEqual(String testclass) {
        regTestclass(CK_NE, fRES(testclass));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testclass The value of testclass as greaterThan.
     */
    public void setTestclass_GreaterThan(String testclass) {
        regTestclass(CK_GT, fRES(testclass));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testclass The value of testclass as lessThan.
     */
    public void setTestclass_LessThan(String testclass) {
        regTestclass(CK_LT, fRES(testclass));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testclass The value of testclass as greaterEqual.
     */
    public void setTestclass_GreaterEqual(String testclass) {
        regTestclass(CK_GE, fRES(testclass));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testclass The value of testclass as lessEqual.
     */
    public void setTestclass_LessEqual(String testclass) {
        regTestclass(CK_LE, fRES(testclass));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testclass The value of testclass as prefixSearch.
     */
    public void setTestclass_PrefixSearch(String testclass) {
        regTestclass(CK_PS, fRES(testclass));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param testclassList The collection of testclass as inScope.
     */
    public void setTestclass_InScope(Collection<String> testclassList) {
        regTestclass(CK_INS, cTL(testclassList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param testclass The value of testclass as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTestclass_LikeSearch(String testclass, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(testclass), getCValueTestclass(), "TestClass", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param testclass The value of testclass as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTestclass_NotLikeSearch(String testclass, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(testclass), getCValueTestclass(), "TestClass", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTestclass_IsNull() { regTestclass(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTestclass_IsNotNull() { regTestclass(CK_ISNN, DOBJ); }

    protected void regTestclass(ConditionKey k, Object v) { regQ(k, v, getCValueTestclass(), "TestClass"); }
    abstract protected ConditionValue getCValueTestclass();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param description The value of description as equal.
     */
    public void setDescription_Equal(String description) {
        regDescription(CK_EQ, fRES(description));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as notEqual.
     */
    public void setDescription_NotEqual(String description) {
        regDescription(CK_NE, fRES(description));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as greaterThan.
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as lessThan.
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as greaterEqual.
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as lessEqual.
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as prefixSearch.
     */
    public void setDescription_PrefixSearch(String description) {
        regDescription(CK_PS, fRES(description));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param descriptionList The collection of description as inScope.
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        regDescription(CK_INS, cTL(descriptionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), getCValueDescription(), "Description", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), getCValueDescription(), "Description", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDescription_IsNull() { regDescription(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDescription_IsNotNull() { regDescription(CK_ISNN, DOBJ); }

    protected void regDescription(ConditionKey k, Object v) { regQ(k, v, getCValueDescription(), "Description"); }
    abstract protected ConditionValue getCValueDescription();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TTestclassCB.class.getName(); }
    String xCQ() { return TTestclassCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
