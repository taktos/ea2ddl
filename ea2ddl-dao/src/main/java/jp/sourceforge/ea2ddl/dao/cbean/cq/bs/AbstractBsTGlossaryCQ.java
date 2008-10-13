package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_glossary.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTGlossaryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTGlossaryCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_glossary";
    }
    
    public String getTableSqlName() {
        return "t_glossary";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(255)}
     * @param term The value of term as equal.
     */
    public void setTerm_Equal(String term) {
        regTerm(CK_EQ, fRES(term));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param term The value of term as notEqual.
     */
    public void setTerm_NotEqual(String term) {
        regTerm(CK_NE, fRES(term));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param term The value of term as greaterThan.
     */
    public void setTerm_GreaterThan(String term) {
        regTerm(CK_GT, fRES(term));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param term The value of term as lessThan.
     */
    public void setTerm_LessThan(String term) {
        regTerm(CK_LT, fRES(term));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param term The value of term as greaterEqual.
     */
    public void setTerm_GreaterEqual(String term) {
        regTerm(CK_GE, fRES(term));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param term The value of term as lessEqual.
     */
    public void setTerm_LessEqual(String term) {
        regTerm(CK_LE, fRES(term));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param term The value of term as prefixSearch.
     */
    public void setTerm_PrefixSearch(String term) {
        regTerm(CK_PS, fRES(term));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param term The value of term as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTerm_LikeSearch(String term, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(term), getCValueTerm(), "Term", "Term", "term", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param termList The collection of term as inScope.
     */
    public void setTerm_InScope(Collection<String> termList) {
        regTerm(CK_INS, cTL(termList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param term The collection of term as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTerm_InScope(String term, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(term), getCValueTerm(), "Term", "Term", "term", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTerm_IsNull() { regTerm(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTerm_IsNotNull() { regTerm(CK_ISNN, DUMMY_OBJECT); }

    protected void regTerm(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTerm(), "Term", "Term", "term");
    }
    protected void registerInlineTerm(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTerm(), "Term", "Term", "term");
    }
    abstract protected ConditionValue getCValueTerm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param type The value of type as equal.
     */
    public void setType_Equal(String type) {
        regType(CK_EQ, fRES(type));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as notEqual.
     */
    public void setType_NotEqual(String type) {
        regType(CK_NE, fRES(type));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as greaterThan.
     */
    public void setType_GreaterThan(String type) {
        regType(CK_GT, fRES(type));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as lessThan.
     */
    public void setType_LessThan(String type) {
        regType(CK_LT, fRES(type));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as greaterEqual.
     */
    public void setType_GreaterEqual(String type) {
        regType(CK_GE, fRES(type));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as lessEqual.
     */
    public void setType_LessEqual(String type) {
        regType(CK_LE, fRES(type));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as prefixSearch.
     */
    public void setType_PrefixSearch(String type) {
        regType(CK_PS, fRES(type));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param type The value of type as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setType_LikeSearch(String type, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(type), getCValueType(), "Type", "Type", "type", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeList The collection of type as inScope.
     */
    public void setType_InScope(Collection<String> typeList) {
        regType(CK_INS, cTL(typeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param type The collection of type as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setType_InScope(String type, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(type), getCValueType(), "Type", "Type", "type", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setType_IsNull() { regType(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setType_IsNotNull() { regType(CK_ISNN, DUMMY_OBJECT); }

    protected void regType(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueType(), "Type", "Type", "type");
    }
    protected void registerInlineType(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueType(), "Type", "Type", "type");
    }
    abstract protected ConditionValue getCValueType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param meaning The value of meaning as equal.
     */
    public void setMeaning_Equal(String meaning) {
        regMeaning(CK_EQ, fRES(meaning));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param meaning The value of meaning as notEqual.
     */
    public void setMeaning_NotEqual(String meaning) {
        regMeaning(CK_NE, fRES(meaning));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param meaning The value of meaning as greaterThan.
     */
    public void setMeaning_GreaterThan(String meaning) {
        regMeaning(CK_GT, fRES(meaning));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param meaning The value of meaning as lessThan.
     */
    public void setMeaning_LessThan(String meaning) {
        regMeaning(CK_LT, fRES(meaning));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param meaning The value of meaning as greaterEqual.
     */
    public void setMeaning_GreaterEqual(String meaning) {
        regMeaning(CK_GE, fRES(meaning));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param meaning The value of meaning as lessEqual.
     */
    public void setMeaning_LessEqual(String meaning) {
        regMeaning(CK_LE, fRES(meaning));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param meaning The value of meaning as prefixSearch.
     */
    public void setMeaning_PrefixSearch(String meaning) {
        regMeaning(CK_PS, fRES(meaning));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param meaning The value of meaning as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMeaning_LikeSearch(String meaning, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(meaning), getCValueMeaning(), "Meaning", "Meaning", "meaning", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param meaningList The collection of meaning as inScope.
     */
    public void setMeaning_InScope(Collection<String> meaningList) {
        regMeaning(CK_INS, cTL(meaningList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param meaning The collection of meaning as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setMeaning_InScope(String meaning, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(meaning), getCValueMeaning(), "Meaning", "Meaning", "meaning", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setMeaning_IsNull() { regMeaning(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setMeaning_IsNotNull() { regMeaning(CK_ISNN, DUMMY_OBJECT); }

    protected void regMeaning(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueMeaning(), "Meaning", "Meaning", "meaning");
    }
    protected void registerInlineMeaning(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueMeaning(), "Meaning", "Meaning", "meaning");
    }
    abstract protected ConditionValue getCValueMeaning();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {COUNTER : NotNull}
     * @param glossaryid The value of glossaryid as equal.
     */
    public void setGlossaryid_Equal(java.lang.Integer glossaryid) {
        regGlossaryid(CK_EQ, glossaryid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param glossaryid The value of glossaryid as notEqual.
     */
    public void setGlossaryid_NotEqual(java.lang.Integer glossaryid) {
        regGlossaryid(CK_NE, glossaryid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param glossaryid The value of glossaryid as greaterThan.
     */
    public void setGlossaryid_GreaterThan(java.lang.Integer glossaryid) {
        regGlossaryid(CK_GT, glossaryid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param glossaryid The value of glossaryid as lessThan.
     */
    public void setGlossaryid_LessThan(java.lang.Integer glossaryid) {
        regGlossaryid(CK_LT, glossaryid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param glossaryid The value of glossaryid as greaterEqual.
     */
    public void setGlossaryid_GreaterEqual(java.lang.Integer glossaryid) {
        regGlossaryid(CK_GE, glossaryid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param glossaryid The value of glossaryid as lessEqual.
     */
    public void setGlossaryid_LessEqual(java.lang.Integer glossaryid) {
        regGlossaryid(CK_LE, glossaryid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param glossaryidList The collection of glossaryid as inScope.
     */
    public void setGlossaryid_InScope(Collection<java.lang.Integer> glossaryidList) {
        regGlossaryid(CK_INS, cTL(glossaryidList));
    }

    protected void regGlossaryid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueGlossaryid(), "GlossaryID", "Glossaryid", "glossaryid");
    }
    protected void registerInlineGlossaryid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueGlossaryid(), "GlossaryID", "Glossaryid", "glossaryid");
    }
    abstract protected ConditionValue getCValueGlossaryid();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TGlossaryCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TGlossaryCQ.class.getName(); }
}
