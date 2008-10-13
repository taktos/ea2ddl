package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_secpermission.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTSecpermissionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSecpermissionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_secpermission";
    }
    
    public String getTableSqlName() {
        return "t_secpermission";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
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

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param permissionname The value of permissionname as equal.
     */
    public void setPermissionname_Equal(String permissionname) {
        regPermissionname(CK_EQ, fRES(permissionname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param permissionname The value of permissionname as notEqual.
     */
    public void setPermissionname_NotEqual(String permissionname) {
        regPermissionname(CK_NE, fRES(permissionname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param permissionname The value of permissionname as greaterThan.
     */
    public void setPermissionname_GreaterThan(String permissionname) {
        regPermissionname(CK_GT, fRES(permissionname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param permissionname The value of permissionname as lessThan.
     */
    public void setPermissionname_LessThan(String permissionname) {
        regPermissionname(CK_LT, fRES(permissionname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param permissionname The value of permissionname as greaterEqual.
     */
    public void setPermissionname_GreaterEqual(String permissionname) {
        regPermissionname(CK_GE, fRES(permissionname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param permissionname The value of permissionname as lessEqual.
     */
    public void setPermissionname_LessEqual(String permissionname) {
        regPermissionname(CK_LE, fRES(permissionname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param permissionname The value of permissionname as prefixSearch.
     */
    public void setPermissionname_PrefixSearch(String permissionname) {
        regPermissionname(CK_PS, fRES(permissionname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param permissionname The value of permissionname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPermissionname_LikeSearch(String permissionname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(permissionname), getCValuePermissionname(), "PermissionName", "Permissionname", "permissionname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param permissionnameList The collection of permissionname as inScope.
     */
    public void setPermissionname_InScope(Collection<String> permissionnameList) {
        regPermissionname(CK_INS, cTL(permissionnameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param permissionname The collection of permissionname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPermissionname_InScope(String permissionname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(permissionname), getCValuePermissionname(), "PermissionName", "Permissionname", "permissionname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPermissionname_IsNull() { regPermissionname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPermissionname_IsNotNull() { regPermissionname(CK_ISNN, DUMMY_OBJECT); }

    protected void regPermissionname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePermissionname(), "PermissionName", "Permissionname", "permissionname");
    }
    protected void registerInlinePermissionname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePermissionname(), "PermissionName", "Permissionname", "permissionname");
    }
    abstract protected ConditionValue getCValuePermissionname();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TSecpermissionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TSecpermissionCQ.class.getName(); }
}
