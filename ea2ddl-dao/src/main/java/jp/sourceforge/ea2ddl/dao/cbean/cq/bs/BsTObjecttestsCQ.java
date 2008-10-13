package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objecttests.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjecttestsCQ extends AbstractBsTObjecttestsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjecttestsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjecttestsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objecttests) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjecttestsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjecttestsCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objecttests on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjecttestsCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TObjecttestsCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
          
    public BsTObjecttestsCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjecttestsCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _test;
    public ConditionValue getTest() {
        if (_test == null) { _test = new ConditionValue(); }
        return _test;
    }
    protected ConditionValue getCValueTest() { return getTest(); }
    
    public BsTObjecttestsCQ addOrderBy_Test_Asc() { regOBA("Test"); return this; }
    public BsTObjecttestsCQ addOrderBy_Test_Desc() { regOBD("Test"); return this; }

    protected ConditionValue _testclass;
    public ConditionValue getTestclass() {
        if (_testclass == null) { _testclass = new ConditionValue(); }
        return _testclass;
    }
    protected ConditionValue getCValueTestclass() { return getTestclass(); }
          
    public BsTObjecttestsCQ addOrderBy_Testclass_Asc() { regOBA("TestClass"); return this; }
    public BsTObjecttestsCQ addOrderBy_Testclass_Desc() { regOBD("TestClass"); return this; }

    protected ConditionValue _testtype;
    public ConditionValue getTesttype() {
        if (_testtype == null) { _testtype = new ConditionValue(); }
        return _testtype;
    }
    protected ConditionValue getCValueTesttype() { return getTesttype(); }
    
    public BsTObjecttestsCQ addOrderBy_Testtype_Asc() { regOBA("TestType"); return this; }
    public BsTObjecttestsCQ addOrderBy_Testtype_Desc() { regOBD("TestType"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTObjecttestsCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTObjecttestsCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _inputdata;
    public ConditionValue getInputdata() {
        if (_inputdata == null) { _inputdata = new ConditionValue(); }
        return _inputdata;
    }
    protected ConditionValue getCValueInputdata() { return getInputdata(); }
    
    public BsTObjecttestsCQ addOrderBy_Inputdata_Asc() { regOBA("InputData"); return this; }
    public BsTObjecttestsCQ addOrderBy_Inputdata_Desc() { regOBD("InputData"); return this; }

    protected ConditionValue _acceptancecriteria;
    public ConditionValue getAcceptancecriteria() {
        if (_acceptancecriteria == null) { _acceptancecriteria = new ConditionValue(); }
        return _acceptancecriteria;
    }
    protected ConditionValue getCValueAcceptancecriteria() { return getAcceptancecriteria(); }
    
    public BsTObjecttestsCQ addOrderBy_Acceptancecriteria_Asc() { regOBA("AcceptanceCriteria"); return this; }
    public BsTObjecttestsCQ addOrderBy_Acceptancecriteria_Desc() { regOBD("AcceptanceCriteria"); return this; }

    protected ConditionValue _status;
    public ConditionValue getStatus() {
        if (_status == null) { _status = new ConditionValue(); }
        return _status;
    }
    protected ConditionValue getCValueStatus() { return getStatus(); }
    
    public BsTObjecttestsCQ addOrderBy_Status_Asc() { regOBA("Status"); return this; }
    public BsTObjecttestsCQ addOrderBy_Status_Desc() { regOBD("Status"); return this; }

    protected ConditionValue _daterun;
    public ConditionValue getDaterun() {
        if (_daterun == null) { _daterun = new ConditionValue(); }
        return _daterun;
    }
    protected ConditionValue getCValueDaterun() { return getDaterun(); }
    
    public BsTObjecttestsCQ addOrderBy_Daterun_Asc() { regOBA("DateRun"); return this; }
    public BsTObjecttestsCQ addOrderBy_Daterun_Desc() { regOBD("DateRun"); return this; }

    protected ConditionValue _results;
    public ConditionValue getResults() {
        if (_results == null) { _results = new ConditionValue(); }
        return _results;
    }
    protected ConditionValue getCValueResults() { return getResults(); }
    
    public BsTObjecttestsCQ addOrderBy_Results_Asc() { regOBA("Results"); return this; }
    public BsTObjecttestsCQ addOrderBy_Results_Desc() { regOBD("Results"); return this; }

    protected ConditionValue _runby;
    public ConditionValue getRunby() {
        if (_runby == null) { _runby = new ConditionValue(); }
        return _runby;
    }
    protected ConditionValue getCValueRunby() { return getRunby(); }
    
    public BsTObjecttestsCQ addOrderBy_Runby_Asc() { regOBA("RunBy"); return this; }
    public BsTObjecttestsCQ addOrderBy_Runby_Desc() { regOBD("RunBy"); return this; }

    protected ConditionValue _checkby;
    public ConditionValue getCheckby() {
        if (_checkby == null) { _checkby = new ConditionValue(); }
        return _checkby;
    }
    protected ConditionValue getCValueCheckby() { return getCheckby(); }
    
    public BsTObjecttestsCQ addOrderBy_Checkby_Asc() { regOBA("CheckBy"); return this; }
    public BsTObjecttestsCQ addOrderBy_Checkby_Desc() { regOBD("CheckBy"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjecttestsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjecttestsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TObjecttestsCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
