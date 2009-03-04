package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_statustypes.
 * @author DBFlute(AutoGenerator)
 */
public class BsTStatustypesCQ extends AbstractBsTStatustypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TStatustypesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStatustypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_statustypes) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TStatustypesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TStatustypesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_statustypes on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TStatustypesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TStatustypesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _status;
    public ConditionValue getStatus() {
        if (_status == null) { _status = new ConditionValue(); }
        return _status;
    }
    protected ConditionValue getCValueStatus() { return getStatus(); }

    public BsTStatustypesCQ addOrderBy_Status_Asc() { regOBA("Status"); return this; }
    public BsTStatustypesCQ addOrderBy_Status_Desc() { regOBD("Status"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    public BsTStatustypesCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTStatustypesCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTStatustypesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTStatustypesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TStatustypesCB.class.getName(); }
    String xCQ() { return TStatustypesCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
