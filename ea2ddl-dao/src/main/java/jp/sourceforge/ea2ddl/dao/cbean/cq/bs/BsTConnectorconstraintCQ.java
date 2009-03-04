package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_connectorconstraint.
 * @author DBFlute(AutoGenerator)
 */
public class BsTConnectorconstraintCQ extends AbstractBsTConnectorconstraintCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TConnectorconstraintCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTConnectorconstraintCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_connectorconstraint) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TConnectorconstraintCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TConnectorconstraintCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_connectorconstraint on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TConnectorconstraintCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TConnectorconstraintCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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

    public BsTConnectorconstraintCQ addOrderBy_Connectorid_Asc() { regOBA("ConnectorID"); return this; }
    public BsTConnectorconstraintCQ addOrderBy_Connectorid_Desc() { regOBD("ConnectorID"); return this; }

    protected ConditionValue _constraint;
    public ConditionValue getConstraint() {
        if (_constraint == null) { _constraint = new ConditionValue(); }
        return _constraint;
    }
    protected ConditionValue getCValueConstraint() { return getConstraint(); }

    public BsTConnectorconstraintCQ addOrderBy_Constraint_Asc() { regOBA("Constraint"); return this; }
    public BsTConnectorconstraintCQ addOrderBy_Constraint_Desc() { regOBD("Constraint"); return this; }

    protected ConditionValue _constrainttype;
    public ConditionValue getConstrainttype() {
        if (_constrainttype == null) { _constrainttype = new ConditionValue(); }
        return _constrainttype;
    }
    protected ConditionValue getCValueConstrainttype() { return getConstrainttype(); }

    public BsTConnectorconstraintCQ addOrderBy_Constrainttype_Asc() { regOBA("ConstraintType"); return this; }
    public BsTConnectorconstraintCQ addOrderBy_Constrainttype_Desc() { regOBD("ConstraintType"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTConnectorconstraintCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTConnectorconstraintCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTConnectorconstraintCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTConnectorconstraintCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TConnectorconstraintCB.class.getName(); }
    String xCQ() { return TConnectorconstraintCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
