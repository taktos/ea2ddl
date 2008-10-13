package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_seclocks.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTSeclocksCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSeclocksCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(40)}
     * @param userid The value of userid as equal.
     */
    public void setUserid_Equal(String userid) {
        regUserid(CK_EQ, fRES(userid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param userid The value of userid as notEqual.
     */
    public void setUserid_NotEqual(String userid) {
        regUserid(CK_NE, fRES(userid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param userid The value of userid as greaterThan.
     */
    public void setUserid_GreaterThan(String userid) {
        regUserid(CK_GT, fRES(userid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param userid The value of userid as lessThan.
     */
    public void setUserid_LessThan(String userid) {
        regUserid(CK_LT, fRES(userid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param userid The value of userid as greaterEqual.
     */
    public void setUserid_GreaterEqual(String userid) {
        regUserid(CK_GE, fRES(userid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param userid The value of userid as lessEqual.
     */
    public void setUserid_LessEqual(String userid) {
        regUserid(CK_LE, fRES(userid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param userid The value of userid as prefixSearch.
     */
    public void setUserid_PrefixSearch(String userid) {
        regUserid(CK_PS, fRES(userid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param userid The value of userid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserid_LikeSearch(String userid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(userid), getCValueUserid(), "UserID", "Userid", "userid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param useridList The collection of userid as inScope.
     */
    public void setUserid_InScope(Collection<String> useridList) {
        regUserid(CK_INS, cTL(useridList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param userid The collection of userid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setUserid_InScope(String userid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(userid), getCValueUserid(), "UserID", "Userid", "userid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setUserid_IsNull() { regUserid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setUserid_IsNotNull() { regUserid(CK_ISNN, DUMMY_OBJECT); }

    protected void regUserid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueUserid(), "UserID", "Userid", "userid");
    }
    protected void registerInlineUserid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueUserid(), "UserID", "Userid", "userid");
    }
    abstract protected ConditionValue getCValueUserid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(40)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(32)}
     * @param entitytype The value of entitytype as equal.
     */
    public void setEntitytype_Equal(String entitytype) {
        regEntitytype(CK_EQ, fRES(entitytype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param entitytype The value of entitytype as notEqual.
     */
    public void setEntitytype_NotEqual(String entitytype) {
        regEntitytype(CK_NE, fRES(entitytype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param entitytype The value of entitytype as greaterThan.
     */
    public void setEntitytype_GreaterThan(String entitytype) {
        regEntitytype(CK_GT, fRES(entitytype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param entitytype The value of entitytype as lessThan.
     */
    public void setEntitytype_LessThan(String entitytype) {
        regEntitytype(CK_LT, fRES(entitytype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param entitytype The value of entitytype as greaterEqual.
     */
    public void setEntitytype_GreaterEqual(String entitytype) {
        regEntitytype(CK_GE, fRES(entitytype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param entitytype The value of entitytype as lessEqual.
     */
    public void setEntitytype_LessEqual(String entitytype) {
        regEntitytype(CK_LE, fRES(entitytype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param entitytype The value of entitytype as prefixSearch.
     */
    public void setEntitytype_PrefixSearch(String entitytype) {
        regEntitytype(CK_PS, fRES(entitytype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param entitytype The value of entitytype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEntitytype_LikeSearch(String entitytype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(entitytype), getCValueEntitytype(), "EntityType", "Entitytype", "entitytype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param entitytypeList The collection of entitytype as inScope.
     */
    public void setEntitytype_InScope(Collection<String> entitytypeList) {
        regEntitytype(CK_INS, cTL(entitytypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param entitytype The collection of entitytype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setEntitytype_InScope(String entitytype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(entitytype), getCValueEntitytype(), "EntityType", "Entitytype", "entitytype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setEntitytype_IsNull() { regEntitytype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setEntitytype_IsNotNull() { regEntitytype(CK_ISNN, DUMMY_OBJECT); }

    protected void regEntitytype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueEntitytype(), "EntityType", "Entitytype", "entitytype");
    }
    protected void registerInlineEntitytype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueEntitytype(), "EntityType", "Entitytype", "entitytype");
    }
    abstract protected ConditionValue getCValueEntitytype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(40)}
     * @param entityid The value of entityid as equal.
     */
    public void setEntityid_Equal(String entityid) {
        regEntityid(CK_EQ, fRES(entityid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param entityid The value of entityid as notEqual.
     */
    public void setEntityid_NotEqual(String entityid) {
        regEntityid(CK_NE, fRES(entityid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param entityid The value of entityid as greaterThan.
     */
    public void setEntityid_GreaterThan(String entityid) {
        regEntityid(CK_GT, fRES(entityid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param entityid The value of entityid as lessThan.
     */
    public void setEntityid_LessThan(String entityid) {
        regEntityid(CK_LT, fRES(entityid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param entityid The value of entityid as greaterEqual.
     */
    public void setEntityid_GreaterEqual(String entityid) {
        regEntityid(CK_GE, fRES(entityid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param entityid The value of entityid as lessEqual.
     */
    public void setEntityid_LessEqual(String entityid) {
        regEntityid(CK_LE, fRES(entityid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param entityid The value of entityid as prefixSearch.
     */
    public void setEntityid_PrefixSearch(String entityid) {
        regEntityid(CK_PS, fRES(entityid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param entityid The value of entityid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEntityid_LikeSearch(String entityid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(entityid), getCValueEntityid(), "EntityID", "Entityid", "entityid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param entityidList The collection of entityid as inScope.
     */
    public void setEntityid_InScope(Collection<String> entityidList) {
        regEntityid(CK_INS, cTL(entityidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param entityid The collection of entityid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setEntityid_InScope(String entityid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(entityid), getCValueEntityid(), "EntityID", "Entityid", "entityid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setEntityid_IsNull() { regEntityid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setEntityid_IsNotNull() { regEntityid(CK_ISNN, DUMMY_OBJECT); }

    protected void regEntityid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueEntityid(), "EntityID", "Entityid", "entityid");
    }
    protected void registerInlineEntityid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueEntityid(), "EntityID", "Entityid", "entityid");
    }
    abstract protected ConditionValue getCValueEntityid();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param timestamp The value of timestamp as equal.
     */
    public void setTimestamp_Equal(java.sql.Timestamp timestamp) {
        regTimestamp(CK_EQ, timestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param timestamp The value of timestamp as greaterThan.
     */
    public void setTimestamp_GreaterThan(java.sql.Timestamp timestamp) {
        regTimestamp(CK_GT, timestamp);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param timestamp The value of timestamp as lessThan.
     */
    public void setTimestamp_LessThan(java.sql.Timestamp timestamp) {
        regTimestamp(CK_LT, timestamp);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param timestamp The value of timestamp as greaterEqual.
     */
    public void setTimestamp_GreaterEqual(java.sql.Timestamp timestamp) {
        regTimestamp(CK_GE, timestamp);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param timestamp The value of timestamp as lessEqual.
     */
    public void setTimestamp_LessEqual(java.sql.Timestamp timestamp) {
        regTimestamp(CK_LE, timestamp);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of timestamp. (Nullable)
     * @param toDate The to-date of timestamp. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTimestamp_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueTimestamp(), "Timestamp", "Timestamp", "timestamp", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of timestamp. (Nullable)
     * @param toDate The to-date of timestamp. (Nullable)
     */
    public void setTimestamp_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setTimestamp_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTimestamp_IsNull() { regTimestamp(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTimestamp_IsNotNull() { regTimestamp(CK_ISNN, DUMMY_OBJECT); }

    protected void regTimestamp(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTimestamp(), "Timestamp", "Timestamp", "timestamp");
    }
    protected void registerInlineTimestamp(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTimestamp(), "Timestamp", "Timestamp", "timestamp");
    }
    abstract protected ConditionValue getCValueTimestamp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param locktype The value of locktype as equal.
     */
    public void setLocktype_Equal(String locktype) {
        regLocktype(CK_EQ, fRES(locktype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param locktype The value of locktype as notEqual.
     */
    public void setLocktype_NotEqual(String locktype) {
        regLocktype(CK_NE, fRES(locktype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param locktype The value of locktype as greaterThan.
     */
    public void setLocktype_GreaterThan(String locktype) {
        regLocktype(CK_GT, fRES(locktype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param locktype The value of locktype as lessThan.
     */
    public void setLocktype_LessThan(String locktype) {
        regLocktype(CK_LT, fRES(locktype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param locktype The value of locktype as greaterEqual.
     */
    public void setLocktype_GreaterEqual(String locktype) {
        regLocktype(CK_GE, fRES(locktype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param locktype The value of locktype as lessEqual.
     */
    public void setLocktype_LessEqual(String locktype) {
        regLocktype(CK_LE, fRES(locktype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param locktype The value of locktype as prefixSearch.
     */
    public void setLocktype_PrefixSearch(String locktype) {
        regLocktype(CK_PS, fRES(locktype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param locktype The value of locktype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocktype_LikeSearch(String locktype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(locktype), getCValueLocktype(), "LockType", "Locktype", "locktype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param locktypeList The collection of locktype as inScope.
     */
    public void setLocktype_InScope(Collection<String> locktypeList) {
        regLocktype(CK_INS, cTL(locktypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param locktype The collection of locktype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setLocktype_InScope(String locktype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(locktype), getCValueLocktype(), "LockType", "Locktype", "locktype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setLocktype_IsNull() { regLocktype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setLocktype_IsNotNull() { regLocktype(CK_ISNN, DUMMY_OBJECT); }

    protected void regLocktype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueLocktype(), "LockType", "Locktype", "locktype");
    }
    protected void registerInlineLocktype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLocktype(), "LockType", "Locktype", "locktype");
    }
    abstract protected ConditionValue getCValueLocktype();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TSeclocksCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TSeclocksCQ.class.getName(); }
}
