package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;
import org.seasar.dao.CommandContext;
import org.seasar.extension.jdbc.StatementFactory;

import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalBasicUpdateHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalUpdateDynamicCommand extends InternalAbstractDynamicCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
	public InternalUpdateDynamicCommand(DataSource dataSource, StatementFactory statementFactory) {
		super(dataSource, statementFactory);
	}

	// ===================================================================================
    //                                                                             Execute
    //                                                                             =======
	public Object execute(Object args[]) {
		final CommandContext ctx = apply(args);
		final InternalBasicUpdateHandler updateHandler = new InternalBasicUpdateHandler(getDataSource(), ctx.getSql(), getStatementFactory());
		Object[] bindVariables = ctx.getBindVariables();
        updateHandler.setLoggingMessageSqlArgs(bindVariables);
		return new Integer(updateHandler.execute(bindVariables, ctx.getBindVariableTypes()));
	}
}
