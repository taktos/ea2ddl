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
 * The behavior of t_operationparams that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     OperationID, Name, Type, Notes, Pos, Style, Kind, Classifier, ea_guid, StyleEx
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
 *     T_OPERATION
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     tOperation
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTOperationparamsBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_operationparams"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TOperationparamsDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TOperationparamsDbm getMyDBMeta() { return TOperationparamsDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TOperationparams newMyEntity() { return new TOperationparams(); }
    public TOperationparamsCB newMyConditionBean() { return new TOperationparamsCB(); }

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
     * @param cb The condition-bean of TOperationparams. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TOperationparamsCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TOperationparams. (NotNull)
     * @param entityRowHandler The handler of entity row of TOperationparams. (NotNull)
     */
    public void selectCursor(TOperationparamsCB cb, EntityRowHandler<TOperationparams> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TOperationparams>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TOperationparams. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TOperationparams selectEntity(final TOperationparamsCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TOperationparams, TOperationparamsCB>() {
            public List<TOperationparams> callbackSelectList(TOperationparamsCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TOperationparams. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TOperationparams selectEntityWithDeletedCheck(final TOperationparamsCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TOperationparams, TOperationparamsCB>() {
            public List<TOperationparams> callbackSelectList(TOperationparamsCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TOperationparams. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TOperationparams> selectList(TOperationparamsCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TOperationparams>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TOperationparams. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TOperationparams> selectPage(final TOperationparamsCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TOperationparams> invoker = new PagingInvoker<TOperationparams>(getTableDbName());
        final PagingHandler<TOperationparams> handler = new PagingHandler<TOperationparams>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TOperationparams> paging() { return selectList(cb); }
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
     * tOperationparamsBhv.scalarSelect(Date.class).max(new ScalarQuery(TOperationparamsCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TOperationparamsCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TOperationparamsCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TOperationparamsCB, RESULT>(cb, resultType);
    }
    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'TOperation'.
     * @param tOperationparamsList The list of tOperationparams. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<TOperation> pulloutTOperation(List<TOperationparams> tOperationparamsList) {
        return helpPulloutInternally(tOperationparamsList, new InternalPulloutCallback<TOperationparams, TOperation>() {
            public TOperation callbackGetForeignEntity(TOperationparams entity) { return entity.getTOperation(); } });
    }
    
    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCount(TOperationparamsCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TOperationparamsCB cb, EntityRowHandler<TOperationparams> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TOperationparams.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TOperationparamsCB)cb); }
    protected List<TOperationparams> delegateSelectList(TOperationparamsCB cb)
    { return invoke(createSelectListCBCommand(cb, TOperationparams.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TOperationparamsCB)cb); }

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
    protected TOperationparams downcast(Entity entity) {
        return helpDowncastInternally(entity, TOperationparams.class);
    }
}
