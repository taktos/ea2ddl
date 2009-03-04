package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TScript;

/**
 * The DB meta of t_script. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TScriptDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TScriptDbm _instance = new TScriptDbm();
    private TScriptDbm() {}
    public static TScriptDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_script"; }
    public String getTablePropertyName() { return "TScript"; }
    public String getTableSqlName() { return "t_script"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnScriptid = cci("ScriptID", null, "scriptid", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnScriptcategory = cci("ScriptCategory", null, "scriptcategory", String.class, false, false, 100, 0);
    protected ColumnInfo _columnScriptname = cci("ScriptName", null, "scriptname", String.class, false, false, 150, 0);
    protected ColumnInfo _columnScriptauthor = cci("ScriptAuthor", null, "scriptauthor", String.class, false, false, 255, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnScript = cci("Script", null, "script", String.class, false, false, 2147483647, 0);

    public ColumnInfo columnScriptid() { return _columnScriptid; }
    public ColumnInfo columnScriptcategory() { return _columnScriptcategory; }
    public ColumnInfo columnScriptname() { return _columnScriptname; }
    public ColumnInfo columnScriptauthor() { return _columnScriptauthor; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnScript() { return _columnScript; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TScript"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TScriptCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TScriptDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TScriptBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TScript> getEntityType() { return TScript.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TScript newMyEntity() { return new TScript(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TScript)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TScript)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TScript>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsScriptid(), columnScriptid());
        setupEps(_epsMap, new EpsScriptcategory(), columnScriptcategory());
        setupEps(_epsMap, new EpsScriptname(), columnScriptname());
        setupEps(_epsMap, new EpsScriptauthor(), columnScriptauthor());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsScript(), columnScript());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TScript)entity, value); }

    public static class EpsScriptid implements Eps<TScript>
    { public void setup(TScript e, Object v) { e.setScriptid((java.lang.Integer)v); } }
    public static class EpsScriptcategory implements Eps<TScript>
    { public void setup(TScript e, Object v) { e.setScriptcategory((String)v); } }
    public static class EpsScriptname implements Eps<TScript>
    { public void setup(TScript e, Object v) { e.setScriptname((String)v); } }
    public static class EpsScriptauthor implements Eps<TScript>
    { public void setup(TScript e, Object v) { e.setScriptauthor((String)v); } }
    public static class EpsNotes implements Eps<TScript>
    { public void setup(TScript e, Object v) { e.setNotes((String)v); } }
    public static class EpsScript implements Eps<TScript>
    { public void setup(TScript e, Object v) { e.setScript((String)v); } }
}
