package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TUmlpattern;

/**
 * The DB meta of t_umlpattern. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TUmlpatternDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TUmlpatternDbm _instance = new TUmlpatternDbm();
    private TUmlpatternDbm() {}
    public static TUmlpatternDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_umlpattern"; }
    public String getTablePropertyName() { return "TUmlpattern"; }
    public String getTableSqlName() { return "t_umlpattern"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnPatternid = cci("PatternID", null, "patternid", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnPatterncategory = cci("PatternCategory", null, "patterncategory", String.class, false, false, 100, 0);
    protected ColumnInfo _columnPatternname = cci("PatternName", null, "patternname", String.class, false, false, 150, 0);
    protected ColumnInfo _columnStyle = cci("Style", null, "style", String.class, false, false, 255, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnPatternxml = cci("PatternXML", null, "patternxml", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnVersion = cci("Version", null, "version", String.class, false, false, 50, 0);

    public ColumnInfo columnPatternid() { return _columnPatternid; }
    public ColumnInfo columnPatterncategory() { return _columnPatterncategory; }
    public ColumnInfo columnPatternname() { return _columnPatternname; }
    public ColumnInfo columnStyle() { return _columnStyle; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnPatternxml() { return _columnPatternxml; }
    public ColumnInfo columnVersion() { return _columnVersion; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TUmlpattern"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TUmlpatternCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TUmlpatternDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TUmlpatternBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TUmlpattern> getEntityType() { return TUmlpattern.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TUmlpattern newMyEntity() { return new TUmlpattern(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TUmlpattern)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TUmlpattern)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TUmlpattern>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsPatternid(), columnPatternid());
        setupEps(_epsMap, new EpsPatterncategory(), columnPatterncategory());
        setupEps(_epsMap, new EpsPatternname(), columnPatternname());
        setupEps(_epsMap, new EpsStyle(), columnStyle());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsPatternxml(), columnPatternxml());
        setupEps(_epsMap, new EpsVersion(), columnVersion());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TUmlpattern)entity, value); }

    public static class EpsPatternid implements Eps<TUmlpattern>
    { public void setup(TUmlpattern e, Object v) { e.setPatternid((java.lang.Integer)v); } }
    public static class EpsPatterncategory implements Eps<TUmlpattern>
    { public void setup(TUmlpattern e, Object v) { e.setPatterncategory((String)v); } }
    public static class EpsPatternname implements Eps<TUmlpattern>
    { public void setup(TUmlpattern e, Object v) { e.setPatternname((String)v); } }
    public static class EpsStyle implements Eps<TUmlpattern>
    { public void setup(TUmlpattern e, Object v) { e.setStyle((String)v); } }
    public static class EpsNotes implements Eps<TUmlpattern>
    { public void setup(TUmlpattern e, Object v) { e.setNotes((String)v); } }
    public static class EpsPatternxml implements Eps<TUmlpattern>
    { public void setup(TUmlpattern e, Object v) { e.setPatternxml((String)v); } }
    public static class EpsVersion implements Eps<TUmlpattern>
    { public void setup(TUmlpattern e, Object v) { e.setVersion((String)v); } }
}
