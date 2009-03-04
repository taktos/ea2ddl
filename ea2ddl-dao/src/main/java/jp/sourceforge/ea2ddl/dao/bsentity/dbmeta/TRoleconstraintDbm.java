package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TRoleconstraint;

/**
 * The DB meta of t_roleconstraint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TRoleconstraintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TRoleconstraintDbm _instance = new TRoleconstraintDbm();
    private TRoleconstraintDbm() {}
    public static TRoleconstraintDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_roleconstraint"; }
    public String getTablePropertyName() { return "TRoleconstraint"; }
    public String getTableSqlName() { return "t_roleconstraint"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnConnectorid = cci("ConnectorID", null, "connectorid", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnConstraint = cci("Constraint", null, "constraint", String.class, false, false, 255, 0);
    protected ColumnInfo _columnConnectorend = cci("ConnectorEnd", null, "connectorend", String.class, false, false, 50, 0);
    protected ColumnInfo _columnConstrainttype = cci("ConstraintType", null, "constrainttype", String.class, false, false, 12, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);

    public ColumnInfo columnConnectorid() { return _columnConnectorid; }
    public ColumnInfo columnConstraint() { return _columnConstraint; }
    public ColumnInfo columnConnectorend() { return _columnConnectorend; }
    public ColumnInfo columnConstrainttype() { return _columnConstrainttype; }
    public ColumnInfo columnNotes() { return _columnNotes; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TRoleconstraint"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TRoleconstraintCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TRoleconstraintDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TRoleconstraintBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TRoleconstraint> getEntityType() { return TRoleconstraint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TRoleconstraint newMyEntity() { return new TRoleconstraint(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TRoleconstraint)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TRoleconstraint)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TRoleconstraint>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsConnectorid(), columnConnectorid());
        setupEps(_epsMap, new EpsConstraint(), columnConstraint());
        setupEps(_epsMap, new EpsConnectorend(), columnConnectorend());
        setupEps(_epsMap, new EpsConstrainttype(), columnConstrainttype());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TRoleconstraint)entity, value); }

    public static class EpsConnectorid implements Eps<TRoleconstraint>
    { public void setup(TRoleconstraint e, Object v) { e.setConnectorid((java.lang.Integer)v); } }
    public static class EpsConstraint implements Eps<TRoleconstraint>
    { public void setup(TRoleconstraint e, Object v) { e.setConstraint((String)v); } }
    public static class EpsConnectorend implements Eps<TRoleconstraint>
    { public void setup(TRoleconstraint e, Object v) { e.setConnectorend((String)v); } }
    public static class EpsConstrainttype implements Eps<TRoleconstraint>
    { public void setup(TRoleconstraint e, Object v) { e.setConstrainttype((String)v); } }
    public static class EpsNotes implements Eps<TRoleconstraint>
    { public void setup(TRoleconstraint e, Object v) { e.setNotes((String)v); } }
}
