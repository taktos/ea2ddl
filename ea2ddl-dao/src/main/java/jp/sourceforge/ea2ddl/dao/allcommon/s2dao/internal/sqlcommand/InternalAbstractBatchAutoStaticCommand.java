package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalAbstractBatchAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public abstract class InternalAbstractBatchAutoStaticCommand extends InternalAbstractAutoStaticCommand {

	// ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final boolean returningRows;

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalAbstractBatchAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            String[] propertyNames, boolean returningRows) {
        this(dataSource, statementFactory, beanMetaData, propertyNames, returningRows, DEFAULT_VERSION_NO_AUTO_INCREMENT_ON_MEMORY);
    }

    public InternalAbstractBatchAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            String[] propertyNames, boolean returningRows, boolean versionNoAutoIncrementOnMemory) {
        super(dataSource, statementFactory, beanMetaData, propertyNames, versionNoAutoIncrementOnMemory);
        this.returningRows = returningRows;
    }

	// ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public Object execute(Object[] args) {
        final InternalAbstractBatchAutoHandler handler = createBatchAutoHandler();
        
		// It is unnecessary!
		// injectDaoClass(handler);
        
		handler.setSql(getSql());
		// The logging message SQL of procedure is unnecessary.
        // handler.setLoggingMessageSqlArgs(args);
        if (this.returningRows) {
            return handler.executeBatch(args);
        } else {
            final int updatedRows = handler.execute(args);
            return new Integer(updatedRows);
        }
    }
	
    protected abstract InternalAbstractBatchAutoHandler createBatchAutoHandler();
}
