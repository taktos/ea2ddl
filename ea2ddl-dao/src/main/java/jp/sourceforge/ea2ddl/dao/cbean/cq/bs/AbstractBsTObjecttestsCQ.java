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
 * The abstract condition-query of t_objecttests.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTObjecttestsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjecttestsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_objecttests";
    }
    
    public String getTableSqlName() {
        return "t_objecttests";
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
     * @param test The value of test as equal.
     */
    public void setTest_Equal(String test) {
        regTest(CK_EQ, fRES(test));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param test The value of test as notEqual.
     */
    public void setTest_NotEqual(String test) {
        regTest(CK_NE, fRES(test));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param test The value of test as greaterThan.
     */
    public void setTest_GreaterThan(String test) {
        regTest(CK_GT, fRES(test));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param test The value of test as lessThan.
     */
    public void setTest_LessThan(String test) {
        regTest(CK_LT, fRES(test));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param test The value of test as greaterEqual.
     */
    public void setTest_GreaterEqual(String test) {
        regTest(CK_GE, fRES(test));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param test The value of test as lessEqual.
     */
    public void setTest_LessEqual(String test) {
        regTest(CK_LE, fRES(test));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param test The value of test as prefixSearch.
     */
    public void setTest_PrefixSearch(String test) {
        regTest(CK_PS, fRES(test));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param testList The collection of test as inScope.
     */
    public void setTest_InScope(Collection<String> testList) {
        regTest(CK_INS, cTL(testList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param test The value of test as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTest_LikeSearch(String test, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(test), getCValueTest(), "Test", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param test The value of test as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTest_NotLikeSearch(String test, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(test), getCValueTest(), "Test", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTest_IsNull() { regTest(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTest_IsNotNull() { regTest(CK_ISNN, DOBJ); }

    protected void regTest(ConditionKey k, Object v) { regQ(k, v, getCValueTest(), "Test"); }
    abstract protected ConditionValue getCValueTest();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : INTEGER}
     * @param testclass The value of testclass as equal.
     */
    public void setTestclass_Equal(java.lang.Integer testclass) {
        regTestclass(CK_EQ, testclass);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param testclass The value of testclass as notEqual.
     */
    public void setTestclass_NotEqual(java.lang.Integer testclass) {
        regTestclass(CK_NE, testclass);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param testclass The value of testclass as greaterThan.
     */
    public void setTestclass_GreaterThan(java.lang.Integer testclass) {
        regTestclass(CK_GT, testclass);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param testclass The value of testclass as lessThan.
     */
    public void setTestclass_LessThan(java.lang.Integer testclass) {
        regTestclass(CK_LT, testclass);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param testclass The value of testclass as greaterEqual.
     */
    public void setTestclass_GreaterEqual(java.lang.Integer testclass) {
        regTestclass(CK_GE, testclass);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param testclass The value of testclass as lessEqual.
     */
    public void setTestclass_LessEqual(java.lang.Integer testclass) {
        regTestclass(CK_LE, testclass);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param testclassList The collection of testclass as inScope.
     */
    public void setTestclass_InScope(Collection<java.lang.Integer> testclassList) {
        regTestclass(CK_INS, cTL(testclassList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTestclass_IsNull() { regTestclass(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTestclass_IsNotNull() { regTestclass(CK_ISNN, DOBJ); }

    protected void regTestclass(ConditionKey k, Object v) { regQ(k, v, getCValueTestclass(), "TestClass"); }
    abstract protected ConditionValue getCValueTestclass();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param testtype The value of testtype as equal.
     */
    public void setTesttype_Equal(String testtype) {
        regTesttype(CK_EQ, fRES(testtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testtype The value of testtype as notEqual.
     */
    public void setTesttype_NotEqual(String testtype) {
        regTesttype(CK_NE, fRES(testtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testtype The value of testtype as greaterThan.
     */
    public void setTesttype_GreaterThan(String testtype) {
        regTesttype(CK_GT, fRES(testtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testtype The value of testtype as lessThan.
     */
    public void setTesttype_LessThan(String testtype) {
        regTesttype(CK_LT, fRES(testtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testtype The value of testtype as greaterEqual.
     */
    public void setTesttype_GreaterEqual(String testtype) {
        regTesttype(CK_GE, fRES(testtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testtype The value of testtype as lessEqual.
     */
    public void setTesttype_LessEqual(String testtype) {
        regTesttype(CK_LE, fRES(testtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param testtype The value of testtype as prefixSearch.
     */
    public void setTesttype_PrefixSearch(String testtype) {
        regTesttype(CK_PS, fRES(testtype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param testtypeList The collection of testtype as inScope.
     */
    public void setTesttype_InScope(Collection<String> testtypeList) {
        regTesttype(CK_INS, cTL(testtypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param testtype The value of testtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTesttype_LikeSearch(String testtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(testtype), getCValueTesttype(), "TestType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param testtype The value of testtype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTesttype_NotLikeSearch(String testtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(testtype), getCValueTesttype(), "TestType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTesttype_IsNull() { regTesttype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTesttype_IsNotNull() { regTesttype(CK_ISNN, DOBJ); }

    protected void regTesttype(ConditionKey k, Object v) { regQ(k, v, getCValueTesttype(), "TestType"); }
    abstract protected ConditionValue getCValueTesttype();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param inputdata The value of inputdata as equal.
     */
    public void setInputdata_Equal(String inputdata) {
        regInputdata(CK_EQ, fRES(inputdata));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param inputdata The value of inputdata as notEqual.
     */
    public void setInputdata_NotEqual(String inputdata) {
        regInputdata(CK_NE, fRES(inputdata));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param inputdata The value of inputdata as greaterThan.
     */
    public void setInputdata_GreaterThan(String inputdata) {
        regInputdata(CK_GT, fRES(inputdata));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param inputdata The value of inputdata as lessThan.
     */
    public void setInputdata_LessThan(String inputdata) {
        regInputdata(CK_LT, fRES(inputdata));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param inputdata The value of inputdata as greaterEqual.
     */
    public void setInputdata_GreaterEqual(String inputdata) {
        regInputdata(CK_GE, fRES(inputdata));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param inputdata The value of inputdata as lessEqual.
     */
    public void setInputdata_LessEqual(String inputdata) {
        regInputdata(CK_LE, fRES(inputdata));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param inputdata The value of inputdata as prefixSearch.
     */
    public void setInputdata_PrefixSearch(String inputdata) {
        regInputdata(CK_PS, fRES(inputdata));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param inputdataList The collection of inputdata as inScope.
     */
    public void setInputdata_InScope(Collection<String> inputdataList) {
        regInputdata(CK_INS, cTL(inputdataList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param inputdata The value of inputdata as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInputdata_LikeSearch(String inputdata, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inputdata), getCValueInputdata(), "InputData", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param inputdata The value of inputdata as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInputdata_NotLikeSearch(String inputdata, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inputdata), getCValueInputdata(), "InputData", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setInputdata_IsNull() { regInputdata(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setInputdata_IsNotNull() { regInputdata(CK_ISNN, DOBJ); }

    protected void regInputdata(ConditionKey k, Object v) { regQ(k, v, getCValueInputdata(), "InputData"); }
    abstract protected ConditionValue getCValueInputdata();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param acceptancecriteria The value of acceptancecriteria as equal.
     */
    public void setAcceptancecriteria_Equal(String acceptancecriteria) {
        regAcceptancecriteria(CK_EQ, fRES(acceptancecriteria));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as notEqual.
     */
    public void setAcceptancecriteria_NotEqual(String acceptancecriteria) {
        regAcceptancecriteria(CK_NE, fRES(acceptancecriteria));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as greaterThan.
     */
    public void setAcceptancecriteria_GreaterThan(String acceptancecriteria) {
        regAcceptancecriteria(CK_GT, fRES(acceptancecriteria));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as lessThan.
     */
    public void setAcceptancecriteria_LessThan(String acceptancecriteria) {
        regAcceptancecriteria(CK_LT, fRES(acceptancecriteria));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as greaterEqual.
     */
    public void setAcceptancecriteria_GreaterEqual(String acceptancecriteria) {
        regAcceptancecriteria(CK_GE, fRES(acceptancecriteria));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as lessEqual.
     */
    public void setAcceptancecriteria_LessEqual(String acceptancecriteria) {
        regAcceptancecriteria(CK_LE, fRES(acceptancecriteria));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as prefixSearch.
     */
    public void setAcceptancecriteria_PrefixSearch(String acceptancecriteria) {
        regAcceptancecriteria(CK_PS, fRES(acceptancecriteria));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param acceptancecriteriaList The collection of acceptancecriteria as inScope.
     */
    public void setAcceptancecriteria_InScope(Collection<String> acceptancecriteriaList) {
        regAcceptancecriteria(CK_INS, cTL(acceptancecriteriaList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAcceptancecriteria_LikeSearch(String acceptancecriteria, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(acceptancecriteria), getCValueAcceptancecriteria(), "AcceptanceCriteria", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAcceptancecriteria_NotLikeSearch(String acceptancecriteria, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(acceptancecriteria), getCValueAcceptancecriteria(), "AcceptanceCriteria", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setAcceptancecriteria_IsNull() { regAcceptancecriteria(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setAcceptancecriteria_IsNotNull() { regAcceptancecriteria(CK_ISNN, DOBJ); }

    protected void regAcceptancecriteria(ConditionKey k, Object v) { regQ(k, v, getCValueAcceptancecriteria(), "AcceptanceCriteria"); }
    abstract protected ConditionValue getCValueAcceptancecriteria();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(32)}
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
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param daterun The value of daterun as equal.
     */
    public void setDaterun_Equal(java.sql.Timestamp daterun) {
        regDaterun(CK_EQ, daterun);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param daterun The value of daterun as greaterThan.
     */
    public void setDaterun_GreaterThan(java.sql.Timestamp daterun) {
        regDaterun(CK_GT, daterun);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param daterun The value of daterun as lessThan.
     */
    public void setDaterun_LessThan(java.sql.Timestamp daterun) {
        regDaterun(CK_LT, daterun);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param daterun The value of daterun as greaterEqual.
     */
    public void setDaterun_GreaterEqual(java.sql.Timestamp daterun) {
        regDaterun(CK_GE, daterun);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param daterun The value of daterun as lessEqual.
     */
    public void setDaterun_LessEqual(java.sql.Timestamp daterun) {
        regDaterun(CK_LE, daterun);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of daterun. (Nullable)
     * @param toDate The to-date of daterun. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDaterun_FromTo(java.util.Date fromDate, java.util.Date toDate, FromToOption fromToOption) {
        regFTQ((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueDaterun(), "DateRun", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of daterun. (Nullable)
     * @param toDate The to-date of daterun. (Nullable)
     */
    public void setDaterun_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setDaterun_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDaterun_IsNull() { regDaterun(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDaterun_IsNotNull() { regDaterun(CK_ISNN, DOBJ); }

    protected void regDaterun(ConditionKey k, Object v) { regQ(k, v, getCValueDaterun(), "DateRun"); }
    abstract protected ConditionValue getCValueDaterun();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param results The value of results as equal.
     */
    public void setResults_Equal(String results) {
        regResults(CK_EQ, fRES(results));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param results The value of results as notEqual.
     */
    public void setResults_NotEqual(String results) {
        regResults(CK_NE, fRES(results));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param results The value of results as greaterThan.
     */
    public void setResults_GreaterThan(String results) {
        regResults(CK_GT, fRES(results));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param results The value of results as lessThan.
     */
    public void setResults_LessThan(String results) {
        regResults(CK_LT, fRES(results));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param results The value of results as greaterEqual.
     */
    public void setResults_GreaterEqual(String results) {
        regResults(CK_GE, fRES(results));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param results The value of results as lessEqual.
     */
    public void setResults_LessEqual(String results) {
        regResults(CK_LE, fRES(results));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param results The value of results as prefixSearch.
     */
    public void setResults_PrefixSearch(String results) {
        regResults(CK_PS, fRES(results));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param resultsList The collection of results as inScope.
     */
    public void setResults_InScope(Collection<String> resultsList) {
        regResults(CK_INS, cTL(resultsList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param results The value of results as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setResults_LikeSearch(String results, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(results), getCValueResults(), "Results", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param results The value of results as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setResults_NotLikeSearch(String results, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(results), getCValueResults(), "Results", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setResults_IsNull() { regResults(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setResults_IsNotNull() { regResults(CK_ISNN, DOBJ); }

    protected void regResults(ConditionKey k, Object v) { regQ(k, v, getCValueResults(), "Results"); }
    abstract protected ConditionValue getCValueResults();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param runby The value of runby as equal.
     */
    public void setRunby_Equal(String runby) {
        regRunby(CK_EQ, fRES(runby));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param runby The value of runby as notEqual.
     */
    public void setRunby_NotEqual(String runby) {
        regRunby(CK_NE, fRES(runby));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param runby The value of runby as greaterThan.
     */
    public void setRunby_GreaterThan(String runby) {
        regRunby(CK_GT, fRES(runby));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param runby The value of runby as lessThan.
     */
    public void setRunby_LessThan(String runby) {
        regRunby(CK_LT, fRES(runby));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param runby The value of runby as greaterEqual.
     */
    public void setRunby_GreaterEqual(String runby) {
        regRunby(CK_GE, fRES(runby));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param runby The value of runby as lessEqual.
     */
    public void setRunby_LessEqual(String runby) {
        regRunby(CK_LE, fRES(runby));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param runby The value of runby as prefixSearch.
     */
    public void setRunby_PrefixSearch(String runby) {
        regRunby(CK_PS, fRES(runby));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param runbyList The collection of runby as inScope.
     */
    public void setRunby_InScope(Collection<String> runbyList) {
        regRunby(CK_INS, cTL(runbyList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param runby The value of runby as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRunby_LikeSearch(String runby, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(runby), getCValueRunby(), "RunBy", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param runby The value of runby as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRunby_NotLikeSearch(String runby, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(runby), getCValueRunby(), "RunBy", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRunby_IsNull() { regRunby(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRunby_IsNotNull() { regRunby(CK_ISNN, DOBJ); }

    protected void regRunby(ConditionKey k, Object v) { regQ(k, v, getCValueRunby(), "RunBy"); }
    abstract protected ConditionValue getCValueRunby();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param checkby The value of checkby as equal.
     */
    public void setCheckby_Equal(String checkby) {
        regCheckby(CK_EQ, fRES(checkby));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param checkby The value of checkby as notEqual.
     */
    public void setCheckby_NotEqual(String checkby) {
        regCheckby(CK_NE, fRES(checkby));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param checkby The value of checkby as greaterThan.
     */
    public void setCheckby_GreaterThan(String checkby) {
        regCheckby(CK_GT, fRES(checkby));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param checkby The value of checkby as lessThan.
     */
    public void setCheckby_LessThan(String checkby) {
        regCheckby(CK_LT, fRES(checkby));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param checkby The value of checkby as greaterEqual.
     */
    public void setCheckby_GreaterEqual(String checkby) {
        regCheckby(CK_GE, fRES(checkby));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param checkby The value of checkby as lessEqual.
     */
    public void setCheckby_LessEqual(String checkby) {
        regCheckby(CK_LE, fRES(checkby));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param checkby The value of checkby as prefixSearch.
     */
    public void setCheckby_PrefixSearch(String checkby) {
        regCheckby(CK_PS, fRES(checkby));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param checkbyList The collection of checkby as inScope.
     */
    public void setCheckby_InScope(Collection<String> checkbyList) {
        regCheckby(CK_INS, cTL(checkbyList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param checkby The value of checkby as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCheckby_LikeSearch(String checkby, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(checkby), getCValueCheckby(), "CheckBy", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param checkby The value of checkby as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCheckby_NotLikeSearch(String checkby, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(checkby), getCValueCheckby(), "CheckBy", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setCheckby_IsNull() { regCheckby(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setCheckby_IsNotNull() { regCheckby(CK_ISNN, DOBJ); }

    protected void regCheckby(ConditionKey k, Object v) { regQ(k, v, getCValueCheckby(), "CheckBy"); }
    abstract protected ConditionValue getCValueCheckby();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TObjecttestsCB.class.getName(); }
    String xCQ() { return TObjecttestsCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
