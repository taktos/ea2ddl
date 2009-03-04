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
 * The abstract condition-query of t_objecttrx.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTObjecttrxCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjecttrxCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_objecttrx";
    }
    
    public String getTableSqlName() {
        return "t_objecttrx";
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
     * @param trx The value of trx as equal.
     */
    public void setTrx_Equal(String trx) {
        regTrx(CK_EQ, fRES(trx));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param trx The value of trx as notEqual.
     */
    public void setTrx_NotEqual(String trx) {
        regTrx(CK_NE, fRES(trx));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param trx The value of trx as greaterThan.
     */
    public void setTrx_GreaterThan(String trx) {
        regTrx(CK_GT, fRES(trx));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param trx The value of trx as lessThan.
     */
    public void setTrx_LessThan(String trx) {
        regTrx(CK_LT, fRES(trx));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param trx The value of trx as greaterEqual.
     */
    public void setTrx_GreaterEqual(String trx) {
        regTrx(CK_GE, fRES(trx));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param trx The value of trx as lessEqual.
     */
    public void setTrx_LessEqual(String trx) {
        regTrx(CK_LE, fRES(trx));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param trx The value of trx as prefixSearch.
     */
    public void setTrx_PrefixSearch(String trx) {
        regTrx(CK_PS, fRES(trx));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param trxList The collection of trx as inScope.
     */
    public void setTrx_InScope(Collection<String> trxList) {
        regTrx(CK_INS, cTL(trxList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param trx The value of trx as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrx_LikeSearch(String trx, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trx), getCValueTrx(), "TRX", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param trx The value of trx as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrx_NotLikeSearch(String trx, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trx), getCValueTrx(), "TRX", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTrx_IsNull() { regTrx(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTrx_IsNotNull() { regTrx(CK_ISNN, DOBJ); }

    protected void regTrx(ConditionKey k, Object v) { regQ(k, v, getCValueTrx(), "TRX"); }
    abstract protected ConditionValue getCValueTrx();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(12)}
     * @param trxtype The value of trxtype as equal.
     */
    public void setTrxtype_Equal(String trxtype) {
        regTrxtype(CK_EQ, fRES(trxtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param trxtype The value of trxtype as notEqual.
     */
    public void setTrxtype_NotEqual(String trxtype) {
        regTrxtype(CK_NE, fRES(trxtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param trxtype The value of trxtype as greaterThan.
     */
    public void setTrxtype_GreaterThan(String trxtype) {
        regTrxtype(CK_GT, fRES(trxtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param trxtype The value of trxtype as lessThan.
     */
    public void setTrxtype_LessThan(String trxtype) {
        regTrxtype(CK_LT, fRES(trxtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param trxtype The value of trxtype as greaterEqual.
     */
    public void setTrxtype_GreaterEqual(String trxtype) {
        regTrxtype(CK_GE, fRES(trxtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param trxtype The value of trxtype as lessEqual.
     */
    public void setTrxtype_LessEqual(String trxtype) {
        regTrxtype(CK_LE, fRES(trxtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param trxtype The value of trxtype as prefixSearch.
     */
    public void setTrxtype_PrefixSearch(String trxtype) {
        regTrxtype(CK_PS, fRES(trxtype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param trxtypeList The collection of trxtype as inScope.
     */
    public void setTrxtype_InScope(Collection<String> trxtypeList) {
        regTrxtype(CK_INS, cTL(trxtypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param trxtype The value of trxtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrxtype_LikeSearch(String trxtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trxtype), getCValueTrxtype(), "TRXType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param trxtype The value of trxtype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrxtype_NotLikeSearch(String trxtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trxtype), getCValueTrxtype(), "TRXType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTrxtype_IsNull() { regTrxtype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTrxtype_IsNotNull() { regTrxtype(CK_ISNN, DOBJ); }

    protected void regTrxtype(ConditionKey k, Object v) { regQ(k, v, getCValueTrxtype(), "TRXType"); }
    abstract protected ConditionValue getCValueTrxtype();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DOUBLE}
     * @param weight The value of weight as equal.
     */
    public void setWeight_Equal(java.math.BigDecimal weight) {
        regWeight(CK_EQ, weight);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param weight The value of weight as notEqual.
     */
    public void setWeight_NotEqual(java.math.BigDecimal weight) {
        regWeight(CK_NE, weight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param weight The value of weight as greaterThan.
     */
    public void setWeight_GreaterThan(java.math.BigDecimal weight) {
        regWeight(CK_GT, weight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param weight The value of weight as lessThan.
     */
    public void setWeight_LessThan(java.math.BigDecimal weight) {
        regWeight(CK_LT, weight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param weight The value of weight as greaterEqual.
     */
    public void setWeight_GreaterEqual(java.math.BigDecimal weight) {
        regWeight(CK_GE, weight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param weight The value of weight as lessEqual.
     */
    public void setWeight_LessEqual(java.math.BigDecimal weight) {
        regWeight(CK_LE, weight);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param weightList The collection of weight as inScope.
     */
    public void setWeight_InScope(Collection<java.math.BigDecimal> weightList) {
        regWeight(CK_INS, cTL(weightList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setWeight_IsNull() { regWeight(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setWeight_IsNotNull() { regWeight(CK_ISNN, DOBJ); }

    protected void regWeight(ConditionKey k, Object v) { regQ(k, v, getCValueWeight(), "Weight"); }
    abstract protected ConditionValue getCValueWeight();

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
    String xCB() { return TObjecttrxCB.class.getName(); }
    String xCQ() { return TObjecttrxCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
