package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_roleconstraint.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTRoleconstraintCQ extends AbstractBsTRoleconstraintCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TRoleconstraintCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTRoleconstraintCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_roleconstraint) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TRoleconstraintCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TRoleconstraintCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_roleconstraint on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TRoleconstraintCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TRoleconstraintCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _connectorid;
    public ConditionValue getConnectorid() {
        if (_connectorid == null) { _connectorid = new ConditionValue(); }
        return _connectorid;
    }
    protected ConditionValue getCValueConnectorid() { return getConnectorid(); }
          
    public BsTRoleconstraintCQ addOrderBy_Connectorid_Asc() { regOBA("ConnectorID"); return this; }
    public BsTRoleconstraintCQ addOrderBy_Connectorid_Desc() { regOBD("ConnectorID"); return this; }

    protected ConditionValue _constraint;
    public ConditionValue getConstraint() {
        if (_constraint == null) { _constraint = new ConditionValue(); }
        return _constraint;
    }
    protected ConditionValue getCValueConstraint() { return getConstraint(); }
    
    public BsTRoleconstraintCQ addOrderBy_Constraint_Asc() { regOBA("Constraint"); return this; }
    public BsTRoleconstraintCQ addOrderBy_Constraint_Desc() { regOBD("Constraint"); return this; }

    protected ConditionValue _connectorend;
    public ConditionValue getConnectorend() {
        if (_connectorend == null) { _connectorend = new ConditionValue(); }
        return _connectorend;
    }
    protected ConditionValue getCValueConnectorend() { return getConnectorend(); }
    
    public BsTRoleconstraintCQ addOrderBy_Connectorend_Asc() { regOBA("ConnectorEnd"); return this; }
    public BsTRoleconstraintCQ addOrderBy_Connectorend_Desc() { regOBD("ConnectorEnd"); return this; }

    protected ConditionValue _constrainttype;
    public ConditionValue getConstrainttype() {
        if (_constrainttype == null) { _constrainttype = new ConditionValue(); }
        return _constrainttype;
    }
    protected ConditionValue getCValueConstrainttype() { return getConstrainttype(); }
    
    public BsTRoleconstraintCQ addOrderBy_Constrainttype_Asc() { regOBA("ConstraintType"); return this; }
    public BsTRoleconstraintCQ addOrderBy_Constrainttype_Desc() { regOBD("ConstraintType"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTRoleconstraintCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTRoleconstraintCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTRoleconstraintCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTRoleconstraintCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TRoleconstraintCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
