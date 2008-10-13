package jp.sourceforge.ea2ddl.dao.allcommon;

import jp.sourceforge.ea2ddl.dao.allcommon.DBFluteConfig;

/**
 * @author DBFlute(AutoGenerator)
 */
public class XLog {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(XLog.class);

    // ===================================================================================
    //                                                                             Logging
    //                                                                             =======
	public static void log(String msg) {// Very Internal
		if (isExecuteStatusLogLevelInfo()) {
	        _log.info(msg);
		} else {
	        _log.debug(msg);
		}
	}
	
    public static boolean isLogEnabled() {// Very Internal
		if (isExecuteStatusLogLevelInfo()) {
	        return _log.isInfoEnabled();
		} else {
	        return _log.isDebugEnabled();
		}
	}
	
	protected static boolean isExecuteStatusLogLevelInfo() {
	    return DBFluteConfig.getInstance().isExecuteStatusLogLevelInfo();
	}
}
