package jp.sourceforge.ea2ddl.dao.allcommon.s2dao;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.seasar.dao.BeanEnhancer;
import org.seasar.dao.BeanMetaData;
import org.seasar.dao.BeanMetaDataFactory;
import org.seasar.dao.ColumnNaming;
import org.seasar.dao.PropertyTypeFactoryBuilder;
import org.seasar.dao.RelationPropertyTypeFactoryBuilder;
import org.seasar.dao.RelationRowCreator;
import org.seasar.dao.RowCreator;
import org.seasar.dao.SqlCommand;
import org.seasar.dao.TableNaming;
import org.seasar.dao.dbms.DbmsManager;
import org.seasar.dao.impl.BeanMetaDataImpl;
import org.seasar.dao.impl.DaoMetaDataImpl;
import org.seasar.dao.impl.ResultSetHandlerFactoryImpl;
import org.seasar.dao.impl.SelectDynamicCommand;
import org.seasar.dao.impl.UpdateAutoStaticCommand;
import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.extension.jdbc.ValueType;
import org.seasar.extension.jdbc.types.ValueTypes;
import org.seasar.framework.beans.MethodNotFoundRuntimeException;
import org.seasar.framework.beans.factory.BeanDescFactory;
import org.seasar.framework.util.MethodUtil;

import jp.sourceforge.ea2ddl.dao.allcommon.BehaviorSelector;
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.annotation.OutsideSql;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBeanContext;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.OutsideSqlContext;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.BatchEntityAlreadyUpdatedException;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException;
import jp.sourceforge.ea2ddl.dao.allcommon.jdbc.CursorHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.rshandler.InternalBeanListMetaDataResultSetHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.rshandler.InternalBeanArrayMetaDataResultSetHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand.InternalDeleteAutoStaticCommand;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand.InternalDeleteBatchAutoStaticCommand;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand.InternalDeleteQueryAutoDynamicCommand;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand.InternalInsertAutoDynamicCommand;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand.InternalInsertBatchAutoStaticCommand;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand.InternalProcedureCommand;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand.InternalUpdateAutoDynamicCommand;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand.InternalUpdateBatchAutoStaticCommand;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand.InternalUpdateDynamicCommand;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand.InternalUpdateModifiedOnlyCommand;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand.InternalUpdateQueryAutoDynamicCommand;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalBasicHandler.SQLExceptionHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalUpdateBatchAutoHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalDeleteBatchAutoHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.various.InternalProcedureMetaData;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.various.InternalProcedureMetaDataFactory;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.various.InternalRowCreator;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.various.InternalRelationRowCreator;
import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleSystemUtil;

