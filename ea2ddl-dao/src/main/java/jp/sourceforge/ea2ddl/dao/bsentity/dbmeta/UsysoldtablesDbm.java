package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.Usysoldtables;

/**
 * The DB meta of usysOldTables. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UsysoldtablesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UsysoldtablesDbm _instance = new UsysoldtablesDbm();
    private UsysoldtablesDbm() {}
    public static UsysoldtablesDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "usysOldTables"; }
    public String getTablePropertyName() { return "usysoldtables"; }
    public String getTableSqlName() { return "usysOldTables"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnTablename = cci("TableName", null, "tablename", String.class, false, false, 50, 0);
    protected ColumnInfo _columnNewname = cci("NewName", null, "newname", String.class, false, false, 50, 0);
    protected ColumnInfo _columnRelorder = cci("RelOrder", null, "relorder", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnFixcode = cci("FixCode", null, "fixcode", Boolean.class, false, false, null, null);

    public ColumnInfo columnTablename() { return _columnTablename; }
    public ColumnInfo columnNewname() { return _columnNewname; }
    public ColumnInfo columnRelorder() { return _columnRelorder; }
    public ColumnInfo columnFixcode() { return _columnFixcode; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.Usysoldtables"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.UsysoldtablesCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.UsysoldtablesDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.UsysoldtablesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Usysoldtables> getEntityType() { return Usysoldtables.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Usysoldtables newMyEntity() { return new Usysoldtables(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((Usysoldtables)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((Usysoldtables)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<Usysoldtables>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsTablename(), columnTablename());
        setupEps(_epsMap, new EpsNewname(), columnNewname());
        setupEps(_epsMap, new EpsRelorder(), columnRelorder());
        setupEps(_epsMap, new EpsFixcode(), columnFixcode());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((Usysoldtables)entity, value); }

    public static class EpsTablename implements Eps<Usysoldtables>
    { public void setup(Usysoldtables e, Object v) { e.setTablename((String)v); } }
    public static class EpsNewname implements Eps<Usysoldtables>
    { public void setup(Usysoldtables e, Object v) { e.setNewname((String)v); } }
    public static class EpsRelorder implements Eps<Usysoldtables>
    { public void setup(Usysoldtables e, Object v) { e.setRelorder((java.lang.Integer)v); } }
    public static class EpsFixcode implements Eps<Usysoldtables>
    { public void setup(Usysoldtables e, Object v) { e.setFixcode((Boolean)v); } }
}
