package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.extension.jdbc.ValueType;
import org.seasar.extension.jdbc.types.ValueTypes;
import org.seasar.framework.exception.SQLRuntimeException;

import jp.sourceforge.ea2ddl.dao.allcommon.QLog;
import jp.sourceforge.ea2ddl.dao.allcommon.DBFluteConfig;
import jp.sourceforge.ea2ddl.dao.allcommon.InternalMapContext;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBeanContext;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.OutsideSqlContext;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.SQLFailureException;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqllog.InternalSqlLogRegistry;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.util.InternalBindVariableUtil;
import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleSystemUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalBasicHandler {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private DataSource dataSource;
    private String sql;
    private StatementFactory statementFactory;
    private Object[] loggingMessageSqlArgs;

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalBasicHandler(DataSource ds, StatementFactory statementFactory) {
        setDataSource(ds);
        setStatementFactory(statementFactory);
    }

    public InternalBasicHandler(DataSource ds, String sql, StatementFactory statementFactory) {
        setDataSource(ds);
		setSql(sql);
        setStatementFactory(statementFactory);
    }

	// ===================================================================================
    //                                                           Basic Method for SubClass
    //                                                           =========================
    protected void bindArgs(PreparedStatement ps, Object[] args, Class<?>[] argTypes) {
        if (args == null) {
            return;
        }
        for (int i = 0; i < args.length; ++i) {
            ValueType valueType = getValueType(argTypes[i]);
            try {
                valueType.bindValue(ps, i + 1, args[i]);
            } catch (SQLException e) {
                handleSQLException(e, ps);
            }
        }
    }

    protected Class<?>[] getArgTypes(Object[] args) {
        if (args == null) {
            return null;
        }
        Class<?>[] argTypes = new Class[args.length];
        for (int i = 0; i < args.length; ++i) {
            Object arg = args[i];
            if (arg != null) {
                argTypes[i] = arg.getClass();
            }
        }
        return argTypes;
    }

    protected String getCompleteSql(Object[] args) {
        return InternalBindVariableUtil.getCompleteSql(sql, args);
    }

    protected String getBindVariableText(Object bindVariable) {
        return InternalBindVariableUtil.getBindVariableText(bindVariable);
    }

    protected ValueType getValueType(Class<?> clazz) {
        return ValueTypes.getValueType(clazz);
    }

    protected void logSql(Object[] args, Class<?>[] argTypes) {
        if (QLog.isLogEnabled() || InternalSqlLogRegistry.existsSqlLogRegistry()) {
            final String completeSql = getCompleteSql(args);
			if (isContainsLineSeparatorInSql()) {
                QLog.log(getLineSeparator() + completeSql);
			} else {
                QLog.log(completeSql);
			}
		    if (InternalSqlLogRegistry.existsSqlLogRegistry()) {
			    final Object sqlLogRegistry = InternalSqlLogRegistry.findContainerSqlLogRegistry();
				if (sqlLogRegistry != null) {
				    InternalSqlLogRegistry.push(getSql(), completeSql, args, argTypes, sqlLogRegistry);
				}
			}
        }
    }
	
	protected boolean isContainsLineSeparatorInSql() {
	    return sql != null ? sql.contains(getLineSeparator()) : false;
	}

    // ===================================================================================
    //                                                                   Exception Handler
    //                                                                   =================
    protected void handleSQLException(SQLException e, Statement statement) {
        handleSQLException(e, statement, false);
    }

    protected void handleSQLException(SQLException e, Statement statement, boolean uniqueConstraintValid) {
        String completeSql = buildLoggingMessageSql();
        new SQLExceptionHandler().handleSQLException(e, statement, uniqueConstraintValid, completeSql);
    }

    protected String buildLoggingMessageSql() {
        String completeSql = null;
        if (sql != null && loggingMessageSqlArgs != null) {
            try {
                completeSql = getCompleteSql(loggingMessageSqlArgs);
            } catch (RuntimeException ignored) {
            }
        }
        return completeSql;
    }

    public static class SQLExceptionHandler {

	    public void handleSQLException(SQLException e, Statement statement) {
	        handleSQLException(e, statement, false);
	    }
	    
	    public void handleSQLException(SQLException e, Statement statement, boolean uniqueConstraintValid) {
	        handleSQLException(e, statement, uniqueConstraintValid, null);
	    }
	    
	    public void handleSQLException(SQLException e, Statement statement, boolean uniqueConstraintValid, String completeSql) {
	        if (isSqlExceptionOldStyleHandling()) {
	            throw new SQLRuntimeException(e);
	        }
	        if (uniqueConstraintValid && isUniqueConstraintException(e)) {
	            throwEntityAlreadyExistsException(e, statement, completeSql);
	        }
	        throwSQLFailureException(e, statement, completeSql);
	    }
	
	    protected boolean isUniqueConstraintException(SQLException e) {
	        DBFluteConfig.UniqueConstraintDeterminator determinator = getUniqueConstraintDeterminator();
	        if (determinator != null) {
	            return determinator.isUniqueConstraintException(e);
	        }
	        return ConditionBeanContext.isUniqueConstraintException(extractSQLState(e), e.getErrorCode());
	    }
	
	    protected DBFluteConfig.UniqueConstraintDeterminator getUniqueConstraintDeterminator() {
	        return DBFluteConfig.getInstance().getUniqueConstraintDeterminator();
	    }
	
	    protected boolean isSqlExceptionOldStyleHandling() {
	        return DBFluteConfig.getInstance().isSqlExceptionOldStyleHandling();
	    }
	
	    protected void throwEntityAlreadyExistsException(SQLException e, Statement statement, String completeSql) {
	        String msg = "Look! Read the message below." + getLineSeparator();
	        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
	        msg = msg + "The entity already exists on the database!" + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[Advice]" + getLineSeparator();
	        msg = msg + "Please confirm the primary key whether it already exists on the database." + getLineSeparator();
	        msg = msg + "And confirm the unique constraint for other columns." + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[SQLState]" + getLineSeparator() + extractSQLState(e) + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[ErrorCode]" + getLineSeparator() + e.getErrorCode() + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[SQLException]" + getLineSeparator() + e.getClass().getName() + getLineSeparator();
	        msg = msg + e.getMessage() + getLineSeparator();
            SQLException nextEx = e.getNextException();
            if (nextEx != null) {
	            msg = msg + getLineSeparator();
	            msg = msg + "[NextException]" + getLineSeparator();
                msg = msg + nextEx.getClass().getName() + getLineSeparator();
	            msg = msg + nextEx.getMessage() + getLineSeparator();
                SQLException nextNextEx = nextEx.getNextException();
                if (nextNextEx != null) {
	                msg = msg + getLineSeparator();
	                msg = msg + "[NextNextException]" + getLineSeparator();
                    msg = msg + nextNextEx.getClass().getName() + getLineSeparator();
	                msg = msg + nextNextEx.getMessage() + getLineSeparator();
                }
            }
            Object invokeName = extractBehaviorInvokeName();
            if (invokeName != null) {
	            msg = msg + getLineSeparator();
                msg = msg + "[Behavior]" + getLineSeparator();
                msg = msg + invokeName + getLineSeparator();
            }
            if (hasConditionBean()) {
	            msg = msg + getLineSeparator();
                msg = msg + "[ConditionBean]" + getLineSeparator();
                msg = msg + getConditionBean().getClass().getName() + getLineSeparator();
            }
            if (hasOutsideSqlContext()) {
	            msg = msg + getLineSeparator();
                msg = msg + "[OutsideSql]" + getLineSeparator();
                msg = msg + getOutsideSqlContext().getOutsideSqlPath() + getLineSeparator();
	            msg = msg + getLineSeparator();
                msg = msg + "[ParameterBean]" + getLineSeparator();
                Object pmb = getOutsideSqlContext().getParameterBean();
                if (pmb != null) {
                    msg = msg + pmb.getClass().getName() + getLineSeparator();
                    msg = msg + pmb + getLineSeparator();
                } else {
                    msg = msg + pmb + getLineSeparator();
                }
            }
	        if (statement != null) {
	            msg = msg + getLineSeparator();
	            msg = msg + "[Statement]" + getLineSeparator();
                msg = msg + statement.getClass().getName() + getLineSeparator();
	        }
            if (completeSql != null) {
	            msg = msg + getLineSeparator();
                msg = msg + "[Display SQL]" + getLineSeparator();
                msg = msg + completeSql + getLineSeparator();
            }
	        msg = msg + "* * * * * * * * * */";
	        throw new EntityAlreadyExistsException(msg, e);
	    }
	
	    protected void throwSQLFailureException(SQLException e, Statement statement, String completeSql) {
	        String msg = "Look! Read the message below." + getLineSeparator();
	        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
	        msg = msg + "The SQL failed to execute!" + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[Advice]" + getLineSeparator();
	        msg = msg + "Please confirm the SQLException message." + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[SQLState]" + getLineSeparator() + extractSQLState(e) + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[ErrorCode]" + getLineSeparator() + e.getErrorCode() + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[SQLException]" + getLineSeparator() + e.getClass().getName() + getLineSeparator();
	        msg = msg + e.getMessage() + getLineSeparator();
            SQLException nextEx = e.getNextException();
            if (nextEx != null) {
	            msg = msg + getLineSeparator();
	            msg = msg + "[NextException]" + getLineSeparator();
                msg = msg + nextEx.getClass().getName() + getLineSeparator();
	            msg = msg + nextEx.getMessage() + getLineSeparator();
                SQLException nextNextEx = nextEx.getNextException();
                if (nextNextEx != null) {
	                msg = msg + getLineSeparator();
	                msg = msg + "[NextNextException]" + getLineSeparator();
                    msg = msg + nextNextEx.getClass().getName() + getLineSeparator();
	                msg = msg + nextNextEx.getMessage() + getLineSeparator();
                }
            }
            Object invokeName = extractBehaviorInvokeName();
            if (invokeName != null) {
	            msg = msg + getLineSeparator();
                msg = msg + "[Behavior]" + getLineSeparator();
                msg = msg + invokeName + getLineSeparator();
            }
            if (hasConditionBean()) {
	            msg = msg + getLineSeparator();
                msg = msg + "[ConditionBean]" + getLineSeparator();
                msg = msg + getConditionBean().getClass().getName() + getLineSeparator();
            }
            if (hasOutsideSqlContext()) {
	            msg = msg + getLineSeparator();
                msg = msg + "[OutsideSql]" + getLineSeparator();
                msg = msg + getOutsideSqlContext().getOutsideSqlPath() + getLineSeparator();
	            msg = msg + getLineSeparator();
                msg = msg + "[ParameterBean]" + getLineSeparator();
                Object pmb = getOutsideSqlContext().getParameterBean();
                if (pmb != null) {
                    msg = msg + pmb.getClass().getName() + getLineSeparator();
                    msg = msg + pmb + getLineSeparator();
                } else {
                    msg = msg + pmb + getLineSeparator();
                }
            }
	        if (statement != null) {
	            msg = msg + getLineSeparator();
	            msg = msg + "[Statement]" + getLineSeparator();
                msg = msg + statement.getClass().getName() + getLineSeparator();
	        }
            if (completeSql != null) {
	            msg = msg + getLineSeparator();
                msg = msg + "[Display SQL]" + getLineSeparator();
                msg = msg + completeSql + getLineSeparator();
            }
            msg = msg + "* * * * * * * * * */";
            throw new SQLFailureException(msg, e);
        }

        protected String extractSQLState(SQLException e) {
            String sqlState = e.getSQLState();
            if (sqlState != null) {
                return sqlState;
            }

            // Next
            SQLException nextEx = e.getNextException();
            if (nextEx == null) {
                return null;
            }
            sqlState = nextEx.getSQLState();
            if (sqlState != null) {
                return sqlState;
            }

            // Next Next
            SQLException nextNextEx = nextEx.getNextException();
            if (nextNextEx == null) {
                return null;
            }
            sqlState = nextNextEx.getSQLState();
            if (sqlState != null) {
                return sqlState;
            }

            // Next Next Next
            SQLException nextNextNextEx = nextNextEx.getNextException();
            if (nextNextNextEx == null) {
                return null;
            }
            sqlState = nextNextNextEx.getSQLState();
            if (sqlState != null) {
                return sqlState;
            }

            // It doesn't use recursive call by design because JDBC is unpredictable fellow.
            return null;
        }

        protected String extractBehaviorInvokeName() {
            final Object behaviorInvokeName = InternalMapContext.getObject("df:BehaviorInvokeName");
            if (behaviorInvokeName == null) {
                return null;
            }
            final Object clientInvokeName = InternalMapContext.getObject("df:ClientInvokeName");
            final Object byPassInvokeName = InternalMapContext.getObject("df:ByPassInvokeName");
            final StringBuilder sb = new StringBuilder();
            boolean existsPath = false;
            if (clientInvokeName != null) {
                existsPath = true;
                sb.append(clientInvokeName);
            }
            if (byPassInvokeName != null) {
                existsPath = true;
                sb.append(byPassInvokeName);
            }
            sb.append(behaviorInvokeName);
            if (existsPath) {
                sb.append("...");
            }
            return sb.toString();
        }

        protected boolean hasConditionBean() {
            return ConditionBeanContext.isExistConditionBeanOnThread();
        }

        protected ConditionBean getConditionBean() {
            return ConditionBeanContext.getConditionBeanOnThread();
        }

        protected boolean hasOutsideSqlContext() {
            return OutsideSqlContext.isExistOutsideSqlContextOnThread();
        }

        protected OutsideSqlContext getOutsideSqlContext() {
            return OutsideSqlContext.getOutsideSqlContextOnThread();
        }

        protected String getLineSeparator() {
            return SimpleSystemUtil.getLineSeparator();
        }
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

    protected PreparedStatement prepareStatement(Connection conn) {
        if (sql == null) {
            throw new IllegalStateException("The sql should not be null!");
        }
        return statementFactory.createPreparedStatement(conn, sql);
    }

    protected int executeUpdate(PreparedStatement ps) {
        try {
            return ps.executeUpdate();
        } catch (SQLException e) {
            handleSQLException(e, ps, true);
            return 0;// Unreachable!
        }
    }

    protected void setFetchSize(Statement statement, int fetchSize) {
        if (statement == null) {
            return;
        }
        try {
            statement.setFetchSize(fetchSize);
        } catch (SQLException e) {
            handleSQLException(e, statement);
        }
    }

    protected void setMaxRows(Statement statement, int maxRows) {
        if (statement == null) {
            return;
        }
        try {
            statement.setMaxRows(maxRows);
        } catch (SQLException e) {
            handleSQLException(e, statement);
        }
    }

    protected void close(Statement statement) {
        if (statement == null) {
            return;
        }
        try {
            statement.close();
        } catch (SQLException e) {
            handleSQLException(e, statement);
        }
    }

    protected void close(ResultSet resultSet) {
        if (resultSet == null) {
            return;
        }
        try {
            resultSet.close();
        } catch (SQLException e) {
            handleSQLException(e, null);
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
    //                                                                      General Helper
    //                                                                      ==============
    protected String getLineSeparator() {
        return SimpleSystemUtil.getLineSeparator();
    }
    
	// ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public StatementFactory getStatementFactory() {
        return statementFactory;
    }

    public void setStatementFactory(StatementFactory statementFactory) {
        this.statementFactory = statementFactory;
    }

    public void setLoggingMessageSqlArgs(Object[] loggingMessageSqlArgs) {
        this.loggingMessageSqlArgs = loggingMessageSqlArgs;
    }
}
