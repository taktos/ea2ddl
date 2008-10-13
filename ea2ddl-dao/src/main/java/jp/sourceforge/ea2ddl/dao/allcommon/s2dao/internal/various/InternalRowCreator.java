package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.various;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.ValueType;
import org.seasar.dao.impl.RowCreatorImpl;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.InternalMapContext;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleSystemUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalRowCreator extends RowCreatorImpl {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(InternalRowCreator.class);

    /** The key of DBMeta cache. */
    protected static final String DBMETA_CACHE_KEY = "df:DBMetaCache";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DBMeta _dbmeta;
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    protected InternalRowCreator() {}

    /**
     * @param beanClass The class of target bean to find DB-meta. (Nullable)
     * @return The instance of internal row creator. (NotNull)
     */
    public static InternalRowCreator createInternalRowCreator(Class<?> beanClass) {
        final InternalRowCreator rowCreator = new InternalRowCreator();
        if (beanClass != null) {
            rowCreator.setDBMeta(findDBMetaByClass(beanClass));
        }
        return rowCreator;
    }

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    @SuppressWarnings("unchecked")
    @Override
    public Object createRow(ResultSet rs, Map propertyCache, Class beanClass) throws SQLException  {
        final Set columnNameSet = propertyCache.keySet();
        String columnName = null;
        PropertyType pt = null;
        String propertyName = null;
        final Object row;
        final DBMeta dbmeta;
        if (_dbmeta != null) {
            dbmeta = _dbmeta;
            row = dbmeta.newEntity();
        } else {
            row = newBean(beanClass);
            dbmeta = findDBMeta(row);
        }
        try {
            if (dbmeta != null) {
                for (final Iterator ite = columnNameSet.iterator(); ite.hasNext();) {
                    columnName = (String) ite.next();
                    pt = (PropertyType) propertyCache.get(columnName);
                    propertyName = pt.getPropertyName();
                    if (dbmeta.hasEntityPropertySetupper(propertyName)) {
                        final ValueType valueType = pt.getValueType();
                        final Object value = valueType.getValue(rs, columnName);
                        dbmeta.setupEntityProperty(propertyName, row, value);
                    } else {
                        registerValue(rs, row, pt, columnName);
                    }
                }
            } else {
                for (final Iterator ite = columnNameSet.iterator(); ite.hasNext();) {
                    columnName = (String) ite.next();
                    pt = (PropertyType) propertyCache.get(columnName);
                    propertyName = pt.getPropertyName();
                    registerValue(rs, row, pt, columnName);
                }
            }
            return row;
        } catch (ClassCastException e) {
            if (_log.isWarnEnabled()) {
                String msg = ClassCastException.class.getSimpleName() + " occurred while ResultSet Handling:";
                _log.warn(msg + " target=" + beanClass.getSimpleName() + "." + propertyName + " dbmeta");
            }
            throwNonsenseClassCastException(row, dbmeta, e);
            return null; // Unreachable!
        } catch (SQLException e) {
            if (_log.isWarnEnabled()) {
                String msg = SQLException.class.getSimpleName() + " occurred while ResultSet Handling:";
                _log.warn(msg + " target=" + beanClass.getSimpleName() + "." + propertyName);
            }
            throw e;
        }
    }
    
    protected void throwNonsenseClassCastException(Object entity, DBMeta dbmeta, ClassCastException e) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "Nonsense ClassCastException occured!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "This exception may be from ClassLoader Headache about HotDeploy." + getLineSeparator();
        msg = msg + "Please add the ignore-package setting to convention.dicon like as follows:" + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    <initMethod name=”addIgnorePackageName”>" + getLineSeparator();
        msg = msg + "        <arg>”com.example.xxx.dbflute”</arg>" + getLineSeparator();
        msg = msg + "    </initMethod>" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Exception Message]" + getLineSeparator() + e.getMessage() + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Target Entity]" + getLineSeparator() + entity + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Target Entity Class Loader]" + getLineSeparator() + entity.getClass().getClassLoader() + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Target DBMeta]" + getLineSeparator() + dbmeta + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Target DBMeta Class Loader]" + getLineSeparator() + dbmeta.getClass().getClassLoader() + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new NonsenseClassCastException(msg, e);
    }

    public static class NonsenseClassCastException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public NonsenseClassCastException(String msg, ClassCastException e) {
            super(msg, e);
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    /**
     * @param row The instance of row. (NotNull)
     * @return The interface of DBMeta. (Nullable: If it's null, it means NotFound.)
     */
    public static DBMeta findDBMeta(Object row) {
        return DBMetaCacheHandler.findDBMeta(row);
    }

    /**
     * @param rowType The type of row. (NotNull)
     * @param tableName The name of table. (NotNull)
     * @return The interface of DBMeta. (Nullable: If it's null, it means NotFound.)
     */
    public static DBMeta findDBMeta(Class<?> rowType, String tableName) {
        return DBMetaCacheHandler.findDBMeta(rowType, tableName);
    }

    protected static class DBMetaCacheHandler {
        
        /** The key of DBMeta cache. */
        protected static final String DBMETA_CACHE_KEY = "df:DBMetaCache";

        public static DBMeta findDBMeta(Object row) {
            if (!(row instanceof Entity)) {
                return null;
            }
            final Entity entity = (Entity) row;
            DBMeta dbmeta = findCachedDBMeta(entity.getClass());
            if (dbmeta != null) {
                return dbmeta;
            }
            dbmeta = entity.getDBMeta();
            cacheDBMeta(entity, dbmeta);
            return dbmeta;
        }
        
        public static DBMeta findDBMeta(Class<?> rowType, String tableName) {
            DBMeta dbmeta = findCachedDBMeta(rowType);
            if (dbmeta != null) {
                return dbmeta;
            }
            try {
                dbmeta = DBMetaInstanceHandler.findDBMeta(tableName);
            } catch (DBMetaInstanceHandler.DBMetaNotFoundException ignored) {
                return null;
            }
            cacheDBMeta(rowType, dbmeta);
            return dbmeta;
        }

        protected static DBMeta findCachedDBMeta(Class<?> rowType) {
            Map<Class<?>, DBMeta> dbmetaCache = findDBMetaCache();
            if (dbmetaCache == null) {
                dbmetaCache = new HashMap<Class<?>, DBMeta>();
                InternalMapContext.setObject(DBMETA_CACHE_KEY, dbmetaCache);
            }
            return dbmetaCache.get(rowType);
        }
        
        protected static void cacheDBMeta(Entity entity, DBMeta dbmeta) {
            cacheDBMeta(entity.getClass(), dbmeta);
        }
        
        protected static void cacheDBMeta(Class<?> type, DBMeta dbmeta) {
            final Map<Class<?>, DBMeta> dbmetaCache = findDBMetaCache();
            dbmetaCache.put(type, dbmeta);
        }
        
        @SuppressWarnings("unchecked")
        protected static Map<Class<?>, DBMeta> findDBMetaCache() {
            return (Map<Class<?>, DBMeta>)InternalMapContext.getObject(DBMETA_CACHE_KEY);
        }
    }

    protected static DBMeta findDBMetaByClass(Class<?> beanClass) {
        final Object instance = newInstance(beanClass);
        if (!(instance instanceof Entity)) {
            return null;
        }
        return ((Entity)instance).getDBMeta();
    }

    protected static Object newInstance(Class<?> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String getLineSeparator() {
        return SimpleSystemUtil.getLineSeparator();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setDBMeta(DBMeta dbmeta) {
        this._dbmeta = dbmeta;
    }
}
