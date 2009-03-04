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
 * The abstract condition-query of t_seclocks.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTSeclocksCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSeclocksCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_seclocks";
    }
    
    public String getTableSqlName() {
        return "t_seclocks";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(40)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(40)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(32)}
     * @param entitytype The value of entitytype as equal.
     */
    public void setEntitytype_Equal(String entitytype) {
        regEntitytype(CK_EQ, fRES(entitytype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param entitytype The value of entitytype as notEqual.
     */
    public void setEntitytype_NotEqual(String entitytype) {
        regEntitytype(CK_NE, fRES(entitytype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param entitytype The value of entitytype as greaterThan.
     */
    public void setEntitytype_GreaterThan(String entitytype) {
        regEntitytype(CK_GT, fRES(entitytype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param entitytype The value of entitytype as lessThan.
     */
    public void setEntitytype_LessThan(String entitytype) {
        regEntitytype(CK_LT, fRES(entitytype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param entitytype The value of entitytype as greaterEqual.
     */
    public void setEntitytype_GreaterEqual(String entitytype) {
        regEntitytype(CK_GE, fRES(entitytype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param entitytype The value of entitytype as lessEqual.
     */
    public void setEntitytype_LessEqual(String entitytype) {
        regEntitytype(CK_LE, fRES(entitytype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param entitytype The value of entitytype as prefixSearch.
     */
    public void setEntitytype_PrefixSearch(String entitytype) {
        regEntitytype(CK_PS, fRES(entitytype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param entitytypeList The collection of entitytype as inScope.
     */
    public void setEntitytype_InScope(Collection<String> entitytypeList) {
        regEntitytype(CK_INS, cTL(entitytypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param entitytype The value of entitytype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEntitytype_LikeSearch(String entitytype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(entitytype), getCValueEntitytype(), "EntityType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param entitytype The value of entitytype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEntitytype_NotLikeSearch(String entitytype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(entitytype), getCValueEntitytype(), "EntityType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEntitytype_IsNull() { regEntitytype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEntitytype_IsNotNull() { regEntitytype(CK_ISNN, DOBJ); }

    protected void regEntitytype(ConditionKey k, Object v) { regQ(k, v, getCValueEntitytype(), "EntityType"); }
    abstract protected ConditionValue getCValueEntitytype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(40)}
     * @param entityid The value of entityid as equal.
     */
    public void setEntityid_Equal(String entityid) {
        regEntityid(CK_EQ, fRES(entityid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param entityid The value of entityid as notEqual.
     */
    public void setEntityid_NotEqual(String entityid) {
        regEntityid(CK_NE, fRES(entityid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param entityid The value of entityid as greaterThan.
     */
    public void setEntityid_GreaterThan(String entityid) {
        regEntityid(CK_GT, fRES(entityid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param entityid The value of entityid as lessThan.
     */
    public void setEntityid_LessThan(String entityid) {
        regEntityid(CK_LT, fRES(entityid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param entityid The value of entityid as greaterEqual.
     */
    public void setEntityid_GreaterEqual(String entityid) {
        regEntityid(CK_GE, fRES(entityid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param entityid The value of entityid as lessEqual.
     */
    public void setEntityid_LessEqual(String entityid) {
        regEntityid(CK_LE, fRES(entityid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param entityid The value of entityid as prefixSearch.
     */
    public void setEntityid_PrefixSearch(String entityid) {
        regEntityid(CK_PS, fRES(entityid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param entityidList The collection of entityid as inScope.
     */
    public void setEntityid_InScope(Collection<String> entityidList) {
        regEntityid(CK_INS, cTL(entityidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param entityid The value of entityid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEntityid_LikeSearch(String entityid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(entityid), getCValueEntityid(), "EntityID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param entityid The value of entityid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEntityid_NotLikeSearch(String entityid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(entityid), getCValueEntityid(), "EntityID", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEntityid_IsNull() { regEntityid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEntityid_IsNotNull() { regEntityid(CK_ISNN, DOBJ); }

    protected void regEntityid(ConditionKey k, Object v) { regQ(k, v, getCValueEntityid(), "EntityID"); }
    abstract protected ConditionValue getCValueEntityid();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param timestamp The value of timestamp as equal.
     */
    public void setTimestamp_Equal(java.sql.Timestamp timestamp) {
        regTimestamp(CK_EQ, timestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param timestamp The value of timestamp as greaterThan.
     */
    public void setTimestamp_GreaterThan(java.sql.Timestamp timestamp) {
        regTimestamp(CK_GT, timestamp);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param timestamp The value of timestamp as lessThan.
     */
    public void setTimestamp_LessThan(java.sql.Timestamp timestamp) {
        regTimestamp(CK_LT, timestamp);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param timestamp The value of timestamp as greaterEqual.
     */
    public void setTimestamp_GreaterEqual(java.sql.Timestamp timestamp) {
        regTimestamp(CK_GE, timestamp);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param timestamp The value of timestamp as lessEqual.
     */
    public void setTimestamp_LessEqual(java.sql.Timestamp timestamp) {
        regTimestamp(CK_LE, timestamp);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of timestamp. (Nullable)
     * @param toDate The to-date of timestamp. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTimestamp_FromTo(java.util.Date fromDate, java.util.Date toDate, FromToOption fromToOption) {
        regFTQ((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueTimestamp(), "Timestamp", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of timestamp. (Nullable)
     * @param toDate The to-date of timestamp. (Nullable)
     */
    public void setTimestamp_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setTimestamp_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTimestamp_IsNull() { regTimestamp(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTimestamp_IsNotNull() { regTimestamp(CK_ISNN, DOBJ); }

    protected void regTimestamp(ConditionKey k, Object v) { regQ(k, v, getCValueTimestamp(), "Timestamp"); }
    abstract protected ConditionValue getCValueTimestamp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param locktype The value of locktype as equal.
     */
    public void setLocktype_Equal(String locktype) {
        regLocktype(CK_EQ, fRES(locktype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param locktype The value of locktype as notEqual.
     */
    public void setLocktype_NotEqual(String locktype) {
        regLocktype(CK_NE, fRES(locktype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param locktype The value of locktype as greaterThan.
     */
    public void setLocktype_GreaterThan(String locktype) {
        regLocktype(CK_GT, fRES(locktype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param locktype The value of locktype as lessThan.
     */
    public void setLocktype_LessThan(String locktype) {
        regLocktype(CK_LT, fRES(locktype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param locktype The value of locktype as greaterEqual.
     */
    public void setLocktype_GreaterEqual(String locktype) {
        regLocktype(CK_GE, fRES(locktype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param locktype The value of locktype as lessEqual.
     */
    public void setLocktype_LessEqual(String locktype) {
        regLocktype(CK_LE, fRES(locktype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param locktype The value of locktype as prefixSearch.
     */
    public void setLocktype_PrefixSearch(String locktype) {
        regLocktype(CK_PS, fRES(locktype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param locktypeList The collection of locktype as inScope.
     */
    public void setLocktype_InScope(Collection<String> locktypeList) {
        regLocktype(CK_INS, cTL(locktypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param locktype The value of locktype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocktype_LikeSearch(String locktype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locktype), getCValueLocktype(), "LockType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param locktype The value of locktype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocktype_NotLikeSearch(String locktype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locktype), getCValueLocktype(), "LockType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setLocktype_IsNull() { regLocktype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setLocktype_IsNotNull() { regLocktype(CK_ISNN, DOBJ); }

    protected void regLocktype(ConditionKey k, Object v) { regQ(k, v, getCValueLocktype(), "LockType"); }
    abstract protected ConditionValue getCValueLocktype();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TSeclocksCB.class.getName(); }
    String xCQ() { return TSeclocksCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
