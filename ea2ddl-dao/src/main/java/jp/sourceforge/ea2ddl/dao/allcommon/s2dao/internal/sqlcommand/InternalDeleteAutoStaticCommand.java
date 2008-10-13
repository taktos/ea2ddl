package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalAbstractAutoHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalDeleteAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalDeleteAutoStaticCommand extends InternalAbstractAutoStaticCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalDeleteAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            String[] propertyNames) {
        super(dataSource, statementFactory, beanMetaData, propertyNames);
    }

	// ===================================================================================
    //                                                                            Override
    //                                                                            ========
    @Override
    protected InternalAbstractAutoHandler createAutoHandler() {
        return new InternalDeleteAutoHandler(getDataSource(), getStatementFactory(), getBeanMetaData(), getPropertyTypes());
    }
	
	@Override
    protected void setupSql() {
        setupDeleteSql();
    }

	@Override
    protected void setupPropertyTypes(String[] propertyNames) {
        setupDeletePropertyTypes(propertyNames);
    }
}
