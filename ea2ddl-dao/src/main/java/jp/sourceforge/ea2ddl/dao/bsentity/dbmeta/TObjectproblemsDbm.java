package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TObjectproblems;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_objectproblems. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TObjectproblemsDbm extends AbstractDBMeta {

    private static final TObjectproblemsDbm _instance = new TObjectproblemsDbm();
    private TObjectproblemsDbm() {}
    public static TObjectproblemsDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_objectproblems"; }
    public String getTablePropertyName() { return "TObjectproblems"; }
    public String getTableSqlName() { return "t_objectproblems"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnObjectId = cci("Object_ID", "objectId", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnProblem = cci("Problem", "problem", String.class, false, 255, 0);
    protected ColumnInfo _columnProblemtype = cci("ProblemType", "problemtype", String.class, false, 255, 0);
    protected ColumnInfo _columnDatereported = cci("DateReported", "datereported", java.sql.Timestamp.class, false, null, null);
    protected ColumnInfo _columnStatus = cci("Status", "status", String.class, false, 50, 0);
    protected ColumnInfo _columnProblemnotes = cci("ProblemNotes", "problemnotes", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnReportedby = cci("ReportedBy", "reportedby", String.class, false, 255, 0);
    protected ColumnInfo _columnResolvedby = cci("ResolvedBy", "resolvedby", String.class, false, 255, 0);
    protected ColumnInfo _columnDateresolved = cci("DateResolved", "dateresolved", java.sql.Timestamp.class, false, null, null);
    protected ColumnInfo _columnVersion = cci("Version", "version", String.class, false, 50, 0);
    protected ColumnInfo _columnResolvernotes = cci("ResolverNotes", "resolvernotes", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnPriority = cci("Priority", "priority", String.class, false, 50, 0);
    protected ColumnInfo _columnSeverity = cci("Severity", "severity", String.class, false, 50, 0);

    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnProblem() { return _columnProblem; }
    public ColumnInfo columnProblemtype() { return _columnProblemtype; }
    public ColumnInfo columnDatereported() { return _columnDatereported; }
    public ColumnInfo columnStatus() { return _columnStatus; }
    public ColumnInfo columnProblemnotes() { return _columnProblemnotes; }
    public ColumnInfo columnReportedby() { return _columnReportedby; }
    public ColumnInfo columnResolvedby() { return _columnResolvedby; }
    public ColumnInfo columnDateresolved() { return _columnDateresolved; }
    public ColumnInfo columnVersion() { return _columnVersion; }
    public ColumnInfo columnResolvernotes() { return _columnResolvernotes; }
    public ColumnInfo columnPriority() { return _columnPriority; }
    public ColumnInfo columnSeverity() { return _columnSeverity; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TObjectproblems"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TObjectproblemsCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TObjectproblemsDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TObjectproblemsBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TObjectproblems> getEntityType() { return TObjectproblems.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TObjectproblems newMyEntity() { return new TObjectproblems(); }

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
		doAcceptPrimaryKeyMap((TObjectproblems)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TObjectproblems)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TObjectproblems>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsProblem(), columnProblem());
        setupEps(_epsMap, new EpsProblemtype(), columnProblemtype());
        setupEps(_epsMap, new EpsDatereported(), columnDatereported());
        setupEps(_epsMap, new EpsStatus(), columnStatus());
        setupEps(_epsMap, new EpsProblemnotes(), columnProblemnotes());
        setupEps(_epsMap, new EpsReportedby(), columnReportedby());
        setupEps(_epsMap, new EpsResolvedby(), columnResolvedby());
        setupEps(_epsMap, new EpsDateresolved(), columnDateresolved());
        setupEps(_epsMap, new EpsVersion(), columnVersion());
        setupEps(_epsMap, new EpsResolvernotes(), columnResolvernotes());
        setupEps(_epsMap, new EpsPriority(), columnPriority());
        setupEps(_epsMap, new EpsSeverity(), columnSeverity());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TObjectproblems)entity, value);
    }
    
    public static class EpsObjectId implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setObjectId((java.lang.Integer)v); }
    }
    public static class EpsProblem implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setProblem((String)v); }
    }
    public static class EpsProblemtype implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setProblemtype((String)v); }
    }
    public static class EpsDatereported implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setDatereported((java.sql.Timestamp)v); }
    }
    public static class EpsStatus implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setStatus((String)v); }
    }
    public static class EpsProblemnotes implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setProblemnotes((String)v); }
    }
    public static class EpsReportedby implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setReportedby((String)v); }
    }
    public static class EpsResolvedby implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setResolvedby((String)v); }
    }
    public static class EpsDateresolved implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setDateresolved((java.sql.Timestamp)v); }
    }
    public static class EpsVersion implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setVersion((String)v); }
    }
    public static class EpsResolvernotes implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setResolvernotes((String)v); }
    }
    public static class EpsPriority implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setPriority((String)v); }
    }
    public static class EpsSeverity implements Eps<TObjectproblems> {
        public void setup(TObjectproblems e, Object v) { e.setSeverity((String)v); }
    }
}
