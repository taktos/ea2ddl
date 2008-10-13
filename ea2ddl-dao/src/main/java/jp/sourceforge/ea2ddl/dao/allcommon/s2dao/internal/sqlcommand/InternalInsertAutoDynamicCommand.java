package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.seasar.dao.BeanMetaData;
import org.seasar.dao.IdentifierGenerator;
import org.seasar.dao.NotSingleRowUpdatedRuntimeException;
import org.seasar.dao.SqlCommand;
import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.framework.exception.SRuntimeException;

import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalInsertAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalInsertAutoDynamicCommand implements SqlCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    protected DataSource dataSource;
    protected StatementFactory statementFactory;
    protected BeanMetaData beanMetaData;
    protected String[] propertyNames;
    protected boolean checkSingleRowUpdate = true;

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalInsertAutoDynamicCommand() {
    }

	// ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public Object execute(Object[] args) {
        final Object bean = args[0];
        final BeanMetaData bmd = getBeanMetaData();
        final PropertyType[] propertyTypes = createInsertPropertyTypes(bmd, bean, getPropertyNames());
        final String sql = createInsertSql(bmd, propertyTypes);
        final InternalInsertAutoHandler handler = new InternalInsertAutoHandler(getDataSource(), getStatementFactory(), bmd, propertyTypes);
        handler.setSql(sql);
        handler.setLoggingMessageSqlArgs(args);
        final int rows = handler.execute(args);
        if (isCheckSingleRowUpdate() && rows != 1) {
            throw new NotSingleRowUpdatedRuntimeException(args[0], rows);
        }
        return new Integer(rows);
    }

    protected String createInsertSql(BeanMetaData bmd,
            PropertyType[] propertyTypes) {
        StringBuffer buf = new StringBuffer(100);
        buf.append("insert into ");
        buf.append(bmd.getTableName());
        buf.append(" (");
        for (int i = 0; i < propertyTypes.length; ++i) {
            PropertyType pt = propertyTypes[i];
            final String columnName = pt.getColumnName();
            if (i > 0) {
                buf.append(", ");
            }
            buf.append(columnName);
        }
        buf.append(") values (");
        for (int i = 0; i < propertyTypes.length; ++i) {
            if (i > 0) {
                buf.append(", ");
            }
            buf.append("?");
        }
        buf.append(")");
        return buf.toString();
    }

    protected PropertyType[] createInsertPropertyTypes(BeanMetaData bmd, Object bean, String[] propertyNames) {

        if (0 == propertyNames.length) {
            throw new SRuntimeException("EDAO0024", new Object[] { bean.getClass().getName() });
        }
        List<PropertyType> types = new ArrayList<PropertyType>();
        final String timestampPropertyName = bmd.getTimestampPropertyName();
        final String versionNoPropertyName = bmd.getVersionNoPropertyName();

        for (int i = 0; i < propertyNames.length; ++i) {
            PropertyType pt = bmd.getPropertyType(propertyNames[i]);
            if (pt.isPrimaryKey()) {
                final IdentifierGenerator generator = bmd.getIdentifierGenerator(pt.getPropertyName());
                if (!generator.isSelfGenerate()) {
                    continue;
                }
            } else {
                if (pt.getPropertyDesc().getValue(bean) == null) {
                    final String propertyName = pt.getPropertyName();
                    if (!propertyName.equalsIgnoreCase(timestampPropertyName)
                            && !propertyName.equalsIgnoreCase(versionNoPropertyName)) {
                        continue;
                    }
                }
            }
            types.add(pt);
        }
        if (types.isEmpty()) {
            throw new SRuntimeException("EDAO0014");
        }
        PropertyType[] propertyTypes = (PropertyType[]) types.toArray(new PropertyType[types.size()]);
        return propertyTypes;
    }

	// ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    protected DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    protected StatementFactory getStatementFactory() {
        return statementFactory;
    }

    public void setStatementFactory(StatementFactory statementFactory) {
        this.statementFactory = statementFactory;
    }

    protected BeanMetaData getBeanMetaData() {
        return beanMetaData;
    }

    public void setBeanMetaData(BeanMetaData beanMetaData) {
        this.beanMetaData = beanMetaData;
    }

    protected String[] getPropertyNames() {
        return propertyNames;
    }

    public void setPropertyNames(String[] propertyNames) {
        this.propertyNames = propertyNames;
    }

    public boolean isCheckSingleRowUpdate() {
        return checkSingleRowUpdate;
    }

    public void setCheckSingleRowUpdate(boolean checkSingleRowUpdate) {
        this.checkSingleRowUpdate = checkSingleRowUpdate;
    }
}
