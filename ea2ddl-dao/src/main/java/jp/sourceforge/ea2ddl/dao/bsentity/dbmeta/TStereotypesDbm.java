package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TStereotypes;

/**
 * The DB meta of t_stereotypes. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TStereotypesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TStereotypesDbm _instance = new TStereotypesDbm();
    private TStereotypesDbm() {}
    public static TStereotypesDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_stereotypes"; }
    public String getTablePropertyName() { return "TStereotypes"; }
    public String getTableSqlName() { return "t_stereotypes"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnStereotype = cci("Stereotype", null, "stereotype", String.class, false, false, 255, 0);
    protected ColumnInfo _columnAppliesto = cci("AppliesTo", null, "appliesto", String.class, false, false, 255, 0);
    protected ColumnInfo _columnDescription = cci("Description", null, "description", String.class, false, false, 255, 0);
    protected ColumnInfo _columnMfenabled = cci("MFEnabled", null, "mfenabled", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnMfpath = cci("MFPath", null, "mfpath", String.class, false, false, 255, 0);
    protected ColumnInfo _columnMetafile = cci("Metafile", null, "metafile", byte[].class, false, false, null, null);
    protected ColumnInfo _columnStyle = cci("Style", null, "style", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnEaGuid = cci("ea_guid", null, "eaGuid", String.class, false, false, 50, 0);
    protected ColumnInfo _columnVisualtype = cci("VisualType", null, "visualtype", String.class, false, false, 100, 0);

    public ColumnInfo columnStereotype() { return _columnStereotype; }
    public ColumnInfo columnAppliesto() { return _columnAppliesto; }
    public ColumnInfo columnDescription() { return _columnDescription; }
    public ColumnInfo columnMfenabled() { return _columnMfenabled; }
    public ColumnInfo columnMfpath() { return _columnMfpath; }
    public ColumnInfo columnMetafile() { return _columnMetafile; }
    public ColumnInfo columnStyle() { return _columnStyle; }
    public ColumnInfo columnEaGuid() { return _columnEaGuid; }
    public ColumnInfo columnVisualtype() { return _columnVisualtype; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TStereotypes"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TStereotypesCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TStereotypesDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TStereotypesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TStereotypes> getEntityType() { return TStereotypes.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TStereotypes newMyEntity() { return new TStereotypes(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TStereotypes)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TStereotypes)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TStereotypes>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsStereotype(), columnStereotype());
        setupEps(_epsMap, new EpsAppliesto(), columnAppliesto());
        setupEps(_epsMap, new EpsDescription(), columnDescription());
        setupEps(_epsMap, new EpsMfenabled(), columnMfenabled());
        setupEps(_epsMap, new EpsMfpath(), columnMfpath());
        setupEps(_epsMap, new EpsMetafile(), columnMetafile());
        setupEps(_epsMap, new EpsStyle(), columnStyle());
        setupEps(_epsMap, new EpsEaGuid(), columnEaGuid());
        setupEps(_epsMap, new EpsVisualtype(), columnVisualtype());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TStereotypes)entity, value); }

    public static class EpsStereotype implements Eps<TStereotypes>
    { public void setup(TStereotypes e, Object v) { e.setStereotype((String)v); } }
    public static class EpsAppliesto implements Eps<TStereotypes>
    { public void setup(TStereotypes e, Object v) { e.setAppliesto((String)v); } }
    public static class EpsDescription implements Eps<TStereotypes>
    { public void setup(TStereotypes e, Object v) { e.setDescription((String)v); } }
    public static class EpsMfenabled implements Eps<TStereotypes>
    { public void setup(TStereotypes e, Object v) { e.setMfenabled((Boolean)v); } }
    public static class EpsMfpath implements Eps<TStereotypes>
    { public void setup(TStereotypes e, Object v) { e.setMfpath((String)v); } }
    public static class EpsMetafile implements Eps<TStereotypes>
    { public void setup(TStereotypes e, Object v) { e.setMetafile((byte[])v); } }
    public static class EpsStyle implements Eps<TStereotypes>
    { public void setup(TStereotypes e, Object v) { e.setStyle((String)v); } }
    public static class EpsEaGuid implements Eps<TStereotypes>
    { public void setup(TStereotypes e, Object v) { e.setEaGuid((String)v); } }
    public static class EpsVisualtype implements Eps<TStereotypes>
    { public void setup(TStereotypes e, Object v) { e.setVisualtype((String)v); } }
}
