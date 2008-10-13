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
 * The behavior of t_connector.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Connector_ID, Name, Direction, Notes, Connector_Type, SubType, SourceCard, SourceAccess, SourceElement, DestCard, DestAccess, DestElement, SourceRole, SourceRoleType, SourceRoleNote, SourceContainment, SourceIsAggregate, SourceIsOrdered, SourceQualifier, DestRole, DestRoleType, DestRoleNote, DestContainment, DestIsAggregate, DestIsOrdered, DestQualifier, Start_Object_ID, End_Object_ID, Top_Start_Label, Top_Mid_Label, Top_End_Label, Btm_Start_Label, Btm_Mid_Label, Btm_End_Label, Start_Edge, End_Edge, PtStartX, PtStartY, PtEndX, PtEndY, SeqNo, HeadStyle, LineStyle, RouteStyle, IsBold, LineColor, Stereotype, VirtualInheritance, LinkAccess, PDATA1, PDATA2, PDATA3, PDATA4, PDATA5, DiagramID, ea_guid, SourceConstraint, DestConstraint, SourceIsNavigable, DestIsNavigable, IsRoot, IsLeaf, IsSpec, SourceChangeable, DestChangeable, SourceTS, DestTS, StateFlags, ActionFlags, IsSignal, IsStimulus, DispatchAction, Target2, StyleEx, SourceStereotype, DestStereotype, SourceStyle, DestStyle, EventFlags
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
public abstract class BsTConnectorBhv extends jp.sourceforge.ea2ddl.dao.allcommon.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TConnectorDao _dao;

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "t_connector"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The meta data of the database. (NotNull) */
    public DBMeta getDBMeta() { return TConnectorDbm.getInstance(); }

    /** @return The meta data of the database as my table type. (NotNull) */
    public TConnectorDbm getMyDBMeta() { return TConnectorDbm.getInstance(); }

    // ===================================================================================
    //                                                                        Dao Accessor
    //                                                                        ============
    public TConnectorDao getMyDao() { return _dao; }
    public void setMyDao(TConnectorDao dao) { assertObjectNotNull("dao", dao); _dao = dao; }
    public DaoReadable getDaoReadable() { return getMyDao(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public TConnector newMyEntity() { return new TConnector(); }
    public TConnectorCB newMyConditionBean() { return new TConnectorCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of the condition-bean. {IgnorePagingCondition}
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The selected count.
     */
    public int selectCount(TConnectorCB cb) {
        assertConditionBeanNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TConnector selectEntity(final TConnectorCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<TConnector, TConnectorCB>() {
            public List<TConnector> callbackSelectList(TConnectorCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public TConnector selectEntityWithDeletedCheck(final TConnectorCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<TConnector, TConnectorCB>() {
            public List<TConnector> callbackSelectList(TConnectorCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result-bean.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The result-bean of selected list. (NotNull)
     */
    public ListResultBean<TConnector> selectList(TConnectorCB cb) {
        assertConditionBeanNotNull(cb);
        return new jp.sourceforge.ea2ddl.dao.allcommon.cbean.ResultBeanBuilder<TConnector>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result-bean.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @return The result-bean of selected page. (NotNull)
     */
    public PagingResultBean<TConnector> selectPage(final TConnectorCB cb) {
        assertConditionBeanNotNull(cb);
        final PagingInvoker<TConnector> invoker = new PagingInvoker<TConnector>(getTableDbName());
        final PagingHandler<TConnector> handler = new PagingHandler<TConnector>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<TConnector> paging() { return selectList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of TConnector. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     */
    public List<java.util.Map<String, Object>> selectValueLabelList(TConnectorCB cb, ValueLabelSetupper<TConnector> valueLabelSetupper) {
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
    protected int delegateSelectCount(TConnectorCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectCount(cb); }
    protected List<TConnector> delegateSelectList(TConnectorCB cb) { assertConditionBeanNotNull(cb); return getMyDao().selectList(cb); }

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
    protected TConnector downcast(Entity entity) {
        return helpDowncastInternally(entity, TConnector.class);
    }
}
