package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objecttrx.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjecttrxCQ extends AbstractBsTObjecttrxCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjecttrxCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjecttrxCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objecttrx) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjecttrxCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjecttrxCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objecttrx on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjecttrxCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TObjecttrxCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
          
    public BsTObjecttrxCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjecttrxCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _trx;
    public ConditionValue getTrx() {
        if (_trx == null) { _trx = new ConditionValue(); }
        return _trx;
    }
    protected ConditionValue getCValueTrx() { return getTrx(); }
    
    public BsTObjecttrxCQ addOrderBy_Trx_Asc() { regOBA("TRX"); return this; }
    public BsTObjecttrxCQ addOrderBy_Trx_Desc() { regOBD("TRX"); return this; }

    protected ConditionValue _trxtype;
    public ConditionValue getTrxtype() {
        if (_trxtype == null) { _trxtype = new ConditionValue(); }
        return _trxtype;
    }
    protected ConditionValue getCValueTrxtype() { return getTrxtype(); }
    
    public BsTObjecttrxCQ addOrderBy_Trxtype_Asc() { regOBA("TRXType"); return this; }
    public BsTObjecttrxCQ addOrderBy_Trxtype_Desc() { regOBD("TRXType"); return this; }

    protected ConditionValue _weight;
    public ConditionValue getWeight() {
        if (_weight == null) { _weight = new ConditionValue(); }
        return _weight;
    }
    protected ConditionValue getCValueWeight() { return getWeight(); }
          
    public BsTObjecttrxCQ addOrderBy_Weight_Asc() { regOBA("Weight"); return this; }
    public BsTObjecttrxCQ addOrderBy_Weight_Desc() { regOBD("Weight"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTObjecttrxCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTObjecttrxCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjecttrxCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjecttrxCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TObjecttrxCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
