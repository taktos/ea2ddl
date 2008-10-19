package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_operationparams.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTOperationparamsCQ extends AbstractBsTOperationparamsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TOperationparamsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTOperationparamsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_operationparams) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TOperationparamsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TOperationparamsCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_operationparams on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TOperationparamsCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TOperationparamsCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
          
    protected Map<String, TOperationCQ> _operationid_InScopeSubQuery_TOperationMap;
    public Map<String, TOperationCQ> getOperationid_InScopeSubQuery_TOperation() { return _operationid_InScopeSubQuery_TOperationMap; }
    public String keepOperationid_InScopeSubQuery_TOperation(TOperationCQ subQuery) {
        if (_operationid_InScopeSubQuery_TOperationMap == null) { _operationid_InScopeSubQuery_TOperationMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_operationid_InScopeSubQuery_TOperationMap.size() + 1);
        _operationid_InScopeSubQuery_TOperationMap.put(key, subQuery); return "operationid_InScopeSubQuery_TOperation." + key;
    }
      
    public BsTOperationparamsCQ addOrderBy_Operationid_Asc() { regOBA("OperationID"); return this; }
    public BsTOperationparamsCQ addOrderBy_Operationid_Desc() { regOBD("OperationID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }
    
    public BsTOperationparamsCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTOperationparamsCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }
    
    public BsTOperationparamsCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTOperationparamsCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTOperationparamsCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTOperationparamsCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _pos;
    public ConditionValue getPos() {
        if (_pos == null) { _pos = new ConditionValue(); }
        return _pos;
    }
    protected ConditionValue getCValuePos() { return getPos(); }
          
    public BsTOperationparamsCQ addOrderBy_Pos_Asc() { regOBA("Pos"); return this; }
    public BsTOperationparamsCQ addOrderBy_Pos_Desc() { regOBD("Pos"); return this; }

    protected ConditionValue _style;
    public ConditionValue getStyle() {
        if (_style == null) { _style = new ConditionValue(); }
        return _style;
    }
    protected ConditionValue getCValueStyle() { return getStyle(); }
    
    public BsTOperationparamsCQ addOrderBy_Style_Asc() { regOBA("Style"); return this; }
    public BsTOperationparamsCQ addOrderBy_Style_Desc() { regOBD("Style"); return this; }

    protected ConditionValue _kind;
    public ConditionValue getKind() {
        if (_kind == null) { _kind = new ConditionValue(); }
        return _kind;
    }
    protected ConditionValue getCValueKind() { return getKind(); }
    
    public BsTOperationparamsCQ addOrderBy_Kind_Asc() { regOBA("Kind"); return this; }
    public BsTOperationparamsCQ addOrderBy_Kind_Desc() { regOBD("Kind"); return this; }

    protected ConditionValue _classifier;
    public ConditionValue getClassifier() {
        if (_classifier == null) { _classifier = new ConditionValue(); }
        return _classifier;
    }
    protected ConditionValue getCValueClassifier() { return getClassifier(); }
    
    public BsTOperationparamsCQ addOrderBy_Classifier_Asc() { regOBA("Classifier"); return this; }
    public BsTOperationparamsCQ addOrderBy_Classifier_Desc() { regOBD("Classifier"); return this; }

    protected ConditionValue _eaGuid;
    public ConditionValue getEaGuid() {
        if (_eaGuid == null) { _eaGuid = new ConditionValue(); }
        return _eaGuid;
    }
    protected ConditionValue getCValueEaGuid() { return getEaGuid(); }
    
    public BsTOperationparamsCQ addOrderBy_EaGuid_Asc() { regOBA("ea_guid"); return this; }
    public BsTOperationparamsCQ addOrderBy_EaGuid_Desc() { regOBD("ea_guid"); return this; }

    protected ConditionValue _styleex;
    public ConditionValue getStyleex() {
        if (_styleex == null) { _styleex = new ConditionValue(); }
        return _styleex;
    }
    protected ConditionValue getCValueStyleex() { return getStyleex(); }
    
    public BsTOperationparamsCQ addOrderBy_Styleex_Asc() { regOBA("StyleEx"); return this; }
    public BsTOperationparamsCQ addOrderBy_Styleex_Desc() { regOBD("StyleEx"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTOperationparamsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTOperationparamsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        TOperationparamsCQ baseQuery = (TOperationparamsCQ)baseQueryAsSuper;
        TOperationparamsCQ unionQuery = (TOperationparamsCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryTOperation()) {
            unionQuery.queryTOperation().reflectRelationOnUnionQuery(baseQuery.queryTOperation(), unionQuery.queryTOperation());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    
    public TOperationCQ queryTOperation() {
        return getConditionQueryTOperation();
    }
    protected TOperationCQ _conditionQueryTOperation;
    public TOperationCQ getConditionQueryTOperation() {
        if (_conditionQueryTOperation == null) {
            _conditionQueryTOperation = createQueryTOperation();
            setupOuterJoin_TOperation();
        }
        return _conditionQueryTOperation;
    }
    protected void setupOuterJoin_TOperation() {
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("OperationID"), getConditionQueryTOperation().getRealColumnName("OperationID"));
        registerOuterJoin(getConditionQueryTOperation(), joinOnMap);
    }
    protected TOperationCQ createQueryTOperation() {
        String nrp = resolveNextRelationPath("t_operationparams", "tOperation");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        TOperationCQ cq = new TOperationCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("tOperation"); cq.xsetRelationPath(nrp); return cq;
    }
    public boolean hasConditionQueryTOperation() {
        return _conditionQueryTOperation != null;
    }


    protected String getConditionQueryClassNameInternally() { return TOperationparamsCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
