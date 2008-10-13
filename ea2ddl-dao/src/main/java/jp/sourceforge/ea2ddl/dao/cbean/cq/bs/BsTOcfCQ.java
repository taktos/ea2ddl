package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_ocf.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTOcfCQ extends AbstractBsTOcfCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TOcfCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTOcfCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_ocf) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TOcfCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TOcfCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_ocf on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TOcfCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TOcfCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _objecttype;
    public ConditionValue getObjecttype() {
        if (_objecttype == null) { _objecttype = new ConditionValue(); }
        return _objecttype;
    }
    protected ConditionValue getCValueObjecttype() { return getObjecttype(); }
    
    public BsTOcfCQ addOrderBy_Objecttype_Asc() { regOBA("ObjectType"); return this; }
    public BsTOcfCQ addOrderBy_Objecttype_Desc() { regOBD("ObjectType"); return this; }

    protected ConditionValue _complexityweight;
    public ConditionValue getComplexityweight() {
        if (_complexityweight == null) { _complexityweight = new ConditionValue(); }
        return _complexityweight;
    }
    protected ConditionValue getCValueComplexityweight() { return getComplexityweight(); }
          
    public BsTOcfCQ addOrderBy_Complexityweight_Asc() { regOBA("ComplexityWeight"); return this; }
    public BsTOcfCQ addOrderBy_Complexityweight_Desc() { regOBD("ComplexityWeight"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTOcfCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTOcfCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TOcfCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
