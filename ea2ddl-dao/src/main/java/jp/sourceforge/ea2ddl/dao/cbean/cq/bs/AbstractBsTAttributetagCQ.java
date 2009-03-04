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
 * The abstract condition-query of t_attributetag.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTAttributetagCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTAttributetagCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_attributetag";
    }
    
    public String getTableSqlName() {
        return "t_attributetag";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : NotNull : COUNTER}
     * @param propertyid The value of propertyid as equal.
     */
    public void setPropertyid_Equal(java.lang.Integer propertyid) {
        regPropertyid(CK_EQ, propertyid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param propertyid The value of propertyid as notEqual.
     */
    public void setPropertyid_NotEqual(java.lang.Integer propertyid) {
        regPropertyid(CK_NE, propertyid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param propertyid The value of propertyid as greaterThan.
     */
    public void setPropertyid_GreaterThan(java.lang.Integer propertyid) {
        regPropertyid(CK_GT, propertyid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param propertyid The value of propertyid as lessThan.
     */
    public void setPropertyid_LessThan(java.lang.Integer propertyid) {
        regPropertyid(CK_LT, propertyid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param propertyid The value of propertyid as greaterEqual.
     */
    public void setPropertyid_GreaterEqual(java.lang.Integer propertyid) {
        regPropertyid(CK_GE, propertyid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param propertyid The value of propertyid as lessEqual.
     */
    public void setPropertyid_LessEqual(java.lang.Integer propertyid) {
        regPropertyid(CK_LE, propertyid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param propertyidList The collection of propertyid as inScope.
     */
    public void setPropertyid_InScope(Collection<java.lang.Integer> propertyidList) {
        regPropertyid(CK_INS, cTL(propertyidList));
    }

    protected void regPropertyid(ConditionKey k, Object v) { regQ(k, v, getCValuePropertyid(), "PropertyID"); }
    abstract protected ConditionValue getCValuePropertyid();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param elementid The value of elementid as equal.
     */
    public void setElementid_Equal(java.lang.Integer elementid) {
        regElementid(CK_EQ, elementid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as notEqual.
     */
    public void setElementid_NotEqual(java.lang.Integer elementid) {
        regElementid(CK_NE, elementid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as greaterThan.
     */
    public void setElementid_GreaterThan(java.lang.Integer elementid) {
        regElementid(CK_GT, elementid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as lessThan.
     */
    public void setElementid_LessThan(java.lang.Integer elementid) {
        regElementid(CK_LT, elementid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as greaterEqual.
     */
    public void setElementid_GreaterEqual(java.lang.Integer elementid) {
        regElementid(CK_GE, elementid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as lessEqual.
     */
    public void setElementid_LessEqual(java.lang.Integer elementid) {
        regElementid(CK_LE, elementid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param elementidList The collection of elementid as inScope.
     */
    public void setElementid_InScope(Collection<java.lang.Integer> elementidList) {
        regElementid(CK_INS, cTL(elementidList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setElementid_IsNull() { regElementid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setElementid_IsNotNull() { regElementid(CK_ISNN, DOBJ); }

    protected void regElementid(ConditionKey k, Object v) { regQ(k, v, getCValueElementid(), "ElementID"); }
    abstract protected ConditionValue getCValueElementid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
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
        regLSQ(CK_LS, fRES(value), getCValueValue(), "VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param value The value of value as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setValue_NotLikeSearch(String value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(value), getCValueValue(), "VALUE", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setValue_IsNull() { regValue(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setValue_IsNotNull() { regValue(CK_ISNN, DOBJ); }

    protected void regValue(ConditionKey k, Object v) { regQ(k, v, getCValueValue(), "VALUE"); }
    abstract protected ConditionValue getCValueValue();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(String notes) {
        regNotes(CK_EQ, fRES(notes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(String notes) {
        regNotes(CK_NE, fRES(notes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(String notes) {
        regNotes(CK_PS, fRES(notes));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(Collection<String> notesList) {
        regNotes(CK_INS, cTL(notesList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), getCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), getCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey k, Object v) { regQ(k, v, getCValueNotes(), "NOTES"); }
    abstract protected ConditionValue getCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(40)}
     * @param eaGuid The value of eaGuid as equal.
     */
    public void setEaGuid_Equal(String eaGuid) {
        regEaGuid(CK_EQ, fRES(eaGuid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as notEqual.
     */
    public void setEaGuid_NotEqual(String eaGuid) {
        regEaGuid(CK_NE, fRES(eaGuid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as greaterThan.
     */
    public void setEaGuid_GreaterThan(String eaGuid) {
        regEaGuid(CK_GT, fRES(eaGuid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as lessThan.
     */
    public void setEaGuid_LessThan(String eaGuid) {
        regEaGuid(CK_LT, fRES(eaGuid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as greaterEqual.
     */
    public void setEaGuid_GreaterEqual(String eaGuid) {
        regEaGuid(CK_GE, fRES(eaGuid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as lessEqual.
     */
    public void setEaGuid_LessEqual(String eaGuid) {
        regEaGuid(CK_LE, fRES(eaGuid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as prefixSearch.
     */
    public void setEaGuid_PrefixSearch(String eaGuid) {
        regEaGuid(CK_PS, fRES(eaGuid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuidList The collection of eaGuid as inScope.
     */
    public void setEaGuid_InScope(Collection<String> eaGuidList) {
        regEaGuid(CK_INS, cTL(eaGuidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEaGuid_LikeSearch(String eaGuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEaGuid_NotLikeSearch(String eaGuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEaGuid_IsNull() { regEaGuid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEaGuid_IsNotNull() { regEaGuid(CK_ISNN, DOBJ); }

    protected void regEaGuid(ConditionKey k, Object v) { regQ(k, v, getCValueEaGuid(), "ea_guid"); }
    abstract protected ConditionValue getCValueEaGuid();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TAttributetagCB.class.getName(); }
    String xCQ() { return TAttributetagCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
