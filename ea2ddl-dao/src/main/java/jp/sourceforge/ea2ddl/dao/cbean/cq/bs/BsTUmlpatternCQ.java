package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_umlpattern.
 * @author DBFlute(AutoGenerator)
 */
public class BsTUmlpatternCQ extends AbstractBsTUmlpatternCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TUmlpatternCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTUmlpatternCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_umlpattern) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TUmlpatternCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TUmlpatternCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_umlpattern on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TUmlpatternCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TUmlpatternCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _patternid;
    public ConditionValue getPatternid() {
        if (_patternid == null) { _patternid = new ConditionValue(); }
        return _patternid;
    }
    protected ConditionValue getCValuePatternid() { return getPatternid(); }

    public BsTUmlpatternCQ addOrderBy_Patternid_Asc() { regOBA("PatternID"); return this; }
    public BsTUmlpatternCQ addOrderBy_Patternid_Desc() { regOBD("PatternID"); return this; }

    protected ConditionValue _patterncategory;
    public ConditionValue getPatterncategory() {
        if (_patterncategory == null) { _patterncategory = new ConditionValue(); }
        return _patterncategory;
    }
    protected ConditionValue getCValuePatterncategory() { return getPatterncategory(); }

    public BsTUmlpatternCQ addOrderBy_Patterncategory_Asc() { regOBA("PatternCategory"); return this; }
    public BsTUmlpatternCQ addOrderBy_Patterncategory_Desc() { regOBD("PatternCategory"); return this; }

    protected ConditionValue _patternname;
    public ConditionValue getPatternname() {
        if (_patternname == null) { _patternname = new ConditionValue(); }
        return _patternname;
    }
    protected ConditionValue getCValuePatternname() { return getPatternname(); }

    public BsTUmlpatternCQ addOrderBy_Patternname_Asc() { regOBA("PatternName"); return this; }
    public BsTUmlpatternCQ addOrderBy_Patternname_Desc() { regOBD("PatternName"); return this; }

    protected ConditionValue _style;
    public ConditionValue getStyle() {
        if (_style == null) { _style = new ConditionValue(); }
        return _style;
    }
    protected ConditionValue getCValueStyle() { return getStyle(); }

    public BsTUmlpatternCQ addOrderBy_Style_Asc() { regOBA("Style"); return this; }
    public BsTUmlpatternCQ addOrderBy_Style_Desc() { regOBD("Style"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTUmlpatternCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTUmlpatternCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _patternxml;
    public ConditionValue getPatternxml() {
        if (_patternxml == null) { _patternxml = new ConditionValue(); }
        return _patternxml;
    }
    protected ConditionValue getCValuePatternxml() { return getPatternxml(); }

    public BsTUmlpatternCQ addOrderBy_Patternxml_Asc() { regOBA("PatternXML"); return this; }
    public BsTUmlpatternCQ addOrderBy_Patternxml_Desc() { regOBD("PatternXML"); return this; }

    protected ConditionValue _version;
    public ConditionValue getVersion() {
        if (_version == null) { _version = new ConditionValue(); }
        return _version;
    }
    protected ConditionValue getCValueVersion() { return getVersion(); }

    public BsTUmlpatternCQ addOrderBy_Version_Asc() { regOBA("Version"); return this; }
    public BsTUmlpatternCQ addOrderBy_Version_Desc() { regOBD("Version"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTUmlpatternCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTUmlpatternCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TUmlpatternCB.class.getName(); }
    String xCQ() { return TUmlpatternCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
