package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TObject;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_object. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TObjectDbm extends AbstractDBMeta {

    private static final TObjectDbm _instance = new TObjectDbm();
    private TObjectDbm() {}
    public static TObjectDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_object"; }
    public String getTablePropertyName() { return "TObject"; }
    public String getTableSqlName() { return "t_object"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnObjectId = cci("Object_ID", "objectId", java.lang.Integer.class, true, null, null);
    protected ColumnInfo _columnObjectType = cci("Object_Type", "objectType", String.class, false, 255, 0);
    protected ColumnInfo _columnDiagramId = cci("Diagram_ID", "diagramId", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnName = cci("Name", "name", String.class, false, 255, 0);
    protected ColumnInfo _columnAlias = cci("Alias", "alias", String.class, false, 255, 0);
    protected ColumnInfo _columnAuthor = cci("Author", "author", String.class, false, 255, 0);
    protected ColumnInfo _columnVersion = cci("Version", "version", String.class, false, 50, 0);
    protected ColumnInfo _columnNote = cci("Note", "note", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnPackageId = cci("Package_ID", "packageId", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnStereotype = cci("Stereotype", "stereotype", String.class, false, 255, 0);
    protected ColumnInfo _columnNtype = cci("NType", "ntype", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnComplexity = cci("Complexity", "complexity", String.class, false, 50, 0);
    protected ColumnInfo _columnEffort = cci("Effort", "effort", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnStyle = cci("Style", "style", String.class, false, 255, 0);
    protected ColumnInfo _columnBackcolor = cci("Backcolor", "backcolor", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnBorderstyle = cci("BorderStyle", "borderstyle", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnBorderwidth = cci("BorderWidth", "borderwidth", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnFontcolor = cci("Fontcolor", "fontcolor", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnBordercolor = cci("Bordercolor", "bordercolor", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnCreateddate = cci("CreatedDate", "createddate", java.sql.Timestamp.class, false, null, null);
    protected ColumnInfo _columnModifieddate = cci("ModifiedDate", "modifieddate", java.sql.Timestamp.class, false, null, null);
    protected ColumnInfo _columnStatus = cci("Status", "status", String.class, false, 50, 0);
    protected ColumnInfo _columnTagged = cci("Tagged", "tagged", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnPdata1 = cci("PDATA1", "pdata1", String.class, false, 255, 0);
    protected ColumnInfo _columnPdata2 = cci("PDATA2", "pdata2", String.class, false, 255, 0);
    protected ColumnInfo _columnPdata3 = cci("PDATA3", "pdata3", String.class, false, 255, 0);
    protected ColumnInfo _columnPdata4 = cci("PDATA4", "pdata4", String.class, false, 255, 0);
    protected ColumnInfo _columnPdata5 = cci("PDATA5", "pdata5", String.class, false, 255, 0);
    protected ColumnInfo _columnConcurrency = cci("Concurrency", "concurrency", String.class, false, 50, 0);
    protected ColumnInfo _columnVisibility = cci("Visibility", "visibility", String.class, false, 50, 0);
    protected ColumnInfo _columnPersistence = cci("Persistence", "persistence", String.class, false, 50, 0);
    protected ColumnInfo _columnCardinality = cci("Cardinality", "cardinality", String.class, false, 50, 0);
    protected ColumnInfo _columnGentype = cci("GenType", "gentype", String.class, false, 50, 0);
    protected ColumnInfo _columnGenfile = cci("GenFile", "genfile", String.class, false, 255, 0);
    protected ColumnInfo _columnHeader1 = cci("Header1", "header1", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnHeader2 = cci("Header2", "header2", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnPhase = cci("Phase", "phase", String.class, false, 50, 0);
    protected ColumnInfo _columnScope = cci("Scope", "scope", String.class, false, 25, 0);
    protected ColumnInfo _columnGenoption = cci("GenOption", "genoption", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnGenlinks = cci("GenLinks", "genlinks", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnClassifier = cci("Classifier", "classifier", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnEaGuid = cci("ea_guid", "eaGuid", String.class, false, 40, 0);
    protected ColumnInfo _columnParentid = cci("ParentID", "parentid", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnRunstate = cci("RunState", "runstate", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnClassifierGuid = cci("Classifier_guid", "classifierGuid", String.class, false, 40, 0);
    protected ColumnInfo _columnTpos = cci("TPos", "tpos", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnIsroot = cci("IsRoot", "isroot", Boolean.class, false, null, null);
    protected ColumnInfo _columnIsleaf = cci("IsLeaf", "isleaf", Boolean.class, false, null, null);
    protected ColumnInfo _columnIsspec = cci("IsSpec", "isspec", Boolean.class, false, null, null);
    protected ColumnInfo _columnIsactive = cci("IsActive", "isactive", Boolean.class, false, null, null);
    protected ColumnInfo _columnStateflags = cci("StateFlags", "stateflags", String.class, false, 255, 0);
    protected ColumnInfo _columnPackageflags = cci("PackageFlags", "packageflags", String.class, false, 255, 0);
    protected ColumnInfo _columnMultiplicity = cci("Multiplicity", "multiplicity", String.class, false, 50, 0);
    protected ColumnInfo _columnStyleex = cci("StyleEx", "styleex", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnActionflags = cci("ActionFlags", "actionflags", String.class, false, 255, 0);
    protected ColumnInfo _columnEventflags = cci("EventFlags", "eventflags", String.class, false, 255, 0);

    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnObjectType() { return _columnObjectType; }
    public ColumnInfo columnDiagramId() { return _columnDiagramId; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnAlias() { return _columnAlias; }
    public ColumnInfo columnAuthor() { return _columnAuthor; }
    public ColumnInfo columnVersion() { return _columnVersion; }
    public ColumnInfo columnNote() { return _columnNote; }
    public ColumnInfo columnPackageId() { return _columnPackageId; }
    public ColumnInfo columnStereotype() { return _columnStereotype; }
    public ColumnInfo columnNtype() { return _columnNtype; }
    public ColumnInfo columnComplexity() { return _columnComplexity; }
    public ColumnInfo columnEffort() { return _columnEffort; }
    public ColumnInfo columnStyle() { return _columnStyle; }
    public ColumnInfo columnBackcolor() { return _columnBackcolor; }
    public ColumnInfo columnBorderstyle() { return _columnBorderstyle; }
    public ColumnInfo columnBorderwidth() { return _columnBorderwidth; }
    public ColumnInfo columnFontcolor() { return _columnFontcolor; }
    public ColumnInfo columnBordercolor() { return _columnBordercolor; }
    public ColumnInfo columnCreateddate() { return _columnCreateddate; }
    public ColumnInfo columnModifieddate() { return _columnModifieddate; }
    public ColumnInfo columnStatus() { return _columnStatus; }
    public ColumnInfo columnTagged() { return _columnTagged; }
    public ColumnInfo columnPdata1() { return _columnPdata1; }
    public ColumnInfo columnPdata2() { return _columnPdata2; }
    public ColumnInfo columnPdata3() { return _columnPdata3; }
    public ColumnInfo columnPdata4() { return _columnPdata4; }
    public ColumnInfo columnPdata5() { return _columnPdata5; }
    public ColumnInfo columnConcurrency() { return _columnConcurrency; }
    public ColumnInfo columnVisibility() { return _columnVisibility; }
    public ColumnInfo columnPersistence() { return _columnPersistence; }
    public ColumnInfo columnCardinality() { return _columnCardinality; }
    public ColumnInfo columnGentype() { return _columnGentype; }
    public ColumnInfo columnGenfile() { return _columnGenfile; }
    public ColumnInfo columnHeader1() { return _columnHeader1; }
    public ColumnInfo columnHeader2() { return _columnHeader2; }
    public ColumnInfo columnPhase() { return _columnPhase; }
    public ColumnInfo columnScope() { return _columnScope; }
    public ColumnInfo columnGenoption() { return _columnGenoption; }
    public ColumnInfo columnGenlinks() { return _columnGenlinks; }
    public ColumnInfo columnClassifier() { return _columnClassifier; }
    public ColumnInfo columnEaGuid() { return _columnEaGuid; }
    public ColumnInfo columnParentid() { return _columnParentid; }
    public ColumnInfo columnRunstate() { return _columnRunstate; }
    public ColumnInfo columnClassifierGuid() { return _columnClassifierGuid; }
    public ColumnInfo columnTpos() { return _columnTpos; }
    public ColumnInfo columnIsroot() { return _columnIsroot; }
    public ColumnInfo columnIsleaf() { return _columnIsleaf; }
    public ColumnInfo columnIsspec() { return _columnIsspec; }
    public ColumnInfo columnIsactive() { return _columnIsactive; }
    public ColumnInfo columnStateflags() { return _columnStateflags; }
    public ColumnInfo columnPackageflags() { return _columnPackageflags; }
    public ColumnInfo columnMultiplicity() { return _columnMultiplicity; }
    public ColumnInfo columnStyleex() { return _columnStyleex; }
    public ColumnInfo columnActionflags() { return _columnActionflags; }
    public ColumnInfo columnEventflags() { return _columnEventflags; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TObject"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TObjectCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TObjectDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TObjectBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TObject> getEntityType() { return TObject.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TObject newMyEntity() { return new TObject(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return createPrimaryUniqueInfo(columnObjectId()); }
    public boolean hasPrimaryKey() { return true; }
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
    public ReferrerInfo referrerTObjectpropertiesList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnObjectId(), TObjectpropertiesDbm.getInstance().columnObjectId());
	    return cri("TObjectpropertiesList", this, TObjectpropertiesDbm.getInstance(), map, false);
    }
    public ReferrerInfo referrerTAttributeList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnObjectId(), TAttributeDbm.getInstance().columnObjectId());
	    return cri("TAttributeList", this, TAttributeDbm.getInstance(), map, false);
    }
    public ReferrerInfo referrerTOperationList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnObjectId(), TOperationDbm.getInstance().columnObjectId());
	    return cri("TOperationList", this, TOperationDbm.getInstance(), map, false);
    }
    public ReferrerInfo referrerTConnectorByStartObjectIdList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnObjectId(), TConnectorDbm.getInstance().columnStartObjectId());
	    return cri("TConnectorByStartObjectIdList", this, TConnectorDbm.getInstance(), map, false);
    }
    public ReferrerInfo referrerTConnectorByEndObjectIdList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnObjectId(), TConnectorDbm.getInstance().columnEndObjectId());
	    return cri("TConnectorByEndObjectIdList", this, TConnectorDbm.getInstance(), map, false);
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
		doAcceptPrimaryKeyMap((TObject)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TObject)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TObject>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsObjectType(), columnObjectType());
        setupEps(_epsMap, new EpsDiagramId(), columnDiagramId());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsAlias(), columnAlias());
        setupEps(_epsMap, new EpsAuthor(), columnAuthor());
        setupEps(_epsMap, new EpsVersion(), columnVersion());
        setupEps(_epsMap, new EpsNote(), columnNote());
        setupEps(_epsMap, new EpsPackageId(), columnPackageId());
        setupEps(_epsMap, new EpsStereotype(), columnStereotype());
        setupEps(_epsMap, new EpsNtype(), columnNtype());
        setupEps(_epsMap, new EpsComplexity(), columnComplexity());
        setupEps(_epsMap, new EpsEffort(), columnEffort());
        setupEps(_epsMap, new EpsStyle(), columnStyle());
        setupEps(_epsMap, new EpsBackcolor(), columnBackcolor());
        setupEps(_epsMap, new EpsBorderstyle(), columnBorderstyle());
        setupEps(_epsMap, new EpsBorderwidth(), columnBorderwidth());
        setupEps(_epsMap, new EpsFontcolor(), columnFontcolor());
        setupEps(_epsMap, new EpsBordercolor(), columnBordercolor());
        setupEps(_epsMap, new EpsCreateddate(), columnCreateddate());
        setupEps(_epsMap, new EpsModifieddate(), columnModifieddate());
        setupEps(_epsMap, new EpsStatus(), columnStatus());
        setupEps(_epsMap, new EpsTagged(), columnTagged());
        setupEps(_epsMap, new EpsPdata1(), columnPdata1());
        setupEps(_epsMap, new EpsPdata2(), columnPdata2());
        setupEps(_epsMap, new EpsPdata3(), columnPdata3());
        setupEps(_epsMap, new EpsPdata4(), columnPdata4());
        setupEps(_epsMap, new EpsPdata5(), columnPdata5());
        setupEps(_epsMap, new EpsConcurrency(), columnConcurrency());
        setupEps(_epsMap, new EpsVisibility(), columnVisibility());
        setupEps(_epsMap, new EpsPersistence(), columnPersistence());
        setupEps(_epsMap, new EpsCardinality(), columnCardinality());
        setupEps(_epsMap, new EpsGentype(), columnGentype());
        setupEps(_epsMap, new EpsGenfile(), columnGenfile());
        setupEps(_epsMap, new EpsHeader1(), columnHeader1());
        setupEps(_epsMap, new EpsHeader2(), columnHeader2());
        setupEps(_epsMap, new EpsPhase(), columnPhase());
        setupEps(_epsMap, new EpsScope(), columnScope());
        setupEps(_epsMap, new EpsGenoption(), columnGenoption());
        setupEps(_epsMap, new EpsGenlinks(), columnGenlinks());
        setupEps(_epsMap, new EpsClassifier(), columnClassifier());
        setupEps(_epsMap, new EpsEaGuid(), columnEaGuid());
        setupEps(_epsMap, new EpsParentid(), columnParentid());
        setupEps(_epsMap, new EpsRunstate(), columnRunstate());
        setupEps(_epsMap, new EpsClassifierGuid(), columnClassifierGuid());
        setupEps(_epsMap, new EpsTpos(), columnTpos());
        setupEps(_epsMap, new EpsIsroot(), columnIsroot());
        setupEps(_epsMap, new EpsIsleaf(), columnIsleaf());
        setupEps(_epsMap, new EpsIsspec(), columnIsspec());
        setupEps(_epsMap, new EpsIsactive(), columnIsactive());
        setupEps(_epsMap, new EpsStateflags(), columnStateflags());
        setupEps(_epsMap, new EpsPackageflags(), columnPackageflags());
        setupEps(_epsMap, new EpsMultiplicity(), columnMultiplicity());
        setupEps(_epsMap, new EpsStyleex(), columnStyleex());
        setupEps(_epsMap, new EpsActionflags(), columnActionflags());
        setupEps(_epsMap, new EpsEventflags(), columnEventflags());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TObject)entity, value);
    }
    
    public static class EpsObjectId implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setObjectId((java.lang.Integer)v); }
    }
    public static class EpsObjectType implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setObjectType((String)v); }
    }
    public static class EpsDiagramId implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setDiagramId((java.lang.Integer)v); }
    }
    public static class EpsName implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setName((String)v); }
    }
    public static class EpsAlias implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setAlias((String)v); }
    }
    public static class EpsAuthor implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setAuthor((String)v); }
    }
    public static class EpsVersion implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setVersion((String)v); }
    }
    public static class EpsNote implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setNote((String)v); }
    }
    public static class EpsPackageId implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setPackageId((java.lang.Integer)v); }
    }
    public static class EpsStereotype implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setStereotype((String)v); }
    }
    public static class EpsNtype implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setNtype((java.lang.Integer)v); }
    }
    public static class EpsComplexity implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setComplexity((String)v); }
    }
    public static class EpsEffort implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setEffort((java.lang.Integer)v); }
    }
    public static class EpsStyle implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setStyle((String)v); }
    }
    public static class EpsBackcolor implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setBackcolor((java.lang.Integer)v); }
    }
    public static class EpsBorderstyle implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setBorderstyle((java.lang.Integer)v); }
    }
    public static class EpsBorderwidth implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setBorderwidth((java.lang.Integer)v); }
    }
    public static class EpsFontcolor implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setFontcolor((java.lang.Integer)v); }
    }
    public static class EpsBordercolor implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setBordercolor((java.lang.Integer)v); }
    }
    public static class EpsCreateddate implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setCreateddate((java.sql.Timestamp)v); }
    }
    public static class EpsModifieddate implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setModifieddate((java.sql.Timestamp)v); }
    }
    public static class EpsStatus implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setStatus((String)v); }
    }
    public static class EpsTagged implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setTagged((java.lang.Integer)v); }
    }
    public static class EpsPdata1 implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setPdata1((String)v); }
    }
    public static class EpsPdata2 implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setPdata2((String)v); }
    }
    public static class EpsPdata3 implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setPdata3((String)v); }
    }
    public static class EpsPdata4 implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setPdata4((String)v); }
    }
    public static class EpsPdata5 implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setPdata5((String)v); }
    }
    public static class EpsConcurrency implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setConcurrency((String)v); }
    }
    public static class EpsVisibility implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setVisibility((String)v); }
    }
    public static class EpsPersistence implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setPersistence((String)v); }
    }
    public static class EpsCardinality implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setCardinality((String)v); }
    }
    public static class EpsGentype implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setGentype((String)v); }
    }
    public static class EpsGenfile implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setGenfile((String)v); }
    }
    public static class EpsHeader1 implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setHeader1((String)v); }
    }
    public static class EpsHeader2 implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setHeader2((String)v); }
    }
    public static class EpsPhase implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setPhase((String)v); }
    }
    public static class EpsScope implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setScope((String)v); }
    }
    public static class EpsGenoption implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setGenoption((String)v); }
    }
    public static class EpsGenlinks implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setGenlinks((String)v); }
    }
    public static class EpsClassifier implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setClassifier((java.lang.Integer)v); }
    }
    public static class EpsEaGuid implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setEaGuid((String)v); }
    }
    public static class EpsParentid implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setParentid((java.lang.Integer)v); }
    }
    public static class EpsRunstate implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setRunstate((String)v); }
    }
    public static class EpsClassifierGuid implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setClassifierGuid((String)v); }
    }
    public static class EpsTpos implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setTpos((java.lang.Integer)v); }
    }
    public static class EpsIsroot implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setIsroot((Boolean)v); }
    }
    public static class EpsIsleaf implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setIsleaf((Boolean)v); }
    }
    public static class EpsIsspec implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setIsspec((Boolean)v); }
    }
    public static class EpsIsactive implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setIsactive((Boolean)v); }
    }
    public static class EpsStateflags implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setStateflags((String)v); }
    }
    public static class EpsPackageflags implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setPackageflags((String)v); }
    }
    public static class EpsMultiplicity implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setMultiplicity((String)v); }
    }
    public static class EpsStyleex implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setStyleex((String)v); }
    }
    public static class EpsActionflags implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setActionflags((String)v); }
    }
    public static class EpsEventflags implements Eps<TObject> {
        public void setup(TObject e, Object v) { e.setEventflags((String)v); }
    }
}
