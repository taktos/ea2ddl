package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objectmetrics.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjectmetricsCQ extends AbstractBsTObjectmetricsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectmetricsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectmetricsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objectmetrics) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjectmetricsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjectmetricsCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objectmetrics on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjectmetricsCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TObjectmetricsCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
          
    public BsTObjectmetricsCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjectmetricsCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _metric;
    public ConditionValue getMetric() {
        if (_metric == null) { _metric = new ConditionValue(); }
        return _metric;
    }
    protected ConditionValue getCValueMetric() { return getMetric(); }
    
    public BsTObjectmetricsCQ addOrderBy_Metric_Asc() { regOBA("Metric"); return this; }
    public BsTObjectmetricsCQ addOrderBy_Metric_Desc() { regOBD("Metric"); return this; }

    protected ConditionValue _metrictype;
    public ConditionValue getMetrictype() {
        if (_metrictype == null) { _metrictype = new ConditionValue(); }
        return _metrictype;
    }
    protected ConditionValue getCValueMetrictype() { return getMetrictype(); }
    
    public BsTObjectmetricsCQ addOrderBy_Metrictype_Asc() { regOBA("MetricType"); return this; }
    public BsTObjectmetricsCQ addOrderBy_Metrictype_Desc() { regOBD("MetricType"); return this; }

    protected ConditionValue _evalue;
    public ConditionValue getEvalue() {
        if (_evalue == null) { _evalue = new ConditionValue(); }
        return _evalue;
    }
    protected ConditionValue getCValueEvalue() { return getEvalue(); }
          
    public BsTObjectmetricsCQ addOrderBy_Evalue_Asc() { regOBA("EValue"); return this; }
    public BsTObjectmetricsCQ addOrderBy_Evalue_Desc() { regOBD("EValue"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTObjectmetricsCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTObjectmetricsCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjectmetricsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjectmetricsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TObjectmetricsCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
