package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_script.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTScriptCQ extends AbstractBsTScriptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TScriptCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTScriptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_script) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TScriptCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TScriptCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_script on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TScriptCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TScriptCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _scriptid;
    public ConditionValue getScriptid() {
        if (_scriptid == null) { _scriptid = new ConditionValue(); }
        return _scriptid;
    }
    protected ConditionValue getCValueScriptid() { return getScriptid(); }
          
    public BsTScriptCQ addOrderBy_Scriptid_Asc() { regOBA("ScriptID"); return this; }
    public BsTScriptCQ addOrderBy_Scriptid_Desc() { regOBD("ScriptID"); return this; }

    protected ConditionValue _scriptcategory;
    public ConditionValue getScriptcategory() {
        if (_scriptcategory == null) { _scriptcategory = new ConditionValue(); }
        return _scriptcategory;
    }
    protected ConditionValue getCValueScriptcategory() { return getScriptcategory(); }
    
    public BsTScriptCQ addOrderBy_Scriptcategory_Asc() { regOBA("ScriptCategory"); return this; }
    public BsTScriptCQ addOrderBy_Scriptcategory_Desc() { regOBD("ScriptCategory"); return this; }

    protected ConditionValue _scriptname;
    public ConditionValue getScriptname() {
        if (_scriptname == null) { _scriptname = new ConditionValue(); }
        return _scriptname;
    }
    protected ConditionValue getCValueScriptname() { return getScriptname(); }
    
    public BsTScriptCQ addOrderBy_Scriptname_Asc() { regOBA("ScriptName"); return this; }
    public BsTScriptCQ addOrderBy_Scriptname_Desc() { regOBD("ScriptName"); return this; }

    protected ConditionValue _scriptauthor;
    public ConditionValue getScriptauthor() {
        if (_scriptauthor == null) { _scriptauthor = new ConditionValue(); }
        return _scriptauthor;
    }
    protected ConditionValue getCValueScriptauthor() { return getScriptauthor(); }
    
    public BsTScriptCQ addOrderBy_Scriptauthor_Asc() { regOBA("ScriptAuthor"); return this; }
    public BsTScriptCQ addOrderBy_Scriptauthor_Desc() { regOBD("ScriptAuthor"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTScriptCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTScriptCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _script;
    public ConditionValue getScript() {
        if (_script == null) { _script = new ConditionValue(); }
        return _script;
    }
    protected ConditionValue getCValueScript() { return getScript(); }
    
    public BsTScriptCQ addOrderBy_Script_Asc() { regOBA("Script"); return this; }
    public BsTScriptCQ addOrderBy_Script_Desc() { regOBD("Script"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTScriptCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTScriptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TScriptCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
