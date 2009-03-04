package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_trxtypes.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrxtypesCQ extends AbstractBsTTrxtypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrxtypesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrxtypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_trxtypes) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TTrxtypesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TTrxtypesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_trxtypes on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TTrxtypesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TTrxtypesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    public BsTTrxtypesCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTTrxtypesCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    protected ConditionValue _numericweight;
    public ConditionValue getNumericweight() {
        if (_numericweight == null) { _numericweight = new ConditionValue(); }
        return _numericweight;
    }
    protected ConditionValue getCValueNumericweight() { return getNumericweight(); }

    public BsTTrxtypesCQ addOrderBy_Numericweight_Asc() { regOBA("NumericWeight"); return this; }
    public BsTTrxtypesCQ addOrderBy_Numericweight_Desc() { regOBD("NumericWeight"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTTrxtypesCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTTrxtypesCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _trx;
    public ConditionValue getTrx() {
        if (_trx == null) { _trx = new ConditionValue(); }
        return _trx;
    }
    protected ConditionValue getCValueTrx() { return getTrx(); }

    public BsTTrxtypesCQ addOrderBy_Trx_Asc() { regOBA("TRX"); return this; }
    public BsTTrxtypesCQ addOrderBy_Trx_Desc() { regOBD("TRX"); return this; }

    protected ConditionValue _trxId;
    public ConditionValue getTrxId() {
        if (_trxId == null) { _trxId = new ConditionValue(); }
        return _trxId;
    }
    protected ConditionValue getCValueTrxId() { return getTrxId(); }

    public BsTTrxtypesCQ addOrderBy_TrxId_Asc() { regOBA("TRX_ID"); return this; }
    public BsTTrxtypesCQ addOrderBy_TrxId_Desc() { regOBD("TRX_ID"); return this; }

    protected ConditionValue _style;
    public ConditionValue getStyle() {
        if (_style == null) { _style = new ConditionValue(); }
        return _style;
    }
    protected ConditionValue getCValueStyle() { return getStyle(); }

    public BsTTrxtypesCQ addOrderBy_Style_Asc() { regOBA("Style"); return this; }
    public BsTTrxtypesCQ addOrderBy_Style_Desc() { regOBD("Style"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTTrxtypesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTTrxtypesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TTrxtypesCB.class.getName(); }
    String xCQ() { return TTrxtypesCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
