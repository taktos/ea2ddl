package jp.sourceforge.ea2ddl.dao.allcommon.s2dao;

import jp.sourceforge.ea2ddl.dao.allcommon.jdbc.LatestSqlProvider;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqllog.InternalSqlLogRegistry;

/**
 * The provider of latest SQL as S2Dao. <br />
 * This instance should be singleton. <br />
 * 
 * @author DBFlute(AutoGenerator)
 */
public class S2DaoLatestSqlProvider implements LatestSqlProvider {

    /**
     * The implementation.
     * 
     * @return Display SQL. (Nullable: If it was not found, returns null.)
     */
    public String getDisplaySql() {
        return getLastCompleteSql();
    }

    protected String getLastCompleteSql() {
        try {
            return InternalSqlLogRegistry.peekCompleteSql();
        } catch (RuntimeException ignored) {
            return null;
        }
    }
	
	public void clearSqlCache() {
	}
}
