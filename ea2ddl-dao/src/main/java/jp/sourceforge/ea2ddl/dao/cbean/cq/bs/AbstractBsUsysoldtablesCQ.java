package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of usysOldTables.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsUsysoldtablesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUsysoldtablesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "usysOldTables";
    }
    
    public String getTableSqlName() {
        return "usysOldTables";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param newname The value of newname as equal.
     */
    public void setNewname_Equal(String newname) {
        regNewname(CK_EQ, fRES(newname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param newname The value of newname as notEqual.
     */
    public void setNewname_NotEqual(String newname) {
        regNewname(CK_NE, fRES(newname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param newname The value of newname as greaterThan.
     */
    public void setNewname_GreaterThan(String newname) {
        regNewname(CK_GT, fRES(newname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param newname The value of newname as lessThan.
     */
    public void setNewname_LessThan(String newname) {
        regNewname(CK_LT, fRES(newname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param newname The value of newname as greaterEqual.
     */
    public void setNewname_GreaterEqual(String newname) {
        regNewname(CK_GE, fRES(newname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param newname The value of newname as lessEqual.
     */
    public void setNewname_LessEqual(String newname) {
        regNewname(CK_LE, fRES(newname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param newname The value of newname as prefixSearch.
     */
    public void setNewname_PrefixSearch(String newname) {
        regNewname(CK_PS, fRES(newname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param newname The value of newname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNewname_LikeSearch(String newname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(newname), getCValueNewname(), "NewName", "Newname", "newname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param newnameList The collection of newname as inScope.
     */
    public void setNewname_InScope(Collection<String> newnameList) {
        regNewname(CK_INS, cTL(newnameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param newname The collection of newname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setNewname_InScope(String newname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(newname), getCValueNewname(), "NewName", "Newname", "newname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNewname_IsNull() { regNewname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNewname_IsNotNull() { regNewname(CK_ISNN, DUMMY_OBJECT); }

    protected void regNewname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNewname(), "NewName", "Newname", "newname");
    }
    protected void registerInlineNewname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNewname(), "NewName", "Newname", "newname");
    }
    abstract protected ConditionValue getCValueNewname();
    
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
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param fixcode The value of fixcode as equal.
     */
    public void setFixcode_Equal(Boolean fixcode) {
        regFixcode(CK_EQ, fixcode);
    }

    protected void regFixcode(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFixcode(), "FixCode", "Fixcode", "fixcode");
    }
    protected void registerInlineFixcode(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFixcode(), "FixCode", "Fixcode", "fixcode");
    }
    abstract protected ConditionValue getCValueFixcode();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return UsysoldtablesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return UsysoldtablesCQ.class.getName(); }
}
