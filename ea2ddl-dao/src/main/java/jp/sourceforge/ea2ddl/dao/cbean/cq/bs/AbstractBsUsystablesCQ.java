package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of usysTables.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsUsystablesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUsystablesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(50)}
     * @param tablename The value of tablename as equal.
     */
    public void setTablename_Equal(String tablename) {
        regTablename(CK_EQ, fRES(tablename));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tablename The value of tablename as notEqual.
     */
    public void setTablename_NotEqual(String tablename) {
        regTablename(CK_NE, fRES(tablename));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param tablename The value of tablename as greaterThan.
     */
    public void setTablename_GreaterThan(String tablename) {
        regTablename(CK_GT, fRES(tablename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param tablename The value of tablename as lessThan.
     */
    public void setTablename_LessThan(String tablename) {
        regTablename(CK_LT, fRES(tablename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tablename The value of tablename as greaterEqual.
     */
    public void setTablename_GreaterEqual(String tablename) {
        regTablename(CK_GE, fRES(tablename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tablename The value of tablename as lessEqual.
     */
    public void setTablename_LessEqual(String tablename) {
        regTablename(CK_LE, fRES(tablename));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param tablename The value of tablename as prefixSearch.
     */
    public void setTablename_PrefixSearch(String tablename) {
        regTablename(CK_PS, fRES(tablename));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param tablename The value of tablename as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTablename_LikeSearch(String tablename, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(tablename), getCValueTablename(), "TableName", "Tablename", "tablename", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param tablenameList The collection of tablename as inScope.
     */
    public void setTablename_InScope(Collection<String> tablenameList) {
        regTablename(CK_INS, cTL(tablenameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param tablename The collection of tablename as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTablename_InScope(String tablename, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(tablename), getCValueTablename(), "TableName", "Tablename", "tablename", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTablename_IsNull() { regTablename(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTablename_IsNotNull() { regTablename(CK_ISNN, DUMMY_OBJECT); }

    protected void regTablename(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTablename(), "TableName", "Tablename", "tablename");
    }
    protected void registerInlineTablename(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTablename(), "TableName", "Tablename", "tablename");
    }
    abstract protected ConditionValue getCValueTablename();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param relorder The value of relorder as equal.
     */
    public void setRelorder_Equal(java.lang.Integer relorder) {
        regRelorder(CK_EQ, relorder);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param relorder The value of relorder as notEqual.
     */
    public void setRelorder_NotEqual(java.lang.Integer relorder) {
        regRelorder(CK_NE, relorder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param relorder The value of relorder as greaterThan.
     */
    public void setRelorder_GreaterThan(java.lang.Integer relorder) {
        regRelorder(CK_GT, relorder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param relorder The value of relorder as lessThan.
     */
    public void setRelorder_LessThan(java.lang.Integer relorder) {
        regRelorder(CK_LT, relorder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param relorder The value of relorder as greaterEqual.
     */
    public void setRelorder_GreaterEqual(java.lang.Integer relorder) {
        regRelorder(CK_GE, relorder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setRelorder_IsNull() { regRelorder(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRelorder_IsNotNull() { regRelorder(CK_ISNN, DUMMY_OBJECT); }

    protected void regRelorder(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRelorder(), "RelOrder", "Relorder", "relorder");
    }
    protected void registerInlineRelorder(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRelorder(), "RelOrder", "Relorder", "relorder");
    }
    abstract protected ConditionValue getCValueRelorder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param displayname The value of displayname as equal.
     */
    public void setDisplayname_Equal(String displayname) {
        regDisplayname(CK_EQ, fRES(displayname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param displayname The value of displayname as notEqual.
     */
    public void setDisplayname_NotEqual(String displayname) {
        regDisplayname(CK_NE, fRES(displayname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param displayname The value of displayname as greaterThan.
     */
    public void setDisplayname_GreaterThan(String displayname) {
        regDisplayname(CK_GT, fRES(displayname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param displayname The value of displayname as lessThan.
     */
    public void setDisplayname_LessThan(String displayname) {
        regDisplayname(CK_LT, fRES(displayname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param displayname The value of displayname as greaterEqual.
     */
    public void setDisplayname_GreaterEqual(String displayname) {
        regDisplayname(CK_GE, fRES(displayname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param displayname The value of displayname as lessEqual.
     */
    public void setDisplayname_LessEqual(String displayname) {
        regDisplayname(CK_LE, fRES(displayname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param displayname The value of displayname as prefixSearch.
     */
    public void setDisplayname_PrefixSearch(String displayname) {
        regDisplayname(CK_PS, fRES(displayname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param displayname The value of displayname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDisplayname_LikeSearch(String displayname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(displayname), getCValueDisplayname(), "DisplayName", "Displayname", "displayname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param displaynameList The collection of displayname as inScope.
     */
    public void setDisplayname_InScope(Collection<String> displaynameList) {
        regDisplayname(CK_INS, cTL(displaynameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param displayname The collection of displayname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDisplayname_InScope(String displayname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(displayname), getCValueDisplayname(), "DisplayName", "Displayname", "displayname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDisplayname_IsNull() { regDisplayname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDisplayname_IsNotNull() { regDisplayname(CK_ISNN, DUMMY_OBJECT); }

    protected void regDisplayname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDisplayname(), "DisplayName", "Displayname", "displayname");
    }
    protected void registerInlineDisplayname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDisplayname(), "DisplayName", "Displayname", "displayname");
    }
    abstract protected ConditionValue getCValueDisplayname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param fromver The value of fromver as equal.
     */
    public void setFromver_Equal(String fromver) {
        regFromver(CK_EQ, fRES(fromver));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param fromver The value of fromver as notEqual.
     */
    public void setFromver_NotEqual(String fromver) {
        regFromver(CK_NE, fRES(fromver));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param fromver The value of fromver as greaterThan.
     */
    public void setFromver_GreaterThan(String fromver) {
        regFromver(CK_GT, fRES(fromver));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param fromver The value of fromver as lessThan.
     */
    public void setFromver_LessThan(String fromver) {
        regFromver(CK_LT, fRES(fromver));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param fromver The value of fromver as greaterEqual.
     */
    public void setFromver_GreaterEqual(String fromver) {
        regFromver(CK_GE, fRES(fromver));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param fromver The value of fromver as lessEqual.
     */
    public void setFromver_LessEqual(String fromver) {
        regFromver(CK_LE, fRES(fromver));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param fromver The value of fromver as prefixSearch.
     */
    public void setFromver_PrefixSearch(String fromver) {
        regFromver(CK_PS, fRES(fromver));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param fromver The value of fromver as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromver_LikeSearch(String fromver, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(fromver), getCValueFromver(), "FromVer", "Fromver", "fromver", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param fromverList The collection of fromver as inScope.
     */
    public void setFromver_InScope(Collection<String> fromverList) {
        regFromver(CK_INS, cTL(fromverList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param fromver The collection of fromver as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setFromver_InScope(String fromver, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(fromver), getCValueFromver(), "FromVer", "Fromver", "fromver", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setFromver_IsNull() { regFromver(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setFromver_IsNotNull() { regFromver(CK_ISNN, DUMMY_OBJECT); }

    protected void regFromver(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFromver(), "FromVer", "Fromver", "fromver");
    }
    protected void registerInlineFromver(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFromver(), "FromVer", "Fromver", "fromver");
    }
    abstract protected ConditionValue getCValueFromver();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param tover The value of tover as equal.
     */
    public void setTover_Equal(String tover) {
        regTover(CK_EQ, fRES(tover));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tover The value of tover as notEqual.
     */
    public void setTover_NotEqual(String tover) {
        regTover(CK_NE, fRES(tover));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param tover The value of tover as greaterThan.
     */
    public void setTover_GreaterThan(String tover) {
        regTover(CK_GT, fRES(tover));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param tover The value of tover as lessThan.
     */
    public void setTover_LessThan(String tover) {
        regTover(CK_LT, fRES(tover));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tover The value of tover as greaterEqual.
     */
    public void setTover_GreaterEqual(String tover) {
        regTover(CK_GE, fRES(tover));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tover The value of tover as lessEqual.
     */
    public void setTover_LessEqual(String tover) {
        regTover(CK_LE, fRES(tover));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param tover The value of tover as prefixSearch.
     */
    public void setTover_PrefixSearch(String tover) {
        regTover(CK_PS, fRES(tover));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param tover The value of tover as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTover_LikeSearch(String tover, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(tover), getCValueTover(), "ToVer", "Tover", "tover", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param toverList The collection of tover as inScope.
     */
    public void setTover_InScope(Collection<String> toverList) {
        regTover(CK_INS, cTL(toverList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param tover The collection of tover as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTover_InScope(String tover, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(tover), getCValueTover(), "ToVer", "Tover", "tover", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTover_IsNull() { regTover(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTover_IsNotNull() { regTover(CK_ISNN, DUMMY_OBJECT); }

    protected void regTover(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTover(), "ToVer", "Tover", "tover");
    }
    protected void registerInlineTover(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTover(), "ToVer", "Tover", "tover");
    }
    abstract protected ConditionValue getCValueTover();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return UsystablesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return UsystablesCQ.class.getName(); }
}
