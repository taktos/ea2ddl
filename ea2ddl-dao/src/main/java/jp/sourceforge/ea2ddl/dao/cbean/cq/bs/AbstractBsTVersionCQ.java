package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_version.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTVersionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTVersionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(50)}
     * @param elementid The value of elementid as equal.
     */
    public void setElementid_Equal(String elementid) {
        regElementid(CK_EQ, fRES(elementid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementid The value of elementid as notEqual.
     */
    public void setElementid_NotEqual(String elementid) {
        regElementid(CK_NE, fRES(elementid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementid The value of elementid as greaterThan.
     */
    public void setElementid_GreaterThan(String elementid) {
        regElementid(CK_GT, fRES(elementid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementid The value of elementid as lessThan.
     */
    public void setElementid_LessThan(String elementid) {
        regElementid(CK_LT, fRES(elementid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementid The value of elementid as greaterEqual.
     */
    public void setElementid_GreaterEqual(String elementid) {
        regElementid(CK_GE, fRES(elementid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementid The value of elementid as lessEqual.
     */
    public void setElementid_LessEqual(String elementid) {
        regElementid(CK_LE, fRES(elementid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementid The value of elementid as prefixSearch.
     */
    public void setElementid_PrefixSearch(String elementid) {
        regElementid(CK_PS, fRES(elementid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementid The value of elementid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setElementid_LikeSearch(String elementid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(elementid), getCValueElementid(), "ElementID", "Elementid", "elementid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementidList The collection of elementid as inScope.
     */
    public void setElementid_InScope(Collection<String> elementidList) {
        regElementid(CK_INS, cTL(elementidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementid The collection of elementid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setElementid_InScope(String elementid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(elementid), getCValueElementid(), "ElementID", "Elementid", "elementid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setElementid_IsNull() { regElementid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setElementid_IsNotNull() { regElementid(CK_ISNN, DUMMY_OBJECT); }

    protected void regElementid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueElementid(), "ElementID", "Elementid", "elementid");
    }
    protected void registerInlineElementid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueElementid(), "ElementID", "Elementid", "elementid");
    }
    abstract protected ConditionValue getCValueElementid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(255)}
     * @param versionid The value of versionid as equal.
     */
    public void setVersionid_Equal(String versionid) {
        regVersionid(CK_EQ, fRES(versionid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param versionid The value of versionid as notEqual.
     */
    public void setVersionid_NotEqual(String versionid) {
        regVersionid(CK_NE, fRES(versionid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param versionid The value of versionid as greaterThan.
     */
    public void setVersionid_GreaterThan(String versionid) {
        regVersionid(CK_GT, fRES(versionid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param versionid The value of versionid as lessThan.
     */
    public void setVersionid_LessThan(String versionid) {
        regVersionid(CK_LT, fRES(versionid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param versionid The value of versionid as greaterEqual.
     */
    public void setVersionid_GreaterEqual(String versionid) {
        regVersionid(CK_GE, fRES(versionid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param versionid The value of versionid as lessEqual.
     */
    public void setVersionid_LessEqual(String versionid) {
        regVersionid(CK_LE, fRES(versionid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param versionid The value of versionid as prefixSearch.
     */
    public void setVersionid_PrefixSearch(String versionid) {
        regVersionid(CK_PS, fRES(versionid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param versionid The value of versionid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVersionid_LikeSearch(String versionid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(versionid), getCValueVersionid(), "VersionID", "Versionid", "versionid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param versionidList The collection of versionid as inScope.
     */
    public void setVersionid_InScope(Collection<String> versionidList) {
        regVersionid(CK_INS, cTL(versionidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param versionid The collection of versionid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setVersionid_InScope(String versionid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(versionid), getCValueVersionid(), "VersionID", "Versionid", "versionid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setVersionid_IsNull() { regVersionid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setVersionid_IsNotNull() { regVersionid(CK_ISNN, DUMMY_OBJECT); }

    protected void regVersionid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueVersionid(), "VersionID", "Versionid", "versionid");
    }
    protected void registerInlineVersionid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueVersionid(), "VersionID", "Versionid", "versionid");
    }
    abstract protected ConditionValue getCValueVersionid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param elementtype The value of elementtype as equal.
     */
    public void setElementtype_Equal(String elementtype) {
        regElementtype(CK_EQ, fRES(elementtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementtype The value of elementtype as notEqual.
     */
    public void setElementtype_NotEqual(String elementtype) {
        regElementtype(CK_NE, fRES(elementtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementtype The value of elementtype as greaterThan.
     */
    public void setElementtype_GreaterThan(String elementtype) {
        regElementtype(CK_GT, fRES(elementtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementtype The value of elementtype as lessThan.
     */
    public void setElementtype_LessThan(String elementtype) {
        regElementtype(CK_LT, fRES(elementtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementtype The value of elementtype as greaterEqual.
     */
    public void setElementtype_GreaterEqual(String elementtype) {
        regElementtype(CK_GE, fRES(elementtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementtype The value of elementtype as lessEqual.
     */
    public void setElementtype_LessEqual(String elementtype) {
        regElementtype(CK_LE, fRES(elementtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementtype The value of elementtype as prefixSearch.
     */
    public void setElementtype_PrefixSearch(String elementtype) {
        regElementtype(CK_PS, fRES(elementtype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementtype The value of elementtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setElementtype_LikeSearch(String elementtype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(elementtype), getCValueElementtype(), "ElementType", "Elementtype", "elementtype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementtypeList The collection of elementtype as inScope.
     */
    public void setElementtype_InScope(Collection<String> elementtypeList) {
        regElementtype(CK_INS, cTL(elementtypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementtype The collection of elementtype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setElementtype_InScope(String elementtype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(elementtype), getCValueElementtype(), "ElementType", "Elementtype", "elementtype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setElementtype_IsNull() { regElementtype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setElementtype_IsNotNull() { regElementtype(CK_ISNN, DUMMY_OBJECT); }

    protected void regElementtype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueElementtype(), "ElementType", "Elementtype", "elementtype");
    }
    protected void registerInlineElementtype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueElementtype(), "ElementType", "Elementtype", "elementtype");
    }
    abstract protected ConditionValue getCValueElementtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param flags The value of flags as equal.
     */
    public void setFlags_Equal(String flags) {
        regFlags(CK_EQ, fRES(flags));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param flags The value of flags as notEqual.
     */
    public void setFlags_NotEqual(String flags) {
        regFlags(CK_NE, fRES(flags));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param flags The value of flags as greaterThan.
     */
    public void setFlags_GreaterThan(String flags) {
        regFlags(CK_GT, fRES(flags));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param flags The value of flags as lessThan.
     */
    public void setFlags_LessThan(String flags) {
        regFlags(CK_LT, fRES(flags));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param flags The value of flags as greaterEqual.
     */
    public void setFlags_GreaterEqual(String flags) {
        regFlags(CK_GE, fRES(flags));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param flags The value of flags as lessEqual.
     */
    public void setFlags_LessEqual(String flags) {
        regFlags(CK_LE, fRES(flags));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param flags The value of flags as prefixSearch.
     */
    public void setFlags_PrefixSearch(String flags) {
        regFlags(CK_PS, fRES(flags));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param flags The value of flags as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFlags_LikeSearch(String flags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(flags), getCValueFlags(), "Flags", "Flags", "flags", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param flagsList The collection of flags as inScope.
     */
    public void setFlags_InScope(Collection<String> flagsList) {
        regFlags(CK_INS, cTL(flagsList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param flags The collection of flags as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setFlags_InScope(String flags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(flags), getCValueFlags(), "Flags", "Flags", "flags", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setFlags_IsNull() { regFlags(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setFlags_IsNotNull() { regFlags(CK_ISNN, DUMMY_OBJECT); }

    protected void regFlags(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFlags(), "Flags", "Flags", "flags");
    }
    protected void registerInlineFlags(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFlags(), "Flags", "Flags", "flags");
    }
    abstract protected ConditionValue getCValueFlags();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param externalfile The value of externalfile as equal.
     */
    public void setExternalfile_Equal(String externalfile) {
        regExternalfile(CK_EQ, fRES(externalfile));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param externalfile The value of externalfile as notEqual.
     */
    public void setExternalfile_NotEqual(String externalfile) {
        regExternalfile(CK_NE, fRES(externalfile));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param externalfile The value of externalfile as greaterThan.
     */
    public void setExternalfile_GreaterThan(String externalfile) {
        regExternalfile(CK_GT, fRES(externalfile));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param externalfile The value of externalfile as lessThan.
     */
    public void setExternalfile_LessThan(String externalfile) {
        regExternalfile(CK_LT, fRES(externalfile));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param externalfile The value of externalfile as greaterEqual.
     */
    public void setExternalfile_GreaterEqual(String externalfile) {
        regExternalfile(CK_GE, fRES(externalfile));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param externalfile The value of externalfile as lessEqual.
     */
    public void setExternalfile_LessEqual(String externalfile) {
        regExternalfile(CK_LE, fRES(externalfile));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param externalfile The value of externalfile as prefixSearch.
     */
    public void setExternalfile_PrefixSearch(String externalfile) {
        regExternalfile(CK_PS, fRES(externalfile));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param externalfile The value of externalfile as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExternalfile_LikeSearch(String externalfile, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(externalfile), getCValueExternalfile(), "ExternalFile", "Externalfile", "externalfile", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param externalfileList The collection of externalfile as inScope.
     */
    public void setExternalfile_InScope(Collection<String> externalfileList) {
        regExternalfile(CK_INS, cTL(externalfileList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param externalfile The collection of externalfile as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setExternalfile_InScope(String externalfile, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(externalfile), getCValueExternalfile(), "ExternalFile", "Externalfile", "externalfile", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setExternalfile_IsNull() { regExternalfile(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setExternalfile_IsNotNull() { regExternalfile(CK_ISNN, DUMMY_OBJECT); }

    protected void regExternalfile(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueExternalfile(), "ExternalFile", "Externalfile", "externalfile");
    }
    protected void registerInlineExternalfile(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueExternalfile(), "ExternalFile", "Externalfile", "externalfile");
    }
    abstract protected ConditionValue getCValueExternalfile();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param owner The value of owner as equal.
     */
    public void setOwner_Equal(String owner) {
        regOwner(CK_EQ, fRES(owner));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param owner The value of owner as notEqual.
     */
    public void setOwner_NotEqual(String owner) {
        regOwner(CK_NE, fRES(owner));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param owner The value of owner as greaterThan.
     */
    public void setOwner_GreaterThan(String owner) {
        regOwner(CK_GT, fRES(owner));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param owner The value of owner as lessThan.
     */
    public void setOwner_LessThan(String owner) {
        regOwner(CK_LT, fRES(owner));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param owner The value of owner as greaterEqual.
     */
    public void setOwner_GreaterEqual(String owner) {
        regOwner(CK_GE, fRES(owner));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param owner The value of owner as lessEqual.
     */
    public void setOwner_LessEqual(String owner) {
        regOwner(CK_LE, fRES(owner));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param owner The value of owner as prefixSearch.
     */
    public void setOwner_PrefixSearch(String owner) {
        regOwner(CK_PS, fRES(owner));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param owner The value of owner as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwner_LikeSearch(String owner, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(owner), getCValueOwner(), "Owner", "Owner", "owner", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param ownerList The collection of owner as inScope.
     */
    public void setOwner_InScope(Collection<String> ownerList) {
        regOwner(CK_INS, cTL(ownerList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param owner The collection of owner as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setOwner_InScope(String owner, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(owner), getCValueOwner(), "Owner", "Owner", "owner", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setOwner_IsNull() { regOwner(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setOwner_IsNotNull() { regOwner(CK_ISNN, DUMMY_OBJECT); }

    protected void regOwner(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueOwner(), "Owner", "Owner", "owner");
    }
    protected void registerInlineOwner(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueOwner(), "Owner", "Owner", "owner");
    }
    abstract protected ConditionValue getCValueOwner();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param versiondate The value of versiondate as equal.
     */
    public void setVersiondate_Equal(java.sql.Timestamp versiondate) {
        regVersiondate(CK_EQ, versiondate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param versiondate The value of versiondate as greaterThan.
     */
    public void setVersiondate_GreaterThan(java.sql.Timestamp versiondate) {
        regVersiondate(CK_GT, versiondate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param versiondate The value of versiondate as lessThan.
     */
    public void setVersiondate_LessThan(java.sql.Timestamp versiondate) {
        regVersiondate(CK_LT, versiondate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param versiondate The value of versiondate as greaterEqual.
     */
    public void setVersiondate_GreaterEqual(java.sql.Timestamp versiondate) {
        regVersiondate(CK_GE, versiondate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param versiondate The value of versiondate as lessEqual.
     */
    public void setVersiondate_LessEqual(java.sql.Timestamp versiondate) {
        regVersiondate(CK_LE, versiondate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of versiondate. (Nullable)
     * @param toDate The to-date of versiondate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setVersiondate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueVersiondate(), "VersionDate", "Versiondate", "versiondate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of versiondate. (Nullable)
     * @param toDate The to-date of versiondate. (Nullable)
     */
    public void setVersiondate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setVersiondate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setVersiondate_IsNull() { regVersiondate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setVersiondate_IsNotNull() { regVersiondate(CK_ISNN, DUMMY_OBJECT); }

    protected void regVersiondate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueVersiondate(), "VersionDate", "Versiondate", "versiondate");
    }
    protected void registerInlineVersiondate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueVersiondate(), "VersionDate", "Versiondate", "versiondate");
    }
    abstract protected ConditionValue getCValueVersiondate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param branch The value of branch as equal.
     */
    public void setBranch_Equal(String branch) {
        regBranch(CK_EQ, fRES(branch));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param branch The value of branch as notEqual.
     */
    public void setBranch_NotEqual(String branch) {
        regBranch(CK_NE, fRES(branch));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param branch The value of branch as greaterThan.
     */
    public void setBranch_GreaterThan(String branch) {
        regBranch(CK_GT, fRES(branch));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param branch The value of branch as lessThan.
     */
    public void setBranch_LessThan(String branch) {
        regBranch(CK_LT, fRES(branch));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param branch The value of branch as greaterEqual.
     */
    public void setBranch_GreaterEqual(String branch) {
        regBranch(CK_GE, fRES(branch));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param branch The value of branch as lessEqual.
     */
    public void setBranch_LessEqual(String branch) {
        regBranch(CK_LE, fRES(branch));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param branch The value of branch as prefixSearch.
     */
    public void setBranch_PrefixSearch(String branch) {
        regBranch(CK_PS, fRES(branch));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param branch The value of branch as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBranch_LikeSearch(String branch, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(branch), getCValueBranch(), "Branch", "Branch", "branch", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param branchList The collection of branch as inScope.
     */
    public void setBranch_InScope(Collection<String> branchList) {
        regBranch(CK_INS, cTL(branchList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param branch The collection of branch as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setBranch_InScope(String branch, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(branch), getCValueBranch(), "Branch", "Branch", "branch", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBranch_IsNull() { regBranch(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBranch_IsNotNull() { regBranch(CK_ISNN, DUMMY_OBJECT); }

    protected void regBranch(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBranch(), "Branch", "Branch", "branch");
    }
    protected void registerInlineBranch(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBranch(), "Branch", "Branch", "branch");
    }
    abstract protected ConditionValue getCValueBranch();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param elementxml The value of elementxml as equal.
     */
    public void setElementxml_Equal(String elementxml) {
        regElementxml(CK_EQ, fRES(elementxml));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementxml The value of elementxml as notEqual.
     */
    public void setElementxml_NotEqual(String elementxml) {
        regElementxml(CK_NE, fRES(elementxml));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementxml The value of elementxml as greaterThan.
     */
    public void setElementxml_GreaterThan(String elementxml) {
        regElementxml(CK_GT, fRES(elementxml));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementxml The value of elementxml as lessThan.
     */
    public void setElementxml_LessThan(String elementxml) {
        regElementxml(CK_LT, fRES(elementxml));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementxml The value of elementxml as greaterEqual.
     */
    public void setElementxml_GreaterEqual(String elementxml) {
        regElementxml(CK_GE, fRES(elementxml));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementxml The value of elementxml as lessEqual.
     */
    public void setElementxml_LessEqual(String elementxml) {
        regElementxml(CK_LE, fRES(elementxml));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param elementxml The value of elementxml as prefixSearch.
     */
    public void setElementxml_PrefixSearch(String elementxml) {
        regElementxml(CK_PS, fRES(elementxml));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param elementxml The value of elementxml as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setElementxml_LikeSearch(String elementxml, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(elementxml), getCValueElementxml(), "ElementXML", "Elementxml", "elementxml", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementxmlList The collection of elementxml as inScope.
     */
    public void setElementxml_InScope(Collection<String> elementxmlList) {
        regElementxml(CK_INS, cTL(elementxmlList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param elementxml The collection of elementxml as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setElementxml_InScope(String elementxml, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(elementxml), getCValueElementxml(), "ElementXML", "Elementxml", "elementxml", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setElementxml_IsNull() { regElementxml(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setElementxml_IsNotNull() { regElementxml(CK_ISNN, DUMMY_OBJECT); }

    protected void regElementxml(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueElementxml(), "ElementXML", "Elementxml", "elementxml");
    }
    protected void registerInlineElementxml(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueElementxml(), "ElementXML", "Elementxml", "elementxml");
    }
    abstract protected ConditionValue getCValueElementxml();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TVersionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TVersionCQ.class.getName(); }
}
