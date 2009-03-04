package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_clients.
 * @author DBFlute(AutoGenerator)
 */
public class BsTClientsCQ extends AbstractBsTClientsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TClientsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTClientsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_clients) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TClientsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TClientsCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_clients on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TClientsCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TClientsCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    public BsTClientsCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTClientsCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _organisation;
    public ConditionValue getOrganisation() {
        if (_organisation == null) { _organisation = new ConditionValue(); }
        return _organisation;
    }
    protected ConditionValue getCValueOrganisation() { return getOrganisation(); }

    public BsTClientsCQ addOrderBy_Organisation_Asc() { regOBA("Organisation"); return this; }
    public BsTClientsCQ addOrderBy_Organisation_Desc() { regOBD("Organisation"); return this; }

    protected ConditionValue _phone1;
    public ConditionValue getPhone1() {
        if (_phone1 == null) { _phone1 = new ConditionValue(); }
        return _phone1;
    }
    protected ConditionValue getCValuePhone1() { return getPhone1(); }

    public BsTClientsCQ addOrderBy_Phone1_Asc() { regOBA("Phone1"); return this; }
    public BsTClientsCQ addOrderBy_Phone1_Desc() { regOBD("Phone1"); return this; }

    protected ConditionValue _phone2;
    public ConditionValue getPhone2() {
        if (_phone2 == null) { _phone2 = new ConditionValue(); }
        return _phone2;
    }
    protected ConditionValue getCValuePhone2() { return getPhone2(); }

    public BsTClientsCQ addOrderBy_Phone2_Asc() { regOBA("Phone2"); return this; }
    public BsTClientsCQ addOrderBy_Phone2_Desc() { regOBD("Phone2"); return this; }

    protected ConditionValue _mobile;
    public ConditionValue getMobile() {
        if (_mobile == null) { _mobile = new ConditionValue(); }
        return _mobile;
    }
    protected ConditionValue getCValueMobile() { return getMobile(); }

    public BsTClientsCQ addOrderBy_Mobile_Asc() { regOBA("Mobile"); return this; }
    public BsTClientsCQ addOrderBy_Mobile_Desc() { regOBD("Mobile"); return this; }

    protected ConditionValue _fax;
    public ConditionValue getFax() {
        if (_fax == null) { _fax = new ConditionValue(); }
        return _fax;
    }
    protected ConditionValue getCValueFax() { return getFax(); }

    public BsTClientsCQ addOrderBy_Fax_Asc() { regOBA("Fax"); return this; }
    public BsTClientsCQ addOrderBy_Fax_Desc() { regOBD("Fax"); return this; }

    protected ConditionValue _email;
    public ConditionValue getEmail() {
        if (_email == null) { _email = new ConditionValue(); }
        return _email;
    }
    protected ConditionValue getCValueEmail() { return getEmail(); }

    public BsTClientsCQ addOrderBy_Email_Asc() { regOBA("Email"); return this; }
    public BsTClientsCQ addOrderBy_Email_Desc() { regOBD("Email"); return this; }

    protected ConditionValue _roles;
    public ConditionValue getRoles() {
        if (_roles == null) { _roles = new ConditionValue(); }
        return _roles;
    }
    protected ConditionValue getCValueRoles() { return getRoles(); }

    public BsTClientsCQ addOrderBy_Roles_Asc() { regOBA("Roles"); return this; }
    public BsTClientsCQ addOrderBy_Roles_Desc() { regOBD("Roles"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTClientsCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTClientsCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTClientsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTClientsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TClientsCB.class.getName(); }
    String xCQ() { return TClientsCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
