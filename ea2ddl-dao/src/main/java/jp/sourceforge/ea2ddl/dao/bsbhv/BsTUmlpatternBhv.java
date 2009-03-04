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
 * The behavior of t_umlpattern that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PatternID, PatternCategory, PatternName, Style, Notes, PatternXML, Version
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
public abstract class BsTUmlpatternBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_umlpattern"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TUmlpatternDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TUmlpatternDbm getMyDBMeta() { return TUmlpatternDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TUmlpattern newMyEntity() { return new TUmlpattern(); }
    public TUmlpatternCB newMyConditionBean() { return new TUmlpatternCB(); }

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
     * @param cb The condition-bean of TUmlpattern. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TUmlpatternCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TUmlpattern. (NotNull)
     * @param entityRowHandler The handler of entity row of TUmlpattern. (NotNull)
     */
    public void selectCursor(TUmlpatternCB cb, EntityRowHandler<TUmlpattern> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TUmlpattern>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TUmlpattern. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TUmlpattern selectEntity(final TUmlpatternCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TUmlpattern, TUmlpatternCB>() {
            public List<TUmlpattern> callbackSelectList(TUmlpatternCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TUmlpattern. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TUmlpattern selectEntityWithDeletedCheck(final TUmlpatternCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TUmlpattern, TUmlpatternCB>() {
            public List<TUmlpattern> callbackSelectList(TUmlpatternCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TUmlpattern. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TUmlpattern> selectList(TUmlpatternCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TUmlpattern>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TUmlpattern. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TUmlpattern> selectPage(final TUmlpatternCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TUmlpattern> invoker = new PagingInvoker<TUmlpattern>(getTableDbName());
        final PagingHandler<TUmlpattern> handler = new PagingHandler<TUmlpattern>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TUmlpattern> paging() { return selectList(cb); }
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
     * tUmlpatternBhv.scalarSelect(Date.class).max(new ScalarQuery(TUmlpatternCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TUmlpatternCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TUmlpatternCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TUmlpatternCB, RESULT>(cb, resultType);
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
    protected int delegateSelectCount(TUmlpatternCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TUmlpatternCB cb, EntityRowHandler<TUmlpattern> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TUmlpattern.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TUmlpatternCB)cb); }
    protected List<TUmlpattern> delegateSelectList(TUmlpatternCB cb)
    { return invoke(createSelectListCBCommand(cb, TUmlpattern.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TUmlpatternCB)cb); }

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
    protected TUmlpattern downcast(Entity entity) {
        return helpDowncastInternally(entity, TUmlpattern.class);
    }
}
