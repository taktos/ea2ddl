package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of usysTables.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsUsystablesCQ extends AbstractBsUsystablesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UsystablesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUsystablesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from usysTables) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public UsystablesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new UsystablesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join usysTables on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public UsystablesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        UsystablesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _tablename;
    public ConditionValue getTablename() {
        if (_tablename == null) { _tablename = new ConditionValue(); }
        return _tablename;
    }
    protected ConditionValue getCValueTablename() { return getTablename(); }
    
    public BsUsystablesCQ addOrderBy_Tablename_Asc() { regOBA("TableName"); return this; }
    public BsUsystablesCQ addOrderBy_Tablename_Desc() { regOBD("TableName"); return this; }

    protected ConditionValue _relorder;
    public ConditionValue getRelorder() {
        if (_relorder == null) { _relorder = new ConditionValue(); }
        return _relorder;
    }
    protected ConditionValue getCValueRelorder() { return getRelorder(); }
          
    public BsUsystablesCQ addOrderBy_Relorder_Asc() { regOBA("RelOrder"); return this; }
    public BsUsystablesCQ addOrderBy_Relorder_Desc() { regOBD("RelOrder"); return this; }

    protected ConditionValue _displayname;
    public ConditionValue getDisplayname() {
        if (_displayname == null) { _displayname = new ConditionValue(); }
        return _displayname;
    }
    protected ConditionValue getCValueDisplayname() { return getDisplayname(); }
    
    public BsUsystablesCQ addOrderBy_Displayname_Asc() { regOBA("DisplayName"); return this; }
    public BsUsystablesCQ addOrderBy_Displayname_Desc() { regOBD("DisplayName"); return this; }

    protected ConditionValue _fromver;
    public ConditionValue getFromver() {
        if (_fromver == null) { _fromver = new ConditionValue(); }
        return _fromver;
    }
    protected ConditionValue getCValueFromver() { return getFromver(); }
    
    public BsUsystablesCQ addOrderBy_Fromver_Asc() { regOBA("FromVer"); return this; }
    public BsUsystablesCQ addOrderBy_Fromver_Desc() { regOBD("FromVer"); return this; }

    protected ConditionValue _tover;
    public ConditionValue getTover() {
        if (_tover == null) { _tover = new ConditionValue(); }
        return _tover;
    }
    protected ConditionValue getCValueTover() { return getTover(); }
    
    public BsUsystablesCQ addOrderBy_Tover_Asc() { regOBA("ToVer"); return this; }
    public BsUsystablesCQ addOrderBy_Tover_Desc() { regOBD("ToVer"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsUsystablesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsUsystablesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return UsystablesCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
