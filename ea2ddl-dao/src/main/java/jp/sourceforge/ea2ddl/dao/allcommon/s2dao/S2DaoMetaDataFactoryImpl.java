package jp.sourceforge.ea2ddl.dao.allcommon.s2dao;

import java.util.HashMap;
import java.util.Map;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;
import javax.sql.XADataSource;

import org.seasar.framework.beans.BeanDesc;
import org.seasar.framework.beans.factory.BeanDescFactory;
import org.seasar.framework.util.Disposable;
import org.seasar.framework.util.DisposableUtil;
import org.seasar.extension.jdbc.ResultSetFactory;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.AnnotationReaderFactory;
import org.seasar.dao.BeanEnhancer;
import org.seasar.dao.BeanMetaDataFactory;
import org.seasar.dao.ColumnNaming;
import org.seasar.dao.DaoAnnotationReader;
import org.seasar.dao.DaoMetaData;
import org.seasar.dao.DaoMetaDataFactory;
import org.seasar.dao.DaoNamingConvention;
import org.seasar.dao.DtoMetaDataFactory;
import org.seasar.dao.ProcedureMetaDataFactory;
import org.seasar.dao.PropertyTypeFactoryBuilder;
import org.seasar.dao.RelationPropertyTypeFactoryBuilder;
import org.seasar.dao.ResultSetHandlerFactory;
import org.seasar.dao.TableNaming;
import org.seasar.dao.ValueTypeFactory;
import org.seasar.dao.impl.DaoMetaDataImpl;
import org.seasar.dao.pager.PagingSqlRewriter;

import jp.sourceforge.ea2ddl.dao.allcommon.DBFluteConfig;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBeanContext;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.OutsideSqlContext;
import jp.sourceforge.ea2ddl.dao.allcommon.jdbc.StatementConfig;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqllog.InternalSqlLogRegistry;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalBasicHandler.SQLExceptionHandler;

/**
 * The implementation of DaoMetaDataFactory for DBFlute.
 * @author DBFlute(AutoGenerator)
 */
