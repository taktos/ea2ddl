package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_problemtypes.
 * @author DBFlute(AutoGenerator)
 */
public class BsTProblemtypesCQ extends AbstractBsTProblemtypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TProblemtypesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTProblemtypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_problemtypes) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TProblemtypesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TProblemtypesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_problemtypes on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TProblemtypesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TProblemtypesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _problemtype;
    public ConditionValue getProblemtype() {
        if (_problemtype == null) { _problemtype = new ConditionValue(); }
        return _problemtype;
    }
    protected ConditionValue getCValueProblemtype() { return getProblemtype(); }

    public BsTProblemtypesCQ addOrderBy_Problemtype_Asc() { regOBA("ProblemType"); return this; }
    public BsTProblemtypesCQ addOrderBy_Problemtype_Desc() { regOBD("ProblemType"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    public BsTProblemtypesCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTProblemtypesCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    protected ConditionValue _numericweight;
    public ConditionValue getNumericweight() {
        if (_numericweight == null) { _numericweight = new ConditionValue(); }
        return _numericweight;
    }
    protected ConditionValue getCValueNumericweight() { return getNumericweight(); }

    public BsTProblemtypesCQ addOrderBy_Numericweight_Asc() { regOBA("NumericWeight"); return this; }
    public BsTProblemtypesCQ addOrderBy_Numericweight_Desc() { regOBD("NumericWeight"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTProblemtypesCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTProblemtypesCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTProblemtypesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTProblemtypesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TProblemtypesCB.class.getName(); }
    String xCQ() { return TProblemtypesCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
