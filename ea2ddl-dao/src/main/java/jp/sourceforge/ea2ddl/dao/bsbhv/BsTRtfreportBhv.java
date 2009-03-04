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
 * The behavior of t_rtfreport that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     TemplateID, RootPackage, Filename, Details, ProcessChildren, ShowDiagrams, Heading, Requirements, Associations, Scenarios, ChildDiagrams, Attributes, Methods, ImageType, Paging, Intro, Resources, Constraints, Tagged, ShowTag, ShowAlias, PDATA1, PDATA2, PDATA3, PDATA4
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
public abstract class BsTRtfreportBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_rtfreport"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TRtfreportDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TRtfreportDbm getMyDBMeta() { return TRtfreportDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TRtfreport newMyEntity() { return new TRtfreport(); }
    public TRtfreportCB newMyConditionBean() { return new TRtfreportCB(); }

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
     * @param cb The condition-bean of TRtfreport. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TRtfreportCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TRtfreport. (NotNull)
     * @param entityRowHandler The handler of entity row of TRtfreport. (NotNull)
     */
    public void selectCursor(TRtfreportCB cb, EntityRowHandler<TRtfreport> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TRtfreport>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TRtfreport. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TRtfreport selectEntity(final TRtfreportCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TRtfreport, TRtfreportCB>() {
            public List<TRtfreport> callbackSelectList(TRtfreportCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TRtfreport. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TRtfreport selectEntityWithDeletedCheck(final TRtfreportCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TRtfreport, TRtfreportCB>() {
            public List<TRtfreport> callbackSelectList(TRtfreportCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TRtfreport. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TRtfreport> selectList(TRtfreportCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TRtfreport>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TRtfreport. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TRtfreport> selectPage(final TRtfreportCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TRtfreport> invoker = new PagingInvoker<TRtfreport>(getTableDbName());
        final PagingHandler<TRtfreport> handler = new PagingHandler<TRtfreport>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TRtfreport> paging() { return selectList(cb); }
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
     * tRtfreportBhv.scalarSelect(Date.class).max(new ScalarQuery(TRtfreportCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TRtfreportCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TRtfreportCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TRtfreportCB, RESULT>(cb, resultType);
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
    protected int delegateSelectCount(TRtfreportCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TRtfreportCB cb, EntityRowHandler<TRtfreport> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TRtfreport.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TRtfreportCB)cb); }
    protected List<TRtfreport> delegateSelectList(TRtfreportCB cb)
    { return invoke(createSelectListCBCommand(cb, TRtfreport.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TRtfreportCB)cb); }

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
    protected TRtfreport downcast(Entity entity) {
        return helpDowncastInternally(entity, TRtfreport.class);
    }
}
