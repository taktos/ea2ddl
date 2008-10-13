package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.impl.AbstractSqlCommand;
import org.seasar.dao.BeanMetaData;
import org.seasar.dao.NoUpdatePropertyTypeRuntimeException;

import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalUpdateAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalUpdateAutoDynamicCommand extends AbstractSqlCommand {

	// ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(InternalUpdateAutoDynamicCommand.class);

    private static final Integer NO_UPDATE = new Integer(0);

	// ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private BeanMetaData beanMetaData;
    private String[] propertyNames;
    private boolean checkSingleRowUpdate = true;
    private boolean versionNoAutoIncrementOnMemory = true;

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalUpdateAutoDynamicCommand(DataSource dataSource, StatementFactory statementFactory) {
        super(dataSource, statementFactory);
    }

	// ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public Object execute(Object[] args) {
        final Object bean = args[0];
        final BeanMetaData bmd = getBeanMetaData();
        final PropertyType[] propertyTypes = createUpdatePropertyTypes(bmd, bean, getPropertyNames());
        if (propertyTypes.length == 0) {
            if (_log.isDebugEnabled()) {
                _log.debug(createNoUpdateLogMessage(bean, bmd));
            }
            return NO_UPDATE;
        }
        InternalUpdateAutoHandler handler = createInternalUpdateAutoHandler(bmd, propertyTypes);
        handler.setSql(createUpdateSql(bmd, propertyTypes, bean));
        handler.setLoggingMessageSqlArgs(args);
        int i = handler.execute(args);

        // [Comment Out]: This statement moved to the handler at [DBFlute-0.8.0].
        // if (isCheckSingleRowUpdate() && i < 1) {
        //     throw createNotSingleRowUpdatedRuntimeException(args[0], i);
        // }

        return new Integer(i);
    }

    protected InternalUpdateAutoHandler createInternalUpdateAutoHandler(BeanMetaData bmd, PropertyType[] propertyTypes) {
        InternalUpdateAutoHandler handler = new InternalUpdateAutoHandler(getDataSource(), getStatementFactory(), bmd, propertyTypes);
        handler.setVersionNoAutoIncrementOnMemory(versionNoAutoIncrementOnMemory);
        handler.setCheckSingleRowUpdate(isCheckSingleRowUpdate()); // [DBFlute-0.8.0]
        return handler;
    }

    protected PropertyType[] createUpdatePropertyTypes(BeanMetaData bmd, Object bean, String[] propertyNames) {
        final List<PropertyType> types = new ArrayList<PropertyType>();
        final String timestampPropertyName = bmd.getTimestampPropertyName();
        final String versionNoPropertyName = bmd.getVersionNoPropertyName();
        for (int i = 0; i < propertyNames.length; ++i) {
            PropertyType pt = bmd.getPropertyType(propertyNames[i]);
            if (pt.isPrimaryKey() == false) {
                String propertyName = pt.getPropertyName();
                if (propertyName.equalsIgnoreCase(timestampPropertyName)
                        || propertyName.equalsIgnoreCase(versionNoPropertyName)
                        || pt.getPropertyDesc().getValue(bean) != null) {
                    types.add(pt);
                }
            }
        }
        if (types.isEmpty()) {
            throw new NoUpdatePropertyTypeRuntimeException();
        }
        PropertyType[] propertyTypes = (PropertyType[]) types.toArray(new PropertyType[types.size()]);
        return propertyTypes;
    }

    protected String createNoUpdateLogMessage(final Object bean, final BeanMetaData bmd) {
        final StringBuffer sb = new StringBuffer();
        sb.append("skip UPDATE: table=").append(bmd.getTableName());
        final int size = bmd.getPrimaryKeySize();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                sb.append(", key{");
            } else {
                sb.append(", ");
            }
            final String keyName = bmd.getPrimaryKey(i);
            sb.append(keyName).append("=");
            sb.append(bmd.getPropertyTypeByColumnName(keyName).getPropertyDesc().getValue(bean));
            if (i == size - 1) {
                sb.append("}");
            }
        }
        final String s = new String(sb);
        return s;
    }

    /**
     * Create update SQL. The update is by the primary keys.
     * @param bmd The meta data of bean. (NotNull & RequiredPrimaryKeys)
     * @param propertyTypes The types of property for update. (NotNull)
     * @param bean A bean for update for handling version no and so on. (NotNull)
     * @return The update SQL. (NotNull)
     */
    protected String createUpdateSql(BeanMetaData bmd, PropertyType[] propertyTypes, Object bean) {
        if (bmd.getPrimaryKeySize() == 0) {
            String msg = "The table '" + bmd.getTableName() + "' does not have primary keys!";
            throw new IllegalStateException(msg);
        }
        final StringBuilder sb = new StringBuilder(100);
        sb.append("update ");
        sb.append(bmd.getTableName());
        sb.append(" set ");
        final String versionNoPropertyName = bmd.getVersionNoPropertyName();
        for (int i = 0; i < propertyTypes.length; ++i) {
            PropertyType pt = propertyTypes[i];
            final String columnName = pt.getColumnName();
            if (i > 0) {
                sb.append(", ");
            }
            if (pt.getPropertyName().equalsIgnoreCase(versionNoPropertyName)) {
                if (!isVersionNoAutoIncrementOnMemory()) {
                    setupVersionNoAutoIncrementOnQuery(sb, columnName);
                    continue;
                }
                final Object versionNo = pt.getPropertyDesc().getValue(bean);
                if (versionNo == null) {
                    setupVersionNoAutoIncrementOnQuery(sb, columnName);
                    continue;
                }
            }
            sb.append(columnName).append(" = ?");
        }
        sb.append(" where ");
        for (int i = 0; i < bmd.getPrimaryKeySize(); ++i) {
            sb.append(bmd.getPrimaryKey(i)).append(" = ? and ");
        }
        sb.setLength(sb.length() - 5);
        if (bmd.hasVersionNoPropertyType()) {
            PropertyType pt = bmd.getVersionNoPropertyType();
            sb.append(" and ").append(pt.getColumnName()).append(" = ?");
        }
        if (bmd.hasTimestampPropertyType()) {
            PropertyType pt = bmd.getTimestampPropertyType();
            sb.append(" and ").append(pt.getColumnName()).append(" = ?");
        }
        return sb.toString();
    }

    protected boolean isVersionNoAutoIncrementOnMemory() {
        return versionNoAutoIncrementOnMemory;
    }

    public void setVersionNoAutoIncrementOnMemory(boolean versionNoAutoIncrementOnMemory) {
        this.versionNoAutoIncrementOnMemory = versionNoAutoIncrementOnMemory;
    }
    
    protected void setupVersionNoAutoIncrementOnQuery(StringBuilder sb, String columnName) {
        sb.append(columnName).append(" = ").append(columnName).append(" + 1");
    }

    public BeanMetaData getBeanMetaData() {
        return beanMetaData;
    }

    public void setBeanMetaData(BeanMetaData beanMetaData) {
        this.beanMetaData = beanMetaData;
    }

    public String[] getPropertyNames() {
        return propertyNames;
    }

    public void setPropertyNames(String[] propertyNames) {
        this.propertyNames = propertyNames;
    }

    public boolean isCheckSingleRowUpdate() {
        return checkSingleRowUpdate;
    }

    public void setCheckSingleRowUpdate(boolean resultCheck) {
        this.checkSingleRowUpdate = resultCheck;
    }
}
