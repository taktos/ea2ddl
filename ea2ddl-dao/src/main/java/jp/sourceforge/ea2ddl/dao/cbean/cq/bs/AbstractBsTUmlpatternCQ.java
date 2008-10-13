package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_umlpattern.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTUmlpatternCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTUmlpatternCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_umlpattern";
    }
    
    public String getTableSqlName() {
        return "t_umlpattern";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {COUNTER : NotNull}
     * @param patternid The value of patternid as equal.
     */
    public void setPatternid_Equal(java.lang.Integer patternid) {
        regPatternid(CK_EQ, patternid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param patternid The value of patternid as notEqual.
     */
    public void setPatternid_NotEqual(java.lang.Integer patternid) {
        regPatternid(CK_NE, patternid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param patternid The value of patternid as greaterThan.
     */
    public void setPatternid_GreaterThan(java.lang.Integer patternid) {
        regPatternid(CK_GT, patternid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param patternid The value of patternid as lessThan.
     */
    public void setPatternid_LessThan(java.lang.Integer patternid) {
        regPatternid(CK_LT, patternid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param patternid The value of patternid as greaterEqual.
     */
    public void setPatternid_GreaterEqual(java.lang.Integer patternid) {
        regPatternid(CK_GE, patternid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param patternid The value of patternid as lessEqual.
     */
    public void setPatternid_LessEqual(java.lang.Integer patternid) {
        regPatternid(CK_LE, patternid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param patternidList The collection of patternid as inScope.
     */
    public void setPatternid_InScope(Collection<java.lang.Integer> patternidList) {
        regPatternid(CK_INS, cTL(patternidList));
    }

    protected void regPatternid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePatternid(), "PatternID", "Patternid", "patternid");
    }
    protected void registerInlinePatternid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePatternid(), "PatternID", "Patternid", "patternid");
    }
    abstract protected ConditionValue getCValuePatternid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param patterncategory The value of patterncategory as equal.
     */
    public void setPatterncategory_Equal(String patterncategory) {
        regPatterncategory(CK_EQ, fRES(patterncategory));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param patterncategory The value of patterncategory as notEqual.
     */
    public void setPatterncategory_NotEqual(String patterncategory) {
        regPatterncategory(CK_NE, fRES(patterncategory));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param patterncategory The value of patterncategory as greaterThan.
     */
    public void setPatterncategory_GreaterThan(String patterncategory) {
        regPatterncategory(CK_GT, fRES(patterncategory));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param patterncategory The value of patterncategory as lessThan.
     */
    public void setPatterncategory_LessThan(String patterncategory) {
        regPatterncategory(CK_LT, fRES(patterncategory));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param patterncategory The value of patterncategory as greaterEqual.
     */
    public void setPatterncategory_GreaterEqual(String patterncategory) {
        regPatterncategory(CK_GE, fRES(patterncategory));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param patterncategory The value of patterncategory as lessEqual.
     */
    public void setPatterncategory_LessEqual(String patterncategory) {
        regPatterncategory(CK_LE, fRES(patterncategory));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param patterncategory The value of patterncategory as prefixSearch.
     */
    public void setPatterncategory_PrefixSearch(String patterncategory) {
        regPatterncategory(CK_PS, fRES(patterncategory));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param patterncategory The value of patterncategory as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPatterncategory_LikeSearch(String patterncategory, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(patterncategory), getCValuePatterncategory(), "PatternCategory", "Patterncategory", "patterncategory", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param patterncategoryList The collection of patterncategory as inScope.
     */
    public void setPatterncategory_InScope(Collection<String> patterncategoryList) {
        regPatterncategory(CK_INS, cTL(patterncategoryList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param patterncategory The collection of patterncategory as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPatterncategory_InScope(String patterncategory, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(patterncategory), getCValuePatterncategory(), "PatternCategory", "Patterncategory", "patterncategory", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPatterncategory_IsNull() { regPatterncategory(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPatterncategory_IsNotNull() { regPatterncategory(CK_ISNN, DUMMY_OBJECT); }

    protected void regPatterncategory(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePatterncategory(), "PatternCategory", "Patterncategory", "patterncategory");
    }
    protected void registerInlinePatterncategory(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePatterncategory(), "PatternCategory", "Patterncategory", "patterncategory");
    }
    abstract protected ConditionValue getCValuePatterncategory();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(150)}
     * @param patternname The value of patternname as equal.
     */
    public void setPatternname_Equal(String patternname) {
        regPatternname(CK_EQ, fRES(patternname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param patternname The value of patternname as notEqual.
     */
    public void setPatternname_NotEqual(String patternname) {
        regPatternname(CK_NE, fRES(patternname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param patternname The value of patternname as greaterThan.
     */
    public void setPatternname_GreaterThan(String patternname) {
        regPatternname(CK_GT, fRES(patternname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param patternname The value of patternname as lessThan.
     */
    public void setPatternname_LessThan(String patternname) {
        regPatternname(CK_LT, fRES(patternname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param patternname The value of patternname as greaterEqual.
     */
    public void setPatternname_GreaterEqual(String patternname) {
        regPatternname(CK_GE, fRES(patternname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param patternname The value of patternname as lessEqual.
     */
    public void setPatternname_LessEqual(String patternname) {
        regPatternname(CK_LE, fRES(patternname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param patternname The value of patternname as prefixSearch.
     */
    public void setPatternname_PrefixSearch(String patternname) {
        regPatternname(CK_PS, fRES(patternname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param patternname The value of patternname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPatternname_LikeSearch(String patternname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(patternname), getCValuePatternname(), "PatternName", "Patternname", "patternname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param patternnameList The collection of patternname as inScope.
     */
    public void setPatternname_InScope(Collection<String> patternnameList) {
        regPatternname(CK_INS, cTL(patternnameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param patternname The collection of patternname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPatternname_InScope(String patternname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(patternname), getCValuePatternname(), "PatternName", "Patternname", "patternname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPatternname_IsNull() { regPatternname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPatternname_IsNotNull() { regPatternname(CK_ISNN, DUMMY_OBJECT); }

    protected void regPatternname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePatternname(), "PatternName", "Patternname", "patternname");
    }
    protected void registerInlinePatternname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePatternname(), "PatternName", "Patternname", "patternname");
    }
    abstract protected ConditionValue getCValuePatternname();

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

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param patternxml The value of patternxml as equal.
     */
    public void setPatternxml_Equal(String patternxml) {
        regPatternxml(CK_EQ, fRES(patternxml));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param patternxml The value of patternxml as notEqual.
     */
    public void setPatternxml_NotEqual(String patternxml) {
        regPatternxml(CK_NE, fRES(patternxml));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param patternxml The value of patternxml as greaterThan.
     */
    public void setPatternxml_GreaterThan(String patternxml) {
        regPatternxml(CK_GT, fRES(patternxml));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param patternxml The value of patternxml as lessThan.
     */
    public void setPatternxml_LessThan(String patternxml) {
        regPatternxml(CK_LT, fRES(patternxml));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param patternxml The value of patternxml as greaterEqual.
     */
    public void setPatternxml_GreaterEqual(String patternxml) {
        regPatternxml(CK_GE, fRES(patternxml));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param patternxml The value of patternxml as lessEqual.
     */
    public void setPatternxml_LessEqual(String patternxml) {
        regPatternxml(CK_LE, fRES(patternxml));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param patternxml The value of patternxml as prefixSearch.
     */
    public void setPatternxml_PrefixSearch(String patternxml) {
        regPatternxml(CK_PS, fRES(patternxml));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param patternxml The value of patternxml as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPatternxml_LikeSearch(String patternxml, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(patternxml), getCValuePatternxml(), "PatternXML", "Patternxml", "patternxml", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param patternxmlList The collection of patternxml as inScope.
     */
    public void setPatternxml_InScope(Collection<String> patternxmlList) {
        regPatternxml(CK_INS, cTL(patternxmlList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param patternxml The collection of patternxml as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPatternxml_InScope(String patternxml, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(patternxml), getCValuePatternxml(), "PatternXML", "Patternxml", "patternxml", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPatternxml_IsNull() { regPatternxml(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPatternxml_IsNotNull() { regPatternxml(CK_ISNN, DUMMY_OBJECT); }

    protected void regPatternxml(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePatternxml(), "PatternXML", "Patternxml", "patternxml");
    }
    protected void registerInlinePatternxml(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePatternxml(), "PatternXML", "Patternxml", "patternxml");
    }
    abstract protected ConditionValue getCValuePatternxml();

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

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TUmlpatternCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TUmlpatternCQ.class.getName(); }
}
