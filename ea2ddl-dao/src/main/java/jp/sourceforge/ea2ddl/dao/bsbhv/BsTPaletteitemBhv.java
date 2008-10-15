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
 * The behavior of t_paletteitem.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PaletteID, ItemID
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
public abstract class BsTPaletteitemBhv extends jp.sourceforge.ea2ddl.dao.allcommon.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPaletteitemDao _dao;

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_paletteitem"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The meta data of the database. (NotNull) */
    public DBMeta getDBMeta() { return TPaletteitemDbm.getInstance(); }

    /** @return The meta data of the database as my table type. (NotNull) */
    public TPaletteitemDbm getMyDBMeta() { return TPaletteitemDbm.getInstance(); }

    // ===================================================================================
    //                                                                        Dao Accessor
    //                                                                        ============
    public TPaletteitemDao getMyDao() { return _dao; }
    public void setMyDao(TPaletteitemDao dao) { assertObjectNotNull("dao", dao); _dao = dao; }
    public DaoReadable getDaoReadable() { return getMyDao(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TPaletteitem newMyEntity() { return new TPaletteitem(); }
    public TPaletteitemCB newMyConditionBean() { return new TPaletteitemCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of the condition-bean. {IgnorePagingCondition}
     * @param cb The condition-bean of TPaletteitem. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TPaletteitemCB cb) {
        assertConditionBeanNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TPaletteitem. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TPaletteitem selectEntity(final TPaletteitemCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TPaletteitem, TPaletteitemCB>() {
            public List<TPaletteitem> callbackSelectList(TPaletteitemCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TPaletteitem. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TPaletteitem selectEntityWithDeletedCheck(final TPaletteitemCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TPaletteitem, TPaletteitemCB>() {
            public List<TPaletteitem> callbackSelectList(TPaletteitemCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of TPaletteitem. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<TPaletteitem> selectList(TPaletteitemCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<TPaletteitem>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of TPaletteitem. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<TPaletteitem> selectPage(final TPaletteitemCB cb) {
        assertConditionBeanNotNull(cb);
        final PagingInvoker<TPaletteitem> invoker = new PagingInvoker<TPaletteitem>(getTableDbName());
        final PagingHandler<TPaletteitem> handler = new PagingHandler<TPaletteitem>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TPaletteitem> paging() { return selectList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of TPaletteitem. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     */
    public List<java.util.Map<String, Object>> selectValueLabelList(TPaletteitemCB cb, ValueLabelSetupper<TPaletteitem> valueLabelSetupper) {
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
    protected int delegateSelectCount(TPaletteitemCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectCount(cb); }
    protected List<TPaletteitem> delegateSelectList(TPaletteitemCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectList(cb); }

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
    protected TPaletteitem downcast(Entity entity) {
        return helpDowncastInternally(entity, TPaletteitem.class);
    }
}
