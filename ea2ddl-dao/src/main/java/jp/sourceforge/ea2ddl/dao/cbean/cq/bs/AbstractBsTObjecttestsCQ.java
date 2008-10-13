package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_objecttests.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTObjecttestsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjecttestsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * @param test The value of test as equal.
     */
    public void setTest_Equal(String test) {
        regTest(CK_EQ, fRES(test));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param test The value of test as notEqual.
     */
    public void setTest_NotEqual(String test) {
        regTest(CK_NE, fRES(test));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param test The value of test as greaterThan.
     */
    public void setTest_GreaterThan(String test) {
        regTest(CK_GT, fRES(test));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param test The value of test as lessThan.
     */
    public void setTest_LessThan(String test) {
        regTest(CK_LT, fRES(test));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param test The value of test as greaterEqual.
     */
    public void setTest_GreaterEqual(String test) {
        regTest(CK_GE, fRES(test));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param test The value of test as lessEqual.
     */
    public void setTest_LessEqual(String test) {
        regTest(CK_LE, fRES(test));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param test The value of test as prefixSearch.
     */
    public void setTest_PrefixSearch(String test) {
        regTest(CK_PS, fRES(test));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param test The value of test as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTest_LikeSearch(String test, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(test), getCValueTest(), "Test", "Test", "test", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param testList The collection of test as inScope.
     */
    public void setTest_InScope(Collection<String> testList) {
        regTest(CK_INS, cTL(testList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param test The collection of test as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTest_InScope(String test, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(test), getCValueTest(), "Test", "Test", "test", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTest_IsNull() { regTest(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTest_IsNotNull() { regTest(CK_ISNN, DUMMY_OBJECT); }

    protected void regTest(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTest(), "Test", "Test", "test");
    }
    protected void registerInlineTest(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTest(), "Test", "Test", "test");
    }
    abstract protected ConditionValue getCValueTest();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : INTEGER}
     * @param testclass The value of testclass as equal.
     */
    public void setTestclass_Equal(java.lang.Integer testclass) {
        regTestclass(CK_EQ, testclass);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param testclass The value of testclass as notEqual.
     */
    public void setTestclass_NotEqual(java.lang.Integer testclass) {
        regTestclass(CK_NE, testclass);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param testclass The value of testclass as greaterThan.
     */
    public void setTestclass_GreaterThan(java.lang.Integer testclass) {
        regTestclass(CK_GT, testclass);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param testclass The value of testclass as lessThan.
     */
    public void setTestclass_LessThan(java.lang.Integer testclass) {
        regTestclass(CK_LT, testclass);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param testclass The value of testclass as greaterEqual.
     */
    public void setTestclass_GreaterEqual(java.lang.Integer testclass) {
        regTestclass(CK_GE, testclass);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setTestclass_IsNull() { regTestclass(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTestclass_IsNotNull() { regTestclass(CK_ISNN, DUMMY_OBJECT); }

    protected void regTestclass(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTestclass(), "TestClass", "Testclass", "testclass");
    }
    protected void registerInlineTestclass(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTestclass(), "TestClass", "Testclass", "testclass");
    }
    abstract protected ConditionValue getCValueTestclass();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param testtype The value of testtype as equal.
     */
    public void setTesttype_Equal(String testtype) {
        regTesttype(CK_EQ, fRES(testtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param testtype The value of testtype as notEqual.
     */
    public void setTesttype_NotEqual(String testtype) {
        regTesttype(CK_NE, fRES(testtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param testtype The value of testtype as greaterThan.
     */
    public void setTesttype_GreaterThan(String testtype) {
        regTesttype(CK_GT, fRES(testtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param testtype The value of testtype as lessThan.
     */
    public void setTesttype_LessThan(String testtype) {
        regTesttype(CK_LT, fRES(testtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param testtype The value of testtype as greaterEqual.
     */
    public void setTesttype_GreaterEqual(String testtype) {
        regTesttype(CK_GE, fRES(testtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param testtype The value of testtype as lessEqual.
     */
    public void setTesttype_LessEqual(String testtype) {
        regTesttype(CK_LE, fRES(testtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param testtype The value of testtype as prefixSearch.
     */
    public void setTesttype_PrefixSearch(String testtype) {
        regTesttype(CK_PS, fRES(testtype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param testtype The value of testtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTesttype_LikeSearch(String testtype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(testtype), getCValueTesttype(), "TestType", "Testtype", "testtype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param testtypeList The collection of testtype as inScope.
     */
    public void setTesttype_InScope(Collection<String> testtypeList) {
        regTesttype(CK_INS, cTL(testtypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param testtype The collection of testtype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTesttype_InScope(String testtype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(testtype), getCValueTesttype(), "TestType", "Testtype", "testtype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTesttype_IsNull() { regTesttype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTesttype_IsNotNull() { regTesttype(CK_ISNN, DUMMY_OBJECT); }

    protected void regTesttype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTesttype(), "TestType", "Testtype", "testtype");
    }
    protected void registerInlineTesttype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTesttype(), "TestType", "Testtype", "testtype");
    }
    abstract protected ConditionValue getCValueTesttype();

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

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param inputdata The value of inputdata as equal.
     */
    public void setInputdata_Equal(String inputdata) {
        regInputdata(CK_EQ, fRES(inputdata));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param inputdata The value of inputdata as notEqual.
     */
    public void setInputdata_NotEqual(String inputdata) {
        regInputdata(CK_NE, fRES(inputdata));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param inputdata The value of inputdata as greaterThan.
     */
    public void setInputdata_GreaterThan(String inputdata) {
        regInputdata(CK_GT, fRES(inputdata));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param inputdata The value of inputdata as lessThan.
     */
    public void setInputdata_LessThan(String inputdata) {
        regInputdata(CK_LT, fRES(inputdata));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param inputdata The value of inputdata as greaterEqual.
     */
    public void setInputdata_GreaterEqual(String inputdata) {
        regInputdata(CK_GE, fRES(inputdata));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param inputdata The value of inputdata as lessEqual.
     */
    public void setInputdata_LessEqual(String inputdata) {
        regInputdata(CK_LE, fRES(inputdata));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param inputdata The value of inputdata as prefixSearch.
     */
    public void setInputdata_PrefixSearch(String inputdata) {
        regInputdata(CK_PS, fRES(inputdata));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param inputdata The value of inputdata as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInputdata_LikeSearch(String inputdata, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(inputdata), getCValueInputdata(), "InputData", "Inputdata", "inputdata", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param inputdataList The collection of inputdata as inScope.
     */
    public void setInputdata_InScope(Collection<String> inputdataList) {
        regInputdata(CK_INS, cTL(inputdataList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param inputdata The collection of inputdata as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setInputdata_InScope(String inputdata, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(inputdata), getCValueInputdata(), "InputData", "Inputdata", "inputdata", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setInputdata_IsNull() { regInputdata(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setInputdata_IsNotNull() { regInputdata(CK_ISNN, DUMMY_OBJECT); }

    protected void regInputdata(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueInputdata(), "InputData", "Inputdata", "inputdata");
    }
    protected void registerInlineInputdata(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueInputdata(), "InputData", "Inputdata", "inputdata");
    }
    abstract protected ConditionValue getCValueInputdata();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param acceptancecriteria The value of acceptancecriteria as equal.
     */
    public void setAcceptancecriteria_Equal(String acceptancecriteria) {
        regAcceptancecriteria(CK_EQ, fRES(acceptancecriteria));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as notEqual.
     */
    public void setAcceptancecriteria_NotEqual(String acceptancecriteria) {
        regAcceptancecriteria(CK_NE, fRES(acceptancecriteria));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as greaterThan.
     */
    public void setAcceptancecriteria_GreaterThan(String acceptancecriteria) {
        regAcceptancecriteria(CK_GT, fRES(acceptancecriteria));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as lessThan.
     */
    public void setAcceptancecriteria_LessThan(String acceptancecriteria) {
        regAcceptancecriteria(CK_LT, fRES(acceptancecriteria));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as greaterEqual.
     */
    public void setAcceptancecriteria_GreaterEqual(String acceptancecriteria) {
        regAcceptancecriteria(CK_GE, fRES(acceptancecriteria));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as lessEqual.
     */
    public void setAcceptancecriteria_LessEqual(String acceptancecriteria) {
        regAcceptancecriteria(CK_LE, fRES(acceptancecriteria));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as prefixSearch.
     */
    public void setAcceptancecriteria_PrefixSearch(String acceptancecriteria) {
        regAcceptancecriteria(CK_PS, fRES(acceptancecriteria));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param acceptancecriteria The value of acceptancecriteria as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAcceptancecriteria_LikeSearch(String acceptancecriteria, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(acceptancecriteria), getCValueAcceptancecriteria(), "AcceptanceCriteria", "Acceptancecriteria", "acceptancecriteria", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param acceptancecriteriaList The collection of acceptancecriteria as inScope.
     */
    public void setAcceptancecriteria_InScope(Collection<String> acceptancecriteriaList) {
        regAcceptancecriteria(CK_INS, cTL(acceptancecriteriaList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param acceptancecriteria The collection of acceptancecriteria as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setAcceptancecriteria_InScope(String acceptancecriteria, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(acceptancecriteria), getCValueAcceptancecriteria(), "AcceptanceCriteria", "Acceptancecriteria", "acceptancecriteria", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setAcceptancecriteria_IsNull() { regAcceptancecriteria(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setAcceptancecriteria_IsNotNull() { regAcceptancecriteria(CK_ISNN, DUMMY_OBJECT); }

    protected void regAcceptancecriteria(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAcceptancecriteria(), "AcceptanceCriteria", "Acceptancecriteria", "acceptancecriteria");
    }
    protected void registerInlineAcceptancecriteria(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAcceptancecriteria(), "AcceptanceCriteria", "Acceptancecriteria", "acceptancecriteria");
    }
    abstract protected ConditionValue getCValueAcceptancecriteria();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(32)}
     * @param status The value of status as equal.
     */
    public void setStatus_Equal(String status) {
        regStatus(CK_EQ, fRES(status));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as notEqual.
     */
    public void setStatus_NotEqual(String status) {
        regStatus(CK_NE, fRES(status));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as greaterThan.
     */
    public void setStatus_GreaterThan(String status) {
        regStatus(CK_GT, fRES(status));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as lessThan.
     */
    public void setStatus_LessThan(String status) {
        regStatus(CK_LT, fRES(status));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as greaterEqual.
     */
    public void setStatus_GreaterEqual(String status) {
        regStatus(CK_GE, fRES(status));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as lessEqual.
     */
    public void setStatus_LessEqual(String status) {
        regStatus(CK_LE, fRES(status));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as prefixSearch.
     */
    public void setStatus_PrefixSearch(String status) {
        regStatus(CK_PS, fRES(status));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param status The value of status as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatus_LikeSearch(String status, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(status), getCValueStatus(), "Status", "Status", "status", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param statusList The collection of status as inScope.
     */
    public void setStatus_InScope(Collection<String> statusList) {
        regStatus(CK_INS, cTL(statusList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param status The collection of status as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStatus_InScope(String status, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(status), getCValueStatus(), "Status", "Status", "status", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStatus_IsNull() { regStatus(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStatus_IsNotNull() { regStatus(CK_ISNN, DUMMY_OBJECT); }

    protected void regStatus(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStatus(), "Status", "Status", "status");
    }
    protected void registerInlineStatus(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStatus(), "Status", "Status", "status");
    }
    abstract protected ConditionValue getCValueStatus();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param daterun The value of daterun as equal.
     */
    public void setDaterun_Equal(java.sql.Timestamp daterun) {
        regDaterun(CK_EQ, daterun);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param daterun The value of daterun as greaterThan.
     */
    public void setDaterun_GreaterThan(java.sql.Timestamp daterun) {
        regDaterun(CK_GT, daterun);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param daterun The value of daterun as lessThan.
     */
    public void setDaterun_LessThan(java.sql.Timestamp daterun) {
        regDaterun(CK_LT, daterun);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param daterun The value of daterun as greaterEqual.
     */
    public void setDaterun_GreaterEqual(java.sql.Timestamp daterun) {
        regDaterun(CK_GE, daterun);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param daterun The value of daterun as lessEqual.
     */
    public void setDaterun_LessEqual(java.sql.Timestamp daterun) {
        regDaterun(CK_LE, daterun);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of daterun. (Nullable)
     * @param toDate The to-date of daterun. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDaterun_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueDaterun(), "DateRun", "Daterun", "daterun", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of daterun. (Nullable)
     * @param toDate The to-date of daterun. (Nullable)
     */
    public void setDaterun_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setDaterun_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDaterun_IsNull() { regDaterun(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDaterun_IsNotNull() { regDaterun(CK_ISNN, DUMMY_OBJECT); }

    protected void regDaterun(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDaterun(), "DateRun", "Daterun", "daterun");
    }
    protected void registerInlineDaterun(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDaterun(), "DateRun", "Daterun", "daterun");
    }
    abstract protected ConditionValue getCValueDaterun();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param results The value of results as equal.
     */
    public void setResults_Equal(String results) {
        regResults(CK_EQ, fRES(results));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param results The value of results as notEqual.
     */
    public void setResults_NotEqual(String results) {
        regResults(CK_NE, fRES(results));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param results The value of results as greaterThan.
     */
    public void setResults_GreaterThan(String results) {
        regResults(CK_GT, fRES(results));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param results The value of results as lessThan.
     */
    public void setResults_LessThan(String results) {
        regResults(CK_LT, fRES(results));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param results The value of results as greaterEqual.
     */
    public void setResults_GreaterEqual(String results) {
        regResults(CK_GE, fRES(results));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param results The value of results as lessEqual.
     */
    public void setResults_LessEqual(String results) {
        regResults(CK_LE, fRES(results));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param results The value of results as prefixSearch.
     */
    public void setResults_PrefixSearch(String results) {
        regResults(CK_PS, fRES(results));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param results The value of results as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setResults_LikeSearch(String results, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(results), getCValueResults(), "Results", "Results", "results", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param resultsList The collection of results as inScope.
     */
    public void setResults_InScope(Collection<String> resultsList) {
        regResults(CK_INS, cTL(resultsList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param results The collection of results as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setResults_InScope(String results, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(results), getCValueResults(), "Results", "Results", "results", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setResults_IsNull() { regResults(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setResults_IsNotNull() { regResults(CK_ISNN, DUMMY_OBJECT); }

    protected void regResults(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueResults(), "Results", "Results", "results");
    }
    protected void registerInlineResults(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueResults(), "Results", "Results", "results");
    }
    abstract protected ConditionValue getCValueResults();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param runby The value of runby as equal.
     */
    public void setRunby_Equal(String runby) {
        regRunby(CK_EQ, fRES(runby));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param runby The value of runby as notEqual.
     */
    public void setRunby_NotEqual(String runby) {
        regRunby(CK_NE, fRES(runby));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param runby The value of runby as greaterThan.
     */
    public void setRunby_GreaterThan(String runby) {
        regRunby(CK_GT, fRES(runby));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param runby The value of runby as lessThan.
     */
    public void setRunby_LessThan(String runby) {
        regRunby(CK_LT, fRES(runby));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param runby The value of runby as greaterEqual.
     */
    public void setRunby_GreaterEqual(String runby) {
        regRunby(CK_GE, fRES(runby));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param runby The value of runby as lessEqual.
     */
    public void setRunby_LessEqual(String runby) {
        regRunby(CK_LE, fRES(runby));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param runby The value of runby as prefixSearch.
     */
    public void setRunby_PrefixSearch(String runby) {
        regRunby(CK_PS, fRES(runby));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param runby The value of runby as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRunby_LikeSearch(String runby, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(runby), getCValueRunby(), "RunBy", "Runby", "runby", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param runbyList The collection of runby as inScope.
     */
    public void setRunby_InScope(Collection<String> runbyList) {
        regRunby(CK_INS, cTL(runbyList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param runby The collection of runby as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setRunby_InScope(String runby, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(runby), getCValueRunby(), "RunBy", "Runby", "runby", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRunby_IsNull() { regRunby(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRunby_IsNotNull() { regRunby(CK_ISNN, DUMMY_OBJECT); }

    protected void regRunby(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRunby(), "RunBy", "Runby", "runby");
    }
    protected void registerInlineRunby(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRunby(), "RunBy", "Runby", "runby");
    }
    abstract protected ConditionValue getCValueRunby();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param checkby The value of checkby as equal.
     */
    public void setCheckby_Equal(String checkby) {
        regCheckby(CK_EQ, fRES(checkby));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param checkby The value of checkby as notEqual.
     */
    public void setCheckby_NotEqual(String checkby) {
        regCheckby(CK_NE, fRES(checkby));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param checkby The value of checkby as greaterThan.
     */
    public void setCheckby_GreaterThan(String checkby) {
        regCheckby(CK_GT, fRES(checkby));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param checkby The value of checkby as lessThan.
     */
    public void setCheckby_LessThan(String checkby) {
        regCheckby(CK_LT, fRES(checkby));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param checkby The value of checkby as greaterEqual.
     */
    public void setCheckby_GreaterEqual(String checkby) {
        regCheckby(CK_GE, fRES(checkby));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param checkby The value of checkby as lessEqual.
     */
    public void setCheckby_LessEqual(String checkby) {
        regCheckby(CK_LE, fRES(checkby));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param checkby The value of checkby as prefixSearch.
     */
    public void setCheckby_PrefixSearch(String checkby) {
        regCheckby(CK_PS, fRES(checkby));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param checkby The value of checkby as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCheckby_LikeSearch(String checkby, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(checkby), getCValueCheckby(), "CheckBy", "Checkby", "checkby", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param checkbyList The collection of checkby as inScope.
     */
    public void setCheckby_InScope(Collection<String> checkbyList) {
        regCheckby(CK_INS, cTL(checkbyList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param checkby The collection of checkby as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setCheckby_InScope(String checkby, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(checkby), getCValueCheckby(), "CheckBy", "Checkby", "checkby", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCheckby_IsNull() { regCheckby(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCheckby_IsNotNull() { regCheckby(CK_ISNN, DUMMY_OBJECT); }

    protected void regCheckby(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCheckby(), "CheckBy", "Checkby", "checkby");
    }
    protected void registerInlineCheckby(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCheckby(), "CheckBy", "Checkby", "checkby");
    }
    abstract protected ConditionValue getCValueCheckby();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TObjecttestsCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TObjecttestsCQ.class.getName(); }
}
