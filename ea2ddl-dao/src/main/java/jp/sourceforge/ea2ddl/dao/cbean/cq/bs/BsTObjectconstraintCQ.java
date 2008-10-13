package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objectconstraint.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjectconstraintCQ extends AbstractBsTObjectconstraintCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectconstraintCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectconstraintCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objectconstraint) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjectconstraintCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjectconstraintCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objectconstraint on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjectconstraintCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TObjectconstraintCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
          
    public BsTObjectconstraintCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjectconstraintCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _constraint;
    public ConditionValue getConstraint() {
        if (_constraint == null) { _constraint = new ConditionValue(); }
        return _constraint;
    }
    protected ConditionValue getCValueConstraint() { return getConstraint(); }
    
    public BsTObjectconstraintCQ addOrderBy_Constraint_Asc() { regOBA("Constraint"); return this; }
    public BsTObjectconstraintCQ addOrderBy_Constraint_Desc() { regOBD("Constraint"); return this; }

    protected ConditionValue _constrainttype;
    public ConditionValue getConstrainttype() {
        if (_constrainttype == null) { _constrainttype = new ConditionValue(); }
        return _constrainttype;
    }
    protected ConditionValue getCValueConstrainttype() { return getConstrainttype(); }
    
    public BsTObjectconstraintCQ addOrderBy_Constrainttype_Asc() { regOBA("ConstraintType"); return this; }
    public BsTObjectconstraintCQ addOrderBy_Constrainttype_Desc() { regOBD("ConstraintType"); return this; }

    protected ConditionValue _weight;
    public ConditionValue getWeight() {
        if (_weight == null) { _weight = new ConditionValue(); }
        return _weight;
    }
    protected ConditionValue getCValueWeight() { return getWeight(); }
          
    public BsTObjectconstraintCQ addOrderBy_Weight_Asc() { regOBA("Weight"); return this; }
    public BsTObjectconstraintCQ addOrderBy_Weight_Desc() { regOBD("Weight"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTObjectconstraintCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTObjectconstraintCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _status;
    public ConditionValue getStatus() {
        if (_status == null) { _status = new ConditionValue(); }
        return _status;
    }
    protected ConditionValue getCValueStatus() { return getStatus(); }
    
    public BsTObjectconstraintCQ addOrderBy_Status_Asc() { regOBA("Status"); return this; }
    public BsTObjectconstraintCQ addOrderBy_Status_Desc() { regOBD("Status"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjectconstraintCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjectconstraintCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TObjectconstraintCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
