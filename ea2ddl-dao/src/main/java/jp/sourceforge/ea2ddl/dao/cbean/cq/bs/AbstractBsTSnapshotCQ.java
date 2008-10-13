package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_snapshot.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTSnapshotCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSnapshotCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_snapshot";
    }
    
    public String getTableSqlName() {
        return "t_snapshot";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(40)}
     * @param snapshotid The value of snapshotid as equal.
     */
    public void setSnapshotid_Equal(String snapshotid) {
        regSnapshotid(CK_EQ, fRES(snapshotid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param snapshotid The value of snapshotid as notEqual.
     */
    public void setSnapshotid_NotEqual(String snapshotid) {
        regSnapshotid(CK_NE, fRES(snapshotid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param snapshotid The value of snapshotid as greaterThan.
     */
    public void setSnapshotid_GreaterThan(String snapshotid) {
        regSnapshotid(CK_GT, fRES(snapshotid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param snapshotid The value of snapshotid as lessThan.
     */
    public void setSnapshotid_LessThan(String snapshotid) {
        regSnapshotid(CK_LT, fRES(snapshotid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param snapshotid The value of snapshotid as greaterEqual.
     */
    public void setSnapshotid_GreaterEqual(String snapshotid) {
        regSnapshotid(CK_GE, fRES(snapshotid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param snapshotid The value of snapshotid as lessEqual.
     */
    public void setSnapshotid_LessEqual(String snapshotid) {
        regSnapshotid(CK_LE, fRES(snapshotid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param snapshotid The value of snapshotid as prefixSearch.
     */
    public void setSnapshotid_PrefixSearch(String snapshotid) {
        regSnapshotid(CK_PS, fRES(snapshotid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param snapshotid The value of snapshotid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSnapshotid_LikeSearch(String snapshotid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(snapshotid), getCValueSnapshotid(), "SnapshotID", "Snapshotid", "snapshotid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param snapshotidList The collection of snapshotid as inScope.
     */
    public void setSnapshotid_InScope(Collection<String> snapshotidList) {
        regSnapshotid(CK_INS, cTL(snapshotidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param snapshotid The collection of snapshotid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setSnapshotid_InScope(String snapshotid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(snapshotid), getCValueSnapshotid(), "SnapshotID", "Snapshotid", "snapshotid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setSnapshotid_IsNull() { regSnapshotid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setSnapshotid_IsNotNull() { regSnapshotid(CK_ISNN, DUMMY_OBJECT); }

    protected void regSnapshotid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueSnapshotid(), "SnapshotID", "Snapshotid", "snapshotid");
    }
    protected void registerInlineSnapshotid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueSnapshotid(), "SnapshotID", "Snapshotid", "snapshotid");
    }
    abstract protected ConditionValue getCValueSnapshotid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(40)}
     * @param seriesid The value of seriesid as equal.
     */
    public void setSeriesid_Equal(String seriesid) {
        regSeriesid(CK_EQ, fRES(seriesid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param seriesid The value of seriesid as notEqual.
     */
    public void setSeriesid_NotEqual(String seriesid) {
        regSeriesid(CK_NE, fRES(seriesid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param seriesid The value of seriesid as greaterThan.
     */
    public void setSeriesid_GreaterThan(String seriesid) {
        regSeriesid(CK_GT, fRES(seriesid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param seriesid The value of seriesid as lessThan.
     */
    public void setSeriesid_LessThan(String seriesid) {
        regSeriesid(CK_LT, fRES(seriesid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param seriesid The value of seriesid as greaterEqual.
     */
    public void setSeriesid_GreaterEqual(String seriesid) {
        regSeriesid(CK_GE, fRES(seriesid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param seriesid The value of seriesid as lessEqual.
     */
    public void setSeriesid_LessEqual(String seriesid) {
        regSeriesid(CK_LE, fRES(seriesid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param seriesid The value of seriesid as prefixSearch.
     */
    public void setSeriesid_PrefixSearch(String seriesid) {
        regSeriesid(CK_PS, fRES(seriesid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param seriesid The value of seriesid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSeriesid_LikeSearch(String seriesid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(seriesid), getCValueSeriesid(), "SeriesID", "Seriesid", "seriesid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param seriesidList The collection of seriesid as inScope.
     */
    public void setSeriesid_InScope(Collection<String> seriesidList) {
        regSeriesid(CK_INS, cTL(seriesidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param seriesid The collection of seriesid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setSeriesid_InScope(String seriesid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(seriesid), getCValueSeriesid(), "SeriesID", "Seriesid", "seriesid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setSeriesid_IsNull() { regSeriesid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setSeriesid_IsNotNull() { regSeriesid(CK_ISNN, DUMMY_OBJECT); }

    protected void regSeriesid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueSeriesid(), "SeriesID", "Seriesid", "seriesid");
    }
    protected void registerInlineSeriesid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueSeriesid(), "SeriesID", "Seriesid", "seriesid");
    }
    abstract protected ConditionValue getCValueSeriesid();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param position The value of position as equal.
     */
    public void setPosition_Equal(java.lang.Integer position) {
        regPosition(CK_EQ, position);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param position The value of position as notEqual.
     */
    public void setPosition_NotEqual(java.lang.Integer position) {
        regPosition(CK_NE, position);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param position The value of position as greaterThan.
     */
    public void setPosition_GreaterThan(java.lang.Integer position) {
        regPosition(CK_GT, position);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param position The value of position as lessThan.
     */
    public void setPosition_LessThan(java.lang.Integer position) {
        regPosition(CK_LT, position);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param position The value of position as greaterEqual.
     */
    public void setPosition_GreaterEqual(java.lang.Integer position) {
        regPosition(CK_GE, position);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param position The value of position as lessEqual.
     */
    public void setPosition_LessEqual(java.lang.Integer position) {
        regPosition(CK_LE, position);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param positionList The collection of position as inScope.
     */
    public void setPosition_InScope(Collection<java.lang.Integer> positionList) {
        regPosition(CK_INS, cTL(positionList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPosition_IsNull() { regPosition(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPosition_IsNotNull() { regPosition(CK_ISNN, DUMMY_OBJECT); }

    protected void regPosition(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePosition(), "Position", "Position", "position");
    }
    protected void registerInlinePosition(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePosition(), "Position", "Position", "position");
    }
    abstract protected ConditionValue getCValuePosition();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param snapshotname The value of snapshotname as equal.
     */
    public void setSnapshotname_Equal(String snapshotname) {
        regSnapshotname(CK_EQ, fRES(snapshotname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param snapshotname The value of snapshotname as notEqual.
     */
    public void setSnapshotname_NotEqual(String snapshotname) {
        regSnapshotname(CK_NE, fRES(snapshotname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param snapshotname The value of snapshotname as greaterThan.
     */
    public void setSnapshotname_GreaterThan(String snapshotname) {
        regSnapshotname(CK_GT, fRES(snapshotname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param snapshotname The value of snapshotname as lessThan.
     */
    public void setSnapshotname_LessThan(String snapshotname) {
        regSnapshotname(CK_LT, fRES(snapshotname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param snapshotname The value of snapshotname as greaterEqual.
     */
    public void setSnapshotname_GreaterEqual(String snapshotname) {
        regSnapshotname(CK_GE, fRES(snapshotname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param snapshotname The value of snapshotname as lessEqual.
     */
    public void setSnapshotname_LessEqual(String snapshotname) {
        regSnapshotname(CK_LE, fRES(snapshotname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param snapshotname The value of snapshotname as prefixSearch.
     */
    public void setSnapshotname_PrefixSearch(String snapshotname) {
        regSnapshotname(CK_PS, fRES(snapshotname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param snapshotname The value of snapshotname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSnapshotname_LikeSearch(String snapshotname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(snapshotname), getCValueSnapshotname(), "SnapshotName", "Snapshotname", "snapshotname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param snapshotnameList The collection of snapshotname as inScope.
     */
    public void setSnapshotname_InScope(Collection<String> snapshotnameList) {
        regSnapshotname(CK_INS, cTL(snapshotnameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param snapshotname The collection of snapshotname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setSnapshotname_InScope(String snapshotname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(snapshotname), getCValueSnapshotname(), "SnapshotName", "Snapshotname", "snapshotname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setSnapshotname_IsNull() { regSnapshotname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setSnapshotname_IsNotNull() { regSnapshotname(CK_ISNN, DUMMY_OBJECT); }

    protected void regSnapshotname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueSnapshotname(), "SnapshotName", "Snapshotname", "snapshotname");
    }
    protected void registerInlineSnapshotname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueSnapshotname(), "SnapshotName", "Snapshotname", "snapshotname");
    }
    abstract protected ConditionValue getCValueSnapshotname();

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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param style The value of style as equal.
     */
    public void setStyle_Equal(String style) {
        regStyle(CK_EQ, fRES(style));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as notEqual.
     */
    public void setStyle_NotEqual(String style) {
        regStyle(CK_NE, fRES(style));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as greaterThan.
     */
    public void setStyle_GreaterThan(String style) {
        regStyle(CK_GT, fRES(style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as lessThan.
     */
    public void setStyle_LessThan(String style) {
        regStyle(CK_LT, fRES(style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as greaterEqual.
     */
    public void setStyle_GreaterEqual(String style) {
        regStyle(CK_GE, fRES(style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as lessEqual.
     */
    public void setStyle_LessEqual(String style) {
        regStyle(CK_LE, fRES(style));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as prefixSearch.
     */
    public void setStyle_PrefixSearch(String style) {
        regStyle(CK_PS, fRES(style));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param style The value of style as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStyle_LikeSearch(String style, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(style), getCValueStyle(), "Style", "Style", "style", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleList The collection of style as inScope.
     */
    public void setStyle_InScope(Collection<String> styleList) {
        regStyle(CK_INS, cTL(styleList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param style The collection of style as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStyle_InScope(String style, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(style), getCValueStyle(), "Style", "Style", "style", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStyle_IsNull() { regStyle(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStyle_IsNotNull() { regStyle(CK_ISNN, DUMMY_OBJECT); }

    protected void regStyle(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStyle(), "Style", "Style", "style");
    }
    protected void registerInlineStyle(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStyle(), "Style", "Style", "style");
    }
    abstract protected ConditionValue getCValueStyle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(40)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param strcontent The value of strcontent as equal.
     */
    public void setStrcontent_Equal(String strcontent) {
        regStrcontent(CK_EQ, fRES(strcontent));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param strcontent The value of strcontent as notEqual.
     */
    public void setStrcontent_NotEqual(String strcontent) {
        regStrcontent(CK_NE, fRES(strcontent));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param strcontent The value of strcontent as greaterThan.
     */
    public void setStrcontent_GreaterThan(String strcontent) {
        regStrcontent(CK_GT, fRES(strcontent));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param strcontent The value of strcontent as lessThan.
     */
    public void setStrcontent_LessThan(String strcontent) {
        regStrcontent(CK_LT, fRES(strcontent));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param strcontent The value of strcontent as greaterEqual.
     */
    public void setStrcontent_GreaterEqual(String strcontent) {
        regStrcontent(CK_GE, fRES(strcontent));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param strcontent The value of strcontent as lessEqual.
     */
    public void setStrcontent_LessEqual(String strcontent) {
        regStrcontent(CK_LE, fRES(strcontent));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param strcontent The value of strcontent as prefixSearch.
     */
    public void setStrcontent_PrefixSearch(String strcontent) {
        regStrcontent(CK_PS, fRES(strcontent));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param strcontent The value of strcontent as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStrcontent_LikeSearch(String strcontent, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(strcontent), getCValueStrcontent(), "StrContent", "Strcontent", "strcontent", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param strcontentList The collection of strcontent as inScope.
     */
    public void setStrcontent_InScope(Collection<String> strcontentList) {
        regStrcontent(CK_INS, cTL(strcontentList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param strcontent The collection of strcontent as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStrcontent_InScope(String strcontent, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(strcontent), getCValueStrcontent(), "StrContent", "Strcontent", "strcontent", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStrcontent_IsNull() { regStrcontent(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStrcontent_IsNotNull() { regStrcontent(CK_ISNN, DUMMY_OBJECT); }

    protected void regStrcontent(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStrcontent(), "StrContent", "Strcontent", "strcontent");
    }
    protected void registerInlineStrcontent(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStrcontent(), "StrContent", "Strcontent", "strcontent");
    }
    abstract protected ConditionValue getCValueStrcontent();

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBincontent1_IsNull() { regBincontent1(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBincontent1_IsNotNull() { regBincontent1(CK_ISNN, DUMMY_OBJECT); }

    protected void regBincontent1(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBincontent1(), "BinContent1", "Bincontent1", "bincontent1");
    }
    protected void registerInlineBincontent1(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBincontent1(), "BinContent1", "Bincontent1", "bincontent1");
    }
    abstract protected ConditionValue getCValueBincontent1();

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBincontent2_IsNull() { regBincontent2(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBincontent2_IsNotNull() { regBincontent2(CK_ISNN, DUMMY_OBJECT); }

    protected void regBincontent2(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBincontent2(), "BinContent2", "Bincontent2", "bincontent2");
    }
    protected void registerInlineBincontent2(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBincontent2(), "BinContent2", "Bincontent2", "bincontent2");
    }
    abstract protected ConditionValue getCValueBincontent2();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TSnapshotCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TSnapshotCQ.class.getName(); }
}
