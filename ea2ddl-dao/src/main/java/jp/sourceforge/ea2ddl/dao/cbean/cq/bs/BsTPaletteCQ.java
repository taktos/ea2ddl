package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_palette.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPaletteCQ extends AbstractBsTPaletteCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPaletteCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPaletteCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_palette) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TPaletteCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TPaletteCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_palette on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TPaletteCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TPaletteCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _paletteid;
    public ConditionValue getPaletteid() {
        if (_paletteid == null) { _paletteid = new ConditionValue(); }
        return _paletteid;
    }
    protected ConditionValue getCValuePaletteid() { return getPaletteid(); }

    public BsTPaletteCQ addOrderBy_Paletteid_Asc() { regOBA("PaletteID"); return this; }
    public BsTPaletteCQ addOrderBy_Paletteid_Desc() { regOBD("PaletteID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    public BsTPaletteCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTPaletteCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }

    public BsTPaletteCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTPaletteCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTPaletteCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTPaletteCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TPaletteCB.class.getName(); }
    String xCQ() { return TPaletteCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
