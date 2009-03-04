package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_scenariotypes.
 * @author DBFlute(AutoGenerator)
 */
public class BsTScenariotypesCQ extends AbstractBsTScenariotypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TScenariotypesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTScenariotypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_scenariotypes) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TScenariotypesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TScenariotypesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_scenariotypes on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TScenariotypesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TScenariotypesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _scenariotype;
    public ConditionValue getScenariotype() {
        if (_scenariotype == null) { _scenariotype = new ConditionValue(); }
        return _scenariotype;
    }
    protected ConditionValue getCValueScenariotype() { return getScenariotype(); }

    public BsTScenariotypesCQ addOrderBy_Scenariotype_Asc() { regOBA("ScenarioType"); return this; }
    public BsTScenariotypesCQ addOrderBy_Scenariotype_Desc() { regOBD("ScenarioType"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    public BsTScenariotypesCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTScenariotypesCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    protected ConditionValue _numericweight;
    public ConditionValue getNumericweight() {
        if (_numericweight == null) { _numericweight = new ConditionValue(); }
        return _numericweight;
    }
    protected ConditionValue getCValueNumericweight() { return getNumericweight(); }

    public BsTScenariotypesCQ addOrderBy_Numericweight_Asc() { regOBA("NumericWeight"); return this; }
    public BsTScenariotypesCQ addOrderBy_Numericweight_Desc() { regOBD("NumericWeight"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTScenariotypesCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTScenariotypesCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTScenariotypesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTScenariotypesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TScenariotypesCB.class.getName(); }
    String xCQ() { return TScenariotypesCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
