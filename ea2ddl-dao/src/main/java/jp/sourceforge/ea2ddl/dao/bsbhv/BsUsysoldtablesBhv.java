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
 * The behavior of usysOldTables that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     TableName, NewName, RelOrder, FixCode
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
public abstract class BsUsysoldtablesBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "usysOldTables"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return UsysoldtablesDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public UsysoldtablesDbm getMyDBMeta() { return UsysoldtablesDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public Usysoldtables newMyEntity() { return new Usysoldtables(); }
    public UsysoldtablesCB newMyConditionBean() { return new UsysoldtablesCB(); }

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
     * @param cb The condition-bean of Usysoldtables. (NotNull)
     * @return The selected count.
     */
    public int selectCount(UsysoldtablesCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of Usysoldtables. (NotNull)
     * @param entityRowHandler The handler of entity row of Usysoldtables. (NotNull)
     */
    public void selectCursor(UsysoldtablesCB cb, EntityRowHandler<Usysoldtables> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<Usysoldtables>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of Usysoldtables. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public Usysoldtables selectEntity(final UsysoldtablesCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<Usysoldtables, UsysoldtablesCB>() {
            public List<Usysoldtables> callbackSelectList(UsysoldtablesCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of Usysoldtables. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public Usysoldtables selectEntityWithDeletedCheck(final UsysoldtablesCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<Usysoldtables, UsysoldtablesCB>() {
            public List<Usysoldtables> callbackSelectList(UsysoldtablesCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of Usysoldtables. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<Usysoldtables> selectList(UsysoldtablesCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<Usysoldtables>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of Usysoldtables. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<Usysoldtables> selectPage(final UsysoldtablesCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<Usysoldtables> invoker = new PagingInvoker<Usysoldtables>(getTableDbName());
        final PagingHandler<Usysoldtables> handler = new PagingHandler<Usysoldtables>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<Usysoldtables> paging() { return selectList(cb); }
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
     * usysoldtablesBhv.scalarSelect(Date.class).max(new ScalarQuery(UsysoldtablesCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<UsysoldtablesCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        UsysoldtablesCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<UsysoldtablesCB, RESULT>(cb, resultType);
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
    protected int delegateSelectCount(UsysoldtablesCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(UsysoldtablesCB cb, EntityRowHandler<Usysoldtables> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, Usysoldtables.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((UsysoldtablesCB)cb); }
    protected List<Usysoldtables> delegateSelectList(UsysoldtablesCB cb)
    { return invoke(createSelectListCBCommand(cb, Usysoldtables.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((UsysoldtablesCB)cb); }

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
    protected Usysoldtables downcast(Entity entity) {
        return helpDowncastInternally(entity, Usysoldtables.class);
    }
}
