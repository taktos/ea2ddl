package jp.sourceforge.ea2ddl.dao.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
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
import jp.sourceforge.ea2ddl.dao.exentity.*;
import jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;

/**
 * The behavior of t_connector that the type is TABLE. <br />
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
public abstract class BsTConnectorBhv extends org.seasar.dbflute.bhv.AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    public static final String PATH_selectForeignKeys = "selectForeignKeys";
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_connector"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TConnectorDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TConnectorDbm getMyDBMeta() { return TConnectorDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TConnector newMyEntity() { return new TConnector(); }
    public TConnectorCB newMyConditionBean() { return new TConnectorCB(); }

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
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TConnectorCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @param entityRowHandler The handler of entity row of TConnector. (NotNull)
     */
    public void selectCursor(TConnectorCB cb, EntityRowHandler<TConnector> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TConnector>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TConnector selectEntity(final TConnectorCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TConnector, TConnectorCB>() {
            public List<TConnector> callbackSelectList(TConnectorCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TConnector selectEntityWithDeletedCheck(final TConnectorCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TConnector, TConnectorCB>() {
            public List<TConnector> callbackSelectList(TConnectorCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
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
        assertCBNotNull(cb);
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
        assertCBNotNull(cb);
        final PagingInvoker<TConnector> invoker = new PagingInvoker<TConnector>(getTableDbName());
        final PagingHandler<TConnector> handler = new PagingHandler<TConnector>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TConnector> paging() { return selectList(cb); }
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
     * tConnectorBhv.scalarSelect(Date.class).max(new ScalarQuery(TConnectorCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TConnectorCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TConnectorCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TConnectorCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
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
        assertObjectNotNull("tConnector", tConnector); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(tConnector);
        filterEntityOfUpdate(tConnector); assertEntityOfUpdate(tConnector);
        return invoke(createQueryUpdateEntityCBCommand(tConnector, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(TConnectorCB cb) {
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
    protected int delegateSelectCount(TConnectorCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TConnectorCB cb, EntityRowHandler<TConnector> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TConnector.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TConnectorCB)cb); }
    protected List<TConnector> delegateSelectList(TConnectorCB cb)
    { return invoke(createSelectListCBCommand(cb, TConnector.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TConnectorCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(TConnector e)
    { if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e)); }
    protected int doCallCreate(Entity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(TConnector e)
    { if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e)); }
    protected int doCallModify(Entity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateDelete(TConnector e)
    { if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e)); }
    protected int doCallRemove(Entity entity) { return delegateDelete(downcast(entity)); }

    protected int[] delegateInsertList(List<TConnector> ls)
    { if (ls.isEmpty()) { return new int[]{}; } return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls))); }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<Entity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<TConnector> ls)
    { if (ls.isEmpty()) { return new int[]{}; } return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls))); }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<Entity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateDeleteList(List<TConnector> ls)
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
    protected TConnector downcast(Entity entity) {
        return helpDowncastInternally(entity, TConnector.class);
    }
}
