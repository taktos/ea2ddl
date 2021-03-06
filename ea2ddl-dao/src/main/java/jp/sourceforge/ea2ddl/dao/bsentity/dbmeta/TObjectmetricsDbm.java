package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TObjectmetrics;

/**
 * The DB meta of t_objectmetrics. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TObjectmetricsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TObjectmetricsDbm _instance = new TObjectmetricsDbm();
    private TObjectmetricsDbm() {}
    public static TObjectmetricsDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_objectmetrics"; }
    public String getTablePropertyName() { return "TObjectmetrics"; }
    public String getTableSqlName() { return "t_objectmetrics"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnObjectId = cci("Object_ID", null, "objectId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnMetric = cci("Metric", null, "metric", String.class, false, false, 255, 0);
    protected ColumnInfo _columnMetrictype = cci("MetricType", null, "metrictype", String.class, false, false, 12, 0);
    protected ColumnInfo _columnEvalue = cci("EValue", null, "evalue", java.math.BigDecimal.class, false, false, null, null);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);

    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnMetric() { return _columnMetric; }
    public ColumnInfo columnMetrictype() { return _columnMetrictype; }
    public ColumnInfo columnEvalue() { return _columnEvalue; }
    public ColumnInfo columnNotes() { return _columnNotes; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TObjectmetrics"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TObjectmetricsCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TObjectmetricsDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TObjectmetricsBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TObjectmetrics> getEntityType() { return TObjectmetrics.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TObjectmetrics newMyEntity() { return new TObjectmetrics(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TObjectmetrics)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TObjectmetrics)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TObjectmetrics>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsMetric(), columnMetric());
        setupEps(_epsMap, new EpsMetrictype(), columnMetrictype());
        setupEps(_epsMap, new EpsEvalue(), columnEvalue());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TObjectmetrics)entity, value); }

    public static class EpsObjectId implements Eps<TObjectmetrics>
    { public void setup(TObjectmetrics e, Object v) { e.setObjectId((java.lang.Integer)v); } }
    public static class EpsMetric implements Eps<TObjectmetrics>
    { public void setup(TObjectmetrics e, Object v) { e.setMetric((String)v); } }
    public static class EpsMetrictype implements Eps<TObjectmetrics>
    { public void setup(TObjectmetrics e, Object v) { e.setMetrictype((String)v); } }
    public static class EpsEvalue implements Eps<TObjectmetrics>
    { public void setup(TObjectmetrics e, Object v) { e.setEvalue((java.math.BigDecimal)v); } }
    public static class EpsNotes implements Eps<TObjectmetrics>
    { public void setup(TObjectmetrics e, Object v) { e.setNotes((String)v); } }
}
