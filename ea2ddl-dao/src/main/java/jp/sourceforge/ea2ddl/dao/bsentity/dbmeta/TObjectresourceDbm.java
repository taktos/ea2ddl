package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TObjectresource;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_objectresource. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TObjectresourceDbm extends AbstractDBMeta {

    private static final TObjectresourceDbm _instance = new TObjectresourceDbm();
    private TObjectresourceDbm() {}
    public static TObjectresourceDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_objectresource"; }
    public String getTablePropertyName() { return "TObjectresource"; }
    public String getTableSqlName() { return "t_objectresource"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnObjectId = cci("Object_ID", "objectId", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnResource = cci("Resource", "resource", String.class, false, 255, 0);
    protected ColumnInfo _columnRole = cci("Role", "role", String.class, false, 255, 0);
    protected ColumnInfo _columnTime = cci("Time", "time", java.math.BigDecimal.class, false, null, null);
    protected ColumnInfo _columnNotes = cci("Notes", "notes", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnPercentcomplete = cci("PercentComplete", "percentcomplete", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnDatestart = cci("DateStart", "datestart", java.sql.Timestamp.class, false, null, null);
    protected ColumnInfo _columnDateend = cci("DateEnd", "dateend", java.sql.Timestamp.class, false, null, null);
    protected ColumnInfo _columnHistory = cci("History", "history", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnExpectedhours = cci("ExpectedHours", "expectedhours", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnActualhours = cci("ActualHours", "actualhours", java.lang.Integer.class, false, null, null);

    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnResource() { return _columnResource; }
    public ColumnInfo columnRole() { return _columnRole; }
    public ColumnInfo columnTime() { return _columnTime; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnPercentcomplete() { return _columnPercentcomplete; }
    public ColumnInfo columnDatestart() { return _columnDatestart; }
    public ColumnInfo columnDateend() { return _columnDateend; }
    public ColumnInfo columnHistory() { return _columnHistory; }
    public ColumnInfo columnExpectedhours() { return _columnExpectedhours; }
    public ColumnInfo columnActualhours() { return _columnActualhours; }
    { initializeColumnInfoList(); }

    // ===================================================================================
    //                                                                            Name Map
    //                                                                            ========
    public Map<String, String> getDbNamePropertyNameKeyToLowerMap() { return createDbNamePropertyNameKeyToLowerMap(); }
    public Map<String, String> getPropertyNameDbNameKeyToLowerMap() { return createPropertyNameDbNameKeyToLowerMap(); }
    protected static Map<String, String> _dbNamePropertyNameKeyToLowerMap;
    protected Map<String, String> createDbNamePropertyNameKeyToLowerMap() {
        if (_dbNamePropertyNameKeyToLowerMap == null) { _dbNamePropertyNameKeyToLowerMap = setupKeyToLowerMap(true); }
        return _dbNamePropertyNameKeyToLowerMap;
    }
    protected static Map<String, String> _propertyNameDbNameKeyToLowerMap;
    protected Map<String, String> createPropertyNameDbNameKeyToLowerMap() {
        if (_propertyNameDbNameKeyToLowerMap == null) { _propertyNameDbNameKeyToLowerMap = setupKeyToLowerMap(false); }
        return _propertyNameDbNameKeyToLowerMap;
    }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TObjectresource"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TObjectresourceCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TObjectresourceDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TObjectresourceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TObjectresource> getEntityType() { return TObjectresource.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TObjectresource newMyEntity() { return new TObjectresource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() {
        throw new UnsupportedOperationException("The table doen not have primary key: " + getTableDbName());
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
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap) {
		doAcceptPrimaryKeyMap((TObjectresource)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TObjectresource)entity, columnValueMap, _epsMap);
    }

    public void acceptColumnValueMapString(Entity entity, String columnValueMapString) {
        MapStringUtil.acceptColumnValueMapString(columnValueMapString, entity);
    }

    // -----------------------------------------------------
    //                                               Extract
    //                                               -------
    public String extractPrimaryKeyMapString(Entity entity) { return MapStringUtil.extractPrimaryKeyMapString(entity); }
    public String extractPrimaryKeyMapString(Entity entity, String startBrace, String endBrace, String delimiter, String equal) {
        return doExtractPrimaryKeyMapString(entity, startBrace, endBrace, delimiter, equal);
    }
    public String extractColumnValueMapString(Entity entity) { return MapStringUtil.extractColumnValueMapString(entity); }
    public String extractColumnValueMapString(Entity entity, String startBrace, String endBrace, String delimiter, String equal) {
        return doExtractColumnValueMapString(entity, startBrace, endBrace, delimiter, equal);
    }

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
    protected Map<String, Eps<TObjectresource>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsResource(), columnResource());
        setupEps(_epsMap, new EpsRole(), columnRole());
        setupEps(_epsMap, new EpsTime(), columnTime());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsPercentcomplete(), columnPercentcomplete());
        setupEps(_epsMap, new EpsDatestart(), columnDatestart());
        setupEps(_epsMap, new EpsDateend(), columnDateend());
        setupEps(_epsMap, new EpsHistory(), columnHistory());
        setupEps(_epsMap, new EpsExpectedhours(), columnExpectedhours());
        setupEps(_epsMap, new EpsActualhours(), columnActualhours());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TObjectresource)entity, value);
    }
    
    public static class EpsObjectId implements Eps<TObjectresource> {
        public void setup(TObjectresource e, Object v) { e.setObjectId((java.lang.Integer)v); }
    }
    public static class EpsResource implements Eps<TObjectresource> {
        public void setup(TObjectresource e, Object v) { e.setResource((String)v); }
    }
    public static class EpsRole implements Eps<TObjectresource> {
        public void setup(TObjectresource e, Object v) { e.setRole((String)v); }
    }
    public static class EpsTime implements Eps<TObjectresource> {
        public void setup(TObjectresource e, Object v) { e.setTime((java.math.BigDecimal)v); }
    }
    public static class EpsNotes implements Eps<TObjectresource> {
        public void setup(TObjectresource e, Object v) { e.setNotes((String)v); }
    }
    public static class EpsPercentcomplete implements Eps<TObjectresource> {
        public void setup(TObjectresource e, Object v) { e.setPercentcomplete((java.lang.Integer)v); }
    }
    public static class EpsDatestart implements Eps<TObjectresource> {
        public void setup(TObjectresource e, Object v) { e.setDatestart((java.sql.Timestamp)v); }
    }
    public static class EpsDateend implements Eps<TObjectresource> {
        public void setup(TObjectresource e, Object v) { e.setDateend((java.sql.Timestamp)v); }
    }
    public static class EpsHistory implements Eps<TObjectresource> {
        public void setup(TObjectresource e, Object v) { e.setHistory((String)v); }
    }
    public static class EpsExpectedhours implements Eps<TObjectresource> {
        public void setup(TObjectresource e, Object v) { e.setExpectedhours((java.lang.Integer)v); }
    }
    public static class EpsActualhours implements Eps<TObjectresource> {
        public void setup(TObjectresource e, Object v) { e.setActualhours((java.lang.Integer)v); }
    }
}
