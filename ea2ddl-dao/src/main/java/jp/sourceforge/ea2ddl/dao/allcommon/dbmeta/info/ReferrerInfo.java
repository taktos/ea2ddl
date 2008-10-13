package jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info;


import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;

/**
 * The class of referrer information.
 * 
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class ReferrerInfo implements RelationInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected String referrerPropertyName;
    protected DBMeta localDBMeta;
    protected DBMeta referrerDBMeta;
    protected java.util.Map<ColumnInfo, ColumnInfo> localReferrerColumnInfoMap;
    protected java.util.Map<ColumnInfo, ColumnInfo> referrerLocalColumnInfoMap;
    protected boolean oneToOne;

    // ===================================================================================
    //                                                                              Finder
    //                                                                              ======
    public ColumnInfo findLocalByReferrer(String referrerColumnDbName) {
        final ColumnInfo keyColumnInfo = new ColumnInfo(referrerDBMeta, referrerColumnDbName);
        final ColumnInfo resultColumnInfo = (ColumnInfo)referrerLocalColumnInfoMap.get(keyColumnInfo);
        if (resultColumnInfo == null) {
            String msg = "Not found by referrerColumnDbName in referrerLocalColumnInfoMap:";
            msg = msg + " referrerColumnDbName=" + referrerColumnDbName + " referrerLocalColumnInfoMap=" + referrerLocalColumnInfoMap;
            throw new IllegalArgumentException(msg);
        }
        return resultColumnInfo;
    }

    public ColumnInfo findReferrerByLocal(String localColumnDbName) {
        final ColumnInfo keyColumnInfo = new ColumnInfo(localDBMeta, localColumnDbName);
        final ColumnInfo resultColumnInfo = (ColumnInfo)localReferrerColumnInfoMap.get(keyColumnInfo);
        if (resultColumnInfo == null) {
            String msg = "Not found by localColumnDbName in localReferrerColumnInfoMap:";
            msg = msg + " localColumnDbName=" + localColumnDbName + " localReferrerColumnInfoMap=" + localReferrerColumnInfoMap;
            throw new IllegalArgumentException(msg);
        }
        return resultColumnInfo;
    }

    // ===================================================================================
    //                                                                             Builder
    //                                                                             =======
    public String buildInitCapPropertyName() {
        return initCap(this.referrerPropertyName);
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
        return getReferrerPropertyName();
    }

    public DBMeta getTargetDBMeta() {
        return getReferrerDBMeta();
    }

    public java.util.Map<ColumnInfo, ColumnInfo> getLocalTargetColumnInfoMap() {
        return getLocalReferrerColumnInfoMap();
    }

    public boolean isReferrer() {
        return true;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getReferrerPropertyName() {
        return referrerPropertyName;
    }

    public void setReferrerPropertyName(String referrerPropertyName) {
        this.referrerPropertyName = referrerPropertyName;
    }

    public DBMeta getLocalDBMeta() {
        return localDBMeta;
    }

    public void setLocalDBMeta(DBMeta localDBMeta) {
        this.localDBMeta = localDBMeta;
    }

    public DBMeta getReferrerDBMeta() {
        return referrerDBMeta;
    }

    public void setReferrerDBMeta(DBMeta referrerDBMeta) {
        this.referrerDBMeta = referrerDBMeta;
    }

    public java.util.Map<ColumnInfo, ColumnInfo> getLocalReferrerColumnInfoMap() {
        return localReferrerColumnInfoMap;
    }

    public void setLocalReferrerColumnInfoMap(java.util.Map<ColumnInfo, ColumnInfo> localReferrerColumnInfoMap) {
        this.localReferrerColumnInfoMap = localReferrerColumnInfoMap;
        final java.util.Set keySet = localReferrerColumnInfoMap.keySet();
        referrerLocalColumnInfoMap = new java.util.LinkedHashMap<ColumnInfo, ColumnInfo>();
        for (final java.util.Iterator ite = keySet.iterator(); ite.hasNext(); ) {
            final ColumnInfo key = (ColumnInfo)ite.next();
            final ColumnInfo value = (ColumnInfo)localReferrerColumnInfoMap.get(key);
            referrerLocalColumnInfoMap.put(value, key);
        }
    }

    public java.util.Map<ColumnInfo, ColumnInfo> getReferrerLocalColumnInfoMap() {
        return referrerLocalColumnInfoMap;
    }

    public boolean isOneToOne() {
        return oneToOne;
    }

    public void setOneToOne(boolean oneToOne) {
        this.oneToOne = oneToOne;
    }

    // ===================================================================================
    //                                                                     Internal Helper
    //                                                                     ===============
    protected String initCap(final String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    protected java.lang.reflect.Method findMethod(Class clazz, String methodName, Class[] argTypes) {
        try {
            return clazz.getMethod(methodName, argTypes);
        } catch (NoSuchMethodException ex) {
            String msg = "class=" + clazz + " method=" + methodName + "-" + java.util.Arrays.asList(argTypes);
            throw new RuntimeException(msg, ex);
        }
    }
}
