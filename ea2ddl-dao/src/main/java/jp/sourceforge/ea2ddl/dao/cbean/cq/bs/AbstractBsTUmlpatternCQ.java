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
 * The abstract condition-query of t_umlpattern.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTUmlpatternCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTUmlpatternCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_umlpattern";
    }
    
    public String getTableSqlName() {
        return "t_umlpattern";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : COUNTER}
     * @param patternid The value of patternid as equal.
     */
    public void setPatternid_Equal(java.lang.Integer patternid) {
        regPatternid(CK_EQ, patternid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param patternid The value of patternid as notEqual.
     */
    public void setPatternid_NotEqual(java.lang.Integer patternid) {
        regPatternid(CK_NE, patternid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param patternid The value of patternid as greaterThan.
     */
    public void setPatternid_GreaterThan(java.lang.Integer patternid) {
        regPatternid(CK_GT, patternid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param patternid The value of patternid as lessThan.
     */
    public void setPatternid_LessThan(java.lang.Integer patternid) {
        regPatternid(CK_LT, patternid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param patternid The value of patternid as greaterEqual.
     */
    public void setPatternid_GreaterEqual(java.lang.Integer patternid) {
        regPatternid(CK_GE, patternid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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

    protected void regPatternid(ConditionKey k, Object v) { regQ(k, v, getCValuePatternid(), "PatternID"); }
    abstract protected ConditionValue getCValuePatternid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(100)}
     * @param patterncategory The value of patterncategory as equal.
     */
    public void setPatterncategory_Equal(String patterncategory) {
        regPatterncategory(CK_EQ, fRES(patterncategory));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patterncategory The value of patterncategory as notEqual.
     */
    public void setPatterncategory_NotEqual(String patterncategory) {
        regPatterncategory(CK_NE, fRES(patterncategory));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patterncategory The value of patterncategory as greaterThan.
     */
    public void setPatterncategory_GreaterThan(String patterncategory) {
        regPatterncategory(CK_GT, fRES(patterncategory));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patterncategory The value of patterncategory as lessThan.
     */
    public void setPatterncategory_LessThan(String patterncategory) {
        regPatterncategory(CK_LT, fRES(patterncategory));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patterncategory The value of patterncategory as greaterEqual.
     */
    public void setPatterncategory_GreaterEqual(String patterncategory) {
        regPatterncategory(CK_GE, fRES(patterncategory));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patterncategory The value of patterncategory as lessEqual.
     */
    public void setPatterncategory_LessEqual(String patterncategory) {
        regPatterncategory(CK_LE, fRES(patterncategory));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patterncategory The value of patterncategory as prefixSearch.
     */
    public void setPatterncategory_PrefixSearch(String patterncategory) {
        regPatterncategory(CK_PS, fRES(patterncategory));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param patterncategoryList The collection of patterncategory as inScope.
     */
    public void setPatterncategory_InScope(Collection<String> patterncategoryList) {
        regPatterncategory(CK_INS, cTL(patterncategoryList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param patterncategory The value of patterncategory as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPatterncategory_LikeSearch(String patterncategory, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(patterncategory), getCValuePatterncategory(), "PatternCategory", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param patterncategory The value of patterncategory as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPatterncategory_NotLikeSearch(String patterncategory, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(patterncategory), getCValuePatterncategory(), "PatternCategory", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPatterncategory_IsNull() { regPatterncategory(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPatterncategory_IsNotNull() { regPatterncategory(CK_ISNN, DOBJ); }

    protected void regPatterncategory(ConditionKey k, Object v) { regQ(k, v, getCValuePatterncategory(), "PatternCategory"); }
    abstract protected ConditionValue getCValuePatterncategory();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(150)}
     * @param patternname The value of patternname as equal.
     */
    public void setPatternname_Equal(String patternname) {
        regPatternname(CK_EQ, fRES(patternname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patternname The value of patternname as notEqual.
     */
    public void setPatternname_NotEqual(String patternname) {
        regPatternname(CK_NE, fRES(patternname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patternname The value of patternname as greaterThan.
     */
    public void setPatternname_GreaterThan(String patternname) {
        regPatternname(CK_GT, fRES(patternname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patternname The value of patternname as lessThan.
     */
    public void setPatternname_LessThan(String patternname) {
        regPatternname(CK_LT, fRES(patternname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patternname The value of patternname as greaterEqual.
     */
    public void setPatternname_GreaterEqual(String patternname) {
        regPatternname(CK_GE, fRES(patternname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patternname The value of patternname as lessEqual.
     */
    public void setPatternname_LessEqual(String patternname) {
        regPatternname(CK_LE, fRES(patternname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patternname The value of patternname as prefixSearch.
     */
    public void setPatternname_PrefixSearch(String patternname) {
        regPatternname(CK_PS, fRES(patternname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param patternnameList The collection of patternname as inScope.
     */
    public void setPatternname_InScope(Collection<String> patternnameList) {
        regPatternname(CK_INS, cTL(patternnameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param patternname The value of patternname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPatternname_LikeSearch(String patternname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(patternname), getCValuePatternname(), "PatternName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param patternname The value of patternname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPatternname_NotLikeSearch(String patternname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(patternname), getCValuePatternname(), "PatternName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPatternname_IsNull() { regPatternname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPatternname_IsNotNull() { regPatternname(CK_ISNN, DOBJ); }

    protected void regPatternname(ConditionKey k, Object v) { regQ(k, v, getCValuePatternname(), "PatternName"); }
    abstract protected ConditionValue getCValuePatternname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param style The value of style as equal.
     */
    public void setStyle_Equal(String style) {
        regStyle(CK_EQ, fRES(style));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as notEqual.
     */
    public void setStyle_NotEqual(String style) {
        regStyle(CK_NE, fRES(style));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as greaterThan.
     */
    public void setStyle_GreaterThan(String style) {
        regStyle(CK_GT, fRES(style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as lessThan.
     */
    public void setStyle_LessThan(String style) {
        regStyle(CK_LT, fRES(style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as greaterEqual.
     */
    public void setStyle_GreaterEqual(String style) {
        regStyle(CK_GE, fRES(style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as lessEqual.
     */
    public void setStyle_LessEqual(String style) {
        regStyle(CK_LE, fRES(style));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as prefixSearch.
     */
    public void setStyle_PrefixSearch(String style) {
        regStyle(CK_PS, fRES(style));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleList The collection of style as inScope.
     */
    public void setStyle_InScope(Collection<String> styleList) {
        regStyle(CK_INS, cTL(styleList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param style The value of style as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStyle_LikeSearch(String style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(style), getCValueStyle(), "Style", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param style The value of style as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStyle_NotLikeSearch(String style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(style), getCValueStyle(), "Style", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStyle_IsNull() { regStyle(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStyle_IsNotNull() { regStyle(CK_ISNN, DOBJ); }

    protected void regStyle(ConditionKey k, Object v) { regQ(k, v, getCValueStyle(), "Style"); }
    abstract protected ConditionValue getCValueStyle();

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

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param patternxml The value of patternxml as equal.
     */
    public void setPatternxml_Equal(String patternxml) {
        regPatternxml(CK_EQ, fRES(patternxml));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patternxml The value of patternxml as notEqual.
     */
    public void setPatternxml_NotEqual(String patternxml) {
        regPatternxml(CK_NE, fRES(patternxml));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patternxml The value of patternxml as greaterThan.
     */
    public void setPatternxml_GreaterThan(String patternxml) {
        regPatternxml(CK_GT, fRES(patternxml));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patternxml The value of patternxml as lessThan.
     */
    public void setPatternxml_LessThan(String patternxml) {
        regPatternxml(CK_LT, fRES(patternxml));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patternxml The value of patternxml as greaterEqual.
     */
    public void setPatternxml_GreaterEqual(String patternxml) {
        regPatternxml(CK_GE, fRES(patternxml));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patternxml The value of patternxml as lessEqual.
     */
    public void setPatternxml_LessEqual(String patternxml) {
        regPatternxml(CK_LE, fRES(patternxml));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param patternxml The value of patternxml as prefixSearch.
     */
    public void setPatternxml_PrefixSearch(String patternxml) {
        regPatternxml(CK_PS, fRES(patternxml));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param patternxmlList The collection of patternxml as inScope.
     */
    public void setPatternxml_InScope(Collection<String> patternxmlList) {
        regPatternxml(CK_INS, cTL(patternxmlList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param patternxml The value of patternxml as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPatternxml_LikeSearch(String patternxml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(patternxml), getCValuePatternxml(), "PatternXML", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param patternxml The value of patternxml as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPatternxml_NotLikeSearch(String patternxml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(patternxml), getCValuePatternxml(), "PatternXML", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPatternxml_IsNull() { regPatternxml(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPatternxml_IsNotNull() { regPatternxml(CK_ISNN, DOBJ); }

    protected void regPatternxml(ConditionKey k, Object v) { regQ(k, v, getCValuePatternxml(), "PatternXML"); }
    abstract protected ConditionValue getCValuePatternxml();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param version The value of version as equal.
     */
    public void setVersion_Equal(String version) {
        regVersion(CK_EQ, fRES(version));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as notEqual.
     */
    public void setVersion_NotEqual(String version) {
        regVersion(CK_NE, fRES(version));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as greaterThan.
     */
    public void setVersion_GreaterThan(String version) {
        regVersion(CK_GT, fRES(version));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as lessThan.
     */
    public void setVersion_LessThan(String version) {
        regVersion(CK_LT, fRES(version));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as greaterEqual.
     */
    public void setVersion_GreaterEqual(String version) {
        regVersion(CK_GE, fRES(version));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as lessEqual.
     */
    public void setVersion_LessEqual(String version) {
        regVersion(CK_LE, fRES(version));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as prefixSearch.
     */
    public void setVersion_PrefixSearch(String version) {
        regVersion(CK_PS, fRES(version));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param versionList The collection of version as inScope.
     */
    public void setVersion_InScope(Collection<String> versionList) {
        regVersion(CK_INS, cTL(versionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param version The value of version as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVersion_LikeSearch(String version, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(version), getCValueVersion(), "Version", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param version The value of version as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVersion_NotLikeSearch(String version, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(version), getCValueVersion(), "Version", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setVersion_IsNull() { regVersion(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setVersion_IsNotNull() { regVersion(CK_ISNN, DOBJ); }

    protected void regVersion(ConditionKey k, Object v) { regQ(k, v, getCValueVersion(), "Version"); }
    abstract protected ConditionValue getCValueVersion();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TUmlpatternCB.class.getName(); }
    String xCQ() { return TUmlpatternCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
