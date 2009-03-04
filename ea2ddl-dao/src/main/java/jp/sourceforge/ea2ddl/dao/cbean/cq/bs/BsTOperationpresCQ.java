package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_operationpres.
 * @author DBFlute(AutoGenerator)
 */
public class BsTOperationpresCQ extends AbstractBsTOperationpresCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TOperationpresCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTOperationpresCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_operationpres) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TOperationpresCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TOperationpresCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_operationpres on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TOperationpresCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TOperationpresCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _operationid;
    public ConditionValue getOperationid() {
        if (_operationid == null) { _operationid = new ConditionValue(); }
        return _operationid;
    }
    protected ConditionValue getCValueOperationid() { return getOperationid(); }

    public BsTOperationpresCQ addOrderBy_Operationid_Asc() { regOBA("OperationID"); return this; }
    public BsTOperationpresCQ addOrderBy_Operationid_Desc() { regOBD("OperationID"); return this; }

    protected ConditionValue _precondition;
    public ConditionValue getPrecondition() {
        if (_precondition == null) { _precondition = new ConditionValue(); }
        return _precondition;
    }
    protected ConditionValue getCValuePrecondition() { return getPrecondition(); }

    public BsTOperationpresCQ addOrderBy_Precondition_Asc() { regOBA("PreCondition"); return this; }
    public BsTOperationpresCQ addOrderBy_Precondition_Desc() { regOBD("PreCondition"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }

    public BsTOperationpresCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTOperationpresCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTOperationpresCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTOperationpresCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTOperationpresCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTOperationpresCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TOperationpresCB.class.getName(); }
    String xCQ() { return TOperationpresCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
