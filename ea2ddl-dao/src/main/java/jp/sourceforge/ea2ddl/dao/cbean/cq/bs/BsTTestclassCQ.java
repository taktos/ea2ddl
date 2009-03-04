package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_testclass.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTestclassCQ extends AbstractBsTTestclassCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTestclassCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTestclassCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_testclass) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TTestclassCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TTestclassCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_testclass on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TTestclassCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TTestclassCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _testclass;
    public ConditionValue getTestclass() {
        if (_testclass == null) { _testclass = new ConditionValue(); }
        return _testclass;
    }
    protected ConditionValue getCValueTestclass() { return getTestclass(); }

    public BsTTestclassCQ addOrderBy_Testclass_Asc() { regOBA("TestClass"); return this; }
    public BsTTestclassCQ addOrderBy_Testclass_Desc() { regOBD("TestClass"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    public BsTTestclassCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTTestclassCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTTestclassCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTTestclassCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TTestclassCB.class.getName(); }
    String xCQ() { return TTestclassCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
