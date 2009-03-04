package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_seclocks.
 * @author DBFlute(AutoGenerator)
 */
public class BsTSeclocksCQ extends AbstractBsTSeclocksCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TSeclocksCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSeclocksCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_seclocks) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TSeclocksCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TSeclocksCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_seclocks on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TSeclocksCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TSeclocksCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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

    public BsTSeclocksCQ addOrderBy_Userid_Asc() { regOBA("UserID"); return this; }
    public BsTSeclocksCQ addOrderBy_Userid_Desc() { regOBD("UserID"); return this; }

    protected ConditionValue _groupid;
    public ConditionValue getGroupid() {
        if (_groupid == null) { _groupid = new ConditionValue(); }
        return _groupid;
    }
    protected ConditionValue getCValueGroupid() { return getGroupid(); }

    public BsTSeclocksCQ addOrderBy_Groupid_Asc() { regOBA("GroupID"); return this; }
    public BsTSeclocksCQ addOrderBy_Groupid_Desc() { regOBD("GroupID"); return this; }

    protected ConditionValue _entitytype;
    public ConditionValue getEntitytype() {
        if (_entitytype == null) { _entitytype = new ConditionValue(); }
        return _entitytype;
    }
    protected ConditionValue getCValueEntitytype() { return getEntitytype(); }

    public BsTSeclocksCQ addOrderBy_Entitytype_Asc() { regOBA("EntityType"); return this; }
    public BsTSeclocksCQ addOrderBy_Entitytype_Desc() { regOBD("EntityType"); return this; }

    protected ConditionValue _entityid;
    public ConditionValue getEntityid() {
        if (_entityid == null) { _entityid = new ConditionValue(); }
        return _entityid;
    }
    protected ConditionValue getCValueEntityid() { return getEntityid(); }

    public BsTSeclocksCQ addOrderBy_Entityid_Asc() { regOBA("EntityID"); return this; }
    public BsTSeclocksCQ addOrderBy_Entityid_Desc() { regOBD("EntityID"); return this; }

    protected ConditionValue _timestamp;
    public ConditionValue getTimestamp() {
        if (_timestamp == null) { _timestamp = new ConditionValue(); }
        return _timestamp;
    }
    protected ConditionValue getCValueTimestamp() { return getTimestamp(); }

    public BsTSeclocksCQ addOrderBy_Timestamp_Asc() { regOBA("Timestamp"); return this; }
    public BsTSeclocksCQ addOrderBy_Timestamp_Desc() { regOBD("Timestamp"); return this; }

    protected ConditionValue _locktype;
    public ConditionValue getLocktype() {
        if (_locktype == null) { _locktype = new ConditionValue(); }
        return _locktype;
    }
    protected ConditionValue getCValueLocktype() { return getLocktype(); }

    public BsTSeclocksCQ addOrderBy_Locktype_Asc() { regOBA("LockType"); return this; }
    public BsTSeclocksCQ addOrderBy_Locktype_Desc() { regOBD("LockType"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTSeclocksCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTSeclocksCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TSeclocksCB.class.getName(); }
    String xCQ() { return TSeclocksCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
