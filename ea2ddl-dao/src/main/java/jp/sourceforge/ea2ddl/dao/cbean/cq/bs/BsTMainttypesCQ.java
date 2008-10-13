package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_mainttypes.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTMainttypesCQ extends AbstractBsTMainttypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TMainttypesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTMainttypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_mainttypes) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TMainttypesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TMainttypesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_mainttypes on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TMainttypesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TMainttypesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _mainttype;
    public ConditionValue getMainttype() {
        if (_mainttype == null) { _mainttype = new ConditionValue(); }
        return _mainttype;
    }
    protected ConditionValue getCValueMainttype() { return getMainttype(); }
    
    public BsTMainttypesCQ addOrderBy_Mainttype_Asc() { regOBA("MaintType"); return this; }
    public BsTMainttypesCQ addOrderBy_Mainttype_Desc() { regOBD("MaintType"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }
    
    public BsTMainttypesCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTMainttypesCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    protected ConditionValue _numericweight;
    public ConditionValue getNumericweight() {
        if (_numericweight == null) { _numericweight = new ConditionValue(); }
        return _numericweight;
    }
    protected ConditionValue getCValueNumericweight() { return getNumericweight(); }
          
    public BsTMainttypesCQ addOrderBy_Numericweight_Asc() { regOBA("NumericWeight"); return this; }
    public BsTMainttypesCQ addOrderBy_Numericweight_Desc() { regOBD("NumericWeight"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTMainttypesCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTMainttypesCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTMainttypesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTMainttypesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TMainttypesCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
