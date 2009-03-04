package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_lists.
 * @author DBFlute(AutoGenerator)
 */
public class BsTListsCQ extends AbstractBsTListsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TListsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTListsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_lists) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TListsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TListsCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_lists on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TListsCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TListsCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _listid;
    public ConditionValue getListid() {
        if (_listid == null) { _listid = new ConditionValue(); }
        return _listid;
    }
    protected ConditionValue getCValueListid() { return getListid(); }

    public BsTListsCQ addOrderBy_Listid_Asc() { regOBA("ListID"); return this; }
    public BsTListsCQ addOrderBy_Listid_Desc() { regOBD("ListID"); return this; }

    protected ConditionValue _category;
    public ConditionValue getCategory() {
        if (_category == null) { _category = new ConditionValue(); }
        return _category;
    }
    protected ConditionValue getCValueCategory() { return getCategory(); }

    public BsTListsCQ addOrderBy_Category_Asc() { regOBA("Category"); return this; }
    public BsTListsCQ addOrderBy_Category_Desc() { regOBD("Category"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    public BsTListsCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTListsCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _nval;
    public ConditionValue getNval() {
        if (_nval == null) { _nval = new ConditionValue(); }
        return _nval;
    }
    protected ConditionValue getCValueNval() { return getNval(); }

    public BsTListsCQ addOrderBy_Nval_Asc() { regOBA("NVal"); return this; }
    public BsTListsCQ addOrderBy_Nval_Desc() { regOBD("NVal"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTListsCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTListsCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTListsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTListsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TListsCB.class.getName(); }
    String xCQ() { return TListsCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
