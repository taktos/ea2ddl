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
 * The behavior of t_diagram that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Diagram_ID, Package_ID, ParentID, Diagram_Type, Name, Version, Author, ShowDetails, Notes, Stereotype, AttPub, AttPri, AttPro, Orientation, cx, cy, Scale, CreatedDate, ModifiedDate, HTMLPath, ShowForeign, ShowBorder, ShowPackageContents, PDATA, Locked, ea_guid, TPos, Swimlanes, StyleEx
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
public abstract class BsTDiagramBhv extends org.seasar.dbflute.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_diagram"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return TDiagramDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TDiagramDbm getMyDBMeta() { return TDiagramDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TDiagram newMyEntity() { return new TDiagram(); }
    public TDiagramCB newMyConditionBean() { return new TDiagramCB(); }

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
     * @param cb The condition-bean of TDiagram. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TDiagramCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }
    
    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean. <br />
     * Attention: It has a mapping cost from result set to entity.
     * @param cb The condition-bean of TDiagram. (NotNull)
     * @param entityRowHandler The handler of entity row of TDiagram. (NotNull)
     */
    public void selectCursor(TDiagramCB cb, EntityRowHandler<TDiagram> entityRowHandler) {
        assertCBNotNull(cb); assertObjectNotNull("entityRowHandler<TDiagram>", entityRowHandler);
        delegateSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TDiagram. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TDiagram selectEntity(final TDiagramCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TDiagram, TDiagramCB>() {
            public List<TDiagram> callbackSelectList(TDiagramCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TDiagram. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TDiagram selectEntityWithDeletedCheck(final TDiagramCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TDiagram, TDiagramCB>() {
            public List<TDiagram> callbackSelectList(TDiagramCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TDiagram. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TDiagram> selectList(TDiagramCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<TDiagram>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TDiagram. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TDiagram> selectPage(final TDiagramCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<TDiagram> invoker = new PagingInvoker<TDiagram>(getTableDbName());
        final PagingHandler<TDiagram> handler = new PagingHandler<TDiagram>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TDiagram> paging() { return selectList(cb); }
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
     * tDiagramBhv.scalarSelect(Date.class).max(new ScalarQuery(TDiagramCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<TDiagramCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        TDiagramCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<TDiagramCB, RESULT>(cb, resultType);
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
    protected int delegateSelectCount(TDiagramCB cb) { return invoke(createSelectCountCBCommand(cb)); }
    protected void delegateSelectCursor(TDiagramCB cb, EntityRowHandler<TDiagram> entityRowHandler)
    { invoke(createSelectCursorCBCommand(cb, entityRowHandler, TDiagram.class)); }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((TDiagramCB)cb); }
    protected List<TDiagram> delegateSelectList(TDiagramCB cb)
    { return invoke(createSelectListCBCommand(cb, TDiagram.class)); }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((TDiagramCB)cb); }

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
    protected TDiagram downcast(Entity entity) {
        return helpDowncastInternally(entity, TDiagram.class);
    }
}
