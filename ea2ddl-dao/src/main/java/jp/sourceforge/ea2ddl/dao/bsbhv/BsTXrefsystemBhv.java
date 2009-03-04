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
 * The behavior of t_xrefsystem that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     XrefID, ToolID, Name, Type, Visibility, Namespace, Requirement, Constraint, Behavior, Partition, Description, Client, Supplier, Link
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
public abstract class BsTXrefsystemBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_xrefsystem"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TXrefsystemDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TXrefsystemDbm getMyDBMeta() { return TXrefsystemDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TXrefsystem newMyEntity() { return new TXrefsystem(); }
    public TXrefsystemCB newMyConditionBean() { return new TXrefsystemCB(); }

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
     * @param cb The condition-bean of TXrefsystem. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TXrefsystemCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TXrefsystem. (NotNull)
     * @param entityRowHandler The handler of entity row of TXrefsystem. (NotNull)
     */
    public void selectCursor(TXrefsystemCB cb, EntityRowHandler<TXrefsystem> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TXrefsystem>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TXrefsystem. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TXrefsystem selectEntity(final TXrefsystemCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TXrefsystem, TXrefsystemCB>() {
            public List<TXrefsystem> callbackSelectList(TXrefsystemCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TXrefsystem. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TXrefsystem selectEntityWithDeletedCheck(final TXrefsystemCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TXrefsystem, TXrefsystemCB>() {
            public List<TXrefsystem> callbackSelectList(TXrefsystemCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TXrefsystem. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TXrefsystem> selectList(TXrefsystemCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TXrefsystem>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TXrefsystem. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TXrefsystem> selectPage(final TXrefsystemCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TXrefsystem> invoker = new PagingInvoker<TXrefsystem>(getTableDbName());
        final PagingHandler<TXrefsystem> handler = new PagingHandler<TXrefsystem>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TXrefsystem> paging() { return selectList(cb); }
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
     * tXrefsystemBhv.scalarSelect(Date.class).max(new ScalarQuery(TXrefsystemCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TXrefsystemCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TXrefsystemCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TXrefsystemCB, RESULT>(cb, resultType);
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
    protected int delegateSelectCount(TXrefsystemCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TXrefsystemCB cb, EntityRowHandler<TXrefsystem> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TXrefsystem.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TXrefsystemCB)cb); }
    protected List<TXrefsystem> delegateSelectList(TXrefsystemCB cb)
    { return invoke(createSelectListCBCommand(cb, TXrefsystem.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TXrefsystemCB)cb); }

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
    protected TXrefsystem downcast(Entity entity) {
        return helpDowncastInternally(entity, TXrefsystem.class);
    }
}
