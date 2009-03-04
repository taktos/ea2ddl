package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_paletteitem.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPaletteitemCQ extends AbstractBsTPaletteitemCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPaletteitemCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPaletteitemCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_paletteitem) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TPaletteitemCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TPaletteitemCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_paletteitem on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TPaletteitemCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TPaletteitemCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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

    public BsTPaletteitemCQ addOrderBy_Paletteid_Asc() { regOBA("PaletteID"); return this; }
    public BsTPaletteitemCQ addOrderBy_Paletteid_Desc() { regOBD("PaletteID"); return this; }

    protected ConditionValue _itemid;
    public ConditionValue getItemid() {
        if (_itemid == null) { _itemid = new ConditionValue(); }
        return _itemid;
    }
    protected ConditionValue getCValueItemid() { return getItemid(); }

    public BsTPaletteitemCQ addOrderBy_Itemid_Asc() { regOBA("ItemID"); return this; }
    public BsTPaletteitemCQ addOrderBy_Itemid_Desc() { regOBD("ItemID"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTPaletteitemCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTPaletteitemCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TPaletteitemCB.class.getName(); }
    String xCQ() { return TPaletteitemCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
