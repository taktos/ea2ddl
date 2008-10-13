package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TVersion;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_version. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TVersionDbm extends AbstractDBMeta {

    private static final TVersionDbm _instance = new TVersionDbm();
    private TVersionDbm() {}
    public static TVersionDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_version"; }
    public String getTablePropertyName() { return "TVersion"; }
    public String getTableSqlName() { return "t_version"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnElementid = cci("ElementID", "elementid", String.class, false, 50, 0);
    protected ColumnInfo _columnVersionid = cci("VersionID", "versionid", String.class, false, 255, 0);
    protected ColumnInfo _columnElementtype = cci("ElementType", "elementtype", String.class, false, 100, 0);
    protected ColumnInfo _columnFlags = cci("Flags", "flags", String.class, false, 255, 0);
    protected ColumnInfo _columnExternalfile = cci("ExternalFile", "externalfile", String.class, false, 255, 0);
    protected ColumnInfo _columnNotes = cci("Notes", "notes", String.class, false, 255, 0);
    protected ColumnInfo _columnOwner = cci("Owner", "owner", String.class, false, 255, 0);
    protected ColumnInfo _columnVersiondate = cci("VersionDate", "versiondate", java.sql.Timestamp.class, false, null, null);
    protected ColumnInfo _columnBranch = cci("Branch", "branch", String.class, false, 255, 0);
    protected ColumnInfo _columnElementxml = cci("ElementXML", "elementxml", String.class, false, 2147483647, 0);

    public ColumnInfo columnElementid() { return _columnElementid; }
    public ColumnInfo columnVersionid() { return _columnVersionid; }
    public ColumnInfo columnElementtype() { return _columnElementtype; }
    public ColumnInfo columnFlags() { return _columnFlags; }
    public ColumnInfo columnExternalfile() { return _columnExternalfile; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnOwner() { return _columnOwner; }
    public ColumnInfo columnVersiondate() { return _columnVersiondate; }
    public ColumnInfo columnBranch() { return _columnBranch; }
    public ColumnInfo columnElementxml() { return _columnElementxml; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TVersion"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TVersionCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TVersionDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TVersionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TVersion> getEntityType() { return TVersion.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TVersion newMyEntity() { return new TVersion(); }

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
		doAcceptPrimaryKeyMap((TVersion)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TVersion)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TVersion>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsElementid(), columnElementid());
        setupEps(_epsMap, new EpsVersionid(), columnVersionid());
        setupEps(_epsMap, new EpsElementtype(), columnElementtype());
        setupEps(_epsMap, new EpsFlags(), columnFlags());
        setupEps(_epsMap, new EpsExternalfile(), columnExternalfile());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsOwner(), columnOwner());
        setupEps(_epsMap, new EpsVersiondate(), columnVersiondate());
        setupEps(_epsMap, new EpsBranch(), columnBranch());
        setupEps(_epsMap, new EpsElementxml(), columnElementxml());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TVersion)entity, value);
    }
    
    public static class EpsElementid implements Eps<TVersion> {
        public void setup(TVersion e, Object v) { e.setElementid((String)v); }
    }
    public static class EpsVersionid implements Eps<TVersion> {
        public void setup(TVersion e, Object v) { e.setVersionid((String)v); }
    }
    public static class EpsElementtype implements Eps<TVersion> {
        public void setup(TVersion e, Object v) { e.setElementtype((String)v); }
    }
    public static class EpsFlags implements Eps<TVersion> {
        public void setup(TVersion e, Object v) { e.setFlags((String)v); }
    }
    public static class EpsExternalfile implements Eps<TVersion> {
        public void setup(TVersion e, Object v) { e.setExternalfile((String)v); }
    }
    public static class EpsNotes implements Eps<TVersion> {
        public void setup(TVersion e, Object v) { e.setNotes((String)v); }
    }
    public static class EpsOwner implements Eps<TVersion> {
        public void setup(TVersion e, Object v) { e.setOwner((String)v); }
    }
    public static class EpsVersiondate implements Eps<TVersion> {
        public void setup(TVersion e, Object v) { e.setVersiondate((java.sql.Timestamp)v); }
    }
    public static class EpsBranch implements Eps<TVersion> {
        public void setup(TVersion e, Object v) { e.setBranch((String)v); }
    }
    public static class EpsElementxml implements Eps<TVersion> {
        public void setup(TVersion e, Object v) { e.setElementxml((String)v); }
    }
}
