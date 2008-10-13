package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_secpermission.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTSecpermissionCQ extends AbstractBsTSecpermissionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TSecpermissionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSecpermissionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_secpermission) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TSecpermissionCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TSecpermissionCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_secpermission on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TSecpermissionCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TSecpermissionCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _permissionid;
    public ConditionValue getPermissionid() {
        if (_permissionid == null) { _permissionid = new ConditionValue(); }
        return _permissionid;
    }
    protected ConditionValue getCValuePermissionid() { return getPermissionid(); }
          
    public BsTSecpermissionCQ addOrderBy_Permissionid_Asc() { regOBA("PermissionID"); return this; }
    public BsTSecpermissionCQ addOrderBy_Permissionid_Desc() { regOBD("PermissionID"); return this; }

    protected ConditionValue _permissionname;
    public ConditionValue getPermissionname() {
        if (_permissionname == null) { _permissionname = new ConditionValue(); }
        return _permissionname;
    }
    protected ConditionValue getCValuePermissionname() { return getPermissionname(); }
    
    public BsTSecpermissionCQ addOrderBy_Permissionname_Asc() { regOBA("PermissionName"); return this; }
    public BsTSecpermissionCQ addOrderBy_Permissionname_Desc() { regOBD("PermissionName"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTSecpermissionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTSecpermissionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TSecpermissionCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
