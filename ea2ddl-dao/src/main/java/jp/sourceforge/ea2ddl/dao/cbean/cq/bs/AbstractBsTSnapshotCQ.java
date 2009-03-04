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
 * The abstract condition-query of t_snapshot.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTSnapshotCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTSnapshotCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_snapshot";
    }
    
    public String getTableSqlName() {
        return "t_snapshot";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(40)}
     * @param snapshotid The value of snapshotid as equal.
     */
    public void setSnapshotid_Equal(String snapshotid) {
        regSnapshotid(CK_EQ, fRES(snapshotid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param snapshotid The value of snapshotid as notEqual.
     */
    public void setSnapshotid_NotEqual(String snapshotid) {
        regSnapshotid(CK_NE, fRES(snapshotid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param snapshotid The value of snapshotid as greaterThan.
     */
    public void setSnapshotid_GreaterThan(String snapshotid) {
        regSnapshotid(CK_GT, fRES(snapshotid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param snapshotid The value of snapshotid as lessThan.
     */
    public void setSnapshotid_LessThan(String snapshotid) {
        regSnapshotid(CK_LT, fRES(snapshotid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param snapshotid The value of snapshotid as greaterEqual.
     */
    public void setSnapshotid_GreaterEqual(String snapshotid) {
        regSnapshotid(CK_GE, fRES(snapshotid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param snapshotid The value of snapshotid as lessEqual.
     */
    public void setSnapshotid_LessEqual(String snapshotid) {
        regSnapshotid(CK_LE, fRES(snapshotid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param snapshotid The value of snapshotid as prefixSearch.
     */
    public void setSnapshotid_PrefixSearch(String snapshotid) {
        regSnapshotid(CK_PS, fRES(snapshotid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param snapshotidList The collection of snapshotid as inScope.
     */
    public void setSnapshotid_InScope(Collection<String> snapshotidList) {
        regSnapshotid(CK_INS, cTL(snapshotidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param snapshotid The value of snapshotid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSnapshotid_LikeSearch(String snapshotid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(snapshotid), getCValueSnapshotid(), "SnapshotID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param snapshotid The value of snapshotid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSnapshotid_NotLikeSearch(String snapshotid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(snapshotid), getCValueSnapshotid(), "SnapshotID", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSnapshotid_IsNull() { regSnapshotid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSnapshotid_IsNotNull() { regSnapshotid(CK_ISNN, DOBJ); }

    protected void regSnapshotid(ConditionKey k, Object v) { regQ(k, v, getCValueSnapshotid(), "SnapshotID"); }
    abstract protected ConditionValue getCValueSnapshotid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(40)}
     * @param seriesid The value of seriesid as equal.
     */
    public void setSeriesid_Equal(String seriesid) {
        regSeriesid(CK_EQ, fRES(seriesid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param seriesid The value of seriesid as notEqual.
     */
    public void setSeriesid_NotEqual(String seriesid) {
        regSeriesid(CK_NE, fRES(seriesid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param seriesid The value of seriesid as greaterThan.
     */
    public void setSeriesid_GreaterThan(String seriesid) {
        regSeriesid(CK_GT, fRES(seriesid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param seriesid The value of seriesid as lessThan.
     */
    public void setSeriesid_LessThan(String seriesid) {
        regSeriesid(CK_LT, fRES(seriesid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param seriesid The value of seriesid as greaterEqual.
     */
    public void setSeriesid_GreaterEqual(String seriesid) {
        regSeriesid(CK_GE, fRES(seriesid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param seriesid The value of seriesid as lessEqual.
     */
    public void setSeriesid_LessEqual(String seriesid) {
        regSeriesid(CK_LE, fRES(seriesid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param seriesid The value of seriesid as prefixSearch.
     */
    public void setSeriesid_PrefixSearch(String seriesid) {
        regSeriesid(CK_PS, fRES(seriesid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param seriesidList The collection of seriesid as inScope.
     */
    public void setSeriesid_InScope(Collection<String> seriesidList) {
        regSeriesid(CK_INS, cTL(seriesidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param seriesid The value of seriesid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSeriesid_LikeSearch(String seriesid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(seriesid), getCValueSeriesid(), "SeriesID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param seriesid The value of seriesid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSeriesid_NotLikeSearch(String seriesid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(seriesid), getCValueSeriesid(), "SeriesID", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSeriesid_IsNull() { regSeriesid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSeriesid_IsNotNull() { regSeriesid(CK_ISNN, DOBJ); }

    protected void regSeriesid(ConditionKey k, Object v) { regQ(k, v, getCValueSeriesid(), "SeriesID"); }
    abstract protected ConditionValue getCValueSeriesid();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param position The value of position as equal.
     */
    public void setPosition_Equal(java.lang.Integer position) {
        regPosition(CK_EQ, position);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param position The value of position as notEqual.
     */
    public void setPosition_NotEqual(java.lang.Integer position) {
        regPosition(CK_NE, position);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param position The value of position as greaterThan.
     */
    public void setPosition_GreaterThan(java.lang.Integer position) {
        regPosition(CK_GT, position);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param position The value of position as lessThan.
     */
    public void setPosition_LessThan(java.lang.Integer position) {
        regPosition(CK_LT, position);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param position The value of position as greaterEqual.
     */
    public void setPosition_GreaterEqual(java.lang.Integer position) {
        regPosition(CK_GE, position);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPosition_IsNull() { regPosition(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPosition_IsNotNull() { regPosition(CK_ISNN, DOBJ); }

    protected void regPosition(ConditionKey k, Object v) { regQ(k, v, getCValuePosition(), "Position"); }
    abstract protected ConditionValue getCValuePosition();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(100)}
     * @param snapshotname The value of snapshotname as equal.
     */
    public void setSnapshotname_Equal(String snapshotname) {
        regSnapshotname(CK_EQ, fRES(snapshotname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param snapshotname The value of snapshotname as notEqual.
     */
    public void setSnapshotname_NotEqual(String snapshotname) {
        regSnapshotname(CK_NE, fRES(snapshotname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param snapshotname The value of snapshotname as greaterThan.
     */
    public void setSnapshotname_GreaterThan(String snapshotname) {
        regSnapshotname(CK_GT, fRES(snapshotname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param snapshotname The value of snapshotname as lessThan.
     */
    public void setSnapshotname_LessThan(String snapshotname) {
        regSnapshotname(CK_LT, fRES(snapshotname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param snapshotname The value of snapshotname as greaterEqual.
     */
    public void setSnapshotname_GreaterEqual(String snapshotname) {
        regSnapshotname(CK_GE, fRES(snapshotname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param snapshotname The value of snapshotname as lessEqual.
     */
    public void setSnapshotname_LessEqual(String snapshotname) {
        regSnapshotname(CK_LE, fRES(snapshotname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param snapshotname The value of snapshotname as prefixSearch.
     */
    public void setSnapshotname_PrefixSearch(String snapshotname) {
        regSnapshotname(CK_PS, fRES(snapshotname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param snapshotnameList The collection of snapshotname as inScope.
     */
    public void setSnapshotname_InScope(Collection<String> snapshotnameList) {
        regSnapshotname(CK_INS, cTL(snapshotnameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param snapshotname The value of snapshotname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSnapshotname_LikeSearch(String snapshotname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(snapshotname), getCValueSnapshotname(), "SnapshotName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param snapshotname The value of snapshotname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSnapshotname_NotLikeSearch(String snapshotname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(snapshotname), getCValueSnapshotname(), "SnapshotName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSnapshotname_IsNull() { regSnapshotname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSnapshotname_IsNotNull() { regSnapshotname(CK_ISNN, DOBJ); }

    protected void regSnapshotname(ConditionKey k, Object v) { regQ(k, v, getCValueSnapshotname(), "SnapshotName"); }
    abstract protected ConditionValue getCValueSnapshotname();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param style The value of style as equal.
     */
    public void setStyle_Equal(String style) {
        regStyle(CK_EQ, fRES(style));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as notEqual.
     */
    public void setStyle_NotEqual(String style) {
        regStyle(CK_NE, fRES(style));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as greaterThan.
     */
    public void setStyle_GreaterThan(String style) {
        regStyle(CK_GT, fRES(style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as lessThan.
     */
    public void setStyle_LessThan(String style) {
        regStyle(CK_LT, fRES(style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as greaterEqual.
     */
    public void setStyle_GreaterEqual(String style) {
        regStyle(CK_GE, fRES(style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as lessEqual.
     */
    public void setStyle_LessEqual(String style) {
        regStyle(CK_LE, fRES(style));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as prefixSearch.
     */
    public void setStyle_PrefixSearch(String style) {
        regStyle(CK_PS, fRES(style));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleList The collection of style as inScope.
     */
    public void setStyle_InScope(Collection<String> styleList) {
        regStyle(CK_INS, cTL(styleList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param style The value of style as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStyle_LikeSearch(String style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(style), getCValueStyle(), "Style", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param style The value of style as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStyle_NotLikeSearch(String style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(style), getCValueStyle(), "Style", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStyle_IsNull() { regStyle(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStyle_IsNotNull() { regStyle(CK_ISNN, DOBJ); }

    protected void regStyle(ConditionKey k, Object v) { regQ(k, v, getCValueStyle(), "Style"); }
    abstract protected ConditionValue getCValueStyle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(40)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param strcontent The value of strcontent as equal.
     */
    public void setStrcontent_Equal(String strcontent) {
        regStrcontent(CK_EQ, fRES(strcontent));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param strcontent The value of strcontent as notEqual.
     */
    public void setStrcontent_NotEqual(String strcontent) {
        regStrcontent(CK_NE, fRES(strcontent));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param strcontent The value of strcontent as greaterThan.
     */
    public void setStrcontent_GreaterThan(String strcontent) {
        regStrcontent(CK_GT, fRES(strcontent));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param strcontent The value of strcontent as lessThan.
     */
    public void setStrcontent_LessThan(String strcontent) {
        regStrcontent(CK_LT, fRES(strcontent));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param strcontent The value of strcontent as greaterEqual.
     */
    public void setStrcontent_GreaterEqual(String strcontent) {
        regStrcontent(CK_GE, fRES(strcontent));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param strcontent The value of strcontent as lessEqual.
     */
    public void setStrcontent_LessEqual(String strcontent) {
        regStrcontent(CK_LE, fRES(strcontent));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param strcontent The value of strcontent as prefixSearch.
     */
    public void setStrcontent_PrefixSearch(String strcontent) {
        regStrcontent(CK_PS, fRES(strcontent));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param strcontentList The collection of strcontent as inScope.
     */
    public void setStrcontent_InScope(Collection<String> strcontentList) {
        regStrcontent(CK_INS, cTL(strcontentList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param strcontent The value of strcontent as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStrcontent_LikeSearch(String strcontent, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(strcontent), getCValueStrcontent(), "StrContent", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param strcontent The value of strcontent as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStrcontent_NotLikeSearch(String strcontent, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(strcontent), getCValueStrcontent(), "StrContent", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStrcontent_IsNull() { regStrcontent(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStrcontent_IsNotNull() { regStrcontent(CK_ISNN, DOBJ); }

    protected void regStrcontent(ConditionKey k, Object v) { regQ(k, v, getCValueStrcontent(), "StrContent"); }
    abstract protected ConditionValue getCValueStrcontent();

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBincontent1_IsNull() { regBincontent1(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBincontent1_IsNotNull() { regBincontent1(CK_ISNN, DOBJ); }

    protected void regBincontent1(ConditionKey k, Object v) { regQ(k, v, getCValueBincontent1(), "BinContent1"); }
    abstract protected ConditionValue getCValueBincontent1();

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBincontent2_IsNull() { regBincontent2(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBincontent2_IsNotNull() { regBincontent2(CK_ISNN, DOBJ); }

    protected void regBincontent2(ConditionKey k, Object v) { regQ(k, v, getCValueBincontent2(), "BinContent2"); }
    abstract protected ConditionValue getCValueBincontent2();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TSnapshotCB.class.getName(); }
    String xCQ() { return TSnapshotCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
