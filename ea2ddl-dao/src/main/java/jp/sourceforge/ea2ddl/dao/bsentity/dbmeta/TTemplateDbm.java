package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TTemplate;

/**
 * The DB meta of t_template. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTemplateDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTemplateDbm _instance = new TTemplateDbm();
    private TTemplateDbm() {}
    public static TTemplateDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_template"; }
    public String getTablePropertyName() { return "TTemplate"; }
    public String getTableSqlName() { return "t_template"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnTemplateid = cci("TemplateID", null, "templateid", String.class, false, false, 40, 0);
    protected ColumnInfo _columnTemplatetype = cci("TemplateType", null, "templatetype", String.class, false, false, 50, 0);
    protected ColumnInfo _columnTemplatename = cci("TemplateName", null, "templatename", String.class, false, false, 100, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 255, 0);
    protected ColumnInfo _columnStyle = cci("Style", null, "style", String.class, false, false, 255, 0);
    protected ColumnInfo _columnTemplate = cci("Template", null, "template", String.class, false, false, 2147483647, 0);

    public ColumnInfo columnTemplateid() { return _columnTemplateid; }
    public ColumnInfo columnTemplatetype() { return _columnTemplatetype; }
    public ColumnInfo columnTemplatename() { return _columnTemplatename; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnStyle() { return _columnStyle; }
    public ColumnInfo columnTemplate() { return _columnTemplate; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TTemplate"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TTemplateCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TTemplateDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TTemplateBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTemplate> getEntityType() { return TTemplate.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TTemplate newMyEntity() { return new TTemplate(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TTemplate)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TTemplate)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TTemplate>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsTemplateid(), columnTemplateid());
        setupEps(_epsMap, new EpsTemplatetype(), columnTemplatetype());
        setupEps(_epsMap, new EpsTemplatename(), columnTemplatename());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsStyle(), columnStyle());
        setupEps(_epsMap, new EpsTemplate(), columnTemplate());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TTemplate)entity, value); }

    public static class EpsTemplateid implements Eps<TTemplate>
    { public void setup(TTemplate e, Object v) { e.setTemplateid((String)v); } }
    public static class EpsTemplatetype implements Eps<TTemplate>
    { public void setup(TTemplate e, Object v) { e.setTemplatetype((String)v); } }
    public static class EpsTemplatename implements Eps<TTemplate>
    { public void setup(TTemplate e, Object v) { e.setTemplatename((String)v); } }
    public static class EpsNotes implements Eps<TTemplate>
    { public void setup(TTemplate e, Object v) { e.setNotes((String)v); } }
    public static class EpsStyle implements Eps<TTemplate>
    { public void setup(TTemplate e, Object v) { e.setStyle((String)v); } }
    public static class EpsTemplate implements Eps<TTemplate>
    { public void setup(TTemplate e, Object v) { e.setTemplate((String)v); } }
}
