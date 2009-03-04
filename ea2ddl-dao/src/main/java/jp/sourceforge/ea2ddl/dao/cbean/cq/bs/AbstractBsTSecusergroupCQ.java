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
 * The abstract condition-query of t_secusergroup.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTSecusergroupCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSecusergroupCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_secusergroup";
    }
    
    public String getTableSqlName() {
        return "t_secusergroup";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(40)}
     * @param userid The value of userid as equal.
     */
    public void setUserid_Equal(String userid) {
        regUserid(CK_EQ, fRES(userid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param userid The value of userid as notEqual.
     */
    public void setUserid_NotEqual(String userid) {
        regUserid(CK_NE, fRES(userid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param userid The value of userid as greaterThan.
     */
    public void setUserid_GreaterThan(String userid) {
        regUserid(CK_GT, fRES(userid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param userid The value of userid as lessThan.
     */
    public void setUserid_LessThan(String userid) {
        regUserid(CK_LT, fRES(userid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param userid The value of userid as greaterEqual.
     */
    public void setUserid_GreaterEqual(String userid) {
        regUserid(CK_GE, fRES(userid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param userid The value of userid as lessEqual.
     */
    public void setUserid_LessEqual(String userid) {
        regUserid(CK_LE, fRES(userid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param userid The value of userid as prefixSearch.
     */
    public void setUserid_PrefixSearch(String userid) {
        regUserid(CK_PS, fRES(userid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param useridList The collection of userid as inScope.
     */
    public void setUserid_InScope(Collection<String> useridList) {
        regUserid(CK_INS, cTL(useridList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param userid The value of userid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserid_LikeSearch(String userid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userid), getCValueUserid(), "UserID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param userid The value of userid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserid_NotLikeSearch(String userid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userid), getCValueUserid(), "UserID", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setUserid_IsNull() { regUserid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setUserid_IsNotNull() { regUserid(CK_ISNN, DOBJ); }

    protected void regUserid(ConditionKey k, Object v) { regQ(k, v, getCValueUserid(), "UserID"); }
    abstract protected ConditionValue getCValueUserid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(40)}
     * @param groupid The value of groupid as equal.
     */
    public void setGroupid_Equal(String groupid) {
        regGroupid(CK_EQ, fRES(groupid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param groupid The value of groupid as notEqual.
     */
    public void setGroupid_NotEqual(String groupid) {
        regGroupid(CK_NE, fRES(groupid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param groupid The value of groupid as greaterThan.
     */
    public void setGroupid_GreaterThan(String groupid) {
        regGroupid(CK_GT, fRES(groupid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param groupid The value of groupid as lessThan.
     */
    public void setGroupid_LessThan(String groupid) {
        regGroupid(CK_LT, fRES(groupid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param groupid The value of groupid as greaterEqual.
     */
    public void setGroupid_GreaterEqual(String groupid) {
        regGroupid(CK_GE, fRES(groupid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param groupid The value of groupid as lessEqual.
     */
    public void setGroupid_LessEqual(String groupid) {
        regGroupid(CK_LE, fRES(groupid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param groupid The value of groupid as prefixSearch.
     */
    public void setGroupid_PrefixSearch(String groupid) {
        regGroupid(CK_PS, fRES(groupid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param groupidList The collection of groupid as inScope.
     */
    public void setGroupid_InScope(Collection<String> groupidList) {
        regGroupid(CK_INS, cTL(groupidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param groupid The value of groupid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGroupid_LikeSearch(String groupid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(groupid), getCValueGroupid(), "GroupID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param groupid The value of groupid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGroupid_NotLikeSearch(String groupid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(groupid), getCValueGroupid(), "GroupID", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setGroupid_IsNull() { regGroupid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setGroupid_IsNotNull() { regGroupid(CK_ISNN, DOBJ); }

    protected void regGroupid(ConditionKey k, Object v) { regQ(k, v, getCValueGroupid(), "GroupID"); }
    abstract protected ConditionValue getCValueGroupid();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TSecusergroupCB.class.getName(); }
    String xCQ() { return TSecusergroupCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
