package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_xref.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTXrefCQ extends AbstractBsTXrefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TXrefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTXrefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_xref) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TXrefCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TXrefCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_xref on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TXrefCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TXrefCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _xrefid;
    public ConditionValue getXrefid() {
        if (_xrefid == null) { _xrefid = new ConditionValue(); }
        return _xrefid;
    }
    protected ConditionValue getCValueXrefid() { return getXrefid(); }
    
    public BsTXrefCQ addOrderBy_Xrefid_Asc() { regOBA("XrefID"); return this; }
    public BsTXrefCQ addOrderBy_Xrefid_Desc() { regOBD("XrefID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }
    
    public BsTXrefCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTXrefCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }
    
    public BsTXrefCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTXrefCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _visibility;
    public ConditionValue getVisibility() {
        if (_visibility == null) { _visibility = new ConditionValue(); }
        return _visibility;
    }
    protected ConditionValue getCValueVisibility() { return getVisibility(); }
    
    public BsTXrefCQ addOrderBy_Visibility_Asc() { regOBA("Visibility"); return this; }
    public BsTXrefCQ addOrderBy_Visibility_Desc() { regOBD("Visibility"); return this; }

    protected ConditionValue _namespace;
    public ConditionValue getNamespace() {
        if (_namespace == null) { _namespace = new ConditionValue(); }
        return _namespace;
    }
    protected ConditionValue getCValueNamespace() { return getNamespace(); }
    
    public BsTXrefCQ addOrderBy_Namespace_Asc() { regOBA("Namespace"); return this; }
    public BsTXrefCQ addOrderBy_Namespace_Desc() { regOBD("Namespace"); return this; }

    protected ConditionValue _requirement;
    public ConditionValue getRequirement() {
        if (_requirement == null) { _requirement = new ConditionValue(); }
        return _requirement;
    }
    protected ConditionValue getCValueRequirement() { return getRequirement(); }
    
    public BsTXrefCQ addOrderBy_Requirement_Asc() { regOBA("Requirement"); return this; }
    public BsTXrefCQ addOrderBy_Requirement_Desc() { regOBD("Requirement"); return this; }

    protected ConditionValue _constraint;
    public ConditionValue getConstraint() {
        if (_constraint == null) { _constraint = new ConditionValue(); }
        return _constraint;
    }
    protected ConditionValue getCValueConstraint() { return getConstraint(); }
    
    public BsTXrefCQ addOrderBy_Constraint_Asc() { regOBA("Constraint"); return this; }
    public BsTXrefCQ addOrderBy_Constraint_Desc() { regOBD("Constraint"); return this; }

    protected ConditionValue _behavior;
    public ConditionValue getBehavior() {
        if (_behavior == null) { _behavior = new ConditionValue(); }
        return _behavior;
    }
    protected ConditionValue getCValueBehavior() { return getBehavior(); }
    
    public BsTXrefCQ addOrderBy_Behavior_Asc() { regOBA("Behavior"); return this; }
    public BsTXrefCQ addOrderBy_Behavior_Desc() { regOBD("Behavior"); return this; }

    protected ConditionValue _partition;
    public ConditionValue getPartition() {
        if (_partition == null) { _partition = new ConditionValue(); }
        return _partition;
    }
    protected ConditionValue getCValuePartition() { return getPartition(); }
    
    public BsTXrefCQ addOrderBy_Partition_Asc() { regOBA("Partition"); return this; }
    public BsTXrefCQ addOrderBy_Partition_Desc() { regOBD("Partition"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }
    
    public BsTXrefCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTXrefCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    protected ConditionValue _client;
    public ConditionValue getClient() {
        if (_client == null) { _client = new ConditionValue(); }
        return _client;
    }
    protected ConditionValue getCValueClient() { return getClient(); }
    
    public BsTXrefCQ addOrderBy_Client_Asc() { regOBA("Client"); return this; }
    public BsTXrefCQ addOrderBy_Client_Desc() { regOBD("Client"); return this; }

    protected ConditionValue _supplier;
    public ConditionValue getSupplier() {
        if (_supplier == null) { _supplier = new ConditionValue(); }
        return _supplier;
    }
    protected ConditionValue getCValueSupplier() { return getSupplier(); }
    
    public BsTXrefCQ addOrderBy_Supplier_Asc() { regOBA("Supplier"); return this; }
    public BsTXrefCQ addOrderBy_Supplier_Desc() { regOBD("Supplier"); return this; }

    protected ConditionValue _link;
    public ConditionValue getLink() {
        if (_link == null) { _link = new ConditionValue(); }
        return _link;
    }
    protected ConditionValue getCValueLink() { return getLink(); }
    
    public BsTXrefCQ addOrderBy_Link_Asc() { regOBA("Link"); return this; }
    public BsTXrefCQ addOrderBy_Link_Desc() { regOBD("Link"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTXrefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTXrefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TXrefCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
