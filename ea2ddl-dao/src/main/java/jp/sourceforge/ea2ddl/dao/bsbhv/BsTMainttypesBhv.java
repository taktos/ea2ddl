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
 * The behavior of t_mainttypes.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MaintType, Description, NumericWeight, Notes
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
public abstract class BsTMainttypesBhv extends jp.sourceforge.ea2ddl.dao.allcommon.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TMainttypesDao _dao;

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_mainttypes"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The meta data of the database. (NotNull) */
    public DBMeta getDBMeta() { return TMainttypesDbm.getInstance(); }

    /** @return The meta data of the database as my table type. (NotNull) */
    public TMainttypesDbm getMyDBMeta() { return TMainttypesDbm.getInstance(); }

    // ===================================================================================
    //                                                                        Dao Accessor
    //                                                                        ============
    public TMainttypesDao getMyDao() { return _dao; }
    public void setMyDao(TMainttypesDao dao) { assertObjectNotNull("dao", dao); _dao = dao; }
    public DaoReadable getDaoReadable() { return getMyDao(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TMainttypes newMyEntity() { return new TMainttypes(); }
    public TMainttypesCB newMyConditionBean() { return new TMainttypesCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of the condition-bean. {IgnorePagingCondition}
     * @param cb The condition-bean of TMainttypes. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TMainttypesCB cb) {
        assertConditionBeanNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TMainttypes. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TMainttypes selectEntity(final TMainttypesCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TMainttypes, TMainttypesCB>() {
            public List<TMainttypes> callbackSelectList(TMainttypesCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TMainttypes. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TMainttypes selectEntityWithDeletedCheck(final TMainttypesCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TMainttypes, TMainttypesCB>() {
            public List<TMainttypes> callbackSelectList(TMainttypesCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TMainttypes. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TMainttypes> selectList(TMainttypesCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<TMainttypes>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TMainttypes. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TMainttypes> selectPage(final TMainttypesCB cb) {
        assertConditionBeanNotNull(cb);
        final PagingInvoker<TMainttypes> invoker = new PagingInvoker<TMainttypes>(getTableDbName());
        final PagingHandler<TMainttypes> handler = new PagingHandler<TMainttypes>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TMainttypes> paging() { return selectList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of TMainttypes. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     */
    public List<java.util.Map<String, Object>> selectValueLabelList(TMainttypesCB cb, ValueLabelSetupper<TMainttypes> valueLabelSetupper) {
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
    protected int delegateSelectCount(TMainttypesCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectCount(cb); }
    protected List<TMainttypes> delegateSelectList(TMainttypesCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectList(cb); }

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
    protected TMainttypes downcast(Entity entity) {
        return helpDowncastInternally(entity, TMainttypes.class);
    }
}
