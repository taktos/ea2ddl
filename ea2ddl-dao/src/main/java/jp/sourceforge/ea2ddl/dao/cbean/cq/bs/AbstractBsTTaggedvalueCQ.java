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
 * The abstract condition-query of t_taggedvalue.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTaggedvalueCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTaggedvalueCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_taggedvalue";
    }
    
    public String getTableSqlName() {
        return "t_taggedvalue";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(40)}
     * @param propertyid The value of propertyid as equal.
     */
    public void setPropertyid_Equal(String propertyid) {
        regPropertyid(CK_EQ, fRES(propertyid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param propertyid The value of propertyid as notEqual.
     */
    public void setPropertyid_NotEqual(String propertyid) {
        regPropertyid(CK_NE, fRES(propertyid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param propertyid The value of propertyid as greaterThan.
     */
    public void setPropertyid_GreaterThan(String propertyid) {
        regPropertyid(CK_GT, fRES(propertyid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param propertyid The value of propertyid as lessThan.
     */
    public void setPropertyid_LessThan(String propertyid) {
        regPropertyid(CK_LT, fRES(propertyid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param propertyid The value of propertyid as greaterEqual.
     */
    public void setPropertyid_GreaterEqual(String propertyid) {
        regPropertyid(CK_GE, fRES(propertyid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param propertyid The value of propertyid as lessEqual.
     */
    public void setPropertyid_LessEqual(String propertyid) {
        regPropertyid(CK_LE, fRES(propertyid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param propertyid The value of propertyid as prefixSearch.
     */
    public void setPropertyid_PrefixSearch(String propertyid) {
        regPropertyid(CK_PS, fRES(propertyid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param propertyidList The collection of propertyid as inScope.
     */
    public void setPropertyid_InScope(Collection<String> propertyidList) {
        regPropertyid(CK_INS, cTL(propertyidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param propertyid The value of propertyid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPropertyid_LikeSearch(String propertyid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(propertyid), getCValuePropertyid(), "PropertyID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param propertyid The value of propertyid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPropertyid_NotLikeSearch(String propertyid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(propertyid), getCValuePropertyid(), "PropertyID", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPropertyid_IsNull() { regPropertyid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPropertyid_IsNotNull() { regPropertyid(CK_ISNN, DOBJ); }

    protected void regPropertyid(ConditionKey k, Object v) { regQ(k, v, getCValuePropertyid(), "PropertyID"); }
    abstract protected ConditionValue getCValuePropertyid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(40)}
     * @param elementid The value of elementid as equal.
     */
    public void setElementid_Equal(String elementid) {
        regElementid(CK_EQ, fRES(elementid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as notEqual.
     */
    public void setElementid_NotEqual(String elementid) {
        regElementid(CK_NE, fRES(elementid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as greaterThan.
     */
    public void setElementid_GreaterThan(String elementid) {
        regElementid(CK_GT, fRES(elementid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as lessThan.
     */
    public void setElementid_LessThan(String elementid) {
        regElementid(CK_LT, fRES(elementid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as greaterEqual.
     */
    public void setElementid_GreaterEqual(String elementid) {
        regElementid(CK_GE, fRES(elementid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as lessEqual.
     */
    public void setElementid_LessEqual(String elementid) {
        regElementid(CK_LE, fRES(elementid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as prefixSearch.
     */
    public void setElementid_PrefixSearch(String elementid) {
        regElementid(CK_PS, fRES(elementid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementidList The collection of elementid as inScope.
     */
    public void setElementid_InScope(Collection<String> elementidList) {
        regElementid(CK_INS, cTL(elementidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementid The value of elementid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setElementid_LikeSearch(String elementid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(elementid), getCValueElementid(), "ElementID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementid The value of elementid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setElementid_NotLikeSearch(String elementid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(elementid), getCValueElementid(), "ElementID", likeSearchOption);
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(100)}
     * @param baseclass The value of baseclass as equal.
     */
    public void setBaseclass_Equal(String baseclass) {
        regBaseclass(CK_EQ, fRES(baseclass));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param baseclass The value of baseclass as notEqual.
     */
    public void setBaseclass_NotEqual(String baseclass) {
        regBaseclass(CK_NE, fRES(baseclass));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param baseclass The value of baseclass as greaterThan.
     */
    public void setBaseclass_GreaterThan(String baseclass) {
        regBaseclass(CK_GT, fRES(baseclass));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param baseclass The value of baseclass as lessThan.
     */
    public void setBaseclass_LessThan(String baseclass) {
        regBaseclass(CK_LT, fRES(baseclass));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param baseclass The value of baseclass as greaterEqual.
     */
    public void setBaseclass_GreaterEqual(String baseclass) {
        regBaseclass(CK_GE, fRES(baseclass));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param baseclass The value of baseclass as lessEqual.
     */
    public void setBaseclass_LessEqual(String baseclass) {
        regBaseclass(CK_LE, fRES(baseclass));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param baseclass The value of baseclass as prefixSearch.
     */
    public void setBaseclass_PrefixSearch(String baseclass) {
        regBaseclass(CK_PS, fRES(baseclass));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param baseclassList The collection of baseclass as inScope.
     */
    public void setBaseclass_InScope(Collection<String> baseclassList) {
        regBaseclass(CK_INS, cTL(baseclassList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param baseclass The value of baseclass as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBaseclass_LikeSearch(String baseclass, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(baseclass), getCValueBaseclass(), "BaseClass", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param baseclass The value of baseclass as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBaseclass_NotLikeSearch(String baseclass, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(baseclass), getCValueBaseclass(), "BaseClass", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBaseclass_IsNull() { regBaseclass(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBaseclass_IsNotNull() { regBaseclass(CK_ISNN, DOBJ); }

    protected void regBaseclass(ConditionKey k, Object v) { regQ(k, v, getCValueBaseclass(), "BaseClass"); }
    abstract protected ConditionValue getCValueBaseclass();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param tagvalue The value of tagvalue as equal.
     */
    public void setTagvalue_Equal(String tagvalue) {
        regTagvalue(CK_EQ, fRES(tagvalue));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tagvalue The value of tagvalue as notEqual.
     */
    public void setTagvalue_NotEqual(String tagvalue) {
        regTagvalue(CK_NE, fRES(tagvalue));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tagvalue The value of tagvalue as greaterThan.
     */
    public void setTagvalue_GreaterThan(String tagvalue) {
        regTagvalue(CK_GT, fRES(tagvalue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tagvalue The value of tagvalue as lessThan.
     */
    public void setTagvalue_LessThan(String tagvalue) {
        regTagvalue(CK_LT, fRES(tagvalue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tagvalue The value of tagvalue as greaterEqual.
     */
    public void setTagvalue_GreaterEqual(String tagvalue) {
        regTagvalue(CK_GE, fRES(tagvalue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tagvalue The value of tagvalue as lessEqual.
     */
    public void setTagvalue_LessEqual(String tagvalue) {
        regTagvalue(CK_LE, fRES(tagvalue));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tagvalue The value of tagvalue as prefixSearch.
     */
    public void setTagvalue_PrefixSearch(String tagvalue) {
        regTagvalue(CK_PS, fRES(tagvalue));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param tagvalueList The collection of tagvalue as inScope.
     */
    public void setTagvalue_InScope(Collection<String> tagvalueList) {
        regTagvalue(CK_INS, cTL(tagvalueList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param tagvalue The value of tagvalue as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagvalue_LikeSearch(String tagvalue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagvalue), getCValueTagvalue(), "TagValue", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param tagvalue The value of tagvalue as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagvalue_NotLikeSearch(String tagvalue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagvalue), getCValueTagvalue(), "TagValue", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTagvalue_IsNull() { regTagvalue(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTagvalue_IsNotNull() { regTagvalue(CK_ISNN, DOBJ); }

    protected void regTagvalue(ConditionKey k, Object v) { regQ(k, v, getCValueTagvalue(), "TagValue"); }
    abstract protected ConditionValue getCValueTagvalue();

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
        regLSQ(CK_LS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey k, Object v) { regQ(k, v, getCValueNotes(), "Notes"); }
    abstract protected ConditionValue getCValueNotes();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TTaggedvalueCB.class.getName(); }
    String xCQ() { return TTaggedvalueCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
