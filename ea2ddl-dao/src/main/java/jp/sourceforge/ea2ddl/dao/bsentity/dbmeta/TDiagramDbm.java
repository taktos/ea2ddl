package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TDiagram;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_diagram. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TDiagramDbm extends AbstractDBMeta {

    private static final TDiagramDbm _instance = new TDiagramDbm();
    private TDiagramDbm() {}
    public static TDiagramDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_diagram"; }
    public String getTablePropertyName() { return "TDiagram"; }
    public String getTableSqlName() { return "t_diagram"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnDiagramId = cci("Diagram_ID", "diagramId", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnPackageId = cci("Package_ID", "packageId", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnParentid = cci("ParentID", "parentid", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnDiagramType = cci("Diagram_Type", "diagramType", String.class, false, 50, 0);
    protected ColumnInfo _columnName = cci("Name", "name", String.class, false, 255, 0);
    protected ColumnInfo _columnVersion = cci("Version", "version", String.class, false, 50, 0);
    protected ColumnInfo _columnAuthor = cci("Author", "author", String.class, false, 255, 0);
    protected ColumnInfo _columnShowdetails = cci("ShowDetails", "showdetails", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnNotes = cci("Notes", "notes", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnStereotype = cci("Stereotype", "stereotype", String.class, false, 50, 0);
    protected ColumnInfo _columnAttpub = cci("AttPub", "attpub", Boolean.class, false, null, null);
    protected ColumnInfo _columnAttpri = cci("AttPri", "attpri", Boolean.class, false, null, null);
    protected ColumnInfo _columnAttpro = cci("AttPro", "attpro", Boolean.class, false, null, null);
    protected ColumnInfo _columnOrientation = cci("Orientation", "orientation", String.class, false, 1, 0);
    protected ColumnInfo _columnCx = cci("cx", "cx", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnCy = cci("cy", "cy", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnScale = cci("Scale", "scale", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnCreateddate = cci("CreatedDate", "createddate", java.sql.Timestamp.class, false, null, null);
    protected ColumnInfo _columnModifieddate = cci("ModifiedDate", "modifieddate", java.sql.Timestamp.class, false, null, null);
    protected ColumnInfo _columnHtmlpath = cci("HTMLPath", "htmlpath", String.class, false, 255, 0);
    protected ColumnInfo _columnShowforeign = cci("ShowForeign", "showforeign", Boolean.class, false, null, null);
    protected ColumnInfo _columnShowborder = cci("ShowBorder", "showborder", Boolean.class, false, null, null);
    protected ColumnInfo _columnShowpackagecontents = cci("ShowPackageContents", "showpackagecontents", Boolean.class, false, null, null);
    protected ColumnInfo _columnPdata = cci("PDATA", "pdata", String.class, false, 255, 0);
    protected ColumnInfo _columnLocked = cci("Locked", "locked", Boolean.class, false, null, null);
    protected ColumnInfo _columnEaGuid = cci("ea_guid", "eaGuid", String.class, false, 40, 0);
    protected ColumnInfo _columnTpos = cci("TPos", "tpos", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnSwimlanes = cci("Swimlanes", "swimlanes", String.class, false, 255, 0);
    protected ColumnInfo _columnStyleex = cci("StyleEx", "styleex", String.class, false, 2147483647, 0);

    public ColumnInfo columnDiagramId() { return _columnDiagramId; }
    public ColumnInfo columnPackageId() { return _columnPackageId; }
    public ColumnInfo columnParentid() { return _columnParentid; }
    public ColumnInfo columnDiagramType() { return _columnDiagramType; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnVersion() { return _columnVersion; }
    public ColumnInfo columnAuthor() { return _columnAuthor; }
    public ColumnInfo columnShowdetails() { return _columnShowdetails; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnStereotype() { return _columnStereotype; }
    public ColumnInfo columnAttpub() { return _columnAttpub; }
    public ColumnInfo columnAttpri() { return _columnAttpri; }
    public ColumnInfo columnAttpro() { return _columnAttpro; }
    public ColumnInfo columnOrientation() { return _columnOrientation; }
    public ColumnInfo columnCx() { return _columnCx; }
    public ColumnInfo columnCy() { return _columnCy; }
    public ColumnInfo columnScale() { return _columnScale; }
    public ColumnInfo columnCreateddate() { return _columnCreateddate; }
    public ColumnInfo columnModifieddate() { return _columnModifieddate; }
    public ColumnInfo columnHtmlpath() { return _columnHtmlpath; }
    public ColumnInfo columnShowforeign() { return _columnShowforeign; }
    public ColumnInfo columnShowborder() { return _columnShowborder; }
    public ColumnInfo columnShowpackagecontents() { return _columnShowpackagecontents; }
    public ColumnInfo columnPdata() { return _columnPdata; }
    public ColumnInfo columnLocked() { return _columnLocked; }
    public ColumnInfo columnEaGuid() { return _columnEaGuid; }
    public ColumnInfo columnTpos() { return _columnTpos; }
    public ColumnInfo columnSwimlanes() { return _columnSwimlanes; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TDiagram"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TDiagramCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TDiagramDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TDiagramBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TDiagram> getEntityType() { return TDiagram.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TDiagram newMyEntity() { return new TDiagram(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() {
        throw new UnsupportedOperationException("The table doen not have primary key: " + getTableDbName());
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
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap) {
		doAcceptPrimaryKeyMap((TDiagram)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TDiagram)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TDiagram>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsDiagramId(), columnDiagramId());
        setupEps(_epsMap, new EpsPackageId(), columnPackageId());
        setupEps(_epsMap, new EpsParentid(), columnParentid());
        setupEps(_epsMap, new EpsDiagramType(), columnDiagramType());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsVersion(), columnVersion());
        setupEps(_epsMap, new EpsAuthor(), columnAuthor());
        setupEps(_epsMap, new EpsShowdetails(), columnShowdetails());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsStereotype(), columnStereotype());
        setupEps(_epsMap, new EpsAttpub(), columnAttpub());
        setupEps(_epsMap, new EpsAttpri(), columnAttpri());
        setupEps(_epsMap, new EpsAttpro(), columnAttpro());
        setupEps(_epsMap, new EpsOrientation(), columnOrientation());
        setupEps(_epsMap, new EpsCx(), columnCx());
        setupEps(_epsMap, new EpsCy(), columnCy());
        setupEps(_epsMap, new EpsScale(), columnScale());
        setupEps(_epsMap, new EpsCreateddate(), columnCreateddate());
        setupEps(_epsMap, new EpsModifieddate(), columnModifieddate());
        setupEps(_epsMap, new EpsHtmlpath(), columnHtmlpath());
        setupEps(_epsMap, new EpsShowforeign(), columnShowforeign());
        setupEps(_epsMap, new EpsShowborder(), columnShowborder());
        setupEps(_epsMap, new EpsShowpackagecontents(), columnShowpackagecontents());
        setupEps(_epsMap, new EpsPdata(), columnPdata());
        setupEps(_epsMap, new EpsLocked(), columnLocked());
        setupEps(_epsMap, new EpsEaGuid(), columnEaGuid());
        setupEps(_epsMap, new EpsTpos(), columnTpos());
        setupEps(_epsMap, new EpsSwimlanes(), columnSwimlanes());
        setupEps(_epsMap, new EpsStyleex(), columnStyleex());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TDiagram)entity, value);
    }
    
    public static class EpsDiagramId implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setDiagramId((java.lang.Integer)v); }
    }
    public static class EpsPackageId implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setPackageId((java.lang.Integer)v); }
    }
    public static class EpsParentid implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setParentid((java.lang.Integer)v); }
    }
    public static class EpsDiagramType implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setDiagramType((String)v); }
    }
    public static class EpsName implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setName((String)v); }
    }
    public static class EpsVersion implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setVersion((String)v); }
    }
    public static class EpsAuthor implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setAuthor((String)v); }
    }
    public static class EpsShowdetails implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setShowdetails((java.lang.Integer)v); }
    }
    public static class EpsNotes implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setNotes((String)v); }
    }
    public static class EpsStereotype implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setStereotype((String)v); }
    }
    public static class EpsAttpub implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setAttpub((Boolean)v); }
    }
    public static class EpsAttpri implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setAttpri((Boolean)v); }
    }
    public static class EpsAttpro implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setAttpro((Boolean)v); }
    }
    public static class EpsOrientation implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setOrientation((String)v); }
    }
    public static class EpsCx implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setCx((java.lang.Integer)v); }
    }
    public static class EpsCy implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setCy((java.lang.Integer)v); }
    }
    public static class EpsScale implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setScale((java.lang.Integer)v); }
    }
    public static class EpsCreateddate implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setCreateddate((java.sql.Timestamp)v); }
    }
    public static class EpsModifieddate implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setModifieddate((java.sql.Timestamp)v); }
    }
    public static class EpsHtmlpath implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setHtmlpath((String)v); }
    }
    public static class EpsShowforeign implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setShowforeign((Boolean)v); }
    }
    public static class EpsShowborder implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setShowborder((Boolean)v); }
    }
    public static class EpsShowpackagecontents implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setShowpackagecontents((Boolean)v); }
    }
    public static class EpsPdata implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setPdata((String)v); }
    }
    public static class EpsLocked implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setLocked((Boolean)v); }
    }
    public static class EpsEaGuid implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setEaGuid((String)v); }
    }
    public static class EpsTpos implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setTpos((java.lang.Integer)v); }
    }
    public static class EpsSwimlanes implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setSwimlanes((String)v); }
    }
    public static class EpsStyleex implements Eps<TDiagram> {
        public void setup(TDiagram e, Object v) { e.setStyleex((String)v); }
    }
}
