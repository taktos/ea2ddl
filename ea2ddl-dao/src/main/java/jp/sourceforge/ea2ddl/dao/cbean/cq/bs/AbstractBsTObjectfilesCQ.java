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
 * The abstract condition-query of t_objectfiles.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTObjectfilesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectfilesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_objectfiles";
    }
    
    public String getTableSqlName() {
        return "t_objectfiles";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : INTEGER}
     * @param objectId The value of objectId as equal.
     */
    public void setObjectId_Equal(java.lang.Integer objectId) {
        regObjectId(CK_EQ, objectId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as notEqual.
     */
    public void setObjectId_NotEqual(java.lang.Integer objectId) {
        regObjectId(CK_NE, objectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as greaterThan.
     */
    public void setObjectId_GreaterThan(java.lang.Integer objectId) {
        regObjectId(CK_GT, objectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as lessThan.
     */
    public void setObjectId_LessThan(java.lang.Integer objectId) {
        regObjectId(CK_LT, objectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as greaterEqual.
     */
    public void setObjectId_GreaterEqual(java.lang.Integer objectId) {
        regObjectId(CK_GE, objectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setObjectId_IsNull() { regObjectId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setObjectId_IsNotNull() { regObjectId(CK_ISNN, DOBJ); }

    protected void regObjectId(ConditionKey k, Object v) { regQ(k, v, getCValueObjectId(), "Object_ID"); }
    abstract protected ConditionValue getCValueObjectId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(255)}
     * @param filename The value of filename as equal.
     */
    public void setFilename_Equal(String filename) {
        regFilename(CK_EQ, fRES(filename));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filename The value of filename as notEqual.
     */
    public void setFilename_NotEqual(String filename) {
        regFilename(CK_NE, fRES(filename));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filename The value of filename as greaterThan.
     */
    public void setFilename_GreaterThan(String filename) {
        regFilename(CK_GT, fRES(filename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filename The value of filename as lessThan.
     */
    public void setFilename_LessThan(String filename) {
        regFilename(CK_LT, fRES(filename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filename The value of filename as greaterEqual.
     */
    public void setFilename_GreaterEqual(String filename) {
        regFilename(CK_GE, fRES(filename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filename The value of filename as lessEqual.
     */
    public void setFilename_LessEqual(String filename) {
        regFilename(CK_LE, fRES(filename));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filename The value of filename as prefixSearch.
     */
    public void setFilename_PrefixSearch(String filename) {
        regFilename(CK_PS, fRES(filename));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param filenameList The collection of filename as inScope.
     */
    public void setFilename_InScope(Collection<String> filenameList) {
        regFilename(CK_INS, cTL(filenameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param filename The value of filename as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFilename_LikeSearch(String filename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(filename), getCValueFilename(), "FileName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param filename The value of filename as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFilename_NotLikeSearch(String filename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(filename), getCValueFilename(), "FileName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setFilename_IsNull() { regFilename(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setFilename_IsNotNull() { regFilename(CK_ISNN, DOBJ); }

    protected void regFilename(ConditionKey k, Object v) { regQ(k, v, getCValueFilename(), "FileName"); }
    abstract protected ConditionValue getCValueFilename();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param type The value of type as equal.
     */
    public void setType_Equal(String type) {
        regType(CK_EQ, fRES(type));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as notEqual.
     */
    public void setType_NotEqual(String type) {
        regType(CK_NE, fRES(type));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as greaterThan.
     */
    public void setType_GreaterThan(String type) {
        regType(CK_GT, fRES(type));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as lessThan.
     */
    public void setType_LessThan(String type) {
        regType(CK_LT, fRES(type));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as greaterEqual.
     */
    public void setType_GreaterEqual(String type) {
        regType(CK_GE, fRES(type));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as lessEqual.
     */
    public void setType_LessEqual(String type) {
        regType(CK_LE, fRES(type));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as prefixSearch.
     */
    public void setType_PrefixSearch(String type) {
        regType(CK_PS, fRES(type));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeList The collection of type as inScope.
     */
    public void setType_InScope(Collection<String> typeList) {
        regType(CK_INS, cTL(typeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param type The value of type as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setType_LikeSearch(String type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(type), getCValueType(), "Type", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param type The value of type as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setType_NotLikeSearch(String type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(type), getCValueType(), "Type", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setType_IsNull() { regType(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setType_IsNotNull() { regType(CK_ISNN, DOBJ); }

    protected void regType(ConditionKey k, Object v) { regQ(k, v, getCValueType(), "Type"); }
    abstract protected ConditionValue getCValueType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param note The value of note as equal.
     */
    public void setNote_Equal(String note) {
        regNote(CK_EQ, fRES(note));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param note The value of note as notEqual.
     */
    public void setNote_NotEqual(String note) {
        regNote(CK_NE, fRES(note));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param note The value of note as greaterThan.
     */
    public void setNote_GreaterThan(String note) {
        regNote(CK_GT, fRES(note));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param note The value of note as lessThan.
     */
    public void setNote_LessThan(String note) {
        regNote(CK_LT, fRES(note));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param note The value of note as greaterEqual.
     */
    public void setNote_GreaterEqual(String note) {
        regNote(CK_GE, fRES(note));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param note The value of note as lessEqual.
     */
    public void setNote_LessEqual(String note) {
        regNote(CK_LE, fRES(note));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param note The value of note as prefixSearch.
     */
    public void setNote_PrefixSearch(String note) {
        regNote(CK_PS, fRES(note));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param noteList The collection of note as inScope.
     */
    public void setNote_InScope(Collection<String> noteList) {
        regNote(CK_INS, cTL(noteList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param note The value of note as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNote_LikeSearch(String note, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(note), getCValueNote(), "Note", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param note The value of note as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNote_NotLikeSearch(String note, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(note), getCValueNote(), "Note", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNote_IsNull() { regNote(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNote_IsNotNull() { regNote(CK_ISNN, DOBJ); }

    protected void regNote(ConditionKey k, Object v) { regQ(k, v, getCValueNote(), "Note"); }
    abstract protected ConditionValue getCValueNote();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param filesize The value of filesize as equal.
     */
    public void setFilesize_Equal(String filesize) {
        regFilesize(CK_EQ, fRES(filesize));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filesize The value of filesize as notEqual.
     */
    public void setFilesize_NotEqual(String filesize) {
        regFilesize(CK_NE, fRES(filesize));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filesize The value of filesize as greaterThan.
     */
    public void setFilesize_GreaterThan(String filesize) {
        regFilesize(CK_GT, fRES(filesize));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filesize The value of filesize as lessThan.
     */
    public void setFilesize_LessThan(String filesize) {
        regFilesize(CK_LT, fRES(filesize));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filesize The value of filesize as greaterEqual.
     */
    public void setFilesize_GreaterEqual(String filesize) {
        regFilesize(CK_GE, fRES(filesize));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filesize The value of filesize as lessEqual.
     */
    public void setFilesize_LessEqual(String filesize) {
        regFilesize(CK_LE, fRES(filesize));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filesize The value of filesize as prefixSearch.
     */
    public void setFilesize_PrefixSearch(String filesize) {
        regFilesize(CK_PS, fRES(filesize));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param filesizeList The collection of filesize as inScope.
     */
    public void setFilesize_InScope(Collection<String> filesizeList) {
        regFilesize(CK_INS, cTL(filesizeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param filesize The value of filesize as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFilesize_LikeSearch(String filesize, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(filesize), getCValueFilesize(), "FileSize", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param filesize The value of filesize as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFilesize_NotLikeSearch(String filesize, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(filesize), getCValueFilesize(), "FileSize", likeSearchOption);
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

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param filedate The value of filedate as equal.
     */
    public void setFiledate_Equal(String filedate) {
        regFiledate(CK_EQ, fRES(filedate));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filedate The value of filedate as notEqual.
     */
    public void setFiledate_NotEqual(String filedate) {
        regFiledate(CK_NE, fRES(filedate));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filedate The value of filedate as greaterThan.
     */
    public void setFiledate_GreaterThan(String filedate) {
        regFiledate(CK_GT, fRES(filedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filedate The value of filedate as lessThan.
     */
    public void setFiledate_LessThan(String filedate) {
        regFiledate(CK_LT, fRES(filedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filedate The value of filedate as greaterEqual.
     */
    public void setFiledate_GreaterEqual(String filedate) {
        regFiledate(CK_GE, fRES(filedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filedate The value of filedate as lessEqual.
     */
    public void setFiledate_LessEqual(String filedate) {
        regFiledate(CK_LE, fRES(filedate));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filedate The value of filedate as prefixSearch.
     */
    public void setFiledate_PrefixSearch(String filedate) {
        regFiledate(CK_PS, fRES(filedate));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param filedateList The collection of filedate as inScope.
     */
    public void setFiledate_InScope(Collection<String> filedateList) {
        regFiledate(CK_INS, cTL(filedateList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param filedate The value of filedate as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFiledate_LikeSearch(String filedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(filedate), getCValueFiledate(), "FileDate", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param filedate The value of filedate as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFiledate_NotLikeSearch(String filedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(filedate), getCValueFiledate(), "FileDate", likeSearchOption);
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

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TObjectfilesCB.class.getName(); }
    String xCQ() { return TObjectfilesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
