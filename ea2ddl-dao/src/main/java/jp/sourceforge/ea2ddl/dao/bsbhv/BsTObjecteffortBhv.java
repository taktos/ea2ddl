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
 * The behavior of t_objecteffort that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_ID, Effort, EffortType, EValue, Notes
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
public abstract class BsTObjecteffortBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_objecteffort"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TObjecteffortDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TObjecteffortDbm getMyDBMeta() { return TObjecteffortDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TObjecteffort newMyEntity() { return new TObjecteffort(); }
    public TObjecteffortCB newMyConditionBean() { return new TObjecteffortCB(); }

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
     * @param cb The condition-bean of TObjecteffort. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TObjecteffortCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TObjecteffort. (NotNull)
     * @param entityRowHandler The handler of entity row of TObjecteffort. (NotNull)
     */
    public void selectCursor(TObjecteffortCB cb, EntityRowHandler<TObjecteffort> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TObjecteffort>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TObjecteffort. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TObjecteffort selectEntity(final TObjecteffortCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TObjecteffort, TObjecteffortCB>() {
            public List<TObjecteffort> callbackSelectList(TObjecteffortCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TObjecteffort. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TObjecteffort selectEntityWithDeletedCheck(final TObjecteffortCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TObjecteffort, TObjecteffortCB>() {
            public List<TObjecteffort> callbackSelectList(TObjecteffortCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TObjecteffort. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TObjecteffort> selectList(TObjecteffortCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TObjecteffort>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TObjecteffort. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TObjecteffort> selectPage(final TObjecteffortCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TObjecteffort> invoker = new PagingInvoker<TObjecteffort>(getTableDbName());
        final PagingHandler<TObjecteffort> handler = new PagingHandler<TObjecteffort>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TObjecteffort> paging() { return selectList(cb); }
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
     * tObjecteffortBhv.scalarSelect(Date.class).max(new ScalarQuery(TObjecteffortCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TObjecteffortCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TObjecteffortCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TObjecteffortCB, RESULT>(cb, resultType);
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
    protected int delegateSelectCount(TObjecteffortCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TObjecteffortCB cb, EntityRowHandler<TObjecteffort> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TObjecteffort.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TObjecteffortCB)cb); }
    protected List<TObjecteffort> delegateSelectList(TObjecteffortCB cb)
    { return invoke(createSelectListCBCommand(cb, TObjecteffort.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TObjecteffortCB)cb); }

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
    protected TObjecteffort downcast(Entity entity) {
        return helpDowncastInternally(entity, TObjecteffort.class);
    }
}
