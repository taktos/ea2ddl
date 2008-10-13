package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_secuserpermission.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTSecuserpermissionCQ extends AbstractBsTSecuserpermissionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TSecuserpermissionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSecuserpermissionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_secuserpermission) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TSecuserpermissionCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TSecuserpermissionCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_secuserpermission on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TSecuserpermissionCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TSecuserpermissionCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
    
    public BsTSecuserpermissionCQ addOrderBy_Userid_Asc() { regOBA("UserID"); return this; }
    public BsTSecuserpermissionCQ addOrderBy_Userid_Desc() { regOBD("UserID"); return this; }

    protected ConditionValue _permissionid;
    public ConditionValue getPermissionid() {
        if (_permissionid == null) { _permissionid = new ConditionValue(); }
        return _permissionid;
    }
    protected ConditionValue getCValuePermissionid() { return getPermissionid(); }
          
    public BsTSecuserpermissionCQ addOrderBy_Permissionid_Asc() { regOBA("PermissionID"); return this; }
    public BsTSecuserpermissionCQ addOrderBy_Permissionid_Desc() { regOBD("PermissionID"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTSecuserpermissionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTSecuserpermissionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TSecuserpermissionCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
