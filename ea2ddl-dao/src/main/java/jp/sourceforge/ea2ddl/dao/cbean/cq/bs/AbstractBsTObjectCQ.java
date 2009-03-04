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
 * The abstract condition-query of t_object.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTObjectCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_object";
    }
    
    public String getTableSqlName() {
        return "t_object";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {PK : UQ : NotNull : COUNTER}
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

    public void inScopeTObjectpropertiesList(SubQuery<TObjectpropertiesCB> subQuery) {
        assertObjectNotNull("subQuery<TObjectpropertiesCB>", subQuery);
        TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TObjectpropertiesList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_InScopeSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery);

    public void inScopeTAttributeList(SubQuery<TAttributeCB> subQuery) {
        assertObjectNotNull("subQuery<TAttributeCB>", subQuery);
        TAttributeCB cb = new TAttributeCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TAttributeList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_InScopeSubQuery_TAttributeList(TAttributeCQ subQuery);

    public void inScopeTOperationList(SubQuery<TOperationCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TOperationList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "Object_ID", "ObjectID", subQueryPropertyName);
    }
    public abstract String keepObjectId_InScopeSubQuery_TOperationList(TOperationCQ subQuery);

    public void inScopeTConnectorByStartObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TConnectorByStartObjectIdList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "Object_ID", "Start_Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_InScopeSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery);

    public void inScopeTConnectorByEndObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TConnectorByEndObjectIdList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "Object_ID", "End_Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_InScopeSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery);

    public void notInScopeTObjectpropertiesList(SubQuery<TObjectpropertiesCB> subQuery) {
        assertObjectNotNull("subQuery<TObjectpropertiesCB>", subQuery);
        TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotInScopeSubQuery_TObjectpropertiesList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_NotInScopeSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery);

    public void notInScopeTAttributeList(SubQuery<TAttributeCB> subQuery) {
        assertObjectNotNull("subQuery<TAttributeCB>", subQuery);
        TAttributeCB cb = new TAttributeCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotInScopeSubQuery_TAttributeList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_NotInScopeSubQuery_TAttributeList(TAttributeCQ subQuery);

    public void notInScopeTOperationList(SubQuery<TOperationCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotInScopeSubQuery_TOperationList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Object_ID", "ObjectID", subQueryPropertyName);
    }
    public abstract String keepObjectId_NotInScopeSubQuery_TOperationList(TOperationCQ subQuery);

    public void notInScopeTConnectorByStartObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotInScopeSubQuery_TConnectorByStartObjectIdList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Object_ID", "Start_Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_NotInScopeSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery);

    public void notInScopeTConnectorByEndObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotInScopeSubQuery_TConnectorByEndObjectIdList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "Object_ID", "End_Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_NotInScopeSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select Object_ID from t_objectproperties where ...)}
     * @param subQuery The sub-query of ObjectId_ExistsSubQuery_TObjectpropertiesList for 'exists'. (NotNull)
     */
    public void existsTObjectpropertiesList(SubQuery<TObjectpropertiesCB> subQuery) {
        assertObjectNotNull("subQuery<TObjectpropertiesCB>", subQuery);
        TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TObjectpropertiesList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_ExistsSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select Object_ID from t_attribute where ...)}
     * @param subQuery The sub-query of ObjectId_ExistsSubQuery_TAttributeList for 'exists'. (NotNull)
     */
    public void existsTAttributeList(SubQuery<TAttributeCB> subQuery) {
        assertObjectNotNull("subQuery<TAttributeCB>", subQuery);
        TAttributeCB cb = new TAttributeCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TAttributeList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_ExistsSubQuery_TAttributeList(TAttributeCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select ObjectID from t_operation where ...)}
     * @param subQuery The sub-query of ObjectId_ExistsSubQuery_TOperationList for 'exists'. (NotNull)
     */
    public void existsTOperationList(SubQuery<TOperationCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TOperationList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "Object_ID", "ObjectID", subQueryPropertyName);
    }
    public abstract String keepObjectId_ExistsSubQuery_TOperationList(TOperationCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select Start_Object_ID from t_connector where ...)}
     * @param subQuery The sub-query of ObjectId_ExistsSubQuery_TConnectorByStartObjectIdList for 'exists'. (NotNull)
     */
    public void existsTConnectorByStartObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TConnectorByStartObjectIdList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "Object_ID", "Start_Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_ExistsSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select End_Object_ID from t_connector where ...)}
     * @param subQuery The sub-query of ObjectId_ExistsSubQuery_TConnectorByEndObjectIdList for 'exists'. (NotNull)
     */
    public void existsTConnectorByEndObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_ExistsSubQuery_TConnectorByEndObjectIdList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "Object_ID", "End_Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_ExistsSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select Object_ID from t_objectproperties where ...)}
     * @param subQuery The sub-query of ObjectId_NotExistsSubQuery_TObjectpropertiesList for 'not exists'. (NotNull)
     */
    public void notExistsTObjectpropertiesList(SubQuery<TObjectpropertiesCB> subQuery) {
        assertObjectNotNull("subQuery<TObjectpropertiesCB>", subQuery);
        TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotExistsSubQuery_TObjectpropertiesList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_NotExistsSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select Object_ID from t_attribute where ...)}
     * @param subQuery The sub-query of ObjectId_NotExistsSubQuery_TAttributeList for 'not exists'. (NotNull)
     */
    public void notExistsTAttributeList(SubQuery<TAttributeCB> subQuery) {
        assertObjectNotNull("subQuery<TAttributeCB>", subQuery);
        TAttributeCB cb = new TAttributeCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotExistsSubQuery_TAttributeList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_NotExistsSubQuery_TAttributeList(TAttributeCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select ObjectID from t_operation where ...)}
     * @param subQuery The sub-query of ObjectId_NotExistsSubQuery_TOperationList for 'not exists'. (NotNull)
     */
    public void notExistsTOperationList(SubQuery<TOperationCB> subQuery) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotExistsSubQuery_TOperationList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Object_ID", "ObjectID", subQueryPropertyName);
    }
    public abstract String keepObjectId_NotExistsSubQuery_TOperationList(TOperationCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select Start_Object_ID from t_connector where ...)}
     * @param subQuery The sub-query of ObjectId_NotExistsSubQuery_TConnectorByStartObjectIdList for 'not exists'. (NotNull)
     */
    public void notExistsTConnectorByStartObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotExistsSubQuery_TConnectorByStartObjectIdList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Object_ID", "Start_Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_NotExistsSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select End_Object_ID from t_connector where ...)}
     * @param subQuery The sub-query of ObjectId_NotExistsSubQuery_TConnectorByEndObjectIdList for 'not exists'. (NotNull)
     */
    public void notExistsTConnectorByEndObjectIdList(SubQuery<TConnectorCB> subQuery) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_NotExistsSubQuery_TConnectorByEndObjectIdList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "Object_ID", "End_Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_NotExistsSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery);

    public void xsderiveTObjectpropertiesList(String function, SubQuery<TObjectpropertiesCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TObjectpropertiesCB>", subQuery);
        TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_SpecifyDerivedReferrer_TObjectpropertiesList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "Object_ID", "Object_ID", subQueryPropertyName, aliasName);
    }
    public abstract String keepObjectId_SpecifyDerivedReferrer_TObjectpropertiesList(TObjectpropertiesCQ subQuery);

    public void xsderiveTAttributeList(String function, SubQuery<TAttributeCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TAttributeCB>", subQuery);
        TAttributeCB cb = new TAttributeCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_SpecifyDerivedReferrer_TAttributeList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "Object_ID", "Object_ID", subQueryPropertyName, aliasName);
    }
    public abstract String keepObjectId_SpecifyDerivedReferrer_TAttributeList(TAttributeCQ subQuery);

    public void xsderiveTOperationList(String function, SubQuery<TOperationCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_SpecifyDerivedReferrer_TOperationList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "Object_ID", "ObjectID", subQueryPropertyName, aliasName);
    }
    public abstract String keepObjectId_SpecifyDerivedReferrer_TOperationList(TOperationCQ subQuery);

    public void xsderiveTConnectorByStartObjectIdList(String function, SubQuery<TConnectorCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_SpecifyDerivedReferrer_TConnectorByStartObjectIdList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "Object_ID", "Start_Object_ID", subQueryPropertyName, aliasName);
    }
    public abstract String keepObjectId_SpecifyDerivedReferrer_TConnectorByStartObjectIdList(TConnectorCQ subQuery);

    public void xsderiveTConnectorByEndObjectIdList(String function, SubQuery<TConnectorCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_SpecifyDerivedReferrer_TConnectorByEndObjectIdList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "Object_ID", "End_Object_ID", subQueryPropertyName, aliasName);
    }
    public abstract String keepObjectId_SpecifyDerivedReferrer_TConnectorByEndObjectIdList(TConnectorCQ subQuery);

    public QDRFunction<TObjectpropertiesCB> derivedTObjectpropertiesList() {
        return xcreateQDRFunctionTObjectpropertiesList();
    }
    protected QDRFunction<TObjectpropertiesCB> xcreateQDRFunctionTObjectpropertiesList() {
        return new QDRFunction<TObjectpropertiesCB>(new QDRSetupper<TObjectpropertiesCB>() {
            public void setup(String function, SubQuery<TObjectpropertiesCB> subQuery, String operand, Object value) {
                xqderiveTObjectpropertiesList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveTObjectpropertiesList(String function, SubQuery<TObjectpropertiesCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<TObjectpropertiesCB>", subQuery);
        TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_QueryDerivedReferrer_TObjectpropertiesList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepObjectId_QueryDerivedReferrer_TObjectpropertiesListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "Object_ID", "Object_ID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepObjectId_QueryDerivedReferrer_TObjectpropertiesList(TObjectpropertiesCQ subQuery);
    public abstract String keepObjectId_QueryDerivedReferrer_TObjectpropertiesListParameter(Object parameterValue);

    public QDRFunction<TAttributeCB> derivedTAttributeList() {
        return xcreateQDRFunctionTAttributeList();
    }
    protected QDRFunction<TAttributeCB> xcreateQDRFunctionTAttributeList() {
        return new QDRFunction<TAttributeCB>(new QDRSetupper<TAttributeCB>() {
            public void setup(String function, SubQuery<TAttributeCB> subQuery, String operand, Object value) {
                xqderiveTAttributeList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveTAttributeList(String function, SubQuery<TAttributeCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<TAttributeCB>", subQuery);
        TAttributeCB cb = new TAttributeCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_QueryDerivedReferrer_TAttributeList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepObjectId_QueryDerivedReferrer_TAttributeListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "Object_ID", "Object_ID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepObjectId_QueryDerivedReferrer_TAttributeList(TAttributeCQ subQuery);
    public abstract String keepObjectId_QueryDerivedReferrer_TAttributeListParameter(Object parameterValue);

    public QDRFunction<TOperationCB> derivedTOperationList() {
        return xcreateQDRFunctionTOperationList();
    }
    protected QDRFunction<TOperationCB> xcreateQDRFunctionTOperationList() {
        return new QDRFunction<TOperationCB>(new QDRSetupper<TOperationCB>() {
            public void setup(String function, SubQuery<TOperationCB> subQuery, String operand, Object value) {
                xqderiveTOperationList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveTOperationList(String function, SubQuery<TOperationCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<TOperationCB>", subQuery);
        TOperationCB cb = new TOperationCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_QueryDerivedReferrer_TOperationList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepObjectId_QueryDerivedReferrer_TOperationListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "Object_ID", "ObjectID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepObjectId_QueryDerivedReferrer_TOperationList(TOperationCQ subQuery);
    public abstract String keepObjectId_QueryDerivedReferrer_TOperationListParameter(Object parameterValue);

    public QDRFunction<TConnectorCB> derivedTConnectorByStartObjectIdList() {
        return xcreateQDRFunctionTConnectorByStartObjectIdList();
    }
    protected QDRFunction<TConnectorCB> xcreateQDRFunctionTConnectorByStartObjectIdList() {
        return new QDRFunction<TConnectorCB>(new QDRSetupper<TConnectorCB>() {
            public void setup(String function, SubQuery<TConnectorCB> subQuery, String operand, Object value) {
                xqderiveTConnectorByStartObjectIdList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveTConnectorByStartObjectIdList(String function, SubQuery<TConnectorCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_QueryDerivedReferrer_TConnectorByStartObjectIdList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepObjectId_QueryDerivedReferrer_TConnectorByStartObjectIdListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "Object_ID", "Start_Object_ID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepObjectId_QueryDerivedReferrer_TConnectorByStartObjectIdList(TConnectorCQ subQuery);
    public abstract String keepObjectId_QueryDerivedReferrer_TConnectorByStartObjectIdListParameter(Object parameterValue);

    public QDRFunction<TConnectorCB> derivedTConnectorByEndObjectIdList() {
        return xcreateQDRFunctionTConnectorByEndObjectIdList();
    }
    protected QDRFunction<TConnectorCB> xcreateQDRFunctionTConnectorByEndObjectIdList() {
        return new QDRFunction<TConnectorCB>(new QDRSetupper<TConnectorCB>() {
            public void setup(String function, SubQuery<TConnectorCB> subQuery, String operand, Object value) {
                xqderiveTConnectorByEndObjectIdList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveTConnectorByEndObjectIdList(String function, SubQuery<TConnectorCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<TConnectorCB>", subQuery);
        TConnectorCB cb = new TConnectorCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_QueryDerivedReferrer_TConnectorByEndObjectIdList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepObjectId_QueryDerivedReferrer_TConnectorByEndObjectIdListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "Object_ID", "End_Object_ID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepObjectId_QueryDerivedReferrer_TConnectorByEndObjectIdList(TConnectorCQ subQuery);
    public abstract String keepObjectId_QueryDerivedReferrer_TConnectorByEndObjectIdListParameter(Object parameterValue);

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
     * @param objectType The value of objectType as equal.
     */
    public void setObjectType_Equal(String objectType) {
        regObjectType(CK_EQ, fRES(objectType));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectType The value of objectType as notEqual.
     */
    public void setObjectType_NotEqual(String objectType) {
        regObjectType(CK_NE, fRES(objectType));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectType The value of objectType as greaterThan.
     */
    public void setObjectType_GreaterThan(String objectType) {
        regObjectType(CK_GT, fRES(objectType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectType The value of objectType as lessThan.
     */
    public void setObjectType_LessThan(String objectType) {
        regObjectType(CK_LT, fRES(objectType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectType The value of objectType as greaterEqual.
     */
    public void setObjectType_GreaterEqual(String objectType) {
        regObjectType(CK_GE, fRES(objectType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectType The value of objectType as lessEqual.
     */
    public void setObjectType_LessEqual(String objectType) {
        regObjectType(CK_LE, fRES(objectType));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectType The value of objectType as prefixSearch.
     */
    public void setObjectType_PrefixSearch(String objectType) {
        regObjectType(CK_PS, fRES(objectType));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param objectTypeList The collection of objectType as inScope.
     */
    public void setObjectType_InScope(Collection<String> objectTypeList) {
        regObjectType(CK_INS, cTL(objectTypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param objectType The value of objectType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setObjectType_LikeSearch(String objectType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(objectType), getCValueObjectType(), "Object_Type", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param objectType The value of objectType as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setObjectType_NotLikeSearch(String objectType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(objectType), getCValueObjectType(), "Object_Type", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setObjectType_IsNull() { regObjectType(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setObjectType_IsNotNull() { regObjectType(CK_ISNN, DOBJ); }

    protected void regObjectType(ConditionKey k, Object v) { regQ(k, v, getCValueObjectType(), "Object_Type"); }
    abstract protected ConditionValue getCValueObjectType();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param diagramId The value of diagramId as equal.
     */
    public void setDiagramId_Equal(java.lang.Integer diagramId) {
        regDiagramId(CK_EQ, diagramId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param diagramId The value of diagramId as notEqual.
     */
    public void setDiagramId_NotEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_NE, diagramId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param diagramId The value of diagramId as greaterThan.
     */
    public void setDiagramId_GreaterThan(java.lang.Integer diagramId) {
        regDiagramId(CK_GT, diagramId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param diagramId The value of diagramId as lessThan.
     */
    public void setDiagramId_LessThan(java.lang.Integer diagramId) {
        regDiagramId(CK_LT, diagramId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param diagramId The value of diagramId as greaterEqual.
     */
    public void setDiagramId_GreaterEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_GE, diagramId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDiagramId_IsNull() { regDiagramId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDiagramId_IsNotNull() { regDiagramId(CK_ISNN, DOBJ); }

    protected void regDiagramId(ConditionKey k, Object v) { regQ(k, v, getCValueDiagramId(), "Diagram_ID"); }
    abstract protected ConditionValue getCValueDiagramId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param alias The value of alias as equal.
     */
    public void setAlias_Equal(String alias) {
        regAlias(CK_EQ, fRES(alias));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param alias The value of alias as notEqual.
     */
    public void setAlias_NotEqual(String alias) {
        regAlias(CK_NE, fRES(alias));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param alias The value of alias as greaterThan.
     */
    public void setAlias_GreaterThan(String alias) {
        regAlias(CK_GT, fRES(alias));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param alias The value of alias as lessThan.
     */
    public void setAlias_LessThan(String alias) {
        regAlias(CK_LT, fRES(alias));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param alias The value of alias as greaterEqual.
     */
    public void setAlias_GreaterEqual(String alias) {
        regAlias(CK_GE, fRES(alias));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param alias The value of alias as lessEqual.
     */
    public void setAlias_LessEqual(String alias) {
        regAlias(CK_LE, fRES(alias));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param alias The value of alias as prefixSearch.
     */
    public void setAlias_PrefixSearch(String alias) {
        regAlias(CK_PS, fRES(alias));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param aliasList The collection of alias as inScope.
     */
    public void setAlias_InScope(Collection<String> aliasList) {
        regAlias(CK_INS, cTL(aliasList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param alias The value of alias as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAlias_LikeSearch(String alias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(alias), getCValueAlias(), "Alias", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param alias The value of alias as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAlias_NotLikeSearch(String alias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(alias), getCValueAlias(), "Alias", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setAlias_IsNull() { regAlias(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setAlias_IsNotNull() { regAlias(CK_ISNN, DOBJ); }

    protected void regAlias(ConditionKey k, Object v) { regQ(k, v, getCValueAlias(), "Alias"); }
    abstract protected ConditionValue getCValueAlias();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param author The value of author as equal.
     */
    public void setAuthor_Equal(String author) {
        regAuthor(CK_EQ, fRES(author));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param author The value of author as notEqual.
     */
    public void setAuthor_NotEqual(String author) {
        regAuthor(CK_NE, fRES(author));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param author The value of author as greaterThan.
     */
    public void setAuthor_GreaterThan(String author) {
        regAuthor(CK_GT, fRES(author));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param author The value of author as lessThan.
     */
    public void setAuthor_LessThan(String author) {
        regAuthor(CK_LT, fRES(author));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param author The value of author as greaterEqual.
     */
    public void setAuthor_GreaterEqual(String author) {
        regAuthor(CK_GE, fRES(author));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param author The value of author as lessEqual.
     */
    public void setAuthor_LessEqual(String author) {
        regAuthor(CK_LE, fRES(author));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param author The value of author as prefixSearch.
     */
    public void setAuthor_PrefixSearch(String author) {
        regAuthor(CK_PS, fRES(author));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param authorList The collection of author as inScope.
     */
    public void setAuthor_InScope(Collection<String> authorList) {
        regAuthor(CK_INS, cTL(authorList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param author The value of author as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAuthor_LikeSearch(String author, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(author), getCValueAuthor(), "Author", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param author The value of author as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAuthor_NotLikeSearch(String author, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(author), getCValueAuthor(), "Author", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setAuthor_IsNull() { regAuthor(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setAuthor_IsNotNull() { regAuthor(CK_ISNN, DOBJ); }

    protected void regAuthor(ConditionKey k, Object v) { regQ(k, v, getCValueAuthor(), "Author"); }
    abstract protected ConditionValue getCValueAuthor();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param version The value of version as equal.
     */
    public void setVersion_Equal(String version) {
        regVersion(CK_EQ, fRES(version));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as notEqual.
     */
    public void setVersion_NotEqual(String version) {
        regVersion(CK_NE, fRES(version));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as greaterThan.
     */
    public void setVersion_GreaterThan(String version) {
        regVersion(CK_GT, fRES(version));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as lessThan.
     */
    public void setVersion_LessThan(String version) {
        regVersion(CK_LT, fRES(version));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as greaterEqual.
     */
    public void setVersion_GreaterEqual(String version) {
        regVersion(CK_GE, fRES(version));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as lessEqual.
     */
    public void setVersion_LessEqual(String version) {
        regVersion(CK_LE, fRES(version));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param version The value of version as prefixSearch.
     */
    public void setVersion_PrefixSearch(String version) {
        regVersion(CK_PS, fRES(version));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param versionList The collection of version as inScope.
     */
    public void setVersion_InScope(Collection<String> versionList) {
        regVersion(CK_INS, cTL(versionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param version The value of version as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVersion_LikeSearch(String version, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(version), getCValueVersion(), "Version", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param version The value of version as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVersion_NotLikeSearch(String version, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(version), getCValueVersion(), "Version", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setVersion_IsNull() { regVersion(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setVersion_IsNotNull() { regVersion(CK_ISNN, DOBJ); }

    protected void regVersion(ConditionKey k, Object v) { regQ(k, v, getCValueVersion(), "Version"); }
    abstract protected ConditionValue getCValueVersion();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param note The value of note as equal.
     */
    public void setNote_Equal(String note) {
        regNote(CK_EQ, fRES(note));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param note The value of note as notEqual.
     */
    public void setNote_NotEqual(String note) {
        regNote(CK_NE, fRES(note));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param note The value of note as greaterThan.
     */
    public void setNote_GreaterThan(String note) {
        regNote(CK_GT, fRES(note));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param note The value of note as lessThan.
     */
    public void setNote_LessThan(String note) {
        regNote(CK_LT, fRES(note));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param note The value of note as greaterEqual.
     */
    public void setNote_GreaterEqual(String note) {
        regNote(CK_GE, fRES(note));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param note The value of note as lessEqual.
     */
    public void setNote_LessEqual(String note) {
        regNote(CK_LE, fRES(note));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param note The value of note as prefixSearch.
     */
    public void setNote_PrefixSearch(String note) {
        regNote(CK_PS, fRES(note));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param noteList The collection of note as inScope.
     */
    public void setNote_InScope(Collection<String> noteList) {
        regNote(CK_INS, cTL(noteList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param note The value of note as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNote_LikeSearch(String note, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(note), getCValueNote(), "Note", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param note The value of note as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNote_NotLikeSearch(String note, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(note), getCValueNote(), "Note", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNote_IsNull() { regNote(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNote_IsNotNull() { regNote(CK_ISNN, DOBJ); }

    protected void regNote(ConditionKey k, Object v) { regQ(k, v, getCValueNote(), "Note"); }
    abstract protected ConditionValue getCValueNote();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param packageId The value of packageId as equal.
     */
    public void setPackageId_Equal(java.lang.Integer packageId) {
        regPackageId(CK_EQ, packageId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param packageId The value of packageId as notEqual.
     */
    public void setPackageId_NotEqual(java.lang.Integer packageId) {
        regPackageId(CK_NE, packageId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param packageId The value of packageId as greaterThan.
     */
    public void setPackageId_GreaterThan(java.lang.Integer packageId) {
        regPackageId(CK_GT, packageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param packageId The value of packageId as lessThan.
     */
    public void setPackageId_LessThan(java.lang.Integer packageId) {
        regPackageId(CK_LT, packageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param packageId The value of packageId as greaterEqual.
     */
    public void setPackageId_GreaterEqual(java.lang.Integer packageId) {
        regPackageId(CK_GE, packageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPackageId_IsNull() { regPackageId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPackageId_IsNotNull() { regPackageId(CK_ISNN, DOBJ); }

    protected void regPackageId(ConditionKey k, Object v) { regQ(k, v, getCValuePackageId(), "Package_ID"); }
    abstract protected ConditionValue getCValuePackageId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param ntype The value of ntype as equal.
     */
    public void setNtype_Equal(java.lang.Integer ntype) {
        regNtype(CK_EQ, ntype);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param ntype The value of ntype as notEqual.
     */
    public void setNtype_NotEqual(java.lang.Integer ntype) {
        regNtype(CK_NE, ntype);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param ntype The value of ntype as greaterThan.
     */
    public void setNtype_GreaterThan(java.lang.Integer ntype) {
        regNtype(CK_GT, ntype);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param ntype The value of ntype as lessThan.
     */
    public void setNtype_LessThan(java.lang.Integer ntype) {
        regNtype(CK_LT, ntype);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param ntype The value of ntype as greaterEqual.
     */
    public void setNtype_GreaterEqual(java.lang.Integer ntype) {
        regNtype(CK_GE, ntype);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNtype_IsNull() { regNtype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNtype_IsNotNull() { regNtype(CK_ISNN, DOBJ); }

    protected void regNtype(ConditionKey k, Object v) { regQ(k, v, getCValueNtype(), "NType"); }
    abstract protected ConditionValue getCValueNtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param complexity The value of complexity as equal.
     */
    public void setComplexity_Equal(String complexity) {
        regComplexity(CK_EQ, fRES(complexity));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param complexity The value of complexity as notEqual.
     */
    public void setComplexity_NotEqual(String complexity) {
        regComplexity(CK_NE, fRES(complexity));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param complexity The value of complexity as greaterThan.
     */
    public void setComplexity_GreaterThan(String complexity) {
        regComplexity(CK_GT, fRES(complexity));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param complexity The value of complexity as lessThan.
     */
    public void setComplexity_LessThan(String complexity) {
        regComplexity(CK_LT, fRES(complexity));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param complexity The value of complexity as greaterEqual.
     */
    public void setComplexity_GreaterEqual(String complexity) {
        regComplexity(CK_GE, fRES(complexity));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param complexity The value of complexity as lessEqual.
     */
    public void setComplexity_LessEqual(String complexity) {
        regComplexity(CK_LE, fRES(complexity));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param complexity The value of complexity as prefixSearch.
     */
    public void setComplexity_PrefixSearch(String complexity) {
        regComplexity(CK_PS, fRES(complexity));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param complexityList The collection of complexity as inScope.
     */
    public void setComplexity_InScope(Collection<String> complexityList) {
        regComplexity(CK_INS, cTL(complexityList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param complexity The value of complexity as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setComplexity_LikeSearch(String complexity, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(complexity), getCValueComplexity(), "Complexity", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param complexity The value of complexity as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setComplexity_NotLikeSearch(String complexity, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(complexity), getCValueComplexity(), "Complexity", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setComplexity_IsNull() { regComplexity(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setComplexity_IsNotNull() { regComplexity(CK_ISNN, DOBJ); }

    protected void regComplexity(ConditionKey k, Object v) { regQ(k, v, getCValueComplexity(), "Complexity"); }
    abstract protected ConditionValue getCValueComplexity();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param effort The value of effort as equal.
     */
    public void setEffort_Equal(java.lang.Integer effort) {
        regEffort(CK_EQ, effort);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param effort The value of effort as notEqual.
     */
    public void setEffort_NotEqual(java.lang.Integer effort) {
        regEffort(CK_NE, effort);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param effort The value of effort as greaterThan.
     */
    public void setEffort_GreaterThan(java.lang.Integer effort) {
        regEffort(CK_GT, effort);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param effort The value of effort as lessThan.
     */
    public void setEffort_LessThan(java.lang.Integer effort) {
        regEffort(CK_LT, effort);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param effort The value of effort as greaterEqual.
     */
    public void setEffort_GreaterEqual(java.lang.Integer effort) {
        regEffort(CK_GE, effort);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEffort_IsNull() { regEffort(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEffort_IsNotNull() { regEffort(CK_ISNN, DOBJ); }

    protected void regEffort(ConditionKey k, Object v) { regQ(k, v, getCValueEffort(), "Effort"); }
    abstract protected ConditionValue getCValueEffort();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param backcolor The value of backcolor as equal.
     */
    public void setBackcolor_Equal(java.lang.Integer backcolor) {
        regBackcolor(CK_EQ, backcolor);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param backcolor The value of backcolor as notEqual.
     */
    public void setBackcolor_NotEqual(java.lang.Integer backcolor) {
        regBackcolor(CK_NE, backcolor);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param backcolor The value of backcolor as greaterThan.
     */
    public void setBackcolor_GreaterThan(java.lang.Integer backcolor) {
        regBackcolor(CK_GT, backcolor);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param backcolor The value of backcolor as lessThan.
     */
    public void setBackcolor_LessThan(java.lang.Integer backcolor) {
        regBackcolor(CK_LT, backcolor);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param backcolor The value of backcolor as greaterEqual.
     */
    public void setBackcolor_GreaterEqual(java.lang.Integer backcolor) {
        regBackcolor(CK_GE, backcolor);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBackcolor_IsNull() { regBackcolor(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBackcolor_IsNotNull() { regBackcolor(CK_ISNN, DOBJ); }

    protected void regBackcolor(ConditionKey k, Object v) { regQ(k, v, getCValueBackcolor(), "Backcolor"); }
    abstract protected ConditionValue getCValueBackcolor();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param borderstyle The value of borderstyle as equal.
     */
    public void setBorderstyle_Equal(java.lang.Integer borderstyle) {
        regBorderstyle(CK_EQ, borderstyle);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param borderstyle The value of borderstyle as notEqual.
     */
    public void setBorderstyle_NotEqual(java.lang.Integer borderstyle) {
        regBorderstyle(CK_NE, borderstyle);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param borderstyle The value of borderstyle as greaterThan.
     */
    public void setBorderstyle_GreaterThan(java.lang.Integer borderstyle) {
        regBorderstyle(CK_GT, borderstyle);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param borderstyle The value of borderstyle as lessThan.
     */
    public void setBorderstyle_LessThan(java.lang.Integer borderstyle) {
        regBorderstyle(CK_LT, borderstyle);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param borderstyle The value of borderstyle as greaterEqual.
     */
    public void setBorderstyle_GreaterEqual(java.lang.Integer borderstyle) {
        regBorderstyle(CK_GE, borderstyle);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBorderstyle_IsNull() { regBorderstyle(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBorderstyle_IsNotNull() { regBorderstyle(CK_ISNN, DOBJ); }

    protected void regBorderstyle(ConditionKey k, Object v) { regQ(k, v, getCValueBorderstyle(), "BorderStyle"); }
    abstract protected ConditionValue getCValueBorderstyle();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param borderwidth The value of borderwidth as equal.
     */
    public void setBorderwidth_Equal(java.lang.Integer borderwidth) {
        regBorderwidth(CK_EQ, borderwidth);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param borderwidth The value of borderwidth as notEqual.
     */
    public void setBorderwidth_NotEqual(java.lang.Integer borderwidth) {
        regBorderwidth(CK_NE, borderwidth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param borderwidth The value of borderwidth as greaterThan.
     */
    public void setBorderwidth_GreaterThan(java.lang.Integer borderwidth) {
        regBorderwidth(CK_GT, borderwidth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param borderwidth The value of borderwidth as lessThan.
     */
    public void setBorderwidth_LessThan(java.lang.Integer borderwidth) {
        regBorderwidth(CK_LT, borderwidth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param borderwidth The value of borderwidth as greaterEqual.
     */
    public void setBorderwidth_GreaterEqual(java.lang.Integer borderwidth) {
        regBorderwidth(CK_GE, borderwidth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBorderwidth_IsNull() { regBorderwidth(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBorderwidth_IsNotNull() { regBorderwidth(CK_ISNN, DOBJ); }

    protected void regBorderwidth(ConditionKey k, Object v) { regQ(k, v, getCValueBorderwidth(), "BorderWidth"); }
    abstract protected ConditionValue getCValueBorderwidth();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param fontcolor The value of fontcolor as equal.
     */
    public void setFontcolor_Equal(java.lang.Integer fontcolor) {
        regFontcolor(CK_EQ, fontcolor);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param fontcolor The value of fontcolor as notEqual.
     */
    public void setFontcolor_NotEqual(java.lang.Integer fontcolor) {
        regFontcolor(CK_NE, fontcolor);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param fontcolor The value of fontcolor as greaterThan.
     */
    public void setFontcolor_GreaterThan(java.lang.Integer fontcolor) {
        regFontcolor(CK_GT, fontcolor);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param fontcolor The value of fontcolor as lessThan.
     */
    public void setFontcolor_LessThan(java.lang.Integer fontcolor) {
        regFontcolor(CK_LT, fontcolor);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param fontcolor The value of fontcolor as greaterEqual.
     */
    public void setFontcolor_GreaterEqual(java.lang.Integer fontcolor) {
        regFontcolor(CK_GE, fontcolor);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setFontcolor_IsNull() { regFontcolor(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setFontcolor_IsNotNull() { regFontcolor(CK_ISNN, DOBJ); }

    protected void regFontcolor(ConditionKey k, Object v) { regQ(k, v, getCValueFontcolor(), "Fontcolor"); }
    abstract protected ConditionValue getCValueFontcolor();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param bordercolor The value of bordercolor as equal.
     */
    public void setBordercolor_Equal(java.lang.Integer bordercolor) {
        regBordercolor(CK_EQ, bordercolor);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param bordercolor The value of bordercolor as notEqual.
     */
    public void setBordercolor_NotEqual(java.lang.Integer bordercolor) {
        regBordercolor(CK_NE, bordercolor);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param bordercolor The value of bordercolor as greaterThan.
     */
    public void setBordercolor_GreaterThan(java.lang.Integer bordercolor) {
        regBordercolor(CK_GT, bordercolor);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param bordercolor The value of bordercolor as lessThan.
     */
    public void setBordercolor_LessThan(java.lang.Integer bordercolor) {
        regBordercolor(CK_LT, bordercolor);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param bordercolor The value of bordercolor as greaterEqual.
     */
    public void setBordercolor_GreaterEqual(java.lang.Integer bordercolor) {
        regBordercolor(CK_GE, bordercolor);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBordercolor_IsNull() { regBordercolor(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBordercolor_IsNotNull() { regBordercolor(CK_ISNN, DOBJ); }

    protected void regBordercolor(ConditionKey k, Object v) { regQ(k, v, getCValueBordercolor(), "Bordercolor"); }
    abstract protected ConditionValue getCValueBordercolor();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param createddate The value of createddate as equal.
     */
    public void setCreateddate_Equal(java.sql.Timestamp createddate) {
        regCreateddate(CK_EQ, createddate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param createddate The value of createddate as greaterThan.
     */
    public void setCreateddate_GreaterThan(java.sql.Timestamp createddate) {
        regCreateddate(CK_GT, createddate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param createddate The value of createddate as lessThan.
     */
    public void setCreateddate_LessThan(java.sql.Timestamp createddate) {
        regCreateddate(CK_LT, createddate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param createddate The value of createddate as greaterEqual.
     */
    public void setCreateddate_GreaterEqual(java.sql.Timestamp createddate) {
        regCreateddate(CK_GE, createddate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param createddate The value of createddate as lessEqual.
     */
    public void setCreateddate_LessEqual(java.sql.Timestamp createddate) {
        regCreateddate(CK_LE, createddate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of createddate. (Nullable)
     * @param toDate The to-date of createddate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCreateddate_FromTo(java.util.Date fromDate, java.util.Date toDate, FromToOption fromToOption) {
        regFTQ((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueCreateddate(), "CreatedDate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of createddate. (Nullable)
     * @param toDate The to-date of createddate. (Nullable)
     */
    public void setCreateddate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setCreateddate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setCreateddate_IsNull() { regCreateddate(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setCreateddate_IsNotNull() { regCreateddate(CK_ISNN, DOBJ); }

    protected void regCreateddate(ConditionKey k, Object v) { regQ(k, v, getCValueCreateddate(), "CreatedDate"); }
    abstract protected ConditionValue getCValueCreateddate();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param modifieddate The value of modifieddate as equal.
     */
    public void setModifieddate_Equal(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_EQ, modifieddate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param modifieddate The value of modifieddate as greaterThan.
     */
    public void setModifieddate_GreaterThan(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_GT, modifieddate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param modifieddate The value of modifieddate as lessThan.
     */
    public void setModifieddate_LessThan(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_LT, modifieddate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param modifieddate The value of modifieddate as greaterEqual.
     */
    public void setModifieddate_GreaterEqual(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_GE, modifieddate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param modifieddate The value of modifieddate as lessEqual.
     */
    public void setModifieddate_LessEqual(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_LE, modifieddate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of modifieddate. (Nullable)
     * @param toDate The to-date of modifieddate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setModifieddate_FromTo(java.util.Date fromDate, java.util.Date toDate, FromToOption fromToOption) {
        regFTQ((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueModifieddate(), "ModifiedDate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {DATETIME}
     * @param fromDate The from-date of modifieddate. (Nullable)
     * @param toDate The to-date of modifieddate. (Nullable)
     */
    public void setModifieddate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setModifieddate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setModifieddate_IsNull() { regModifieddate(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setModifieddate_IsNotNull() { regModifieddate(CK_ISNN, DOBJ); }

    protected void regModifieddate(ConditionKey k, Object v) { regQ(k, v, getCValueModifieddate(), "ModifiedDate"); }
    abstract protected ConditionValue getCValueModifieddate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param status The value of status as equal.
     */
    public void setStatus_Equal(String status) {
        regStatus(CK_EQ, fRES(status));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as notEqual.
     */
    public void setStatus_NotEqual(String status) {
        regStatus(CK_NE, fRES(status));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as greaterThan.
     */
    public void setStatus_GreaterThan(String status) {
        regStatus(CK_GT, fRES(status));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as lessThan.
     */
    public void setStatus_LessThan(String status) {
        regStatus(CK_LT, fRES(status));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as greaterEqual.
     */
    public void setStatus_GreaterEqual(String status) {
        regStatus(CK_GE, fRES(status));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as lessEqual.
     */
    public void setStatus_LessEqual(String status) {
        regStatus(CK_LE, fRES(status));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param status The value of status as prefixSearch.
     */
    public void setStatus_PrefixSearch(String status) {
        regStatus(CK_PS, fRES(status));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param statusList The collection of status as inScope.
     */
    public void setStatus_InScope(Collection<String> statusList) {
        regStatus(CK_INS, cTL(statusList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param status The value of status as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatus_LikeSearch(String status, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(status), getCValueStatus(), "Status", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param status The value of status as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStatus_NotLikeSearch(String status, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(status), getCValueStatus(), "Status", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStatus_IsNull() { regStatus(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStatus_IsNotNull() { regStatus(CK_ISNN, DOBJ); }

    protected void regStatus(ConditionKey k, Object v) { regQ(k, v, getCValueStatus(), "Status"); }
    abstract protected ConditionValue getCValueStatus();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param tagged The value of tagged as equal.
     */
    public void setTagged_Equal(java.lang.Integer tagged) {
        regTagged(CK_EQ, tagged);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param tagged The value of tagged as notEqual.
     */
    public void setTagged_NotEqual(java.lang.Integer tagged) {
        regTagged(CK_NE, tagged);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param tagged The value of tagged as greaterThan.
     */
    public void setTagged_GreaterThan(java.lang.Integer tagged) {
        regTagged(CK_GT, tagged);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param tagged The value of tagged as lessThan.
     */
    public void setTagged_LessThan(java.lang.Integer tagged) {
        regTagged(CK_LT, tagged);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param tagged The value of tagged as greaterEqual.
     */
    public void setTagged_GreaterEqual(java.lang.Integer tagged) {
        regTagged(CK_GE, tagged);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTagged_IsNull() { regTagged(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTagged_IsNotNull() { regTagged(CK_ISNN, DOBJ); }

    protected void regTagged(ConditionKey k, Object v) { regQ(k, v, getCValueTagged(), "Tagged"); }
    abstract protected ConditionValue getCValueTagged();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param visibility The value of visibility as equal.
     */
    public void setVisibility_Equal(String visibility) {
        regVisibility(CK_EQ, fRES(visibility));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visibility The value of visibility as notEqual.
     */
    public void setVisibility_NotEqual(String visibility) {
        regVisibility(CK_NE, fRES(visibility));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visibility The value of visibility as greaterThan.
     */
    public void setVisibility_GreaterThan(String visibility) {
        regVisibility(CK_GT, fRES(visibility));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visibility The value of visibility as lessThan.
     */
    public void setVisibility_LessThan(String visibility) {
        regVisibility(CK_LT, fRES(visibility));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visibility The value of visibility as greaterEqual.
     */
    public void setVisibility_GreaterEqual(String visibility) {
        regVisibility(CK_GE, fRES(visibility));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visibility The value of visibility as lessEqual.
     */
    public void setVisibility_LessEqual(String visibility) {
        regVisibility(CK_LE, fRES(visibility));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visibility The value of visibility as prefixSearch.
     */
    public void setVisibility_PrefixSearch(String visibility) {
        regVisibility(CK_PS, fRES(visibility));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param visibilityList The collection of visibility as inScope.
     */
    public void setVisibility_InScope(Collection<String> visibilityList) {
        regVisibility(CK_INS, cTL(visibilityList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param visibility The value of visibility as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVisibility_LikeSearch(String visibility, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(visibility), getCValueVisibility(), "Visibility", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param visibility The value of visibility as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVisibility_NotLikeSearch(String visibility, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(visibility), getCValueVisibility(), "Visibility", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setVisibility_IsNull() { regVisibility(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setVisibility_IsNotNull() { regVisibility(CK_ISNN, DOBJ); }

    protected void regVisibility(ConditionKey k, Object v) { regQ(k, v, getCValueVisibility(), "Visibility"); }
    abstract protected ConditionValue getCValueVisibility();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param persistence The value of persistence as equal.
     */
    public void setPersistence_Equal(String persistence) {
        regPersistence(CK_EQ, fRES(persistence));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param persistence The value of persistence as notEqual.
     */
    public void setPersistence_NotEqual(String persistence) {
        regPersistence(CK_NE, fRES(persistence));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param persistence The value of persistence as greaterThan.
     */
    public void setPersistence_GreaterThan(String persistence) {
        regPersistence(CK_GT, fRES(persistence));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param persistence The value of persistence as lessThan.
     */
    public void setPersistence_LessThan(String persistence) {
        regPersistence(CK_LT, fRES(persistence));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param persistence The value of persistence as greaterEqual.
     */
    public void setPersistence_GreaterEqual(String persistence) {
        regPersistence(CK_GE, fRES(persistence));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param persistence The value of persistence as lessEqual.
     */
    public void setPersistence_LessEqual(String persistence) {
        regPersistence(CK_LE, fRES(persistence));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param persistence The value of persistence as prefixSearch.
     */
    public void setPersistence_PrefixSearch(String persistence) {
        regPersistence(CK_PS, fRES(persistence));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param persistenceList The collection of persistence as inScope.
     */
    public void setPersistence_InScope(Collection<String> persistenceList) {
        regPersistence(CK_INS, cTL(persistenceList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param persistence The value of persistence as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPersistence_LikeSearch(String persistence, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(persistence), getCValuePersistence(), "Persistence", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param persistence The value of persistence as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPersistence_NotLikeSearch(String persistence, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(persistence), getCValuePersistence(), "Persistence", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPersistence_IsNull() { regPersistence(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPersistence_IsNotNull() { regPersistence(CK_ISNN, DOBJ); }

    protected void regPersistence(ConditionKey k, Object v) { regQ(k, v, getCValuePersistence(), "Persistence"); }
    abstract protected ConditionValue getCValuePersistence();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param cardinality The value of cardinality as equal.
     */
    public void setCardinality_Equal(String cardinality) {
        regCardinality(CK_EQ, fRES(cardinality));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param cardinality The value of cardinality as notEqual.
     */
    public void setCardinality_NotEqual(String cardinality) {
        regCardinality(CK_NE, fRES(cardinality));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param cardinality The value of cardinality as greaterThan.
     */
    public void setCardinality_GreaterThan(String cardinality) {
        regCardinality(CK_GT, fRES(cardinality));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param cardinality The value of cardinality as lessThan.
     */
    public void setCardinality_LessThan(String cardinality) {
        regCardinality(CK_LT, fRES(cardinality));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param cardinality The value of cardinality as greaterEqual.
     */
    public void setCardinality_GreaterEqual(String cardinality) {
        regCardinality(CK_GE, fRES(cardinality));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param cardinality The value of cardinality as lessEqual.
     */
    public void setCardinality_LessEqual(String cardinality) {
        regCardinality(CK_LE, fRES(cardinality));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param cardinality The value of cardinality as prefixSearch.
     */
    public void setCardinality_PrefixSearch(String cardinality) {
        regCardinality(CK_PS, fRES(cardinality));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param cardinalityList The collection of cardinality as inScope.
     */
    public void setCardinality_InScope(Collection<String> cardinalityList) {
        regCardinality(CK_INS, cTL(cardinalityList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param cardinality The value of cardinality as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardinality_LikeSearch(String cardinality, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardinality), getCValueCardinality(), "Cardinality", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param cardinality The value of cardinality as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardinality_NotLikeSearch(String cardinality, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardinality), getCValueCardinality(), "Cardinality", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setCardinality_IsNull() { regCardinality(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setCardinality_IsNotNull() { regCardinality(CK_ISNN, DOBJ); }

    protected void regCardinality(ConditionKey k, Object v) { regQ(k, v, getCValueCardinality(), "Cardinality"); }
    abstract protected ConditionValue getCValueCardinality();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param gentype The value of gentype as equal.
     */
    public void setGentype_Equal(String gentype) {
        regGentype(CK_EQ, fRES(gentype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param gentype The value of gentype as notEqual.
     */
    public void setGentype_NotEqual(String gentype) {
        regGentype(CK_NE, fRES(gentype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param gentype The value of gentype as greaterThan.
     */
    public void setGentype_GreaterThan(String gentype) {
        regGentype(CK_GT, fRES(gentype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param gentype The value of gentype as lessThan.
     */
    public void setGentype_LessThan(String gentype) {
        regGentype(CK_LT, fRES(gentype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param gentype The value of gentype as greaterEqual.
     */
    public void setGentype_GreaterEqual(String gentype) {
        regGentype(CK_GE, fRES(gentype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param gentype The value of gentype as lessEqual.
     */
    public void setGentype_LessEqual(String gentype) {
        regGentype(CK_LE, fRES(gentype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param gentype The value of gentype as prefixSearch.
     */
    public void setGentype_PrefixSearch(String gentype) {
        regGentype(CK_PS, fRES(gentype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param gentypeList The collection of gentype as inScope.
     */
    public void setGentype_InScope(Collection<String> gentypeList) {
        regGentype(CK_INS, cTL(gentypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param gentype The value of gentype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGentype_LikeSearch(String gentype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(gentype), getCValueGentype(), "GenType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param gentype The value of gentype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGentype_NotLikeSearch(String gentype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(gentype), getCValueGentype(), "GenType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setGentype_IsNull() { regGentype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setGentype_IsNotNull() { regGentype(CK_ISNN, DOBJ); }

    protected void regGentype(ConditionKey k, Object v) { regQ(k, v, getCValueGentype(), "GenType"); }
    abstract protected ConditionValue getCValueGentype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param genfile The value of genfile as equal.
     */
    public void setGenfile_Equal(String genfile) {
        regGenfile(CK_EQ, fRES(genfile));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genfile The value of genfile as notEqual.
     */
    public void setGenfile_NotEqual(String genfile) {
        regGenfile(CK_NE, fRES(genfile));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genfile The value of genfile as greaterThan.
     */
    public void setGenfile_GreaterThan(String genfile) {
        regGenfile(CK_GT, fRES(genfile));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genfile The value of genfile as lessThan.
     */
    public void setGenfile_LessThan(String genfile) {
        regGenfile(CK_LT, fRES(genfile));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genfile The value of genfile as greaterEqual.
     */
    public void setGenfile_GreaterEqual(String genfile) {
        regGenfile(CK_GE, fRES(genfile));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genfile The value of genfile as lessEqual.
     */
    public void setGenfile_LessEqual(String genfile) {
        regGenfile(CK_LE, fRES(genfile));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genfile The value of genfile as prefixSearch.
     */
    public void setGenfile_PrefixSearch(String genfile) {
        regGenfile(CK_PS, fRES(genfile));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genfileList The collection of genfile as inScope.
     */
    public void setGenfile_InScope(Collection<String> genfileList) {
        regGenfile(CK_INS, cTL(genfileList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genfile The value of genfile as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenfile_LikeSearch(String genfile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genfile), getCValueGenfile(), "GenFile", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genfile The value of genfile as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenfile_NotLikeSearch(String genfile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genfile), getCValueGenfile(), "GenFile", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setGenfile_IsNull() { regGenfile(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setGenfile_IsNotNull() { regGenfile(CK_ISNN, DOBJ); }

    protected void regGenfile(ConditionKey k, Object v) { regQ(k, v, getCValueGenfile(), "GenFile"); }
    abstract protected ConditionValue getCValueGenfile();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param header1 The value of header1 as equal.
     */
    public void setHeader1_Equal(String header1) {
        regHeader1(CK_EQ, fRES(header1));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param header1 The value of header1 as notEqual.
     */
    public void setHeader1_NotEqual(String header1) {
        regHeader1(CK_NE, fRES(header1));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param header1 The value of header1 as greaterThan.
     */
    public void setHeader1_GreaterThan(String header1) {
        regHeader1(CK_GT, fRES(header1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param header1 The value of header1 as lessThan.
     */
    public void setHeader1_LessThan(String header1) {
        regHeader1(CK_LT, fRES(header1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param header1 The value of header1 as greaterEqual.
     */
    public void setHeader1_GreaterEqual(String header1) {
        regHeader1(CK_GE, fRES(header1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param header1 The value of header1 as lessEqual.
     */
    public void setHeader1_LessEqual(String header1) {
        regHeader1(CK_LE, fRES(header1));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param header1 The value of header1 as prefixSearch.
     */
    public void setHeader1_PrefixSearch(String header1) {
        regHeader1(CK_PS, fRES(header1));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param header1List The collection of header1 as inScope.
     */
    public void setHeader1_InScope(Collection<String> header1List) {
        regHeader1(CK_INS, cTL(header1List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param header1 The value of header1 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeader1_LikeSearch(String header1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(header1), getCValueHeader1(), "Header1", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param header1 The value of header1 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHeader1_NotLikeSearch(String header1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(header1), getCValueHeader1(), "Header1", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setHeader1_IsNull() { regHeader1(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setHeader1_IsNotNull() { regHeader1(CK_ISNN, DOBJ); }

    protected void regHeader1(ConditionKey k, Object v) { regQ(k, v, getCValueHeader1(), "Header1"); }
    abstract protected ConditionValue getCValueHeader1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param header2 The value of header2 as equal.
     */
    public void setHeader2_Equal(String header2) {
        regHeader2(CK_EQ, fRES(header2));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param header2 The value of header2 as notEqual.
     */
    public void setHeader2_NotEqual(String header2) {
        regHeader2(CK_NE, fRES(header2));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param header2 The value of header2 as greaterThan.
     */
    public void setHeader2_GreaterThan(String header2) {
        regHeader2(CK_GT, fRES(header2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param header2 The value of header2 as lessThan.
     */
    public void setHeader2_LessThan(String header2) {
        regHeader2(CK_LT, fRES(header2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param header2 The value of header2 as greaterEqual.
     */
    public void setHeader2_GreaterEqual(String header2) {
        regHeader2(CK_GE, fRES(header2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param header2 The value of header2 as lessEqual.
     */
    public void setHeader2_LessEqual(String header2) {
        regHeader2(CK_LE, fRES(header2));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param header2 The value of header2 as prefixSearch.
     */
    public void setHeader2_PrefixSearch(String header2) {
        regHeader2(CK_PS, fRES(header2));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param header2List The collection of header2 as inScope.
     */
    public void setHeader2_InScope(Collection<String> header2List) {
        regHeader2(CK_INS, cTL(header2List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param header2 The value of header2 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeader2_LikeSearch(String header2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(header2), getCValueHeader2(), "Header2", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param header2 The value of header2 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHeader2_NotLikeSearch(String header2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(header2), getCValueHeader2(), "Header2", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setHeader2_IsNull() { regHeader2(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setHeader2_IsNotNull() { regHeader2(CK_ISNN, DOBJ); }

    protected void regHeader2(ConditionKey k, Object v) { regQ(k, v, getCValueHeader2(), "Header2"); }
    abstract protected ConditionValue getCValueHeader2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param phase The value of phase as equal.
     */
    public void setPhase_Equal(String phase) {
        regPhase(CK_EQ, fRES(phase));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phase The value of phase as notEqual.
     */
    public void setPhase_NotEqual(String phase) {
        regPhase(CK_NE, fRES(phase));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phase The value of phase as greaterThan.
     */
    public void setPhase_GreaterThan(String phase) {
        regPhase(CK_GT, fRES(phase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phase The value of phase as lessThan.
     */
    public void setPhase_LessThan(String phase) {
        regPhase(CK_LT, fRES(phase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phase The value of phase as greaterEqual.
     */
    public void setPhase_GreaterEqual(String phase) {
        regPhase(CK_GE, fRES(phase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phase The value of phase as lessEqual.
     */
    public void setPhase_LessEqual(String phase) {
        regPhase(CK_LE, fRES(phase));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param phase The value of phase as prefixSearch.
     */
    public void setPhase_PrefixSearch(String phase) {
        regPhase(CK_PS, fRES(phase));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param phaseList The collection of phase as inScope.
     */
    public void setPhase_InScope(Collection<String> phaseList) {
        regPhase(CK_INS, cTL(phaseList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phase The value of phase as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhase_LikeSearch(String phase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phase), getCValuePhase(), "Phase", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param phase The value of phase as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhase_NotLikeSearch(String phase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phase), getCValuePhase(), "Phase", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPhase_IsNull() { regPhase(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPhase_IsNotNull() { regPhase(CK_ISNN, DOBJ); }

    protected void regPhase(ConditionKey k, Object v) { regQ(k, v, getCValuePhase(), "Phase"); }
    abstract protected ConditionValue getCValuePhase();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(25)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param genlinks The value of genlinks as equal.
     */
    public void setGenlinks_Equal(String genlinks) {
        regGenlinks(CK_EQ, fRES(genlinks));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genlinks The value of genlinks as notEqual.
     */
    public void setGenlinks_NotEqual(String genlinks) {
        regGenlinks(CK_NE, fRES(genlinks));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genlinks The value of genlinks as greaterThan.
     */
    public void setGenlinks_GreaterThan(String genlinks) {
        regGenlinks(CK_GT, fRES(genlinks));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genlinks The value of genlinks as lessThan.
     */
    public void setGenlinks_LessThan(String genlinks) {
        regGenlinks(CK_LT, fRES(genlinks));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genlinks The value of genlinks as greaterEqual.
     */
    public void setGenlinks_GreaterEqual(String genlinks) {
        regGenlinks(CK_GE, fRES(genlinks));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genlinks The value of genlinks as lessEqual.
     */
    public void setGenlinks_LessEqual(String genlinks) {
        regGenlinks(CK_LE, fRES(genlinks));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genlinks The value of genlinks as prefixSearch.
     */
    public void setGenlinks_PrefixSearch(String genlinks) {
        regGenlinks(CK_PS, fRES(genlinks));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genlinksList The collection of genlinks as inScope.
     */
    public void setGenlinks_InScope(Collection<String> genlinksList) {
        regGenlinks(CK_INS, cTL(genlinksList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genlinks The value of genlinks as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenlinks_LikeSearch(String genlinks, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genlinks), getCValueGenlinks(), "GenLinks", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genlinks The value of genlinks as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenlinks_NotLikeSearch(String genlinks, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genlinks), getCValueGenlinks(), "GenLinks", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setGenlinks_IsNull() { regGenlinks(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setGenlinks_IsNotNull() { regGenlinks(CK_ISNN, DOBJ); }

    protected void regGenlinks(ConditionKey k, Object v) { regQ(k, v, getCValueGenlinks(), "GenLinks"); }
    abstract protected ConditionValue getCValueGenlinks();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param classifier The value of classifier as equal.
     */
    public void setClassifier_Equal(java.lang.Integer classifier) {
        regClassifier(CK_EQ, classifier);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as notEqual.
     */
    public void setClassifier_NotEqual(java.lang.Integer classifier) {
        regClassifier(CK_NE, classifier);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as greaterThan.
     */
    public void setClassifier_GreaterThan(java.lang.Integer classifier) {
        regClassifier(CK_GT, classifier);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as lessThan.
     */
    public void setClassifier_LessThan(java.lang.Integer classifier) {
        regClassifier(CK_LT, classifier);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as greaterEqual.
     */
    public void setClassifier_GreaterEqual(java.lang.Integer classifier) {
        regClassifier(CK_GE, classifier);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param parentid The value of parentid as equal.
     */
    public void setParentid_Equal(java.lang.Integer parentid) {
        regParentid(CK_EQ, parentid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param parentid The value of parentid as notEqual.
     */
    public void setParentid_NotEqual(java.lang.Integer parentid) {
        regParentid(CK_NE, parentid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param parentid The value of parentid as greaterThan.
     */
    public void setParentid_GreaterThan(java.lang.Integer parentid) {
        regParentid(CK_GT, parentid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param parentid The value of parentid as lessThan.
     */
    public void setParentid_LessThan(java.lang.Integer parentid) {
        regParentid(CK_LT, parentid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param parentid The value of parentid as greaterEqual.
     */
    public void setParentid_GreaterEqual(java.lang.Integer parentid) {
        regParentid(CK_GE, parentid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setParentid_IsNull() { regParentid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setParentid_IsNotNull() { regParentid(CK_ISNN, DOBJ); }

    protected void regParentid(ConditionKey k, Object v) { regQ(k, v, getCValueParentid(), "ParentID"); }
    abstract protected ConditionValue getCValueParentid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param runstate The value of runstate as equal.
     */
    public void setRunstate_Equal(String runstate) {
        regRunstate(CK_EQ, fRES(runstate));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param runstate The value of runstate as notEqual.
     */
    public void setRunstate_NotEqual(String runstate) {
        regRunstate(CK_NE, fRES(runstate));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param runstate The value of runstate as greaterThan.
     */
    public void setRunstate_GreaterThan(String runstate) {
        regRunstate(CK_GT, fRES(runstate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param runstate The value of runstate as lessThan.
     */
    public void setRunstate_LessThan(String runstate) {
        regRunstate(CK_LT, fRES(runstate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param runstate The value of runstate as greaterEqual.
     */
    public void setRunstate_GreaterEqual(String runstate) {
        regRunstate(CK_GE, fRES(runstate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param runstate The value of runstate as lessEqual.
     */
    public void setRunstate_LessEqual(String runstate) {
        regRunstate(CK_LE, fRES(runstate));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param runstate The value of runstate as prefixSearch.
     */
    public void setRunstate_PrefixSearch(String runstate) {
        regRunstate(CK_PS, fRES(runstate));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param runstateList The collection of runstate as inScope.
     */
    public void setRunstate_InScope(Collection<String> runstateList) {
        regRunstate(CK_INS, cTL(runstateList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param runstate The value of runstate as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRunstate_LikeSearch(String runstate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(runstate), getCValueRunstate(), "RunState", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param runstate The value of runstate as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRunstate_NotLikeSearch(String runstate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(runstate), getCValueRunstate(), "RunState", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRunstate_IsNull() { regRunstate(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRunstate_IsNotNull() { regRunstate(CK_ISNN, DOBJ); }

    protected void regRunstate(ConditionKey k, Object v) { regQ(k, v, getCValueRunstate(), "RunState"); }
    abstract protected ConditionValue getCValueRunstate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(40)}
     * @param classifierGuid The value of classifierGuid as equal.
     */
    public void setClassifierGuid_Equal(String classifierGuid) {
        regClassifierGuid(CK_EQ, fRES(classifierGuid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifierGuid The value of classifierGuid as notEqual.
     */
    public void setClassifierGuid_NotEqual(String classifierGuid) {
        regClassifierGuid(CK_NE, fRES(classifierGuid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifierGuid The value of classifierGuid as greaterThan.
     */
    public void setClassifierGuid_GreaterThan(String classifierGuid) {
        regClassifierGuid(CK_GT, fRES(classifierGuid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifierGuid The value of classifierGuid as lessThan.
     */
    public void setClassifierGuid_LessThan(String classifierGuid) {
        regClassifierGuid(CK_LT, fRES(classifierGuid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifierGuid The value of classifierGuid as greaterEqual.
     */
    public void setClassifierGuid_GreaterEqual(String classifierGuid) {
        regClassifierGuid(CK_GE, fRES(classifierGuid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifierGuid The value of classifierGuid as lessEqual.
     */
    public void setClassifierGuid_LessEqual(String classifierGuid) {
        regClassifierGuid(CK_LE, fRES(classifierGuid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifierGuid The value of classifierGuid as prefixSearch.
     */
    public void setClassifierGuid_PrefixSearch(String classifierGuid) {
        regClassifierGuid(CK_PS, fRES(classifierGuid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param classifierGuidList The collection of classifierGuid as inScope.
     */
    public void setClassifierGuid_InScope(Collection<String> classifierGuidList) {
        regClassifierGuid(CK_INS, cTL(classifierGuidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param classifierGuid The value of classifierGuid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassifierGuid_LikeSearch(String classifierGuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(classifierGuid), getCValueClassifierGuid(), "Classifier_guid", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param classifierGuid The value of classifierGuid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClassifierGuid_NotLikeSearch(String classifierGuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(classifierGuid), getCValueClassifierGuid(), "Classifier_guid", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setClassifierGuid_IsNull() { regClassifierGuid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setClassifierGuid_IsNotNull() { regClassifierGuid(CK_ISNN, DOBJ); }

    protected void regClassifierGuid(ConditionKey k, Object v) { regQ(k, v, getCValueClassifierGuid(), "Classifier_guid"); }
    abstract protected ConditionValue getCValueClassifierGuid();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param tpos The value of tpos as equal.
     */
    public void setTpos_Equal(java.lang.Integer tpos) {
        regTpos(CK_EQ, tpos);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param tpos The value of tpos as notEqual.
     */
    public void setTpos_NotEqual(java.lang.Integer tpos) {
        regTpos(CK_NE, tpos);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param tpos The value of tpos as greaterThan.
     */
    public void setTpos_GreaterThan(java.lang.Integer tpos) {
        regTpos(CK_GT, tpos);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param tpos The value of tpos as lessThan.
     */
    public void setTpos_LessThan(java.lang.Integer tpos) {
        regTpos(CK_LT, tpos);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param tpos The value of tpos as greaterEqual.
     */
    public void setTpos_GreaterEqual(java.lang.Integer tpos) {
        regTpos(CK_GE, tpos);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTpos_IsNull() { regTpos(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTpos_IsNotNull() { regTpos(CK_ISNN, DOBJ); }

    protected void regTpos(ConditionKey k, Object v) { regQ(k, v, getCValueTpos(), "TPos"); }
    abstract protected ConditionValue getCValueTpos();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param isactive The value of isactive as equal.
     */
    public void setIsactive_Equal(Boolean isactive) {
        regIsactive(CK_EQ, isactive);
    }

    protected void regIsactive(ConditionKey k, Object v) { regQ(k, v, getCValueIsactive(), "IsActive"); }
    abstract protected ConditionValue getCValueIsactive();

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
     * @param packageflags The value of packageflags as equal.
     */
    public void setPackageflags_Equal(String packageflags) {
        regPackageflags(CK_EQ, fRES(packageflags));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param packageflags The value of packageflags as notEqual.
     */
    public void setPackageflags_NotEqual(String packageflags) {
        regPackageflags(CK_NE, fRES(packageflags));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param packageflags The value of packageflags as greaterThan.
     */
    public void setPackageflags_GreaterThan(String packageflags) {
        regPackageflags(CK_GT, fRES(packageflags));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param packageflags The value of packageflags as lessThan.
     */
    public void setPackageflags_LessThan(String packageflags) {
        regPackageflags(CK_LT, fRES(packageflags));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param packageflags The value of packageflags as greaterEqual.
     */
    public void setPackageflags_GreaterEqual(String packageflags) {
        regPackageflags(CK_GE, fRES(packageflags));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param packageflags The value of packageflags as lessEqual.
     */
    public void setPackageflags_LessEqual(String packageflags) {
        regPackageflags(CK_LE, fRES(packageflags));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param packageflags The value of packageflags as prefixSearch.
     */
    public void setPackageflags_PrefixSearch(String packageflags) {
        regPackageflags(CK_PS, fRES(packageflags));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param packageflagsList The collection of packageflags as inScope.
     */
    public void setPackageflags_InScope(Collection<String> packageflagsList) {
        regPackageflags(CK_INS, cTL(packageflagsList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param packageflags The value of packageflags as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPackageflags_LikeSearch(String packageflags, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(packageflags), getCValuePackageflags(), "PackageFlags", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param packageflags The value of packageflags as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPackageflags_NotLikeSearch(String packageflags, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(packageflags), getCValuePackageflags(), "PackageFlags", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPackageflags_IsNull() { regPackageflags(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPackageflags_IsNotNull() { regPackageflags(CK_ISNN, DOBJ); }

    protected void regPackageflags(ConditionKey k, Object v) { regQ(k, v, getCValuePackageflags(), "PackageFlags"); }
    abstract protected ConditionValue getCValuePackageflags();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param multiplicity The value of multiplicity as equal.
     */
    public void setMultiplicity_Equal(String multiplicity) {
        regMultiplicity(CK_EQ, fRES(multiplicity));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param multiplicity The value of multiplicity as notEqual.
     */
    public void setMultiplicity_NotEqual(String multiplicity) {
        regMultiplicity(CK_NE, fRES(multiplicity));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param multiplicity The value of multiplicity as greaterThan.
     */
    public void setMultiplicity_GreaterThan(String multiplicity) {
        regMultiplicity(CK_GT, fRES(multiplicity));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param multiplicity The value of multiplicity as lessThan.
     */
    public void setMultiplicity_LessThan(String multiplicity) {
        regMultiplicity(CK_LT, fRES(multiplicity));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param multiplicity The value of multiplicity as greaterEqual.
     */
    public void setMultiplicity_GreaterEqual(String multiplicity) {
        regMultiplicity(CK_GE, fRES(multiplicity));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param multiplicity The value of multiplicity as lessEqual.
     */
    public void setMultiplicity_LessEqual(String multiplicity) {
        regMultiplicity(CK_LE, fRES(multiplicity));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param multiplicity The value of multiplicity as prefixSearch.
     */
    public void setMultiplicity_PrefixSearch(String multiplicity) {
        regMultiplicity(CK_PS, fRES(multiplicity));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param multiplicityList The collection of multiplicity as inScope.
     */
    public void setMultiplicity_InScope(Collection<String> multiplicityList) {
        regMultiplicity(CK_INS, cTL(multiplicityList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param multiplicity The value of multiplicity as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMultiplicity_LikeSearch(String multiplicity, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(multiplicity), getCValueMultiplicity(), "Multiplicity", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param multiplicity The value of multiplicity as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMultiplicity_NotLikeSearch(String multiplicity, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(multiplicity), getCValueMultiplicity(), "Multiplicity", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setMultiplicity_IsNull() { regMultiplicity(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setMultiplicity_IsNotNull() { regMultiplicity(CK_ISNN, DOBJ); }

    protected void regMultiplicity(ConditionKey k, Object v) { regQ(k, v, getCValueMultiplicity(), "Multiplicity"); }
    abstract protected ConditionValue getCValueMultiplicity();

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
    public SSQFunction<TObjectCB> scalar_Equal() {
        return xcreateSSQFunction("=");
    }

    public SSQFunction<TObjectCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(">=");
    }

    public SSQFunction<TObjectCB> scalar_GreaterThan() {
        return xcreateSSQFunction(">");
    }

    public SSQFunction<TObjectCB> scalar_LessEqual() {
        return xcreateSSQFunction("<=");
    }
    
    public SSQFunction<TObjectCB> scalar_LessThan() {
        return xcreateSSQFunction("<");
    }
    
    protected SSQFunction<TObjectCB> xcreateSSQFunction(final String operand) {
        return new SSQFunction<TObjectCB>(new SSQSetupper<TObjectCB>() {
            public void setup(String function, SubQuery<TObjectCB> subQuery) {
                xscalarSubQuery(function, subQuery, operand);
            }
        });
    }

    protected void xscalarSubQuery(String function, SubQuery<TObjectCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<TObjectCB>", subQuery);
        TObjectCB cb = new TObjectCB(); cb.xsetupForScalarSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarSubQuery(cb.query()); // for saving query-value.
        registerScalarSubQuery(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarSubQuery(TObjectCQ subQuery);

    // ===================================================================================
    //                                                             MySelf InScope SubQuery
    //                                                             =======================
    /**
     * Myself InScope SubQuery. {mainly for CLOB and Union}
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<TObjectCB> subQuery) {
        assertObjectNotNull("subQuery<TObjectCB>", subQuery);
        TObjectCB cb = new TObjectCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScopeSubQuery(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    public abstract String keepMyselfInScopeSubQuery(TObjectCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TObjectCB.class.getName(); }
    String xCQ() { return TObjectCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
