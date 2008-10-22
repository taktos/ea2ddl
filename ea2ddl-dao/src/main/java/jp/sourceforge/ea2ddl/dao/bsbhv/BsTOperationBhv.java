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
 * The behavior of t_operation.
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
public abstract class BsTOperationBhv extends jp.sourceforge.ea2ddl.dao.allcommon.bhv.AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TOperationDao _dao;

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_operation"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The meta data of the database. (NotNull) */
    public DBMeta getDBMeta() { return TOperationDbm.getInstance(); }

    /** @return The meta data of the database as my table type. (NotNull) */
    public TOperationDbm getMyDBMeta() { return TOperationDbm.getInstance(); }

    // ===================================================================================
    //                                                                        Dao Accessor
    //                                                                        ============
    public TOperationDao getMyDao() { return _dao; }
    public void setMyDao(TOperationDao dao) { assertObjectNotNull("dao", dao); _dao = dao; }
    public DaoReadable getDaoReadable() { return getMyDao(); }
    public DaoWritable getDaoWritable() { return getMyDao(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TOperation newMyEntity() { return new TOperation(); }
    public TOperationCB newMyConditionBean() { return new TOperationCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of the condition-bean. {IgnorePagingCondition}
     * @param cb The condition-bean of TOperation. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TOperationCB cb) {
        assertConditionBeanNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TOperation. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TOperation selectEntity(final TOperationCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TOperation, TOperationCB>() {
            public List<TOperation> callbackSelectList(TOperationCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TOperation. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TOperation selectEntityWithDeletedCheck(final TOperationCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TOperation, TOperationCB>() {
            public List<TOperation> callbackSelectList(TOperationCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
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
        assertConditionBeanNotNull(cb);
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
        assertConditionBeanNotNull(cb);
        final PagingInvoker<TOperation> invoker = new PagingInvoker<TOperation>(getTableDbName());
        final PagingHandler<TOperation> handler = new PagingHandler<TOperation>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TOperation> paging() { return selectList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of TOperation. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     */
    public List<java.util.Map<String, Object>> selectValueLabelList(TOperationCB cb, ValueLabelSetupper<TOperation> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }


    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
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
        assertObjectNotNull("tOperationList<TOperation>", tOperationList);
        assertObjectNotNull("conditionBeanSetupper<TOperationparamsCB>", conditionBeanSetupper);
        if (tOperationList.isEmpty()) { return; }
        loadTOperationparamsList(tOperationList, new LoadReferrerOption<TOperationparamsCB, TOperationparams>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param tOperationList The entity list of TOperation. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTOperationparamsList(List<TOperation> tOperationList, LoadReferrerOption<TOperationparamsCB, TOperationparams> loadReferrerOption) {
        assertObjectNotNull("tOperationList<TOperation>", tOperationList);
        assertObjectNotNull("loadReferrerOption<TOperationparams, TOperationparamsCB>", loadReferrerOption);
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
    //                                                                     Pullout Foreign
    //                                                                     ===============
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
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
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
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
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
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
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
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
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
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
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
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
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
        assertObjectNotNull("tOperation", tOperation); assertConditionBeanNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(tOperation);
        filterEntityOfUpdate(tOperation); assertEntityOfUpdate(tOperation);
        return getMyDao().updateByQuery(cb, tOperation);
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(TOperationCB cb) {
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
    protected int delegateSelectCount(TOperationCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectCount(cb); }
    protected List<TOperation> delegateSelectList(TOperationCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectList(cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(TOperation e) { if (!processBeforeInsert(e)) { return 1; } return getMyDao().insert(e); }
    protected int delegateUpdate(TOperation e) { if (!processBeforeUpdate(e)) { return 1; } return getMyDao().updateModifiedOnly(e); }
    protected int delegateDelete(TOperation e) { if (!processBeforeDelete(e)) { return 1; } return getMyDao().delete(e); }

    protected int[] delegateInsertList(List<TOperation> ls) {
        assertObjectNotNull("tOperationList", ls); return getMyDao().insertList(helpFilterBeforeInsertInternally(ls));
    }
    protected int[] delegateUpdateList(List<TOperation> ls) {
        assertObjectNotNull("tOperationList", ls); return getMyDao().updateList(helpFilterBeforeUpdateInternally(ls));
    }
    protected int[] delegateDeleteList(List<TOperation> ls) {
        assertObjectNotNull("tOperationList", ls); return getMyDao().deleteList(helpFilterBeforeDeleteInternally(ls));
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
    protected TOperation downcast(Entity entity) {
        return helpDowncastInternally(entity, TOperation.class);
    }
}
