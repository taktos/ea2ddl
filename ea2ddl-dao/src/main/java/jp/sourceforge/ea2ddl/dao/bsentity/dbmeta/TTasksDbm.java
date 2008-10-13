package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TTasks;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_tasks. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TTasksDbm extends AbstractDBMeta {

    private static final TTasksDbm _instance = new TTasksDbm();
    private TTasksDbm() {}
    public static TTasksDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_tasks"; }
    public String getTablePropertyName() { return "TTasks"; }
    public String getTableSqlName() { return "t_tasks"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnTaskid = cci("TaskID", "taskid", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnName = cci("Name", "name", String.class, false, 255, 0);
    protected ColumnInfo _columnTasktype = cci("TaskType", "tasktype", String.class, false, 255, 0);
    protected ColumnInfo _columnNotes = cci("NOTES", "notes", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnPriority = cci("Priority", "priority", String.class, false, 255, 0);
    protected ColumnInfo _columnStatus = cci("Status", "status", String.class, false, 255, 0);
    protected ColumnInfo _columnOwner = cci("Owner", "owner", String.class, false, 255, 0);
    protected ColumnInfo _columnStartdate = cci("StartDate", "startdate", java.sql.Timestamp.class, false, null, null);
    protected ColumnInfo _columnEnddate = cci("EndDate", "enddate", java.sql.Timestamp.class, false, null, null);
    protected ColumnInfo _columnPhase = cci("Phase", "phase", String.class, false, 50, 0);
    protected ColumnInfo _columnHistory = cci("History", "history", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnPercent = cci("Percent", "percent", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnTotaltime = cci("TotalTime", "totaltime", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnActualtime = cci("ActualTime", "actualtime", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnAssignedto = cci("AssignedTo", "assignedto", String.class, false, 100, 0);

    public ColumnInfo columnTaskid() { return _columnTaskid; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnTasktype() { return _columnTasktype; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnPriority() { return _columnPriority; }
    public ColumnInfo columnStatus() { return _columnStatus; }
    public ColumnInfo columnOwner() { return _columnOwner; }
    public ColumnInfo columnStartdate() { return _columnStartdate; }
    public ColumnInfo columnEnddate() { return _columnEnddate; }
    public ColumnInfo columnPhase() { return _columnPhase; }
    public ColumnInfo columnHistory() { return _columnHistory; }
    public ColumnInfo columnPercent() { return _columnPercent; }
    public ColumnInfo columnTotaltime() { return _columnTotaltime; }
    public ColumnInfo columnActualtime() { return _columnActualtime; }
    public ColumnInfo columnAssignedto() { return _columnAssignedto; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TTasks"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TTasksCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TTasksDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TTasksBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTasks> getEntityType() { return TTasks.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TTasks newMyEntity() { return new TTasks(); }

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
		doAcceptPrimaryKeyMap((TTasks)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TTasks)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TTasks>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsTaskid(), columnTaskid());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsTasktype(), columnTasktype());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsPriority(), columnPriority());
        setupEps(_epsMap, new EpsStatus(), columnStatus());
        setupEps(_epsMap, new EpsOwner(), columnOwner());
        setupEps(_epsMap, new EpsStartdate(), columnStartdate());
        setupEps(_epsMap, new EpsEnddate(), columnEnddate());
        setupEps(_epsMap, new EpsPhase(), columnPhase());
        setupEps(_epsMap, new EpsHistory(), columnHistory());
        setupEps(_epsMap, new EpsPercent(), columnPercent());
        setupEps(_epsMap, new EpsTotaltime(), columnTotaltime());
        setupEps(_epsMap, new EpsActualtime(), columnActualtime());
        setupEps(_epsMap, new EpsAssignedto(), columnAssignedto());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TTasks)entity, value);
    }
    
    public static class EpsTaskid implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setTaskid((java.lang.Integer)v); }
    }
    public static class EpsName implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setName((String)v); }
    }
    public static class EpsTasktype implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setTasktype((String)v); }
    }
    public static class EpsNotes implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setNotes((String)v); }
    }
    public static class EpsPriority implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setPriority((String)v); }
    }
    public static class EpsStatus implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setStatus((String)v); }
    }
    public static class EpsOwner implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setOwner((String)v); }
    }
    public static class EpsStartdate implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setStartdate((java.sql.Timestamp)v); }
    }
    public static class EpsEnddate implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setEnddate((java.sql.Timestamp)v); }
    }
    public static class EpsPhase implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setPhase((String)v); }
    }
    public static class EpsHistory implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setHistory((String)v); }
    }
    public static class EpsPercent implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setPercent((java.lang.Integer)v); }
    }
    public static class EpsTotaltime implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setTotaltime((java.lang.Integer)v); }
    }
    public static class EpsActualtime implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setActualtime((java.lang.Integer)v); }
    }
    public static class EpsAssignedto implements Eps<TTasks> {
        public void setup(TTasks e, Object v) { e.setAssignedto((String)v); }
    }
}
