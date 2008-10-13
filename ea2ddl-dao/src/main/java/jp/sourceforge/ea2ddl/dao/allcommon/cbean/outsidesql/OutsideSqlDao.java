package jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable;
import jp.sourceforge.ea2ddl.dao.allcommon.jdbc.CursorHandler;

/**
 * The dao of outside-sql.
 * @author DBFlute(AutoGenerator)
 */
public interface OutsideSqlDao extends DaoReadable {

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    <ENTITY> List<ENTITY> selectList(String path, Object pmb, OutsideSqlOption option, Class<ENTITY> entityType);

    <ENTITY> Object selectCursor(String path, Object pmb, OutsideSqlOption option, CursorHandler handler);

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    int execute(String path, Object pmb, OutsideSqlOption option);

    // [DBFlute-0.7.5]
    // ===================================================================================
    //                                                                                Call
    //                                                                                ====
    void call(String path, Object pmb, OutsideSqlOption option);
}
