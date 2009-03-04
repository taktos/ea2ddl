package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TIssues;

/**
 * The DB meta of t_issues. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TIssuesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TIssuesDbm _instance = new TIssuesDbm();
    private TIssuesDbm() {}
    public static TIssuesDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_issues"; }
    public String getTablePropertyName() { return "TIssues"; }
    public String getTableSqlName() { return "t_issues"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnIssue = cci("Issue", null, "issue", String.class, false, false, 255, 0);
    protected ColumnInfo _columnIssuedate = cci("IssueDate", null, "issuedate", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnOwner = cci("Owner", null, "owner", String.class, false, false, 255, 0);
    protected ColumnInfo _columnStatus = cci("Status", null, "status", String.class, false, false, 50, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnResolver = cci("Resolver", null, "resolver", String.class, false, false, 255, 0);
    protected ColumnInfo _columnDateresolved = cci("DateResolved", null, "dateresolved", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnResolution = cci("Resolution", null, "resolution", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnIssueid = cci("IssueID", null, "issueid", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnCategory = cci("Category", null, "category", String.class, false, false, 255, 0);
    protected ColumnInfo _columnPriority = cci("Priority", null, "priority", String.class, false, false, 50, 0);
    protected ColumnInfo _columnSeverity = cci("Severity", null, "severity", String.class, false, false, 50, 0);
    protected ColumnInfo _columnIssuetype = cci("IssueType", null, "issuetype", String.class, false, false, 100, 0);

    public ColumnInfo columnIssue() { return _columnIssue; }
    public ColumnInfo columnIssuedate() { return _columnIssuedate; }
    public ColumnInfo columnOwner() { return _columnOwner; }
    public ColumnInfo columnStatus() { return _columnStatus; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnResolver() { return _columnResolver; }
    public ColumnInfo columnDateresolved() { return _columnDateresolved; }
    public ColumnInfo columnResolution() { return _columnResolution; }
    public ColumnInfo columnIssueid() { return _columnIssueid; }
    public ColumnInfo columnCategory() { return _columnCategory; }
    public ColumnInfo columnPriority() { return _columnPriority; }
    public ColumnInfo columnSeverity() { return _columnSeverity; }
    public ColumnInfo columnIssuetype() { return _columnIssuetype; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TIssues"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TIssuesCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TIssuesDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TIssuesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TIssues> getEntityType() { return TIssues.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TIssues newMyEntity() { return new TIssues(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TIssues)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TIssues)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TIssues>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsIssue(), columnIssue());
        setupEps(_epsMap, new EpsIssuedate(), columnIssuedate());
        setupEps(_epsMap, new EpsOwner(), columnOwner());
        setupEps(_epsMap, new EpsStatus(), columnStatus());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsResolver(), columnResolver());
        setupEps(_epsMap, new EpsDateresolved(), columnDateresolved());
        setupEps(_epsMap, new EpsResolution(), columnResolution());
        setupEps(_epsMap, new EpsIssueid(), columnIssueid());
        setupEps(_epsMap, new EpsCategory(), columnCategory());
        setupEps(_epsMap, new EpsPriority(), columnPriority());
        setupEps(_epsMap, new EpsSeverity(), columnSeverity());
        setupEps(_epsMap, new EpsIssuetype(), columnIssuetype());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TIssues)entity, value); }

    public static class EpsIssue implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setIssue((String)v); } }
    public static class EpsIssuedate implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setIssuedate((java.sql.Timestamp)v); } }
    public static class EpsOwner implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setOwner((String)v); } }
    public static class EpsStatus implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setStatus((String)v); } }
    public static class EpsNotes implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setNotes((String)v); } }
    public static class EpsResolver implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setResolver((String)v); } }
    public static class EpsDateresolved implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setDateresolved((java.sql.Timestamp)v); } }
    public static class EpsResolution implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setResolution((String)v); } }
    public static class EpsIssueid implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setIssueid((java.lang.Integer)v); } }
    public static class EpsCategory implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setCategory((String)v); } }
    public static class EpsPriority implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setPriority((String)v); } }
    public static class EpsSeverity implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setSeverity((String)v); } }
    public static class EpsIssuetype implements Eps<TIssues>
    { public void setup(TIssues e, Object v) { e.setIssuetype((String)v); } }
}
