package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TXrefuser;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_xrefuser. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TXrefuserDbm extends AbstractDBMeta {

    private static final TXrefuserDbm _instance = new TXrefuserDbm();
    private TXrefuserDbm() {}
    public static TXrefuserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_xrefuser"; }
    public String getTablePropertyName() { return "TXrefuser"; }
    public String getTableSqlName() { return "t_xrefuser"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnXrefid = cci("XrefID", "xrefid", String.class, false, 255, 0);
    protected ColumnInfo _columnToolid = cci("ToolID", "toolid", String.class, false, 50, 0);
    protected ColumnInfo _columnName = cci("Name", "name", String.class, false, 255, 0);
    protected ColumnInfo _columnType = cci("Type", "type", String.class, false, 255, 0);
    protected ColumnInfo _columnVisibility = cci("Visibility", "visibility", String.class, false, 255, 0);
    protected ColumnInfo _columnNamespace = cci("Namespace", "namespace", String.class, false, 255, 0);
    protected ColumnInfo _columnRequirement = cci("Requirement", "requirement", String.class, false, 255, 0);
    protected ColumnInfo _columnConstraint = cci("Constraint", "constraint", String.class, false, 255, 0);
    protected ColumnInfo _columnBehavior = cci("Behavior", "behavior", String.class, false, 255, 0);
    protected ColumnInfo _columnPartition = cci("Partition", "partition", String.class, false, 255, 0);
    protected ColumnInfo _columnDescription = cci("Description", "description", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnClient = cci("Client", "client", String.class, false, 255, 0);
    protected ColumnInfo _columnSupplier = cci("Supplier", "supplier", String.class, false, 255, 0);
    protected ColumnInfo _columnLink = cci("Link", "link", String.class, false, 255, 0);

    public ColumnInfo columnXrefid() { return _columnXrefid; }
    public ColumnInfo columnToolid() { return _columnToolid; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnType() { return _columnType; }
    public ColumnInfo columnVisibility() { return _columnVisibility; }
    public ColumnInfo columnNamespace() { return _columnNamespace; }
    public ColumnInfo columnRequirement() { return _columnRequirement; }
    public ColumnInfo columnConstraint() { return _columnConstraint; }
    public ColumnInfo columnBehavior() { return _columnBehavior; }
    public ColumnInfo columnPartition() { return _columnPartition; }
    public ColumnInfo columnDescription() { return _columnDescription; }
    public ColumnInfo columnClient() { return _columnClient; }
    public ColumnInfo columnSupplier() { return _columnSupplier; }
    public ColumnInfo columnLink() { return _columnLink; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TXrefuser"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TXrefuserCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TXrefuserDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TXrefuserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TXrefuser> getEntityType() { return TXrefuser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TXrefuser newMyEntity() { return new TXrefuser(); }

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
		doAcceptPrimaryKeyMap((TXrefuser)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TXrefuser)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TXrefuser>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsXrefid(), columnXrefid());
        setupEps(_epsMap, new EpsToolid(), columnToolid());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsType(), columnType());
        setupEps(_epsMap, new EpsVisibility(), columnVisibility());
        setupEps(_epsMap, new EpsNamespace(), columnNamespace());
        setupEps(_epsMap, new EpsRequirement(), columnRequirement());
        setupEps(_epsMap, new EpsConstraint(), columnConstraint());
        setupEps(_epsMap, new EpsBehavior(), columnBehavior());
        setupEps(_epsMap, new EpsPartition(), columnPartition());
        setupEps(_epsMap, new EpsDescription(), columnDescription());
        setupEps(_epsMap, new EpsClient(), columnClient());
        setupEps(_epsMap, new EpsSupplier(), columnSupplier());
        setupEps(_epsMap, new EpsLink(), columnLink());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TXrefuser)entity, value);
    }
    
    public static class EpsXrefid implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setXrefid((String)v); }
    }
    public static class EpsToolid implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setToolid((String)v); }
    }
    public static class EpsName implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setName((String)v); }
    }
    public static class EpsType implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setType((String)v); }
    }
    public static class EpsVisibility implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setVisibility((String)v); }
    }
    public static class EpsNamespace implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setNamespace((String)v); }
    }
    public static class EpsRequirement implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setRequirement((String)v); }
    }
    public static class EpsConstraint implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setConstraint((String)v); }
    }
    public static class EpsBehavior implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setBehavior((String)v); }
    }
    public static class EpsPartition implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setPartition((String)v); }
    }
    public static class EpsDescription implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setDescription((String)v); }
    }
    public static class EpsClient implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setClient((String)v); }
    }
    public static class EpsSupplier implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setSupplier((String)v); }
    }
    public static class EpsLink implements Eps<TXrefuser> {
        public void setup(TXrefuser e, Object v) { e.setLink((String)v); }
    }
}
