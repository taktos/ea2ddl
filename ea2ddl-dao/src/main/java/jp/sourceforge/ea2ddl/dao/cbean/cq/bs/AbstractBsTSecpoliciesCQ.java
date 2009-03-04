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
 * The abstract condition-query of t_secpolicies.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTSecpoliciesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSecpoliciesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_secpolicies";
    }
    
    public String getTableSqlName() {
        return "t_secpolicies";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(100)}
     * @param property The value of property as equal.
     */
    public void setProperty_Equal(String property) {
        regProperty(CK_EQ, fRES(property));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param property The value of property as notEqual.
     */
    public void setProperty_NotEqual(String property) {
        regProperty(CK_NE, fRES(property));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param property The value of property as greaterThan.
     */
    public void setProperty_GreaterThan(String property) {
        regProperty(CK_GT, fRES(property));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param property The value of property as lessThan.
     */
    public void setProperty_LessThan(String property) {
        regProperty(CK_LT, fRES(property));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param property The value of property as greaterEqual.
     */
    public void setProperty_GreaterEqual(String property) {
        regProperty(CK_GE, fRES(property));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param property The value of property as lessEqual.
     */
    public void setProperty_LessEqual(String property) {
        regProperty(CK_LE, fRES(property));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param property The value of property as prefixSearch.
     */
    public void setProperty_PrefixSearch(String property) {
        regProperty(CK_PS, fRES(property));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param propertyList The collection of property as inScope.
     */
    public void setProperty_InScope(Collection<String> propertyList) {
        regProperty(CK_INS, cTL(propertyList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param property The value of property as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProperty_LikeSearch(String property, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(property), getCValueProperty(), "Property", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param property The value of property as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProperty_NotLikeSearch(String property, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(property), getCValueProperty(), "Property", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setProperty_IsNull() { regProperty(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setProperty_IsNotNull() { regProperty(CK_ISNN, DOBJ); }

    protected void regProperty(ConditionKey k, Object v) { regQ(k, v, getCValueProperty(), "Property"); }
    abstract protected ConditionValue getCValueProperty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param value The value of value as equal.
     */
    public void setValue_Equal(String value) {
        regValue(CK_EQ, fRES(value));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param value The value of value as notEqual.
     */
    public void setValue_NotEqual(String value) {
        regValue(CK_NE, fRES(value));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param value The value of value as greaterThan.
     */
    public void setValue_GreaterThan(String value) {
        regValue(CK_GT, fRES(value));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param value The value of value as lessThan.
     */
    public void setValue_LessThan(String value) {
        regValue(CK_LT, fRES(value));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param value The value of value as greaterEqual.
     */
    public void setValue_GreaterEqual(String value) {
        regValue(CK_GE, fRES(value));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param value The value of value as lessEqual.
     */
    public void setValue_LessEqual(String value) {
        regValue(CK_LE, fRES(value));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param value The value of value as prefixSearch.
     */
    public void setValue_PrefixSearch(String value) {
        regValue(CK_PS, fRES(value));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param valueList The collection of value as inScope.
     */
    public void setValue_InScope(Collection<String> valueList) {
        regValue(CK_INS, cTL(valueList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param value The value of value as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setValue_LikeSearch(String value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(value), getCValueValue(), "Value", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param value The value of value as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setValue_NotLikeSearch(String value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(value), getCValueValue(), "Value", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setValue_IsNull() { regValue(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setValue_IsNotNull() { regValue(CK_ISNN, DOBJ); }

    protected void regValue(ConditionKey k, Object v) { regQ(k, v, getCValueValue(), "Value"); }
    abstract protected ConditionValue getCValueValue();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TSecpoliciesCB.class.getName(); }
    String xCQ() { return TSecpoliciesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
