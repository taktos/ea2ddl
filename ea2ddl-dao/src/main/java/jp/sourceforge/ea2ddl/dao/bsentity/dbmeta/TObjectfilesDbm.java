package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TObjectfiles;

/**
 * The DB meta of t_objectfiles. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TObjectfilesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TObjectfilesDbm _instance = new TObjectfilesDbm();
    private TObjectfilesDbm() {}
    public static TObjectfilesDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_objectfiles"; }
    public String getTablePropertyName() { return "TObjectfiles"; }
    public String getTableSqlName() { return "t_objectfiles"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnObjectId = cci("Object_ID", null, "objectId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnFilename = cci("FileName", null, "filename", String.class, false, false, 255, 0);
    protected ColumnInfo _columnType = cci("Type", null, "type", String.class, false, false, 50, 0);
    protected ColumnInfo _columnNote = cci("Note", null, "note", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnFilesize = cci("FileSize", null, "filesize", String.class, false, false, 255, 0);
    protected ColumnInfo _columnFiledate = cci("FileDate", null, "filedate", String.class, false, false, 255, 0);

    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnFilename() { return _columnFilename; }
    public ColumnInfo columnType() { return _columnType; }
    public ColumnInfo columnNote() { return _columnNote; }
    public ColumnInfo columnFilesize() { return _columnFilesize; }
    public ColumnInfo columnFiledate() { return _columnFiledate; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TObjectfiles"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TObjectfilesCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TObjectfilesDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TObjectfilesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TObjectfiles> getEntityType() { return TObjectfiles.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TObjectfiles newMyEntity() { return new TObjectfiles(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TObjectfiles)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TObjectfiles)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TObjectfiles>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsFilename(), columnFilename());
        setupEps(_epsMap, new EpsType(), columnType());
        setupEps(_epsMap, new EpsNote(), columnNote());
        setupEps(_epsMap, new EpsFilesize(), columnFilesize());
        setupEps(_epsMap, new EpsFiledate(), columnFiledate());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TObjectfiles)entity, value); }

    public static class EpsObjectId implements Eps<TObjectfiles>
    { public void setup(TObjectfiles e, Object v) { e.setObjectId((java.lang.Integer)v); } }
    public static class EpsFilename implements Eps<TObjectfiles>
    { public void setup(TObjectfiles e, Object v) { e.setFilename((String)v); } }
    public static class EpsType implements Eps<TObjectfiles>
    { public void setup(TObjectfiles e, Object v) { e.setType((String)v); } }
    public static class EpsNote implements Eps<TObjectfiles>
    { public void setup(TObjectfiles e, Object v) { e.setNote((String)v); } }
    public static class EpsFilesize implements Eps<TObjectfiles>
    { public void setup(TObjectfiles e, Object v) { e.setFilesize((String)v); } }
    public static class EpsFiledate implements Eps<TObjectfiles>
    { public void setup(TObjectfiles e, Object v) { e.setFiledate((String)v); } }
}
