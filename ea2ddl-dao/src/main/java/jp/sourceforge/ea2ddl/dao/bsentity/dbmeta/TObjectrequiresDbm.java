package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TObjectrequires;

/**
 * The DB meta of t_objectrequires. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TObjectrequiresDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TObjectrequiresDbm _instance = new TObjectrequiresDbm();
    private TObjectrequiresDbm() {}
    public static TObjectrequiresDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_objectrequires"; }
    public String getTablePropertyName() { return "TObjectrequires"; }
    public String getTableSqlName() { return "t_objectrequires"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnReqid = cci("ReqID", null, "reqid", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnObjectId = cci("Object_ID", null, "objectId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnRequirement = cci("Requirement", null, "requirement", String.class, false, false, 255, 0);
    protected ColumnInfo _columnReqtype = cci("ReqType", null, "reqtype", String.class, false, false, 255, 0);
    protected ColumnInfo _columnStatus = cci("Status", null, "status", String.class, false, false, 50, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnStability = cci("Stability", null, "stability", String.class, false, false, 50, 0);
    protected ColumnInfo _columnDifficulty = cci("Difficulty", null, "difficulty", String.class, false, false, 50, 0);
    protected ColumnInfo _columnPriority = cci("Priority", null, "priority", String.class, false, false, 50, 0);
    protected ColumnInfo _columnLastupdate = cci("LastUpdate", null, "lastupdate", java.sql.Timestamp.class, false, false, null, null);

    public ColumnInfo columnReqid() { return _columnReqid; }
    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnRequirement() { return _columnRequirement; }
    public ColumnInfo columnReqtype() { return _columnReqtype; }
    public ColumnInfo columnStatus() { return _columnStatus; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnStability() { return _columnStability; }
    public ColumnInfo columnDifficulty() { return _columnDifficulty; }
    public ColumnInfo columnPriority() { return _columnPriority; }
    public ColumnInfo columnLastupdate() { return _columnLastupdate; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TObjectrequires"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TObjectrequiresCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TObjectrequiresDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TObjectrequiresBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TObjectrequires> getEntityType() { return TObjectrequires.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TObjectrequires newMyEntity() { return new TObjectrequires(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TObjectrequires)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TObjectrequires)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TObjectrequires>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsReqid(), columnReqid());
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsRequirement(), columnRequirement());
        setupEps(_epsMap, new EpsReqtype(), columnReqtype());
        setupEps(_epsMap, new EpsStatus(), columnStatus());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsStability(), columnStability());
        setupEps(_epsMap, new EpsDifficulty(), columnDifficulty());
        setupEps(_epsMap, new EpsPriority(), columnPriority());
        setupEps(_epsMap, new EpsLastupdate(), columnLastupdate());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TObjectrequires)entity, value); }

    public static class EpsReqid implements Eps<TObjectrequires>
    { public void setup(TObjectrequires e, Object v) { e.setReqid((java.lang.Integer)v); } }
    public static class EpsObjectId implements Eps<TObjectrequires>
    { public void setup(TObjectrequires e, Object v) { e.setObjectId((java.lang.Integer)v); } }
    public static class EpsRequirement implements Eps<TObjectrequires>
    { public void setup(TObjectrequires e, Object v) { e.setRequirement((String)v); } }
    public static class EpsReqtype implements Eps<TObjectrequires>
    { public void setup(TObjectrequires e, Object v) { e.setReqtype((String)v); } }
    public static class EpsStatus implements Eps<TObjectrequires>
    { public void setup(TObjectrequires e, Object v) { e.setStatus((String)v); } }
    public static class EpsNotes implements Eps<TObjectrequires>
    { public void setup(TObjectrequires e, Object v) { e.setNotes((String)v); } }
    public static class EpsStability implements Eps<TObjectrequires>
    { public void setup(TObjectrequires e, Object v) { e.setStability((String)v); } }
    public static class EpsDifficulty implements Eps<TObjectrequires>
    { public void setup(TObjectrequires e, Object v) { e.setDifficulty((String)v); } }
    public static class EpsPriority implements Eps<TObjectrequires>
    { public void setup(TObjectrequires e, Object v) { e.setPriority((String)v); } }
    public static class EpsLastupdate implements Eps<TObjectrequires>
    { public void setup(TObjectrequires e, Object v) { e.setLastupdate((java.sql.Timestamp)v); } }
}
