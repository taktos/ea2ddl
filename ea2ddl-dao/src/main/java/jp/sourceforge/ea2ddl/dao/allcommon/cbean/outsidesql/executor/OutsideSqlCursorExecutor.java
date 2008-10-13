package jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.executor;

import jp.sourceforge.ea2ddl.dao.allcommon.jdbc.CursorHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.OutsideSqlDao;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.OutsideSqlOption;
import jp.sourceforge.ea2ddl.dao.allcommon.jdbc.StatementConfig;

/**
 * The cursor executor of outside-sql.
 * 
 * @param <PARAMETER_BEAN> The type of parameter-bean.
 * @author DBFlute(AutoGenerator)
 */
public class OutsideSqlCursorExecutor<PARAMETER_BEAN> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final OutsideSqlDao _outsideSqlDao;

    protected final OutsideSqlOption _outsideSqlOption;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public OutsideSqlCursorExecutor(OutsideSqlDao outsideSqlDao, OutsideSqlOption outsideSqlOption) {
        this._outsideSqlDao = outsideSqlDao;
        this._outsideSqlOption = outsideSqlOption;
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    public Object selectCursor(String path, PARAMETER_BEAN pmb, CursorHandler handler) {
        return _outsideSqlDao.selectCursor(path, pmb, _outsideSqlOption, handler);
    }

    // ===================================================================================
    //                                                                              Option
    //                                                                              ======
    public OutsideSqlCursorExecutor<PARAMETER_BEAN> configure(StatementConfig statementConfig) {
		_outsideSqlOption.setStatementConfig(statementConfig);
        return this;
    }
	
    public OutsideSqlCursorExecutor<PARAMETER_BEAN> dynamicBinding() {
        _outsideSqlOption.dynamicBinding();
        return this;
    }
}
