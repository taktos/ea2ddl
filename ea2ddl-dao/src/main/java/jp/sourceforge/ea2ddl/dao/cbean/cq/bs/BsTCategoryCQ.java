package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_category.
 * @author DBFlute(AutoGenerator)
 */
public class BsTCategoryCQ extends AbstractBsTCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TCategoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCategoryCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_category) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TCategoryCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TCategoryCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_category on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TCategoryCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TCategoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _categoryid;
    public ConditionValue getCategoryid() {
        if (_categoryid == null) { _categoryid = new ConditionValue(); }
        return _categoryid;
    }
    protected ConditionValue getCValueCategoryid() { return getCategoryid(); }

    public BsTCategoryCQ addOrderBy_Categoryid_Asc() { regOBA("CategoryID"); return this; }
    public BsTCategoryCQ addOrderBy_Categoryid_Desc() { regOBD("CategoryID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    public BsTCategoryCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTCategoryCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }

    public BsTCategoryCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTCategoryCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTCategoryCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }
    public BsTCategoryCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTCategoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTCategoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TCategoryCB.class.getName(); }
    String xCQ() { return TCategoryCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
