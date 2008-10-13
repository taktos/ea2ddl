package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.dao.SqlCommand;
import org.seasar.extension.jdbc.StatementFactory;

/**
 * @author DBFlute(AutoGenerator)
 */
public abstract class InternalAbstractSqlCommand implements SqlCommand {

	// ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private DataSource dataSource;
    private StatementFactory statementFactory;
    private String sql;

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalAbstractSqlCommand(DataSource dataSource, StatementFactory statementFactory) {
        this.dataSource = dataSource;
        this.statementFactory = statementFactory;
    }

	// ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public DataSource getDataSource() {
        return dataSource;
    }

    public StatementFactory getStatementFactory() {
        return statementFactory;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
