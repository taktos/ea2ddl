package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_secusergroup.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTSecusergroupCQ extends AbstractBsTSecusergroupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TSecusergroupCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSecusergroupCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_secusergroup) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TSecusergroupCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TSecusergroupCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_secusergroup on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TSecusergroupCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TSecusergroupCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
    
    public BsTSecusergroupCQ addOrderBy_Userid_Asc() { regOBA("UserID"); return this; }
    public BsTSecusergroupCQ addOrderBy_Userid_Desc() { regOBD("UserID"); return this; }

    protected ConditionValue _groupid;
    public ConditionValue getGroupid() {
        if (_groupid == null) { _groupid = new ConditionValue(); }
        return _groupid;
    }
    protected ConditionValue getCValueGroupid() { return getGroupid(); }
    
    public BsTSecusergroupCQ addOrderBy_Groupid_Asc() { regOBA("GroupID"); return this; }
    public BsTSecusergroupCQ addOrderBy_Groupid_Desc() { regOBD("GroupID"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTSecusergroupCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTSecusergroupCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TSecusergroupCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
