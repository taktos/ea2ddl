package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TRules;

/**
 * The DB meta of t_rules. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TRulesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TRulesDbm _instance = new TRulesDbm();
    private TRulesDbm() {}
    public static TRulesDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_rules"; }
    public String getTablePropertyName() { return "TRules"; }
    public String getTableSqlName() { return "t_rules"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnRuleid = cci("RuleID", null, "ruleid", String.class, false, false, 50, 0);
    protected ColumnInfo _columnRulename = cci("RuleName", null, "rulename", String.class, false, false, 255, 0);
    protected ColumnInfo _columnRuletype = cci("RuleType", null, "ruletype", String.class, false, false, 255, 0);
    protected ColumnInfo _columnRuleactive = cci("RuleActive", null, "ruleactive", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnErrormsg = cci("ErrorMsg", null, "errormsg", String.class, false, false, 255, 0);
    protected ColumnInfo _columnFlags = cci("Flags", null, "flags", String.class, false, false, 255, 0);
    protected ColumnInfo _columnRuleocl = cci("RuleOCL", null, "ruleocl", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnRulexml = cci("RuleXML", null, "rulexml", String.class, false, false, 2147483647, 0);

    public ColumnInfo columnRuleid() { return _columnRuleid; }
    public ColumnInfo columnRulename() { return _columnRulename; }
    public ColumnInfo columnRuletype() { return _columnRuletype; }
    public ColumnInfo columnRuleactive() { return _columnRuleactive; }
    public ColumnInfo columnErrormsg() { return _columnErrormsg; }
    public ColumnInfo columnFlags() { return _columnFlags; }
    public ColumnInfo columnRuleocl() { return _columnRuleocl; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnRulexml() { return _columnRulexml; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TRules"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TRulesCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TRulesDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TRulesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TRules> getEntityType() { return TRules.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TRules newMyEntity() { return new TRules(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TRules)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TRules)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TRules>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsRuleid(), columnRuleid());
        setupEps(_epsMap, new EpsRulename(), columnRulename());
        setupEps(_epsMap, new EpsRuletype(), columnRuletype());
        setupEps(_epsMap, new EpsRuleactive(), columnRuleactive());
        setupEps(_epsMap, new EpsErrormsg(), columnErrormsg());
        setupEps(_epsMap, new EpsFlags(), columnFlags());
        setupEps(_epsMap, new EpsRuleocl(), columnRuleocl());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsRulexml(), columnRulexml());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TRules)entity, value); }

    public static class EpsRuleid implements Eps<TRules>
    { public void setup(TRules e, Object v) { e.setRuleid((String)v); } }
    public static class EpsRulename implements Eps<TRules>
    { public void setup(TRules e, Object v) { e.setRulename((String)v); } }
    public static class EpsRuletype implements Eps<TRules>
    { public void setup(TRules e, Object v) { e.setRuletype((String)v); } }
    public static class EpsRuleactive implements Eps<TRules>
    { public void setup(TRules e, Object v) { e.setRuleactive((java.lang.Integer)v); } }
    public static class EpsErrormsg implements Eps<TRules>
    { public void setup(TRules e, Object v) { e.setErrormsg((String)v); } }
    public static class EpsFlags implements Eps<TRules>
    { public void setup(TRules e, Object v) { e.setFlags((String)v); } }
    public static class EpsRuleocl implements Eps<TRules>
    { public void setup(TRules e, Object v) { e.setRuleocl((String)v); } }
    public static class EpsNotes implements Eps<TRules>
    { public void setup(TRules e, Object v) { e.setNotes((String)v); } }
    public static class EpsRulexml implements Eps<TRules>
    { public void setup(TRules e, Object v) { e.setRulexml((String)v); } }
}
