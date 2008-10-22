package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TOperation;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_operation. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TOperationDbm extends AbstractDBMeta {

    private static final TOperationDbm _instance = new TOperationDbm();
    private TOperationDbm() {}
    public static TOperationDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_operation"; }
    public String getTablePropertyName() { return "TOperation"; }
    public String getTableSqlName() { return "t_operation"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnOperationid = cci("OperationID", "operationid", java.lang.Integer.class, true, null, null);
    protected ColumnInfo _columnObjectId = cci("Object_ID", "objectId", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnName = cci("Name", "name", String.class, false, 255, 0);
    protected ColumnInfo _columnScope = cci("Scope", "scope", String.class, false, 50, 0);
    protected ColumnInfo _columnType = cci("Type", "type", String.class, false, 255, 0);
    protected ColumnInfo _columnReturnarray = cci("ReturnArray", "returnarray", String.class, false, 1, 0);
    protected ColumnInfo _columnStereotype = cci("Stereotype", "stereotype", String.class, false, 50, 0);
    protected ColumnInfo _columnIsstatic = cci("IsStatic", "isstatic", String.class, false, 1, 0);
    protected ColumnInfo _columnConcurrency = cci("Concurrency", "concurrency", String.class, false, 50, 0);
    protected ColumnInfo _columnNotes = cci("Notes", "notes", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnBehaviour = cci("Behaviour", "behaviour", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnGenoption = cci("GenOption", "genoption", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnPos = cci("Pos", "pos", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnStyle = cci("Style", "style", String.class, false, 255, 0);
    protected ColumnInfo _columnPure = cci("Pure", "pure", Boolean.class, false, null, null);
    protected ColumnInfo _columnClassifier = cci("Classifier", "classifier", String.class, false, 50, 0);
    protected ColumnInfo _columnCode = cci("Code", "code", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnIsroot = cci("IsRoot", "isroot", Boolean.class, false, null, null);
    protected ColumnInfo _columnIsleaf = cci("IsLeaf", "isleaf", Boolean.class, false, null, null);
    protected ColumnInfo _columnIsquery = cci("IsQuery", "isquery", Boolean.class, false, null, null);
    protected ColumnInfo _columnStateflags = cci("StateFlags", "stateflags", String.class, false, 255, 0);
    protected ColumnInfo _columnEaGuid = cci("ea_guid", "eaGuid", String.class, false, 50, 0);
    protected ColumnInfo _columnStyleex = cci("StyleEx", "styleex", String.class, false, 2147483647, 0);

    public ColumnInfo columnOperationid() { return _columnOperationid; }
    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnScope() { return _columnScope; }
    public ColumnInfo columnType() { return _columnType; }
    public ColumnInfo columnReturnarray() { return _columnReturnarray; }
    public ColumnInfo columnStereotype() { return _columnStereotype; }
    public ColumnInfo columnIsstatic() { return _columnIsstatic; }
    public ColumnInfo columnConcurrency() { return _columnConcurrency; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnBehaviour() { return _columnBehaviour; }
    public ColumnInfo columnGenoption() { return _columnGenoption; }
    public ColumnInfo columnPos() { return _columnPos; }
    public ColumnInfo columnStyle() { return _columnStyle; }
    public ColumnInfo columnPure() { return _columnPure; }
    public ColumnInfo columnClassifier() { return _columnClassifier; }
    public ColumnInfo columnCode() { return _columnCode; }
    public ColumnInfo columnIsroot() { return _columnIsroot; }
    public ColumnInfo columnIsleaf() { return _columnIsleaf; }
    public ColumnInfo columnIsquery() { return _columnIsquery; }
    public ColumnInfo columnStateflags() { return _columnStateflags; }
    public ColumnInfo columnEaGuid() { return _columnEaGuid; }
    public ColumnInfo columnStyleex() { return _columnStyleex; }
    { initializeColumnInfoList(); }

    // ===================================================================================
    //                                                                            Name Map
    //                                                                            ========
    public Map<String, String> getDbNamePropertyNameKeyToLowerMap() { return createDbNamePropertyNameKeyToLowerMap(); }
    public Map<String, String> getPropertyNameDbNameKeyToLowerMap() { return createPropertyNameDbNameKeyToLowerMap(); }
    protected static Map<String, String> _dbNamePropertyNameKeyToLowerMap;
    protected Map<String, String> createDbNamePropertyNameKeyToLowerMap() {
        if (_dbNamePropertyNameKeyToLowerMap == null) { _dbNamePropertyNameKeyToLowerMap = setupKeyToLowerMap(true); }
        return _dbNamePropertyNameKeyToLowerMap;
    }
    protected static Map<String, String> _propertyNameDbNameKeyToLowerMap;
    protected Map<String, String> createPropertyNameDbNameKeyToLowerMap() {
        if (_propertyNameDbNameKeyToLowerMap == null) { _propertyNameDbNameKeyToLowerMap = setupKeyToLowerMap(false); }
        return _propertyNameDbNameKeyToLowerMap;
    }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TOperation"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TOperationCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TOperationDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TOperationBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TOperation> getEntityType() { return TOperation.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TOperation newMyEntity() { return new TOperation(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return createPrimaryUniqueInfo(columnOperationid()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignTObject() {
		Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnObjectId(), TObjectDbm.getInstance().columnObjectId());
	    return cfi("TObject", this, TObjectDbm.getInstance(), map, 0, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerTOperationparamsList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnOperationid(), TOperationparamsDbm.getInstance().columnOperationid());
	    return cri("TOperationparamsList", this, TOperationparamsDbm.getInstance(), map, false);
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap) {
		doAcceptPrimaryKeyMap((TOperation)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TOperation)entity, columnValueMap, _epsMap);
    }

    public void acceptColumnValueMapString(Entity entity, String columnValueMapString) {
        MapStringUtil.acceptColumnValueMapString(columnValueMapString, entity);
    }

    // -----------------------------------------------------
    //                                               Extract
    //                                               -------
    public String extractPrimaryKeyMapString(Entity entity) { return MapStringUtil.extractPrimaryKeyMapString(entity); }
    public String extractPrimaryKeyMapString(Entity entity, String startBrace, String endBrace, String delimiter, String equal) {
        return doExtractPrimaryKeyMapString(entity, startBrace, endBrace, delimiter, equal);
    }
    public String extractColumnValueMapString(Entity entity) { return MapStringUtil.extractColumnValueMapString(entity); }
    public String extractColumnValueMapString(Entity entity, String startBrace, String endBrace, String delimiter, String equal) {
        return doExtractColumnValueMapString(entity, startBrace, endBrace, delimiter, equal);
    }

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
    protected Map<String, Eps<TOperation>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsOperationid(), columnOperationid());
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsScope(), columnScope());
        setupEps(_epsMap, new EpsType(), columnType());
        setupEps(_epsMap, new EpsReturnarray(), columnReturnarray());
        setupEps(_epsMap, new EpsStereotype(), columnStereotype());
        setupEps(_epsMap, new EpsIsstatic(), columnIsstatic());
        setupEps(_epsMap, new EpsConcurrency(), columnConcurrency());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsBehaviour(), columnBehaviour());
        setupEps(_epsMap, new EpsGenoption(), columnGenoption());
        setupEps(_epsMap, new EpsPos(), columnPos());
        setupEps(_epsMap, new EpsStyle(), columnStyle());
        setupEps(_epsMap, new EpsPure(), columnPure());
        setupEps(_epsMap, new EpsClassifier(), columnClassifier());
        setupEps(_epsMap, new EpsCode(), columnCode());
        setupEps(_epsMap, new EpsIsroot(), columnIsroot());
        setupEps(_epsMap, new EpsIsleaf(), columnIsleaf());
        setupEps(_epsMap, new EpsIsquery(), columnIsquery());
        setupEps(_epsMap, new EpsStateflags(), columnStateflags());
        setupEps(_epsMap, new EpsEaGuid(), columnEaGuid());
        setupEps(_epsMap, new EpsStyleex(), columnStyleex());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TOperation)entity, value);
    }
    
    public static class EpsOperationid implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setOperationid((java.lang.Integer)v); }
    }
    public static class EpsObjectId implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setObjectId((java.lang.Integer)v); }
    }
    public static class EpsName implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setName((String)v); }
    }
    public static class EpsScope implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setScope((String)v); }
    }
    public static class EpsType implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setType((String)v); }
    }
    public static class EpsReturnarray implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setReturnarray((String)v); }
    }
    public static class EpsStereotype implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setStereotype((String)v); }
    }
    public static class EpsIsstatic implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setIsstatic((String)v); }
    }
    public static class EpsConcurrency implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setConcurrency((String)v); }
    }
    public static class EpsNotes implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setNotes((String)v); }
    }
    public static class EpsBehaviour implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setBehaviour((String)v); }
    }
    public static class EpsGenoption implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setGenoption((String)v); }
    }
    public static class EpsPos implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setPos((java.lang.Integer)v); }
    }
    public static class EpsStyle implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setStyle((String)v); }
    }
    public static class EpsPure implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setPure((Boolean)v); }
    }
    public static class EpsClassifier implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setClassifier((String)v); }
    }
    public static class EpsCode implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setCode((String)v); }
    }
    public static class EpsIsroot implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setIsroot((Boolean)v); }
    }
    public static class EpsIsleaf implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setIsleaf((Boolean)v); }
    }
    public static class EpsIsquery implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setIsquery((Boolean)v); }
    }
    public static class EpsStateflags implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setStateflags((String)v); }
    }
    public static class EpsEaGuid implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setEaGuid((String)v); }
    }
    public static class EpsStyleex implements Eps<TOperation> {
        public void setup(TOperation e, Object v) { e.setStyleex((String)v); }
    }
}
