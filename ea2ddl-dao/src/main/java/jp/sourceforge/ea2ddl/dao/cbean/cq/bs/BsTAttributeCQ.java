package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_attribute.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTAttributeCQ extends AbstractBsTAttributeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TAttributeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTAttributeCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_attribute) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TAttributeCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TAttributeCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_attribute on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TAttributeCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TAttributeCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
          
    protected Map<String, TObjectCQ> _objectId_InScopeSubQuery_TObjectMap;
    public Map<String, TObjectCQ> getObjectId_InScopeSubQuery_TObject() { return _objectId_InScopeSubQuery_TObjectMap; }
    public String keepObjectId_InScopeSubQuery_TObject(TObjectCQ subQuery) {
        if (_objectId_InScopeSubQuery_TObjectMap == null) { _objectId_InScopeSubQuery_TObjectMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_InScopeSubQuery_TObjectMap.size() + 1);
        _objectId_InScopeSubQuery_TObjectMap.put(key, subQuery); return "objectId_InScopeSubQuery_TObject." + key;
    }
      
    public BsTAttributeCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTAttributeCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }
    
    public BsTAttributeCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTAttributeCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _scope;
    public ConditionValue getScope() {
        if (_scope == null) { _scope = new ConditionValue(); }
        return _scope;
    }
    protected ConditionValue getCValueScope() { return getScope(); }
    
    public BsTAttributeCQ addOrderBy_Scope_Asc() { regOBA("Scope"); return this; }
    public BsTAttributeCQ addOrderBy_Scope_Desc() { regOBD("Scope"); return this; }

    protected ConditionValue _stereotype;
    public ConditionValue getStereotype() {
        if (_stereotype == null) { _stereotype = new ConditionValue(); }
        return _stereotype;
    }
    protected ConditionValue getCValueStereotype() { return getStereotype(); }
    
    public BsTAttributeCQ addOrderBy_Stereotype_Asc() { regOBA("Stereotype"); return this; }
    public BsTAttributeCQ addOrderBy_Stereotype_Desc() { regOBD("Stereotype"); return this; }

    protected ConditionValue _containment;
    public ConditionValue getContainment() {
        if (_containment == null) { _containment = new ConditionValue(); }
        return _containment;
    }
    protected ConditionValue getCValueContainment() { return getContainment(); }
    
    public BsTAttributeCQ addOrderBy_Containment_Asc() { regOBA("Containment"); return this; }
    public BsTAttributeCQ addOrderBy_Containment_Desc() { regOBD("Containment"); return this; }

    protected ConditionValue _isstatic;
    public ConditionValue getIsstatic() {
        if (_isstatic == null) { _isstatic = new ConditionValue(); }
        return _isstatic;
    }
    protected ConditionValue getCValueIsstatic() { return getIsstatic(); }
          
    public BsTAttributeCQ addOrderBy_Isstatic_Asc() { regOBA("IsStatic"); return this; }
    public BsTAttributeCQ addOrderBy_Isstatic_Desc() { regOBD("IsStatic"); return this; }

    protected ConditionValue _iscollection;
    public ConditionValue getIscollection() {
        if (_iscollection == null) { _iscollection = new ConditionValue(); }
        return _iscollection;
    }
    protected ConditionValue getCValueIscollection() { return getIscollection(); }
          
    public BsTAttributeCQ addOrderBy_Iscollection_Asc() { regOBA("IsCollection"); return this; }
    public BsTAttributeCQ addOrderBy_Iscollection_Desc() { regOBD("IsCollection"); return this; }

    protected ConditionValue _isordered;
    public ConditionValue getIsordered() {
        if (_isordered == null) { _isordered = new ConditionValue(); }
        return _isordered;
    }
    protected ConditionValue getCValueIsordered() { return getIsordered(); }
          
    public BsTAttributeCQ addOrderBy_Isordered_Asc() { regOBA("IsOrdered"); return this; }
    public BsTAttributeCQ addOrderBy_Isordered_Desc() { regOBD("IsOrdered"); return this; }

    protected ConditionValue _allowduplicates;
    public ConditionValue getAllowduplicates() {
        if (_allowduplicates == null) { _allowduplicates = new ConditionValue(); }
        return _allowduplicates;
    }
    protected ConditionValue getCValueAllowduplicates() { return getAllowduplicates(); }
          
    public BsTAttributeCQ addOrderBy_Allowduplicates_Asc() { regOBA("AllowDuplicates"); return this; }
    public BsTAttributeCQ addOrderBy_Allowduplicates_Desc() { regOBD("AllowDuplicates"); return this; }

    protected ConditionValue _lowerbound;
    public ConditionValue getLowerbound() {
        if (_lowerbound == null) { _lowerbound = new ConditionValue(); }
        return _lowerbound;
    }
    protected ConditionValue getCValueLowerbound() { return getLowerbound(); }
    
    public BsTAttributeCQ addOrderBy_Lowerbound_Asc() { regOBA("LowerBound"); return this; }
    public BsTAttributeCQ addOrderBy_Lowerbound_Desc() { regOBD("LowerBound"); return this; }

    protected ConditionValue _upperbound;
    public ConditionValue getUpperbound() {
        if (_upperbound == null) { _upperbound = new ConditionValue(); }
        return _upperbound;
    }
    protected ConditionValue getCValueUpperbound() { return getUpperbound(); }
    
    public BsTAttributeCQ addOrderBy_Upperbound_Asc() { regOBA("UpperBound"); return this; }
    public BsTAttributeCQ addOrderBy_Upperbound_Desc() { regOBD("UpperBound"); return this; }

    protected ConditionValue _container;
    public ConditionValue getContainer() {
        if (_container == null) { _container = new ConditionValue(); }
        return _container;
    }
    protected ConditionValue getCValueContainer() { return getContainer(); }
    
    public BsTAttributeCQ addOrderBy_Container_Asc() { regOBA("Container"); return this; }
    public BsTAttributeCQ addOrderBy_Container_Desc() { regOBD("Container"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTAttributeCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTAttributeCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _derived;
    public ConditionValue getDerived() {
        if (_derived == null) { _derived = new ConditionValue(); }
        return _derived;
    }
    protected ConditionValue getCValueDerived() { return getDerived(); }
    
    public BsTAttributeCQ addOrderBy_Derived_Asc() { regOBA("Derived"); return this; }
    public BsTAttributeCQ addOrderBy_Derived_Desc() { regOBD("Derived"); return this; }

    protected ConditionValue _id;
    public ConditionValue getId() {
        if (_id == null) { _id = new ConditionValue(); }
        return _id;
    }
    protected ConditionValue getCValueId() { return getId(); }
          
    public BsTAttributeCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }
    public BsTAttributeCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _pos;
    public ConditionValue getPos() {
        if (_pos == null) { _pos = new ConditionValue(); }
        return _pos;
    }
    protected ConditionValue getCValuePos() { return getPos(); }
          
    public BsTAttributeCQ addOrderBy_Pos_Asc() { regOBA("Pos"); return this; }
    public BsTAttributeCQ addOrderBy_Pos_Desc() { regOBD("Pos"); return this; }

    protected ConditionValue _genoption;
    public ConditionValue getGenoption() {
        if (_genoption == null) { _genoption = new ConditionValue(); }
        return _genoption;
    }
    protected ConditionValue getCValueGenoption() { return getGenoption(); }
    
    public BsTAttributeCQ addOrderBy_Genoption_Asc() { regOBA("GenOption"); return this; }
    public BsTAttributeCQ addOrderBy_Genoption_Desc() { regOBD("GenOption"); return this; }

    protected ConditionValue _length;
    public ConditionValue getLength() {
        if (_length == null) { _length = new ConditionValue(); }
        return _length;
    }
    protected ConditionValue getCValueLength() { return getLength(); }
          
    public BsTAttributeCQ addOrderBy_Length_Asc() { regOBA("Length"); return this; }
    public BsTAttributeCQ addOrderBy_Length_Desc() { regOBD("Length"); return this; }

    protected ConditionValue _precision;
    public ConditionValue getPrecision() {
        if (_precision == null) { _precision = new ConditionValue(); }
        return _precision;
    }
    protected ConditionValue getCValuePrecision() { return getPrecision(); }
          
    public BsTAttributeCQ addOrderBy_Precision_Asc() { regOBA("Precision"); return this; }
    public BsTAttributeCQ addOrderBy_Precision_Desc() { regOBD("Precision"); return this; }

    protected ConditionValue _scale;
    public ConditionValue getScale() {
        if (_scale == null) { _scale = new ConditionValue(); }
        return _scale;
    }
    protected ConditionValue getCValueScale() { return getScale(); }
          
    public BsTAttributeCQ addOrderBy_Scale_Asc() { regOBA("Scale"); return this; }
    public BsTAttributeCQ addOrderBy_Scale_Desc() { regOBD("Scale"); return this; }

    protected ConditionValue _style;
    public ConditionValue getStyle() {
        if (_style == null) { _style = new ConditionValue(); }
        return _style;
    }
    protected ConditionValue getCValueStyle() { return getStyle(); }
    
    public BsTAttributeCQ addOrderBy_Style_Asc() { regOBA("Style"); return this; }
    public BsTAttributeCQ addOrderBy_Style_Desc() { regOBD("Style"); return this; }

    protected ConditionValue _classifier;
    public ConditionValue getClassifier() {
        if (_classifier == null) { _classifier = new ConditionValue(); }
        return _classifier;
    }
    protected ConditionValue getCValueClassifier() { return getClassifier(); }
    
    public BsTAttributeCQ addOrderBy_Classifier_Asc() { regOBA("Classifier"); return this; }
    public BsTAttributeCQ addOrderBy_Classifier_Desc() { regOBD("Classifier"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }
    
    public BsTAttributeCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTAttributeCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _eaGuid;
    public ConditionValue getEaGuid() {
        if (_eaGuid == null) { _eaGuid = new ConditionValue(); }
        return _eaGuid;
    }
    protected ConditionValue getCValueEaGuid() { return getEaGuid(); }
    
    public BsTAttributeCQ addOrderBy_EaGuid_Asc() { regOBA("ea_guid"); return this; }
    public BsTAttributeCQ addOrderBy_EaGuid_Desc() { regOBD("ea_guid"); return this; }

    protected ConditionValue _styleex;
    public ConditionValue getStyleex() {
        if (_styleex == null) { _styleex = new ConditionValue(); }
        return _styleex;
    }
    protected ConditionValue getCValueStyleex() { return getStyleex(); }
    
    public BsTAttributeCQ addOrderBy_Styleex_Asc() { regOBA("StyleEx"); return this; }
    public BsTAttributeCQ addOrderBy_Styleex_Desc() { regOBD("StyleEx"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTAttributeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTAttributeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        TAttributeCQ baseQuery = (TAttributeCQ)baseQueryAsSuper;
        TAttributeCQ unionQuery = (TAttributeCQ)unionQueryAsSuper;
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
        String nrp = resolveNextRelationPath("t_attribute", "tObject");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        TObjectCQ cq = new TObjectCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("tObject"); cq.xsetRelationPath(nrp); return cq;
    }
    public boolean hasConditionQueryTObject() {
        return _conditionQueryTObject != null;
    }


    protected String getConditionQueryClassNameInternally() { return TAttributeCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
