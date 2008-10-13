package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_secgroup.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTSecgroupCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSecgroupCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_secgroup";
    }
    
    public String getTableSqlName() {
        return "t_secgroup";
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(32)}
     * @param groupname The value of groupname as equal.
     */
    public void setGroupname_Equal(String groupname) {
        regGroupname(CK_EQ, fRES(groupname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param groupname The value of groupname as notEqual.
     */
    public void setGroupname_NotEqual(String groupname) {
        regGroupname(CK_NE, fRES(groupname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param groupname The value of groupname as greaterThan.
     */
    public void setGroupname_GreaterThan(String groupname) {
        regGroupname(CK_GT, fRES(groupname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param groupname The value of groupname as lessThan.
     */
    public void setGroupname_LessThan(String groupname) {
        regGroupname(CK_LT, fRES(groupname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param groupname The value of groupname as greaterEqual.
     */
    public void setGroupname_GreaterEqual(String groupname) {
        regGroupname(CK_GE, fRES(groupname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param groupname The value of groupname as lessEqual.
     */
    public void setGroupname_LessEqual(String groupname) {
        regGroupname(CK_LE, fRES(groupname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param groupname The value of groupname as prefixSearch.
     */
    public void setGroupname_PrefixSearch(String groupname) {
        regGroupname(CK_PS, fRES(groupname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param groupname The value of groupname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGroupname_LikeSearch(String groupname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(groupname), getCValueGroupname(), "GroupName", "Groupname", "groupname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param groupnameList The collection of groupname as inScope.
     */
    public void setGroupname_InScope(Collection<String> groupnameList) {
        regGroupname(CK_INS, cTL(groupnameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param groupname The collection of groupname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setGroupname_InScope(String groupname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(groupname), getCValueGroupname(), "GroupName", "Groupname", "groupname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setGroupname_IsNull() { regGroupname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setGroupname_IsNotNull() { regGroupname(CK_ISNN, DUMMY_OBJECT); }

    protected void regGroupname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueGroupname(), "GroupName", "Groupname", "groupname");
    }
    protected void registerInlineGroupname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueGroupname(), "GroupName", "Groupname", "groupname");
    }
    abstract protected ConditionValue getCValueGroupname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param description The value of description as equal.
     */
    public void setDescription_Equal(String description) {
        regDescription(CK_EQ, fRES(description));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as notEqual.
     */
    public void setDescription_NotEqual(String description) {
        regDescription(CK_NE, fRES(description));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as greaterThan.
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as lessThan.
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as greaterEqual.
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as lessEqual.
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as prefixSearch.
     */
    public void setDescription_PrefixSearch(String description) {
        regDescription(CK_PS, fRES(description));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(description), getCValueDescription(), "Description", "Description", "description", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param descriptionList The collection of description as inScope.
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        regDescription(CK_INS, cTL(descriptionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param description The collection of description as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDescription_InScope(String description, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(description), getCValueDescription(), "Description", "Description", "description", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDescription_IsNull() { regDescription(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDescription_IsNotNull() { regDescription(CK_ISNN, DUMMY_OBJECT); }

    protected void regDescription(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDescription(), "Description", "Description", "description");
    }
    protected void registerInlineDescription(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDescription(), "Description", "Description", "description");
    }
    abstract protected ConditionValue getCValueDescription();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TSecgroupCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TSecgroupCQ.class.getName(); }
}
