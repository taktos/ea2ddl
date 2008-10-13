package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_tcf.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTTcfCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTcfCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_tcf";
    }
    
    public String getTableSqlName() {
        return "t_tcf";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(12)}
     * @param tcfid The value of tcfid as equal.
     */
    public void setTcfid_Equal(String tcfid) {
        regTcfid(CK_EQ, fRES(tcfid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tcfid The value of tcfid as notEqual.
     */
    public void setTcfid_NotEqual(String tcfid) {
        regTcfid(CK_NE, fRES(tcfid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param tcfid The value of tcfid as greaterThan.
     */
    public void setTcfid_GreaterThan(String tcfid) {
        regTcfid(CK_GT, fRES(tcfid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param tcfid The value of tcfid as lessThan.
     */
    public void setTcfid_LessThan(String tcfid) {
        regTcfid(CK_LT, fRES(tcfid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tcfid The value of tcfid as greaterEqual.
     */
    public void setTcfid_GreaterEqual(String tcfid) {
        regTcfid(CK_GE, fRES(tcfid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param tcfid The value of tcfid as lessEqual.
     */
    public void setTcfid_LessEqual(String tcfid) {
        regTcfid(CK_LE, fRES(tcfid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param tcfid The value of tcfid as prefixSearch.
     */
    public void setTcfid_PrefixSearch(String tcfid) {
        regTcfid(CK_PS, fRES(tcfid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param tcfid The value of tcfid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTcfid_LikeSearch(String tcfid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(tcfid), getCValueTcfid(), "TCFID", "Tcfid", "tcfid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param tcfidList The collection of tcfid as inScope.
     */
    public void setTcfid_InScope(Collection<String> tcfidList) {
        regTcfid(CK_INS, cTL(tcfidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param tcfid The collection of tcfid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTcfid_InScope(String tcfid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(tcfid), getCValueTcfid(), "TCFID", "Tcfid", "tcfid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTcfid_IsNull() { regTcfid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTcfid_IsNotNull() { regTcfid(CK_ISNN, DUMMY_OBJECT); }

    protected void regTcfid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTcfid(), "TCFID", "Tcfid", "tcfid");
    }
    protected void registerInlineTcfid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTcfid(), "TCFID", "Tcfid", "tcfid");
    }
    abstract protected ConditionValue getCValueTcfid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
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
     * @param weight The value of weight as equal.
     */
    public void setWeight_Equal(java.math.BigDecimal weight) {
        regWeight(CK_EQ, weight);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param weight The value of weight as notEqual.
     */
    public void setWeight_NotEqual(java.math.BigDecimal weight) {
        regWeight(CK_NE, weight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param weight The value of weight as greaterThan.
     */
    public void setWeight_GreaterThan(java.math.BigDecimal weight) {
        regWeight(CK_GT, weight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param weight The value of weight as lessThan.
     */
    public void setWeight_LessThan(java.math.BigDecimal weight) {
        regWeight(CK_LT, weight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param weight The value of weight as greaterEqual.
     */
    public void setWeight_GreaterEqual(java.math.BigDecimal weight) {
        regWeight(CK_GE, weight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setWeight_IsNull() { regWeight(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setWeight_IsNotNull() { regWeight(CK_ISNN, DUMMY_OBJECT); }

    protected void regWeight(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueWeight(), "Weight", "Weight", "weight");
    }
    protected void registerInlineWeight(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueWeight(), "Weight", "Weight", "weight");
    }
    abstract protected ConditionValue getCValueWeight();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DOUBLE}
     * @param value The value of value as equal.
     */
    public void setValue_Equal(java.math.BigDecimal value) {
        regValue(CK_EQ, value);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param value The value of value as notEqual.
     */
    public void setValue_NotEqual(java.math.BigDecimal value) {
        regValue(CK_NE, value);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param value The value of value as greaterThan.
     */
    public void setValue_GreaterThan(java.math.BigDecimal value) {
        regValue(CK_GT, value);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param value The value of value as lessThan.
     */
    public void setValue_LessThan(java.math.BigDecimal value) {
        regValue(CK_LT, value);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param value The value of value as greaterEqual.
     */
    public void setValue_GreaterEqual(java.math.BigDecimal value) {
        regValue(CK_GE, value);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param value The value of value as lessEqual.
     */
    public void setValue_LessEqual(java.math.BigDecimal value) {
        regValue(CK_LE, value);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param valueList The collection of value as inScope.
     */
    public void setValue_InScope(Collection<java.math.BigDecimal> valueList) {
        regValue(CK_INS, cTL(valueList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setValue_IsNull() { regValue(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setValue_IsNotNull() { regValue(CK_ISNN, DUMMY_OBJECT); }

    protected void regValue(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueValue(), "Value", "Value", "value");
    }
    protected void registerInlineValue(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueValue(), "Value", "Value", "value");
    }
    abstract protected ConditionValue getCValueValue();

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
    protected String getConditionBeanClassNameInternally() { return TTcfCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TTcfCQ.class.getName(); }
}
