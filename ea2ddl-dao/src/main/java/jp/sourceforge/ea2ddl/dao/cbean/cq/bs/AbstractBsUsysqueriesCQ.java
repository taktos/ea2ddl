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
 * The abstract condition-query of usysQueries.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUsysqueriesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUsysqueriesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "usysQueries";
    }
    
    public String getTableSqlName() {
        return "usysQueries";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param queryname The value of queryname as equal.
     */
    public void setQueryname_Equal(String queryname) {
        regQueryname(CK_EQ, fRES(queryname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param queryname The value of queryname as notEqual.
     */
    public void setQueryname_NotEqual(String queryname) {
        regQueryname(CK_NE, fRES(queryname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param queryname The value of queryname as greaterThan.
     */
    public void setQueryname_GreaterThan(String queryname) {
        regQueryname(CK_GT, fRES(queryname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param queryname The value of queryname as lessThan.
     */
    public void setQueryname_LessThan(String queryname) {
        regQueryname(CK_LT, fRES(queryname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param queryname The value of queryname as greaterEqual.
     */
    public void setQueryname_GreaterEqual(String queryname) {
        regQueryname(CK_GE, fRES(queryname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param queryname The value of queryname as lessEqual.
     */
    public void setQueryname_LessEqual(String queryname) {
        regQueryname(CK_LE, fRES(queryname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param queryname The value of queryname as prefixSearch.
     */
    public void setQueryname_PrefixSearch(String queryname) {
        regQueryname(CK_PS, fRES(queryname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param querynameList The collection of queryname as inScope.
     */
    public void setQueryname_InScope(Collection<String> querynameList) {
        regQueryname(CK_INS, cTL(querynameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param queryname The value of queryname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQueryname_LikeSearch(String queryname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(queryname), getCValueQueryname(), "QueryName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param queryname The value of queryname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQueryname_NotLikeSearch(String queryname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(queryname), getCValueQueryname(), "QueryName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setQueryname_IsNull() { regQueryname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setQueryname_IsNotNull() { regQueryname(CK_ISNN, DOBJ); }

    protected void regQueryname(ConditionKey k, Object v) { regQ(k, v, getCValueQueryname(), "QueryName"); }
    abstract protected ConditionValue getCValueQueryname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param newname The value of newname as equal.
     */
    public void setNewname_Equal(String newname) {
        regNewname(CK_EQ, fRES(newname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param newname The value of newname as notEqual.
     */
    public void setNewname_NotEqual(String newname) {
        regNewname(CK_NE, fRES(newname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param newname The value of newname as greaterThan.
     */
    public void setNewname_GreaterThan(String newname) {
        regNewname(CK_GT, fRES(newname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param newname The value of newname as lessThan.
     */
    public void setNewname_LessThan(String newname) {
        regNewname(CK_LT, fRES(newname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param newname The value of newname as greaterEqual.
     */
    public void setNewname_GreaterEqual(String newname) {
        regNewname(CK_GE, fRES(newname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param newname The value of newname as lessEqual.
     */
    public void setNewname_LessEqual(String newname) {
        regNewname(CK_LE, fRES(newname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param newname The value of newname as prefixSearch.
     */
    public void setNewname_PrefixSearch(String newname) {
        regNewname(CK_PS, fRES(newname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param newnameList The collection of newname as inScope.
     */
    public void setNewname_InScope(Collection<String> newnameList) {
        regNewname(CK_INS, cTL(newnameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param newname The value of newname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNewname_LikeSearch(String newname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(newname), getCValueNewname(), "NewName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param newname The value of newname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNewname_NotLikeSearch(String newname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(newname), getCValueNewname(), "NewName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNewname_IsNull() { regNewname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNewname_IsNotNull() { regNewname(CK_ISNN, DOBJ); }

    protected void regNewname(ConditionKey k, Object v) { regQ(k, v, getCValueNewname(), "NewName"); }
    abstract protected ConditionValue getCValueNewname();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param fixcode The value of fixcode as equal.
     */
    public void setFixcode_Equal(Boolean fixcode) {
        regFixcode(CK_EQ, fixcode);
    }

    protected void regFixcode(ConditionKey k, Object v) { regQ(k, v, getCValueFixcode(), "FixCode"); }
    abstract protected ConditionValue getCValueFixcode();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return UsysqueriesCB.class.getName(); }
    String xCQ() { return UsysqueriesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
