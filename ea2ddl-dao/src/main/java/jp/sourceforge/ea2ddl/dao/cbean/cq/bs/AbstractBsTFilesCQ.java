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
 * The abstract condition-query of t_files.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTFilesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTFilesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_files";
    }
    
    public String getTableSqlName() {
        return "t_files";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(50)}
     * @param fileid The value of fileid as equal.
     */
    public void setFileid_Equal(String fileid) {
        regFileid(CK_EQ, fRES(fileid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fileid The value of fileid as notEqual.
     */
    public void setFileid_NotEqual(String fileid) {
        regFileid(CK_NE, fRES(fileid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fileid The value of fileid as greaterThan.
     */
    public void setFileid_GreaterThan(String fileid) {
        regFileid(CK_GT, fRES(fileid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fileid The value of fileid as lessThan.
     */
    public void setFileid_LessThan(String fileid) {
        regFileid(CK_LT, fRES(fileid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fileid The value of fileid as greaterEqual.
     */
    public void setFileid_GreaterEqual(String fileid) {
        regFileid(CK_GE, fRES(fileid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fileid The value of fileid as lessEqual.
     */
    public void setFileid_LessEqual(String fileid) {
        regFileid(CK_LE, fRES(fileid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param fileid The value of fileid as prefixSearch.
     */
    public void setFileid_PrefixSearch(String fileid) {
        regFileid(CK_PS, fRES(fileid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param fileidList The collection of fileid as inScope.
     */
    public void setFileid_InScope(Collection<String> fileidList) {
        regFileid(CK_INS, cTL(fileidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param fileid The value of fileid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFileid_LikeSearch(String fileid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fileid), getCValueFileid(), "FileID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param fileid The value of fileid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFileid_NotLikeSearch(String fileid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fileid), getCValueFileid(), "FileID", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setFileid_IsNull() { regFileid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setFileid_IsNotNull() { regFileid(CK_ISNN, DOBJ); }

    protected void regFileid(ConditionKey k, Object v) { regQ(k, v, getCValueFileid(), "FileID"); }
    abstract protected ConditionValue getCValueFileid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param appliesto The value of appliesto as equal.
     */
    public void setAppliesto_Equal(String appliesto) {
        regAppliesto(CK_EQ, fRES(appliesto));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as notEqual.
     */
    public void setAppliesto_NotEqual(String appliesto) {
        regAppliesto(CK_NE, fRES(appliesto));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as greaterThan.
     */
    public void setAppliesto_GreaterThan(String appliesto) {
        regAppliesto(CK_GT, fRES(appliesto));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as lessThan.
     */
    public void setAppliesto_LessThan(String appliesto) {
        regAppliesto(CK_LT, fRES(appliesto));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as greaterEqual.
     */
    public void setAppliesto_GreaterEqual(String appliesto) {
        regAppliesto(CK_GE, fRES(appliesto));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as lessEqual.
     */
    public void setAppliesto_LessEqual(String appliesto) {
        regAppliesto(CK_LE, fRES(appliesto));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as prefixSearch.
     */
    public void setAppliesto_PrefixSearch(String appliesto) {
        regAppliesto(CK_PS, fRES(appliesto));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param appliestoList The collection of appliesto as inScope.
     */
    public void setAppliesto_InScope(Collection<String> appliestoList) {
        regAppliesto(CK_INS, cTL(appliestoList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param appliesto The value of appliesto as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAppliesto_LikeSearch(String appliesto, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(appliesto), getCValueAppliesto(), "AppliesTo", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param appliesto The value of appliesto as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAppliesto_NotLikeSearch(String appliesto, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(appliesto), getCValueAppliesto(), "AppliesTo", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setAppliesto_IsNull() { regAppliesto(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setAppliesto_IsNotNull() { regAppliesto(CK_ISNN, DOBJ); }

    protected void regAppliesto(ConditionKey k, Object v) { regQ(k, v, getCValueAppliesto(), "AppliesTo"); }
    abstract protected ConditionValue getCValueAppliesto();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(100)}
     * @param category The value of category as equal.
     */
    public void setCategory_Equal(String category) {
        regCategory(CK_EQ, fRES(category));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param category The value of category as notEqual.
     */
    public void setCategory_NotEqual(String category) {
        regCategory(CK_NE, fRES(category));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param category The value of category as greaterThan.
     */
    public void setCategory_GreaterThan(String category) {
        regCategory(CK_GT, fRES(category));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param category The value of category as lessThan.
     */
    public void setCategory_LessThan(String category) {
        regCategory(CK_LT, fRES(category));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param category The value of category as greaterEqual.
     */
    public void setCategory_GreaterEqual(String category) {
        regCategory(CK_GE, fRES(category));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param category The value of category as lessEqual.
     */
    public void setCategory_LessEqual(String category) {
        regCategory(CK_LE, fRES(category));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param category The value of category as prefixSearch.
     */
    public void setCategory_PrefixSearch(String category) {
        regCategory(CK_PS, fRES(category));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param categoryList The collection of category as inScope.
     */
    public void setCategory_InScope(Collection<String> categoryList) {
        regCategory(CK_INS, cTL(categoryList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param category The value of category as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCategory_LikeSearch(String category, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(category), getCValueCategory(), "Category", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param category The value of category as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCategory_NotLikeSearch(String category, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(category), getCValueCategory(), "Category", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setCategory_IsNull() { regCategory(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setCategory_IsNotNull() { regCategory(CK_ISNN, DOBJ); }

    protected void regCategory(ConditionKey k, Object v) { regQ(k, v, getCValueCategory(), "Category"); }
    abstract protected ConditionValue getCValueCategory();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(150)}
     * @param name The value of name as equal.
     */
    public void setName_Equal(String name) {
        regName(CK_EQ, fRES(name));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as notEqual.
     */
    public void setName_NotEqual(String name) {
        regName(CK_NE, fRES(name));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(String name) {
        regName(CK_PS, fRES(name));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param nameList The collection of name as inScope.
     */
    public void setName_InScope(Collection<String> nameList) {
        regName(CK_INS, cTL(nameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), getCValueName(), "Name", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), getCValueName(), "Name", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setName_IsNull() { regName(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DOBJ); }

    protected void regName(ConditionKey k, Object v) { regQ(k, v, getCValueName(), "Name"); }
    abstract protected ConditionValue getCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param file The value of file as equal.
     */
    public void setFile_Equal(String file) {
        regFile(CK_EQ, fRES(file));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param file The value of file as notEqual.
     */
    public void setFile_NotEqual(String file) {
        regFile(CK_NE, fRES(file));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param file The value of file as greaterThan.
     */
    public void setFile_GreaterThan(String file) {
        regFile(CK_GT, fRES(file));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param file The value of file as lessThan.
     */
    public void setFile_LessThan(String file) {
        regFile(CK_LT, fRES(file));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param file The value of file as greaterEqual.
     */
    public void setFile_GreaterEqual(String file) {
        regFile(CK_GE, fRES(file));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param file The value of file as lessEqual.
     */
    public void setFile_LessEqual(String file) {
        regFile(CK_LE, fRES(file));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param file The value of file as prefixSearch.
     */
    public void setFile_PrefixSearch(String file) {
        regFile(CK_PS, fRES(file));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param fileList The collection of file as inScope.
     */
    public void setFile_InScope(Collection<String> fileList) {
        regFile(CK_INS, cTL(fileList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param file The value of file as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFile_LikeSearch(String file, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(file), getCValueFile(), "File", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param file The value of file as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFile_NotLikeSearch(String file, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(file), getCValueFile(), "File", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setFile_IsNull() { regFile(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setFile_IsNotNull() { regFile(CK_ISNN, DOBJ); }

    protected void regFile(ConditionKey k, Object v) { regQ(k, v, getCValueFile(), "File"); }
    abstract protected ConditionValue getCValueFile();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
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
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param filedate The value of filedate as equal.
     */
    public void setFiledate_Equal(java.sql.Timestamp filedate) {
        regFiledate(CK_EQ, filedate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param filedate The value of filedate as greaterThan.
     */
    public void setFiledate_GreaterThan(java.sql.Timestamp filedate) {
        regFiledate(CK_GT, filedate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param filedate The value of filedate as lessThan.
     */
    public void setFiledate_LessThan(java.sql.Timestamp filedate) {
        regFiledate(CK_LT, filedate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param filedate The value of filedate as greaterEqual.
     */
    public void setFiledate_GreaterEqual(java.sql.Timestamp filedate) {
        regFiledate(CK_GE, filedate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param filedate The value of filedate as lessEqual.
     */
    public void setFiledate_LessEqual(java.sql.Timestamp filedate) {
        regFiledate(CK_LE, filedate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of filedate. (Nullable)
     * @param toDate The to-date of filedate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setFiledate_FromTo(java.util.Date fromDate, java.util.Date toDate, FromToOption fromToOption) {
        regFTQ((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueFiledate(), "FileDate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of filedate. (Nullable)
     * @param toDate The to-date of filedate. (Nullable)
     */
    public void setFiledate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setFiledate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setFiledate_IsNull() { regFiledate(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setFiledate_IsNotNull() { regFiledate(CK_ISNN, DOBJ); }

    protected void regFiledate(ConditionKey k, Object v) { regQ(k, v, getCValueFiledate(), "FileDate"); }
    abstract protected ConditionValue getCValueFiledate();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param filesize The value of filesize as equal.
     */
    public void setFilesize_Equal(java.lang.Integer filesize) {
        regFilesize(CK_EQ, filesize);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param filesize The value of filesize as notEqual.
     */
    public void setFilesize_NotEqual(java.lang.Integer filesize) {
        regFilesize(CK_NE, filesize);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param filesize The value of filesize as greaterThan.
     */
    public void setFilesize_GreaterThan(java.lang.Integer filesize) {
        regFilesize(CK_GT, filesize);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param filesize The value of filesize as lessThan.
     */
    public void setFilesize_LessThan(java.lang.Integer filesize) {
        regFilesize(CK_LT, filesize);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param filesize The value of filesize as greaterEqual.
     */
    public void setFilesize_GreaterEqual(java.lang.Integer filesize) {
        regFilesize(CK_GE, filesize);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setFilesize_IsNull() { regFilesize(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setFilesize_IsNotNull() { regFilesize(CK_ISNN, DOBJ); }

    protected void regFilesize(ConditionKey k, Object v) { regQ(k, v, getCValueFilesize(), "FileSize"); }
    abstract protected ConditionValue getCValueFilesize();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TFilesCB.class.getName(); }
    String xCQ() { return TFilesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
