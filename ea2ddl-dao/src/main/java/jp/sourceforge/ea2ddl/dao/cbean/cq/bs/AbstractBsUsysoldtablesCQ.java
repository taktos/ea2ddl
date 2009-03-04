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
 * The abstract condition-query of usysOldTables.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUsysoldtablesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUsysoldtablesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "usysOldTables";
    }
    
    public String getTableSqlName() {
        return "usysOldTables";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param newname The value of newname as equal.
     */
    public void setNewname_Equal(String newname) {
        regNewname(CK_EQ, fRES(newname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param newname The value of newname as notEqual.
     */
    public void setNewname_NotEqual(String newname) {
        regNewname(CK_NE, fRES(newname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param newname The value of newname as greaterThan.
     */
    public void setNewname_GreaterThan(String newname) {
        regNewname(CK_GT, fRES(newname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param newname The value of newname as lessThan.
     */
    public void setNewname_LessThan(String newname) {
        regNewname(CK_LT, fRES(newname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param newname The value of newname as greaterEqual.
     */
    public void setNewname_GreaterEqual(String newname) {
        regNewname(CK_GE, fRES(newname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param newname The value of newname as lessEqual.
     */
    public void setNewname_LessEqual(String newname) {
        regNewname(CK_LE, fRES(newname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param newname The value of newname as prefixSearch.
     */
    public void setNewname_PrefixSearch(String newname) {
        regNewname(CK_PS, fRES(newname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param newnameList The collection of newname as inScope.
     */
    public void setNewname_InScope(Collection<String> newnameList) {
        regNewname(CK_INS, cTL(newnameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param newname The value of newname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNewname_LikeSearch(String newname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(newname), getCValueNewname(), "NewName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param newname The value of newname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNewname_NotLikeSearch(String newname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(newname), getCValueNewname(), "NewName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNewname_IsNull() { regNewname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNewname_IsNotNull() { regNewname(CK_ISNN, DOBJ); }

    protected void regNewname(ConditionKey k, Object v) { regQ(k, v, getCValueNewname(), "NewName"); }
    abstract protected ConditionValue getCValueNewname();
    
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param fixcode The value of fixcode as equal.
     */
    public void setFixcode_Equal(Boolean fixcode) {
        regFixcode(CK_EQ, fixcode);
    }

    protected void regFixcode(ConditionKey k, Object v) { regQ(k, v, getCValueFixcode(), "FixCode"); }
    abstract protected ConditionValue getCValueFixcode();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return UsysoldtablesCB.class.getName(); }
    String xCQ() { return UsysoldtablesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
