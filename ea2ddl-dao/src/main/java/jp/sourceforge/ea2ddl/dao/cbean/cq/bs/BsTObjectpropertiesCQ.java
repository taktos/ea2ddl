package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objectproperties.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjectpropertiesCQ extends AbstractBsTObjectpropertiesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectpropertiesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectpropertiesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objectproperties) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjectpropertiesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjectpropertiesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objectproperties on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjectpropertiesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TObjectpropertiesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
          
    public BsTObjectpropertiesCQ addOrderBy_Propertyid_Asc() { regOBA("PropertyID"); return this; }
    public BsTObjectpropertiesCQ addOrderBy_Propertyid_Desc() { regOBD("PropertyID"); return this; }

    protected ConditionValue _objectId;
    public ConditionValue getObjectId() {
        if (_objectId == null) { _objectId = new ConditionValue(); }
        return _objectId;
    }
    protected ConditionValue getCValueObjectId() { return getObjectId(); }
          
    protected Map<String, TObjectCQ> _objectId_InScopeSubQuery_TObjectMap;
    public Map<String, TObjectCQ> getObjectId_InScopeSubQuery_TObject() { return _objectId_InScopeSubQuery_TObjectMap; }
    public String keepObjectId_InScopeSubQuery_TObject(TObjectCQ subQuery) {
        if (_objectId_InScopeSubQuery_TObjectMap == null) { _objectId_InScopeSubQuery_TObjectMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_InScopeSubQuery_TObjectMap.size() + 1);
        _objectId_InScopeSubQuery_TObjectMap.put(key, subQuery); return "objectId_InScopeSubQuery_TObject." + key;
    }
      
    public BsTObjectpropertiesCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjectpropertiesCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _property;
    public ConditionValue getProperty() {
        if (_property == null) { _property = new ConditionValue(); }
        return _property;
    }
    protected ConditionValue getCValueProperty() { return getProperty(); }
    
    public BsTObjectpropertiesCQ addOrderBy_Property_Asc() { regOBA("Property"); return this; }
    public BsTObjectpropertiesCQ addOrderBy_Property_Desc() { regOBD("Property"); return this; }

    protected ConditionValue _value;
    public ConditionValue getValue() {
        if (_value == null) { _value = new ConditionValue(); }
        return _value;
    }
    protected ConditionValue getCValueValue() { return getValue(); }
    
    public BsTObjectpropertiesCQ addOrderBy_Value_Asc() { regOBA("Value"); return this; }
    public BsTObjectpropertiesCQ addOrderBy_Value_Desc() { regOBD("Value"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTObjectpropertiesCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTObjectpropertiesCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _eaGuid;
    public ConditionValue getEaGuid() {
        if (_eaGuid == null) { _eaGuid = new ConditionValue(); }
        return _eaGuid;
    }
    protected ConditionValue getCValueEaGuid() { return getEaGuid(); }
    
    public BsTObjectpropertiesCQ addOrderBy_EaGuid_Asc() { regOBA("ea_guid"); return this; }
    public BsTObjectpropertiesCQ addOrderBy_EaGuid_Desc() { regOBD("ea_guid"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjectpropertiesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjectpropertiesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        TObjectpropertiesCQ baseQuery = (TObjectpropertiesCQ)baseQueryAsSuper;
        TObjectpropertiesCQ unionQuery = (TObjectpropertiesCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryTObject()) {
            unionQuery.queryTObject().reflectRelationOnUnionQuery(baseQuery.queryTObject(), unionQuery.queryTObject());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    
    public TObjectCQ queryTObject() {
        return getConditionQueryTObject();
    }
    protected TObjectCQ _conditionQueryTObject;
    public TObjectCQ getConditionQueryTObject() {
        if (_conditionQueryTObject == null) {
            _conditionQueryTObject = createQueryTObject();
            setupOuterJoin_TObject();
        }
        return _conditionQueryTObject;
    }
    protected void setupOuterJoin_TObject() {
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("Object_ID"), getConditionQueryTObject().getRealColumnName("Object_ID"));
        registerOuterJoin(getConditionQueryTObject(), joinOnMap);
    }
    protected TObjectCQ createQueryTObject() {
        String nrp = resolveNextRelationPath("t_objectproperties", "tObject");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        TObjectCQ cq = new TObjectCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("tObject"); cq.xsetRelationPath(nrp); return cq;
    }
    public boolean hasConditionQueryTObject() {
        return _conditionQueryTObject != null;
    }


    protected String getConditionQueryClassNameInternally() { return TObjectpropertiesCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
