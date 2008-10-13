package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_document.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTDocumentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTDocumentCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_document";
    }
    
    public String getTableSqlName() {
        return "t_document";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(40)}
     * @param docid The value of docid as equal.
     */
    public void setDocid_Equal(String docid) {
        regDocid(CK_EQ, fRES(docid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param docid The value of docid as notEqual.
     */
    public void setDocid_NotEqual(String docid) {
        regDocid(CK_NE, fRES(docid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param docid The value of docid as greaterThan.
     */
    public void setDocid_GreaterThan(String docid) {
        regDocid(CK_GT, fRES(docid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param docid The value of docid as lessThan.
     */
    public void setDocid_LessThan(String docid) {
        regDocid(CK_LT, fRES(docid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param docid The value of docid as greaterEqual.
     */
    public void setDocid_GreaterEqual(String docid) {
        regDocid(CK_GE, fRES(docid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param docid The value of docid as lessEqual.
     */
    public void setDocid_LessEqual(String docid) {
        regDocid(CK_LE, fRES(docid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param docid The value of docid as prefixSearch.
     */
    public void setDocid_PrefixSearch(String docid) {
        regDocid(CK_PS, fRES(docid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param docid The value of docid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDocid_LikeSearch(String docid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(docid), getCValueDocid(), "DocID", "Docid", "docid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param docidList The collection of docid as inScope.
     */
    public void setDocid_InScope(Collection<String> docidList) {
        regDocid(CK_INS, cTL(docidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param docid The collection of docid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDocid_InScope(String docid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(docid), getCValueDocid(), "DocID", "Docid", "docid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDocid_IsNull() { regDocid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDocid_IsNotNull() { regDocid(CK_ISNN, DUMMY_OBJECT); }

    protected void regDocid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDocid(), "DocID", "Docid", "docid");
    }
    protected void registerInlineDocid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDocid(), "DocID", "Docid", "docid");
    }
    abstract protected ConditionValue getCValueDocid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param docname The value of docname as equal.
     */
    public void setDocname_Equal(String docname) {
        regDocname(CK_EQ, fRES(docname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param docname The value of docname as notEqual.
     */
    public void setDocname_NotEqual(String docname) {
        regDocname(CK_NE, fRES(docname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param docname The value of docname as greaterThan.
     */
    public void setDocname_GreaterThan(String docname) {
        regDocname(CK_GT, fRES(docname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param docname The value of docname as lessThan.
     */
    public void setDocname_LessThan(String docname) {
        regDocname(CK_LT, fRES(docname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param docname The value of docname as greaterEqual.
     */
    public void setDocname_GreaterEqual(String docname) {
        regDocname(CK_GE, fRES(docname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param docname The value of docname as lessEqual.
     */
    public void setDocname_LessEqual(String docname) {
        regDocname(CK_LE, fRES(docname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param docname The value of docname as prefixSearch.
     */
    public void setDocname_PrefixSearch(String docname) {
        regDocname(CK_PS, fRES(docname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param docname The value of docname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDocname_LikeSearch(String docname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(docname), getCValueDocname(), "DocName", "Docname", "docname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param docnameList The collection of docname as inScope.
     */
    public void setDocname_InScope(Collection<String> docnameList) {
        regDocname(CK_INS, cTL(docnameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param docname The collection of docname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDocname_InScope(String docname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(docname), getCValueDocname(), "DocName", "Docname", "docname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDocname_IsNull() { regDocname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDocname_IsNotNull() { regDocname(CK_ISNN, DUMMY_OBJECT); }

    protected void regDocname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDocname(), "DocName", "Docname", "docname");
    }
    protected void registerInlineDocname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDocname(), "DocName", "Docname", "docname");
    }
    abstract protected ConditionValue getCValueDocname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
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

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param style The value of style as equal.
     */
    public void setStyle_Equal(String style) {
        regStyle(CK_EQ, fRES(style));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as notEqual.
     */
    public void setStyle_NotEqual(String style) {
        regStyle(CK_NE, fRES(style));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as greaterThan.
     */
    public void setStyle_GreaterThan(String style) {
        regStyle(CK_GT, fRES(style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as lessThan.
     */
    public void setStyle_LessThan(String style) {
        regStyle(CK_LT, fRES(style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as greaterEqual.
     */
    public void setStyle_GreaterEqual(String style) {
        regStyle(CK_GE, fRES(style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as lessEqual.
     */
    public void setStyle_LessEqual(String style) {
        regStyle(CK_LE, fRES(style));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as prefixSearch.
     */
    public void setStyle_PrefixSearch(String style) {
        regStyle(CK_PS, fRES(style));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param style The value of style as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStyle_LikeSearch(String style, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(style), getCValueStyle(), "Style", "Style", "style", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleList The collection of style as inScope.
     */
    public void setStyle_InScope(Collection<String> styleList) {
        regStyle(CK_INS, cTL(styleList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param style The collection of style as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStyle_InScope(String style, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(style), getCValueStyle(), "Style", "Style", "style", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStyle_IsNull() { regStyle(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStyle_IsNotNull() { regStyle(CK_ISNN, DUMMY_OBJECT); }

    protected void regStyle(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStyle(), "Style", "Style", "style");
    }
    protected void registerInlineStyle(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStyle(), "Style", "Style", "style");
    }
    abstract protected ConditionValue getCValueStyle();

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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param elementtype The value of elementtype as equal.
     */
    public void setElementtype_Equal(String elementtype) {
        regElementtype(CK_EQ, fRES(elementtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementtype The value of elementtype as notEqual.
     */
    public void setElementtype_NotEqual(String elementtype) {
        regElementtype(CK_NE, fRES(elementtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementtype The value of elementtype as greaterThan.
     */
    public void setElementtype_GreaterThan(String elementtype) {
        regElementtype(CK_GT, fRES(elementtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementtype The value of elementtype as lessThan.
     */
    public void setElementtype_LessThan(String elementtype) {
        regElementtype(CK_LT, fRES(elementtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementtype The value of elementtype as greaterEqual.
     */
    public void setElementtype_GreaterEqual(String elementtype) {
        regElementtype(CK_GE, fRES(elementtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementtype The value of elementtype as lessEqual.
     */
    public void setElementtype_LessEqual(String elementtype) {
        regElementtype(CK_LE, fRES(elementtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementtype The value of elementtype as prefixSearch.
     */
    public void setElementtype_PrefixSearch(String elementtype) {
        regElementtype(CK_PS, fRES(elementtype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementtype The value of elementtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setElementtype_LikeSearch(String elementtype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(elementtype), getCValueElementtype(), "ElementType", "Elementtype", "elementtype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementtypeList The collection of elementtype as inScope.
     */
    public void setElementtype_InScope(Collection<String> elementtypeList) {
        regElementtype(CK_INS, cTL(elementtypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementtype The collection of elementtype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setElementtype_InScope(String elementtype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(elementtype), getCValueElementtype(), "ElementType", "Elementtype", "elementtype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setElementtype_IsNull() { regElementtype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setElementtype_IsNotNull() { regElementtype(CK_ISNN, DUMMY_OBJECT); }

    protected void regElementtype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueElementtype(), "ElementType", "Elementtype", "elementtype");
    }
    protected void registerInlineElementtype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueElementtype(), "ElementType", "Elementtype", "elementtype");
    }
    abstract protected ConditionValue getCValueElementtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param strcontent The value of strcontent as equal.
     */
    public void setStrcontent_Equal(String strcontent) {
        regStrcontent(CK_EQ, fRES(strcontent));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param strcontent The value of strcontent as notEqual.
     */
    public void setStrcontent_NotEqual(String strcontent) {
        regStrcontent(CK_NE, fRES(strcontent));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param strcontent The value of strcontent as greaterThan.
     */
    public void setStrcontent_GreaterThan(String strcontent) {
        regStrcontent(CK_GT, fRES(strcontent));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param strcontent The value of strcontent as lessThan.
     */
    public void setStrcontent_LessThan(String strcontent) {
        regStrcontent(CK_LT, fRES(strcontent));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param strcontent The value of strcontent as greaterEqual.
     */
    public void setStrcontent_GreaterEqual(String strcontent) {
        regStrcontent(CK_GE, fRES(strcontent));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param strcontent The value of strcontent as lessEqual.
     */
    public void setStrcontent_LessEqual(String strcontent) {
        regStrcontent(CK_LE, fRES(strcontent));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param strcontent The value of strcontent as prefixSearch.
     */
    public void setStrcontent_PrefixSearch(String strcontent) {
        regStrcontent(CK_PS, fRES(strcontent));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param strcontent The value of strcontent as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStrcontent_LikeSearch(String strcontent, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(strcontent), getCValueStrcontent(), "StrContent", "Strcontent", "strcontent", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param strcontentList The collection of strcontent as inScope.
     */
    public void setStrcontent_InScope(Collection<String> strcontentList) {
        regStrcontent(CK_INS, cTL(strcontentList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param strcontent The collection of strcontent as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStrcontent_InScope(String strcontent, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(strcontent), getCValueStrcontent(), "StrContent", "Strcontent", "strcontent", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStrcontent_IsNull() { regStrcontent(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStrcontent_IsNotNull() { regStrcontent(CK_ISNN, DUMMY_OBJECT); }

    protected void regStrcontent(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStrcontent(), "StrContent", "Strcontent", "strcontent");
    }
    protected void registerInlineStrcontent(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStrcontent(), "StrContent", "Strcontent", "strcontent");
    }
    abstract protected ConditionValue getCValueStrcontent();

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBincontent_IsNull() { regBincontent(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBincontent_IsNotNull() { regBincontent(CK_ISNN, DUMMY_OBJECT); }

    protected void regBincontent(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBincontent(), "BinContent", "Bincontent", "bincontent");
    }
    protected void registerInlineBincontent(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBincontent(), "BinContent", "Bincontent", "bincontent");
    }
    abstract protected ConditionValue getCValueBincontent();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param doctype The value of doctype as equal.
     */
    public void setDoctype_Equal(String doctype) {
        regDoctype(CK_EQ, fRES(doctype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param doctype The value of doctype as notEqual.
     */
    public void setDoctype_NotEqual(String doctype) {
        regDoctype(CK_NE, fRES(doctype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param doctype The value of doctype as greaterThan.
     */
    public void setDoctype_GreaterThan(String doctype) {
        regDoctype(CK_GT, fRES(doctype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param doctype The value of doctype as lessThan.
     */
    public void setDoctype_LessThan(String doctype) {
        regDoctype(CK_LT, fRES(doctype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param doctype The value of doctype as greaterEqual.
     */
    public void setDoctype_GreaterEqual(String doctype) {
        regDoctype(CK_GE, fRES(doctype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param doctype The value of doctype as lessEqual.
     */
    public void setDoctype_LessEqual(String doctype) {
        regDoctype(CK_LE, fRES(doctype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param doctype The value of doctype as prefixSearch.
     */
    public void setDoctype_PrefixSearch(String doctype) {
        regDoctype(CK_PS, fRES(doctype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param doctype The value of doctype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDoctype_LikeSearch(String doctype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(doctype), getCValueDoctype(), "DocType", "Doctype", "doctype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param doctypeList The collection of doctype as inScope.
     */
    public void setDoctype_InScope(Collection<String> doctypeList) {
        regDoctype(CK_INS, cTL(doctypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param doctype The collection of doctype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDoctype_InScope(String doctype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(doctype), getCValueDoctype(), "DocType", "Doctype", "doctype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDoctype_IsNull() { regDoctype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDoctype_IsNotNull() { regDoctype(CK_ISNN, DUMMY_OBJECT); }

    protected void regDoctype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDoctype(), "DocType", "Doctype", "doctype");
    }
    protected void registerInlineDoctype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDoctype(), "DocType", "Doctype", "doctype");
    }
    abstract protected ConditionValue getCValueDoctype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param author The value of author as equal.
     */
    public void setAuthor_Equal(String author) {
        regAuthor(CK_EQ, fRES(author));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as notEqual.
     */
    public void setAuthor_NotEqual(String author) {
        regAuthor(CK_NE, fRES(author));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as greaterThan.
     */
    public void setAuthor_GreaterThan(String author) {
        regAuthor(CK_GT, fRES(author));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as lessThan.
     */
    public void setAuthor_LessThan(String author) {
        regAuthor(CK_LT, fRES(author));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as greaterEqual.
     */
    public void setAuthor_GreaterEqual(String author) {
        regAuthor(CK_GE, fRES(author));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as lessEqual.
     */
    public void setAuthor_LessEqual(String author) {
        regAuthor(CK_LE, fRES(author));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as prefixSearch.
     */
    public void setAuthor_PrefixSearch(String author) {
        regAuthor(CK_PS, fRES(author));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param author The value of author as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAuthor_LikeSearch(String author, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(author), getCValueAuthor(), "Author", "Author", "author", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param authorList The collection of author as inScope.
     */
    public void setAuthor_InScope(Collection<String> authorList) {
        regAuthor(CK_INS, cTL(authorList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param author The collection of author as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setAuthor_InScope(String author, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(author), getCValueAuthor(), "Author", "Author", "author", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setAuthor_IsNull() { regAuthor(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setAuthor_IsNotNull() { regAuthor(CK_ISNN, DUMMY_OBJECT); }

    protected void regAuthor(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAuthor(), "Author", "Author", "author");
    }
    protected void registerInlineAuthor(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAuthor(), "Author", "Author", "author");
    }
    abstract protected ConditionValue getCValueAuthor();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param version The value of version as equal.
     */
    public void setVersion_Equal(String version) {
        regVersion(CK_EQ, fRES(version));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as notEqual.
     */
    public void setVersion_NotEqual(String version) {
        regVersion(CK_NE, fRES(version));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as greaterThan.
     */
    public void setVersion_GreaterThan(String version) {
        regVersion(CK_GT, fRES(version));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as lessThan.
     */
    public void setVersion_LessThan(String version) {
        regVersion(CK_LT, fRES(version));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as greaterEqual.
     */
    public void setVersion_GreaterEqual(String version) {
        regVersion(CK_GE, fRES(version));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as lessEqual.
     */
    public void setVersion_LessEqual(String version) {
        regVersion(CK_LE, fRES(version));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as prefixSearch.
     */
    public void setVersion_PrefixSearch(String version) {
        regVersion(CK_PS, fRES(version));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param version The value of version as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVersion_LikeSearch(String version, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(version), getCValueVersion(), "Version", "Version", "version", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param versionList The collection of version as inScope.
     */
    public void setVersion_InScope(Collection<String> versionList) {
        regVersion(CK_INS, cTL(versionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param version The collection of version as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setVersion_InScope(String version, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(version), getCValueVersion(), "Version", "Version", "version", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setVersion_IsNull() { regVersion(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setVersion_IsNotNull() { regVersion(CK_ISNN, DUMMY_OBJECT); }

    protected void regVersion(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueVersion(), "Version", "Version", "version");
    }
    protected void registerInlineVersion(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueVersion(), "Version", "Version", "version");
    }
    abstract protected ConditionValue getCValueVersion();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param isactive The value of isactive as equal.
     */
    public void setIsactive_Equal(java.lang.Integer isactive) {
        regIsactive(CK_EQ, isactive);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param isactive The value of isactive as notEqual.
     */
    public void setIsactive_NotEqual(java.lang.Integer isactive) {
        regIsactive(CK_NE, isactive);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param isactive The value of isactive as greaterThan.
     */
    public void setIsactive_GreaterThan(java.lang.Integer isactive) {
        regIsactive(CK_GT, isactive);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param isactive The value of isactive as lessThan.
     */
    public void setIsactive_LessThan(java.lang.Integer isactive) {
        regIsactive(CK_LT, isactive);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param isactive The value of isactive as greaterEqual.
     */
    public void setIsactive_GreaterEqual(java.lang.Integer isactive) {
        regIsactive(CK_GE, isactive);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param isactive The value of isactive as lessEqual.
     */
    public void setIsactive_LessEqual(java.lang.Integer isactive) {
        regIsactive(CK_LE, isactive);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param isactiveList The collection of isactive as inScope.
     */
    public void setIsactive_InScope(Collection<java.lang.Integer> isactiveList) {
        regIsactive(CK_INS, cTL(isactiveList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setIsactive_IsNull() { regIsactive(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setIsactive_IsNotNull() { regIsactive(CK_ISNN, DUMMY_OBJECT); }

    protected void regIsactive(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIsactive(), "IsActive", "Isactive", "isactive");
    }
    protected void registerInlineIsactive(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIsactive(), "IsActive", "Isactive", "isactive");
    }
    abstract protected ConditionValue getCValueIsactive();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param sequence The value of sequence as equal.
     */
    public void setSequence_Equal(java.lang.Integer sequence) {
        regSequence(CK_EQ, sequence);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param sequence The value of sequence as notEqual.
     */
    public void setSequence_NotEqual(java.lang.Integer sequence) {
        regSequence(CK_NE, sequence);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param sequence The value of sequence as greaterThan.
     */
    public void setSequence_GreaterThan(java.lang.Integer sequence) {
        regSequence(CK_GT, sequence);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param sequence The value of sequence as lessThan.
     */
    public void setSequence_LessThan(java.lang.Integer sequence) {
        regSequence(CK_LT, sequence);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param sequence The value of sequence as greaterEqual.
     */
    public void setSequence_GreaterEqual(java.lang.Integer sequence) {
        regSequence(CK_GE, sequence);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param sequence The value of sequence as lessEqual.
     */
    public void setSequence_LessEqual(java.lang.Integer sequence) {
        regSequence(CK_LE, sequence);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param sequenceList The collection of sequence as inScope.
     */
    public void setSequence_InScope(Collection<java.lang.Integer> sequenceList) {
        regSequence(CK_INS, cTL(sequenceList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setSequence_IsNull() { regSequence(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setSequence_IsNotNull() { regSequence(CK_ISNN, DUMMY_OBJECT); }

    protected void regSequence(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueSequence(), "Sequence", "Sequence", "sequence");
    }
    protected void registerInlineSequence(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueSequence(), "Sequence", "Sequence", "sequence");
    }
    abstract protected ConditionValue getCValueSequence();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param docdate The value of docdate as equal.
     */
    public void setDocdate_Equal(java.sql.Timestamp docdate) {
        regDocdate(CK_EQ, docdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param docdate The value of docdate as greaterThan.
     */
    public void setDocdate_GreaterThan(java.sql.Timestamp docdate) {
        regDocdate(CK_GT, docdate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param docdate The value of docdate as lessThan.
     */
    public void setDocdate_LessThan(java.sql.Timestamp docdate) {
        regDocdate(CK_LT, docdate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param docdate The value of docdate as greaterEqual.
     */
    public void setDocdate_GreaterEqual(java.sql.Timestamp docdate) {
        regDocdate(CK_GE, docdate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param docdate The value of docdate as lessEqual.
     */
    public void setDocdate_LessEqual(java.sql.Timestamp docdate) {
        regDocdate(CK_LE, docdate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of docdate. (Nullable)
     * @param toDate The to-date of docdate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDocdate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueDocdate(), "DocDate", "Docdate", "docdate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of docdate. (Nullable)
     * @param toDate The to-date of docdate. (Nullable)
     */
    public void setDocdate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setDocdate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDocdate_IsNull() { regDocdate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDocdate_IsNotNull() { regDocdate(CK_ISNN, DUMMY_OBJECT); }

    protected void regDocdate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDocdate(), "DocDate", "Docdate", "docdate");
    }
    protected void registerInlineDocdate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDocdate(), "DocDate", "Docdate", "docdate");
    }
    abstract protected ConditionValue getCValueDocdate();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TDocumentCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TDocumentCQ.class.getName(); }
}
