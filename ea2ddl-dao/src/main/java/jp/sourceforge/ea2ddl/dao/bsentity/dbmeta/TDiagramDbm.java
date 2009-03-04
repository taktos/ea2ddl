package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.helper.StringKeyMap;
import jp.sourceforge.ea2ddl.dao.exentity.TDiagram;

/**
 * The DB meta of t_diagram. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TDiagramDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
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
    protected ColumnInfo _columnDiagramId = cci("Diagram_ID", null, "diagramId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnPackageId = cci("Package_ID", null, "packageId", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnParentid = cci("ParentID", null, "parentid", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnDiagramType = cci("Diagram_Type", null, "diagramType", String.class, false, false, 50, 0);
    protected ColumnInfo _columnName = cci("Name", null, "name", String.class, false, false, 255, 0);
    protected ColumnInfo _columnVersion = cci("Version", null, "version", String.class, false, false, 50, 0);
    protected ColumnInfo _columnAuthor = cci("Author", null, "author", String.class, false, false, 255, 0);
    protected ColumnInfo _columnShowdetails = cci("ShowDetails", null, "showdetails", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnNotes = cci("Notes", null, "notes", String.class, false, false, 2147483647, 0);
    protected ColumnInfo _columnStereotype = cci("Stereotype", null, "stereotype", String.class, false, false, 50, 0);
    protected ColumnInfo _columnAttpub = cci("AttPub", null, "attpub", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnAttpri = cci("AttPri", null, "attpri", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnAttpro = cci("AttPro", null, "attpro", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnOrientation = cci("Orientation", null, "orientation", String.class, false, false, 1, 0);
    protected ColumnInfo _columnCx = cci("cx", null, "cx", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnCy = cci("cy", null, "cy", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnScale = cci("Scale", null, "scale", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnCreateddate = cci("CreatedDate", null, "createddate", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnModifieddate = cci("ModifiedDate", null, "modifieddate", java.sql.Timestamp.class, false, false, null, null);
    protected ColumnInfo _columnHtmlpath = cci("HTMLPath", null, "htmlpath", String.class, false, false, 255, 0);
    protected ColumnInfo _columnShowforeign = cci("ShowForeign", null, "showforeign", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnShowborder = cci("ShowBorder", null, "showborder", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnShowpackagecontents = cci("ShowPackageContents", null, "showpackagecontents", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnPdata = cci("PDATA", null, "pdata", String.class, false, false, 255, 0);
    protected ColumnInfo _columnLocked = cci("Locked", null, "locked", Boolean.class, false, false, null, null);
    protected ColumnInfo _columnEaGuid = cci("ea_guid", null, "eaGuid", String.class, false, false, 40, 0);
    protected ColumnInfo _columnTpos = cci("TPos", null, "tpos", java.lang.Integer.class, false, false, null, null);
    protected ColumnInfo _columnSwimlanes = cci("Swimlanes", null, "swimlanes", String.class, false, false, 255, 0);
    protected ColumnInfo _columnStyleex = cci("StyleEx", null, "styleex", String.class, false, false, 2147483647, 0);

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
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap)
    { doAcceptPrimaryKeyMap((TDiagram)entity, primaryKeyMap, _epsMap); }
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString)
    { MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity); }
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap)
    { doAcceptColumnValueMap((TDiagram)entity, columnValueMap, _epsMap); }
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
    protected Map<String, Eps<TDiagram>> _epsMap = StringKeyMap.createAsFlexibleConcurrent();
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

    public boolean hasEntityPropertySetupper(String propertyName) { return _epsMap.containsKey(propertyName); }
    public void setupEntityProperty(String propertyName, Object entity, Object value)
    { findEps(_epsMap, propertyName).setup((TDiagram)entity, value); }

    public static class EpsDiagramId implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setDiagramId((java.lang.Integer)v); } }
    public static class EpsPackageId implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setPackageId((java.lang.Integer)v); } }
    public static class EpsParentid implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setParentid((java.lang.Integer)v); } }
    public static class EpsDiagramType implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setDiagramType((String)v); } }
    public static class EpsName implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setName((String)v); } }
    public static class EpsVersion implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setVersion((String)v); } }
    public static class EpsAuthor implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setAuthor((String)v); } }
    public static class EpsShowdetails implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setShowdetails((java.lang.Integer)v); } }
    public static class EpsNotes implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setNotes((String)v); } }
    public static class EpsStereotype implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setStereotype((String)v); } }
    public static class EpsAttpub implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setAttpub((Boolean)v); } }
    public static class EpsAttpri implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setAttpri((Boolean)v); } }
    public static class EpsAttpro implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setAttpro((Boolean)v); } }
    public static class EpsOrientation implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setOrientation((String)v); } }
    public static class EpsCx implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setCx((java.lang.Integer)v); } }
    public static class EpsCy implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setCy((java.lang.Integer)v); } }
    public static class EpsScale implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setScale((java.lang.Integer)v); } }
    public static class EpsCreateddate implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setCreateddate((java.sql.Timestamp)v); } }
    public static class EpsModifieddate implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setModifieddate((java.sql.Timestamp)v); } }
    public static class EpsHtmlpath implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setHtmlpath((String)v); } }
    public static class EpsShowforeign implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setShowforeign((Boolean)v); } }
    public static class EpsShowborder implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setShowborder((Boolean)v); } }
    public static class EpsShowpackagecontents implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setShowpackagecontents((Boolean)v); } }
    public static class EpsPdata implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setPdata((String)v); } }
    public static class EpsLocked implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setLocked((Boolean)v); } }
    public static class EpsEaGuid implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setEaGuid((String)v); } }
    public static class EpsTpos implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setTpos((java.lang.Integer)v); } }
    public static class EpsSwimlanes implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setSwimlanes((String)v); } }
    public static class EpsStyleex implements Eps<TDiagram>
    { public void setup(TDiagram e, Object v) { e.setStyleex((String)v); } }
}
