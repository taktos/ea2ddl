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
 * The behavior of t_connectorconstraint that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     ConnectorID, Constraint, ConstraintType, Notes
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
public abstract class BsTConnectorconstraintBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_connectorconstraint"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TConnectorconstraintDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TConnectorconstraintDbm getMyDBMeta() { return TConnectorconstraintDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TConnectorconstraint newMyEntity() { return new TConnectorconstraint(); }
    public TConnectorconstraintCB newMyConditionBean() { return new TConnectorconstraintCB(); }

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
     * @param cb The condition-bean of TConnectorconstraint. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TConnectorconstraintCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TConnectorconstraint. (NotNull)
     * @param entityRowHandler The handler of entity row of TConnectorconstraint. (NotNull)
     */
    public void selectCursor(TConnectorconstraintCB cb, EntityRowHandler<TConnectorconstraint> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TConnectorconstraint>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TConnectorconstraint. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TConnectorconstraint selectEntity(final TConnectorconstraintCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TConnectorconstraint, TConnectorconstraintCB>() {
            public List<TConnectorconstraint> callbackSelectList(TConnectorconstraintCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TConnectorconstraint. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TConnectorconstraint selectEntityWithDeletedCheck(final TConnectorconstraintCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TConnectorconstraint, TConnectorconstraintCB>() {
            public List<TConnectorconstraint> callbackSelectList(TConnectorconstraintCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TConnectorconstraint. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TConnectorconstraint> selectList(TConnectorconstraintCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TConnectorconstraint>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TConnectorconstraint. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TConnectorconstraint> selectPage(final TConnectorconstraintCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TConnectorconstraint> invoker = new PagingInvoker<TConnectorconstraint>(getTableDbName());
        final PagingHandler<TConnectorconstraint> handler = new PagingHandler<TConnectorconstraint>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TConnectorconstraint> paging() { return selectList(cb); }
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
     * tConnectorconstraintBhv.scalarSelect(Date.class).max(new ScalarQuery(TConnectorconstraintCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TConnectorconstraintCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TConnectorconstraintCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TConnectorconstraintCB, RESULT>(cb, resultType);
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
    protected int delegateSelectCount(TConnectorconstraintCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TConnectorconstraintCB cb, EntityRowHandler<TConnectorconstraint> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TConnectorconstraint.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TConnectorconstraintCB)cb); }
    protected List<TConnectorconstraint> delegateSelectList(TConnectorconstraintCB cb)
    { return invoke(createSelectListCBCommand(cb, TConnectorconstraint.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TConnectorconstraintCB)cb); }

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
    protected TConnectorconstraint downcast(Entity entity) {
        return helpDowncastInternally(entity, TConnectorconstraint.class);
    }
}
