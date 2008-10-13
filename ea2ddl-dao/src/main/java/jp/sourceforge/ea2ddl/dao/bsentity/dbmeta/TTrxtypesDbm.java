package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TTrxtypes;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_trxtypes. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TTrxtypesDbm extends AbstractDBMeta {

    private static final TTrxtypesDbm _instance = new TTrxtypesDbm();
    private TTrxtypesDbm() {}
    public static TTrxtypesDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_trxtypes"; }
    public String getTablePropertyName() { return "TTrxtypes"; }
    public String getTableSqlName() { return "t_trxtypes"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnDescription = cci("Description", "description", String.class, false, 50, 0);
    protected ColumnInfo _columnNumericweight = cci("NumericWeight", "numericweight", java.math.BigDecimal.class, false, null, null);
    protected ColumnInfo _columnNotes = cci("Notes", "notes", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnTrx = cci("TRX", "trx", String.class, false, 255, 0);
    protected ColumnInfo _columnTrxId = cci("TRX_ID", "trxId", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnStyle = cci("Style", "style", String.class, false, 2147483647, 0);

    public ColumnInfo columnDescription() { return _columnDescription; }
    public ColumnInfo columnNumericweight() { return _columnNumericweight; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnTrx() { return _columnTrx; }
    public ColumnInfo columnTrxId() { return _columnTrxId; }
    public ColumnInfo columnStyle() { return _columnStyle; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TTrxtypes"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TTrxtypesCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TTrxtypesDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TTrxtypesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrxtypes> getEntityType() { return TTrxtypes.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TTrxtypes newMyEntity() { return new TTrxtypes(); }

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
		doAcceptPrimaryKeyMap((TTrxtypes)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TTrxtypes)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TTrxtypes>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsDescription(), columnDescription());
        setupEps(_epsMap, new EpsNumericweight(), columnNumericweight());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsTrx(), columnTrx());
        setupEps(_epsMap, new EpsTrxId(), columnTrxId());
        setupEps(_epsMap, new EpsStyle(), columnStyle());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TTrxtypes)entity, value);
    }
    
    public static class EpsDescription implements Eps<TTrxtypes> {
        public void setup(TTrxtypes e, Object v) { e.setDescription((String)v); }
    }
    public static class EpsNumericweight implements Eps<TTrxtypes> {
        public void setup(TTrxtypes e, Object v) { e.setNumericweight((java.math.BigDecimal)v); }
    }
    public static class EpsNotes implements Eps<TTrxtypes> {
        public void setup(TTrxtypes e, Object v) { e.setNotes((String)v); }
    }
    public static class EpsTrx implements Eps<TTrxtypes> {
        public void setup(TTrxtypes e, Object v) { e.setTrx((String)v); }
    }
    public static class EpsTrxId implements Eps<TTrxtypes> {
        public void setup(TTrxtypes e, Object v) { e.setTrxId((java.lang.Integer)v); }
    }
    public static class EpsStyle implements Eps<TTrxtypes> {
        public void setup(TTrxtypes e, Object v) { e.setStyle((String)v); }
    }
}
