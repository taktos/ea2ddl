package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objectrequires.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjectrequiresCQ extends AbstractBsTObjectrequiresCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectrequiresCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectrequiresCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objectrequires) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjectrequiresCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjectrequiresCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objectrequires on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjectrequiresCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TObjectrequiresCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _reqid;
    public ConditionValue getReqid() {
        if (_reqid == null) { _reqid = new ConditionValue(); }
        return _reqid;
    }
    protected ConditionValue getCValueReqid() { return getReqid(); }
          
    public BsTObjectrequiresCQ addOrderBy_Reqid_Asc() { regOBA("ReqID"); return this; }
    public BsTObjectrequiresCQ addOrderBy_Reqid_Desc() { regOBD("ReqID"); return this; }

    protected ConditionValue _objectId;
    public ConditionValue getObjectId() {
        if (_objectId == null) { _objectId = new ConditionValue(); }
        return _objectId;
    }
    protected ConditionValue getCValueObjectId() { return getObjectId(); }
          
    public BsTObjectrequiresCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjectrequiresCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _requirement;
    public ConditionValue getRequirement() {
        if (_requirement == null) { _requirement = new ConditionValue(); }
        return _requirement;
    }
    protected ConditionValue getCValueRequirement() { return getRequirement(); }
    
    public BsTObjectrequiresCQ addOrderBy_Requirement_Asc() { regOBA("Requirement"); return this; }
    public BsTObjectrequiresCQ addOrderBy_Requirement_Desc() { regOBD("Requirement"); return this; }

    protected ConditionValue _reqtype;
    public ConditionValue getReqtype() {
        if (_reqtype == null) { _reqtype = new ConditionValue(); }
        return _reqtype;
    }
    protected ConditionValue getCValueReqtype() { return getReqtype(); }
    
    public BsTObjectrequiresCQ addOrderBy_Reqtype_Asc() { regOBA("ReqType"); return this; }
    public BsTObjectrequiresCQ addOrderBy_Reqtype_Desc() { regOBD("ReqType"); return this; }

    protected ConditionValue _status;
    public ConditionValue getStatus() {
        if (_status == null) { _status = new ConditionValue(); }
        return _status;
    }
    protected ConditionValue getCValueStatus() { return getStatus(); }
    
    public BsTObjectrequiresCQ addOrderBy_Status_Asc() { regOBA("Status"); return this; }
    public BsTObjectrequiresCQ addOrderBy_Status_Desc() { regOBD("Status"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTObjectrequiresCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTObjectrequiresCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _stability;
    public ConditionValue getStability() {
        if (_stability == null) { _stability = new ConditionValue(); }
        return _stability;
    }
    protected ConditionValue getCValueStability() { return getStability(); }
    
    public BsTObjectrequiresCQ addOrderBy_Stability_Asc() { regOBA("Stability"); return this; }
    public BsTObjectrequiresCQ addOrderBy_Stability_Desc() { regOBD("Stability"); return this; }

    protected ConditionValue _difficulty;
    public ConditionValue getDifficulty() {
        if (_difficulty == null) { _difficulty = new ConditionValue(); }
        return _difficulty;
    }
    protected ConditionValue getCValueDifficulty() { return getDifficulty(); }
    
    public BsTObjectrequiresCQ addOrderBy_Difficulty_Asc() { regOBA("Difficulty"); return this; }
    public BsTObjectrequiresCQ addOrderBy_Difficulty_Desc() { regOBD("Difficulty"); return this; }

    protected ConditionValue _priority;
    public ConditionValue getPriority() {
        if (_priority == null) { _priority = new ConditionValue(); }
        return _priority;
    }
    protected ConditionValue getCValuePriority() { return getPriority(); }
    
    public BsTObjectrequiresCQ addOrderBy_Priority_Asc() { regOBA("Priority"); return this; }
    public BsTObjectrequiresCQ addOrderBy_Priority_Desc() { regOBD("Priority"); return this; }

    protected ConditionValue _lastupdate;
    public ConditionValue getLastupdate() {
        if (_lastupdate == null) { _lastupdate = new ConditionValue(); }
        return _lastupdate;
    }
    protected ConditionValue getCValueLastupdate() { return getLastupdate(); }
    
    public BsTObjectrequiresCQ addOrderBy_Lastupdate_Asc() { regOBA("LastUpdate"); return this; }
    public BsTObjectrequiresCQ addOrderBy_Lastupdate_Desc() { regOBD("LastUpdate"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjectrequiresCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjectrequiresCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TObjectrequiresCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
