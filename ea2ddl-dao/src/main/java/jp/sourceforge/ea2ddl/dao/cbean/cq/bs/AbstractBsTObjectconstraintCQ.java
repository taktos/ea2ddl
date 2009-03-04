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
 * The abstract condition-query of t_objectconstraint.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTObjectconstraintCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectconstraintCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_objectconstraint";
    }
    
    public String getTableSqlName() {
        return "t_objectconstraint";
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
     * @param constraint The value of constraint as equal.
     */
    public void setConstraint_Equal(String constraint) {
        regConstraint(CK_EQ, fRES(constraint));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constraint The value of constraint as notEqual.
     */
    public void setConstraint_NotEqual(String constraint) {
        regConstraint(CK_NE, fRES(constraint));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constraint The value of constraint as greaterThan.
     */
    public void setConstraint_GreaterThan(String constraint) {
        regConstraint(CK_GT, fRES(constraint));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constraint The value of constraint as lessThan.
     */
    public void setConstraint_LessThan(String constraint) {
        regConstraint(CK_LT, fRES(constraint));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constraint The value of constraint as greaterEqual.
     */
    public void setConstraint_GreaterEqual(String constraint) {
        regConstraint(CK_GE, fRES(constraint));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constraint The value of constraint as lessEqual.
     */
    public void setConstraint_LessEqual(String constraint) {
        regConstraint(CK_LE, fRES(constraint));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constraint The value of constraint as prefixSearch.
     */
    public void setConstraint_PrefixSearch(String constraint) {
        regConstraint(CK_PS, fRES(constraint));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constraintList The collection of constraint as inScope.
     */
    public void setConstraint_InScope(Collection<String> constraintList) {
        regConstraint(CK_INS, cTL(constraintList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constraint The value of constraint as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstraint_LikeSearch(String constraint, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(constraint), getCValueConstraint(), "Constraint", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constraint The value of constraint as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConstraint_NotLikeSearch(String constraint, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(constraint), getCValueConstraint(), "Constraint", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setConstraint_IsNull() { regConstraint(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setConstraint_IsNotNull() { regConstraint(CK_ISNN, DOBJ); }

    protected void regConstraint(ConditionKey k, Object v) { regQ(k, v, getCValueConstraint(), "Constraint"); }
    abstract protected ConditionValue getCValueConstraint();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(30)}
     * @param constrainttype The value of constrainttype as equal.
     */
    public void setConstrainttype_Equal(String constrainttype) {
        regConstrainttype(CK_EQ, fRES(constrainttype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constrainttype The value of constrainttype as notEqual.
     */
    public void setConstrainttype_NotEqual(String constrainttype) {
        regConstrainttype(CK_NE, fRES(constrainttype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constrainttype The value of constrainttype as greaterThan.
     */
    public void setConstrainttype_GreaterThan(String constrainttype) {
        regConstrainttype(CK_GT, fRES(constrainttype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constrainttype The value of constrainttype as lessThan.
     */
    public void setConstrainttype_LessThan(String constrainttype) {
        regConstrainttype(CK_LT, fRES(constrainttype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constrainttype The value of constrainttype as greaterEqual.
     */
    public void setConstrainttype_GreaterEqual(String constrainttype) {
        regConstrainttype(CK_GE, fRES(constrainttype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constrainttype The value of constrainttype as lessEqual.
     */
    public void setConstrainttype_LessEqual(String constrainttype) {
        regConstrainttype(CK_LE, fRES(constrainttype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constrainttype The value of constrainttype as prefixSearch.
     */
    public void setConstrainttype_PrefixSearch(String constrainttype) {
        regConstrainttype(CK_PS, fRES(constrainttype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constrainttypeList The collection of constrainttype as inScope.
     */
    public void setConstrainttype_InScope(Collection<String> constrainttypeList) {
        regConstrainttype(CK_INS, cTL(constrainttypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constrainttype The value of constrainttype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstrainttype_LikeSearch(String constrainttype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(constrainttype), getCValueConstrainttype(), "ConstraintType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constrainttype The value of constrainttype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConstrainttype_NotLikeSearch(String constrainttype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(constrainttype), getCValueConstrainttype(), "ConstraintType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setConstrainttype_IsNull() { regConstrainttype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setConstrainttype_IsNotNull() { regConstrainttype(CK_ISNN, DOBJ); }

    protected void regConstrainttype(ConditionKey k, Object v) { regQ(k, v, getCValueConstrainttype(), "ConstraintType"); }
    abstract protected ConditionValue getCValueConstrainttype();
    
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

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param status The value of status as equal.
     */
    public void setStatus_Equal(String status) {
        regStatus(CK_EQ, fRES(status));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as notEqual.
     */
    public void setStatus_NotEqual(String status) {
        regStatus(CK_NE, fRES(status));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as greaterThan.
     */
    public void setStatus_GreaterThan(String status) {
        regStatus(CK_GT, fRES(status));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as lessThan.
     */
    public void setStatus_LessThan(String status) {
        regStatus(CK_LT, fRES(status));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as greaterEqual.
     */
    public void setStatus_GreaterEqual(String status) {
        regStatus(CK_GE, fRES(status));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as lessEqual.
     */
    public void setStatus_LessEqual(String status) {
        regStatus(CK_LE, fRES(status));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as prefixSearch.
     */
    public void setStatus_PrefixSearch(String status) {
        regStatus(CK_PS, fRES(status));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param statusList The collection of status as inScope.
     */
    public void setStatus_InScope(Collection<String> statusList) {
        regStatus(CK_INS, cTL(statusList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param status The value of status as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatus_LikeSearch(String status, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(status), getCValueStatus(), "Status", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param status The value of status as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStatus_NotLikeSearch(String status, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(status), getCValueStatus(), "Status", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStatus_IsNull() { regStatus(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStatus_IsNotNull() { regStatus(CK_ISNN, DOBJ); }

    protected void regStatus(ConditionKey k, Object v) { regQ(k, v, getCValueStatus(), "Status"); }
    abstract protected ConditionValue getCValueStatus();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TObjectconstraintCB.class.getName(); }
    String xCQ() { return TObjectconstraintCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
