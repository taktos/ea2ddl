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
 * The behavior of t_secuserpermission that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     UserID, PermissionID
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
public abstract class BsTSecuserpermissionBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_secuserpermission"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TSecuserpermissionDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TSecuserpermissionDbm getMyDBMeta() { return TSecuserpermissionDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TSecuserpermission newMyEntity() { return new TSecuserpermission(); }
    public TSecuserpermissionCB newMyConditionBean() { return new TSecuserpermissionCB(); }

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
     * @param cb The condition-bean of TSecuserpermission. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TSecuserpermissionCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TSecuserpermission. (NotNull)
     * @param entityRowHandler The handler of entity row of TSecuserpermission. (NotNull)
     */
    public void selectCursor(TSecuserpermissionCB cb, EntityRowHandler<TSecuserpermission> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TSecuserpermission>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TSecuserpermission. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TSecuserpermission selectEntity(final TSecuserpermissionCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TSecuserpermission, TSecuserpermissionCB>() {
            public List<TSecuserpermission> callbackSelectList(TSecuserpermissionCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TSecuserpermission. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TSecuserpermission selectEntityWithDeletedCheck(final TSecuserpermissionCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TSecuserpermission, TSecuserpermissionCB>() {
            public List<TSecuserpermission> callbackSelectList(TSecuserpermissionCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TSecuserpermission. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TSecuserpermission> selectList(TSecuserpermissionCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TSecuserpermission>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TSecuserpermission. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TSecuserpermission> selectPage(final TSecuserpermissionCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TSecuserpermission> invoker = new PagingInvoker<TSecuserpermission>(getTableDbName());
        final PagingHandler<TSecuserpermission> handler = new PagingHandler<TSecuserpermission>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TSecuserpermission> paging() { return selectList(cb); }
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
     * tSecuserpermissionBhv.scalarSelect(Date.class).max(new ScalarQuery(TSecuserpermissionCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TSecuserpermissionCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TSecuserpermissionCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TSecuserpermissionCB, RESULT>(cb, resultType);
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
    protected int delegateSelectCount(TSecuserpermissionCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TSecuserpermissionCB cb, EntityRowHandler<TSecuserpermission> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TSecuserpermission.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TSecuserpermissionCB)cb); }
    protected List<TSecuserpermission> delegateSelectList(TSecuserpermissionCB cb)
    { return invoke(createSelectListCBCommand(cb, TSecuserpermission.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TSecuserpermissionCB)cb); }

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
    protected TSecuserpermission downcast(Entity entity) {
        return helpDowncastInternally(entity, TSecuserpermission.class);
    }
}
