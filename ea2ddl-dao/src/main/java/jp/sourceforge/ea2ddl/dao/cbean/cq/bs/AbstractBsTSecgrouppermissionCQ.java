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
 * The abstract condition-query of t_secgrouppermission.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTSecgrouppermissionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSecgrouppermissionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_secgrouppermission";
    }
    
    public String getTableSqlName() {
        return "t_secgrouppermission";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

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
    String xCB() { return TSecgrouppermissionCB.class.getName(); }
    String xCQ() { return TSecgrouppermissionCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
