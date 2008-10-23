package jp.sourceforge.ea2ddl.dao.bsbhv;


import java.util.List;

import jp.sourceforge.ea2ddl.dao.allcommon.*;
import jp.sourceforge.ea2ddl.dao.allcommon.bhv.load.LoadReferrerOption;
import jp.sourceforge.ea2ddl.dao.allcommon.bhv.setup.ConditionBeanSetupper;
import jp.sourceforge.ea2ddl.dao.allcommon.bhv.setup.ValueLabelSetupper;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ListResultBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ResultBeanBuilder;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingInvoker;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingResultBean;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.exbhv.*;
import jp.sourceforge.ea2ddl.dao.exdao.*;
import jp.sourceforge.ea2ddl.dao.exentity.*;
import jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;


/**
 * The behavior of t_object.
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
public abstract class BsTObjectBhv extends jp.sourceforge.ea2ddl.dao.allcommon.bhv.AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    public static final String PATH_selectList = "selectList";
    public static final String PATH_selectTableById = "selectTableById";
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectDao _dao;

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_object"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The meta data of the database. (NotNull) */
    public DBMeta getDBMeta() { return TObjectDbm.getInstance(); }

    /** @return The meta data of the database as my table type. (NotNull) */
    public TObjectDbm getMyDBMeta() { return TObjectDbm.getInstance(); }

    // ===================================================================================
    //                                                                        Dao Accessor
    //                                                                        ============
    public TObjectDao getMyDao() { return _dao; }
    public void setMyDao(TObjectDao dao) { assertObjectNotNull("dao", dao); _dao = dao; }
    public DaoReadable getDaoReadable() { return getMyDao(); }
    public DaoWritable getDaoWritable() { return getMyDao(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TObject newMyEntity() { return new TObject(); }
    public TObjectCB newMyConditionBean() { return new TObjectCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of the condition-bean. {IgnorePagingCondition}
     * @param cb The condition-bean of TObject. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TObjectCB cb) {
        assertConditionBeanNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TObject. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TObject selectEntity(final TObjectCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TObject, TObjectCB>() {
            public List<TObject> callbackSelectList(TObjectCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TObject. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TObject selectEntityWithDeletedCheck(final TObjectCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TObject, TObjectCB>() {
            public List<TObject> callbackSelectList(TObjectCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
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
        assertConditionBeanNotNull(cb);
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
        assertConditionBeanNotNull(cb);
        final PagingInvoker<TObject> invoker = new PagingInvoker<TObject>(getTableDbName());
        final PagingHandler<TObject> handler = new PagingHandler<TObject>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TObject> paging() { return selectList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of TObject. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     */
    public List<java.util.Map<String, Object>> selectValueLabelList(TObjectCB cb, ValueLabelSetupper<TObject> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }


    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
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
        assertObjectNotNull("tObjectList<TObject>", tObjectList);
        assertObjectNotNull("conditionBeanSetupper<TObjectpropertiesCB>", conditionBeanSetupper);
        if (tObjectList.isEmpty()) { return; }
        loadTObjectpropertiesList(tObjectList, new LoadReferrerOption<TObjectpropertiesCB, TObjectproperties>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTObjectpropertiesList(List<TObject> tObjectList, LoadReferrerOption<TObjectpropertiesCB, TObjectproperties> loadReferrerOption) {
        assertObjectNotNull("tObjectList<TObject>", tObjectList);
        assertObjectNotNull("loadReferrerOption<TObjectproperties, TObjectpropertiesCB>", loadReferrerOption);
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
        assertObjectNotNull("tObjectList<TObject>", tObjectList);
        assertObjectNotNull("conditionBeanSetupper<TAttributeCB>", conditionBeanSetupper);
        if (tObjectList.isEmpty()) { return; }
        loadTAttributeList(tObjectList, new LoadReferrerOption<TAttributeCB, TAttribute>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTAttributeList(List<TObject> tObjectList, LoadReferrerOption<TAttributeCB, TAttribute> loadReferrerOption) {
        assertObjectNotNull("tObjectList<TObject>", tObjectList);
        assertObjectNotNull("loadReferrerOption<TAttribute, TAttributeCB>", loadReferrerOption);
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
        assertObjectNotNull("tObjectList<TObject>", tObjectList);
        assertObjectNotNull("conditionBeanSetupper<TOperationCB>", conditionBeanSetupper);
        if (tObjectList.isEmpty()) { return; }
        loadTOperationList(tObjectList, new LoadReferrerOption<TOperationCB, TOperation>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTOperationList(List<TObject> tObjectList, LoadReferrerOption<TOperationCB, TOperation> loadReferrerOption) {
        assertObjectNotNull("tObjectList<TObject>", tObjectList);
        assertObjectNotNull("loadReferrerOption<TOperation, TOperationCB>", loadReferrerOption);
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
        assertObjectNotNull("tObjectList<TObject>", tObjectList);
        assertObjectNotNull("conditionBeanSetupper<TConnectorCB>", conditionBeanSetupper);
        if (tObjectList.isEmpty()) { return; }
        loadTConnectorByStartObjectIdList(tObjectList, new LoadReferrerOption<TConnectorCB, TConnector>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTConnectorByStartObjectIdList(List<TObject> tObjectList, LoadReferrerOption<TConnectorCB, TConnector> loadReferrerOption) {
        assertObjectNotNull("tObjectList<TObject>", tObjectList);
        assertObjectNotNull("loadReferrerOption<TConnector, TConnectorCB>", loadReferrerOption);
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
        assertObjectNotNull("tObjectList<TObject>", tObjectList);
        assertObjectNotNull("conditionBeanSetupper<TConnectorCB>", conditionBeanSetupper);
        if (tObjectList.isEmpty()) { return; }
        loadTConnectorByEndObjectIdList(tObjectList, new LoadReferrerOption<TConnectorCB, TConnector>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param tObjectList The entity list of TObject. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTConnectorByEndObjectIdList(List<TObject> tObjectList, LoadReferrerOption<TConnectorCB, TConnector> loadReferrerOption) {
        assertObjectNotNull("tObjectList<TObject>", tObjectList);
        assertObjectNotNull("loadReferrerOption<TConnector, TConnectorCB>", loadReferrerOption);
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
    //                                                                     Pullout Foreign
    //                                                                     ===============
          
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param tObject The entity of insert target. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
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
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
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
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
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
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
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
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
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
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
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
        assertObjectNotNull("tObject", tObject); assertConditionBeanNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(tObject);
        filterEntityOfUpdate(tObject); assertEntityOfUpdate(tObject);
        return getMyDao().updateByQuery(cb, tObject);
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(TObjectCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().deleteByQuery(cb);
    }

    // ===================================================================================
    //                                                                      Various Update
    //                                                                      ==============

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCount(TObjectCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectCount(cb); }
    protected List<TObject> delegateSelectList(TObjectCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectList(cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(TObject e) { if (!processBeforeInsert(e)) { return 1; } return getMyDao().insert(e); }
    protected int delegateUpdate(TObject e) { if (!processBeforeUpdate(e)) { return 1; } return getMyDao().updateModifiedOnly(e); }
    protected int delegateDelete(TObject e) { if (!processBeforeDelete(e)) { return 1; } return getMyDao().delete(e); }

    protected int[] delegateInsertList(List<TObject> ls) {
        assertObjectNotNull("tObjectList", ls); return getMyDao().insertList(helpFilterBeforeInsertInternally(ls));
    }
    protected int[] delegateUpdateList(List<TObject> ls) {
        assertObjectNotNull("tObjectList", ls); return getMyDao().updateList(helpFilterBeforeUpdateInternally(ls));
    }
    protected int[] delegateDeleteList(List<TObject> ls) {
        assertObjectNotNull("tObjectList", ls); return getMyDao().deleteList(helpFilterBeforeDeleteInternally(ls));
    }

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
