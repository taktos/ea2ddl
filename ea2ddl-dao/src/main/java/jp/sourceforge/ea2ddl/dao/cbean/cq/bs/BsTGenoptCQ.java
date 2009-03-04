package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_genopt.
 * @author DBFlute(AutoGenerator)
 */
public class BsTGenoptCQ extends AbstractBsTGenoptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TGenoptCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTGenoptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_genopt) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TGenoptCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TGenoptCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_genopt on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TGenoptCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TGenoptCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _appliesto;
    public ConditionValue getAppliesto() {
        if (_appliesto == null) { _appliesto = new ConditionValue(); }
        return _appliesto;
    }
    protected ConditionValue getCValueAppliesto() { return getAppliesto(); }

    public BsTGenoptCQ addOrderBy_Appliesto_Asc() { regOBA("AppliesTo"); return this; }
    public BsTGenoptCQ addOrderBy_Appliesto_Desc() { regOBD("AppliesTo"); return this; }

    protected ConditionValue _option;
    public ConditionValue getOption() {
        if (_option == null) { _option = new ConditionValue(); }
        return _option;
    }
    protected ConditionValue getCValueOption() { return getOption(); }

    public BsTGenoptCQ addOrderBy_Option_Asc() { regOBA("Option"); return this; }
    public BsTGenoptCQ addOrderBy_Option_Desc() { regOBD("Option"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTGenoptCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTGenoptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TGenoptCB.class.getName(); }
    String xCQ() { return TGenoptCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
