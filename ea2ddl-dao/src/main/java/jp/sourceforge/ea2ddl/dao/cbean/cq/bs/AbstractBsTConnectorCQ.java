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
 * The abstract condition-query of t_connector.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTConnectorCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTConnectorCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_connector";
    }
    
    public String getTableSqlName() {
        return "t_connector";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {PK : UQ : NotNull : COUNTER}
     * @param connectorId The value of connectorId as equal.
     */
    public void setConnectorId_Equal(java.lang.Integer connectorId) {
        regConnectorId(CK_EQ, connectorId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param connectorId The value of connectorId as notEqual.
     */
    public void setConnectorId_NotEqual(java.lang.Integer connectorId) {
        regConnectorId(CK_NE, connectorId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param connectorId The value of connectorId as greaterThan.
     */
    public void setConnectorId_GreaterThan(java.lang.Integer connectorId) {
        regConnectorId(CK_GT, connectorId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param connectorId The value of connectorId as lessThan.
     */
    public void setConnectorId_LessThan(java.lang.Integer connectorId) {
        regConnectorId(CK_LT, connectorId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param connectorId The value of connectorId as greaterEqual.
     */
    public void setConnectorId_GreaterEqual(java.lang.Integer connectorId) {
        regConnectorId(CK_GE, connectorId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param connectorId The value of connectorId as lessEqual.
     */
    public void setConnectorId_LessEqual(java.lang.Integer connectorId) {
        regConnectorId(CK_LE, connectorId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param connectorIdList The collection of connectorId as inScope.
     */
    public void setConnectorId_InScope(Collection<java.lang.Integer> connectorIdList) {
        regConnectorId(CK_INS, cTL(connectorIdList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setConnectorId_IsNull() { regConnectorId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setConnectorId_IsNotNull() { regConnectorId(CK_ISNN, DOBJ); }

    protected void regConnectorId(ConditionKey k, Object v) { regQ(k, v, getCValueConnectorId(), "Connector_ID"); }
    abstract protected ConditionValue getCValueConnectorId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param direction The value of direction as equal.
     */
    public void setDirection_Equal(String direction) {
        regDirection(CK_EQ, fRES(direction));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param direction The value of direction as notEqual.
     */
    public void setDirection_NotEqual(String direction) {
        regDirection(CK_NE, fRES(direction));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param direction The value of direction as greaterThan.
     */
    public void setDirection_GreaterThan(String direction) {
        regDirection(CK_GT, fRES(direction));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param direction The value of direction as lessThan.
     */
    public void setDirection_LessThan(String direction) {
        regDirection(CK_LT, fRES(direction));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param direction The value of direction as greaterEqual.
     */
    public void setDirection_GreaterEqual(String direction) {
        regDirection(CK_GE, fRES(direction));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param direction The value of direction as lessEqual.
     */
    public void setDirection_LessEqual(String direction) {
        regDirection(CK_LE, fRES(direction));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param direction The value of direction as prefixSearch.
     */
    public void setDirection_PrefixSearch(String direction) {
        regDirection(CK_PS, fRES(direction));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param directionList The collection of direction as inScope.
     */
    public void setDirection_InScope(Collection<String> directionList) {
        regDirection(CK_INS, cTL(directionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param direction The value of direction as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirection_LikeSearch(String direction, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(direction), getCValueDirection(), "Direction", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param direction The value of direction as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirection_NotLikeSearch(String direction, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(direction), getCValueDirection(), "Direction", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDirection_IsNull() { regDirection(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDirection_IsNotNull() { regDirection(CK_ISNN, DOBJ); }

    protected void regDirection(ConditionKey k, Object v) { regQ(k, v, getCValueDirection(), "Direction"); }
    abstract protected ConditionValue getCValueDirection();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param connectorType The value of connectorType as equal.
     */
    public void setConnectorType_Equal(String connectorType) {
        regConnectorType(CK_EQ, fRES(connectorType));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param connectorType The value of connectorType as notEqual.
     */
    public void setConnectorType_NotEqual(String connectorType) {
        regConnectorType(CK_NE, fRES(connectorType));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param connectorType The value of connectorType as greaterThan.
     */
    public void setConnectorType_GreaterThan(String connectorType) {
        regConnectorType(CK_GT, fRES(connectorType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param connectorType The value of connectorType as lessThan.
     */
    public void setConnectorType_LessThan(String connectorType) {
        regConnectorType(CK_LT, fRES(connectorType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param connectorType The value of connectorType as greaterEqual.
     */
    public void setConnectorType_GreaterEqual(String connectorType) {
        regConnectorType(CK_GE, fRES(connectorType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param connectorType The value of connectorType as lessEqual.
     */
    public void setConnectorType_LessEqual(String connectorType) {
        regConnectorType(CK_LE, fRES(connectorType));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param connectorType The value of connectorType as prefixSearch.
     */
    public void setConnectorType_PrefixSearch(String connectorType) {
        regConnectorType(CK_PS, fRES(connectorType));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param connectorTypeList The collection of connectorType as inScope.
     */
    public void setConnectorType_InScope(Collection<String> connectorTypeList) {
        regConnectorType(CK_INS, cTL(connectorTypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param connectorType The value of connectorType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConnectorType_LikeSearch(String connectorType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(connectorType), getCValueConnectorType(), "Connector_Type", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param connectorType The value of connectorType as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConnectorType_NotLikeSearch(String connectorType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(connectorType), getCValueConnectorType(), "Connector_Type", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setConnectorType_IsNull() { regConnectorType(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setConnectorType_IsNotNull() { regConnectorType(CK_ISNN, DOBJ); }

    protected void regConnectorType(ConditionKey k, Object v) { regQ(k, v, getCValueConnectorType(), "Connector_Type"); }
    abstract protected ConditionValue getCValueConnectorType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param subtype The value of subtype as equal.
     */
    public void setSubtype_Equal(String subtype) {
        regSubtype(CK_EQ, fRES(subtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param subtype The value of subtype as notEqual.
     */
    public void setSubtype_NotEqual(String subtype) {
        regSubtype(CK_NE, fRES(subtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param subtype The value of subtype as greaterThan.
     */
    public void setSubtype_GreaterThan(String subtype) {
        regSubtype(CK_GT, fRES(subtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param subtype The value of subtype as lessThan.
     */
    public void setSubtype_LessThan(String subtype) {
        regSubtype(CK_LT, fRES(subtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param subtype The value of subtype as greaterEqual.
     */
    public void setSubtype_GreaterEqual(String subtype) {
        regSubtype(CK_GE, fRES(subtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param subtype The value of subtype as lessEqual.
     */
    public void setSubtype_LessEqual(String subtype) {
        regSubtype(CK_LE, fRES(subtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param subtype The value of subtype as prefixSearch.
     */
    public void setSubtype_PrefixSearch(String subtype) {
        regSubtype(CK_PS, fRES(subtype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param subtypeList The collection of subtype as inScope.
     */
    public void setSubtype_InScope(Collection<String> subtypeList) {
        regSubtype(CK_INS, cTL(subtypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param subtype The value of subtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSubtype_LikeSearch(String subtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(subtype), getCValueSubtype(), "SubType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param subtype The value of subtype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSubtype_NotLikeSearch(String subtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(subtype), getCValueSubtype(), "SubType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSubtype_IsNull() { regSubtype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSubtype_IsNotNull() { regSubtype(CK_ISNN, DOBJ); }

    protected void regSubtype(ConditionKey k, Object v) { regQ(k, v, getCValueSubtype(), "SubType"); }
    abstract protected ConditionValue getCValueSubtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param sourcecard The value of sourcecard as equal.
     */
    public void setSourcecard_Equal(String sourcecard) {
        regSourcecard(CK_EQ, fRES(sourcecard));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcecard The value of sourcecard as notEqual.
     */
    public void setSourcecard_NotEqual(String sourcecard) {
        regSourcecard(CK_NE, fRES(sourcecard));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcecard The value of sourcecard as greaterThan.
     */
    public void setSourcecard_GreaterThan(String sourcecard) {
        regSourcecard(CK_GT, fRES(sourcecard));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcecard The value of sourcecard as lessThan.
     */
    public void setSourcecard_LessThan(String sourcecard) {
        regSourcecard(CK_LT, fRES(sourcecard));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcecard The value of sourcecard as greaterEqual.
     */
    public void setSourcecard_GreaterEqual(String sourcecard) {
        regSourcecard(CK_GE, fRES(sourcecard));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcecard The value of sourcecard as lessEqual.
     */
    public void setSourcecard_LessEqual(String sourcecard) {
        regSourcecard(CK_LE, fRES(sourcecard));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcecard The value of sourcecard as prefixSearch.
     */
    public void setSourcecard_PrefixSearch(String sourcecard) {
        regSourcecard(CK_PS, fRES(sourcecard));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourcecardList The collection of sourcecard as inScope.
     */
    public void setSourcecard_InScope(Collection<String> sourcecardList) {
        regSourcecard(CK_INS, cTL(sourcecardList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcecard The value of sourcecard as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourcecard_LikeSearch(String sourcecard, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourcecard), getCValueSourcecard(), "SourceCard", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcecard The value of sourcecard as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourcecard_NotLikeSearch(String sourcecard, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourcecard), getCValueSourcecard(), "SourceCard", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourcecard_IsNull() { regSourcecard(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourcecard_IsNotNull() { regSourcecard(CK_ISNN, DOBJ); }

    protected void regSourcecard(ConditionKey k, Object v) { regQ(k, v, getCValueSourcecard(), "SourceCard"); }
    abstract protected ConditionValue getCValueSourcecard();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param sourceaccess The value of sourceaccess as equal.
     */
    public void setSourceaccess_Equal(String sourceaccess) {
        regSourceaccess(CK_EQ, fRES(sourceaccess));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceaccess The value of sourceaccess as notEqual.
     */
    public void setSourceaccess_NotEqual(String sourceaccess) {
        regSourceaccess(CK_NE, fRES(sourceaccess));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceaccess The value of sourceaccess as greaterThan.
     */
    public void setSourceaccess_GreaterThan(String sourceaccess) {
        regSourceaccess(CK_GT, fRES(sourceaccess));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceaccess The value of sourceaccess as lessThan.
     */
    public void setSourceaccess_LessThan(String sourceaccess) {
        regSourceaccess(CK_LT, fRES(sourceaccess));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceaccess The value of sourceaccess as greaterEqual.
     */
    public void setSourceaccess_GreaterEqual(String sourceaccess) {
        regSourceaccess(CK_GE, fRES(sourceaccess));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceaccess The value of sourceaccess as lessEqual.
     */
    public void setSourceaccess_LessEqual(String sourceaccess) {
        regSourceaccess(CK_LE, fRES(sourceaccess));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceaccess The value of sourceaccess as prefixSearch.
     */
    public void setSourceaccess_PrefixSearch(String sourceaccess) {
        regSourceaccess(CK_PS, fRES(sourceaccess));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourceaccessList The collection of sourceaccess as inScope.
     */
    public void setSourceaccess_InScope(Collection<String> sourceaccessList) {
        regSourceaccess(CK_INS, cTL(sourceaccessList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourceaccess The value of sourceaccess as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourceaccess_LikeSearch(String sourceaccess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceaccess), getCValueSourceaccess(), "SourceAccess", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourceaccess The value of sourceaccess as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourceaccess_NotLikeSearch(String sourceaccess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceaccess), getCValueSourceaccess(), "SourceAccess", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourceaccess_IsNull() { regSourceaccess(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourceaccess_IsNotNull() { regSourceaccess(CK_ISNN, DOBJ); }

    protected void regSourceaccess(ConditionKey k, Object v) { regQ(k, v, getCValueSourceaccess(), "SourceAccess"); }
    abstract protected ConditionValue getCValueSourceaccess();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param sourceelement The value of sourceelement as equal.
     */
    public void setSourceelement_Equal(String sourceelement) {
        regSourceelement(CK_EQ, fRES(sourceelement));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceelement The value of sourceelement as notEqual.
     */
    public void setSourceelement_NotEqual(String sourceelement) {
        regSourceelement(CK_NE, fRES(sourceelement));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceelement The value of sourceelement as greaterThan.
     */
    public void setSourceelement_GreaterThan(String sourceelement) {
        regSourceelement(CK_GT, fRES(sourceelement));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceelement The value of sourceelement as lessThan.
     */
    public void setSourceelement_LessThan(String sourceelement) {
        regSourceelement(CK_LT, fRES(sourceelement));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceelement The value of sourceelement as greaterEqual.
     */
    public void setSourceelement_GreaterEqual(String sourceelement) {
        regSourceelement(CK_GE, fRES(sourceelement));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceelement The value of sourceelement as lessEqual.
     */
    public void setSourceelement_LessEqual(String sourceelement) {
        regSourceelement(CK_LE, fRES(sourceelement));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceelement The value of sourceelement as prefixSearch.
     */
    public void setSourceelement_PrefixSearch(String sourceelement) {
        regSourceelement(CK_PS, fRES(sourceelement));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourceelementList The collection of sourceelement as inScope.
     */
    public void setSourceelement_InScope(Collection<String> sourceelementList) {
        regSourceelement(CK_INS, cTL(sourceelementList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourceelement The value of sourceelement as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourceelement_LikeSearch(String sourceelement, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceelement), getCValueSourceelement(), "SourceElement", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourceelement The value of sourceelement as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourceelement_NotLikeSearch(String sourceelement, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceelement), getCValueSourceelement(), "SourceElement", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourceelement_IsNull() { regSourceelement(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourceelement_IsNotNull() { regSourceelement(CK_ISNN, DOBJ); }

    protected void regSourceelement(ConditionKey k, Object v) { regQ(k, v, getCValueSourceelement(), "SourceElement"); }
    abstract protected ConditionValue getCValueSourceelement();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param destcard The value of destcard as equal.
     */
    public void setDestcard_Equal(String destcard) {
        regDestcard(CK_EQ, fRES(destcard));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destcard The value of destcard as notEqual.
     */
    public void setDestcard_NotEqual(String destcard) {
        regDestcard(CK_NE, fRES(destcard));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destcard The value of destcard as greaterThan.
     */
    public void setDestcard_GreaterThan(String destcard) {
        regDestcard(CK_GT, fRES(destcard));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destcard The value of destcard as lessThan.
     */
    public void setDestcard_LessThan(String destcard) {
        regDestcard(CK_LT, fRES(destcard));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destcard The value of destcard as greaterEqual.
     */
    public void setDestcard_GreaterEqual(String destcard) {
        regDestcard(CK_GE, fRES(destcard));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destcard The value of destcard as lessEqual.
     */
    public void setDestcard_LessEqual(String destcard) {
        regDestcard(CK_LE, fRES(destcard));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destcard The value of destcard as prefixSearch.
     */
    public void setDestcard_PrefixSearch(String destcard) {
        regDestcard(CK_PS, fRES(destcard));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param destcardList The collection of destcard as inScope.
     */
    public void setDestcard_InScope(Collection<String> destcardList) {
        regDestcard(CK_INS, cTL(destcardList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destcard The value of destcard as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestcard_LikeSearch(String destcard, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destcard), getCValueDestcard(), "DestCard", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destcard The value of destcard as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestcard_NotLikeSearch(String destcard, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destcard), getCValueDestcard(), "DestCard", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestcard_IsNull() { regDestcard(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestcard_IsNotNull() { regDestcard(CK_ISNN, DOBJ); }

    protected void regDestcard(ConditionKey k, Object v) { regQ(k, v, getCValueDestcard(), "DestCard"); }
    abstract protected ConditionValue getCValueDestcard();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param destaccess The value of destaccess as equal.
     */
    public void setDestaccess_Equal(String destaccess) {
        regDestaccess(CK_EQ, fRES(destaccess));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destaccess The value of destaccess as notEqual.
     */
    public void setDestaccess_NotEqual(String destaccess) {
        regDestaccess(CK_NE, fRES(destaccess));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destaccess The value of destaccess as greaterThan.
     */
    public void setDestaccess_GreaterThan(String destaccess) {
        regDestaccess(CK_GT, fRES(destaccess));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destaccess The value of destaccess as lessThan.
     */
    public void setDestaccess_LessThan(String destaccess) {
        regDestaccess(CK_LT, fRES(destaccess));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destaccess The value of destaccess as greaterEqual.
     */
    public void setDestaccess_GreaterEqual(String destaccess) {
        regDestaccess(CK_GE, fRES(destaccess));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destaccess The value of destaccess as lessEqual.
     */
    public void setDestaccess_LessEqual(String destaccess) {
        regDestaccess(CK_LE, fRES(destaccess));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destaccess The value of destaccess as prefixSearch.
     */
    public void setDestaccess_PrefixSearch(String destaccess) {
        regDestaccess(CK_PS, fRES(destaccess));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param destaccessList The collection of destaccess as inScope.
     */
    public void setDestaccess_InScope(Collection<String> destaccessList) {
        regDestaccess(CK_INS, cTL(destaccessList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destaccess The value of destaccess as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestaccess_LikeSearch(String destaccess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destaccess), getCValueDestaccess(), "DestAccess", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destaccess The value of destaccess as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestaccess_NotLikeSearch(String destaccess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destaccess), getCValueDestaccess(), "DestAccess", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestaccess_IsNull() { regDestaccess(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestaccess_IsNotNull() { regDestaccess(CK_ISNN, DOBJ); }

    protected void regDestaccess(ConditionKey k, Object v) { regQ(k, v, getCValueDestaccess(), "DestAccess"); }
    abstract protected ConditionValue getCValueDestaccess();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param destelement The value of destelement as equal.
     */
    public void setDestelement_Equal(String destelement) {
        regDestelement(CK_EQ, fRES(destelement));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destelement The value of destelement as notEqual.
     */
    public void setDestelement_NotEqual(String destelement) {
        regDestelement(CK_NE, fRES(destelement));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destelement The value of destelement as greaterThan.
     */
    public void setDestelement_GreaterThan(String destelement) {
        regDestelement(CK_GT, fRES(destelement));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destelement The value of destelement as lessThan.
     */
    public void setDestelement_LessThan(String destelement) {
        regDestelement(CK_LT, fRES(destelement));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destelement The value of destelement as greaterEqual.
     */
    public void setDestelement_GreaterEqual(String destelement) {
        regDestelement(CK_GE, fRES(destelement));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destelement The value of destelement as lessEqual.
     */
    public void setDestelement_LessEqual(String destelement) {
        regDestelement(CK_LE, fRES(destelement));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destelement The value of destelement as prefixSearch.
     */
    public void setDestelement_PrefixSearch(String destelement) {
        regDestelement(CK_PS, fRES(destelement));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param destelementList The collection of destelement as inScope.
     */
    public void setDestelement_InScope(Collection<String> destelementList) {
        regDestelement(CK_INS, cTL(destelementList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destelement The value of destelement as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestelement_LikeSearch(String destelement, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destelement), getCValueDestelement(), "DestElement", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destelement The value of destelement as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestelement_NotLikeSearch(String destelement, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destelement), getCValueDestelement(), "DestElement", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestelement_IsNull() { regDestelement(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestelement_IsNotNull() { regDestelement(CK_ISNN, DOBJ); }

    protected void regDestelement(ConditionKey k, Object v) { regQ(k, v, getCValueDestelement(), "DestElement"); }
    abstract protected ConditionValue getCValueDestelement();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255) : FK to t_operation}
     * @param sourcerole The value of sourcerole as equal.
     */
    public void setSourcerole_Equal(String sourcerole) {
        regSourcerole(CK_EQ, fRES(sourcerole));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcerole The value of sourcerole as notEqual.
     */
    public void setSourcerole_NotEqual(String sourcerole) {
        regSourcerole(CK_NE, fRES(sourcerole));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcerole The value of sourcerole as greaterThan.
     */
    public void setSourcerole_GreaterThan(String sourcerole) {
        regSourcerole(CK_GT, fRES(sourcerole));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcerole The value of sourcerole as lessThan.
     */
    public void setSourcerole_LessThan(String sourcerole) {
        regSourcerole(CK_LT, fRES(sourcerole));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcerole The value of sourcerole as greaterEqual.
     */
    public void setSourcerole_GreaterEqual(String sourcerole) {
        regSourcerole(CK_GE, fRES(sourcerole));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcerole The value of sourcerole as lessEqual.
     */
    public void setSourcerole_LessEqual(String sourcerole) {
        regSourcerole(CK_LE, fRES(sourcerole));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcerole The value of sourcerole as prefixSearch.
     */
    public void setSourcerole_PrefixSearch(String sourcerole) {
        regSourcerole(CK_PS, fRES(sourcerole));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourceroleList The collection of sourcerole as inScope.
     */
    public void setSourcerole_InScope(Collection<String> sourceroleList) {
        regSourcerole(CK_INS, cTL(sourceroleList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcerole The value of sourcerole as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourcerole_LikeSearch(String sourcerole, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourcerole), getCValueSourcerole(), "SourceRole", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcerole The value of sourcerole as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourcerole_NotLikeSearch(String sourcerole, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourcerole), getCValueSourcerole(), "SourceRole", likeSearchOption);
    }

    public void inScopeTOperationBySourcerole(SubQuery<TOperationCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepSourcerole_InScopeSubQuery_TOperationBySourcerole(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "SourceRole", "Name", subQueryPropertyName);
    }
    public abstract String keepSourcerole_InScopeSubQuery_TOperationBySourcerole(TOperationCQ subQuery);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourcerole_IsNull() { regSourcerole(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourcerole_IsNotNull() { regSourcerole(CK_ISNN, DOBJ); }

    protected void regSourcerole(ConditionKey k, Object v) { regQ(k, v, getCValueSourcerole(), "SourceRole"); }
    abstract protected ConditionValue getCValueSourcerole();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param sourceroletype The value of sourceroletype as equal.
     */
    public void setSourceroletype_Equal(String sourceroletype) {
        regSourceroletype(CK_EQ, fRES(sourceroletype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceroletype The value of sourceroletype as notEqual.
     */
    public void setSourceroletype_NotEqual(String sourceroletype) {
        regSourceroletype(CK_NE, fRES(sourceroletype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceroletype The value of sourceroletype as greaterThan.
     */
    public void setSourceroletype_GreaterThan(String sourceroletype) {
        regSourceroletype(CK_GT, fRES(sourceroletype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceroletype The value of sourceroletype as lessThan.
     */
    public void setSourceroletype_LessThan(String sourceroletype) {
        regSourceroletype(CK_LT, fRES(sourceroletype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceroletype The value of sourceroletype as greaterEqual.
     */
    public void setSourceroletype_GreaterEqual(String sourceroletype) {
        regSourceroletype(CK_GE, fRES(sourceroletype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceroletype The value of sourceroletype as lessEqual.
     */
    public void setSourceroletype_LessEqual(String sourceroletype) {
        regSourceroletype(CK_LE, fRES(sourceroletype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceroletype The value of sourceroletype as prefixSearch.
     */
    public void setSourceroletype_PrefixSearch(String sourceroletype) {
        regSourceroletype(CK_PS, fRES(sourceroletype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourceroletypeList The collection of sourceroletype as inScope.
     */
    public void setSourceroletype_InScope(Collection<String> sourceroletypeList) {
        regSourceroletype(CK_INS, cTL(sourceroletypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourceroletype The value of sourceroletype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourceroletype_LikeSearch(String sourceroletype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceroletype), getCValueSourceroletype(), "SourceRoleType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourceroletype The value of sourceroletype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourceroletype_NotLikeSearch(String sourceroletype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceroletype), getCValueSourceroletype(), "SourceRoleType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourceroletype_IsNull() { regSourceroletype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourceroletype_IsNotNull() { regSourceroletype(CK_ISNN, DOBJ); }

    protected void regSourceroletype(ConditionKey k, Object v) { regQ(k, v, getCValueSourceroletype(), "SourceRoleType"); }
    abstract protected ConditionValue getCValueSourceroletype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param sourcerolenote The value of sourcerolenote as equal.
     */
    public void setSourcerolenote_Equal(String sourcerolenote) {
        regSourcerolenote(CK_EQ, fRES(sourcerolenote));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcerolenote The value of sourcerolenote as notEqual.
     */
    public void setSourcerolenote_NotEqual(String sourcerolenote) {
        regSourcerolenote(CK_NE, fRES(sourcerolenote));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcerolenote The value of sourcerolenote as greaterThan.
     */
    public void setSourcerolenote_GreaterThan(String sourcerolenote) {
        regSourcerolenote(CK_GT, fRES(sourcerolenote));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcerolenote The value of sourcerolenote as lessThan.
     */
    public void setSourcerolenote_LessThan(String sourcerolenote) {
        regSourcerolenote(CK_LT, fRES(sourcerolenote));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcerolenote The value of sourcerolenote as greaterEqual.
     */
    public void setSourcerolenote_GreaterEqual(String sourcerolenote) {
        regSourcerolenote(CK_GE, fRES(sourcerolenote));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcerolenote The value of sourcerolenote as lessEqual.
     */
    public void setSourcerolenote_LessEqual(String sourcerolenote) {
        regSourcerolenote(CK_LE, fRES(sourcerolenote));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcerolenote The value of sourcerolenote as prefixSearch.
     */
    public void setSourcerolenote_PrefixSearch(String sourcerolenote) {
        regSourcerolenote(CK_PS, fRES(sourcerolenote));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourcerolenoteList The collection of sourcerolenote as inScope.
     */
    public void setSourcerolenote_InScope(Collection<String> sourcerolenoteList) {
        regSourcerolenote(CK_INS, cTL(sourcerolenoteList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcerolenote The value of sourcerolenote as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourcerolenote_LikeSearch(String sourcerolenote, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourcerolenote), getCValueSourcerolenote(), "SourceRoleNote", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcerolenote The value of sourcerolenote as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourcerolenote_NotLikeSearch(String sourcerolenote, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourcerolenote), getCValueSourcerolenote(), "SourceRoleNote", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourcerolenote_IsNull() { regSourcerolenote(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourcerolenote_IsNotNull() { regSourcerolenote(CK_ISNN, DOBJ); }

    protected void regSourcerolenote(ConditionKey k, Object v) { regQ(k, v, getCValueSourcerolenote(), "SourceRoleNote"); }
    abstract protected ConditionValue getCValueSourcerolenote();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param sourcecontainment The value of sourcecontainment as equal.
     */
    public void setSourcecontainment_Equal(String sourcecontainment) {
        regSourcecontainment(CK_EQ, fRES(sourcecontainment));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcecontainment The value of sourcecontainment as notEqual.
     */
    public void setSourcecontainment_NotEqual(String sourcecontainment) {
        regSourcecontainment(CK_NE, fRES(sourcecontainment));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcecontainment The value of sourcecontainment as greaterThan.
     */
    public void setSourcecontainment_GreaterThan(String sourcecontainment) {
        regSourcecontainment(CK_GT, fRES(sourcecontainment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcecontainment The value of sourcecontainment as lessThan.
     */
    public void setSourcecontainment_LessThan(String sourcecontainment) {
        regSourcecontainment(CK_LT, fRES(sourcecontainment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcecontainment The value of sourcecontainment as greaterEqual.
     */
    public void setSourcecontainment_GreaterEqual(String sourcecontainment) {
        regSourcecontainment(CK_GE, fRES(sourcecontainment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcecontainment The value of sourcecontainment as lessEqual.
     */
    public void setSourcecontainment_LessEqual(String sourcecontainment) {
        regSourcecontainment(CK_LE, fRES(sourcecontainment));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcecontainment The value of sourcecontainment as prefixSearch.
     */
    public void setSourcecontainment_PrefixSearch(String sourcecontainment) {
        regSourcecontainment(CK_PS, fRES(sourcecontainment));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourcecontainmentList The collection of sourcecontainment as inScope.
     */
    public void setSourcecontainment_InScope(Collection<String> sourcecontainmentList) {
        regSourcecontainment(CK_INS, cTL(sourcecontainmentList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcecontainment The value of sourcecontainment as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourcecontainment_LikeSearch(String sourcecontainment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourcecontainment), getCValueSourcecontainment(), "SourceContainment", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcecontainment The value of sourcecontainment as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourcecontainment_NotLikeSearch(String sourcecontainment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourcecontainment), getCValueSourcecontainment(), "SourceContainment", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourcecontainment_IsNull() { regSourcecontainment(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourcecontainment_IsNotNull() { regSourcecontainment(CK_ISNN, DOBJ); }

    protected void regSourcecontainment(ConditionKey k, Object v) { regQ(k, v, getCValueSourcecontainment(), "SourceContainment"); }
    abstract protected ConditionValue getCValueSourcecontainment();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param sourceisaggregate The value of sourceisaggregate as equal.
     */
    public void setSourceisaggregate_Equal(java.lang.Integer sourceisaggregate) {
        regSourceisaggregate(CK_EQ, sourceisaggregate);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param sourceisaggregate The value of sourceisaggregate as notEqual.
     */
    public void setSourceisaggregate_NotEqual(java.lang.Integer sourceisaggregate) {
        regSourceisaggregate(CK_NE, sourceisaggregate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param sourceisaggregate The value of sourceisaggregate as greaterThan.
     */
    public void setSourceisaggregate_GreaterThan(java.lang.Integer sourceisaggregate) {
        regSourceisaggregate(CK_GT, sourceisaggregate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param sourceisaggregate The value of sourceisaggregate as lessThan.
     */
    public void setSourceisaggregate_LessThan(java.lang.Integer sourceisaggregate) {
        regSourceisaggregate(CK_LT, sourceisaggregate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param sourceisaggregate The value of sourceisaggregate as greaterEqual.
     */
    public void setSourceisaggregate_GreaterEqual(java.lang.Integer sourceisaggregate) {
        regSourceisaggregate(CK_GE, sourceisaggregate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param sourceisaggregate The value of sourceisaggregate as lessEqual.
     */
    public void setSourceisaggregate_LessEqual(java.lang.Integer sourceisaggregate) {
        regSourceisaggregate(CK_LE, sourceisaggregate);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param sourceisaggregateList The collection of sourceisaggregate as inScope.
     */
    public void setSourceisaggregate_InScope(Collection<java.lang.Integer> sourceisaggregateList) {
        regSourceisaggregate(CK_INS, cTL(sourceisaggregateList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourceisaggregate_IsNull() { regSourceisaggregate(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourceisaggregate_IsNotNull() { regSourceisaggregate(CK_ISNN, DOBJ); }

    protected void regSourceisaggregate(ConditionKey k, Object v) { regQ(k, v, getCValueSourceisaggregate(), "SourceIsAggregate"); }
    abstract protected ConditionValue getCValueSourceisaggregate();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param sourceisordered The value of sourceisordered as equal.
     */
    public void setSourceisordered_Equal(java.lang.Integer sourceisordered) {
        regSourceisordered(CK_EQ, sourceisordered);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param sourceisordered The value of sourceisordered as notEqual.
     */
    public void setSourceisordered_NotEqual(java.lang.Integer sourceisordered) {
        regSourceisordered(CK_NE, sourceisordered);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param sourceisordered The value of sourceisordered as greaterThan.
     */
    public void setSourceisordered_GreaterThan(java.lang.Integer sourceisordered) {
        regSourceisordered(CK_GT, sourceisordered);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param sourceisordered The value of sourceisordered as lessThan.
     */
    public void setSourceisordered_LessThan(java.lang.Integer sourceisordered) {
        regSourceisordered(CK_LT, sourceisordered);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param sourceisordered The value of sourceisordered as greaterEqual.
     */
    public void setSourceisordered_GreaterEqual(java.lang.Integer sourceisordered) {
        regSourceisordered(CK_GE, sourceisordered);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param sourceisordered The value of sourceisordered as lessEqual.
     */
    public void setSourceisordered_LessEqual(java.lang.Integer sourceisordered) {
        regSourceisordered(CK_LE, sourceisordered);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param sourceisorderedList The collection of sourceisordered as inScope.
     */
    public void setSourceisordered_InScope(Collection<java.lang.Integer> sourceisorderedList) {
        regSourceisordered(CK_INS, cTL(sourceisorderedList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourceisordered_IsNull() { regSourceisordered(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourceisordered_IsNotNull() { regSourceisordered(CK_ISNN, DOBJ); }

    protected void regSourceisordered(ConditionKey k, Object v) { regQ(k, v, getCValueSourceisordered(), "SourceIsOrdered"); }
    abstract protected ConditionValue getCValueSourceisordered();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param sourcequalifier The value of sourcequalifier as equal.
     */
    public void setSourcequalifier_Equal(String sourcequalifier) {
        regSourcequalifier(CK_EQ, fRES(sourcequalifier));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcequalifier The value of sourcequalifier as notEqual.
     */
    public void setSourcequalifier_NotEqual(String sourcequalifier) {
        regSourcequalifier(CK_NE, fRES(sourcequalifier));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcequalifier The value of sourcequalifier as greaterThan.
     */
    public void setSourcequalifier_GreaterThan(String sourcequalifier) {
        regSourcequalifier(CK_GT, fRES(sourcequalifier));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcequalifier The value of sourcequalifier as lessThan.
     */
    public void setSourcequalifier_LessThan(String sourcequalifier) {
        regSourcequalifier(CK_LT, fRES(sourcequalifier));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcequalifier The value of sourcequalifier as greaterEqual.
     */
    public void setSourcequalifier_GreaterEqual(String sourcequalifier) {
        regSourcequalifier(CK_GE, fRES(sourcequalifier));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcequalifier The value of sourcequalifier as lessEqual.
     */
    public void setSourcequalifier_LessEqual(String sourcequalifier) {
        regSourcequalifier(CK_LE, fRES(sourcequalifier));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcequalifier The value of sourcequalifier as prefixSearch.
     */
    public void setSourcequalifier_PrefixSearch(String sourcequalifier) {
        regSourcequalifier(CK_PS, fRES(sourcequalifier));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourcequalifierList The collection of sourcequalifier as inScope.
     */
    public void setSourcequalifier_InScope(Collection<String> sourcequalifierList) {
        regSourcequalifier(CK_INS, cTL(sourcequalifierList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcequalifier The value of sourcequalifier as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourcequalifier_LikeSearch(String sourcequalifier, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourcequalifier), getCValueSourcequalifier(), "SourceQualifier", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcequalifier The value of sourcequalifier as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourcequalifier_NotLikeSearch(String sourcequalifier, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourcequalifier), getCValueSourcequalifier(), "SourceQualifier", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourcequalifier_IsNull() { regSourcequalifier(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourcequalifier_IsNotNull() { regSourcequalifier(CK_ISNN, DOBJ); }

    protected void regSourcequalifier(ConditionKey k, Object v) { regQ(k, v, getCValueSourcequalifier(), "SourceQualifier"); }
    abstract protected ConditionValue getCValueSourcequalifier();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255) : FK to t_operation}
     * @param destrole The value of destrole as equal.
     */
    public void setDestrole_Equal(String destrole) {
        regDestrole(CK_EQ, fRES(destrole));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destrole The value of destrole as notEqual.
     */
    public void setDestrole_NotEqual(String destrole) {
        regDestrole(CK_NE, fRES(destrole));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destrole The value of destrole as greaterThan.
     */
    public void setDestrole_GreaterThan(String destrole) {
        regDestrole(CK_GT, fRES(destrole));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destrole The value of destrole as lessThan.
     */
    public void setDestrole_LessThan(String destrole) {
        regDestrole(CK_LT, fRES(destrole));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destrole The value of destrole as greaterEqual.
     */
    public void setDestrole_GreaterEqual(String destrole) {
        regDestrole(CK_GE, fRES(destrole));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destrole The value of destrole as lessEqual.
     */
    public void setDestrole_LessEqual(String destrole) {
        regDestrole(CK_LE, fRES(destrole));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destrole The value of destrole as prefixSearch.
     */
    public void setDestrole_PrefixSearch(String destrole) {
        regDestrole(CK_PS, fRES(destrole));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param destroleList The collection of destrole as inScope.
     */
    public void setDestrole_InScope(Collection<String> destroleList) {
        regDestrole(CK_INS, cTL(destroleList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destrole The value of destrole as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestrole_LikeSearch(String destrole, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destrole), getCValueDestrole(), "DestRole", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destrole The value of destrole as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestrole_NotLikeSearch(String destrole, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destrole), getCValueDestrole(), "DestRole", likeSearchOption);
    }

    public void inScopeTOperationByDestrole(SubQuery<TOperationCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepDestrole_InScopeSubQuery_TOperationByDestrole(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "DestRole", "Name", subQueryPropertyName);
    }
    public abstract String keepDestrole_InScopeSubQuery_TOperationByDestrole(TOperationCQ subQuery);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestrole_IsNull() { regDestrole(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestrole_IsNotNull() { regDestrole(CK_ISNN, DOBJ); }

    protected void regDestrole(ConditionKey k, Object v) { regQ(k, v, getCValueDestrole(), "DestRole"); }
    abstract protected ConditionValue getCValueDestrole();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param destroletype The value of destroletype as equal.
     */
    public void setDestroletype_Equal(String destroletype) {
        regDestroletype(CK_EQ, fRES(destroletype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destroletype The value of destroletype as notEqual.
     */
    public void setDestroletype_NotEqual(String destroletype) {
        regDestroletype(CK_NE, fRES(destroletype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destroletype The value of destroletype as greaterThan.
     */
    public void setDestroletype_GreaterThan(String destroletype) {
        regDestroletype(CK_GT, fRES(destroletype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destroletype The value of destroletype as lessThan.
     */
    public void setDestroletype_LessThan(String destroletype) {
        regDestroletype(CK_LT, fRES(destroletype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destroletype The value of destroletype as greaterEqual.
     */
    public void setDestroletype_GreaterEqual(String destroletype) {
        regDestroletype(CK_GE, fRES(destroletype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destroletype The value of destroletype as lessEqual.
     */
    public void setDestroletype_LessEqual(String destroletype) {
        regDestroletype(CK_LE, fRES(destroletype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destroletype The value of destroletype as prefixSearch.
     */
    public void setDestroletype_PrefixSearch(String destroletype) {
        regDestroletype(CK_PS, fRES(destroletype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param destroletypeList The collection of destroletype as inScope.
     */
    public void setDestroletype_InScope(Collection<String> destroletypeList) {
        regDestroletype(CK_INS, cTL(destroletypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destroletype The value of destroletype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestroletype_LikeSearch(String destroletype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destroletype), getCValueDestroletype(), "DestRoleType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destroletype The value of destroletype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestroletype_NotLikeSearch(String destroletype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destroletype), getCValueDestroletype(), "DestRoleType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestroletype_IsNull() { regDestroletype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestroletype_IsNotNull() { regDestroletype(CK_ISNN, DOBJ); }

    protected void regDestroletype(ConditionKey k, Object v) { regQ(k, v, getCValueDestroletype(), "DestRoleType"); }
    abstract protected ConditionValue getCValueDestroletype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param destrolenote The value of destrolenote as equal.
     */
    public void setDestrolenote_Equal(String destrolenote) {
        regDestrolenote(CK_EQ, fRES(destrolenote));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destrolenote The value of destrolenote as notEqual.
     */
    public void setDestrolenote_NotEqual(String destrolenote) {
        regDestrolenote(CK_NE, fRES(destrolenote));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destrolenote The value of destrolenote as greaterThan.
     */
    public void setDestrolenote_GreaterThan(String destrolenote) {
        regDestrolenote(CK_GT, fRES(destrolenote));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destrolenote The value of destrolenote as lessThan.
     */
    public void setDestrolenote_LessThan(String destrolenote) {
        regDestrolenote(CK_LT, fRES(destrolenote));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destrolenote The value of destrolenote as greaterEqual.
     */
    public void setDestrolenote_GreaterEqual(String destrolenote) {
        regDestrolenote(CK_GE, fRES(destrolenote));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destrolenote The value of destrolenote as lessEqual.
     */
    public void setDestrolenote_LessEqual(String destrolenote) {
        regDestrolenote(CK_LE, fRES(destrolenote));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destrolenote The value of destrolenote as prefixSearch.
     */
    public void setDestrolenote_PrefixSearch(String destrolenote) {
        regDestrolenote(CK_PS, fRES(destrolenote));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param destrolenoteList The collection of destrolenote as inScope.
     */
    public void setDestrolenote_InScope(Collection<String> destrolenoteList) {
        regDestrolenote(CK_INS, cTL(destrolenoteList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destrolenote The value of destrolenote as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestrolenote_LikeSearch(String destrolenote, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destrolenote), getCValueDestrolenote(), "DestRoleNote", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destrolenote The value of destrolenote as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestrolenote_NotLikeSearch(String destrolenote, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destrolenote), getCValueDestrolenote(), "DestRoleNote", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestrolenote_IsNull() { regDestrolenote(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestrolenote_IsNotNull() { regDestrolenote(CK_ISNN, DOBJ); }

    protected void regDestrolenote(ConditionKey k, Object v) { regQ(k, v, getCValueDestrolenote(), "DestRoleNote"); }
    abstract protected ConditionValue getCValueDestrolenote();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param destcontainment The value of destcontainment as equal.
     */
    public void setDestcontainment_Equal(String destcontainment) {
        regDestcontainment(CK_EQ, fRES(destcontainment));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destcontainment The value of destcontainment as notEqual.
     */
    public void setDestcontainment_NotEqual(String destcontainment) {
        regDestcontainment(CK_NE, fRES(destcontainment));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destcontainment The value of destcontainment as greaterThan.
     */
    public void setDestcontainment_GreaterThan(String destcontainment) {
        regDestcontainment(CK_GT, fRES(destcontainment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destcontainment The value of destcontainment as lessThan.
     */
    public void setDestcontainment_LessThan(String destcontainment) {
        regDestcontainment(CK_LT, fRES(destcontainment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destcontainment The value of destcontainment as greaterEqual.
     */
    public void setDestcontainment_GreaterEqual(String destcontainment) {
        regDestcontainment(CK_GE, fRES(destcontainment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destcontainment The value of destcontainment as lessEqual.
     */
    public void setDestcontainment_LessEqual(String destcontainment) {
        regDestcontainment(CK_LE, fRES(destcontainment));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destcontainment The value of destcontainment as prefixSearch.
     */
    public void setDestcontainment_PrefixSearch(String destcontainment) {
        regDestcontainment(CK_PS, fRES(destcontainment));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param destcontainmentList The collection of destcontainment as inScope.
     */
    public void setDestcontainment_InScope(Collection<String> destcontainmentList) {
        regDestcontainment(CK_INS, cTL(destcontainmentList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destcontainment The value of destcontainment as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestcontainment_LikeSearch(String destcontainment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destcontainment), getCValueDestcontainment(), "DestContainment", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destcontainment The value of destcontainment as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestcontainment_NotLikeSearch(String destcontainment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destcontainment), getCValueDestcontainment(), "DestContainment", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestcontainment_IsNull() { regDestcontainment(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestcontainment_IsNotNull() { regDestcontainment(CK_ISNN, DOBJ); }

    protected void regDestcontainment(ConditionKey k, Object v) { regQ(k, v, getCValueDestcontainment(), "DestContainment"); }
    abstract protected ConditionValue getCValueDestcontainment();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param destisaggregate The value of destisaggregate as equal.
     */
    public void setDestisaggregate_Equal(java.lang.Integer destisaggregate) {
        regDestisaggregate(CK_EQ, destisaggregate);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param destisaggregate The value of destisaggregate as notEqual.
     */
    public void setDestisaggregate_NotEqual(java.lang.Integer destisaggregate) {
        regDestisaggregate(CK_NE, destisaggregate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param destisaggregate The value of destisaggregate as greaterThan.
     */
    public void setDestisaggregate_GreaterThan(java.lang.Integer destisaggregate) {
        regDestisaggregate(CK_GT, destisaggregate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param destisaggregate The value of destisaggregate as lessThan.
     */
    public void setDestisaggregate_LessThan(java.lang.Integer destisaggregate) {
        regDestisaggregate(CK_LT, destisaggregate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param destisaggregate The value of destisaggregate as greaterEqual.
     */
    public void setDestisaggregate_GreaterEqual(java.lang.Integer destisaggregate) {
        regDestisaggregate(CK_GE, destisaggregate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param destisaggregate The value of destisaggregate as lessEqual.
     */
    public void setDestisaggregate_LessEqual(java.lang.Integer destisaggregate) {
        regDestisaggregate(CK_LE, destisaggregate);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param destisaggregateList The collection of destisaggregate as inScope.
     */
    public void setDestisaggregate_InScope(Collection<java.lang.Integer> destisaggregateList) {
        regDestisaggregate(CK_INS, cTL(destisaggregateList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestisaggregate_IsNull() { regDestisaggregate(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestisaggregate_IsNotNull() { regDestisaggregate(CK_ISNN, DOBJ); }

    protected void regDestisaggregate(ConditionKey k, Object v) { regQ(k, v, getCValueDestisaggregate(), "DestIsAggregate"); }
    abstract protected ConditionValue getCValueDestisaggregate();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param destisordered The value of destisordered as equal.
     */
    public void setDestisordered_Equal(java.lang.Integer destisordered) {
        regDestisordered(CK_EQ, destisordered);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param destisordered The value of destisordered as notEqual.
     */
    public void setDestisordered_NotEqual(java.lang.Integer destisordered) {
        regDestisordered(CK_NE, destisordered);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param destisordered The value of destisordered as greaterThan.
     */
    public void setDestisordered_GreaterThan(java.lang.Integer destisordered) {
        regDestisordered(CK_GT, destisordered);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param destisordered The value of destisordered as lessThan.
     */
    public void setDestisordered_LessThan(java.lang.Integer destisordered) {
        regDestisordered(CK_LT, destisordered);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param destisordered The value of destisordered as greaterEqual.
     */
    public void setDestisordered_GreaterEqual(java.lang.Integer destisordered) {
        regDestisordered(CK_GE, destisordered);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param destisordered The value of destisordered as lessEqual.
     */
    public void setDestisordered_LessEqual(java.lang.Integer destisordered) {
        regDestisordered(CK_LE, destisordered);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param destisorderedList The collection of destisordered as inScope.
     */
    public void setDestisordered_InScope(Collection<java.lang.Integer> destisorderedList) {
        regDestisordered(CK_INS, cTL(destisorderedList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestisordered_IsNull() { regDestisordered(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestisordered_IsNotNull() { regDestisordered(CK_ISNN, DOBJ); }

    protected void regDestisordered(ConditionKey k, Object v) { regQ(k, v, getCValueDestisordered(), "DestIsOrdered"); }
    abstract protected ConditionValue getCValueDestisordered();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param destqualifier The value of destqualifier as equal.
     */
    public void setDestqualifier_Equal(String destqualifier) {
        regDestqualifier(CK_EQ, fRES(destqualifier));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destqualifier The value of destqualifier as notEqual.
     */
    public void setDestqualifier_NotEqual(String destqualifier) {
        regDestqualifier(CK_NE, fRES(destqualifier));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destqualifier The value of destqualifier as greaterThan.
     */
    public void setDestqualifier_GreaterThan(String destqualifier) {
        regDestqualifier(CK_GT, fRES(destqualifier));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destqualifier The value of destqualifier as lessThan.
     */
    public void setDestqualifier_LessThan(String destqualifier) {
        regDestqualifier(CK_LT, fRES(destqualifier));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destqualifier The value of destqualifier as greaterEqual.
     */
    public void setDestqualifier_GreaterEqual(String destqualifier) {
        regDestqualifier(CK_GE, fRES(destqualifier));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destqualifier The value of destqualifier as lessEqual.
     */
    public void setDestqualifier_LessEqual(String destqualifier) {
        regDestqualifier(CK_LE, fRES(destqualifier));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destqualifier The value of destqualifier as prefixSearch.
     */
    public void setDestqualifier_PrefixSearch(String destqualifier) {
        regDestqualifier(CK_PS, fRES(destqualifier));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param destqualifierList The collection of destqualifier as inScope.
     */
    public void setDestqualifier_InScope(Collection<String> destqualifierList) {
        regDestqualifier(CK_INS, cTL(destqualifierList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destqualifier The value of destqualifier as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestqualifier_LikeSearch(String destqualifier, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destqualifier), getCValueDestqualifier(), "DestQualifier", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destqualifier The value of destqualifier as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestqualifier_NotLikeSearch(String destqualifier, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destqualifier), getCValueDestqualifier(), "DestQualifier", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestqualifier_IsNull() { regDestqualifier(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestqualifier_IsNotNull() { regDestqualifier(CK_ISNN, DOBJ); }

    protected void regDestqualifier(ConditionKey k, Object v) { regQ(k, v, getCValueDestqualifier(), "DestQualifier"); }
    abstract protected ConditionValue getCValueDestqualifier();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER : FK to t_object}
     * @param startObjectId The value of startObjectId as equal.
     */
    public void setStartObjectId_Equal(java.lang.Integer startObjectId) {
        regStartObjectId(CK_EQ, startObjectId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param startObjectId The value of startObjectId as notEqual.
     */
    public void setStartObjectId_NotEqual(java.lang.Integer startObjectId) {
        regStartObjectId(CK_NE, startObjectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param startObjectId The value of startObjectId as greaterThan.
     */
    public void setStartObjectId_GreaterThan(java.lang.Integer startObjectId) {
        regStartObjectId(CK_GT, startObjectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param startObjectId The value of startObjectId as lessThan.
     */
    public void setStartObjectId_LessThan(java.lang.Integer startObjectId) {
        regStartObjectId(CK_LT, startObjectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param startObjectId The value of startObjectId as greaterEqual.
     */
    public void setStartObjectId_GreaterEqual(java.lang.Integer startObjectId) {
        regStartObjectId(CK_GE, startObjectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param startObjectId The value of startObjectId as lessEqual.
     */
    public void setStartObjectId_LessEqual(java.lang.Integer startObjectId) {
        regStartObjectId(CK_LE, startObjectId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param startObjectIdList The collection of startObjectId as inScope.
     */
    public void setStartObjectId_InScope(Collection<java.lang.Integer> startObjectIdList) {
        regStartObjectId(CK_INS, cTL(startObjectIdList));
    }

    public void inScopeTObjectByStartObjectId(SubQuery<TObjectCB> subQuery) {
        assertObjectNotNull("subQuery<TObjectCB>", subQuery);
        TObjectCB cb = new TObjectCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepStartObjectId_InScopeSubQuery_TObjectByStartObjectId(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "Start_Object_ID", "Object_ID", subQueryPropertyName);
    }
    public abstract String keepStartObjectId_InScopeSubQuery_TObjectByStartObjectId(TObjectCQ subQuery);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStartObjectId_IsNull() { regStartObjectId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStartObjectId_IsNotNull() { regStartObjectId(CK_ISNN, DOBJ); }

    protected void regStartObjectId(ConditionKey k, Object v) { regQ(k, v, getCValueStartObjectId(), "Start_Object_ID"); }
    abstract protected ConditionValue getCValueStartObjectId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER : FK to t_object}
     * @param endObjectId The value of endObjectId as equal.
     */
    public void setEndObjectId_Equal(java.lang.Integer endObjectId) {
        regEndObjectId(CK_EQ, endObjectId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param endObjectId The value of endObjectId as notEqual.
     */
    public void setEndObjectId_NotEqual(java.lang.Integer endObjectId) {
        regEndObjectId(CK_NE, endObjectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param endObjectId The value of endObjectId as greaterThan.
     */
    public void setEndObjectId_GreaterThan(java.lang.Integer endObjectId) {
        regEndObjectId(CK_GT, endObjectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param endObjectId The value of endObjectId as lessThan.
     */
    public void setEndObjectId_LessThan(java.lang.Integer endObjectId) {
        regEndObjectId(CK_LT, endObjectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param endObjectId The value of endObjectId as greaterEqual.
     */
    public void setEndObjectId_GreaterEqual(java.lang.Integer endObjectId) {
        regEndObjectId(CK_GE, endObjectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param endObjectId The value of endObjectId as lessEqual.
     */
    public void setEndObjectId_LessEqual(java.lang.Integer endObjectId) {
        regEndObjectId(CK_LE, endObjectId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param endObjectIdList The collection of endObjectId as inScope.
     */
    public void setEndObjectId_InScope(Collection<java.lang.Integer> endObjectIdList) {
        regEndObjectId(CK_INS, cTL(endObjectIdList));
    }

    public void inScopeTObjectByEndObjectId(SubQuery<TObjectCB> subQuery) {
        assertObjectNotNull("subQuery<TObjectCB>", subQuery);
        TObjectCB cb = new TObjectCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepEndObjectId_InScopeSubQuery_TObjectByEndObjectId(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "End_Object_ID", "Object_ID", subQueryPropertyName);
    }
    public abstract String keepEndObjectId_InScopeSubQuery_TObjectByEndObjectId(TObjectCQ subQuery);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEndObjectId_IsNull() { regEndObjectId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEndObjectId_IsNotNull() { regEndObjectId(CK_ISNN, DOBJ); }

    protected void regEndObjectId(ConditionKey k, Object v) { regQ(k, v, getCValueEndObjectId(), "End_Object_ID"); }
    abstract protected ConditionValue getCValueEndObjectId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param topStartLabel The value of topStartLabel as equal.
     */
    public void setTopStartLabel_Equal(String topStartLabel) {
        regTopStartLabel(CK_EQ, fRES(topStartLabel));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topStartLabel The value of topStartLabel as notEqual.
     */
    public void setTopStartLabel_NotEqual(String topStartLabel) {
        regTopStartLabel(CK_NE, fRES(topStartLabel));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topStartLabel The value of topStartLabel as greaterThan.
     */
    public void setTopStartLabel_GreaterThan(String topStartLabel) {
        regTopStartLabel(CK_GT, fRES(topStartLabel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topStartLabel The value of topStartLabel as lessThan.
     */
    public void setTopStartLabel_LessThan(String topStartLabel) {
        regTopStartLabel(CK_LT, fRES(topStartLabel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topStartLabel The value of topStartLabel as greaterEqual.
     */
    public void setTopStartLabel_GreaterEqual(String topStartLabel) {
        regTopStartLabel(CK_GE, fRES(topStartLabel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topStartLabel The value of topStartLabel as lessEqual.
     */
    public void setTopStartLabel_LessEqual(String topStartLabel) {
        regTopStartLabel(CK_LE, fRES(topStartLabel));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topStartLabel The value of topStartLabel as prefixSearch.
     */
    public void setTopStartLabel_PrefixSearch(String topStartLabel) {
        regTopStartLabel(CK_PS, fRES(topStartLabel));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param topStartLabelList The collection of topStartLabel as inScope.
     */
    public void setTopStartLabel_InScope(Collection<String> topStartLabelList) {
        regTopStartLabel(CK_INS, cTL(topStartLabelList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param topStartLabel The value of topStartLabel as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTopStartLabel_LikeSearch(String topStartLabel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(topStartLabel), getCValueTopStartLabel(), "Top_Start_Label", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param topStartLabel The value of topStartLabel as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTopStartLabel_NotLikeSearch(String topStartLabel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(topStartLabel), getCValueTopStartLabel(), "Top_Start_Label", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTopStartLabel_IsNull() { regTopStartLabel(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTopStartLabel_IsNotNull() { regTopStartLabel(CK_ISNN, DOBJ); }

    protected void regTopStartLabel(ConditionKey k, Object v) { regQ(k, v, getCValueTopStartLabel(), "Top_Start_Label"); }
    abstract protected ConditionValue getCValueTopStartLabel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param topMidLabel The value of topMidLabel as equal.
     */
    public void setTopMidLabel_Equal(String topMidLabel) {
        regTopMidLabel(CK_EQ, fRES(topMidLabel));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topMidLabel The value of topMidLabel as notEqual.
     */
    public void setTopMidLabel_NotEqual(String topMidLabel) {
        regTopMidLabel(CK_NE, fRES(topMidLabel));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topMidLabel The value of topMidLabel as greaterThan.
     */
    public void setTopMidLabel_GreaterThan(String topMidLabel) {
        regTopMidLabel(CK_GT, fRES(topMidLabel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topMidLabel The value of topMidLabel as lessThan.
     */
    public void setTopMidLabel_LessThan(String topMidLabel) {
        regTopMidLabel(CK_LT, fRES(topMidLabel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topMidLabel The value of topMidLabel as greaterEqual.
     */
    public void setTopMidLabel_GreaterEqual(String topMidLabel) {
        regTopMidLabel(CK_GE, fRES(topMidLabel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topMidLabel The value of topMidLabel as lessEqual.
     */
    public void setTopMidLabel_LessEqual(String topMidLabel) {
        regTopMidLabel(CK_LE, fRES(topMidLabel));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topMidLabel The value of topMidLabel as prefixSearch.
     */
    public void setTopMidLabel_PrefixSearch(String topMidLabel) {
        regTopMidLabel(CK_PS, fRES(topMidLabel));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param topMidLabelList The collection of topMidLabel as inScope.
     */
    public void setTopMidLabel_InScope(Collection<String> topMidLabelList) {
        regTopMidLabel(CK_INS, cTL(topMidLabelList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param topMidLabel The value of topMidLabel as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTopMidLabel_LikeSearch(String topMidLabel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(topMidLabel), getCValueTopMidLabel(), "Top_Mid_Label", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param topMidLabel The value of topMidLabel as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTopMidLabel_NotLikeSearch(String topMidLabel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(topMidLabel), getCValueTopMidLabel(), "Top_Mid_Label", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTopMidLabel_IsNull() { regTopMidLabel(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTopMidLabel_IsNotNull() { regTopMidLabel(CK_ISNN, DOBJ); }

    protected void regTopMidLabel(ConditionKey k, Object v) { regQ(k, v, getCValueTopMidLabel(), "Top_Mid_Label"); }
    abstract protected ConditionValue getCValueTopMidLabel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param topEndLabel The value of topEndLabel as equal.
     */
    public void setTopEndLabel_Equal(String topEndLabel) {
        regTopEndLabel(CK_EQ, fRES(topEndLabel));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topEndLabel The value of topEndLabel as notEqual.
     */
    public void setTopEndLabel_NotEqual(String topEndLabel) {
        regTopEndLabel(CK_NE, fRES(topEndLabel));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topEndLabel The value of topEndLabel as greaterThan.
     */
    public void setTopEndLabel_GreaterThan(String topEndLabel) {
        regTopEndLabel(CK_GT, fRES(topEndLabel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topEndLabel The value of topEndLabel as lessThan.
     */
    public void setTopEndLabel_LessThan(String topEndLabel) {
        regTopEndLabel(CK_LT, fRES(topEndLabel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topEndLabel The value of topEndLabel as greaterEqual.
     */
    public void setTopEndLabel_GreaterEqual(String topEndLabel) {
        regTopEndLabel(CK_GE, fRES(topEndLabel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topEndLabel The value of topEndLabel as lessEqual.
     */
    public void setTopEndLabel_LessEqual(String topEndLabel) {
        regTopEndLabel(CK_LE, fRES(topEndLabel));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param topEndLabel The value of topEndLabel as prefixSearch.
     */
    public void setTopEndLabel_PrefixSearch(String topEndLabel) {
        regTopEndLabel(CK_PS, fRES(topEndLabel));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param topEndLabelList The collection of topEndLabel as inScope.
     */
    public void setTopEndLabel_InScope(Collection<String> topEndLabelList) {
        regTopEndLabel(CK_INS, cTL(topEndLabelList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param topEndLabel The value of topEndLabel as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTopEndLabel_LikeSearch(String topEndLabel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(topEndLabel), getCValueTopEndLabel(), "Top_End_Label", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param topEndLabel The value of topEndLabel as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTopEndLabel_NotLikeSearch(String topEndLabel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(topEndLabel), getCValueTopEndLabel(), "Top_End_Label", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTopEndLabel_IsNull() { regTopEndLabel(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTopEndLabel_IsNotNull() { regTopEndLabel(CK_ISNN, DOBJ); }

    protected void regTopEndLabel(ConditionKey k, Object v) { regQ(k, v, getCValueTopEndLabel(), "Top_End_Label"); }
    abstract protected ConditionValue getCValueTopEndLabel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param btmStartLabel The value of btmStartLabel as equal.
     */
    public void setBtmStartLabel_Equal(String btmStartLabel) {
        regBtmStartLabel(CK_EQ, fRES(btmStartLabel));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmStartLabel The value of btmStartLabel as notEqual.
     */
    public void setBtmStartLabel_NotEqual(String btmStartLabel) {
        regBtmStartLabel(CK_NE, fRES(btmStartLabel));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmStartLabel The value of btmStartLabel as greaterThan.
     */
    public void setBtmStartLabel_GreaterThan(String btmStartLabel) {
        regBtmStartLabel(CK_GT, fRES(btmStartLabel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmStartLabel The value of btmStartLabel as lessThan.
     */
    public void setBtmStartLabel_LessThan(String btmStartLabel) {
        regBtmStartLabel(CK_LT, fRES(btmStartLabel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmStartLabel The value of btmStartLabel as greaterEqual.
     */
    public void setBtmStartLabel_GreaterEqual(String btmStartLabel) {
        regBtmStartLabel(CK_GE, fRES(btmStartLabel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmStartLabel The value of btmStartLabel as lessEqual.
     */
    public void setBtmStartLabel_LessEqual(String btmStartLabel) {
        regBtmStartLabel(CK_LE, fRES(btmStartLabel));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmStartLabel The value of btmStartLabel as prefixSearch.
     */
    public void setBtmStartLabel_PrefixSearch(String btmStartLabel) {
        regBtmStartLabel(CK_PS, fRES(btmStartLabel));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param btmStartLabelList The collection of btmStartLabel as inScope.
     */
    public void setBtmStartLabel_InScope(Collection<String> btmStartLabelList) {
        regBtmStartLabel(CK_INS, cTL(btmStartLabelList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param btmStartLabel The value of btmStartLabel as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBtmStartLabel_LikeSearch(String btmStartLabel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(btmStartLabel), getCValueBtmStartLabel(), "Btm_Start_Label", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param btmStartLabel The value of btmStartLabel as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBtmStartLabel_NotLikeSearch(String btmStartLabel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(btmStartLabel), getCValueBtmStartLabel(), "Btm_Start_Label", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBtmStartLabel_IsNull() { regBtmStartLabel(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBtmStartLabel_IsNotNull() { regBtmStartLabel(CK_ISNN, DOBJ); }

    protected void regBtmStartLabel(ConditionKey k, Object v) { regQ(k, v, getCValueBtmStartLabel(), "Btm_Start_Label"); }
    abstract protected ConditionValue getCValueBtmStartLabel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param btmMidLabel The value of btmMidLabel as equal.
     */
    public void setBtmMidLabel_Equal(String btmMidLabel) {
        regBtmMidLabel(CK_EQ, fRES(btmMidLabel));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmMidLabel The value of btmMidLabel as notEqual.
     */
    public void setBtmMidLabel_NotEqual(String btmMidLabel) {
        regBtmMidLabel(CK_NE, fRES(btmMidLabel));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmMidLabel The value of btmMidLabel as greaterThan.
     */
    public void setBtmMidLabel_GreaterThan(String btmMidLabel) {
        regBtmMidLabel(CK_GT, fRES(btmMidLabel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmMidLabel The value of btmMidLabel as lessThan.
     */
    public void setBtmMidLabel_LessThan(String btmMidLabel) {
        regBtmMidLabel(CK_LT, fRES(btmMidLabel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmMidLabel The value of btmMidLabel as greaterEqual.
     */
    public void setBtmMidLabel_GreaterEqual(String btmMidLabel) {
        regBtmMidLabel(CK_GE, fRES(btmMidLabel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmMidLabel The value of btmMidLabel as lessEqual.
     */
    public void setBtmMidLabel_LessEqual(String btmMidLabel) {
        regBtmMidLabel(CK_LE, fRES(btmMidLabel));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmMidLabel The value of btmMidLabel as prefixSearch.
     */
    public void setBtmMidLabel_PrefixSearch(String btmMidLabel) {
        regBtmMidLabel(CK_PS, fRES(btmMidLabel));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param btmMidLabelList The collection of btmMidLabel as inScope.
     */
    public void setBtmMidLabel_InScope(Collection<String> btmMidLabelList) {
        regBtmMidLabel(CK_INS, cTL(btmMidLabelList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param btmMidLabel The value of btmMidLabel as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBtmMidLabel_LikeSearch(String btmMidLabel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(btmMidLabel), getCValueBtmMidLabel(), "Btm_Mid_Label", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param btmMidLabel The value of btmMidLabel as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBtmMidLabel_NotLikeSearch(String btmMidLabel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(btmMidLabel), getCValueBtmMidLabel(), "Btm_Mid_Label", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBtmMidLabel_IsNull() { regBtmMidLabel(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBtmMidLabel_IsNotNull() { regBtmMidLabel(CK_ISNN, DOBJ); }

    protected void regBtmMidLabel(ConditionKey k, Object v) { regQ(k, v, getCValueBtmMidLabel(), "Btm_Mid_Label"); }
    abstract protected ConditionValue getCValueBtmMidLabel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param btmEndLabel The value of btmEndLabel as equal.
     */
    public void setBtmEndLabel_Equal(String btmEndLabel) {
        regBtmEndLabel(CK_EQ, fRES(btmEndLabel));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmEndLabel The value of btmEndLabel as notEqual.
     */
    public void setBtmEndLabel_NotEqual(String btmEndLabel) {
        regBtmEndLabel(CK_NE, fRES(btmEndLabel));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmEndLabel The value of btmEndLabel as greaterThan.
     */
    public void setBtmEndLabel_GreaterThan(String btmEndLabel) {
        regBtmEndLabel(CK_GT, fRES(btmEndLabel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmEndLabel The value of btmEndLabel as lessThan.
     */
    public void setBtmEndLabel_LessThan(String btmEndLabel) {
        regBtmEndLabel(CK_LT, fRES(btmEndLabel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmEndLabel The value of btmEndLabel as greaterEqual.
     */
    public void setBtmEndLabel_GreaterEqual(String btmEndLabel) {
        regBtmEndLabel(CK_GE, fRES(btmEndLabel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmEndLabel The value of btmEndLabel as lessEqual.
     */
    public void setBtmEndLabel_LessEqual(String btmEndLabel) {
        regBtmEndLabel(CK_LE, fRES(btmEndLabel));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param btmEndLabel The value of btmEndLabel as prefixSearch.
     */
    public void setBtmEndLabel_PrefixSearch(String btmEndLabel) {
        regBtmEndLabel(CK_PS, fRES(btmEndLabel));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param btmEndLabelList The collection of btmEndLabel as inScope.
     */
    public void setBtmEndLabel_InScope(Collection<String> btmEndLabelList) {
        regBtmEndLabel(CK_INS, cTL(btmEndLabelList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param btmEndLabel The value of btmEndLabel as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBtmEndLabel_LikeSearch(String btmEndLabel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(btmEndLabel), getCValueBtmEndLabel(), "Btm_End_Label", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param btmEndLabel The value of btmEndLabel as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBtmEndLabel_NotLikeSearch(String btmEndLabel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(btmEndLabel), getCValueBtmEndLabel(), "Btm_End_Label", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBtmEndLabel_IsNull() { regBtmEndLabel(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBtmEndLabel_IsNotNull() { regBtmEndLabel(CK_ISNN, DOBJ); }

    protected void regBtmEndLabel(ConditionKey k, Object v) { regQ(k, v, getCValueBtmEndLabel(), "Btm_End_Label"); }
    abstract protected ConditionValue getCValueBtmEndLabel();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param startEdge The value of startEdge as equal.
     */
    public void setStartEdge_Equal(java.lang.Integer startEdge) {
        regStartEdge(CK_EQ, startEdge);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param startEdge The value of startEdge as notEqual.
     */
    public void setStartEdge_NotEqual(java.lang.Integer startEdge) {
        regStartEdge(CK_NE, startEdge);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param startEdge The value of startEdge as greaterThan.
     */
    public void setStartEdge_GreaterThan(java.lang.Integer startEdge) {
        regStartEdge(CK_GT, startEdge);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param startEdge The value of startEdge as lessThan.
     */
    public void setStartEdge_LessThan(java.lang.Integer startEdge) {
        regStartEdge(CK_LT, startEdge);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param startEdge The value of startEdge as greaterEqual.
     */
    public void setStartEdge_GreaterEqual(java.lang.Integer startEdge) {
        regStartEdge(CK_GE, startEdge);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param startEdge The value of startEdge as lessEqual.
     */
    public void setStartEdge_LessEqual(java.lang.Integer startEdge) {
        regStartEdge(CK_LE, startEdge);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param startEdgeList The collection of startEdge as inScope.
     */
    public void setStartEdge_InScope(Collection<java.lang.Integer> startEdgeList) {
        regStartEdge(CK_INS, cTL(startEdgeList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStartEdge_IsNull() { regStartEdge(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStartEdge_IsNotNull() { regStartEdge(CK_ISNN, DOBJ); }

    protected void regStartEdge(ConditionKey k, Object v) { regQ(k, v, getCValueStartEdge(), "Start_Edge"); }
    abstract protected ConditionValue getCValueStartEdge();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param endEdge The value of endEdge as equal.
     */
    public void setEndEdge_Equal(java.lang.Integer endEdge) {
        regEndEdge(CK_EQ, endEdge);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param endEdge The value of endEdge as notEqual.
     */
    public void setEndEdge_NotEqual(java.lang.Integer endEdge) {
        regEndEdge(CK_NE, endEdge);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param endEdge The value of endEdge as greaterThan.
     */
    public void setEndEdge_GreaterThan(java.lang.Integer endEdge) {
        regEndEdge(CK_GT, endEdge);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param endEdge The value of endEdge as lessThan.
     */
    public void setEndEdge_LessThan(java.lang.Integer endEdge) {
        regEndEdge(CK_LT, endEdge);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param endEdge The value of endEdge as greaterEqual.
     */
    public void setEndEdge_GreaterEqual(java.lang.Integer endEdge) {
        regEndEdge(CK_GE, endEdge);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param endEdge The value of endEdge as lessEqual.
     */
    public void setEndEdge_LessEqual(java.lang.Integer endEdge) {
        regEndEdge(CK_LE, endEdge);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param endEdgeList The collection of endEdge as inScope.
     */
    public void setEndEdge_InScope(Collection<java.lang.Integer> endEdgeList) {
        regEndEdge(CK_INS, cTL(endEdgeList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEndEdge_IsNull() { regEndEdge(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEndEdge_IsNotNull() { regEndEdge(CK_ISNN, DOBJ); }

    protected void regEndEdge(ConditionKey k, Object v) { regQ(k, v, getCValueEndEdge(), "End_Edge"); }
    abstract protected ConditionValue getCValueEndEdge();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param ptstartx The value of ptstartx as equal.
     */
    public void setPtstartx_Equal(java.lang.Integer ptstartx) {
        regPtstartx(CK_EQ, ptstartx);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param ptstartx The value of ptstartx as notEqual.
     */
    public void setPtstartx_NotEqual(java.lang.Integer ptstartx) {
        regPtstartx(CK_NE, ptstartx);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param ptstartx The value of ptstartx as greaterThan.
     */
    public void setPtstartx_GreaterThan(java.lang.Integer ptstartx) {
        regPtstartx(CK_GT, ptstartx);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param ptstartx The value of ptstartx as lessThan.
     */
    public void setPtstartx_LessThan(java.lang.Integer ptstartx) {
        regPtstartx(CK_LT, ptstartx);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param ptstartx The value of ptstartx as greaterEqual.
     */
    public void setPtstartx_GreaterEqual(java.lang.Integer ptstartx) {
        regPtstartx(CK_GE, ptstartx);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param ptstartx The value of ptstartx as lessEqual.
     */
    public void setPtstartx_LessEqual(java.lang.Integer ptstartx) {
        regPtstartx(CK_LE, ptstartx);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param ptstartxList The collection of ptstartx as inScope.
     */
    public void setPtstartx_InScope(Collection<java.lang.Integer> ptstartxList) {
        regPtstartx(CK_INS, cTL(ptstartxList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPtstartx_IsNull() { regPtstartx(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPtstartx_IsNotNull() { regPtstartx(CK_ISNN, DOBJ); }

    protected void regPtstartx(ConditionKey k, Object v) { regQ(k, v, getCValuePtstartx(), "PtStartX"); }
    abstract protected ConditionValue getCValuePtstartx();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param ptstarty The value of ptstarty as equal.
     */
    public void setPtstarty_Equal(java.lang.Integer ptstarty) {
        regPtstarty(CK_EQ, ptstarty);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param ptstarty The value of ptstarty as notEqual.
     */
    public void setPtstarty_NotEqual(java.lang.Integer ptstarty) {
        regPtstarty(CK_NE, ptstarty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param ptstarty The value of ptstarty as greaterThan.
     */
    public void setPtstarty_GreaterThan(java.lang.Integer ptstarty) {
        regPtstarty(CK_GT, ptstarty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param ptstarty The value of ptstarty as lessThan.
     */
    public void setPtstarty_LessThan(java.lang.Integer ptstarty) {
        regPtstarty(CK_LT, ptstarty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param ptstarty The value of ptstarty as greaterEqual.
     */
    public void setPtstarty_GreaterEqual(java.lang.Integer ptstarty) {
        regPtstarty(CK_GE, ptstarty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param ptstarty The value of ptstarty as lessEqual.
     */
    public void setPtstarty_LessEqual(java.lang.Integer ptstarty) {
        regPtstarty(CK_LE, ptstarty);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param ptstartyList The collection of ptstarty as inScope.
     */
    public void setPtstarty_InScope(Collection<java.lang.Integer> ptstartyList) {
        regPtstarty(CK_INS, cTL(ptstartyList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPtstarty_IsNull() { regPtstarty(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPtstarty_IsNotNull() { regPtstarty(CK_ISNN, DOBJ); }

    protected void regPtstarty(ConditionKey k, Object v) { regQ(k, v, getCValuePtstarty(), "PtStartY"); }
    abstract protected ConditionValue getCValuePtstarty();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param ptendx The value of ptendx as equal.
     */
    public void setPtendx_Equal(java.lang.Integer ptendx) {
        regPtendx(CK_EQ, ptendx);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param ptendx The value of ptendx as notEqual.
     */
    public void setPtendx_NotEqual(java.lang.Integer ptendx) {
        regPtendx(CK_NE, ptendx);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param ptendx The value of ptendx as greaterThan.
     */
    public void setPtendx_GreaterThan(java.lang.Integer ptendx) {
        regPtendx(CK_GT, ptendx);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param ptendx The value of ptendx as lessThan.
     */
    public void setPtendx_LessThan(java.lang.Integer ptendx) {
        regPtendx(CK_LT, ptendx);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param ptendx The value of ptendx as greaterEqual.
     */
    public void setPtendx_GreaterEqual(java.lang.Integer ptendx) {
        regPtendx(CK_GE, ptendx);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param ptendx The value of ptendx as lessEqual.
     */
    public void setPtendx_LessEqual(java.lang.Integer ptendx) {
        regPtendx(CK_LE, ptendx);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param ptendxList The collection of ptendx as inScope.
     */
    public void setPtendx_InScope(Collection<java.lang.Integer> ptendxList) {
        regPtendx(CK_INS, cTL(ptendxList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPtendx_IsNull() { regPtendx(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPtendx_IsNotNull() { regPtendx(CK_ISNN, DOBJ); }

    protected void regPtendx(ConditionKey k, Object v) { regQ(k, v, getCValuePtendx(), "PtEndX"); }
    abstract protected ConditionValue getCValuePtendx();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param ptendy The value of ptendy as equal.
     */
    public void setPtendy_Equal(java.lang.Integer ptendy) {
        regPtendy(CK_EQ, ptendy);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param ptendy The value of ptendy as notEqual.
     */
    public void setPtendy_NotEqual(java.lang.Integer ptendy) {
        regPtendy(CK_NE, ptendy);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param ptendy The value of ptendy as greaterThan.
     */
    public void setPtendy_GreaterThan(java.lang.Integer ptendy) {
        regPtendy(CK_GT, ptendy);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param ptendy The value of ptendy as lessThan.
     */
    public void setPtendy_LessThan(java.lang.Integer ptendy) {
        regPtendy(CK_LT, ptendy);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param ptendy The value of ptendy as greaterEqual.
     */
    public void setPtendy_GreaterEqual(java.lang.Integer ptendy) {
        regPtendy(CK_GE, ptendy);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param ptendy The value of ptendy as lessEqual.
     */
    public void setPtendy_LessEqual(java.lang.Integer ptendy) {
        regPtendy(CK_LE, ptendy);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param ptendyList The collection of ptendy as inScope.
     */
    public void setPtendy_InScope(Collection<java.lang.Integer> ptendyList) {
        regPtendy(CK_INS, cTL(ptendyList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPtendy_IsNull() { regPtendy(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPtendy_IsNotNull() { regPtendy(CK_ISNN, DOBJ); }

    protected void regPtendy(ConditionKey k, Object v) { regQ(k, v, getCValuePtendy(), "PtEndY"); }
    abstract protected ConditionValue getCValuePtendy();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param seqno The value of seqno as equal.
     */
    public void setSeqno_Equal(java.lang.Integer seqno) {
        regSeqno(CK_EQ, seqno);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param seqno The value of seqno as notEqual.
     */
    public void setSeqno_NotEqual(java.lang.Integer seqno) {
        regSeqno(CK_NE, seqno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param seqno The value of seqno as greaterThan.
     */
    public void setSeqno_GreaterThan(java.lang.Integer seqno) {
        regSeqno(CK_GT, seqno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param seqno The value of seqno as lessThan.
     */
    public void setSeqno_LessThan(java.lang.Integer seqno) {
        regSeqno(CK_LT, seqno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param seqno The value of seqno as greaterEqual.
     */
    public void setSeqno_GreaterEqual(java.lang.Integer seqno) {
        regSeqno(CK_GE, seqno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param seqno The value of seqno as lessEqual.
     */
    public void setSeqno_LessEqual(java.lang.Integer seqno) {
        regSeqno(CK_LE, seqno);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param seqnoList The collection of seqno as inScope.
     */
    public void setSeqno_InScope(Collection<java.lang.Integer> seqnoList) {
        regSeqno(CK_INS, cTL(seqnoList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSeqno_IsNull() { regSeqno(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSeqno_IsNotNull() { regSeqno(CK_ISNN, DOBJ); }

    protected void regSeqno(ConditionKey k, Object v) { regQ(k, v, getCValueSeqno(), "SeqNo"); }
    abstract protected ConditionValue getCValueSeqno();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param headstyle The value of headstyle as equal.
     */
    public void setHeadstyle_Equal(java.lang.Integer headstyle) {
        regHeadstyle(CK_EQ, headstyle);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param headstyle The value of headstyle as notEqual.
     */
    public void setHeadstyle_NotEqual(java.lang.Integer headstyle) {
        regHeadstyle(CK_NE, headstyle);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param headstyle The value of headstyle as greaterThan.
     */
    public void setHeadstyle_GreaterThan(java.lang.Integer headstyle) {
        regHeadstyle(CK_GT, headstyle);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param headstyle The value of headstyle as lessThan.
     */
    public void setHeadstyle_LessThan(java.lang.Integer headstyle) {
        regHeadstyle(CK_LT, headstyle);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param headstyle The value of headstyle as greaterEqual.
     */
    public void setHeadstyle_GreaterEqual(java.lang.Integer headstyle) {
        regHeadstyle(CK_GE, headstyle);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param headstyle The value of headstyle as lessEqual.
     */
    public void setHeadstyle_LessEqual(java.lang.Integer headstyle) {
        regHeadstyle(CK_LE, headstyle);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param headstyleList The collection of headstyle as inScope.
     */
    public void setHeadstyle_InScope(Collection<java.lang.Integer> headstyleList) {
        regHeadstyle(CK_INS, cTL(headstyleList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setHeadstyle_IsNull() { regHeadstyle(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setHeadstyle_IsNotNull() { regHeadstyle(CK_ISNN, DOBJ); }

    protected void regHeadstyle(ConditionKey k, Object v) { regQ(k, v, getCValueHeadstyle(), "HeadStyle"); }
    abstract protected ConditionValue getCValueHeadstyle();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param linestyle The value of linestyle as equal.
     */
    public void setLinestyle_Equal(java.lang.Integer linestyle) {
        regLinestyle(CK_EQ, linestyle);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param linestyle The value of linestyle as notEqual.
     */
    public void setLinestyle_NotEqual(java.lang.Integer linestyle) {
        regLinestyle(CK_NE, linestyle);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param linestyle The value of linestyle as greaterThan.
     */
    public void setLinestyle_GreaterThan(java.lang.Integer linestyle) {
        regLinestyle(CK_GT, linestyle);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param linestyle The value of linestyle as lessThan.
     */
    public void setLinestyle_LessThan(java.lang.Integer linestyle) {
        regLinestyle(CK_LT, linestyle);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param linestyle The value of linestyle as greaterEqual.
     */
    public void setLinestyle_GreaterEqual(java.lang.Integer linestyle) {
        regLinestyle(CK_GE, linestyle);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param linestyle The value of linestyle as lessEqual.
     */
    public void setLinestyle_LessEqual(java.lang.Integer linestyle) {
        regLinestyle(CK_LE, linestyle);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param linestyleList The collection of linestyle as inScope.
     */
    public void setLinestyle_InScope(Collection<java.lang.Integer> linestyleList) {
        regLinestyle(CK_INS, cTL(linestyleList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setLinestyle_IsNull() { regLinestyle(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setLinestyle_IsNotNull() { regLinestyle(CK_ISNN, DOBJ); }

    protected void regLinestyle(ConditionKey k, Object v) { regQ(k, v, getCValueLinestyle(), "LineStyle"); }
    abstract protected ConditionValue getCValueLinestyle();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param routestyle The value of routestyle as equal.
     */
    public void setRoutestyle_Equal(java.lang.Integer routestyle) {
        regRoutestyle(CK_EQ, routestyle);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param routestyle The value of routestyle as notEqual.
     */
    public void setRoutestyle_NotEqual(java.lang.Integer routestyle) {
        regRoutestyle(CK_NE, routestyle);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param routestyle The value of routestyle as greaterThan.
     */
    public void setRoutestyle_GreaterThan(java.lang.Integer routestyle) {
        regRoutestyle(CK_GT, routestyle);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param routestyle The value of routestyle as lessThan.
     */
    public void setRoutestyle_LessThan(java.lang.Integer routestyle) {
        regRoutestyle(CK_LT, routestyle);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param routestyle The value of routestyle as greaterEqual.
     */
    public void setRoutestyle_GreaterEqual(java.lang.Integer routestyle) {
        regRoutestyle(CK_GE, routestyle);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param routestyle The value of routestyle as lessEqual.
     */
    public void setRoutestyle_LessEqual(java.lang.Integer routestyle) {
        regRoutestyle(CK_LE, routestyle);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param routestyleList The collection of routestyle as inScope.
     */
    public void setRoutestyle_InScope(Collection<java.lang.Integer> routestyleList) {
        regRoutestyle(CK_INS, cTL(routestyleList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRoutestyle_IsNull() { regRoutestyle(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRoutestyle_IsNotNull() { regRoutestyle(CK_ISNN, DOBJ); }

    protected void regRoutestyle(ConditionKey k, Object v) { regQ(k, v, getCValueRoutestyle(), "RouteStyle"); }
    abstract protected ConditionValue getCValueRoutestyle();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param isbold The value of isbold as equal.
     */
    public void setIsbold_Equal(java.lang.Integer isbold) {
        regIsbold(CK_EQ, isbold);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param isbold The value of isbold as notEqual.
     */
    public void setIsbold_NotEqual(java.lang.Integer isbold) {
        regIsbold(CK_NE, isbold);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param isbold The value of isbold as greaterThan.
     */
    public void setIsbold_GreaterThan(java.lang.Integer isbold) {
        regIsbold(CK_GT, isbold);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param isbold The value of isbold as lessThan.
     */
    public void setIsbold_LessThan(java.lang.Integer isbold) {
        regIsbold(CK_LT, isbold);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param isbold The value of isbold as greaterEqual.
     */
    public void setIsbold_GreaterEqual(java.lang.Integer isbold) {
        regIsbold(CK_GE, isbold);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param isbold The value of isbold as lessEqual.
     */
    public void setIsbold_LessEqual(java.lang.Integer isbold) {
        regIsbold(CK_LE, isbold);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param isboldList The collection of isbold as inScope.
     */
    public void setIsbold_InScope(Collection<java.lang.Integer> isboldList) {
        regIsbold(CK_INS, cTL(isboldList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setIsbold_IsNull() { regIsbold(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setIsbold_IsNotNull() { regIsbold(CK_ISNN, DOBJ); }

    protected void regIsbold(ConditionKey k, Object v) { regQ(k, v, getCValueIsbold(), "IsBold"); }
    abstract protected ConditionValue getCValueIsbold();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param linecolor The value of linecolor as equal.
     */
    public void setLinecolor_Equal(java.lang.Integer linecolor) {
        regLinecolor(CK_EQ, linecolor);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param linecolor The value of linecolor as notEqual.
     */
    public void setLinecolor_NotEqual(java.lang.Integer linecolor) {
        regLinecolor(CK_NE, linecolor);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param linecolor The value of linecolor as greaterThan.
     */
    public void setLinecolor_GreaterThan(java.lang.Integer linecolor) {
        regLinecolor(CK_GT, linecolor);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param linecolor The value of linecolor as lessThan.
     */
    public void setLinecolor_LessThan(java.lang.Integer linecolor) {
        regLinecolor(CK_LT, linecolor);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param linecolor The value of linecolor as greaterEqual.
     */
    public void setLinecolor_GreaterEqual(java.lang.Integer linecolor) {
        regLinecolor(CK_GE, linecolor);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param linecolor The value of linecolor as lessEqual.
     */
    public void setLinecolor_LessEqual(java.lang.Integer linecolor) {
        regLinecolor(CK_LE, linecolor);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param linecolorList The collection of linecolor as inScope.
     */
    public void setLinecolor_InScope(Collection<java.lang.Integer> linecolorList) {
        regLinecolor(CK_INS, cTL(linecolorList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setLinecolor_IsNull() { regLinecolor(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setLinecolor_IsNotNull() { regLinecolor(CK_ISNN, DOBJ); }

    protected void regLinecolor(ConditionKey k, Object v) { regQ(k, v, getCValueLinecolor(), "LineColor"); }
    abstract protected ConditionValue getCValueLinecolor();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param stereotype The value of stereotype as equal.
     */
    public void setStereotype_Equal(String stereotype) {
        regStereotype(CK_EQ, fRES(stereotype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as notEqual.
     */
    public void setStereotype_NotEqual(String stereotype) {
        regStereotype(CK_NE, fRES(stereotype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as greaterThan.
     */
    public void setStereotype_GreaterThan(String stereotype) {
        regStereotype(CK_GT, fRES(stereotype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as lessThan.
     */
    public void setStereotype_LessThan(String stereotype) {
        regStereotype(CK_LT, fRES(stereotype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as greaterEqual.
     */
    public void setStereotype_GreaterEqual(String stereotype) {
        regStereotype(CK_GE, fRES(stereotype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as lessEqual.
     */
    public void setStereotype_LessEqual(String stereotype) {
        regStereotype(CK_LE, fRES(stereotype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as prefixSearch.
     */
    public void setStereotype_PrefixSearch(String stereotype) {
        regStereotype(CK_PS, fRES(stereotype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stereotypeList The collection of stereotype as inScope.
     */
    public void setStereotype_InScope(Collection<String> stereotypeList) {
        regStereotype(CK_INS, cTL(stereotypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stereotype The value of stereotype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStereotype_LikeSearch(String stereotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stereotype), getCValueStereotype(), "Stereotype", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stereotype The value of stereotype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStereotype_NotLikeSearch(String stereotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stereotype), getCValueStereotype(), "Stereotype", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStereotype_IsNull() { regStereotype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStereotype_IsNotNull() { regStereotype(CK_ISNN, DOBJ); }

    protected void regStereotype(ConditionKey k, Object v) { regQ(k, v, getCValueStereotype(), "Stereotype"); }
    abstract protected ConditionValue getCValueStereotype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(1)}
     * @param virtualinheritance The value of virtualinheritance as equal.
     */
    public void setVirtualinheritance_Equal(String virtualinheritance) {
        regVirtualinheritance(CK_EQ, fRES(virtualinheritance));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param virtualinheritance The value of virtualinheritance as notEqual.
     */
    public void setVirtualinheritance_NotEqual(String virtualinheritance) {
        regVirtualinheritance(CK_NE, fRES(virtualinheritance));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param virtualinheritance The value of virtualinheritance as greaterThan.
     */
    public void setVirtualinheritance_GreaterThan(String virtualinheritance) {
        regVirtualinheritance(CK_GT, fRES(virtualinheritance));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param virtualinheritance The value of virtualinheritance as lessThan.
     */
    public void setVirtualinheritance_LessThan(String virtualinheritance) {
        regVirtualinheritance(CK_LT, fRES(virtualinheritance));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param virtualinheritance The value of virtualinheritance as greaterEqual.
     */
    public void setVirtualinheritance_GreaterEqual(String virtualinheritance) {
        regVirtualinheritance(CK_GE, fRES(virtualinheritance));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param virtualinheritance The value of virtualinheritance as lessEqual.
     */
    public void setVirtualinheritance_LessEqual(String virtualinheritance) {
        regVirtualinheritance(CK_LE, fRES(virtualinheritance));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param virtualinheritance The value of virtualinheritance as prefixSearch.
     */
    public void setVirtualinheritance_PrefixSearch(String virtualinheritance) {
        regVirtualinheritance(CK_PS, fRES(virtualinheritance));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param virtualinheritanceList The collection of virtualinheritance as inScope.
     */
    public void setVirtualinheritance_InScope(Collection<String> virtualinheritanceList) {
        regVirtualinheritance(CK_INS, cTL(virtualinheritanceList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param virtualinheritance The value of virtualinheritance as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVirtualinheritance_LikeSearch(String virtualinheritance, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(virtualinheritance), getCValueVirtualinheritance(), "VirtualInheritance", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param virtualinheritance The value of virtualinheritance as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVirtualinheritance_NotLikeSearch(String virtualinheritance, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(virtualinheritance), getCValueVirtualinheritance(), "VirtualInheritance", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setVirtualinheritance_IsNull() { regVirtualinheritance(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setVirtualinheritance_IsNotNull() { regVirtualinheritance(CK_ISNN, DOBJ); }

    protected void regVirtualinheritance(ConditionKey k, Object v) { regQ(k, v, getCValueVirtualinheritance(), "VirtualInheritance"); }
    abstract protected ConditionValue getCValueVirtualinheritance();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param linkaccess The value of linkaccess as equal.
     */
    public void setLinkaccess_Equal(String linkaccess) {
        regLinkaccess(CK_EQ, fRES(linkaccess));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param linkaccess The value of linkaccess as notEqual.
     */
    public void setLinkaccess_NotEqual(String linkaccess) {
        regLinkaccess(CK_NE, fRES(linkaccess));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param linkaccess The value of linkaccess as greaterThan.
     */
    public void setLinkaccess_GreaterThan(String linkaccess) {
        regLinkaccess(CK_GT, fRES(linkaccess));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param linkaccess The value of linkaccess as lessThan.
     */
    public void setLinkaccess_LessThan(String linkaccess) {
        regLinkaccess(CK_LT, fRES(linkaccess));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param linkaccess The value of linkaccess as greaterEqual.
     */
    public void setLinkaccess_GreaterEqual(String linkaccess) {
        regLinkaccess(CK_GE, fRES(linkaccess));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param linkaccess The value of linkaccess as lessEqual.
     */
    public void setLinkaccess_LessEqual(String linkaccess) {
        regLinkaccess(CK_LE, fRES(linkaccess));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param linkaccess The value of linkaccess as prefixSearch.
     */
    public void setLinkaccess_PrefixSearch(String linkaccess) {
        regLinkaccess(CK_PS, fRES(linkaccess));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param linkaccessList The collection of linkaccess as inScope.
     */
    public void setLinkaccess_InScope(Collection<String> linkaccessList) {
        regLinkaccess(CK_INS, cTL(linkaccessList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param linkaccess The value of linkaccess as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLinkaccess_LikeSearch(String linkaccess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(linkaccess), getCValueLinkaccess(), "LinkAccess", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param linkaccess The value of linkaccess as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLinkaccess_NotLikeSearch(String linkaccess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(linkaccess), getCValueLinkaccess(), "LinkAccess", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setLinkaccess_IsNull() { regLinkaccess(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setLinkaccess_IsNotNull() { regLinkaccess(CK_ISNN, DOBJ); }

    protected void regLinkaccess(ConditionKey k, Object v) { regQ(k, v, getCValueLinkaccess(), "LinkAccess"); }
    abstract protected ConditionValue getCValueLinkaccess();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param pdata1 The value of pdata1 as equal.
     */
    public void setPdata1_Equal(String pdata1) {
        regPdata1(CK_EQ, fRES(pdata1));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as notEqual.
     */
    public void setPdata1_NotEqual(String pdata1) {
        regPdata1(CK_NE, fRES(pdata1));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as greaterThan.
     */
    public void setPdata1_GreaterThan(String pdata1) {
        regPdata1(CK_GT, fRES(pdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as lessThan.
     */
    public void setPdata1_LessThan(String pdata1) {
        regPdata1(CK_LT, fRES(pdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as greaterEqual.
     */
    public void setPdata1_GreaterEqual(String pdata1) {
        regPdata1(CK_GE, fRES(pdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as lessEqual.
     */
    public void setPdata1_LessEqual(String pdata1) {
        regPdata1(CK_LE, fRES(pdata1));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as prefixSearch.
     */
    public void setPdata1_PrefixSearch(String pdata1) {
        regPdata1(CK_PS, fRES(pdata1));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata1List The collection of pdata1 as inScope.
     */
    public void setPdata1_InScope(Collection<String> pdata1List) {
        regPdata1(CK_INS, cTL(pdata1List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata1 The value of pdata1 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata1_LikeSearch(String pdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata1), getCValuePdata1(), "PDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata1 The value of pdata1 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata1_NotLikeSearch(String pdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata1), getCValuePdata1(), "PDATA1", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata1_IsNull() { regPdata1(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata1_IsNotNull() { regPdata1(CK_ISNN, DOBJ); }

    protected void regPdata1(ConditionKey k, Object v) { regQ(k, v, getCValuePdata1(), "PDATA1"); }
    abstract protected ConditionValue getCValuePdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param pdata2 The value of pdata2 as equal.
     */
    public void setPdata2_Equal(String pdata2) {
        regPdata2(CK_EQ, fRES(pdata2));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as notEqual.
     */
    public void setPdata2_NotEqual(String pdata2) {
        regPdata2(CK_NE, fRES(pdata2));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as greaterThan.
     */
    public void setPdata2_GreaterThan(String pdata2) {
        regPdata2(CK_GT, fRES(pdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as lessThan.
     */
    public void setPdata2_LessThan(String pdata2) {
        regPdata2(CK_LT, fRES(pdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as greaterEqual.
     */
    public void setPdata2_GreaterEqual(String pdata2) {
        regPdata2(CK_GE, fRES(pdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as lessEqual.
     */
    public void setPdata2_LessEqual(String pdata2) {
        regPdata2(CK_LE, fRES(pdata2));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as prefixSearch.
     */
    public void setPdata2_PrefixSearch(String pdata2) {
        regPdata2(CK_PS, fRES(pdata2));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata2List The collection of pdata2 as inScope.
     */
    public void setPdata2_InScope(Collection<String> pdata2List) {
        regPdata2(CK_INS, cTL(pdata2List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata2 The value of pdata2 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata2_LikeSearch(String pdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata2), getCValuePdata2(), "PDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata2 The value of pdata2 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata2_NotLikeSearch(String pdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata2), getCValuePdata2(), "PDATA2", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata2_IsNull() { regPdata2(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata2_IsNotNull() { regPdata2(CK_ISNN, DOBJ); }

    protected void regPdata2(ConditionKey k, Object v) { regQ(k, v, getCValuePdata2(), "PDATA2"); }
    abstract protected ConditionValue getCValuePdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param pdata3 The value of pdata3 as equal.
     */
    public void setPdata3_Equal(String pdata3) {
        regPdata3(CK_EQ, fRES(pdata3));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as notEqual.
     */
    public void setPdata3_NotEqual(String pdata3) {
        regPdata3(CK_NE, fRES(pdata3));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as greaterThan.
     */
    public void setPdata3_GreaterThan(String pdata3) {
        regPdata3(CK_GT, fRES(pdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as lessThan.
     */
    public void setPdata3_LessThan(String pdata3) {
        regPdata3(CK_LT, fRES(pdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as greaterEqual.
     */
    public void setPdata3_GreaterEqual(String pdata3) {
        regPdata3(CK_GE, fRES(pdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as lessEqual.
     */
    public void setPdata3_LessEqual(String pdata3) {
        regPdata3(CK_LE, fRES(pdata3));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as prefixSearch.
     */
    public void setPdata3_PrefixSearch(String pdata3) {
        regPdata3(CK_PS, fRES(pdata3));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata3List The collection of pdata3 as inScope.
     */
    public void setPdata3_InScope(Collection<String> pdata3List) {
        regPdata3(CK_INS, cTL(pdata3List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata3 The value of pdata3 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata3_LikeSearch(String pdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata3), getCValuePdata3(), "PDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata3 The value of pdata3 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata3_NotLikeSearch(String pdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata3), getCValuePdata3(), "PDATA3", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata3_IsNull() { regPdata3(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata3_IsNotNull() { regPdata3(CK_ISNN, DOBJ); }

    protected void regPdata3(ConditionKey k, Object v) { regQ(k, v, getCValuePdata3(), "PDATA3"); }
    abstract protected ConditionValue getCValuePdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param pdata4 The value of pdata4 as equal.
     */
    public void setPdata4_Equal(String pdata4) {
        regPdata4(CK_EQ, fRES(pdata4));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as notEqual.
     */
    public void setPdata4_NotEqual(String pdata4) {
        regPdata4(CK_NE, fRES(pdata4));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as greaterThan.
     */
    public void setPdata4_GreaterThan(String pdata4) {
        regPdata4(CK_GT, fRES(pdata4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as lessThan.
     */
    public void setPdata4_LessThan(String pdata4) {
        regPdata4(CK_LT, fRES(pdata4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as greaterEqual.
     */
    public void setPdata4_GreaterEqual(String pdata4) {
        regPdata4(CK_GE, fRES(pdata4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as lessEqual.
     */
    public void setPdata4_LessEqual(String pdata4) {
        regPdata4(CK_LE, fRES(pdata4));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as prefixSearch.
     */
    public void setPdata4_PrefixSearch(String pdata4) {
        regPdata4(CK_PS, fRES(pdata4));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata4List The collection of pdata4 as inScope.
     */
    public void setPdata4_InScope(Collection<String> pdata4List) {
        regPdata4(CK_INS, cTL(pdata4List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata4 The value of pdata4 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata4_LikeSearch(String pdata4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata4), getCValuePdata4(), "PDATA4", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata4 The value of pdata4 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata4_NotLikeSearch(String pdata4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata4), getCValuePdata4(), "PDATA4", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata4_IsNull() { regPdata4(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata4_IsNotNull() { regPdata4(CK_ISNN, DOBJ); }

    protected void regPdata4(ConditionKey k, Object v) { regQ(k, v, getCValuePdata4(), "PDATA4"); }
    abstract protected ConditionValue getCValuePdata4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param pdata5 The value of pdata5 as equal.
     */
    public void setPdata5_Equal(String pdata5) {
        regPdata5(CK_EQ, fRES(pdata5));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata5 The value of pdata5 as notEqual.
     */
    public void setPdata5_NotEqual(String pdata5) {
        regPdata5(CK_NE, fRES(pdata5));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata5 The value of pdata5 as greaterThan.
     */
    public void setPdata5_GreaterThan(String pdata5) {
        regPdata5(CK_GT, fRES(pdata5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata5 The value of pdata5 as lessThan.
     */
    public void setPdata5_LessThan(String pdata5) {
        regPdata5(CK_LT, fRES(pdata5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata5 The value of pdata5 as greaterEqual.
     */
    public void setPdata5_GreaterEqual(String pdata5) {
        regPdata5(CK_GE, fRES(pdata5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata5 The value of pdata5 as lessEqual.
     */
    public void setPdata5_LessEqual(String pdata5) {
        regPdata5(CK_LE, fRES(pdata5));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata5 The value of pdata5 as prefixSearch.
     */
    public void setPdata5_PrefixSearch(String pdata5) {
        regPdata5(CK_PS, fRES(pdata5));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata5List The collection of pdata5 as inScope.
     */
    public void setPdata5_InScope(Collection<String> pdata5List) {
        regPdata5(CK_INS, cTL(pdata5List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata5 The value of pdata5 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata5_LikeSearch(String pdata5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata5), getCValuePdata5(), "PDATA5", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata5 The value of pdata5 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata5_NotLikeSearch(String pdata5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata5), getCValuePdata5(), "PDATA5", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata5_IsNull() { regPdata5(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata5_IsNotNull() { regPdata5(CK_ISNN, DOBJ); }

    protected void regPdata5(ConditionKey k, Object v) { regQ(k, v, getCValuePdata5(), "PDATA5"); }
    abstract protected ConditionValue getCValuePdata5();
    
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(40)}
     * @param eaGuid The value of eaGuid as equal.
     */
    public void setEaGuid_Equal(String eaGuid) {
        regEaGuid(CK_EQ, fRES(eaGuid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as notEqual.
     */
    public void setEaGuid_NotEqual(String eaGuid) {
        regEaGuid(CK_NE, fRES(eaGuid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as greaterThan.
     */
    public void setEaGuid_GreaterThan(String eaGuid) {
        regEaGuid(CK_GT, fRES(eaGuid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as lessThan.
     */
    public void setEaGuid_LessThan(String eaGuid) {
        regEaGuid(CK_LT, fRES(eaGuid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as greaterEqual.
     */
    public void setEaGuid_GreaterEqual(String eaGuid) {
        regEaGuid(CK_GE, fRES(eaGuid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as lessEqual.
     */
    public void setEaGuid_LessEqual(String eaGuid) {
        regEaGuid(CK_LE, fRES(eaGuid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as prefixSearch.
     */
    public void setEaGuid_PrefixSearch(String eaGuid) {
        regEaGuid(CK_PS, fRES(eaGuid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuidList The collection of eaGuid as inScope.
     */
    public void setEaGuid_InScope(Collection<String> eaGuidList) {
        regEaGuid(CK_INS, cTL(eaGuidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEaGuid_LikeSearch(String eaGuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEaGuid_NotLikeSearch(String eaGuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEaGuid_IsNull() { regEaGuid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEaGuid_IsNotNull() { regEaGuid(CK_ISNN, DOBJ); }

    protected void regEaGuid(ConditionKey k, Object v) { regQ(k, v, getCValueEaGuid(), "ea_guid"); }
    abstract protected ConditionValue getCValueEaGuid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param sourceconstraint The value of sourceconstraint as equal.
     */
    public void setSourceconstraint_Equal(String sourceconstraint) {
        regSourceconstraint(CK_EQ, fRES(sourceconstraint));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceconstraint The value of sourceconstraint as notEqual.
     */
    public void setSourceconstraint_NotEqual(String sourceconstraint) {
        regSourceconstraint(CK_NE, fRES(sourceconstraint));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceconstraint The value of sourceconstraint as greaterThan.
     */
    public void setSourceconstraint_GreaterThan(String sourceconstraint) {
        regSourceconstraint(CK_GT, fRES(sourceconstraint));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceconstraint The value of sourceconstraint as lessThan.
     */
    public void setSourceconstraint_LessThan(String sourceconstraint) {
        regSourceconstraint(CK_LT, fRES(sourceconstraint));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceconstraint The value of sourceconstraint as greaterEqual.
     */
    public void setSourceconstraint_GreaterEqual(String sourceconstraint) {
        regSourceconstraint(CK_GE, fRES(sourceconstraint));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceconstraint The value of sourceconstraint as lessEqual.
     */
    public void setSourceconstraint_LessEqual(String sourceconstraint) {
        regSourceconstraint(CK_LE, fRES(sourceconstraint));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourceconstraint The value of sourceconstraint as prefixSearch.
     */
    public void setSourceconstraint_PrefixSearch(String sourceconstraint) {
        regSourceconstraint(CK_PS, fRES(sourceconstraint));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourceconstraintList The collection of sourceconstraint as inScope.
     */
    public void setSourceconstraint_InScope(Collection<String> sourceconstraintList) {
        regSourceconstraint(CK_INS, cTL(sourceconstraintList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourceconstraint The value of sourceconstraint as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourceconstraint_LikeSearch(String sourceconstraint, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceconstraint), getCValueSourceconstraint(), "SourceConstraint", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourceconstraint The value of sourceconstraint as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourceconstraint_NotLikeSearch(String sourceconstraint, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceconstraint), getCValueSourceconstraint(), "SourceConstraint", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourceconstraint_IsNull() { regSourceconstraint(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourceconstraint_IsNotNull() { regSourceconstraint(CK_ISNN, DOBJ); }

    protected void regSourceconstraint(ConditionKey k, Object v) { regQ(k, v, getCValueSourceconstraint(), "SourceConstraint"); }
    abstract protected ConditionValue getCValueSourceconstraint();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param destconstraint The value of destconstraint as equal.
     */
    public void setDestconstraint_Equal(String destconstraint) {
        regDestconstraint(CK_EQ, fRES(destconstraint));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destconstraint The value of destconstraint as notEqual.
     */
    public void setDestconstraint_NotEqual(String destconstraint) {
        regDestconstraint(CK_NE, fRES(destconstraint));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destconstraint The value of destconstraint as greaterThan.
     */
    public void setDestconstraint_GreaterThan(String destconstraint) {
        regDestconstraint(CK_GT, fRES(destconstraint));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destconstraint The value of destconstraint as lessThan.
     */
    public void setDestconstraint_LessThan(String destconstraint) {
        regDestconstraint(CK_LT, fRES(destconstraint));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destconstraint The value of destconstraint as greaterEqual.
     */
    public void setDestconstraint_GreaterEqual(String destconstraint) {
        regDestconstraint(CK_GE, fRES(destconstraint));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destconstraint The value of destconstraint as lessEqual.
     */
    public void setDestconstraint_LessEqual(String destconstraint) {
        regDestconstraint(CK_LE, fRES(destconstraint));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destconstraint The value of destconstraint as prefixSearch.
     */
    public void setDestconstraint_PrefixSearch(String destconstraint) {
        regDestconstraint(CK_PS, fRES(destconstraint));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param destconstraintList The collection of destconstraint as inScope.
     */
    public void setDestconstraint_InScope(Collection<String> destconstraintList) {
        regDestconstraint(CK_INS, cTL(destconstraintList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destconstraint The value of destconstraint as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestconstraint_LikeSearch(String destconstraint, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destconstraint), getCValueDestconstraint(), "DestConstraint", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destconstraint The value of destconstraint as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestconstraint_NotLikeSearch(String destconstraint, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destconstraint), getCValueDestconstraint(), "DestConstraint", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestconstraint_IsNull() { regDestconstraint(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestconstraint_IsNotNull() { regDestconstraint(CK_ISNN, DOBJ); }

    protected void regDestconstraint(ConditionKey k, Object v) { regQ(k, v, getCValueDestconstraint(), "DestConstraint"); }
    abstract protected ConditionValue getCValueDestconstraint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param sourceisnavigable The value of sourceisnavigable as equal.
     */
    public void setSourceisnavigable_Equal(Boolean sourceisnavigable) {
        regSourceisnavigable(CK_EQ, sourceisnavigable);
    }

    protected void regSourceisnavigable(ConditionKey k, Object v) { regQ(k, v, getCValueSourceisnavigable(), "SourceIsNavigable"); }
    abstract protected ConditionValue getCValueSourceisnavigable();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param destisnavigable The value of destisnavigable as equal.
     */
    public void setDestisnavigable_Equal(Boolean destisnavigable) {
        regDestisnavigable(CK_EQ, destisnavigable);
    }

    protected void regDestisnavigable(ConditionKey k, Object v) { regQ(k, v, getCValueDestisnavigable(), "DestIsNavigable"); }
    abstract protected ConditionValue getCValueDestisnavigable();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param isroot The value of isroot as equal.
     */
    public void setIsroot_Equal(Boolean isroot) {
        regIsroot(CK_EQ, isroot);
    }

    protected void regIsroot(ConditionKey k, Object v) { regQ(k, v, getCValueIsroot(), "IsRoot"); }
    abstract protected ConditionValue getCValueIsroot();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param isleaf The value of isleaf as equal.
     */
    public void setIsleaf_Equal(Boolean isleaf) {
        regIsleaf(CK_EQ, isleaf);
    }

    protected void regIsleaf(ConditionKey k, Object v) { regQ(k, v, getCValueIsleaf(), "IsLeaf"); }
    abstract protected ConditionValue getCValueIsleaf();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param isspec The value of isspec as equal.
     */
    public void setIsspec_Equal(Boolean isspec) {
        regIsspec(CK_EQ, isspec);
    }

    protected void regIsspec(ConditionKey k, Object v) { regQ(k, v, getCValueIsspec(), "IsSpec"); }
    abstract protected ConditionValue getCValueIsspec();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(12)}
     * @param sourcechangeable The value of sourcechangeable as equal.
     */
    public void setSourcechangeable_Equal(String sourcechangeable) {
        regSourcechangeable(CK_EQ, fRES(sourcechangeable));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcechangeable The value of sourcechangeable as notEqual.
     */
    public void setSourcechangeable_NotEqual(String sourcechangeable) {
        regSourcechangeable(CK_NE, fRES(sourcechangeable));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcechangeable The value of sourcechangeable as greaterThan.
     */
    public void setSourcechangeable_GreaterThan(String sourcechangeable) {
        regSourcechangeable(CK_GT, fRES(sourcechangeable));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcechangeable The value of sourcechangeable as lessThan.
     */
    public void setSourcechangeable_LessThan(String sourcechangeable) {
        regSourcechangeable(CK_LT, fRES(sourcechangeable));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcechangeable The value of sourcechangeable as greaterEqual.
     */
    public void setSourcechangeable_GreaterEqual(String sourcechangeable) {
        regSourcechangeable(CK_GE, fRES(sourcechangeable));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcechangeable The value of sourcechangeable as lessEqual.
     */
    public void setSourcechangeable_LessEqual(String sourcechangeable) {
        regSourcechangeable(CK_LE, fRES(sourcechangeable));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcechangeable The value of sourcechangeable as prefixSearch.
     */
    public void setSourcechangeable_PrefixSearch(String sourcechangeable) {
        regSourcechangeable(CK_PS, fRES(sourcechangeable));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourcechangeableList The collection of sourcechangeable as inScope.
     */
    public void setSourcechangeable_InScope(Collection<String> sourcechangeableList) {
        regSourcechangeable(CK_INS, cTL(sourcechangeableList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcechangeable The value of sourcechangeable as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourcechangeable_LikeSearch(String sourcechangeable, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourcechangeable), getCValueSourcechangeable(), "SourceChangeable", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcechangeable The value of sourcechangeable as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourcechangeable_NotLikeSearch(String sourcechangeable, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourcechangeable), getCValueSourcechangeable(), "SourceChangeable", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourcechangeable_IsNull() { regSourcechangeable(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourcechangeable_IsNotNull() { regSourcechangeable(CK_ISNN, DOBJ); }

    protected void regSourcechangeable(ConditionKey k, Object v) { regQ(k, v, getCValueSourcechangeable(), "SourceChangeable"); }
    abstract protected ConditionValue getCValueSourcechangeable();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(12)}
     * @param destchangeable The value of destchangeable as equal.
     */
    public void setDestchangeable_Equal(String destchangeable) {
        regDestchangeable(CK_EQ, fRES(destchangeable));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destchangeable The value of destchangeable as notEqual.
     */
    public void setDestchangeable_NotEqual(String destchangeable) {
        regDestchangeable(CK_NE, fRES(destchangeable));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destchangeable The value of destchangeable as greaterThan.
     */
    public void setDestchangeable_GreaterThan(String destchangeable) {
        regDestchangeable(CK_GT, fRES(destchangeable));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destchangeable The value of destchangeable as lessThan.
     */
    public void setDestchangeable_LessThan(String destchangeable) {
        regDestchangeable(CK_LT, fRES(destchangeable));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destchangeable The value of destchangeable as greaterEqual.
     */
    public void setDestchangeable_GreaterEqual(String destchangeable) {
        regDestchangeable(CK_GE, fRES(destchangeable));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destchangeable The value of destchangeable as lessEqual.
     */
    public void setDestchangeable_LessEqual(String destchangeable) {
        regDestchangeable(CK_LE, fRES(destchangeable));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destchangeable The value of destchangeable as prefixSearch.
     */
    public void setDestchangeable_PrefixSearch(String destchangeable) {
        regDestchangeable(CK_PS, fRES(destchangeable));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param destchangeableList The collection of destchangeable as inScope.
     */
    public void setDestchangeable_InScope(Collection<String> destchangeableList) {
        regDestchangeable(CK_INS, cTL(destchangeableList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destchangeable The value of destchangeable as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestchangeable_LikeSearch(String destchangeable, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destchangeable), getCValueDestchangeable(), "DestChangeable", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destchangeable The value of destchangeable as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestchangeable_NotLikeSearch(String destchangeable, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destchangeable), getCValueDestchangeable(), "DestChangeable", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestchangeable_IsNull() { regDestchangeable(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestchangeable_IsNotNull() { regDestchangeable(CK_ISNN, DOBJ); }

    protected void regDestchangeable(ConditionKey k, Object v) { regQ(k, v, getCValueDestchangeable(), "DestChangeable"); }
    abstract protected ConditionValue getCValueDestchangeable();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(12)}
     * @param sourcets The value of sourcets as equal.
     */
    public void setSourcets_Equal(String sourcets) {
        regSourcets(CK_EQ, fRES(sourcets));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcets The value of sourcets as notEqual.
     */
    public void setSourcets_NotEqual(String sourcets) {
        regSourcets(CK_NE, fRES(sourcets));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcets The value of sourcets as greaterThan.
     */
    public void setSourcets_GreaterThan(String sourcets) {
        regSourcets(CK_GT, fRES(sourcets));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcets The value of sourcets as lessThan.
     */
    public void setSourcets_LessThan(String sourcets) {
        regSourcets(CK_LT, fRES(sourcets));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcets The value of sourcets as greaterEqual.
     */
    public void setSourcets_GreaterEqual(String sourcets) {
        regSourcets(CK_GE, fRES(sourcets));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcets The value of sourcets as lessEqual.
     */
    public void setSourcets_LessEqual(String sourcets) {
        regSourcets(CK_LE, fRES(sourcets));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcets The value of sourcets as prefixSearch.
     */
    public void setSourcets_PrefixSearch(String sourcets) {
        regSourcets(CK_PS, fRES(sourcets));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourcetsList The collection of sourcets as inScope.
     */
    public void setSourcets_InScope(Collection<String> sourcetsList) {
        regSourcets(CK_INS, cTL(sourcetsList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcets The value of sourcets as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourcets_LikeSearch(String sourcets, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourcets), getCValueSourcets(), "SourceTS", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcets The value of sourcets as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourcets_NotLikeSearch(String sourcets, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourcets), getCValueSourcets(), "SourceTS", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourcets_IsNull() { regSourcets(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourcets_IsNotNull() { regSourcets(CK_ISNN, DOBJ); }

    protected void regSourcets(ConditionKey k, Object v) { regQ(k, v, getCValueSourcets(), "SourceTS"); }
    abstract protected ConditionValue getCValueSourcets();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(12)}
     * @param destts The value of destts as equal.
     */
    public void setDestts_Equal(String destts) {
        regDestts(CK_EQ, fRES(destts));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destts The value of destts as notEqual.
     */
    public void setDestts_NotEqual(String destts) {
        regDestts(CK_NE, fRES(destts));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destts The value of destts as greaterThan.
     */
    public void setDestts_GreaterThan(String destts) {
        regDestts(CK_GT, fRES(destts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destts The value of destts as lessThan.
     */
    public void setDestts_LessThan(String destts) {
        regDestts(CK_LT, fRES(destts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destts The value of destts as greaterEqual.
     */
    public void setDestts_GreaterEqual(String destts) {
        regDestts(CK_GE, fRES(destts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destts The value of destts as lessEqual.
     */
    public void setDestts_LessEqual(String destts) {
        regDestts(CK_LE, fRES(destts));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param destts The value of destts as prefixSearch.
     */
    public void setDestts_PrefixSearch(String destts) {
        regDestts(CK_PS, fRES(destts));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param desttsList The collection of destts as inScope.
     */
    public void setDestts_InScope(Collection<String> desttsList) {
        regDestts(CK_INS, cTL(desttsList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destts The value of destts as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestts_LikeSearch(String destts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destts), getCValueDestts(), "DestTS", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param destts The value of destts as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestts_NotLikeSearch(String destts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destts), getCValueDestts(), "DestTS", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDestts_IsNull() { regDestts(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDestts_IsNotNull() { regDestts(CK_ISNN, DOBJ); }

    protected void regDestts(ConditionKey k, Object v) { regQ(k, v, getCValueDestts(), "DestTS"); }
    abstract protected ConditionValue getCValueDestts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param stateflags The value of stateflags as equal.
     */
    public void setStateflags_Equal(String stateflags) {
        regStateflags(CK_EQ, fRES(stateflags));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stateflags The value of stateflags as notEqual.
     */
    public void setStateflags_NotEqual(String stateflags) {
        regStateflags(CK_NE, fRES(stateflags));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stateflags The value of stateflags as greaterThan.
     */
    public void setStateflags_GreaterThan(String stateflags) {
        regStateflags(CK_GT, fRES(stateflags));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stateflags The value of stateflags as lessThan.
     */
    public void setStateflags_LessThan(String stateflags) {
        regStateflags(CK_LT, fRES(stateflags));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stateflags The value of stateflags as greaterEqual.
     */
    public void setStateflags_GreaterEqual(String stateflags) {
        regStateflags(CK_GE, fRES(stateflags));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stateflags The value of stateflags as lessEqual.
     */
    public void setStateflags_LessEqual(String stateflags) {
        regStateflags(CK_LE, fRES(stateflags));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stateflags The value of stateflags as prefixSearch.
     */
    public void setStateflags_PrefixSearch(String stateflags) {
        regStateflags(CK_PS, fRES(stateflags));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stateflagsList The collection of stateflags as inScope.
     */
    public void setStateflags_InScope(Collection<String> stateflagsList) {
        regStateflags(CK_INS, cTL(stateflagsList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stateflags The value of stateflags as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStateflags_LikeSearch(String stateflags, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stateflags), getCValueStateflags(), "StateFlags", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stateflags The value of stateflags as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStateflags_NotLikeSearch(String stateflags, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stateflags), getCValueStateflags(), "StateFlags", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStateflags_IsNull() { regStateflags(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStateflags_IsNotNull() { regStateflags(CK_ISNN, DOBJ); }

    protected void regStateflags(ConditionKey k, Object v) { regQ(k, v, getCValueStateflags(), "StateFlags"); }
    abstract protected ConditionValue getCValueStateflags();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param actionflags The value of actionflags as equal.
     */
    public void setActionflags_Equal(String actionflags) {
        regActionflags(CK_EQ, fRES(actionflags));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param actionflags The value of actionflags as notEqual.
     */
    public void setActionflags_NotEqual(String actionflags) {
        regActionflags(CK_NE, fRES(actionflags));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param actionflags The value of actionflags as greaterThan.
     */
    public void setActionflags_GreaterThan(String actionflags) {
        regActionflags(CK_GT, fRES(actionflags));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param actionflags The value of actionflags as lessThan.
     */
    public void setActionflags_LessThan(String actionflags) {
        regActionflags(CK_LT, fRES(actionflags));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param actionflags The value of actionflags as greaterEqual.
     */
    public void setActionflags_GreaterEqual(String actionflags) {
        regActionflags(CK_GE, fRES(actionflags));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param actionflags The value of actionflags as lessEqual.
     */
    public void setActionflags_LessEqual(String actionflags) {
        regActionflags(CK_LE, fRES(actionflags));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param actionflags The value of actionflags as prefixSearch.
     */
    public void setActionflags_PrefixSearch(String actionflags) {
        regActionflags(CK_PS, fRES(actionflags));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param actionflagsList The collection of actionflags as inScope.
     */
    public void setActionflags_InScope(Collection<String> actionflagsList) {
        regActionflags(CK_INS, cTL(actionflagsList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param actionflags The value of actionflags as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setActionflags_LikeSearch(String actionflags, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(actionflags), getCValueActionflags(), "ActionFlags", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param actionflags The value of actionflags as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setActionflags_NotLikeSearch(String actionflags, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(actionflags), getCValueActionflags(), "ActionFlags", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setActionflags_IsNull() { regActionflags(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setActionflags_IsNotNull() { regActionflags(CK_ISNN, DOBJ); }

    protected void regActionflags(ConditionKey k, Object v) { regQ(k, v, getCValueActionflags(), "ActionFlags"); }
    abstract protected ConditionValue getCValueActionflags();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param issignal The value of issignal as equal.
     */
    public void setIssignal_Equal(Boolean issignal) {
        regIssignal(CK_EQ, issignal);
    }

    protected void regIssignal(ConditionKey k, Object v) { regQ(k, v, getCValueIssignal(), "IsSignal"); }
    abstract protected ConditionValue getCValueIssignal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param isstimulus The value of isstimulus as equal.
     */
    public void setIsstimulus_Equal(Boolean isstimulus) {
        regIsstimulus(CK_EQ, isstimulus);
    }

    protected void regIsstimulus(ConditionKey k, Object v) { regQ(k, v, getCValueIsstimulus(), "IsStimulus"); }
    abstract protected ConditionValue getCValueIsstimulus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param dispatchaction The value of dispatchaction as equal.
     */
    public void setDispatchaction_Equal(String dispatchaction) {
        regDispatchaction(CK_EQ, fRES(dispatchaction));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param dispatchaction The value of dispatchaction as notEqual.
     */
    public void setDispatchaction_NotEqual(String dispatchaction) {
        regDispatchaction(CK_NE, fRES(dispatchaction));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param dispatchaction The value of dispatchaction as greaterThan.
     */
    public void setDispatchaction_GreaterThan(String dispatchaction) {
        regDispatchaction(CK_GT, fRES(dispatchaction));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param dispatchaction The value of dispatchaction as lessThan.
     */
    public void setDispatchaction_LessThan(String dispatchaction) {
        regDispatchaction(CK_LT, fRES(dispatchaction));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param dispatchaction The value of dispatchaction as greaterEqual.
     */
    public void setDispatchaction_GreaterEqual(String dispatchaction) {
        regDispatchaction(CK_GE, fRES(dispatchaction));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param dispatchaction The value of dispatchaction as lessEqual.
     */
    public void setDispatchaction_LessEqual(String dispatchaction) {
        regDispatchaction(CK_LE, fRES(dispatchaction));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param dispatchaction The value of dispatchaction as prefixSearch.
     */
    public void setDispatchaction_PrefixSearch(String dispatchaction) {
        regDispatchaction(CK_PS, fRES(dispatchaction));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param dispatchactionList The collection of dispatchaction as inScope.
     */
    public void setDispatchaction_InScope(Collection<String> dispatchactionList) {
        regDispatchaction(CK_INS, cTL(dispatchactionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param dispatchaction The value of dispatchaction as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDispatchaction_LikeSearch(String dispatchaction, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dispatchaction), getCValueDispatchaction(), "DispatchAction", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param dispatchaction The value of dispatchaction as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDispatchaction_NotLikeSearch(String dispatchaction, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dispatchaction), getCValueDispatchaction(), "DispatchAction", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDispatchaction_IsNull() { regDispatchaction(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDispatchaction_IsNotNull() { regDispatchaction(CK_ISNN, DOBJ); }

    protected void regDispatchaction(ConditionKey k, Object v) { regQ(k, v, getCValueDispatchaction(), "DispatchAction"); }
    abstract protected ConditionValue getCValueDispatchaction();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param target2 The value of target2 as equal.
     */
    public void setTarget2_Equal(java.lang.Integer target2) {
        regTarget2(CK_EQ, target2);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param target2 The value of target2 as notEqual.
     */
    public void setTarget2_NotEqual(java.lang.Integer target2) {
        regTarget2(CK_NE, target2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param target2 The value of target2 as greaterThan.
     */
    public void setTarget2_GreaterThan(java.lang.Integer target2) {
        regTarget2(CK_GT, target2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param target2 The value of target2 as lessThan.
     */
    public void setTarget2_LessThan(java.lang.Integer target2) {
        regTarget2(CK_LT, target2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param target2 The value of target2 as greaterEqual.
     */
    public void setTarget2_GreaterEqual(java.lang.Integer target2) {
        regTarget2(CK_GE, target2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param target2 The value of target2 as lessEqual.
     */
    public void setTarget2_LessEqual(java.lang.Integer target2) {
        regTarget2(CK_LE, target2);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param target2List The collection of target2 as inScope.
     */
    public void setTarget2_InScope(Collection<java.lang.Integer> target2List) {
        regTarget2(CK_INS, cTL(target2List));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTarget2_IsNull() { regTarget2(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTarget2_IsNotNull() { regTarget2(CK_ISNN, DOBJ); }

    protected void regTarget2(ConditionKey k, Object v) { regQ(k, v, getCValueTarget2(), "Target2"); }
    abstract protected ConditionValue getCValueTarget2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param styleex The value of styleex as equal.
     */
    public void setStyleex_Equal(String styleex) {
        regStyleex(CK_EQ, fRES(styleex));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param styleex The value of styleex as notEqual.
     */
    public void setStyleex_NotEqual(String styleex) {
        regStyleex(CK_NE, fRES(styleex));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param styleex The value of styleex as greaterThan.
     */
    public void setStyleex_GreaterThan(String styleex) {
        regStyleex(CK_GT, fRES(styleex));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param styleex The value of styleex as lessThan.
     */
    public void setStyleex_LessThan(String styleex) {
        regStyleex(CK_LT, fRES(styleex));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param styleex The value of styleex as greaterEqual.
     */
    public void setStyleex_GreaterEqual(String styleex) {
        regStyleex(CK_GE, fRES(styleex));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param styleex The value of styleex as lessEqual.
     */
    public void setStyleex_LessEqual(String styleex) {
        regStyleex(CK_LE, fRES(styleex));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param styleex The value of styleex as prefixSearch.
     */
    public void setStyleex_PrefixSearch(String styleex) {
        regStyleex(CK_PS, fRES(styleex));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleexList The collection of styleex as inScope.
     */
    public void setStyleex_InScope(Collection<String> styleexList) {
        regStyleex(CK_INS, cTL(styleexList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param styleex The value of styleex as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStyleex_LikeSearch(String styleex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(styleex), getCValueStyleex(), "StyleEx", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param styleex The value of styleex as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStyleex_NotLikeSearch(String styleex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(styleex), getCValueStyleex(), "StyleEx", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStyleex_IsNull() { regStyleex(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStyleex_IsNotNull() { regStyleex(CK_ISNN, DOBJ); }

    protected void regStyleex(ConditionKey k, Object v) { regQ(k, v, getCValueStyleex(), "StyleEx"); }
    abstract protected ConditionValue getCValueStyleex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param sourcestereotype The value of sourcestereotype as equal.
     */
    public void setSourcestereotype_Equal(String sourcestereotype) {
        regSourcestereotype(CK_EQ, fRES(sourcestereotype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcestereotype The value of sourcestereotype as notEqual.
     */
    public void setSourcestereotype_NotEqual(String sourcestereotype) {
        regSourcestereotype(CK_NE, fRES(sourcestereotype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcestereotype The value of sourcestereotype as greaterThan.
     */
    public void setSourcestereotype_GreaterThan(String sourcestereotype) {
        regSourcestereotype(CK_GT, fRES(sourcestereotype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcestereotype The value of sourcestereotype as lessThan.
     */
    public void setSourcestereotype_LessThan(String sourcestereotype) {
        regSourcestereotype(CK_LT, fRES(sourcestereotype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcestereotype The value of sourcestereotype as greaterEqual.
     */
    public void setSourcestereotype_GreaterEqual(String sourcestereotype) {
        regSourcestereotype(CK_GE, fRES(sourcestereotype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcestereotype The value of sourcestereotype as lessEqual.
     */
    public void setSourcestereotype_LessEqual(String sourcestereotype) {
        regSourcestereotype(CK_LE, fRES(sourcestereotype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcestereotype The value of sourcestereotype as prefixSearch.
     */
    public void setSourcestereotype_PrefixSearch(String sourcestereotype) {
        regSourcestereotype(CK_PS, fRES(sourcestereotype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourcestereotypeList The collection of sourcestereotype as inScope.
     */
    public void setSourcestereotype_InScope(Collection<String> sourcestereotypeList) {
        regSourcestereotype(CK_INS, cTL(sourcestereotypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcestereotype The value of sourcestereotype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourcestereotype_LikeSearch(String sourcestereotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourcestereotype), getCValueSourcestereotype(), "SourceStereotype", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcestereotype The value of sourcestereotype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourcestereotype_NotLikeSearch(String sourcestereotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourcestereotype), getCValueSourcestereotype(), "SourceStereotype", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourcestereotype_IsNull() { regSourcestereotype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourcestereotype_IsNotNull() { regSourcestereotype(CK_ISNN, DOBJ); }

    protected void regSourcestereotype(ConditionKey k, Object v) { regQ(k, v, getCValueSourcestereotype(), "SourceStereotype"); }
    abstract protected ConditionValue getCValueSourcestereotype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param deststereotype The value of deststereotype as equal.
     */
    public void setDeststereotype_Equal(String deststereotype) {
        regDeststereotype(CK_EQ, fRES(deststereotype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param deststereotype The value of deststereotype as notEqual.
     */
    public void setDeststereotype_NotEqual(String deststereotype) {
        regDeststereotype(CK_NE, fRES(deststereotype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param deststereotype The value of deststereotype as greaterThan.
     */
    public void setDeststereotype_GreaterThan(String deststereotype) {
        regDeststereotype(CK_GT, fRES(deststereotype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param deststereotype The value of deststereotype as lessThan.
     */
    public void setDeststereotype_LessThan(String deststereotype) {
        regDeststereotype(CK_LT, fRES(deststereotype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param deststereotype The value of deststereotype as greaterEqual.
     */
    public void setDeststereotype_GreaterEqual(String deststereotype) {
        regDeststereotype(CK_GE, fRES(deststereotype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param deststereotype The value of deststereotype as lessEqual.
     */
    public void setDeststereotype_LessEqual(String deststereotype) {
        regDeststereotype(CK_LE, fRES(deststereotype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param deststereotype The value of deststereotype as prefixSearch.
     */
    public void setDeststereotype_PrefixSearch(String deststereotype) {
        regDeststereotype(CK_PS, fRES(deststereotype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param deststereotypeList The collection of deststereotype as inScope.
     */
    public void setDeststereotype_InScope(Collection<String> deststereotypeList) {
        regDeststereotype(CK_INS, cTL(deststereotypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param deststereotype The value of deststereotype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeststereotype_LikeSearch(String deststereotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deststereotype), getCValueDeststereotype(), "DestStereotype", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param deststereotype The value of deststereotype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeststereotype_NotLikeSearch(String deststereotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deststereotype), getCValueDeststereotype(), "DestStereotype", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDeststereotype_IsNull() { regDeststereotype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDeststereotype_IsNotNull() { regDeststereotype(CK_ISNN, DOBJ); }

    protected void regDeststereotype(ConditionKey k, Object v) { regQ(k, v, getCValueDeststereotype(), "DestStereotype"); }
    abstract protected ConditionValue getCValueDeststereotype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param sourcestyle The value of sourcestyle as equal.
     */
    public void setSourcestyle_Equal(String sourcestyle) {
        regSourcestyle(CK_EQ, fRES(sourcestyle));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcestyle The value of sourcestyle as notEqual.
     */
    public void setSourcestyle_NotEqual(String sourcestyle) {
        regSourcestyle(CK_NE, fRES(sourcestyle));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcestyle The value of sourcestyle as greaterThan.
     */
    public void setSourcestyle_GreaterThan(String sourcestyle) {
        regSourcestyle(CK_GT, fRES(sourcestyle));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcestyle The value of sourcestyle as lessThan.
     */
    public void setSourcestyle_LessThan(String sourcestyle) {
        regSourcestyle(CK_LT, fRES(sourcestyle));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcestyle The value of sourcestyle as greaterEqual.
     */
    public void setSourcestyle_GreaterEqual(String sourcestyle) {
        regSourcestyle(CK_GE, fRES(sourcestyle));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcestyle The value of sourcestyle as lessEqual.
     */
    public void setSourcestyle_LessEqual(String sourcestyle) {
        regSourcestyle(CK_LE, fRES(sourcestyle));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param sourcestyle The value of sourcestyle as prefixSearch.
     */
    public void setSourcestyle_PrefixSearch(String sourcestyle) {
        regSourcestyle(CK_PS, fRES(sourcestyle));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param sourcestyleList The collection of sourcestyle as inScope.
     */
    public void setSourcestyle_InScope(Collection<String> sourcestyleList) {
        regSourcestyle(CK_INS, cTL(sourcestyleList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcestyle The value of sourcestyle as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourcestyle_LikeSearch(String sourcestyle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourcestyle), getCValueSourcestyle(), "SourceStyle", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param sourcestyle The value of sourcestyle as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourcestyle_NotLikeSearch(String sourcestyle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourcestyle), getCValueSourcestyle(), "SourceStyle", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSourcestyle_IsNull() { regSourcestyle(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSourcestyle_IsNotNull() { regSourcestyle(CK_ISNN, DOBJ); }

    protected void regSourcestyle(ConditionKey k, Object v) { regQ(k, v, getCValueSourcestyle(), "SourceStyle"); }
    abstract protected ConditionValue getCValueSourcestyle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param deststyle The value of deststyle as equal.
     */
    public void setDeststyle_Equal(String deststyle) {
        regDeststyle(CK_EQ, fRES(deststyle));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param deststyle The value of deststyle as notEqual.
     */
    public void setDeststyle_NotEqual(String deststyle) {
        regDeststyle(CK_NE, fRES(deststyle));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param deststyle The value of deststyle as greaterThan.
     */
    public void setDeststyle_GreaterThan(String deststyle) {
        regDeststyle(CK_GT, fRES(deststyle));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param deststyle The value of deststyle as lessThan.
     */
    public void setDeststyle_LessThan(String deststyle) {
        regDeststyle(CK_LT, fRES(deststyle));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param deststyle The value of deststyle as greaterEqual.
     */
    public void setDeststyle_GreaterEqual(String deststyle) {
        regDeststyle(CK_GE, fRES(deststyle));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param deststyle The value of deststyle as lessEqual.
     */
    public void setDeststyle_LessEqual(String deststyle) {
        regDeststyle(CK_LE, fRES(deststyle));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param deststyle The value of deststyle as prefixSearch.
     */
    public void setDeststyle_PrefixSearch(String deststyle) {
        regDeststyle(CK_PS, fRES(deststyle));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param deststyleList The collection of deststyle as inScope.
     */
    public void setDeststyle_InScope(Collection<String> deststyleList) {
        regDeststyle(CK_INS, cTL(deststyleList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param deststyle The value of deststyle as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeststyle_LikeSearch(String deststyle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deststyle), getCValueDeststyle(), "DestStyle", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param deststyle The value of deststyle as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeststyle_NotLikeSearch(String deststyle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deststyle), getCValueDeststyle(), "DestStyle", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDeststyle_IsNull() { regDeststyle(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDeststyle_IsNotNull() { regDeststyle(CK_ISNN, DOBJ); }

    protected void regDeststyle(ConditionKey k, Object v) { regQ(k, v, getCValueDeststyle(), "DestStyle"); }
    abstract protected ConditionValue getCValueDeststyle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param eventflags The value of eventflags as equal.
     */
    public void setEventflags_Equal(String eventflags) {
        regEventflags(CK_EQ, fRES(eventflags));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eventflags The value of eventflags as notEqual.
     */
    public void setEventflags_NotEqual(String eventflags) {
        regEventflags(CK_NE, fRES(eventflags));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eventflags The value of eventflags as greaterThan.
     */
    public void setEventflags_GreaterThan(String eventflags) {
        regEventflags(CK_GT, fRES(eventflags));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eventflags The value of eventflags as lessThan.
     */
    public void setEventflags_LessThan(String eventflags) {
        regEventflags(CK_LT, fRES(eventflags));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eventflags The value of eventflags as greaterEqual.
     */
    public void setEventflags_GreaterEqual(String eventflags) {
        regEventflags(CK_GE, fRES(eventflags));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eventflags The value of eventflags as lessEqual.
     */
    public void setEventflags_LessEqual(String eventflags) {
        regEventflags(CK_LE, fRES(eventflags));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eventflags The value of eventflags as prefixSearch.
     */
    public void setEventflags_PrefixSearch(String eventflags) {
        regEventflags(CK_PS, fRES(eventflags));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eventflagsList The collection of eventflags as inScope.
     */
    public void setEventflags_InScope(Collection<String> eventflagsList) {
        regEventflags(CK_INS, cTL(eventflagsList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eventflags The value of eventflags as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEventflags_LikeSearch(String eventflags, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eventflags), getCValueEventflags(), "EventFlags", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eventflags The value of eventflags as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEventflags_NotLikeSearch(String eventflags, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eventflags), getCValueEventflags(), "EventFlags", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEventflags_IsNull() { regEventflags(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEventflags_IsNotNull() { regEventflags(CK_ISNN, DOBJ); }

    protected void regEventflags(ConditionKey k, Object v) { regQ(k, v, getCValueEventflags(), "EventFlags"); }
    abstract protected ConditionValue getCValueEventflags();

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    public SSQFunction<TConnectorCB> scalar_Equal() {
        return xcreateSSQFunction("=");
    }

    public SSQFunction<TConnectorCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(">=");
    }

    public SSQFunction<TConnectorCB> scalar_GreaterThan() {
        return xcreateSSQFunction(">");
    }

    public SSQFunction<TConnectorCB> scalar_LessEqual() {
        return xcreateSSQFunction("<=");
    }
    
    public SSQFunction<TConnectorCB> scalar_LessThan() {
        return xcreateSSQFunction("<");
    }
    
    protected SSQFunction<TConnectorCB> xcreateSSQFunction(final String operand) {
        return new SSQFunction<TConnectorCB>(new SSQSetupper<TConnectorCB>() {
            public void setup(String function, SubQuery<TConnectorCB> subQuery) {
                xscalarSubQuery(function, subQuery, operand);
            }
        });
    }

    protected void xscalarSubQuery(String function, SubQuery<TConnectorCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForScalarSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarSubQuery(cb.query()); // for saving query-value.
        registerScalarSubQuery(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarSubQuery(TConnectorCQ subQuery);

    // ===================================================================================
    //                                                             MySelf InScope SubQuery
    //                                                             =======================
    /**
     * Myself InScope SubQuery. {mainly for CLOB and Union}
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScopeSubQuery(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "Connector_ID", "Connector_ID", subQueryPropertyName);
    }
    public abstract String keepMyselfInScopeSubQuery(TConnectorCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TConnectorCB.class.getName(); }
    String xCQ() { return TConnectorCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
