package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TOperationparams;

/**
 * The DB meta of t_operationparams. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TOperationparamsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TOperationparamsDbm _instance = new TOperationparamsDbm();
    private TOperationparamsDbm() {}
    public static TOperationparamsDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_operationparams"; }
    public String getTablePropertyName() { return "TOperationparams"; }
    public String getTableSqlName() { return "t_operationparams"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnOperationid = cci("OperationID", null, "operationid", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnName = cci("Name", null, "name", String.class, false, false, 255, 0);
    protected ColumnInfo _columnType = cci("Type", null, "type", String.class, false, false, 255, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnPos = cci("Pos", null, "pos", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnStyle = cci("Style", null, "style", String.class, false, false, 255, 0);
    protected ColumnInfo _columnKind = cci("Kind", null, "kind", String.class, false, false, 12, 0);
    protected ColumnInfo _columnClassifier = cci("Classifier", null, "classifier", String.class, false, false, 50, 0);
    protected ColumnInfo _columnEaGuid = cci("ea_guid", null, "eaGuid", String.class, false, false, 50, 0);
    protected ColumnInfo _columnStyleex = cci("StyleEx", null, "styleex", String.class, false, false, 2147483647, 0);

    public ColumnInfo columnOperationid() { return _columnOperationid; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnType() { return _columnType; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnPos() { return _columnPos; }
    public ColumnInfo columnStyle() { return _columnStyle; }
    public ColumnInfo columnKind() { return _columnKind; }
    public ColumnInfo columnClassifier() { return _columnClassifier; }
    public ColumnInfo columnEaGuid() { return _columnEaGuid; }
    public ColumnInfo columnStyleex() { return _columnStyleex; }

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
    public ForeignInfo foreignTOperation() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnOperationid(), TOperationDbm.getInstance().columnOperationid());
        return cfi("TOperation", this, TOperationDbm.getInstance(), map, 0, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TOperationparams"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TOperationparamsCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TOperationparamsDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TOperationparamsBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TOperationparams> getEntityType() { return TOperationparams.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TOperationparams newMyEntity() { return new TOperationparams(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TOperationparams)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TOperationparams)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TOperationparams>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsOperationid(), columnOperationid());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsType(), columnType());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsPos(), columnPos());
        setupEps(_epsMap, new EpsStyle(), columnStyle());
        setupEps(_epsMap, new EpsKind(), columnKind());
        setupEps(_epsMap, new EpsClassifier(), columnClassifier());
        setupEps(_epsMap, new EpsEaGuid(), columnEaGuid());
        setupEps(_epsMap, new EpsStyleex(), columnStyleex());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TOperationparams)entity, value); }

    public static class EpsOperationid implements Eps<TOperationparams>
    { public void setup(TOperationparams e, Object v) { e.setOperationid((java.lang.Integer)v); } }
    public static class EpsName implements Eps<TOperationparams>
    { public void setup(TOperationparams e, Object v) { e.setName((String)v); } }
    public static class EpsType implements Eps<TOperationparams>
    { public void setup(TOperationparams e, Object v) { e.setType((String)v); } }
    public static class EpsNotes implements Eps<TOperationparams>
    { public void setup(TOperationparams e, Object v) { e.setNotes((String)v); } }
    public static class EpsPos implements Eps<TOperationparams>
    { public void setup(TOperationparams e, Object v) { e.setPos((java.lang.Integer)v); } }
    public static class EpsStyle implements Eps<TOperationparams>
    { public void setup(TOperationparams e, Object v) { e.setStyle((String)v); } }
    public static class EpsKind implements Eps<TOperationparams>
    { public void setup(TOperationparams e, Object v) { e.setKind((String)v); } }
    public static class EpsClassifier implements Eps<TOperationparams>
    { public void setup(TOperationparams e, Object v) { e.setClassifier((String)v); } }
    public static class EpsEaGuid implements Eps<TOperationparams>
    { public void setup(TOperationparams e, Object v) { e.setEaGuid((String)v); } }
    public static class EpsStyleex implements Eps<TOperationparams>
    { public void setup(TOperationparams e, Object v) { e.setStyleex((String)v); } }
}
