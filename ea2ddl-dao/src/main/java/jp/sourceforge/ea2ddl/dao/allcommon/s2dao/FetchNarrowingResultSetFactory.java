package jp.sourceforge.ea2ddl.dao.allcommon.s2dao;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.extension.jdbc.ResultSetFactory;

// import jp.sourceforge.ea2ddl.dao.allcommon.cbean.FetchNarrowingBean;
// import jp.sourceforge.ea2ddl.dao.allcommon.cbean.FetchNarrowingBeanContext;
// import jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.OutsideSqlContext;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalBasicHandler.SQLExceptionHandler;

/**
 * This is unused in DBFlute so this is very NORMAL result-set-factory for S2Dao.
 * @author DBFlute(AutoGenerator)
 */
public class FetchNarrowingResultSetFactory implements ResultSetFactory {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     */
    public FetchNarrowingResultSetFactory() {
    }

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    /**
     * Get result set.
     * @param statement Statement. (NotNull)
     * @return Result set for procedure executing of s2dao. (NotNull)
     */
    public ResultSet getResultSet(Statement statement) { // Unused in DBFlute
        return doGetResultSet(statement);
    }

    /**
     * Create result set.
     * @param ps Prepared statement. (NotNull)
     * @return Result set. (NotNull)
     */
    public ResultSet createResultSet(PreparedStatement ps) { // Unused in DBFlute
        return executeQuery(ps);

        // *Move to InternalBasicSelectHandler 
        // if (!FetchNarrowingBeanContext.isExistFetchNarrowingBeanOnThread()) {
        //     return resultSet;
        // }
        // final FetchNarrowingBean cb = FetchNarrowingBeanContext.getFetchNarrowingBeanOnThread();
        // if (!isUseFetchNarrowingResultSetWrapper(cb)) {
        //     return resultSet;
        // }
        // final FetchNarrowingResultSetWrapper wrapper;
        // if (OutsideSqlContext.isExistOutsideSqlContextOnThread()) {
        //     final OutsideSqlContext outsideSqlContext = OutsideSqlContext.getOutsideSqlContextOnThread();
        //     wrapper = new FetchNarrowingResultSetWrapper(resultSet, cb, outsideSqlContext.isOffsetByCursorForcedly(), outsideSqlContext.isLimitByCursorForcedly());
        // } else {
        //     wrapper = new FetchNarrowingResultSetWrapper(resultSet, cb, false, false);
        // }
        // return wrapper;
    }

    // protected boolean isUseFetchNarrowingResultSetWrapper(FetchNarrowingBean cb) {
    //     if (cb.getSafetyMaxResultSize() > 0) {
    //         return true;
    //     }
    //     if (!cb.isFetchNarrowingEffective()) {
    //         return false;// It is not necessary to control.
    //     }
    //     if (OutsideSqlContext.isExistOutsideSqlContextOnThread()) {
    //         final OutsideSqlContext outsideSqlContext = OutsideSqlContext.getOutsideSqlContextOnThread();
    //         if (outsideSqlContext.isOffsetByCursorForcedly() || outsideSqlContext.isLimitByCursorForcedly()) {
    //             return true;
    //         }
    //     }
    //     if (cb.isFetchNarrowingSkipStartIndexEffective() || cb.isFetchNarrowingLoopCountEffective()) {
    //         return true;
    //     }
    //     return false;
    // }

    // ===================================================================================
    //                                                                      JDBC Delegator
    //                                                                      ==============
    protected ResultSet doGetResultSet(Statement statement)  {
        try {
            return statement.getResultSet();
        } catch (SQLException e) {
            handleSQLException(e, statement);
            return null;// Unreachable!
        }
    }

    protected ResultSet executeQuery(PreparedStatement ps) {
        try {
            return ps.executeQuery();
        } catch (SQLException e) {
            handleSQLException(e, ps);
            return null;// Unreachable!
        }
    }

    protected void handleSQLException(SQLException e, Statement statement) {
        new SQLExceptionHandler().handleSQLException(e, statement);
    }
}
