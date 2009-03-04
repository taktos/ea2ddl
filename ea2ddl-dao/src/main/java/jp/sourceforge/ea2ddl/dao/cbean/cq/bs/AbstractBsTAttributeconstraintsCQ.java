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
 * The abstract condition-query of t_attributeconstraints.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTAttributeconstraintsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTAttributeconstraintsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_attributeconstraints";
    }
    
    public String getTableSqlName() {
        return "t_attributeconstraints";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param attname The value of attname as equal.
     */
    public void setAttname_Equal(String attname) {
        regAttname(CK_EQ, fRES(attname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param attname The value of attname as notEqual.
     */
    public void setAttname_NotEqual(String attname) {
        regAttname(CK_NE, fRES(attname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param attname The value of attname as greaterThan.
     */
    public void setAttname_GreaterThan(String attname) {
        regAttname(CK_GT, fRES(attname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param attname The value of attname as lessThan.
     */
    public void setAttname_LessThan(String attname) {
        regAttname(CK_LT, fRES(attname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param attname The value of attname as greaterEqual.
     */
    public void setAttname_GreaterEqual(String attname) {
        regAttname(CK_GE, fRES(attname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param attname The value of attname as lessEqual.
     */
    public void setAttname_LessEqual(String attname) {
        regAttname(CK_LE, fRES(attname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param attname The value of attname as prefixSearch.
     */
    public void setAttname_PrefixSearch(String attname) {
        regAttname(CK_PS, fRES(attname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param attnameList The collection of attname as inScope.
     */
    public void setAttname_InScope(Collection<String> attnameList) {
        regAttname(CK_INS, cTL(attnameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param attname The value of attname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAttname_LikeSearch(String attname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(attname), getCValueAttname(), "AttName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param attname The value of attname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAttname_NotLikeSearch(String attname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(attname), getCValueAttname(), "AttName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setAttname_IsNull() { regAttname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setAttname_IsNotNull() { regAttname(CK_ISNN, DOBJ); }

    protected void regAttname(ConditionKey k, Object v) { regQ(k, v, getCValueAttname(), "AttName"); }
    abstract protected ConditionValue getCValueAttname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param type The value of type as equal.
     */
    public void setType_Equal(String type) {
        regType(CK_EQ, fRES(type));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as notEqual.
     */
    public void setType_NotEqual(String type) {
        regType(CK_NE, fRES(type));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as greaterThan.
     */
    public void setType_GreaterThan(String type) {
        regType(CK_GT, fRES(type));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as lessThan.
     */
    public void setType_LessThan(String type) {
        regType(CK_LT, fRES(type));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as greaterEqual.
     */
    public void setType_GreaterEqual(String type) {
        regType(CK_GE, fRES(type));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as lessEqual.
     */
    public void setType_LessEqual(String type) {
        regType(CK_LE, fRES(type));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as prefixSearch.
     */
    public void setType_PrefixSearch(String type) {
        regType(CK_PS, fRES(type));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeList The collection of type as inScope.
     */
    public void setType_InScope(Collection<String> typeList) {
        regType(CK_INS, cTL(typeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param type The value of type as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setType_LikeSearch(String type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(type), getCValueType(), "Type", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param type The value of type as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setType_NotLikeSearch(String type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(type), getCValueType(), "Type", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setType_IsNull() { regType(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setType_IsNotNull() { regType(CK_ISNN, DOBJ); }

    protected void regType(ConditionKey k, Object v) { regQ(k, v, getCValueType(), "Type"); }
    abstract protected ConditionValue getCValueType();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : INTEGER}
     * @param id The value of id as equal.
     */
    public void setId_Equal(java.lang.Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param id The value of id as notEqual.
     */
    public void setId_NotEqual(java.lang.Integer id) {
        regId(CK_NE, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param id The value of id as greaterThan.
     */
    public void setId_GreaterThan(java.lang.Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param id The value of id as lessThan.
     */
    public void setId_LessThan(java.lang.Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param id The value of id as greaterEqual.
     */
    public void setId_GreaterEqual(java.lang.Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param id The value of id as lessEqual.
     */
    public void setId_LessEqual(java.lang.Integer id) {
        regId(CK_LE, id);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param idList The collection of id as inScope.
     */
    public void setId_InScope(Collection<java.lang.Integer> idList) {
        regId(CK_INS, cTL(idList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey k, Object v) { regQ(k, v, getCValueId(), "ID"); }
    abstract protected ConditionValue getCValueId();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TAttributeconstraintsCB.class.getName(); }
    String xCQ() { return TAttributeconstraintsCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
