package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.sql.DataSource;

import org.seasar.dao.BeanMetaData;
import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.StatementFactory;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalUpdateModifiedOnlyCommand extends InternalUpdateAutoDynamicCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalUpdateModifiedOnlyCommand(DataSource dataSource, StatementFactory statementFactory) {
        super(dataSource, statementFactory);
    }

	// ===================================================================================
    //                                                                 No.1 Point Override
    //                                                                 ===================
    @Override
    protected PropertyType[] createUpdatePropertyTypes(final BeanMetaData bmd, final Object bean, final String[] propertyNames) {
        final Set<?> modifiedPropertyNames = getBeanMetaData().getModifiedPropertyNames(bean);
        final List<PropertyType> types = new ArrayList<PropertyType>();
        final String timestampPropertyName = bmd.getTimestampPropertyName();
        final String versionNoPropertyName = bmd.getVersionNoPropertyName();
        for (int i = 0; i < propertyNames.length; ++i) {
            final PropertyType pt = bmd.getPropertyType(propertyNames[i]);
            if (pt.isPrimaryKey() == false) {
                final String propertyName = pt.getPropertyName();
                if (propertyName.equalsIgnoreCase(timestampPropertyName)
                        || propertyName.equalsIgnoreCase(versionNoPropertyName)
                        || modifiedPropertyNames.contains(propertyName)) {
                    types.add(pt);
                }
            }
        }
        final PropertyType[] propertyTypes = (PropertyType[]) types.toArray(new PropertyType[types.size()]);
        return propertyTypes;
    }
}
