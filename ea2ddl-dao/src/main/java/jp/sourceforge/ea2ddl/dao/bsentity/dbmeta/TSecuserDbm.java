package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TSecuser;

/**
 * The DB meta of t_secuser. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TSecuserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TSecuserDbm _instance = new TSecuserDbm();
    private TSecuserDbm() {}
    public static TSecuserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_secuser"; }
    public String getTablePropertyName() { return "TSecuser"; }
    public String getTableSqlName() { return "t_secuser"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnUserid = cci("UserID", null, "userid", String.class, false, false, 40, 0);
    protected ColumnInfo _columnUserlogin = cci("UserLogin", null, "userlogin", String.class, false, false, 32, 0);
    protected ColumnInfo _columnFirstname = cci("FirstName", null, "firstname", String.class, false, false, 50, 0);
    protected ColumnInfo _columnSurname = cci("Surname", null, "surname", String.class, false, false, 50, 0);
    protected ColumnInfo _columnDepartment = cci("Department", null, "department", String.class, false, false, 50, 0);
    protected ColumnInfo _columnPassword = cci("Password", null, "password", String.class, false, false, 12, 0);

    public ColumnInfo columnUserid() { return _columnUserid; }
    public ColumnInfo columnUserlogin() { return _columnUserlogin; }
    public ColumnInfo columnFirstname() { return _columnFirstname; }
    public ColumnInfo columnSurname() { return _columnSurname; }
    public ColumnInfo columnDepartment() { return _columnDepartment; }
    public ColumnInfo columnPassword() { return _columnPassword; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TSecuser"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TSecuserCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TSecuserDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TSecuserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TSecuser> getEntityType() { return TSecuser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TSecuser newMyEntity() { return new TSecuser(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TSecuser)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TSecuser)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TSecuser>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsUserid(), columnUserid());
        setupEps(_epsMap, new EpsUserlogin(), columnUserlogin());
        setupEps(_epsMap, new EpsFirstname(), columnFirstname());
        setupEps(_epsMap, new EpsSurname(), columnSurname());
        setupEps(_epsMap, new EpsDepartment(), columnDepartment());
        setupEps(_epsMap, new EpsPassword(), columnPassword());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TSecuser)entity, value); }

    public static class EpsUserid implements Eps<TSecuser>
    { public void setup(TSecuser e, Object v) { e.setUserid((String)v); } }
    public static class EpsUserlogin implements Eps<TSecuser>
    { public void setup(TSecuser e, Object v) { e.setUserlogin((String)v); } }
    public static class EpsFirstname implements Eps<TSecuser>
    { public void setup(TSecuser e, Object v) { e.setFirstname((String)v); } }
    public static class EpsSurname implements Eps<TSecuser>
    { public void setup(TSecuser e, Object v) { e.setSurname((String)v); } }
    public static class EpsDepartment implements Eps<TSecuser>
    { public void setup(TSecuser e, Object v) { e.setDepartment((String)v); } }
    public static class EpsPassword implements Eps<TSecuser>
    { public void setup(TSecuser e, Object v) { e.setPassword((String)v); } }
}
