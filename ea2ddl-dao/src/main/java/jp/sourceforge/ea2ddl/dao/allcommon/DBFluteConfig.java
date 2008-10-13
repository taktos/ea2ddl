package jp.sourceforge.ea2ddl.dao.allcommon;

import jp.sourceforge.ea2ddl.dao.allcommon.jdbc.StatementConfig;

/**
 * @author DBFlute(AutoGenerator)
 */
public class DBFluteConfig {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(DBFluteConfig.class);
	
    /** Singleton instance. */
    private static final DBFluteConfig _instance = new DBFluteConfig();

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
	protected StatementConfig _defaultStatementConfig;
	protected boolean _conditionBeanFormatSql = true;// This is for compatibility!
	protected boolean _queryLogLevelInfo;
	protected boolean _executeStatusLogLevelInfo;
	protected UniqueConstraintDeterminator _uniqueConstraintDeterminator;
	protected boolean _sqlExceptionOldStyleHandling = false;// This is for compatibility!
	protected String _logDateFormat;
	protected String _logTimestampFormat;
    protected String _outsideSqlPackage;
	protected boolean _internalDebug;
	protected boolean _locked = true;
	
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     */
    private DBFluteConfig() {
    }

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    /**
     * Get instance.
     * @return Singleton instance. (NotNull)
     */
    public static DBFluteConfig getInstance() {
        return _instance;
    }

    // ===================================================================================
    //                                                            Default Statement Config
    //                                                            ========================
    public StatementConfig getDefaultStatementConfig() {
        return _defaultStatementConfig;
    }
	
    public void setDefaultStatementConfig(StatementConfig defaultStatementConfig) {
	    assertNotLocked();
	    if (_log.isInfoEnabled()) {
		    _log.info("...Setting defaultStatementConfig: " + defaultStatementConfig);
		}
        _defaultStatementConfig = defaultStatementConfig;
    }
	
    // ===================================================================================
    //                                                            ConditionBean Format Sql
    //                                                            ========================
	public boolean isConditionBeanFormatSql() {
	    return _conditionBeanFormatSql;
	}

    /**
     * @param conditionBeanFormatSql The value of the config.
     * @deprecated This is for compatibility!
     */
	public void setConditionBeanFormatSql(boolean conditionBeanFormatSql) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting conditionBeanFormatSql: " + conditionBeanFormatSql);
		}
	    _conditionBeanFormatSql = conditionBeanFormatSql;
	}
	
    // ===================================================================================
    //                                                                Query Log Level Info
    //                                                                ====================
	public boolean isQueryLogLevelInfo() {
	    return _queryLogLevelInfo;
	}
	
	public void setQueryLogLevelInfo(boolean queryLogLevelInfo) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting queryLogLevelInfo: " + queryLogLevelInfo);
		}
	    _queryLogLevelInfo = queryLogLevelInfo;
	}
	
    // ===================================================================================
    //                                                       Execute Status Log Level Info
    //                                                       =============================
	public boolean isExecuteStatusLogLevelInfo() {
	    return _executeStatusLogLevelInfo;
	}
	
	public void setExecuteStatusLogLevelInfo(boolean executeStatusLogLevelInfo) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting executeStatusLogLevelInfo: " + executeStatusLogLevelInfo);
		}
	    _executeStatusLogLevelInfo = executeStatusLogLevelInfo;
	}

    // [DBFlute-0.7.7]
    // ===================================================================================
    //                                                                   Unique Constraint
    //                                                                   =================
	public UniqueConstraintDeterminator getUniqueConstraintDeterminator() {
	    return _uniqueConstraintDeterminator;
	}

	public void setUniqueConstraintDeterminator(UniqueConstraintDeterminator uniqueConstraintDeterminator) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting uniqueConstraintDeterminator: " + uniqueConstraintDeterminator);
		}
	    _uniqueConstraintDeterminator = uniqueConstraintDeterminator;
	}

    public static interface UniqueConstraintDeterminator {
        public boolean isUniqueConstraintException(Throwable t);
    }

    // [DBFlute-0.7.7]
    // ===================================================================================
    //                                                             SQL Exception Old Style
    //                                                             =======================
	public boolean isSqlExceptionOldStyleHandling() {
	    return _sqlExceptionOldStyleHandling;
	}

    /**
     * @param sqlExceptionOldStyleHandling The value of the config.
     * @deprecated This is for compatibility!
     */
	public void setSqlExceptionOldStyleHandling(boolean sqlExceptionOldStyleHandling) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting sqlExceptionOldStyleHandling: " + sqlExceptionOldStyleHandling);
		}
	    _sqlExceptionOldStyleHandling = sqlExceptionOldStyleHandling;
	}

    // ===================================================================================
    //                                                                          Log Format
    //                                                                          ==========
	public String getLogDateFormat() {
	    return _logDateFormat;
	}
	
	public void setLogDateFormat(String logDateFormat) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting logDateFormat: " + logDateFormat);
		}
	    _logDateFormat = logDateFormat;
	}

	public String getLogTimestampFormat() {
	    return _logTimestampFormat;
	}
	
	public void setLogTimestampFormat(String logTimestampFormat) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting logTimestampFormat: " + logTimestampFormat);
		}
	    _logTimestampFormat = logTimestampFormat;
	}
	
    // ===================================================================================
    //                                                                  OutsideSql Package
    //                                                                  ==================
	public String getOutsideSqlPackage() {
	    return _outsideSqlPackage;
	}
	
	public void setOutsideSqlPackage(String outsideSqlPackage) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting outsideSqlPackage: " + outsideSqlPackage);
		}
	    _outsideSqlPackage = outsideSqlPackage;
	}
    
    // ===================================================================================
    //                                                                      Internal Debug
    //                                                                      ==============
	public boolean isInternalDebug() {
	    return _internalDebug;
	}
	
	public void setInternalDebug(boolean internalDebug) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting internalDebug: " + internalDebug);
		}
	    _internalDebug = internalDebug;
	}
	
    // ===================================================================================
    //                                                                         Config Lock
    //                                                                         ===========
	public boolean isLocked() {
	    return _locked;
	}
	
	public void lock() {
		if (_log.isInfoEnabled()) {
		    _log.info("...Locking the config of dbflute!");
		}
	    _locked = true;
	}
	
	public void unlock() {
		if (_log.isInfoEnabled()) {
		    _log.info("...Unlocking the config of dbflute!");
		}
	    _locked = false;
	}
	
	protected void assertNotLocked() {
	    if (!isLocked()) {
		    return;
		}
		String msg = "The config of dbflute is locked! Don't access at this timing!";
		throw new IllegalStateException(msg);
	}
	
    // ===================================================================================
    //                                                                        Config Clear
    //                                                                        ============
	public void clear() {
	    _defaultStatementConfig = null;
	    _conditionBeanFormatSql = true;
	    _queryLogLevelInfo = false;
	    _executeStatusLogLevelInfo = false;
	    _logDateFormat = null;
	    _logTimestampFormat = null;
		_internalDebug = false;
	}
}