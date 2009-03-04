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
 * The abstract condition-query of usysTables.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUsystablesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUsystablesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "usysTables";
    }
    
    public String getTableSqlName() {
        return "usysTables";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(50)}
     * @param tablename The value of tablename as equal.
     */
    public void setTablename_Equal(String tablename) {
        regTablename(CK_EQ, fRES(tablename));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tablename The value of tablename as notEqual.
     */
    public void setTablename_NotEqual(String tablename) {
        regTablename(CK_NE, fRES(tablename));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tablename The value of tablename as greaterThan.
     */
    public void setTablename_GreaterThan(String tablename) {
        regTablename(CK_GT, fRES(tablename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tablename The value of tablename as lessThan.
     */
    public void setTablename_LessThan(String tablename) {
        regTablename(CK_LT, fRES(tablename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tablename The value of tablename as greaterEqual.
     */
    public void setTablename_GreaterEqual(String tablename) {
        regTablename(CK_GE, fRES(tablename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tablename The value of tablename as lessEqual.
     */
    public void setTablename_LessEqual(String tablename) {
        regTablename(CK_LE, fRES(tablename));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tablename The value of tablename as prefixSearch.
     */
    public void setTablename_PrefixSearch(String tablename) {
        regTablename(CK_PS, fRES(tablename));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param tablenameList The collection of tablename as inScope.
     */
    public void setTablename_InScope(Collection<String> tablenameList) {
        regTablename(CK_INS, cTL(tablenameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param tablename The value of tablename as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTablename_LikeSearch(String tablename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tablename), getCValueTablename(), "TableName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param tablename The value of tablename as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTablename_NotLikeSearch(String tablename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tablename), getCValueTablename(), "TableName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTablename_IsNull() { regTablename(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTablename_IsNotNull() { regTablename(CK_ISNN, DOBJ); }

    protected void regTablename(ConditionKey k, Object v) { regQ(k, v, getCValueTablename(), "TableName"); }
    abstract protected ConditionValue getCValueTablename();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param relorder The value of relorder as equal.
     */
    public void setRelorder_Equal(java.lang.Integer relorder) {
        regRelorder(CK_EQ, relorder);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param relorder The value of relorder as notEqual.
     */
    public void setRelorder_NotEqual(java.lang.Integer relorder) {
        regRelorder(CK_NE, relorder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param relorder The value of relorder as greaterThan.
     */
    public void setRelorder_GreaterThan(java.lang.Integer relorder) {
        regRelorder(CK_GT, relorder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param relorder The value of relorder as lessThan.
     */
    public void setRelorder_LessThan(java.lang.Integer relorder) {
        regRelorder(CK_LT, relorder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param relorder The value of relorder as greaterEqual.
     */
    public void setRelorder_GreaterEqual(java.lang.Integer relorder) {
        regRelorder(CK_GE, relorder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param relorder The value of relorder as lessEqual.
     */
    public void setRelorder_LessEqual(java.lang.Integer relorder) {
        regRelorder(CK_LE, relorder);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param relorderList The collection of relorder as inScope.
     */
    public void setRelorder_InScope(Collection<java.lang.Integer> relorderList) {
        regRelorder(CK_INS, cTL(relorderList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRelorder_IsNull() { regRelorder(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRelorder_IsNotNull() { regRelorder(CK_ISNN, DOBJ); }

    protected void regRelorder(ConditionKey k, Object v) { regQ(k, v, getCValueRelorder(), "RelOrder"); }
    abstract protected ConditionValue getCValueRelorder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param displayname The value of displayname as equal.
     */
    public void setDisplayname_Equal(String displayname) {
        regDisplayname(CK_EQ, fRES(displayname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param displayname The value of displayname as notEqual.
     */
    public void setDisplayname_NotEqual(String displayname) {
        regDisplayname(CK_NE, fRES(displayname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param displayname The value of displayname as greaterThan.
     */
    public void setDisplayname_GreaterThan(String displayname) {
        regDisplayname(CK_GT, fRES(displayname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param displayname The value of displayname as lessThan.
     */
    public void setDisplayname_LessThan(String displayname) {
        regDisplayname(CK_LT, fRES(displayname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param displayname The value of displayname as greaterEqual.
     */
    public void setDisplayname_GreaterEqual(String displayname) {
        regDisplayname(CK_GE, fRES(displayname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param displayname The value of displayname as lessEqual.
     */
    public void setDisplayname_LessEqual(String displayname) {
        regDisplayname(CK_LE, fRES(displayname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param displayname The value of displayname as prefixSearch.
     */
    public void setDisplayname_PrefixSearch(String displayname) {
        regDisplayname(CK_PS, fRES(displayname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param displaynameList The collection of displayname as inScope.
     */
    public void setDisplayname_InScope(Collection<String> displaynameList) {
        regDisplayname(CK_INS, cTL(displaynameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param displayname The value of displayname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDisplayname_LikeSearch(String displayname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(displayname), getCValueDisplayname(), "DisplayName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param displayname The value of displayname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDisplayname_NotLikeSearch(String displayname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(displayname), getCValueDisplayname(), "DisplayName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDisplayname_IsNull() { regDisplayname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDisplayname_IsNotNull() { regDisplayname(CK_ISNN, DOBJ); }

    protected void regDisplayname(ConditionKey k, Object v) { regQ(k, v, getCValueDisplayname(), "DisplayName"); }
    abstract protected ConditionValue getCValueDisplayname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param fromver The value of fromver as equal.
     */
    public void setFromver_Equal(String fromver) {
        regFromver(CK_EQ, fRES(fromver));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fromver The value of fromver as notEqual.
     */
    public void setFromver_NotEqual(String fromver) {
        regFromver(CK_NE, fRES(fromver));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fromver The value of fromver as greaterThan.
     */
    public void setFromver_GreaterThan(String fromver) {
        regFromver(CK_GT, fRES(fromver));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fromver The value of fromver as lessThan.
     */
    public void setFromver_LessThan(String fromver) {
        regFromver(CK_LT, fRES(fromver));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fromver The value of fromver as greaterEqual.
     */
    public void setFromver_GreaterEqual(String fromver) {
        regFromver(CK_GE, fRES(fromver));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fromver The value of fromver as lessEqual.
     */
    public void setFromver_LessEqual(String fromver) {
        regFromver(CK_LE, fRES(fromver));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fromver The value of fromver as prefixSearch.
     */
    public void setFromver_PrefixSearch(String fromver) {
        regFromver(CK_PS, fRES(fromver));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param fromverList The collection of fromver as inScope.
     */
    public void setFromver_InScope(Collection<String> fromverList) {
        regFromver(CK_INS, cTL(fromverList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param fromver The value of fromver as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromver_LikeSearch(String fromver, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromver), getCValueFromver(), "FromVer", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param fromver The value of fromver as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromver_NotLikeSearch(String fromver, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromver), getCValueFromver(), "FromVer", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setFromver_IsNull() { regFromver(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setFromver_IsNotNull() { regFromver(CK_ISNN, DOBJ); }

    protected void regFromver(ConditionKey k, Object v) { regQ(k, v, getCValueFromver(), "FromVer"); }
    abstract protected ConditionValue getCValueFromver();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param tover The value of tover as equal.
     */
    public void setTover_Equal(String tover) {
        regTover(CK_EQ, fRES(tover));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tover The value of tover as notEqual.
     */
    public void setTover_NotEqual(String tover) {
        regTover(CK_NE, fRES(tover));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tover The value of tover as greaterThan.
     */
    public void setTover_GreaterThan(String tover) {
        regTover(CK_GT, fRES(tover));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tover The value of tover as lessThan.
     */
    public void setTover_LessThan(String tover) {
        regTover(CK_LT, fRES(tover));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tover The value of tover as greaterEqual.
     */
    public void setTover_GreaterEqual(String tover) {
        regTover(CK_GE, fRES(tover));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tover The value of tover as lessEqual.
     */
    public void setTover_LessEqual(String tover) {
        regTover(CK_LE, fRES(tover));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param tover The value of tover as prefixSearch.
     */
    public void setTover_PrefixSearch(String tover) {
        regTover(CK_PS, fRES(tover));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param toverList The collection of tover as inScope.
     */
    public void setTover_InScope(Collection<String> toverList) {
        regTover(CK_INS, cTL(toverList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param tover The value of tover as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTover_LikeSearch(String tover, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tover), getCValueTover(), "ToVer", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param tover The value of tover as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTover_NotLikeSearch(String tover, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tover), getCValueTover(), "ToVer", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTover_IsNull() { regTover(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTover_IsNotNull() { regTover(CK_ISNN, DOBJ); }

    protected void regTover(ConditionKey k, Object v) { regQ(k, v, getCValueTover(), "ToVer"); }
    abstract protected ConditionValue getCValueTover();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return UsystablesCB.class.getName(); }
    String xCQ() { return UsystablesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
