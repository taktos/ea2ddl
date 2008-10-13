package jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.framework.util.InputStreamReaderUtil;
import org.seasar.framework.util.ReaderUtil;
import org.seasar.framework.util.ResourceUtil;

import jp.sourceforge.ea2ddl.dao.allcommon.DBFluteConfig;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.jdbc.StatementConfig;
import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleStringUtil;
import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleSystemUtil;

/**
 * The context of outside-SQL.
 * @author DBFlute(AutoGenerator)
 */
public class OutsideSqlContext {

    /** Log instance. */
    private static final Log _log = LogFactory.getLog(OutsideSqlContext.class);
    
    // ===================================================================================
    //                                                                        Thread Local
    //                                                                        ============
    /** The thread-local for this. */
    private static final ThreadLocal<OutsideSqlContext> _threadLocal = new ThreadLocal<OutsideSqlContext>();

    /**
     * Get outside-SQL context on thread.
     * @return Outside-SQL context. (Nullable)
     */
    public static OutsideSqlContext getOutsideSqlContextOnThread() {
        return (OutsideSqlContext)_threadLocal.get();
    }

    /**
     * Set outside-SQL context on thread.
     * @param outsideSqlContext Outside-SQL context. (NotNull)
     */
    public static void setOutsideSqlContextOnThread(OutsideSqlContext outsideSqlContext) {
        if (outsideSqlContext == null) {
            String msg = "The argument[outsideSqlContext] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        _threadLocal.set(outsideSqlContext);
    }

    /**
     * Is existing outside-SQL context on thread?
     * 
     * @return Determination.
     */
    public static boolean isExistOutsideSqlContextOnThread() {
        return (_threadLocal.get() != null);
    }

    /**
     * Clear outside-SQL context on thread.
     */
    public static void clearOutsideSqlContextOnThread() {
        _threadLocal.set(null);
    }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    public static String generateSpecifiedOutsideSqlUniqueKey(String methodName, String path, Object pmb, OutsideSqlOption option, Object resultTypeSpecification) {
        final String pmbKey = (pmb != null ? pmb.getClass().getName() : "null");
        final String resultKey = (resultTypeSpecification != null ? ":" + resultTypeSpecification : "null");
        final String tableDbName = option.getTableDbName();
        final String generatedUniqueKey = option.generateUniqueKey();
        return methodName + "():" + tableDbName + ":" + path + ":" + pmbKey + ":" + generatedUniqueKey + resultKey;
    }

    // ===================================================================================
    //                                                                  Exception Handling
    //                                                                  ==================
    public static void throwOutsideSqlNotFoundException(String path) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The outsideSql was Not Found!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "Please confirm the existence of your target file of outsideSql on your classpath." + getLineSeparator();
        msg = msg + "And please confirm the file name and the file path STRICTLY!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Specified OutsideSql Path]" + getLineSeparator() + path + getLineSeparator();
        msg = msg + "* * * * * * * * * */" + getLineSeparator();
        throw new jp.sourceforge.ea2ddl.dao.allcommon.exception.OutsideSqlNotFoundException(msg);
    }

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                  Common of OutsideSql
    //                                  --------------------
    protected boolean _dynamicBinding;

    protected boolean _offsetByCursorForcedly;

    protected boolean _limitByCursorForcedly;

    // -----------------------------------------------------
    //                                  Specified OutsideSql
    //                                  --------------------
    /** The path of outside-sql. (The mark of Specified-OutsideSql) */
    protected String _outsideSqlPath;

    protected Object _parameterBean;

    protected Object _resultTypeSpecification;

    protected String _methodName;
    
    /** The config of statement. (Nullable) */
    protected StatementConfig _statementConfig;
    
    /** The DB name of table for using behavior-SQL-path. (Nullable) */
    protected String _tableDbName;

    // ===================================================================================
    //                                                                            Read SQL
    //                                                                            ========
    /**
     * @param sqlFileEncoding The encoding of SQL file. (NotNull)
     * @param dbmsSuffix The suffix of DBMS. (NotNull)
     * @return The filtered outside-SQL. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.OutsideSqlNotFoundException When the SQL is not found.
     */
    public String readFilteredOutsideSql(String sqlFileEncoding, String dbmsSuffix) {
        final String sql = readOutsideSql(sqlFileEncoding, dbmsSuffix);
        return replaceOutsideSqlBindCharacterOnLineComment(sql);
    }

