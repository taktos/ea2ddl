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
 * The abstract condition-query of t_version.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTVersionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTVersionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_version";
    }
    
    public String getTableSqlName() {
        return "t_version";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(50)}
     * @param elementid The value of elementid as equal.
     */
    public void setElementid_Equal(String elementid) {
        regElementid(CK_EQ, fRES(elementid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as notEqual.
     */
    public void setElementid_NotEqual(String elementid) {
        regElementid(CK_NE, fRES(elementid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as greaterThan.
     */
    public void setElementid_GreaterThan(String elementid) {
        regElementid(CK_GT, fRES(elementid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as lessThan.
     */
    public void setElementid_LessThan(String elementid) {
        regElementid(CK_LT, fRES(elementid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as greaterEqual.
     */
    public void setElementid_GreaterEqual(String elementid) {
        regElementid(CK_GE, fRES(elementid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as lessEqual.
     */
    public void setElementid_LessEqual(String elementid) {
        regElementid(CK_LE, fRES(elementid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementid The value of elementid as prefixSearch.
     */
    public void setElementid_PrefixSearch(String elementid) {
        regElementid(CK_PS, fRES(elementid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementidList The collection of elementid as inScope.
     */
    public void setElementid_InScope(Collection<String> elementidList) {
        regElementid(CK_INS, cTL(elementidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementid The value of elementid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setElementid_LikeSearch(String elementid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(elementid), getCValueElementid(), "ElementID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementid The value of elementid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setElementid_NotLikeSearch(String elementid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(elementid), getCValueElementid(), "ElementID", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setElementid_IsNull() { regElementid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setElementid_IsNotNull() { regElementid(CK_ISNN, DOBJ); }

    protected void regElementid(ConditionKey k, Object v) { regQ(k, v, getCValueElementid(), "ElementID"); }
    abstract protected ConditionValue getCValueElementid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(255)}
     * @param versionid The value of versionid as equal.
     */
    public void setVersionid_Equal(String versionid) {
        regVersionid(CK_EQ, fRES(versionid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param versionid The value of versionid as notEqual.
     */
    public void setVersionid_NotEqual(String versionid) {
        regVersionid(CK_NE, fRES(versionid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param versionid The value of versionid as greaterThan.
     */
    public void setVersionid_GreaterThan(String versionid) {
        regVersionid(CK_GT, fRES(versionid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param versionid The value of versionid as lessThan.
     */
    public void setVersionid_LessThan(String versionid) {
        regVersionid(CK_LT, fRES(versionid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param versionid The value of versionid as greaterEqual.
     */
    public void setVersionid_GreaterEqual(String versionid) {
        regVersionid(CK_GE, fRES(versionid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param versionid The value of versionid as lessEqual.
     */
    public void setVersionid_LessEqual(String versionid) {
        regVersionid(CK_LE, fRES(versionid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param versionid The value of versionid as prefixSearch.
     */
    public void setVersionid_PrefixSearch(String versionid) {
        regVersionid(CK_PS, fRES(versionid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param versionidList The collection of versionid as inScope.
     */
    public void setVersionid_InScope(Collection<String> versionidList) {
        regVersionid(CK_INS, cTL(versionidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param versionid The value of versionid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVersionid_LikeSearch(String versionid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(versionid), getCValueVersionid(), "VersionID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param versionid The value of versionid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVersionid_NotLikeSearch(String versionid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(versionid), getCValueVersionid(), "VersionID", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setVersionid_IsNull() { regVersionid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setVersionid_IsNotNull() { regVersionid(CK_ISNN, DOBJ); }

    protected void regVersionid(ConditionKey k, Object v) { regQ(k, v, getCValueVersionid(), "VersionID"); }
    abstract protected ConditionValue getCValueVersionid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(100)}
     * @param elementtype The value of elementtype as equal.
     */
    public void setElementtype_Equal(String elementtype) {
        regElementtype(CK_EQ, fRES(elementtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementtype The value of elementtype as notEqual.
     */
    public void setElementtype_NotEqual(String elementtype) {
        regElementtype(CK_NE, fRES(elementtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementtype The value of elementtype as greaterThan.
     */
    public void setElementtype_GreaterThan(String elementtype) {
        regElementtype(CK_GT, fRES(elementtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementtype The value of elementtype as lessThan.
     */
    public void setElementtype_LessThan(String elementtype) {
        regElementtype(CK_LT, fRES(elementtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementtype The value of elementtype as greaterEqual.
     */
    public void setElementtype_GreaterEqual(String elementtype) {
        regElementtype(CK_GE, fRES(elementtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementtype The value of elementtype as lessEqual.
     */
    public void setElementtype_LessEqual(String elementtype) {
        regElementtype(CK_LE, fRES(elementtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementtype The value of elementtype as prefixSearch.
     */
    public void setElementtype_PrefixSearch(String elementtype) {
        regElementtype(CK_PS, fRES(elementtype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementtypeList The collection of elementtype as inScope.
     */
    public void setElementtype_InScope(Collection<String> elementtypeList) {
        regElementtype(CK_INS, cTL(elementtypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementtype The value of elementtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setElementtype_LikeSearch(String elementtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(elementtype), getCValueElementtype(), "ElementType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementtype The value of elementtype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setElementtype_NotLikeSearch(String elementtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(elementtype), getCValueElementtype(), "ElementType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setElementtype_IsNull() { regElementtype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setElementtype_IsNotNull() { regElementtype(CK_ISNN, DOBJ); }

    protected void regElementtype(ConditionKey k, Object v) { regQ(k, v, getCValueElementtype(), "ElementType"); }
    abstract protected ConditionValue getCValueElementtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param flags The value of flags as equal.
     */
    public void setFlags_Equal(String flags) {
        regFlags(CK_EQ, fRES(flags));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param flags The value of flags as notEqual.
     */
    public void setFlags_NotEqual(String flags) {
        regFlags(CK_NE, fRES(flags));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param flags The value of flags as greaterThan.
     */
    public void setFlags_GreaterThan(String flags) {
        regFlags(CK_GT, fRES(flags));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param flags The value of flags as lessThan.
     */
    public void setFlags_LessThan(String flags) {
        regFlags(CK_LT, fRES(flags));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param flags The value of flags as greaterEqual.
     */
    public void setFlags_GreaterEqual(String flags) {
        regFlags(CK_GE, fRES(flags));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param flags The value of flags as lessEqual.
     */
    public void setFlags_LessEqual(String flags) {
        regFlags(CK_LE, fRES(flags));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param flags The value of flags as prefixSearch.
     */
    public void setFlags_PrefixSearch(String flags) {
        regFlags(CK_PS, fRES(flags));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param flagsList The collection of flags as inScope.
     */
    public void setFlags_InScope(Collection<String> flagsList) {
        regFlags(CK_INS, cTL(flagsList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param flags The value of flags as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFlags_LikeSearch(String flags, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(flags), getCValueFlags(), "Flags", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param flags The value of flags as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFlags_NotLikeSearch(String flags, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(flags), getCValueFlags(), "Flags", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setFlags_IsNull() { regFlags(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setFlags_IsNotNull() { regFlags(CK_ISNN, DOBJ); }

    protected void regFlags(ConditionKey k, Object v) { regQ(k, v, getCValueFlags(), "Flags"); }
    abstract protected ConditionValue getCValueFlags();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param externalfile The value of externalfile as equal.
     */
    public void setExternalfile_Equal(String externalfile) {
        regExternalfile(CK_EQ, fRES(externalfile));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param externalfile The value of externalfile as notEqual.
     */
    public void setExternalfile_NotEqual(String externalfile) {
        regExternalfile(CK_NE, fRES(externalfile));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param externalfile The value of externalfile as greaterThan.
     */
    public void setExternalfile_GreaterThan(String externalfile) {
        regExternalfile(CK_GT, fRES(externalfile));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param externalfile The value of externalfile as lessThan.
     */
    public void setExternalfile_LessThan(String externalfile) {
        regExternalfile(CK_LT, fRES(externalfile));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param externalfile The value of externalfile as greaterEqual.
     */
    public void setExternalfile_GreaterEqual(String externalfile) {
        regExternalfile(CK_GE, fRES(externalfile));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param externalfile The value of externalfile as lessEqual.
     */
    public void setExternalfile_LessEqual(String externalfile) {
        regExternalfile(CK_LE, fRES(externalfile));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param externalfile The value of externalfile as prefixSearch.
     */
    public void setExternalfile_PrefixSearch(String externalfile) {
        regExternalfile(CK_PS, fRES(externalfile));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param externalfileList The collection of externalfile as inScope.
     */
    public void setExternalfile_InScope(Collection<String> externalfileList) {
        regExternalfile(CK_INS, cTL(externalfileList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param externalfile The value of externalfile as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExternalfile_LikeSearch(String externalfile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(externalfile), getCValueExternalfile(), "ExternalFile", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param externalfile The value of externalfile as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExternalfile_NotLikeSearch(String externalfile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(externalfile), getCValueExternalfile(), "ExternalFile", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setExternalfile_IsNull() { regExternalfile(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setExternalfile_IsNotNull() { regExternalfile(CK_ISNN, DOBJ); }

    protected void regExternalfile(ConditionKey k, Object v) { regQ(k, v, getCValueExternalfile(), "ExternalFile"); }
    abstract protected ConditionValue getCValueExternalfile();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param owner The value of owner as equal.
     */
    public void setOwner_Equal(String owner) {
        regOwner(CK_EQ, fRES(owner));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param owner The value of owner as notEqual.
     */
    public void setOwner_NotEqual(String owner) {
        regOwner(CK_NE, fRES(owner));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param owner The value of owner as greaterThan.
     */
    public void setOwner_GreaterThan(String owner) {
        regOwner(CK_GT, fRES(owner));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param owner The value of owner as lessThan.
     */
    public void setOwner_LessThan(String owner) {
        regOwner(CK_LT, fRES(owner));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param owner The value of owner as greaterEqual.
     */
    public void setOwner_GreaterEqual(String owner) {
        regOwner(CK_GE, fRES(owner));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param owner The value of owner as lessEqual.
     */
    public void setOwner_LessEqual(String owner) {
        regOwner(CK_LE, fRES(owner));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param owner The value of owner as prefixSearch.
     */
    public void setOwner_PrefixSearch(String owner) {
        regOwner(CK_PS, fRES(owner));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param ownerList The collection of owner as inScope.
     */
    public void setOwner_InScope(Collection<String> ownerList) {
        regOwner(CK_INS, cTL(ownerList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param owner The value of owner as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwner_LikeSearch(String owner, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(owner), getCValueOwner(), "Owner", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param owner The value of owner as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwner_NotLikeSearch(String owner, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(owner), getCValueOwner(), "Owner", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setOwner_IsNull() { regOwner(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setOwner_IsNotNull() { regOwner(CK_ISNN, DOBJ); }

    protected void regOwner(ConditionKey k, Object v) { regQ(k, v, getCValueOwner(), "Owner"); }
    abstract protected ConditionValue getCValueOwner();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param versiondate The value of versiondate as equal.
     */
    public void setVersiondate_Equal(java.sql.Timestamp versiondate) {
        regVersiondate(CK_EQ, versiondate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param versiondate The value of versiondate as greaterThan.
     */
    public void setVersiondate_GreaterThan(java.sql.Timestamp versiondate) {
        regVersiondate(CK_GT, versiondate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param versiondate The value of versiondate as lessThan.
     */
    public void setVersiondate_LessThan(java.sql.Timestamp versiondate) {
        regVersiondate(CK_LT, versiondate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param versiondate The value of versiondate as greaterEqual.
     */
    public void setVersiondate_GreaterEqual(java.sql.Timestamp versiondate) {
        regVersiondate(CK_GE, versiondate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param versiondate The value of versiondate as lessEqual.
     */
    public void setVersiondate_LessEqual(java.sql.Timestamp versiondate) {
        regVersiondate(CK_LE, versiondate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of versiondate. (Nullable)
     * @param toDate The to-date of versiondate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setVersiondate_FromTo(java.util.Date fromDate, java.util.Date toDate, FromToOption fromToOption) {
        regFTQ((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueVersiondate(), "VersionDate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of versiondate. (Nullable)
     * @param toDate The to-date of versiondate. (Nullable)
     */
    public void setVersiondate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setVersiondate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setVersiondate_IsNull() { regVersiondate(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setVersiondate_IsNotNull() { regVersiondate(CK_ISNN, DOBJ); }

    protected void regVersiondate(ConditionKey k, Object v) { regQ(k, v, getCValueVersiondate(), "VersionDate"); }
    abstract protected ConditionValue getCValueVersiondate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param branch The value of branch as equal.
     */
    public void setBranch_Equal(String branch) {
        regBranch(CK_EQ, fRES(branch));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param branch The value of branch as notEqual.
     */
    public void setBranch_NotEqual(String branch) {
        regBranch(CK_NE, fRES(branch));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param branch The value of branch as greaterThan.
     */
    public void setBranch_GreaterThan(String branch) {
        regBranch(CK_GT, fRES(branch));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param branch The value of branch as lessThan.
     */
    public void setBranch_LessThan(String branch) {
        regBranch(CK_LT, fRES(branch));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param branch The value of branch as greaterEqual.
     */
    public void setBranch_GreaterEqual(String branch) {
        regBranch(CK_GE, fRES(branch));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param branch The value of branch as lessEqual.
     */
    public void setBranch_LessEqual(String branch) {
        regBranch(CK_LE, fRES(branch));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param branch The value of branch as prefixSearch.
     */
    public void setBranch_PrefixSearch(String branch) {
        regBranch(CK_PS, fRES(branch));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param branchList The collection of branch as inScope.
     */
    public void setBranch_InScope(Collection<String> branchList) {
        regBranch(CK_INS, cTL(branchList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param branch The value of branch as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBranch_LikeSearch(String branch, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(branch), getCValueBranch(), "Branch", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param branch The value of branch as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBranch_NotLikeSearch(String branch, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(branch), getCValueBranch(), "Branch", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBranch_IsNull() { regBranch(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBranch_IsNotNull() { regBranch(CK_ISNN, DOBJ); }

    protected void regBranch(ConditionKey k, Object v) { regQ(k, v, getCValueBranch(), "Branch"); }
    abstract protected ConditionValue getCValueBranch();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param elementxml The value of elementxml as equal.
     */
    public void setElementxml_Equal(String elementxml) {
        regElementxml(CK_EQ, fRES(elementxml));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementxml The value of elementxml as notEqual.
     */
    public void setElementxml_NotEqual(String elementxml) {
        regElementxml(CK_NE, fRES(elementxml));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementxml The value of elementxml as greaterThan.
     */
    public void setElementxml_GreaterThan(String elementxml) {
        regElementxml(CK_GT, fRES(elementxml));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementxml The value of elementxml as lessThan.
     */
    public void setElementxml_LessThan(String elementxml) {
        regElementxml(CK_LT, fRES(elementxml));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementxml The value of elementxml as greaterEqual.
     */
    public void setElementxml_GreaterEqual(String elementxml) {
        regElementxml(CK_GE, fRES(elementxml));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementxml The value of elementxml as lessEqual.
     */
    public void setElementxml_LessEqual(String elementxml) {
        regElementxml(CK_LE, fRES(elementxml));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param elementxml The value of elementxml as prefixSearch.
     */
    public void setElementxml_PrefixSearch(String elementxml) {
        regElementxml(CK_PS, fRES(elementxml));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementxmlList The collection of elementxml as inScope.
     */
    public void setElementxml_InScope(Collection<String> elementxmlList) {
        regElementxml(CK_INS, cTL(elementxmlList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementxml The value of elementxml as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setElementxml_LikeSearch(String elementxml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(elementxml), getCValueElementxml(), "ElementXML", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementxml The value of elementxml as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setElementxml_NotLikeSearch(String elementxml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(elementxml), getCValueElementxml(), "ElementXML", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setElementxml_IsNull() { regElementxml(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setElementxml_IsNotNull() { regElementxml(CK_ISNN, DOBJ); }

    protected void regElementxml(ConditionKey k, Object v) { regQ(k, v, getCValueElementxml(), "ElementXML"); }
    abstract protected ConditionValue getCValueElementxml();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TVersionCB.class.getName(); }
    String xCQ() { return TVersionCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
