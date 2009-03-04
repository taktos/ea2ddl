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
 * The abstract condition-query of t_script.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTScriptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTScriptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_script";
    }
    
    public String getTableSqlName() {
        return "t_script";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : NotNull : COUNTER}
     * @param scriptid The value of scriptid as equal.
     */
    public void setScriptid_Equal(java.lang.Integer scriptid) {
        regScriptid(CK_EQ, scriptid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param scriptid The value of scriptid as notEqual.
     */
    public void setScriptid_NotEqual(java.lang.Integer scriptid) {
        regScriptid(CK_NE, scriptid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param scriptid The value of scriptid as greaterThan.
     */
    public void setScriptid_GreaterThan(java.lang.Integer scriptid) {
        regScriptid(CK_GT, scriptid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param scriptid The value of scriptid as lessThan.
     */
    public void setScriptid_LessThan(java.lang.Integer scriptid) {
        regScriptid(CK_LT, scriptid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param scriptid The value of scriptid as greaterEqual.
     */
    public void setScriptid_GreaterEqual(java.lang.Integer scriptid) {
        regScriptid(CK_GE, scriptid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param scriptid The value of scriptid as lessEqual.
     */
    public void setScriptid_LessEqual(java.lang.Integer scriptid) {
        regScriptid(CK_LE, scriptid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param scriptidList The collection of scriptid as inScope.
     */
    public void setScriptid_InScope(Collection<java.lang.Integer> scriptidList) {
        regScriptid(CK_INS, cTL(scriptidList));
    }

    protected void regScriptid(ConditionKey k, Object v) { regQ(k, v, getCValueScriptid(), "ScriptID"); }
    abstract protected ConditionValue getCValueScriptid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(100)}
     * @param scriptcategory The value of scriptcategory as equal.
     */
    public void setScriptcategory_Equal(String scriptcategory) {
        regScriptcategory(CK_EQ, fRES(scriptcategory));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptcategory The value of scriptcategory as notEqual.
     */
    public void setScriptcategory_NotEqual(String scriptcategory) {
        regScriptcategory(CK_NE, fRES(scriptcategory));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptcategory The value of scriptcategory as greaterThan.
     */
    public void setScriptcategory_GreaterThan(String scriptcategory) {
        regScriptcategory(CK_GT, fRES(scriptcategory));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptcategory The value of scriptcategory as lessThan.
     */
    public void setScriptcategory_LessThan(String scriptcategory) {
        regScriptcategory(CK_LT, fRES(scriptcategory));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptcategory The value of scriptcategory as greaterEqual.
     */
    public void setScriptcategory_GreaterEqual(String scriptcategory) {
        regScriptcategory(CK_GE, fRES(scriptcategory));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptcategory The value of scriptcategory as lessEqual.
     */
    public void setScriptcategory_LessEqual(String scriptcategory) {
        regScriptcategory(CK_LE, fRES(scriptcategory));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptcategory The value of scriptcategory as prefixSearch.
     */
    public void setScriptcategory_PrefixSearch(String scriptcategory) {
        regScriptcategory(CK_PS, fRES(scriptcategory));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param scriptcategoryList The collection of scriptcategory as inScope.
     */
    public void setScriptcategory_InScope(Collection<String> scriptcategoryList) {
        regScriptcategory(CK_INS, cTL(scriptcategoryList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scriptcategory The value of scriptcategory as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScriptcategory_LikeSearch(String scriptcategory, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scriptcategory), getCValueScriptcategory(), "ScriptCategory", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scriptcategory The value of scriptcategory as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScriptcategory_NotLikeSearch(String scriptcategory, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scriptcategory), getCValueScriptcategory(), "ScriptCategory", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setScriptcategory_IsNull() { regScriptcategory(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setScriptcategory_IsNotNull() { regScriptcategory(CK_ISNN, DOBJ); }

    protected void regScriptcategory(ConditionKey k, Object v) { regQ(k, v, getCValueScriptcategory(), "ScriptCategory"); }
    abstract protected ConditionValue getCValueScriptcategory();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(150)}
     * @param scriptname The value of scriptname as equal.
     */
    public void setScriptname_Equal(String scriptname) {
        regScriptname(CK_EQ, fRES(scriptname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptname The value of scriptname as notEqual.
     */
    public void setScriptname_NotEqual(String scriptname) {
        regScriptname(CK_NE, fRES(scriptname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptname The value of scriptname as greaterThan.
     */
    public void setScriptname_GreaterThan(String scriptname) {
        regScriptname(CK_GT, fRES(scriptname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptname The value of scriptname as lessThan.
     */
    public void setScriptname_LessThan(String scriptname) {
        regScriptname(CK_LT, fRES(scriptname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptname The value of scriptname as greaterEqual.
     */
    public void setScriptname_GreaterEqual(String scriptname) {
        regScriptname(CK_GE, fRES(scriptname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptname The value of scriptname as lessEqual.
     */
    public void setScriptname_LessEqual(String scriptname) {
        regScriptname(CK_LE, fRES(scriptname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptname The value of scriptname as prefixSearch.
     */
    public void setScriptname_PrefixSearch(String scriptname) {
        regScriptname(CK_PS, fRES(scriptname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param scriptnameList The collection of scriptname as inScope.
     */
    public void setScriptname_InScope(Collection<String> scriptnameList) {
        regScriptname(CK_INS, cTL(scriptnameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scriptname The value of scriptname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScriptname_LikeSearch(String scriptname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scriptname), getCValueScriptname(), "ScriptName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scriptname The value of scriptname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScriptname_NotLikeSearch(String scriptname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scriptname), getCValueScriptname(), "ScriptName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setScriptname_IsNull() { regScriptname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setScriptname_IsNotNull() { regScriptname(CK_ISNN, DOBJ); }

    protected void regScriptname(ConditionKey k, Object v) { regQ(k, v, getCValueScriptname(), "ScriptName"); }
    abstract protected ConditionValue getCValueScriptname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param scriptauthor The value of scriptauthor as equal.
     */
    public void setScriptauthor_Equal(String scriptauthor) {
        regScriptauthor(CK_EQ, fRES(scriptauthor));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptauthor The value of scriptauthor as notEqual.
     */
    public void setScriptauthor_NotEqual(String scriptauthor) {
        regScriptauthor(CK_NE, fRES(scriptauthor));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptauthor The value of scriptauthor as greaterThan.
     */
    public void setScriptauthor_GreaterThan(String scriptauthor) {
        regScriptauthor(CK_GT, fRES(scriptauthor));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptauthor The value of scriptauthor as lessThan.
     */
    public void setScriptauthor_LessThan(String scriptauthor) {
        regScriptauthor(CK_LT, fRES(scriptauthor));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptauthor The value of scriptauthor as greaterEqual.
     */
    public void setScriptauthor_GreaterEqual(String scriptauthor) {
        regScriptauthor(CK_GE, fRES(scriptauthor));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptauthor The value of scriptauthor as lessEqual.
     */
    public void setScriptauthor_LessEqual(String scriptauthor) {
        regScriptauthor(CK_LE, fRES(scriptauthor));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scriptauthor The value of scriptauthor as prefixSearch.
     */
    public void setScriptauthor_PrefixSearch(String scriptauthor) {
        regScriptauthor(CK_PS, fRES(scriptauthor));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param scriptauthorList The collection of scriptauthor as inScope.
     */
    public void setScriptauthor_InScope(Collection<String> scriptauthorList) {
        regScriptauthor(CK_INS, cTL(scriptauthorList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scriptauthor The value of scriptauthor as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScriptauthor_LikeSearch(String scriptauthor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scriptauthor), getCValueScriptauthor(), "ScriptAuthor", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scriptauthor The value of scriptauthor as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScriptauthor_NotLikeSearch(String scriptauthor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scriptauthor), getCValueScriptauthor(), "ScriptAuthor", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setScriptauthor_IsNull() { regScriptauthor(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setScriptauthor_IsNotNull() { regScriptauthor(CK_ISNN, DOBJ); }

    protected void regScriptauthor(ConditionKey k, Object v) { regQ(k, v, getCValueScriptauthor(), "ScriptAuthor"); }
    abstract protected ConditionValue getCValueScriptauthor();

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
     * @param script The value of script as equal.
     */
    public void setScript_Equal(String script) {
        regScript(CK_EQ, fRES(script));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param script The value of script as notEqual.
     */
    public void setScript_NotEqual(String script) {
        regScript(CK_NE, fRES(script));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param script The value of script as greaterThan.
     */
    public void setScript_GreaterThan(String script) {
        regScript(CK_GT, fRES(script));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param script The value of script as lessThan.
     */
    public void setScript_LessThan(String script) {
        regScript(CK_LT, fRES(script));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param script The value of script as greaterEqual.
     */
    public void setScript_GreaterEqual(String script) {
        regScript(CK_GE, fRES(script));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param script The value of script as lessEqual.
     */
    public void setScript_LessEqual(String script) {
        regScript(CK_LE, fRES(script));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param script The value of script as prefixSearch.
     */
    public void setScript_PrefixSearch(String script) {
        regScript(CK_PS, fRES(script));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param scriptList The collection of script as inScope.
     */
    public void setScript_InScope(Collection<String> scriptList) {
        regScript(CK_INS, cTL(scriptList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param script The value of script as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScript_LikeSearch(String script, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(script), getCValueScript(), "Script", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param script The value of script as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScript_NotLikeSearch(String script, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(script), getCValueScript(), "Script", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setScript_IsNull() { regScript(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setScript_IsNotNull() { regScript(CK_ISNN, DOBJ); }

    protected void regScript(ConditionKey k, Object v) { regQ(k, v, getCValueScript(), "Script"); }
    abstract protected ConditionValue getCValueScript();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TScriptCB.class.getName(); }
    String xCQ() { return TScriptCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