    protected String replaceOutsideSqlBindCharacterOnLineComment(String sql) {
        final String bindCharacter = "?";
        if (sql.indexOf(bindCharacter) < 0) {
            return sql;
        }
        final String lineSeparator = "\n";
        if (sql.indexOf(lineSeparator) < 0) {
            return sql;
        }
        final String lineCommentMark = "--";
        if (sql.indexOf(lineCommentMark) < 0) {
            return sql;
        }
        final StringBuilder sb = new StringBuilder();
        final String[] lines = sql.split(lineSeparator);
        for (String line : lines) {
            final int lineCommentIndex = line.indexOf("--");
            if (lineCommentIndex < 0) {
                sb.append(line).append(lineSeparator);
                continue;
            }
            final String lineComment = line.substring(lineCommentIndex);
            if (lineComment.contains("ELSE") || !lineComment.contains(bindCharacter)) {
                sb.append(line).append(lineSeparator);
                continue;
            }
            
            if (_log.isDebugEnabled()) {
                _log.debug("...Replacing bind character on line comment: " + lineComment);
            }
            final String filteredLineComment = replaceString(lineComment, bindCharacter, "Q");
            sb.append(line.substring(0, lineCommentIndex)).append(filteredLineComment).append(lineSeparator);
        }
        return sb.toString();
    }
    
    /**
     * Read outside-sql path. Required attribute is 'outsideSqlPath'.
     * @param sqlFileEncoding The encoding of SQL file. (NotNull)
     * @param dbmsSuffix The suffix of DBMS. (NotNull)
     * @return The text of SQL. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.OutsideSqlNotFoundException When the SQL is not found.
     */
    public String readOutsideSql(String sqlFileEncoding, String dbmsSuffix) {
        final String standardPath = _outsideSqlPath;
        final String dbmsPath = buildDbmsPath(standardPath, dbmsSuffix);
        String sql;
        if (isExistResource(dbmsPath)) {
            sql = readText(dbmsPath, sqlFileEncoding);
        } else if (isExistResource(standardPath)) {
            sql = readText(standardPath, sqlFileEncoding);
        } else {
            throwOutsideSqlNotFoundException(standardPath);
            return null; // Non Reachable.
        }
        return removeInitialUnicodeBomIfNeeds(sqlFileEncoding, sql);
    }

    protected String buildDbmsPath(String standardPath, String dbmsSuffix) {
        final String dbmsPath;
        final int lastIndexOfDot = standardPath.lastIndexOf(".");
        if (lastIndexOfDot >= 0 && !standardPath.substring(lastIndexOfDot).contains("/")) {
            final String base = standardPath.substring(0, lastIndexOfDot);
            dbmsPath = base + dbmsSuffix + standardPath.substring(lastIndexOfDot);
        } else {
            dbmsPath = standardPath + dbmsSuffix;
        }
        return dbmsPath;
    }

    protected String removeInitialUnicodeBomIfNeeds(String sqlFileEncoding, String sql) {
        if ("UTF-8".equalsIgnoreCase(sqlFileEncoding) && sql.length() > 0 && sql.charAt(0) == '\uFEFF') {
            sql = sql.substring(1);
        }
        return sql;
    }

    // ===================================================================================
    //                                                                 Behavior Query Path
    //                                                                 ===================
    public void setupBehaviorQueryPathIfNeeds() {
	    if (!isBehaviorQueryPathEnabled()) {
		    return;
		}
		if (_outsideSqlPath.contains(":")) {
		    final String subDirectoryValue = _outsideSqlPath.substring(0, _outsideSqlPath.lastIndexOf(":"));
		    final String subDirectoryPath = replaceString(subDirectoryValue, ":", "/");
			final String behaviorQueryPath = _outsideSqlPath.substring(_outsideSqlPath.lastIndexOf(":") + ":".length());
			final String behaviorClassPath = replaceString(buildBehaviorSqlPackageName(), ".", "/");
			final String behaviorPackagePath = behaviorClassPath.substring(0, behaviorClassPath.lastIndexOf("/"));
			final String behaviorClassName = behaviorClassPath.substring(behaviorClassPath.lastIndexOf("/") + "/".length());
            _outsideSqlPath = behaviorPackagePath + "/" + subDirectoryPath + "/" + behaviorClassName + "_" + behaviorQueryPath + ".sql";
		} else {
            _outsideSqlPath = replaceString(buildBehaviorSqlPackageName(), ".", "/") + "_" + _outsideSqlPath + ".sql";
		}
    }

