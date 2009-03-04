package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_method.
 * @author DBFlute(AutoGenerator)
 */
public class BsTMethodCQ extends AbstractBsTMethodCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TMethodCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTMethodCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_method) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TMethodCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TMethodCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_method on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TMethodCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TMethodCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _objectId;
    public ConditionValue getObjectId() {
        if (_objectId == null) { _objectId = new ConditionValue(); }
        return _objectId;
    }
    protected ConditionValue getCValueObjectId() { return getObjectId(); }

    public BsTMethodCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTMethodCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    public BsTMethodCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTMethodCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _scope;
    public ConditionValue getScope() {
        if (_scope == null) { _scope = new ConditionValue(); }
        return _scope;
    }
    protected ConditionValue getCValueScope() { return getScope(); }

    public BsTMethodCQ addOrderBy_Scope_Asc() { regOBA("Scope"); return this; }
    public BsTMethodCQ addOrderBy_Scope_Desc() { regOBD("Scope"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }

    public BsTMethodCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTMethodCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTMethodCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTMethodCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TMethodCB.class.getName(); }
    String xCQ() { return TMethodCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
