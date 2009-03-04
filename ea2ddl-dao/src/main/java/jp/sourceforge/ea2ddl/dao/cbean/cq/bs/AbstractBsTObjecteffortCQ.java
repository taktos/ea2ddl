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
 * The abstract condition-query of t_objecteffort.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTObjecteffortCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjecteffortCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_objecteffort";
    }
    
    public String getTableSqlName() {
        return "t_objecteffort";
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
     * @param effort The value of effort as equal.
     */
    public void setEffort_Equal(String effort) {
        regEffort(CK_EQ, fRES(effort));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param effort The value of effort as notEqual.
     */
    public void setEffort_NotEqual(String effort) {
        regEffort(CK_NE, fRES(effort));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param effort The value of effort as greaterThan.
     */
    public void setEffort_GreaterThan(String effort) {
        regEffort(CK_GT, fRES(effort));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param effort The value of effort as lessThan.
     */
    public void setEffort_LessThan(String effort) {
        regEffort(CK_LT, fRES(effort));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param effort The value of effort as greaterEqual.
     */
    public void setEffort_GreaterEqual(String effort) {
        regEffort(CK_GE, fRES(effort));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param effort The value of effort as lessEqual.
     */
    public void setEffort_LessEqual(String effort) {
        regEffort(CK_LE, fRES(effort));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param effort The value of effort as prefixSearch.
     */
    public void setEffort_PrefixSearch(String effort) {
        regEffort(CK_PS, fRES(effort));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param effortList The collection of effort as inScope.
     */
    public void setEffort_InScope(Collection<String> effortList) {
        regEffort(CK_INS, cTL(effortList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param effort The value of effort as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEffort_LikeSearch(String effort, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(effort), getCValueEffort(), "Effort", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param effort The value of effort as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEffort_NotLikeSearch(String effort, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(effort), getCValueEffort(), "Effort", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEffort_IsNull() { regEffort(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEffort_IsNotNull() { regEffort(CK_ISNN, DOBJ); }

    protected void regEffort(ConditionKey k, Object v) { regQ(k, v, getCValueEffort(), "Effort"); }
    abstract protected ConditionValue getCValueEffort();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(12)}
     * @param efforttype The value of efforttype as equal.
     */
    public void setEfforttype_Equal(String efforttype) {
        regEfforttype(CK_EQ, fRES(efforttype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param efforttype The value of efforttype as notEqual.
     */
    public void setEfforttype_NotEqual(String efforttype) {
        regEfforttype(CK_NE, fRES(efforttype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param efforttype The value of efforttype as greaterThan.
     */
    public void setEfforttype_GreaterThan(String efforttype) {
        regEfforttype(CK_GT, fRES(efforttype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param efforttype The value of efforttype as lessThan.
     */
    public void setEfforttype_LessThan(String efforttype) {
        regEfforttype(CK_LT, fRES(efforttype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param efforttype The value of efforttype as greaterEqual.
     */
    public void setEfforttype_GreaterEqual(String efforttype) {
        regEfforttype(CK_GE, fRES(efforttype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param efforttype The value of efforttype as lessEqual.
     */
    public void setEfforttype_LessEqual(String efforttype) {
        regEfforttype(CK_LE, fRES(efforttype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param efforttype The value of efforttype as prefixSearch.
     */
    public void setEfforttype_PrefixSearch(String efforttype) {
        regEfforttype(CK_PS, fRES(efforttype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param efforttypeList The collection of efforttype as inScope.
     */
    public void setEfforttype_InScope(Collection<String> efforttypeList) {
        regEfforttype(CK_INS, cTL(efforttypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param efforttype The value of efforttype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEfforttype_LikeSearch(String efforttype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(efforttype), getCValueEfforttype(), "EffortType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param efforttype The value of efforttype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEfforttype_NotLikeSearch(String efforttype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(efforttype), getCValueEfforttype(), "EffortType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEfforttype_IsNull() { regEfforttype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEfforttype_IsNotNull() { regEfforttype(CK_ISNN, DOBJ); }

    protected void regEfforttype(ConditionKey k, Object v) { regQ(k, v, getCValueEfforttype(), "EffortType"); }
    abstract protected ConditionValue getCValueEfforttype();
    
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
    String xCB() { return TObjecteffortCB.class.getName(); }
    String xCQ() { return TObjecteffortCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