    protected String buildBehaviorSqlPackageName() {
        final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(_tableDbName);
        final String behaviorTypeName = dbmeta.getBehaviorTypeName();
        final String outsideSqlPackage = DBFluteConfig.getInstance().getOutsideSqlPackage();
        if (outsideSqlPackage != null && outsideSqlPackage.trim().length() > 0) {
            final String behaviorClassName = behaviorTypeName.substring(behaviorTypeName.lastIndexOf(".") + ".".length());
            String tmp = behaviorTypeName.substring(0, behaviorTypeName.lastIndexOf("."));
            final String exbhvName = tmp.contains(".") ? tmp.substring(tmp.lastIndexOf(".") + ".".length()) : tmp;
            return outsideSqlPackage + "." + exbhvName + "." + behaviorClassName;
        } else {
            return behaviorTypeName;
        }
    }

    protected boolean isBehaviorQueryPathEnabled() {
        if (isProcedure()) {// [DBFlute-0.7.5]
            return false;
        }
        return _outsideSqlPath != null && !_outsideSqlPath.contains("/") && !_outsideSqlPath.contains(".") && _tableDbName != null;
    }

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean isSpecifiedOutsideSql() {
        return _outsideSqlPath != null;
    }

    // [DBFlute-0.7.5]
    public boolean isProcedure() {
        return _methodName != null && _methodName.startsWith("call");
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected boolean isExistResource(String path) {
        return ResourceUtil.isExist(path);
    }

    protected String readText(final String path, String sqlFileEncoding) {
        final java.io.InputStream is = ResourceUtil.getResourceAsStream(path);
        final java.io.Reader reader = InputStreamReaderUtil.create(is, sqlFileEncoding);
        return ReaderUtil.readText(reader);
    }

    protected static String replaceString(String text, String fromText, String toText) {
        return SimpleStringUtil.replace(text, fromText, toText);
    }
    
    protected static String getLineSeparator() {
        return SimpleSystemUtil.getLineSeparator();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // -----------------------------------------------------
    //                                  Common of OutsideSql
    //                                  --------------------
    public boolean isDynamicBinding() {
        return _dynamicBinding;
    }

    public void setDynamicBinding(boolean dynamicBinding) {
        this._dynamicBinding = dynamicBinding;
    }

    public boolean isOffsetByCursorForcedly() {
        return _offsetByCursorForcedly;
    }

    public void setOffsetByCursorForcedly(boolean offsetByCursorForcedly) {
        this._offsetByCursorForcedly = offsetByCursorForcedly;
    }
    
    public boolean isLimitByCursorForcedly() {
        return _limitByCursorForcedly;
    }

    public void setLimitByCursorForcedly(boolean limitByCursorForcedly) {
        this._limitByCursorForcedly = limitByCursorForcedly;
    }

    // -----------------------------------------------------
    //                                  Specified OutsideSql
    //                                  --------------------
    public String getOutsideSqlPath() {
        return _outsideSqlPath;
    }

    public void setOutsideSqlPath(String outsideSqlPath) {
        this._outsideSqlPath = outsideSqlPath;
    }

    public Object getParameterBean() {
        return _parameterBean;
    }

    public void setParameterBean(Object parameterBean) {
        this._parameterBean = parameterBean;
    }

    public Object getResultTypeSpecification() {
        return _resultTypeSpecification;
    }

    public void setResultTypeSpecification(Object resultTypeSpecification) {
        this._resultTypeSpecification = resultTypeSpecification;
    }

    public String getMethodName() {
        return _methodName;
    }

    public void setMethodName(String methodName) {
        this._methodName = methodName;
    }
    
    public StatementConfig getStatementConfig() {
        return _statementConfig;
    }

    public void setStatementConfig(StatementConfig statementConfig) {
        this._statementConfig = statementConfig;
    }

    public String getTableDbName() {
        return _tableDbName;
    }

    public void setTableDbName(String tableDbName) {
        this._tableDbName = tableDbName;
    }
}
