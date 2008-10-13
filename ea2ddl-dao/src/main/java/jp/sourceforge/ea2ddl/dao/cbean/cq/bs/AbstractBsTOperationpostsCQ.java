package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_operationposts.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTOperationpostsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTOperationpostsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_operationposts";
    }
    
    public String getTableSqlName() {
        return "t_operationposts";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : INTEGER}
     * @param operationid The value of operationid as equal.
     */
    public void setOperationid_Equal(java.lang.Integer operationid) {
        regOperationid(CK_EQ, operationid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param operationid The value of operationid as notEqual.
     */
    public void setOperationid_NotEqual(java.lang.Integer operationid) {
        regOperationid(CK_NE, operationid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param operationid The value of operationid as greaterThan.
     */
    public void setOperationid_GreaterThan(java.lang.Integer operationid) {
        regOperationid(CK_GT, operationid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param operationid The value of operationid as lessThan.
     */
    public void setOperationid_LessThan(java.lang.Integer operationid) {
        regOperationid(CK_LT, operationid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param operationid The value of operationid as greaterEqual.
     */
    public void setOperationid_GreaterEqual(java.lang.Integer operationid) {
        regOperationid(CK_GE, operationid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param operationid The value of operationid as lessEqual.
     */
    public void setOperationid_LessEqual(java.lang.Integer operationid) {
        regOperationid(CK_LE, operationid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param operationidList The collection of operationid as inScope.
     */
    public void setOperationid_InScope(Collection<java.lang.Integer> operationidList) {
        regOperationid(CK_INS, cTL(operationidList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setOperationid_IsNull() { regOperationid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setOperationid_IsNotNull() { regOperationid(CK_ISNN, DUMMY_OBJECT); }

    protected void regOperationid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueOperationid(), "OperationID", "Operationid", "operationid");
    }
    protected void registerInlineOperationid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueOperationid(), "OperationID", "Operationid", "operationid");
    }
    abstract protected ConditionValue getCValueOperationid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(255)}
     * @param postcondition The value of postcondition as equal.
     */
    public void setPostcondition_Equal(String postcondition) {
        regPostcondition(CK_EQ, fRES(postcondition));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param postcondition The value of postcondition as notEqual.
     */
    public void setPostcondition_NotEqual(String postcondition) {
        regPostcondition(CK_NE, fRES(postcondition));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param postcondition The value of postcondition as greaterThan.
     */
    public void setPostcondition_GreaterThan(String postcondition) {
        regPostcondition(CK_GT, fRES(postcondition));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param postcondition The value of postcondition as lessThan.
     */
    public void setPostcondition_LessThan(String postcondition) {
        regPostcondition(CK_LT, fRES(postcondition));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param postcondition The value of postcondition as greaterEqual.
     */
    public void setPostcondition_GreaterEqual(String postcondition) {
        regPostcondition(CK_GE, fRES(postcondition));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param postcondition The value of postcondition as lessEqual.
     */
    public void setPostcondition_LessEqual(String postcondition) {
        regPostcondition(CK_LE, fRES(postcondition));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param postcondition The value of postcondition as prefixSearch.
     */
    public void setPostcondition_PrefixSearch(String postcondition) {
        regPostcondition(CK_PS, fRES(postcondition));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param postcondition The value of postcondition as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPostcondition_LikeSearch(String postcondition, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(postcondition), getCValuePostcondition(), "PostCondition", "Postcondition", "postcondition", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param postconditionList The collection of postcondition as inScope.
     */
    public void setPostcondition_InScope(Collection<String> postconditionList) {
        regPostcondition(CK_INS, cTL(postconditionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param postcondition The collection of postcondition as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPostcondition_InScope(String postcondition, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(postcondition), getCValuePostcondition(), "PostCondition", "Postcondition", "postcondition", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPostcondition_IsNull() { regPostcondition(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPostcondition_IsNotNull() { regPostcondition(CK_ISNN, DUMMY_OBJECT); }

    protected void regPostcondition(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePostcondition(), "PostCondition", "Postcondition", "postcondition");
    }
    protected void registerInlinePostcondition(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePostcondition(), "PostCondition", "Postcondition", "postcondition");
    }
    abstract protected ConditionValue getCValuePostcondition();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param type The value of type as equal.
     */
    public void setType_Equal(String type) {
        regType(CK_EQ, fRES(type));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as notEqual.
     */
    public void setType_NotEqual(String type) {
        regType(CK_NE, fRES(type));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as greaterThan.
     */
    public void setType_GreaterThan(String type) {
        regType(CK_GT, fRES(type));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as lessThan.
     */
    public void setType_LessThan(String type) {
        regType(CK_LT, fRES(type));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as greaterEqual.
     */
    public void setType_GreaterEqual(String type) {
        regType(CK_GE, fRES(type));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as lessEqual.
     */
    public void setType_LessEqual(String type) {
        regType(CK_LE, fRES(type));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as prefixSearch.
     */
    public void setType_PrefixSearch(String type) {
        regType(CK_PS, fRES(type));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param type The value of type as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setType_LikeSearch(String type, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(type), getCValueType(), "Type", "Type", "type", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeList The collection of type as inScope.
     */
    public void setType_InScope(Collection<String> typeList) {
        regType(CK_INS, cTL(typeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param type The collection of type as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setType_InScope(String type, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(type), getCValueType(), "Type", "Type", "type", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setType_IsNull() { regType(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setType_IsNotNull() { regType(CK_ISNN, DUMMY_OBJECT); }

    protected void regType(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueType(), "Type", "Type", "type");
    }
    protected void registerInlineType(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueType(), "Type", "Type", "type");
    }
    abstract protected ConditionValue getCValueType();

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

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TOperationpostsCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TOperationpostsCQ.class.getName(); }
}
