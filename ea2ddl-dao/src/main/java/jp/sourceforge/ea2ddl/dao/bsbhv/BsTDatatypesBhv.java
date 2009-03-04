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
 * The behavior of t_datatypes that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Type, ProductName, DataType, Size, MaxLen, MaxPrec, MaxScale, DefaultLen, DefaultPrec, DefaultScale, User, PDATA1, PDATA2, PDATA3, PDATA4, HasLength, GenericType, DatatypeID
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
public abstract class BsTDatatypesBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_datatypes"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TDatatypesDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TDatatypesDbm getMyDBMeta() { return TDatatypesDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TDatatypes newMyEntity() { return new TDatatypes(); }
    public TDatatypesCB newMyConditionBean() { return new TDatatypesCB(); }

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
     * @param cb The condition-bean of TDatatypes. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TDatatypesCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TDatatypes. (NotNull)
     * @param entityRowHandler The handler of entity row of TDatatypes. (NotNull)
     */
    public void selectCursor(TDatatypesCB cb, EntityRowHandler<TDatatypes> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TDatatypes>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TDatatypes. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TDatatypes selectEntity(final TDatatypesCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TDatatypes, TDatatypesCB>() {
            public List<TDatatypes> callbackSelectList(TDatatypesCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TDatatypes. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TDatatypes selectEntityWithDeletedCheck(final TDatatypesCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TDatatypes, TDatatypesCB>() {
            public List<TDatatypes> callbackSelectList(TDatatypesCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TDatatypes. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TDatatypes> selectList(TDatatypesCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TDatatypes>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TDatatypes. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TDatatypes> selectPage(final TDatatypesCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TDatatypes> invoker = new PagingInvoker<TDatatypes>(getTableDbName());
        final PagingHandler<TDatatypes> handler = new PagingHandler<TDatatypes>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TDatatypes> paging() { return selectList(cb); }
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
     * tDatatypesBhv.scalarSelect(Date.class).max(new ScalarQuery(TDatatypesCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TDatatypesCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TDatatypesCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TDatatypesCB, RESULT>(cb, resultType);
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
    protected int delegateSelectCount(TDatatypesCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TDatatypesCB cb, EntityRowHandler<TDatatypes> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TDatatypes.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TDatatypesCB)cb); }
    protected List<TDatatypes> delegateSelectList(TDatatypesCB cb)
    { return invoke(createSelectListCBCommand(cb, TDatatypes.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TDatatypesCB)cb); }

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
    protected TDatatypes downcast(Entity entity) {
        return helpDowncastInternally(entity, TDatatypes.class);
    }
}
