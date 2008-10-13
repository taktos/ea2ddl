package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_package.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTPackageCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPackageCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_package";
    }
    
    public String getTableSqlName() {
        return "t_package";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : COUNTER : NotNull}
     * @param packageId The value of packageId as equal.
     */
    public void setPackageId_Equal(java.lang.Integer packageId) {
        regPackageId(CK_EQ, packageId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as notEqual.
     */
    public void setPackageId_NotEqual(java.lang.Integer packageId) {
        regPackageId(CK_NE, packageId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as greaterThan.
     */
    public void setPackageId_GreaterThan(java.lang.Integer packageId) {
        regPackageId(CK_GT, packageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as lessThan.
     */
    public void setPackageId_LessThan(java.lang.Integer packageId) {
        regPackageId(CK_LT, packageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as greaterEqual.
     */
    public void setPackageId_GreaterEqual(java.lang.Integer packageId) {
        regPackageId(CK_GE, packageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as lessEqual.
     */
    public void setPackageId_LessEqual(java.lang.Integer packageId) {
        regPackageId(CK_LE, packageId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param packageIdList The collection of packageId as inScope.
     */
    public void setPackageId_InScope(Collection<java.lang.Integer> packageIdList) {
        regPackageId(CK_INS, cTL(packageIdList));
    }

    protected void regPackageId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePackageId(), "Package_ID", "PackageId", "packageId");
    }
    protected void registerInlinePackageId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePackageId(), "Package_ID", "PackageId", "packageId");
    }
    abstract protected ConditionValue getCValuePackageId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param name The value of name as equal.
     */
    public void setName_Equal(String name) {
        regName(CK_EQ, fRES(name));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as notEqual.
     */
    public void setName_NotEqual(String name) {
        regName(CK_NE, fRES(name));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(String name) {
        regName(CK_PS, fRES(name));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(name), getCValueName(), "Name", "Name", "name", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param nameList The collection of name as inScope.
     */
    public void setName_InScope(Collection<String> nameList) {
        regName(CK_INS, cTL(nameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param name The collection of name as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setName_InScope(String name, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(name), getCValueName(), "Name", "Name", "name", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setName_IsNull() { regName(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DUMMY_OBJECT); }

    protected void regName(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueName(), "Name", "Name", "name");
    }
    protected void registerInlineName(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueName(), "Name", "Name", "name");
    }
    abstract protected ConditionValue getCValueName();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param parentId The value of parentId as equal.
     */
    public void setParentId_Equal(java.lang.Integer parentId) {
        regParentId(CK_EQ, parentId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param parentId The value of parentId as notEqual.
     */
    public void setParentId_NotEqual(java.lang.Integer parentId) {
        regParentId(CK_NE, parentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param parentId The value of parentId as greaterThan.
     */
    public void setParentId_GreaterThan(java.lang.Integer parentId) {
        regParentId(CK_GT, parentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param parentId The value of parentId as lessThan.
     */
    public void setParentId_LessThan(java.lang.Integer parentId) {
        regParentId(CK_LT, parentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param parentId The value of parentId as greaterEqual.
     */
    public void setParentId_GreaterEqual(java.lang.Integer parentId) {
        regParentId(CK_GE, parentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param parentId The value of parentId as lessEqual.
     */
    public void setParentId_LessEqual(java.lang.Integer parentId) {
        regParentId(CK_LE, parentId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param parentIdList The collection of parentId as inScope.
     */
    public void setParentId_InScope(Collection<java.lang.Integer> parentIdList) {
        regParentId(CK_INS, cTL(parentIdList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setParentId_IsNull() { regParentId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setParentId_IsNotNull() { regParentId(CK_ISNN, DUMMY_OBJECT); }

    protected void regParentId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueParentId(), "Parent_ID", "ParentId", "parentId");
    }
    protected void registerInlineParentId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueParentId(), "Parent_ID", "ParentId", "parentId");
    }
    abstract protected ConditionValue getCValueParentId();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param createddate The value of createddate as equal.
     */
    public void setCreateddate_Equal(java.sql.Timestamp createddate) {
        regCreateddate(CK_EQ, createddate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param createddate The value of createddate as greaterThan.
     */
    public void setCreateddate_GreaterThan(java.sql.Timestamp createddate) {
        regCreateddate(CK_GT, createddate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param createddate The value of createddate as lessThan.
     */
    public void setCreateddate_LessThan(java.sql.Timestamp createddate) {
        regCreateddate(CK_LT, createddate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param createddate The value of createddate as greaterEqual.
     */
    public void setCreateddate_GreaterEqual(java.sql.Timestamp createddate) {
        regCreateddate(CK_GE, createddate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param createddate The value of createddate as lessEqual.
     */
    public void setCreateddate_LessEqual(java.sql.Timestamp createddate) {
        regCreateddate(CK_LE, createddate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of createddate. (Nullable)
     * @param toDate The to-date of createddate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCreateddate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueCreateddate(), "CreatedDate", "Createddate", "createddate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of createddate. (Nullable)
     * @param toDate The to-date of createddate. (Nullable)
     */
    public void setCreateddate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setCreateddate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCreateddate_IsNull() { regCreateddate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCreateddate_IsNotNull() { regCreateddate(CK_ISNN, DUMMY_OBJECT); }

    protected void regCreateddate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCreateddate(), "CreatedDate", "Createddate", "createddate");
    }
    protected void registerInlineCreateddate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCreateddate(), "CreatedDate", "Createddate", "createddate");
    }
    abstract protected ConditionValue getCValueCreateddate();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param modifieddate The value of modifieddate as equal.
     */
    public void setModifieddate_Equal(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_EQ, modifieddate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param modifieddate The value of modifieddate as greaterThan.
     */
    public void setModifieddate_GreaterThan(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_GT, modifieddate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param modifieddate The value of modifieddate as lessThan.
     */
    public void setModifieddate_LessThan(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_LT, modifieddate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param modifieddate The value of modifieddate as greaterEqual.
     */
    public void setModifieddate_GreaterEqual(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_GE, modifieddate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param modifieddate The value of modifieddate as lessEqual.
     */
    public void setModifieddate_LessEqual(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_LE, modifieddate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of modifieddate. (Nullable)
     * @param toDate The to-date of modifieddate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setModifieddate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueModifieddate(), "ModifiedDate", "Modifieddate", "modifieddate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of modifieddate. (Nullable)
     * @param toDate The to-date of modifieddate. (Nullable)
     */
    public void setModifieddate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setModifieddate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setModifieddate_IsNull() { regModifieddate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setModifieddate_IsNotNull() { regModifieddate(CK_ISNN, DUMMY_OBJECT); }

    protected void regModifieddate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueModifieddate(), "ModifiedDate", "Modifieddate", "modifieddate");
    }
    protected void registerInlineModifieddate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueModifieddate(), "ModifiedDate", "Modifieddate", "modifieddate");
    }
    abstract protected ConditionValue getCValueModifieddate();

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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(40)}
     * @param eaGuid The value of eaGuid as equal.
     */
    public void setEaGuid_Equal(String eaGuid) {
        regEaGuid(CK_EQ, fRES(eaGuid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as notEqual.
     */
    public void setEaGuid_NotEqual(String eaGuid) {
        regEaGuid(CK_NE, fRES(eaGuid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as greaterThan.
     */
    public void setEaGuid_GreaterThan(String eaGuid) {
        regEaGuid(CK_GT, fRES(eaGuid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as lessThan.
     */
    public void setEaGuid_LessThan(String eaGuid) {
        regEaGuid(CK_LT, fRES(eaGuid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as greaterEqual.
     */
    public void setEaGuid_GreaterEqual(String eaGuid) {
        regEaGuid(CK_GE, fRES(eaGuid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as lessEqual.
     */
    public void setEaGuid_LessEqual(String eaGuid) {
        regEaGuid(CK_LE, fRES(eaGuid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as prefixSearch.
     */
    public void setEaGuid_PrefixSearch(String eaGuid) {
        regEaGuid(CK_PS, fRES(eaGuid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEaGuid_LikeSearch(String eaGuid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuidList The collection of eaGuid as inScope.
     */
    public void setEaGuid_InScope(Collection<String> eaGuidList) {
        regEaGuid(CK_INS, cTL(eaGuidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuid The collection of eaGuid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setEaGuid_InScope(String eaGuid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setEaGuid_IsNull() { regEaGuid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setEaGuid_IsNotNull() { regEaGuid(CK_ISNN, DUMMY_OBJECT); }

    protected void regEaGuid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid");
    }
    protected void registerInlineEaGuid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid");
    }
    abstract protected ConditionValue getCValueEaGuid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param xmlpath The value of xmlpath as equal.
     */
    public void setXmlpath_Equal(String xmlpath) {
        regXmlpath(CK_EQ, fRES(xmlpath));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param xmlpath The value of xmlpath as notEqual.
     */
    public void setXmlpath_NotEqual(String xmlpath) {
        regXmlpath(CK_NE, fRES(xmlpath));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param xmlpath The value of xmlpath as greaterThan.
     */
    public void setXmlpath_GreaterThan(String xmlpath) {
        regXmlpath(CK_GT, fRES(xmlpath));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param xmlpath The value of xmlpath as lessThan.
     */
    public void setXmlpath_LessThan(String xmlpath) {
        regXmlpath(CK_LT, fRES(xmlpath));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param xmlpath The value of xmlpath as greaterEqual.
     */
    public void setXmlpath_GreaterEqual(String xmlpath) {
        regXmlpath(CK_GE, fRES(xmlpath));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param xmlpath The value of xmlpath as lessEqual.
     */
    public void setXmlpath_LessEqual(String xmlpath) {
        regXmlpath(CK_LE, fRES(xmlpath));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param xmlpath The value of xmlpath as prefixSearch.
     */
    public void setXmlpath_PrefixSearch(String xmlpath) {
        regXmlpath(CK_PS, fRES(xmlpath));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param xmlpath The value of xmlpath as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setXmlpath_LikeSearch(String xmlpath, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(xmlpath), getCValueXmlpath(), "XMLPath", "Xmlpath", "xmlpath", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param xmlpathList The collection of xmlpath as inScope.
     */
    public void setXmlpath_InScope(Collection<String> xmlpathList) {
        regXmlpath(CK_INS, cTL(xmlpathList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param xmlpath The collection of xmlpath as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setXmlpath_InScope(String xmlpath, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(xmlpath), getCValueXmlpath(), "XMLPath", "Xmlpath", "xmlpath", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setXmlpath_IsNull() { regXmlpath(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setXmlpath_IsNotNull() { regXmlpath(CK_ISNN, DUMMY_OBJECT); }

    protected void regXmlpath(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueXmlpath(), "XMLPath", "Xmlpath", "xmlpath");
    }
    protected void registerInlineXmlpath(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueXmlpath(), "XMLPath", "Xmlpath", "xmlpath");
    }
    abstract protected ConditionValue getCValueXmlpath();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param iscontrolled The value of iscontrolled as equal.
     */
    public void setIscontrolled_Equal(Boolean iscontrolled) {
        regIscontrolled(CK_EQ, iscontrolled);
    }

    protected void regIscontrolled(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIscontrolled(), "IsControlled", "Iscontrolled", "iscontrolled");
    }
    protected void registerInlineIscontrolled(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIscontrolled(), "IsControlled", "Iscontrolled", "iscontrolled");
    }
    abstract protected ConditionValue getCValueIscontrolled();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param lastloaddate The value of lastloaddate as equal.
     */
    public void setLastloaddate_Equal(java.sql.Timestamp lastloaddate) {
        regLastloaddate(CK_EQ, lastloaddate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param lastloaddate The value of lastloaddate as greaterThan.
     */
    public void setLastloaddate_GreaterThan(java.sql.Timestamp lastloaddate) {
        regLastloaddate(CK_GT, lastloaddate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param lastloaddate The value of lastloaddate as lessThan.
     */
    public void setLastloaddate_LessThan(java.sql.Timestamp lastloaddate) {
        regLastloaddate(CK_LT, lastloaddate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param lastloaddate The value of lastloaddate as greaterEqual.
     */
    public void setLastloaddate_GreaterEqual(java.sql.Timestamp lastloaddate) {
        regLastloaddate(CK_GE, lastloaddate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param lastloaddate The value of lastloaddate as lessEqual.
     */
    public void setLastloaddate_LessEqual(java.sql.Timestamp lastloaddate) {
        regLastloaddate(CK_LE, lastloaddate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of lastloaddate. (Nullable)
     * @param toDate The to-date of lastloaddate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLastloaddate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueLastloaddate(), "LastLoadDate", "Lastloaddate", "lastloaddate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of lastloaddate. (Nullable)
     * @param toDate The to-date of lastloaddate. (Nullable)
     */
    public void setLastloaddate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setLastloaddate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setLastloaddate_IsNull() { regLastloaddate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setLastloaddate_IsNotNull() { regLastloaddate(CK_ISNN, DUMMY_OBJECT); }

    protected void regLastloaddate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueLastloaddate(), "LastLoadDate", "Lastloaddate", "lastloaddate");
    }
    protected void registerInlineLastloaddate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLastloaddate(), "LastLoadDate", "Lastloaddate", "lastloaddate");
    }
    abstract protected ConditionValue getCValueLastloaddate();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param lastsavedate The value of lastsavedate as equal.
     */
    public void setLastsavedate_Equal(java.sql.Timestamp lastsavedate) {
        regLastsavedate(CK_EQ, lastsavedate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param lastsavedate The value of lastsavedate as greaterThan.
     */
    public void setLastsavedate_GreaterThan(java.sql.Timestamp lastsavedate) {
        regLastsavedate(CK_GT, lastsavedate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param lastsavedate The value of lastsavedate as lessThan.
     */
    public void setLastsavedate_LessThan(java.sql.Timestamp lastsavedate) {
        regLastsavedate(CK_LT, lastsavedate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param lastsavedate The value of lastsavedate as greaterEqual.
     */
    public void setLastsavedate_GreaterEqual(java.sql.Timestamp lastsavedate) {
        regLastsavedate(CK_GE, lastsavedate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param lastsavedate The value of lastsavedate as lessEqual.
     */
    public void setLastsavedate_LessEqual(java.sql.Timestamp lastsavedate) {
        regLastsavedate(CK_LE, lastsavedate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of lastsavedate. (Nullable)
     * @param toDate The to-date of lastsavedate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLastsavedate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueLastsavedate(), "LastSaveDate", "Lastsavedate", "lastsavedate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of lastsavedate. (Nullable)
     * @param toDate The to-date of lastsavedate. (Nullable)
     */
    public void setLastsavedate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setLastsavedate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setLastsavedate_IsNull() { regLastsavedate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setLastsavedate_IsNotNull() { regLastsavedate(CK_ISNN, DUMMY_OBJECT); }

    protected void regLastsavedate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueLastsavedate(), "LastSaveDate", "Lastsavedate", "lastsavedate");
    }
    protected void registerInlineLastsavedate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLastsavedate(), "LastSaveDate", "Lastsavedate", "lastsavedate");
    }
    abstract protected ConditionValue getCValueLastsavedate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param version The value of version as equal.
     */
    public void setVersion_Equal(String version) {
        regVersion(CK_EQ, fRES(version));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as notEqual.
     */
    public void setVersion_NotEqual(String version) {
        regVersion(CK_NE, fRES(version));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as greaterThan.
     */
    public void setVersion_GreaterThan(String version) {
        regVersion(CK_GT, fRES(version));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as lessThan.
     */
    public void setVersion_LessThan(String version) {
        regVersion(CK_LT, fRES(version));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as greaterEqual.
     */
    public void setVersion_GreaterEqual(String version) {
        regVersion(CK_GE, fRES(version));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as lessEqual.
     */
    public void setVersion_LessEqual(String version) {
        regVersion(CK_LE, fRES(version));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as prefixSearch.
     */
    public void setVersion_PrefixSearch(String version) {
        regVersion(CK_PS, fRES(version));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param version The value of version as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVersion_LikeSearch(String version, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(version), getCValueVersion(), "Version", "Version", "version", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param versionList The collection of version as inScope.
     */
    public void setVersion_InScope(Collection<String> versionList) {
        regVersion(CK_INS, cTL(versionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param version The collection of version as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setVersion_InScope(String version, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(version), getCValueVersion(), "Version", "Version", "version", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setVersion_IsNull() { regVersion(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setVersion_IsNotNull() { regVersion(CK_ISNN, DUMMY_OBJECT); }

    protected void regVersion(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueVersion(), "Version", "Version", "version");
    }
    protected void registerInlineVersion(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueVersion(), "Version", "Version", "version");
    }
    abstract protected ConditionValue getCValueVersion();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pkgowner The value of pkgowner as equal.
     */
    public void setPkgowner_Equal(String pkgowner) {
        regPkgowner(CK_EQ, fRES(pkgowner));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pkgowner The value of pkgowner as notEqual.
     */
    public void setPkgowner_NotEqual(String pkgowner) {
        regPkgowner(CK_NE, fRES(pkgowner));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pkgowner The value of pkgowner as greaterThan.
     */
    public void setPkgowner_GreaterThan(String pkgowner) {
        regPkgowner(CK_GT, fRES(pkgowner));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pkgowner The value of pkgowner as lessThan.
     */
    public void setPkgowner_LessThan(String pkgowner) {
        regPkgowner(CK_LT, fRES(pkgowner));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pkgowner The value of pkgowner as greaterEqual.
     */
    public void setPkgowner_GreaterEqual(String pkgowner) {
        regPkgowner(CK_GE, fRES(pkgowner));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pkgowner The value of pkgowner as lessEqual.
     */
    public void setPkgowner_LessEqual(String pkgowner) {
        regPkgowner(CK_LE, fRES(pkgowner));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pkgowner The value of pkgowner as prefixSearch.
     */
    public void setPkgowner_PrefixSearch(String pkgowner) {
        regPkgowner(CK_PS, fRES(pkgowner));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pkgowner The value of pkgowner as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPkgowner_LikeSearch(String pkgowner, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pkgowner), getCValuePkgowner(), "PkgOwner", "Pkgowner", "pkgowner", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pkgownerList The collection of pkgowner as inScope.
     */
    public void setPkgowner_InScope(Collection<String> pkgownerList) {
        regPkgowner(CK_INS, cTL(pkgownerList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pkgowner The collection of pkgowner as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPkgowner_InScope(String pkgowner, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pkgowner), getCValuePkgowner(), "PkgOwner", "Pkgowner", "pkgowner", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPkgowner_IsNull() { regPkgowner(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPkgowner_IsNotNull() { regPkgowner(CK_ISNN, DUMMY_OBJECT); }

    protected void regPkgowner(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePkgowner(), "PkgOwner", "Pkgowner", "pkgowner");
    }
    protected void registerInlinePkgowner(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePkgowner(), "PkgOwner", "Pkgowner", "pkgowner");
    }
    abstract protected ConditionValue getCValuePkgowner();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param umlversion The value of umlversion as equal.
     */
    public void setUmlversion_Equal(String umlversion) {
        regUmlversion(CK_EQ, fRES(umlversion));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param umlversion The value of umlversion as notEqual.
     */
    public void setUmlversion_NotEqual(String umlversion) {
        regUmlversion(CK_NE, fRES(umlversion));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param umlversion The value of umlversion as greaterThan.
     */
    public void setUmlversion_GreaterThan(String umlversion) {
        regUmlversion(CK_GT, fRES(umlversion));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param umlversion The value of umlversion as lessThan.
     */
    public void setUmlversion_LessThan(String umlversion) {
        regUmlversion(CK_LT, fRES(umlversion));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param umlversion The value of umlversion as greaterEqual.
     */
    public void setUmlversion_GreaterEqual(String umlversion) {
        regUmlversion(CK_GE, fRES(umlversion));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param umlversion The value of umlversion as lessEqual.
     */
    public void setUmlversion_LessEqual(String umlversion) {
        regUmlversion(CK_LE, fRES(umlversion));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param umlversion The value of umlversion as prefixSearch.
     */
    public void setUmlversion_PrefixSearch(String umlversion) {
        regUmlversion(CK_PS, fRES(umlversion));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param umlversion The value of umlversion as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUmlversion_LikeSearch(String umlversion, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(umlversion), getCValueUmlversion(), "UMLVersion", "Umlversion", "umlversion", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param umlversionList The collection of umlversion as inScope.
     */
    public void setUmlversion_InScope(Collection<String> umlversionList) {
        regUmlversion(CK_INS, cTL(umlversionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param umlversion The collection of umlversion as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setUmlversion_InScope(String umlversion, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(umlversion), getCValueUmlversion(), "UMLVersion", "Umlversion", "umlversion", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setUmlversion_IsNull() { regUmlversion(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setUmlversion_IsNotNull() { regUmlversion(CK_ISNN, DUMMY_OBJECT); }

    protected void regUmlversion(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueUmlversion(), "UMLVersion", "Umlversion", "umlversion");
    }
    protected void registerInlineUmlversion(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueUmlversion(), "UMLVersion", "Umlversion", "umlversion");
    }
    abstract protected ConditionValue getCValueUmlversion();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param usedtd The value of usedtd as equal.
     */
    public void setUsedtd_Equal(Boolean usedtd) {
        regUsedtd(CK_EQ, usedtd);
    }

    protected void regUsedtd(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueUsedtd(), "UseDTD", "Usedtd", "usedtd");
    }
    protected void registerInlineUsedtd(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueUsedtd(), "UseDTD", "Usedtd", "usedtd");
    }
    abstract protected ConditionValue getCValueUsedtd();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param logxml The value of logxml as equal.
     */
    public void setLogxml_Equal(Boolean logxml) {
        regLogxml(CK_EQ, logxml);
    }

    protected void regLogxml(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueLogxml(), "LogXML", "Logxml", "logxml");
    }
    protected void registerInlineLogxml(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLogxml(), "LogXML", "Logxml", "logxml");
    }
    abstract protected ConditionValue getCValueLogxml();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param codepath The value of codepath as equal.
     */
    public void setCodepath_Equal(String codepath) {
        regCodepath(CK_EQ, fRES(codepath));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param codepath The value of codepath as notEqual.
     */
    public void setCodepath_NotEqual(String codepath) {
        regCodepath(CK_NE, fRES(codepath));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param codepath The value of codepath as greaterThan.
     */
    public void setCodepath_GreaterThan(String codepath) {
        regCodepath(CK_GT, fRES(codepath));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param codepath The value of codepath as lessThan.
     */
    public void setCodepath_LessThan(String codepath) {
        regCodepath(CK_LT, fRES(codepath));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param codepath The value of codepath as greaterEqual.
     */
    public void setCodepath_GreaterEqual(String codepath) {
        regCodepath(CK_GE, fRES(codepath));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param codepath The value of codepath as lessEqual.
     */
    public void setCodepath_LessEqual(String codepath) {
        regCodepath(CK_LE, fRES(codepath));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param codepath The value of codepath as prefixSearch.
     */
    public void setCodepath_PrefixSearch(String codepath) {
        regCodepath(CK_PS, fRES(codepath));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param codepath The value of codepath as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCodepath_LikeSearch(String codepath, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(codepath), getCValueCodepath(), "CodePath", "Codepath", "codepath", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param codepathList The collection of codepath as inScope.
     */
    public void setCodepath_InScope(Collection<String> codepathList) {
        regCodepath(CK_INS, cTL(codepathList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param codepath The collection of codepath as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setCodepath_InScope(String codepath, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(codepath), getCValueCodepath(), "CodePath", "Codepath", "codepath", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCodepath_IsNull() { regCodepath(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCodepath_IsNotNull() { regCodepath(CK_ISNN, DUMMY_OBJECT); }

    protected void regCodepath(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCodepath(), "CodePath", "Codepath", "codepath");
    }
    protected void registerInlineCodepath(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCodepath(), "CodePath", "Codepath", "codepath");
    }
    abstract protected ConditionValue getCValueCodepath();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param namespace The value of namespace as equal.
     */
    public void setNamespace_Equal(String namespace) {
        regNamespace(CK_EQ, fRES(namespace));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param namespace The value of namespace as notEqual.
     */
    public void setNamespace_NotEqual(String namespace) {
        regNamespace(CK_NE, fRES(namespace));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param namespace The value of namespace as greaterThan.
     */
    public void setNamespace_GreaterThan(String namespace) {
        regNamespace(CK_GT, fRES(namespace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param namespace The value of namespace as lessThan.
     */
    public void setNamespace_LessThan(String namespace) {
        regNamespace(CK_LT, fRES(namespace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param namespace The value of namespace as greaterEqual.
     */
    public void setNamespace_GreaterEqual(String namespace) {
        regNamespace(CK_GE, fRES(namespace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param namespace The value of namespace as lessEqual.
     */
    public void setNamespace_LessEqual(String namespace) {
        regNamespace(CK_LE, fRES(namespace));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param namespace The value of namespace as prefixSearch.
     */
    public void setNamespace_PrefixSearch(String namespace) {
        regNamespace(CK_PS, fRES(namespace));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param namespace The value of namespace as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNamespace_LikeSearch(String namespace, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(namespace), getCValueNamespace(), "Namespace", "Namespace", "namespace", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param namespaceList The collection of namespace as inScope.
     */
    public void setNamespace_InScope(Collection<String> namespaceList) {
        regNamespace(CK_INS, cTL(namespaceList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param namespace The collection of namespace as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setNamespace_InScope(String namespace, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(namespace), getCValueNamespace(), "Namespace", "Namespace", "namespace", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNamespace_IsNull() { regNamespace(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNamespace_IsNotNull() { regNamespace(CK_ISNN, DUMMY_OBJECT); }

    protected void regNamespace(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNamespace(), "Namespace", "Namespace", "namespace");
    }
    protected void registerInlineNamespace(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNamespace(), "Namespace", "Namespace", "namespace");
    }
    abstract protected ConditionValue getCValueNamespace();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param tpos The value of tpos as equal.
     */
    public void setTpos_Equal(java.lang.Integer tpos) {
        regTpos(CK_EQ, tpos);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as notEqual.
     */
    public void setTpos_NotEqual(java.lang.Integer tpos) {
        regTpos(CK_NE, tpos);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as greaterThan.
     */
    public void setTpos_GreaterThan(java.lang.Integer tpos) {
        regTpos(CK_GT, tpos);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as lessThan.
     */
    public void setTpos_LessThan(java.lang.Integer tpos) {
        regTpos(CK_LT, tpos);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as greaterEqual.
     */
    public void setTpos_GreaterEqual(java.lang.Integer tpos) {
        regTpos(CK_GE, tpos);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as lessEqual.
     */
    public void setTpos_LessEqual(java.lang.Integer tpos) {
        regTpos(CK_LE, tpos);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param tposList The collection of tpos as inScope.
     */
    public void setTpos_InScope(Collection<java.lang.Integer> tposList) {
        regTpos(CK_INS, cTL(tposList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTpos_IsNull() { regTpos(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTpos_IsNotNull() { regTpos(CK_ISNN, DUMMY_OBJECT); }

    protected void regTpos(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTpos(), "TPos", "Tpos", "tpos");
    }
    protected void registerInlineTpos(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTpos(), "TPos", "Tpos", "tpos");
    }
    abstract protected ConditionValue getCValueTpos();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param packageflags The value of packageflags as equal.
     */
    public void setPackageflags_Equal(String packageflags) {
        regPackageflags(CK_EQ, fRES(packageflags));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param packageflags The value of packageflags as notEqual.
     */
    public void setPackageflags_NotEqual(String packageflags) {
        regPackageflags(CK_NE, fRES(packageflags));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param packageflags The value of packageflags as greaterThan.
     */
    public void setPackageflags_GreaterThan(String packageflags) {
        regPackageflags(CK_GT, fRES(packageflags));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param packageflags The value of packageflags as lessThan.
     */
    public void setPackageflags_LessThan(String packageflags) {
        regPackageflags(CK_LT, fRES(packageflags));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param packageflags The value of packageflags as greaterEqual.
     */
    public void setPackageflags_GreaterEqual(String packageflags) {
        regPackageflags(CK_GE, fRES(packageflags));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param packageflags The value of packageflags as lessEqual.
     */
    public void setPackageflags_LessEqual(String packageflags) {
        regPackageflags(CK_LE, fRES(packageflags));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param packageflags The value of packageflags as prefixSearch.
     */
    public void setPackageflags_PrefixSearch(String packageflags) {
        regPackageflags(CK_PS, fRES(packageflags));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param packageflags The value of packageflags as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPackageflags_LikeSearch(String packageflags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(packageflags), getCValuePackageflags(), "PackageFlags", "Packageflags", "packageflags", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param packageflagsList The collection of packageflags as inScope.
     */
    public void setPackageflags_InScope(Collection<String> packageflagsList) {
        regPackageflags(CK_INS, cTL(packageflagsList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param packageflags The collection of packageflags as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPackageflags_InScope(String packageflags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(packageflags), getCValuePackageflags(), "PackageFlags", "Packageflags", "packageflags", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPackageflags_IsNull() { regPackageflags(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPackageflags_IsNotNull() { regPackageflags(CK_ISNN, DUMMY_OBJECT); }

    protected void regPackageflags(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePackageflags(), "PackageFlags", "Packageflags", "packageflags");
    }
    protected void registerInlinePackageflags(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePackageflags(), "PackageFlags", "Packageflags", "packageflags");
    }
    abstract protected ConditionValue getCValuePackageflags();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param batchsave The value of batchsave as equal.
     */
    public void setBatchsave_Equal(java.lang.Integer batchsave) {
        regBatchsave(CK_EQ, batchsave);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param batchsave The value of batchsave as notEqual.
     */
    public void setBatchsave_NotEqual(java.lang.Integer batchsave) {
        regBatchsave(CK_NE, batchsave);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param batchsave The value of batchsave as greaterThan.
     */
    public void setBatchsave_GreaterThan(java.lang.Integer batchsave) {
        regBatchsave(CK_GT, batchsave);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param batchsave The value of batchsave as lessThan.
     */
    public void setBatchsave_LessThan(java.lang.Integer batchsave) {
        regBatchsave(CK_LT, batchsave);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param batchsave The value of batchsave as greaterEqual.
     */
    public void setBatchsave_GreaterEqual(java.lang.Integer batchsave) {
        regBatchsave(CK_GE, batchsave);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param batchsave The value of batchsave as lessEqual.
     */
    public void setBatchsave_LessEqual(java.lang.Integer batchsave) {
        regBatchsave(CK_LE, batchsave);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param batchsaveList The collection of batchsave as inScope.
     */
    public void setBatchsave_InScope(Collection<java.lang.Integer> batchsaveList) {
        regBatchsave(CK_INS, cTL(batchsaveList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBatchsave_IsNull() { regBatchsave(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBatchsave_IsNotNull() { regBatchsave(CK_ISNN, DUMMY_OBJECT); }

    protected void regBatchsave(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBatchsave(), "BatchSave", "Batchsave", "batchsave");
    }
    protected void registerInlineBatchsave(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBatchsave(), "BatchSave", "Batchsave", "batchsave");
    }
    abstract protected ConditionValue getCValueBatchsave();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param batchload The value of batchload as equal.
     */
    public void setBatchload_Equal(java.lang.Integer batchload) {
        regBatchload(CK_EQ, batchload);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param batchload The value of batchload as notEqual.
     */
    public void setBatchload_NotEqual(java.lang.Integer batchload) {
        regBatchload(CK_NE, batchload);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param batchload The value of batchload as greaterThan.
     */
    public void setBatchload_GreaterThan(java.lang.Integer batchload) {
        regBatchload(CK_GT, batchload);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param batchload The value of batchload as lessThan.
     */
    public void setBatchload_LessThan(java.lang.Integer batchload) {
        regBatchload(CK_LT, batchload);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param batchload The value of batchload as greaterEqual.
     */
    public void setBatchload_GreaterEqual(java.lang.Integer batchload) {
        regBatchload(CK_GE, batchload);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param batchload The value of batchload as lessEqual.
     */
    public void setBatchload_LessEqual(java.lang.Integer batchload) {
        regBatchload(CK_LE, batchload);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param batchloadList The collection of batchload as inScope.
     */
    public void setBatchload_InScope(Collection<java.lang.Integer> batchloadList) {
        regBatchload(CK_INS, cTL(batchloadList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBatchload_IsNull() { regBatchload(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBatchload_IsNotNull() { regBatchload(CK_ISNN, DUMMY_OBJECT); }

    protected void regBatchload(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBatchload(), "BatchLoad", "Batchload", "batchload");
    }
    protected void registerInlineBatchload(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBatchload(), "BatchLoad", "Batchload", "batchload");
    }
    abstract protected ConditionValue getCValueBatchload();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TPackageCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TPackageCQ.class.getName(); }
}
