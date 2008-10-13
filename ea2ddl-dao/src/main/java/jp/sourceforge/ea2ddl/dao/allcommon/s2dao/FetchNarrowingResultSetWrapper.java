package jp.sourceforge.ea2ddl.dao.allcommon.s2dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import org.seasar.extension.jdbc.impl.ResultSetWrapper;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.FetchNarrowingBean;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalBasicHandler.SQLExceptionHandler;

/**
 * The wrapper of fetch narrowing result set.
 * @author DBFlute(AutoGenerator)
 */
public class FetchNarrowingResultSetWrapper extends ResultSetWrapper {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The real result set. (NotNull) */
    protected ResultSet _resultSet;

    /** The bean of fetch narrowing. (NotNull) */
    protected FetchNarrowingBean _fetchNarrowingBean;

    /** The counter of fetch. */
    protected long _fetchCounter;

    /** the counter of request. */
    protected long _requestCounter;

    /** Does it offset by cursor forcedly? */
    protected boolean _offsetByCursorForcedly;

    /** Does it limit by cursor forcedly? */
    protected boolean _limitByCursorForcedly;
	
	/** Does it skip to cursor end? */
	protected boolean _skipToCursorEnd;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param resultSet Original result set. (NotNull)
     * @param fetchNarrowingBean Fetch-narrowing-bean. (NotNull)
     * @param offsetByCursorForcedly Offset by cursor forcedly.
     * @param limitByCursorForcedly Limit by cursor forcedly.
     */
    public FetchNarrowingResultSetWrapper(ResultSet resultSet, FetchNarrowingBean fetchNarrowingBean
                                             , boolean offsetByCursorForcedly, boolean limitByCursorForcedly) {
        super(resultSet);

        _resultSet = resultSet;
        _fetchNarrowingBean = fetchNarrowingBean;
        _offsetByCursorForcedly = offsetByCursorForcedly;
        _limitByCursorForcedly = limitByCursorForcedly;

        skip();
    }

    // ===================================================================================
    //                                                                                Skip
    //                                                                                ====
    /**
     * Skip to start-index.
     */
    protected void skip() {
        if (!isAvailableSkipRecord()) {
            return;
        }
        final int skipStartIndex = getFetchNarrowingSkipStartIndex();
        if (isScrollableCursor()) {
            try {
                if (0 == skipStartIndex) {
                    _resultSet.beforeFirst();
                } else {
                    _resultSet.absolute(skipStartIndex);
                }
                _fetchCounter = _resultSet.getRow();
            } catch (SQLException e) {
                handleSQLException(e, null);
            }
        } else {
            try {
                while (true) {
					if (_fetchCounter >= skipStartIndex) {
					    break;
					}
					if (!_resultSet.next()) {
					    _skipToCursorEnd = true;// [DBFLUTE-243]
					    break;
					}
                    ++_fetchCounter;
                }
            } catch (SQLException e) {
                handleSQLException(e, null);
            }
        }
    }

    protected boolean isAvailableSkipRecord() {
        if (!isFetchNarrowingEffective()) {
            return false;
        }
        if (isOffsetByCursorForcedly()) {
            return true;
        }
        if (isFetchNarrowingSkipStartIndexEffective()) {
            return true;
        }
        return false;
    }

    // ===================================================================================
    //                                                                                Next
    //                                                                                ====
    /**
     * Next.
     * @return Does the result set have next record?
     * @throws SQLException
     */
    public boolean next() throws SQLException {
        final boolean hasNext = super.next();
        ++_requestCounter;
        if (!isAvailableLimitLoopCount()) {
            checkSafetyResult(hasNext);
            return hasNext;
        }

        if (hasNext && _fetchCounter < getFetchNarrowingSkipStartIndex() + getFetchNarrowingLoopCount()) {
            ++_fetchCounter;
            checkSafetyResult(true);
            return true;
        } else {
            return false;
        }
    }

    protected boolean isAvailableLimitLoopCount() {
        if (!isFetchNarrowingEffective()) {
            return false;
        }
        if (isLimitByCursorForcedly()) {
            return true;
        }
        if (isFetchNarrowingLoopCountEffective()) {
            return true;
        }
        return false;
    }

    protected void checkSafetyResult(boolean hasNext) {
        if (hasNext && getSafetyMaxResultSize() > 0 && _requestCounter > (getSafetyMaxResultSize() + 1)) {
            String msg = "You have already been in Danger Zone!";
            msg = msg + " Please confirm your query or data of table: safetyMaxResultSize=" + getSafetyMaxResultSize();
            throw new jp.sourceforge.ea2ddl.dao.allcommon.exception.DangerousResultSizeException(msg, getSafetyMaxResultSize());
        }
    }

    // ===================================================================================
    //                                                                        Fetch Option
    //                                                                        ============
    protected boolean isFetchNarrowingEffective() {
        return _fetchNarrowingBean.isFetchNarrowingEffective();
    }

    protected boolean isFetchNarrowingSkipStartIndexEffective() {
        return _fetchNarrowingBean.isFetchNarrowingSkipStartIndexEffective();
    }

    protected boolean isFetchNarrowingLoopCountEffective() {
        return _fetchNarrowingBean.isFetchNarrowingLoopCountEffective();
    }

    protected int getFetchNarrowingSkipStartIndex() {
        return _fetchNarrowingBean.getFetchNarrowingSkipStartIndex();
    }

    protected int getFetchNarrowingLoopCount() {
        return _fetchNarrowingBean.getFetchNarrowingLoopCount();
    }

    public int getSafetyMaxResultSize() {
        return _fetchNarrowingBean.getSafetyMaxResultSize();
    }

    protected boolean isScrollableCursor() {
        try {
            return !(_resultSet.getType() == ResultSet.TYPE_FORWARD_ONLY);
        } catch (SQLException e) {
            handleSQLException(e, null);
            return false;// Unreachable!
        }
    }

    // ===================================================================================
    //                                                                   Exception Handler
    //                                                                   =================
    protected void handleSQLException(SQLException e, Statement statement) {
        new SQLExceptionHandler().handleSQLException(e, statement);
    }
    
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public boolean isOffsetByCursorForcedly() {
        return _offsetByCursorForcedly;
    }

    public boolean isLimitByCursorForcedly() {
        return _limitByCursorForcedly;
    }
	
	public boolean isSkipToCursorEnd() {
	    return _skipToCursorEnd;
	}
}
