package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_implement.
 * @author DBFlute(AutoGenerator)
 */
public class BsTImplementCQ extends AbstractBsTImplementCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TImplementCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTImplementCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_implement) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TImplementCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TImplementCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_implement on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TImplementCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TImplementCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }

    public BsTImplementCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTImplementCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTImplementCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTImplementCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TImplementCB.class.getName(); }
    String xCQ() { return TImplementCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
