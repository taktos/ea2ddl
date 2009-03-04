package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TPackage;

/**
 * The DB meta of t_package. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPackageDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPackageDbm _instance = new TPackageDbm();
    private TPackageDbm() {}
    public static TPackageDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_package"; }
    public String getTablePropertyName() { return "TPackage"; }
    public String getTableSqlName() { return "t_package"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnPackageId = cci("Package_ID", null, "packageId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnName = cci("Name", null, "name", String.class, false, false, 255, 0);
    protected ColumnInfo _columnParentId = cci("Parent_ID", null, "parentId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnCreateddate = cci("CreatedDate", null, "createddate", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnModifieddate = cci("ModifiedDate", null, "modifieddate", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnEaGuid = cci("ea_guid", null, "eaGuid", String.class, false, false, 40, 0);
    protected ColumnInfo _columnXmlpath = cci("XMLPath", null, "xmlpath", String.class, false, false, 255, 0);
    protected ColumnInfo _columnIscontrolled = cci("IsControlled", null, "iscontrolled", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnLastloaddate = cci("LastLoadDate", null, "lastloaddate", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnLastsavedate = cci("LastSaveDate", null, "lastsavedate", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnVersion = cci("Version", null, "version", String.class, false, false, 50, 0);
    protected ColumnInfo _columnPkgowner = cci("PkgOwner", null, "pkgowner", String.class, false, false, 255, 0);
    protected ColumnInfo _columnUmlversion = cci("UMLVersion", null, "umlversion", String.class, false, false, 50, 0);
    protected ColumnInfo _columnUsedtd = cci("UseDTD", null, "usedtd", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnLogxml = cci("LogXML", null, "logxml", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnCodepath = cci("CodePath", null, "codepath", String.class, false, false, 255, 0);
    protected ColumnInfo _columnNamespace = cci("Namespace", null, "namespace", String.class, false, false, 50, 0);
    protected ColumnInfo _columnTpos = cci("TPos", null, "tpos", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnPackageflags = cci("PackageFlags", null, "packageflags", String.class, false, false, 255, 0);
    protected ColumnInfo _columnBatchsave = cci("BatchSave", null, "batchsave", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnBatchload = cci("BatchLoad", null, "batchload", java.lang.Integer.class, false, false, null, null);

    public ColumnInfo columnPackageId() { return _columnPackageId; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnParentId() { return _columnParentId; }
    public ColumnInfo columnCreateddate() { return _columnCreateddate; }
    public ColumnInfo columnModifieddate() { return _columnModifieddate; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnEaGuid() { return _columnEaGuid; }
    public ColumnInfo columnXmlpath() { return _columnXmlpath; }
    public ColumnInfo columnIscontrolled() { return _columnIscontrolled; }
    public ColumnInfo columnLastloaddate() { return _columnLastloaddate; }
    public ColumnInfo columnLastsavedate() { return _columnLastsavedate; }
    public ColumnInfo columnVersion() { return _columnVersion; }
    public ColumnInfo columnPkgowner() { return _columnPkgowner; }
    public ColumnInfo columnUmlversion() { return _columnUmlversion; }
    public ColumnInfo columnUsedtd() { return _columnUsedtd; }
    public ColumnInfo columnLogxml() { return _columnLogxml; }
    public ColumnInfo columnCodepath() { return _columnCodepath; }
    public ColumnInfo columnNamespace() { return _columnNamespace; }
    public ColumnInfo columnTpos() { return _columnTpos; }
    public ColumnInfo columnPackageflags() { return _columnPackageflags; }
    public ColumnInfo columnBatchsave() { return _columnBatchsave; }
    public ColumnInfo columnBatchload() { return _columnBatchload; }

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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TPackage"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TPackageCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TPackageDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TPackageBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPackage> getEntityType() { return TPackage.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TPackage newMyEntity() { return new TPackage(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TPackage)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TPackage)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TPackage>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsPackageId(), columnPackageId());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsParentId(), columnParentId());
        setupEps(_epsMap, new EpsCreateddate(), columnCreateddate());
        setupEps(_epsMap, new EpsModifieddate(), columnModifieddate());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsEaGuid(), columnEaGuid());
        setupEps(_epsMap, new EpsXmlpath(), columnXmlpath());
        setupEps(_epsMap, new EpsIscontrolled(), columnIscontrolled());
        setupEps(_epsMap, new EpsLastloaddate(), columnLastloaddate());
        setupEps(_epsMap, new EpsLastsavedate(), columnLastsavedate());
        setupEps(_epsMap, new EpsVersion(), columnVersion());
        setupEps(_epsMap, new EpsPkgowner(), columnPkgowner());
        setupEps(_epsMap, new EpsUmlversion(), columnUmlversion());
        setupEps(_epsMap, new EpsUsedtd(), columnUsedtd());
        setupEps(_epsMap, new EpsLogxml(), columnLogxml());
        setupEps(_epsMap, new EpsCodepath(), columnCodepath());
        setupEps(_epsMap, new EpsNamespace(), columnNamespace());
        setupEps(_epsMap, new EpsTpos(), columnTpos());
        setupEps(_epsMap, new EpsPackageflags(), columnPackageflags());
        setupEps(_epsMap, new EpsBatchsave(), columnBatchsave());
        setupEps(_epsMap, new EpsBatchload(), columnBatchload());
    }

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TPackage)entity, value); }

    public static class EpsPackageId implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setPackageId((java.lang.Integer)v); } }
    public static class EpsName implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setName((String)v); } }
    public static class EpsParentId implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setParentId((java.lang.Integer)v); } }
    public static class EpsCreateddate implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setCreateddate((java.sql.Timestamp)v); } }
    public static class EpsModifieddate implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setModifieddate((java.sql.Timestamp)v); } }
    public static class EpsNotes implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setNotes((String)v); } }
    public static class EpsEaGuid implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setEaGuid((String)v); } }
    public static class EpsXmlpath implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setXmlpath((String)v); } }
    public static class EpsIscontrolled implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setIscontrolled((Boolean)v); } }
    public static class EpsLastloaddate implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setLastloaddate((java.sql.Timestamp)v); } }
    public static class EpsLastsavedate implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setLastsavedate((java.sql.Timestamp)v); } }
    public static class EpsVersion implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setVersion((String)v); } }
    public static class EpsPkgowner implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setPkgowner((String)v); } }
    public static class EpsUmlversion implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setUmlversion((String)v); } }
    public static class EpsUsedtd implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setUsedtd((Boolean)v); } }
    public static class EpsLogxml implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setLogxml((Boolean)v); } }
    public static class EpsCodepath implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setCodepath((String)v); } }
    public static class EpsNamespace implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setNamespace((String)v); } }
    public static class EpsTpos implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setTpos((java.lang.Integer)v); } }
    public static class EpsPackageflags implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setPackageflags((String)v); } }
    public static class EpsBatchsave implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setBatchsave((java.lang.Integer)v); } }
    public static class EpsBatchload implements Eps<TPackage>
    { public void setup(TPackage e, Object v) { e.setBatchload((java.lang.Integer)v); } }
}
