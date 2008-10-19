package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_object.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTObjectCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_object";
    }
    
    public String getTableSqlName() {
        return "t_object";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : COUNTER : NotNull}
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
	 * @param tObjectpropertiesCBquery Query.
	 * @deprecated Please use inScopeTObjectpropertiesList(subQuery) method.
	 */
    public void setObjectId_InScopeSubQuery_TObjectpropertiesList(TObjectpropertiesCQ tObjectpropertiesCBquery) {
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TObjectpropertiesList(tObjectpropertiesCBquery);// for saving query-value.
        registerInScopeSubQuery(tObjectpropertiesCBquery, "Object_ID", "Object_ID", subQueryPropertyName);
    }
    public void inScopeTObjectpropertiesList(SubQuery<TObjectpropertiesCB> subQuery) {
        assertObjectNotNull("subQuery<TObjectpropertiesCB>", subQuery);
        TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TObjectpropertiesList(cb.query());// for saving query-value.
        registerInScopeSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_InScopeSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery);

    /**
	 * @param tAttributeCBquery Query.
	 * @deprecated Please use inScopeTAttributeList(subQuery) method.
	 */
    public void setObjectId_InScopeSubQuery_TAttributeList(TAttributeCQ tAttributeCBquery) {
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TAttributeList(tAttributeCBquery);// for saving query-value.
        registerInScopeSubQuery(tAttributeCBquery, "Object_ID", "Object_ID", subQueryPropertyName);
    }
    public void inScopeTAttributeList(SubQuery<TAttributeCB> subQuery) {
        assertObjectNotNull("subQuery<TAttributeCB>", subQuery);
        TAttributeCB cb = new TAttributeCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TAttributeList(cb.query());// for saving query-value.
        registerInScopeSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_InScopeSubQuery_TAttributeList(TAttributeCQ subQuery);

    /**
	 * @param tOperationCBquery Query.
	 * @deprecated Please use inScopeTOperationList(subQuery) method.
	 */
    public void setObjectId_InScopeSubQuery_TOperationList(TOperationCQ tOperationCBquery) {
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TOperationList(tOperationCBquery);// for saving query-value.
        registerInScopeSubQuery(tOperationCBquery, "Object_ID", "ObjectID", subQueryPropertyName);
    }
    public void inScopeTOperationList(SubQuery<TOperationCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TOperationList(cb.query());// for saving query-value.
        registerInScopeSubQuery(cb.query(), "Object_ID", "ObjectID", subQueryPropertyName);
    }
    abstract public String keepObjectId_InScopeSubQuery_TOperationList(TOperationCQ subQuery);

    /**
	 * @param tConnectorCBquery Query.
	 * @deprecated Please use inScopeTConnectorByStartObjectIdList(subQuery) method.
	 */
    public void setObjectId_InScopeSubQuery_TConnectorByStartObjectIdList(TConnectorCQ tConnectorCBquery) {
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TConnectorByStartObjectIdList(tConnectorCBquery);// for saving query-value.
        registerInScopeSubQuery(tConnectorCBquery, "Object_ID", "Start_Object_ID", subQueryPropertyName);
    }
    public void inScopeTConnectorByStartObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TConnectorByStartObjectIdList(cb.query());// for saving query-value.
        registerInScopeSubQuery(cb.query(), "Object_ID", "Start_Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_InScopeSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery);

    /**
	 * @param tConnectorCBquery Query.
	 * @deprecated Please use inScopeTConnectorByEndObjectIdList(subQuery) method.
	 */
    public void setObjectId_InScopeSubQuery_TConnectorByEndObjectIdList(TConnectorCQ tConnectorCBquery) {
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TConnectorByEndObjectIdList(tConnectorCBquery);// for saving query-value.
        registerInScopeSubQuery(tConnectorCBquery, "Object_ID", "End_Object_ID", subQueryPropertyName);
    }
    public void inScopeTConnectorByEndObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TConnectorByEndObjectIdList(cb.query());// for saving query-value.
        registerInScopeSubQuery(cb.query(), "Object_ID", "End_Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_InScopeSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery);

    public void notInScopeTObjectpropertiesList(SubQuery<TObjectpropertiesCB> subQuery) {
        assertObjectNotNull("subQuery<TObjectpropertiesCB>", subQuery);
        TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotInScopeSubQuery_TObjectpropertiesList(cb.query());// for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_NotInScopeSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery);

    public void notInScopeTAttributeList(SubQuery<TAttributeCB> subQuery) {
        assertObjectNotNull("subQuery<TAttributeCB>", subQuery);
        TAttributeCB cb = new TAttributeCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotInScopeSubQuery_TAttributeList(cb.query());// for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_NotInScopeSubQuery_TAttributeList(TAttributeCQ subQuery);

    public void notInScopeTOperationList(SubQuery<TOperationCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotInScopeSubQuery_TOperationList(cb.query());// for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Object_ID", "ObjectID", subQueryPropertyName);
    }
    abstract public String keepObjectId_NotInScopeSubQuery_TOperationList(TOperationCQ subQuery);

    public void notInScopeTConnectorByStartObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotInScopeSubQuery_TConnectorByStartObjectIdList(cb.query());// for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Object_ID", "Start_Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_NotInScopeSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery);

    public void notInScopeTConnectorByEndObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotInScopeSubQuery_TConnectorByEndObjectIdList(cb.query());// for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Object_ID", "End_Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_NotInScopeSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery);

    /**
	 * @param tObjectpropertiesCBquery Query.
	 * @deprecated Please use existsTObjectpropertiesList(subQuery) method.
	 */
    public void setObjectId_ExistsSubQuery_TObjectpropertiesList(TObjectpropertiesCQ tObjectpropertiesCBquery) {
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TObjectpropertiesList(tObjectpropertiesCBquery);// for saving query-value.
        registerExistsSubQuery(tObjectpropertiesCBquery, "Object_ID", "Object_ID", subQueryPropertyName);
    }
    /**
     * Set up 'exists' sub-query. {exists (select Object_ID from t_objectproperties where ...)}
     * @param subQuery The sub-query of ObjectId_ExistsSubQuery_TObjectpropertiesList for 'exists'. (NotNull)
     */
    public void existsTObjectpropertiesList(SubQuery<TObjectpropertiesCB> subQuery) {
        assertObjectNotNull("subQuery<TObjectpropertiesCB>", subQuery);
        TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TObjectpropertiesList(cb.query());// for saving query-value.
        registerExistsSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_ExistsSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery);

    /**
	 * @param tAttributeCBquery Query.
	 * @deprecated Please use existsTAttributeList(subQuery) method.
	 */
    public void setObjectId_ExistsSubQuery_TAttributeList(TAttributeCQ tAttributeCBquery) {
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TAttributeList(tAttributeCBquery);// for saving query-value.
        registerExistsSubQuery(tAttributeCBquery, "Object_ID", "Object_ID", subQueryPropertyName);
    }
    /**
     * Set up 'exists' sub-query. {exists (select Object_ID from t_attribute where ...)}
     * @param subQuery The sub-query of ObjectId_ExistsSubQuery_TAttributeList for 'exists'. (NotNull)
     */
    public void existsTAttributeList(SubQuery<TAttributeCB> subQuery) {
        assertObjectNotNull("subQuery<TAttributeCB>", subQuery);
        TAttributeCB cb = new TAttributeCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TAttributeList(cb.query());// for saving query-value.
        registerExistsSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_ExistsSubQuery_TAttributeList(TAttributeCQ subQuery);

    /**
	 * @param tOperationCBquery Query.
	 * @deprecated Please use existsTOperationList(subQuery) method.
	 */
    public void setObjectId_ExistsSubQuery_TOperationList(TOperationCQ tOperationCBquery) {
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TOperationList(tOperationCBquery);// for saving query-value.
        registerExistsSubQuery(tOperationCBquery, "Object_ID", "ObjectID", subQueryPropertyName);
    }
    /**
     * Set up 'exists' sub-query. {exists (select ObjectID from t_operation where ...)}
     * @param subQuery The sub-query of ObjectId_ExistsSubQuery_TOperationList for 'exists'. (NotNull)
     */
    public void existsTOperationList(SubQuery<TOperationCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TOperationList(cb.query());// for saving query-value.
        registerExistsSubQuery(cb.query(), "Object_ID", "ObjectID", subQueryPropertyName);
    }
    abstract public String keepObjectId_ExistsSubQuery_TOperationList(TOperationCQ subQuery);

    /**
	 * @param tConnectorCBquery Query.
	 * @deprecated Please use existsTConnectorByStartObjectIdList(subQuery) method.
	 */
    public void setObjectId_ExistsSubQuery_TConnectorByStartObjectIdList(TConnectorCQ tConnectorCBquery) {
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TConnectorByStartObjectIdList(tConnectorCBquery);// for saving query-value.
        registerExistsSubQuery(tConnectorCBquery, "Object_ID", "Start_Object_ID", subQueryPropertyName);
    }
    /**
     * Set up 'exists' sub-query. {exists (select Start_Object_ID from t_connector where ...)}
     * @param subQuery The sub-query of ObjectId_ExistsSubQuery_TConnectorByStartObjectIdList for 'exists'. (NotNull)
     */
    public void existsTConnectorByStartObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TConnectorByStartObjectIdList(cb.query());// for saving query-value.
        registerExistsSubQuery(cb.query(), "Object_ID", "Start_Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_ExistsSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery);

    /**
	 * @param tConnectorCBquery Query.
	 * @deprecated Please use existsTConnectorByEndObjectIdList(subQuery) method.
	 */
    public void setObjectId_ExistsSubQuery_TConnectorByEndObjectIdList(TConnectorCQ tConnectorCBquery) {
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TConnectorByEndObjectIdList(tConnectorCBquery);// for saving query-value.
        registerExistsSubQuery(tConnectorCBquery, "Object_ID", "End_Object_ID", subQueryPropertyName);
    }
    /**
     * Set up 'exists' sub-query. {exists (select End_Object_ID from t_connector where ...)}
     * @param subQuery The sub-query of ObjectId_ExistsSubQuery_TConnectorByEndObjectIdList for 'exists'. (NotNull)
     */
    public void existsTConnectorByEndObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TConnectorByEndObjectIdList(cb.query());// for saving query-value.
        registerExistsSubQuery(cb.query(), "Object_ID", "End_Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_ExistsSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select Object_ID from t_objectproperties where ...)}
     * @param subQuery The sub-query of ObjectId_NotExistsSubQuery_TObjectpropertiesList for 'not exists'. (NotNull)
     */
    public void notExistsTObjectpropertiesList(SubQuery<TObjectpropertiesCB> subQuery) {
        assertObjectNotNull("subQuery<TObjectpropertiesCB>", subQuery);
        TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotExistsSubQuery_TObjectpropertiesList(cb.query());// for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_NotExistsSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select Object_ID from t_attribute where ...)}
     * @param subQuery The sub-query of ObjectId_NotExistsSubQuery_TAttributeList for 'not exists'. (NotNull)
     */
    public void notExistsTAttributeList(SubQuery<TAttributeCB> subQuery) {
        assertObjectNotNull("subQuery<TAttributeCB>", subQuery);
        TAttributeCB cb = new TAttributeCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotExistsSubQuery_TAttributeList(cb.query());// for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_NotExistsSubQuery_TAttributeList(TAttributeCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select ObjectID from t_operation where ...)}
     * @param subQuery The sub-query of ObjectId_NotExistsSubQuery_TOperationList for 'not exists'. (NotNull)
     */
    public void notExistsTOperationList(SubQuery<TOperationCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotExistsSubQuery_TOperationList(cb.query());// for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Object_ID", "ObjectID", subQueryPropertyName);
    }
    abstract public String keepObjectId_NotExistsSubQuery_TOperationList(TOperationCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select Start_Object_ID from t_connector where ...)}
     * @param subQuery The sub-query of ObjectId_NotExistsSubQuery_TConnectorByStartObjectIdList for 'not exists'. (NotNull)
     */
    public void notExistsTConnectorByStartObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotExistsSubQuery_TConnectorByStartObjectIdList(cb.query());// for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Object_ID", "Start_Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_NotExistsSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select End_Object_ID from t_connector where ...)}
     * @param subQuery The sub-query of ObjectId_NotExistsSubQuery_TConnectorByEndObjectIdList for 'not exists'. (NotNull)
     */
    public void notExistsTConnectorByEndObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotExistsSubQuery_TConnectorByEndObjectIdList(cb.query());// for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Object_ID", "End_Object_ID", subQueryPropertyName);
    }
    abstract public String keepObjectId_NotExistsSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery);

    public void xderiveTObjectpropertiesList(String function, SubQuery<TObjectpropertiesCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TObjectpropertiesCB>", subQuery);
        TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForDeriveReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_DeriveSubQuery_TObjectpropertiesList(cb.query());// for saving query-value.
        registerDeriveSubQuery(function, cb.query(), "Object_ID", "Object_ID", subQueryPropertyName, aliasName);
    }
    abstract public String keepObjectId_DeriveSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery);

    public void xderiveTAttributeList(String function, SubQuery<TAttributeCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TAttributeCB>", subQuery);
        TAttributeCB cb = new TAttributeCB(); cb.xsetupForDeriveReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_DeriveSubQuery_TAttributeList(cb.query());// for saving query-value.
        registerDeriveSubQuery(function, cb.query(), "Object_ID", "Object_ID", subQueryPropertyName, aliasName);
    }
    abstract public String keepObjectId_DeriveSubQuery_TAttributeList(TAttributeCQ subQuery);

    public void xderiveTOperationList(String function, SubQuery<TOperationCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForDeriveReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_DeriveSubQuery_TOperationList(cb.query());// for saving query-value.
        registerDeriveSubQuery(function, cb.query(), "Object_ID", "ObjectID", subQueryPropertyName, aliasName);
    }
    abstract public String keepObjectId_DeriveSubQuery_TOperationList(TOperationCQ subQuery);

    public void xderiveTConnectorByStartObjectIdList(String function, SubQuery<TConnectorCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForDeriveReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_DeriveSubQuery_TConnectorByStartObjectIdList(cb.query());// for saving query-value.
        registerDeriveSubQuery(function, cb.query(), "Object_ID", "Start_Object_ID", subQueryPropertyName, aliasName);
    }
    abstract public String keepObjectId_DeriveSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery);

    public void xderiveTConnectorByEndObjectIdList(String function, SubQuery<TConnectorCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForDeriveReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_DeriveSubQuery_TConnectorByEndObjectIdList(cb.query());// for saving query-value.
        registerDeriveSubQuery(function, cb.query(), "Object_ID", "End_Object_ID", subQueryPropertyName, aliasName);
    }
    abstract public String keepObjectId_DeriveSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery);

    protected void regObjectId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueObjectId(), "Object_ID", "ObjectId", "objectId");
    }
    protected void registerInlineObjectId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueObjectId(), "Object_ID", "ObjectId", "objectId");
    }
    abstract protected ConditionValue getCValueObjectId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param objectType The value of objectType as equal.
     */
    public void setObjectType_Equal(String objectType) {
        regObjectType(CK_EQ, fRES(objectType));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectType The value of objectType as notEqual.
     */
    public void setObjectType_NotEqual(String objectType) {
        regObjectType(CK_NE, fRES(objectType));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectType The value of objectType as greaterThan.
     */
    public void setObjectType_GreaterThan(String objectType) {
        regObjectType(CK_GT, fRES(objectType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectType The value of objectType as lessThan.
     */
    public void setObjectType_LessThan(String objectType) {
        regObjectType(CK_LT, fRES(objectType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectType The value of objectType as greaterEqual.
     */
    public void setObjectType_GreaterEqual(String objectType) {
        regObjectType(CK_GE, fRES(objectType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectType The value of objectType as lessEqual.
     */
    public void setObjectType_LessEqual(String objectType) {
        regObjectType(CK_LE, fRES(objectType));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectType The value of objectType as prefixSearch.
     */
    public void setObjectType_PrefixSearch(String objectType) {
        regObjectType(CK_PS, fRES(objectType));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param objectType The value of objectType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setObjectType_LikeSearch(String objectType, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(objectType), getCValueObjectType(), "Object_Type", "ObjectType", "objectType", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param objectTypeList The collection of objectType as inScope.
     */
    public void setObjectType_InScope(Collection<String> objectTypeList) {
        regObjectType(CK_INS, cTL(objectTypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param objectType The collection of objectType as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setObjectType_InScope(String objectType, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(objectType), getCValueObjectType(), "Object_Type", "ObjectType", "objectType", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setObjectType_IsNull() { regObjectType(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setObjectType_IsNotNull() { regObjectType(CK_ISNN, DUMMY_OBJECT); }

    protected void regObjectType(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueObjectType(), "Object_Type", "ObjectType", "objectType");
    }
    protected void registerInlineObjectType(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueObjectType(), "Object_Type", "ObjectType", "objectType");
    }
    abstract protected ConditionValue getCValueObjectType();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param diagramId The value of diagramId as equal.
     */
    public void setDiagramId_Equal(java.lang.Integer diagramId) {
        regDiagramId(CK_EQ, diagramId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as notEqual.
     */
    public void setDiagramId_NotEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_NE, diagramId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as greaterThan.
     */
    public void setDiagramId_GreaterThan(java.lang.Integer diagramId) {
        regDiagramId(CK_GT, diagramId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as lessThan.
     */
    public void setDiagramId_LessThan(java.lang.Integer diagramId) {
        regDiagramId(CK_LT, diagramId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as greaterEqual.
     */
    public void setDiagramId_GreaterEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_GE, diagramId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as lessEqual.
     */
    public void setDiagramId_LessEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_LE, diagramId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param diagramIdList The collection of diagramId as inScope.
     */
    public void setDiagramId_InScope(Collection<java.lang.Integer> diagramIdList) {
        regDiagramId(CK_INS, cTL(diagramIdList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDiagramId_IsNull() { regDiagramId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDiagramId_IsNotNull() { regDiagramId(CK_ISNN, DUMMY_OBJECT); }

    protected void regDiagramId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDiagramId(), "Diagram_ID", "DiagramId", "diagramId");
    }
    protected void registerInlineDiagramId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDiagramId(), "Diagram_ID", "DiagramId", "diagramId");
    }
    abstract protected ConditionValue getCValueDiagramId();

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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param alias The value of alias as equal.
     */
    public void setAlias_Equal(String alias) {
        regAlias(CK_EQ, fRES(alias));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param alias The value of alias as notEqual.
     */
    public void setAlias_NotEqual(String alias) {
        regAlias(CK_NE, fRES(alias));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param alias The value of alias as greaterThan.
     */
    public void setAlias_GreaterThan(String alias) {
        regAlias(CK_GT, fRES(alias));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param alias The value of alias as lessThan.
     */
    public void setAlias_LessThan(String alias) {
        regAlias(CK_LT, fRES(alias));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param alias The value of alias as greaterEqual.
     */
    public void setAlias_GreaterEqual(String alias) {
        regAlias(CK_GE, fRES(alias));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param alias The value of alias as lessEqual.
     */
    public void setAlias_LessEqual(String alias) {
        regAlias(CK_LE, fRES(alias));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param alias The value of alias as prefixSearch.
     */
    public void setAlias_PrefixSearch(String alias) {
        regAlias(CK_PS, fRES(alias));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param alias The value of alias as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAlias_LikeSearch(String alias, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(alias), getCValueAlias(), "Alias", "Alias", "alias", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param aliasList The collection of alias as inScope.
     */
    public void setAlias_InScope(Collection<String> aliasList) {
        regAlias(CK_INS, cTL(aliasList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param alias The collection of alias as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setAlias_InScope(String alias, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(alias), getCValueAlias(), "Alias", "Alias", "alias", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setAlias_IsNull() { regAlias(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setAlias_IsNotNull() { regAlias(CK_ISNN, DUMMY_OBJECT); }

    protected void regAlias(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAlias(), "Alias", "Alias", "alias");
    }
    protected void registerInlineAlias(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAlias(), "Alias", "Alias", "alias");
    }
    abstract protected ConditionValue getCValueAlias();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param author The value of author as equal.
     */
    public void setAuthor_Equal(String author) {
        regAuthor(CK_EQ, fRES(author));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as notEqual.
     */
    public void setAuthor_NotEqual(String author) {
        regAuthor(CK_NE, fRES(author));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as greaterThan.
     */
    public void setAuthor_GreaterThan(String author) {
        regAuthor(CK_GT, fRES(author));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as lessThan.
     */
    public void setAuthor_LessThan(String author) {
        regAuthor(CK_LT, fRES(author));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as greaterEqual.
     */
    public void setAuthor_GreaterEqual(String author) {
        regAuthor(CK_GE, fRES(author));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as lessEqual.
     */
    public void setAuthor_LessEqual(String author) {
        regAuthor(CK_LE, fRES(author));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as prefixSearch.
     */
    public void setAuthor_PrefixSearch(String author) {
        regAuthor(CK_PS, fRES(author));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param author The value of author as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAuthor_LikeSearch(String author, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(author), getCValueAuthor(), "Author", "Author", "author", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param authorList The collection of author as inScope.
     */
    public void setAuthor_InScope(Collection<String> authorList) {
        regAuthor(CK_INS, cTL(authorList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param author The collection of author as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setAuthor_InScope(String author, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(author), getCValueAuthor(), "Author", "Author", "author", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setAuthor_IsNull() { regAuthor(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setAuthor_IsNotNull() { regAuthor(CK_ISNN, DUMMY_OBJECT); }

    protected void regAuthor(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAuthor(), "Author", "Author", "author");
    }
    protected void registerInlineAuthor(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAuthor(), "Author", "Author", "author");
    }
    abstract protected ConditionValue getCValueAuthor();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param version The value of version as equal.
     */
    public void setVersion_Equal(String version) {
        regVersion(CK_EQ, fRES(version));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as notEqual.
     */
    public void setVersion_NotEqual(String version) {
        regVersion(CK_NE, fRES(version));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as greaterThan.
     */
    public void setVersion_GreaterThan(String version) {
        regVersion(CK_GT, fRES(version));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as lessThan.
     */
    public void setVersion_LessThan(String version) {
        regVersion(CK_LT, fRES(version));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as greaterEqual.
     */
    public void setVersion_GreaterEqual(String version) {
        regVersion(CK_GE, fRES(version));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as lessEqual.
     */
    public void setVersion_LessEqual(String version) {
        regVersion(CK_LE, fRES(version));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as prefixSearch.
     */
    public void setVersion_PrefixSearch(String version) {
        regVersion(CK_PS, fRES(version));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param version The value of version as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVersion_LikeSearch(String version, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(version), getCValueVersion(), "Version", "Version", "version", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param versionList The collection of version as inScope.
     */
    public void setVersion_InScope(Collection<String> versionList) {
        regVersion(CK_INS, cTL(versionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param version The collection of version as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setVersion_InScope(String version, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(version), getCValueVersion(), "Version", "Version", "version", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setVersion_IsNull() { regVersion(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setVersion_IsNotNull() { regVersion(CK_ISNN, DUMMY_OBJECT); }

    protected void regVersion(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueVersion(), "Version", "Version", "version");
    }
    protected void registerInlineVersion(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueVersion(), "Version", "Version", "version");
    }
    abstract protected ConditionValue getCValueVersion();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param note The value of note as equal.
     */
    public void setNote_Equal(String note) {
        regNote(CK_EQ, fRES(note));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param note The value of note as notEqual.
     */
    public void setNote_NotEqual(String note) {
        regNote(CK_NE, fRES(note));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param note The value of note as greaterThan.
     */
    public void setNote_GreaterThan(String note) {
        regNote(CK_GT, fRES(note));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param note The value of note as lessThan.
     */
    public void setNote_LessThan(String note) {
        regNote(CK_LT, fRES(note));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param note The value of note as greaterEqual.
     */
    public void setNote_GreaterEqual(String note) {
        regNote(CK_GE, fRES(note));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param note The value of note as lessEqual.
     */
    public void setNote_LessEqual(String note) {
        regNote(CK_LE, fRES(note));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param note The value of note as prefixSearch.
     */
    public void setNote_PrefixSearch(String note) {
        regNote(CK_PS, fRES(note));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param note The value of note as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNote_LikeSearch(String note, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(note), getCValueNote(), "Note", "Note", "note", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param noteList The collection of note as inScope.
     */
    public void setNote_InScope(Collection<String> noteList) {
        regNote(CK_INS, cTL(noteList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param note The collection of note as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setNote_InScope(String note, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(note), getCValueNote(), "Note", "Note", "note", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNote_IsNull() { regNote(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNote_IsNotNull() { regNote(CK_ISNN, DUMMY_OBJECT); }

    protected void regNote(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNote(), "Note", "Note", "note");
    }
    protected void registerInlineNote(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNote(), "Note", "Note", "note");
    }
    abstract protected ConditionValue getCValueNote();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param packageId The value of packageId as equal.
     */
    public void setPackageId_Equal(java.lang.Integer packageId) {
        regPackageId(CK_EQ, packageId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as notEqual.
     */
    public void setPackageId_NotEqual(java.lang.Integer packageId) {
        regPackageId(CK_NE, packageId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as greaterThan.
     */
    public void setPackageId_GreaterThan(java.lang.Integer packageId) {
        regPackageId(CK_GT, packageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as lessThan.
     */
    public void setPackageId_LessThan(java.lang.Integer packageId) {
        regPackageId(CK_LT, packageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as greaterEqual.
     */
    public void setPackageId_GreaterEqual(java.lang.Integer packageId) {
        regPackageId(CK_GE, packageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as lessEqual.
     */
    public void setPackageId_LessEqual(java.lang.Integer packageId) {
        regPackageId(CK_LE, packageId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param packageIdList The collection of packageId as inScope.
     */
    public void setPackageId_InScope(Collection<java.lang.Integer> packageIdList) {
        regPackageId(CK_INS, cTL(packageIdList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPackageId_IsNull() { regPackageId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPackageId_IsNotNull() { regPackageId(CK_ISNN, DUMMY_OBJECT); }

    protected void regPackageId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePackageId(), "Package_ID", "PackageId", "packageId");
    }
    protected void registerInlinePackageId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePackageId(), "Package_ID", "PackageId", "packageId");
    }
    abstract protected ConditionValue getCValuePackageId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
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
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param ntype The value of ntype as equal.
     */
    public void setNtype_Equal(java.lang.Integer ntype) {
        regNtype(CK_EQ, ntype);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param ntype The value of ntype as notEqual.
     */
    public void setNtype_NotEqual(java.lang.Integer ntype) {
        regNtype(CK_NE, ntype);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param ntype The value of ntype as greaterThan.
     */
    public void setNtype_GreaterThan(java.lang.Integer ntype) {
        regNtype(CK_GT, ntype);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param ntype The value of ntype as lessThan.
     */
    public void setNtype_LessThan(java.lang.Integer ntype) {
        regNtype(CK_LT, ntype);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param ntype The value of ntype as greaterEqual.
     */
    public void setNtype_GreaterEqual(java.lang.Integer ntype) {
        regNtype(CK_GE, ntype);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param ntype The value of ntype as lessEqual.
     */
    public void setNtype_LessEqual(java.lang.Integer ntype) {
        regNtype(CK_LE, ntype);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param ntypeList The collection of ntype as inScope.
     */
    public void setNtype_InScope(Collection<java.lang.Integer> ntypeList) {
        regNtype(CK_INS, cTL(ntypeList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNtype_IsNull() { regNtype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNtype_IsNotNull() { regNtype(CK_ISNN, DUMMY_OBJECT); }

    protected void regNtype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNtype(), "NType", "Ntype", "ntype");
    }
    protected void registerInlineNtype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNtype(), "NType", "Ntype", "ntype");
    }
    abstract protected ConditionValue getCValueNtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param complexity The value of complexity as equal.
     */
    public void setComplexity_Equal(String complexity) {
        regComplexity(CK_EQ, fRES(complexity));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param complexity The value of complexity as notEqual.
     */
    public void setComplexity_NotEqual(String complexity) {
        regComplexity(CK_NE, fRES(complexity));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param complexity The value of complexity as greaterThan.
     */
    public void setComplexity_GreaterThan(String complexity) {
        regComplexity(CK_GT, fRES(complexity));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param complexity The value of complexity as lessThan.
     */
    public void setComplexity_LessThan(String complexity) {
        regComplexity(CK_LT, fRES(complexity));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param complexity The value of complexity as greaterEqual.
     */
    public void setComplexity_GreaterEqual(String complexity) {
        regComplexity(CK_GE, fRES(complexity));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param complexity The value of complexity as lessEqual.
     */
    public void setComplexity_LessEqual(String complexity) {
        regComplexity(CK_LE, fRES(complexity));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param complexity The value of complexity as prefixSearch.
     */
    public void setComplexity_PrefixSearch(String complexity) {
        regComplexity(CK_PS, fRES(complexity));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param complexity The value of complexity as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComplexity_LikeSearch(String complexity, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(complexity), getCValueComplexity(), "Complexity", "Complexity", "complexity", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param complexityList The collection of complexity as inScope.
     */
    public void setComplexity_InScope(Collection<String> complexityList) {
        regComplexity(CK_INS, cTL(complexityList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param complexity The collection of complexity as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setComplexity_InScope(String complexity, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(complexity), getCValueComplexity(), "Complexity", "Complexity", "complexity", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setComplexity_IsNull() { regComplexity(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setComplexity_IsNotNull() { regComplexity(CK_ISNN, DUMMY_OBJECT); }

    protected void regComplexity(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueComplexity(), "Complexity", "Complexity", "complexity");
    }
    protected void registerInlineComplexity(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueComplexity(), "Complexity", "Complexity", "complexity");
    }
    abstract protected ConditionValue getCValueComplexity();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param effort The value of effort as equal.
     */
    public void setEffort_Equal(java.lang.Integer effort) {
        regEffort(CK_EQ, effort);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param effort The value of effort as notEqual.
     */
    public void setEffort_NotEqual(java.lang.Integer effort) {
        regEffort(CK_NE, effort);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param effort The value of effort as greaterThan.
     */
    public void setEffort_GreaterThan(java.lang.Integer effort) {
        regEffort(CK_GT, effort);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param effort The value of effort as lessThan.
     */
    public void setEffort_LessThan(java.lang.Integer effort) {
        regEffort(CK_LT, effort);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param effort The value of effort as greaterEqual.
     */
    public void setEffort_GreaterEqual(java.lang.Integer effort) {
        regEffort(CK_GE, effort);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param effort The value of effort as lessEqual.
     */
    public void setEffort_LessEqual(java.lang.Integer effort) {
        regEffort(CK_LE, effort);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param effortList The collection of effort as inScope.
     */
    public void setEffort_InScope(Collection<java.lang.Integer> effortList) {
        regEffort(CK_INS, cTL(effortList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setEffort_IsNull() { regEffort(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setEffort_IsNotNull() { regEffort(CK_ISNN, DUMMY_OBJECT); }

    protected void regEffort(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueEffort(), "Effort", "Effort", "effort");
    }
    protected void registerInlineEffort(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueEffort(), "Effort", "Effort", "effort");
    }
    abstract protected ConditionValue getCValueEffort();

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
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param backcolor The value of backcolor as equal.
     */
    public void setBackcolor_Equal(java.lang.Integer backcolor) {
        regBackcolor(CK_EQ, backcolor);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param backcolor The value of backcolor as notEqual.
     */
    public void setBackcolor_NotEqual(java.lang.Integer backcolor) {
        regBackcolor(CK_NE, backcolor);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param backcolor The value of backcolor as greaterThan.
     */
    public void setBackcolor_GreaterThan(java.lang.Integer backcolor) {
        regBackcolor(CK_GT, backcolor);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param backcolor The value of backcolor as lessThan.
     */
    public void setBackcolor_LessThan(java.lang.Integer backcolor) {
        regBackcolor(CK_LT, backcolor);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param backcolor The value of backcolor as greaterEqual.
     */
    public void setBackcolor_GreaterEqual(java.lang.Integer backcolor) {
        regBackcolor(CK_GE, backcolor);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param backcolor The value of backcolor as lessEqual.
     */
    public void setBackcolor_LessEqual(java.lang.Integer backcolor) {
        regBackcolor(CK_LE, backcolor);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param backcolorList The collection of backcolor as inScope.
     */
    public void setBackcolor_InScope(Collection<java.lang.Integer> backcolorList) {
        regBackcolor(CK_INS, cTL(backcolorList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBackcolor_IsNull() { regBackcolor(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBackcolor_IsNotNull() { regBackcolor(CK_ISNN, DUMMY_OBJECT); }

    protected void regBackcolor(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBackcolor(), "Backcolor", "Backcolor", "backcolor");
    }
    protected void registerInlineBackcolor(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBackcolor(), "Backcolor", "Backcolor", "backcolor");
    }
    abstract protected ConditionValue getCValueBackcolor();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param borderstyle The value of borderstyle as equal.
     */
    public void setBorderstyle_Equal(java.lang.Integer borderstyle) {
        regBorderstyle(CK_EQ, borderstyle);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param borderstyle The value of borderstyle as notEqual.
     */
    public void setBorderstyle_NotEqual(java.lang.Integer borderstyle) {
        regBorderstyle(CK_NE, borderstyle);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param borderstyle The value of borderstyle as greaterThan.
     */
    public void setBorderstyle_GreaterThan(java.lang.Integer borderstyle) {
        regBorderstyle(CK_GT, borderstyle);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param borderstyle The value of borderstyle as lessThan.
     */
    public void setBorderstyle_LessThan(java.lang.Integer borderstyle) {
        regBorderstyle(CK_LT, borderstyle);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param borderstyle The value of borderstyle as greaterEqual.
     */
    public void setBorderstyle_GreaterEqual(java.lang.Integer borderstyle) {
        regBorderstyle(CK_GE, borderstyle);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param borderstyle The value of borderstyle as lessEqual.
     */
    public void setBorderstyle_LessEqual(java.lang.Integer borderstyle) {
        regBorderstyle(CK_LE, borderstyle);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param borderstyleList The collection of borderstyle as inScope.
     */
    public void setBorderstyle_InScope(Collection<java.lang.Integer> borderstyleList) {
        regBorderstyle(CK_INS, cTL(borderstyleList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBorderstyle_IsNull() { regBorderstyle(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBorderstyle_IsNotNull() { regBorderstyle(CK_ISNN, DUMMY_OBJECT); }

    protected void regBorderstyle(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBorderstyle(), "BorderStyle", "Borderstyle", "borderstyle");
    }
    protected void registerInlineBorderstyle(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBorderstyle(), "BorderStyle", "Borderstyle", "borderstyle");
    }
    abstract protected ConditionValue getCValueBorderstyle();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param borderwidth The value of borderwidth as equal.
     */
    public void setBorderwidth_Equal(java.lang.Integer borderwidth) {
        regBorderwidth(CK_EQ, borderwidth);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param borderwidth The value of borderwidth as notEqual.
     */
    public void setBorderwidth_NotEqual(java.lang.Integer borderwidth) {
        regBorderwidth(CK_NE, borderwidth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param borderwidth The value of borderwidth as greaterThan.
     */
    public void setBorderwidth_GreaterThan(java.lang.Integer borderwidth) {
        regBorderwidth(CK_GT, borderwidth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param borderwidth The value of borderwidth as lessThan.
     */
    public void setBorderwidth_LessThan(java.lang.Integer borderwidth) {
        regBorderwidth(CK_LT, borderwidth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param borderwidth The value of borderwidth as greaterEqual.
     */
    public void setBorderwidth_GreaterEqual(java.lang.Integer borderwidth) {
        regBorderwidth(CK_GE, borderwidth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param borderwidth The value of borderwidth as lessEqual.
     */
    public void setBorderwidth_LessEqual(java.lang.Integer borderwidth) {
        regBorderwidth(CK_LE, borderwidth);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param borderwidthList The collection of borderwidth as inScope.
     */
    public void setBorderwidth_InScope(Collection<java.lang.Integer> borderwidthList) {
        regBorderwidth(CK_INS, cTL(borderwidthList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBorderwidth_IsNull() { regBorderwidth(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBorderwidth_IsNotNull() { regBorderwidth(CK_ISNN, DUMMY_OBJECT); }

    protected void regBorderwidth(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBorderwidth(), "BorderWidth", "Borderwidth", "borderwidth");
    }
    protected void registerInlineBorderwidth(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBorderwidth(), "BorderWidth", "Borderwidth", "borderwidth");
    }
    abstract protected ConditionValue getCValueBorderwidth();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param fontcolor The value of fontcolor as equal.
     */
    public void setFontcolor_Equal(java.lang.Integer fontcolor) {
        regFontcolor(CK_EQ, fontcolor);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param fontcolor The value of fontcolor as notEqual.
     */
    public void setFontcolor_NotEqual(java.lang.Integer fontcolor) {
        regFontcolor(CK_NE, fontcolor);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param fontcolor The value of fontcolor as greaterThan.
     */
    public void setFontcolor_GreaterThan(java.lang.Integer fontcolor) {
        regFontcolor(CK_GT, fontcolor);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param fontcolor The value of fontcolor as lessThan.
     */
    public void setFontcolor_LessThan(java.lang.Integer fontcolor) {
        regFontcolor(CK_LT, fontcolor);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param fontcolor The value of fontcolor as greaterEqual.
     */
    public void setFontcolor_GreaterEqual(java.lang.Integer fontcolor) {
        regFontcolor(CK_GE, fontcolor);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param fontcolor The value of fontcolor as lessEqual.
     */
    public void setFontcolor_LessEqual(java.lang.Integer fontcolor) {
        regFontcolor(CK_LE, fontcolor);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param fontcolorList The collection of fontcolor as inScope.
     */
    public void setFontcolor_InScope(Collection<java.lang.Integer> fontcolorList) {
        regFontcolor(CK_INS, cTL(fontcolorList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setFontcolor_IsNull() { regFontcolor(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setFontcolor_IsNotNull() { regFontcolor(CK_ISNN, DUMMY_OBJECT); }

    protected void regFontcolor(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFontcolor(), "Fontcolor", "Fontcolor", "fontcolor");
    }
    protected void registerInlineFontcolor(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFontcolor(), "Fontcolor", "Fontcolor", "fontcolor");
    }
    abstract protected ConditionValue getCValueFontcolor();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param bordercolor The value of bordercolor as equal.
     */
    public void setBordercolor_Equal(java.lang.Integer bordercolor) {
        regBordercolor(CK_EQ, bordercolor);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param bordercolor The value of bordercolor as notEqual.
     */
    public void setBordercolor_NotEqual(java.lang.Integer bordercolor) {
        regBordercolor(CK_NE, bordercolor);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param bordercolor The value of bordercolor as greaterThan.
     */
    public void setBordercolor_GreaterThan(java.lang.Integer bordercolor) {
        regBordercolor(CK_GT, bordercolor);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param bordercolor The value of bordercolor as lessThan.
     */
    public void setBordercolor_LessThan(java.lang.Integer bordercolor) {
        regBordercolor(CK_LT, bordercolor);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param bordercolor The value of bordercolor as greaterEqual.
     */
    public void setBordercolor_GreaterEqual(java.lang.Integer bordercolor) {
        regBordercolor(CK_GE, bordercolor);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param bordercolor The value of bordercolor as lessEqual.
     */
    public void setBordercolor_LessEqual(java.lang.Integer bordercolor) {
        regBordercolor(CK_LE, bordercolor);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param bordercolorList The collection of bordercolor as inScope.
     */
    public void setBordercolor_InScope(Collection<java.lang.Integer> bordercolorList) {
        regBordercolor(CK_INS, cTL(bordercolorList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBordercolor_IsNull() { regBordercolor(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBordercolor_IsNotNull() { regBordercolor(CK_ISNN, DUMMY_OBJECT); }

    protected void regBordercolor(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBordercolor(), "Bordercolor", "Bordercolor", "bordercolor");
    }
    protected void registerInlineBordercolor(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBordercolor(), "Bordercolor", "Bordercolor", "bordercolor");
    }
    abstract protected ConditionValue getCValueBordercolor();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param createddate The value of createddate as equal.
     */
    public void setCreateddate_Equal(java.sql.Timestamp createddate) {
        regCreateddate(CK_EQ, createddate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param createddate The value of createddate as greaterThan.
     */
    public void setCreateddate_GreaterThan(java.sql.Timestamp createddate) {
        regCreateddate(CK_GT, createddate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param createddate The value of createddate as lessThan.
     */
    public void setCreateddate_LessThan(java.sql.Timestamp createddate) {
        regCreateddate(CK_LT, createddate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param createddate The value of createddate as greaterEqual.
     */
    public void setCreateddate_GreaterEqual(java.sql.Timestamp createddate) {
        regCreateddate(CK_GE, createddate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param createddate The value of createddate as lessEqual.
     */
    public void setCreateddate_LessEqual(java.sql.Timestamp createddate) {
        regCreateddate(CK_LE, createddate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of createddate. (Nullable)
     * @param toDate The to-date of createddate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCreateddate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueCreateddate(), "CreatedDate", "Createddate", "createddate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of createddate. (Nullable)
     * @param toDate The to-date of createddate. (Nullable)
     */
    public void setCreateddate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setCreateddate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCreateddate_IsNull() { regCreateddate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCreateddate_IsNotNull() { regCreateddate(CK_ISNN, DUMMY_OBJECT); }

    protected void regCreateddate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCreateddate(), "CreatedDate", "Createddate", "createddate");
    }
    protected void registerInlineCreateddate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCreateddate(), "CreatedDate", "Createddate", "createddate");
    }
    abstract protected ConditionValue getCValueCreateddate();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param modifieddate The value of modifieddate as equal.
     */
    public void setModifieddate_Equal(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_EQ, modifieddate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param modifieddate The value of modifieddate as greaterThan.
     */
    public void setModifieddate_GreaterThan(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_GT, modifieddate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param modifieddate The value of modifieddate as lessThan.
     */
    public void setModifieddate_LessThan(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_LT, modifieddate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param modifieddate The value of modifieddate as greaterEqual.
     */
    public void setModifieddate_GreaterEqual(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_GE, modifieddate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param modifieddate The value of modifieddate as lessEqual.
     */
    public void setModifieddate_LessEqual(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_LE, modifieddate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of modifieddate. (Nullable)
     * @param toDate The to-date of modifieddate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setModifieddate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueModifieddate(), "ModifiedDate", "Modifieddate", "modifieddate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of modifieddate. (Nullable)
     * @param toDate The to-date of modifieddate. (Nullable)
     */
    public void setModifieddate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setModifieddate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setModifieddate_IsNull() { regModifieddate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setModifieddate_IsNotNull() { regModifieddate(CK_ISNN, DUMMY_OBJECT); }

    protected void regModifieddate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueModifieddate(), "ModifiedDate", "Modifieddate", "modifieddate");
    }
    protected void registerInlineModifieddate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueModifieddate(), "ModifiedDate", "Modifieddate", "modifieddate");
    }
    abstract protected ConditionValue getCValueModifieddate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param status The value of status as equal.
     */
    public void setStatus_Equal(String status) {
        regStatus(CK_EQ, fRES(status));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as notEqual.
     */
    public void setStatus_NotEqual(String status) {
        regStatus(CK_NE, fRES(status));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as greaterThan.
     */
    public void setStatus_GreaterThan(String status) {
        regStatus(CK_GT, fRES(status));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as lessThan.
     */
    public void setStatus_LessThan(String status) {
        regStatus(CK_LT, fRES(status));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as greaterEqual.
     */
    public void setStatus_GreaterEqual(String status) {
        regStatus(CK_GE, fRES(status));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as lessEqual.
     */
    public void setStatus_LessEqual(String status) {
        regStatus(CK_LE, fRES(status));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param status The value of status as prefixSearch.
     */
    public void setStatus_PrefixSearch(String status) {
        regStatus(CK_PS, fRES(status));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param status The value of status as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatus_LikeSearch(String status, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(status), getCValueStatus(), "Status", "Status", "status", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param statusList The collection of status as inScope.
     */
    public void setStatus_InScope(Collection<String> statusList) {
        regStatus(CK_INS, cTL(statusList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param status The collection of status as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStatus_InScope(String status, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(status), getCValueStatus(), "Status", "Status", "status", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStatus_IsNull() { regStatus(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStatus_IsNotNull() { regStatus(CK_ISNN, DUMMY_OBJECT); }

    protected void regStatus(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStatus(), "Status", "Status", "status");
    }
    protected void registerInlineStatus(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStatus(), "Status", "Status", "status");
    }
    abstract protected ConditionValue getCValueStatus();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param tagged The value of tagged as equal.
     */
    public void setTagged_Equal(java.lang.Integer tagged) {
        regTagged(CK_EQ, tagged);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param tagged The value of tagged as notEqual.
     */
    public void setTagged_NotEqual(java.lang.Integer tagged) {
        regTagged(CK_NE, tagged);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param tagged The value of tagged as greaterThan.
     */
    public void setTagged_GreaterThan(java.lang.Integer tagged) {
        regTagged(CK_GT, tagged);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param tagged The value of tagged as lessThan.
     */
    public void setTagged_LessThan(java.lang.Integer tagged) {
        regTagged(CK_LT, tagged);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param tagged The value of tagged as greaterEqual.
     */
    public void setTagged_GreaterEqual(java.lang.Integer tagged) {
        regTagged(CK_GE, tagged);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param tagged The value of tagged as lessEqual.
     */
    public void setTagged_LessEqual(java.lang.Integer tagged) {
        regTagged(CK_LE, tagged);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param taggedList The collection of tagged as inScope.
     */
    public void setTagged_InScope(Collection<java.lang.Integer> taggedList) {
        regTagged(CK_INS, cTL(taggedList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTagged_IsNull() { regTagged(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTagged_IsNotNull() { regTagged(CK_ISNN, DUMMY_OBJECT); }

    protected void regTagged(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTagged(), "Tagged", "Tagged", "tagged");
    }
    protected void registerInlineTagged(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTagged(), "Tagged", "Tagged", "tagged");
    }
    abstract protected ConditionValue getCValueTagged();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata1 The value of pdata1 as equal.
     */
    public void setPdata1_Equal(String pdata1) {
        regPdata1(CK_EQ, fRES(pdata1));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as notEqual.
     */
    public void setPdata1_NotEqual(String pdata1) {
        regPdata1(CK_NE, fRES(pdata1));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as greaterThan.
     */
    public void setPdata1_GreaterThan(String pdata1) {
        regPdata1(CK_GT, fRES(pdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as lessThan.
     */
    public void setPdata1_LessThan(String pdata1) {
        regPdata1(CK_LT, fRES(pdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as greaterEqual.
     */
    public void setPdata1_GreaterEqual(String pdata1) {
        regPdata1(CK_GE, fRES(pdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as lessEqual.
     */
    public void setPdata1_LessEqual(String pdata1) {
        regPdata1(CK_LE, fRES(pdata1));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as prefixSearch.
     */
    public void setPdata1_PrefixSearch(String pdata1) {
        regPdata1(CK_PS, fRES(pdata1));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata1 The value of pdata1 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata1_LikeSearch(String pdata1, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata1), getCValuePdata1(), "PDATA1", "Pdata1", "pdata1", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata1List The collection of pdata1 as inScope.
     */
    public void setPdata1_InScope(Collection<String> pdata1List) {
        regPdata1(CK_INS, cTL(pdata1List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata1 The collection of pdata1 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata1_InScope(String pdata1, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata1), getCValuePdata1(), "PDATA1", "Pdata1", "pdata1", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata1_IsNull() { regPdata1(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata1_IsNotNull() { regPdata1(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata1(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata1(), "PDATA1", "Pdata1", "pdata1");
    }
    protected void registerInlinePdata1(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata1(), "PDATA1", "Pdata1", "pdata1");
    }
    abstract protected ConditionValue getCValuePdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata2 The value of pdata2 as equal.
     */
    public void setPdata2_Equal(String pdata2) {
        regPdata2(CK_EQ, fRES(pdata2));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as notEqual.
     */
    public void setPdata2_NotEqual(String pdata2) {
        regPdata2(CK_NE, fRES(pdata2));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as greaterThan.
     */
    public void setPdata2_GreaterThan(String pdata2) {
        regPdata2(CK_GT, fRES(pdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as lessThan.
     */
    public void setPdata2_LessThan(String pdata2) {
        regPdata2(CK_LT, fRES(pdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as greaterEqual.
     */
    public void setPdata2_GreaterEqual(String pdata2) {
        regPdata2(CK_GE, fRES(pdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as lessEqual.
     */
    public void setPdata2_LessEqual(String pdata2) {
        regPdata2(CK_LE, fRES(pdata2));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as prefixSearch.
     */
    public void setPdata2_PrefixSearch(String pdata2) {
        regPdata2(CK_PS, fRES(pdata2));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata2 The value of pdata2 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata2_LikeSearch(String pdata2, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata2), getCValuePdata2(), "PDATA2", "Pdata2", "pdata2", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata2List The collection of pdata2 as inScope.
     */
    public void setPdata2_InScope(Collection<String> pdata2List) {
        regPdata2(CK_INS, cTL(pdata2List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata2 The collection of pdata2 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata2_InScope(String pdata2, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata2), getCValuePdata2(), "PDATA2", "Pdata2", "pdata2", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata2_IsNull() { regPdata2(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata2_IsNotNull() { regPdata2(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata2(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata2(), "PDATA2", "Pdata2", "pdata2");
    }
    protected void registerInlinePdata2(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata2(), "PDATA2", "Pdata2", "pdata2");
    }
    abstract protected ConditionValue getCValuePdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata3 The value of pdata3 as equal.
     */
    public void setPdata3_Equal(String pdata3) {
        regPdata3(CK_EQ, fRES(pdata3));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as notEqual.
     */
    public void setPdata3_NotEqual(String pdata3) {
        regPdata3(CK_NE, fRES(pdata3));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as greaterThan.
     */
    public void setPdata3_GreaterThan(String pdata3) {
        regPdata3(CK_GT, fRES(pdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as lessThan.
     */
    public void setPdata3_LessThan(String pdata3) {
        regPdata3(CK_LT, fRES(pdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as greaterEqual.
     */
    public void setPdata3_GreaterEqual(String pdata3) {
        regPdata3(CK_GE, fRES(pdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as lessEqual.
     */
    public void setPdata3_LessEqual(String pdata3) {
        regPdata3(CK_LE, fRES(pdata3));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as prefixSearch.
     */
    public void setPdata3_PrefixSearch(String pdata3) {
        regPdata3(CK_PS, fRES(pdata3));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata3 The value of pdata3 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata3_LikeSearch(String pdata3, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata3), getCValuePdata3(), "PDATA3", "Pdata3", "pdata3", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata3List The collection of pdata3 as inScope.
     */
    public void setPdata3_InScope(Collection<String> pdata3List) {
        regPdata3(CK_INS, cTL(pdata3List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata3 The collection of pdata3 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata3_InScope(String pdata3, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata3), getCValuePdata3(), "PDATA3", "Pdata3", "pdata3", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata3_IsNull() { regPdata3(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata3_IsNotNull() { regPdata3(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata3(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata3(), "PDATA3", "Pdata3", "pdata3");
    }
    protected void registerInlinePdata3(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata3(), "PDATA3", "Pdata3", "pdata3");
    }
    abstract protected ConditionValue getCValuePdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata4 The value of pdata4 as equal.
     */
    public void setPdata4_Equal(String pdata4) {
        regPdata4(CK_EQ, fRES(pdata4));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as notEqual.
     */
    public void setPdata4_NotEqual(String pdata4) {
        regPdata4(CK_NE, fRES(pdata4));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as greaterThan.
     */
    public void setPdata4_GreaterThan(String pdata4) {
        regPdata4(CK_GT, fRES(pdata4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as lessThan.
     */
    public void setPdata4_LessThan(String pdata4) {
        regPdata4(CK_LT, fRES(pdata4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as greaterEqual.
     */
    public void setPdata4_GreaterEqual(String pdata4) {
        regPdata4(CK_GE, fRES(pdata4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as lessEqual.
     */
    public void setPdata4_LessEqual(String pdata4) {
        regPdata4(CK_LE, fRES(pdata4));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as prefixSearch.
     */
    public void setPdata4_PrefixSearch(String pdata4) {
        regPdata4(CK_PS, fRES(pdata4));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata4 The value of pdata4 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata4_LikeSearch(String pdata4, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata4), getCValuePdata4(), "PDATA4", "Pdata4", "pdata4", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata4List The collection of pdata4 as inScope.
     */
    public void setPdata4_InScope(Collection<String> pdata4List) {
        regPdata4(CK_INS, cTL(pdata4List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata4 The collection of pdata4 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata4_InScope(String pdata4, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata4), getCValuePdata4(), "PDATA4", "Pdata4", "pdata4", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata4_IsNull() { regPdata4(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata4_IsNotNull() { regPdata4(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata4(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata4(), "PDATA4", "Pdata4", "pdata4");
    }
    protected void registerInlinePdata4(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata4(), "PDATA4", "Pdata4", "pdata4");
    }
    abstract protected ConditionValue getCValuePdata4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata5 The value of pdata5 as equal.
     */
    public void setPdata5_Equal(String pdata5) {
        regPdata5(CK_EQ, fRES(pdata5));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata5 The value of pdata5 as notEqual.
     */
    public void setPdata5_NotEqual(String pdata5) {
        regPdata5(CK_NE, fRES(pdata5));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata5 The value of pdata5 as greaterThan.
     */
    public void setPdata5_GreaterThan(String pdata5) {
        regPdata5(CK_GT, fRES(pdata5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata5 The value of pdata5 as lessThan.
     */
    public void setPdata5_LessThan(String pdata5) {
        regPdata5(CK_LT, fRES(pdata5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata5 The value of pdata5 as greaterEqual.
     */
    public void setPdata5_GreaterEqual(String pdata5) {
        regPdata5(CK_GE, fRES(pdata5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata5 The value of pdata5 as lessEqual.
     */
    public void setPdata5_LessEqual(String pdata5) {
        regPdata5(CK_LE, fRES(pdata5));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata5 The value of pdata5 as prefixSearch.
     */
    public void setPdata5_PrefixSearch(String pdata5) {
        regPdata5(CK_PS, fRES(pdata5));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata5 The value of pdata5 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata5_LikeSearch(String pdata5, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata5), getCValuePdata5(), "PDATA5", "Pdata5", "pdata5", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata5List The collection of pdata5 as inScope.
     */
    public void setPdata5_InScope(Collection<String> pdata5List) {
        regPdata5(CK_INS, cTL(pdata5List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata5 The collection of pdata5 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata5_InScope(String pdata5, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata5), getCValuePdata5(), "PDATA5", "Pdata5", "pdata5", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata5_IsNull() { regPdata5(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata5_IsNotNull() { regPdata5(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata5(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata5(), "PDATA5", "Pdata5", "pdata5");
    }
    protected void registerInlinePdata5(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata5(), "PDATA5", "Pdata5", "pdata5");
    }
    abstract protected ConditionValue getCValuePdata5();

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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param visibility The value of visibility as equal.
     */
    public void setVisibility_Equal(String visibility) {
        regVisibility(CK_EQ, fRES(visibility));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param visibility The value of visibility as notEqual.
     */
    public void setVisibility_NotEqual(String visibility) {
        regVisibility(CK_NE, fRES(visibility));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param visibility The value of visibility as greaterThan.
     */
    public void setVisibility_GreaterThan(String visibility) {
        regVisibility(CK_GT, fRES(visibility));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param visibility The value of visibility as lessThan.
     */
    public void setVisibility_LessThan(String visibility) {
        regVisibility(CK_LT, fRES(visibility));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param visibility The value of visibility as greaterEqual.
     */
    public void setVisibility_GreaterEqual(String visibility) {
        regVisibility(CK_GE, fRES(visibility));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param visibility The value of visibility as lessEqual.
     */
    public void setVisibility_LessEqual(String visibility) {
        regVisibility(CK_LE, fRES(visibility));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param visibility The value of visibility as prefixSearch.
     */
    public void setVisibility_PrefixSearch(String visibility) {
        regVisibility(CK_PS, fRES(visibility));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param visibility The value of visibility as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVisibility_LikeSearch(String visibility, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(visibility), getCValueVisibility(), "Visibility", "Visibility", "visibility", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param visibilityList The collection of visibility as inScope.
     */
    public void setVisibility_InScope(Collection<String> visibilityList) {
        regVisibility(CK_INS, cTL(visibilityList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param visibility The collection of visibility as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setVisibility_InScope(String visibility, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(visibility), getCValueVisibility(), "Visibility", "Visibility", "visibility", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setVisibility_IsNull() { regVisibility(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setVisibility_IsNotNull() { regVisibility(CK_ISNN, DUMMY_OBJECT); }

    protected void regVisibility(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueVisibility(), "Visibility", "Visibility", "visibility");
    }
    protected void registerInlineVisibility(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueVisibility(), "Visibility", "Visibility", "visibility");
    }
    abstract protected ConditionValue getCValueVisibility();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param persistence The value of persistence as equal.
     */
    public void setPersistence_Equal(String persistence) {
        regPersistence(CK_EQ, fRES(persistence));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param persistence The value of persistence as notEqual.
     */
    public void setPersistence_NotEqual(String persistence) {
        regPersistence(CK_NE, fRES(persistence));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param persistence The value of persistence as greaterThan.
     */
    public void setPersistence_GreaterThan(String persistence) {
        regPersistence(CK_GT, fRES(persistence));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param persistence The value of persistence as lessThan.
     */
    public void setPersistence_LessThan(String persistence) {
        regPersistence(CK_LT, fRES(persistence));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param persistence The value of persistence as greaterEqual.
     */
    public void setPersistence_GreaterEqual(String persistence) {
        regPersistence(CK_GE, fRES(persistence));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param persistence The value of persistence as lessEqual.
     */
    public void setPersistence_LessEqual(String persistence) {
        regPersistence(CK_LE, fRES(persistence));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param persistence The value of persistence as prefixSearch.
     */
    public void setPersistence_PrefixSearch(String persistence) {
        regPersistence(CK_PS, fRES(persistence));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param persistence The value of persistence as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPersistence_LikeSearch(String persistence, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(persistence), getCValuePersistence(), "Persistence", "Persistence", "persistence", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param persistenceList The collection of persistence as inScope.
     */
    public void setPersistence_InScope(Collection<String> persistenceList) {
        regPersistence(CK_INS, cTL(persistenceList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param persistence The collection of persistence as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPersistence_InScope(String persistence, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(persistence), getCValuePersistence(), "Persistence", "Persistence", "persistence", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPersistence_IsNull() { regPersistence(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPersistence_IsNotNull() { regPersistence(CK_ISNN, DUMMY_OBJECT); }

    protected void regPersistence(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePersistence(), "Persistence", "Persistence", "persistence");
    }
    protected void registerInlinePersistence(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePersistence(), "Persistence", "Persistence", "persistence");
    }
    abstract protected ConditionValue getCValuePersistence();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param cardinality The value of cardinality as equal.
     */
    public void setCardinality_Equal(String cardinality) {
        regCardinality(CK_EQ, fRES(cardinality));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param cardinality The value of cardinality as notEqual.
     */
    public void setCardinality_NotEqual(String cardinality) {
        regCardinality(CK_NE, fRES(cardinality));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param cardinality The value of cardinality as greaterThan.
     */
    public void setCardinality_GreaterThan(String cardinality) {
        regCardinality(CK_GT, fRES(cardinality));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param cardinality The value of cardinality as lessThan.
     */
    public void setCardinality_LessThan(String cardinality) {
        regCardinality(CK_LT, fRES(cardinality));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param cardinality The value of cardinality as greaterEqual.
     */
    public void setCardinality_GreaterEqual(String cardinality) {
        regCardinality(CK_GE, fRES(cardinality));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param cardinality The value of cardinality as lessEqual.
     */
    public void setCardinality_LessEqual(String cardinality) {
        regCardinality(CK_LE, fRES(cardinality));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param cardinality The value of cardinality as prefixSearch.
     */
    public void setCardinality_PrefixSearch(String cardinality) {
        regCardinality(CK_PS, fRES(cardinality));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param cardinality The value of cardinality as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardinality_LikeSearch(String cardinality, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(cardinality), getCValueCardinality(), "Cardinality", "Cardinality", "cardinality", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param cardinalityList The collection of cardinality as inScope.
     */
    public void setCardinality_InScope(Collection<String> cardinalityList) {
        regCardinality(CK_INS, cTL(cardinalityList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param cardinality The collection of cardinality as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setCardinality_InScope(String cardinality, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(cardinality), getCValueCardinality(), "Cardinality", "Cardinality", "cardinality", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCardinality_IsNull() { regCardinality(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCardinality_IsNotNull() { regCardinality(CK_ISNN, DUMMY_OBJECT); }

    protected void regCardinality(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCardinality(), "Cardinality", "Cardinality", "cardinality");
    }
    protected void registerInlineCardinality(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCardinality(), "Cardinality", "Cardinality", "cardinality");
    }
    abstract protected ConditionValue getCValueCardinality();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param gentype The value of gentype as equal.
     */
    public void setGentype_Equal(String gentype) {
        regGentype(CK_EQ, fRES(gentype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param gentype The value of gentype as notEqual.
     */
    public void setGentype_NotEqual(String gentype) {
        regGentype(CK_NE, fRES(gentype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param gentype The value of gentype as greaterThan.
     */
    public void setGentype_GreaterThan(String gentype) {
        regGentype(CK_GT, fRES(gentype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param gentype The value of gentype as lessThan.
     */
    public void setGentype_LessThan(String gentype) {
        regGentype(CK_LT, fRES(gentype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param gentype The value of gentype as greaterEqual.
     */
    public void setGentype_GreaterEqual(String gentype) {
        regGentype(CK_GE, fRES(gentype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param gentype The value of gentype as lessEqual.
     */
    public void setGentype_LessEqual(String gentype) {
        regGentype(CK_LE, fRES(gentype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param gentype The value of gentype as prefixSearch.
     */
    public void setGentype_PrefixSearch(String gentype) {
        regGentype(CK_PS, fRES(gentype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param gentype The value of gentype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGentype_LikeSearch(String gentype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(gentype), getCValueGentype(), "GenType", "Gentype", "gentype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param gentypeList The collection of gentype as inScope.
     */
    public void setGentype_InScope(Collection<String> gentypeList) {
        regGentype(CK_INS, cTL(gentypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param gentype The collection of gentype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setGentype_InScope(String gentype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(gentype), getCValueGentype(), "GenType", "Gentype", "gentype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setGentype_IsNull() { regGentype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setGentype_IsNotNull() { regGentype(CK_ISNN, DUMMY_OBJECT); }

    protected void regGentype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueGentype(), "GenType", "Gentype", "gentype");
    }
    protected void registerInlineGentype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueGentype(), "GenType", "Gentype", "gentype");
    }
    abstract protected ConditionValue getCValueGentype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param genfile The value of genfile as equal.
     */
    public void setGenfile_Equal(String genfile) {
        regGenfile(CK_EQ, fRES(genfile));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param genfile The value of genfile as notEqual.
     */
    public void setGenfile_NotEqual(String genfile) {
        regGenfile(CK_NE, fRES(genfile));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param genfile The value of genfile as greaterThan.
     */
    public void setGenfile_GreaterThan(String genfile) {
        regGenfile(CK_GT, fRES(genfile));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param genfile The value of genfile as lessThan.
     */
    public void setGenfile_LessThan(String genfile) {
        regGenfile(CK_LT, fRES(genfile));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param genfile The value of genfile as greaterEqual.
     */
    public void setGenfile_GreaterEqual(String genfile) {
        regGenfile(CK_GE, fRES(genfile));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param genfile The value of genfile as lessEqual.
     */
    public void setGenfile_LessEqual(String genfile) {
        regGenfile(CK_LE, fRES(genfile));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param genfile The value of genfile as prefixSearch.
     */
    public void setGenfile_PrefixSearch(String genfile) {
        regGenfile(CK_PS, fRES(genfile));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genfile The value of genfile as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenfile_LikeSearch(String genfile, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(genfile), getCValueGenfile(), "GenFile", "Genfile", "genfile", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genfileList The collection of genfile as inScope.
     */
    public void setGenfile_InScope(Collection<String> genfileList) {
        regGenfile(CK_INS, cTL(genfileList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genfile The collection of genfile as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setGenfile_InScope(String genfile, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(genfile), getCValueGenfile(), "GenFile", "Genfile", "genfile", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setGenfile_IsNull() { regGenfile(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setGenfile_IsNotNull() { regGenfile(CK_ISNN, DUMMY_OBJECT); }

    protected void regGenfile(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueGenfile(), "GenFile", "Genfile", "genfile");
    }
    protected void registerInlineGenfile(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueGenfile(), "GenFile", "Genfile", "genfile");
    }
    abstract protected ConditionValue getCValueGenfile();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param header1 The value of header1 as equal.
     */
    public void setHeader1_Equal(String header1) {
        regHeader1(CK_EQ, fRES(header1));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param header1 The value of header1 as notEqual.
     */
    public void setHeader1_NotEqual(String header1) {
        regHeader1(CK_NE, fRES(header1));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param header1 The value of header1 as greaterThan.
     */
    public void setHeader1_GreaterThan(String header1) {
        regHeader1(CK_GT, fRES(header1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param header1 The value of header1 as lessThan.
     */
    public void setHeader1_LessThan(String header1) {
        regHeader1(CK_LT, fRES(header1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param header1 The value of header1 as greaterEqual.
     */
    public void setHeader1_GreaterEqual(String header1) {
        regHeader1(CK_GE, fRES(header1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param header1 The value of header1 as lessEqual.
     */
    public void setHeader1_LessEqual(String header1) {
        regHeader1(CK_LE, fRES(header1));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param header1 The value of header1 as prefixSearch.
     */
    public void setHeader1_PrefixSearch(String header1) {
        regHeader1(CK_PS, fRES(header1));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param header1 The value of header1 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeader1_LikeSearch(String header1, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(header1), getCValueHeader1(), "Header1", "Header1", "header1", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param header1List The collection of header1 as inScope.
     */
    public void setHeader1_InScope(Collection<String> header1List) {
        regHeader1(CK_INS, cTL(header1List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param header1 The collection of header1 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setHeader1_InScope(String header1, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(header1), getCValueHeader1(), "Header1", "Header1", "header1", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setHeader1_IsNull() { regHeader1(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setHeader1_IsNotNull() { regHeader1(CK_ISNN, DUMMY_OBJECT); }

    protected void regHeader1(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueHeader1(), "Header1", "Header1", "header1");
    }
    protected void registerInlineHeader1(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueHeader1(), "Header1", "Header1", "header1");
    }
    abstract protected ConditionValue getCValueHeader1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param header2 The value of header2 as equal.
     */
    public void setHeader2_Equal(String header2) {
        regHeader2(CK_EQ, fRES(header2));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param header2 The value of header2 as notEqual.
     */
    public void setHeader2_NotEqual(String header2) {
        regHeader2(CK_NE, fRES(header2));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param header2 The value of header2 as greaterThan.
     */
    public void setHeader2_GreaterThan(String header2) {
        regHeader2(CK_GT, fRES(header2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param header2 The value of header2 as lessThan.
     */
    public void setHeader2_LessThan(String header2) {
        regHeader2(CK_LT, fRES(header2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param header2 The value of header2 as greaterEqual.
     */
    public void setHeader2_GreaterEqual(String header2) {
        regHeader2(CK_GE, fRES(header2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param header2 The value of header2 as lessEqual.
     */
    public void setHeader2_LessEqual(String header2) {
        regHeader2(CK_LE, fRES(header2));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param header2 The value of header2 as prefixSearch.
     */
    public void setHeader2_PrefixSearch(String header2) {
        regHeader2(CK_PS, fRES(header2));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param header2 The value of header2 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeader2_LikeSearch(String header2, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(header2), getCValueHeader2(), "Header2", "Header2", "header2", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param header2List The collection of header2 as inScope.
     */
    public void setHeader2_InScope(Collection<String> header2List) {
        regHeader2(CK_INS, cTL(header2List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param header2 The collection of header2 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setHeader2_InScope(String header2, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(header2), getCValueHeader2(), "Header2", "Header2", "header2", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setHeader2_IsNull() { regHeader2(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setHeader2_IsNotNull() { regHeader2(CK_ISNN, DUMMY_OBJECT); }

    protected void regHeader2(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueHeader2(), "Header2", "Header2", "header2");
    }
    protected void registerInlineHeader2(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueHeader2(), "Header2", "Header2", "header2");
    }
    abstract protected ConditionValue getCValueHeader2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param phase The value of phase as equal.
     */
    public void setPhase_Equal(String phase) {
        regPhase(CK_EQ, fRES(phase));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phase The value of phase as notEqual.
     */
    public void setPhase_NotEqual(String phase) {
        regPhase(CK_NE, fRES(phase));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phase The value of phase as greaterThan.
     */
    public void setPhase_GreaterThan(String phase) {
        regPhase(CK_GT, fRES(phase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param phase The value of phase as lessThan.
     */
    public void setPhase_LessThan(String phase) {
        regPhase(CK_LT, fRES(phase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phase The value of phase as greaterEqual.
     */
    public void setPhase_GreaterEqual(String phase) {
        regPhase(CK_GE, fRES(phase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param phase The value of phase as lessEqual.
     */
    public void setPhase_LessEqual(String phase) {
        regPhase(CK_LE, fRES(phase));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param phase The value of phase as prefixSearch.
     */
    public void setPhase_PrefixSearch(String phase) {
        regPhase(CK_PS, fRES(phase));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phase The value of phase as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhase_LikeSearch(String phase, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(phase), getCValuePhase(), "Phase", "Phase", "phase", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phaseList The collection of phase as inScope.
     */
    public void setPhase_InScope(Collection<String> phaseList) {
        regPhase(CK_INS, cTL(phaseList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phase The collection of phase as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPhase_InScope(String phase, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(phase), getCValuePhase(), "Phase", "Phase", "phase", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPhase_IsNull() { regPhase(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPhase_IsNotNull() { regPhase(CK_ISNN, DUMMY_OBJECT); }

    protected void regPhase(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePhase(), "Phase", "Phase", "phase");
    }
    protected void registerInlinePhase(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePhase(), "Phase", "Phase", "phase");
    }
    abstract protected ConditionValue getCValuePhase();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(25)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param genlinks The value of genlinks as equal.
     */
    public void setGenlinks_Equal(String genlinks) {
        regGenlinks(CK_EQ, fRES(genlinks));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param genlinks The value of genlinks as notEqual.
     */
    public void setGenlinks_NotEqual(String genlinks) {
        regGenlinks(CK_NE, fRES(genlinks));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param genlinks The value of genlinks as greaterThan.
     */
    public void setGenlinks_GreaterThan(String genlinks) {
        regGenlinks(CK_GT, fRES(genlinks));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param genlinks The value of genlinks as lessThan.
     */
    public void setGenlinks_LessThan(String genlinks) {
        regGenlinks(CK_LT, fRES(genlinks));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param genlinks The value of genlinks as greaterEqual.
     */
    public void setGenlinks_GreaterEqual(String genlinks) {
        regGenlinks(CK_GE, fRES(genlinks));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param genlinks The value of genlinks as lessEqual.
     */
    public void setGenlinks_LessEqual(String genlinks) {
        regGenlinks(CK_LE, fRES(genlinks));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param genlinks The value of genlinks as prefixSearch.
     */
    public void setGenlinks_PrefixSearch(String genlinks) {
        regGenlinks(CK_PS, fRES(genlinks));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genlinks The value of genlinks as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenlinks_LikeSearch(String genlinks, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(genlinks), getCValueGenlinks(), "GenLinks", "Genlinks", "genlinks", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genlinksList The collection of genlinks as inScope.
     */
    public void setGenlinks_InScope(Collection<String> genlinksList) {
        regGenlinks(CK_INS, cTL(genlinksList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genlinks The collection of genlinks as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setGenlinks_InScope(String genlinks, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(genlinks), getCValueGenlinks(), "GenLinks", "Genlinks", "genlinks", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setGenlinks_IsNull() { regGenlinks(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setGenlinks_IsNotNull() { regGenlinks(CK_ISNN, DUMMY_OBJECT); }

    protected void regGenlinks(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueGenlinks(), "GenLinks", "Genlinks", "genlinks");
    }
    protected void registerInlineGenlinks(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueGenlinks(), "GenLinks", "Genlinks", "genlinks");
    }
    abstract protected ConditionValue getCValueGenlinks();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param classifier The value of classifier as equal.
     */
    public void setClassifier_Equal(java.lang.Integer classifier) {
        regClassifier(CK_EQ, classifier);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param classifier The value of classifier as notEqual.
     */
    public void setClassifier_NotEqual(java.lang.Integer classifier) {
        regClassifier(CK_NE, classifier);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param classifier The value of classifier as greaterThan.
     */
    public void setClassifier_GreaterThan(java.lang.Integer classifier) {
        regClassifier(CK_GT, classifier);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param classifier The value of classifier as lessThan.
     */
    public void setClassifier_LessThan(java.lang.Integer classifier) {
        regClassifier(CK_LT, classifier);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param classifier The value of classifier as greaterEqual.
     */
    public void setClassifier_GreaterEqual(java.lang.Integer classifier) {
        regClassifier(CK_GE, classifier);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param classifier The value of classifier as lessEqual.
     */
    public void setClassifier_LessEqual(java.lang.Integer classifier) {
        regClassifier(CK_LE, classifier);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param classifierList The collection of classifier as inScope.
     */
    public void setClassifier_InScope(Collection<java.lang.Integer> classifierList) {
        regClassifier(CK_INS, cTL(classifierList));
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(40)}
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
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param parentid The value of parentid as equal.
     */
    public void setParentid_Equal(java.lang.Integer parentid) {
        regParentid(CK_EQ, parentid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param parentid The value of parentid as notEqual.
     */
    public void setParentid_NotEqual(java.lang.Integer parentid) {
        regParentid(CK_NE, parentid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param parentid The value of parentid as greaterThan.
     */
    public void setParentid_GreaterThan(java.lang.Integer parentid) {
        regParentid(CK_GT, parentid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param parentid The value of parentid as lessThan.
     */
    public void setParentid_LessThan(java.lang.Integer parentid) {
        regParentid(CK_LT, parentid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param parentid The value of parentid as greaterEqual.
     */
    public void setParentid_GreaterEqual(java.lang.Integer parentid) {
        regParentid(CK_GE, parentid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param parentid The value of parentid as lessEqual.
     */
    public void setParentid_LessEqual(java.lang.Integer parentid) {
        regParentid(CK_LE, parentid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param parentidList The collection of parentid as inScope.
     */
    public void setParentid_InScope(Collection<java.lang.Integer> parentidList) {
        regParentid(CK_INS, cTL(parentidList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setParentid_IsNull() { regParentid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setParentid_IsNotNull() { regParentid(CK_ISNN, DUMMY_OBJECT); }

    protected void regParentid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueParentid(), "ParentID", "Parentid", "parentid");
    }
    protected void registerInlineParentid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueParentid(), "ParentID", "Parentid", "parentid");
    }
    abstract protected ConditionValue getCValueParentid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param runstate The value of runstate as equal.
     */
    public void setRunstate_Equal(String runstate) {
        regRunstate(CK_EQ, fRES(runstate));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param runstate The value of runstate as notEqual.
     */
    public void setRunstate_NotEqual(String runstate) {
        regRunstate(CK_NE, fRES(runstate));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param runstate The value of runstate as greaterThan.
     */
    public void setRunstate_GreaterThan(String runstate) {
        regRunstate(CK_GT, fRES(runstate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param runstate The value of runstate as lessThan.
     */
    public void setRunstate_LessThan(String runstate) {
        regRunstate(CK_LT, fRES(runstate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param runstate The value of runstate as greaterEqual.
     */
    public void setRunstate_GreaterEqual(String runstate) {
        regRunstate(CK_GE, fRES(runstate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param runstate The value of runstate as lessEqual.
     */
    public void setRunstate_LessEqual(String runstate) {
        regRunstate(CK_LE, fRES(runstate));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param runstate The value of runstate as prefixSearch.
     */
    public void setRunstate_PrefixSearch(String runstate) {
        regRunstate(CK_PS, fRES(runstate));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param runstate The value of runstate as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRunstate_LikeSearch(String runstate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(runstate), getCValueRunstate(), "RunState", "Runstate", "runstate", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param runstateList The collection of runstate as inScope.
     */
    public void setRunstate_InScope(Collection<String> runstateList) {
        regRunstate(CK_INS, cTL(runstateList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param runstate The collection of runstate as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setRunstate_InScope(String runstate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(runstate), getCValueRunstate(), "RunState", "Runstate", "runstate", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRunstate_IsNull() { regRunstate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRunstate_IsNotNull() { regRunstate(CK_ISNN, DUMMY_OBJECT); }

    protected void regRunstate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRunstate(), "RunState", "Runstate", "runstate");
    }
    protected void registerInlineRunstate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRunstate(), "RunState", "Runstate", "runstate");
    }
    abstract protected ConditionValue getCValueRunstate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(40)}
     * @param classifierGuid The value of classifierGuid as equal.
     */
    public void setClassifierGuid_Equal(String classifierGuid) {
        regClassifierGuid(CK_EQ, fRES(classifierGuid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifierGuid The value of classifierGuid as notEqual.
     */
    public void setClassifierGuid_NotEqual(String classifierGuid) {
        regClassifierGuid(CK_NE, fRES(classifierGuid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifierGuid The value of classifierGuid as greaterThan.
     */
    public void setClassifierGuid_GreaterThan(String classifierGuid) {
        regClassifierGuid(CK_GT, fRES(classifierGuid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifierGuid The value of classifierGuid as lessThan.
     */
    public void setClassifierGuid_LessThan(String classifierGuid) {
        regClassifierGuid(CK_LT, fRES(classifierGuid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifierGuid The value of classifierGuid as greaterEqual.
     */
    public void setClassifierGuid_GreaterEqual(String classifierGuid) {
        regClassifierGuid(CK_GE, fRES(classifierGuid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifierGuid The value of classifierGuid as lessEqual.
     */
    public void setClassifierGuid_LessEqual(String classifierGuid) {
        regClassifierGuid(CK_LE, fRES(classifierGuid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifierGuid The value of classifierGuid as prefixSearch.
     */
    public void setClassifierGuid_PrefixSearch(String classifierGuid) {
        regClassifierGuid(CK_PS, fRES(classifierGuid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param classifierGuid The value of classifierGuid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassifierGuid_LikeSearch(String classifierGuid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(classifierGuid), getCValueClassifierGuid(), "Classifier_guid", "ClassifierGuid", "classifierGuid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param classifierGuidList The collection of classifierGuid as inScope.
     */
    public void setClassifierGuid_InScope(Collection<String> classifierGuidList) {
        regClassifierGuid(CK_INS, cTL(classifierGuidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param classifierGuid The collection of classifierGuid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setClassifierGuid_InScope(String classifierGuid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(classifierGuid), getCValueClassifierGuid(), "Classifier_guid", "ClassifierGuid", "classifierGuid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setClassifierGuid_IsNull() { regClassifierGuid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setClassifierGuid_IsNotNull() { regClassifierGuid(CK_ISNN, DUMMY_OBJECT); }

    protected void regClassifierGuid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueClassifierGuid(), "Classifier_guid", "ClassifierGuid", "classifierGuid");
    }
    protected void registerInlineClassifierGuid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueClassifierGuid(), "Classifier_guid", "ClassifierGuid", "classifierGuid");
    }
    abstract protected ConditionValue getCValueClassifierGuid();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param tpos The value of tpos as equal.
     */
    public void setTpos_Equal(java.lang.Integer tpos) {
        regTpos(CK_EQ, tpos);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as notEqual.
     */
    public void setTpos_NotEqual(java.lang.Integer tpos) {
        regTpos(CK_NE, tpos);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as greaterThan.
     */
    public void setTpos_GreaterThan(java.lang.Integer tpos) {
        regTpos(CK_GT, tpos);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as lessThan.
     */
    public void setTpos_LessThan(java.lang.Integer tpos) {
        regTpos(CK_LT, tpos);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as greaterEqual.
     */
    public void setTpos_GreaterEqual(java.lang.Integer tpos) {
        regTpos(CK_GE, tpos);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as lessEqual.
     */
    public void setTpos_LessEqual(java.lang.Integer tpos) {
        regTpos(CK_LE, tpos);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param tposList The collection of tpos as inScope.
     */
    public void setTpos_InScope(Collection<java.lang.Integer> tposList) {
        regTpos(CK_INS, cTL(tposList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTpos_IsNull() { regTpos(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTpos_IsNotNull() { regTpos(CK_ISNN, DUMMY_OBJECT); }

    protected void regTpos(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTpos(), "TPos", "Tpos", "tpos");
    }
    protected void registerInlineTpos(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTpos(), "TPos", "Tpos", "tpos");
    }
    abstract protected ConditionValue getCValueTpos();

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
     * @param isspec The value of isspec as equal.
     */
    public void setIsspec_Equal(Boolean isspec) {
        regIsspec(CK_EQ, isspec);
    }

    protected void regIsspec(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIsspec(), "IsSpec", "Isspec", "isspec");
    }
    protected void registerInlineIsspec(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIsspec(), "IsSpec", "Isspec", "isspec");
    }
    abstract protected ConditionValue getCValueIsspec();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param isactive The value of isactive as equal.
     */
    public void setIsactive_Equal(Boolean isactive) {
        regIsactive(CK_EQ, isactive);
    }

    protected void regIsactive(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIsactive(), "IsActive", "Isactive", "isactive");
    }
    protected void registerInlineIsactive(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIsactive(), "IsActive", "Isactive", "isactive");
    }
    abstract protected ConditionValue getCValueIsactive();

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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param packageflags The value of packageflags as equal.
     */
    public void setPackageflags_Equal(String packageflags) {
        regPackageflags(CK_EQ, fRES(packageflags));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param packageflags The value of packageflags as notEqual.
     */
    public void setPackageflags_NotEqual(String packageflags) {
        regPackageflags(CK_NE, fRES(packageflags));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param packageflags The value of packageflags as greaterThan.
     */
    public void setPackageflags_GreaterThan(String packageflags) {
        regPackageflags(CK_GT, fRES(packageflags));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param packageflags The value of packageflags as lessThan.
     */
    public void setPackageflags_LessThan(String packageflags) {
        regPackageflags(CK_LT, fRES(packageflags));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param packageflags The value of packageflags as greaterEqual.
     */
    public void setPackageflags_GreaterEqual(String packageflags) {
        regPackageflags(CK_GE, fRES(packageflags));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param packageflags The value of packageflags as lessEqual.
     */
    public void setPackageflags_LessEqual(String packageflags) {
        regPackageflags(CK_LE, fRES(packageflags));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param packageflags The value of packageflags as prefixSearch.
     */
    public void setPackageflags_PrefixSearch(String packageflags) {
        regPackageflags(CK_PS, fRES(packageflags));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param packageflags The value of packageflags as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPackageflags_LikeSearch(String packageflags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(packageflags), getCValuePackageflags(), "PackageFlags", "Packageflags", "packageflags", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param packageflagsList The collection of packageflags as inScope.
     */
    public void setPackageflags_InScope(Collection<String> packageflagsList) {
        regPackageflags(CK_INS, cTL(packageflagsList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param packageflags The collection of packageflags as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPackageflags_InScope(String packageflags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(packageflags), getCValuePackageflags(), "PackageFlags", "Packageflags", "packageflags", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPackageflags_IsNull() { regPackageflags(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPackageflags_IsNotNull() { regPackageflags(CK_ISNN, DUMMY_OBJECT); }

    protected void regPackageflags(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePackageflags(), "PackageFlags", "Packageflags", "packageflags");
    }
    protected void registerInlinePackageflags(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePackageflags(), "PackageFlags", "Packageflags", "packageflags");
    }
    abstract protected ConditionValue getCValuePackageflags();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param multiplicity The value of multiplicity as equal.
     */
    public void setMultiplicity_Equal(String multiplicity) {
        regMultiplicity(CK_EQ, fRES(multiplicity));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param multiplicity The value of multiplicity as notEqual.
     */
    public void setMultiplicity_NotEqual(String multiplicity) {
        regMultiplicity(CK_NE, fRES(multiplicity));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param multiplicity The value of multiplicity as greaterThan.
     */
    public void setMultiplicity_GreaterThan(String multiplicity) {
        regMultiplicity(CK_GT, fRES(multiplicity));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param multiplicity The value of multiplicity as lessThan.
     */
    public void setMultiplicity_LessThan(String multiplicity) {
        regMultiplicity(CK_LT, fRES(multiplicity));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param multiplicity The value of multiplicity as greaterEqual.
     */
    public void setMultiplicity_GreaterEqual(String multiplicity) {
        regMultiplicity(CK_GE, fRES(multiplicity));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param multiplicity The value of multiplicity as lessEqual.
     */
    public void setMultiplicity_LessEqual(String multiplicity) {
        regMultiplicity(CK_LE, fRES(multiplicity));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param multiplicity The value of multiplicity as prefixSearch.
     */
    public void setMultiplicity_PrefixSearch(String multiplicity) {
        regMultiplicity(CK_PS, fRES(multiplicity));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param multiplicity The value of multiplicity as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMultiplicity_LikeSearch(String multiplicity, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(multiplicity), getCValueMultiplicity(), "Multiplicity", "Multiplicity", "multiplicity", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param multiplicityList The collection of multiplicity as inScope.
     */
    public void setMultiplicity_InScope(Collection<String> multiplicityList) {
        regMultiplicity(CK_INS, cTL(multiplicityList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param multiplicity The collection of multiplicity as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setMultiplicity_InScope(String multiplicity, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(multiplicity), getCValueMultiplicity(), "Multiplicity", "Multiplicity", "multiplicity", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setMultiplicity_IsNull() { regMultiplicity(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setMultiplicity_IsNotNull() { regMultiplicity(CK_ISNN, DUMMY_OBJECT); }

    protected void regMultiplicity(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueMultiplicity(), "Multiplicity", "Multiplicity", "multiplicity");
    }
    protected void registerInlineMultiplicity(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueMultiplicity(), "Multiplicity", "Multiplicity", "multiplicity");
    }
    abstract protected ConditionValue getCValueMultiplicity();

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

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param actionflags The value of actionflags as equal.
     */
    public void setActionflags_Equal(String actionflags) {
        regActionflags(CK_EQ, fRES(actionflags));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param actionflags The value of actionflags as notEqual.
     */
    public void setActionflags_NotEqual(String actionflags) {
        regActionflags(CK_NE, fRES(actionflags));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param actionflags The value of actionflags as greaterThan.
     */
    public void setActionflags_GreaterThan(String actionflags) {
        regActionflags(CK_GT, fRES(actionflags));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param actionflags The value of actionflags as lessThan.
     */
    public void setActionflags_LessThan(String actionflags) {
        regActionflags(CK_LT, fRES(actionflags));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param actionflags The value of actionflags as greaterEqual.
     */
    public void setActionflags_GreaterEqual(String actionflags) {
        regActionflags(CK_GE, fRES(actionflags));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param actionflags The value of actionflags as lessEqual.
     */
    public void setActionflags_LessEqual(String actionflags) {
        regActionflags(CK_LE, fRES(actionflags));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param actionflags The value of actionflags as prefixSearch.
     */
    public void setActionflags_PrefixSearch(String actionflags) {
        regActionflags(CK_PS, fRES(actionflags));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param actionflags The value of actionflags as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setActionflags_LikeSearch(String actionflags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(actionflags), getCValueActionflags(), "ActionFlags", "Actionflags", "actionflags", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param actionflagsList The collection of actionflags as inScope.
     */
    public void setActionflags_InScope(Collection<String> actionflagsList) {
        regActionflags(CK_INS, cTL(actionflagsList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param actionflags The collection of actionflags as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setActionflags_InScope(String actionflags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(actionflags), getCValueActionflags(), "ActionFlags", "Actionflags", "actionflags", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setActionflags_IsNull() { regActionflags(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setActionflags_IsNotNull() { regActionflags(CK_ISNN, DUMMY_OBJECT); }

    protected void regActionflags(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueActionflags(), "ActionFlags", "Actionflags", "actionflags");
    }
    protected void registerInlineActionflags(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueActionflags(), "ActionFlags", "Actionflags", "actionflags");
    }
    abstract protected ConditionValue getCValueActionflags();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param eventflags The value of eventflags as equal.
     */
    public void setEventflags_Equal(String eventflags) {
        regEventflags(CK_EQ, fRES(eventflags));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eventflags The value of eventflags as notEqual.
     */
    public void setEventflags_NotEqual(String eventflags) {
        regEventflags(CK_NE, fRES(eventflags));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param eventflags The value of eventflags as greaterThan.
     */
    public void setEventflags_GreaterThan(String eventflags) {
        regEventflags(CK_GT, fRES(eventflags));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param eventflags The value of eventflags as lessThan.
     */
    public void setEventflags_LessThan(String eventflags) {
        regEventflags(CK_LT, fRES(eventflags));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eventflags The value of eventflags as greaterEqual.
     */
    public void setEventflags_GreaterEqual(String eventflags) {
        regEventflags(CK_GE, fRES(eventflags));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eventflags The value of eventflags as lessEqual.
     */
    public void setEventflags_LessEqual(String eventflags) {
        regEventflags(CK_LE, fRES(eventflags));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param eventflags The value of eventflags as prefixSearch.
     */
    public void setEventflags_PrefixSearch(String eventflags) {
        regEventflags(CK_PS, fRES(eventflags));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eventflags The value of eventflags as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEventflags_LikeSearch(String eventflags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(eventflags), getCValueEventflags(), "EventFlags", "Eventflags", "eventflags", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eventflagsList The collection of eventflags as inScope.
     */
    public void setEventflags_InScope(Collection<String> eventflagsList) {
        regEventflags(CK_INS, cTL(eventflagsList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eventflags The collection of eventflags as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setEventflags_InScope(String eventflags, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(eventflags), getCValueEventflags(), "EventFlags", "Eventflags", "eventflags", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setEventflags_IsNull() { regEventflags(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setEventflags_IsNotNull() { regEventflags(CK_ISNN, DUMMY_OBJECT); }

    protected void regEventflags(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueEventflags(), "EventFlags", "Eventflags", "eventflags");
    }
    protected void registerInlineEventflags(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueEventflags(), "EventFlags", "Eventflags", "eventflags");
    }
    abstract protected ConditionValue getCValueEventflags();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TObjectCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TObjectCQ.class.getName(); }
}
