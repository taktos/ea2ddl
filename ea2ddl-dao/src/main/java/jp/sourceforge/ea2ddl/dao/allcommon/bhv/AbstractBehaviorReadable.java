package jp.sourceforge.ea2ddl.dao.allcommon.bhv;


import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.LinkedHashSet;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

import jp.sourceforge.ea2ddl.dao.allcommon.BehaviorSelector;
import jp.sourceforge.ea2ddl.dao.allcommon.DaoSelector;
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.bhv.setup.ValueLabelSetupper;
import jp.sourceforge.ea2ddl.dao.allcommon.bhv.setup.ValueLabelBox;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBeanContext;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ListResultBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingInvoker;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingResultBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.OutsideSqlDao;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.executor.OutsideSqlBasicExecutor;
import jp.sourceforge.ea2ddl.dao.allcommon.bhv.batch.TokenFileOutputOption;
import jp.sourceforge.ea2ddl.dao.allcommon.bhv.batch.TokenFileOutputResult;
import jp.sourceforge.ea2ddl.dao.allcommon.bhv.load.LoadReferrerOption;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.ColumnInfo;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.token.file.FileMakingOption;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.token.file.FileMakingHeaderInfo;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.token.file.FileMakingSimpleFacade;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.token.file.impl.FileMakingSimpleFacadeImpl;
import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleSystemUtil;

