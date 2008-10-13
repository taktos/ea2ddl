package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_risktypes.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTRisktypesCQ extends AbstractBsTRisktypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TRisktypesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTRisktypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_risktypes) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TRisktypesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TRisktypesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_risktypes on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TRisktypesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TRisktypesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _risk;
    public ConditionValue getRisk() {
        if (_risk == null) { _risk = new ConditionValue(); }
        return _risk;
    }
    protected ConditionValue getCValueRisk() { return getRisk(); }
    
    public BsTRisktypesCQ addOrderBy_Risk_Asc() { regOBA("Risk"); return this; }
    public BsTRisktypesCQ addOrderBy_Risk_Desc() { regOBD("Risk"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }
    
    public BsTRisktypesCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTRisktypesCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    protected ConditionValue _numericweight;
    public ConditionValue getNumericweight() {
        if (_numericweight == null) { _numericweight = new ConditionValue(); }
        return _numericweight;
    }
    protected ConditionValue getCValueNumericweight() { return getNumericweight(); }
          
    public BsTRisktypesCQ addOrderBy_Numericweight_Asc() { regOBA("NumericWeight"); return this; }
    public BsTRisktypesCQ addOrderBy_Numericweight_Desc() { regOBD("NumericWeight"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTRisktypesCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTRisktypesCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTRisktypesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTRisktypesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TRisktypesCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}