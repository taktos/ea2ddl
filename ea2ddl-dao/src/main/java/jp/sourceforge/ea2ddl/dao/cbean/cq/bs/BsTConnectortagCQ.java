package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_connectortag.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTConnectortagCQ extends AbstractBsTConnectortagCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TConnectortagCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTConnectortagCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_connectortag) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TConnectortagCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TConnectortagCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_connectortag on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TConnectortagCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TConnectortagCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _propertyid;
    public ConditionValue getPropertyid() {
        if (_propertyid == null) { _propertyid = new ConditionValue(); }
        return _propertyid;
    }
    protected ConditionValue getCValuePropertyid() { return getPropertyid(); }
          
    public BsTConnectortagCQ addOrderBy_Propertyid_Asc() { regOBA("PropertyID"); return this; }
    public BsTConnectortagCQ addOrderBy_Propertyid_Desc() { regOBD("PropertyID"); return this; }

    protected ConditionValue _elementid;
    public ConditionValue getElementid() {
        if (_elementid == null) { _elementid = new ConditionValue(); }
        return _elementid;
    }
    protected ConditionValue getCValueElementid() { return getElementid(); }
          
    public BsTConnectortagCQ addOrderBy_Elementid_Asc() { regOBA("ElementID"); return this; }
    public BsTConnectortagCQ addOrderBy_Elementid_Desc() { regOBD("ElementID"); return this; }

    protected ConditionValue _property;
    public ConditionValue getProperty() {
        if (_property == null) { _property = new ConditionValue(); }
        return _property;
    }
    protected ConditionValue getCValueProperty() { return getProperty(); }
    
    public BsTConnectortagCQ addOrderBy_Property_Asc() { regOBA("Property"); return this; }
    public BsTConnectortagCQ addOrderBy_Property_Desc() { regOBD("Property"); return this; }

    protected ConditionValue _value;
    public ConditionValue getValue() {
        if (_value == null) { _value = new ConditionValue(); }
        return _value;
    }
    protected ConditionValue getCValueValue() { return getValue(); }
    
    public BsTConnectortagCQ addOrderBy_Value_Asc() { regOBA("VALUE"); return this; }
    public BsTConnectortagCQ addOrderBy_Value_Desc() { regOBD("VALUE"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTConnectortagCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }
    public BsTConnectortagCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

    protected ConditionValue _eaGuid;
    public ConditionValue getEaGuid() {
        if (_eaGuid == null) { _eaGuid = new ConditionValue(); }
        return _eaGuid;
    }
    protected ConditionValue getCValueEaGuid() { return getEaGuid(); }
    
    public BsTConnectortagCQ addOrderBy_EaGuid_Asc() { regOBA("ea_guid"); return this; }
    public BsTConnectortagCQ addOrderBy_EaGuid_Desc() { regOBD("ea_guid"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTConnectortagCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTConnectortagCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TConnectortagCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
