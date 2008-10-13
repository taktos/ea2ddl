package jp.sourceforge.ea2ddl.dao.allcommon.jdbc;

/**
 * The interface of statement history witness.
 * @author DBFlute(AutoGenerator)
 */
public interface CursorHandler {

    /**
     * @param resultSet Result set. (NotNull)
     * @return Result
     * @throws java.sql.SQLException
     */
    Object handle(java.sql.ResultSet resultSet) throws java.sql.SQLException;
}
