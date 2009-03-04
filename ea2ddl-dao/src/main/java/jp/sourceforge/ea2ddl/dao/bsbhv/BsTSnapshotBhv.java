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
 * The behavior of t_snapshot that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     SnapshotID, SeriesID, Position, SnapshotName, Notes, Style, ElementID, ElementType, StrContent, BinContent1, BinContent2
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
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTSnapshotBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_snapshot"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TSnapshotDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TSnapshotDbm getMyDBMeta() { return TSnapshotDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TSnapshot newMyEntity() { return new TSnapshot(); }
    public TSnapshotCB newMyConditionBean() { return new TSnapshotCB(); }

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
     * @param cb The condition-bean of TSnapshot. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TSnapshotCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TSnapshot. (NotNull)
     * @param entityRowHandler The handler of entity row of TSnapshot. (NotNull)
     */
    public void selectCursor(TSnapshotCB cb, EntityRowHandler<TSnapshot> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TSnapshot>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TSnapshot. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TSnapshot selectEntity(final TSnapshotCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TSnapshot, TSnapshotCB>() {
            public List<TSnapshot> callbackSelectList(TSnapshotCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TSnapshot. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TSnapshot selectEntityWithDeletedCheck(final TSnapshotCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TSnapshot, TSnapshotCB>() {
            public List<TSnapshot> callbackSelectList(TSnapshotCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TSnapshot. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TSnapshot> selectList(TSnapshotCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TSnapshot>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TSnapshot. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TSnapshot> selectPage(final TSnapshotCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TSnapshot> invoker = new PagingInvoker<TSnapshot>(getTableDbName());
        final PagingHandler<TSnapshot> handler = new PagingHandler<TSnapshot>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TSnapshot> paging() { return selectList(cb); }
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
     * tSnapshotBhv.scalarSelect(Date.class).max(new ScalarQuery(TSnapshotCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TSnapshotCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TSnapshotCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TSnapshotCB, RESULT>(cb, resultType);
    }
    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    
    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCount(TSnapshotCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TSnapshotCB cb, EntityRowHandler<TSnapshot> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TSnapshot.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TSnapshotCB)cb); }
    protected List<TSnapshot> delegateSelectList(TSnapshotCB cb)
    { return invoke(createSelectListCBCommand(cb, TSnapshot.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TSnapshotCB)cb); }

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
    protected TSnapshot downcast(Entity entity) {
        return helpDowncastInternally(entity, TSnapshot.class);
    }
}
