package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_object.
 * @author DBFlute(AutoGenerator)
 */
public class BsTObjectCQ extends AbstractBsTObjectCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_object) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjectCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjectCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_object on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjectCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TObjectCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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

    protected Map<String, TObjectpropertiesCQ> _objectId_InScopeSubQuery_TObjectpropertiesListMap;
    public Map<String, TObjectpropertiesCQ> getObjectId_InScopeSubQuery_TObjectpropertiesList() { return _objectId_InScopeSubQuery_TObjectpropertiesListMap; }
    public String keepObjectId_InScopeSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery) {
        if (_objectId_InScopeSubQuery_TObjectpropertiesListMap == null) { _objectId_InScopeSubQuery_TObjectpropertiesListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_InScopeSubQuery_TObjectpropertiesListMap.size() + 1);
        _objectId_InScopeSubQuery_TObjectpropertiesListMap.put(key, subQuery); return "objectId_InScopeSubQuery_TObjectpropertiesList." + key;
    }

    protected Map<String, TAttributeCQ> _objectId_InScopeSubQuery_TAttributeListMap;
    public Map<String, TAttributeCQ> getObjectId_InScopeSubQuery_TAttributeList() { return _objectId_InScopeSubQuery_TAttributeListMap; }
    public String keepObjectId_InScopeSubQuery_TAttributeList(TAttributeCQ subQuery) {
        if (_objectId_InScopeSubQuery_TAttributeListMap == null) { _objectId_InScopeSubQuery_TAttributeListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_InScopeSubQuery_TAttributeListMap.size() + 1);
        _objectId_InScopeSubQuery_TAttributeListMap.put(key, subQuery); return "objectId_InScopeSubQuery_TAttributeList." + key;
    }

    protected Map<String, TOperationCQ> _objectId_InScopeSubQuery_TOperationListMap;
    public Map<String, TOperationCQ> getObjectId_InScopeSubQuery_TOperationList() { return _objectId_InScopeSubQuery_TOperationListMap; }
    public String keepObjectId_InScopeSubQuery_TOperationList(TOperationCQ subQuery) {
        if (_objectId_InScopeSubQuery_TOperationListMap == null) { _objectId_InScopeSubQuery_TOperationListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_InScopeSubQuery_TOperationListMap.size() + 1);
        _objectId_InScopeSubQuery_TOperationListMap.put(key, subQuery); return "objectId_InScopeSubQuery_TOperationList." + key;
    }

    protected Map<String, TConnectorCQ> _objectId_InScopeSubQuery_TConnectorByStartObjectIdListMap;
    public Map<String, TConnectorCQ> getObjectId_InScopeSubQuery_TConnectorByStartObjectIdList() { return _objectId_InScopeSubQuery_TConnectorByStartObjectIdListMap; }
    public String keepObjectId_InScopeSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery) {
        if (_objectId_InScopeSubQuery_TConnectorByStartObjectIdListMap == null) { _objectId_InScopeSubQuery_TConnectorByStartObjectIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_InScopeSubQuery_TConnectorByStartObjectIdListMap.size() + 1);
        _objectId_InScopeSubQuery_TConnectorByStartObjectIdListMap.put(key, subQuery); return "objectId_InScopeSubQuery_TConnectorByStartObjectIdList." + key;
    }

    protected Map<String, TConnectorCQ> _objectId_InScopeSubQuery_TConnectorByEndObjectIdListMap;
    public Map<String, TConnectorCQ> getObjectId_InScopeSubQuery_TConnectorByEndObjectIdList() { return _objectId_InScopeSubQuery_TConnectorByEndObjectIdListMap; }
    public String keepObjectId_InScopeSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery) {
        if (_objectId_InScopeSubQuery_TConnectorByEndObjectIdListMap == null) { _objectId_InScopeSubQuery_TConnectorByEndObjectIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_InScopeSubQuery_TConnectorByEndObjectIdListMap.size() + 1);
        _objectId_InScopeSubQuery_TConnectorByEndObjectIdListMap.put(key, subQuery); return "objectId_InScopeSubQuery_TConnectorByEndObjectIdList." + key;
    }

    protected Map<String, TObjectpropertiesCQ> _objectId_NotInScopeSubQuery_TObjectpropertiesListMap;
    public Map<String, TObjectpropertiesCQ> getObjectId_NotInScopeSubQuery_TObjectpropertiesList() { return _objectId_NotInScopeSubQuery_TObjectpropertiesListMap; }
    public String keepObjectId_NotInScopeSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery) {
        if (_objectId_NotInScopeSubQuery_TObjectpropertiesListMap == null) { _objectId_NotInScopeSubQuery_TObjectpropertiesListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_NotInScopeSubQuery_TObjectpropertiesListMap.size() + 1);
        _objectId_NotInScopeSubQuery_TObjectpropertiesListMap.put(key, subQuery); return "objectId_NotInScopeSubQuery_TObjectpropertiesList." + key;
    }

    protected Map<String, TAttributeCQ> _objectId_NotInScopeSubQuery_TAttributeListMap;
    public Map<String, TAttributeCQ> getObjectId_NotInScopeSubQuery_TAttributeList() { return _objectId_NotInScopeSubQuery_TAttributeListMap; }
    public String keepObjectId_NotInScopeSubQuery_TAttributeList(TAttributeCQ subQuery) {
        if (_objectId_NotInScopeSubQuery_TAttributeListMap == null) { _objectId_NotInScopeSubQuery_TAttributeListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_NotInScopeSubQuery_TAttributeListMap.size() + 1);
        _objectId_NotInScopeSubQuery_TAttributeListMap.put(key, subQuery); return "objectId_NotInScopeSubQuery_TAttributeList." + key;
    }

    protected Map<String, TOperationCQ> _objectId_NotInScopeSubQuery_TOperationListMap;
    public Map<String, TOperationCQ> getObjectId_NotInScopeSubQuery_TOperationList() { return _objectId_NotInScopeSubQuery_TOperationListMap; }
    public String keepObjectId_NotInScopeSubQuery_TOperationList(TOperationCQ subQuery) {
        if (_objectId_NotInScopeSubQuery_TOperationListMap == null) { _objectId_NotInScopeSubQuery_TOperationListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_NotInScopeSubQuery_TOperationListMap.size() + 1);
        _objectId_NotInScopeSubQuery_TOperationListMap.put(key, subQuery); return "objectId_NotInScopeSubQuery_TOperationList." + key;
    }

    protected Map<String, TConnectorCQ> _objectId_NotInScopeSubQuery_TConnectorByStartObjectIdListMap;
    public Map<String, TConnectorCQ> getObjectId_NotInScopeSubQuery_TConnectorByStartObjectIdList() { return _objectId_NotInScopeSubQuery_TConnectorByStartObjectIdListMap; }
    public String keepObjectId_NotInScopeSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery) {
        if (_objectId_NotInScopeSubQuery_TConnectorByStartObjectIdListMap == null) { _objectId_NotInScopeSubQuery_TConnectorByStartObjectIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_NotInScopeSubQuery_TConnectorByStartObjectIdListMap.size() + 1);
        _objectId_NotInScopeSubQuery_TConnectorByStartObjectIdListMap.put(key, subQuery); return "objectId_NotInScopeSubQuery_TConnectorByStartObjectIdList." + key;
    }

    protected Map<String, TConnectorCQ> _objectId_NotInScopeSubQuery_TConnectorByEndObjectIdListMap;
    public Map<String, TConnectorCQ> getObjectId_NotInScopeSubQuery_TConnectorByEndObjectIdList() { return _objectId_NotInScopeSubQuery_TConnectorByEndObjectIdListMap; }
    public String keepObjectId_NotInScopeSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery) {
        if (_objectId_NotInScopeSubQuery_TConnectorByEndObjectIdListMap == null) { _objectId_NotInScopeSubQuery_TConnectorByEndObjectIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_NotInScopeSubQuery_TConnectorByEndObjectIdListMap.size() + 1);
        _objectId_NotInScopeSubQuery_TConnectorByEndObjectIdListMap.put(key, subQuery); return "objectId_NotInScopeSubQuery_TConnectorByEndObjectIdList." + key;
    }

    protected Map<String, TObjectpropertiesCQ> _objectId_ExistsSubQuery_TObjectpropertiesListMap;
    public Map<String, TObjectpropertiesCQ> getObjectId_ExistsSubQuery_TObjectpropertiesList() { return _objectId_ExistsSubQuery_TObjectpropertiesListMap; }
    public String keepObjectId_ExistsSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery) {
        if (_objectId_ExistsSubQuery_TObjectpropertiesListMap == null) { _objectId_ExistsSubQuery_TObjectpropertiesListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_ExistsSubQuery_TObjectpropertiesListMap.size() + 1);
        _objectId_ExistsSubQuery_TObjectpropertiesListMap.put(key, subQuery); return "objectId_ExistsSubQuery_TObjectpropertiesList." + key;
    }

    protected Map<String, TAttributeCQ> _objectId_ExistsSubQuery_TAttributeListMap;
    public Map<String, TAttributeCQ> getObjectId_ExistsSubQuery_TAttributeList() { return _objectId_ExistsSubQuery_TAttributeListMap; }
    public String keepObjectId_ExistsSubQuery_TAttributeList(TAttributeCQ subQuery) {
        if (_objectId_ExistsSubQuery_TAttributeListMap == null) { _objectId_ExistsSubQuery_TAttributeListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_ExistsSubQuery_TAttributeListMap.size() + 1);
        _objectId_ExistsSubQuery_TAttributeListMap.put(key, subQuery); return "objectId_ExistsSubQuery_TAttributeList." + key;
    }

    protected Map<String, TOperationCQ> _objectId_ExistsSubQuery_TOperationListMap;
    public Map<String, TOperationCQ> getObjectId_ExistsSubQuery_TOperationList() { return _objectId_ExistsSubQuery_TOperationListMap; }
    public String keepObjectId_ExistsSubQuery_TOperationList(TOperationCQ subQuery) {
        if (_objectId_ExistsSubQuery_TOperationListMap == null) { _objectId_ExistsSubQuery_TOperationListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_ExistsSubQuery_TOperationListMap.size() + 1);
        _objectId_ExistsSubQuery_TOperationListMap.put(key, subQuery); return "objectId_ExistsSubQuery_TOperationList." + key;
    }

    protected Map<String, TConnectorCQ> _objectId_ExistsSubQuery_TConnectorByStartObjectIdListMap;
    public Map<String, TConnectorCQ> getObjectId_ExistsSubQuery_TConnectorByStartObjectIdList() { return _objectId_ExistsSubQuery_TConnectorByStartObjectIdListMap; }
    public String keepObjectId_ExistsSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery) {
        if (_objectId_ExistsSubQuery_TConnectorByStartObjectIdListMap == null) { _objectId_ExistsSubQuery_TConnectorByStartObjectIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_ExistsSubQuery_TConnectorByStartObjectIdListMap.size() + 1);
        _objectId_ExistsSubQuery_TConnectorByStartObjectIdListMap.put(key, subQuery); return "objectId_ExistsSubQuery_TConnectorByStartObjectIdList." + key;
    }

    protected Map<String, TConnectorCQ> _objectId_ExistsSubQuery_TConnectorByEndObjectIdListMap;
    public Map<String, TConnectorCQ> getObjectId_ExistsSubQuery_TConnectorByEndObjectIdList() { return _objectId_ExistsSubQuery_TConnectorByEndObjectIdListMap; }
    public String keepObjectId_ExistsSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery) {
        if (_objectId_ExistsSubQuery_TConnectorByEndObjectIdListMap == null) { _objectId_ExistsSubQuery_TConnectorByEndObjectIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_ExistsSubQuery_TConnectorByEndObjectIdListMap.size() + 1);
        _objectId_ExistsSubQuery_TConnectorByEndObjectIdListMap.put(key, subQuery); return "objectId_ExistsSubQuery_TConnectorByEndObjectIdList." + key;
    }

    protected Map<String, TObjectpropertiesCQ> _objectId_NotExistsSubQuery_TObjectpropertiesListMap;
    public Map<String, TObjectpropertiesCQ> getObjectId_NotExistsSubQuery_TObjectpropertiesList() { return _objectId_NotExistsSubQuery_TObjectpropertiesListMap; }
    public String keepObjectId_NotExistsSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery) {
        if (_objectId_NotExistsSubQuery_TObjectpropertiesListMap == null) { _objectId_NotExistsSubQuery_TObjectpropertiesListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_NotExistsSubQuery_TObjectpropertiesListMap.size() + 1);
        _objectId_NotExistsSubQuery_TObjectpropertiesListMap.put(key, subQuery); return "objectId_NotExistsSubQuery_TObjectpropertiesList." + key;
    }

    protected Map<String, TAttributeCQ> _objectId_NotExistsSubQuery_TAttributeListMap;
    public Map<String, TAttributeCQ> getObjectId_NotExistsSubQuery_TAttributeList() { return _objectId_NotExistsSubQuery_TAttributeListMap; }
    public String keepObjectId_NotExistsSubQuery_TAttributeList(TAttributeCQ subQuery) {
        if (_objectId_NotExistsSubQuery_TAttributeListMap == null) { _objectId_NotExistsSubQuery_TAttributeListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_NotExistsSubQuery_TAttributeListMap.size() + 1);
        _objectId_NotExistsSubQuery_TAttributeListMap.put(key, subQuery); return "objectId_NotExistsSubQuery_TAttributeList." + key;
    }

    protected Map<String, TOperationCQ> _objectId_NotExistsSubQuery_TOperationListMap;
    public Map<String, TOperationCQ> getObjectId_NotExistsSubQuery_TOperationList() { return _objectId_NotExistsSubQuery_TOperationListMap; }
    public String keepObjectId_NotExistsSubQuery_TOperationList(TOperationCQ subQuery) {
        if (_objectId_NotExistsSubQuery_TOperationListMap == null) { _objectId_NotExistsSubQuery_TOperationListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_NotExistsSubQuery_TOperationListMap.size() + 1);
        _objectId_NotExistsSubQuery_TOperationListMap.put(key, subQuery); return "objectId_NotExistsSubQuery_TOperationList." + key;
    }

    protected Map<String, TConnectorCQ> _objectId_NotExistsSubQuery_TConnectorByStartObjectIdListMap;
    public Map<String, TConnectorCQ> getObjectId_NotExistsSubQuery_TConnectorByStartObjectIdList() { return _objectId_NotExistsSubQuery_TConnectorByStartObjectIdListMap; }
    public String keepObjectId_NotExistsSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery) {
        if (_objectId_NotExistsSubQuery_TConnectorByStartObjectIdListMap == null) { _objectId_NotExistsSubQuery_TConnectorByStartObjectIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_NotExistsSubQuery_TConnectorByStartObjectIdListMap.size() + 1);
        _objectId_NotExistsSubQuery_TConnectorByStartObjectIdListMap.put(key, subQuery); return "objectId_NotExistsSubQuery_TConnectorByStartObjectIdList." + key;
    }

    protected Map<String, TConnectorCQ> _objectId_NotExistsSubQuery_TConnectorByEndObjectIdListMap;
    public Map<String, TConnectorCQ> getObjectId_NotExistsSubQuery_TConnectorByEndObjectIdList() { return _objectId_NotExistsSubQuery_TConnectorByEndObjectIdListMap; }
    public String keepObjectId_NotExistsSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery) {
        if (_objectId_NotExistsSubQuery_TConnectorByEndObjectIdListMap == null) { _objectId_NotExistsSubQuery_TConnectorByEndObjectIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_NotExistsSubQuery_TConnectorByEndObjectIdListMap.size() + 1);
        _objectId_NotExistsSubQuery_TConnectorByEndObjectIdListMap.put(key, subQuery); return "objectId_NotExistsSubQuery_TConnectorByEndObjectIdList." + key;
    }

    protected Map<String, TObjectpropertiesCQ> _objectId_SpecifyDerivedReferrer_TObjectpropertiesListMap;
    public Map<String, TObjectpropertiesCQ> getObjectId_SpecifyDerivedReferrer_TObjectpropertiesList() { return _objectId_SpecifyDerivedReferrer_TObjectpropertiesListMap; }
    public String keepObjectId_SpecifyDerivedReferrer_TObjectpropertiesList(TObjectpropertiesCQ subQuery) {
        if (_objectId_SpecifyDerivedReferrer_TObjectpropertiesListMap == null) { _objectId_SpecifyDerivedReferrer_TObjectpropertiesListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_SpecifyDerivedReferrer_TObjectpropertiesListMap.size() + 1);
        _objectId_SpecifyDerivedReferrer_TObjectpropertiesListMap.put(key, subQuery); return "objectId_SpecifyDerivedReferrer_TObjectpropertiesList." + key;
    }

    protected Map<String, TAttributeCQ> _objectId_SpecifyDerivedReferrer_TAttributeListMap;
    public Map<String, TAttributeCQ> getObjectId_SpecifyDerivedReferrer_TAttributeList() { return _objectId_SpecifyDerivedReferrer_TAttributeListMap; }
    public String keepObjectId_SpecifyDerivedReferrer_TAttributeList(TAttributeCQ subQuery) {
        if (_objectId_SpecifyDerivedReferrer_TAttributeListMap == null) { _objectId_SpecifyDerivedReferrer_TAttributeListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_SpecifyDerivedReferrer_TAttributeListMap.size() + 1);
        _objectId_SpecifyDerivedReferrer_TAttributeListMap.put(key, subQuery); return "objectId_SpecifyDerivedReferrer_TAttributeList." + key;
    }

    protected Map<String, TOperationCQ> _objectId_SpecifyDerivedReferrer_TOperationListMap;
    public Map<String, TOperationCQ> getObjectId_SpecifyDerivedReferrer_TOperationList() { return _objectId_SpecifyDerivedReferrer_TOperationListMap; }
    public String keepObjectId_SpecifyDerivedReferrer_TOperationList(TOperationCQ subQuery) {
        if (_objectId_SpecifyDerivedReferrer_TOperationListMap == null) { _objectId_SpecifyDerivedReferrer_TOperationListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_SpecifyDerivedReferrer_TOperationListMap.size() + 1);
        _objectId_SpecifyDerivedReferrer_TOperationListMap.put(key, subQuery); return "objectId_SpecifyDerivedReferrer_TOperationList." + key;
    }

    protected Map<String, TConnectorCQ> _objectId_SpecifyDerivedReferrer_TConnectorByStartObjectIdListMap;
    public Map<String, TConnectorCQ> getObjectId_SpecifyDerivedReferrer_TConnectorByStartObjectIdList() { return _objectId_SpecifyDerivedReferrer_TConnectorByStartObjectIdListMap; }
    public String keepObjectId_SpecifyDerivedReferrer_TConnectorByStartObjectIdList(TConnectorCQ subQuery) {
        if (_objectId_SpecifyDerivedReferrer_TConnectorByStartObjectIdListMap == null) { _objectId_SpecifyDerivedReferrer_TConnectorByStartObjectIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_SpecifyDerivedReferrer_TConnectorByStartObjectIdListMap.size() + 1);
        _objectId_SpecifyDerivedReferrer_TConnectorByStartObjectIdListMap.put(key, subQuery); return "objectId_SpecifyDerivedReferrer_TConnectorByStartObjectIdList." + key;
    }

    protected Map<String, TConnectorCQ> _objectId_SpecifyDerivedReferrer_TConnectorByEndObjectIdListMap;
    public Map<String, TConnectorCQ> getObjectId_SpecifyDerivedReferrer_TConnectorByEndObjectIdList() { return _objectId_SpecifyDerivedReferrer_TConnectorByEndObjectIdListMap; }
    public String keepObjectId_SpecifyDerivedReferrer_TConnectorByEndObjectIdList(TConnectorCQ subQuery) {
        if (_objectId_SpecifyDerivedReferrer_TConnectorByEndObjectIdListMap == null) { _objectId_SpecifyDerivedReferrer_TConnectorByEndObjectIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_SpecifyDerivedReferrer_TConnectorByEndObjectIdListMap.size() + 1);
        _objectId_SpecifyDerivedReferrer_TConnectorByEndObjectIdListMap.put(key, subQuery); return "objectId_SpecifyDerivedReferrer_TConnectorByEndObjectIdList." + key;
    }

    protected Map<String, TObjectpropertiesCQ> _objectId_QueryDerivedReferrer_TObjectpropertiesListMap;
    public Map<String, TObjectpropertiesCQ> getObjectId_QueryDerivedReferrer_TObjectpropertiesList() { return _objectId_QueryDerivedReferrer_TObjectpropertiesListMap; }
    public String keepObjectId_QueryDerivedReferrer_TObjectpropertiesList(TObjectpropertiesCQ subQuery) {
        if (_objectId_QueryDerivedReferrer_TObjectpropertiesListMap == null) { _objectId_QueryDerivedReferrer_TObjectpropertiesListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_QueryDerivedReferrer_TObjectpropertiesListMap.size() + 1);
        _objectId_QueryDerivedReferrer_TObjectpropertiesListMap.put(key, subQuery); return "objectId_QueryDerivedReferrer_TObjectpropertiesList." + key;
    }
    protected Map<String, Object> _objectId_QueryDerivedReferrer_TObjectpropertiesListParameterMap;
    public Map<String, Object> getObjectId_QueryDerivedReferrer_TObjectpropertiesListParameter() { return _objectId_QueryDerivedReferrer_TObjectpropertiesListParameterMap; }
    public String keepObjectId_QueryDerivedReferrer_TObjectpropertiesListParameter(Object parameterValue) {
        if (_objectId_QueryDerivedReferrer_TObjectpropertiesListParameterMap == null) { _objectId_QueryDerivedReferrer_TObjectpropertiesListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_objectId_QueryDerivedReferrer_TObjectpropertiesListParameterMap.size() + 1);
        _objectId_QueryDerivedReferrer_TObjectpropertiesListParameterMap.put(key, parameterValue); return "objectId_QueryDerivedReferrer_TObjectpropertiesListParameter." + key;
    }

    protected Map<String, TAttributeCQ> _objectId_QueryDerivedReferrer_TAttributeListMap;
    public Map<String, TAttributeCQ> getObjectId_QueryDerivedReferrer_TAttributeList() { return _objectId_QueryDerivedReferrer_TAttributeListMap; }
    public String keepObjectId_QueryDerivedReferrer_TAttributeList(TAttributeCQ subQuery) {
        if (_objectId_QueryDerivedReferrer_TAttributeListMap == null) { _objectId_QueryDerivedReferrer_TAttributeListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_QueryDerivedReferrer_TAttributeListMap.size() + 1);
        _objectId_QueryDerivedReferrer_TAttributeListMap.put(key, subQuery); return "objectId_QueryDerivedReferrer_TAttributeList." + key;
    }
    protected Map<String, Object> _objectId_QueryDerivedReferrer_TAttributeListParameterMap;
    public Map<String, Object> getObjectId_QueryDerivedReferrer_TAttributeListParameter() { return _objectId_QueryDerivedReferrer_TAttributeListParameterMap; }
    public String keepObjectId_QueryDerivedReferrer_TAttributeListParameter(Object parameterValue) {
        if (_objectId_QueryDerivedReferrer_TAttributeListParameterMap == null) { _objectId_QueryDerivedReferrer_TAttributeListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_objectId_QueryDerivedReferrer_TAttributeListParameterMap.size() + 1);
        _objectId_QueryDerivedReferrer_TAttributeListParameterMap.put(key, parameterValue); return "objectId_QueryDerivedReferrer_TAttributeListParameter." + key;
    }

    protected Map<String, TOperationCQ> _objectId_QueryDerivedReferrer_TOperationListMap;
    public Map<String, TOperationCQ> getObjectId_QueryDerivedReferrer_TOperationList() { return _objectId_QueryDerivedReferrer_TOperationListMap; }
    public String keepObjectId_QueryDerivedReferrer_TOperationList(TOperationCQ subQuery) {
        if (_objectId_QueryDerivedReferrer_TOperationListMap == null) { _objectId_QueryDerivedReferrer_TOperationListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_QueryDerivedReferrer_TOperationListMap.size() + 1);
        _objectId_QueryDerivedReferrer_TOperationListMap.put(key, subQuery); return "objectId_QueryDerivedReferrer_TOperationList." + key;
    }
    protected Map<String, Object> _objectId_QueryDerivedReferrer_TOperationListParameterMap;
    public Map<String, Object> getObjectId_QueryDerivedReferrer_TOperationListParameter() { return _objectId_QueryDerivedReferrer_TOperationListParameterMap; }
    public String keepObjectId_QueryDerivedReferrer_TOperationListParameter(Object parameterValue) {
        if (_objectId_QueryDerivedReferrer_TOperationListParameterMap == null) { _objectId_QueryDerivedReferrer_TOperationListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_objectId_QueryDerivedReferrer_TOperationListParameterMap.size() + 1);
        _objectId_QueryDerivedReferrer_TOperationListParameterMap.put(key, parameterValue); return "objectId_QueryDerivedReferrer_TOperationListParameter." + key;
    }

    protected Map<String, TConnectorCQ> _objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListMap;
    public Map<String, TConnectorCQ> getObjectId_QueryDerivedReferrer_TConnectorByStartObjectIdList() { return _objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListMap; }
    public String keepObjectId_QueryDerivedReferrer_TConnectorByStartObjectIdList(TConnectorCQ subQuery) {
        if (_objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListMap == null) { _objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListMap.size() + 1);
        _objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListMap.put(key, subQuery); return "objectId_QueryDerivedReferrer_TConnectorByStartObjectIdList." + key;
    }
    protected Map<String, Object> _objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListParameterMap;
    public Map<String, Object> getObjectId_QueryDerivedReferrer_TConnectorByStartObjectIdListParameter() { return _objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListParameterMap; }
    public String keepObjectId_QueryDerivedReferrer_TConnectorByStartObjectIdListParameter(Object parameterValue) {
        if (_objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListParameterMap == null) { _objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListParameterMap.size() + 1);
        _objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListParameterMap.put(key, parameterValue); return "objectId_QueryDerivedReferrer_TConnectorByStartObjectIdListParameter." + key;
    }

    protected Map<String, TConnectorCQ> _objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListMap;
    public Map<String, TConnectorCQ> getObjectId_QueryDerivedReferrer_TConnectorByEndObjectIdList() { return _objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListMap; }
    public String keepObjectId_QueryDerivedReferrer_TConnectorByEndObjectIdList(TConnectorCQ subQuery) {
        if (_objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListMap == null) { _objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListMap.size() + 1);
        _objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListMap.put(key, subQuery); return "objectId_QueryDerivedReferrer_TConnectorByEndObjectIdList." + key;
    }
    protected Map<String, Object> _objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListParameterMap;
    public Map<String, Object> getObjectId_QueryDerivedReferrer_TConnectorByEndObjectIdListParameter() { return _objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListParameterMap; }
    public String keepObjectId_QueryDerivedReferrer_TConnectorByEndObjectIdListParameter(Object parameterValue) {
        if (_objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListParameterMap == null) { _objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListParameterMap.size() + 1);
        _objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListParameterMap.put(key, parameterValue); return "objectId_QueryDerivedReferrer_TConnectorByEndObjectIdListParameter." + key;
    }

    public BsTObjectCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjectCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _objectType;
    public ConditionValue getObjectType() {
        if (_objectType == null) { _objectType = new ConditionValue(); }
        return _objectType;
    }
    protected ConditionValue getCValueObjectType() { return getObjectType(); }

    public BsTObjectCQ addOrderBy_ObjectType_Asc() { regOBA("Object_Type"); return this; }
    public BsTObjectCQ addOrderBy_ObjectType_Desc() { regOBD("Object_Type"); return this; }

    protected ConditionValue _diagramId;
    public ConditionValue getDiagramId() {
        if (_diagramId == null) { _diagramId = new ConditionValue(); }
        return _diagramId;
    }
    protected ConditionValue getCValueDiagramId() { return getDiagramId(); }

    public BsTObjectCQ addOrderBy_DiagramId_Asc() { regOBA("Diagram_ID"); return this; }
    public BsTObjectCQ addOrderBy_DiagramId_Desc() { regOBD("Diagram_ID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    public BsTObjectCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTObjectCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _alias;
    public ConditionValue getAlias() {
        if (_alias == null) { _alias = new ConditionValue(); }
        return _alias;
    }
    protected ConditionValue getCValueAlias() { return getAlias(); }

    public BsTObjectCQ addOrderBy_Alias_Asc() { regOBA("Alias"); return this; }
    public BsTObjectCQ addOrderBy_Alias_Desc() { regOBD("Alias"); return this; }

    protected ConditionValue _author;
    public ConditionValue getAuthor() {
        if (_author == null) { _author = new ConditionValue(); }
        return _author;
    }
    protected ConditionValue getCValueAuthor() { return getAuthor(); }

    public BsTObjectCQ addOrderBy_Author_Asc() { regOBA("Author"); return this; }
    public BsTObjectCQ addOrderBy_Author_Desc() { regOBD("Author"); return this; }

    protected ConditionValue _version;
    public ConditionValue getVersion() {
        if (_version == null) { _version = new ConditionValue(); }
        return _version;
    }
    protected ConditionValue getCValueVersion() { return getVersion(); }

    public BsTObjectCQ addOrderBy_Version_Asc() { regOBA("Version"); return this; }
    public BsTObjectCQ addOrderBy_Version_Desc() { regOBD("Version"); return this; }

    protected ConditionValue _note;
    public ConditionValue getNote() {
        if (_note == null) { _note = new ConditionValue(); }
        return _note;
    }
    protected ConditionValue getCValueNote() { return getNote(); }

    public BsTObjectCQ addOrderBy_Note_Asc() { regOBA("Note"); return this; }
    public BsTObjectCQ addOrderBy_Note_Desc() { regOBD("Note"); return this; }

    protected ConditionValue _packageId;
    public ConditionValue getPackageId() {
        if (_packageId == null) { _packageId = new ConditionValue(); }
        return _packageId;
    }
    protected ConditionValue getCValuePackageId() { return getPackageId(); }

    public BsTObjectCQ addOrderBy_PackageId_Asc() { regOBA("Package_ID"); return this; }
    public BsTObjectCQ addOrderBy_PackageId_Desc() { regOBD("Package_ID"); return this; }

    protected ConditionValue _stereotype;
    public ConditionValue getStereotype() {
        if (_stereotype == null) { _stereotype = new ConditionValue(); }
        return _stereotype;
    }
    protected ConditionValue getCValueStereotype() { return getStereotype(); }

    public BsTObjectCQ addOrderBy_Stereotype_Asc() { regOBA("Stereotype"); return this; }
    public BsTObjectCQ addOrderBy_Stereotype_Desc() { regOBD("Stereotype"); return this; }

    protected ConditionValue _ntype;
    public ConditionValue getNtype() {
        if (_ntype == null) { _ntype = new ConditionValue(); }
        return _ntype;
    }
    protected ConditionValue getCValueNtype() { return getNtype(); }

    public BsTObjectCQ addOrderBy_Ntype_Asc() { regOBA("NType"); return this; }
    public BsTObjectCQ addOrderBy_Ntype_Desc() { regOBD("NType"); return this; }

    protected ConditionValue _complexity;
    public ConditionValue getComplexity() {
        if (_complexity == null) { _complexity = new ConditionValue(); }
        return _complexity;
    }
    protected ConditionValue getCValueComplexity() { return getComplexity(); }

    public BsTObjectCQ addOrderBy_Complexity_Asc() { regOBA("Complexity"); return this; }
    public BsTObjectCQ addOrderBy_Complexity_Desc() { regOBD("Complexity"); return this; }

    protected ConditionValue _effort;
    public ConditionValue getEffort() {
        if (_effort == null) { _effort = new ConditionValue(); }
        return _effort;
    }
    protected ConditionValue getCValueEffort() { return getEffort(); }

    public BsTObjectCQ addOrderBy_Effort_Asc() { regOBA("Effort"); return this; }
    public BsTObjectCQ addOrderBy_Effort_Desc() { regOBD("Effort"); return this; }

    protected ConditionValue _style;
    public ConditionValue getStyle() {
        if (_style == null) { _style = new ConditionValue(); }
        return _style;
    }
    protected ConditionValue getCValueStyle() { return getStyle(); }

    public BsTObjectCQ addOrderBy_Style_Asc() { regOBA("Style"); return this; }
    public BsTObjectCQ addOrderBy_Style_Desc() { regOBD("Style"); return this; }

    protected ConditionValue _backcolor;
    public ConditionValue getBackcolor() {
        if (_backcolor == null) { _backcolor = new ConditionValue(); }
        return _backcolor;
    }
    protected ConditionValue getCValueBackcolor() { return getBackcolor(); }

    public BsTObjectCQ addOrderBy_Backcolor_Asc() { regOBA("Backcolor"); return this; }
    public BsTObjectCQ addOrderBy_Backcolor_Desc() { regOBD("Backcolor"); return this; }

    protected ConditionValue _borderstyle;
    public ConditionValue getBorderstyle() {
        if (_borderstyle == null) { _borderstyle = new ConditionValue(); }
        return _borderstyle;
    }
    protected ConditionValue getCValueBorderstyle() { return getBorderstyle(); }

    public BsTObjectCQ addOrderBy_Borderstyle_Asc() { regOBA("BorderStyle"); return this; }
    public BsTObjectCQ addOrderBy_Borderstyle_Desc() { regOBD("BorderStyle"); return this; }

    protected ConditionValue _borderwidth;
    public ConditionValue getBorderwidth() {
        if (_borderwidth == null) { _borderwidth = new ConditionValue(); }
        return _borderwidth;
    }
    protected ConditionValue getCValueBorderwidth() { return getBorderwidth(); }

    public BsTObjectCQ addOrderBy_Borderwidth_Asc() { regOBA("BorderWidth"); return this; }
    public BsTObjectCQ addOrderBy_Borderwidth_Desc() { regOBD("BorderWidth"); return this; }

    protected ConditionValue _fontcolor;
    public ConditionValue getFontcolor() {
        if (_fontcolor == null) { _fontcolor = new ConditionValue(); }
        return _fontcolor;
    }
    protected ConditionValue getCValueFontcolor() { return getFontcolor(); }

    public BsTObjectCQ addOrderBy_Fontcolor_Asc() { regOBA("Fontcolor"); return this; }
    public BsTObjectCQ addOrderBy_Fontcolor_Desc() { regOBD("Fontcolor"); return this; }

    protected ConditionValue _bordercolor;
    public ConditionValue getBordercolor() {
        if (_bordercolor == null) { _bordercolor = new ConditionValue(); }
        return _bordercolor;
    }
    protected ConditionValue getCValueBordercolor() { return getBordercolor(); }

    public BsTObjectCQ addOrderBy_Bordercolor_Asc() { regOBA("Bordercolor"); return this; }
    public BsTObjectCQ addOrderBy_Bordercolor_Desc() { regOBD("Bordercolor"); return this; }

    protected ConditionValue _createddate;
    public ConditionValue getCreateddate() {
        if (_createddate == null) { _createddate = new ConditionValue(); }
        return _createddate;
    }
    protected ConditionValue getCValueCreateddate() { return getCreateddate(); }

    public BsTObjectCQ addOrderBy_Createddate_Asc() { regOBA("CreatedDate"); return this; }
    public BsTObjectCQ addOrderBy_Createddate_Desc() { regOBD("CreatedDate"); return this; }

    protected ConditionValue _modifieddate;
    public ConditionValue getModifieddate() {
        if (_modifieddate == null) { _modifieddate = new ConditionValue(); }
        return _modifieddate;
    }
    protected ConditionValue getCValueModifieddate() { return getModifieddate(); }

    public BsTObjectCQ addOrderBy_Modifieddate_Asc() { regOBA("ModifiedDate"); return this; }
    public BsTObjectCQ addOrderBy_Modifieddate_Desc() { regOBD("ModifiedDate"); return this; }

    protected ConditionValue _status;
    public ConditionValue getStatus() {
        if (_status == null) { _status = new ConditionValue(); }
        return _status;
    }
    protected ConditionValue getCValueStatus() { return getStatus(); }

    public BsTObjectCQ addOrderBy_Status_Asc() { regOBA("Status"); return this; }
    public BsTObjectCQ addOrderBy_Status_Desc() { regOBD("Status"); return this; }

    protected ConditionValue _tagged;
    public ConditionValue getTagged() {
        if (_tagged == null) { _tagged = new ConditionValue(); }
        return _tagged;
    }
    protected ConditionValue getCValueTagged() { return getTagged(); }

    public BsTObjectCQ addOrderBy_Tagged_Asc() { regOBA("Tagged"); return this; }
    public BsTObjectCQ addOrderBy_Tagged_Desc() { regOBD("Tagged"); return this; }

    protected ConditionValue _pdata1;
    public ConditionValue getPdata1() {
        if (_pdata1 == null) { _pdata1 = new ConditionValue(); }
        return _pdata1;
    }
    protected ConditionValue getCValuePdata1() { return getPdata1(); }

    public BsTObjectCQ addOrderBy_Pdata1_Asc() { regOBA("PDATA1"); return this; }
    public BsTObjectCQ addOrderBy_Pdata1_Desc() { regOBD("PDATA1"); return this; }

    protected ConditionValue _pdata2;
    public ConditionValue getPdata2() {
        if (_pdata2 == null) { _pdata2 = new ConditionValue(); }
        return _pdata2;
    }
    protected ConditionValue getCValuePdata2() { return getPdata2(); }

    public BsTObjectCQ addOrderBy_Pdata2_Asc() { regOBA("PDATA2"); return this; }
    public BsTObjectCQ addOrderBy_Pdata2_Desc() { regOBD("PDATA2"); return this; }

    protected ConditionValue _pdata3;
    public ConditionValue getPdata3() {
        if (_pdata3 == null) { _pdata3 = new ConditionValue(); }
        return _pdata3;
    }
    protected ConditionValue getCValuePdata3() { return getPdata3(); }

    public BsTObjectCQ addOrderBy_Pdata3_Asc() { regOBA("PDATA3"); return this; }
    public BsTObjectCQ addOrderBy_Pdata3_Desc() { regOBD("PDATA3"); return this; }

    protected ConditionValue _pdata4;
    public ConditionValue getPdata4() {
        if (_pdata4 == null) { _pdata4 = new ConditionValue(); }
        return _pdata4;
    }
    protected ConditionValue getCValuePdata4() { return getPdata4(); }

    public BsTObjectCQ addOrderBy_Pdata4_Asc() { regOBA("PDATA4"); return this; }
    public BsTObjectCQ addOrderBy_Pdata4_Desc() { regOBD("PDATA4"); return this; }

    protected ConditionValue _pdata5;
    public ConditionValue getPdata5() {
        if (_pdata5 == null) { _pdata5 = new ConditionValue(); }
        return _pdata5;
    }
    protected ConditionValue getCValuePdata5() { return getPdata5(); }

    public BsTObjectCQ addOrderBy_Pdata5_Asc() { regOBA("PDATA5"); return this; }
    public BsTObjectCQ addOrderBy_Pdata5_Desc() { regOBD("PDATA5"); return this; }

    protected ConditionValue _concurrency;
    public ConditionValue getConcurrency() {
        if (_concurrency == null) { _concurrency = new ConditionValue(); }
        return _concurrency;
    }
    protected ConditionValue getCValueConcurrency() { return getConcurrency(); }

    public BsTObjectCQ addOrderBy_Concurrency_Asc() { regOBA("Concurrency"); return this; }
    public BsTObjectCQ addOrderBy_Concurrency_Desc() { regOBD("Concurrency"); return this; }

    protected ConditionValue _visibility;
    public ConditionValue getVisibility() {
        if (_visibility == null) { _visibility = new ConditionValue(); }
        return _visibility;
    }
    protected ConditionValue getCValueVisibility() { return getVisibility(); }

    public BsTObjectCQ addOrderBy_Visibility_Asc() { regOBA("Visibility"); return this; }
    public BsTObjectCQ addOrderBy_Visibility_Desc() { regOBD("Visibility"); return this; }

    protected ConditionValue _persistence;
    public ConditionValue getPersistence() {
        if (_persistence == null) { _persistence = new ConditionValue(); }
        return _persistence;
    }
    protected ConditionValue getCValuePersistence() { return getPersistence(); }

    public BsTObjectCQ addOrderBy_Persistence_Asc() { regOBA("Persistence"); return this; }
    public BsTObjectCQ addOrderBy_Persistence_Desc() { regOBD("Persistence"); return this; }

    protected ConditionValue _cardinality;
    public ConditionValue getCardinality() {
        if (_cardinality == null) { _cardinality = new ConditionValue(); }
        return _cardinality;
    }
    protected ConditionValue getCValueCardinality() { return getCardinality(); }

    public BsTObjectCQ addOrderBy_Cardinality_Asc() { regOBA("Cardinality"); return this; }
    public BsTObjectCQ addOrderBy_Cardinality_Desc() { regOBD("Cardinality"); return this; }

    protected ConditionValue _gentype;
    public ConditionValue getGentype() {
        if (_gentype == null) { _gentype = new ConditionValue(); }
        return _gentype;
    }
    protected ConditionValue getCValueGentype() { return getGentype(); }

    public BsTObjectCQ addOrderBy_Gentype_Asc() { regOBA("GenType"); return this; }
    public BsTObjectCQ addOrderBy_Gentype_Desc() { regOBD("GenType"); return this; }

    protected ConditionValue _genfile;
    public ConditionValue getGenfile() {
        if (_genfile == null) { _genfile = new ConditionValue(); }
        return _genfile;
    }
    protected ConditionValue getCValueGenfile() { return getGenfile(); }

    public BsTObjectCQ addOrderBy_Genfile_Asc() { regOBA("GenFile"); return this; }
    public BsTObjectCQ addOrderBy_Genfile_Desc() { regOBD("GenFile"); return this; }

    protected ConditionValue _header1;
    public ConditionValue getHeader1() {
        if (_header1 == null) { _header1 = new ConditionValue(); }
        return _header1;
    }
    protected ConditionValue getCValueHeader1() { return getHeader1(); }

    public BsTObjectCQ addOrderBy_Header1_Asc() { regOBA("Header1"); return this; }
    public BsTObjectCQ addOrderBy_Header1_Desc() { regOBD("Header1"); return this; }

    protected ConditionValue _header2;
    public ConditionValue getHeader2() {
        if (_header2 == null) { _header2 = new ConditionValue(); }
        return _header2;
    }
    protected ConditionValue getCValueHeader2() { return getHeader2(); }

    public BsTObjectCQ addOrderBy_Header2_Asc() { regOBA("Header2"); return this; }
    public BsTObjectCQ addOrderBy_Header2_Desc() { regOBD("Header2"); return this; }

    protected ConditionValue _phase;
    public ConditionValue getPhase() {
        if (_phase == null) { _phase = new ConditionValue(); }
        return _phase;
    }
    protected ConditionValue getCValuePhase() { return getPhase(); }

    public BsTObjectCQ addOrderBy_Phase_Asc() { regOBA("Phase"); return this; }
    public BsTObjectCQ addOrderBy_Phase_Desc() { regOBD("Phase"); return this; }

    protected ConditionValue _scope;
    public ConditionValue getScope() {
        if (_scope == null) { _scope = new ConditionValue(); }
        return _scope;
    }
    protected ConditionValue getCValueScope() { return getScope(); }

    public BsTObjectCQ addOrderBy_Scope_Asc() { regOBA("Scope"); return this; }
    public BsTObjectCQ addOrderBy_Scope_Desc() { regOBD("Scope"); return this; }

    protected ConditionValue _genoption;
    public ConditionValue getGenoption() {
        if (_genoption == null) { _genoption = new ConditionValue(); }
        return _genoption;
    }
    protected ConditionValue getCValueGenoption() { return getGenoption(); }

    public BsTObjectCQ addOrderBy_Genoption_Asc() { regOBA("GenOption"); return this; }
    public BsTObjectCQ addOrderBy_Genoption_Desc() { regOBD("GenOption"); return this; }

    protected ConditionValue _genlinks;
    public ConditionValue getGenlinks() {
        if (_genlinks == null) { _genlinks = new ConditionValue(); }
        return _genlinks;
    }
    protected ConditionValue getCValueGenlinks() { return getGenlinks(); }

    public BsTObjectCQ addOrderBy_Genlinks_Asc() { regOBA("GenLinks"); return this; }
    public BsTObjectCQ addOrderBy_Genlinks_Desc() { regOBD("GenLinks"); return this; }

    protected ConditionValue _classifier;
    public ConditionValue getClassifier() {
        if (_classifier == null) { _classifier = new ConditionValue(); }
        return _classifier;
    }
    protected ConditionValue getCValueClassifier() { return getClassifier(); }

    public BsTObjectCQ addOrderBy_Classifier_Asc() { regOBA("Classifier"); return this; }
    public BsTObjectCQ addOrderBy_Classifier_Desc() { regOBD("Classifier"); return this; }

    protected ConditionValue _eaGuid;
    public ConditionValue getEaGuid() {
        if (_eaGuid == null) { _eaGuid = new ConditionValue(); }
        return _eaGuid;
    }
    protected ConditionValue getCValueEaGuid() { return getEaGuid(); }

    public BsTObjectCQ addOrderBy_EaGuid_Asc() { regOBA("ea_guid"); return this; }
    public BsTObjectCQ addOrderBy_EaGuid_Desc() { regOBD("ea_guid"); return this; }

    protected ConditionValue _parentid;
    public ConditionValue getParentid() {
        if (_parentid == null) { _parentid = new ConditionValue(); }
        return _parentid;
    }
    protected ConditionValue getCValueParentid() { return getParentid(); }

    public BsTObjectCQ addOrderBy_Parentid_Asc() { regOBA("ParentID"); return this; }
    public BsTObjectCQ addOrderBy_Parentid_Desc() { regOBD("ParentID"); return this; }

    protected ConditionValue _runstate;
    public ConditionValue getRunstate() {
        if (_runstate == null) { _runstate = new ConditionValue(); }
        return _runstate;
    }
    protected ConditionValue getCValueRunstate() { return getRunstate(); }

    public BsTObjectCQ addOrderBy_Runstate_Asc() { regOBA("RunState"); return this; }
    public BsTObjectCQ addOrderBy_Runstate_Desc() { regOBD("RunState"); return this; }

    protected ConditionValue _classifierGuid;
    public ConditionValue getClassifierGuid() {
        if (_classifierGuid == null) { _classifierGuid = new ConditionValue(); }
        return _classifierGuid;
    }
    protected ConditionValue getCValueClassifierGuid() { return getClassifierGuid(); }

    public BsTObjectCQ addOrderBy_ClassifierGuid_Asc() { regOBA("Classifier_guid"); return this; }
    public BsTObjectCQ addOrderBy_ClassifierGuid_Desc() { regOBD("Classifier_guid"); return this; }

    protected ConditionValue _tpos;
    public ConditionValue getTpos() {
        if (_tpos == null) { _tpos = new ConditionValue(); }
        return _tpos;
    }
    protected ConditionValue getCValueTpos() { return getTpos(); }

    public BsTObjectCQ addOrderBy_Tpos_Asc() { regOBA("TPos"); return this; }
    public BsTObjectCQ addOrderBy_Tpos_Desc() { regOBD("TPos"); return this; }

    protected ConditionValue _isroot;
    public ConditionValue getIsroot() {
        if (_isroot == null) { _isroot = new ConditionValue(); }
        return _isroot;
    }
    protected ConditionValue getCValueIsroot() { return getIsroot(); }

    public BsTObjectCQ addOrderBy_Isroot_Asc() { regOBA("IsRoot"); return this; }
    public BsTObjectCQ addOrderBy_Isroot_Desc() { regOBD("IsRoot"); return this; }

    protected ConditionValue _isleaf;
    public ConditionValue getIsleaf() {
        if (_isleaf == null) { _isleaf = new ConditionValue(); }
        return _isleaf;
    }
    protected ConditionValue getCValueIsleaf() { return getIsleaf(); }

    public BsTObjectCQ addOrderBy_Isleaf_Asc() { regOBA("IsLeaf"); return this; }
    public BsTObjectCQ addOrderBy_Isleaf_Desc() { regOBD("IsLeaf"); return this; }

    protected ConditionValue _isspec;
    public ConditionValue getIsspec() {
        if (_isspec == null) { _isspec = new ConditionValue(); }
        return _isspec;
    }
    protected ConditionValue getCValueIsspec() { return getIsspec(); }

    public BsTObjectCQ addOrderBy_Isspec_Asc() { regOBA("IsSpec"); return this; }
    public BsTObjectCQ addOrderBy_Isspec_Desc() { regOBD("IsSpec"); return this; }

    protected ConditionValue _isactive;
    public ConditionValue getIsactive() {
        if (_isactive == null) { _isactive = new ConditionValue(); }
        return _isactive;
    }
    protected ConditionValue getCValueIsactive() { return getIsactive(); }

    public BsTObjectCQ addOrderBy_Isactive_Asc() { regOBA("IsActive"); return this; }
    public BsTObjectCQ addOrderBy_Isactive_Desc() { regOBD("IsActive"); return this; }

    protected ConditionValue _stateflags;
    public ConditionValue getStateflags() {
        if (_stateflags == null) { _stateflags = new ConditionValue(); }
        return _stateflags;
    }
    protected ConditionValue getCValueStateflags() { return getStateflags(); }

    public BsTObjectCQ addOrderBy_Stateflags_Asc() { regOBA("StateFlags"); return this; }
    public BsTObjectCQ addOrderBy_Stateflags_Desc() { regOBD("StateFlags"); return this; }

    protected ConditionValue _packageflags;
    public ConditionValue getPackageflags() {
        if (_packageflags == null) { _packageflags = new ConditionValue(); }
        return _packageflags;
    }
    protected ConditionValue getCValuePackageflags() { return getPackageflags(); }

    public BsTObjectCQ addOrderBy_Packageflags_Asc() { regOBA("PackageFlags"); return this; }
    public BsTObjectCQ addOrderBy_Packageflags_Desc() { regOBD("PackageFlags"); return this; }

    protected ConditionValue _multiplicity;
    public ConditionValue getMultiplicity() {
        if (_multiplicity == null) { _multiplicity = new ConditionValue(); }
        return _multiplicity;
    }
    protected ConditionValue getCValueMultiplicity() { return getMultiplicity(); }

    public BsTObjectCQ addOrderBy_Multiplicity_Asc() { regOBA("Multiplicity"); return this; }
    public BsTObjectCQ addOrderBy_Multiplicity_Desc() { regOBD("Multiplicity"); return this; }

    protected ConditionValue _styleex;
    public ConditionValue getStyleex() {
        if (_styleex == null) { _styleex = new ConditionValue(); }
        return _styleex;
    }
    protected ConditionValue getCValueStyleex() { return getStyleex(); }

    public BsTObjectCQ addOrderBy_Styleex_Asc() { regOBA("StyleEx"); return this; }
    public BsTObjectCQ addOrderBy_Styleex_Desc() { regOBD("StyleEx"); return this; }

    protected ConditionValue _actionflags;
    public ConditionValue getActionflags() {
        if (_actionflags == null) { _actionflags = new ConditionValue(); }
        return _actionflags;
    }
    protected ConditionValue getCValueActionflags() { return getActionflags(); }

    public BsTObjectCQ addOrderBy_Actionflags_Asc() { regOBA("ActionFlags"); return this; }
    public BsTObjectCQ addOrderBy_Actionflags_Desc() { regOBD("ActionFlags"); return this; }

    protected ConditionValue _eventflags;
    public ConditionValue getEventflags() {
        if (_eventflags == null) { _eventflags = new ConditionValue(); }
        return _eventflags;
    }
    protected ConditionValue getCValueEventflags() { return getEventflags(); }

    public BsTObjectCQ addOrderBy_Eventflags_Asc() { regOBA("EventFlags"); return this; }
    public BsTObjectCQ addOrderBy_Eventflags_Desc() { regOBD("EventFlags"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjectCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjectCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    protected Map<String, TObjectCQ> _scalarSubQueryMap;
    public Map<String, TObjectCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(TObjectCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // ===================================================================================
    //                                                             MySelf InScope SubQuery
    //                                                             =======================
    protected Map<String, TObjectCQ> _myselfInScopeSubQueryMap;
    public Map<String, TObjectCQ> getMyselfInScopeSubQuery() { return _myselfInScopeSubQueryMap; }
    public String keepMyselfInScopeSubQuery(TObjectCQ subQuery) {
        if (_myselfInScopeSubQueryMap == null) { _myselfInScopeSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeSubQueryMap.size() + 1);
        _myselfInScopeSubQueryMap.put(key, subQuery); return "myselfInScopeSubQuery." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TObjectCB.class.getName(); }
    String xCQ() { return TObjectCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
