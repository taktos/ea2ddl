package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_secgrouppermission.
 * @author DBFlute(AutoGenerator)
 */
public class BsTSecgrouppermissionCQ extends AbstractBsTSecgrouppermissionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TSecgrouppermissionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSecgrouppermissionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_secgrouppermission) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TSecgrouppermissionCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TSecgrouppermissionCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_secgrouppermission on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TSecgrouppermissionCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TSecgrouppermissionCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _groupid;
    public ConditionValue getGroupid() {
        if (_groupid == null) { _groupid = new ConditionValue(); }
        return _groupid;
    }
    protected ConditionValue getCValueGroupid() { return getGroupid(); }

    public BsTSecgrouppermissionCQ addOrderBy_Groupid_Asc() { regOBA("GroupID"); return this; }
    public BsTSecgrouppermissionCQ addOrderBy_Groupid_Desc() { regOBD("GroupID"); return this; }

    protected ConditionValue _permissionid;
    public ConditionValue getPermissionid() {
        if (_permissionid == null) { _permissionid = new ConditionValue(); }
        return _permissionid;
    }
    protected ConditionValue getCValuePermissionid() { return getPermissionid(); }

    public BsTSecgrouppermissionCQ addOrderBy_Permissionid_Asc() { regOBA("PermissionID"); return this; }
    public BsTSecgrouppermissionCQ addOrderBy_Permissionid_Desc() { regOBD("PermissionID"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTSecgrouppermissionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTSecgrouppermissionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TSecgrouppermissionCB.class.getName(); }
    String xCQ() { return TSecgrouppermissionCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
