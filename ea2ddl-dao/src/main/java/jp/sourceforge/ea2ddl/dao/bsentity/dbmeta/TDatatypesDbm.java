package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TDatatypes;

/**
 * The DB meta of t_datatypes. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TDatatypesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TDatatypesDbm _instance = new TDatatypesDbm();
    private TDatatypesDbm() {}
    public static TDatatypesDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_datatypes"; }
    public String getTablePropertyName() { return "TDatatypes"; }
    public String getTableSqlName() { return "t_datatypes"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnType = cci("Type", null, "type", String.class, false, false, 50, 0);
    protected ColumnInfo _columnProductname = cci("ProductName", null, "productname", String.class, false, false, 50, 0);
    protected ColumnInfo _columnDatatype = cci("DataType", null, "datatype", String.class, false, false, 50, 0);
    protected ColumnInfo _columnSize = cci("Size", null, "size", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnMaxlen = cci("MaxLen", null, "maxlen", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnMaxprec = cci("MaxPrec", null, "maxprec", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnMaxscale = cci("MaxScale", null, "maxscale", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnDefaultlen = cci("DefaultLen", null, "defaultlen", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnDefaultprec = cci("DefaultPrec", null, "defaultprec", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnDefaultscale = cci("DefaultScale", null, "defaultscale", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnUser = cci("User", null, "user", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnPdata1 = cci("PDATA1", null, "pdata1", String.class, false, false, 255, 0);
    protected ColumnInfo _columnPdata2 = cci("PDATA2", null, "pdata2", String.class, false, false, 255, 0);
    protected ColumnInfo _columnPdata3 = cci("PDATA3", null, "pdata3", String.class, false, false, 255, 0);
    protected ColumnInfo _columnPdata4 = cci("PDATA4", null, "pdata4", String.class, false, false, 255, 0);
    protected ColumnInfo _columnHaslength = cci("HasLength", null, "haslength", String.class, false, false, 50, 0);
    protected ColumnInfo _columnGenerictype = cci("GenericType", null, "generictype", String.class, false, false, 255, 0);
    protected ColumnInfo _columnDatatypeid = cci("DatatypeID", null, "datatypeid", java.lang.Integer.class, false, false, null, null);

    public ColumnInfo columnType() { return _columnType; }
    public ColumnInfo columnProductname() { return _columnProductname; }
    public ColumnInfo columnDatatype() { return _columnDatatype; }
    public ColumnInfo columnSize() { return _columnSize; }
    public ColumnInfo columnMaxlen() { return _columnMaxlen; }
    public ColumnInfo columnMaxprec() { return _columnMaxprec; }
    public ColumnInfo columnMaxscale() { return _columnMaxscale; }
    public ColumnInfo columnDefaultlen() { return _columnDefaultlen; }
    public ColumnInfo columnDefaultprec() { return _columnDefaultprec; }
    public ColumnInfo columnDefaultscale() { return _columnDefaultscale; }
    public ColumnInfo columnUser() { return _columnUser; }
    public ColumnInfo columnPdata1() { return _columnPdata1; }
    public ColumnInfo columnPdata2() { return _columnPdata2; }
    public ColumnInfo columnPdata3() { return _columnPdata3; }
    public ColumnInfo columnPdata4() { return _columnPdata4; }
    public ColumnInfo columnHaslength() { return _columnHaslength; }
    public ColumnInfo columnGenerictype() { return _columnGenerictype; }
    public ColumnInfo columnDatatypeid() { return _columnDatatypeid; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TDatatypes"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TDatatypesCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TDatatypesDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TDatatypesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TDatatypes> getEntityType() { return TDatatypes.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TDatatypes newMyEntity() { return new TDatatypes(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TDatatypes)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TDatatypes)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TDatatypes>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsType(), columnType());
        setupEps(_epsMap, new EpsProductname(), columnProductname());
        setupEps(_epsMap, new EpsDatatype(), columnDatatype());
        setupEps(_epsMap, new EpsSize(), columnSize());
        setupEps(_epsMap, new EpsMaxlen(), columnMaxlen());
        setupEps(_epsMap, new EpsMaxprec(), columnMaxprec());
        setupEps(_epsMap, new EpsMaxscale(), columnMaxscale());
        setupEps(_epsMap, new EpsDefaultlen(), columnDefaultlen());
        setupEps(_epsMap, new EpsDefaultprec(), columnDefaultprec());
        setupEps(_epsMap, new EpsDefaultscale(), columnDefaultscale());
        setupEps(_epsMap, new EpsUser(), columnUser());
        setupEps(_epsMap, new EpsPdata1(), columnPdata1());
        setupEps(_epsMap, new EpsPdata2(), columnPdata2());
        setupEps(_epsMap, new EpsPdata3(), columnPdata3());
        setupEps(_epsMap, new EpsPdata4(), columnPdata4());
        setupEps(_epsMap, new EpsHaslength(), columnHaslength());
        setupEps(_epsMap, new EpsGenerictype(), columnGenerictype());
        setupEps(_epsMap, new EpsDatatypeid(), columnDatatypeid());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TDatatypes)entity, value); }

    public static class EpsType implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setType((String)v); } }
    public static class EpsProductname implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setProductname((String)v); } }
    public static class EpsDatatype implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setDatatype((String)v); } }
    public static class EpsSize implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setSize((java.lang.Integer)v); } }
    public static class EpsMaxlen implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setMaxlen((java.lang.Integer)v); } }
    public static class EpsMaxprec implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setMaxprec((java.lang.Integer)v); } }
    public static class EpsMaxscale implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setMaxscale((java.lang.Integer)v); } }
    public static class EpsDefaultlen implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setDefaultlen((java.lang.Integer)v); } }
    public static class EpsDefaultprec implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setDefaultprec((java.lang.Integer)v); } }
    public static class EpsDefaultscale implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setDefaultscale((java.lang.Integer)v); } }
    public static class EpsUser implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setUser((java.lang.Integer)v); } }
    public static class EpsPdata1 implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setPdata1((String)v); } }
    public static class EpsPdata2 implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setPdata2((String)v); } }
    public static class EpsPdata3 implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setPdata3((String)v); } }
    public static class EpsPdata4 implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setPdata4((String)v); } }
    public static class EpsHaslength implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setHaslength((String)v); } }
    public static class EpsGenerictype implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setGenerictype((String)v); } }
    public static class EpsDatatypeid implements Eps<TDatatypes>
    { public void setup(TDatatypes e, Object v) { e.setDatatypeid((java.lang.Integer)v); } }
}
