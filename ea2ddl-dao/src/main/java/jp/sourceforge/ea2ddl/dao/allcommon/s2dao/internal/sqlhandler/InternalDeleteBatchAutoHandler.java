package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalDeleteBatchAutoHandler extends InternalAbstractBatchAutoHandler {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalDeleteBatchAutoHandler(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            PropertyType[] propertyTypes) {

        super(dataSource, statementFactory, beanMetaData, propertyTypes);
    }

    // ===================================================================================
    //                                                                            Override
    //                                                                            ========
	@Override
    protected void setupBindVariables(Object bean) {
        setupDeleteBindVariables(bean);
    }
}