package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_secuser.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTSecuserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSecuserCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_secuser";
    }
    
    public String getTableSqlName() {
        return "t_secuser";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(40)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(32)}
     * @param userlogin The value of userlogin as equal.
     */
    public void setUserlogin_Equal(String userlogin) {
        regUserlogin(CK_EQ, fRES(userlogin));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param userlogin The value of userlogin as notEqual.
     */
    public void setUserlogin_NotEqual(String userlogin) {
        regUserlogin(CK_NE, fRES(userlogin));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param userlogin The value of userlogin as greaterThan.
     */
    public void setUserlogin_GreaterThan(String userlogin) {
        regUserlogin(CK_GT, fRES(userlogin));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param userlogin The value of userlogin as lessThan.
     */
    public void setUserlogin_LessThan(String userlogin) {
        regUserlogin(CK_LT, fRES(userlogin));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param userlogin The value of userlogin as greaterEqual.
     */
    public void setUserlogin_GreaterEqual(String userlogin) {
        regUserlogin(CK_GE, fRES(userlogin));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param userlogin The value of userlogin as lessEqual.
     */
    public void setUserlogin_LessEqual(String userlogin) {
        regUserlogin(CK_LE, fRES(userlogin));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param userlogin The value of userlogin as prefixSearch.
     */
    public void setUserlogin_PrefixSearch(String userlogin) {
        regUserlogin(CK_PS, fRES(userlogin));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param userlogin The value of userlogin as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserlogin_LikeSearch(String userlogin, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(userlogin), getCValueUserlogin(), "UserLogin", "Userlogin", "userlogin", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param userloginList The collection of userlogin as inScope.
     */
    public void setUserlogin_InScope(Collection<String> userloginList) {
        regUserlogin(CK_INS, cTL(userloginList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param userlogin The collection of userlogin as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setUserlogin_InScope(String userlogin, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(userlogin), getCValueUserlogin(), "UserLogin", "Userlogin", "userlogin", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setUserlogin_IsNull() { regUserlogin(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setUserlogin_IsNotNull() { regUserlogin(CK_ISNN, DUMMY_OBJECT); }

    protected void regUserlogin(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueUserlogin(), "UserLogin", "Userlogin", "userlogin");
    }
    protected void registerInlineUserlogin(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueUserlogin(), "UserLogin", "Userlogin", "userlogin");
    }
    abstract protected ConditionValue getCValueUserlogin();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param firstname The value of firstname as equal.
     */
    public void setFirstname_Equal(String firstname) {
        regFirstname(CK_EQ, fRES(firstname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param firstname The value of firstname as notEqual.
     */
    public void setFirstname_NotEqual(String firstname) {
        regFirstname(CK_NE, fRES(firstname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param firstname The value of firstname as greaterThan.
     */
    public void setFirstname_GreaterThan(String firstname) {
        regFirstname(CK_GT, fRES(firstname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param firstname The value of firstname as lessThan.
     */
    public void setFirstname_LessThan(String firstname) {
        regFirstname(CK_LT, fRES(firstname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param firstname The value of firstname as greaterEqual.
     */
    public void setFirstname_GreaterEqual(String firstname) {
        regFirstname(CK_GE, fRES(firstname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param firstname The value of firstname as lessEqual.
     */
    public void setFirstname_LessEqual(String firstname) {
        regFirstname(CK_LE, fRES(firstname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param firstname The value of firstname as prefixSearch.
     */
    public void setFirstname_PrefixSearch(String firstname) {
        regFirstname(CK_PS, fRES(firstname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param firstname The value of firstname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirstname_LikeSearch(String firstname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(firstname), getCValueFirstname(), "FirstName", "Firstname", "firstname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param firstnameList The collection of firstname as inScope.
     */
    public void setFirstname_InScope(Collection<String> firstnameList) {
        regFirstname(CK_INS, cTL(firstnameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param firstname The collection of firstname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setFirstname_InScope(String firstname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(firstname), getCValueFirstname(), "FirstName", "Firstname", "firstname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setFirstname_IsNull() { regFirstname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setFirstname_IsNotNull() { regFirstname(CK_ISNN, DUMMY_OBJECT); }

    protected void regFirstname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFirstname(), "FirstName", "Firstname", "firstname");
    }
    protected void registerInlineFirstname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFirstname(), "FirstName", "Firstname", "firstname");
    }
    abstract protected ConditionValue getCValueFirstname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param surname The value of surname as equal.
     */
    public void setSurname_Equal(String surname) {
        regSurname(CK_EQ, fRES(surname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param surname The value of surname as notEqual.
     */
    public void setSurname_NotEqual(String surname) {
        regSurname(CK_NE, fRES(surname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param surname The value of surname as greaterThan.
     */
    public void setSurname_GreaterThan(String surname) {
        regSurname(CK_GT, fRES(surname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param surname The value of surname as lessThan.
     */
    public void setSurname_LessThan(String surname) {
        regSurname(CK_LT, fRES(surname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param surname The value of surname as greaterEqual.
     */
    public void setSurname_GreaterEqual(String surname) {
        regSurname(CK_GE, fRES(surname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param surname The value of surname as lessEqual.
     */
    public void setSurname_LessEqual(String surname) {
        regSurname(CK_LE, fRES(surname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param surname The value of surname as prefixSearch.
     */
    public void setSurname_PrefixSearch(String surname) {
        regSurname(CK_PS, fRES(surname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param surname The value of surname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSurname_LikeSearch(String surname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(surname), getCValueSurname(), "Surname", "Surname", "surname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param surnameList The collection of surname as inScope.
     */
    public void setSurname_InScope(Collection<String> surnameList) {
        regSurname(CK_INS, cTL(surnameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param surname The collection of surname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setSurname_InScope(String surname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(surname), getCValueSurname(), "Surname", "Surname", "surname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setSurname_IsNull() { regSurname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setSurname_IsNotNull() { regSurname(CK_ISNN, DUMMY_OBJECT); }

    protected void regSurname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueSurname(), "Surname", "Surname", "surname");
    }
    protected void registerInlineSurname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueSurname(), "Surname", "Surname", "surname");
    }
    abstract protected ConditionValue getCValueSurname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param department The value of department as equal.
     */
    public void setDepartment_Equal(String department) {
        regDepartment(CK_EQ, fRES(department));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param department The value of department as notEqual.
     */
    public void setDepartment_NotEqual(String department) {
        regDepartment(CK_NE, fRES(department));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param department The value of department as greaterThan.
     */
    public void setDepartment_GreaterThan(String department) {
        regDepartment(CK_GT, fRES(department));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param department The value of department as lessThan.
     */
    public void setDepartment_LessThan(String department) {
        regDepartment(CK_LT, fRES(department));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param department The value of department as greaterEqual.
     */
    public void setDepartment_GreaterEqual(String department) {
        regDepartment(CK_GE, fRES(department));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param department The value of department as lessEqual.
     */
    public void setDepartment_LessEqual(String department) {
        regDepartment(CK_LE, fRES(department));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param department The value of department as prefixSearch.
     */
    public void setDepartment_PrefixSearch(String department) {
        regDepartment(CK_PS, fRES(department));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param department The value of department as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDepartment_LikeSearch(String department, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(department), getCValueDepartment(), "Department", "Department", "department", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param departmentList The collection of department as inScope.
     */
    public void setDepartment_InScope(Collection<String> departmentList) {
        regDepartment(CK_INS, cTL(departmentList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param department The collection of department as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDepartment_InScope(String department, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(department), getCValueDepartment(), "Department", "Department", "department", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDepartment_IsNull() { regDepartment(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDepartment_IsNotNull() { regDepartment(CK_ISNN, DUMMY_OBJECT); }

    protected void regDepartment(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDepartment(), "Department", "Department", "department");
    }
    protected void registerInlineDepartment(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDepartment(), "Department", "Department", "department");
    }
    abstract protected ConditionValue getCValueDepartment();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(12)}
     * @param password The value of password as equal.
     */
    public void setPassword_Equal(String password) {
        regPassword(CK_EQ, fRES(password));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param password The value of password as notEqual.
     */
    public void setPassword_NotEqual(String password) {
        regPassword(CK_NE, fRES(password));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param password The value of password as greaterThan.
     */
    public void setPassword_GreaterThan(String password) {
        regPassword(CK_GT, fRES(password));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param password The value of password as lessThan.
     */
    public void setPassword_LessThan(String password) {
        regPassword(CK_LT, fRES(password));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param password The value of password as greaterEqual.
     */
    public void setPassword_GreaterEqual(String password) {
        regPassword(CK_GE, fRES(password));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param password The value of password as lessEqual.
     */
    public void setPassword_LessEqual(String password) {
        regPassword(CK_LE, fRES(password));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param password The value of password as prefixSearch.
     */
    public void setPassword_PrefixSearch(String password) {
        regPassword(CK_PS, fRES(password));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param password The value of password as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(password), getCValuePassword(), "Password", "Password", "password", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param passwordList The collection of password as inScope.
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        regPassword(CK_INS, cTL(passwordList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param password The collection of password as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPassword_InScope(String password, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(password), getCValuePassword(), "Password", "Password", "password", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPassword_IsNull() { regPassword(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPassword_IsNotNull() { regPassword(CK_ISNN, DUMMY_OBJECT); }

    protected void regPassword(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePassword(), "Password", "Password", "password");
    }
    protected void registerInlinePassword(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePassword(), "Password", "Password", "password");
    }
    abstract protected ConditionValue getCValuePassword();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TSecuserCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TSecuserCQ.class.getName(); }
}
