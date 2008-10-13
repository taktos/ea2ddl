package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TClients;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_clients. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TClientsDbm extends AbstractDBMeta {

    private static final TClientsDbm _instance = new TClientsDbm();
    private TClientsDbm() {}
    public static TClientsDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_clients"; }
    public String getTablePropertyName() { return "TClients"; }
    public String getTableSqlName() { return "t_clients"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnName = cci("Name", "name", String.class, false, 255, 0);
    protected ColumnInfo _columnOrganisation = cci("Organisation", "organisation", String.class, false, 255, 0);
    protected ColumnInfo _columnPhone1 = cci("Phone1", "phone1", String.class, false, 50, 0);
    protected ColumnInfo _columnPhone2 = cci("Phone2", "phone2", String.class, false, 50, 0);
    protected ColumnInfo _columnMobile = cci("Mobile", "mobile", String.class, false, 50, 0);
    protected ColumnInfo _columnFax = cci("Fax", "fax", String.class, false, 50, 0);
    protected ColumnInfo _columnEmail = cci("Email", "email", String.class, false, 50, 0);
    protected ColumnInfo _columnRoles = cci("Roles", "roles", String.class, false, 255, 0);
    protected ColumnInfo _columnNotes = cci("Notes", "notes", String.class, false, 255, 0);

    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnOrganisation() { return _columnOrganisation; }
    public ColumnInfo columnPhone1() { return _columnPhone1; }
    public ColumnInfo columnPhone2() { return _columnPhone2; }
    public ColumnInfo columnMobile() { return _columnMobile; }
    public ColumnInfo columnFax() { return _columnFax; }
    public ColumnInfo columnEmail() { return _columnEmail; }
    public ColumnInfo columnRoles() { return _columnRoles; }
    public ColumnInfo columnNotes() { return _columnNotes; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TClients"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TClientsCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TClientsDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TClientsBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TClients> getEntityType() { return TClients.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TClients newMyEntity() { return new TClients(); }

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
		doAcceptPrimaryKeyMap((TClients)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TClients)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TClients>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsOrganisation(), columnOrganisation());
        setupEps(_epsMap, new EpsPhone1(), columnPhone1());
        setupEps(_epsMap, new EpsPhone2(), columnPhone2());
        setupEps(_epsMap, new EpsMobile(), columnMobile());
        setupEps(_epsMap, new EpsFax(), columnFax());
        setupEps(_epsMap, new EpsEmail(), columnEmail());
        setupEps(_epsMap, new EpsRoles(), columnRoles());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TClients)entity, value);
    }
    
    public static class EpsName implements Eps<TClients> {
        public void setup(TClients e, Object v) { e.setName((String)v); }
    }
    public static class EpsOrganisation implements Eps<TClients> {
        public void setup(TClients e, Object v) { e.setOrganisation((String)v); }
    }
    public static class EpsPhone1 implements Eps<TClients> {
        public void setup(TClients e, Object v) { e.setPhone1((String)v); }
    }
    public static class EpsPhone2 implements Eps<TClients> {
        public void setup(TClients e, Object v) { e.setPhone2((String)v); }
    }
    public static class EpsMobile implements Eps<TClients> {
        public void setup(TClients e, Object v) { e.setMobile((String)v); }
    }
    public static class EpsFax implements Eps<TClients> {
        public void setup(TClients e, Object v) { e.setFax((String)v); }
    }
    public static class EpsEmail implements Eps<TClients> {
        public void setup(TClients e, Object v) { e.setEmail((String)v); }
    }
    public static class EpsRoles implements Eps<TClients> {
        public void setup(TClients e, Object v) { e.setRoles((String)v); }
    }
    public static class EpsNotes implements Eps<TClients> {
        public void setup(TClients e, Object v) { e.setNotes((String)v); }
    }
}
