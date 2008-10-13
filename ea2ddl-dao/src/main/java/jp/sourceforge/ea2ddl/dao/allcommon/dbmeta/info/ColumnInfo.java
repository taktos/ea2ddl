package jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info;


import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta.OptimisticLockType;

/**
 * The information of column.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class ColumnInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DBMeta dbmeta;
    protected String columnDbName;
    protected String propertyName;
    protected Class<?> propertyType;
    protected boolean primary;
    protected Integer columnSize;
    protected Integer columnDecimalDigits;
    protected OptimisticLockType optimisticLockType;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ColumnInfo(DBMeta dbmeta, String columnDbName) {
        this(dbmeta, columnDbName, null, null, false, null, null);
    }

    public ColumnInfo(DBMeta dbmeta, String columnDbName, String propertyName
                           , Class<?> propertyType, boolean primary, Integer columnSize) {
        this(dbmeta, columnDbName, propertyName, propertyType, primary, columnSize, null);
    }

    public ColumnInfo(DBMeta dbmeta, String columnDbName, String propertyName
                           , Class<?> propertyType, boolean primary, Integer columnSize, Integer columnDecimalDigits) {
        this(dbmeta, columnDbName, propertyName, propertyType, primary, columnSize, columnDecimalDigits, OptimisticLockType.NONE);
    }

    public ColumnInfo(DBMeta dbmeta, String columnDbName, String propertyName
                           , Class<?> propertyType, boolean primary, Integer columnSize
                           , Integer columnDecimalDigits, OptimisticLockType optimisticLockType) {
        this.dbmeta = dbmeta;
        this.columnDbName = columnDbName;
        this.propertyName = propertyName;
        this.propertyType = propertyType;
        this.primary = primary;
        this.columnSize = columnSize;
        this.columnDecimalDigits = columnDecimalDigits;
        this.optimisticLockType = optimisticLockType;
    }

    // ===================================================================================
    //                                                                             Builder
    //                                                                             =======
    public String buildInitCapPropertyName() {
        return initCap(this.propertyName);
    }

    // ===================================================================================
    //                                                                              Finder
    //                                                                              ======
    public java.lang.reflect.Method findSetter() {
        return findMethod(dbmeta.getEntityType(), "set" + buildInitCapPropertyName(), new Class<?>[] { this.propertyType });
    }

    public java.lang.reflect.Method findGetter() {
        return findMethod(dbmeta.getEntityType(), "get" + buildInitCapPropertyName(), new Class<?>[] {});
    }

    // ===================================================================================
    //                                                                Optimistic Lock Type
    //                                                                ====================
    public boolean isOptimisticLock() {
        return isVersionNo() || isUpdateDate();
    }

    public boolean isVersionNo() {
        return OptimisticLockType.VERSION_NO == optimisticLockType;
    }

    public boolean isUpdateDate() {
        return OptimisticLockType.UPDATE_DATE == optimisticLockType;
    }

    // ===================================================================================
    //                                                                     Internal Helper
    //                                                                     ===============
    protected String initCap(final String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    protected java.lang.reflect.Method findMethod(Class<?> clazz, String methodName, Class<?>[] argTypes) {
        try {
            return clazz.getMethod(methodName, argTypes);
        } catch (NoSuchMethodException ex) {
            String msg = "class=" + clazz + " method=" + methodName + "-" + java.util.Arrays.asList(argTypes);
            throw new RuntimeException(msg, ex);
        }
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public int hashCode() {
        return dbmeta.hashCode() + columnDbName.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ColumnInfo)) {
            return false;
        }
        final ColumnInfo target = (ColumnInfo)obj;
        if (this.dbmeta == null || target.getDBMeta() == null) {
            return false;
        }
        if (!this.dbmeta.equals(target.getDBMeta())) {
            return false;
        }
        if (this.columnDbName == null || target.getColumnDbName() == null) {
            return false;
        }
        if (!this.columnDbName.equals(target.getColumnDbName())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return dbmeta.getTableDbName() + "." + columnDbName;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public DBMeta getDBMeta() {
        return dbmeta;
    }

    public void setDBMeta(DBMeta dbmeta) {
        this.dbmeta = dbmeta;
    }

    public String getColumnDbName() {
        return this.columnDbName;
    }

    public void setColumnDbName(String columnDbName) {
        this.columnDbName = columnDbName;
    }

    public String getPropertyName() {
        return this.propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
	
	public Class<?> getPropertyType() {
        return this.propertyType;
    }

    public void setPropertyType(Class<?> propertyType) {
        this.propertyType = propertyType;
    }

    public boolean isPrimary() {
        return this.primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public Integer getColumnSize() {
        return this.columnSize;
    }

    public void setColumnSize(Integer columnSize) {
        this.columnSize = columnSize;
    }

    public Integer getColumnDecimalDigits() {
        return this.columnDecimalDigits;
    }

    public void setColumnDecimalDigits(Integer columnDecimalDigits) {
        this.columnDecimalDigits = columnDecimalDigits;
    }
}
