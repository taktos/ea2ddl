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
 * The abstract condition-query of t_objectrisks.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTObjectrisksCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectrisksCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_objectrisks";
    }
    
    public String getTableSqlName() {
        return "t_objectrisks";
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
     * @param risk The value of risk as equal.
     */
    public void setRisk_Equal(String risk) {
        regRisk(CK_EQ, fRES(risk));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param risk The value of risk as notEqual.
     */
    public void setRisk_NotEqual(String risk) {
        regRisk(CK_NE, fRES(risk));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param risk The value of risk as greaterThan.
     */
    public void setRisk_GreaterThan(String risk) {
        regRisk(CK_GT, fRES(risk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param risk The value of risk as lessThan.
     */
    public void setRisk_LessThan(String risk) {
        regRisk(CK_LT, fRES(risk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param risk The value of risk as greaterEqual.
     */
    public void setRisk_GreaterEqual(String risk) {
        regRisk(CK_GE, fRES(risk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param risk The value of risk as lessEqual.
     */
    public void setRisk_LessEqual(String risk) {
        regRisk(CK_LE, fRES(risk));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param risk The value of risk as prefixSearch.
     */
    public void setRisk_PrefixSearch(String risk) {
        regRisk(CK_PS, fRES(risk));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param riskList The collection of risk as inScope.
     */
    public void setRisk_InScope(Collection<String> riskList) {
        regRisk(CK_INS, cTL(riskList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param risk The value of risk as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRisk_LikeSearch(String risk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(risk), getCValueRisk(), "Risk", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param risk The value of risk as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRisk_NotLikeSearch(String risk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(risk), getCValueRisk(), "Risk", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRisk_IsNull() { regRisk(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRisk_IsNotNull() { regRisk(CK_ISNN, DOBJ); }

    protected void regRisk(ConditionKey k, Object v) { regQ(k, v, getCValueRisk(), "Risk"); }
    abstract protected ConditionValue getCValueRisk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(12)}
     * @param risktype The value of risktype as equal.
     */
    public void setRisktype_Equal(String risktype) {
        regRisktype(CK_EQ, fRES(risktype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param risktype The value of risktype as notEqual.
     */
    public void setRisktype_NotEqual(String risktype) {
        regRisktype(CK_NE, fRES(risktype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param risktype The value of risktype as greaterThan.
     */
    public void setRisktype_GreaterThan(String risktype) {
        regRisktype(CK_GT, fRES(risktype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param risktype The value of risktype as lessThan.
     */
    public void setRisktype_LessThan(String risktype) {
        regRisktype(CK_LT, fRES(risktype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param risktype The value of risktype as greaterEqual.
     */
    public void setRisktype_GreaterEqual(String risktype) {
        regRisktype(CK_GE, fRES(risktype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param risktype The value of risktype as lessEqual.
     */
    public void setRisktype_LessEqual(String risktype) {
        regRisktype(CK_LE, fRES(risktype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param risktype The value of risktype as prefixSearch.
     */
    public void setRisktype_PrefixSearch(String risktype) {
        regRisktype(CK_PS, fRES(risktype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param risktypeList The collection of risktype as inScope.
     */
    public void setRisktype_InScope(Collection<String> risktypeList) {
        regRisktype(CK_INS, cTL(risktypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param risktype The value of risktype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRisktype_LikeSearch(String risktype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(risktype), getCValueRisktype(), "RiskType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param risktype The value of risktype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRisktype_NotLikeSearch(String risktype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(risktype), getCValueRisktype(), "RiskType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRisktype_IsNull() { regRisktype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRisktype_IsNotNull() { regRisktype(CK_ISNN, DOBJ); }

    protected void regRisktype(ConditionKey k, Object v) { regQ(k, v, getCValueRisktype(), "RiskType"); }
    abstract protected ConditionValue getCValueRisktype();
    
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
    String xCB() { return TObjectrisksCB.class.getName(); }
    String xCQ() { return TObjectrisksCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
