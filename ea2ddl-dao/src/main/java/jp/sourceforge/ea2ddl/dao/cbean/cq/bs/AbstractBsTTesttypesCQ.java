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
 * The abstract condition-query of t_testtypes.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTesttypesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTesttypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_testtypes";
    }
    
    public String getTableSqlName() {
        return "t_testtypes";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(12)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param description The value of description as equal.
     */
    public void setDescription_Equal(String description) {
        regDescription(CK_EQ, fRES(description));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as notEqual.
     */
    public void setDescription_NotEqual(String description) {
        regDescription(CK_NE, fRES(description));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as greaterThan.
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as lessThan.
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as greaterEqual.
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as lessEqual.
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as prefixSearch.
     */
    public void setDescription_PrefixSearch(String description) {
        regDescription(CK_PS, fRES(description));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param descriptionList The collection of description as inScope.
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        regDescription(CK_INS, cTL(descriptionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), getCValueDescription(), "Description", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), getCValueDescription(), "Description", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDescription_IsNull() { regDescription(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDescription_IsNotNull() { regDescription(CK_ISNN, DOBJ); }

    protected void regDescription(ConditionKey k, Object v) { regQ(k, v, getCValueDescription(), "Description"); }
    abstract protected ConditionValue getCValueDescription();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DOUBLE}
     * @param numericweight The value of numericweight as equal.
     */
    public void setNumericweight_Equal(java.math.BigDecimal numericweight) {
        regNumericweight(CK_EQ, numericweight);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param numericweight The value of numericweight as notEqual.
     */
    public void setNumericweight_NotEqual(java.math.BigDecimal numericweight) {
        regNumericweight(CK_NE, numericweight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param numericweight The value of numericweight as greaterThan.
     */
    public void setNumericweight_GreaterThan(java.math.BigDecimal numericweight) {
        regNumericweight(CK_GT, numericweight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param numericweight The value of numericweight as lessThan.
     */
    public void setNumericweight_LessThan(java.math.BigDecimal numericweight) {
        regNumericweight(CK_LT, numericweight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param numericweight The value of numericweight as greaterEqual.
     */
    public void setNumericweight_GreaterEqual(java.math.BigDecimal numericweight) {
        regNumericweight(CK_GE, numericweight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param numericweight The value of numericweight as lessEqual.
     */
    public void setNumericweight_LessEqual(java.math.BigDecimal numericweight) {
        regNumericweight(CK_LE, numericweight);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param numericweightList The collection of numericweight as inScope.
     */
    public void setNumericweight_InScope(Collection<java.math.BigDecimal> numericweightList) {
        regNumericweight(CK_INS, cTL(numericweightList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNumericweight_IsNull() { regNumericweight(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNumericweight_IsNotNull() { regNumericweight(CK_ISNN, DOBJ); }

    protected void regNumericweight(ConditionKey k, Object v) { regQ(k, v, getCValueNumericweight(), "NumericWeight"); }
    abstract protected ConditionValue getCValueNumericweight();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
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
    String xCB() { return TTesttypesCB.class.getName(); }
    String xCQ() { return TTesttypesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
