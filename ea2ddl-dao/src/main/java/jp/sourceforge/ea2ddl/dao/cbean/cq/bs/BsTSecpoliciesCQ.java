package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_secpolicies.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTSecpoliciesCQ extends AbstractBsTSecpoliciesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TSecpoliciesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSecpoliciesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_secpolicies) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TSecpoliciesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TSecpoliciesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_secpolicies on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TSecpoliciesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TSecpoliciesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _property;
    public ConditionValue getProperty() {
        if (_property == null) { _property = new ConditionValue(); }
        return _property;
    }
    protected ConditionValue getCValueProperty() { return getProperty(); }
    
    public BsTSecpoliciesCQ addOrderBy_Property_Asc() { regOBA("Property"); return this; }
    public BsTSecpoliciesCQ addOrderBy_Property_Desc() { regOBD("Property"); return this; }

    protected ConditionValue _value;
    public ConditionValue getValue() {
        if (_value == null) { _value = new ConditionValue(); }
        return _value;
    }
    protected ConditionValue getCValueValue() { return getValue(); }
    
    public BsTSecpoliciesCQ addOrderBy_Value_Asc() { regOBA("Value"); return this; }
    public BsTSecpoliciesCQ addOrderBy_Value_Desc() { regOBD("Value"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTSecpoliciesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTSecpoliciesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TSecpoliciesCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
