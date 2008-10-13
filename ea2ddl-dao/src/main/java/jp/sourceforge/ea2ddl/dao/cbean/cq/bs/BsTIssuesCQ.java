package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_issues.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTIssuesCQ extends AbstractBsTIssuesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TIssuesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTIssuesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_issues) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TIssuesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TIssuesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_issues on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TIssuesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TIssuesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _issue;
    public ConditionValue getIssue() {
        if (_issue == null) { _issue = new ConditionValue(); }
        return _issue;
    }
    protected ConditionValue getCValueIssue() { return getIssue(); }
    
    public BsTIssuesCQ addOrderBy_Issue_Asc() { regOBA("Issue"); return this; }
    public BsTIssuesCQ addOrderBy_Issue_Desc() { regOBD("Issue"); return this; }

    protected ConditionValue _issuedate;
    public ConditionValue getIssuedate() {
        if (_issuedate == null) { _issuedate = new ConditionValue(); }
        return _issuedate;
    }
    protected ConditionValue getCValueIssuedate() { return getIssuedate(); }
    
    public BsTIssuesCQ addOrderBy_Issuedate_Asc() { regOBA("IssueDate"); return this; }
    public BsTIssuesCQ addOrderBy_Issuedate_Desc() { regOBD("IssueDate"); return this; }

    protected ConditionValue _owner;
    public ConditionValue getOwner() {
        if (_owner == null) { _owner = new ConditionValue(); }
        return _owner;
    }
    protected ConditionValue getCValueOwner() { return getOwner(); }
    
    public BsTIssuesCQ addOrderBy_Owner_Asc() { regOBA("Owner"); return this; }
    public BsTIssuesCQ addOrderBy_Owner_Desc() { regOBD("Owner"); return this; }

    protected ConditionValue _status;
    public ConditionValue getStatus() {
        if (_status == null) { _status = new ConditionValue(); }
        return _status;
    }
    protected ConditionValue getCValueStatus() { return getStatus(); }
    
    public BsTIssuesCQ addOrderBy_Status_Asc() { regOBA("Status"); return this; }
    public BsTIssuesCQ addOrderBy_Status_Desc() { regOBD("Status"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTIssuesCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTIssuesCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _resolver;
    public ConditionValue getResolver() {
        if (_resolver == null) { _resolver = new ConditionValue(); }
        return _resolver;
    }
    protected ConditionValue getCValueResolver() { return getResolver(); }
    
    public BsTIssuesCQ addOrderBy_Resolver_Asc() { regOBA("Resolver"); return this; }
    public BsTIssuesCQ addOrderBy_Resolver_Desc() { regOBD("Resolver"); return this; }

    protected ConditionValue _dateresolved;
    public ConditionValue getDateresolved() {
        if (_dateresolved == null) { _dateresolved = new ConditionValue(); }
        return _dateresolved;
    }
    protected ConditionValue getCValueDateresolved() { return getDateresolved(); }
    
    public BsTIssuesCQ addOrderBy_Dateresolved_Asc() { regOBA("DateResolved"); return this; }
    public BsTIssuesCQ addOrderBy_Dateresolved_Desc() { regOBD("DateResolved"); return this; }

    protected ConditionValue _resolution;
    public ConditionValue getResolution() {
        if (_resolution == null) { _resolution = new ConditionValue(); }
        return _resolution;
    }
    protected ConditionValue getCValueResolution() { return getResolution(); }
    
    public BsTIssuesCQ addOrderBy_Resolution_Asc() { regOBA("Resolution"); return this; }
    public BsTIssuesCQ addOrderBy_Resolution_Desc() { regOBD("Resolution"); return this; }

    protected ConditionValue _issueid;
    public ConditionValue getIssueid() {
        if (_issueid == null) { _issueid = new ConditionValue(); }
        return _issueid;
    }
    protected ConditionValue getCValueIssueid() { return getIssueid(); }
          
    public BsTIssuesCQ addOrderBy_Issueid_Asc() { regOBA("IssueID"); return this; }
    public BsTIssuesCQ addOrderBy_Issueid_Desc() { regOBD("IssueID"); return this; }

    protected ConditionValue _category;
    public ConditionValue getCategory() {
        if (_category == null) { _category = new ConditionValue(); }
        return _category;
    }
    protected ConditionValue getCValueCategory() { return getCategory(); }
    
    public BsTIssuesCQ addOrderBy_Category_Asc() { regOBA("Category"); return this; }
    public BsTIssuesCQ addOrderBy_Category_Desc() { regOBD("Category"); return this; }

    protected ConditionValue _priority;
    public ConditionValue getPriority() {
        if (_priority == null) { _priority = new ConditionValue(); }
        return _priority;
    }
    protected ConditionValue getCValuePriority() { return getPriority(); }
    
    public BsTIssuesCQ addOrderBy_Priority_Asc() { regOBA("Priority"); return this; }
    public BsTIssuesCQ addOrderBy_Priority_Desc() { regOBD("Priority"); return this; }

    protected ConditionValue _severity;
    public ConditionValue getSeverity() {
        if (_severity == null) { _severity = new ConditionValue(); }
        return _severity;
    }
    protected ConditionValue getCValueSeverity() { return getSeverity(); }
    
    public BsTIssuesCQ addOrderBy_Severity_Asc() { regOBA("Severity"); return this; }
    public BsTIssuesCQ addOrderBy_Severity_Desc() { regOBD("Severity"); return this; }

    protected ConditionValue _issuetype;
    public ConditionValue getIssuetype() {
        if (_issuetype == null) { _issuetype = new ConditionValue(); }
        return _issuetype;
    }
    protected ConditionValue getCValueIssuetype() { return getIssuetype(); }
    
    public BsTIssuesCQ addOrderBy_Issuetype_Asc() { regOBA("IssueType"); return this; }
    public BsTIssuesCQ addOrderBy_Issuetype_Desc() { regOBD("IssueType"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTIssuesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTIssuesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TIssuesCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
