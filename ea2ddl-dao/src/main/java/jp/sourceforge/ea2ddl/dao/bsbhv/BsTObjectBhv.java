package jp.sourceforge.ea2ddl.dao.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.bhv.LoadReferrerOption;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.EntityRowHandler;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.PagingBean;
import org.seasar.dbflute.cbean.PagingHandler;
import org.seasar.dbflute.cbean.PagingInvoker;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.cbean.ResultBeanBuilder;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.jdbc.StatementConfig;
import jp.sourceforge.ea2ddl.dao.allcommon.*;
import jp.sourceforge.ea2ddl.dao.exbhv.*;
import jp.sourceforge.ea2ddl.dao.exentity.*;
import jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;

/**
 * The behavior of t_object that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     Object_ID
 * 
 * [column]
 *     Object_ID, Object_Type, Diagram_ID, Name, Alias, Author, Version, Note, Package_ID, Stereotype, NType, Complexity, Effort, Style, Backcolor, BorderStyle, BorderWidth, Fontcolor, Bordercolor, CreatedDate, ModifiedDate, Status, Tagged, PDATA1, PDATA2, PDATA3, PDATA4, PDATA5, Concurrency, Visibility, Persistence, Cardinality, GenType, GenFile, Header1, Header2, Phase, Scope, GenOption, GenLinks, Classifier, ea_guid, ParentID, RunState, Classifier_guid, TPos, IsRoot, IsLeaf, IsSpec, IsActive, StateFlags, PackageFlags, Multiplicity, StyleEx, ActionFlags, EventFlags
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     t_objectproperties, t_attribute, t_operation, t_connector
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     tObjectpropertiesList, tAttributeList, tOperationList, tConnectorByStartObjectIdList, tConnectorByEndObjectIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTObjectBhv extends org.seasar.dbflute.bhv.AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    public static final String PATH_selectList = "selectList";
    public static final String PATH_selectTableById = "selectTableById";
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_object"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TObjectDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TObjectDbm getMyDBMeta() { return TObjectDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TObject newMyEntity() { return new TObject(); }
    public TObjectCB newMyConditionBean() { return new TObjectCB(); }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    @Override
    protected DBDef getCurrentDBDef() {
        return DBCurrent.getInstance().currentDBDef();
    }

    // ===================================================================================
    //                                                             Default StatementConfig
    //                                                             =======================
    @Override
    protected StatementConfig getDefaultStatementConfig() {
        return DBFluteConfig.getInstance().getDefaultStatementConfig();
    }
    
    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count by the condition-bean. {IgnorePagingCondition}
     * @param cb The condition-bean of TObject. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TObjectCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TObject. (NotNull)
     * @param entityRowHandler The handler of entity row of TObject. (NotNull)
     */
    public void selectCursor(TObjectCB cb, EntityRowHandler<TObject> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TObject>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TObject. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TObject selectEntity(final TObjectCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TObject, TObjectCB>() {
            public List<TObject> callbackSelectList(TObjectCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TObject. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TObject selectEntityWithDeletedCheck(final TObjectCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TObject, TObjectCB>() {
            public List<TObject> callbackSelectList(TObjectCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TObject selectByPKValueWithDeletedCheck(java.lang.Integer objectId) {
        TObject entity = new TObject();
        entity.setObjectId(objectId);
        final TObjectCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TObject. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TObject> selectList(TObjectCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TObject>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TObject. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TObject> selectPage(final TObjectCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TObject> invoker = new PagingInvoker<TObject>(getTableDbName());
        final PagingHandler<TObject> handler = new PagingHandler<TObject>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TObject> paging() { return selectList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function. <br />
     * Call a function method after this method called like as follows:
     * <pre>
     * tObjectBhv.scalarSelect(Date.class).max(new ScalarQuery(TObjectCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TObjectCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TObjectCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TObjectCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param tObject The entity of TObject. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadTObjectpropertiesList(TObject tObject, ConditionBeanSetupper<TObjectpropertiesCB> conditionBeanSetupper) {
        xassLRArg(tObject, conditionBeanSetupper);
        loadTObjectpropertiesList(xnewLRLs(tObject), conditionBeanSetupper);
    }
    /**
     * Load referrer of TObjectpropertiesList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setObjectId_InScope(pkList);
     * cb.query().addOrderBy_ObjectId_Asc();
     * </pre>
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadTObjectpropertiesList(List<TObject> tObjectList, ConditionBeanSetupper<TObjectpropertiesCB> conditionBeanSetupper) {
        xassLRArg(tObjectList, conditionBeanSetupper);
        loadTObjectpropertiesList(tObjectList, new LoadReferrerOption<TObjectpropertiesCB, TObjectproperties>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param tObject The entity of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTObjectpropertiesList(TObject tObject, LoadReferrerOption<TObjectpropertiesCB, TObjectproperties> loadReferrerOption) {
        xassLRArg(tObject, loadReferrerOption);
        loadTObjectpropertiesList(xnewLRLs(tObject), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTObjectpropertiesList(List<TObject> tObjectList, LoadReferrerOption<TObjectpropertiesCB, TObjectproperties> loadReferrerOption) {
        xassLRArg(tObjectList, loadReferrerOption);
        if (tObjectList.isEmpty()) { return; }
        final TObjectpropertiesBhv referrerBhv = xgetBSFLR().select(TObjectpropertiesBhv.class);
        helpLoadReferrerInternally(tObjectList, loadReferrerOption, new InternalLoadReferrerCallback<TObject, java.lang.Integer, TObjectpropertiesCB, TObjectproperties>() {
            public java.lang.Integer callbackBase_getPrimaryKeyValue(TObject entity) { return entity.getObjectId(); }
            public void callbackBase_setReferrerList(TObject entity, List<TObjectproperties> referrerList) { entity.setTObjectpropertiesList(referrerList); }
            public TObjectpropertiesCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(TObjectpropertiesCB cb, List<java.lang.Integer> pkList) { cb.query().setObjectId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(TObjectpropertiesCB cb) { cb.query().addOrderBy_ObjectId_Asc(); }
            public List<TObjectproperties> callbackReferrer_selectList(TObjectpropertiesCB cb) { return referrerBhv.selectList(cb); }
            public java.lang.Integer callbackReferrer_getForeignKeyValue(TObjectproperties entity) { return entity.getObjectId(); }
            public void callbackReferrer_setForeignEntity(TObjectproperties referrerEntity, TObject baseEntity) { referrerEntity.setTObject(baseEntity); }
        } );
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param tObject The entity of TObject. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadTAttributeList(TObject tObject, ConditionBeanSetupper<TAttributeCB> conditionBeanSetupper) {
        xassLRArg(tObject, conditionBeanSetupper);
        loadTAttributeList(xnewLRLs(tObject), conditionBeanSetupper);
    }
    /**
     * Load referrer of TAttributeList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setObjectId_InScope(pkList);
     * cb.query().addOrderBy_ObjectId_Asc();
     * </pre>
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadTAttributeList(List<TObject> tObjectList, ConditionBeanSetupper<TAttributeCB> conditionBeanSetupper) {
        xassLRArg(tObjectList, conditionBeanSetupper);
        loadTAttributeList(tObjectList, new LoadReferrerOption<TAttributeCB, TAttribute>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param tObject The entity of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTAttributeList(TObject tObject, LoadReferrerOption<TAttributeCB, TAttribute> loadReferrerOption) {
        xassLRArg(tObject, loadReferrerOption);
        loadTAttributeList(xnewLRLs(tObject), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTAttributeList(List<TObject> tObjectList, LoadReferrerOption<TAttributeCB, TAttribute> loadReferrerOption) {
        xassLRArg(tObjectList, loadReferrerOption);
        if (tObjectList.isEmpty()) { return; }
        final TAttributeBhv referrerBhv = xgetBSFLR().select(TAttributeBhv.class);
        helpLoadReferrerInternally(tObjectList, loadReferrerOption, new InternalLoadReferrerCallback<TObject, java.lang.Integer, TAttributeCB, TAttribute>() {
            public java.lang.Integer callbackBase_getPrimaryKeyValue(TObject entity) { return entity.getObjectId(); }
            public void callbackBase_setReferrerList(TObject entity, List<TAttribute> referrerList) { entity.setTAttributeList(referrerList); }
            public TAttributeCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(TAttributeCB cb, List<java.lang.Integer> pkList) { cb.query().setObjectId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(TAttributeCB cb) { cb.query().addOrderBy_ObjectId_Asc(); }
            public List<TAttribute> callbackReferrer_selectList(TAttributeCB cb) { return referrerBhv.selectList(cb); }
            public java.lang.Integer callbackReferrer_getForeignKeyValue(TAttribute entity) { return entity.getObjectId(); }
            public void callbackReferrer_setForeignEntity(TAttribute referrerEntity, TObject baseEntity) { referrerEntity.setTObject(baseEntity); }
        } );
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param tObject The entity of TObject. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadTOperationList(TObject tObject, ConditionBeanSetupper<TOperationCB> conditionBeanSetupper) {
        xassLRArg(tObject, conditionBeanSetupper);
        loadTOperationList(xnewLRLs(tObject), conditionBeanSetupper);
    }
    /**
     * Load referrer of TOperationList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setObjectId_InScope(pkList);
     * cb.query().addOrderBy_ObjectId_Asc();
     * </pre>
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadTOperationList(List<TObject> tObjectList, ConditionBeanSetupper<TOperationCB> conditionBeanSetupper) {
        xassLRArg(tObjectList, conditionBeanSetupper);
        loadTOperationList(tObjectList, new LoadReferrerOption<TOperationCB, TOperation>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param tObject The entity of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTOperationList(TObject tObject, LoadReferrerOption<TOperationCB, TOperation> loadReferrerOption) {
        xassLRArg(tObject, loadReferrerOption);
        loadTOperationList(xnewLRLs(tObject), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTOperationList(List<TObject> tObjectList, LoadReferrerOption<TOperationCB, TOperation> loadReferrerOption) {
        xassLRArg(tObjectList, loadReferrerOption);
        if (tObjectList.isEmpty()) { return; }
        final TOperationBhv referrerBhv = xgetBSFLR().select(TOperationBhv.class);
        helpLoadReferrerInternally(tObjectList, loadReferrerOption, new InternalLoadReferrerCallback<TObject, java.lang.Integer, TOperationCB, TOperation>() {
            public java.lang.Integer callbackBase_getPrimaryKeyValue(TObject entity) { return entity.getObjectId(); }
            public void callbackBase_setReferrerList(TObject entity, List<TOperation> referrerList) { entity.setTOperationList(referrerList); }
            public TOperationCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(TOperationCB cb, List<java.lang.Integer> pkList) { cb.query().setObjectId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(TOperationCB cb) { cb.query().addOrderBy_ObjectId_Asc(); }
            public List<TOperation> callbackReferrer_selectList(TOperationCB cb) { return referrerBhv.selectList(cb); }
            public java.lang.Integer callbackReferrer_getForeignKeyValue(TOperation entity) { return entity.getObjectId(); }
            public void callbackReferrer_setForeignEntity(TOperation referrerEntity, TObject baseEntity) { referrerEntity.setTObject(baseEntity); }
        } );
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param tObject The entity of TObject. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadTConnectorByStartObjectIdList(TObject tObject, ConditionBeanSetupper<TConnectorCB> conditionBeanSetupper) {
        xassLRArg(tObject, conditionBeanSetupper);
        loadTConnectorByStartObjectIdList(xnewLRLs(tObject), conditionBeanSetupper);
    }
    /**
     * Load referrer of TConnectorByStartObjectIdList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setStartObjectId_InScope(pkList);
     * cb.query().addOrderBy_StartObjectId_Asc();
     * </pre>
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadTConnectorByStartObjectIdList(List<TObject> tObjectList, ConditionBeanSetupper<TConnectorCB> conditionBeanSetupper) {
        xassLRArg(tObjectList, conditionBeanSetupper);
        loadTConnectorByStartObjectIdList(tObjectList, new LoadReferrerOption<TConnectorCB, TConnector>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param tObject The entity of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTConnectorByStartObjectIdList(TObject tObject, LoadReferrerOption<TConnectorCB, TConnector> loadReferrerOption) {
        xassLRArg(tObject, loadReferrerOption);
        loadTConnectorByStartObjectIdList(xnewLRLs(tObject), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTConnectorByStartObjectIdList(List<TObject> tObjectList, LoadReferrerOption<TConnectorCB, TConnector> loadReferrerOption) {
        xassLRArg(tObjectList, loadReferrerOption);
        if (tObjectList.isEmpty()) { return; }
        final TConnectorBhv referrerBhv = xgetBSFLR().select(TConnectorBhv.class);
        helpLoadReferrerInternally(tObjectList, loadReferrerOption, new InternalLoadReferrerCallback<TObject, java.lang.Integer, TConnectorCB, TConnector>() {
            public java.lang.Integer callbackBase_getPrimaryKeyValue(TObject entity) { return entity.getObjectId(); }
            public void callbackBase_setReferrerList(TObject entity, List<TConnector> referrerList) { entity.setTConnectorByStartObjectIdList(referrerList); }
            public TConnectorCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(TConnectorCB cb, List<java.lang.Integer> pkList) { cb.query().setStartObjectId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(TConnectorCB cb) { cb.query().addOrderBy_StartObjectId_Asc(); }
            public List<TConnector> callbackReferrer_selectList(TConnectorCB cb) { return referrerBhv.selectList(cb); }
            public java.lang.Integer callbackReferrer_getForeignKeyValue(TConnector entity) { return entity.getStartObjectId(); }
            public void callbackReferrer_setForeignEntity(TConnector referrerEntity, TObject baseEntity) { referrerEntity.setTObjectByStartObjectId(baseEntity); }
        } );
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param tObject The entity of TObject. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadTConnectorByEndObjectIdList(TObject tObject, ConditionBeanSetupper<TConnectorCB> conditionBeanSetupper) {
        xassLRArg(tObject, conditionBeanSetupper);
        loadTConnectorByEndObjectIdList(xnewLRLs(tObject), conditionBeanSetupper);
    }
    /**
     * Load referrer of TConnectorByEndObjectIdList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setEndObjectId_InScope(pkList);
     * cb.query().addOrderBy_EndObjectId_Asc();
     * </pre>
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadTConnectorByEndObjectIdList(List<TObject> tObjectList, ConditionBeanSetupper<TConnectorCB> conditionBeanSetupper) {
        xassLRArg(tObjectList, conditionBeanSetupper);
        loadTConnectorByEndObjectIdList(tObjectList, new LoadReferrerOption<TConnectorCB, TConnector>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param tObject The entity of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTConnectorByEndObjectIdList(TObject tObject, LoadReferrerOption<TConnectorCB, TConnector> loadReferrerOption) {
        xassLRArg(tObject, loadReferrerOption);
        loadTConnectorByEndObjectIdList(xnewLRLs(tObject), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTConnectorByEndObjectIdList(List<TObject> tObjectList, LoadReferrerOption<TConnectorCB, TConnector> loadReferrerOption) {
        xassLRArg(tObjectList, loadReferrerOption);
        if (tObjectList.isEmpty()) { return; }
        final TConnectorBhv referrerBhv = xgetBSFLR().select(TConnectorBhv.class);
        helpLoadReferrerInternally(tObjectList, loadReferrerOption, new InternalLoadReferrerCallback<TObject, java.lang.Integer, TConnectorCB, TConnector>() {
            public java.lang.Integer callbackBase_getPrimaryKeyValue(TObject entity) { return entity.getObjectId(); }
            public void callbackBase_setReferrerList(TObject entity, List<TConnector> referrerList) { entity.setTConnectorByEndObjectIdList(referrerList); }
            public TConnectorCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(TConnectorCB cb, List<java.lang.Integer> pkList) { cb.query().setEndObjectId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(TConnectorCB cb) { cb.query().addOrderBy_EndObjectId_Asc(); }
            public List<TConnector> callbackReferrer_selectList(TConnectorCB cb) { return referrerBhv.selectList(cb); }
            public java.lang.Integer callbackReferrer_getForeignKeyValue(TConnector entity) { return entity.getEndObjectId(); }
            public void callbackReferrer_setForeignEntity(TConnector referrerEntity, TObject baseEntity) { referrerEntity.setTObjectByEndObjectId(baseEntity); }
        } );
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param tObject The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(TObject tObject) {
        assertEntityNotNull(tObject);
        delegateInsert(tObject);
    }

    @Override
    protected void doCreate(Entity tObject) {
        insert((TObject)tObject);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param tObject The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final TObject tObject) {
        helpUpdateInternally(tObject, new InternalUpdateCallback<TObject>() {
            public int callbackDelegateUpdate(TObject entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(Entity entity) {
        update((TObject)entity);
    }

    @Override
    protected void doModifyNonstrict(Entity entity) {
        update((TObject)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param tObject The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final TObject tObject) {
        helpInsertOrUpdateInternally(tObject, new InternalInsertOrUpdateCallback<TObject, TObjectCB>() {
            public void callbackInsert(TObject entity) { insert(entity); }
            public void callbackUpdate(TObject entity) { update(entity); }
            public TObjectCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(TObjectCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(Entity tObject) {
        insertOrUpdate((TObject)tObject);
    }

    @Override
    protected void doCreateOrUpdateNonstrict(Entity entity) {
        insertOrUpdate((TObject)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param tObject The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TObject tObject) {
        helpDeleteInternally(tObject, new InternalDeleteCallback<TObject>() {
            public int callbackDelegateDelete(TObject entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(Entity tObject) {
        delete((TObject)tObject);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param tObjectList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<TObject> tObjectList) {
        assertObjectNotNull("tObjectList", tObjectList);
        return delegateInsertList(tObjectList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param tObjectList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<TObject> tObjectList) {
        assertObjectNotNull("tObjectList", tObjectList);
        return delegateUpdateList(tObjectList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param tObjectList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<TObject> tObjectList) {
        assertObjectNotNull("tObjectList", tObjectList);
        return delegateDeleteList(tObjectList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param tObject Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(TObject tObject, TObjectCB cb) {
        assertObjectNotNull("tObject", tObject); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(tObject);
        filterEntityOfUpdate(tObject); assertEntityOfUpdate(tObject);
        return invoke(createQueryUpdateEntityCBCommand(tObject, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(TObjectCB cb) {
        assertCBNotNull(cb);
        return invoke(createQueryDeleteCBCommand(cb));
    }
    
    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCount(TObjectCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TObjectCB cb, EntityRowHandler<TObject> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TObject.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TObjectCB)cb); }
    protected List<TObject> delegateSelectList(TObjectCB cb)
    { return invoke(createSelectListCBCommand(cb, TObject.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TObjectCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(TObject e)
    { if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e)); }
    protected int doCallCreate(Entity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(TObject e)
    { if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e)); }
    protected int doCallModify(Entity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateDelete(TObject e)
    { if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e)); }
    protected int doCallRemove(Entity entity) { return delegateDelete(downcast(entity)); }

    protected int[] delegateInsertList(List<TObject> ls)
    { if (ls.isEmpty()) { return new int[]{}; } return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls))); }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<Entity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<TObject> ls)
    { if (ls.isEmpty()) { return new int[]{}; } return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls))); }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<Entity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateDeleteList(List<TObject> ls)
    { if (ls.isEmpty()) { return new int[]{}; } return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls))); }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<Entity> ls) { return delegateDeleteList((List)ls); }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    protected TObject downcast(Entity entity) {
        return helpDowncastInternally(entity, TObject.class);
    }
}
