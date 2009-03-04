package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TTaggedvalue;

/**
 * The DB meta of t_taggedvalue. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTaggedvalueDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTaggedvalueDbm _instance = new TTaggedvalueDbm();
    private TTaggedvalueDbm() {}
    public static TTaggedvalueDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_taggedvalue"; }
    public String getTablePropertyName() { return "TTaggedvalue"; }
    public String getTableSqlName() { return "t_taggedvalue"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnPropertyid = cci("PropertyID", null, "propertyid", String.class, false, false, 40, 0);
    protected ColumnInfo _columnElementid = cci("ElementID", null, "elementid", String.class, false, false, 40, 0);
    protected ColumnInfo _columnBaseclass = cci("BaseClass", null, "baseclass", String.class, false, false, 100, 0);
    protected ColumnInfo _columnTagvalue = cci("TagValue", null, "tagvalue", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);

    public ColumnInfo columnPropertyid() { return _columnPropertyid; }
    public ColumnInfo columnElementid() { return _columnElementid; }
    public ColumnInfo columnBaseclass() { return _columnBaseclass; }
    public ColumnInfo columnTagvalue() { return _columnTagvalue; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TTaggedvalue"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TTaggedvalueCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TTaggedvalueDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TTaggedvalueBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTaggedvalue> getEntityType() { return TTaggedvalue.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TTaggedvalue newMyEntity() { return new TTaggedvalue(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TTaggedvalue)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TTaggedvalue)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TTaggedvalue>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsPropertyid(), columnPropertyid());
        setupEps(_epsMap, new EpsElementid(), columnElementid());
        setupEps(_epsMap, new EpsBaseclass(), columnBaseclass());
        setupEps(_epsMap, new EpsTagvalue(), columnTagvalue());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TTaggedvalue)entity, value); }

    public static class EpsPropertyid implements Eps<TTaggedvalue>
    { public void setup(TTaggedvalue e, Object v) { e.setPropertyid((String)v); } }
    public static class EpsElementid implements Eps<TTaggedvalue>
    { public void setup(TTaggedvalue e, Object v) { e.setElementid((String)v); } }
    public static class EpsBaseclass implements Eps<TTaggedvalue>
    { public void setup(TTaggedvalue e, Object v) { e.setBaseclass((String)v); } }
    public static class EpsTagvalue implements Eps<TTaggedvalue>
    { public void setup(TTaggedvalue e, Object v) { e.setTagvalue((String)v); } }
    public static class EpsNotes implements Eps<TTaggedvalue>
    { public void setup(TTaggedvalue e, Object v) { e.setNotes((String)v); } }
}
