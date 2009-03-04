package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.Usystables;

/**
 * The DB meta of usysTables. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UsystablesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UsystablesDbm _instance = new UsystablesDbm();
    private UsystablesDbm() {}
    public static UsystablesDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "usysTables"; }
    public String getTablePropertyName() { return "usystables"; }
    public String getTableSqlName() { return "usysTables"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnTablename = cci("TableName", null, "tablename", String.class, false, false, 50, 0);
    protected ColumnInfo _columnRelorder = cci("RelOrder", null, "relorder", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnDisplayname = cci("DisplayName", null, "displayname", String.class, false, false, 50, 0);
    protected ColumnInfo _columnFromver = cci("FromVer", null, "fromver", String.class, false, false, 50, 0);
    protected ColumnInfo _columnTover = cci("ToVer", null, "tover", String.class, false, false, 50, 0);

    public ColumnInfo columnTablename() { return _columnTablename; }
    public ColumnInfo columnRelorder() { return _columnRelorder; }
    public ColumnInfo columnDisplayname() { return _columnDisplayname; }
    public ColumnInfo columnFromver() { return _columnFromver; }
    public ColumnInfo columnTover() { return _columnTover; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.Usystables"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.UsystablesCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.UsystablesDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.UsystablesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Usystables> getEntityType() { return Usystables.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Usystables newMyEntity() { return new Usystables(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((Usystables)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((Usystables)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<Usystables>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsTablename(), columnTablename());
        setupEps(_epsMap, new EpsRelorder(), columnRelorder());
        setupEps(_epsMap, new EpsDisplayname(), columnDisplayname());
        setupEps(_epsMap, new EpsFromver(), columnFromver());
        setupEps(_epsMap, new EpsTover(), columnTover());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((Usystables)entity, value); }

    public static class EpsTablename implements Eps<Usystables>
    { public void setup(Usystables e, Object v) { e.setTablename((String)v); } }
    public static class EpsRelorder implements Eps<Usystables>
    { public void setup(Usystables e, Object v) { e.setRelorder((java.lang.Integer)v); } }
    public static class EpsDisplayname implements Eps<Usystables>
    { public void setup(Usystables e, Object v) { e.setDisplayname((String)v); } }
    public static class EpsFromver implements Eps<Usystables>
    { public void setup(Usystables e, Object v) { e.setFromver((String)v); } }
    public static class EpsTover implements Eps<Usystables>
    { public void setup(Usystables e, Object v) { e.setTover((String)v); } }
}
