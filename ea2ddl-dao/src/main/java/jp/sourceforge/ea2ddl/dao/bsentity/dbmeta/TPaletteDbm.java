package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TPalette;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_palette. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TPaletteDbm extends AbstractDBMeta {

    private static final TPaletteDbm _instance = new TPaletteDbm();
    private TPaletteDbm() {}
    public static TPaletteDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_palette"; }
    public String getTablePropertyName() { return "TPalette"; }
    public String getTableSqlName() { return "t_palette"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnPaletteid = cci("PaletteID", "paletteid", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnName = cci("Name", "name", String.class, false, 255, 0);
    protected ColumnInfo _columnType = cci("Type", "type", String.class, false, 255, 0);

    public ColumnInfo columnPaletteid() { return _columnPaletteid; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnType() { return _columnType; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TPalette"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TPaletteCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TPaletteDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TPaletteBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPalette> getEntityType() { return TPalette.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TPalette newMyEntity() { return new TPalette(); }

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
		doAcceptPrimaryKeyMap((TPalette)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TPalette)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TPalette>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsPaletteid(), columnPaletteid());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsType(), columnType());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TPalette)entity, value);
    }
    
    public static class EpsPaletteid implements Eps<TPalette> {
        public void setup(TPalette e, Object v) { e.setPaletteid((java.lang.Integer)v); }
    }
    public static class EpsName implements Eps<TPalette> {
        public void setup(TPalette e, Object v) { e.setName((String)v); }
    }
    public static class EpsType implements Eps<TPalette> {
        public void setup(TPalette e, Object v) { e.setType((String)v); }
    }
}
