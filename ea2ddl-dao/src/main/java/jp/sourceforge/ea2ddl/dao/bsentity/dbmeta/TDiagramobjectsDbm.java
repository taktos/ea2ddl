package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TDiagramobjects;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_diagramobjects. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TDiagramobjectsDbm extends AbstractDBMeta {

    private static final TDiagramobjectsDbm _instance = new TDiagramobjectsDbm();
    private TDiagramobjectsDbm() {}
    public static TDiagramobjectsDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_diagramobjects"; }
    public String getTablePropertyName() { return "TDiagramobjects"; }
    public String getTableSqlName() { return "t_diagramobjects"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnDiagramId = cci("Diagram_ID", "diagramId", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnObjectId = cci("Object_ID", "objectId", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnRecttop = cci("RectTop", "recttop", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnRectleft = cci("RectLeft", "rectleft", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnRectright = cci("RectRight", "rectright", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnRectbottom = cci("RectBottom", "rectbottom", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnSequence = cci("Sequence", "sequence", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnObjectstyle = cci("ObjectStyle", "objectstyle", String.class, false, 255, 0);
    protected ColumnInfo _columnInstanceId = cci("Instance_ID", "instanceId", java.lang.Integer.class, false, null, null);

    public ColumnInfo columnDiagramId() { return _columnDiagramId; }
    public ColumnInfo columnObjectId() { return _columnObjectId; }
    public ColumnInfo columnRecttop() { return _columnRecttop; }
    public ColumnInfo columnRectleft() { return _columnRectleft; }
    public ColumnInfo columnRectright() { return _columnRectright; }
    public ColumnInfo columnRectbottom() { return _columnRectbottom; }
    public ColumnInfo columnSequence() { return _columnSequence; }
    public ColumnInfo columnObjectstyle() { return _columnObjectstyle; }
    public ColumnInfo columnInstanceId() { return _columnInstanceId; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TDiagramobjects"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TDiagramobjectsCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TDiagramobjectsDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TDiagramobjectsBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TDiagramobjects> getEntityType() { return TDiagramobjects.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TDiagramobjects newMyEntity() { return new TDiagramobjects(); }

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
		doAcceptPrimaryKeyMap((TDiagramobjects)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TDiagramobjects)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TDiagramobjects>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsDiagramId(), columnDiagramId());
        setupEps(_epsMap, new EpsObjectId(), columnObjectId());
        setupEps(_epsMap, new EpsRecttop(), columnRecttop());
        setupEps(_epsMap, new EpsRectleft(), columnRectleft());
        setupEps(_epsMap, new EpsRectright(), columnRectright());
        setupEps(_epsMap, new EpsRectbottom(), columnRectbottom());
        setupEps(_epsMap, new EpsSequence(), columnSequence());
        setupEps(_epsMap, new EpsObjectstyle(), columnObjectstyle());
        setupEps(_epsMap, new EpsInstanceId(), columnInstanceId());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TDiagramobjects)entity, value);
    }
    
    public static class EpsDiagramId implements Eps<TDiagramobjects> {
        public void setup(TDiagramobjects e, Object v) { e.setDiagramId((java.lang.Integer)v); }
    }
    public static class EpsObjectId implements Eps<TDiagramobjects> {
        public void setup(TDiagramobjects e, Object v) { e.setObjectId((java.lang.Integer)v); }
    }
    public static class EpsRecttop implements Eps<TDiagramobjects> {
        public void setup(TDiagramobjects e, Object v) { e.setRecttop((java.lang.Integer)v); }
    }
    public static class EpsRectleft implements Eps<TDiagramobjects> {
        public void setup(TDiagramobjects e, Object v) { e.setRectleft((java.lang.Integer)v); }
    }
    public static class EpsRectright implements Eps<TDiagramobjects> {
        public void setup(TDiagramobjects e, Object v) { e.setRectright((java.lang.Integer)v); }
    }
    public static class EpsRectbottom implements Eps<TDiagramobjects> {
        public void setup(TDiagramobjects e, Object v) { e.setRectbottom((java.lang.Integer)v); }
    }
    public static class EpsSequence implements Eps<TDiagramobjects> {
        public void setup(TDiagramobjects e, Object v) { e.setSequence((java.lang.Integer)v); }
    }
    public static class EpsObjectstyle implements Eps<TDiagramobjects> {
        public void setup(TDiagramobjects e, Object v) { e.setObjectstyle((String)v); }
    }
    public static class EpsInstanceId implements Eps<TDiagramobjects> {
        public void setup(TDiagramobjects e, Object v) { e.setInstanceId((java.lang.Integer)v); }
    }
}
