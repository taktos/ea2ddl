package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TSnapshot;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_snapshot. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TSnapshotDbm extends AbstractDBMeta {

    private static final TSnapshotDbm _instance = new TSnapshotDbm();
    private TSnapshotDbm() {}
    public static TSnapshotDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_snapshot"; }
    public String getTablePropertyName() { return "TSnapshot"; }
    public String getTableSqlName() { return "t_snapshot"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnSnapshotid = cci("SnapshotID", "snapshotid", String.class, false, 40, 0);
    protected ColumnInfo _columnSeriesid = cci("SeriesID", "seriesid", String.class, false, 40, 0);
    protected ColumnInfo _columnPosition = cci("Position", "position", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnSnapshotname = cci("SnapshotName", "snapshotname", String.class, false, 100, 0);
    protected ColumnInfo _columnNotes = cci("Notes", "notes", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnStyle = cci("Style", "style", String.class, false, 255, 0);
    protected ColumnInfo _columnElementid = cci("ElementID", "elementid", String.class, false, 40, 0);
    protected ColumnInfo _columnElementtype = cci("ElementType", "elementtype", String.class, false, 50, 0);
    protected ColumnInfo _columnStrcontent = cci("StrContent", "strcontent", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnBincontent1 = cci("BinContent1", "bincontent1", byte[].class, false, null, null);
    protected ColumnInfo _columnBincontent2 = cci("BinContent2", "bincontent2", byte[].class, false, null, null);

    public ColumnInfo columnSnapshotid() { return _columnSnapshotid; }
    public ColumnInfo columnSeriesid() { return _columnSeriesid; }
    public ColumnInfo columnPosition() { return _columnPosition; }
    public ColumnInfo columnSnapshotname() { return _columnSnapshotname; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnStyle() { return _columnStyle; }
    public ColumnInfo columnElementid() { return _columnElementid; }
    public ColumnInfo columnElementtype() { return _columnElementtype; }
    public ColumnInfo columnStrcontent() { return _columnStrcontent; }
    public ColumnInfo columnBincontent1() { return _columnBincontent1; }
    public ColumnInfo columnBincontent2() { return _columnBincontent2; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TSnapshot"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TSnapshotCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TSnapshotDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TSnapshotBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TSnapshot> getEntityType() { return TSnapshot.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TSnapshot newMyEntity() { return new TSnapshot(); }

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
		doAcceptPrimaryKeyMap((TSnapshot)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TSnapshot)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TSnapshot>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsSnapshotid(), columnSnapshotid());
        setupEps(_epsMap, new EpsSeriesid(), columnSeriesid());
        setupEps(_epsMap, new EpsPosition(), columnPosition());
        setupEps(_epsMap, new EpsSnapshotname(), columnSnapshotname());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsStyle(), columnStyle());
        setupEps(_epsMap, new EpsElementid(), columnElementid());
        setupEps(_epsMap, new EpsElementtype(), columnElementtype());
        setupEps(_epsMap, new EpsStrcontent(), columnStrcontent());
        setupEps(_epsMap, new EpsBincontent1(), columnBincontent1());
        setupEps(_epsMap, new EpsBincontent2(), columnBincontent2());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TSnapshot)entity, value);
    }
    
    public static class EpsSnapshotid implements Eps<TSnapshot> {
        public void setup(TSnapshot e, Object v) { e.setSnapshotid((String)v); }
    }
    public static class EpsSeriesid implements Eps<TSnapshot> {
        public void setup(TSnapshot e, Object v) { e.setSeriesid((String)v); }
    }
    public static class EpsPosition implements Eps<TSnapshot> {
        public void setup(TSnapshot e, Object v) { e.setPosition((java.lang.Integer)v); }
    }
    public static class EpsSnapshotname implements Eps<TSnapshot> {
        public void setup(TSnapshot e, Object v) { e.setSnapshotname((String)v); }
    }
    public static class EpsNotes implements Eps<TSnapshot> {
        public void setup(TSnapshot e, Object v) { e.setNotes((String)v); }
    }
    public static class EpsStyle implements Eps<TSnapshot> {
        public void setup(TSnapshot e, Object v) { e.setStyle((String)v); }
    }
    public static class EpsElementid implements Eps<TSnapshot> {
        public void setup(TSnapshot e, Object v) { e.setElementid((String)v); }
    }
    public static class EpsElementtype implements Eps<TSnapshot> {
        public void setup(TSnapshot e, Object v) { e.setElementtype((String)v); }
    }
    public static class EpsStrcontent implements Eps<TSnapshot> {
        public void setup(TSnapshot e, Object v) { e.setStrcontent((String)v); }
    }
    public static class EpsBincontent1 implements Eps<TSnapshot> {
        public void setup(TSnapshot e, Object v) { e.setBincontent1((byte[])v); }
    }
    public static class EpsBincontent2 implements Eps<TSnapshot> {
        public void setup(TSnapshot e, Object v) { e.setBincontent2((byte[])v); }
    }
}
