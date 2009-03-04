package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TFiles;

/**
 * The DB meta of t_files. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TFilesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TFilesDbm _instance = new TFilesDbm();
    private TFilesDbm() {}
    public static TFilesDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_files"; }
    public String getTablePropertyName() { return "TFiles"; }
    public String getTableSqlName() { return "t_files"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnFileid = cci("FileID", null, "fileid", String.class, false, false, 50, 0);
    protected ColumnInfo _columnAppliesto = cci("AppliesTo", null, "appliesto", String.class, false, false, 50, 0);
    protected ColumnInfo _columnCategory = cci("Category", null, "category", String.class, false, false, 100, 0);
    protected ColumnInfo _columnName = cci("Name", null, "name", String.class, false, false, 150, 0);
    protected ColumnInfo _columnFile = cci("File", null, "file", String.class, false, false, 255, 0);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnFiledate = cci("FileDate", null, "filedate", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnFilesize = cci("FileSize", null, "filesize", java.lang.Integer.class, false, false, null, null);

    public ColumnInfo columnFileid() { return _columnFileid; }
    public ColumnInfo columnAppliesto() { return _columnAppliesto; }
    public ColumnInfo columnCategory() { return _columnCategory; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnFile() { return _columnFile; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnFiledate() { return _columnFiledate; }
    public ColumnInfo columnFilesize() { return _columnFilesize; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TFiles"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TFilesCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TFilesDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TFilesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TFiles> getEntityType() { return TFiles.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TFiles newMyEntity() { return new TFiles(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TFiles)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TFiles)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TFiles>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsFileid(), columnFileid());
        setupEps(_epsMap, new EpsAppliesto(), columnAppliesto());
        setupEps(_epsMap, new EpsCategory(), columnCategory());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsFile(), columnFile());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsFiledate(), columnFiledate());
        setupEps(_epsMap, new EpsFilesize(), columnFilesize());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TFiles)entity, value); }

    public static class EpsFileid implements Eps<TFiles>
    { public void setup(TFiles e, Object v) { e.setFileid((String)v); } }
    public static class EpsAppliesto implements Eps<TFiles>
    { public void setup(TFiles e, Object v) { e.setAppliesto((String)v); } }
    public static class EpsCategory implements Eps<TFiles>
    { public void setup(TFiles e, Object v) { e.setCategory((String)v); } }
    public static class EpsName implements Eps<TFiles>
    { public void setup(TFiles e, Object v) { e.setName((String)v); } }
    public static class EpsFile implements Eps<TFiles>
    { public void setup(TFiles e, Object v) { e.setFile((String)v); } }
    public static class EpsNotes implements Eps<TFiles>
    { public void setup(TFiles e, Object v) { e.setNotes((String)v); } }
    public static class EpsFiledate implements Eps<TFiles>
    { public void setup(TFiles e, Object v) { e.setFiledate((java.sql.Timestamp)v); } }
    public static class EpsFilesize implements Eps<TFiles>
    { public void setup(TFiles e, Object v) { e.setFilesize((java.lang.Integer)v); } }
}
