package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TAttribute;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_attribute. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TAttributeDbm extends AbstractDBMeta {

    private static final TAttributeDbm _instance = new TAttributeDbm();
    private TAttributeDbm() {}
    public static TAttributeDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_attribute"; }
    public String getTablePropertyName() { return "TAttribute"; }
    public String getTableSqlName() { return "t_attribute"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnObjectId = cci("Object_ID", "objectId", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnName = cci("Name", "name", String.class, false, 255, 0);
    protected ColumnInfo _columnScope = cci("Scope", "scope", String.class, false, 50, 0);
    protected ColumnInfo _columnStereotype = cci("Stereotype", "stereotype", String.class, false, 50, 0);
    protected ColumnInfo _columnContainment = cci("Containment", "containment", String.class, false, 50, 0);
    protected ColumnInfo _columnIsstatic = cci("IsStatic", "isstatic", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnIscollection = cci("IsCollection", "iscollection", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnIsordered = cci("IsOrdered", "isordered", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnAllowduplicates = cci("AllowDuplicates", "allowduplicates", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnLowerbound = cci("LowerBound", "lowerbound", String.class, false, 50, 0);
    protected ColumnInfo _columnUpperbound = cci("UpperBound", "upperbound", String.class, false, 50, 0);
    protected ColumnInfo _columnContainer = cci("Container", "container", String.class, false, 50, 0);
    protected ColumnInfo _columnNotes = cci("Notes", "notes", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnDerived = cci("Derived", "derived", String.class, false, 1, 0);
    protected ColumnInfo _columnId = cci("ID", "id", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnPos = cci("Pos", "pos", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnGenoption = cci("GenOption", "genoption", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnLength = cci("Length", "length", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnPrecision = cci("Precision", "precision", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnScale = cci("Scale", "scale", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnStyle = cci("Style", "style", String.class, false, 255, 0);
    protected ColumnInfo _columnClassifier = cci("Classifier", "classifier", String.class, false, 50, 0);
    protected ColumnInfo _columnType = cci("Type", "type", String.class, false, 255, 0);
    protected ColumnInfo _columnEaGuid = cci("ea_guid", "eaGuid", String.class, false, 50, 0);
    protected ColumnInfo _columnStyleex = cci("StyleEx", "styleex", String.class, false, 2147483647, 0);

    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnScope() { return _columnScope; }
    public ColumnInfo columnStereotype() { return _columnStereotype; }
    public ColumnInfo columnContainment() { return _columnContainment; }
    public ColumnInfo columnIsstatic() { return _columnIsstatic; }
    public ColumnInfo columnIscollection() { return _columnIscollection; }
    public ColumnInfo columnIsordered() { return _columnIsordered; }
    public ColumnInfo columnAllowduplicates() { return _columnAllowduplicates; }
    public ColumnInfo columnLowerbound() { return _columnLowerbound; }
    public ColumnInfo columnUpperbound() { return _columnUpperbound; }
    public ColumnInfo columnContainer() { return _columnContainer; }
    public ColumnInfo columnNotes() { return _columnNotes; }
    public ColumnInfo columnDerived() { return _columnDerived; }
    public ColumnInfo columnId() { return _columnId; }
    public ColumnInfo columnPos() { return _columnPos; }
    public ColumnInfo columnGenoption() { return _columnGenoption; }
    public ColumnInfo columnLength() { return _columnLength; }
    public ColumnInfo columnPrecision() { return _columnPrecision; }
    public ColumnInfo columnScale() { return _columnScale; }
    public ColumnInfo columnStyle() { return _columnStyle; }
    public ColumnInfo columnClassifier() { return _columnClassifier; }
    public ColumnInfo columnType() { return _columnType; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TAttribute"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TAttributeCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TAttributeDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TAttributeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TAttribute> getEntityType() { return TAttribute.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TAttribute newMyEntity() { return new TAttribute(); }

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
    public ForeignInfo foreignTObject() {
		Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnObjectId(), TObjectDbm.getInstance().columnObjectId());
	    return cfi("TObject", this, TObjectDbm.getInstance(), map, 0, false);
    }

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
		doAcceptPrimaryKeyMap((TAttribute)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TAttribute)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TAttribute>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsName(), columnName());
        setupEps(_epsMap, new EpsScope(), columnScope());
        setupEps(_epsMap, new EpsStereotype(), columnStereotype());
        setupEps(_epsMap, new EpsContainment(), columnContainment());
        setupEps(_epsMap, new EpsIsstatic(), columnIsstatic());
        setupEps(_epsMap, new EpsIscollection(), columnIscollection());
        setupEps(_epsMap, new EpsIsordered(), columnIsordered());
        setupEps(_epsMap, new EpsAllowduplicates(), columnAllowduplicates());
        setupEps(_epsMap, new EpsLowerbound(), columnLowerbound());
        setupEps(_epsMap, new EpsUpperbound(), columnUpperbound());
        setupEps(_epsMap, new EpsContainer(), columnContainer());
        setupEps(_epsMap, new EpsNotes(), columnNotes());
        setupEps(_epsMap, new EpsDerived(), columnDerived());
        setupEps(_epsMap, new EpsId(), columnId());
        setupEps(_epsMap, new EpsPos(), columnPos());
        setupEps(_epsMap, new EpsGenoption(), columnGenoption());
        setupEps(_epsMap, new EpsLength(), columnLength());
        setupEps(_epsMap, new EpsPrecision(), columnPrecision());
        setupEps(_epsMap, new EpsScale(), columnScale());
        setupEps(_epsMap, new EpsStyle(), columnStyle());
        setupEps(_epsMap, new EpsClassifier(), columnClassifier());
        setupEps(_epsMap, new EpsType(), columnType());
        setupEps(_epsMap, new EpsEaGuid(), columnEaGuid());
        setupEps(_epsMap, new EpsStyleex(), columnStyleex());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TAttribute)entity, value);
    }
    
    public static class EpsObjectId implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setObjectId((java.lang.Integer)v); }
    }
    public static class EpsName implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setName((String)v); }
    }
    public static class EpsScope implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setScope((String)v); }
    }
    public static class EpsStereotype implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setStereotype((String)v); }
    }
    public static class EpsContainment implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setContainment((String)v); }
    }
    public static class EpsIsstatic implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setIsstatic((java.lang.Integer)v); }
    }
    public static class EpsIscollection implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setIscollection((java.lang.Integer)v); }
    }
    public static class EpsIsordered implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setIsordered((java.lang.Integer)v); }
    }
    public static class EpsAllowduplicates implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setAllowduplicates((java.lang.Integer)v); }
    }
    public static class EpsLowerbound implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setLowerbound((String)v); }
    }
    public static class EpsUpperbound implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setUpperbound((String)v); }
    }
    public static class EpsContainer implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setContainer((String)v); }
    }
    public static class EpsNotes implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setNotes((String)v); }
    }
    public static class EpsDerived implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setDerived((String)v); }
    }
    public static class EpsId implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setId((java.lang.Integer)v); }
    }
    public static class EpsPos implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setPos((java.lang.Integer)v); }
    }
    public static class EpsGenoption implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setGenoption((String)v); }
    }
    public static class EpsLength implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setLength((java.lang.Integer)v); }
    }
    public static class EpsPrecision implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setPrecision((java.lang.Integer)v); }
    }
    public static class EpsScale implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setScale((java.lang.Integer)v); }
    }
    public static class EpsStyle implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setStyle((String)v); }
    }
    public static class EpsClassifier implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setClassifier((String)v); }
    }
    public static class EpsType implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setType((String)v); }
    }
    public static class EpsEaGuid implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setEaGuid((String)v); }
    }
    public static class EpsStyleex implements Eps<TAttribute> {
        public void setup(TAttribute e, Object v) { e.setStyleex((String)v); }
    }
}
