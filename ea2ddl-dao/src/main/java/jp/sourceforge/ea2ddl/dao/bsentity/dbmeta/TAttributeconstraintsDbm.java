package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TAttributeconstraints;

/**
 * The DB meta of t_attributeconstraints. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TAttributeconstraintsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TAttributeconstraintsDbm _instance = new TAttributeconstraintsDbm();
    private TAttributeconstraintsDbm() {}
    public static TAttributeconstraintsDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_attributeconstraints"; }
    public String getTablePropertyName() { return "TAttributeconstraints"; }
    public String getTableSqlName() { return "t_attributeconstraints"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnObjectId = cci("Object_ID", null, "objectId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnConstraint = cci("Constraint", null, "constraint", String.class, false, false, 255, 0);
    protected ColumnInfo _columnAttname = cci("AttName", null, "attname", String.class, false, false, 255, 0);
    protected ColumnInfo _columnType = cci("Type", null, "type", String.class, false, false, 255, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnId = cci("ID", null, "id", java.lang.Integer.class, false, false, null, null);

    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnConstraint() { return _columnConstraint; }
    public ColumnInfo columnAttname() { return _columnAttname; }
    public ColumnInfo columnType() { return _columnType; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnId() { return _columnId; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TAttributeconstraints"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TAttributeconstraintsCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TAttributeconstraintsDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TAttributeconstraintsBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TAttributeconstraints> getEntityType() { return TAttributeconstraints.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TAttributeconstraints newMyEntity() { return new TAttributeconstraints(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TAttributeconstraints)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TAttributeconstraints)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TAttributeconstraints>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsConstraint(), columnConstraint());
        setupEps(_epsMap, new EpsAttname(), columnAttname());
        setupEps(_epsMap, new EpsType(), columnType());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsId(), columnId());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TAttributeconstraints)entity, value); }

    public static class EpsObjectId implements Eps<TAttributeconstraints>
    { public void setup(TAttributeconstraints e, Object v) { e.setObjectId((java.lang.Integer)v); } }
    public static class EpsConstraint implements Eps<TAttributeconstraints>
    { public void setup(TAttributeconstraints e, Object v) { e.setConstraint((String)v); } }
    public static class EpsAttname implements Eps<TAttributeconstraints>
    { public void setup(TAttributeconstraints e, Object v) { e.setAttname((String)v); } }
    public static class EpsType implements Eps<TAttributeconstraints>
    { public void setup(TAttributeconstraints e, Object v) { e.setType((String)v); } }
    public static class EpsNotes implements Eps<TAttributeconstraints>
    { public void setup(TAttributeconstraints e, Object v) { e.setNotes((String)v); } }
    public static class EpsId implements Eps<TAttributeconstraints>
    { public void setup(TAttributeconstraints e, Object v) { e.setId((java.lang.Integer)v); } }
}
