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
 * The abstract condition-query of t_authors.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTAuthorsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTAuthorsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_authors";
    }
    
    public String getTableSqlName() {
        return "t_authors";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(255)}
     * @param authorname The value of authorname as equal.
     */
    public void setAuthorname_Equal(String authorname) {
        regAuthorname(CK_EQ, fRES(authorname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param authorname The value of authorname as notEqual.
     */
    public void setAuthorname_NotEqual(String authorname) {
        regAuthorname(CK_NE, fRES(authorname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param authorname The value of authorname as greaterThan.
     */
    public void setAuthorname_GreaterThan(String authorname) {
        regAuthorname(CK_GT, fRES(authorname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param authorname The value of authorname as lessThan.
     */
    public void setAuthorname_LessThan(String authorname) {
        regAuthorname(CK_LT, fRES(authorname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param authorname The value of authorname as greaterEqual.
     */
    public void setAuthorname_GreaterEqual(String authorname) {
        regAuthorname(CK_GE, fRES(authorname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param authorname The value of authorname as lessEqual.
     */
    public void setAuthorname_LessEqual(String authorname) {
        regAuthorname(CK_LE, fRES(authorname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param authorname The value of authorname as prefixSearch.
     */
    public void setAuthorname_PrefixSearch(String authorname) {
        regAuthorname(CK_PS, fRES(authorname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param authornameList The collection of authorname as inScope.
     */
    public void setAuthorname_InScope(Collection<String> authornameList) {
        regAuthorname(CK_INS, cTL(authornameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param authorname The value of authorname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAuthorname_LikeSearch(String authorname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(authorname), getCValueAuthorname(), "AuthorName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param authorname The value of authorname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAuthorname_NotLikeSearch(String authorname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(authorname), getCValueAuthorname(), "AuthorName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setAuthorname_IsNull() { regAuthorname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setAuthorname_IsNotNull() { regAuthorname(CK_ISNN, DOBJ); }

    protected void regAuthorname(ConditionKey k, Object v) { regQ(k, v, getCValueAuthorname(), "AuthorName"); }
    abstract protected ConditionValue getCValueAuthorname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param roles The value of roles as equal.
     */
    public void setRoles_Equal(String roles) {
        regRoles(CK_EQ, fRES(roles));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param roles The value of roles as notEqual.
     */
    public void setRoles_NotEqual(String roles) {
        regRoles(CK_NE, fRES(roles));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param roles The value of roles as greaterThan.
     */
    public void setRoles_GreaterThan(String roles) {
        regRoles(CK_GT, fRES(roles));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param roles The value of roles as lessThan.
     */
    public void setRoles_LessThan(String roles) {
        regRoles(CK_LT, fRES(roles));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param roles The value of roles as greaterEqual.
     */
    public void setRoles_GreaterEqual(String roles) {
        regRoles(CK_GE, fRES(roles));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param roles The value of roles as lessEqual.
     */
    public void setRoles_LessEqual(String roles) {
        regRoles(CK_LE, fRES(roles));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param roles The value of roles as prefixSearch.
     */
    public void setRoles_PrefixSearch(String roles) {
        regRoles(CK_PS, fRES(roles));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param rolesList The collection of roles as inScope.
     */
    public void setRoles_InScope(Collection<String> rolesList) {
        regRoles(CK_INS, cTL(rolesList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param roles The value of roles as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRoles_LikeSearch(String roles, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(roles), getCValueRoles(), "Roles", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param roles The value of roles as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRoles_NotLikeSearch(String roles, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(roles), getCValueRoles(), "Roles", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRoles_IsNull() { regRoles(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRoles_IsNotNull() { regRoles(CK_ISNN, DOBJ); }

    protected void regRoles(ConditionKey k, Object v) { regQ(k, v, getCValueRoles(), "Roles"); }
    abstract protected ConditionValue getCValueRoles();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(String notes) {
        regNotes(CK_EQ, fRES(notes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(String notes) {
        regNotes(CK_NE, fRES(notes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(String notes) {
        regNotes(CK_PS, fRES(notes));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(Collection<String> notesList) {
        regNotes(CK_INS, cTL(notesList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey k, Object v) { regQ(k, v, getCValueNotes(), "Notes"); }
    abstract protected ConditionValue getCValueNotes();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TAuthorsCB.class.getName(); }
    String xCQ() { return TAuthorsCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
