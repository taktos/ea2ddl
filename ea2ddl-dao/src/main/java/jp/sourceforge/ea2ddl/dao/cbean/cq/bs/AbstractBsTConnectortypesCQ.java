package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_connectortypes.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTConnectortypesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTConnectortypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_connectortypes";
    }
    
    public String getTableSqlName() {
        return "t_connectortypes";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(50)}
     * @param connectorType The value of connectorType as equal.
     */
    public void setConnectorType_Equal(String connectorType) {
        regConnectorType(CK_EQ, fRES(connectorType));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param connectorType The value of connectorType as notEqual.
     */
    public void setConnectorType_NotEqual(String connectorType) {
        regConnectorType(CK_NE, fRES(connectorType));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param connectorType The value of connectorType as greaterThan.
     */
    public void setConnectorType_GreaterThan(String connectorType) {
        regConnectorType(CK_GT, fRES(connectorType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param connectorType The value of connectorType as lessThan.
     */
    public void setConnectorType_LessThan(String connectorType) {
        regConnectorType(CK_LT, fRES(connectorType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param connectorType The value of connectorType as greaterEqual.
     */
    public void setConnectorType_GreaterEqual(String connectorType) {
        regConnectorType(CK_GE, fRES(connectorType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param connectorType The value of connectorType as lessEqual.
     */
    public void setConnectorType_LessEqual(String connectorType) {
        regConnectorType(CK_LE, fRES(connectorType));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param connectorType The value of connectorType as prefixSearch.
     */
    public void setConnectorType_PrefixSearch(String connectorType) {
        regConnectorType(CK_PS, fRES(connectorType));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param connectorType The value of connectorType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConnectorType_LikeSearch(String connectorType, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(connectorType), getCValueConnectorType(), "Connector_Type", "ConnectorType", "connectorType", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param connectorTypeList The collection of connectorType as inScope.
     */
    public void setConnectorType_InScope(Collection<String> connectorTypeList) {
        regConnectorType(CK_INS, cTL(connectorTypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param connectorType The collection of connectorType as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setConnectorType_InScope(String connectorType, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(connectorType), getCValueConnectorType(), "Connector_Type", "ConnectorType", "connectorType", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setConnectorType_IsNull() { regConnectorType(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setConnectorType_IsNotNull() { regConnectorType(CK_ISNN, DUMMY_OBJECT); }

    protected void regConnectorType(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueConnectorType(), "Connector_Type", "ConnectorType", "connectorType");
    }
    protected void registerInlineConnectorType(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueConnectorType(), "Connector_Type", "ConnectorType", "connectorType");
    }
    abstract protected ConditionValue getCValueConnectorType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param description The value of description as equal.
     */
    public void setDescription_Equal(String description) {
        regDescription(CK_EQ, fRES(description));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as notEqual.
     */
    public void setDescription_NotEqual(String description) {
        regDescription(CK_NE, fRES(description));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as greaterThan.
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as lessThan.
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as greaterEqual.
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as lessEqual.
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as prefixSearch.
     */
    public void setDescription_PrefixSearch(String description) {
        regDescription(CK_PS, fRES(description));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(description), getCValueDescription(), "Description", "Description", "description", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param descriptionList The collection of description as inScope.
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        regDescription(CK_INS, cTL(descriptionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param description The collection of description as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDescription_InScope(String description, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(description), getCValueDescription(), "Description", "Description", "description", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDescription_IsNull() { regDescription(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDescription_IsNotNull() { regDescription(CK_ISNN, DUMMY_OBJECT); }

    protected void regDescription(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDescription(), "Description", "Description", "description");
    }
    protected void registerInlineDescription(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDescription(), "Description", "Description", "description");
    }
    abstract protected ConditionValue getCValueDescription();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TConnectortypesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TConnectortypesCQ.class.getName(); }
}
