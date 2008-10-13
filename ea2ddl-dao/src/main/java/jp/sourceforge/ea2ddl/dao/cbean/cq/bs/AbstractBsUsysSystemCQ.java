package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of usys_system.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsUsysSystemCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUsysSystemCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "usys_system";
    }
    
    public String getTableSqlName() {
        return "usys_system";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(50)}
     * @param property The value of property as equal.
     */
    public void setProperty_Equal(String property) {
        regProperty(CK_EQ, fRES(property));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param property The value of property as notEqual.
     */
    public void setProperty_NotEqual(String property) {
        regProperty(CK_NE, fRES(property));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param property The value of property as greaterThan.
     */
    public void setProperty_GreaterThan(String property) {
        regProperty(CK_GT, fRES(property));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param property The value of property as lessThan.
     */
    public void setProperty_LessThan(String property) {
        regProperty(CK_LT, fRES(property));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param property The value of property as greaterEqual.
     */
    public void setProperty_GreaterEqual(String property) {
        regProperty(CK_GE, fRES(property));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param property The value of property as lessEqual.
     */
    public void setProperty_LessEqual(String property) {
        regProperty(CK_LE, fRES(property));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param property The value of property as prefixSearch.
     */
    public void setProperty_PrefixSearch(String property) {
        regProperty(CK_PS, fRES(property));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param property The value of property as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProperty_LikeSearch(String property, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(property), getCValueProperty(), "Property", "Property", "property", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param propertyList The collection of property as inScope.
     */
    public void setProperty_InScope(Collection<String> propertyList) {
        regProperty(CK_INS, cTL(propertyList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param property The collection of property as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setProperty_InScope(String property, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(property), getCValueProperty(), "Property", "Property", "property", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setProperty_IsNull() { regProperty(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setProperty_IsNotNull() { regProperty(CK_ISNN, DUMMY_OBJECT); }

    protected void regProperty(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueProperty(), "Property", "Property", "property");
    }
    protected void registerInlineProperty(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueProperty(), "Property", "Property", "property");
    }
    abstract protected ConditionValue getCValueProperty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param value The value of value as equal.
     */
    public void setValue_Equal(String value) {
        regValue(CK_EQ, fRES(value));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param value The value of value as notEqual.
     */
    public void setValue_NotEqual(String value) {
        regValue(CK_NE, fRES(value));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param value The value of value as greaterThan.
     */
    public void setValue_GreaterThan(String value) {
        regValue(CK_GT, fRES(value));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param value The value of value as lessThan.
     */
    public void setValue_LessThan(String value) {
        regValue(CK_LT, fRES(value));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param value The value of value as greaterEqual.
     */
    public void setValue_GreaterEqual(String value) {
        regValue(CK_GE, fRES(value));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param value The value of value as lessEqual.
     */
    public void setValue_LessEqual(String value) {
        regValue(CK_LE, fRES(value));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param value The value of value as prefixSearch.
     */
    public void setValue_PrefixSearch(String value) {
        regValue(CK_PS, fRES(value));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param value The value of value as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setValue_LikeSearch(String value, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(value), getCValueValue(), "Value", "Value", "value", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param valueList The collection of value as inScope.
     */
    public void setValue_InScope(Collection<String> valueList) {
        regValue(CK_INS, cTL(valueList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param value The collection of value as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setValue_InScope(String value, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(value), getCValueValue(), "Value", "Value", "value", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setValue_IsNull() { regValue(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setValue_IsNotNull() { regValue(CK_ISNN, DUMMY_OBJECT); }

    protected void regValue(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueValue(), "Value", "Value", "value");
    }
    protected void registerInlineValue(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueValue(), "Value", "Value", "value");
    }
    abstract protected ConditionValue getCValueValue();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return UsysSystemCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return UsysSystemCQ.class.getName(); }
}
