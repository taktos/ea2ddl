package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TPhase;

/**
 * The DB meta of t_phase. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPhaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPhaseDbm _instance = new TPhaseDbm();
    private TPhaseDbm() {}
    public static TPhaseDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_phase"; }
    public String getTablePropertyName() { return "TPhase"; }
    public String getTableSqlName() { return "t_phase"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnPhaseid = cci("PhaseID", null, "phaseid", String.class, false, false, 40, 0);
    protected ColumnInfo _columnPhasename = cci("PhaseName", null, "phasename", String.class, false, false, 100, 0);
    protected ColumnInfo _columnPhasenotes = cci("PhaseNotes", null, "phasenotes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnPhasestyle = cci("PhaseStyle", null, "phasestyle", String.class, false, false, 255, 0);
    protected ColumnInfo _columnStartdate = cci("StartDate", null, "startdate", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnEnddate = cci("EndDate", null, "enddate", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnPhasecontent = cci("PhaseContent", null, "phasecontent", String.class, false, false, 2147483647, 0);

    public ColumnInfo columnPhaseid() { return _columnPhaseid; }
    public ColumnInfo columnPhasename() { return _columnPhasename; }
    public ColumnInfo columnPhasenotes() { return _columnPhasenotes; }
    public ColumnInfo columnPhasestyle() { return _columnPhasestyle; }
    public ColumnInfo columnStartdate() { return _columnStartdate; }
    public ColumnInfo columnEnddate() { return _columnEnddate; }
    public ColumnInfo columnPhasecontent() { return _columnPhasecontent; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TPhase"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TPhaseCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TPhaseDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TPhaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPhase> getEntityType() { return TPhase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TPhase newMyEntity() { return new TPhase(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TPhase)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TPhase)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TPhase>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsPhaseid(), columnPhaseid());
        setupEps(_epsMap, new EpsPhasename(), columnPhasename());
        setupEps(_epsMap, new EpsPhasenotes(), columnPhasenotes());
        setupEps(_epsMap, new EpsPhasestyle(), columnPhasestyle());
        setupEps(_epsMap, new EpsStartdate(), columnStartdate());
        setupEps(_epsMap, new EpsEnddate(), columnEnddate());
        setupEps(_epsMap, new EpsPhasecontent(), columnPhasecontent());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TPhase)entity, value); }

    public static class EpsPhaseid implements Eps<TPhase>
    { public void setup(TPhase e, Object v) { e.setPhaseid((String)v); } }
    public static class EpsPhasename implements Eps<TPhase>
    { public void setup(TPhase e, Object v) { e.setPhasename((String)v); } }
    public static class EpsPhasenotes implements Eps<TPhase>
    { public void setup(TPhase e, Object v) { e.setPhasenotes((String)v); } }
    public static class EpsPhasestyle implements Eps<TPhase>
    { public void setup(TPhase e, Object v) { e.setPhasestyle((String)v); } }
    public static class EpsStartdate implements Eps<TPhase>
    { public void setup(TPhase e, Object v) { e.setStartdate((java.sql.Timestamp)v); } }
    public static class EpsEnddate implements Eps<TPhase>
    { public void setup(TPhase e, Object v) { e.setEnddate((java.sql.Timestamp)v); } }
    public static class EpsPhasecontent implements Eps<TPhase>
    { public void setup(TPhase e, Object v) { e.setPhasecontent((String)v); } }
}
