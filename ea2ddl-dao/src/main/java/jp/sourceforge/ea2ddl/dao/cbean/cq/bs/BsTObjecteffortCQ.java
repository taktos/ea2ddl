package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objecteffort.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjecteffortCQ extends AbstractBsTObjecteffortCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjecteffortCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjecteffortCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objecteffort) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjecteffortCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjecteffortCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objecteffort on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjecteffortCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TObjecteffortCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _objectId;
    public ConditionValue getObjectId() {
        if (_objectId == null) { _objectId = new ConditionValue(); }
        return _objectId;
    }
    protected ConditionValue getCValueObjectId() { return getObjectId(); }
          
    public BsTObjecteffortCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjecteffortCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _effort;
    public ConditionValue getEffort() {
        if (_effort == null) { _effort = new ConditionValue(); }
        return _effort;
    }
    protected ConditionValue getCValueEffort() { return getEffort(); }
    
    public BsTObjecteffortCQ addOrderBy_Effort_Asc() { regOBA("Effort"); return this; }
    public BsTObjecteffortCQ addOrderBy_Effort_Desc() { regOBD("Effort"); return this; }

    protected ConditionValue _efforttype;
    public ConditionValue getEfforttype() {
        if (_efforttype == null) { _efforttype = new ConditionValue(); }
        return _efforttype;
    }
    protected ConditionValue getCValueEfforttype() { return getEfforttype(); }
    
    public BsTObjecteffortCQ addOrderBy_Efforttype_Asc() { regOBA("EffortType"); return this; }
    public BsTObjecteffortCQ addOrderBy_Efforttype_Desc() { regOBD("EffortType"); return this; }

    protected ConditionValue _evalue;
    public ConditionValue getEvalue() {
        if (_evalue == null) { _evalue = new ConditionValue(); }
        return _evalue;
    }
    protected ConditionValue getCValueEvalue() { return getEvalue(); }
          
    public BsTObjecteffortCQ addOrderBy_Evalue_Asc() { regOBA("EValue"); return this; }
    public BsTObjecteffortCQ addOrderBy_Evalue_Desc() { regOBD("EValue"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTObjecteffortCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTObjecteffortCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjecteffortCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjecteffortCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TObjecteffortCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
