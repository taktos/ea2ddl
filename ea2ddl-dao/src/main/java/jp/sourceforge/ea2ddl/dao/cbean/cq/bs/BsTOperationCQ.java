package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_operation.
 * @author DBFlute(AutoGenerator)
 */
public class BsTOperationCQ extends AbstractBsTOperationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TOperationCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTOperationCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_operation) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TOperationCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TOperationCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_operation on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TOperationCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TOperationCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _operationid;
    public ConditionValue getOperationid() {
        if (_operationid == null) { _operationid = new ConditionValue(); }
        return _operationid;
    }
    protected ConditionValue getCValueOperationid() { return getOperationid(); }

    protected Map<String, TOperationparamsCQ> _operationid_InScopeSubQuery_TOperationparamsListMap;
    public Map<String, TOperationparamsCQ> getOperationid_InScopeSubQuery_TOperationparamsList() { return _operationid_InScopeSubQuery_TOperationparamsListMap; }
    public String keepOperationid_InScopeSubQuery_TOperationparamsList(TOperationparamsCQ subQuery) {
        if (_operationid_InScopeSubQuery_TOperationparamsListMap == null) { _operationid_InScopeSubQuery_TOperationparamsListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_operationid_InScopeSubQuery_TOperationparamsListMap.size() + 1);
        _operationid_InScopeSubQuery_TOperationparamsListMap.put(key, subQuery); return "operationid_InScopeSubQuery_TOperationparamsList." + key;
    }

    protected Map<String, TOperationparamsCQ> _operationid_NotInScopeSubQuery_TOperationparamsListMap;
    public Map<String, TOperationparamsCQ> getOperationid_NotInScopeSubQuery_TOperationparamsList() { return _operationid_NotInScopeSubQuery_TOperationparamsListMap; }
    public String keepOperationid_NotInScopeSubQuery_TOperationparamsList(TOperationparamsCQ subQuery) {
        if (_operationid_NotInScopeSubQuery_TOperationparamsListMap == null) { _operationid_NotInScopeSubQuery_TOperationparamsListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_operationid_NotInScopeSubQuery_TOperationparamsListMap.size() + 1);
        _operationid_NotInScopeSubQuery_TOperationparamsListMap.put(key, subQuery); return "operationid_NotInScopeSubQuery_TOperationparamsList." + key;
    }

    protected Map<String, TOperationparamsCQ> _operationid_ExistsSubQuery_TOperationparamsListMap;
    public Map<String, TOperationparamsCQ> getOperationid_ExistsSubQuery_TOperationparamsList() { return _operationid_ExistsSubQuery_TOperationparamsListMap; }
    public String keepOperationid_ExistsSubQuery_TOperationparamsList(TOperationparamsCQ subQuery) {
        if (_operationid_ExistsSubQuery_TOperationparamsListMap == null) { _operationid_ExistsSubQuery_TOperationparamsListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_operationid_ExistsSubQuery_TOperationparamsListMap.size() + 1);
        _operationid_ExistsSubQuery_TOperationparamsListMap.put(key, subQuery); return "operationid_ExistsSubQuery_TOperationparamsList." + key;
    }

    protected Map<String, TOperationparamsCQ> _operationid_NotExistsSubQuery_TOperationparamsListMap;
    public Map<String, TOperationparamsCQ> getOperationid_NotExistsSubQuery_TOperationparamsList() { return _operationid_NotExistsSubQuery_TOperationparamsListMap; }
    public String keepOperationid_NotExistsSubQuery_TOperationparamsList(TOperationparamsCQ subQuery) {
        if (_operationid_NotExistsSubQuery_TOperationparamsListMap == null) { _operationid_NotExistsSubQuery_TOperationparamsListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_operationid_NotExistsSubQuery_TOperationparamsListMap.size() + 1);
        _operationid_NotExistsSubQuery_TOperationparamsListMap.put(key, subQuery); return "operationid_NotExistsSubQuery_TOperationparamsList." + key;
    }

    protected Map<String, TOperationparamsCQ> _operationid_SpecifyDerivedReferrer_TOperationparamsListMap;
    public Map<String, TOperationparamsCQ> getOperationid_SpecifyDerivedReferrer_TOperationparamsList() { return _operationid_SpecifyDerivedReferrer_TOperationparamsListMap; }
    public String keepOperationid_SpecifyDerivedReferrer_TOperationparamsList(TOperationparamsCQ subQuery) {
        if (_operationid_SpecifyDerivedReferrer_TOperationparamsListMap == null) { _operationid_SpecifyDerivedReferrer_TOperationparamsListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_operationid_SpecifyDerivedReferrer_TOperationparamsListMap.size() + 1);
        _operationid_SpecifyDerivedReferrer_TOperationparamsListMap.put(key, subQuery); return "operationid_SpecifyDerivedReferrer_TOperationparamsList." + key;
    }

    protected Map<String, TOperationparamsCQ> _operationid_QueryDerivedReferrer_TOperationparamsListMap;
    public Map<String, TOperationparamsCQ> getOperationid_QueryDerivedReferrer_TOperationparamsList() { return _operationid_QueryDerivedReferrer_TOperationparamsListMap; }
    public String keepOperationid_QueryDerivedReferrer_TOperationparamsList(TOperationparamsCQ subQuery) {
        if (_operationid_QueryDerivedReferrer_TOperationparamsListMap == null) { _operationid_QueryDerivedReferrer_TOperationparamsListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_operationid_QueryDerivedReferrer_TOperationparamsListMap.size() + 1);
        _operationid_QueryDerivedReferrer_TOperationparamsListMap.put(key, subQuery); return "operationid_QueryDerivedReferrer_TOperationparamsList." + key;
    }
    protected Map<String, Object> _operationid_QueryDerivedReferrer_TOperationparamsListParameterMap;
    public Map<String, Object> getOperationid_QueryDerivedReferrer_TOperationparamsListParameter() { return _operationid_QueryDerivedReferrer_TOperationparamsListParameterMap; }
    public String keepOperationid_QueryDerivedReferrer_TOperationparamsListParameter(Object parameterValue) {
        if (_operationid_QueryDerivedReferrer_TOperationparamsListParameterMap == null) { _operationid_QueryDerivedReferrer_TOperationparamsListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_operationid_QueryDerivedReferrer_TOperationparamsListParameterMap.size() + 1);
        _operationid_QueryDerivedReferrer_TOperationparamsListParameterMap.put(key, parameterValue); return "operationid_QueryDerivedReferrer_TOperationparamsListParameter." + key;
    }

    public BsTOperationCQ addOrderBy_Operationid_Asc() { regOBA("OperationID"); return this; }
    public BsTOperationCQ addOrderBy_Operationid_Desc() { regOBD("OperationID"); return this; }

    protected ConditionValue _objectId;
    public ConditionValue getObjectId() {
        if (_objectId == null) { _objectId = new ConditionValue(); }
        return _objectId;
    }
    protected ConditionValue getCValueObjectId() { return getObjectId(); }

    public BsTOperationCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTOperationCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    protected Map<String, TConnectorCQ> _name_InScopeSubQuery_TConnectorBySourceroleListMap;
    public Map<String, TConnectorCQ> getName_InScopeSubQuery_TConnectorBySourceroleList() { return _name_InScopeSubQuery_TConnectorBySourceroleListMap; }
    public String keepName_InScopeSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery) {
        if (_name_InScopeSubQuery_TConnectorBySourceroleListMap == null) { _name_InScopeSubQuery_TConnectorBySourceroleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_name_InScopeSubQuery_TConnectorBySourceroleListMap.size() + 1);
        _name_InScopeSubQuery_TConnectorBySourceroleListMap.put(key, subQuery); return "name_InScopeSubQuery_TConnectorBySourceroleList." + key;
    }

    protected Map<String, TConnectorCQ> _name_InScopeSubQuery_TConnectorByDestroleListMap;
    public Map<String, TConnectorCQ> getName_InScopeSubQuery_TConnectorByDestroleList() { return _name_InScopeSubQuery_TConnectorByDestroleListMap; }
    public String keepName_InScopeSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery) {
        if (_name_InScopeSubQuery_TConnectorByDestroleListMap == null) { _name_InScopeSubQuery_TConnectorByDestroleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_name_InScopeSubQuery_TConnectorByDestroleListMap.size() + 1);
        _name_InScopeSubQuery_TConnectorByDestroleListMap.put(key, subQuery); return "name_InScopeSubQuery_TConnectorByDestroleList." + key;
    }

    protected Map<String, TConnectorCQ> _name_NotInScopeSubQuery_TConnectorBySourceroleListMap;
    public Map<String, TConnectorCQ> getName_NotInScopeSubQuery_TConnectorBySourceroleList() { return _name_NotInScopeSubQuery_TConnectorBySourceroleListMap; }
    public String keepName_NotInScopeSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery) {
        if (_name_NotInScopeSubQuery_TConnectorBySourceroleListMap == null) { _name_NotInScopeSubQuery_TConnectorBySourceroleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_name_NotInScopeSubQuery_TConnectorBySourceroleListMap.size() + 1);
        _name_NotInScopeSubQuery_TConnectorBySourceroleListMap.put(key, subQuery); return "name_NotInScopeSubQuery_TConnectorBySourceroleList." + key;
    }

    protected Map<String, TConnectorCQ> _name_NotInScopeSubQuery_TConnectorByDestroleListMap;
    public Map<String, TConnectorCQ> getName_NotInScopeSubQuery_TConnectorByDestroleList() { return _name_NotInScopeSubQuery_TConnectorByDestroleListMap; }
    public String keepName_NotInScopeSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery) {
        if (_name_NotInScopeSubQuery_TConnectorByDestroleListMap == null) { _name_NotInScopeSubQuery_TConnectorByDestroleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_name_NotInScopeSubQuery_TConnectorByDestroleListMap.size() + 1);
        _name_NotInScopeSubQuery_TConnectorByDestroleListMap.put(key, subQuery); return "name_NotInScopeSubQuery_TConnectorByDestroleList." + key;
    }

    protected Map<String, TConnectorCQ> _name_ExistsSubQuery_TConnectorBySourceroleListMap;
    public Map<String, TConnectorCQ> getName_ExistsSubQuery_TConnectorBySourceroleList() { return _name_ExistsSubQuery_TConnectorBySourceroleListMap; }
    public String keepName_ExistsSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery) {
        if (_name_ExistsSubQuery_TConnectorBySourceroleListMap == null) { _name_ExistsSubQuery_TConnectorBySourceroleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_name_ExistsSubQuery_TConnectorBySourceroleListMap.size() + 1);
        _name_ExistsSubQuery_TConnectorBySourceroleListMap.put(key, subQuery); return "name_ExistsSubQuery_TConnectorBySourceroleList." + key;
    }

    protected Map<String, TConnectorCQ> _name_ExistsSubQuery_TConnectorByDestroleListMap;
    public Map<String, TConnectorCQ> getName_ExistsSubQuery_TConnectorByDestroleList() { return _name_ExistsSubQuery_TConnectorByDestroleListMap; }
    public String keepName_ExistsSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery) {
        if (_name_ExistsSubQuery_TConnectorByDestroleListMap == null) { _name_ExistsSubQuery_TConnectorByDestroleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_name_ExistsSubQuery_TConnectorByDestroleListMap.size() + 1);
        _name_ExistsSubQuery_TConnectorByDestroleListMap.put(key, subQuery); return "name_ExistsSubQuery_TConnectorByDestroleList." + key;
    }

    protected Map<String, TConnectorCQ> _name_NotExistsSubQuery_TConnectorBySourceroleListMap;
    public Map<String, TConnectorCQ> getName_NotExistsSubQuery_TConnectorBySourceroleList() { return _name_NotExistsSubQuery_TConnectorBySourceroleListMap; }
    public String keepName_NotExistsSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery) {
        if (_name_NotExistsSubQuery_TConnectorBySourceroleListMap == null) { _name_NotExistsSubQuery_TConnectorBySourceroleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_name_NotExistsSubQuery_TConnectorBySourceroleListMap.size() + 1);
        _name_NotExistsSubQuery_TConnectorBySourceroleListMap.put(key, subQuery); return "name_NotExistsSubQuery_TConnectorBySourceroleList." + key;
    }

    protected Map<String, TConnectorCQ> _name_NotExistsSubQuery_TConnectorByDestroleListMap;
    public Map<String, TConnectorCQ> getName_NotExistsSubQuery_TConnectorByDestroleList() { return _name_NotExistsSubQuery_TConnectorByDestroleListMap; }
    public String keepName_NotExistsSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery) {
        if (_name_NotExistsSubQuery_TConnectorByDestroleListMap == null) { _name_NotExistsSubQuery_TConnectorByDestroleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_name_NotExistsSubQuery_TConnectorByDestroleListMap.size() + 1);
        _name_NotExistsSubQuery_TConnectorByDestroleListMap.put(key, subQuery); return "name_NotExistsSubQuery_TConnectorByDestroleList." + key;
    }

    protected Map<String, TConnectorCQ> _name_SpecifyDerivedReferrer_TConnectorBySourceroleListMap;
    public Map<String, TConnectorCQ> getName_SpecifyDerivedReferrer_TConnectorBySourceroleList() { return _name_SpecifyDerivedReferrer_TConnectorBySourceroleListMap; }
    public String keepName_SpecifyDerivedReferrer_TConnectorBySourceroleList(TConnectorCQ subQuery) {
        if (_name_SpecifyDerivedReferrer_TConnectorBySourceroleListMap == null) { _name_SpecifyDerivedReferrer_TConnectorBySourceroleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_name_SpecifyDerivedReferrer_TConnectorBySourceroleListMap.size() + 1);
        _name_SpecifyDerivedReferrer_TConnectorBySourceroleListMap.put(key, subQuery); return "name_SpecifyDerivedReferrer_TConnectorBySourceroleList." + key;
    }

    protected Map<String, TConnectorCQ> _name_SpecifyDerivedReferrer_TConnectorByDestroleListMap;
    public Map<String, TConnectorCQ> getName_SpecifyDerivedReferrer_TConnectorByDestroleList() { return _name_SpecifyDerivedReferrer_TConnectorByDestroleListMap; }
    public String keepName_SpecifyDerivedReferrer_TConnectorByDestroleList(TConnectorCQ subQuery) {
        if (_name_SpecifyDerivedReferrer_TConnectorByDestroleListMap == null) { _name_SpecifyDerivedReferrer_TConnectorByDestroleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_name_SpecifyDerivedReferrer_TConnectorByDestroleListMap.size() + 1);
        _name_SpecifyDerivedReferrer_TConnectorByDestroleListMap.put(key, subQuery); return "name_SpecifyDerivedReferrer_TConnectorByDestroleList." + key;
    }

    protected Map<String, TConnectorCQ> _name_QueryDerivedReferrer_TConnectorBySourceroleListMap;
    public Map<String, TConnectorCQ> getName_QueryDerivedReferrer_TConnectorBySourceroleList() { return _name_QueryDerivedReferrer_TConnectorBySourceroleListMap; }
    public String keepName_QueryDerivedReferrer_TConnectorBySourceroleList(TConnectorCQ subQuery) {
        if (_name_QueryDerivedReferrer_TConnectorBySourceroleListMap == null) { _name_QueryDerivedReferrer_TConnectorBySourceroleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_name_QueryDerivedReferrer_TConnectorBySourceroleListMap.size() + 1);
        _name_QueryDerivedReferrer_TConnectorBySourceroleListMap.put(key, subQuery); return "name_QueryDerivedReferrer_TConnectorBySourceroleList." + key;
    }
    protected Map<String, Object> _name_QueryDerivedReferrer_TConnectorBySourceroleListParameterMap;
    public Map<String, Object> getName_QueryDerivedReferrer_TConnectorBySourceroleListParameter() { return _name_QueryDerivedReferrer_TConnectorBySourceroleListParameterMap; }
    public String keepName_QueryDerivedReferrer_TConnectorBySourceroleListParameter(Object parameterValue) {
        if (_name_QueryDerivedReferrer_TConnectorBySourceroleListParameterMap == null) { _name_QueryDerivedReferrer_TConnectorBySourceroleListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_name_QueryDerivedReferrer_TConnectorBySourceroleListParameterMap.size() + 1);
        _name_QueryDerivedReferrer_TConnectorBySourceroleListParameterMap.put(key, parameterValue); return "name_QueryDerivedReferrer_TConnectorBySourceroleListParameter." + key;
    }

    protected Map<String, TConnectorCQ> _name_QueryDerivedReferrer_TConnectorByDestroleListMap;
    public Map<String, TConnectorCQ> getName_QueryDerivedReferrer_TConnectorByDestroleList() { return _name_QueryDerivedReferrer_TConnectorByDestroleListMap; }
    public String keepName_QueryDerivedReferrer_TConnectorByDestroleList(TConnectorCQ subQuery) {
        if (_name_QueryDerivedReferrer_TConnectorByDestroleListMap == null) { _name_QueryDerivedReferrer_TConnectorByDestroleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_name_QueryDerivedReferrer_TConnectorByDestroleListMap.size() + 1);
        _name_QueryDerivedReferrer_TConnectorByDestroleListMap.put(key, subQuery); return "name_QueryDerivedReferrer_TConnectorByDestroleList." + key;
    }
    protected Map<String, Object> _name_QueryDerivedReferrer_TConnectorByDestroleListParameterMap;
    public Map<String, Object> getName_QueryDerivedReferrer_TConnectorByDestroleListParameter() { return _name_QueryDerivedReferrer_TConnectorByDestroleListParameterMap; }
    public String keepName_QueryDerivedReferrer_TConnectorByDestroleListParameter(Object parameterValue) {
        if (_name_QueryDerivedReferrer_TConnectorByDestroleListParameterMap == null) { _name_QueryDerivedReferrer_TConnectorByDestroleListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_name_QueryDerivedReferrer_TConnectorByDestroleListParameterMap.size() + 1);
        _name_QueryDerivedReferrer_TConnectorByDestroleListParameterMap.put(key, parameterValue); return "name_QueryDerivedReferrer_TConnectorByDestroleListParameter." + key;
    }

    public BsTOperationCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTOperationCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _scope;
    public ConditionValue getScope() {
        if (_scope == null) { _scope = new ConditionValue(); }
        return _scope;
    }
    protected ConditionValue getCValueScope() { return getScope(); }

    public BsTOperationCQ addOrderBy_Scope_Asc() { regOBA("Scope"); return this; }
    public BsTOperationCQ addOrderBy_Scope_Desc() { regOBD("Scope"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }

    public BsTOperationCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTOperationCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _returnarray;
    public ConditionValue getReturnarray() {
        if (_returnarray == null) { _returnarray = new ConditionValue(); }
        return _returnarray;
    }
    protected ConditionValue getCValueReturnarray() { return getReturnarray(); }

    public BsTOperationCQ addOrderBy_Returnarray_Asc() { regOBA("ReturnArray"); return this; }
    public BsTOperationCQ addOrderBy_Returnarray_Desc() { regOBD("ReturnArray"); return this; }

    protected ConditionValue _stereotype;
    public ConditionValue getStereotype() {
        if (_stereotype == null) { _stereotype = new ConditionValue(); }
        return _stereotype;
    }
    protected ConditionValue getCValueStereotype() { return getStereotype(); }

    public BsTOperationCQ addOrderBy_Stereotype_Asc() { regOBA("Stereotype"); return this; }
    public BsTOperationCQ addOrderBy_Stereotype_Desc() { regOBD("Stereotype"); return this; }

    protected ConditionValue _isstatic;
    public ConditionValue getIsstatic() {
        if (_isstatic == null) { _isstatic = new ConditionValue(); }
        return _isstatic;
    }
    protected ConditionValue getCValueIsstatic() { return getIsstatic(); }

    public BsTOperationCQ addOrderBy_Isstatic_Asc() { regOBA("IsStatic"); return this; }
    public BsTOperationCQ addOrderBy_Isstatic_Desc() { regOBD("IsStatic"); return this; }

    protected ConditionValue _concurrency;
    public ConditionValue getConcurrency() {
        if (_concurrency == null) { _concurrency = new ConditionValue(); }
        return _concurrency;
    }
    protected ConditionValue getCValueConcurrency() { return getConcurrency(); }

    public BsTOperationCQ addOrderBy_Concurrency_Asc() { regOBA("Concurrency"); return this; }
    public BsTOperationCQ addOrderBy_Concurrency_Desc() { regOBD("Concurrency"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTOperationCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTOperationCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _behaviour;
    public ConditionValue getBehaviour() {
        if (_behaviour == null) { _behaviour = new ConditionValue(); }
        return _behaviour;
    }
    protected ConditionValue getCValueBehaviour() { return getBehaviour(); }

    public BsTOperationCQ addOrderBy_Behaviour_Asc() { regOBA("Behaviour"); return this; }
    public BsTOperationCQ addOrderBy_Behaviour_Desc() { regOBD("Behaviour"); return this; }

    protected ConditionValue _genoption;
    public ConditionValue getGenoption() {
        if (_genoption == null) { _genoption = new ConditionValue(); }
        return _genoption;
    }
    protected ConditionValue getCValueGenoption() { return getGenoption(); }

    public BsTOperationCQ addOrderBy_Genoption_Asc() { regOBA("GenOption"); return this; }
    public BsTOperationCQ addOrderBy_Genoption_Desc() { regOBD("GenOption"); return this; }

    protected ConditionValue _pos;
    public ConditionValue getPos() {
        if (_pos == null) { _pos = new ConditionValue(); }
        return _pos;
    }
    protected ConditionValue getCValuePos() { return getPos(); }

    public BsTOperationCQ addOrderBy_Pos_Asc() { regOBA("Pos"); return this; }
    public BsTOperationCQ addOrderBy_Pos_Desc() { regOBD("Pos"); return this; }

    protected ConditionValue _style;
    public ConditionValue getStyle() {
        if (_style == null) { _style = new ConditionValue(); }
        return _style;
    }
    protected ConditionValue getCValueStyle() { return getStyle(); }

    public BsTOperationCQ addOrderBy_Style_Asc() { regOBA("Style"); return this; }
    public BsTOperationCQ addOrderBy_Style_Desc() { regOBD("Style"); return this; }

    protected ConditionValue _pure;
    public ConditionValue getPure() {
        if (_pure == null) { _pure = new ConditionValue(); }
        return _pure;
    }
    protected ConditionValue getCValuePure() { return getPure(); }

    public BsTOperationCQ addOrderBy_Pure_Asc() { regOBA("Pure"); return this; }
    public BsTOperationCQ addOrderBy_Pure_Desc() { regOBD("Pure"); return this; }

    protected ConditionValue _classifier;
    public ConditionValue getClassifier() {
        if (_classifier == null) { _classifier = new ConditionValue(); }
        return _classifier;
    }
    protected ConditionValue getCValueClassifier() { return getClassifier(); }

    public BsTOperationCQ addOrderBy_Classifier_Asc() { regOBA("Classifier"); return this; }
    public BsTOperationCQ addOrderBy_Classifier_Desc() { regOBD("Classifier"); return this; }

    protected ConditionValue _code;
    public ConditionValue getCode() {
        if (_code == null) { _code = new ConditionValue(); }
        return _code;
    }
    protected ConditionValue getCValueCode() { return getCode(); }

    public BsTOperationCQ addOrderBy_Code_Asc() { regOBA("Code"); return this; }
    public BsTOperationCQ addOrderBy_Code_Desc() { regOBD("Code"); return this; }

    protected ConditionValue _isroot;
    public ConditionValue getIsroot() {
        if (_isroot == null) { _isroot = new ConditionValue(); }
        return _isroot;
    }
    protected ConditionValue getCValueIsroot() { return getIsroot(); }

    public BsTOperationCQ addOrderBy_Isroot_Asc() { regOBA("IsRoot"); return this; }
    public BsTOperationCQ addOrderBy_Isroot_Desc() { regOBD("IsRoot"); return this; }

    protected ConditionValue _isleaf;
    public ConditionValue getIsleaf() {
        if (_isleaf == null) { _isleaf = new ConditionValue(); }
        return _isleaf;
    }
    protected ConditionValue getCValueIsleaf() { return getIsleaf(); }

    public BsTOperationCQ addOrderBy_Isleaf_Asc() { regOBA("IsLeaf"); return this; }
    public BsTOperationCQ addOrderBy_Isleaf_Desc() { regOBD("IsLeaf"); return this; }

    protected ConditionValue _isquery;
    public ConditionValue getIsquery() {
        if (_isquery == null) { _isquery = new ConditionValue(); }
        return _isquery;
    }
    protected ConditionValue getCValueIsquery() { return getIsquery(); }

    public BsTOperationCQ addOrderBy_Isquery_Asc() { regOBA("IsQuery"); return this; }
    public BsTOperationCQ addOrderBy_Isquery_Desc() { regOBD("IsQuery"); return this; }

    protected ConditionValue _stateflags;
    public ConditionValue getStateflags() {
        if (_stateflags == null) { _stateflags = new ConditionValue(); }
        return _stateflags;
    }
    protected ConditionValue getCValueStateflags() { return getStateflags(); }

    public BsTOperationCQ addOrderBy_Stateflags_Asc() { regOBA("StateFlags"); return this; }
    public BsTOperationCQ addOrderBy_Stateflags_Desc() { regOBD("StateFlags"); return this; }

    protected ConditionValue _eaGuid;
    public ConditionValue getEaGuid() {
        if (_eaGuid == null) { _eaGuid = new ConditionValue(); }
        return _eaGuid;
    }
    protected ConditionValue getCValueEaGuid() { return getEaGuid(); }

    public BsTOperationCQ addOrderBy_EaGuid_Asc() { regOBA("ea_guid"); return this; }
    public BsTOperationCQ addOrderBy_EaGuid_Desc() { regOBD("ea_guid"); return this; }

    protected ConditionValue _styleex;
    public ConditionValue getStyleex() {
        if (_styleex == null) { _styleex = new ConditionValue(); }
        return _styleex;
    }
    protected ConditionValue getCValueStyleex() { return getStyleex(); }

    public BsTOperationCQ addOrderBy_Styleex_Asc() { regOBA("StyleEx"); return this; }
    public BsTOperationCQ addOrderBy_Styleex_Desc() { regOBD("StyleEx"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTOperationCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTOperationCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        TOperationCQ baseQuery = (TOperationCQ)baseQueryAsSuper;
        TOperationCQ unionQuery = (TOperationCQ)unionQueryAsSuper;
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
            _conditionQueryTObject = xcreateQueryTObject();
            xsetupOuterJoinTObject();
        }
        return _conditionQueryTObject;
    }
    protected TObjectCQ xcreateQueryTObject() {
        String nrp = resolveNextRelationPath("t_operation", "tObject");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        TObjectCQ cq = new TObjectCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("tObject"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinTObject() {
        TObjectCQ cq = getConditionQueryTObject();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("Object_ID"), cq.getRealColumnName("Object_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryTObject() {
        return _conditionQueryTObject != null;
    }

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    protected Map<String, TOperationCQ> _scalarSubQueryMap;
    public Map<String, TOperationCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(TOperationCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // ===================================================================================
    //                                                             MySelf InScope SubQuery
    //                                                             =======================
    protected Map<String, TOperationCQ> _myselfInScopeSubQueryMap;
    public Map<String, TOperationCQ> getMyselfInScopeSubQuery() { return _myselfInScopeSubQueryMap; }
    public String keepMyselfInScopeSubQuery(TOperationCQ subQuery) {
        if (_myselfInScopeSubQueryMap == null) { _myselfInScopeSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeSubQueryMap.size() + 1);
        _myselfInScopeSubQueryMap.put(key, subQuery); return "myselfInScopeSubQuery." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TOperationCB.class.getName(); }
    String xCQ() { return TOperationCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
