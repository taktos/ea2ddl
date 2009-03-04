package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import jp.sourceforge.ea2ddl.dao.allcommon.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_objectmetrics.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTObjectmetricsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectmetricsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return _dbmetaProvider;
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : INTEGER}
     * @param objectId The value of objectId as equal.
     */
    public void setObjectId_Equal(java.lang.Integer objectId) {
        regObjectId(CK_EQ, objectId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as notEqual.
     */
    public void setObjectId_NotEqual(java.lang.Integer objectId) {
        regObjectId(CK_NE, objectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as greaterThan.
     */
    public void setObjectId_GreaterThan(java.lang.Integer objectId) {
        regObjectId(CK_GT, objectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as lessThan.
     */
    public void setObjectId_LessThan(java.lang.Integer objectId) {
        regObjectId(CK_LT, objectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as greaterEqual.
     */
    public void setObjectId_GreaterEqual(java.lang.Integer objectId) {
        regObjectId(CK_GE, objectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setObjectId_IsNull() { regObjectId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setObjectId_IsNotNull() { regObjectId(CK_ISNN, DOBJ); }

    protected void regObjectId(ConditionKey k, Object v) { regQ(k, v, getCValueObjectId(), "Object_ID"); }
    abstract protected ConditionValue getCValueObjectId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(255)}
     * @param metric The value of metric as equal.
     */
    public void setMetric_Equal(String metric) {
        regMetric(CK_EQ, fRES(metric));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param metric The value of metric as notEqual.
     */
    public void setMetric_NotEqual(String metric) {
        regMetric(CK_NE, fRES(metric));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param metric The value of metric as greaterThan.
     */
    public void setMetric_GreaterThan(String metric) {
        regMetric(CK_GT, fRES(metric));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param metric The value of metric as lessThan.
     */
    public void setMetric_LessThan(String metric) {
        regMetric(CK_LT, fRES(metric));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param metric The value of metric as greaterEqual.
     */
    public void setMetric_GreaterEqual(String metric) {
        regMetric(CK_GE, fRES(metric));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param metric The value of metric as lessEqual.
     */
    public void setMetric_LessEqual(String metric) {
        regMetric(CK_LE, fRES(metric));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param metric The value of metric as prefixSearch.
     */
    public void setMetric_PrefixSearch(String metric) {
        regMetric(CK_PS, fRES(metric));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param metricList The collection of metric as inScope.
     */
    public void setMetric_InScope(Collection<String> metricList) {
        regMetric(CK_INS, cTL(metricList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param metric The value of metric as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMetric_LikeSearch(String metric, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(metric), getCValueMetric(), "Metric", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param metric The value of metric as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMetric_NotLikeSearch(String metric, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(metric), getCValueMetric(), "Metric", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setMetric_IsNull() { regMetric(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setMetric_IsNotNull() { regMetric(CK_ISNN, DOBJ); }

    protected void regMetric(ConditionKey k, Object v) { regQ(k, v, getCValueMetric(), "Metric"); }
    abstract protected ConditionValue getCValueMetric();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(12)}
     * @param metrictype The value of metrictype as equal.
     */
    public void setMetrictype_Equal(String metrictype) {
        regMetrictype(CK_EQ, fRES(metrictype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param metrictype The value of metrictype as notEqual.
     */
    public void setMetrictype_NotEqual(String metrictype) {
        regMetrictype(CK_NE, fRES(metrictype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param metrictype The value of metrictype as greaterThan.
     */
    public void setMetrictype_GreaterThan(String metrictype) {
        regMetrictype(CK_GT, fRES(metrictype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param metrictype The value of metrictype as lessThan.
     */
    public void setMetrictype_LessThan(String metrictype) {
        regMetrictype(CK_LT, fRES(metrictype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param metrictype The value of metrictype as greaterEqual.
     */
    public void setMetrictype_GreaterEqual(String metrictype) {
        regMetrictype(CK_GE, fRES(metrictype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param metrictype The value of metrictype as lessEqual.
     */
    public void setMetrictype_LessEqual(String metrictype) {
        regMetrictype(CK_LE, fRES(metrictype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param metrictype The value of metrictype as prefixSearch.
     */
    public void setMetrictype_PrefixSearch(String metrictype) {
        regMetrictype(CK_PS, fRES(metrictype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param metrictypeList The collection of metrictype as inScope.
     */
    public void setMetrictype_InScope(Collection<String> metrictypeList) {
        regMetrictype(CK_INS, cTL(metrictypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param metrictype The value of metrictype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMetrictype_LikeSearch(String metrictype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(metrictype), getCValueMetrictype(), "MetricType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param metrictype The value of metrictype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMetrictype_NotLikeSearch(String metrictype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(metrictype), getCValueMetrictype(), "MetricType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setMetrictype_IsNull() { regMetrictype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setMetrictype_IsNotNull() { regMetrictype(CK_ISNN, DOBJ); }

    protected void regMetrictype(ConditionKey k, Object v) { regQ(k, v, getCValueMetrictype(), "MetricType"); }
    abstract protected ConditionValue getCValueMetrictype();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DOUBLE}
     * @param evalue The value of evalue as equal.
     */
    public void setEvalue_Equal(java.math.BigDecimal evalue) {
        regEvalue(CK_EQ, evalue);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param evalue The value of evalue as notEqual.
     */
    public void setEvalue_NotEqual(java.math.BigDecimal evalue) {
        regEvalue(CK_NE, evalue);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param evalue The value of evalue as greaterThan.
     */
    public void setEvalue_GreaterThan(java.math.BigDecimal evalue) {
        regEvalue(CK_GT, evalue);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param evalue The value of evalue as lessThan.
     */
    public void setEvalue_LessThan(java.math.BigDecimal evalue) {
        regEvalue(CK_LT, evalue);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param evalue The value of evalue as greaterEqual.
     */
    public void setEvalue_GreaterEqual(java.math.BigDecimal evalue) {
        regEvalue(CK_GE, evalue);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEvalue_IsNull() { regEvalue(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEvalue_IsNotNull() { regEvalue(CK_ISNN, DOBJ); }

    protected void regEvalue(ConditionKey k, Object v) { regQ(k, v, getCValueEvalue(), "EValue"); }
    abstract protected ConditionValue getCValueEvalue();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(String notes) {
        regNotes(CK_EQ, fRES(notes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(String notes) {
        regNotes(CK_NE, fRES(notes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(String notes) {
        regNotes(CK_PS, fRES(notes));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(Collection<String> notesList) {
        regNotes(CK_INS, cTL(notesList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey k, Object v) { regQ(k, v, getCValueNotes(), "Notes"); }
    abstract protected ConditionValue getCValueNotes();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TObjectmetricsCB.class.getName(); }
    String xCQ() { return TObjectmetricsCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
