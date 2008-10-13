package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TStereotypes;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_stereotypes. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TStereotypesDbm extends AbstractDBMeta {

    private static final TStereotypesDbm _instance = new TStereotypesDbm();
    private TStereotypesDbm() {}
    public static TStereotypesDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_stereotypes"; }
    public String getTablePropertyName() { return "TStereotypes"; }
    public String getTableSqlName() { return "t_stereotypes"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnStereotype = cci("Stereotype", "stereotype", String.class, false, 255, 0);
    protected ColumnInfo _columnAppliesto = cci("AppliesTo", "appliesto", String.class, false, 255, 0);
    protected ColumnInfo _columnDescription = cci("Description", "description", String.class, false, 255, 0);
    protected ColumnInfo _columnMfenabled = cci("MFEnabled", "mfenabled", Boolean.class, false, null, null);
    protected ColumnInfo _columnMfpath = cci("MFPath", "mfpath", String.class, false, 255, 0);
    protected ColumnInfo _columnMetafile = cci("Metafile", "metafile", byte[].class, false, null, null);
    protected ColumnInfo _columnStyle = cci("Style", "style", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnEaGuid = cci("ea_guid", "eaGuid", String.class, false, 50, 0);
    protected ColumnInfo _columnVisualtype = cci("VisualType", "visualtype", String.class, false, 100, 0);

    public ColumnInfo columnStereotype() { return _columnStereotype; }
    public ColumnInfo columnAppliesto() { return _columnAppliesto; }
    public ColumnInfo columnDescription() { return _columnDescription; }
    public ColumnInfo columnMfenabled() { return _columnMfenabled; }
    public ColumnInfo columnMfpath() { return _columnMfpath; }
    public ColumnInfo columnMetafile() { return _columnMetafile; }
    public ColumnInfo columnStyle() { return _columnStyle; }
    public ColumnInfo columnEaGuid() { return _columnEaGuid; }
    public ColumnInfo columnVisualtype() { return _columnVisualtype; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TStereotypes"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TStereotypesCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TStereotypesDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TStereotypesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TStereotypes> getEntityType() { return TStereotypes.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TStereotypes newMyEntity() { return new TStereotypes(); }

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
		doAcceptPrimaryKeyMap((TStereotypes)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TStereotypes)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TStereotypes>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsStereotype(), columnStereotype());
        setupEps(_epsMap, new EpsAppliesto(), columnAppliesto());
        setupEps(_epsMap, new EpsDescription(), columnDescription());
        setupEps(_epsMap, new EpsMfenabled(), columnMfenabled());
        setupEps(_epsMap, new EpsMfpath(), columnMfpath());
        setupEps(_epsMap, new EpsMetafile(), columnMetafile());
        setupEps(_epsMap, new EpsStyle(), columnStyle());
        setupEps(_epsMap, new EpsEaGuid(), columnEaGuid());
        setupEps(_epsMap, new EpsVisualtype(), columnVisualtype());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TStereotypes)entity, value);
    }
    
    public static class EpsStereotype implements Eps<TStereotypes> {
        public void setup(TStereotypes e, Object v) { e.setStereotype((String)v); }
    }
    public static class EpsAppliesto implements Eps<TStereotypes> {
        public void setup(TStereotypes e, Object v) { e.setAppliesto((String)v); }
    }
    public static class EpsDescription implements Eps<TStereotypes> {
        public void setup(TStereotypes e, Object v) { e.setDescription((String)v); }
    }
    public static class EpsMfenabled implements Eps<TStereotypes> {
        public void setup(TStereotypes e, Object v) { e.setMfenabled((Boolean)v); }
    }
    public static class EpsMfpath implements Eps<TStereotypes> {
        public void setup(TStereotypes e, Object v) { e.setMfpath((String)v); }
    }
    public static class EpsMetafile implements Eps<TStereotypes> {
        public void setup(TStereotypes e, Object v) { e.setMetafile((byte[])v); }
    }
    public static class EpsStyle implements Eps<TStereotypes> {
        public void setup(TStereotypes e, Object v) { e.setStyle((String)v); }
    }
    public static class EpsEaGuid implements Eps<TStereotypes> {
        public void setup(TStereotypes e, Object v) { e.setEaGuid((String)v); }
    }
    public static class EpsVisualtype implements Eps<TStereotypes> {
        public void setup(TStereotypes e, Object v) { e.setVisualtype((String)v); }
    }
}
