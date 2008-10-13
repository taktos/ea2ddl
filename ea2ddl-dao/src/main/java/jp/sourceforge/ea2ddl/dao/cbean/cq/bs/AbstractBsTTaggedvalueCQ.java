package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_taggedvalue.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTTaggedvalueCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTaggedvalueCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(40)}
     * @param propertyid The value of propertyid as equal.
     */
    public void setPropertyid_Equal(String propertyid) {
        regPropertyid(CK_EQ, fRES(propertyid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param propertyid The value of propertyid as notEqual.
     */
    public void setPropertyid_NotEqual(String propertyid) {
        regPropertyid(CK_NE, fRES(propertyid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param propertyid The value of propertyid as greaterThan.
     */
    public void setPropertyid_GreaterThan(String propertyid) {
        regPropertyid(CK_GT, fRES(propertyid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param propertyid The value of propertyid as lessThan.
     */
    public void setPropertyid_LessThan(String propertyid) {
        regPropertyid(CK_LT, fRES(propertyid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param propertyid The value of propertyid as greaterEqual.
     */
    public void setPropertyid_GreaterEqual(String propertyid) {
        regPropertyid(CK_GE, fRES(propertyid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param propertyid The value of propertyid as lessEqual.
     */
    public void setPropertyid_LessEqual(String propertyid) {
        regPropertyid(CK_LE, fRES(propertyid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param propertyid The value of propertyid as prefixSearch.
     */
    public void setPropertyid_PrefixSearch(String propertyid) {
        regPropertyid(CK_PS, fRES(propertyid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param propertyid The value of propertyid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPropertyid_LikeSearch(String propertyid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(propertyid), getCValuePropertyid(), "PropertyID", "Propertyid", "propertyid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param propertyidList The collection of propertyid as inScope.
     */
    public void setPropertyid_InScope(Collection<String> propertyidList) {
        regPropertyid(CK_INS, cTL(propertyidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param propertyid The collection of propertyid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPropertyid_InScope(String propertyid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(propertyid), getCValuePropertyid(), "PropertyID", "Propertyid", "propertyid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPropertyid_IsNull() { regPropertyid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPropertyid_IsNotNull() { regPropertyid(CK_ISNN, DUMMY_OBJECT); }

    protected void regPropertyid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePropertyid(), "PropertyID", "Propertyid", "propertyid");
    }
    protected void registerInlinePropertyid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePropertyid(), "PropertyID", "Propertyid", "propertyid");
    }
    abstract protected ConditionValue getCValuePropertyid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(40)}
     * @param elementid The value of elementid as equal.
     */
    public void setElementid_Equal(String elementid) {
        regElementid(CK_EQ, fRES(elementid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementid The value of elementid as notEqual.
     */
    public void setElementid_NotEqual(String elementid) {
        regElementid(CK_NE, fRES(elementid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementid The value of elementid as greaterThan.
     */
    public void setElementid_GreaterThan(String elementid) {
        regElementid(CK_GT, fRES(elementid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementid The value of elementid as lessThan.
     */
    public void setElementid_LessThan(String elementid) {
        regElementid(CK_LT, fRES(elementid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementid The value of elementid as greaterEqual.
     */
    public void setElementid_GreaterEqual(String elementid) {
        regElementid(CK_GE, fRES(elementid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementid The value of elementid as lessEqual.
     */
    public void setElementid_LessEqual(String elementid) {
        regElementid(CK_LE, fRES(elementid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementid The value of elementid as prefixSearch.
     */
    public void setElementid_PrefixSearch(String elementid) {
        regElementid(CK_PS, fRES(elementid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementid The value of elementid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setElementid_LikeSearch(String elementid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(elementid), getCValueElementid(), "ElementID", "Elementid", "elementid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementidList The collection of elementid as inScope.
     */
    public void setElementid_InScope(Collection<String> elementidList) {
        regElementid(CK_INS, cTL(elementidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementid The collection of elementid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setElementid_InScope(String elementid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(elementid), getCValueElementid(), "ElementID", "Elementid", "elementid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setElementid_IsNull() { regElementid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setElementid_IsNotNull() { regElementid(CK_ISNN, DUMMY_OBJECT); }

    protected void regElementid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueElementid(), "ElementID", "Elementid", "elementid");
    }
    protected void registerInlineElementid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueElementid(), "ElementID", "Elementid", "elementid");
    }
    abstract protected ConditionValue getCValueElementid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param baseclass The value of baseclass as equal.
     */
    public void setBaseclass_Equal(String baseclass) {
        regBaseclass(CK_EQ, fRES(baseclass));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param baseclass The value of baseclass as notEqual.
     */
    public void setBaseclass_NotEqual(String baseclass) {
        regBaseclass(CK_NE, fRES(baseclass));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param baseclass The value of baseclass as greaterThan.
     */
    public void setBaseclass_GreaterThan(String baseclass) {
        regBaseclass(CK_GT, fRES(baseclass));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param baseclass The value of baseclass as lessThan.
     */
    public void setBaseclass_LessThan(String baseclass) {
        regBaseclass(CK_LT, fRES(baseclass));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param baseclass The value of baseclass as greaterEqual.
     */
    public void setBaseclass_GreaterEqual(String baseclass) {
        regBaseclass(CK_GE, fRES(baseclass));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param baseclass The value of baseclass as lessEqual.
     */
    public void setBaseclass_LessEqual(String baseclass) {
        regBaseclass(CK_LE, fRES(baseclass));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param baseclass The value of baseclass as prefixSearch.
     */
    public void setBaseclass_PrefixSearch(String baseclass) {
        regBaseclass(CK_PS, fRES(baseclass));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param baseclass The value of baseclass as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBaseclass_LikeSearch(String baseclass, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(baseclass), getCValueBaseclass(), "BaseClass", "Baseclass", "baseclass", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param baseclassList The collection of baseclass as inScope.
     */
    public void setBaseclass_InScope(Collection<String> baseclassList) {
        regBaseclass(CK_INS, cTL(baseclassList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param baseclass The collection of baseclass as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setBaseclass_InScope(String baseclass, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(baseclass), getCValueBaseclass(), "BaseClass", "Baseclass", "baseclass", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBaseclass_IsNull() { regBaseclass(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBaseclass_IsNotNull() { regBaseclass(CK_ISNN, DUMMY_OBJECT); }

    protected void regBaseclass(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBaseclass(), "BaseClass", "Baseclass", "baseclass");
    }
    protected void registerInlineBaseclass(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBaseclass(), "BaseClass", "Baseclass", "baseclass");
    }
    abstract protected ConditionValue getCValueBaseclass();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param tagvalue The value of tagvalue as equal.
     */
    public void setTagvalue_Equal(String tagvalue) {
        regTagvalue(CK_EQ, fRES(tagvalue));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tagvalue The value of tagvalue as notEqual.
     */
    public void setTagvalue_NotEqual(String tagvalue) {
        regTagvalue(CK_NE, fRES(tagvalue));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param tagvalue The value of tagvalue as greaterThan.
     */
    public void setTagvalue_GreaterThan(String tagvalue) {
        regTagvalue(CK_GT, fRES(tagvalue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param tagvalue The value of tagvalue as lessThan.
     */
    public void setTagvalue_LessThan(String tagvalue) {
        regTagvalue(CK_LT, fRES(tagvalue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tagvalue The value of tagvalue as greaterEqual.
     */
    public void setTagvalue_GreaterEqual(String tagvalue) {
        regTagvalue(CK_GE, fRES(tagvalue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tagvalue The value of tagvalue as lessEqual.
     */
    public void setTagvalue_LessEqual(String tagvalue) {
        regTagvalue(CK_LE, fRES(tagvalue));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param tagvalue The value of tagvalue as prefixSearch.
     */
    public void setTagvalue_PrefixSearch(String tagvalue) {
        regTagvalue(CK_PS, fRES(tagvalue));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param tagvalue The value of tagvalue as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagvalue_LikeSearch(String tagvalue, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(tagvalue), getCValueTagvalue(), "TagValue", "Tagvalue", "tagvalue", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param tagvalueList The collection of tagvalue as inScope.
     */
    public void setTagvalue_InScope(Collection<String> tagvalueList) {
        regTagvalue(CK_INS, cTL(tagvalueList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param tagvalue The collection of tagvalue as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTagvalue_InScope(String tagvalue, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(tagvalue), getCValueTagvalue(), "TagValue", "Tagvalue", "tagvalue", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTagvalue_IsNull() { regTagvalue(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTagvalue_IsNotNull() { regTagvalue(CK_ISNN, DUMMY_OBJECT); }

    protected void regTagvalue(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTagvalue(), "TagValue", "Tagvalue", "tagvalue");
    }
    protected void registerInlineTagvalue(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTagvalue(), "TagValue", "Tagvalue", "tagvalue");
    }
    abstract protected ConditionValue getCValueTagvalue();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(String notes) {
        regNotes(CK_EQ, fRES(notes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(String notes) {
        regNotes(CK_NE, fRES(notes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(String notes) {
        regNotes(CK_PS, fRES(notes));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(notes), getCValueNotes(), "Notes", "Notes", "notes", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(Collection<String> notesList) {
        regNotes(CK_INS, cTL(notesList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notes The collection of notes as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setNotes_InScope(String notes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(notes), getCValueNotes(), "Notes", "Notes", "notes", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DUMMY_OBJECT); }

    protected void regNotes(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNotes(), "Notes", "Notes", "notes");
    }
    protected void registerInlineNotes(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNotes(), "Notes", "Notes", "notes");
    }
    abstract protected ConditionValue getCValueNotes();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TTaggedvalueCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TTaggedvalueCQ.class.getName(); }
}
