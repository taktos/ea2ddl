package jp.sourceforge.ea2ddl.dao.bsbhv;


import java.util.List;

import jp.sourceforge.ea2ddl.dao.allcommon.*;
import jp.sourceforge.ea2ddl.dao.allcommon.bhv.setup.ValueLabelSetupper;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ListResultBean;
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
 * The behavior of t_rtf.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Type, Template
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
public abstract class BsTRtfBhv extends jp.sourceforge.ea2ddl.dao.allcommon.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TRtfDao _dao;

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_rtf"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The meta data of the database. (NotNull) */
    public DBMeta getDBMeta() { return TRtfDbm.getInstance(); }

    /** @return The meta data of the database as my table type. (NotNull) */
    public TRtfDbm getMyDBMeta() { return TRtfDbm.getInstance(); }

    // ===================================================================================
    //                                                                        Dao Accessor
    //                                                                        ============
    public TRtfDao getMyDao() { return _dao; }
    public void setMyDao(TRtfDao dao) { assertObjectNotNull("dao", dao); _dao = dao; }
    public DaoReadable getDaoReadable() { return getMyDao(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TRtf newMyEntity() { return new TRtf(); }
    public TRtfCB newMyConditionBean() { return new TRtfCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of the condition-bean. {IgnorePagingCondition}
     * @param cb The condition-bean of TRtf. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TRtfCB cb) {
        assertConditionBeanNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TRtf. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TRtf selectEntity(final TRtfCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TRtf, TRtfCB>() {
            public List<TRtf> callbackSelectList(TRtfCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TRtf. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TRtf selectEntityWithDeletedCheck(final TRtfCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TRtf, TRtfCB>() {
            public List<TRtf> callbackSelectList(TRtfCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result-bean.
     * @param cb The condition-bean of TRtf. (NotNull)
     * @return The result-bean of selected list. (NotNull)
     */
    public ListResultBean<TRtf> selectList(TRtfCB cb) {
        assertConditionBeanNotNull(cb);
        return new jp.sourceforge.ea2ddl.dao.allcommon.cbean.ResultBeanBuilder<TRtf>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result-bean.
     * @param cb The condition-bean of TRtf. (NotNull)
     * @return The result-bean of selected page. (NotNull)
     */
    public PagingResultBean<TRtf> selectPage(final TRtfCB cb) {
        assertConditionBeanNotNull(cb);
        final PagingInvoker<TRtf> invoker = new PagingInvoker<TRtf>(getTableDbName());
        final PagingHandler<TRtf> handler = new PagingHandler<TRtf>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TRtf> paging() { return selectList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of TRtf. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     */
    public List<java.util.Map<String, Object>> selectValueLabelList(TRtfCB cb, ValueLabelSetupper<TRtf> valueLabelSetupper) {
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
    protected int delegateSelectCount(TRtfCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectCount(cb); }
    protected List<TRtf> delegateSelectList(TRtfCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectList(cb); }

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
    protected TRtf downcast(Entity entity) {
        return helpDowncastInternally(entity, TRtf.class);
    }
}
