package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_secgrouppermission.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTSecgrouppermissionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSecgrouppermissionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(40)}
     * @param groupid The value of groupid as equal.
     */
    public void setGroupid_Equal(String groupid) {
        regGroupid(CK_EQ, fRES(groupid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param groupid The value of groupid as notEqual.
     */
    public void setGroupid_NotEqual(String groupid) {
        regGroupid(CK_NE, fRES(groupid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param groupid The value of groupid as greaterThan.
     */
    public void setGroupid_GreaterThan(String groupid) {
        regGroupid(CK_GT, fRES(groupid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param groupid The value of groupid as lessThan.
     */
    public void setGroupid_LessThan(String groupid) {
        regGroupid(CK_LT, fRES(groupid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param groupid The value of groupid as greaterEqual.
     */
    public void setGroupid_GreaterEqual(String groupid) {
        regGroupid(CK_GE, fRES(groupid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param groupid The value of groupid as lessEqual.
     */
    public void setGroupid_LessEqual(String groupid) {
        regGroupid(CK_LE, fRES(groupid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param groupid The value of groupid as prefixSearch.
     */
    public void setGroupid_PrefixSearch(String groupid) {
        regGroupid(CK_PS, fRES(groupid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param groupid The value of groupid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGroupid_LikeSearch(String groupid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(groupid), getCValueGroupid(), "GroupID", "Groupid", "groupid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param groupidList The collection of groupid as inScope.
     */
    public void setGroupid_InScope(Collection<String> groupidList) {
        regGroupid(CK_INS, cTL(groupidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param groupid The collection of groupid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setGroupid_InScope(String groupid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(groupid), getCValueGroupid(), "GroupID", "Groupid", "groupid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setGroupid_IsNull() { regGroupid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setGroupid_IsNotNull() { regGroupid(CK_ISNN, DUMMY_OBJECT); }

    protected void regGroupid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueGroupid(), "GroupID", "Groupid", "groupid");
    }
    protected void registerInlineGroupid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueGroupid(), "GroupID", "Groupid", "groupid");
    }
    abstract protected ConditionValue getCValueGroupid();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : INTEGER}
     * @param permissionid The value of permissionid as equal.
     */
    public void setPermissionid_Equal(java.lang.Integer permissionid) {
        regPermissionid(CK_EQ, permissionid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param permissionid The value of permissionid as notEqual.
     */
    public void setPermissionid_NotEqual(java.lang.Integer permissionid) {
        regPermissionid(CK_NE, permissionid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param permissionid The value of permissionid as greaterThan.
     */
    public void setPermissionid_GreaterThan(java.lang.Integer permissionid) {
        regPermissionid(CK_GT, permissionid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param permissionid The value of permissionid as lessThan.
     */
    public void setPermissionid_LessThan(java.lang.Integer permissionid) {
        regPermissionid(CK_LT, permissionid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param permissionid The value of permissionid as greaterEqual.
     */
    public void setPermissionid_GreaterEqual(java.lang.Integer permissionid) {
        regPermissionid(CK_GE, permissionid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setPermissionid_IsNull() { regPermissionid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPermissionid_IsNotNull() { regPermissionid(CK_ISNN, DUMMY_OBJECT); }

    protected void regPermissionid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePermissionid(), "PermissionID", "Permissionid", "permissionid");
    }
    protected void registerInlinePermissionid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePermissionid(), "PermissionID", "Permissionid", "permissionid");
    }
    abstract protected ConditionValue getCValuePermissionid();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TSecgrouppermissionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TSecgrouppermissionCQ.class.getName(); }
}
