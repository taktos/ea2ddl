package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_attributeconstraints.
 * @author DBFlute(AutoGenerator)
 */
public class BsTAttributeconstraintsCQ extends AbstractBsTAttributeconstraintsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TAttributeconstraintsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTAttributeconstraintsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_attributeconstraints) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TAttributeconstraintsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TAttributeconstraintsCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_attributeconstraints on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TAttributeconstraintsCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TAttributeconstraintsCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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

    public BsTAttributeconstraintsCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTAttributeconstraintsCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _constraint;
    public ConditionValue getConstraint() {
        if (_constraint == null) { _constraint = new ConditionValue(); }
        return _constraint;
    }
    protected ConditionValue getCValueConstraint() { return getConstraint(); }

    public BsTAttributeconstraintsCQ addOrderBy_Constraint_Asc() { regOBA("Constraint"); return this; }
    public BsTAttributeconstraintsCQ addOrderBy_Constraint_Desc() { regOBD("Constraint"); return this; }

    protected ConditionValue _attname;
    public ConditionValue getAttname() {
        if (_attname == null) { _attname = new ConditionValue(); }
        return _attname;
    }
    protected ConditionValue getCValueAttname() { return getAttname(); }

    public BsTAttributeconstraintsCQ addOrderBy_Attname_Asc() { regOBA("AttName"); return this; }
    public BsTAttributeconstraintsCQ addOrderBy_Attname_Desc() { regOBD("AttName"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }

    public BsTAttributeconstraintsCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTAttributeconstraintsCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTAttributeconstraintsCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTAttributeconstraintsCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _id;
    public ConditionValue getId() {
        if (_id == null) { _id = new ConditionValue(); }
        return _id;
    }
    protected ConditionValue getCValueId() { return getId(); }

    public BsTAttributeconstraintsCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }
    public BsTAttributeconstraintsCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTAttributeconstraintsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTAttributeconstraintsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TAttributeconstraintsCB.class.getName(); }
    String xCQ() { return TAttributeconstraintsCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
