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
 * The abstract condition-query of t_clients.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTClientsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTClientsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_clients";
    }
    
    public String getTableSqlName() {
        return "t_clients";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(255)}
     * @param name The value of name as equal.
     */
    public void setName_Equal(String name) {
        regName(CK_EQ, fRES(name));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as notEqual.
     */
    public void setName_NotEqual(String name) {
        regName(CK_NE, fRES(name));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(String name) {
        regName(CK_PS, fRES(name));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param nameList The collection of name as inScope.
     */
    public void setName_InScope(Collection<String> nameList) {
        regName(CK_INS, cTL(nameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), getCValueName(), "Name", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), getCValueName(), "Name", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setName_IsNull() { regName(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DOBJ); }

    protected void regName(ConditionKey k, Object v) { regQ(k, v, getCValueName(), "Name"); }
    abstract protected ConditionValue getCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param organisation The value of organisation as equal.
     */
    public void setOrganisation_Equal(String organisation) {
        regOrganisation(CK_EQ, fRES(organisation));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param organisation The value of organisation as notEqual.
     */
    public void setOrganisation_NotEqual(String organisation) {
        regOrganisation(CK_NE, fRES(organisation));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param organisation The value of organisation as greaterThan.
     */
    public void setOrganisation_GreaterThan(String organisation) {
        regOrganisation(CK_GT, fRES(organisation));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param organisation The value of organisation as lessThan.
     */
    public void setOrganisation_LessThan(String organisation) {
        regOrganisation(CK_LT, fRES(organisation));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param organisation The value of organisation as greaterEqual.
     */
    public void setOrganisation_GreaterEqual(String organisation) {
        regOrganisation(CK_GE, fRES(organisation));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param organisation The value of organisation as lessEqual.
     */
    public void setOrganisation_LessEqual(String organisation) {
        regOrganisation(CK_LE, fRES(organisation));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param organisation The value of organisation as prefixSearch.
     */
    public void setOrganisation_PrefixSearch(String organisation) {
        regOrganisation(CK_PS, fRES(organisation));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param organisationList The collection of organisation as inScope.
     */
    public void setOrganisation_InScope(Collection<String> organisationList) {
        regOrganisation(CK_INS, cTL(organisationList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param organisation The value of organisation as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrganisation_LikeSearch(String organisation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(organisation), getCValueOrganisation(), "Organisation", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param organisation The value of organisation as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrganisation_NotLikeSearch(String organisation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(organisation), getCValueOrganisation(), "Organisation", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setOrganisation_IsNull() { regOrganisation(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setOrganisation_IsNotNull() { regOrganisation(CK_ISNN, DOBJ); }

    protected void regOrganisation(ConditionKey k, Object v) { regQ(k, v, getCValueOrganisation(), "Organisation"); }
    abstract protected ConditionValue getCValueOrganisation();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param phone1 The value of phone1 as equal.
     */
    public void setPhone1_Equal(String phone1) {
        regPhone1(CK_EQ, fRES(phone1));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phone1 The value of phone1 as notEqual.
     */
    public void setPhone1_NotEqual(String phone1) {
        regPhone1(CK_NE, fRES(phone1));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phone1 The value of phone1 as greaterThan.
     */
    public void setPhone1_GreaterThan(String phone1) {
        regPhone1(CK_GT, fRES(phone1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phone1 The value of phone1 as lessThan.
     */
    public void setPhone1_LessThan(String phone1) {
        regPhone1(CK_LT, fRES(phone1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phone1 The value of phone1 as greaterEqual.
     */
    public void setPhone1_GreaterEqual(String phone1) {
        regPhone1(CK_GE, fRES(phone1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phone1 The value of phone1 as lessEqual.
     */
    public void setPhone1_LessEqual(String phone1) {
        regPhone1(CK_LE, fRES(phone1));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phone1 The value of phone1 as prefixSearch.
     */
    public void setPhone1_PrefixSearch(String phone1) {
        regPhone1(CK_PS, fRES(phone1));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phone1List The collection of phone1 as inScope.
     */
    public void setPhone1_InScope(Collection<String> phone1List) {
        regPhone1(CK_INS, cTL(phone1List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phone1 The value of phone1 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhone1_LikeSearch(String phone1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone1), getCValuePhone1(), "Phone1", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phone1 The value of phone1 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhone1_NotLikeSearch(String phone1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone1), getCValuePhone1(), "Phone1", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPhone1_IsNull() { regPhone1(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPhone1_IsNotNull() { regPhone1(CK_ISNN, DOBJ); }

    protected void regPhone1(ConditionKey k, Object v) { regQ(k, v, getCValuePhone1(), "Phone1"); }
    abstract protected ConditionValue getCValuePhone1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param phone2 The value of phone2 as equal.
     */
    public void setPhone2_Equal(String phone2) {
        regPhone2(CK_EQ, fRES(phone2));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phone2 The value of phone2 as notEqual.
     */
    public void setPhone2_NotEqual(String phone2) {
        regPhone2(CK_NE, fRES(phone2));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phone2 The value of phone2 as greaterThan.
     */
    public void setPhone2_GreaterThan(String phone2) {
        regPhone2(CK_GT, fRES(phone2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phone2 The value of phone2 as lessThan.
     */
    public void setPhone2_LessThan(String phone2) {
        regPhone2(CK_LT, fRES(phone2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phone2 The value of phone2 as greaterEqual.
     */
    public void setPhone2_GreaterEqual(String phone2) {
        regPhone2(CK_GE, fRES(phone2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phone2 The value of phone2 as lessEqual.
     */
    public void setPhone2_LessEqual(String phone2) {
        regPhone2(CK_LE, fRES(phone2));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phone2 The value of phone2 as prefixSearch.
     */
    public void setPhone2_PrefixSearch(String phone2) {
        regPhone2(CK_PS, fRES(phone2));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phone2List The collection of phone2 as inScope.
     */
    public void setPhone2_InScope(Collection<String> phone2List) {
        regPhone2(CK_INS, cTL(phone2List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phone2 The value of phone2 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhone2_LikeSearch(String phone2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone2), getCValuePhone2(), "Phone2", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phone2 The value of phone2 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhone2_NotLikeSearch(String phone2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone2), getCValuePhone2(), "Phone2", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPhone2_IsNull() { regPhone2(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPhone2_IsNotNull() { regPhone2(CK_ISNN, DOBJ); }

    protected void regPhone2(ConditionKey k, Object v) { regQ(k, v, getCValuePhone2(), "Phone2"); }
    abstract protected ConditionValue getCValuePhone2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param mobile The value of mobile as equal.
     */
    public void setMobile_Equal(String mobile) {
        regMobile(CK_EQ, fRES(mobile));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param mobile The value of mobile as notEqual.
     */
    public void setMobile_NotEqual(String mobile) {
        regMobile(CK_NE, fRES(mobile));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param mobile The value of mobile as greaterThan.
     */
    public void setMobile_GreaterThan(String mobile) {
        regMobile(CK_GT, fRES(mobile));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param mobile The value of mobile as lessThan.
     */
    public void setMobile_LessThan(String mobile) {
        regMobile(CK_LT, fRES(mobile));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param mobile The value of mobile as greaterEqual.
     */
    public void setMobile_GreaterEqual(String mobile) {
        regMobile(CK_GE, fRES(mobile));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param mobile The value of mobile as lessEqual.
     */
    public void setMobile_LessEqual(String mobile) {
        regMobile(CK_LE, fRES(mobile));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param mobile The value of mobile as prefixSearch.
     */
    public void setMobile_PrefixSearch(String mobile) {
        regMobile(CK_PS, fRES(mobile));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param mobileList The collection of mobile as inScope.
     */
    public void setMobile_InScope(Collection<String> mobileList) {
        regMobile(CK_INS, cTL(mobileList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param mobile The value of mobile as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMobile_LikeSearch(String mobile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mobile), getCValueMobile(), "Mobile", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param mobile The value of mobile as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMobile_NotLikeSearch(String mobile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mobile), getCValueMobile(), "Mobile", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setMobile_IsNull() { regMobile(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setMobile_IsNotNull() { regMobile(CK_ISNN, DOBJ); }

    protected void regMobile(ConditionKey k, Object v) { regQ(k, v, getCValueMobile(), "Mobile"); }
    abstract protected ConditionValue getCValueMobile();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param fax The value of fax as equal.
     */
    public void setFax_Equal(String fax) {
        regFax(CK_EQ, fRES(fax));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fax The value of fax as notEqual.
     */
    public void setFax_NotEqual(String fax) {
        regFax(CK_NE, fRES(fax));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fax The value of fax as greaterThan.
     */
    public void setFax_GreaterThan(String fax) {
        regFax(CK_GT, fRES(fax));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fax The value of fax as lessThan.
     */
    public void setFax_LessThan(String fax) {
        regFax(CK_LT, fRES(fax));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fax The value of fax as greaterEqual.
     */
    public void setFax_GreaterEqual(String fax) {
        regFax(CK_GE, fRES(fax));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fax The value of fax as lessEqual.
     */
    public void setFax_LessEqual(String fax) {
        regFax(CK_LE, fRES(fax));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fax The value of fax as prefixSearch.
     */
    public void setFax_PrefixSearch(String fax) {
        regFax(CK_PS, fRES(fax));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param faxList The collection of fax as inScope.
     */
    public void setFax_InScope(Collection<String> faxList) {
        regFax(CK_INS, cTL(faxList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param fax The value of fax as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFax_LikeSearch(String fax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fax), getCValueFax(), "Fax", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param fax The value of fax as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFax_NotLikeSearch(String fax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fax), getCValueFax(), "Fax", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setFax_IsNull() { regFax(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setFax_IsNotNull() { regFax(CK_ISNN, DOBJ); }

    protected void regFax(ConditionKey k, Object v) { regQ(k, v, getCValueFax(), "Fax"); }
    abstract protected ConditionValue getCValueFax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param email The value of email as equal.
     */
    public void setEmail_Equal(String email) {
        regEmail(CK_EQ, fRES(email));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param email The value of email as notEqual.
     */
    public void setEmail_NotEqual(String email) {
        regEmail(CK_NE, fRES(email));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param email The value of email as greaterThan.
     */
    public void setEmail_GreaterThan(String email) {
        regEmail(CK_GT, fRES(email));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param email The value of email as lessThan.
     */
    public void setEmail_LessThan(String email) {
        regEmail(CK_LT, fRES(email));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param email The value of email as greaterEqual.
     */
    public void setEmail_GreaterEqual(String email) {
        regEmail(CK_GE, fRES(email));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param email The value of email as lessEqual.
     */
    public void setEmail_LessEqual(String email) {
        regEmail(CK_LE, fRES(email));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param email The value of email as prefixSearch.
     */
    public void setEmail_PrefixSearch(String email) {
        regEmail(CK_PS, fRES(email));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param emailList The collection of email as inScope.
     */
    public void setEmail_InScope(Collection<String> emailList) {
        regEmail(CK_INS, cTL(emailList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param email The value of email as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEmail_LikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(email), getCValueEmail(), "Email", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param email The value of email as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmail_NotLikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(email), getCValueEmail(), "Email", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEmail_IsNull() { regEmail(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEmail_IsNotNull() { regEmail(CK_ISNN, DOBJ); }

    protected void regEmail(ConditionKey k, Object v) { regQ(k, v, getCValueEmail(), "Email"); }
    abstract protected ConditionValue getCValueEmail();

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
    String xCB() { return TClientsCB.class.getName(); }
    String xCQ() { return TClientsCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
