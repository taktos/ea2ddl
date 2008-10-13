package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_problemtypes.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTProblemtypesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTProblemtypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_problemtypes";
    }
    
    public String getTableSqlName() {
        return "t_problemtypes";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(12)}
     * @param problemtype The value of problemtype as equal.
     */
    public void setProblemtype_Equal(String problemtype) {
        regProblemtype(CK_EQ, fRES(problemtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param problemtype The value of problemtype as notEqual.
     */
    public void setProblemtype_NotEqual(String problemtype) {
        regProblemtype(CK_NE, fRES(problemtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param problemtype The value of problemtype as greaterThan.
     */
    public void setProblemtype_GreaterThan(String problemtype) {
        regProblemtype(CK_GT, fRES(problemtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param problemtype The value of problemtype as lessThan.
     */
    public void setProblemtype_LessThan(String problemtype) {
        regProblemtype(CK_LT, fRES(problemtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param problemtype The value of problemtype as greaterEqual.
     */
    public void setProblemtype_GreaterEqual(String problemtype) {
        regProblemtype(CK_GE, fRES(problemtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param problemtype The value of problemtype as lessEqual.
     */
    public void setProblemtype_LessEqual(String problemtype) {
        regProblemtype(CK_LE, fRES(problemtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param problemtype The value of problemtype as prefixSearch.
     */
    public void setProblemtype_PrefixSearch(String problemtype) {
        regProblemtype(CK_PS, fRES(problemtype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param problemtype The value of problemtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProblemtype_LikeSearch(String problemtype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(problemtype), getCValueProblemtype(), "ProblemType", "Problemtype", "problemtype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param problemtypeList The collection of problemtype as inScope.
     */
    public void setProblemtype_InScope(Collection<String> problemtypeList) {
        regProblemtype(CK_INS, cTL(problemtypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param problemtype The collection of problemtype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setProblemtype_InScope(String problemtype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(problemtype), getCValueProblemtype(), "ProblemType", "Problemtype", "problemtype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setProblemtype_IsNull() { regProblemtype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setProblemtype_IsNotNull() { regProblemtype(CK_ISNN, DUMMY_OBJECT); }

    protected void regProblemtype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueProblemtype(), "ProblemType", "Problemtype", "problemtype");
    }
    protected void registerInlineProblemtype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueProblemtype(), "ProblemType", "Problemtype", "problemtype");
    }
    abstract protected ConditionValue getCValueProblemtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param description The value of description as equal.
     */
    public void setDescription_Equal(String description) {
        regDescription(CK_EQ, fRES(description));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as notEqual.
     */
    public void setDescription_NotEqual(String description) {
        regDescription(CK_NE, fRES(description));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as greaterThan.
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as lessThan.
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as greaterEqual.
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as lessEqual.
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as prefixSearch.
     */
    public void setDescription_PrefixSearch(String description) {
        regDescription(CK_PS, fRES(description));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(description), getCValueDescription(), "Description", "Description", "description", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param descriptionList The collection of description as inScope.
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        regDescription(CK_INS, cTL(descriptionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param description The collection of description as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDescription_InScope(String description, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(description), getCValueDescription(), "Description", "Description", "description", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDescription_IsNull() { regDescription(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDescription_IsNotNull() { regDescription(CK_ISNN, DUMMY_OBJECT); }

    protected void regDescription(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDescription(), "Description", "Description", "description");
    }
    protected void registerInlineDescription(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDescription(), "Description", "Description", "description");
    }
    abstract protected ConditionValue getCValueDescription();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DOUBLE}
     * @param numericweight The value of numericweight as equal.
     */
    public void setNumericweight_Equal(java.math.BigDecimal numericweight) {
        regNumericweight(CK_EQ, numericweight);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param numericweight The value of numericweight as notEqual.
     */
    public void setNumericweight_NotEqual(java.math.BigDecimal numericweight) {
        regNumericweight(CK_NE, numericweight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param numericweight The value of numericweight as greaterThan.
     */
    public void setNumericweight_GreaterThan(java.math.BigDecimal numericweight) {
        regNumericweight(CK_GT, numericweight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param numericweight The value of numericweight as lessThan.
     */
    public void setNumericweight_LessThan(java.math.BigDecimal numericweight) {
        regNumericweight(CK_LT, numericweight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param numericweight The value of numericweight as greaterEqual.
     */
    public void setNumericweight_GreaterEqual(java.math.BigDecimal numericweight) {
        regNumericweight(CK_GE, numericweight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setNumericweight_IsNull() { regNumericweight(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNumericweight_IsNotNull() { regNumericweight(CK_ISNN, DUMMY_OBJECT); }

    protected void regNumericweight(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNumericweight(), "NumericWeight", "Numericweight", "numericweight");
    }
    protected void registerInlineNumericweight(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNumericweight(), "NumericWeight", "Numericweight", "numericweight");
    }
    abstract protected ConditionValue getCValueNumericweight();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
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
    protected String getConditionBeanClassNameInternally() { return TProblemtypesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TProblemtypesCQ.class.getName(); }
}
