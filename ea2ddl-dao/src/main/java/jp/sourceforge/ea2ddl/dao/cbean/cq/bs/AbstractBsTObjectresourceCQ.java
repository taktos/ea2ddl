package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_objectresource.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTObjectresourceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectresourceCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectresource";
    }
    
    public String getTableSqlName() {
        return "t_objectresource";
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
     * @param resource The value of resource as equal.
     */
    public void setResource_Equal(String resource) {
        regResource(CK_EQ, fRES(resource));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param resource The value of resource as notEqual.
     */
    public void setResource_NotEqual(String resource) {
        regResource(CK_NE, fRES(resource));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param resource The value of resource as greaterThan.
     */
    public void setResource_GreaterThan(String resource) {
        regResource(CK_GT, fRES(resource));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param resource The value of resource as lessThan.
     */
    public void setResource_LessThan(String resource) {
        regResource(CK_LT, fRES(resource));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param resource The value of resource as greaterEqual.
     */
    public void setResource_GreaterEqual(String resource) {
        regResource(CK_GE, fRES(resource));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param resource The value of resource as lessEqual.
     */
    public void setResource_LessEqual(String resource) {
        regResource(CK_LE, fRES(resource));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param resource The value of resource as prefixSearch.
     */
    public void setResource_PrefixSearch(String resource) {
        regResource(CK_PS, fRES(resource));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param resource The value of resource as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setResource_LikeSearch(String resource, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(resource), getCValueResource(), "Resource", "Resource", "resource", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param resourceList The collection of resource as inScope.
     */
    public void setResource_InScope(Collection<String> resourceList) {
        regResource(CK_INS, cTL(resourceList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param resource The collection of resource as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setResource_InScope(String resource, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(resource), getCValueResource(), "Resource", "Resource", "resource", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setResource_IsNull() { regResource(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setResource_IsNotNull() { regResource(CK_ISNN, DUMMY_OBJECT); }

    protected void regResource(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueResource(), "Resource", "Resource", "resource");
    }
    protected void registerInlineResource(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueResource(), "Resource", "Resource", "resource");
    }
    abstract protected ConditionValue getCValueResource();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(255)}
     * @param role The value of role as equal.
     */
    public void setRole_Equal(String role) {
        regRole(CK_EQ, fRES(role));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param role The value of role as notEqual.
     */
    public void setRole_NotEqual(String role) {
        regRole(CK_NE, fRES(role));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param role The value of role as greaterThan.
     */
    public void setRole_GreaterThan(String role) {
        regRole(CK_GT, fRES(role));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param role The value of role as lessThan.
     */
    public void setRole_LessThan(String role) {
        regRole(CK_LT, fRES(role));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param role The value of role as greaterEqual.
     */
    public void setRole_GreaterEqual(String role) {
        regRole(CK_GE, fRES(role));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param role The value of role as lessEqual.
     */
    public void setRole_LessEqual(String role) {
        regRole(CK_LE, fRES(role));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param role The value of role as prefixSearch.
     */
    public void setRole_PrefixSearch(String role) {
        regRole(CK_PS, fRES(role));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param role The value of role as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRole_LikeSearch(String role, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(role), getCValueRole(), "Role", "Role", "role", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param roleList The collection of role as inScope.
     */
    public void setRole_InScope(Collection<String> roleList) {
        regRole(CK_INS, cTL(roleList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param role The collection of role as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setRole_InScope(String role, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(role), getCValueRole(), "Role", "Role", "role", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRole_IsNull() { regRole(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRole_IsNotNull() { regRole(CK_ISNN, DUMMY_OBJECT); }

    protected void regRole(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRole(), "Role", "Role", "role");
    }
    protected void registerInlineRole(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRole(), "Role", "Role", "role");
    }
    abstract protected ConditionValue getCValueRole();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DOUBLE}
     * @param time The value of time as equal.
     */
    public void setTime_Equal(java.math.BigDecimal time) {
        regTime(CK_EQ, time);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param time The value of time as notEqual.
     */
    public void setTime_NotEqual(java.math.BigDecimal time) {
        regTime(CK_NE, time);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param time The value of time as greaterThan.
     */
    public void setTime_GreaterThan(java.math.BigDecimal time) {
        regTime(CK_GT, time);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param time The value of time as lessThan.
     */
    public void setTime_LessThan(java.math.BigDecimal time) {
        regTime(CK_LT, time);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param time The value of time as greaterEqual.
     */
    public void setTime_GreaterEqual(java.math.BigDecimal time) {
        regTime(CK_GE, time);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param time The value of time as lessEqual.
     */
    public void setTime_LessEqual(java.math.BigDecimal time) {
        regTime(CK_LE, time);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param timeList The collection of time as inScope.
     */
    public void setTime_InScope(Collection<java.math.BigDecimal> timeList) {
        regTime(CK_INS, cTL(timeList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTime_IsNull() { regTime(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTime_IsNotNull() { regTime(CK_ISNN, DUMMY_OBJECT); }

    protected void regTime(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTime(), "Time", "Time", "time");
    }
    protected void registerInlineTime(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTime(), "Time", "Time", "time");
    }
    abstract protected ConditionValue getCValueTime();

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
     * Equal(=). And NullIgnored, OnceRegistered. {SMALLINT}
     * @param percentcomplete The value of percentcomplete as equal.
     */
    public void setPercentcomplete_Equal(java.lang.Integer percentcomplete) {
        regPercentcomplete(CK_EQ, percentcomplete);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param percentcomplete The value of percentcomplete as notEqual.
     */
    public void setPercentcomplete_NotEqual(java.lang.Integer percentcomplete) {
        regPercentcomplete(CK_NE, percentcomplete);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param percentcomplete The value of percentcomplete as greaterThan.
     */
    public void setPercentcomplete_GreaterThan(java.lang.Integer percentcomplete) {
        regPercentcomplete(CK_GT, percentcomplete);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param percentcomplete The value of percentcomplete as lessThan.
     */
    public void setPercentcomplete_LessThan(java.lang.Integer percentcomplete) {
        regPercentcomplete(CK_LT, percentcomplete);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param percentcomplete The value of percentcomplete as greaterEqual.
     */
    public void setPercentcomplete_GreaterEqual(java.lang.Integer percentcomplete) {
        regPercentcomplete(CK_GE, percentcomplete);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param percentcomplete The value of percentcomplete as lessEqual.
     */
    public void setPercentcomplete_LessEqual(java.lang.Integer percentcomplete) {
        regPercentcomplete(CK_LE, percentcomplete);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param percentcompleteList The collection of percentcomplete as inScope.
     */
    public void setPercentcomplete_InScope(Collection<java.lang.Integer> percentcompleteList) {
        regPercentcomplete(CK_INS, cTL(percentcompleteList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPercentcomplete_IsNull() { regPercentcomplete(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPercentcomplete_IsNotNull() { regPercentcomplete(CK_ISNN, DUMMY_OBJECT); }

    protected void regPercentcomplete(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePercentcomplete(), "PercentComplete", "Percentcomplete", "percentcomplete");
    }
    protected void registerInlinePercentcomplete(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePercentcomplete(), "PercentComplete", "Percentcomplete", "percentcomplete");
    }
    abstract protected ConditionValue getCValuePercentcomplete();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param datestart The value of datestart as equal.
     */
    public void setDatestart_Equal(java.sql.Timestamp datestart) {
        regDatestart(CK_EQ, datestart);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param datestart The value of datestart as greaterThan.
     */
    public void setDatestart_GreaterThan(java.sql.Timestamp datestart) {
        regDatestart(CK_GT, datestart);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param datestart The value of datestart as lessThan.
     */
    public void setDatestart_LessThan(java.sql.Timestamp datestart) {
        regDatestart(CK_LT, datestart);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param datestart The value of datestart as greaterEqual.
     */
    public void setDatestart_GreaterEqual(java.sql.Timestamp datestart) {
        regDatestart(CK_GE, datestart);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param datestart The value of datestart as lessEqual.
     */
    public void setDatestart_LessEqual(java.sql.Timestamp datestart) {
        regDatestart(CK_LE, datestart);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of datestart. (Nullable)
     * @param toDate The to-date of datestart. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDatestart_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueDatestart(), "DateStart", "Datestart", "datestart", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of datestart. (Nullable)
     * @param toDate The to-date of datestart. (Nullable)
     */
    public void setDatestart_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setDatestart_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDatestart_IsNull() { regDatestart(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDatestart_IsNotNull() { regDatestart(CK_ISNN, DUMMY_OBJECT); }

    protected void regDatestart(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDatestart(), "DateStart", "Datestart", "datestart");
    }
    protected void registerInlineDatestart(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDatestart(), "DateStart", "Datestart", "datestart");
    }
    abstract protected ConditionValue getCValueDatestart();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param dateend The value of dateend as equal.
     */
    public void setDateend_Equal(java.sql.Timestamp dateend) {
        regDateend(CK_EQ, dateend);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param dateend The value of dateend as greaterThan.
     */
    public void setDateend_GreaterThan(java.sql.Timestamp dateend) {
        regDateend(CK_GT, dateend);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param dateend The value of dateend as lessThan.
     */
    public void setDateend_LessThan(java.sql.Timestamp dateend) {
        regDateend(CK_LT, dateend);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param dateend The value of dateend as greaterEqual.
     */
    public void setDateend_GreaterEqual(java.sql.Timestamp dateend) {
        regDateend(CK_GE, dateend);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param dateend The value of dateend as lessEqual.
     */
    public void setDateend_LessEqual(java.sql.Timestamp dateend) {
        regDateend(CK_LE, dateend);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of dateend. (Nullable)
     * @param toDate The to-date of dateend. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDateend_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueDateend(), "DateEnd", "Dateend", "dateend", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of dateend. (Nullable)
     * @param toDate The to-date of dateend. (Nullable)
     */
    public void setDateend_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setDateend_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDateend_IsNull() { regDateend(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDateend_IsNotNull() { regDateend(CK_ISNN, DUMMY_OBJECT); }

    protected void regDateend(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDateend(), "DateEnd", "Dateend", "dateend");
    }
    protected void registerInlineDateend(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDateend(), "DateEnd", "Dateend", "dateend");
    }
    abstract protected ConditionValue getCValueDateend();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param history The value of history as equal.
     */
    public void setHistory_Equal(String history) {
        regHistory(CK_EQ, fRES(history));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param history The value of history as notEqual.
     */
    public void setHistory_NotEqual(String history) {
        regHistory(CK_NE, fRES(history));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param history The value of history as greaterThan.
     */
    public void setHistory_GreaterThan(String history) {
        regHistory(CK_GT, fRES(history));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param history The value of history as lessThan.
     */
    public void setHistory_LessThan(String history) {
        regHistory(CK_LT, fRES(history));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param history The value of history as greaterEqual.
     */
    public void setHistory_GreaterEqual(String history) {
        regHistory(CK_GE, fRES(history));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param history The value of history as lessEqual.
     */
    public void setHistory_LessEqual(String history) {
        regHistory(CK_LE, fRES(history));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param history The value of history as prefixSearch.
     */
    public void setHistory_PrefixSearch(String history) {
        regHistory(CK_PS, fRES(history));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param history The value of history as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHistory_LikeSearch(String history, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(history), getCValueHistory(), "History", "History", "history", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param historyList The collection of history as inScope.
     */
    public void setHistory_InScope(Collection<String> historyList) {
        regHistory(CK_INS, cTL(historyList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param history The collection of history as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setHistory_InScope(String history, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(history), getCValueHistory(), "History", "History", "history", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setHistory_IsNull() { regHistory(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setHistory_IsNotNull() { regHistory(CK_ISNN, DUMMY_OBJECT); }

    protected void regHistory(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueHistory(), "History", "History", "history");
    }
    protected void registerInlineHistory(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueHistory(), "History", "History", "history");
    }
    abstract protected ConditionValue getCValueHistory();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param expectedhours The value of expectedhours as equal.
     */
    public void setExpectedhours_Equal(java.lang.Integer expectedhours) {
        regExpectedhours(CK_EQ, expectedhours);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param expectedhours The value of expectedhours as notEqual.
     */
    public void setExpectedhours_NotEqual(java.lang.Integer expectedhours) {
        regExpectedhours(CK_NE, expectedhours);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param expectedhours The value of expectedhours as greaterThan.
     */
    public void setExpectedhours_GreaterThan(java.lang.Integer expectedhours) {
        regExpectedhours(CK_GT, expectedhours);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param expectedhours The value of expectedhours as lessThan.
     */
    public void setExpectedhours_LessThan(java.lang.Integer expectedhours) {
        regExpectedhours(CK_LT, expectedhours);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param expectedhours The value of expectedhours as greaterEqual.
     */
    public void setExpectedhours_GreaterEqual(java.lang.Integer expectedhours) {
        regExpectedhours(CK_GE, expectedhours);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param expectedhours The value of expectedhours as lessEqual.
     */
    public void setExpectedhours_LessEqual(java.lang.Integer expectedhours) {
        regExpectedhours(CK_LE, expectedhours);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param expectedhoursList The collection of expectedhours as inScope.
     */
    public void setExpectedhours_InScope(Collection<java.lang.Integer> expectedhoursList) {
        regExpectedhours(CK_INS, cTL(expectedhoursList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setExpectedhours_IsNull() { regExpectedhours(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setExpectedhours_IsNotNull() { regExpectedhours(CK_ISNN, DUMMY_OBJECT); }

    protected void regExpectedhours(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueExpectedhours(), "ExpectedHours", "Expectedhours", "expectedhours");
    }
    protected void registerInlineExpectedhours(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueExpectedhours(), "ExpectedHours", "Expectedhours", "expectedhours");
    }
    abstract protected ConditionValue getCValueExpectedhours();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param actualhours The value of actualhours as equal.
     */
    public void setActualhours_Equal(java.lang.Integer actualhours) {
        regActualhours(CK_EQ, actualhours);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param actualhours The value of actualhours as notEqual.
     */
    public void setActualhours_NotEqual(java.lang.Integer actualhours) {
        regActualhours(CK_NE, actualhours);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param actualhours The value of actualhours as greaterThan.
     */
    public void setActualhours_GreaterThan(java.lang.Integer actualhours) {
        regActualhours(CK_GT, actualhours);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param actualhours The value of actualhours as lessThan.
     */
    public void setActualhours_LessThan(java.lang.Integer actualhours) {
        regActualhours(CK_LT, actualhours);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param actualhours The value of actualhours as greaterEqual.
     */
    public void setActualhours_GreaterEqual(java.lang.Integer actualhours) {
        regActualhours(CK_GE, actualhours);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param actualhours The value of actualhours as lessEqual.
     */
    public void setActualhours_LessEqual(java.lang.Integer actualhours) {
        regActualhours(CK_LE, actualhours);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param actualhoursList The collection of actualhours as inScope.
     */
    public void setActualhours_InScope(Collection<java.lang.Integer> actualhoursList) {
        regActualhours(CK_INS, cTL(actualhoursList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setActualhours_IsNull() { regActualhours(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setActualhours_IsNotNull() { regActualhours(CK_ISNN, DUMMY_OBJECT); }

    protected void regActualhours(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueActualhours(), "ActualHours", "Actualhours", "actualhours");
    }
    protected void registerInlineActualhours(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueActualhours(), "ActualHours", "Actualhours", "actualhours");
    }
    abstract protected ConditionValue getCValueActualhours();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TObjectresourceCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TObjectresourceCQ.class.getName(); }
}
