package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_objectfiles.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTObjectfilesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectfilesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * @param filename The value of filename as equal.
     */
    public void setFilename_Equal(String filename) {
        regFilename(CK_EQ, fRES(filename));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param filename The value of filename as notEqual.
     */
    public void setFilename_NotEqual(String filename) {
        regFilename(CK_NE, fRES(filename));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param filename The value of filename as greaterThan.
     */
    public void setFilename_GreaterThan(String filename) {
        regFilename(CK_GT, fRES(filename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param filename The value of filename as lessThan.
     */
    public void setFilename_LessThan(String filename) {
        regFilename(CK_LT, fRES(filename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param filename The value of filename as greaterEqual.
     */
    public void setFilename_GreaterEqual(String filename) {
        regFilename(CK_GE, fRES(filename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param filename The value of filename as lessEqual.
     */
    public void setFilename_LessEqual(String filename) {
        regFilename(CK_LE, fRES(filename));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param filename The value of filename as prefixSearch.
     */
    public void setFilename_PrefixSearch(String filename) {
        regFilename(CK_PS, fRES(filename));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param filename The value of filename as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFilename_LikeSearch(String filename, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(filename), getCValueFilename(), "FileName", "Filename", "filename", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param filenameList The collection of filename as inScope.
     */
    public void setFilename_InScope(Collection<String> filenameList) {
        regFilename(CK_INS, cTL(filenameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param filename The collection of filename as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setFilename_InScope(String filename, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(filename), getCValueFilename(), "FileName", "Filename", "filename", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setFilename_IsNull() { regFilename(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setFilename_IsNotNull() { regFilename(CK_ISNN, DUMMY_OBJECT); }

    protected void regFilename(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFilename(), "FileName", "Filename", "filename");
    }
    protected void registerInlineFilename(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFilename(), "FileName", "Filename", "filename");
    }
    abstract protected ConditionValue getCValueFilename();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
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
     * @param note The value of note as equal.
     */
    public void setNote_Equal(String note) {
        regNote(CK_EQ, fRES(note));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param note The value of note as notEqual.
     */
    public void setNote_NotEqual(String note) {
        regNote(CK_NE, fRES(note));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param note The value of note as greaterThan.
     */
    public void setNote_GreaterThan(String note) {
        regNote(CK_GT, fRES(note));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param note The value of note as lessThan.
     */
    public void setNote_LessThan(String note) {
        regNote(CK_LT, fRES(note));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param note The value of note as greaterEqual.
     */
    public void setNote_GreaterEqual(String note) {
        regNote(CK_GE, fRES(note));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param note The value of note as lessEqual.
     */
    public void setNote_LessEqual(String note) {
        regNote(CK_LE, fRES(note));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param note The value of note as prefixSearch.
     */
    public void setNote_PrefixSearch(String note) {
        regNote(CK_PS, fRES(note));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param note The value of note as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNote_LikeSearch(String note, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(note), getCValueNote(), "Note", "Note", "note", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param noteList The collection of note as inScope.
     */
    public void setNote_InScope(Collection<String> noteList) {
        regNote(CK_INS, cTL(noteList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param note The collection of note as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setNote_InScope(String note, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(note), getCValueNote(), "Note", "Note", "note", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNote_IsNull() { regNote(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNote_IsNotNull() { regNote(CK_ISNN, DUMMY_OBJECT); }

    protected void regNote(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNote(), "Note", "Note", "note");
    }
    protected void registerInlineNote(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNote(), "Note", "Note", "note");
    }
    abstract protected ConditionValue getCValueNote();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param filesize The value of filesize as equal.
     */
    public void setFilesize_Equal(String filesize) {
        regFilesize(CK_EQ, fRES(filesize));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param filesize The value of filesize as notEqual.
     */
    public void setFilesize_NotEqual(String filesize) {
        regFilesize(CK_NE, fRES(filesize));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param filesize The value of filesize as greaterThan.
     */
    public void setFilesize_GreaterThan(String filesize) {
        regFilesize(CK_GT, fRES(filesize));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param filesize The value of filesize as lessThan.
     */
    public void setFilesize_LessThan(String filesize) {
        regFilesize(CK_LT, fRES(filesize));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param filesize The value of filesize as greaterEqual.
     */
    public void setFilesize_GreaterEqual(String filesize) {
        regFilesize(CK_GE, fRES(filesize));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param filesize The value of filesize as lessEqual.
     */
    public void setFilesize_LessEqual(String filesize) {
        regFilesize(CK_LE, fRES(filesize));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param filesize The value of filesize as prefixSearch.
     */
    public void setFilesize_PrefixSearch(String filesize) {
        regFilesize(CK_PS, fRES(filesize));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param filesize The value of filesize as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFilesize_LikeSearch(String filesize, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(filesize), getCValueFilesize(), "FileSize", "Filesize", "filesize", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param filesizeList The collection of filesize as inScope.
     */
    public void setFilesize_InScope(Collection<String> filesizeList) {
        regFilesize(CK_INS, cTL(filesizeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param filesize The collection of filesize as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setFilesize_InScope(String filesize, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(filesize), getCValueFilesize(), "FileSize", "Filesize", "filesize", inScopeOption);
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

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param filedate The value of filedate as equal.
     */
    public void setFiledate_Equal(String filedate) {
        regFiledate(CK_EQ, fRES(filedate));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param filedate The value of filedate as notEqual.
     */
    public void setFiledate_NotEqual(String filedate) {
        regFiledate(CK_NE, fRES(filedate));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param filedate The value of filedate as greaterThan.
     */
    public void setFiledate_GreaterThan(String filedate) {
        regFiledate(CK_GT, fRES(filedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param filedate The value of filedate as lessThan.
     */
    public void setFiledate_LessThan(String filedate) {
        regFiledate(CK_LT, fRES(filedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param filedate The value of filedate as greaterEqual.
     */
    public void setFiledate_GreaterEqual(String filedate) {
        regFiledate(CK_GE, fRES(filedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param filedate The value of filedate as lessEqual.
     */
    public void setFiledate_LessEqual(String filedate) {
        regFiledate(CK_LE, fRES(filedate));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param filedate The value of filedate as prefixSearch.
     */
    public void setFiledate_PrefixSearch(String filedate) {
        regFiledate(CK_PS, fRES(filedate));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param filedate The value of filedate as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFiledate_LikeSearch(String filedate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(filedate), getCValueFiledate(), "FileDate", "Filedate", "filedate", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param filedateList The collection of filedate as inScope.
     */
    public void setFiledate_InScope(Collection<String> filedateList) {
        regFiledate(CK_INS, cTL(filedateList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param filedate The collection of filedate as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setFiledate_InScope(String filedate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(filedate), getCValueFiledate(), "FileDate", "Filedate", "filedate", inScopeOption);
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

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TObjectfilesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TObjectfilesCQ.class.getName(); }
}
