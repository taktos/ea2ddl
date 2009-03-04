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
 * The abstract condition-query of t_secuserpermission.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTSecuserpermissionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSecuserpermissionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_secuserpermission";
    }
    
    public String getTableSqlName() {
        return "t_secuserpermission";
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : INTEGER}
     * @param permissionid The value of permissionid as equal.
     */
    public void setPermissionid_Equal(java.lang.Integer permissionid) {
        regPermissionid(CK_EQ, permissionid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param permissionid The value of permissionid as notEqual.
     */
    public void setPermissionid_NotEqual(java.lang.Integer permissionid) {
        regPermissionid(CK_NE, permissionid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param permissionid The value of permissionid as greaterThan.
     */
    public void setPermissionid_GreaterThan(java.lang.Integer permissionid) {
        regPermissionid(CK_GT, permissionid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param permissionid The value of permissionid as lessThan.
     */
    public void setPermissionid_LessThan(java.lang.Integer permissionid) {
        regPermissionid(CK_LT, permissionid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param permissionid The value of permissionid as greaterEqual.
     */
    public void setPermissionid_GreaterEqual(java.lang.Integer permissionid) {
        regPermissionid(CK_GE, permissionid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param permissionid The value of permissionid as lessEqual.
     */
    public void setPermissionid_LessEqual(java.lang.Integer permissionid) {
        regPermissionid(CK_LE, permissionid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param permissionidList The collection of permissionid as inScope.
     */
    public void setPermissionid_InScope(Collection<java.lang.Integer> permissionidList) {
        regPermissionid(CK_INS, cTL(permissionidList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPermissionid_IsNull() { regPermissionid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPermissionid_IsNotNull() { regPermissionid(CK_ISNN, DOBJ); }

    protected void regPermissionid(ConditionKey k, Object v) { regQ(k, v, getCValuePermissionid(), "PermissionID"); }
    abstract protected ConditionValue getCValuePermissionid();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TSecuserpermissionCB.class.getName(); }
    String xCQ() { return TSecuserpermissionCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
