package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objectscenarios.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjectscenariosCQ extends AbstractBsTObjectscenariosCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectscenariosCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectscenariosCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objectscenarios) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjectscenariosCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjectscenariosCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objectscenarios on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjectscenariosCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TObjectscenariosCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
          
    public BsTObjectscenariosCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjectscenariosCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _scenario;
    public ConditionValue getScenario() {
        if (_scenario == null) { _scenario = new ConditionValue(); }
        return _scenario;
    }
    protected ConditionValue getCValueScenario() { return getScenario(); }
    
    public BsTObjectscenariosCQ addOrderBy_Scenario_Asc() { regOBA("Scenario"); return this; }
    public BsTObjectscenariosCQ addOrderBy_Scenario_Desc() { regOBD("Scenario"); return this; }

    protected ConditionValue _scenariotype;
    public ConditionValue getScenariotype() {
        if (_scenariotype == null) { _scenariotype = new ConditionValue(); }
        return _scenariotype;
    }
    protected ConditionValue getCValueScenariotype() { return getScenariotype(); }
    
    public BsTObjectscenariosCQ addOrderBy_Scenariotype_Asc() { regOBA("ScenarioType"); return this; }
    public BsTObjectscenariosCQ addOrderBy_Scenariotype_Desc() { regOBD("ScenarioType"); return this; }

    protected ConditionValue _evalue;
    public ConditionValue getEvalue() {
        if (_evalue == null) { _evalue = new ConditionValue(); }
        return _evalue;
    }
    protected ConditionValue getCValueEvalue() { return getEvalue(); }
          
    public BsTObjectscenariosCQ addOrderBy_Evalue_Asc() { regOBA("EValue"); return this; }
    public BsTObjectscenariosCQ addOrderBy_Evalue_Desc() { regOBD("EValue"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTObjectscenariosCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTObjectscenariosCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _xmlcontent;
    public ConditionValue getXmlcontent() {
        if (_xmlcontent == null) { _xmlcontent = new ConditionValue(); }
        return _xmlcontent;
    }
    protected ConditionValue getCValueXmlcontent() { return getXmlcontent(); }
    
    public BsTObjectscenariosCQ addOrderBy_Xmlcontent_Asc() { regOBA("XMLContent"); return this; }
    public BsTObjectscenariosCQ addOrderBy_Xmlcontent_Desc() { regOBD("XMLContent"); return this; }

    protected ConditionValue _eaGuid;
    public ConditionValue getEaGuid() {
        if (_eaGuid == null) { _eaGuid = new ConditionValue(); }
        return _eaGuid;
    }
    protected ConditionValue getCValueEaGuid() { return getEaGuid(); }
    
    public BsTObjectscenariosCQ addOrderBy_EaGuid_Asc() { regOBA("ea_guid"); return this; }
    public BsTObjectscenariosCQ addOrderBy_EaGuid_Desc() { regOBD("ea_guid"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjectscenariosCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjectscenariosCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TObjectscenariosCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
