package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of usysQueries.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsUsysqueriesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUsysqueriesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "usysQueries";
    }
    
    public String getTableSqlName() {
        return "usysQueries";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param queryname The value of queryname as equal.
     */
    public void setQueryname_Equal(String queryname) {
        regQueryname(CK_EQ, fRES(queryname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param queryname The value of queryname as notEqual.
     */
    public void setQueryname_NotEqual(String queryname) {
        regQueryname(CK_NE, fRES(queryname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param queryname The value of queryname as greaterThan.
     */
    public void setQueryname_GreaterThan(String queryname) {
        regQueryname(CK_GT, fRES(queryname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param queryname The value of queryname as lessThan.
     */
    public void setQueryname_LessThan(String queryname) {
        regQueryname(CK_LT, fRES(queryname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param queryname The value of queryname as greaterEqual.
     */
    public void setQueryname_GreaterEqual(String queryname) {
        regQueryname(CK_GE, fRES(queryname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param queryname The value of queryname as lessEqual.
     */
    public void setQueryname_LessEqual(String queryname) {
        regQueryname(CK_LE, fRES(queryname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param queryname The value of queryname as prefixSearch.
     */
    public void setQueryname_PrefixSearch(String queryname) {
        regQueryname(CK_PS, fRES(queryname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param queryname The value of queryname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQueryname_LikeSearch(String queryname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(queryname), getCValueQueryname(), "QueryName", "Queryname", "queryname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param querynameList The collection of queryname as inScope.
     */
    public void setQueryname_InScope(Collection<String> querynameList) {
        regQueryname(CK_INS, cTL(querynameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param queryname The collection of queryname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setQueryname_InScope(String queryname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(queryname), getCValueQueryname(), "QueryName", "Queryname", "queryname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setQueryname_IsNull() { regQueryname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setQueryname_IsNotNull() { regQueryname(CK_ISNN, DUMMY_OBJECT); }

    protected void regQueryname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueQueryname(), "QueryName", "Queryname", "queryname");
    }
    protected void registerInlineQueryname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueQueryname(), "QueryName", "Queryname", "queryname");
    }
    abstract protected ConditionValue getCValueQueryname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param newname The value of newname as equal.
     */
    public void setNewname_Equal(String newname) {
        regNewname(CK_EQ, fRES(newname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param newname The value of newname as notEqual.
     */
    public void setNewname_NotEqual(String newname) {
        regNewname(CK_NE, fRES(newname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param newname The value of newname as greaterThan.
     */
    public void setNewname_GreaterThan(String newname) {
        regNewname(CK_GT, fRES(newname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param newname The value of newname as lessThan.
     */
    public void setNewname_LessThan(String newname) {
        regNewname(CK_LT, fRES(newname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param newname The value of newname as greaterEqual.
     */
    public void setNewname_GreaterEqual(String newname) {
        regNewname(CK_GE, fRES(newname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param newname The value of newname as lessEqual.
     */
    public void setNewname_LessEqual(String newname) {
        regNewname(CK_LE, fRES(newname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param newname The value of newname as prefixSearch.
     */
    public void setNewname_PrefixSearch(String newname) {
        regNewname(CK_PS, fRES(newname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param newname The value of newname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNewname_LikeSearch(String newname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(newname), getCValueNewname(), "NewName", "Newname", "newname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param newnameList The collection of newname as inScope.
     */
    public void setNewname_InScope(Collection<String> newnameList) {
        regNewname(CK_INS, cTL(newnameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param newname The collection of newname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setNewname_InScope(String newname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(newname), getCValueNewname(), "NewName", "Newname", "newname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNewname_IsNull() { regNewname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNewname_IsNotNull() { regNewname(CK_ISNN, DUMMY_OBJECT); }

    protected void regNewname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNewname(), "NewName", "Newname", "newname");
    }
    protected void registerInlineNewname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNewname(), "NewName", "Newname", "newname");
    }
    abstract protected ConditionValue getCValueNewname();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param fixcode The value of fixcode as equal.
     */
    public void setFixcode_Equal(Boolean fixcode) {
        regFixcode(CK_EQ, fixcode);
    }

    protected void regFixcode(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFixcode(), "FixCode", "Fixcode", "fixcode");
    }
    protected void registerInlineFixcode(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFixcode(), "FixCode", "Fixcode", "fixcode");
    }
    abstract protected ConditionValue getCValueFixcode();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return UsysqueriesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return UsysqueriesCQ.class.getName(); }
}
