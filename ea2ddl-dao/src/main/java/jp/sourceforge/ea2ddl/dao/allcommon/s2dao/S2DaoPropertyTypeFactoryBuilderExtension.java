package jp.sourceforge.ea2ddl.dao.allcommon.s2dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.DatabaseMetaData;

import org.seasar.extension.jdbc.PropertyType;
import org.seasar.framework.beans.BeanDesc;
import org.seasar.framework.beans.PropertyDesc;
import org.seasar.dao.BeanAnnotationReader;
import org.seasar.dao.ColumnNaming;
import org.seasar.dao.Dbms;
import org.seasar.dao.PropertyTypeFactory;
import org.seasar.dao.PropertyTypeFactoryBuilder;
import org.seasar.dao.ValueTypeFactory;
import org.seasar.dao.impl.AbstractPropertyTypeFactory;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;

/**
 * The factory builder of property type for S2Dao. {Since S2Dao-1.0.47}
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class S2DaoPropertyTypeFactoryBuilderExtension implements PropertyTypeFactoryBuilder {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ValueTypeFactory valueTypeFactory;

    protected ColumnNaming columnNaming;

    // ===================================================================================
    //                                                                               Build
    //                                                                               =====
    public PropertyTypeFactory build(Class beanClass, BeanAnnotationReader beanAnnotationReader) {
        return new FastPropertyTypeFactoryExtension(beanClass, beanAnnotationReader, valueTypeFactory, columnNaming);
    }

    public PropertyTypeFactory build(Class beanClass, BeanAnnotationReader beanAnnotationReader, Dbms dbms, DatabaseMetaData databaseMetaData) {
        return new FastPropertyTypeFactoryExtension(beanClass, beanAnnotationReader, valueTypeFactory, columnNaming, dbms);
    }

    // ===================================================================================
    //                                                                     Extension Class
    //                                                                     ===============
    protected static class FastPropertyTypeFactoryExtension extends AbstractPropertyTypeFactory {

        protected DBMeta _dbmeta;
        protected String[] _noPersisteneProps;

        public FastPropertyTypeFactoryExtension(Class beanClass, BeanAnnotationReader beanAnnotationReader,
                ValueTypeFactory valueTypeFactory, ColumnNaming columnNaming) {
            super(beanClass, beanAnnotationReader, valueTypeFactory, columnNaming);
            initializeResources();
        }

        public FastPropertyTypeFactoryExtension(Class beanClass, BeanAnnotationReader beanAnnotationReader,
                ValueTypeFactory valueTypeFactory, ColumnNaming columnNaming, Dbms dbms) {
            super(beanClass, beanAnnotationReader, valueTypeFactory, columnNaming, dbms);
            initializeResources();
        }

        protected void initializeResources() {
            if (isEntity()) {
                _dbmeta = findDBMeta();
            }
            _noPersisteneProps = beanAnnotationReader.getNoPersisteneProps();
        }

        protected boolean isEntity() {
            return Entity.class.isAssignableFrom(beanClass);
        }

        protected boolean hasDBMeta() {
            return _dbmeta != null;
        }

        protected DBMeta findDBMeta() {
            try {
                final Entity entity = (Entity) beanClass.newInstance();
                return entity.getDBMeta();
            } catch (Exception e) {
                String msg = "beanClass.newInstance() threw the exception: beanClass=" + beanClass;
                throw new RuntimeException(msg, e);
            }
        }

        public PropertyType[] createBeanPropertyTypes(String tableName) {
            final List<PropertyType> list = new ArrayList<PropertyType>();
            final BeanDesc beanDesc = getBeanDesc();
            for (int i = 0; i < beanDesc.getPropertyDescSize(); ++i) {
                final PropertyDesc pd = beanDesc.getPropertyDesc(i);

                // Read-only property is unnecessary!
                if (!pd.hasWriteMethod()) {
                    continue;
                }

                // Relation property is unnecessary!
                if (isRelation(pd)) {
                    continue;
                }

                final PropertyType pt = createPropertyType(pd);
                pt.setPrimaryKey(isPrimaryKey(pd));
                pt.setPersistent(isPersistent(pt));
                list.add(pt);
            }
            return list.toArray(new PropertyType[list.size()]);
        }

        @Override
        protected boolean isRelation(PropertyDesc propertyDesc) {
            final String propertyName = propertyDesc.getPropertyName();
            if (hasDBMeta() && (_dbmeta.hasForeign(propertyName) || _dbmeta.hasReferrer(propertyName))) {
                return true;
            }
            return hasRelationNoAnnotation(propertyDesc);
        }

        protected boolean hasRelationNoAnnotation(PropertyDesc propertyDesc) {
            return beanAnnotationReader.hasRelationNo(propertyDesc);
        }

        @Override
        protected boolean isPrimaryKey(PropertyDesc propertyDesc) {
            final String propertyName = propertyDesc.getPropertyName();
            if (hasDBMeta() && _dbmeta.hasPrimaryKey() && _dbmeta.hasColumn(propertyName)) {
                if (_dbmeta.findColumnInfo(propertyName).isPrimary()) {
                    return true;
                }
            }
            return hasIdAnnotation(propertyDesc);
        }

        protected boolean hasIdAnnotation(PropertyDesc propertyDesc) {
            final Dbms dbms = getDbms();
            return beanAnnotationReader.getId(propertyDesc, dbms) != null;
        }

        @Override
        protected boolean isPersistent(PropertyType propertyType) {
            final String propertyName = propertyType.getPropertyName();
            final PropertyDesc propertyDesc = propertyType.getPropertyDesc();
            if ((hasDBMeta() && _dbmeta.hasColumn(propertyName)) || hasColumnAnnotation(propertyDesc)) {
                if (!isElementOfNoPersistentProps(propertyDesc)) {
                    return true;
                }
            }
            return false;
        }

        protected boolean hasColumnAnnotation(PropertyDesc propertyDesc) {
            return beanAnnotationReader.getColumnAnnotation(propertyDesc) != null;
        }

        protected boolean isElementOfNoPersistentProps(PropertyDesc propertyDesc) {
            final String propertyName = propertyDesc.getPropertyName();
            final String[] props = _noPersisteneProps;
            if (props != null && props.length >= 0) {
                for (int i = 0; i < props.length; ++i) {
                    if (props[i].equals(propertyName)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public ValueTypeFactory getValueTypeFactory() {
        return valueTypeFactory;
    }

    public void setValueTypeFactory(ValueTypeFactory valueTypeFactory) {
        this.valueTypeFactory = valueTypeFactory;
    }

    public ColumnNaming getColumnNaming() {
        return columnNaming;
    }

    public void setColumnNaming(ColumnNaming columnNaming) {
        this.columnNaming = columnNaming;
    }
}
