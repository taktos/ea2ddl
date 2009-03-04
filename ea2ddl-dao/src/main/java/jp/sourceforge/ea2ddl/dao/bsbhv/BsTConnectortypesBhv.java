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
 * The behavior of t_connectortypes that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Connector_Type, Description
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
public abstract class BsTConnectortypesBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_connectortypes"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TConnectortypesDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TConnectortypesDbm getMyDBMeta() { return TConnectortypesDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TConnectortypes newMyEntity() { return new TConnectortypes(); }
    public TConnectortypesCB newMyConditionBean() { return new TConnectortypesCB(); }

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
     * @param cb The condition-bean of TConnectortypes. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TConnectortypesCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TConnectortypes. (NotNull)
     * @param entityRowHandler The handler of entity row of TConnectortypes. (NotNull)
     */
    public void selectCursor(TConnectortypesCB cb, EntityRowHandler<TConnectortypes> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TConnectortypes>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TConnectortypes. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TConnectortypes selectEntity(final TConnectortypesCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TConnectortypes, TConnectortypesCB>() {
            public List<TConnectortypes> callbackSelectList(TConnectortypesCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TConnectortypes. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TConnectortypes selectEntityWithDeletedCheck(final TConnectortypesCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TConnectortypes, TConnectortypesCB>() {
            public List<TConnectortypes> callbackSelectList(TConnectortypesCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TConnectortypes. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TConnectortypes> selectList(TConnectortypesCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TConnectortypes>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TConnectortypes. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TConnectortypes> selectPage(final TConnectortypesCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TConnectortypes> invoker = new PagingInvoker<TConnectortypes>(getTableDbName());
        final PagingHandler<TConnectortypes> handler = new PagingHandler<TConnectortypes>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TConnectortypes> paging() { return selectList(cb); }
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
     * tConnectortypesBhv.scalarSelect(Date.class).max(new ScalarQuery(TConnectortypesCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TConnectortypesCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TConnectortypesCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TConnectortypesCB, RESULT>(cb, resultType);
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
    protected int delegateSelectCount(TConnectortypesCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TConnectortypesCB cb, EntityRowHandler<TConnectortypes> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TConnectortypes.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TConnectortypesCB)cb); }
    protected List<TConnectortypes> delegateSelectList(TConnectortypesCB cb)
    { return invoke(createSelectListCBCommand(cb, TConnectortypes.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TConnectortypesCB)cb); }

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
    protected TConnectortypes downcast(Entity entity) {
        return helpDowncastInternally(entity, TConnectortypes.class);
    }
}
