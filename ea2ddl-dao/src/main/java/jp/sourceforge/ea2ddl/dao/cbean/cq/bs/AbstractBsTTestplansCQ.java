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
 * The abstract condition-query of t_testplans.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTestplansCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTestplansCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_testplans";
    }
    
    public String getTableSqlName() {
        return "t_testplans";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(50)}
     * @param planid The value of planid as equal.
     */
    public void setPlanid_Equal(String planid) {
        regPlanid(CK_EQ, fRES(planid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param planid The value of planid as notEqual.
     */
    public void setPlanid_NotEqual(String planid) {
        regPlanid(CK_NE, fRES(planid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param planid The value of planid as greaterThan.
     */
    public void setPlanid_GreaterThan(String planid) {
        regPlanid(CK_GT, fRES(planid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param planid The value of planid as lessThan.
     */
    public void setPlanid_LessThan(String planid) {
        regPlanid(CK_LT, fRES(planid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param planid The value of planid as greaterEqual.
     */
    public void setPlanid_GreaterEqual(String planid) {
        regPlanid(CK_GE, fRES(planid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param planid The value of planid as lessEqual.
     */
    public void setPlanid_LessEqual(String planid) {
        regPlanid(CK_LE, fRES(planid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param planid The value of planid as prefixSearch.
     */
    public void setPlanid_PrefixSearch(String planid) {
        regPlanid(CK_PS, fRES(planid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param planidList The collection of planid as inScope.
     */
    public void setPlanid_InScope(Collection<String> planidList) {
        regPlanid(CK_INS, cTL(planidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param planid The value of planid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanid_LikeSearch(String planid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planid), getCValuePlanid(), "PlanID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param planid The value of planid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanid_NotLikeSearch(String planid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planid), getCValuePlanid(), "PlanID", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPlanid_IsNull() { regPlanid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPlanid_IsNotNull() { regPlanid(CK_ISNN, DOBJ); }

    protected void regPlanid(ConditionKey k, Object v) { regQ(k, v, getCValuePlanid(), "PlanID"); }
    abstract protected ConditionValue getCValuePlanid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(100)}
     * @param category The value of category as equal.
     */
    public void setCategory_Equal(String category) {
        regCategory(CK_EQ, fRES(category));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param category The value of category as notEqual.
     */
    public void setCategory_NotEqual(String category) {
        regCategory(CK_NE, fRES(category));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param category The value of category as greaterThan.
     */
    public void setCategory_GreaterThan(String category) {
        regCategory(CK_GT, fRES(category));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param category The value of category as lessThan.
     */
    public void setCategory_LessThan(String category) {
        regCategory(CK_LT, fRES(category));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param category The value of category as greaterEqual.
     */
    public void setCategory_GreaterEqual(String category) {
        regCategory(CK_GE, fRES(category));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param category The value of category as lessEqual.
     */
    public void setCategory_LessEqual(String category) {
        regCategory(CK_LE, fRES(category));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param category The value of category as prefixSearch.
     */
    public void setCategory_PrefixSearch(String category) {
        regCategory(CK_PS, fRES(category));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param categoryList The collection of category as inScope.
     */
    public void setCategory_InScope(Collection<String> categoryList) {
        regCategory(CK_INS, cTL(categoryList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param category The value of category as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCategory_LikeSearch(String category, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(category), getCValueCategory(), "Category", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param category The value of category as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCategory_NotLikeSearch(String category, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(category), getCValueCategory(), "Category", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setCategory_IsNull() { regCategory(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setCategory_IsNotNull() { regCategory(CK_ISNN, DOBJ); }

    protected void regCategory(ConditionKey k, Object v) { regQ(k, v, getCValueCategory(), "Category"); }
    abstract protected ConditionValue getCValueCategory();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(150)}
     * @param name The value of name as equal.
     */
    public void setName_Equal(String name) {
        regName(CK_EQ, fRES(name));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as notEqual.
     */
    public void setName_NotEqual(String name) {
        regName(CK_NE, fRES(name));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(String name) {
        regName(CK_PS, fRES(name));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param nameList The collection of name as inScope.
     */
    public void setName_InScope(Collection<String> nameList) {
        regName(CK_INS, cTL(nameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), getCValueName(), "Name", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), getCValueName(), "Name", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setName_IsNull() { regName(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DOBJ); }

    protected void regName(ConditionKey k, Object v) { regQ(k, v, getCValueName(), "Name"); }
    abstract protected ConditionValue getCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param author The value of author as equal.
     */
    public void setAuthor_Equal(String author) {
        regAuthor(CK_EQ, fRES(author));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param author The value of author as notEqual.
     */
    public void setAuthor_NotEqual(String author) {
        regAuthor(CK_NE, fRES(author));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param author The value of author as greaterThan.
     */
    public void setAuthor_GreaterThan(String author) {
        regAuthor(CK_GT, fRES(author));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param author The value of author as lessThan.
     */
    public void setAuthor_LessThan(String author) {
        regAuthor(CK_LT, fRES(author));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param author The value of author as greaterEqual.
     */
    public void setAuthor_GreaterEqual(String author) {
        regAuthor(CK_GE, fRES(author));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param author The value of author as lessEqual.
     */
    public void setAuthor_LessEqual(String author) {
        regAuthor(CK_LE, fRES(author));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param author The value of author as prefixSearch.
     */
    public void setAuthor_PrefixSearch(String author) {
        regAuthor(CK_PS, fRES(author));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param authorList The collection of author as inScope.
     */
    public void setAuthor_InScope(Collection<String> authorList) {
        regAuthor(CK_INS, cTL(authorList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param author The value of author as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAuthor_LikeSearch(String author, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(author), getCValueAuthor(), "Author", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param author The value of author as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAuthor_NotLikeSearch(String author, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(author), getCValueAuthor(), "Author", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setAuthor_IsNull() { regAuthor(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setAuthor_IsNotNull() { regAuthor(CK_ISNN, DOBJ); }

    protected void regAuthor(ConditionKey k, Object v) { regQ(k, v, getCValueAuthor(), "Author"); }
    abstract protected ConditionValue getCValueAuthor();

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
     * @param testplan The value of testplan as equal.
     */
    public void setTestplan_Equal(String testplan) {
        regTestplan(CK_EQ, fRES(testplan));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testplan The value of testplan as notEqual.
     */
    public void setTestplan_NotEqual(String testplan) {
        regTestplan(CK_NE, fRES(testplan));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testplan The value of testplan as greaterThan.
     */
    public void setTestplan_GreaterThan(String testplan) {
        regTestplan(CK_GT, fRES(testplan));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testplan The value of testplan as lessThan.
     */
    public void setTestplan_LessThan(String testplan) {
        regTestplan(CK_LT, fRES(testplan));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testplan The value of testplan as greaterEqual.
     */
    public void setTestplan_GreaterEqual(String testplan) {
        regTestplan(CK_GE, fRES(testplan));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testplan The value of testplan as lessEqual.
     */
    public void setTestplan_LessEqual(String testplan) {
        regTestplan(CK_LE, fRES(testplan));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testplan The value of testplan as prefixSearch.
     */
    public void setTestplan_PrefixSearch(String testplan) {
        regTestplan(CK_PS, fRES(testplan));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param testplanList The collection of testplan as inScope.
     */
    public void setTestplan_InScope(Collection<String> testplanList) {
        regTestplan(CK_INS, cTL(testplanList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param testplan The value of testplan as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTestplan_LikeSearch(String testplan, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(testplan), getCValueTestplan(), "TestPlan", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param testplan The value of testplan as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTestplan_NotLikeSearch(String testplan, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(testplan), getCValueTestplan(), "TestPlan", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTestplan_IsNull() { regTestplan(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTestplan_IsNotNull() { regTestplan(CK_ISNN, DOBJ); }

    protected void regTestplan(ConditionKey k, Object v) { regQ(k, v, getCValueTestplan(), "TestPlan"); }
    abstract protected ConditionValue getCValueTestplan();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TTestplansCB.class.getName(); }
    String xCQ() { return TTestplansCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
