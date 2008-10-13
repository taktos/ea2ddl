package jp.sourceforge.ea2ddl.dao.allcommon;

import jp.sourceforge.ea2ddl.dao.allcommon.DBFluteConfig;

/**
 * @author DBFlute(AutoGenerator)
 */
public class QLog {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(QLog.class);

    // ===================================================================================
    //                                                                             Logging
    //                                                                             =======
	public static void log(String sql) {// Very Internal
		if (isQueryLogLevelInfo()) {
	        _log.info(sql);
		} else {
	        _log.debug(sql);
		}
	}
	
	public static boolean isLogEnabled() {
		if (isQueryLogLevelInfo()) {
	        return _log.isInfoEnabled();
		} else {
	        return _log.isDebugEnabled();
		}
	}
	
	protected static boolean isQueryLogLevelInfo() {
	    return DBFluteConfig.getInstance().isQueryLogLevelInfo();
	}
}
