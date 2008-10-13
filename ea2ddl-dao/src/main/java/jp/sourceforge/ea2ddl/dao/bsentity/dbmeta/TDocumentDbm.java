package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TDocument;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_document. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TDocumentDbm extends AbstractDBMeta {

    private static final TDocumentDbm _instance = new TDocumentDbm();
    private TDocumentDbm() {}
    public static TDocumentDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_document"; }
    public String getTablePropertyName() { return "TDocument"; }
    public String getTableSqlName() { return "t_document"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnDocid = cci("DocID", "docid", String.class, false, 40, 0);
    protected ColumnInfo _columnDocname = cci("DocName", "docname", String.class, false, 100, 0);
    protected ColumnInfo _columnNotes = cci("Notes", "notes", String.class, false, 255, 0);
    protected ColumnInfo _columnStyle = cci("Style", "style", String.class, false, 255, 0);
    protected ColumnInfo _columnElementid = cci("ElementID", "elementid", String.class, false, 40, 0);
    protected ColumnInfo _columnElementtype = cci("ElementType", "elementtype", String.class, false, 50, 0);
    protected ColumnInfo _columnStrcontent = cci("StrContent", "strcontent", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnBincontent = cci("BinContent", "bincontent", byte[].class, false, null, null);
    protected ColumnInfo _columnDoctype = cci("DocType", "doctype", String.class, false, 100, 0);
    protected ColumnInfo _columnAuthor = cci("Author", "author", String.class, false, 255, 0);
    protected ColumnInfo _columnVersion = cci("Version", "version", String.class, false, 50, 0);
    protected ColumnInfo _columnIsactive = cci("IsActive", "isactive", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnSequence = cci("Sequence", "sequence", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnDocdate = cci("DocDate", "docdate", java.sql.Timestamp.class, false, null, null);

    public ColumnInfo columnDocid() { return _columnDocid; }
    public ColumnInfo columnDocname() { return _columnDocname; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnStyle() { return _columnStyle; }
    public ColumnInfo columnElementid() { return _columnElementid; }
    public ColumnInfo columnElementtype() { return _columnElementtype; }
    public ColumnInfo columnStrcontent() { return _columnStrcontent; }
    public ColumnInfo columnBincontent() { return _columnBincontent; }
    public ColumnInfo columnDoctype() { return _columnDoctype; }
    public ColumnInfo columnAuthor() { return _columnAuthor; }
    public ColumnInfo columnVersion() { return _columnVersion; }
    public ColumnInfo columnIsactive() { return _columnIsactive; }
    public ColumnInfo columnSequence() { return _columnSequence; }
    public ColumnInfo columnDocdate() { return _columnDocdate; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TDocument"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TDocumentCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TDocumentDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TDocumentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TDocument> getEntityType() { return TDocument.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TDocument newMyEntity() { return new TDocument(); }

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
		doAcceptPrimaryKeyMap((TDocument)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TDocument)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TDocument>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsDocid(), columnDocid());
        setupEps(_epsMap, new EpsDocname(), columnDocname());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsStyle(), columnStyle());
        setupEps(_epsMap, new EpsElementid(), columnElementid());
        setupEps(_epsMap, new EpsElementtype(), columnElementtype());
        setupEps(_epsMap, new EpsStrcontent(), columnStrcontent());
        setupEps(_epsMap, new EpsBincontent(), columnBincontent());
        setupEps(_epsMap, new EpsDoctype(), columnDoctype());
        setupEps(_epsMap, new EpsAuthor(), columnAuthor());
        setupEps(_epsMap, new EpsVersion(), columnVersion());
        setupEps(_epsMap, new EpsIsactive(), columnIsactive());
        setupEps(_epsMap, new EpsSequence(), columnSequence());
        setupEps(_epsMap, new EpsDocdate(), columnDocdate());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TDocument)entity, value);
    }
    
    public static class EpsDocid implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setDocid((String)v); }
    }
    public static class EpsDocname implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setDocname((String)v); }
    }
    public static class EpsNotes implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setNotes((String)v); }
    }
    public static class EpsStyle implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setStyle((String)v); }
    }
    public static class EpsElementid implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setElementid((String)v); }
    }
    public static class EpsElementtype implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setElementtype((String)v); }
    }
    public static class EpsStrcontent implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setStrcontent((String)v); }
    }
    public static class EpsBincontent implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setBincontent((byte[])v); }
    }
    public static class EpsDoctype implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setDoctype((String)v); }
    }
    public static class EpsAuthor implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setAuthor((String)v); }
    }
    public static class EpsVersion implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setVersion((String)v); }
    }
    public static class EpsIsactive implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setIsactive((java.lang.Integer)v); }
    }
    public static class EpsSequence implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setSequence((java.lang.Integer)v); }
    }
    public static class EpsDocdate implements Eps<TDocument> {
        public void setup(TDocument e, Object v) { e.setDocdate((java.sql.Timestamp)v); }
    }
}
