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
 * The behavior of t_operation that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     OperationID
 * 
 * [column]
 *     OperationID, Object_ID, Name, Scope, Type, ReturnArray, Stereotype, IsStatic, Concurrency, Notes, Behaviour, GenOption, Pos, Style, Pure, Classifier, Code, IsRoot, IsLeaf, IsQuery, StateFlags, ea_guid, StyleEx
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
 *     t_object
 * 
 * [referrer-table]
 *     t_operationparams
 * 
 * [foreign-property]
 *     tObject
 * 
 * [referrer-property]
 *     tOperationparamsList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTOperationBhv extends org.seasar.dbflute.bhv.AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_operation"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TOperationDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TOperationDbm getMyDBMeta() { return TOperationDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TOperation newMyEntity() { return new TOperation(); }
    public TOperationCB newMyConditionBean() { return new TOperationCB(); }

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
     * @param cb The condition-bean of TOperation. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TOperationCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TOperation. (NotNull)
     * @param entityRowHandler The handler of entity row of TOperation. (NotNull)
     */
    public void selectCursor(TOperationCB cb, EntityRowHandler<TOperation> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TOperation>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TOperation. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TOperation selectEntity(final TOperationCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TOperation, TOperationCB>() {
            public List<TOperation> callbackSelectList(TOperationCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TOperation. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TOperation selectEntityWithDeletedCheck(final TOperationCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TOperation, TOperationCB>() {
            public List<TOperation> callbackSelectList(TOperationCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TOperation selectByPKValueWithDeletedCheck(java.lang.Integer operationid) {
        TOperation entity = new TOperation();
        entity.setOperationid(operationid);
        final TOperationCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TOperation. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TOperation> selectList(TOperationCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TOperation>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TOperation. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TOperation> selectPage(final TOperationCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TOperation> invoker = new PagingInvoker<TOperation>(getTableDbName());
        final PagingHandler<TOperation> handler = new PagingHandler<TOperation>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TOperation> paging() { return selectList(cb); }
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
     * tOperationBhv.scalarSelect(Date.class).max(new ScalarQuery(TOperationCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TOperationCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TOperationCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TOperationCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param tOperation The entity of TOperation. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadTOperationparamsList(TOperation tOperation, ConditionBeanSetupper<TOperationparamsCB> conditionBeanSetupper) {
        xassLRArg(tOperation, conditionBeanSetupper);
        loadTOperationparamsList(xnewLRLs(tOperation), conditionBeanSetupper);
    }
    /**
     * Load referrer of TOperationparamsList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setOperationid_InScope(pkList);
     * cb.query().addOrderBy_Operationid_Asc();
     * </pre>
     * @param tOperationList The entity list of TOperation. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadTOperationparamsList(List<TOperation> tOperationList, ConditionBeanSetupper<TOperationparamsCB> conditionBeanSetupper) {
        xassLRArg(tOperationList, conditionBeanSetupper);
        loadTOperationparamsList(tOperationList, new LoadReferrerOption<TOperationparamsCB, TOperationparams>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param tOperation The entity of TOperation. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTOperationparamsList(TOperation tOperation, LoadReferrerOption<TOperationparamsCB, TOperationparams> loadReferrerOption) {
        xassLRArg(tOperation, loadReferrerOption);
        loadTOperationparamsList(xnewLRLs(tOperation), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param tOperationList The entity list of TOperation. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTOperationparamsList(List<TOperation> tOperationList, LoadReferrerOption<TOperationparamsCB, TOperationparams> loadReferrerOption) {
        xassLRArg(tOperationList, loadReferrerOption);
        if (tOperationList.isEmpty()) { return; }
        final TOperationparamsBhv referrerBhv = xgetBSFLR().select(TOperationparamsBhv.class);
        helpLoadReferrerInternally(tOperationList, loadReferrerOption, new InternalLoadReferrerCallback<TOperation, java.lang.Integer, TOperationparamsCB, TOperationparams>() {
            public java.lang.Integer callbackBase_getPrimaryKeyValue(TOperation entity) { return entity.getOperationid(); }
            public void callbackBase_setReferrerList(TOperation entity, List<TOperationparams> referrerList) { entity.setTOperationparamsList(referrerList); }
            public TOperationparamsCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(TOperationparamsCB cb, List<java.lang.Integer> pkList) { cb.query().setOperationid_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(TOperationparamsCB cb) { cb.query().addOrderBy_Operationid_Asc(); }
            public List<TOperationparams> callbackReferrer_selectList(TOperationparamsCB cb) { return referrerBhv.selectList(cb); }
            public java.lang.Integer callbackReferrer_getForeignKeyValue(TOperationparams entity) { return entity.getOperationid(); }
            public void callbackReferrer_setForeignEntity(TOperationparams referrerEntity, TOperation baseEntity) { referrerEntity.setTOperation(baseEntity); }
        } );
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'TObject'.
     * @param tOperationList The list of tOperation. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<TObject> pulloutTObject(List<TOperation> tOperationList) {
        return helpPulloutInternally(tOperationList, new InternalPulloutCallback<TOperation, TObject>() {
            public TObject callbackGetForeignEntity(TOperation entity) { return entity.getTObject(); } });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param tOperation The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(TOperation tOperation) {
        assertEntityNotNull(tOperation);
        delegateInsert(tOperation);
    }

    @Override
    protected void doCreate(Entity tOperation) {
        insert((TOperation)tOperation);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param tOperation The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final TOperation tOperation) {
        helpUpdateInternally(tOperation, new InternalUpdateCallback<TOperation>() {
            public int callbackDelegateUpdate(TOperation entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(Entity entity) {
        update((TOperation)entity);
    }

    @Override
    protected void doModifyNonstrict(Entity entity) {
        update((TOperation)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param tOperation The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final TOperation tOperation) {
        helpInsertOrUpdateInternally(tOperation, new InternalInsertOrUpdateCallback<TOperation, TOperationCB>() {
            public void callbackInsert(TOperation entity) { insert(entity); }
            public void callbackUpdate(TOperation entity) { update(entity); }
            public TOperationCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(TOperationCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(Entity tOperation) {
        insertOrUpdate((TOperation)tOperation);
    }

    @Override
    protected void doCreateOrUpdateNonstrict(Entity entity) {
        insertOrUpdate((TOperation)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param tOperation The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TOperation tOperation) {
        helpDeleteInternally(tOperation, new InternalDeleteCallback<TOperation>() {
            public int callbackDelegateDelete(TOperation entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(Entity tOperation) {
        delete((TOperation)tOperation);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param tOperationList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<TOperation> tOperationList) {
        assertObjectNotNull("tOperationList", tOperationList);
        return delegateInsertList(tOperationList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param tOperationList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<TOperation> tOperationList) {
        assertObjectNotNull("tOperationList", tOperationList);
        return delegateUpdateList(tOperationList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param tOperationList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<TOperation> tOperationList) {
        assertObjectNotNull("tOperationList", tOperationList);
        return delegateDeleteList(tOperationList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param tOperation Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(TOperation tOperation, TOperationCB cb) {
        assertObjectNotNull("tOperation", tOperation); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(tOperation);
        filterEntityOfUpdate(tOperation); assertEntityOfUpdate(tOperation);
        return invoke(createQueryUpdateEntityCBCommand(tOperation, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(TOperationCB cb) {
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
    protected int delegateSelectCount(TOperationCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TOperationCB cb, EntityRowHandler<TOperation> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TOperation.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TOperationCB)cb); }
    protected List<TOperation> delegateSelectList(TOperationCB cb)
    { return invoke(createSelectListCBCommand(cb, TOperation.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TOperationCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(TOperation e)
    { if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e)); }
    protected int doCallCreate(Entity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(TOperation e)
    { if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e)); }
    protected int doCallModify(Entity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateDelete(TOperation e)
    { if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e)); }
    protected int doCallRemove(Entity entity) { return delegateDelete(downcast(entity)); }

    protected int[] delegateInsertList(List<TOperation> ls)
    { if (ls.isEmpty()) { return new int[]{}; } return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls))); }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<Entity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<TOperation> ls)
    { if (ls.isEmpty()) { return new int[]{}; } return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls))); }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<Entity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateDeleteList(List<TOperation> ls)
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
    protected TOperation downcast(Entity entity) {
        return helpDowncastInternally(entity, TOperation.class);
    }
}
