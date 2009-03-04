package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objectproblems.
 * @author DBFlute(AutoGenerator)
 */
public class BsTObjectproblemsCQ extends AbstractBsTObjectproblemsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectproblemsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectproblemsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objectproblems) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjectproblemsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjectproblemsCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objectproblems on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjectproblemsCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TObjectproblemsCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _objectId;
    public ConditionValue getObjectId() {
        if (_objectId == null) { _objectId = new ConditionValue(); }
        return _objectId;
    }
    protected ConditionValue getCValueObjectId() { return getObjectId(); }

    public BsTObjectproblemsCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjectproblemsCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _problem;
    public ConditionValue getProblem() {
        if (_problem == null) { _problem = new ConditionValue(); }
        return _problem;
    }
    protected ConditionValue getCValueProblem() { return getProblem(); }

    public BsTObjectproblemsCQ addOrderBy_Problem_Asc() { regOBA("Problem"); return this; }
    public BsTObjectproblemsCQ addOrderBy_Problem_Desc() { regOBD("Problem"); return this; }

    protected ConditionValue _problemtype;
    public ConditionValue getProblemtype() {
        if (_problemtype == null) { _problemtype = new ConditionValue(); }
        return _problemtype;
    }
    protected ConditionValue getCValueProblemtype() { return getProblemtype(); }

    public BsTObjectproblemsCQ addOrderBy_Problemtype_Asc() { regOBA("ProblemType"); return this; }
    public BsTObjectproblemsCQ addOrderBy_Problemtype_Desc() { regOBD("ProblemType"); return this; }

    protected ConditionValue _datereported;
    public ConditionValue getDatereported() {
        if (_datereported == null) { _datereported = new ConditionValue(); }
        return _datereported;
    }
    protected ConditionValue getCValueDatereported() { return getDatereported(); }

    public BsTObjectproblemsCQ addOrderBy_Datereported_Asc() { regOBA("DateReported"); return this; }
    public BsTObjectproblemsCQ addOrderBy_Datereported_Desc() { regOBD("DateReported"); return this; }

    protected ConditionValue _status;
    public ConditionValue getStatus() {
        if (_status == null) { _status = new ConditionValue(); }
        return _status;
    }
    protected ConditionValue getCValueStatus() { return getStatus(); }

    public BsTObjectproblemsCQ addOrderBy_Status_Asc() { regOBA("Status"); return this; }
    public BsTObjectproblemsCQ addOrderBy_Status_Desc() { regOBD("Status"); return this; }

    protected ConditionValue _problemnotes;
    public ConditionValue getProblemnotes() {
        if (_problemnotes == null) { _problemnotes = new ConditionValue(); }
        return _problemnotes;
    }
    protected ConditionValue getCValueProblemnotes() { return getProblemnotes(); }

    public BsTObjectproblemsCQ addOrderBy_Problemnotes_Asc() { regOBA("ProblemNotes"); return this; }
    public BsTObjectproblemsCQ addOrderBy_Problemnotes_Desc() { regOBD("ProblemNotes"); return this; }

    protected ConditionValue _reportedby;
    public ConditionValue getReportedby() {
        if (_reportedby == null) { _reportedby = new ConditionValue(); }
        return _reportedby;
    }
    protected ConditionValue getCValueReportedby() { return getReportedby(); }

    public BsTObjectproblemsCQ addOrderBy_Reportedby_Asc() { regOBA("ReportedBy"); return this; }
    public BsTObjectproblemsCQ addOrderBy_Reportedby_Desc() { regOBD("ReportedBy"); return this; }

    protected ConditionValue _resolvedby;
    public ConditionValue getResolvedby() {
        if (_resolvedby == null) { _resolvedby = new ConditionValue(); }
        return _resolvedby;
    }
    protected ConditionValue getCValueResolvedby() { return getResolvedby(); }

    public BsTObjectproblemsCQ addOrderBy_Resolvedby_Asc() { regOBA("ResolvedBy"); return this; }
    public BsTObjectproblemsCQ addOrderBy_Resolvedby_Desc() { regOBD("ResolvedBy"); return this; }

    protected ConditionValue _dateresolved;
    public ConditionValue getDateresolved() {
        if (_dateresolved == null) { _dateresolved = new ConditionValue(); }
        return _dateresolved;
    }
    protected ConditionValue getCValueDateresolved() { return getDateresolved(); }

    public BsTObjectproblemsCQ addOrderBy_Dateresolved_Asc() { regOBA("DateResolved"); return this; }
    public BsTObjectproblemsCQ addOrderBy_Dateresolved_Desc() { regOBD("DateResolved"); return this; }

    protected ConditionValue _version;
    public ConditionValue getVersion() {
        if (_version == null) { _version = new ConditionValue(); }
        return _version;
    }
    protected ConditionValue getCValueVersion() { return getVersion(); }

    public BsTObjectproblemsCQ addOrderBy_Version_Asc() { regOBA("Version"); return this; }
    public BsTObjectproblemsCQ addOrderBy_Version_Desc() { regOBD("Version"); return this; }

    protected ConditionValue _resolvernotes;
    public ConditionValue getResolvernotes() {
        if (_resolvernotes == null) { _resolvernotes = new ConditionValue(); }
        return _resolvernotes;
    }
    protected ConditionValue getCValueResolvernotes() { return getResolvernotes(); }

    public BsTObjectproblemsCQ addOrderBy_Resolvernotes_Asc() { regOBA("ResolverNotes"); return this; }
    public BsTObjectproblemsCQ addOrderBy_Resolvernotes_Desc() { regOBD("ResolverNotes"); return this; }

    protected ConditionValue _priority;
    public ConditionValue getPriority() {
        if (_priority == null) { _priority = new ConditionValue(); }
        return _priority;
    }
    protected ConditionValue getCValuePriority() { return getPriority(); }

    public BsTObjectproblemsCQ addOrderBy_Priority_Asc() { regOBA("Priority"); return this; }
    public BsTObjectproblemsCQ addOrderBy_Priority_Desc() { regOBD("Priority"); return this; }

    protected ConditionValue _severity;
    public ConditionValue getSeverity() {
        if (_severity == null) { _severity = new ConditionValue(); }
        return _severity;
    }
    protected ConditionValue getCValueSeverity() { return getSeverity(); }

    public BsTObjectproblemsCQ addOrderBy_Severity_Asc() { regOBA("Severity"); return this; }
    public BsTObjectproblemsCQ addOrderBy_Severity_Desc() { regOBD("Severity"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjectproblemsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjectproblemsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TObjectproblemsCB.class.getName(); }
    String xCQ() { return TObjectproblemsCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
