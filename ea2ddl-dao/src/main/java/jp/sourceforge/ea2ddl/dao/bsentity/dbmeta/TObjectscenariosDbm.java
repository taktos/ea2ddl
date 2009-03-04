package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TObjectscenarios;

/**
 * The DB meta of t_objectscenarios. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TObjectscenariosDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TObjectscenariosDbm _instance = new TObjectscenariosDbm();
    private TObjectscenariosDbm() {}
    public static TObjectscenariosDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_objectscenarios"; }
    public String getTablePropertyName() { return "TObjectscenarios"; }
    public String getTableSqlName() { return "t_objectscenarios"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnObjectId = cci("Object_ID", null, "objectId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnScenario = cci("Scenario", null, "scenario", String.class, false, false, 255, 0);
    protected ColumnInfo _columnScenariotype = cci("ScenarioType", null, "scenariotype", String.class, false, false, 12, 0);
    protected ColumnInfo _columnEvalue = cci("EValue", null, "evalue", java.math.BigDecimal.class, false, false, null, null);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnXmlcontent = cci("XMLContent", null, "xmlcontent", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnEaGuid = cci("ea_guid", null, "eaGuid", String.class, false, false, 40, 0);

    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnScenario() { return _columnScenario; }
    public ColumnInfo columnScenariotype() { return _columnScenariotype; }
    public ColumnInfo columnEvalue() { return _columnEvalue; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnXmlcontent() { return _columnXmlcontent; }
    public ColumnInfo columnEaGuid() { return _columnEaGuid; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TObjectscenarios"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TObjectscenariosCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TObjectscenariosDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TObjectscenariosBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TObjectscenarios> getEntityType() { return TObjectscenarios.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TObjectscenarios newMyEntity() { return new TObjectscenarios(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TObjectscenarios)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TObjectscenarios)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TObjectscenarios>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsScenario(), columnScenario());
        setupEps(_epsMap, new EpsScenariotype(), columnScenariotype());
        setupEps(_epsMap, new EpsEvalue(), columnEvalue());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsXmlcontent(), columnXmlcontent());
        setupEps(_epsMap, new EpsEaGuid(), columnEaGuid());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TObjectscenarios)entity, value); }

    public static class EpsObjectId implements Eps<TObjectscenarios>
    { public void setup(TObjectscenarios e, Object v) { e.setObjectId((java.lang.Integer)v); } }
    public static class EpsScenario implements Eps<TObjectscenarios>
    { public void setup(TObjectscenarios e, Object v) { e.setScenario((String)v); } }
    public static class EpsScenariotype implements Eps<TObjectscenarios>
    { public void setup(TObjectscenarios e, Object v) { e.setScenariotype((String)v); } }
    public static class EpsEvalue implements Eps<TObjectscenarios>
    { public void setup(TObjectscenarios e, Object v) { e.setEvalue((java.math.BigDecimal)v); } }
    public static class EpsNotes implements Eps<TObjectscenarios>
    { public void setup(TObjectscenarios e, Object v) { e.setNotes((String)v); } }
    public static class EpsXmlcontent implements Eps<TObjectscenarios>
    { public void setup(TObjectscenarios e, Object v) { e.setXmlcontent((String)v); } }
    public static class EpsEaGuid implements Eps<TObjectscenarios>
    { public void setup(TObjectscenarios e, Object v) { e.setEaGuid((String)v); } }
}
