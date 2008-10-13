package jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info;


import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;

/**
 * The class of foreign information.
 * 
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class ForeignInfo implements RelationInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected String foreignPropertyName;
    protected DBMeta localDBMeta;
    protected DBMeta foreignDBMeta;
    protected java.util.Map<ColumnInfo, ColumnInfo> localForeignColumnInfoMap;
    protected java.util.Map<ColumnInfo, ColumnInfo> foreignLocalColumnInfoMap;
    protected int relationNo;
    protected boolean oneToOne;

    // ===================================================================================
    //                                                                              Finder
    //                                                                              ======
    public ColumnInfo findLocalByForeign(String foreignColumnDbName) {
        final ColumnInfo keyColumnInfo = new ColumnInfo(foreignDBMeta, foreignColumnDbName);
        final ColumnInfo resultColumnInfo = (ColumnInfo)foreignLocalColumnInfoMap.get(keyColumnInfo);
        if (resultColumnInfo == null) {
            String msg = "Not found by foreignColumnDbName in foreignLocalColumnInfoMap:";
            msg = msg + " foreignColumnDbName=" + foreignColumnDbName + " foreignLocalColumnInfoMap=" + foreignLocalColumnInfoMap;
            throw new IllegalArgumentException(msg);
        }
        return resultColumnInfo;
    }

    // ===================================================================================
    //                                                                             Builder
    //                                                                             =======
    public String buildInitCapPropertyName() {
        return initCap(this.foreignPropertyName);
    }

    // ===================================================================================
    //                                                                              Finder
    //                                                                              ======
    public java.lang.reflect.Method findSetter() {
        return findMethod(localDBMeta.getEntityType(), "set" + buildInitCapPropertyName(), new Class[] { java.util.List.class });
    }

    public java.lang.reflect.Method findGetter() {
        return findMethod(localDBMeta.getEntityType(), "get" + buildInitCapPropertyName(), new Class[] {});
    }

    // ===================================================================================
    //                                                                           Implement
    //                                                                           =========
    public String getRelationPropertyName() {
        return getForeignPropertyName();
    }

    public DBMeta getTargetDBMeta() {
        return getForeignDBMeta();
    }

    public java.util.Map<ColumnInfo, ColumnInfo> getLocalTargetColumnInfoMap() {
        return getLocalForeignColumnInfoMap();
    }

    public boolean isReferrer() {
        return false;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getForeignPropertyName() {
        return foreignPropertyName;
    }

    public void setForeignPropertyName(String foreignPropertyName) {
        this.foreignPropertyName = foreignPropertyName;
    }

    public DBMeta getLocalDBMeta() {
        return localDBMeta;
    }

    public void setLocalDBMeta(DBMeta localDBMeta) {
        this.localDBMeta = localDBMeta;
    }

    public DBMeta getForeignDBMeta() {
        return foreignDBMeta;
    }

    public void setForeignDBMeta(DBMeta foreignDBMeta) {
        this.foreignDBMeta = foreignDBMeta;
    }

    public java.util.Map<ColumnInfo, ColumnInfo> getLocalForeignColumnInfoMap() {
        return localForeignColumnInfoMap;
    }

    public void setLocalForeignColumnInfoMap(java.util.Map<ColumnInfo, ColumnInfo> localForeignColumnInfoMap) {
        this.localForeignColumnInfoMap = localForeignColumnInfoMap;
        final java.util.Set keySet = localForeignColumnInfoMap.keySet();
        foreignLocalColumnInfoMap = new java.util.LinkedHashMap<ColumnInfo, ColumnInfo>();
        for (final java.util.Iterator ite = keySet.iterator(); ite.hasNext(); ) {
            final ColumnInfo key = (ColumnInfo)ite.next();
            final ColumnInfo value = (ColumnInfo)localForeignColumnInfoMap.get(key);
            foreignLocalColumnInfoMap.put(value, key);
        }
    }

    public java.util.Map<ColumnInfo, ColumnInfo> getForeignLocalColumnInfoMap() {
        return foreignLocalColumnInfoMap;
    }

    public int getRelationNo() {
        return relationNo;
    }

    public void setRelationNo(int relationNo) {
        this.relationNo = relationNo;
    }

    public boolean isOneToOne() {
        return oneToOne;
    }

    public void setOneToOne(boolean oneToOne) {
        this.oneToOne = oneToOne;
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected java.lang.reflect.Method findMethod(Class clazz, String methodName, Class[] argTypes) {
        try {
            return clazz.getMethod(methodName, argTypes);
        } catch (NoSuchMethodException ex) {
            String msg = "class=" + clazz + " method=" + methodName + "-" + java.util.Arrays.asList(argTypes);
            throw new RuntimeException(msg, ex);
        }
    }
	
    protected String initCap(final String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
