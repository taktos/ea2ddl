package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_testplans.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTTestplansCQ extends AbstractBsTTestplansCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTestplansCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTestplansCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_testplans) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TTestplansCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TTestplansCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_testplans on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TTestplansCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TTestplansCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _planid;
    public ConditionValue getPlanid() {
        if (_planid == null) { _planid = new ConditionValue(); }
        return _planid;
    }
    protected ConditionValue getCValuePlanid() { return getPlanid(); }
    
    public BsTTestplansCQ addOrderBy_Planid_Asc() { regOBA("PlanID"); return this; }
    public BsTTestplansCQ addOrderBy_Planid_Desc() { regOBD("PlanID"); return this; }

    protected ConditionValue _category;
    public ConditionValue getCategory() {
        if (_category == null) { _category = new ConditionValue(); }
        return _category;
    }
    protected ConditionValue getCValueCategory() { return getCategory(); }
    
    public BsTTestplansCQ addOrderBy_Category_Asc() { regOBA("Category"); return this; }
    public BsTTestplansCQ addOrderBy_Category_Desc() { regOBD("Category"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }
    
    public BsTTestplansCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTTestplansCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _author;
    public ConditionValue getAuthor() {
        if (_author == null) { _author = new ConditionValue(); }
        return _author;
    }
    protected ConditionValue getCValueAuthor() { return getAuthor(); }
    
    public BsTTestplansCQ addOrderBy_Author_Asc() { regOBA("Author"); return this; }
    public BsTTestplansCQ addOrderBy_Author_Desc() { regOBD("Author"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTTestplansCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTTestplansCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _testplan;
    public ConditionValue getTestplan() {
        if (_testplan == null) { _testplan = new ConditionValue(); }
        return _testplan;
    }
    protected ConditionValue getCValueTestplan() { return getTestplan(); }
    
    public BsTTestplansCQ addOrderBy_Testplan_Asc() { regOBA("TestPlan"); return this; }
    public BsTTestplansCQ addOrderBy_Testplan_Desc() { regOBD("TestPlan"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTTestplansCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTTestplansCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TTestplansCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
