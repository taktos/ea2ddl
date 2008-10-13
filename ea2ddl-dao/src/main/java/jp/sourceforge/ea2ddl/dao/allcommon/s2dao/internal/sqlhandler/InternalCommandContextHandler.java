package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.seasar.dao.CommandContext;
import org.seasar.extension.jdbc.StatementFactory;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalCommandContextHandler extends InternalBasicHandler {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CommandContext commandContext;
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalCommandContextHandler(DataSource dataSource, StatementFactory statementFactory, CommandContext commandContext) {
        super(dataSource, statementFactory);
        this.commandContext = commandContext;
        setSql(commandContext.getSql());
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public int execute(Object[] args) {
        final Connection connection = getConnection();
        try {
            return execute(connection, commandContext);
        } finally {
            close(connection);
        }
    }

    protected int execute(Connection connection, CommandContext context) {
        logSql(context.getBindVariables(), getArgTypes(context.getBindVariables()));
        PreparedStatement ps = prepareStatement(connection);
        int ret = -1;
        try {
            bindArgs(ps, context.getBindVariables(), context.getBindVariableTypes());
            ret = executeUpdate(ps);
        } finally {
            close(ps);
        }
        return ret;
    }
}
