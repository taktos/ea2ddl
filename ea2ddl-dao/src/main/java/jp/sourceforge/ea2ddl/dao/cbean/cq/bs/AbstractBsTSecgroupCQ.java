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
 * The abstract condition-query of t_secgroup.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTSecgroupCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSecgroupCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_secgroup";
    }
    
    public String getTableSqlName() {
        return "t_secgroup";
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(32)}
     * @param groupname The value of groupname as equal.
     */
    public void setGroupname_Equal(String groupname) {
        regGroupname(CK_EQ, fRES(groupname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param groupname The value of groupname as notEqual.
     */
    public void setGroupname_NotEqual(String groupname) {
        regGroupname(CK_NE, fRES(groupname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param groupname The value of groupname as greaterThan.
     */
    public void setGroupname_GreaterThan(String groupname) {
        regGroupname(CK_GT, fRES(groupname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param groupname The value of groupname as lessThan.
     */
    public void setGroupname_LessThan(String groupname) {
        regGroupname(CK_LT, fRES(groupname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param groupname The value of groupname as greaterEqual.
     */
    public void setGroupname_GreaterEqual(String groupname) {
        regGroupname(CK_GE, fRES(groupname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param groupname The value of groupname as lessEqual.
     */
    public void setGroupname_LessEqual(String groupname) {
        regGroupname(CK_LE, fRES(groupname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param groupname The value of groupname as prefixSearch.
     */
    public void setGroupname_PrefixSearch(String groupname) {
        regGroupname(CK_PS, fRES(groupname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param groupnameList The collection of groupname as inScope.
     */
    public void setGroupname_InScope(Collection<String> groupnameList) {
        regGroupname(CK_INS, cTL(groupnameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param groupname The value of groupname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGroupname_LikeSearch(String groupname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(groupname), getCValueGroupname(), "GroupName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param groupname The value of groupname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGroupname_NotLikeSearch(String groupname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(groupname), getCValueGroupname(), "GroupName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setGroupname_IsNull() { regGroupname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setGroupname_IsNotNull() { regGroupname(CK_ISNN, DOBJ); }

    protected void regGroupname(ConditionKey k, Object v) { regQ(k, v, getCValueGroupname(), "GroupName"); }
    abstract protected ConditionValue getCValueGroupname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(100)}
     * @param description The value of description as equal.
     */
    public void setDescription_Equal(String description) {
        regDescription(CK_EQ, fRES(description));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as notEqual.
     */
    public void setDescription_NotEqual(String description) {
        regDescription(CK_NE, fRES(description));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as greaterThan.
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as lessThan.
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as greaterEqual.
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as lessEqual.
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as prefixSearch.
     */
    public void setDescription_PrefixSearch(String description) {
        regDescription(CK_PS, fRES(description));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param descriptionList The collection of description as inScope.
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        regDescription(CK_INS, cTL(descriptionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), getCValueDescription(), "Description", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), getCValueDescription(), "Description", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDescription_IsNull() { regDescription(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDescription_IsNotNull() { regDescription(CK_ISNN, DOBJ); }

    protected void regDescription(ConditionKey k, Object v) { regQ(k, v, getCValueDescription(), "Description"); }
    abstract protected ConditionValue getCValueDescription();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TSecgroupCB.class.getName(); }
    String xCQ() { return TSecgroupCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
