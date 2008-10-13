package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_operation.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
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
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
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
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TOperationCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
