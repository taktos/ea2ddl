package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_rules.
 * @author DBFlute(AutoGenerator)
 */
public class BsTRulesCQ extends AbstractBsTRulesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TRulesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTRulesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_rules) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TRulesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TRulesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_rules on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TRulesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TRulesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _ruleid;
    public ConditionValue getRuleid() {
        if (_ruleid == null) { _ruleid = new ConditionValue(); }
        return _ruleid;
    }
    protected ConditionValue getCValueRuleid() { return getRuleid(); }

    public BsTRulesCQ addOrderBy_Ruleid_Asc() { regOBA("RuleID"); return this; }
    public BsTRulesCQ addOrderBy_Ruleid_Desc() { regOBD("RuleID"); return this; }

    protected ConditionValue _rulename;
    public ConditionValue getRulename() {
        if (_rulename == null) { _rulename = new ConditionValue(); }
        return _rulename;
    }
    protected ConditionValue getCValueRulename() { return getRulename(); }

    public BsTRulesCQ addOrderBy_Rulename_Asc() { regOBA("RuleName"); return this; }
    public BsTRulesCQ addOrderBy_Rulename_Desc() { regOBD("RuleName"); return this; }

    protected ConditionValue _ruletype;
    public ConditionValue getRuletype() {
        if (_ruletype == null) { _ruletype = new ConditionValue(); }
        return _ruletype;
    }
    protected ConditionValue getCValueRuletype() { return getRuletype(); }

    public BsTRulesCQ addOrderBy_Ruletype_Asc() { regOBA("RuleType"); return this; }
    public BsTRulesCQ addOrderBy_Ruletype_Desc() { regOBD("RuleType"); return this; }

    protected ConditionValue _ruleactive;
    public ConditionValue getRuleactive() {
        if (_ruleactive == null) { _ruleactive = new ConditionValue(); }
        return _ruleactive;
    }
    protected ConditionValue getCValueRuleactive() { return getRuleactive(); }

    public BsTRulesCQ addOrderBy_Ruleactive_Asc() { regOBA("RuleActive"); return this; }
    public BsTRulesCQ addOrderBy_Ruleactive_Desc() { regOBD("RuleActive"); return this; }

    protected ConditionValue _errormsg;
    public ConditionValue getErrormsg() {
        if (_errormsg == null) { _errormsg = new ConditionValue(); }
        return _errormsg;
    }
    protected ConditionValue getCValueErrormsg() { return getErrormsg(); }

    public BsTRulesCQ addOrderBy_Errormsg_Asc() { regOBA("ErrorMsg"); return this; }
    public BsTRulesCQ addOrderBy_Errormsg_Desc() { regOBD("ErrorMsg"); return this; }

    protected ConditionValue _flags;
    public ConditionValue getFlags() {
        if (_flags == null) { _flags = new ConditionValue(); }
        return _flags;
    }
    protected ConditionValue getCValueFlags() { return getFlags(); }

    public BsTRulesCQ addOrderBy_Flags_Asc() { regOBA("Flags"); return this; }
    public BsTRulesCQ addOrderBy_Flags_Desc() { regOBD("Flags"); return this; }

    protected ConditionValue _ruleocl;
    public ConditionValue getRuleocl() {
        if (_ruleocl == null) { _ruleocl = new ConditionValue(); }
        return _ruleocl;
    }
    protected ConditionValue getCValueRuleocl() { return getRuleocl(); }

    public BsTRulesCQ addOrderBy_Ruleocl_Asc() { regOBA("RuleOCL"); return this; }
    public BsTRulesCQ addOrderBy_Ruleocl_Desc() { regOBD("RuleOCL"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTRulesCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTRulesCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _rulexml;
    public ConditionValue getRulexml() {
        if (_rulexml == null) { _rulexml = new ConditionValue(); }
        return _rulexml;
    }
    protected ConditionValue getCValueRulexml() { return getRulexml(); }

    public BsTRulesCQ addOrderBy_Rulexml_Asc() { regOBA("RuleXML"); return this; }
    public BsTRulesCQ addOrderBy_Rulexml_Desc() { regOBD("RuleXML"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTRulesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTRulesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TRulesCB.class.getName(); }
    String xCQ() { return TRulesCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
