package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TObjectconstraint;

/**
 * The DB meta of t_objectconstraint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TObjectconstraintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TObjectconstraintDbm _instance = new TObjectconstraintDbm();
    private TObjectconstraintDbm() {}
    public static TObjectconstraintDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_objectconstraint"; }
    public String getTablePropertyName() { return "TObjectconstraint"; }
    public String getTableSqlName() { return "t_objectconstraint"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnObjectId = cci("Object_ID", null, "objectId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnConstraint = cci("Constraint", null, "constraint", String.class, false, false, 255, 0);
    protected ColumnInfo _columnConstrainttype = cci("ConstraintType", null, "constrainttype", String.class, false, false, 30, 0);
    protected ColumnInfo _columnWeight = cci("Weight", null, "weight", java.math.BigDecimal.class, false, false, null, null);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnStatus = cci("Status", null, "status", String.class, false, false, 50, 0);

    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnConstraint() { return _columnConstraint; }
    public ColumnInfo columnConstrainttype() { return _columnConstrainttype; }
    public ColumnInfo columnWeight() { return _columnWeight; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnStatus() { return _columnStatus; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TObjectconstraint"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TObjectconstraintCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TObjectconstraintDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TObjectconstraintBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TObjectconstraint> getEntityType() { return TObjectconstraint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TObjectconstraint newMyEntity() { return new TObjectconstraint(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TObjectconstraint)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TObjectconstraint)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TObjectconstraint>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsConstraint(), columnConstraint());
        setupEps(_epsMap, new EpsConstrainttype(), columnConstrainttype());
        setupEps(_epsMap, new EpsWeight(), columnWeight());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsStatus(), columnStatus());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TObjectconstraint)entity, value); }

    public static class EpsObjectId implements Eps<TObjectconstraint>
    { public void setup(TObjectconstraint e, Object v) { e.setObjectId((java.lang.Integer)v); } }
    public static class EpsConstraint implements Eps<TObjectconstraint>
    { public void setup(TObjectconstraint e, Object v) { e.setConstraint((String)v); } }
    public static class EpsConstrainttype implements Eps<TObjectconstraint>
    { public void setup(TObjectconstraint e, Object v) { e.setConstrainttype((String)v); } }
    public static class EpsWeight implements Eps<TObjectconstraint>
    { public void setup(TObjectconstraint e, Object v) { e.setWeight((java.math.BigDecimal)v); } }
    public static class EpsNotes implements Eps<TObjectconstraint>
    { public void setup(TObjectconstraint e, Object v) { e.setNotes((String)v); } }
    public static class EpsStatus implements Eps<TObjectconstraint>
    { public void setup(TObjectconstraint e, Object v) { e.setStatus((String)v); } }
}