/**
 * The abstract class of behavior-readable.
 * 
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBehaviorReadable implements BehaviorReadable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Behavior-selector instance. It's basically referred at loadReferrer. (Required for loadReferrer) */
    protected BehaviorSelector _behaviorSelector;

    /** Dao-selector instance. It's basically referred at loadReferrer. (Required for OutsideSql) */
    protected DaoSelector _daoSelector;

    // =====================================================================================
    //                                                                         Basic Get All
    //                                                                         =============
    /**
     * Get count all.
     * @return Count all.
     */
    public int getCountAll() {
        return callGetCountAll();
    }

    // =====================================================================================
    //                                                                            Count Read
    //                                                                            ==========
    /**
     * The implementation.
     * @param cb Condition-bean. This condition-bean should not be set up about fetch-scope. (NotNull)
     * @return Read count. (NotNull)
     */
    public int readCount(ConditionBean cb) {
        assertConditionBeanNotNull(cb);
        return callReadCount(cb);
    }

    // =====================================================================================
    //                                                                           Entity Read 
    //                                                                           ===========
    /**
     * The implementation.
     * @param cb Condition-bean. (NotNull)
     * @return Read entity. (Nullalble)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public Entity readEntity(ConditionBean cb) {
        assertConditionBeanNotNull(cb);
        final List<Entity> ls = readList(cb);
        if (ls.isEmpty()) {
            return null;
        }
        assertEntitySelectedAsOne(ls, cb);
        return (Entity)ls.get(0);
    }

    /**
     * The implementation.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Read entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public Entity readEntityWithDeletedCheck(ConditionBean cb) {
        assertConditionBeanNotNull(cb);
        final List<Entity> ls = readList(cb);
        assertEntityNotDeleted(ls, cb);
        assertEntitySelectedAsOne(ls, cb);
        return (Entity)ls.get(0);
    }

    // =====================================================================================
    //                                                           Entity Read Internal Helper
    //                                                           ===========================
    protected <ENTITY extends Entity, CB extends ConditionBean>
            ENTITY helpSelectEntityInternally(CB cb, InternalSelectEntityCallback<ENTITY, CB> callback) {
        assertConditionBeanNotNull(cb);
        cb.checkSafetyResult(1);
        List<ENTITY> ls = null;
        try {
            ls = callback.callbackSelectList(cb);
        } catch (jp.sourceforge.ea2ddl.dao.allcommon.exception.DangerousResultSizeException e) {
            throwEntityDuplicatedException("{Over safetyMaxResultSize '1'}", cb, e);
        }
        if (ls.isEmpty()) {
            return null;
        }
        assertEntitySelectedAsOne(ls, cb);
        return (ENTITY)ls.get(0);
    }

    protected static interface InternalSelectEntityCallback<ENTITY extends Entity, CB extends ConditionBean> {
        public List<ENTITY> callbackSelectList(CB cb);
    }

    protected <ENTITY extends Entity, CB extends ConditionBean>
            ENTITY helpSelectEntityWithDeletedCheckInternally(CB cb, InternalSelectEntityWithDeletedCheckCallback<ENTITY, CB> callback) {
        assertConditionBeanNotNull(cb);
        cb.checkSafetyResult(1);
        List<ENTITY> ls = null;
        try {
            ls = callback.callbackSelectList(cb);
        } catch (jp.sourceforge.ea2ddl.dao.allcommon.exception.DangerousResultSizeException e) {
            throwEntityDuplicatedException("{Over safetyMaxResultSize '1'}", cb, e);
        }
        assertEntityNotDeleted(ls, cb);
        assertEntitySelectedAsOne(ls, cb);
        return (ENTITY)ls.get(0);
    }

    protected static interface InternalSelectEntityWithDeletedCheckCallback<ENTITY extends Entity, CB extends ConditionBean> {
        public List<ENTITY> callbackSelectList(CB cb);
    }

    // =====================================================================================
    //                                                                             List Read
    //                                                                             =========
    /**
     * The implementation.
     * @param cb Condition-bean.
     * @return List-result-bean. If the select result is zero, it returns empty list. (NotNull)
     */
    public ListResultBean<Entity> readList(ConditionBean cb) {
        assertConditionBeanNotNull(cb);
        return new jp.sourceforge.ea2ddl.dao.allcommon.cbean.ResultBeanBuilder<Entity>(getTableDbName()).buildListResultBean(cb, callReadList(cb));
    }

    /**
     * The implementation.
     * @param cb Condition-bean. (NotNull)
     * @return Read page. (NotNull)
     */
    public PagingResultBean<Entity> readPage(final ConditionBean cb) {
        assertConditionBeanNotNull(cb);
        final PagingInvoker<Entity> invoker = new PagingInvoker<Entity>(getTableDbName());
        final PagingHandler<Entity> handler = new PagingHandler<Entity>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return readCount(cb); }
            public List<Entity> paging() { return readList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    /**
     * Assert that the entity is not deleted.
     * @param entity Selected entity. (Nullable)
     * @param searchKey4Log Search-key for Logging.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    protected void assertEntityNotDeleted(jp.sourceforge.ea2ddl.dao.allcommon.Entity entity, Object searchKey4Log) {
        if (entity == null) {
            throwEntityAlreadyDeletedException(searchKey4Log);
        }
    }

    /**
     * Assert that the entity is not deleted.
     * @param ls Selected list. (Nullable)
     * @param searchKey4Log Search-key for Logging. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException
     */
    protected void assertEntityNotDeleted(List ls, Object searchKey4Log) {
        if (ls == null || ls.isEmpty()) {
            throwEntityAlreadyDeletedException(searchKey4Log);
        }
    }

    /**
     * Assert that the entity is selected as one.
     * @param ls Selected list. (NotNull)
     * @param searchKey4Log Search-key for Logging. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException
     */
    protected void assertEntitySelectedAsOne(List ls, Object searchKey4Log) {
        if (ls == null || ls.isEmpty()) {
            throwEntityAlreadyDeletedException(searchKey4Log);
        }
        if (ls.size() > 1) {
            throwEntityDuplicatedException(ls.size() + "", searchKey4Log, null);
        }
    }

    private void throwEntityAlreadyDeletedException(Object searchKey4Log) {
        ConditionBeanContext.throwEntityAlreadyDeletedException(searchKey4Log);
    }

    private void throwEntityDuplicatedException(String resultCountString, Object searchKey4Log, Throwable cause) {
        ConditionBeanContext.throwEntityDuplicatedException(resultCountString, searchKey4Log, cause);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    public OutsideSqlBasicExecutor outsideSql() {
        assertDaoSelectorNotNull("outsideSql");
        final OutsideSqlDao outsideSqlDao = _daoSelector.select(OutsideSqlDao.class);
        return new OutsideSqlBasicExecutor(outsideSqlDao, getTableDbName());
    }

    private void assertDaoSelectorNotNull(String methodName) {
        if (_daoSelector == null) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "Not found the selector of dao as behavior's attributed!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm the definition of the selector at your 'dbflute.dicon'." + getLineSeparator();
            msg = msg + "It is precondition that '" + methodName + "()' needs the selector instance." + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Your Behavior's Attributes]" + getLineSeparator();
            msg = msg + "  _behaviorSelector  : " + _behaviorSelector + getLineSeparator();
            msg = msg + "  _daoSelector       : " + _daoSelector + getLineSeparator();
            msg = msg + "* * * * * * * * * */" + getLineSeparator();
            throw new IllegalStateException(msg);
        }
    }

    /**
     * Create value-label list.
     * @param <ENTITY> The type of entity.
     * @param entityList The list of entity. (NotNull)
     * @param valueLabelSetupper Value-label-setupper. (NotNull)
     * @return Value-label list. (NotNull)
     */
    public <ENTITY extends Entity> List<Map<String, Object>> createValueLabelList(List<ENTITY> entityList, ValueLabelSetupper<ENTITY> valueLabelSetupper) {
        final List<Map<String, Object>> valueLabelList = new ArrayList<Map<String, Object>>();
        final ValueLabelBox box = new ValueLabelBox();
        for (ENTITY entity : entityList) {
            final Map<String, Object> valueLabel = new HashMap<String, Object>();
            valueLabelSetupper.setup(box, entity);
            valueLabel.put("value", box.getValue());
            valueLabel.put("label", box.getLabel());
            valueLabelList.add(valueLabel);
        }
        return valueLabelList;
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    /**
     * The implementation.
     * @return The value of sequence. (NotNull)
     */
    public java.math.BigDecimal readNextVal() {
        try {
            final Method method = getClass().getMethod("selectNextVal", new Class[]{});
            Object sequenceObject = method.invoke(this, new Object[] {});
            if (sequenceObject instanceof java.math.BigDecimal) {
                return (java.math.BigDecimal)sequenceObject;
            }
            return (java.math.BigDecimal)helpConvertingSequenceObject(java.math.BigDecimal.class, sequenceObject);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("The table does not have sequence: " + getTableDbName(), e);
        } catch (Exception e) {
            throw new RuntimeException("The selectNextVal() of the table threw the exception: " + getTableDbName(), e);
        }
    }

    protected Object helpConvertingSequenceObject(Class resultClass, Object sequenceObject) {
        try {
            final Constructor constructor = resultClass.getConstructor(new Class[]{String.class});
            return constructor.newInstance(new Object[]{sequenceObject.toString()});
        } catch (NoSuchMethodException e) {
        } catch (Exception e) {
            throw new RuntimeException("The readNextVal() of the table threw the exception: " + getTableDbName(), e);
        }
        try {
            final Method method = resultClass.getMethod("valueOf", new Class[]{long.class});
            return method.invoke(null, new Object[]{Long.valueOf(sequenceObject.toString())});
        } catch (NoSuchMethodException e) {
        } catch (Exception e) {
            throw new RuntimeException("The readNextVal() of the table threw the exception: " + getTableDbName(), e);
        }
        String msg = "Cannot convert sequenceObject to resultClass:";
        msg = msg + " resultClass=" + resultClass + " sequenceObjectType=" + sequenceObject.getClass();
        throw new IllegalStateException(msg);
    }

    // ===================================================================================
    //                                                       Load Referrer Internal Helper
    //                                                       =============================
    /**
     * Help load referrer internally.
     * About internal policy, the value of primary key(and others too) is treated as CaseInsensitive.
     * @param <LOCAL_ENTITY> The type of base entity.
     * @param <PK> The type of primary key.
     * @param <REFERRER_CB> The type of referrer condition-bean.
     * @param <REFERRER_ENTITY> The type of referrer entity.
     * @param localEntityList The list of local entity. (NotNull)
     * @param loadReferrerOption The option of loadReferrer. (NotNull)
     * @param callback The internal call-back of loadReferrer. (NotNull) 
     */
    protected <LOCAL_ENTITY extends Entity
             , PK
             , REFERRER_CB extends ConditionBean
             , REFERRER_ENTITY extends Entity>
            void helpLoadReferrerInternally(List<LOCAL_ENTITY> localEntityList
                                         , LoadReferrerOption<REFERRER_CB, REFERRER_ENTITY> loadReferrerOption
                                         , InternalLoadReferrerCallback<LOCAL_ENTITY, PK, REFERRER_CB, REFERRER_ENTITY> callback) {
        doHelpLoadReferrerInternally(localEntityList, loadReferrerOption, callback);
    }

    /**
     * Do help load referrer internally.
     * About internal policy, the value of primary key(and others too) is treated as CaseInsensitive.
     * @param <LOCAL_ENTITY> The type of base entity.
     * @param <PK> The type of primary key.
     * @param <REFERRER_CB> The type of referrer condition-bean.
     * @param <REFERRER_ENTITY> The type of referrer entity.
     * @param localEntityList The list of local entity. (NotNull)
     * @param loadReferrerOption The option of loadReferrer. (NotNull)
     * @param callback The internal call-back of loadReferrer. (NotNull) 
     */
    protected <LOCAL_ENTITY extends Entity
             , PK
             , REFERRER_CB extends ConditionBean
             , REFERRER_ENTITY extends Entity>
            void doHelpLoadReferrerInternally(List<LOCAL_ENTITY> localEntityList
                                         , LoadReferrerOption<REFERRER_CB, REFERRER_ENTITY> loadReferrerOption
                                         , InternalLoadReferrerCallback<LOCAL_ENTITY, PK, REFERRER_CB, REFERRER_ENTITY> callback) {

        // - - - - - - - - - - -
        // Assert pre-condition
        // - - - - - - - - - - -
        assertBehaviorSelectorNotNull("loadReferrer");
        assertObjectNotNull("localEntityList", localEntityList);
        assertObjectNotNull("loadReferrerOption", loadReferrerOption);
        if (localEntityList.isEmpty()) {
            return;
        }

        // - - - - - - - - - - - - - -
        // Prepare temporary container
        // - - - - - - - - - - - - - -
        final Map<PK, LOCAL_ENTITY> pkLocalEntityMap = new LinkedHashMap<PK, LOCAL_ENTITY>();
        final List<PK> pkList = new ArrayList<PK>();
        for (LOCAL_ENTITY localEntity : localEntityList) {
            final PK primaryKeyValue = callback.callbackBase_getPrimaryKeyValue(localEntity);
            pkList.add(callback.callbackBase_getPrimaryKeyValue(localEntity));
            pkLocalEntityMap.put(toLowerCasePrimaryKeyIfString(primaryKeyValue), localEntity);
        }

        // - - - - - - - - - - - - - - - -
        // Prepare referrer condition bean
        // - - - - - - - - - - - - - - - -
        final REFERRER_CB cb;
        if (loadReferrerOption.getReferrerConditionBean() != null) {
            cb = loadReferrerOption.getReferrerConditionBean();
        } else {
            cb = callback.callbackReferrer_newMyConditionBean();
        }

        // - - - - - - - - - - - - - -
        // Select the list of referrer
        // - - - - - - - - - - - - - -
        callback.callbackReferrer_queryForeignKeyInScope(cb, pkList);
        loadReferrerOption.delegateKeyConditionExchangingFirstWhereClauseForLastOne(cb);
        if (!loadReferrerOption.isStopOrderByKey()) {
            callback.callbackReferrer_queryAddOrderByForeignKeyAsc(cb);
            cb.getSqlComponentOfOrderByClause().exchangeFirstOrderByElementForLastOne();
        }
        loadReferrerOption.delegateConditionBeanSettingUp(cb);
        final List<REFERRER_ENTITY> referrerList = callback.callbackReferrer_selectList(cb);
        loadReferrerOption.delegateEntitySettingUp(referrerList);

        // - - - - - - - - - - - - - - - - - - - - - - - -
        // Create the map of {primary key / referrer list}
        // - - - - - - - - - - - - - - - - - - - - - - - -
        final Map<PK, List<REFERRER_ENTITY>> pkReferrerListMap = new LinkedHashMap<PK, List<REFERRER_ENTITY>>();
        for (REFERRER_ENTITY referrerEntity : referrerList) {
            final PK referrerListKey;
            {
                final PK foreignKeyValue = callback.callbackReferrer_getForeignKeyValue(referrerEntity);
                referrerListKey = toLowerCasePrimaryKeyIfString(foreignKeyValue);
            }
            if (!pkReferrerListMap.containsKey(referrerListKey)) {
                pkReferrerListMap.put(referrerListKey, new ArrayList<REFERRER_ENTITY>());
            }
            (pkReferrerListMap.get(referrerListKey)).add(referrerEntity);

            // for Reverse Reference.
            final LOCAL_ENTITY localEntity = pkLocalEntityMap.get(referrerListKey);
            callback.callbackReferrer_setForeignEntity(referrerEntity, localEntity);
        }

        // - - - - - - - - - - - - - - - - - -
        // Relate referrer list to base entity
        // - - - - - - - - - - - - - - - - - -
        for (LOCAL_ENTITY localEntity : localEntityList) {
            final PK referrerListKey;
            {
                final PK primaryKey = callback.callbackBase_getPrimaryKeyValue(localEntity);
                referrerListKey = toLowerCasePrimaryKeyIfString(primaryKey);
            }
            if (pkReferrerListMap.containsKey(referrerListKey)) {
                callback.callbackBase_setReferrerList(localEntity, pkReferrerListMap.get(referrerListKey));
            } else {
                callback.callbackBase_setReferrerList(localEntity, new ArrayList<REFERRER_ENTITY>());
            }
        }
    }

    /**
     * To lower case for primary key if the value is string.
     * @param <PK> The type of primary key.
     * @param value The value of primary key. (Nullable)
     * @return The value of primary key. (Nullable)
     */
    protected <PK> PK toLowerCasePrimaryKeyIfString(PK value) {
        return (PK)toLowerCaseIfString(value);
    }

    /**
     * @param <LOCAL_ENTITY> The type of base entity.
     * @param <PK> The type of primary key.
     * @param <REFERRER_CB> The type of referrer conditionBean.
     * @param <REFERRER_ENTITY> The type of referrer entity.
     */
    protected static interface InternalLoadReferrerCallback<LOCAL_ENTITY extends Entity
                                                          , PK
                                                          , REFERRER_CB extends ConditionBean
                                                          , REFERRER_ENTITY extends Entity> {
        // For Base
        public PK callbackBase_getPrimaryKeyValue(LOCAL_ENTITY entity);
        public void callbackBase_setReferrerList(LOCAL_ENTITY entity, List<REFERRER_ENTITY> referrerList);

        // For Referrer
        public REFERRER_CB callbackReferrer_newMyConditionBean();
        public void callbackReferrer_queryForeignKeyInScope(REFERRER_CB cb, List<PK> pkList);
        public void callbackReferrer_queryAddOrderByForeignKeyAsc(REFERRER_CB cb);
        public List<REFERRER_ENTITY> callbackReferrer_selectList(REFERRER_CB cb);
        public PK callbackReferrer_getForeignKeyValue(REFERRER_ENTITY entity);
        public void callbackReferrer_setForeignEntity(REFERRER_ENTITY referrerEntity, LOCAL_ENTITY localEntity);
    }

    protected BehaviorSelector xgetBSFLR() { // getBehaviorSelectorForLoadReferrer() as Internal
        assertBehaviorSelectorNotNull("loadReferrer");
        return getBehaviorSelector();
    }

    private void assertBehaviorSelectorNotNull(String methodName) {
        if (_behaviorSelector == null) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "Not found the selector of behavior as behavior's attributed!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm the definition of the selector at your 'dbflute.dicon'." + getLineSeparator();
            msg = msg + "It is precondition that '" + methodName + "()' needs the selector instance." + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Your Behavior's Attributes]" + getLineSeparator();
            msg = msg + "  _behaviorSelector  : " + _behaviorSelector + getLineSeparator();
            msg = msg + "  _daoSelector       : " + _daoSelector + getLineSeparator();
            msg = msg + "* * * * * * * * * */" + getLineSeparator();
            throw new IllegalStateException(msg);
        }
    }

    // ===================================================================================
    //                                                             Pullout Internal Helper
    //                                                             =======================
    protected <LOCAL_ENTITY extends Entity, FOREIGN_ENTITY extends Entity>
            List<FOREIGN_ENTITY> helpPulloutInternally(List<LOCAL_ENTITY> localEntityList, InternalPulloutCallback<LOCAL_ENTITY, FOREIGN_ENTITY> callback) {
        assertObjectNotNull("localEntityList", localEntityList);
        final Set<FOREIGN_ENTITY> foreignSet = new LinkedHashSet<FOREIGN_ENTITY>();
        for (LOCAL_ENTITY entity : localEntityList) {
            final FOREIGN_ENTITY foreignEntity = callback.callbackGetForeignEntity(entity);
            if (foreignEntity == null || foreignSet.contains(foreignEntity)) {
                continue;
            }
            foreignSet.add(foreignEntity);
        }
        return new ArrayList<FOREIGN_ENTITY>(foreignSet);
    }

    protected static interface InternalPulloutCallback<LOCAL_ENTITY extends Entity, FOREIGN_ENTITY extends Entity> {
        public FOREIGN_ENTITY callbackGetForeignEntity(LOCAL_ENTITY entity);
    }

    // ===================================================================================
    //                                                                          Token File
    //                                                                          ==========
    public TokenFileOutputExecutor tokenFileOutput() throws java.io.FileNotFoundException, java.io.IOException {
        return new TokenFileOutputExecutor();
    }

    public class TokenFileOutputExecutor {
        /**
         * Output token-file from this table records.
         * @param cb Condition-bean. (NotNull)
         * @param filename Name of the file. (NotNull and NotEmpty)
         * @param tokenFileOutputOption token-file-output-option. (NotNull and Required{delimiter and encoding})
         * @return Token-file-output-result. (NotNull)
         * @throws java.io.FileNotFoundException
         * @throws java.io.IOException
         */
        public TokenFileOutputResult outputTokenFile(ConditionBean cb, String filename, TokenFileOutputOption tokenFileOutputOption) throws java.io.FileNotFoundException, java.io.IOException {
            assertConditionBeanNotNull(cb);
            assertStringNotNullAndNotTrimmedEmpty("filename", filename);
            assertObjectNotNull("tokenFileOutputOption", tokenFileOutputOption);

            final List<Entity> ls = readList(cb);
            List<List<String>> rowList = new ArrayList<List<String>>();
            for (java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
                final Entity entity = (Entity)ite.next();
                final List<String> valueList = getDBMeta().convertToColumnStringValueList(entity);
                rowList.add(valueList);
            }
            final FileMakingSimpleFacade fileMakingSimpleFacade = new FileMakingSimpleFacadeImpl();
            final FileMakingOption fileMakingOption = tokenFileOutputOption.getFileMakingOption();
            final FileMakingHeaderInfo fileMakingHeaderInfo = new FileMakingHeaderInfo();
            final List<String> columnDbNameList = new ArrayList<String>();
            for (final java.util.Iterator ite = getDBMeta().getColumnInfoList().iterator(); ite.hasNext(); ) {
                final ColumnInfo columnInfo = (ColumnInfo)ite.next();
                columnDbNameList.add(columnInfo.getColumnDbName());
            }
            fileMakingHeaderInfo.setColumnNameList(columnDbNameList);
            fileMakingOption.setFileMakingHeaderInfo(fileMakingHeaderInfo);
            fileMakingSimpleFacade.makeFromRowList(filename, rowList, fileMakingOption);
            final TokenFileOutputResult tokeFileOutputResult = new TokenFileOutputResult();
            tokeFileOutputResult.setSelectedList(ls);
            return tokeFileOutputResult;
        }
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    /**
     * The implementation.
     * @return All count.
     */
    protected int callGetCountAll() {
        return readCount(newConditionBean());
    }

    /**
     * The implementation.
     * @return All list. (NotNull)
     */
    protected List<Entity> callGetListAll() {
        return readList(newConditionBean());
    }

    /**
     * The implementation.
     * @param cb Condition-bean that the type is condition-bean-interface. (NotNull)
     * @return Read count. (NotNull)
     */
    protected int callReadCount(ConditionBean cb) {
        assertConditionBeanNotNull(cb);
        final Class[] types = new Class[]{cb.getClass()};
        final java.lang.reflect.Method mtd = getMethod(getDaoReadable().getClass(), "selectCount", types);
        final Object result = invoke(mtd, getDaoReadable(), new Object[]{cb});
        return ((Integer)result).intValue();
    }

    /**
     * The implementation.
     * @param cb Condition-bean that the type is condition-bean-interface. (NotNull)
     * @return Read list. If the select result is zero, it returns empty list. (NotNull)
     */
    protected List<Entity> callReadList(ConditionBean cb) {
        assertConditionBeanNotNull(cb);
        final Class[] types = new Class[]{cb.getClass()};
        final Method mtd = getMethod(getDaoReadable().getClass(), "selectList", types);
        final Object result = invoke(mtd, getDaoReadable(), new Object[]{cb});
        return (List<Entity>)result;
    }

    private Method getMethod(Class clazz, String methodName, Class[] argTypes) {
        try {
            return clazz.getMethod(methodName, argTypes);
        } catch (NoSuchMethodException ex) {
            String msg = "class=" + clazz + " method=" + methodName + "-" + java.util.Arrays.asList(argTypes);
            throw new RuntimeException(msg, ex);
        }
    }

    private Object invoke(Method method, Object target, Object[] args) {
        try {
            return method.invoke(target, args);
        } catch (java.lang.reflect.InvocationTargetException ex) {
            Throwable t = ex.getCause();
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            }
            if (t instanceof Error) {
                throw (Error) t;
            }
            String msg = "target=" + target + " method=" + method + "-" + java.util.Arrays.asList(args);
            throw new RuntimeException(msg, ex);
        } catch (IllegalAccessException ex) {
            String msg = "target=" + target + " method=" + method + "-" + java.util.Arrays.asList(args);
            throw new RuntimeException(msg, ex);
        }
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    protected abstract boolean hasVersionNoValue(Entity entity);
    protected abstract boolean hasUpdateDateValue(Entity entity);

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    /**
     * To lower case if the type is String.
     * @param obj Object. (Nullable)
     * @return Lower object. (Nullable)
     */
    protected Object toLowerCaseIfString(Object obj) {
        if (obj != null && obj instanceof String) {
            return ((String)obj).toLowerCase();
        }
        return obj;
    }

    /**
     * Get the value of line separator.
     * @return The value of line separator. (NotNull)
     */
    protected String getLineSeparator() {
        return SimpleSystemUtil.getLineSeparator();
    }

    protected <ENTITY extends Entity> ENTITY helpDowncastInternally(Entity entity, Class<ENTITY> clazz) {
        assertObjectNotNull("entity", entity);
        assertObjectNotNull("clazz", clazz);
        try {
            return (ENTITY)entity;
        } catch (ClassCastException e) {
            String msg = "The entity should be " + clazz.getSimpleName() + " but it was: " + entity.getClass();
            throw new RuntimeException(msg, e);
        }
    }

    // ----------------------------------------------------------------
    //                                                    Assert Object
    //                                                    -------------
    /**
     * Assert that the object is not null.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertObjectNotNull(String variableName, Object value) {
        if (variableName == null) {
            String msg = "The value should not be null: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the entity is not null.
     * @param entity Entity. (NotNull)
     */
    protected void assertEntityNotNull(Entity entity) {
        assertObjectNotNull("entity", entity);
    }

    /**
     * Assert that the condition-bean is not null.
     * @param cb Condition-bean. (NotNull)
     */
    protected void assertConditionBeanNotNull(jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean cb) {
        assertObjectNotNull("cb", cb);
    }

    /**
     * Assert that the entity has primary-key value.
     * @param entity Entity. (NotNull)
     */
    protected void assertEntityNotNullAndHasPrimaryKeyValue(Entity entity) {
        assertEntityNotNull(entity);
        if (!entity.hasPrimaryKeyValue()) {
            String msg = "The entity must should primary-key: entity=" + entity;
            throw new IllegalArgumentException(msg + entity);
        }
    }

    // ----------------------------------------------------------------
    //                                                    Assert String
    //                                                    -------------
    /**
     * Assert that the entity is not null and not trimmed empty.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     */
    protected void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        assertObjectNotNull("variableName", variableName);
        assertObjectNotNull(variableName, value);
        if (value.trim().length() ==0) {
            String msg = "The value should not be empty: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
    }

    // ----------------------------------------------------------------
    //                                                      Assert List
    //                                                      -----------
    /**
     * Assert that the list is empty.
     * @param ls List. (NotNull)
     */
    protected void assertListNotNullAndEmpty(List ls) {
        assertObjectNotNull("ls", ls);
        if (!ls.isEmpty()) {
            String msg = "The list should be empty: ls=" + ls.toString();
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the list is not empty.
     * @param ls List. (NotNull)
     */
    protected void assertListNotNullAndNotEmpty(List ls) {
        assertObjectNotNull("ls", ls);
        if (ls.isEmpty()) {
            String msg = "The list should not be empty: ls=" + ls.toString();
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the list having only one.
     * @param ls List. (NotNull)
     */
    protected void assertListNotNullAndHasOnlyOne(List ls) {
        assertObjectNotNull("ls", ls);
        if (ls.size() != 1) {
            String msg = "The list should contain only one object: ls=" + ls.toString();
            throw new IllegalArgumentException(msg);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the selector of behavior.
     * @return The select of behavior. (Nullable: But normally NotNull)
     */
    protected BehaviorSelector getBehaviorSelector() {
        return _behaviorSelector;
    }

    /**
     * Set the selector of behavior.
     * @param behaviorSelector The selector of behavior. (NotNull)
     */
    public void setBehaviorSelector(BehaviorSelector behaviorSelector) {
        this._behaviorSelector = behaviorSelector;
    }

    /**
     * Get the selector of DAO.
     * @return The select of DAO. (Nullable: But normally NotNull)
     */
    protected DaoSelector getDaoSelector() {
        return _daoSelector;
    }

    /**
     * Set the selector of DAO.
     * @param daoSelector The selector of DAO. (NotNull)
     */
    public void setDaoSelector(DaoSelector daoSelector) {
        _daoSelector = daoSelector;
    }
}
