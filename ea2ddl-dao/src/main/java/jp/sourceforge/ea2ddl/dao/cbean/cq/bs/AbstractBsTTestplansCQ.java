package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_testplans.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTTestplansCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTestplansCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_testplans";
    }
    
    public String getTableSqlName() {
        return "t_testplans";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(50)}
     * @param planid The value of planid as equal.
     */
    public void setPlanid_Equal(String planid) {
        regPlanid(CK_EQ, fRES(planid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param planid The value of planid as notEqual.
     */
    public void setPlanid_NotEqual(String planid) {
        regPlanid(CK_NE, fRES(planid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param planid The value of planid as greaterThan.
     */
    public void setPlanid_GreaterThan(String planid) {
        regPlanid(CK_GT, fRES(planid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param planid The value of planid as lessThan.
     */
    public void setPlanid_LessThan(String planid) {
        regPlanid(CK_LT, fRES(planid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param planid The value of planid as greaterEqual.
     */
    public void setPlanid_GreaterEqual(String planid) {
        regPlanid(CK_GE, fRES(planid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param planid The value of planid as lessEqual.
     */
    public void setPlanid_LessEqual(String planid) {
        regPlanid(CK_LE, fRES(planid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param planid The value of planid as prefixSearch.
     */
    public void setPlanid_PrefixSearch(String planid) {
        regPlanid(CK_PS, fRES(planid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param planid The value of planid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanid_LikeSearch(String planid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(planid), getCValuePlanid(), "PlanID", "Planid", "planid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param planidList The collection of planid as inScope.
     */
    public void setPlanid_InScope(Collection<String> planidList) {
        regPlanid(CK_INS, cTL(planidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param planid The collection of planid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPlanid_InScope(String planid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(planid), getCValuePlanid(), "PlanID", "Planid", "planid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPlanid_IsNull() { regPlanid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPlanid_IsNotNull() { regPlanid(CK_ISNN, DUMMY_OBJECT); }

    protected void regPlanid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePlanid(), "PlanID", "Planid", "planid");
    }
    protected void registerInlinePlanid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePlanid(), "PlanID", "Planid", "planid");
    }
    abstract protected ConditionValue getCValuePlanid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param category The value of category as equal.
     */
    public void setCategory_Equal(String category) {
        regCategory(CK_EQ, fRES(category));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as notEqual.
     */
    public void setCategory_NotEqual(String category) {
        regCategory(CK_NE, fRES(category));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as greaterThan.
     */
    public void setCategory_GreaterThan(String category) {
        regCategory(CK_GT, fRES(category));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as lessThan.
     */
    public void setCategory_LessThan(String category) {
        regCategory(CK_LT, fRES(category));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as greaterEqual.
     */
    public void setCategory_GreaterEqual(String category) {
        regCategory(CK_GE, fRES(category));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as lessEqual.
     */
    public void setCategory_LessEqual(String category) {
        regCategory(CK_LE, fRES(category));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as prefixSearch.
     */
    public void setCategory_PrefixSearch(String category) {
        regCategory(CK_PS, fRES(category));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param category The value of category as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCategory_LikeSearch(String category, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(category), getCValueCategory(), "Category", "Category", "category", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param categoryList The collection of category as inScope.
     */
    public void setCategory_InScope(Collection<String> categoryList) {
        regCategory(CK_INS, cTL(categoryList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param category The collection of category as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setCategory_InScope(String category, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(category), getCValueCategory(), "Category", "Category", "category", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCategory_IsNull() { regCategory(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCategory_IsNotNull() { regCategory(CK_ISNN, DUMMY_OBJECT); }

    protected void regCategory(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCategory(), "Category", "Category", "category");
    }
    protected void registerInlineCategory(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCategory(), "Category", "Category", "category");
    }
    abstract protected ConditionValue getCValueCategory();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(150)}
     * @param name The value of name as equal.
     */
    public void setName_Equal(String name) {
        regName(CK_EQ, fRES(name));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as notEqual.
     */
    public void setName_NotEqual(String name) {
        regName(CK_NE, fRES(name));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(String name) {
        regName(CK_PS, fRES(name));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(name), getCValueName(), "Name", "Name", "name", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param nameList The collection of name as inScope.
     */
    public void setName_InScope(Collection<String> nameList) {
        regName(CK_INS, cTL(nameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param name The collection of name as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setName_InScope(String name, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(name), getCValueName(), "Name", "Name", "name", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setName_IsNull() { regName(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DUMMY_OBJECT); }

    protected void regName(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueName(), "Name", "Name", "name");
    }
    protected void registerInlineName(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueName(), "Name", "Name", "name");
    }
    abstract protected ConditionValue getCValueName();

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
     * @param testplan The value of testplan as equal.
     */
    public void setTestplan_Equal(String testplan) {
        regTestplan(CK_EQ, fRES(testplan));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param testplan The value of testplan as notEqual.
     */
    public void setTestplan_NotEqual(String testplan) {
        regTestplan(CK_NE, fRES(testplan));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param testplan The value of testplan as greaterThan.
     */
    public void setTestplan_GreaterThan(String testplan) {
        regTestplan(CK_GT, fRES(testplan));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param testplan The value of testplan as lessThan.
     */
    public void setTestplan_LessThan(String testplan) {
        regTestplan(CK_LT, fRES(testplan));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param testplan The value of testplan as greaterEqual.
     */
    public void setTestplan_GreaterEqual(String testplan) {
        regTestplan(CK_GE, fRES(testplan));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param testplan The value of testplan as lessEqual.
     */
    public void setTestplan_LessEqual(String testplan) {
        regTestplan(CK_LE, fRES(testplan));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param testplan The value of testplan as prefixSearch.
     */
    public void setTestplan_PrefixSearch(String testplan) {
        regTestplan(CK_PS, fRES(testplan));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param testplan The value of testplan as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTestplan_LikeSearch(String testplan, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(testplan), getCValueTestplan(), "TestPlan", "Testplan", "testplan", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param testplanList The collection of testplan as inScope.
     */
    public void setTestplan_InScope(Collection<String> testplanList) {
        regTestplan(CK_INS, cTL(testplanList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param testplan The collection of testplan as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTestplan_InScope(String testplan, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(testplan), getCValueTestplan(), "TestPlan", "Testplan", "testplan", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTestplan_IsNull() { regTestplan(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTestplan_IsNotNull() { regTestplan(CK_ISNN, DUMMY_OBJECT); }

    protected void regTestplan(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTestplan(), "TestPlan", "Testplan", "testplan");
    }
    protected void registerInlineTestplan(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTestplan(), "TestPlan", "Testplan", "testplan");
    }
    abstract protected ConditionValue getCValueTestplan();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TTestplansCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TTestplansCQ.class.getName(); }
}
