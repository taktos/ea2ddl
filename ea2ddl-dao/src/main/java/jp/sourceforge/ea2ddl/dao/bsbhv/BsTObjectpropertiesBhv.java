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
 * The behavior of t_objectproperties that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PropertyID, Object_ID, Property, Value, Notes, ea_guid
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
 *     t_object
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     tObject
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTObjectpropertiesBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_objectproperties"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TObjectpropertiesDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TObjectpropertiesDbm getMyDBMeta() { return TObjectpropertiesDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TObjectproperties newMyEntity() { return new TObjectproperties(); }
    public TObjectpropertiesCB newMyConditionBean() { return new TObjectpropertiesCB(); }

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
     * @param cb The condition-bean of TObjectproperties. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TObjectpropertiesCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TObjectproperties. (NotNull)
     * @param entityRowHandler The handler of entity row of TObjectproperties. (NotNull)
     */
    public void selectCursor(TObjectpropertiesCB cb, EntityRowHandler<TObjectproperties> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TObjectproperties>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TObjectproperties. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TObjectproperties selectEntity(final TObjectpropertiesCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TObjectproperties, TObjectpropertiesCB>() {
            public List<TObjectproperties> callbackSelectList(TObjectpropertiesCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TObjectproperties. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TObjectproperties selectEntityWithDeletedCheck(final TObjectpropertiesCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TObjectproperties, TObjectpropertiesCB>() {
            public List<TObjectproperties> callbackSelectList(TObjectpropertiesCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TObjectproperties. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TObjectproperties> selectList(TObjectpropertiesCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TObjectproperties>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TObjectproperties. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TObjectproperties> selectPage(final TObjectpropertiesCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TObjectproperties> invoker = new PagingInvoker<TObjectproperties>(getTableDbName());
        final PagingHandler<TObjectproperties> handler = new PagingHandler<TObjectproperties>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TObjectproperties> paging() { return selectList(cb); }
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
     * tObjectpropertiesBhv.scalarSelect(Date.class).max(new ScalarQuery(TObjectpropertiesCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TObjectpropertiesCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TObjectpropertiesCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TObjectpropertiesCB, RESULT>(cb, resultType);
    }
    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'TObject'.
     * @param tObjectpropertiesList The list of tObjectproperties. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<TObject> pulloutTObject(List<TObjectproperties> tObjectpropertiesList) {
        return helpPulloutInternally(tObjectpropertiesList, new InternalPulloutCallback<TObjectproperties, TObject>() {
            public TObject callbackGetForeignEntity(TObjectproperties entity) { return entity.getTObject(); } });
    }
    
    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCount(TObjectpropertiesCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TObjectpropertiesCB cb, EntityRowHandler<TObjectproperties> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TObjectproperties.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TObjectpropertiesCB)cb); }
    protected List<TObjectproperties> delegateSelectList(TObjectpropertiesCB cb)
    { return invoke(createSelectListCBCommand(cb, TObjectproperties.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TObjectpropertiesCB)cb); }

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
    protected TObjectproperties downcast(Entity entity) {
        return helpDowncastInternally(entity, TObjectproperties.class);
    }
}
