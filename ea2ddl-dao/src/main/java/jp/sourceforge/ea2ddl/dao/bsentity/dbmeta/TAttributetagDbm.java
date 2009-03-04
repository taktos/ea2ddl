package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TAttributetag;

/**
 * The DB meta of t_attributetag. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TAttributetagDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TAttributetagDbm _instance = new TAttributetagDbm();
    private TAttributetagDbm() {}
    public static TAttributetagDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_attributetag"; }
    public String getTablePropertyName() { return "TAttributetag"; }
    public String getTableSqlName() { return "t_attributetag"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnPropertyid = cci("PropertyID", null, "propertyid", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnElementid = cci("ElementID", null, "elementid", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnProperty = cci("Property", null, "property", String.class, false, false, 255, 0);
    protected ColumnInfo _columnValue = cci("VALUE", null, "value", String.class, false, false, 255, 0);
    protected ColumnInfo _columnNotes = cci("NOTES", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnEaGuid = cci("ea_guid", null, "eaGuid", String.class, false, false, 40, 0);

    public ColumnInfo columnPropertyid() { return _columnPropertyid; }
    public ColumnInfo columnElementid() { return _columnElementid; }
    public ColumnInfo columnProperty() { return _columnProperty; }
    public ColumnInfo columnValue() { return _columnValue; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnEaGuid() { return _columnEaGuid; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TAttributetag"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TAttributetagCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TAttributetagDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TAttributetagBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TAttributetag> getEntityType() { return TAttributetag.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TAttributetag newMyEntity() { return new TAttributetag(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TAttributetag)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TAttributetag)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TAttributetag>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsPropertyid(), columnPropertyid());
        setupEps(_epsMap, new EpsElementid(), columnElementid());
        setupEps(_epsMap, new EpsProperty(), columnProperty());
        setupEps(_epsMap, new EpsValue(), columnValue());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsEaGuid(), columnEaGuid());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TAttributetag)entity, value); }

    public static class EpsPropertyid implements Eps<TAttributetag>
    { public void setup(TAttributetag e, Object v) { e.setPropertyid((java.lang.Integer)v); } }
    public static class EpsElementid implements Eps<TAttributetag>
    { public void setup(TAttributetag e, Object v) { e.setElementid((java.lang.Integer)v); } }
    public static class EpsProperty implements Eps<TAttributetag>
    { public void setup(TAttributetag e, Object v) { e.setProperty((String)v); } }
    public static class EpsValue implements Eps<TAttributetag>
    { public void setup(TAttributetag e, Object v) { e.setValue((String)v); } }
    public static class EpsNotes implements Eps<TAttributetag>
    { public void setup(TAttributetag e, Object v) { e.setNotes((String)v); } }
    public static class EpsEaGuid implements Eps<TAttributetag>
    { public void setup(TAttributetag e, Object v) { e.setEaGuid((String)v); } }
}
