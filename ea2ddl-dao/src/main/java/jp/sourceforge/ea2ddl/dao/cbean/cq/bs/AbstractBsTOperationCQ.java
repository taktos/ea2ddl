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
 * The abstract condition-query of t_operation.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTOperationCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTOperationCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_operation";
    }
    
    public String getTableSqlName() {
        return "t_operation";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {PK : UQ : NotNull : COUNTER}
     * @param operationid The value of operationid as equal.
     */
    public void setOperationid_Equal(java.lang.Integer operationid) {
        regOperationid(CK_EQ, operationid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param operationid The value of operationid as notEqual.
     */
    public void setOperationid_NotEqual(java.lang.Integer operationid) {
        regOperationid(CK_NE, operationid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param operationid The value of operationid as greaterThan.
     */
    public void setOperationid_GreaterThan(java.lang.Integer operationid) {
        regOperationid(CK_GT, operationid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param operationid The value of operationid as lessThan.
     */
    public void setOperationid_LessThan(java.lang.Integer operationid) {
        regOperationid(CK_LT, operationid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param operationid The value of operationid as greaterEqual.
     */
    public void setOperationid_GreaterEqual(java.lang.Integer operationid) {
        regOperationid(CK_GE, operationid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param operationid The value of operationid as lessEqual.
     */
    public void setOperationid_LessEqual(java.lang.Integer operationid) {
        regOperationid(CK_LE, operationid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param operationidList The collection of operationid as inScope.
     */
    public void setOperationid_InScope(Collection<java.lang.Integer> operationidList) {
        regOperationid(CK_INS, cTL(operationidList));
    }

    public void inScopeTOperationparamsList(SubQuery<TOperationparamsCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationparamsCB>", subQuery);
        TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepOperationid_InScopeSubQuery_TOperationparamsList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "OperationID", "OperationID", subQueryPropertyName);
    }
    public abstract String keepOperationid_InScopeSubQuery_TOperationparamsList(TOperationparamsCQ subQuery);

    public void notInScopeTOperationparamsList(SubQuery<TOperationparamsCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationparamsCB>", subQuery);
        TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepOperationid_NotInScopeSubQuery_TOperationparamsList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "OperationID", "OperationID", subQueryPropertyName);
    }
    public abstract String keepOperationid_NotInScopeSubQuery_TOperationparamsList(TOperationparamsCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select OperationID from t_operationparams where ...)}
     * @param subQuery The sub-query of Operationid_ExistsSubQuery_TOperationparamsList for 'exists'. (NotNull)
     */
    public void existsTOperationparamsList(SubQuery<TOperationparamsCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationparamsCB>", subQuery);
        TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepOperationid_ExistsSubQuery_TOperationparamsList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "OperationID", "OperationID", subQueryPropertyName);
    }
    public abstract String keepOperationid_ExistsSubQuery_TOperationparamsList(TOperationparamsCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select OperationID from t_operationparams where ...)}
     * @param subQuery The sub-query of Operationid_NotExistsSubQuery_TOperationparamsList for 'not exists'. (NotNull)
     */
    public void notExistsTOperationparamsList(SubQuery<TOperationparamsCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationparamsCB>", subQuery);
        TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepOperationid_NotExistsSubQuery_TOperationparamsList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "OperationID", "OperationID", subQueryPropertyName);
    }
    public abstract String keepOperationid_NotExistsSubQuery_TOperationparamsList(TOperationparamsCQ subQuery);

    public void xsderiveTOperationparamsList(String function, SubQuery<TOperationparamsCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TOperationparamsCB>", subQuery);
        TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepOperationid_SpecifyDerivedReferrer_TOperationparamsList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "OperationID", "OperationID", subQueryPropertyName, aliasName);
    }
    public abstract String keepOperationid_SpecifyDerivedReferrer_TOperationparamsList(TOperationparamsCQ subQuery);

    public QDRFunction<TOperationparamsCB> derivedTOperationparamsList() {
        return xcreateQDRFunctionTOperationparamsList();
    }
    protected QDRFunction<TOperationparamsCB> xcreateQDRFunctionTOperationparamsList() {
        return new QDRFunction<TOperationparamsCB>(new QDRSetupper<TOperationparamsCB>() {
            public void setup(String function, SubQuery<TOperationparamsCB> subQuery, String operand, Object value) {
                xqderiveTOperationparamsList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveTOperationparamsList(String function, SubQuery<TOperationparamsCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<TOperationparamsCB>", subQuery);
        TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepOperationid_QueryDerivedReferrer_TOperationparamsList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepOperationid_QueryDerivedReferrer_TOperationparamsListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "OperationID", "OperationID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepOperationid_QueryDerivedReferrer_TOperationparamsList(TOperationparamsCQ subQuery);
    public abstract String keepOperationid_QueryDerivedReferrer_TOperationparamsListParameter(Object parameterValue);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setOperationid_IsNull() { regOperationid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setOperationid_IsNotNull() { regOperationid(CK_ISNN, DOBJ); }

    protected void regOperationid(ConditionKey k, Object v) { regQ(k, v, getCValueOperationid(), "OperationID"); }
    abstract protected ConditionValue getCValueOperationid();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
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

    public void inScopeTConnectorBySourceroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_InScopeSubQuery_TConnectorBySourceroleList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "Name", "SourceRole", subQueryPropertyName);
    }
    public abstract String keepName_InScopeSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery);

    public void inScopeTConnectorByDestroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_InScopeSubQuery_TConnectorByDestroleList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "Name", "DestRole", subQueryPropertyName);
    }
    public abstract String keepName_InScopeSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery);

    public void notInScopeTConnectorBySourceroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_NotInScopeSubQuery_TConnectorBySourceroleList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Name", "SourceRole", subQueryPropertyName);
    }
    public abstract String keepName_NotInScopeSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery);

    public void notInScopeTConnectorByDestroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_NotInScopeSubQuery_TConnectorByDestroleList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Name", "DestRole", subQueryPropertyName);
    }
    public abstract String keepName_NotInScopeSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select SourceRole from t_connector where ...)}
     * @param subQuery The sub-query of Name_ExistsSubQuery_TConnectorBySourceroleList for 'exists'. (NotNull)
     */
    public void existsTConnectorBySourceroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_ExistsSubQuery_TConnectorBySourceroleList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "Name", "SourceRole", subQueryPropertyName);
    }
    public abstract String keepName_ExistsSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select DestRole from t_connector where ...)}
     * @param subQuery The sub-query of Name_ExistsSubQuery_TConnectorByDestroleList for 'exists'. (NotNull)
     */
    public void existsTConnectorByDestroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_ExistsSubQuery_TConnectorByDestroleList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "Name", "DestRole", subQueryPropertyName);
    }
    public abstract String keepName_ExistsSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select SourceRole from t_connector where ...)}
     * @param subQuery The sub-query of Name_NotExistsSubQuery_TConnectorBySourceroleList for 'not exists'. (NotNull)
     */
    public void notExistsTConnectorBySourceroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_NotExistsSubQuery_TConnectorBySourceroleList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Name", "SourceRole", subQueryPropertyName);
    }
    public abstract String keepName_NotExistsSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select DestRole from t_connector where ...)}
     * @param subQuery The sub-query of Name_NotExistsSubQuery_TConnectorByDestroleList for 'not exists'. (NotNull)
     */
    public void notExistsTConnectorByDestroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_NotExistsSubQuery_TConnectorByDestroleList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Name", "DestRole", subQueryPropertyName);
    }
    public abstract String keepName_NotExistsSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery);

    public void xsderiveTConnectorBySourceroleList(String function, SubQuery<TConnectorCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepName_SpecifyDerivedReferrer_TConnectorBySourceroleList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "Name", "SourceRole", subQueryPropertyName, aliasName);
    }
    public abstract String keepName_SpecifyDerivedReferrer_TConnectorBySourceroleList(TConnectorCQ subQuery);

    public void xsderiveTConnectorByDestroleList(String function, SubQuery<TConnectorCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepName_SpecifyDerivedReferrer_TConnectorByDestroleList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "Name", "DestRole", subQueryPropertyName, aliasName);
    }
    public abstract String keepName_SpecifyDerivedReferrer_TConnectorByDestroleList(TConnectorCQ subQuery);

    public QDRFunction<TConnectorCB> derivedTConnectorBySourceroleList() {
        return xcreateQDRFunctionTConnectorBySourceroleList();
    }
    protected QDRFunction<TConnectorCB> xcreateQDRFunctionTConnectorBySourceroleList() {
        return new QDRFunction<TConnectorCB>(new QDRSetupper<TConnectorCB>() {
            public void setup(String function, SubQuery<TConnectorCB> subQuery, String operand, Object value) {
                xqderiveTConnectorBySourceroleList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveTConnectorBySourceroleList(String function, SubQuery<TConnectorCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepName_QueryDerivedReferrer_TConnectorBySourceroleList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepName_QueryDerivedReferrer_TConnectorBySourceroleListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "Name", "SourceRole", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepName_QueryDerivedReferrer_TConnectorBySourceroleList(TConnectorCQ subQuery);
    public abstract String keepName_QueryDerivedReferrer_TConnectorBySourceroleListParameter(Object parameterValue);

    public QDRFunction<TConnectorCB> derivedTConnectorByDestroleList() {
        return xcreateQDRFunctionTConnectorByDestroleList();
    }
    protected QDRFunction<TConnectorCB> xcreateQDRFunctionTConnectorByDestroleList() {
        return new QDRFunction<TConnectorCB>(new QDRSetupper<TConnectorCB>() {
            public void setup(String function, SubQuery<TConnectorCB> subQuery, String operand, Object value) {
                xqderiveTConnectorByDestroleList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveTConnectorByDestroleList(String function, SubQuery<TConnectorCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepName_QueryDerivedReferrer_TConnectorByDestroleList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepName_QueryDerivedReferrer_TConnectorByDestroleListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "Name", "DestRole", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepName_QueryDerivedReferrer_TConnectorByDestroleList(TConnectorCQ subQuery);
    public abstract String keepName_QueryDerivedReferrer_TConnectorByDestroleListParameter(Object parameterValue);

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
     * @param scope The value of scope as equal.
     */
    public void setScope_Equal(String scope) {
        regScope(CK_EQ, fRES(scope));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scope The value of scope as notEqual.
     */
    public void setScope_NotEqual(String scope) {
        regScope(CK_NE, fRES(scope));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scope The value of scope as greaterThan.
     */
    public void setScope_GreaterThan(String scope) {
        regScope(CK_GT, fRES(scope));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scope The value of scope as lessThan.
     */
    public void setScope_LessThan(String scope) {
        regScope(CK_LT, fRES(scope));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scope The value of scope as greaterEqual.
     */
    public void setScope_GreaterEqual(String scope) {
        regScope(CK_GE, fRES(scope));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scope The value of scope as lessEqual.
     */
    public void setScope_LessEqual(String scope) {
        regScope(CK_LE, fRES(scope));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scope The value of scope as prefixSearch.
     */
    public void setScope_PrefixSearch(String scope) {
        regScope(CK_PS, fRES(scope));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param scopeList The collection of scope as inScope.
     */
    public void setScope_InScope(Collection<String> scopeList) {
        regScope(CK_INS, cTL(scopeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scope The value of scope as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScope_LikeSearch(String scope, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scope), getCValueScope(), "Scope", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scope The value of scope as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScope_NotLikeSearch(String scope, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scope), getCValueScope(), "Scope", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setScope_IsNull() { regScope(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setScope_IsNotNull() { regScope(CK_ISNN, DOBJ); }

    protected void regScope(ConditionKey k, Object v) { regQ(k, v, getCValueScope(), "Scope"); }
    abstract protected ConditionValue getCValueScope();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(1)}
     * @param returnarray The value of returnarray as equal.
     */
    public void setReturnarray_Equal(String returnarray) {
        regReturnarray(CK_EQ, fRES(returnarray));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param returnarray The value of returnarray as notEqual.
     */
    public void setReturnarray_NotEqual(String returnarray) {
        regReturnarray(CK_NE, fRES(returnarray));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param returnarray The value of returnarray as greaterThan.
     */
    public void setReturnarray_GreaterThan(String returnarray) {
        regReturnarray(CK_GT, fRES(returnarray));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param returnarray The value of returnarray as lessThan.
     */
    public void setReturnarray_LessThan(String returnarray) {
        regReturnarray(CK_LT, fRES(returnarray));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param returnarray The value of returnarray as greaterEqual.
     */
    public void setReturnarray_GreaterEqual(String returnarray) {
        regReturnarray(CK_GE, fRES(returnarray));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param returnarray The value of returnarray as lessEqual.
     */
    public void setReturnarray_LessEqual(String returnarray) {
        regReturnarray(CK_LE, fRES(returnarray));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param returnarray The value of returnarray as prefixSearch.
     */
    public void setReturnarray_PrefixSearch(String returnarray) {
        regReturnarray(CK_PS, fRES(returnarray));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param returnarrayList The collection of returnarray as inScope.
     */
    public void setReturnarray_InScope(Collection<String> returnarrayList) {
        regReturnarray(CK_INS, cTL(returnarrayList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param returnarray The value of returnarray as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReturnarray_LikeSearch(String returnarray, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(returnarray), getCValueReturnarray(), "ReturnArray", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param returnarray The value of returnarray as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReturnarray_NotLikeSearch(String returnarray, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(returnarray), getCValueReturnarray(), "ReturnArray", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setReturnarray_IsNull() { regReturnarray(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setReturnarray_IsNotNull() { regReturnarray(CK_ISNN, DOBJ); }

    protected void regReturnarray(ConditionKey k, Object v) { regQ(k, v, getCValueReturnarray(), "ReturnArray"); }
    abstract protected ConditionValue getCValueReturnarray();

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
     * @param isstatic The value of isstatic as equal.
     */
    public void setIsstatic_Equal(String isstatic) {
        regIsstatic(CK_EQ, fRES(isstatic));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param isstatic The value of isstatic as notEqual.
     */
    public void setIsstatic_NotEqual(String isstatic) {
        regIsstatic(CK_NE, fRES(isstatic));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param isstatic The value of isstatic as greaterThan.
     */
    public void setIsstatic_GreaterThan(String isstatic) {
        regIsstatic(CK_GT, fRES(isstatic));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param isstatic The value of isstatic as lessThan.
     */
    public void setIsstatic_LessThan(String isstatic) {
        regIsstatic(CK_LT, fRES(isstatic));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param isstatic The value of isstatic as greaterEqual.
     */
    public void setIsstatic_GreaterEqual(String isstatic) {
        regIsstatic(CK_GE, fRES(isstatic));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param isstatic The value of isstatic as lessEqual.
     */
    public void setIsstatic_LessEqual(String isstatic) {
        regIsstatic(CK_LE, fRES(isstatic));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param isstatic The value of isstatic as prefixSearch.
     */
    public void setIsstatic_PrefixSearch(String isstatic) {
        regIsstatic(CK_PS, fRES(isstatic));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param isstaticList The collection of isstatic as inScope.
     */
    public void setIsstatic_InScope(Collection<String> isstaticList) {
        regIsstatic(CK_INS, cTL(isstaticList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param isstatic The value of isstatic as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIsstatic_LikeSearch(String isstatic, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(isstatic), getCValueIsstatic(), "IsStatic", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param isstatic The value of isstatic as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIsstatic_NotLikeSearch(String isstatic, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(isstatic), getCValueIsstatic(), "IsStatic", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setIsstatic_IsNull() { regIsstatic(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setIsstatic_IsNotNull() { regIsstatic(CK_ISNN, DOBJ); }

    protected void regIsstatic(ConditionKey k, Object v) { regQ(k, v, getCValueIsstatic(), "IsStatic"); }
    abstract protected ConditionValue getCValueIsstatic();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param concurrency The value of concurrency as equal.
     */
    public void setConcurrency_Equal(String concurrency) {
        regConcurrency(CK_EQ, fRES(concurrency));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param concurrency The value of concurrency as notEqual.
     */
    public void setConcurrency_NotEqual(String concurrency) {
        regConcurrency(CK_NE, fRES(concurrency));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param concurrency The value of concurrency as greaterThan.
     */
    public void setConcurrency_GreaterThan(String concurrency) {
        regConcurrency(CK_GT, fRES(concurrency));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param concurrency The value of concurrency as lessThan.
     */
    public void setConcurrency_LessThan(String concurrency) {
        regConcurrency(CK_LT, fRES(concurrency));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param concurrency The value of concurrency as greaterEqual.
     */
    public void setConcurrency_GreaterEqual(String concurrency) {
        regConcurrency(CK_GE, fRES(concurrency));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param concurrency The value of concurrency as lessEqual.
     */
    public void setConcurrency_LessEqual(String concurrency) {
        regConcurrency(CK_LE, fRES(concurrency));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param concurrency The value of concurrency as prefixSearch.
     */
    public void setConcurrency_PrefixSearch(String concurrency) {
        regConcurrency(CK_PS, fRES(concurrency));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param concurrencyList The collection of concurrency as inScope.
     */
    public void setConcurrency_InScope(Collection<String> concurrencyList) {
        regConcurrency(CK_INS, cTL(concurrencyList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param concurrency The value of concurrency as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConcurrency_LikeSearch(String concurrency, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(concurrency), getCValueConcurrency(), "Concurrency", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param concurrency The value of concurrency as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConcurrency_NotLikeSearch(String concurrency, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(concurrency), getCValueConcurrency(), "Concurrency", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setConcurrency_IsNull() { regConcurrency(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setConcurrency_IsNotNull() { regConcurrency(CK_ISNN, DOBJ); }

    protected void regConcurrency(ConditionKey k, Object v) { regQ(k, v, getCValueConcurrency(), "Concurrency"); }
    abstract protected ConditionValue getCValueConcurrency();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param behaviour The value of behaviour as equal.
     */
    public void setBehaviour_Equal(String behaviour) {
        regBehaviour(CK_EQ, fRES(behaviour));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param behaviour The value of behaviour as notEqual.
     */
    public void setBehaviour_NotEqual(String behaviour) {
        regBehaviour(CK_NE, fRES(behaviour));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param behaviour The value of behaviour as greaterThan.
     */
    public void setBehaviour_GreaterThan(String behaviour) {
        regBehaviour(CK_GT, fRES(behaviour));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param behaviour The value of behaviour as lessThan.
     */
    public void setBehaviour_LessThan(String behaviour) {
        regBehaviour(CK_LT, fRES(behaviour));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param behaviour The value of behaviour as greaterEqual.
     */
    public void setBehaviour_GreaterEqual(String behaviour) {
        regBehaviour(CK_GE, fRES(behaviour));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param behaviour The value of behaviour as lessEqual.
     */
    public void setBehaviour_LessEqual(String behaviour) {
        regBehaviour(CK_LE, fRES(behaviour));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param behaviour The value of behaviour as prefixSearch.
     */
    public void setBehaviour_PrefixSearch(String behaviour) {
        regBehaviour(CK_PS, fRES(behaviour));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param behaviourList The collection of behaviour as inScope.
     */
    public void setBehaviour_InScope(Collection<String> behaviourList) {
        regBehaviour(CK_INS, cTL(behaviourList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param behaviour The value of behaviour as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBehaviour_LikeSearch(String behaviour, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(behaviour), getCValueBehaviour(), "Behaviour", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param behaviour The value of behaviour as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBehaviour_NotLikeSearch(String behaviour, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(behaviour), getCValueBehaviour(), "Behaviour", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBehaviour_IsNull() { regBehaviour(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBehaviour_IsNotNull() { regBehaviour(CK_ISNN, DOBJ); }

    protected void regBehaviour(ConditionKey k, Object v) { regQ(k, v, getCValueBehaviour(), "Behaviour"); }
    abstract protected ConditionValue getCValueBehaviour();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param genoption The value of genoption as equal.
     */
    public void setGenoption_Equal(String genoption) {
        regGenoption(CK_EQ, fRES(genoption));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genoption The value of genoption as notEqual.
     */
    public void setGenoption_NotEqual(String genoption) {
        regGenoption(CK_NE, fRES(genoption));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genoption The value of genoption as greaterThan.
     */
    public void setGenoption_GreaterThan(String genoption) {
        regGenoption(CK_GT, fRES(genoption));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genoption The value of genoption as lessThan.
     */
    public void setGenoption_LessThan(String genoption) {
        regGenoption(CK_LT, fRES(genoption));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genoption The value of genoption as greaterEqual.
     */
    public void setGenoption_GreaterEqual(String genoption) {
        regGenoption(CK_GE, fRES(genoption));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genoption The value of genoption as lessEqual.
     */
    public void setGenoption_LessEqual(String genoption) {
        regGenoption(CK_LE, fRES(genoption));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genoption The value of genoption as prefixSearch.
     */
    public void setGenoption_PrefixSearch(String genoption) {
        regGenoption(CK_PS, fRES(genoption));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genoptionList The collection of genoption as inScope.
     */
    public void setGenoption_InScope(Collection<String> genoptionList) {
        regGenoption(CK_INS, cTL(genoptionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genoption The value of genoption as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenoption_LikeSearch(String genoption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genoption), getCValueGenoption(), "GenOption", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genoption The value of genoption as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenoption_NotLikeSearch(String genoption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genoption), getCValueGenoption(), "GenOption", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setGenoption_IsNull() { regGenoption(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setGenoption_IsNotNull() { regGenoption(CK_ISNN, DOBJ); }

    protected void regGenoption(ConditionKey k, Object v) { regQ(k, v, getCValueGenoption(), "GenOption"); }
    abstract protected ConditionValue getCValueGenoption();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param pos The value of pos as equal.
     */
    public void setPos_Equal(java.lang.Integer pos) {
        regPos(CK_EQ, pos);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param pos The value of pos as notEqual.
     */
    public void setPos_NotEqual(java.lang.Integer pos) {
        regPos(CK_NE, pos);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param pos The value of pos as greaterThan.
     */
    public void setPos_GreaterThan(java.lang.Integer pos) {
        regPos(CK_GT, pos);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param pos The value of pos as lessThan.
     */
    public void setPos_LessThan(java.lang.Integer pos) {
        regPos(CK_LT, pos);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param pos The value of pos as greaterEqual.
     */
    public void setPos_GreaterEqual(java.lang.Integer pos) {
        regPos(CK_GE, pos);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param pos The value of pos as lessEqual.
     */
    public void setPos_LessEqual(java.lang.Integer pos) {
        regPos(CK_LE, pos);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param posList The collection of pos as inScope.
     */
    public void setPos_InScope(Collection<java.lang.Integer> posList) {
        regPos(CK_INS, cTL(posList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPos_IsNull() { regPos(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPos_IsNotNull() { regPos(CK_ISNN, DOBJ); }

    protected void regPos(ConditionKey k, Object v) { regQ(k, v, getCValuePos(), "Pos"); }
    abstract protected ConditionValue getCValuePos();

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
     * @param pure The value of pure as equal.
     */
    public void setPure_Equal(Boolean pure) {
        regPure(CK_EQ, pure);
    }

    protected void regPure(ConditionKey k, Object v) { regQ(k, v, getCValuePure(), "Pure"); }
    abstract protected ConditionValue getCValuePure();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param classifier The value of classifier as equal.
     */
    public void setClassifier_Equal(String classifier) {
        regClassifier(CK_EQ, fRES(classifier));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as notEqual.
     */
    public void setClassifier_NotEqual(String classifier) {
        regClassifier(CK_NE, fRES(classifier));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as greaterThan.
     */
    public void setClassifier_GreaterThan(String classifier) {
        regClassifier(CK_GT, fRES(classifier));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as lessThan.
     */
    public void setClassifier_LessThan(String classifier) {
        regClassifier(CK_LT, fRES(classifier));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as greaterEqual.
     */
    public void setClassifier_GreaterEqual(String classifier) {
        regClassifier(CK_GE, fRES(classifier));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as lessEqual.
     */
    public void setClassifier_LessEqual(String classifier) {
        regClassifier(CK_LE, fRES(classifier));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as prefixSearch.
     */
    public void setClassifier_PrefixSearch(String classifier) {
        regClassifier(CK_PS, fRES(classifier));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param classifierList The collection of classifier as inScope.
     */
    public void setClassifier_InScope(Collection<String> classifierList) {
        regClassifier(CK_INS, cTL(classifierList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param classifier The value of classifier as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassifier_LikeSearch(String classifier, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(classifier), getCValueClassifier(), "Classifier", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param classifier The value of classifier as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClassifier_NotLikeSearch(String classifier, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(classifier), getCValueClassifier(), "Classifier", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setClassifier_IsNull() { regClassifier(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setClassifier_IsNotNull() { regClassifier(CK_ISNN, DOBJ); }

    protected void regClassifier(ConditionKey k, Object v) { regQ(k, v, getCValueClassifier(), "Classifier"); }
    abstract protected ConditionValue getCValueClassifier();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param code The value of code as equal.
     */
    public void setCode_Equal(String code) {
        regCode(CK_EQ, fRES(code));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param code The value of code as notEqual.
     */
    public void setCode_NotEqual(String code) {
        regCode(CK_NE, fRES(code));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param code The value of code as greaterThan.
     */
    public void setCode_GreaterThan(String code) {
        regCode(CK_GT, fRES(code));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param code The value of code as lessThan.
     */
    public void setCode_LessThan(String code) {
        regCode(CK_LT, fRES(code));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param code The value of code as greaterEqual.
     */
    public void setCode_GreaterEqual(String code) {
        regCode(CK_GE, fRES(code));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param code The value of code as lessEqual.
     */
    public void setCode_LessEqual(String code) {
        regCode(CK_LE, fRES(code));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param code The value of code as prefixSearch.
     */
    public void setCode_PrefixSearch(String code) {
        regCode(CK_PS, fRES(code));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param codeList The collection of code as inScope.
     */
    public void setCode_InScope(Collection<String> codeList) {
        regCode(CK_INS, cTL(codeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param code The value of code as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCode_LikeSearch(String code, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(code), getCValueCode(), "Code", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param code The value of code as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCode_NotLikeSearch(String code, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(code), getCValueCode(), "Code", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setCode_IsNull() { regCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setCode_IsNotNull() { regCode(CK_ISNN, DOBJ); }

    protected void regCode(ConditionKey k, Object v) { regQ(k, v, getCValueCode(), "Code"); }
    abstract protected ConditionValue getCValueCode();

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
     * @param isquery The value of isquery as equal.
     */
    public void setIsquery_Equal(Boolean isquery) {
        regIsquery(CK_EQ, isquery);
    }

    protected void regIsquery(ConditionKey k, Object v) { regQ(k, v, getCValueIsquery(), "IsQuery"); }
    abstract protected ConditionValue getCValueIsquery();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
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

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    public SSQFunction<TOperationCB> scalar_Equal() {
        return xcreateSSQFunction("=");
    }

    public SSQFunction<TOperationCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(">=");
    }

    public SSQFunction<TOperationCB> scalar_GreaterThan() {
        return xcreateSSQFunction(">");
    }

    public SSQFunction<TOperationCB> scalar_LessEqual() {
        return xcreateSSQFunction("<=");
    }
    
    public SSQFunction<TOperationCB> scalar_LessThan() {
        return xcreateSSQFunction("<");
    }
    
    protected SSQFunction<TOperationCB> xcreateSSQFunction(final String operand) {
        return new SSQFunction<TOperationCB>(new SSQSetupper<TOperationCB>() {
            public void setup(String function, SubQuery<TOperationCB> subQuery) {
                xscalarSubQuery(function, subQuery, operand);
            }
        });
    }

    protected void xscalarSubQuery(String function, SubQuery<TOperationCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForScalarSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarSubQuery(cb.query()); // for saving query-value.
        registerScalarSubQuery(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarSubQuery(TOperationCQ subQuery);

    // ===================================================================================
    //                                                             MySelf InScope SubQuery
    //                                                             =======================
    /**
     * Myself InScope SubQuery. {mainly for CLOB and Union}
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<TOperationCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScopeSubQuery(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "OperationID", "OperationID", subQueryPropertyName);
    }
    public abstract String keepMyselfInScopeSubQuery(TOperationCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TOperationCB.class.getName(); }
    String xCQ() { return TOperationCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