public class S2DaoMetaDataFactoryImpl implements DaoMetaDataFactory, Disposable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log-instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(S2DaoMetaDataFactoryImpl.class);

    // -----------------------------------------------------
    //                                           For Logging
    //                                           -----------
    /** The binding annotation for xaDataSource. {bindingType=may} */
    public static final String xaDataSource_BINDING = "bindingType=may";

    // -----------------------------------------------------
    //                                         Factory Basic
    //                                         -------------
    public static final String dataSource_BINDING = "bindingType=must";

    public static final String annotationReaderFactory_BINDING = "bindingType=must";

    public static final String valueTypeFactory_BINDING = "bindingType=must";

    public static final String beanMetaDataFactory_BINDING = "bindingType=must";

    public static final String daoNamingConvention_BINDING = "bindingType=must";

    public static final String resultSetHandlerFactory_BINDING = "bindingType=must";

    public static final String dtoMetaDataFactory_BINDING = "bindingType=must";

    public static final String procedureMetaDataFactory_BINDING = "bindingType=must";

    public static final String pagingSQLRewriter_BINDING = "bindingType=may";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                         Factory Basic
    //                                         -------------
    protected DataSource dataSource;

    protected AnnotationReaderFactory annotationReaderFactory;

    protected ValueTypeFactory valueTypeFactory;

    protected BeanMetaDataFactory beanMetaDataFactory;

    protected DaoNamingConvention daoNamingConvention;

    protected ResultSetHandlerFactory resultSetHandlerFactory;

    protected DtoMetaDataFactory dtoMetaDataFactory;

    protected ProcedureMetaDataFactory procedureMetaDataFactory;

    protected PagingSqlRewriter pagingSqlRewriter;

    protected Map<String, DaoMetaData> daoMetaDataCache = new HashMap<String, DaoMetaData>();

    protected boolean initialized;

    protected boolean useDaoClassForLog;

    protected String sqlFileEncoding;
    
    protected BeanEnhancer beanEnhancer;

    // -----------------------------------------------------
    //                                  Version After 1.0.47
    //                                  --------------------
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
    /** The lock monitor of DAO meta data initialization. */
    protected Object _daoMetaDataInitializationLockMonitor = new Object();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public S2DaoMetaDataFactoryImpl(DataSource dataSource
                                  , AnnotationReaderFactory annotationReaderFactory
                                  , XADataSource xaDataSource) {
        this.dataSource = dataSource;
        this.annotationReaderFactory = annotationReaderFactory;

        _log.info("/* * * * * * * * * * * * * * * * * * * * * * * * * * * * {DBFlute}");
        showInformation(dataSource, xaDataSource);

        // Stop the LinkageError!
        ConditionBeanContext.initialize();

        initializeDatabaseProductNameOfContext(xaDataSource);

        final StringBuilder sb = new StringBuilder();
        sb.append("{SqlLog Information}").append(getLineSeparator());
        sb.append("  [SqlLogRegistry]").append(getLineSeparator());
        final Object sqlLogRegistry = InternalSqlLogRegistry.findContainerSqlLogRegistry();
        if (sqlLogRegistry != null) {
            InternalSqlLogRegistry.closeRegistration();
            sb.append("    SqlLogRegistry(org.seasar.extension.jdbc) is close! It's default for DBFlute.").append(getLineSeparator());
            sb.append("    If you want to use this, set SqlLogRegistry to SqlLogRegistryLocator at yourself.");
        } else {
            sb.append("    SqlLogRegistry(org.seasar.extension.jdbc) was not found!");
        }
        _log.info(sb);
        
        DBFluteConfig.getInstance().lock();
        _log.info("* * * * */");
    }

    protected void showInformation(javax.sql.DataSource dataSource, javax.sql.XADataSource xaDataSource) {
        final StringBuilder sb = new StringBuilder();
        if (xaDataSource != null && xaDataSource instanceof org.seasar.extension.dbcp.impl.XADataSourceImpl) {
            final org.seasar.extension.dbcp.impl.XADataSourceImpl xaDataSourceImpl = (org.seasar.extension.dbcp.impl.XADataSourceImpl)xaDataSource;
            final String driverClassName = xaDataSourceImpl.getDriverClassName();
            final String url = xaDataSourceImpl.getURL();
            final String user = xaDataSourceImpl.getUser();
            sb.append("  [XADataSource]:").append(getLineSeparator());
            sb.append("    driver = " + driverClassName).append(getLineSeparator());
            sb.append("    url    = " + url).append(getLineSeparator());
            sb.append("    user   = " + user);
        }
        _log.info("{Injection Information}" + getLineSeparator() + sb);
    }

    // -----------------------------------------------------
    //                                 Database Product Name
    //                                 ---------------------
    protected void initializeDatabaseProductNameOfContext(javax.sql.XADataSource xaDataSource) {
        if (getDatabaseProductNameFromContext() != null) {
            return;
        }

        // From JDBC Driver!
        if (xaDataSource != null && xaDataSource instanceof org.seasar.extension.dbcp.impl.XADataSourceImpl) {
            final org.seasar.extension.dbcp.impl.XADataSourceImpl xaDataSourceImpl = (org.seasar.extension.dbcp.impl.XADataSourceImpl)xaDataSource;
            final String driverClassName = xaDataSourceImpl.getDriverClassName();
            if (driverClassName != null) {
                if (setupDatabaseProductNameByDriverClassName(driverClassName)) {
                    _log.info("...Initializing database product name from driverClassName: " + getDatabaseProductNameFromContext());
                    return;
                }
            }
        }

        _log.info("...Initializing database product name as default: Default");
        setDatabaseProductNameToContext("Default");
    }

    protected String getDatabaseProductNameFromContext() {
        return ConditionBeanContext.getDatabaseProductName();
    }

    protected void setDatabaseProductNameToContext(String name) {
        ConditionBeanContext.setDatabaseProductName(name);
    }

    protected boolean setupDatabaseProductNameByDriverClassName(String driverClassName) {
        return ConditionBeanContext.setupDatabaseProductNameByDriverClassName(driverClassName);
    }

    // ===================================================================================
    //                                                                      Implementation
    //                                                                      ==============
    @SuppressWarnings("unchecked")
    public DaoMetaData getDaoMetaData(final Class daoClass) {
        if (!initialized) {
            DisposableUtil.add(this);
            initialized = true;
        }
        final String key = daoClass.getName();
        
        // [A]
        DaoMetaData dmd = getSynchronizedDaoMetaDataCache(key);
        
        // [B]
        if (dmd != null) {
            return dmd;
        }
        
        // [C]
        synchronized (_daoMetaDataInitializationLockMonitor) {// One Thread Only Entered
            // [D]
            dmd = getSynchronizedDaoMetaDataCache(key);
            // [E]
            if (dmd != null) {
                // The second thread that stops at [C] can find
                // because the first thread have already initialized.
                if (_log.isDebugEnabled()) {
                    _log.debug("...Getting daoMetaData as cache because the previous thread have already initilized.");
                }
                return dmd;
            }
            // [F]
            if (_log.isDebugEnabled()) {
                _log.debug("...Creating daoMetaData for " + daoClass.getSimpleName() + ".");
            }
            final DaoMetaData dmdi = createDaoMetaData(daoClass);
            putSynchronizedDaoMetaDataCache(key, dmdi);
        }
        // [G]
        dmd = getSynchronizedDaoMetaDataCache(key);
        if (dmd != null) {
            return dmd;
        }
        String msg = "The cache should have data meta data here: key=" + key + " cache=" + daoMetaDataCache;
        throw new IllegalStateException(msg);
    }
    
    @SuppressWarnings("unchecked")
    protected void putSynchronizedDaoMetaDataCache(String key, DaoMetaData dmd) {
        synchronized (daoMetaDataCache) {
            daoMetaDataCache.put(key, dmd);
        }
    }
    
    protected DaoMetaData getSynchronizedDaoMetaDataCache(String key) {
        DaoMetaData dmd = null;
        synchronized (daoMetaDataCache) {
            dmd = (DaoMetaData) daoMetaDataCache.get(key);
        }
        return dmd;
    }

    // ===================================================================================
    //                                                               DataMetaData Creation
    //                                                               =====================
    protected DaoMetaData createDaoMetaData(final Class<?> daoClass) {
        final BeanDesc daoBeanDesc = BeanDescFactory.getBeanDesc(daoClass);
        final DaoAnnotationReader daoAnnotationReader = annotationReaderFactory.createDaoAnnotationReader(daoBeanDesc);

        final DaoMetaDataImpl daoMetaData = createDaoMetaDataExtension();
        daoMetaData.setDaoClass(daoClass);
        daoMetaData.setDataSource(dataSource);
        daoMetaData.setStatementFactory(createCustomizeStatememtFactory());
        daoMetaData.setResultSetFactory(createCustomizeResultSetFactory());
        daoMetaData.setValueTypeFactory(valueTypeFactory);
        daoMetaData.setBeanMetaDataFactory(getBeanMetaDataFactory());
        daoMetaData.setDaoNamingConvention(getDaoNamingConvention());
        daoMetaData.setUseDaoClassForLog(useDaoClassForLog);
        daoMetaData.setDaoAnnotationReader(daoAnnotationReader);
        daoMetaData.setProcedureMetaDataFactory(procedureMetaDataFactory);
        daoMetaData.setDtoMetaDataFactory(dtoMetaDataFactory);
        daoMetaData.setResultSetHandlerFactory(resultSetHandlerFactory);
        if (sqlFileEncoding != null) {
            daoMetaData.setSqlFileEncoding(sqlFileEncoding);
        }
        if (pagingSqlRewriter != null) {
            daoMetaData.setPagingSQLRewriter(pagingSqlRewriter);
        }
        daoMetaData.initialize();
        return daoMetaData;
    }
    
    protected S2DaoMetaDataExtension createDaoMetaDataExtension() {
        final S2DaoMetaDataExtension dmdExtension = newDaoMetaDataExtension();
        dmdExtension.setBeanEnhancer(beanEnhancer);
        dmdExtension.setAnnotationReaderFactory(this.annotationReaderFactory);
        dmdExtension.setColumnNaming(this.columnNaming);
        dmdExtension.setPropertyTypeFactoryBuilder(this.propertyTypeFactoryBuilder);
        dmdExtension.setRelationPropertyTypeFactoryBuilder(this.relationPropertyTypeFactoryBuilder);
        dmdExtension.setTableNaming(tableNaming);
        dmdExtension.setInternalDebug(DBFluteConfig.getInstance().isInternalDebug());
        return dmdExtension;
    }

    protected S2DaoMetaDataExtension newDaoMetaDataExtension() {
        return new S2DaoMetaDataExtension();
    }

    // ===================================================================================
    //                                                                  Result Set Factory
    //                                                                  ==================
    /**
     * Create the customize result set factory that is for all SQL on DBFlute.
     * @return The customize statement factory. (NotNull)
     */
    protected ResultSetFactory createCustomizeResultSetFactory() {
        return new FetchNarrowingResultSetFactory();
    }

    // ===================================================================================
    //                                                                   Statement Factory
    //                                                                   =================
    /**
     * Create the customize statement factory that is for all SQL on DBFlute.
     * @return The customize statement factory. (NotNull)
     */
    protected StatementFactory createCustomizeStatememtFactory() {
        final StatementConfig defaultStatementConfig = DBFluteConfig.getInstance().getDefaultStatementConfig();
        final boolean internalDebug = DBFluteConfig.getInstance().isInternalDebug();
        return new StatementFactory() {
            public PreparedStatement createPreparedStatement(Connection con, String sql) {
                try {
                    final StatementConfig config = findStatementConfigOnThread();;
                    final int resultSetType;
                    if (config != null && config.hasResultSetType()) {
                        resultSetType = config.getResultSetType();
                    } else if (defaultStatementConfig != null && defaultStatementConfig.hasResultSetType()) {
                        resultSetType = defaultStatementConfig.getResultSetType();
                    } else {
                        resultSetType = java.sql.ResultSet.TYPE_FORWARD_ONLY;
                    }
                    final int resultSetConcurrency = java.sql.ResultSet.CONCUR_READ_ONLY;
                    if (internalDebug) {
                        _log.debug("...Creating prepareStatement(sql, " + resultSetType + ", " + resultSetConcurrency + ")");
                    }
                    final PreparedStatement ps = con.prepareStatement(sql, resultSetType, resultSetConcurrency);
                    if (config != null && config.hasStatementOptions()) {
                        if (internalDebug) {
                            _log.debug("...Setting statement config as request: " + config);
                        }
                        reflectStatementOptions(config, ps);
                    } else {
                        reflectDefaultOptionsToStatementIfNeeds(ps);
                    }
                    return ps;
                } catch (SQLException e) {
                    handleSQLException(e, null);
                    return null;// Unreachable!
                }
            }
            public CallableStatement createCallableStatement(Connection conn, String sql) {
                return prepareCall(conn, sql);
            }
            protected StatementConfig findStatementConfigOnThread() {
                final StatementConfig config;
                if (ConditionBeanContext.isExistConditionBeanOnThread()) {
                    final ConditionBean cb = ConditionBeanContext.getConditionBeanOnThread();
                    config = cb.getStatementConfig();
                } else if (OutsideSqlContext.isExistOutsideSqlContextOnThread()) {
                    final OutsideSqlContext context = OutsideSqlContext.getOutsideSqlContextOnThread();
                    config = context.getStatementConfig();
                } else {
                    config = null;
                }
                return config;
            }
            protected void reflectDefaultOptionsToStatementIfNeeds(PreparedStatement ps) {
                if (defaultStatementConfig != null && defaultStatementConfig.hasStatementOptions()) {
                    if (internalDebug) {
                        _log.debug("...Setting statement config as default: " + defaultStatementConfig);
                    }
                    reflectStatementOptions(defaultStatementConfig, ps);
                    return;
                }
            }
            protected void reflectStatementOptions(StatementConfig config, PreparedStatement ps) {
                try {
                    if (config.hasQueryTimeout()) {
                        ps.setQueryTimeout(config.getQueryTimeout());
                    }
                    if (config.hasFetchSize()) {
                        ps.setFetchSize(config.getFetchSize());
                    }
                    if (config.hasMaxRows()) {
                        ps.setMaxRows(config.getMaxRows());
                    }
                } catch (SQLException e) {
                    handleSQLException(e, ps);
                }
            }
            protected CallableStatement prepareCall(Connection conn, String sql) {
                try {
                    return conn.prepareCall(sql);
                } catch (SQLException e) {
                    handleSQLException(e, null);
                    return null;// Unreachable!
                }
            }
            protected void handleSQLException(SQLException e, Statement statement) {
                new SQLExceptionHandler().handleSQLException(e, statement);
            }
        };
    }

    // ===================================================================================
    //                                                                             Dispose
    //                                                                             =======
    public synchronized void dispose() {
        daoMetaDataCache.clear();
        initialized = false;
    }

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    /**
     * Get the value of line separator.
     * @return The value of line separator. (NotNull)
     */
    protected static String getLineSeparator() {
        return System.getProperty("line.separator");
    }
    
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // -----------------------------------------------------
    //                                         Factory Basic
    //                                         -------------
    public void setValueTypeFactory(final ValueTypeFactory valueTypeFactory) {
        this.valueTypeFactory = valueTypeFactory;
    }

    protected BeanMetaDataFactory getBeanMetaDataFactory() {
        return beanMetaDataFactory;
    }

    public void setBeanMetaDataFactory(final BeanMetaDataFactory beanMetaDataFactory) {
        this.beanMetaDataFactory = beanMetaDataFactory;
    }

    public DaoNamingConvention getDaoNamingConvention() {
        return daoNamingConvention;
    }

    public void setDaoNamingConvention(final DaoNamingConvention daoNamingConvention) {
        this.daoNamingConvention = daoNamingConvention;
    }

    public void setAnnotationReaderFactory(final AnnotationReaderFactory annotationReaderFactory) {
        this.annotationReaderFactory = annotationReaderFactory;
    }

    public void setDataSource(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setUseDaoClassForLog(final boolean userDaoClassForLog) {
        useDaoClassForLog = userDaoClassForLog;
    }

    public void setResultSetHandlerFactory(final ResultSetHandlerFactory resultSetHandlerFactory) {
        this.resultSetHandlerFactory = resultSetHandlerFactory;
    }

    public void setDtoMetaDataFactory(final DtoMetaDataFactory dtoMetaDataFactory) {
        this.dtoMetaDataFactory = dtoMetaDataFactory;
    }

    public void setProcedureMetaDataFactory(ProcedureMetaDataFactory procedureMetaDataFactory) {
        this.procedureMetaDataFactory = procedureMetaDataFactory;
    }

    public void setPagingSQLRewriter(final PagingSqlRewriter pagingSqlRewriter) {
        this.pagingSqlRewriter = pagingSqlRewriter;
    }
    
    public String getSqlFileEncoding() {
        return sqlFileEncoding;
    }

    public void setSqlFileEncoding(final String encoding) {
        sqlFileEncoding = encoding;
    }
    
    public BeanEnhancer getBeanEnhancer() {
        return beanEnhancer;
    }

    public void setBeanEnhancer(final BeanEnhancer beanEnhancer) {
        this.beanEnhancer = beanEnhancer;
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
}