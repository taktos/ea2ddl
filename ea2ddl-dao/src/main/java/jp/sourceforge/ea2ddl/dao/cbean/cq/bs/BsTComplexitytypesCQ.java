package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_complexitytypes.
 * @author DBFlute(AutoGenerator)
 */
public class BsTComplexitytypesCQ extends AbstractBsTComplexitytypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TComplexitytypesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTComplexitytypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_complexitytypes) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TComplexitytypesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TComplexitytypesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_complexitytypes on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TComplexitytypesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TComplexitytypesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _complexity;
    public ConditionValue getComplexity() {
        if (_complexity == null) { _complexity = new ConditionValue(); }
        return _complexity;
    }
    protected ConditionValue getCValueComplexity() { return getComplexity(); }

    public BsTComplexitytypesCQ addOrderBy_Complexity_Asc() { regOBA("Complexity"); return this; }
    public BsTComplexitytypesCQ addOrderBy_Complexity_Desc() { regOBD("Complexity"); return this; }

    protected ConditionValue _numericweight;
    public ConditionValue getNumericweight() {
        if (_numericweight == null) { _numericweight = new ConditionValue(); }
        return _numericweight;
    }
    protected ConditionValue getCValueNumericweight() { return getNumericweight(); }

    public BsTComplexitytypesCQ addOrderBy_Numericweight_Asc() { regOBA("NumericWeight"); return this; }
    public BsTComplexitytypesCQ addOrderBy_Numericweight_Desc() { regOBD("NumericWeight"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTComplexitytypesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTComplexitytypesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TComplexitytypesCB.class.getName(); }
    String xCQ() { return TComplexitytypesCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
