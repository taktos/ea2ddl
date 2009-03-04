package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TSeclocks;

/**
 * The DB meta of t_seclocks. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TSeclocksDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TSeclocksDbm _instance = new TSeclocksDbm();
    private TSeclocksDbm() {}
    public static TSeclocksDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_seclocks"; }
    public String getTablePropertyName() { return "TSeclocks"; }
    public String getTableSqlName() { return "t_seclocks"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnUserid = cci("UserID", null, "userid", String.class, false, false, 40, 0);
    protected ColumnInfo _columnGroupid = cci("GroupID", null, "groupid", String.class, false, false, 40, 0);
    protected ColumnInfo _columnEntitytype = cci("EntityType", null, "entitytype", String.class, false, false, 32, 0);
    protected ColumnInfo _columnEntityid = cci("EntityID", null, "entityid", String.class, false, false, 40, 0);
    protected ColumnInfo _columnTimestamp = cci("Timestamp", null, "timestamp", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnLocktype = cci("LockType", null, "locktype", String.class, false, false, 255, 0);

    public ColumnInfo columnUserid() { return _columnUserid; }
    public ColumnInfo columnGroupid() { return _columnGroupid; }
    public ColumnInfo columnEntitytype() { return _columnEntitytype; }
    public ColumnInfo columnEntityid() { return _columnEntityid; }
    public ColumnInfo columnTimestamp() { return _columnTimestamp; }
    public ColumnInfo columnLocktype() { return _columnLocktype; }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasTwoOrMorePrimaryKeys() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TSeclocks"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TSeclocksCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TSeclocksDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TSeclocksBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TSeclocks> getEntityType() { return TSeclocks.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TSeclocks newMyEntity() { return new TSeclocks(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TSeclocks)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TSeclocks)entity, columnValueMap, _epsMap); }
    public void acceptColumnValueMapString(Entity entity, String columnValueMapString)
    { MapStringUtil.acceptColumnValueMapString(columnValueMapString, entity); }

    // -----------------------------------------------------
    //                                               Extract
    //                                               -------
    public String extractPrimaryKeyMapString(Entity entity) { return MapStringUtil.extractPrimaryKeyMapString(entity); }
    public String extractPrimaryKeyMapString(Entity entity, String startBrace, String endBrace, String delimiter, String equal)
    { return doExtractPrimaryKeyMapString(entity, startBrace, endBrace, delimiter, equal); }
    public String extractColumnValueMapString(Entity entity) { return MapStringUtil.extractColumnValueMapString(entity); }
    public String extractColumnValueMapString(Entity entity, String startBrace, String endBrace, String delimiter, String equal)
    { return doExtractColumnValueMapString(entity, startBrace, endBrace, delimiter, equal); }

    // -----------------------------------------------------
    //                                               Convert
    //                                               -------
    public List<Object> convertToColumnValueList(Entity entity) { return newArrayList(convertToColumnValueMap(entity).values()); }
    public Map<String, Object> convertToColumnValueMap(Entity entity) { return doConvertToColumnValueMap(entity); }
    public List<String> convertToColumnStringValueList(Entity entity) { return newArrayList(convertToColumnStringValueMap(entity).values()); }
    public Map<String, String> convertToColumnStringValueMap(Entity entity) { return doConvertToColumnStringValueMap(entity); }

    // ===================================================================================
    //                                                               Entity Property Setup
    //                                                               =====================
    // It's very INTERNAL!
    protected Map<String, Eps<TSeclocks>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsUserid(), columnUserid());
        setupEps(_epsMap, new EpsGroupid(), columnGroupid());
        setupEps(_epsMap, new EpsEntitytype(), columnEntitytype());
        setupEps(_epsMap, new EpsEntityid(), columnEntityid());
        setupEps(_epsMap, new EpsTimestamp(), columnTimestamp());
        setupEps(_epsMap, new EpsLocktype(), columnLocktype());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TSeclocks)entity, value); }

    public static class EpsUserid implements Eps<TSeclocks>
    { public void setup(TSeclocks e, Object v) { e.setUserid((String)v); } }
    public static class EpsGroupid implements Eps<TSeclocks>
    { public void setup(TSeclocks e, Object v) { e.setGroupid((String)v); } }
    public static class EpsEntitytype implements Eps<TSeclocks>
    { public void setup(TSeclocks e, Object v) { e.setEntitytype((String)v); } }
    public static class EpsEntityid implements Eps<TSeclocks>
    { public void setup(TSeclocks e, Object v) { e.setEntityid((String)v); } }
    public static class EpsTimestamp implements Eps<TSeclocks>
    { public void setup(TSeclocks e, Object v) { e.setTimestamp((java.sql.Timestamp)v); } }
    public static class EpsLocktype implements Eps<TSeclocks>
    { public void setup(TSeclocks e, Object v) { e.setLocktype((String)v); } }
}
