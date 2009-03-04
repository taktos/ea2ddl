package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_secuser.
 * @author DBFlute(AutoGenerator)
 */
public class BsTSecuserCQ extends AbstractBsTSecuserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TSecuserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSecuserCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_secuser) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TSecuserCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TSecuserCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_secuser on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TSecuserCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TSecuserCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _userid;
    public ConditionValue getUserid() {
        if (_userid == null) { _userid = new ConditionValue(); }
        return _userid;
    }
    protected ConditionValue getCValueUserid() { return getUserid(); }

    public BsTSecuserCQ addOrderBy_Userid_Asc() { regOBA("UserID"); return this; }
    public BsTSecuserCQ addOrderBy_Userid_Desc() { regOBD("UserID"); return this; }

    protected ConditionValue _userlogin;
    public ConditionValue getUserlogin() {
        if (_userlogin == null) { _userlogin = new ConditionValue(); }
        return _userlogin;
    }
    protected ConditionValue getCValueUserlogin() { return getUserlogin(); }

    public BsTSecuserCQ addOrderBy_Userlogin_Asc() { regOBA("UserLogin"); return this; }
    public BsTSecuserCQ addOrderBy_Userlogin_Desc() { regOBD("UserLogin"); return this; }

    protected ConditionValue _firstname;
    public ConditionValue getFirstname() {
        if (_firstname == null) { _firstname = new ConditionValue(); }
        return _firstname;
    }
    protected ConditionValue getCValueFirstname() { return getFirstname(); }

    public BsTSecuserCQ addOrderBy_Firstname_Asc() { regOBA("FirstName"); return this; }
    public BsTSecuserCQ addOrderBy_Firstname_Desc() { regOBD("FirstName"); return this; }

    protected ConditionValue _surname;
    public ConditionValue getSurname() {
        if (_surname == null) { _surname = new ConditionValue(); }
        return _surname;
    }
    protected ConditionValue getCValueSurname() { return getSurname(); }

    public BsTSecuserCQ addOrderBy_Surname_Asc() { regOBA("Surname"); return this; }
    public BsTSecuserCQ addOrderBy_Surname_Desc() { regOBD("Surname"); return this; }

    protected ConditionValue _department;
    public ConditionValue getDepartment() {
        if (_department == null) { _department = new ConditionValue(); }
        return _department;
    }
    protected ConditionValue getCValueDepartment() { return getDepartment(); }

    public BsTSecuserCQ addOrderBy_Department_Asc() { regOBA("Department"); return this; }
    public BsTSecuserCQ addOrderBy_Department_Desc() { regOBD("Department"); return this; }

    protected ConditionValue _password;
    public ConditionValue getPassword() {
        if (_password == null) { _password = new ConditionValue(); }
        return _password;
    }
    protected ConditionValue getCValuePassword() { return getPassword(); }

    public BsTSecuserCQ addOrderBy_Password_Asc() { regOBA("Password"); return this; }
    public BsTSecuserCQ addOrderBy_Password_Desc() { regOBD("Password"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTSecuserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTSecuserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TSecuserCB.class.getName(); }
    String xCQ() { return TSecuserCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
