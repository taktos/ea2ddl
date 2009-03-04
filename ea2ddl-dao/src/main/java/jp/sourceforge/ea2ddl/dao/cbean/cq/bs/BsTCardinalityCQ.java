package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_cardinality.
 * @author DBFlute(AutoGenerator)
 */
public class BsTCardinalityCQ extends AbstractBsTCardinalityCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TCardinalityCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCardinalityCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_cardinality) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TCardinalityCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TCardinalityCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_cardinality on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TCardinalityCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TCardinalityCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _cardinality;
    public ConditionValue getCardinality() {
        if (_cardinality == null) { _cardinality = new ConditionValue(); }
        return _cardinality;
    }
    protected ConditionValue getCValueCardinality() { return getCardinality(); }

    public BsTCardinalityCQ addOrderBy_Cardinality_Asc() { regOBA("Cardinality"); return this; }
    public BsTCardinalityCQ addOrderBy_Cardinality_Desc() { regOBD("Cardinality"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTCardinalityCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTCardinalityCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TCardinalityCB.class.getName(); }
    String xCQ() { return TCardinalityCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
