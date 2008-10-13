package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objectrisks.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjectrisksCQ extends AbstractBsTObjectrisksCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectrisksCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectrisksCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objectrisks) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjectrisksCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjectrisksCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objectrisks on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjectrisksCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TObjectrisksCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
          
    public BsTObjectrisksCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjectrisksCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _risk;
    public ConditionValue getRisk() {
        if (_risk == null) { _risk = new ConditionValue(); }
        return _risk;
    }
    protected ConditionValue getCValueRisk() { return getRisk(); }
    
    public BsTObjectrisksCQ addOrderBy_Risk_Asc() { regOBA("Risk"); return this; }
    public BsTObjectrisksCQ addOrderBy_Risk_Desc() { regOBD("Risk"); return this; }

    protected ConditionValue _risktype;
    public ConditionValue getRisktype() {
        if (_risktype == null) { _risktype = new ConditionValue(); }
        return _risktype;
    }
    protected ConditionValue getCValueRisktype() { return getRisktype(); }
    
    public BsTObjectrisksCQ addOrderBy_Risktype_Asc() { regOBA("RiskType"); return this; }
    public BsTObjectrisksCQ addOrderBy_Risktype_Desc() { regOBD("RiskType"); return this; }

    protected ConditionValue _evalue;
    public ConditionValue getEvalue() {
        if (_evalue == null) { _evalue = new ConditionValue(); }
        return _evalue;
    }
    protected ConditionValue getCValueEvalue() { return getEvalue(); }
          
    public BsTObjectrisksCQ addOrderBy_Evalue_Asc() { regOBA("EValue"); return this; }
    public BsTObjectrisksCQ addOrderBy_Evalue_Desc() { regOBD("EValue"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTObjectrisksCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTObjectrisksCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjectrisksCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjectrisksCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TObjectrisksCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
