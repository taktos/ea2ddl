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
 * The abstract condition-query of t_secpermission.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTSecpermissionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSecpermissionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_secpermission";
    }
    
    public String getTableSqlName() {
        return "t_secpermission";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
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

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param permissionname The value of permissionname as equal.
     */
    public void setPermissionname_Equal(String permissionname) {
        regPermissionname(CK_EQ, fRES(permissionname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param permissionname The value of permissionname as notEqual.
     */
    public void setPermissionname_NotEqual(String permissionname) {
        regPermissionname(CK_NE, fRES(permissionname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param permissionname The value of permissionname as greaterThan.
     */
    public void setPermissionname_GreaterThan(String permissionname) {
        regPermissionname(CK_GT, fRES(permissionname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param permissionname The value of permissionname as lessThan.
     */
    public void setPermissionname_LessThan(String permissionname) {
        regPermissionname(CK_LT, fRES(permissionname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param permissionname The value of permissionname as greaterEqual.
     */
    public void setPermissionname_GreaterEqual(String permissionname) {
        regPermissionname(CK_GE, fRES(permissionname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param permissionname The value of permissionname as lessEqual.
     */
    public void setPermissionname_LessEqual(String permissionname) {
        regPermissionname(CK_LE, fRES(permissionname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param permissionname The value of permissionname as prefixSearch.
     */
    public void setPermissionname_PrefixSearch(String permissionname) {
        regPermissionname(CK_PS, fRES(permissionname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param permissionnameList The collection of permissionname as inScope.
     */
    public void setPermissionname_InScope(Collection<String> permissionnameList) {
        regPermissionname(CK_INS, cTL(permissionnameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param permissionname The value of permissionname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPermissionname_LikeSearch(String permissionname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(permissionname), getCValuePermissionname(), "PermissionName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param permissionname The value of permissionname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPermissionname_NotLikeSearch(String permissionname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(permissionname), getCValuePermissionname(), "PermissionName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPermissionname_IsNull() { regPermissionname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPermissionname_IsNotNull() { regPermissionname(CK_ISNN, DOBJ); }

    protected void regPermissionname(ConditionKey k, Object v) { regQ(k, v, getCValuePermissionname(), "PermissionName"); }
    abstract protected ConditionValue getCValuePermissionname();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TSecpermissionCB.class.getName(); }
    String xCQ() { return TSecpermissionCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
