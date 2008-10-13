package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_primitives.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTPrimitivesCQ extends AbstractBsTPrimitivesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPrimitivesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPrimitivesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_primitives) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TPrimitivesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TPrimitivesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_primitives on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TPrimitivesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TPrimitivesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _datatype;
    public ConditionValue getDatatype() {
        if (_datatype == null) { _datatype = new ConditionValue(); }
        return _datatype;
    }
    protected ConditionValue getCValueDatatype() { return getDatatype(); }
    
    public BsTPrimitivesCQ addOrderBy_Datatype_Asc() { regOBA("Datatype"); return this; }
    public BsTPrimitivesCQ addOrderBy_Datatype_Desc() { regOBD("Datatype"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }
    
    public BsTPrimitivesCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTPrimitivesCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTPrimitivesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTPrimitivesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TPrimitivesCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
