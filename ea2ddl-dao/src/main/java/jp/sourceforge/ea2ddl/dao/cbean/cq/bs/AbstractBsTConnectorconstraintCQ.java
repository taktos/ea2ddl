package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_connectorconstraint.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTConnectorconstraintCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTConnectorconstraintCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_connectorconstraint";
    }
    
    public String getTableSqlName() {
        return "t_connectorconstraint";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : INTEGER}
     * @param connectorid The value of connectorid as equal.
     */
    public void setConnectorid_Equal(java.lang.Integer connectorid) {
        regConnectorid(CK_EQ, connectorid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param connectorid The value of connectorid as notEqual.
     */
    public void setConnectorid_NotEqual(java.lang.Integer connectorid) {
        regConnectorid(CK_NE, connectorid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param connectorid The value of connectorid as greaterThan.
     */
    public void setConnectorid_GreaterThan(java.lang.Integer connectorid) {
        regConnectorid(CK_GT, connectorid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param connectorid The value of connectorid as lessThan.
     */
    public void setConnectorid_LessThan(java.lang.Integer connectorid) {
        regConnectorid(CK_LT, connectorid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param connectorid The value of connectorid as greaterEqual.
     */
    public void setConnectorid_GreaterEqual(java.lang.Integer connectorid) {
        regConnectorid(CK_GE, connectorid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param connectorid The value of connectorid as lessEqual.
     */
    public void setConnectorid_LessEqual(java.lang.Integer connectorid) {
        regConnectorid(CK_LE, connectorid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param connectoridList The collection of connectorid as inScope.
     */
    public void setConnectorid_InScope(Collection<java.lang.Integer> connectoridList) {
        regConnectorid(CK_INS, cTL(connectoridList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setConnectorid_IsNull() { regConnectorid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setConnectorid_IsNotNull() { regConnectorid(CK_ISNN, DUMMY_OBJECT); }

    protected void regConnectorid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueConnectorid(), "ConnectorID", "Connectorid", "connectorid");
    }
    protected void registerInlineConnectorid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueConnectorid(), "ConnectorID", "Connectorid", "connectorid");
    }
    abstract protected ConditionValue getCValueConnectorid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(255)}
     * @param constraint The value of constraint as equal.
     */
    public void setConstraint_Equal(String constraint) {
        regConstraint(CK_EQ, fRES(constraint));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constraint The value of constraint as notEqual.
     */
    public void setConstraint_NotEqual(String constraint) {
        regConstraint(CK_NE, fRES(constraint));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param constraint The value of constraint as greaterThan.
     */
    public void setConstraint_GreaterThan(String constraint) {
        regConstraint(CK_GT, fRES(constraint));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param constraint The value of constraint as lessThan.
     */
    public void setConstraint_LessThan(String constraint) {
        regConstraint(CK_LT, fRES(constraint));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constraint The value of constraint as greaterEqual.
     */
    public void setConstraint_GreaterEqual(String constraint) {
        regConstraint(CK_GE, fRES(constraint));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constraint The value of constraint as lessEqual.
     */
    public void setConstraint_LessEqual(String constraint) {
        regConstraint(CK_LE, fRES(constraint));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param constraint The value of constraint as prefixSearch.
     */
    public void setConstraint_PrefixSearch(String constraint) {
        regConstraint(CK_PS, fRES(constraint));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constraint The value of constraint as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstraint_LikeSearch(String constraint, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(constraint), getCValueConstraint(), "Constraint", "Constraint", "constraint", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constraintList The collection of constraint as inScope.
     */
    public void setConstraint_InScope(Collection<String> constraintList) {
        regConstraint(CK_INS, cTL(constraintList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constraint The collection of constraint as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setConstraint_InScope(String constraint, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(constraint), getCValueConstraint(), "Constraint", "Constraint", "constraint", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setConstraint_IsNull() { regConstraint(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setConstraint_IsNotNull() { regConstraint(CK_ISNN, DUMMY_OBJECT); }

    protected void regConstraint(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueConstraint(), "Constraint", "Constraint", "constraint");
    }
    protected void registerInlineConstraint(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueConstraint(), "Constraint", "Constraint", "constraint");
    }
    abstract protected ConditionValue getCValueConstraint();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param constrainttype The value of constrainttype as equal.
     */
    public void setConstrainttype_Equal(String constrainttype) {
        regConstrainttype(CK_EQ, fRES(constrainttype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constrainttype The value of constrainttype as notEqual.
     */
    public void setConstrainttype_NotEqual(String constrainttype) {
        regConstrainttype(CK_NE, fRES(constrainttype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param constrainttype The value of constrainttype as greaterThan.
     */
    public void setConstrainttype_GreaterThan(String constrainttype) {
        regConstrainttype(CK_GT, fRES(constrainttype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param constrainttype The value of constrainttype as lessThan.
     */
    public void setConstrainttype_LessThan(String constrainttype) {
        regConstrainttype(CK_LT, fRES(constrainttype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constrainttype The value of constrainttype as greaterEqual.
     */
    public void setConstrainttype_GreaterEqual(String constrainttype) {
        regConstrainttype(CK_GE, fRES(constrainttype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constrainttype The value of constrainttype as lessEqual.
     */
    public void setConstrainttype_LessEqual(String constrainttype) {
        regConstrainttype(CK_LE, fRES(constrainttype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param constrainttype The value of constrainttype as prefixSearch.
     */
    public void setConstrainttype_PrefixSearch(String constrainttype) {
        regConstrainttype(CK_PS, fRES(constrainttype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constrainttype The value of constrainttype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstrainttype_LikeSearch(String constrainttype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(constrainttype), getCValueConstrainttype(), "ConstraintType", "Constrainttype", "constrainttype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constrainttypeList The collection of constrainttype as inScope.
     */
    public void setConstrainttype_InScope(Collection<String> constrainttypeList) {
        regConstrainttype(CK_INS, cTL(constrainttypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constrainttype The collection of constrainttype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setConstrainttype_InScope(String constrainttype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(constrainttype), getCValueConstrainttype(), "ConstraintType", "Constrainttype", "constrainttype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setConstrainttype_IsNull() { regConstrainttype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setConstrainttype_IsNotNull() { regConstrainttype(CK_ISNN, DUMMY_OBJECT); }

    protected void regConstrainttype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueConstrainttype(), "ConstraintType", "Constrainttype", "constrainttype");
    }
    protected void registerInlineConstrainttype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueConstrainttype(), "ConstraintType", "Constrainttype", "constrainttype");
    }
    abstract protected ConditionValue getCValueConstrainttype();

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
    protected String getConditionBeanClassNameInternally() { return TConnectorconstraintCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TConnectorconstraintCQ.class.getName(); }
}
