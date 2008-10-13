package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TDiagramlinks;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_diagramlinks. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TDiagramlinksDbm extends AbstractDBMeta {

    private static final TDiagramlinksDbm _instance = new TDiagramlinksDbm();
    private TDiagramlinksDbm() {}
    public static TDiagramlinksDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_diagramlinks"; }
    public String getTablePropertyName() { return "TDiagramlinks"; }
    public String getTableSqlName() { return "t_diagramlinks"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnDiagramid = cci("DiagramID", "diagramid", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnConnectorid = cci("ConnectorID", "connectorid", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnGeometry = cci("Geometry", "geometry", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnStyle = cci("Style", "style", String.class, false, 255, 0);
    protected ColumnInfo _columnHidden = cci("Hidden", "hidden", Boolean.class, false, null, null);
    protected ColumnInfo _columnPath = cci("Path", "path", String.class, false, 255, 0);
    protected ColumnInfo _columnInstanceId = cci("Instance_ID", "instanceId", java.lang.Integer.class, false, null, null);

    public ColumnInfo columnDiagramid() { return _columnDiagramid; }
    public ColumnInfo columnConnectorid() { return _columnConnectorid; }
    public ColumnInfo columnGeometry() { return _columnGeometry; }
    public ColumnInfo columnStyle() { return _columnStyle; }
    public ColumnInfo columnHidden() { return _columnHidden; }
    public ColumnInfo columnPath() { return _columnPath; }
    public ColumnInfo columnInstanceId() { return _columnInstanceId; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TDiagramlinks"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TDiagramlinksCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TDiagramlinksDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TDiagramlinksBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TDiagramlinks> getEntityType() { return TDiagramlinks.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TDiagramlinks newMyEntity() { return new TDiagramlinks(); }

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
		doAcceptPrimaryKeyMap((TDiagramlinks)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TDiagramlinks)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TDiagramlinks>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsDiagramid(), columnDiagramid());
        setupEps(_epsMap, new EpsConnectorid(), columnConnectorid());
        setupEps(_epsMap, new EpsGeometry(), columnGeometry());
        setupEps(_epsMap, new EpsStyle(), columnStyle());
        setupEps(_epsMap, new EpsHidden(), columnHidden());
        setupEps(_epsMap, new EpsPath(), columnPath());
        setupEps(_epsMap, new EpsInstanceId(), columnInstanceId());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TDiagramlinks)entity, value);
    }
    
    public static class EpsDiagramid implements Eps<TDiagramlinks> {
        public void setup(TDiagramlinks e, Object v) { e.setDiagramid((java.lang.Integer)v); }
    }
    public static class EpsConnectorid implements Eps<TDiagramlinks> {
        public void setup(TDiagramlinks e, Object v) { e.setConnectorid((java.lang.Integer)v); }
    }
    public static class EpsGeometry implements Eps<TDiagramlinks> {
        public void setup(TDiagramlinks e, Object v) { e.setGeometry((String)v); }
    }
    public static class EpsStyle implements Eps<TDiagramlinks> {
        public void setup(TDiagramlinks e, Object v) { e.setStyle((String)v); }
    }
    public static class EpsHidden implements Eps<TDiagramlinks> {
        public void setup(TDiagramlinks e, Object v) { e.setHidden((Boolean)v); }
    }
    public static class EpsPath implements Eps<TDiagramlinks> {
        public void setup(TDiagramlinks e, Object v) { e.setPath((String)v); }
    }
    public static class EpsInstanceId implements Eps<TDiagramlinks> {
        public void setup(TDiagramlinks e, Object v) { e.setInstanceId((java.lang.Integer)v); }
    }
}
