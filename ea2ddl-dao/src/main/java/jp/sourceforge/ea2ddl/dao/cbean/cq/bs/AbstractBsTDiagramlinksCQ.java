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
 * The abstract condition-query of t_diagramlinks.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTDiagramlinksCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTDiagramlinksCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_diagramlinks";
    }
    
    public String getTableSqlName() {
        return "t_diagramlinks";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param diagramid The value of diagramid as equal.
     */
    public void setDiagramid_Equal(java.lang.Integer diagramid) {
        regDiagramid(CK_EQ, diagramid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param diagramid The value of diagramid as notEqual.
     */
    public void setDiagramid_NotEqual(java.lang.Integer diagramid) {
        regDiagramid(CK_NE, diagramid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param diagramid The value of diagramid as greaterThan.
     */
    public void setDiagramid_GreaterThan(java.lang.Integer diagramid) {
        regDiagramid(CK_GT, diagramid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param diagramid The value of diagramid as lessThan.
     */
    public void setDiagramid_LessThan(java.lang.Integer diagramid) {
        regDiagramid(CK_LT, diagramid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param diagramid The value of diagramid as greaterEqual.
     */
    public void setDiagramid_GreaterEqual(java.lang.Integer diagramid) {
        regDiagramid(CK_GE, diagramid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param diagramid The value of diagramid as lessEqual.
     */
    public void setDiagramid_LessEqual(java.lang.Integer diagramid) {
        regDiagramid(CK_LE, diagramid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param diagramidList The collection of diagramid as inScope.
     */
    public void setDiagramid_InScope(Collection<java.lang.Integer> diagramidList) {
        regDiagramid(CK_INS, cTL(diagramidList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDiagramid_IsNull() { regDiagramid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDiagramid_IsNotNull() { regDiagramid(CK_ISNN, DOBJ); }

    protected void regDiagramid(ConditionKey k, Object v) { regQ(k, v, getCValueDiagramid(), "DiagramID"); }
    abstract protected ConditionValue getCValueDiagramid();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param connectorid The value of connectorid as equal.
     */
    public void setConnectorid_Equal(java.lang.Integer connectorid) {
        regConnectorid(CK_EQ, connectorid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param connectorid The value of connectorid as notEqual.
     */
    public void setConnectorid_NotEqual(java.lang.Integer connectorid) {
        regConnectorid(CK_NE, connectorid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param connectorid The value of connectorid as greaterThan.
     */
    public void setConnectorid_GreaterThan(java.lang.Integer connectorid) {
        regConnectorid(CK_GT, connectorid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param connectorid The value of connectorid as lessThan.
     */
    public void setConnectorid_LessThan(java.lang.Integer connectorid) {
        regConnectorid(CK_LT, connectorid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param connectorid The value of connectorid as greaterEqual.
     */
    public void setConnectorid_GreaterEqual(java.lang.Integer connectorid) {
        regConnectorid(CK_GE, connectorid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param connectorid The value of connectorid as lessEqual.
     */
    public void setConnectorid_LessEqual(java.lang.Integer connectorid) {
        regConnectorid(CK_LE, connectorid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param connectoridList The collection of connectorid as inScope.
     */
    public void setConnectorid_InScope(Collection<java.lang.Integer> connectoridList) {
        regConnectorid(CK_INS, cTL(connectoridList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setConnectorid_IsNull() { regConnectorid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setConnectorid_IsNotNull() { regConnectorid(CK_ISNN, DOBJ); }

    protected void regConnectorid(ConditionKey k, Object v) { regQ(k, v, getCValueConnectorid(), "ConnectorID"); }
    abstract protected ConditionValue getCValueConnectorid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param geometry The value of geometry as equal.
     */
    public void setGeometry_Equal(String geometry) {
        regGeometry(CK_EQ, fRES(geometry));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param geometry The value of geometry as notEqual.
     */
    public void setGeometry_NotEqual(String geometry) {
        regGeometry(CK_NE, fRES(geometry));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param geometry The value of geometry as greaterThan.
     */
    public void setGeometry_GreaterThan(String geometry) {
        regGeometry(CK_GT, fRES(geometry));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param geometry The value of geometry as lessThan.
     */
    public void setGeometry_LessThan(String geometry) {
        regGeometry(CK_LT, fRES(geometry));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param geometry The value of geometry as greaterEqual.
     */
    public void setGeometry_GreaterEqual(String geometry) {
        regGeometry(CK_GE, fRES(geometry));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param geometry The value of geometry as lessEqual.
     */
    public void setGeometry_LessEqual(String geometry) {
        regGeometry(CK_LE, fRES(geometry));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param geometry The value of geometry as prefixSearch.
     */
    public void setGeometry_PrefixSearch(String geometry) {
        regGeometry(CK_PS, fRES(geometry));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param geometryList The collection of geometry as inScope.
     */
    public void setGeometry_InScope(Collection<String> geometryList) {
        regGeometry(CK_INS, cTL(geometryList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param geometry The value of geometry as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGeometry_LikeSearch(String geometry, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(geometry), getCValueGeometry(), "Geometry", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param geometry The value of geometry as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGeometry_NotLikeSearch(String geometry, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(geometry), getCValueGeometry(), "Geometry", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setGeometry_IsNull() { regGeometry(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setGeometry_IsNotNull() { regGeometry(CK_ISNN, DOBJ); }

    protected void regGeometry(ConditionKey k, Object v) { regQ(k, v, getCValueGeometry(), "Geometry"); }
    abstract protected ConditionValue getCValueGeometry();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param hidden The value of hidden as equal.
     */
    public void setHidden_Equal(Boolean hidden) {
        regHidden(CK_EQ, hidden);
    }

    protected void regHidden(ConditionKey k, Object v) { regQ(k, v, getCValueHidden(), "Hidden"); }
    abstract protected ConditionValue getCValueHidden();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param path The value of path as equal.
     */
    public void setPath_Equal(String path) {
        regPath(CK_EQ, fRES(path));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param path The value of path as notEqual.
     */
    public void setPath_NotEqual(String path) {
        regPath(CK_NE, fRES(path));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param path The value of path as greaterThan.
     */
    public void setPath_GreaterThan(String path) {
        regPath(CK_GT, fRES(path));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param path The value of path as lessThan.
     */
    public void setPath_LessThan(String path) {
        regPath(CK_LT, fRES(path));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param path The value of path as greaterEqual.
     */
    public void setPath_GreaterEqual(String path) {
        regPath(CK_GE, fRES(path));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param path The value of path as lessEqual.
     */
    public void setPath_LessEqual(String path) {
        regPath(CK_LE, fRES(path));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param path The value of path as prefixSearch.
     */
    public void setPath_PrefixSearch(String path) {
        regPath(CK_PS, fRES(path));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pathList The collection of path as inScope.
     */
    public void setPath_InScope(Collection<String> pathList) {
        regPath(CK_INS, cTL(pathList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param path The value of path as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPath_LikeSearch(String path, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(path), getCValuePath(), "Path", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param path The value of path as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPath_NotLikeSearch(String path, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(path), getCValuePath(), "Path", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPath_IsNull() { regPath(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPath_IsNotNull() { regPath(CK_ISNN, DOBJ); }

    protected void regPath(ConditionKey k, Object v) { regQ(k, v, getCValuePath(), "Path"); }
    abstract protected ConditionValue getCValuePath();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : NotNull : COUNTER}
     * @param instanceId The value of instanceId as equal.
     */
    public void setInstanceId_Equal(java.lang.Integer instanceId) {
        regInstanceId(CK_EQ, instanceId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param instanceId The value of instanceId as notEqual.
     */
    public void setInstanceId_NotEqual(java.lang.Integer instanceId) {
        regInstanceId(CK_NE, instanceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param instanceId The value of instanceId as greaterThan.
     */
    public void setInstanceId_GreaterThan(java.lang.Integer instanceId) {
        regInstanceId(CK_GT, instanceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param instanceId The value of instanceId as lessThan.
     */
    public void setInstanceId_LessThan(java.lang.Integer instanceId) {
        regInstanceId(CK_LT, instanceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param instanceId The value of instanceId as greaterEqual.
     */
    public void setInstanceId_GreaterEqual(java.lang.Integer instanceId) {
        regInstanceId(CK_GE, instanceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param instanceId The value of instanceId as lessEqual.
     */
    public void setInstanceId_LessEqual(java.lang.Integer instanceId) {
        regInstanceId(CK_LE, instanceId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param instanceIdList The collection of instanceId as inScope.
     */
    public void setInstanceId_InScope(Collection<java.lang.Integer> instanceIdList) {
        regInstanceId(CK_INS, cTL(instanceIdList));
    }

    protected void regInstanceId(ConditionKey k, Object v) { regQ(k, v, getCValueInstanceId(), "Instance_ID"); }
    abstract protected ConditionValue getCValueInstanceId();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TDiagramlinksCB.class.getName(); }
    String xCQ() { return TDiagramlinksCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
