package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TTestplans;

/**
 * The DB meta of t_testplans. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTestplansDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTestplansDbm _instance = new TTestplansDbm();
    private TTestplansDbm() {}
    public static TTestplansDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_testplans"; }
    public String getTablePropertyName() { return "TTestplans"; }
    public String getTableSqlName() { return "t_testplans"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnPlanid = cci("PlanID", null, "planid", String.class, false, false, 50, 0);
    protected ColumnInfo _columnCategory = cci("Category", null, "category", String.class, false, false, 100, 0);
    protected ColumnInfo _columnName = cci("Name", null, "name", String.class, false, false, 150, 0);
    protected ColumnInfo _columnAuthor = cci("Author", null, "author", String.class, false, false, 255, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnTestplan = cci("TestPlan", null, "testplan", String.class, false, false, 2147483647, 0);

    public ColumnInfo columnPlanid() { return _columnPlanid; }
    public ColumnInfo columnCategory() { return _columnCategory; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnAuthor() { return _columnAuthor; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnTestplan() { return _columnTestplan; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TTestplans"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TTestplansCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TTestplansDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TTestplansBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTestplans> getEntityType() { return TTestplans.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TTestplans newMyEntity() { return new TTestplans(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TTestplans)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TTestplans)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TTestplans>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsPlanid(), columnPlanid());
        setupEps(_epsMap, new EpsCategory(), columnCategory());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsAuthor(), columnAuthor());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsTestplan(), columnTestplan());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TTestplans)entity, value); }

    public static class EpsPlanid implements Eps<TTestplans>
    { public void setup(TTestplans e, Object v) { e.setPlanid((String)v); } }
    public static class EpsCategory implements Eps<TTestplans>
    { public void setup(TTestplans e, Object v) { e.setCategory((String)v); } }
    public static class EpsName implements Eps<TTestplans>
    { public void setup(TTestplans e, Object v) { e.setName((String)v); } }
    public static class EpsAuthor implements Eps<TTestplans>
    { public void setup(TTestplans e, Object v) { e.setAuthor((String)v); } }
    public static class EpsNotes implements Eps<TTestplans>
    { public void setup(TTestplans e, Object v) { e.setNotes((String)v); } }
    public static class EpsTestplan implements Eps<TTestplans>
    { public void setup(TTestplans e, Object v) { e.setTestplan((String)v); } }
}
