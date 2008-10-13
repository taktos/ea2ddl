package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_authors.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTAuthorsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTAuthorsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(255)}
     * @param authorname The value of authorname as equal.
     */
    public void setAuthorname_Equal(String authorname) {
        regAuthorname(CK_EQ, fRES(authorname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param authorname The value of authorname as notEqual.
     */
    public void setAuthorname_NotEqual(String authorname) {
        regAuthorname(CK_NE, fRES(authorname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param authorname The value of authorname as greaterThan.
     */
    public void setAuthorname_GreaterThan(String authorname) {
        regAuthorname(CK_GT, fRES(authorname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param authorname The value of authorname as lessThan.
     */
    public void setAuthorname_LessThan(String authorname) {
        regAuthorname(CK_LT, fRES(authorname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param authorname The value of authorname as greaterEqual.
     */
    public void setAuthorname_GreaterEqual(String authorname) {
        regAuthorname(CK_GE, fRES(authorname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param authorname The value of authorname as lessEqual.
     */
    public void setAuthorname_LessEqual(String authorname) {
        regAuthorname(CK_LE, fRES(authorname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param authorname The value of authorname as prefixSearch.
     */
    public void setAuthorname_PrefixSearch(String authorname) {
        regAuthorname(CK_PS, fRES(authorname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param authorname The value of authorname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAuthorname_LikeSearch(String authorname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(authorname), getCValueAuthorname(), "AuthorName", "Authorname", "authorname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param authornameList The collection of authorname as inScope.
     */
    public void setAuthorname_InScope(Collection<String> authornameList) {
        regAuthorname(CK_INS, cTL(authornameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param authorname The collection of authorname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setAuthorname_InScope(String authorname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(authorname), getCValueAuthorname(), "AuthorName", "Authorname", "authorname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setAuthorname_IsNull() { regAuthorname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setAuthorname_IsNotNull() { regAuthorname(CK_ISNN, DUMMY_OBJECT); }

    protected void regAuthorname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAuthorname(), "AuthorName", "Authorname", "authorname");
    }
    protected void registerInlineAuthorname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAuthorname(), "AuthorName", "Authorname", "authorname");
    }
    abstract protected ConditionValue getCValueAuthorname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param roles The value of roles as equal.
     */
    public void setRoles_Equal(String roles) {
        regRoles(CK_EQ, fRES(roles));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param roles The value of roles as notEqual.
     */
    public void setRoles_NotEqual(String roles) {
        regRoles(CK_NE, fRES(roles));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param roles The value of roles as greaterThan.
     */
    public void setRoles_GreaterThan(String roles) {
        regRoles(CK_GT, fRES(roles));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param roles The value of roles as lessThan.
     */
    public void setRoles_LessThan(String roles) {
        regRoles(CK_LT, fRES(roles));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param roles The value of roles as greaterEqual.
     */
    public void setRoles_GreaterEqual(String roles) {
        regRoles(CK_GE, fRES(roles));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param roles The value of roles as lessEqual.
     */
    public void setRoles_LessEqual(String roles) {
        regRoles(CK_LE, fRES(roles));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param roles The value of roles as prefixSearch.
     */
    public void setRoles_PrefixSearch(String roles) {
        regRoles(CK_PS, fRES(roles));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param roles The value of roles as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRoles_LikeSearch(String roles, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(roles), getCValueRoles(), "Roles", "Roles", "roles", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param rolesList The collection of roles as inScope.
     */
    public void setRoles_InScope(Collection<String> rolesList) {
        regRoles(CK_INS, cTL(rolesList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param roles The collection of roles as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setRoles_InScope(String roles, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(roles), getCValueRoles(), "Roles", "Roles", "roles", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRoles_IsNull() { regRoles(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRoles_IsNotNull() { regRoles(CK_ISNN, DUMMY_OBJECT); }

    protected void regRoles(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRoles(), "Roles", "Roles", "roles");
    }
    protected void registerInlineRoles(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRoles(), "Roles", "Roles", "roles");
    }
    abstract protected ConditionValue getCValueRoles();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(String notes) {
        regNotes(CK_EQ, fRES(notes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(String notes) {
        regNotes(CK_NE, fRES(notes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(String notes) {
        regNotes(CK_PS, fRES(notes));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(notes), getCValueNotes(), "Notes", "Notes", "notes", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(Collection<String> notesList) {
        regNotes(CK_INS, cTL(notesList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notes The collection of notes as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setNotes_InScope(String notes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(notes), getCValueNotes(), "Notes", "Notes", "notes", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DUMMY_OBJECT); }

    protected void regNotes(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNotes(), "Notes", "Notes", "notes");
    }
    protected void registerInlineNotes(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNotes(), "Notes", "Notes", "notes");
    }
    abstract protected ConditionValue getCValueNotes();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TAuthorsCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TAuthorsCQ.class.getName(); }
}
