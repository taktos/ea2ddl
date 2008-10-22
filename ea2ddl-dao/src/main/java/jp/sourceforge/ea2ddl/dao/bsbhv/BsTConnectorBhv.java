package jp.sourceforge.ea2ddl.dao.bsbhv;


import java.util.List;

import jp.sourceforge.ea2ddl.dao.allcommon.*;
import jp.sourceforge.ea2ddl.dao.allcommon.bhv.setup.ValueLabelSetupper;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ListResultBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ResultBeanBuilder;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingInvoker;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingResultBean;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.exdao.*;
import jp.sourceforge.ea2ddl.dao.exentity.*;
import jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;


/**
 * The behavior of t_connector.
 * <pre>
 * [primary-key]
 *     Connector_ID
 * 
 * [column]
 *     Connector_ID, Name, Direction, Notes, Connector_Type, SubType, SourceCard, SourceAccess, SourceElement, DestCard, DestAccess, DestElement, SourceRole, SourceRoleType, SourceRoleNote, SourceContainment, SourceIsAggregate, SourceIsOrdered, SourceQualifier, DestRole, DestRoleType, DestRoleNote, DestContainment, DestIsAggregate, DestIsOrdered, DestQualifier, Start_Object_ID, End_Object_ID, Top_Start_Label, Top_Mid_Label, Top_End_Label, Btm_Start_Label, Btm_Mid_Label, Btm_End_Label, Start_Edge, End_Edge, PtStartX, PtStartY, PtEndX, PtEndY, SeqNo, HeadStyle, LineStyle, RouteStyle, IsBold, LineColor, Stereotype, VirtualInheritance, LinkAccess, PDATA1, PDATA2, PDATA3, PDATA4, PDATA5, DiagramID, ea_guid, SourceConstraint, DestConstraint, SourceIsNavigable, DestIsNavigable, IsRoot, IsLeaf, IsSpec, SourceChangeable, DestChangeable, SourceTS, DestTS, StateFlags, ActionFlags, IsSignal, IsStimulus, DispatchAction, Target2, StyleEx, SourceStereotype, DestStereotype, SourceStyle, DestStyle, EventFlags
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
 *     t_operation, t_object
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     tOperationBySourcerole, tOperationByDestrole, tObjectByStartObjectId, tObjectByEndObjectId
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTConnectorBhv extends jp.sourceforge.ea2ddl.dao.allcommon.bhv.AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    public static final String PATH_selectForeignKeys = "selectForeignKeys";
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TConnectorDao _dao;

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_connector"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The meta data of the database. (NotNull) */
    public DBMeta getDBMeta() { return TConnectorDbm.getInstance(); }

    /** @return The meta data of the database as my table type. (NotNull) */
    public TConnectorDbm getMyDBMeta() { return TConnectorDbm.getInstance(); }

    // ===================================================================================
    //                                                                        Dao Accessor
    //                                                                        ============
    public TConnectorDao getMyDao() { return _dao; }
    public void setMyDao(TConnectorDao dao) { assertObjectNotNull("dao", dao); _dao = dao; }
    public DaoReadable getDaoReadable() { return getMyDao(); }
    public DaoWritable getDaoWritable() { return getMyDao(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TConnector newMyEntity() { return new TConnector(); }
    public TConnectorCB newMyConditionBean() { return new TConnectorCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of the condition-bean. {IgnorePagingCondition}
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TConnectorCB cb) {
        assertConditionBeanNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TConnector selectEntity(final TConnectorCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TConnector, TConnectorCB>() {
            public List<TConnector> callbackSelectList(TConnectorCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TConnector selectEntityWithDeletedCheck(final TConnectorCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TConnector, TConnectorCB>() {
            public List<TConnector> callbackSelectList(TConnectorCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TConnector selectByPKValueWithDeletedCheck(java.lang.Integer connectorId) {
        TConnector entity = new TConnector();
        entity.setConnectorId(connectorId);
        final TConnectorCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TConnector> selectList(TConnectorCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<TConnector>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TConnector> selectPage(final TConnectorCB cb) {
        assertConditionBeanNotNull(cb);
        final PagingInvoker<TConnector> invoker = new PagingInvoker<TConnector>(getTableDbName());
        final PagingHandler<TConnector> handler = new PagingHandler<TConnector>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TConnector> paging() { return selectList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     */
    public List<java.util.Map<String, Object>> selectValueLabelList(TConnectorCB cb, ValueLabelSetupper<TConnector> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }


    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============

    // ===================================================================================
    //                                                                     Pullout Foreign
    //                                                                     ===============
    /**
     * Pull out the list of foreign table 'TOperation'.
     * @param tConnectorList The list of tConnector. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<TOperation> pulloutTOperationBySourcerole(List<TConnector> tConnectorList) {
        return helpPulloutInternally(tConnectorList, new InternalPulloutCallback<TConnector, TOperation>() {
            public TOperation callbackGetForeignEntity(TConnector entity) { return entity.getTOperationBySourcerole(); } });
    }
    /**
     * Pull out the list of foreign table 'TOperation'.
     * @param tConnectorList The list of tConnector. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<TOperation> pulloutTOperationByDestrole(List<TConnector> tConnectorList) {
        return helpPulloutInternally(tConnectorList, new InternalPulloutCallback<TConnector, TOperation>() {
            public TOperation callbackGetForeignEntity(TConnector entity) { return entity.getTOperationByDestrole(); } });
    }
    /**
     * Pull out the list of foreign table 'TObject'.
     * @param tConnectorList The list of tConnector. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<TObject> pulloutTObjectByStartObjectId(List<TConnector> tConnectorList) {
        return helpPulloutInternally(tConnectorList, new InternalPulloutCallback<TConnector, TObject>() {
            public TObject callbackGetForeignEntity(TConnector entity) { return entity.getTObjectByStartObjectId(); } });
    }
    /**
     * Pull out the list of foreign table 'TObject'.
     * @param tConnectorList The list of tConnector. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<TObject> pulloutTObjectByEndObjectId(List<TConnector> tConnectorList) {
        return helpPulloutInternally(tConnectorList, new InternalPulloutCallback<TConnector, TObject>() {
            public TObject callbackGetForeignEntity(TConnector entity) { return entity.getTObjectByEndObjectId(); } });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param tConnector The entity of insert target. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(TConnector tConnector) {
        assertEntityNotNull(tConnector);
        delegateInsert(tConnector);
    }

    @Override
    protected void doCreate(Entity tConnector) {
        insert((TConnector)tConnector);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param tConnector The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final TConnector tConnector) {
        helpUpdateInternally(tConnector, new InternalUpdateCallback<TConnector>() {
            public int callbackDelegateUpdate(TConnector entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(Entity entity) {
        update((TConnector)entity);
    }

    @Override
    protected void doModifyNonstrict(Entity entity) {
        update((TConnector)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param tConnector The entity of insert or update target. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final TConnector tConnector) {
        helpInsertOrUpdateInternally(tConnector, new InternalInsertOrUpdateCallback<TConnector, TConnectorCB>() {
            public void callbackInsert(TConnector entity) { insert(entity); }
            public void callbackUpdate(TConnector entity) { update(entity); }
            public TConnectorCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(TConnectorCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(Entity tConnector) {
        insertOrUpdate((TConnector)tConnector);
    }

    @Override
    protected void doCreateOrUpdateNonstrict(Entity entity) {
        insertOrUpdate((TConnector)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param tConnector The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TConnector tConnector) {
        helpDeleteInternally(tConnector, new InternalDeleteCallback<TConnector>() {
            public int callbackDelegateDelete(TConnector entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(Entity tConnector) {
        delete((TConnector)tConnector);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param tConnectorList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<TConnector> tConnectorList) {
        assertObjectNotNull("tConnectorList", tConnectorList);
        return delegateInsertList(tConnectorList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param tConnectorList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<TConnector> tConnectorList) {
        assertObjectNotNull("tConnectorList", tConnectorList);
        return delegateUpdateList(tConnectorList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param tConnectorList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<TConnector> tConnectorList) {
        assertObjectNotNull("tConnectorList", tConnectorList);
        return delegateDeleteList(tConnectorList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param tConnector Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(TConnector tConnector, TConnectorCB cb) {
        assertObjectNotNull("tConnector", tConnector); assertConditionBeanNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(tConnector);
        filterEntityOfUpdate(tConnector); assertEntityOfUpdate(tConnector);
        return getMyDao().updateByQuery(cb, tConnector);
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(TConnectorCB cb) {
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
    protected int delegateSelectCount(TConnectorCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectCount(cb); }
    protected List<TConnector> delegateSelectList(TConnectorCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectList(cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(TConnector e) { if (!processBeforeInsert(e)) { return 1; } return getMyDao().insert(e); }
    protected int delegateUpdate(TConnector e) { if (!processBeforeUpdate(e)) { return 1; } return getMyDao().updateModifiedOnly(e); }
    protected int delegateDelete(TConnector e) { if (!processBeforeDelete(e)) { return 1; } return getMyDao().delete(e); }

    protected int[] delegateInsertList(List<TConnector> ls) {
        assertObjectNotNull("tConnectorList", ls); return getMyDao().insertList(helpFilterBeforeInsertInternally(ls));
    }
    protected int[] delegateUpdateList(List<TConnector> ls) {
        assertObjectNotNull("tConnectorList", ls); return getMyDao().updateList(helpFilterBeforeUpdateInternally(ls));
    }
    protected int[] delegateDeleteList(List<TConnector> ls) {
        assertObjectNotNull("tConnectorList", ls); return getMyDao().deleteList(helpFilterBeforeDeleteInternally(ls));
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
    protected TConnector downcast(Entity entity) {
        return helpDowncastInternally(entity, TConnector.class);
    }
}
