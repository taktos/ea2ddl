package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TXref;

/**
 * The DB meta of t_xref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TXrefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TXrefDbm _instance = new TXrefDbm();
    private TXrefDbm() {}
    public static TXrefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_xref"; }
    public String getTablePropertyName() { return "TXref"; }
    public String getTableSqlName() { return "t_xref"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnXrefid = cci("XrefID", null, "xrefid", String.class, false, false, 255, 0);
    protected ColumnInfo _columnName = cci("Name", null, "name", String.class, false, false, 255, 0);
    protected ColumnInfo _columnType = cci("Type", null, "type", String.class, false, false, 255, 0);
    protected ColumnInfo _columnVisibility = cci("Visibility", null, "visibility", String.class, false, false, 255, 0);
    protected ColumnInfo _columnNamespace = cci("Namespace", null, "namespace", String.class, false, false, 255, 0);
    protected ColumnInfo _columnRequirement = cci("Requirement", null, "requirement", String.class, false, false, 255, 0);
    protected ColumnInfo _columnConstraint = cci("Constraint", null, "constraint", String.class, false, false, 255, 0);
    protected ColumnInfo _columnBehavior = cci("Behavior", null, "behavior", String.class, false, false, 255, 0);
    protected ColumnInfo _columnPartition = cci("Partition", null, "partition", String.class, false, false, 255, 0);
    protected ColumnInfo _columnDescription = cci("Description", null, "description", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnClient = cci("Client", null, "client", String.class, false, false, 255, 0);
    protected ColumnInfo _columnSupplier = cci("Supplier", null, "supplier", String.class, false, false, 255, 0);
    protected ColumnInfo _columnLink = cci("Link", null, "link", String.class, false, false, 255, 0);

    public ColumnInfo columnXrefid() { return _columnXrefid; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnType() { return _columnType; }
    public ColumnInfo columnVisibility() { return _columnVisibility; }
    public ColumnInfo columnNamespace() { return _columnNamespace; }
    public ColumnInfo columnRequirement() { return _columnRequirement; }
    public ColumnInfo columnConstraint() { return _columnConstraint; }
    public ColumnInfo columnBehavior() { return _columnBehavior; }
    public ColumnInfo columnPartition() { return _columnPartition; }
    public ColumnInfo columnDescription() { return _columnDescription; }
    public ColumnInfo columnClient() { return _columnClient; }
    public ColumnInfo columnSupplier() { return _columnSupplier; }
    public ColumnInfo columnLink() { return _columnLink; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TXref"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TXrefCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TXrefDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TXrefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TXref> getEntityType() { return TXref.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TXref newMyEntity() { return new TXref(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TXref)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TXref)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TXref>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsXrefid(), columnXrefid());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsType(), columnType());
        setupEps(_epsMap, new EpsVisibility(), columnVisibility());
        setupEps(_epsMap, new EpsNamespace(), columnNamespace());
        setupEps(_epsMap, new EpsRequirement(), columnRequirement());
        setupEps(_epsMap, new EpsConstraint(), columnConstraint());
        setupEps(_epsMap, new EpsBehavior(), columnBehavior());
        setupEps(_epsMap, new EpsPartition(), columnPartition());
        setupEps(_epsMap, new EpsDescription(), columnDescription());
        setupEps(_epsMap, new EpsClient(), columnClient());
        setupEps(_epsMap, new EpsSupplier(), columnSupplier());
        setupEps(_epsMap, new EpsLink(), columnLink());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TXref)entity, value); }

    public static class EpsXrefid implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setXrefid((String)v); } }
    public static class EpsName implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setName((String)v); } }
    public static class EpsType implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setType((String)v); } }
    public static class EpsVisibility implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setVisibility((String)v); } }
    public static class EpsNamespace implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setNamespace((String)v); } }
    public static class EpsRequirement implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setRequirement((String)v); } }
    public static class EpsConstraint implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setConstraint((String)v); } }
    public static class EpsBehavior implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setBehavior((String)v); } }
    public static class EpsPartition implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setPartition((String)v); } }
    public static class EpsDescription implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setDescription((String)v); } }
    public static class EpsClient implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setClient((String)v); } }
    public static class EpsSupplier implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setSupplier((String)v); } }
    public static class EpsLink implements Eps<TXref>
    { public void setup(TXref e, Object v) { e.setLink((String)v); } }
}
