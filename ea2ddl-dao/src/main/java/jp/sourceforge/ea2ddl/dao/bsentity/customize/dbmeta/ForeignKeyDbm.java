package jp.sourceforge.ea2ddl.dao.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.customize.ForeignKey;

/**
 * The DB meta of ForeignKey. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ForeignKeyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ForeignKeyDbm _instance = new ForeignKeyDbm();
    private ForeignKeyDbm() {}
    public static ForeignKeyDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "ForeignKey"; }
    public String getTablePropertyName() { return "foreignKey"; }
    public String getTableSqlName() { return "ForeignKey"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnConnectorId = cci("Connector_ID", null, "connectorId", java.lang.Integer.class, false, false, 10, 0);
    protected ColumnInfo _columnStartObjectId = cci("Start_Object_ID", null, "startObjectId", java.lang.Integer.class, false, false, 10, 0);
    protected ColumnInfo _columnName = cci("Name", null, "name", String.class, false, false, 255, 0);
    protected ColumnInfo _columnEndObjectId = cci("End_Object_ID", null, "endObjectId", java.lang.Integer.class, false, false, 10, 0);

    public ColumnInfo columnConnectorId() { return _columnConnectorId; }
    public ColumnInfo columnStartObjectId() { return _columnStartObjectId; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnEndObjectId() { return _columnEndObjectId; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.customize.ForeignKey"; }
    public String getConditionBeanTypeName() { return null; }
    public String getDaoTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ForeignKey> getEntityType() { return ForeignKey.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public ForeignKey newMyEntity() { return new ForeignKey(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((ForeignKey)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((ForeignKey)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<ForeignKey>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsConnectorId(), columnConnectorId());
        setupEps(_epsMap, new EpsStartObjectId(), columnStartObjectId());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsEndObjectId(), columnEndObjectId());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((ForeignKey)entity, value); }

    public static class EpsConnectorId implements Eps<ForeignKey>
    { public void setup(ForeignKey e, Object v) { e.setConnectorId((java.lang.Integer)v); } }
    public static class EpsStartObjectId implements Eps<ForeignKey>
    { public void setup(ForeignKey e, Object v) { e.setStartObjectId((java.lang.Integer)v); } }
    public static class EpsName implements Eps<ForeignKey>
    { public void setup(ForeignKey e, Object v) { e.setName((String)v); } }
    public static class EpsEndObjectId implements Eps<ForeignKey>
    { public void setup(ForeignKey e, Object v) { e.setEndObjectId((java.lang.Integer)v); } }
}
