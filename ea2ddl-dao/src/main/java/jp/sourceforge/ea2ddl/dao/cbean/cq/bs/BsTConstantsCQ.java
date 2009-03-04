package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_constants.
 * @author DBFlute(AutoGenerator)
 */
public class BsTConstantsCQ extends AbstractBsTConstantsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TConstantsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTConstantsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_constants) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TConstantsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TConstantsCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_constants on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TConstantsCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TConstantsCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _constantname;
    public ConditionValue getConstantname() {
        if (_constantname == null) { _constantname = new ConditionValue(); }
        return _constantname;
    }
    protected ConditionValue getCValueConstantname() { return getConstantname(); }

    public BsTConstantsCQ addOrderBy_Constantname_Asc() { regOBA("ConstantName"); return this; }
    public BsTConstantsCQ addOrderBy_Constantname_Desc() { regOBD("ConstantName"); return this; }

    protected ConditionValue _constantvalue;
    public ConditionValue getConstantvalue() {
        if (_constantvalue == null) { _constantvalue = new ConditionValue(); }
        return _constantvalue;
    }
    protected ConditionValue getCValueConstantvalue() { return getConstantvalue(); }

    public BsTConstantsCQ addOrderBy_Constantvalue_Asc() { regOBA("ConstantValue"); return this; }
    public BsTConstantsCQ addOrderBy_Constantvalue_Desc() { regOBD("ConstantValue"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTConstantsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTConstantsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TConstantsCB.class.getName(); }
    String xCQ() { return TConstantsCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
