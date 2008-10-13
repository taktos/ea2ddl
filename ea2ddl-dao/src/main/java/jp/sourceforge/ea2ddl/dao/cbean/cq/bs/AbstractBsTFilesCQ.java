package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_files.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTFilesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTFilesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_files";
    }
    
    public String getTableSqlName() {
        return "t_files";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(50)}
     * @param fileid The value of fileid as equal.
     */
    public void setFileid_Equal(String fileid) {
        regFileid(CK_EQ, fRES(fileid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param fileid The value of fileid as notEqual.
     */
    public void setFileid_NotEqual(String fileid) {
        regFileid(CK_NE, fRES(fileid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param fileid The value of fileid as greaterThan.
     */
    public void setFileid_GreaterThan(String fileid) {
        regFileid(CK_GT, fRES(fileid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param fileid The value of fileid as lessThan.
     */
    public void setFileid_LessThan(String fileid) {
        regFileid(CK_LT, fRES(fileid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param fileid The value of fileid as greaterEqual.
     */
    public void setFileid_GreaterEqual(String fileid) {
        regFileid(CK_GE, fRES(fileid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param fileid The value of fileid as lessEqual.
     */
    public void setFileid_LessEqual(String fileid) {
        regFileid(CK_LE, fRES(fileid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param fileid The value of fileid as prefixSearch.
     */
    public void setFileid_PrefixSearch(String fileid) {
        regFileid(CK_PS, fRES(fileid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param fileid The value of fileid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFileid_LikeSearch(String fileid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(fileid), getCValueFileid(), "FileID", "Fileid", "fileid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param fileidList The collection of fileid as inScope.
     */
    public void setFileid_InScope(Collection<String> fileidList) {
        regFileid(CK_INS, cTL(fileidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param fileid The collection of fileid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setFileid_InScope(String fileid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(fileid), getCValueFileid(), "FileID", "Fileid", "fileid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setFileid_IsNull() { regFileid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setFileid_IsNotNull() { regFileid(CK_ISNN, DUMMY_OBJECT); }

    protected void regFileid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFileid(), "FileID", "Fileid", "fileid");
    }
    protected void registerInlineFileid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFileid(), "FileID", "Fileid", "fileid");
    }
    abstract protected ConditionValue getCValueFileid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param appliesto The value of appliesto as equal.
     */
    public void setAppliesto_Equal(String appliesto) {
        regAppliesto(CK_EQ, fRES(appliesto));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as notEqual.
     */
    public void setAppliesto_NotEqual(String appliesto) {
        regAppliesto(CK_NE, fRES(appliesto));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as greaterThan.
     */
    public void setAppliesto_GreaterThan(String appliesto) {
        regAppliesto(CK_GT, fRES(appliesto));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as lessThan.
     */
    public void setAppliesto_LessThan(String appliesto) {
        regAppliesto(CK_LT, fRES(appliesto));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as greaterEqual.
     */
    public void setAppliesto_GreaterEqual(String appliesto) {
        regAppliesto(CK_GE, fRES(appliesto));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as lessEqual.
     */
    public void setAppliesto_LessEqual(String appliesto) {
        regAppliesto(CK_LE, fRES(appliesto));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as prefixSearch.
     */
    public void setAppliesto_PrefixSearch(String appliesto) {
        regAppliesto(CK_PS, fRES(appliesto));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param appliesto The value of appliesto as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAppliesto_LikeSearch(String appliesto, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(appliesto), getCValueAppliesto(), "AppliesTo", "Appliesto", "appliesto", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param appliestoList The collection of appliesto as inScope.
     */
    public void setAppliesto_InScope(Collection<String> appliestoList) {
        regAppliesto(CK_INS, cTL(appliestoList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param appliesto The collection of appliesto as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setAppliesto_InScope(String appliesto, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(appliesto), getCValueAppliesto(), "AppliesTo", "Appliesto", "appliesto", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setAppliesto_IsNull() { regAppliesto(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setAppliesto_IsNotNull() { regAppliesto(CK_ISNN, DUMMY_OBJECT); }

    protected void regAppliesto(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAppliesto(), "AppliesTo", "Appliesto", "appliesto");
    }
    protected void registerInlineAppliesto(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAppliesto(), "AppliesTo", "Appliesto", "appliesto");
    }
    abstract protected ConditionValue getCValueAppliesto();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param category The value of category as equal.
     */
    public void setCategory_Equal(String category) {
        regCategory(CK_EQ, fRES(category));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as notEqual.
     */
    public void setCategory_NotEqual(String category) {
        regCategory(CK_NE, fRES(category));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as greaterThan.
     */
    public void setCategory_GreaterThan(String category) {
        regCategory(CK_GT, fRES(category));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as lessThan.
     */
    public void setCategory_LessThan(String category) {
        regCategory(CK_LT, fRES(category));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as greaterEqual.
     */
    public void setCategory_GreaterEqual(String category) {
        regCategory(CK_GE, fRES(category));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as lessEqual.
     */
    public void setCategory_LessEqual(String category) {
        regCategory(CK_LE, fRES(category));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param category The value of category as prefixSearch.
     */
    public void setCategory_PrefixSearch(String category) {
        regCategory(CK_PS, fRES(category));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param category The value of category as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCategory_LikeSearch(String category, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(category), getCValueCategory(), "Category", "Category", "category", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param categoryList The collection of category as inScope.
     */
    public void setCategory_InScope(Collection<String> categoryList) {
        regCategory(CK_INS, cTL(categoryList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param category The collection of category as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setCategory_InScope(String category, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(category), getCValueCategory(), "Category", "Category", "category", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCategory_IsNull() { regCategory(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCategory_IsNotNull() { regCategory(CK_ISNN, DUMMY_OBJECT); }

    protected void regCategory(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCategory(), "Category", "Category", "category");
    }
    protected void registerInlineCategory(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCategory(), "Category", "Category", "category");
    }
    abstract protected ConditionValue getCValueCategory();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(150)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param file The value of file as equal.
     */
    public void setFile_Equal(String file) {
        regFile(CK_EQ, fRES(file));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param file The value of file as notEqual.
     */
    public void setFile_NotEqual(String file) {
        regFile(CK_NE, fRES(file));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param file The value of file as greaterThan.
     */
    public void setFile_GreaterThan(String file) {
        regFile(CK_GT, fRES(file));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param file The value of file as lessThan.
     */
    public void setFile_LessThan(String file) {
        regFile(CK_LT, fRES(file));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param file The value of file as greaterEqual.
     */
    public void setFile_GreaterEqual(String file) {
        regFile(CK_GE, fRES(file));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param file The value of file as lessEqual.
     */
    public void setFile_LessEqual(String file) {
        regFile(CK_LE, fRES(file));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param file The value of file as prefixSearch.
     */
    public void setFile_PrefixSearch(String file) {
        regFile(CK_PS, fRES(file));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param file The value of file as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFile_LikeSearch(String file, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(file), getCValueFile(), "File", "File", "file", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param fileList The collection of file as inScope.
     */
    public void setFile_InScope(Collection<String> fileList) {
        regFile(CK_INS, cTL(fileList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param file The collection of file as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setFile_InScope(String file, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(file), getCValueFile(), "File", "File", "file", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setFile_IsNull() { regFile(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setFile_IsNotNull() { regFile(CK_ISNN, DUMMY_OBJECT); }

    protected void regFile(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFile(), "File", "File", "file");
    }
    protected void registerInlineFile(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFile(), "File", "File", "file");
    }
    abstract protected ConditionValue getCValueFile();

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
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param filedate The value of filedate as equal.
     */
    public void setFiledate_Equal(java.sql.Timestamp filedate) {
        regFiledate(CK_EQ, filedate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param filedate The value of filedate as greaterThan.
     */
    public void setFiledate_GreaterThan(java.sql.Timestamp filedate) {
        regFiledate(CK_GT, filedate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param filedate The value of filedate as lessThan.
     */
    public void setFiledate_LessThan(java.sql.Timestamp filedate) {
        regFiledate(CK_LT, filedate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param filedate The value of filedate as greaterEqual.
     */
    public void setFiledate_GreaterEqual(java.sql.Timestamp filedate) {
        regFiledate(CK_GE, filedate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param filedate The value of filedate as lessEqual.
     */
    public void setFiledate_LessEqual(java.sql.Timestamp filedate) {
        regFiledate(CK_LE, filedate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of filedate. (Nullable)
     * @param toDate The to-date of filedate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setFiledate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueFiledate(), "FileDate", "Filedate", "filedate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of filedate. (Nullable)
     * @param toDate The to-date of filedate. (Nullable)
     */
    public void setFiledate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setFiledate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setFiledate_IsNull() { regFiledate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setFiledate_IsNotNull() { regFiledate(CK_ISNN, DUMMY_OBJECT); }

    protected void regFiledate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFiledate(), "FileDate", "Filedate", "filedate");
    }
    protected void registerInlineFiledate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFiledate(), "FileDate", "Filedate", "filedate");
    }
    abstract protected ConditionValue getCValueFiledate();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param filesize The value of filesize as equal.
     */
    public void setFilesize_Equal(java.lang.Integer filesize) {
        regFilesize(CK_EQ, filesize);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param filesize The value of filesize as notEqual.
     */
    public void setFilesize_NotEqual(java.lang.Integer filesize) {
        regFilesize(CK_NE, filesize);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param filesize The value of filesize as greaterThan.
     */
    public void setFilesize_GreaterThan(java.lang.Integer filesize) {
        regFilesize(CK_GT, filesize);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param filesize The value of filesize as lessThan.
     */
    public void setFilesize_LessThan(java.lang.Integer filesize) {
        regFilesize(CK_LT, filesize);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param filesize The value of filesize as greaterEqual.
     */
    public void setFilesize_GreaterEqual(java.lang.Integer filesize) {
        regFilesize(CK_GE, filesize);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param filesize The value of filesize as lessEqual.
     */
    public void setFilesize_LessEqual(java.lang.Integer filesize) {
        regFilesize(CK_LE, filesize);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param filesizeList The collection of filesize as inScope.
     */
    public void setFilesize_InScope(Collection<java.lang.Integer> filesizeList) {
        regFilesize(CK_INS, cTL(filesizeList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setFilesize_IsNull() { regFilesize(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setFilesize_IsNotNull() { regFilesize(CK_ISNN, DUMMY_OBJECT); }

    protected void regFilesize(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFilesize(), "FileSize", "Filesize", "filesize");
    }
    protected void registerInlineFilesize(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFilesize(), "FileSize", "Filesize", "filesize");
    }
    abstract protected ConditionValue getCValueFilesize();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TFilesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TFilesCQ.class.getName(); }
}
