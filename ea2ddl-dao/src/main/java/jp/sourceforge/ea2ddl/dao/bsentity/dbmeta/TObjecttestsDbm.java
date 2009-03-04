package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TObjecttests;

/**
 * The DB meta of t_objecttests. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TObjecttestsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TObjecttestsDbm _instance = new TObjecttestsDbm();
    private TObjecttestsDbm() {}
    public static TObjecttestsDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_objecttests"; }
    public String getTablePropertyName() { return "TObjecttests"; }
    public String getTableSqlName() { return "t_objecttests"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnObjectId = cci("Object_ID", null, "objectId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnTest = cci("Test", null, "test", String.class, false, false, 255, 0);
    protected ColumnInfo _columnTestclass = cci("TestClass", null, "testclass", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnTesttype = cci("TestType", null, "testtype", String.class, false, false, 50, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnInputdata = cci("InputData", null, "inputdata", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnAcceptancecriteria = cci("AcceptanceCriteria", null, "acceptancecriteria", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnStatus = cci("Status", null, "status", String.class, false, false, 32, 0);
    protected ColumnInfo _columnDaterun = cci("DateRun", null, "daterun", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnResults = cci("Results", null, "results", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnRunby = cci("RunBy", null, "runby", String.class, false, false, 255, 0);
    protected ColumnInfo _columnCheckby = cci("CheckBy", null, "checkby", String.class, false, false, 255, 0);

    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnTest() { return _columnTest; }
    public ColumnInfo columnTestclass() { return _columnTestclass; }
    public ColumnInfo columnTesttype() { return _columnTesttype; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnInputdata() { return _columnInputdata; }
    public ColumnInfo columnAcceptancecriteria() { return _columnAcceptancecriteria; }
    public ColumnInfo columnStatus() { return _columnStatus; }
    public ColumnInfo columnDaterun() { return _columnDaterun; }
    public ColumnInfo columnResults() { return _columnResults; }
    public ColumnInfo columnRunby() { return _columnRunby; }
    public ColumnInfo columnCheckby() { return _columnCheckby; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TObjecttests"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TObjecttestsCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TObjecttestsDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TObjecttestsBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TObjecttests> getEntityType() { return TObjecttests.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TObjecttests newMyEntity() { return new TObjecttests(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TObjecttests)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TObjecttests)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TObjecttests>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsTest(), columnTest());
        setupEps(_epsMap, new EpsTestclass(), columnTestclass());
        setupEps(_epsMap, new EpsTesttype(), columnTesttype());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsInputdata(), columnInputdata());
        setupEps(_epsMap, new EpsAcceptancecriteria(), columnAcceptancecriteria());
        setupEps(_epsMap, new EpsStatus(), columnStatus());
        setupEps(_epsMap, new EpsDaterun(), columnDaterun());
        setupEps(_epsMap, new EpsResults(), columnResults());
        setupEps(_epsMap, new EpsRunby(), columnRunby());
        setupEps(_epsMap, new EpsCheckby(), columnCheckby());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TObjecttests)entity, value); }

    public static class EpsObjectId implements Eps<TObjecttests>
    { public void setup(TObjecttests e, Object v) { e.setObjectId((java.lang.Integer)v); } }
    public static class EpsTest implements Eps<TObjecttests>
    { public void setup(TObjecttests e, Object v) { e.setTest((String)v); } }
    public static class EpsTestclass implements Eps<TObjecttests>
    { public void setup(TObjecttests e, Object v) { e.setTestclass((java.lang.Integer)v); } }
    public static class EpsTesttype implements Eps<TObjecttests>
    { public void setup(TObjecttests e, Object v) { e.setTesttype((String)v); } }
    public static class EpsNotes implements Eps<TObjecttests>
    { public void setup(TObjecttests e, Object v) { e.setNotes((String)v); } }
    public static class EpsInputdata implements Eps<TObjecttests>
    { public void setup(TObjecttests e, Object v) { e.setInputdata((String)v); } }
    public static class EpsAcceptancecriteria implements Eps<TObjecttests>
    { public void setup(TObjecttests e, Object v) { e.setAcceptancecriteria((String)v); } }
    public static class EpsStatus implements Eps<TObjecttests>
    { public void setup(TObjecttests e, Object v) { e.setStatus((String)v); } }
    public static class EpsDaterun implements Eps<TObjecttests>
    { public void setup(TObjecttests e, Object v) { e.setDaterun((java.sql.Timestamp)v); } }
    public static class EpsResults implements Eps<TObjecttests>
    { public void setup(TObjecttests e, Object v) { e.setResults((String)v); } }
    public static class EpsRunby implements Eps<TObjecttests>
    { public void setup(TObjecttests e, Object v) { e.setRunby((String)v); } }
    public static class EpsCheckby implements Eps<TObjecttests>
    { public void setup(TObjecttests e, Object v) { e.setCheckby((String)v); } }
}
