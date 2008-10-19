package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_operation.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTOperationCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTOperationCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : COUNTER : NotNull}
     * @param operationid The value of operationid as equal.
     */
    public void setOperationid_Equal(java.lang.Integer operationid) {
        regOperationid(CK_EQ, operationid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param operationid The value of operationid as notEqual.
     */
    public void setOperationid_NotEqual(java.lang.Integer operationid) {
        regOperationid(CK_NE, operationid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param operationid The value of operationid as greaterThan.
     */
    public void setOperationid_GreaterThan(java.lang.Integer operationid) {
        regOperationid(CK_GT, operationid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param operationid The value of operationid as lessThan.
     */
    public void setOperationid_LessThan(java.lang.Integer operationid) {
        regOperationid(CK_LT, operationid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param operationid The value of operationid as greaterEqual.
     */
    public void setOperationid_GreaterEqual(java.lang.Integer operationid) {
        regOperationid(CK_GE, operationid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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

    /**
	 * @param tOperationparamsCBquery Query.
	 * @deprecated Please use inScopeTOperationparamsList(subQuery) method.
	 */
    public void setOperationid_InScopeSubQuery_TOperationparamsList(TOperationparamsCQ tOperationparamsCBquery) {
        String subQueryPropertyName = keepOperationid_InScopeSubQuery_TOperationparamsList(tOperationparamsCBquery);// for saving query-value.
        registerInScopeSubQuery(tOperationparamsCBquery, "OperationID", "OperationID", subQueryPropertyName);
    }
    public void inScopeTOperationparamsList(SubQuery<TOperationparamsCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationparamsCB>", subQuery);
        TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepOperationid_InScopeSubQuery_TOperationparamsList(cb.query());// for saving query-value.
        registerInScopeSubQuery(cb.query(), "OperationID", "OperationID", subQueryPropertyName);
    }
    abstract public String keepOperationid_InScopeSubQuery_TOperationparamsList(TOperationparamsCQ subQuery);

    public void notInScopeTOperationparamsList(SubQuery<TOperationparamsCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationparamsCB>", subQuery);
        TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepOperationid_NotInScopeSubQuery_TOperationparamsList(cb.query());// for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "OperationID", "OperationID", subQueryPropertyName);
    }
    abstract public String keepOperationid_NotInScopeSubQuery_TOperationparamsList(TOperationparamsCQ subQuery);

    /**
	 * @param tOperationparamsCBquery Query.
	 * @deprecated Please use existsTOperationparamsList(subQuery) method.
	 */
    public void setOperationid_ExistsSubQuery_TOperationparamsList(TOperationparamsCQ tOperationparamsCBquery) {
        String subQueryPropertyName = keepOperationid_ExistsSubQuery_TOperationparamsList(tOperationparamsCBquery);// for saving query-value.
        registerExistsSubQuery(tOperationparamsCBquery, "OperationID", "OperationID", subQueryPropertyName);
    }
    /**
     * Set up 'exists' sub-query. {exists (select OperationID from t_operationparams where ...)}
     * @param subQuery The sub-query of Operationid_ExistsSubQuery_TOperationparamsList for 'exists'. (NotNull)
     */
    public void existsTOperationparamsList(SubQuery<TOperationparamsCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationparamsCB>", subQuery);
        TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepOperationid_ExistsSubQuery_TOperationparamsList(cb.query());// for saving query-value.
        registerExistsSubQuery(cb.query(), "OperationID", "OperationID", subQueryPropertyName);
    }
    abstract public String keepOperationid_ExistsSubQuery_TOperationparamsList(TOperationparamsCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select OperationID from t_operationparams where ...)}
     * @param subQuery The sub-query of Operationid_NotExistsSubQuery_TOperationparamsList for 'not exists'. (NotNull)
     */
    public void notExistsTOperationparamsList(SubQuery<TOperationparamsCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationparamsCB>", subQuery);
        TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepOperationid_NotExistsSubQuery_TOperationparamsList(cb.query());// for saving query-value.
        registerNotExistsSubQuery(cb.query(), "OperationID", "OperationID", subQueryPropertyName);
    }
    abstract public String keepOperationid_NotExistsSubQuery_TOperationparamsList(TOperationparamsCQ subQuery);

    public void xderiveTOperationparamsList(String function, SubQuery<TOperationparamsCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TOperationparamsCB>", subQuery);
        TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForDeriveReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepOperationid_DeriveSubQuery_TOperationparamsList(cb.query());// for saving query-value.
        registerDeriveSubQuery(function, cb.query(), "OperationID", "OperationID", subQueryPropertyName, aliasName);
    }
    abstract public String keepOperationid_DeriveSubQuery_TOperationparamsList(TOperationparamsCQ subQuery);

    protected void regOperationid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueOperationid(), "OperationID", "Operationid", "operationid");
    }
    protected void registerInlineOperationid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueOperationid(), "OperationID", "Operationid", "operationid");
    }
    abstract protected ConditionValue getCValueOperationid();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param name The value of name as equal.
     */
    public void setName_Equal(String name) {
        regName(CK_EQ, fRES(name));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as notEqual.
     */
    public void setName_NotEqual(String name) {
        regName(CK_NE, fRES(name));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(String name) {
        regName(CK_PS, fRES(name));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(name), getCValueName(), "Name", "Name", "name", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param nameList The collection of name as inScope.
     */
    public void setName_InScope(Collection<String> nameList) {
        regName(CK_INS, cTL(nameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param name The collection of name as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setName_InScope(String name, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(name), getCValueName(), "Name", "Name", "name", inScopeOption);
    }

    /**
	 * @param tConnectorCBquery Query.
	 * @deprecated Please use inScopeTConnectorBySourceroleList(subQuery) method.
	 */
    public void setName_InScopeSubQuery_TConnectorBySourceroleList(TConnectorCQ tConnectorCBquery) {
        String subQueryPropertyName = keepName_InScopeSubQuery_TConnectorBySourceroleList(tConnectorCBquery);// for saving query-value.
        registerInScopeSubQuery(tConnectorCBquery, "Name", "SourceRole", subQueryPropertyName);
    }
    public void inScopeTConnectorBySourceroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_InScopeSubQuery_TConnectorBySourceroleList(cb.query());// for saving query-value.
        registerInScopeSubQuery(cb.query(), "Name", "SourceRole", subQueryPropertyName);
    }
    abstract public String keepName_InScopeSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery);

    /**
	 * @param tConnectorCBquery Query.
	 * @deprecated Please use inScopeTConnectorByDestroleList(subQuery) method.
	 */
    public void setName_InScopeSubQuery_TConnectorByDestroleList(TConnectorCQ tConnectorCBquery) {
        String subQueryPropertyName = keepName_InScopeSubQuery_TConnectorByDestroleList(tConnectorCBquery);// for saving query-value.
        registerInScopeSubQuery(tConnectorCBquery, "Name", "DestRole", subQueryPropertyName);
    }
    public void inScopeTConnectorByDestroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_InScopeSubQuery_TConnectorByDestroleList(cb.query());// for saving query-value.
        registerInScopeSubQuery(cb.query(), "Name", "DestRole", subQueryPropertyName);
    }
    abstract public String keepName_InScopeSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery);

    public void notInScopeTConnectorBySourceroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_NotInScopeSubQuery_TConnectorBySourceroleList(cb.query());// for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Name", "SourceRole", subQueryPropertyName);
    }
    abstract public String keepName_NotInScopeSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery);

    public void notInScopeTConnectorByDestroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_NotInScopeSubQuery_TConnectorByDestroleList(cb.query());// for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Name", "DestRole", subQueryPropertyName);
    }
    abstract public String keepName_NotInScopeSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery);

    /**
	 * @param tConnectorCBquery Query.
	 * @deprecated Please use existsTConnectorBySourceroleList(subQuery) method.
	 */
    public void setName_ExistsSubQuery_TConnectorBySourceroleList(TConnectorCQ tConnectorCBquery) {
        String subQueryPropertyName = keepName_ExistsSubQuery_TConnectorBySourceroleList(tConnectorCBquery);// for saving query-value.
        registerExistsSubQuery(tConnectorCBquery, "Name", "SourceRole", subQueryPropertyName);
    }
    /**
     * Set up 'exists' sub-query. {exists (select SourceRole from t_connector where ...)}
     * @param subQuery The sub-query of Name_ExistsSubQuery_TConnectorBySourceroleList for 'exists'. (NotNull)
     */
    public void existsTConnectorBySourceroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_ExistsSubQuery_TConnectorBySourceroleList(cb.query());// for saving query-value.
        registerExistsSubQuery(cb.query(), "Name", "SourceRole", subQueryPropertyName);
    }
    abstract public String keepName_ExistsSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery);

    /**
	 * @param tConnectorCBquery Query.
	 * @deprecated Please use existsTConnectorByDestroleList(subQuery) method.
	 */
    public void setName_ExistsSubQuery_TConnectorByDestroleList(TConnectorCQ tConnectorCBquery) {
        String subQueryPropertyName = keepName_ExistsSubQuery_TConnectorByDestroleList(tConnectorCBquery);// for saving query-value.
        registerExistsSubQuery(tConnectorCBquery, "Name", "DestRole", subQueryPropertyName);
    }
    /**
     * Set up 'exists' sub-query. {exists (select DestRole from t_connector where ...)}
     * @param subQuery The sub-query of Name_ExistsSubQuery_TConnectorByDestroleList for 'exists'. (NotNull)
     */
    public void existsTConnectorByDestroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_ExistsSubQuery_TConnectorByDestroleList(cb.query());// for saving query-value.
        registerExistsSubQuery(cb.query(), "Name", "DestRole", subQueryPropertyName);
    }
    abstract public String keepName_ExistsSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select SourceRole from t_connector where ...)}
     * @param subQuery The sub-query of Name_NotExistsSubQuery_TConnectorBySourceroleList for 'not exists'. (NotNull)
     */
    public void notExistsTConnectorBySourceroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_NotExistsSubQuery_TConnectorBySourceroleList(cb.query());// for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Name", "SourceRole", subQueryPropertyName);
    }
    abstract public String keepName_NotExistsSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select DestRole from t_connector where ...)}
     * @param subQuery The sub-query of Name_NotExistsSubQuery_TConnectorByDestroleList for 'not exists'. (NotNull)
     */
    public void notExistsTConnectorByDestroleList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepName_NotExistsSubQuery_TConnectorByDestroleList(cb.query());// for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Name", "DestRole", subQueryPropertyName);
    }
    abstract public String keepName_NotExistsSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery);

    public void xderiveTConnectorBySourceroleList(String function, SubQuery<TConnectorCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForDeriveReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepName_DeriveSubQuery_TConnectorBySourceroleList(cb.query());// for saving query-value.
        registerDeriveSubQuery(function, cb.query(), "Name", "SourceRole", subQueryPropertyName, aliasName);
    }
    abstract public String keepName_DeriveSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery);

    public void xderiveTConnectorByDestroleList(String function, SubQuery<TConnectorCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForDeriveReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepName_DeriveSubQuery_TConnectorByDestroleList(cb.query());// for saving query-value.
        registerDeriveSubQuery(function, cb.query(), "Name", "DestRole", subQueryPropertyName, aliasName);
    }
    abstract public String keepName_DeriveSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery);

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setName_IsNull() { regName(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DUMMY_OBJECT); }

    protected void regName(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueName(), "Name", "Name", "name");
    }
    protected void registerInlineName(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueName(), "Name", "Name", "name");
    }
    abstract protected ConditionValue getCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param scope The value of scope as equal.
     */
    public void setScope_Equal(String scope) {
        regScope(CK_EQ, fRES(scope));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param scope The value of scope as notEqual.
     */
    public void setScope_NotEqual(String scope) {
        regScope(CK_NE, fRES(scope));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param scope The value of scope as greaterThan.
     */
    public void setScope_GreaterThan(String scope) {
        regScope(CK_GT, fRES(scope));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param scope The value of scope as lessThan.
     */
    public void setScope_LessThan(String scope) {
        regScope(CK_LT, fRES(scope));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param scope The value of scope as greaterEqual.
     */
    public void setScope_GreaterEqual(String scope) {
        regScope(CK_GE, fRES(scope));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param scope The value of scope as lessEqual.
     */
    public void setScope_LessEqual(String scope) {
        regScope(CK_LE, fRES(scope));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param scope The value of scope as prefixSearch.
     */
    public void setScope_PrefixSearch(String scope) {
        regScope(CK_PS, fRES(scope));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scope The value of scope as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScope_LikeSearch(String scope, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(scope), getCValueScope(), "Scope", "Scope", "scope", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param scopeList The collection of scope as inScope.
     */
    public void setScope_InScope(Collection<String> scopeList) {
        regScope(CK_INS, cTL(scopeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param scope The collection of scope as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setScope_InScope(String scope, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(scope), getCValueScope(), "Scope", "Scope", "scope", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setScope_IsNull() { regScope(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setScope_IsNotNull() { regScope(CK_ISNN, DUMMY_OBJECT); }

    protected void regScope(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueScope(), "Scope", "Scope", "scope");
    }
    protected void registerInlineScope(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueScope(), "Scope", "Scope", "scope");
    }
    abstract protected ConditionValue getCValueScope();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(1)}
     * @param returnarray The value of returnarray as equal.
     */
    public void setReturnarray_Equal(String returnarray) {
        regReturnarray(CK_EQ, fRES(returnarray));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param returnarray The value of returnarray as notEqual.
     */
    public void setReturnarray_NotEqual(String returnarray) {
        regReturnarray(CK_NE, fRES(returnarray));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param returnarray The value of returnarray as greaterThan.
     */
    public void setReturnarray_GreaterThan(String returnarray) {
        regReturnarray(CK_GT, fRES(returnarray));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param returnarray The value of returnarray as lessThan.
     */
    public void setReturnarray_LessThan(String returnarray) {
        regReturnarray(CK_LT, fRES(returnarray));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param returnarray The value of returnarray as greaterEqual.
     */
    public void setReturnarray_GreaterEqual(String returnarray) {
        regReturnarray(CK_GE, fRES(returnarray));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param returnarray The value of returnarray as lessEqual.
     */
    public void setReturnarray_LessEqual(String returnarray) {
        regReturnarray(CK_LE, fRES(returnarray));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param returnarray The value of returnarray as prefixSearch.
     */
    public void setReturnarray_PrefixSearch(String returnarray) {
        regReturnarray(CK_PS, fRES(returnarray));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param returnarray The value of returnarray as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReturnarray_LikeSearch(String returnarray, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(returnarray), getCValueReturnarray(), "ReturnArray", "Returnarray", "returnarray", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param returnarrayList The collection of returnarray as inScope.
     */
    public void setReturnarray_InScope(Collection<String> returnarrayList) {
        regReturnarray(CK_INS, cTL(returnarrayList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param returnarray The collection of returnarray as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setReturnarray_InScope(String returnarray, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(returnarray), getCValueReturnarray(), "ReturnArray", "Returnarray", "returnarray", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setReturnarray_IsNull() { regReturnarray(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setReturnarray_IsNotNull() { regReturnarray(CK_ISNN, DUMMY_OBJECT); }

    protected void regReturnarray(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueReturnarray(), "ReturnArray", "Returnarray", "returnarray");
    }
    protected void registerInlineReturnarray(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueReturnarray(), "ReturnArray", "Returnarray", "returnarray");
    }
    abstract protected ConditionValue getCValueReturnarray();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param stereotype The value of stereotype as equal.
     */
    public void setStereotype_Equal(String stereotype) {
        regStereotype(CK_EQ, fRES(stereotype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as notEqual.
     */
    public void setStereotype_NotEqual(String stereotype) {
        regStereotype(CK_NE, fRES(stereotype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as greaterThan.
     */
    public void setStereotype_GreaterThan(String stereotype) {
        regStereotype(CK_GT, fRES(stereotype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as lessThan.
     */
    public void setStereotype_LessThan(String stereotype) {
        regStereotype(CK_LT, fRES(stereotype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as greaterEqual.
     */
    public void setStereotype_GreaterEqual(String stereotype) {
        regStereotype(CK_GE, fRES(stereotype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as lessEqual.
     */
    public void setStereotype_LessEqual(String stereotype) {
        regStereotype(CK_LE, fRES(stereotype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as prefixSearch.
     */
    public void setStereotype_PrefixSearch(String stereotype) {
        regStereotype(CK_PS, fRES(stereotype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stereotype The value of stereotype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStereotype_LikeSearch(String stereotype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(stereotype), getCValueStereotype(), "Stereotype", "Stereotype", "stereotype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stereotypeList The collection of stereotype as inScope.
     */
    public void setStereotype_InScope(Collection<String> stereotypeList) {
        regStereotype(CK_INS, cTL(stereotypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stereotype The collection of stereotype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStereotype_InScope(String stereotype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(stereotype), getCValueStereotype(), "Stereotype", "Stereotype", "stereotype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStereotype_IsNull() { regStereotype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStereotype_IsNotNull() { regStereotype(CK_ISNN, DUMMY_OBJECT); }

    protected void regStereotype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStereotype(), "Stereotype", "Stereotype", "stereotype");
    }
    protected void registerInlineStereotype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStereotype(), "Stereotype", "Stereotype", "stereotype");
    }
    abstract protected ConditionValue getCValueStereotype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(1)}
     * @param isstatic The value of isstatic as equal.
     */
    public void setIsstatic_Equal(String isstatic) {
        regIsstatic(CK_EQ, fRES(isstatic));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param isstatic The value of isstatic as notEqual.
     */
    public void setIsstatic_NotEqual(String isstatic) {
        regIsstatic(CK_NE, fRES(isstatic));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param isstatic The value of isstatic as greaterThan.
     */
    public void setIsstatic_GreaterThan(String isstatic) {
        regIsstatic(CK_GT, fRES(isstatic));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param isstatic The value of isstatic as lessThan.
     */
    public void setIsstatic_LessThan(String isstatic) {
        regIsstatic(CK_LT, fRES(isstatic));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param isstatic The value of isstatic as greaterEqual.
     */
    public void setIsstatic_GreaterEqual(String isstatic) {
        regIsstatic(CK_GE, fRES(isstatic));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param isstatic The value of isstatic as lessEqual.
     */
    public void setIsstatic_LessEqual(String isstatic) {
        regIsstatic(CK_LE, fRES(isstatic));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param isstatic The value of isstatic as prefixSearch.
     */
    public void setIsstatic_PrefixSearch(String isstatic) {
        regIsstatic(CK_PS, fRES(isstatic));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param isstatic The value of isstatic as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIsstatic_LikeSearch(String isstatic, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(isstatic), getCValueIsstatic(), "IsStatic", "Isstatic", "isstatic", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param isstaticList The collection of isstatic as inScope.
     */
    public void setIsstatic_InScope(Collection<String> isstaticList) {
        regIsstatic(CK_INS, cTL(isstaticList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param isstatic The collection of isstatic as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setIsstatic_InScope(String isstatic, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(isstatic), getCValueIsstatic(), "IsStatic", "Isstatic", "isstatic", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setIsstatic_IsNull() { regIsstatic(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setIsstatic_IsNotNull() { regIsstatic(CK_ISNN, DUMMY_OBJECT); }

    protected void regIsstatic(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIsstatic(), "IsStatic", "Isstatic", "isstatic");
    }
    protected void registerInlineIsstatic(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIsstatic(), "IsStatic", "Isstatic", "isstatic");
    }
    abstract protected ConditionValue getCValueIsstatic();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param concurrency The value of concurrency as equal.
     */
    public void setConcurrency_Equal(String concurrency) {
        regConcurrency(CK_EQ, fRES(concurrency));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param concurrency The value of concurrency as notEqual.
     */
    public void setConcurrency_NotEqual(String concurrency) {
        regConcurrency(CK_NE, fRES(concurrency));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param concurrency The value of concurrency as greaterThan.
     */
    public void setConcurrency_GreaterThan(String concurrency) {
        regConcurrency(CK_GT, fRES(concurrency));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param concurrency The value of concurrency as lessThan.
     */
    public void setConcurrency_LessThan(String concurrency) {
        regConcurrency(CK_LT, fRES(concurrency));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param concurrency The value of concurrency as greaterEqual.
     */
    public void setConcurrency_GreaterEqual(String concurrency) {
        regConcurrency(CK_GE, fRES(concurrency));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param concurrency The value of concurrency as lessEqual.
     */
    public void setConcurrency_LessEqual(String concurrency) {
        regConcurrency(CK_LE, fRES(concurrency));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param concurrency The value of concurrency as prefixSearch.
     */
    public void setConcurrency_PrefixSearch(String concurrency) {
        regConcurrency(CK_PS, fRES(concurrency));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param concurrency The value of concurrency as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConcurrency_LikeSearch(String concurrency, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(concurrency), getCValueConcurrency(), "Concurrency", "Concurrency", "concurrency", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param concurrencyList The collection of concurrency as inScope.
     */
    public void setConcurrency_InScope(Collection<String> concurrencyList) {
        regConcurrency(CK_INS, cTL(concurrencyList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param concurrency The collection of concurrency as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setConcurrency_InScope(String concurrency, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(concurrency), getCValueConcurrency(), "Concurrency", "Concurrency", "concurrency", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setConcurrency_IsNull() { regConcurrency(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setConcurrency_IsNotNull() { regConcurrency(CK_ISNN, DUMMY_OBJECT); }

    protected void regConcurrency(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueConcurrency(), "Concurrency", "Concurrency", "concurrency");
    }
    protected void registerInlineConcurrency(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueConcurrency(), "Concurrency", "Concurrency", "concurrency");
    }
    abstract protected ConditionValue getCValueConcurrency();

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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param behaviour The value of behaviour as equal.
     */
    public void setBehaviour_Equal(String behaviour) {
        regBehaviour(CK_EQ, fRES(behaviour));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param behaviour The value of behaviour as notEqual.
     */
    public void setBehaviour_NotEqual(String behaviour) {
        regBehaviour(CK_NE, fRES(behaviour));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param behaviour The value of behaviour as greaterThan.
     */
    public void setBehaviour_GreaterThan(String behaviour) {
        regBehaviour(CK_GT, fRES(behaviour));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param behaviour The value of behaviour as lessThan.
     */
    public void setBehaviour_LessThan(String behaviour) {
        regBehaviour(CK_LT, fRES(behaviour));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param behaviour The value of behaviour as greaterEqual.
     */
    public void setBehaviour_GreaterEqual(String behaviour) {
        regBehaviour(CK_GE, fRES(behaviour));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param behaviour The value of behaviour as lessEqual.
     */
    public void setBehaviour_LessEqual(String behaviour) {
        regBehaviour(CK_LE, fRES(behaviour));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param behaviour The value of behaviour as prefixSearch.
     */
    public void setBehaviour_PrefixSearch(String behaviour) {
        regBehaviour(CK_PS, fRES(behaviour));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param behaviour The value of behaviour as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBehaviour_LikeSearch(String behaviour, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(behaviour), getCValueBehaviour(), "Behaviour", "Behaviour", "behaviour", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param behaviourList The collection of behaviour as inScope.
     */
    public void setBehaviour_InScope(Collection<String> behaviourList) {
        regBehaviour(CK_INS, cTL(behaviourList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param behaviour The collection of behaviour as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setBehaviour_InScope(String behaviour, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(behaviour), getCValueBehaviour(), "Behaviour", "Behaviour", "behaviour", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBehaviour_IsNull() { regBehaviour(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBehaviour_IsNotNull() { regBehaviour(CK_ISNN, DUMMY_OBJECT); }

    protected void regBehaviour(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBehaviour(), "Behaviour", "Behaviour", "behaviour");
    }
    protected void registerInlineBehaviour(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBehaviour(), "Behaviour", "Behaviour", "behaviour");
    }
    abstract protected ConditionValue getCValueBehaviour();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param genoption The value of genoption as equal.
     */
    public void setGenoption_Equal(String genoption) {
        regGenoption(CK_EQ, fRES(genoption));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param genoption The value of genoption as notEqual.
     */
    public void setGenoption_NotEqual(String genoption) {
        regGenoption(CK_NE, fRES(genoption));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param genoption The value of genoption as greaterThan.
     */
    public void setGenoption_GreaterThan(String genoption) {
        regGenoption(CK_GT, fRES(genoption));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param genoption The value of genoption as lessThan.
     */
    public void setGenoption_LessThan(String genoption) {
        regGenoption(CK_LT, fRES(genoption));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param genoption The value of genoption as greaterEqual.
     */
    public void setGenoption_GreaterEqual(String genoption) {
        regGenoption(CK_GE, fRES(genoption));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param genoption The value of genoption as lessEqual.
     */
    public void setGenoption_LessEqual(String genoption) {
        regGenoption(CK_LE, fRES(genoption));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param genoption The value of genoption as prefixSearch.
     */
    public void setGenoption_PrefixSearch(String genoption) {
        regGenoption(CK_PS, fRES(genoption));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genoption The value of genoption as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenoption_LikeSearch(String genoption, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(genoption), getCValueGenoption(), "GenOption", "Genoption", "genoption", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genoptionList The collection of genoption as inScope.
     */
    public void setGenoption_InScope(Collection<String> genoptionList) {
        regGenoption(CK_INS, cTL(genoptionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genoption The collection of genoption as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setGenoption_InScope(String genoption, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(genoption), getCValueGenoption(), "GenOption", "Genoption", "genoption", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setGenoption_IsNull() { regGenoption(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setGenoption_IsNotNull() { regGenoption(CK_ISNN, DUMMY_OBJECT); }

    protected void regGenoption(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueGenoption(), "GenOption", "Genoption", "genoption");
    }
    protected void registerInlineGenoption(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueGenoption(), "GenOption", "Genoption", "genoption");
    }
    abstract protected ConditionValue getCValueGenoption();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param pos The value of pos as equal.
     */
    public void setPos_Equal(java.lang.Integer pos) {
        regPos(CK_EQ, pos);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param pos The value of pos as notEqual.
     */
    public void setPos_NotEqual(java.lang.Integer pos) {
        regPos(CK_NE, pos);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param pos The value of pos as greaterThan.
     */
    public void setPos_GreaterThan(java.lang.Integer pos) {
        regPos(CK_GT, pos);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param pos The value of pos as lessThan.
     */
    public void setPos_LessThan(java.lang.Integer pos) {
        regPos(CK_LT, pos);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param pos The value of pos as greaterEqual.
     */
    public void setPos_GreaterEqual(java.lang.Integer pos) {
        regPos(CK_GE, pos);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setPos_IsNull() { regPos(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPos_IsNotNull() { regPos(CK_ISNN, DUMMY_OBJECT); }

    protected void regPos(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePos(), "Pos", "Pos", "pos");
    }
    protected void registerInlinePos(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePos(), "Pos", "Pos", "pos");
    }
    abstract protected ConditionValue getCValuePos();

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
     * @param pure The value of pure as equal.
     */
    public void setPure_Equal(Boolean pure) {
        regPure(CK_EQ, pure);
    }

    protected void regPure(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePure(), "Pure", "Pure", "pure");
    }
    protected void registerInlinePure(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePure(), "Pure", "Pure", "pure");
    }
    abstract protected ConditionValue getCValuePure();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param classifier The value of classifier as equal.
     */
    public void setClassifier_Equal(String classifier) {
        regClassifier(CK_EQ, fRES(classifier));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifier The value of classifier as notEqual.
     */
    public void setClassifier_NotEqual(String classifier) {
        regClassifier(CK_NE, fRES(classifier));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifier The value of classifier as greaterThan.
     */
    public void setClassifier_GreaterThan(String classifier) {
        regClassifier(CK_GT, fRES(classifier));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifier The value of classifier as lessThan.
     */
    public void setClassifier_LessThan(String classifier) {
        regClassifier(CK_LT, fRES(classifier));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifier The value of classifier as greaterEqual.
     */
    public void setClassifier_GreaterEqual(String classifier) {
        regClassifier(CK_GE, fRES(classifier));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifier The value of classifier as lessEqual.
     */
    public void setClassifier_LessEqual(String classifier) {
        regClassifier(CK_LE, fRES(classifier));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifier The value of classifier as prefixSearch.
     */
    public void setClassifier_PrefixSearch(String classifier) {
        regClassifier(CK_PS, fRES(classifier));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param classifier The value of classifier as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassifier_LikeSearch(String classifier, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(classifier), getCValueClassifier(), "Classifier", "Classifier", "classifier", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param classifierList The collection of classifier as inScope.
     */
    public void setClassifier_InScope(Collection<String> classifierList) {
        regClassifier(CK_INS, cTL(classifierList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param classifier The collection of classifier as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setClassifier_InScope(String classifier, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(classifier), getCValueClassifier(), "Classifier", "Classifier", "classifier", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setClassifier_IsNull() { regClassifier(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setClassifier_IsNotNull() { regClassifier(CK_ISNN, DUMMY_OBJECT); }

    protected void regClassifier(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueClassifier(), "Classifier", "Classifier", "classifier");
    }
    protected void registerInlineClassifier(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueClassifier(), "Classifier", "Classifier", "classifier");
    }
    abstract protected ConditionValue getCValueClassifier();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param code The value of code as equal.
     */
    public void setCode_Equal(String code) {
        regCode(CK_EQ, fRES(code));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param code The value of code as notEqual.
     */
    public void setCode_NotEqual(String code) {
        regCode(CK_NE, fRES(code));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param code The value of code as greaterThan.
     */
    public void setCode_GreaterThan(String code) {
        regCode(CK_GT, fRES(code));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param code The value of code as lessThan.
     */
    public void setCode_LessThan(String code) {
        regCode(CK_LT, fRES(code));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param code The value of code as greaterEqual.
     */
    public void setCode_GreaterEqual(String code) {
        regCode(CK_GE, fRES(code));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param code The value of code as lessEqual.
     */
    public void setCode_LessEqual(String code) {
        regCode(CK_LE, fRES(code));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param code The value of code as prefixSearch.
     */
    public void setCode_PrefixSearch(String code) {
        regCode(CK_PS, fRES(code));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param code The value of code as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCode_LikeSearch(String code, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(code), getCValueCode(), "Code", "Code", "code", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param codeList The collection of code as inScope.
     */
    public void setCode_InScope(Collection<String> codeList) {
        regCode(CK_INS, cTL(codeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param code The collection of code as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setCode_InScope(String code, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(code), getCValueCode(), "Code", "Code", "code", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCode_IsNull() { regCode(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCode_IsNotNull() { regCode(CK_ISNN, DUMMY_OBJECT); }

    protected void regCode(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCode(), "Code", "Code", "code");
    }
    protected void registerInlineCode(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCode(), "Code", "Code", "code");
    }
    abstract protected ConditionValue getCValueCode();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param isroot The value of isroot as equal.
     */
    public void setIsroot_Equal(Boolean isroot) {
        regIsroot(CK_EQ, isroot);
    }

    protected void regIsroot(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIsroot(), "IsRoot", "Isroot", "isroot");
    }
    protected void registerInlineIsroot(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIsroot(), "IsRoot", "Isroot", "isroot");
    }
    abstract protected ConditionValue getCValueIsroot();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param isleaf The value of isleaf as equal.
     */
    public void setIsleaf_Equal(Boolean isleaf) {
        regIsleaf(CK_EQ, isleaf);
    }

    protected void regIsleaf(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIsleaf(), "IsLeaf", "Isleaf", "isleaf");
    }
    protected void registerInlineIsleaf(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIsleaf(), "IsLeaf", "Isleaf", "isleaf");
    }
    abstract protected ConditionValue getCValueIsleaf();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param isquery The value of isquery as equal.
     */
    public void setIsquery_Equal(Boolean isquery) {
        regIsquery(CK_EQ, isquery);
    }

    protected void regIsquery(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIsquery(), "IsQuery", "Isquery", "isquery");
    }
    protected void registerInlineIsquery(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIsquery(), "IsQuery", "Isquery", "isquery");
    }
    abstract protected ConditionValue getCValueIsquery();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param stateflags The value of stateflags as equal.
     */
    public void setStateflags_Equal(String stateflags) {
        regStateflags(CK_EQ, fRES(stateflags));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stateflags The value of stateflags as notEqual.
     */
    public void setStateflags_NotEqual(String stateflags) {
        regStateflags(CK_NE, fRES(stateflags));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param stateflags The value of stateflags as greaterThan.
     */
    public void setStateflags_GreaterThan(String stateflags) {
        regStateflags(CK_GT, fRES(stateflags));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param stateflags The value of stateflags as lessThan.
     */
    public void setStateflags_LessThan(String stateflags) {
        regStateflags(CK_LT, fRES(stateflags));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stateflags The value of stateflags as greaterEqual.
     */
    public void setStateflags_GreaterEqual(String stateflags) {
        regStateflags(CK_GE, fRES(stateflags));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stateflags The value of stateflags as lessEqual.
     */
    public void setStateflags_LessEqual(String stateflags) {
        regStateflags(CK_LE, fRES(stateflags));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param stateflags The value of stateflags as prefixSearch.
     */
    public void setStateflags_PrefixSearch(String stateflags) {
        regStateflags(CK_PS, fRES(stateflags));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stateflags The value of stateflags as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStateflags_LikeSearch(String stateflags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(stateflags), getCValueStateflags(), "StateFlags", "Stateflags", "stateflags", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stateflagsList The collection of stateflags as inScope.
     */
    public void setStateflags_InScope(Collection<String> stateflagsList) {
        regStateflags(CK_INS, cTL(stateflagsList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stateflags The collection of stateflags as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStateflags_InScope(String stateflags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(stateflags), getCValueStateflags(), "StateFlags", "Stateflags", "stateflags", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStateflags_IsNull() { regStateflags(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStateflags_IsNotNull() { regStateflags(CK_ISNN, DUMMY_OBJECT); }

    protected void regStateflags(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStateflags(), "StateFlags", "Stateflags", "stateflags");
    }
    protected void registerInlineStateflags(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStateflags(), "StateFlags", "Stateflags", "stateflags");
    }
    abstract protected ConditionValue getCValueStateflags();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param eaGuid The value of eaGuid as equal.
     */
    public void setEaGuid_Equal(String eaGuid) {
        regEaGuid(CK_EQ, fRES(eaGuid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as notEqual.
     */
    public void setEaGuid_NotEqual(String eaGuid) {
        regEaGuid(CK_NE, fRES(eaGuid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as greaterThan.
     */
    public void setEaGuid_GreaterThan(String eaGuid) {
        regEaGuid(CK_GT, fRES(eaGuid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as lessThan.
     */
    public void setEaGuid_LessThan(String eaGuid) {
        regEaGuid(CK_LT, fRES(eaGuid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as greaterEqual.
     */
    public void setEaGuid_GreaterEqual(String eaGuid) {
        regEaGuid(CK_GE, fRES(eaGuid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as lessEqual.
     */
    public void setEaGuid_LessEqual(String eaGuid) {
        regEaGuid(CK_LE, fRES(eaGuid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as prefixSearch.
     */
    public void setEaGuid_PrefixSearch(String eaGuid) {
        regEaGuid(CK_PS, fRES(eaGuid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEaGuid_LikeSearch(String eaGuid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuidList The collection of eaGuid as inScope.
     */
    public void setEaGuid_InScope(Collection<String> eaGuidList) {
        regEaGuid(CK_INS, cTL(eaGuidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuid The collection of eaGuid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setEaGuid_InScope(String eaGuid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setEaGuid_IsNull() { regEaGuid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setEaGuid_IsNotNull() { regEaGuid(CK_ISNN, DUMMY_OBJECT); }

    protected void regEaGuid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid");
    }
    protected void registerInlineEaGuid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid");
    }
    abstract protected ConditionValue getCValueEaGuid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param styleex The value of styleex as equal.
     */
    public void setStyleex_Equal(String styleex) {
        regStyleex(CK_EQ, fRES(styleex));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param styleex The value of styleex as notEqual.
     */
    public void setStyleex_NotEqual(String styleex) {
        regStyleex(CK_NE, fRES(styleex));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param styleex The value of styleex as greaterThan.
     */
    public void setStyleex_GreaterThan(String styleex) {
        regStyleex(CK_GT, fRES(styleex));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param styleex The value of styleex as lessThan.
     */
    public void setStyleex_LessThan(String styleex) {
        regStyleex(CK_LT, fRES(styleex));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param styleex The value of styleex as greaterEqual.
     */
    public void setStyleex_GreaterEqual(String styleex) {
        regStyleex(CK_GE, fRES(styleex));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param styleex The value of styleex as lessEqual.
     */
    public void setStyleex_LessEqual(String styleex) {
        regStyleex(CK_LE, fRES(styleex));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param styleex The value of styleex as prefixSearch.
     */
    public void setStyleex_PrefixSearch(String styleex) {
        regStyleex(CK_PS, fRES(styleex));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param styleex The value of styleex as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStyleex_LikeSearch(String styleex, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(styleex), getCValueStyleex(), "StyleEx", "Styleex", "styleex", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleexList The collection of styleex as inScope.
     */
    public void setStyleex_InScope(Collection<String> styleexList) {
        regStyleex(CK_INS, cTL(styleexList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleex The collection of styleex as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStyleex_InScope(String styleex, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(styleex), getCValueStyleex(), "StyleEx", "Styleex", "styleex", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStyleex_IsNull() { regStyleex(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStyleex_IsNotNull() { regStyleex(CK_ISNN, DUMMY_OBJECT); }

    protected void regStyleex(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStyleex(), "StyleEx", "Styleex", "styleex");
    }
    protected void registerInlineStyleex(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStyleex(), "StyleEx", "Styleex", "styleex");
    }
    abstract protected ConditionValue getCValueStyleex();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TOperationCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TOperationCQ.class.getName(); }
}