/**
 * The extension of DaoMetaDataImpl for DBFlute.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class S2DaoMetaDataExtension extends DaoMetaDataImpl {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(S2DaoMetaDataExtension.class);
    
    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Bean enhancer. */
    protected BeanEnhancer beanEnhancer;

    /** The factory of annotation reader. */
    protected org.seasar.dao.AnnotationReaderFactory annotationReaderFactory;

    /** The naming of column. {After S2Dao-1.0.47} */
    protected ColumnNaming columnNaming;

    /** The builder of property type factory. {After S2Dao-1.0.47} */
    protected PropertyTypeFactoryBuilder propertyTypeFactoryBuilder;

    /** The builder of relation property type factory. {After S2Dao-1.0.47} */
    protected RelationPropertyTypeFactoryBuilder relationPropertyTypeFactoryBuilder;

    /** The builder of table naming. {After S2Dao-1.0.47} */
    protected TableNaming tableNaming;

    // -----------------------------------------------------
    //                                     DBFlute Extension
    //                                     -----------------
    /** The selector of behavior. {Since DBFlute-0.7.1} */
    protected BehaviorSelector _behaviorSelector;
    
    /** The lock monitor of method initialization. */
    protected Object _methodInitializationLockMonitor = new Object();
    
    /** The determination of internal debug. {Since DBFlute-0.6.2} */
    protected boolean _internalDebug;
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public S2DaoMetaDataExtension() {
    }

    // ===================================================================================
    //                                                                 Initialize Override
    //                                                                 ===================
    @Override
    public void initialize() {
        beanClass = daoAnnotationReader.getBeanClass();
        daoInterface = getDaoInterface(daoClass);
        daoBeanDesc = BeanDescFactory.getBeanDesc(daoClass);
        final Connection conn = getConnection();// It is first impact to Database!
        try {
            final DatabaseMetaData dbMetaData = getMetaData(conn);
            dbms = DbmsManager.getDbms(getDatabaseProductName(dbMetaData));
        } finally {
            close(conn);
        }
        this.beanMetaData = beanMetaDataFactory.createBeanMetaData(daoInterface, beanClass);
        checkSingleRowUpdateForAll = daoAnnotationReader.isCheckSingleRowUpdate();

        // Comment out for lazy-load!
        // setupSqlCommand();
    }

    // ===================================================================================
    //                                                           SqlCommand Setup Override
    //                                                           =========================
    @Override
    public SqlCommand getSqlCommand(String methodName) throws MethodNotFoundRuntimeException {
        SqlCommand cmd = (SqlCommand) sqlCommands.get(methodName);
        if (cmd != null) {
            return cmd;
        }
        synchronized (_methodInitializationLockMonitor) {
            cmd = (SqlCommand) sqlCommands.get(methodName);
            if (cmd != null) {
                if (_log.isDebugEnabled()) {
                    _log.debug("...Getting sqlCommand as cache because the previous thread have already initilized.");
                }
                return cmd;
            }
            if (_log.isDebugEnabled()) {
                _log.debug("...Initializing sqlCommand for " + methodName + "().");
            }
            cmd = initializeSqlCommand(methodName);
        }
        return cmd;
    }

    protected SqlCommand initializeSqlCommand(String methodName) throws MethodNotFoundRuntimeException {
        if (OutsideSqlContext.isExistOutsideSqlContextOnThread()) {
            final OutsideSqlContext outsideSqlContext = OutsideSqlContext.getOutsideSqlContextOnThread();
            if (outsideSqlContext != null && outsideSqlContext.isSpecifiedOutsideSql()) {
                return initializeSpecifiedOutsideSqlCommand(methodName, outsideSqlContext);
            }
        }
        final Method[] methods = daoBeanDesc.getMethods(methodName);
        if (methods.length == 1 && MethodUtil.isAbstract(methods[0])) {
            setupMethod(methods[0]);
        }
        final SqlCommand cmd = (SqlCommand) sqlCommands.get(methodName);
        if (cmd != null) {
            return cmd;
        }
        throw new MethodNotFoundRuntimeException(daoClass, methodName, null);
    }

    protected SqlCommand initializeSpecifiedOutsideSqlCommand(String sqlCommandKey, OutsideSqlContext outsideSqlContext) throws MethodNotFoundRuntimeException {
        final Method[] methods = daoBeanDesc.getMethods(outsideSqlContext.getMethodName());// By real method name.
        if (methods.length == 1 && org.seasar.framework.util.MethodUtil.isAbstract(methods[0])) {
            final Method method = methods[0];
            if (isOutsideSqlDaoMethodSelect(method)) {
                setupSpecifiedOutsideSqlSelectCommand(sqlCommandKey, method, outsideSqlContext);
            } else if (isOutsideSqlDaoMethodCall(method)) {
                setupSpecifiedOutsideSqlCallCommand(sqlCommandKey, method, outsideSqlContext);
            } else {
                setupSpecifiedOutsideSqlExecuteCommand(sqlCommandKey, method, outsideSqlContext);
            }
        }
        final SqlCommand cmd = (SqlCommand) sqlCommands.get(sqlCommandKey);
        if (cmd != null) {
            return cmd;
        }
        String msg = "Internal Error! The sql-command is not found:";
        msg = msg + " sqlCommandKey=" + sqlCommandKey;
        msg = msg + " sqlCommands=" + sqlCommands;
        throw new IllegalStateException(msg);
    }

    protected boolean isOutsideSqlDaoMethodSelect(Method method) {
        return method.getName().startsWith("select");
    }

    protected boolean isOutsideSqlDaoMethodCall(Method method) {
        return method.getName().startsWith("call");
    }

    // ===================================================================================
    //                                                                     Assert Override
    //                                                                     ===============
    @Override
    protected void setupMethodByAnnotation(Class daoInterface, Method method) {
        final String sql = daoAnnotationReader.getSQL(method, dbms.getSuffix());
        assertSQLAnnotationUnsupported(method, sql);
        super.setupMethodByAnnotation(daoInterface, method);
    }

    protected void assertSQLAnnotationUnsupported(final Method method, String sql) {
        if (sql != null) {
            throwS2DaoSQLAnnotationUnsupportedException(method, sql);
        }
    }

    protected void throwS2DaoSQLAnnotationUnsupportedException(final Method method, String sql) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "Sorry, the SQL annotation of S2Dao is unsupported on DBFlute!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "Please use outside-sql of behavior." + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    memberBhv.outsideSql().selectList(...)" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "If you've got to use it, you can set the property:" + getLineSeparator();
        msg = msg + "{torque.isCompatibleS2DaoSQLAnnotationValid = true}" + getLineSeparator();
        msg = msg + "But pay attention to version up of DBFlute" + getLineSeparator();
        msg = msg + " because the property will not always supported at the future." + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Method]" + getLineSeparator() + method + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[SQL]" + getLineSeparator() + sql + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new UnsupportedOperationException(msg);
    }

    @Override
    protected void setupMethodByAuto(Method method) {
        final OutsideSql outsideSql = method.getAnnotation(OutsideSql.class);
        if (outsideSql != null) {
            String msg = "This method '" + method.getName() + "()' should use Outside Sql but the file was not found!";
            msg = msg + " Expected sql file name is '" + method.getDeclaringClass().getSimpleName() + "_" + method.getName() + ".sql'";
            throw new IllegalStateException(msg);
        }
        super.setupMethodByAuto(method);
    }

    // ===================================================================================
    //                                                              ConditionBean Override
    //                                                              ======================
    @Override
    protected void setupSelectMethodByAuto(final Method method) {
        if (setupInternalSelectMethodSequenceNextVal(method)) { // For sequence
            return;
        }
        if (setupInternalSelectMethodEntityByIdsForBuri(method)) { // For Buri
            return;
        }

        // Assert unsupported
        final String query = daoAnnotationReader.getQuery(method);
        assertQueryAnnotationUnsupported(method, query);
        final String[] argNames = daoAnnotationReader.getArgNames(method);
        assertAutoQueryByArgsAnnotationUnsupported(method, argNames);

        // Here it is the only method that the argument is DTO.
        final ResultSetHandler handler = createResultSetHandler(method);
        final SqlCommand cmd = setupInternalNonQuerySelectMethodByDto(method, handler);

        putSqlCommand(method.getName(), cmd);
    }

    protected boolean setupInternalSelectMethodSequenceNextVal(final Method method) { // For sequence
        if (!"selectNextVal".equals(method.getName())) {
            return false;
        }
        final DBMeta dbmeta = findDBMeta();
        if (!dbmeta.hasSequence()) {
            String msg = "If the method 'selectNextVal()' exists, DBMeta.hasSequence() should return true:";
            msg = msg + " dbmeta.hasSequence()=" + dbmeta.hasSequence() + " method=" + method;
            throw new IllegalStateException(msg);
        }
        final String nextValSql = dbmeta.getSequenceNextValSql();
        if (nextValSql == null) {
            String msg = "If the method 'selectNextVal()' exists, DBMeta.getSequenceNextValSql() should not return null:";
            msg = msg + " dbmeta.getSequenceNextValSql()=" + dbmeta.getSequenceNextValSql() + " method=" + method;
            throw new IllegalStateException(msg);
        }
        setupSelectMethodByManual(method, nextValSql);
        return true;
    }

    protected boolean setupInternalSelectMethodEntityByIdsForBuri(final Method method) { // For Buri
        if (!"getEntityByIds".equals(method.getName())) {
            return false;
        }
        final ResultSetHandler handler = createResultSetHandler(method);
        final String[] argNames = daoAnnotationReader.getArgNames(method);
        final String query = daoAnnotationReader.getQuery(method);
        if (query == null) {
            String msg = "The method 'getEntityByIds()' should have QUERY annotation:";
            msg = msg + " method=" + method;
            throw new IllegalStateException(msg);
        }
        final Class[] types = method.getParameterTypes();
        final SelectDynamicCommand cmd = createSelectDynamicCommand(handler, query);
        cmd.setArgNames(argNames);
        cmd.setArgTypes(types);
        putSqlCommand(method.getName(), cmd);
        return true;
    }

    protected void assertQueryAnnotationUnsupported(final Method method, String query) {
        if (query != null) {
            String msg = "Sorry! The QUERY annotation of S2Dao is unsupported on DBFlute:";
            msg = msg + " query=" + query + " method=" + method;
            throw new UnsupportedOperationException(msg);
        }
    }

    protected void assertAutoQueryByArgsAnnotationUnsupported(final Method method, String[] argNames) {
        if (!isAutoSelectSqlByDto(method, argNames)) {
            String msg = "Sorry! The auto query by ARGS annotation of S2Dao is unsupported on DBFlute:";
            msg = msg + " argNames=" + argNames + " method=" + method;
            throw new UnsupportedOperationException(msg);
        }
    }

    // For condition-bean!
    protected SqlCommand setupInternalNonQuerySelectMethodByDto(Method method, ResultSetHandler handler) {
        final Class[] argTypes = method.getParameterTypes();
        assertAutoQueryByDtoUnsupported(method, argTypes);
        final S2DaoSelectDynamicCommand cmd = createCustomizeSelectDynamicCommand(handler);
        cmd.setArgNames(new String[] { "dto" });
        cmd.setArgTypes(argTypes);
        return cmd;
    }

    protected void assertAutoQueryByDtoUnsupported(final Method method, Class[] argTypes) {
        final Class firstArgType = argTypes[0];
        if (!ConditionBeanContext.isTheTypeConditionBean(firstArgType)) {
            String msg = "Sorry! The auto query by DTO of S2Dao is unsupported on DBFlute:";
            msg = msg + " dto=" + firstArgType + " method=" + method;
            throw new UnsupportedOperationException(msg);
        }
    }

    // ===================================================================================
    //                                       Insert and Update and Delete By Auto Override
    //                                       =============================================
    // -----------------------------------------------------
    //                                                Insert
    //                                                ------
    @Override
    protected void setupInsertMethodByAuto(final Method method) {
        checkAutoUpdateMethod(method);
        final String[] propertyNames = getPersistentPropertyNames(method);
        final SqlCommand command;
        if (isUpdateSignatureForBean(method)) {
            final InternalInsertAutoDynamicCommand cmd = new InternalInsertAutoDynamicCommand();
            cmd.setBeanMetaData(getBeanMetaData());
            cmd.setDataSource(dataSource);
            
            // It is unnecessary for DBFlute!
            // cmd.setNotSingleRowUpdatedExceptionClass(getNotSingleRowUpdatedExceptionClass(method));
            
            cmd.setPropertyNames(propertyNames);
            cmd.setStatementFactory(statementFactory);
            cmd.setCheckSingleRowUpdate(isCheckSingleRowUpdate(method));
            command = cmd;
        } else {
            boolean returningRows = false;
            if (int[].class.isAssignableFrom(method.getReturnType())) {
                returningRows = true;
            }
            final InternalInsertBatchAutoStaticCommand cmd = new InternalInsertBatchAutoStaticCommand(
                    dataSource, statementFactory, getBeanMetaData(),
                    propertyNames, returningRows);
            command = cmd;
        }
        putSqlCommand(method.getName(), command);
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    @Override
    protected void setupUpdateMethodByAuto(final Method method) {
        if (isFirstArgumentConditionBean(method)) {
            final SqlCommand cmd = new InternalUpdateQueryAutoDynamicCommand(dataSource, statementFactory);
            putSqlCommand(method.getName(), cmd);
            return;
        }
        checkAutoUpdateMethod(method);
        final String[] propertyNames = getPersistentPropertyNames(method);
        SqlCommand cmd;
        if (isUpdateSignatureForBean(method)) {
            if (isUnlessNull(method.getName())) {
                cmd = createInternalUpdateAutoDynamicCommand(method, propertyNames);
            } else if (isModifiedOnly(method.getName())) {
                cmd = createInternalUpdateModifiedOnlyCommand(method, propertyNames);
            } else {
                cmd = createInternalUpdateAutoStaticCommand(method, propertyNames);
            }
        } else {
            boolean returningRows = false;
            if (int[].class.isAssignableFrom(method.getReturnType())) {
                returningRows = true;
            }
            cmd = createInternalUpdateBatchAutoStaticCommand(method, propertyNames, returningRows);
        }
        putSqlCommand(method.getName(), cmd);
    }

    protected UpdateAutoStaticCommand createInternalUpdateAutoStaticCommand(final Method method, final String[] propertyNames) {
        final UpdateAutoStaticCommand cmd = new UpdateAutoStaticCommand(dataSource, statementFactory, beanMetaData, propertyNames);
        cmd.setCheckSingleRowUpdate(isCheckSingleRowUpdate(method));
        return cmd;
    }
    
    protected InternalUpdateAutoDynamicCommand createInternalUpdateAutoDynamicCommand(Method method, String[] propertyNames) {
        final InternalUpdateAutoDynamicCommand cmd = newUpdateAutoDynamicCommand(method, dataSource, statementFactory);
        cmd.setBeanMetaData(createBeanMetaData4UpdateDeleteByAuto(method));// Extension Point!
        cmd.setPropertyNames(propertyNames);
        cmd.setCheckSingleRowUpdate(!isNonstrictMethod(method));
        
        // It is unnecessary for DBFlute!
        // cmd.setNotSingleRowUpdatedExceptionClass(getNotSingleRowUpdatedExceptionClass(method));
        
        cmd.setVersionNoAutoIncrementOnMemory(isUpdateVersionNoAutoIncrementOnMemory(method));
        return cmd;
    }

    protected InternalUpdateAutoDynamicCommand newUpdateAutoDynamicCommand(Method method, DataSource ds, StatementFactory sf) {
        return new InternalUpdateAutoDynamicCommand(ds, sf);
    }

    protected InternalUpdateModifiedOnlyCommand createInternalUpdateModifiedOnlyCommand(final Method method, final String[] propertyNames) {
        final InternalUpdateModifiedOnlyCommand cmd = newInternalUpdateModifiedOnlyCommand(method, dataSource, statementFactory);
        cmd.setBeanMetaData(createBeanMetaData4UpdateDeleteByAuto(method));// Extension Point!
        cmd.setPropertyNames(propertyNames);
        cmd.setCheckSingleRowUpdate(!isNonstrictMethod(method));
        
        // It is unnecessary for DBFlute!
        // cmd.setNotSingleRowUpdatedExceptionClass(getNotSingleRowUpdatedExceptionClass(method));
        
        cmd.setVersionNoAutoIncrementOnMemory(isUpdateVersionNoAutoIncrementOnMemory(method));
        return cmd;
    }

    protected InternalUpdateModifiedOnlyCommand newInternalUpdateModifiedOnlyCommand(Method method, DataSource ds, StatementFactory sf) {
        return new InternalUpdateModifiedOnlyCommand(ds, sf);
    }

    protected InternalUpdateBatchAutoStaticCommand createInternalUpdateBatchAutoStaticCommand(final Method method, final String[] propertyNames, boolean returningRows) {
        return new InternalUpdateBatchAutoStaticCommand(dataSource, statementFactory
                                                      , createBeanMetaData4UpdateDeleteByAuto(method), propertyNames, returningRows
                                                      , isUpdateVersionNoAutoIncrementOnMemory(method)) {
            @Override
            protected InternalUpdateBatchAutoHandler newInternalBatchAutoHandler() {
                return new InternalUpdateBatchAutoHandler(getDataSource(), getStatementFactory(), getBeanMetaData(), getPropertyTypes()) {
                    @Override
                    protected int[] executeBatch(PreparedStatement ps, List<?> list) {
                        final int[] result = super.executeBatch(ps, list);
                        try {
                            handleBatchUpdateResultWithOptimisticLock(ps, list, result, method);
                        } catch (SQLException e) {
                            handleSQLException(e, ps, false);
                            return null;// Unreachable!
                        }
                        return result;
                    }
                };
            }
        };
    }

    // -----------------------------------------------------
    //                                                Delete
    //                                                ------
    @Override
    protected void setupDeleteMethodByAuto(final Method method) {
        if (isFirstArgumentConditionBean(method)) {
            final SqlCommand cmd = new InternalDeleteQueryAutoDynamicCommand(dataSource, statementFactory);
            putSqlCommand(method.getName(), cmd);
            return;
        }
        checkAutoUpdateMethod(method);
        final String[] propertyNames = getPersistentPropertyNames(method);
        final SqlCommand cmd;
        if (isUpdateSignatureForBean(method)) {
            cmd = createInternalDeleteAutoStaticCommand(method, propertyNames);
        } else {
            boolean returningRows = false;
            if (int[].class.isAssignableFrom(method.getReturnType())) {
                returningRows = true;
            }
            cmd = createInternalDeleteBatchAutoStaticCommand(method, propertyNames, returningRows);
        }
        putSqlCommand(method.getName(), cmd);
    }

    protected InternalDeleteAutoStaticCommand createInternalDeleteAutoStaticCommand(final Method method, final String[] propertyNames) {
        final InternalDeleteAutoStaticCommand cmd = new InternalDeleteAutoStaticCommand(dataSource, statementFactory, createBeanMetaData4UpdateDeleteByAuto(method), propertyNames);
        cmd.setCheckSingleRowUpdate(!isNonstrictMethod(method));
        return cmd;
    }

    protected InternalDeleteBatchAutoStaticCommand createInternalDeleteBatchAutoStaticCommand(final Method method, final String[] propertyNames, boolean returningRows) {
        return new InternalDeleteBatchAutoStaticCommand(dataSource, statementFactory, createBeanMetaData4UpdateDeleteByAuto(method), propertyNames, returningRows) {
            @Override
            protected InternalDeleteBatchAutoHandler newInternalBatchAutoHandler() {
                return new InternalDeleteBatchAutoHandler(getDataSource(), getStatementFactory(), getBeanMetaData(), getPropertyTypes()) {
                    @Override
                    protected int[] executeBatch(PreparedStatement ps, List<?> list) {
                        final int[] result = super.executeBatch(ps, list);
                        try {
                            handleBatchUpdateResultWithOptimisticLock(ps, list, result, method);
                        } catch (SQLException e) {
                            handleSQLException(e, ps, false);
                            return null;// Unreachable!
                        }
                        return result;
                    }
                };
            }
        };
    }

    // -----------------------------------------------------
    //                                         Common Helper
    //                                         -------------
    protected BeanMetaData createBeanMetaData4UpdateDeleteByAuto(Method method) {
        if (isNonstrictMethod(method)) {
            return createNonConcurrencyBmdFactory().createBeanMetaData(getBeanClass());
        } else {
            return getBeanMetaData();
        }
    }
    
    protected boolean isUpdateVersionNoAutoIncrementOnMemory(Method method) {
        return !isNonstrictMethod(method);
    }

    protected boolean isNonstrictMethod(Method method) {
        return method.getName().contains("Nonstrict");
    }

    protected BeanMetaDataFactory createNonConcurrencyBmdFactory() {
        final S2BeanMetaDataFactoryImpl nonConcurrencyBmdFactory = new S2BeanMetaDataFactoryImpl() {
            protected BeanMetaDataImpl createBeanMetaDataImpl() {
                return new BeanMetaDataImpl() {
                    public boolean hasVersionNoPropertyType() {
                        return false;
                    }

                    public boolean hasTimestampPropertyType() {
                        return false;
                    }
                };
            }
        };
        nonConcurrencyBmdFactory.setAnnotationReaderFactory(this.annotationReaderFactory);
        nonConcurrencyBmdFactory.setPropertyTypeFactoryBuilder(this.propertyTypeFactoryBuilder);
        nonConcurrencyBmdFactory.setRelationPropertyTypeFactoryBuilder(this.relationPropertyTypeFactoryBuilder);
        nonConcurrencyBmdFactory.setTableNaming(this.tableNaming);
        nonConcurrencyBmdFactory.setDataSource(this.dataSource);
        nonConcurrencyBmdFactory.setDaoNamingConvention(this.daoNamingConvention);
        nonConcurrencyBmdFactory.setBeanEnhancer(this.beanEnhancer);
        return nonConcurrencyBmdFactory;
    }

    protected boolean isFirstArgumentConditionBean(final Method method) {
        final Class<?>[] pmbTypes = method.getParameterTypes();
        return pmbTypes.length > 0 && ConditionBean.class.isAssignableFrom(pmbTypes[0]);
    }

    protected void handleBatchUpdateResultWithOptimisticLock(PreparedStatement ps, List<?> list, int[] result, Method method) throws SQLException {
        if (ConditionBeanContext.isOracle()) {
            final int updateCount = ps.getUpdateCount();
            handleBatchUpdateResultWithOptimisticLockByUpdateCount(list, updateCount, method);
        } else {
            handleBatchUpdateResultWithOptimisticLockByResult(list, result, method);
        }
    }

    protected void handleBatchUpdateResultWithOptimisticLockByUpdateCount(List<?> list, int updateCount, Method method) {
        if (list.isEmpty()) {
            return;// for Safety!
        }
        if (updateCount < 0) {
            return;// for Safety!
        }
        final int entityCount = list.size();
        if (updateCount < entityCount) {
            if (isNonstrictMethod(method)) {
                String msg = "The entity have already deleted:";
                msg = msg + " updateCount=" + updateCount;
                msg = msg + " entityCount=" + entityCount;
                msg = msg + " allEntities=" + list;
                throw new EntityAlreadyDeletedException(msg);
            } else {
                throw new BatchEntityAlreadyUpdatedException(list.get(0), 0, updateCount);
            }
        }
    }

    protected void handleBatchUpdateResultWithOptimisticLockByResult(List<?> list, Object result, Method method) {
        if (list.isEmpty()) {
            return;// for Safety!
        }
        if (!(result instanceof int[])) {
            return;// for Safety!
        }
        final int[] updatedCountArray = (int[])result;
        final int entityCount = list.size();
        int index = 0;
        boolean alreadyUpdated = false;
        for (int oneUpdateCount : updatedCountArray) {
            if (entityCount <= index) {
                break;// for Safety!
            }
            if (oneUpdateCount == 0) {
                alreadyUpdated = true;
                break;
            } else if (oneUpdateCount > 1) {
                String msg = "The entity updated two or more records in batch update:";
                msg = msg + " entity=" + list.get(index);
                msg = msg + " updatedCount=" + oneUpdateCount;
                msg = msg + " allEntities=" + list;
                throw new EntityDuplicatedException(msg);
            }
            ++index;
        }
        if (alreadyUpdated) {
            int updateCount = 0;
            for (int oneUpdateCount : updatedCountArray) {
                updateCount = updateCount + oneUpdateCount;
            }
            if (isNonstrictMethod(method)) {
                String msg = "The entity have already deleted:";
                msg = msg + " entity=" + list.get(index);
                msg = msg + " updateCount=" + updateCount;
                msg = msg + " allEntities=" + list;
                throw new EntityAlreadyDeletedException(msg);
            } else {
                throw new BatchEntityAlreadyUpdatedException(list.get(index), 0, updateCount);
            }
        }
    }

    // ===================================================================================
    //                                                                 OutsideSql Override
    //                                                                 ===================
    // -----------------------------------------------------
    //                                     Normal OutsideSql
    //                                     -----------------
    @Override
    protected void setupSelectMethodByManual(Method method, String sql) {
        final Class<?>[] pmbTypes = method.getParameterTypes();
        final String[] argNames = this.daoAnnotationReader.getArgNames(method);
        final Class<?>[] argTypes;
        if (pmbTypes != null && pmbTypes.length > 0
                && CursorHandler.class.isAssignableFrom(pmbTypes[pmbTypes.length-1])) {
            argTypes = new Class<?>[pmbTypes.length - 1];
            for (int i=0; i < pmbTypes.length - 1; i++) {
                argTypes[i] = pmbTypes[i];
            }
        } else {
            argTypes = pmbTypes;
        }
        final BeanMetaData myBeanMetaData = getOutsideSqlBeanMetaData(method);
        registerSqlCommand(method.getName(), method, sql, argNames, argTypes, myBeanMetaData);
    }

    protected BeanMetaData getOutsideSqlBeanMetaData(Method method) {
        final Class beanClass4SelectMethodByManual = getOutsideSqlDefaultBeanClass(method);
        if (beanClass4SelectMethodByManual.equals(getBeanClass())) {
            return getBeanMetaData();
        }
        return createOutsideSqlCustomizeBeanMetaDataFactory().createBeanMetaData(getOutsideSqlDefaultBeanClass(method));
    }

    @Override
    protected void setupUpdateMethodByManual(Method method, final String sql) {
        // DBFlute Extesion does not exist. Because DBFlute methods don't use this!
        // The insert/update/delete methods on DAO interface as outside SQL are target.
        // And especially NonPrimaryInsertMethod uses this for using S2Dao's BindVariableNode.
        super.setupUpdateMethodByManual(method, sql);
    }

    // -----------------------------------------------------
    //                                  Specified OutsideSql
    //                                  --------------------
    // - - - - - - - - - - - -
    //                  Select
    //                   - - -
    protected void setupSpecifiedOutsideSqlSelectCommand(String sqlCommandKey, Method method, OutsideSqlContext outsideSqlContext) {
        // - - - - - - - - - - - - - - - - - - - - - - -
        // The attribute of Specified-OutsideSqlContext.
        // - - - - - - - - - - - - - - - - - - - - - - -
        final String sql = outsideSqlContext.readFilteredOutsideSql(getSqlFileEncoding(), dbms.getSuffix());
        final Object pmb = outsideSqlContext.getParameterBean();
        final Object resultTypeSpecification = outsideSqlContext.getResultTypeSpecification();

        // - - - - - - - - - - - - - - -
        // The attribute of SqlCommand.
        // - - - - - - - - - - - - - - -
        final String[] argNames = (pmb != null ? new String[] {"pmb"} : new String[]{});
        final Class<?>[] argTypes = (pmb != null ? new Class<?>[] {pmb.getClass()} : new Class<?>[]{});

        // - - - - - - - - - - - - - - - -
        // Create customized BeanMetaData.
        // - - - - - - - - - - - - - - - -
        final Class<?> lastestArguementType = method.getParameterTypes()[method.getParameterTypes().length-1];
        final ResultSetHandler myResultSetHandler;
        if (Class.class.isAssignableFrom(lastestArguementType)) {
            // - - - - - - - -
            // EntityHandling
            // - - - - - - - -
            final Class<?> customizeEntityType = (Class<?>)resultTypeSpecification;
            final BeanMetaData myBeanMetaData = createSpecifiedOutsideSqlCustomizeBeanMetaData(customizeEntityType);
            if (List.class.isAssignableFrom(method.getReturnType())) {
                myResultSetHandler = createSpecifiedOutsideSqlCustomizeBeanListResultSetHandler(myBeanMetaData, customizeEntityType);
            } else {
                throw new UnsupportedOperationException("The return type of method is unsupported: method.getReturnType()=" + method.getReturnType());
                // myResultSetHandler = createSpecifiedOutsideSqlCustomizeBeanResultSetHandler(myBeanMetaData, customizeEntityType);
            }
        } else if (CursorHandler.class.isAssignableFrom(lastestArguementType)) {
            // - - - - - - - -
            // CursorHandling
            // - - - - - - - -
            final BeanMetaData myBeanMetaData = createSpecifiedOutsideSqlCursorBeanMetaData(method);
            myResultSetHandler = createSpecifiedOutsideSqlCursorResultSetHandler(myBeanMetaData);
        } else {
            String msg = "The lastestArguementType is unsupported:";
            msg = msg + " lastestArguementType=" + lastestArguementType;
            msg = msg + " method=" + method;
            throw new IllegalStateException(msg);
        }

        // - - - - - - - - - - -
        // Register Sql-Command.
        // - - - - - - - - - - -
        registerSqlCommand(sqlCommandKey, method, sql, argNames, argTypes, myResultSetHandler);
    }

    protected BeanMetaData createSpecifiedOutsideSqlCustomizeBeanMetaData(Class clazz) {
        return createOutsideSqlCustomizeBeanMetaDataFactory().createBeanMetaData(clazz);
    }

    /**
     * Create the handler of result set of specified outside-sql for the list of customize bean.
     * @param specifiedBeanMetaData Specified bean meta data. (NotNull)
     * @param customizeEntityType The type of customize entity. (NotNull)
     * @return The handler of result set. (NotNull)
     */
    protected ResultSetHandler createSpecifiedOutsideSqlCustomizeBeanListResultSetHandler(BeanMetaData specifiedBeanMetaData, Class<?> customizeEntityType) {
        final ValueType valueType = ValueTypes.getValueType(customizeEntityType);
        if (valueType == null || !valueType.equals(ValueTypes.OBJECT)) {
            return new InternalObjectListResultSetHandler(valueType);
        }
        final InternalRowCreator rowCreator = createSpecifiedOutsideSqlInternalRowCreator(specifiedBeanMetaData);
        final InternalRelationRowCreator relationRowCreator = createSpecifiedOutsideSqlInternalRelationRowCreator(specifiedBeanMetaData);
        return new InternalBeanListMetaDataResultSetHandler(specifiedBeanMetaData, rowCreator, relationRowCreator);
    }

    protected InternalRowCreator createSpecifiedOutsideSqlInternalRowCreator(BeanMetaData bmd) {
        final Class clazz = bmd.getBeanClass();
        return InternalRowCreator.createInternalRowCreator(clazz);
    }

    protected InternalRelationRowCreator createSpecifiedOutsideSqlInternalRelationRowCreator(BeanMetaData bmd) {
        return new InternalRelationRowCreator();
    }

    protected class InternalObjectListResultSetHandler implements ResultSetHandler {
        private ValueType valueType;
        public InternalObjectListResultSetHandler(ValueType valueType) {
            this.valueType = valueType;
        }
        public Object handle(ResultSet rs) throws SQLException {
            final List<Object> ret = new ArrayList<Object>();
            while (rs.next()) {
                ret.add(valueType.getValue(rs, 1));
            }
            return ret;
        }
    }

    protected BeanMetaData createSpecifiedOutsideSqlCursorBeanMetaData(Method method) {
        return createOutsideSqlCustomizeBeanMetaDataFactory().createBeanMetaData(getOutsideSqlDefaultBeanClass(method));
    }

    protected ResultSetHandler createSpecifiedOutsideSqlCursorResultSetHandler(BeanMetaData specifiedBeanMetaData) {
        return new org.seasar.extension.jdbc.impl.ObjectResultSetHandler();// This is dummy for cursor handling!
    }

    // - - - - - - - - - - - -
    //                 Execute
    //                 - - - -
    protected void setupSpecifiedOutsideSqlExecuteCommand(String sqlCommandKey, Method method, OutsideSqlContext outsideSqlContext) {
        // - - - - - - - - - - - - - - - - - - - - - - -
        // The attribute of Specified-OutsideSqlContext.
        // - - - - - - - - - - - - - - - - - - - - - - -
        final String sql = outsideSqlContext.readFilteredOutsideSql(getSqlFileEncoding(), dbms.getSuffix());
        final Object pmb = outsideSqlContext.getParameterBean();

        // - - - - - - - - - - - - - - -
        // The attribute of SqlCommand.
        // - - - - - - - - - - - - - - -
        final String[] argNames = (pmb != null ? new String[] {"pmb"} : new String[]{});
        final Class<?>[] argTypes = (pmb != null ? new Class<?>[] {pmb.getClass()} : new Class<?>[]{});

        final InternalUpdateDynamicCommand cmd = new InternalUpdateDynamicCommand(dataSource, statementFactory) {
            @Override
            public Object execute(Object[] args) {
                if (args.length != 3) {
                    String msg = "Internal Error! OutsideSqlDao.execute() should have 3 arguements: args.length=" + args.length;
                    throw new IllegalStateException(msg);
                }
                Object arg = args[1];
                return super.execute(new Object[] {arg});
            }
        };
        
        // It is unnecessary for DBFlute!
        // cmd.setNotSingleRowUpdatedExceptionClass(getNotSingleRowUpdatedExceptionClass(method));
        
        registerSqlCommand(sqlCommandKey, method, sql, argNames, argTypes, cmd);
    }

	// - - - - - - - - - - - -
    //          Call Procedure
    //           - - - - - - -
    protected void setupSpecifiedOutsideSqlCallCommand(String sqlCommandKey, Method method, OutsideSqlContext outsideSqlContext) {
        // - - - - - - - - - - - - - - - - - - - - - - -
        // The attribute of Specified-OutsideSqlContext.
        // - - - - - - - - - - - - - - - - - - - - - - -
        final Object pmb = outsideSqlContext.getParameterBean();
        final String procedureName = outsideSqlContext.getOutsideSqlPath();

        // - - - - - - - - - - - - - - -
        // The attribute of SqlCommand.
        // - - - - - - - - - - - - - - -
        final InternalProcedureMetaDataFactory factory = createInternalProcedureMetaDataFactory();
        factory.setValueTypeFactory(valueTypeFactory);
        final Class<?> pmbType = pmb != null ? pmb.getClass() : null;
        final InternalProcedureMetaData metaData = factory.createProcedureMetaData(procedureName, pmbType);
        final InternalProcedureCommand cmd = createInternalProcedureCommand(method, metaData);
        putSqlCommand(sqlCommandKey, cmd);
    }

    protected InternalProcedureMetaDataFactory createInternalProcedureMetaDataFactory() {
        return new InternalProcedureMetaDataFactory();
    }

    protected InternalProcedureCommand createInternalProcedureCommand(Method method, InternalProcedureMetaData metaData) {
        final ResultSetHandler resultSetHandler = createResultSetHandler(method);
        return new InternalProcedureCommand(dataSource, resultSetHandler, statementFactory, metaData);
    }
	
    // -----------------------------------------------------
    //                                  Common of OutsideSql
    //                                  --------------------
    protected BeanMetaDataFactory createOutsideSqlCustomizeBeanMetaDataFactory() {
        final S2BeanMetaDataFactoryImpl originalBmdFactory = new S2BeanMetaDataFactoryImpl() {
            protected BeanMetaDataImpl createBeanMetaDataImpl() {
                return newOutsideSqlCustomizeBeanMetaDataImpl();
            }
        };
        originalBmdFactory.setAnnotationReaderFactory(this.annotationReaderFactory);
        originalBmdFactory.setPropertyTypeFactoryBuilder(createOutsideSqlPropertyTypeFactoryBuilder());
        originalBmdFactory.setRelationPropertyTypeFactoryBuilder(this.relationPropertyTypeFactoryBuilder);
        originalBmdFactory.setTableNaming(this.tableNaming);
        originalBmdFactory.setDataSource(this.dataSource);
        originalBmdFactory.setDaoNamingConvention(this.daoNamingConvention);
        originalBmdFactory.setBeanEnhancer(this.beanEnhancer);
        return originalBmdFactory;
    }

    protected BeanMetaDataImpl newOutsideSqlCustomizeBeanMetaDataImpl() {
        return new OutsideSqlCustomizeBeanMetaDataImpl();
    }

    protected static class OutsideSqlCustomizeBeanMetaDataImpl extends BeanMetaDataImpl {
        // Though nothing to override, it uses original class just in case.
    }

    protected S2DaoPropertyTypeFactoryBuilderExtension createOutsideSqlPropertyTypeFactoryBuilder() {
        final S2DaoPropertyTypeFactoryBuilderExtension impl = new S2DaoPropertyTypeFactoryBuilderExtension();
        if (columnNaming == null) {
            String msg = "Internal Error! The columnNaming should not be null! {Failed to Injection!}";
            throw new IllegalStateException(msg);
        }
        impl.setColumnNaming(columnNaming);
        impl.setValueTypeFactory(valueTypeFactory);
        return impl;
    }

    protected Class getOutsideSqlDefaultBeanClass(Method method) {
        final Class retType = method.getReturnType();
        if (java.util.List.class.isAssignableFrom(retType)) {
            final Class elementType = InternalMethodUtil.getElementTypeOfListFromReturnMethod(method);
            if (elementType != null) {
                return elementType;
            } else {
                return getBeanClass();
            }
        } else if (retType.isArray()) {
            return retType.getComponentType();
        } else if (retType.isPrimitive() || !ValueTypes.getValueType(retType).equals(ValueTypes.OBJECT)) {
            return getBeanClass();
        } else {
            return retType;
        }
    }
    
    protected void registerSqlCommand(String sqlCommandKey, Method method, String sql, String[] argNames, Class[] argTypes, BeanMetaData myBeanMetaData) {
        registerSqlCommand(sqlCommandKey, method, sql, argNames, argTypes, createResultSetHandler(myBeanMetaData, method));
    }

    protected void registerSqlCommand(String sqlCommandKey, Method method, String sql, String[] argNames, Class[] argTypes, ResultSetHandler myResultSetHandler) {
        final S2DaoSelectDynamicCommand cmd = createCustomizeSelectDynamicCommand(myResultSetHandler);
        registerSqlCommand(sqlCommandKey, method, sql, argNames, argTypes, cmd);
    }

    protected void registerSqlCommand(String sqlCommandKey, Method method, String sql, String[] argNames, Class[] argTypes, S2DaoSelectDynamicCommand cmd) {
        cmd.setSql(sql);
        cmd.setArgNames(argNames);
        cmd.setArgTypes(argTypes);
        this.sqlCommands.put(sqlCommandKey, cmd);
    }

    protected void registerSqlCommand(String sqlCommandKey, Method method, String sql, String[] argNames, Class[] argTypes, InternalUpdateDynamicCommand cmd) {
        cmd.setSql(sql);
        cmd.setArgNames(argNames);
        cmd.setArgTypes(argTypes);
        this.sqlCommands.put(sqlCommandKey, cmd);
    }

    // ===================================================================================
    //                                                                     Common Handlnig
    //                                                                     ===============
    @Override
    protected void putSqlCommand(String methodName, SqlCommand cmd) {
        sqlCommands.put(methodName, cmd);
    }
    
    protected boolean isCheckSingleRowUpdate(Method method) {
        return checkSingleRowUpdateForAll & daoAnnotationReader.isCheckSingleRowUpdate(method);
    }

    // ===================================================================================
    //                                             Customize SelectDynamicCommand Creation
    //                                             =======================================
    /**
     * Create the customize select dynamic command that is for all select SQL on DBFlute.
     * @param handler The handler of result set. (NotNull)
     * @return The customize select dynamic command. (NotNull)
     */
    protected S2DaoSelectDynamicCommand createCustomizeSelectDynamicCommand(ResultSetHandler handler) {
        return new S2DaoSelectDynamicCommand(dataSource, statementFactory, handler);
    }

    // ===================================================================================
    //                                                           ResultSetHandler Override
    //                                                           =========================
    @Override
    protected ResultSetHandler createResultSetHandler(Method method) {
        return this.resultSetHandlerFactory.getResultSetHandler(daoAnnotationReader, beanMetaData, method);
    }

    protected ResultSetHandler createResultSetHandler(BeanMetaData specifiedBeanMetaData, Method method) {// For specified BeanMetaData
        return this.resultSetHandlerFactory.getResultSetHandler(daoAnnotationReader, specifiedBeanMetaData, method);
    }

    // ===================================================================================
    //                                                                      JDBC Delegator
    //                                                                      ==============
    protected Connection getConnection() {
        if (dataSource == null) {
            throw new IllegalStateException("The dataSource should not be null!");
        }
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            handleSQLException(e, null);
            return null;// Unreachable!
        }
    }

    protected DatabaseMetaData getMetaData(Connection conn) {
        try {
            return conn.getMetaData();
        } catch (SQLException e) {
            handleSQLException(e, null);
            return null;// Unreachable!
        }
    }

    protected String getDatabaseProductName(DatabaseMetaData dbMetaData) {
        try {
            return dbMetaData.getDatabaseProductName();
        } catch (SQLException e) {
            handleSQLException(e, null);
            return null;// Unreachable!
        }
    }

    protected void close(Connection conn) {
        if (conn == null) {
            return;
        }
        try {
            conn.close();
        } catch (SQLException e) {
            handleSQLException(e, null);
        }
    }

    // ===================================================================================
    //                                                                  Exception Handlnig
    //                                                                  ==================
    protected void handleSQLException(SQLException e, Statement statement) {
        new SQLExceptionHandler().handleSQLException(e, statement);
    }

    // ===================================================================================
    //                                               ResultSetHandlerFactoryImpl Extension
    //                                               =====================================
    public static class ResultSetHandlerFactoryExtension extends ResultSetHandlerFactoryImpl {
        public ResultSetHandlerFactoryExtension() {
            super();
        }

        @Override
        protected RowCreator createRowCreator() { // [DAO-118] (2007/08/25)
            return createInternalRowCreator(null);
        }

        @Override
        protected RelationRowCreator createRelationRowCreator() {
            return createInternalRelationRowCreator(null);
        }
        
        @Override
        protected ResultSetHandler createBeanListMetaDataResultSetHandler(BeanMetaData bmd) { // DBFlute Target
            final InternalRowCreator rowCreator = createInternalRowCreator(bmd);
            final InternalRelationRowCreator relationRowCreator = createInternalRelationRowCreator(bmd);
            return new InternalBeanListMetaDataResultSetHandler(bmd, rowCreator, relationRowCreator);
        }
        
        @Override
        protected ResultSetHandler createBeanArrayMetaDataResultSetHandler(BeanMetaData bmd) { // DBFlute Target
            final InternalRowCreator rowCreator = createInternalRowCreator(bmd);
            final InternalRelationRowCreator relationRowCreator = createInternalRelationRowCreator(bmd);
            return new InternalBeanArrayMetaDataResultSetHandler(bmd, rowCreator, relationRowCreator);
        }

        protected InternalRowCreator createInternalRowCreator(BeanMetaData bmd) {
            final Class<?> clazz = bmd != null ? bmd.getBeanClass() : null;
            return InternalRowCreator.createInternalRowCreator(clazz);
        }

        protected InternalRelationRowCreator createInternalRelationRowCreator(BeanMetaData bmd) {
            return new InternalRelationRowCreator(); // Not yet implemented about performance tuning!
        }
    }

    // ===================================================================================
    //                                                                       Vert Internal
    //                                                                       =============
    protected static class InternalMethodUtil {
        public static Class getElementTypeOfListFromReturnMethod(Method method) {
            return InternalReflectionUtil.getElementTypeOfListFromReturnType(method);
        }
    }
    protected static class InternalReflectionUtil {
        public static Class<?> getElementTypeOfList(final Type parameterizedList) {
            if (!(parameterizedList instanceof ParameterizedType)) {
                return null;
            }
            final ParameterizedType parameterizedType = ParameterizedType.class.cast(parameterizedList);
            final Type rawType = parameterizedType.getRawType();
            if (!(rawType instanceof Class)) {
                return null;
            }
            final Class<?> rawClass = Class.class.cast(rawType);
            if (!rawClass.isAssignableFrom(List.class)) {
                return null;
            }
            final Type[] actualTypeArgument = parameterizedType.getActualTypeArguments();
            if (actualTypeArgument == null || actualTypeArgument.length != 1) {
                return null;
            }
            if (!(actualTypeArgument[0] instanceof Class)) {
                return null;
            }
            return Class.class.cast(actualTypeArgument[0]);
        }
        public static Class<?> getElementTypeOfListFromParameterType(final Method method, final int parameterPosition) {
            final Type[] pmbTypes = method.getGenericParameterTypes();
            return getElementTypeOfList(pmbTypes[parameterPosition]);
        }
        public static Class<?> getElementTypeOfListFromReturnType(final Method method) {
            return getElementTypeOfList(method.getGenericReturnType());
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected DBMeta findDBMeta() {
        final Class<?> beanType = getBeanClass();
        if (beanType == null) {
            return null;
        }
        if (!Entity.class.isAssignableFrom(beanType)) {
            return null;
        }
        final Entity entity;
        try {
            entity = (Entity)beanType.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
        return entity.getDBMeta();
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String getLineSeparator() {
        return SimpleSystemUtil.getLineSeparator();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // -----------------------------------------------------
    //                                     Sql File Encoding
    //                                     -----------------
    public String getSqlFileEncoding() {
        return sqlFileEncoding;
    }

    // -----------------------------------------------------
    //                                         Bean Enhancer
    //                                         -------------
    public BeanEnhancer getBeanEnhancer() {
        return beanEnhancer;
    }

    public void setBeanEnhancer(final BeanEnhancer beanEnhancer) {
        this.beanEnhancer = beanEnhancer;
    }

    // -----------------------------------------------------
    //                             Annotation Reader Factory
    //                             -------------------------
    public void setAnnotationReaderFactory(org.seasar.dao.AnnotationReaderFactory annotationReaderFactory) {
        this.annotationReaderFactory = annotationReaderFactory;
    }

    // -----------------------------------------------------
    //                                  Version After 1.0.47
    //                                  --------------------
    public ColumnNaming getColumnNaming() {
        return columnNaming;
    }

    public void setColumnNaming(final ColumnNaming columnNaming) {
        this.columnNaming = columnNaming;
    }

    public PropertyTypeFactoryBuilder getPropertyTypeFactoryBuilder() {
        return propertyTypeFactoryBuilder;
    }

    public void setPropertyTypeFactoryBuilder(final PropertyTypeFactoryBuilder propertyTypeFactoryBuilder) {
        this.propertyTypeFactoryBuilder = propertyTypeFactoryBuilder;
    }

    public RelationPropertyTypeFactoryBuilder getRelationPropertyTypeFactoryBuilder() {
        return relationPropertyTypeFactoryBuilder;
    }

    public void setRelationPropertyTypeFactoryBuilder(final RelationPropertyTypeFactoryBuilder relationPropertyTypeFactoryBuilder) {
        this.relationPropertyTypeFactoryBuilder = relationPropertyTypeFactoryBuilder;
    }

    public TableNaming getTableNaming() {
        return tableNaming;
    }

    public void setTableNaming(final TableNaming tableNaming) {
        this.tableNaming = tableNaming;
    }

    // -----------------------------------------------------
    //                                     DBFlute Extension
    //                                     -----------------
    public BehaviorSelector getBehaviorSelector() {
        return _behaviorSelector;
    }

    public void setBehaviorSelector(final BehaviorSelector behaviorSelector) {
        this._behaviorSelector = behaviorSelector;
    }
    
    public boolean isInternalDebug() {
        return _internalDebug;
    }

    public void setInternalDebug(final boolean internalDebug) {
        this._internalDebug = internalDebug;
    }
}
