package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_secgroup.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTSecgroupCQ extends AbstractBsTSecgroupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TSecgroupCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSecgroupCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_secgroup) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TSecgroupCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TSecgroupCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_secgroup on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TSecgroupCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TSecgroupCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
    
    public BsTSecgroupCQ addOrderBy_Groupid_Asc() { regOBA("GroupID"); return this; }
    public BsTSecgroupCQ addOrderBy_Groupid_Desc() { regOBD("GroupID"); return this; }

    protected ConditionValue _groupname;
    public ConditionValue getGroupname() {
        if (_groupname == null) { _groupname = new ConditionValue(); }
        return _groupname;
    }
    protected ConditionValue getCValueGroupname() { return getGroupname(); }
    
    public BsTSecgroupCQ addOrderBy_Groupname_Asc() { regOBA("GroupName"); return this; }
    public BsTSecgroupCQ addOrderBy_Groupname_Desc() { regOBD("GroupName"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }
    
    public BsTSecgroupCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTSecgroupCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTSecgroupCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTSecgroupCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TSecgroupCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
