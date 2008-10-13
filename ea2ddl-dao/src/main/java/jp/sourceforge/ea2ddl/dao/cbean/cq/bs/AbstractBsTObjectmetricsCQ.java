package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_objectmetrics.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTObjectmetricsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectmetricsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectmetrics";
    }
    
    public String getTableSqlName() {
        return "t_objectmetrics";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : INTEGER}
     * @param objectId The value of objectId as equal.
     */
    public void setObjectId_Equal(java.lang.Integer objectId) {
        regObjectId(CK_EQ, objectId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as notEqual.
     */
    public void setObjectId_NotEqual(java.lang.Integer objectId) {
        regObjectId(CK_NE, objectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as greaterThan.
     */
    public void setObjectId_GreaterThan(java.lang.Integer objectId) {
        regObjectId(CK_GT, objectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as lessThan.
     */
    public void setObjectId_LessThan(java.lang.Integer objectId) {
        regObjectId(CK_LT, objectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as greaterEqual.
     */
    public void setObjectId_GreaterEqual(java.lang.Integer objectId) {
        regObjectId(CK_GE, objectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as lessEqual.
     */
    public void setObjectId_LessEqual(java.lang.Integer objectId) {
        regObjectId(CK_LE, objectId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param objectIdList The collection of objectId as inScope.
     */
    public void setObjectId_InScope(Collection<java.lang.Integer> objectIdList) {
        regObjectId(CK_INS, cTL(objectIdList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setObjectId_IsNull() { regObjectId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setObjectId_IsNotNull() { regObjectId(CK_ISNN, DUMMY_OBJECT); }

    protected void regObjectId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueObjectId(), "Object_ID", "ObjectId", "objectId");
    }
    protected void registerInlineObjectId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueObjectId(), "Object_ID", "ObjectId", "objectId");
    }
    abstract protected ConditionValue getCValueObjectId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(255)}
     * @param metric The value of metric as equal.
     */
    public void setMetric_Equal(String metric) {
        regMetric(CK_EQ, fRES(metric));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param metric The value of metric as notEqual.
     */
    public void setMetric_NotEqual(String metric) {
        regMetric(CK_NE, fRES(metric));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param metric The value of metric as greaterThan.
     */
    public void setMetric_GreaterThan(String metric) {
        regMetric(CK_GT, fRES(metric));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param metric The value of metric as lessThan.
     */
    public void setMetric_LessThan(String metric) {
        regMetric(CK_LT, fRES(metric));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param metric The value of metric as greaterEqual.
     */
    public void setMetric_GreaterEqual(String metric) {
        regMetric(CK_GE, fRES(metric));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param metric The value of metric as lessEqual.
     */
    public void setMetric_LessEqual(String metric) {
        regMetric(CK_LE, fRES(metric));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param metric The value of metric as prefixSearch.
     */
    public void setMetric_PrefixSearch(String metric) {
        regMetric(CK_PS, fRES(metric));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param metric The value of metric as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMetric_LikeSearch(String metric, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(metric), getCValueMetric(), "Metric", "Metric", "metric", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param metricList The collection of metric as inScope.
     */
    public void setMetric_InScope(Collection<String> metricList) {
        regMetric(CK_INS, cTL(metricList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param metric The collection of metric as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setMetric_InScope(String metric, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(metric), getCValueMetric(), "Metric", "Metric", "metric", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setMetric_IsNull() { regMetric(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setMetric_IsNotNull() { regMetric(CK_ISNN, DUMMY_OBJECT); }

    protected void regMetric(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueMetric(), "Metric", "Metric", "metric");
    }
    protected void registerInlineMetric(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueMetric(), "Metric", "Metric", "metric");
    }
    abstract protected ConditionValue getCValueMetric();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(12)}
     * @param metrictype The value of metrictype as equal.
     */
    public void setMetrictype_Equal(String metrictype) {
        regMetrictype(CK_EQ, fRES(metrictype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param metrictype The value of metrictype as notEqual.
     */
    public void setMetrictype_NotEqual(String metrictype) {
        regMetrictype(CK_NE, fRES(metrictype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param metrictype The value of metrictype as greaterThan.
     */
    public void setMetrictype_GreaterThan(String metrictype) {
        regMetrictype(CK_GT, fRES(metrictype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param metrictype The value of metrictype as lessThan.
     */
    public void setMetrictype_LessThan(String metrictype) {
        regMetrictype(CK_LT, fRES(metrictype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param metrictype The value of metrictype as greaterEqual.
     */
    public void setMetrictype_GreaterEqual(String metrictype) {
        regMetrictype(CK_GE, fRES(metrictype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param metrictype The value of metrictype as lessEqual.
     */
    public void setMetrictype_LessEqual(String metrictype) {
        regMetrictype(CK_LE, fRES(metrictype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param metrictype The value of metrictype as prefixSearch.
     */
    public void setMetrictype_PrefixSearch(String metrictype) {
        regMetrictype(CK_PS, fRES(metrictype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param metrictype The value of metrictype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMetrictype_LikeSearch(String metrictype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(metrictype), getCValueMetrictype(), "MetricType", "Metrictype", "metrictype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param metrictypeList The collection of metrictype as inScope.
     */
    public void setMetrictype_InScope(Collection<String> metrictypeList) {
        regMetrictype(CK_INS, cTL(metrictypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param metrictype The collection of metrictype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setMetrictype_InScope(String metrictype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(metrictype), getCValueMetrictype(), "MetricType", "Metrictype", "metrictype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setMetrictype_IsNull() { regMetrictype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setMetrictype_IsNotNull() { regMetrictype(CK_ISNN, DUMMY_OBJECT); }

    protected void regMetrictype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueMetrictype(), "MetricType", "Metrictype", "metrictype");
    }
    protected void registerInlineMetrictype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueMetrictype(), "MetricType", "Metrictype", "metrictype");
    }
    abstract protected ConditionValue getCValueMetrictype();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DOUBLE}
     * @param evalue The value of evalue as equal.
     */
    public void setEvalue_Equal(java.math.BigDecimal evalue) {
        regEvalue(CK_EQ, evalue);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param evalue The value of evalue as notEqual.
     */
    public void setEvalue_NotEqual(java.math.BigDecimal evalue) {
        regEvalue(CK_NE, evalue);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param evalue The value of evalue as greaterThan.
     */
    public void setEvalue_GreaterThan(java.math.BigDecimal evalue) {
        regEvalue(CK_GT, evalue);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param evalue The value of evalue as lessThan.
     */
    public void setEvalue_LessThan(java.math.BigDecimal evalue) {
        regEvalue(CK_LT, evalue);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param evalue The value of evalue as greaterEqual.
     */
    public void setEvalue_GreaterEqual(java.math.BigDecimal evalue) {
        regEvalue(CK_GE, evalue);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param evalue The value of evalue as lessEqual.
     */
    public void setEvalue_LessEqual(java.math.BigDecimal evalue) {
        regEvalue(CK_LE, evalue);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param evalueList The collection of evalue as inScope.
     */
    public void setEvalue_InScope(Collection<java.math.BigDecimal> evalueList) {
        regEvalue(CK_INS, cTL(evalueList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setEvalue_IsNull() { regEvalue(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setEvalue_IsNotNull() { regEvalue(CK_ISNN, DUMMY_OBJECT); }

    protected void regEvalue(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueEvalue(), "EValue", "Evalue", "evalue");
    }
    protected void registerInlineEvalue(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueEvalue(), "EValue", "Evalue", "evalue");
    }
    abstract protected ConditionValue getCValueEvalue();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(String notes) {
        regNotes(CK_EQ, fRES(notes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(String notes) {
        regNotes(CK_NE, fRES(notes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(String notes) {
        regNotes(CK_PS, fRES(notes));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(notes), getCValueNotes(), "Notes", "Notes", "notes", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(Collection<String> notesList) {
        regNotes(CK_INS, cTL(notesList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notes The collection of notes as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setNotes_InScope(String notes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(notes), getCValueNotes(), "Notes", "Notes", "notes", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DUMMY_OBJECT); }

    protected void regNotes(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNotes(), "Notes", "Notes", "notes");
    }
    protected void registerInlineNotes(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNotes(), "Notes", "Notes", "notes");
    }
    abstract protected ConditionValue getCValueNotes();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TObjectmetricsCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TObjectmetricsCQ.class.getName(); }
}
