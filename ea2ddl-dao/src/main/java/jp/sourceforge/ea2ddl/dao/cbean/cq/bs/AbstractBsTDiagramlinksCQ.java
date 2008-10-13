package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_diagramlinks.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTDiagramlinksCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTDiagramlinksCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param diagramid The value of diagramid as equal.
     */
    public void setDiagramid_Equal(java.lang.Integer diagramid) {
        regDiagramid(CK_EQ, diagramid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param diagramid The value of diagramid as notEqual.
     */
    public void setDiagramid_NotEqual(java.lang.Integer diagramid) {
        regDiagramid(CK_NE, diagramid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param diagramid The value of diagramid as greaterThan.
     */
    public void setDiagramid_GreaterThan(java.lang.Integer diagramid) {
        regDiagramid(CK_GT, diagramid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param diagramid The value of diagramid as lessThan.
     */
    public void setDiagramid_LessThan(java.lang.Integer diagramid) {
        regDiagramid(CK_LT, diagramid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param diagramid The value of diagramid as greaterEqual.
     */
    public void setDiagramid_GreaterEqual(java.lang.Integer diagramid) {
        regDiagramid(CK_GE, diagramid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setDiagramid_IsNull() { regDiagramid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDiagramid_IsNotNull() { regDiagramid(CK_ISNN, DUMMY_OBJECT); }

    protected void regDiagramid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDiagramid(), "DiagramID", "Diagramid", "diagramid");
    }
    protected void registerInlineDiagramid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDiagramid(), "DiagramID", "Diagramid", "diagramid");
    }
    abstract protected ConditionValue getCValueDiagramid();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param connectorid The value of connectorid as equal.
     */
    public void setConnectorid_Equal(java.lang.Integer connectorid) {
        regConnectorid(CK_EQ, connectorid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param connectorid The value of connectorid as notEqual.
     */
    public void setConnectorid_NotEqual(java.lang.Integer connectorid) {
        regConnectorid(CK_NE, connectorid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param connectorid The value of connectorid as greaterThan.
     */
    public void setConnectorid_GreaterThan(java.lang.Integer connectorid) {
        regConnectorid(CK_GT, connectorid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param connectorid The value of connectorid as lessThan.
     */
    public void setConnectorid_LessThan(java.lang.Integer connectorid) {
        regConnectorid(CK_LT, connectorid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param connectorid The value of connectorid as greaterEqual.
     */
    public void setConnectorid_GreaterEqual(java.lang.Integer connectorid) {
        regConnectorid(CK_GE, connectorid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setConnectorid_IsNull() { regConnectorid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setConnectorid_IsNotNull() { regConnectorid(CK_ISNN, DUMMY_OBJECT); }

    protected void regConnectorid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueConnectorid(), "ConnectorID", "Connectorid", "connectorid");
    }
    protected void registerInlineConnectorid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueConnectorid(), "ConnectorID", "Connectorid", "connectorid");
    }
    abstract protected ConditionValue getCValueConnectorid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param geometry The value of geometry as equal.
     */
    public void setGeometry_Equal(String geometry) {
        regGeometry(CK_EQ, fRES(geometry));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param geometry The value of geometry as notEqual.
     */
    public void setGeometry_NotEqual(String geometry) {
        regGeometry(CK_NE, fRES(geometry));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param geometry The value of geometry as greaterThan.
     */
    public void setGeometry_GreaterThan(String geometry) {
        regGeometry(CK_GT, fRES(geometry));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param geometry The value of geometry as lessThan.
     */
    public void setGeometry_LessThan(String geometry) {
        regGeometry(CK_LT, fRES(geometry));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param geometry The value of geometry as greaterEqual.
     */
    public void setGeometry_GreaterEqual(String geometry) {
        regGeometry(CK_GE, fRES(geometry));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param geometry The value of geometry as lessEqual.
     */
    public void setGeometry_LessEqual(String geometry) {
        regGeometry(CK_LE, fRES(geometry));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param geometry The value of geometry as prefixSearch.
     */
    public void setGeometry_PrefixSearch(String geometry) {
        regGeometry(CK_PS, fRES(geometry));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param geometry The value of geometry as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGeometry_LikeSearch(String geometry, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(geometry), getCValueGeometry(), "Geometry", "Geometry", "geometry", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param geometryList The collection of geometry as inScope.
     */
    public void setGeometry_InScope(Collection<String> geometryList) {
        regGeometry(CK_INS, cTL(geometryList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param geometry The collection of geometry as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setGeometry_InScope(String geometry, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(geometry), getCValueGeometry(), "Geometry", "Geometry", "geometry", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setGeometry_IsNull() { regGeometry(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setGeometry_IsNotNull() { regGeometry(CK_ISNN, DUMMY_OBJECT); }

    protected void regGeometry(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueGeometry(), "Geometry", "Geometry", "geometry");
    }
    protected void registerInlineGeometry(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueGeometry(), "Geometry", "Geometry", "geometry");
    }
    abstract protected ConditionValue getCValueGeometry();

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
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param hidden The value of hidden as equal.
     */
    public void setHidden_Equal(Boolean hidden) {
        regHidden(CK_EQ, hidden);
    }

    protected void regHidden(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueHidden(), "Hidden", "Hidden", "hidden");
    }
    protected void registerInlineHidden(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueHidden(), "Hidden", "Hidden", "hidden");
    }
    abstract protected ConditionValue getCValueHidden();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param path The value of path as equal.
     */
    public void setPath_Equal(String path) {
        regPath(CK_EQ, fRES(path));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param path The value of path as notEqual.
     */
    public void setPath_NotEqual(String path) {
        regPath(CK_NE, fRES(path));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param path The value of path as greaterThan.
     */
    public void setPath_GreaterThan(String path) {
        regPath(CK_GT, fRES(path));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param path The value of path as lessThan.
     */
    public void setPath_LessThan(String path) {
        regPath(CK_LT, fRES(path));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param path The value of path as greaterEqual.
     */
    public void setPath_GreaterEqual(String path) {
        regPath(CK_GE, fRES(path));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param path The value of path as lessEqual.
     */
    public void setPath_LessEqual(String path) {
        regPath(CK_LE, fRES(path));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param path The value of path as prefixSearch.
     */
    public void setPath_PrefixSearch(String path) {
        regPath(CK_PS, fRES(path));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param path The value of path as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPath_LikeSearch(String path, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(path), getCValuePath(), "Path", "Path", "path", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pathList The collection of path as inScope.
     */
    public void setPath_InScope(Collection<String> pathList) {
        regPath(CK_INS, cTL(pathList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param path The collection of path as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPath_InScope(String path, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(path), getCValuePath(), "Path", "Path", "path", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPath_IsNull() { regPath(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPath_IsNotNull() { regPath(CK_ISNN, DUMMY_OBJECT); }

    protected void regPath(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePath(), "Path", "Path", "path");
    }
    protected void registerInlinePath(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePath(), "Path", "Path", "path");
    }
    abstract protected ConditionValue getCValuePath();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : COUNTER : NotNull}
     * @param instanceId The value of instanceId as equal.
     */
    public void setInstanceId_Equal(java.lang.Integer instanceId) {
        regInstanceId(CK_EQ, instanceId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param instanceId The value of instanceId as notEqual.
     */
    public void setInstanceId_NotEqual(java.lang.Integer instanceId) {
        regInstanceId(CK_NE, instanceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param instanceId The value of instanceId as greaterThan.
     */
    public void setInstanceId_GreaterThan(java.lang.Integer instanceId) {
        regInstanceId(CK_GT, instanceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param instanceId The value of instanceId as lessThan.
     */
    public void setInstanceId_LessThan(java.lang.Integer instanceId) {
        regInstanceId(CK_LT, instanceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param instanceId The value of instanceId as greaterEqual.
     */
    public void setInstanceId_GreaterEqual(java.lang.Integer instanceId) {
        regInstanceId(CK_GE, instanceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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

    protected void regInstanceId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueInstanceId(), "Instance_ID", "InstanceId", "instanceId");
    }
    protected void registerInlineInstanceId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueInstanceId(), "Instance_ID", "InstanceId", "instanceId");
    }
    abstract protected ConditionValue getCValueInstanceId();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TDiagramlinksCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TDiagramlinksCQ.class.getName(); }
}
