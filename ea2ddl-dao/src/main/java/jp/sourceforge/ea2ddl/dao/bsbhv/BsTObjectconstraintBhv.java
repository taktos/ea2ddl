package jp.sourceforge.ea2ddl.dao.bsbhv;


import java.util.List;

import jp.sourceforge.ea2ddl.dao.allcommon.*;
import jp.sourceforge.ea2ddl.dao.allcommon.bhv.setup.ValueLabelSetupper;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ListResultBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ResultBeanBuilder;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingInvoker;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingResultBean;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.exdao.*;
import jp.sourceforge.ea2ddl.dao.exentity.*;
import jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;


/**
 * The behavior of t_objectconstraint.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_ID, Constraint, ConstraintType, Weight, Notes, Status
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
public abstract class BsTObjectconstraintBhv extends jp.sourceforge.ea2ddl.dao.allcommon.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectconstraintDao _dao;

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_objectconstraint"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The meta data of the database. (NotNull) */
    public DBMeta getDBMeta() { return TObjectconstraintDbm.getInstance(); }

    /** @return The meta data of the database as my table type. (NotNull) */
    public TObjectconstraintDbm getMyDBMeta() { return TObjectconstraintDbm.getInstance(); }

    // ===================================================================================
    //                                                                        Dao Accessor
    //                                                                        ============
    public TObjectconstraintDao getMyDao() { return _dao; }
    public void setMyDao(TObjectconstraintDao dao) { assertObjectNotNull("dao", dao); _dao = dao; }
    public DaoReadable getDaoReadable() { return getMyDao(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TObjectconstraint newMyEntity() { return new TObjectconstraint(); }
    public TObjectconstraintCB newMyConditionBean() { return new TObjectconstraintCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of the condition-bean. {IgnorePagingCondition}
     * @param cb The condition-bean of TObjectconstraint. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TObjectconstraintCB cb) {
        assertConditionBeanNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TObjectconstraint. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TObjectconstraint selectEntity(final TObjectconstraintCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TObjectconstraint, TObjectconstraintCB>() {
            public List<TObjectconstraint> callbackSelectList(TObjectconstraintCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TObjectconstraint. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TObjectconstraint selectEntityWithDeletedCheck(final TObjectconstraintCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TObjectconstraint, TObjectconstraintCB>() {
            public List<TObjectconstraint> callbackSelectList(TObjectconstraintCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TObjectconstraint. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TObjectconstraint> selectList(TObjectconstraintCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<TObjectconstraint>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TObjectconstraint. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TObjectconstraint> selectPage(final TObjectconstraintCB cb) {
        assertConditionBeanNotNull(cb);
        final PagingInvoker<TObjectconstraint> invoker = new PagingInvoker<TObjectconstraint>(getTableDbName());
        final PagingHandler<TObjectconstraint> handler = new PagingHandler<TObjectconstraint>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TObjectconstraint> paging() { return selectList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of TObjectconstraint. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     */
    public List<java.util.Map<String, Object>> selectValueLabelList(TObjectconstraintCB cb, ValueLabelSetupper<TObjectconstraint> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }



    // ===================================================================================
    //                                                                     Pullout Foreign
    //                                                                     ===============
  
    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCount(TObjectconstraintCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectCount(cb); }
    protected List<TObjectconstraint> delegateSelectList(TObjectconstraintCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectList(cb); }

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
    protected TObjectconstraint downcast(Entity entity) {
        return helpDowncastInternally(entity, TObjectconstraint.class);
    }
}
