package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler;

import javax.sql.DataSource;

import org.seasar.dao.BeanMetaData;
import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.StatementFactory;

import jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyUpdatedException;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalUpdateAutoHandler extends InternalAbstractAutoHandler {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    private boolean checkSingleRowUpdate = true;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalUpdateAutoHandler(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            PropertyType[] propertyTypes) {
        super(dataSource, statementFactory, beanMetaData, propertyTypes);
    }

    // ===================================================================================
    //                                                                            Override
    //                                                                            ========
	@Override
    protected void setupBindVariables(Object bean) {
        setupUpdateBindVariables(bean);
        setLoggingMessageSqlArgs(bindVariables);
    }

	@Override
    protected void postUpdateBean(Object bean, int ret) {
        if (isCheckSingleRowUpdate() && ret < 1) {
            throw createEntityAlreadyUpdatedException(bean, ret);
        }
        updateVersionNoIfNeed(bean);
        updateTimestampIfNeed(bean);
    }

    protected EntityAlreadyUpdatedException createEntityAlreadyUpdatedException(Object bean, int rows) {
        return new EntityAlreadyUpdatedException(bean, rows);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public boolean isCheckSingleRowUpdate() {
        return checkSingleRowUpdate;
    }

    public void setCheckSingleRowUpdate(boolean resultCheck) {
        this.checkSingleRowUpdate = resultCheck;
    }
}
