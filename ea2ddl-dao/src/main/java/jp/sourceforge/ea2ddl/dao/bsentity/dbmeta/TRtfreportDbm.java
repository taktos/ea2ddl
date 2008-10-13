package jp.sourceforge.ea2ddl.dao.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.AbstractDBMeta;
import jp.sourceforge.ea2ddl.dao.exentity.TRtfreport;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.*;

/**
 * The DB meta of t_rtfreport. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TRtfreportDbm extends AbstractDBMeta {

    private static final TRtfreportDbm _instance = new TRtfreportDbm();
    private TRtfreportDbm() {}
    public static TRtfreportDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "t_rtfreport"; }
    public String getTablePropertyName() { return "TRtfreport"; }
    public String getTableSqlName() { return "t_rtfreport"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected ColumnInfo _columnTemplateid = cci("TemplateID", "templateid", String.class, false, 200, 0);
    protected ColumnInfo _columnRootpackage = cci("RootPackage", "rootpackage", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnFilename = cci("Filename", "filename", String.class, false, 255, 0);
    protected ColumnInfo _columnDetails = cci("Details", "details", Boolean.class, false, null, null);
    protected ColumnInfo _columnProcesschildren = cci("ProcessChildren", "processchildren", Boolean.class, false, null, null);
    protected ColumnInfo _columnShowdiagrams = cci("ShowDiagrams", "showdiagrams", Boolean.class, false, null, null);
    protected ColumnInfo _columnHeading = cci("Heading", "heading", String.class, false, 255, 0);
    protected ColumnInfo _columnRequirements = cci("Requirements", "requirements", Boolean.class, false, null, null);
    protected ColumnInfo _columnAssociations = cci("Associations", "associations", Boolean.class, false, null, null);
    protected ColumnInfo _columnScenarios = cci("Scenarios", "scenarios", Boolean.class, false, null, null);
    protected ColumnInfo _columnChilddiagrams = cci("ChildDiagrams", "childdiagrams", Boolean.class, false, null, null);
    protected ColumnInfo _columnAttributes = cci("Attributes", "attributes", Boolean.class, false, null, null);
    protected ColumnInfo _columnMethods = cci("Methods", "methods", Boolean.class, false, null, null);
    protected ColumnInfo _columnImagetype = cci("ImageType", "imagetype", java.lang.Integer.class, false, null, null);
    protected ColumnInfo _columnPaging = cci("Paging", "paging", Boolean.class, false, null, null);
    protected ColumnInfo _columnIntro = cci("Intro", "intro", String.class, false, 2147483647, 0);
    protected ColumnInfo _columnResources = cci("Resources", "resources", Boolean.class, false, null, null);
    protected ColumnInfo _columnConstraints = cci("Constraints", "constraints", Boolean.class, false, null, null);
    protected ColumnInfo _columnTagged = cci("Tagged", "tagged", Boolean.class, false, null, null);
    protected ColumnInfo _columnShowtag = cci("ShowTag", "showtag", Boolean.class, false, null, null);
    protected ColumnInfo _columnShowalias = cci("ShowAlias", "showalias", Boolean.class, false, null, null);
    protected ColumnInfo _columnPdata1 = cci("PDATA1", "pdata1", String.class, false, 255, 0);
    protected ColumnInfo _columnPdata2 = cci("PDATA2", "pdata2", String.class, false, 255, 0);
    protected ColumnInfo _columnPdata3 = cci("PDATA3", "pdata3", String.class, false, 255, 0);
    protected ColumnInfo _columnPdata4 = cci("PDATA4", "pdata4", String.class, false, 2147483647, 0);

    public ColumnInfo columnTemplateid() { return _columnTemplateid; }
    public ColumnInfo columnRootpackage() { return _columnRootpackage; }
    public ColumnInfo columnFilename() { return _columnFilename; }
    public ColumnInfo columnDetails() { return _columnDetails; }
    public ColumnInfo columnProcesschildren() { return _columnProcesschildren; }
    public ColumnInfo columnShowdiagrams() { return _columnShowdiagrams; }
    public ColumnInfo columnHeading() { return _columnHeading; }
    public ColumnInfo columnRequirements() { return _columnRequirements; }
    public ColumnInfo columnAssociations() { return _columnAssociations; }
    public ColumnInfo columnScenarios() { return _columnScenarios; }
    public ColumnInfo columnChilddiagrams() { return _columnChilddiagrams; }
    public ColumnInfo columnAttributes() { return _columnAttributes; }
    public ColumnInfo columnMethods() { return _columnMethods; }
    public ColumnInfo columnImagetype() { return _columnImagetype; }
    public ColumnInfo columnPaging() { return _columnPaging; }
    public ColumnInfo columnIntro() { return _columnIntro; }
    public ColumnInfo columnResources() { return _columnResources; }
    public ColumnInfo columnConstraints() { return _columnConstraints; }
    public ColumnInfo columnTagged() { return _columnTagged; }
    public ColumnInfo columnShowtag() { return _columnShowtag; }
    public ColumnInfo columnShowalias() { return _columnShowalias; }
    public ColumnInfo columnPdata1() { return _columnPdata1; }
    public ColumnInfo columnPdata2() { return _columnPdata2; }
    public ColumnInfo columnPdata3() { return _columnPdata3; }
    public ColumnInfo columnPdata4() { return _columnPdata4; }
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
    public String getEntityTypeName() { return "jp.sourceforge.ea2ddl.dao.exentity.TRtfreport"; }
    public String getConditionBeanTypeName() { return "jp.sourceforge.ea2ddl.dao.cbean.bs.TRtfreportCB"; }
    public String getDaoTypeName() { return "jp.sourceforge.ea2ddl.dao.exdao.TRtfreportDao"; }
    public String getBehaviorTypeName() { return "jp.sourceforge.ea2ddl.dao.exbhv.TRtfreportBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TRtfreport> getEntityType() { return TRtfreport.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public TRtfreport newMyEntity() { return new TRtfreport(); }

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
		doAcceptPrimaryKeyMap((TRtfreport)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((TRtfreport)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<TRtfreport>> _epsMap = newHashMap();
    {
        setupEps(_epsMap, new EpsTemplateid(), columnTemplateid());
        setupEps(_epsMap, new EpsRootpackage(), columnRootpackage());
        setupEps(_epsMap, new EpsFilename(), columnFilename());
        setupEps(_epsMap, new EpsDetails(), columnDetails());
        setupEps(_epsMap, new EpsProcesschildren(), columnProcesschildren());
        setupEps(_epsMap, new EpsShowdiagrams(), columnShowdiagrams());
        setupEps(_epsMap, new EpsHeading(), columnHeading());
        setupEps(_epsMap, new EpsRequirements(), columnRequirements());
        setupEps(_epsMap, new EpsAssociations(), columnAssociations());
        setupEps(_epsMap, new EpsScenarios(), columnScenarios());
        setupEps(_epsMap, new EpsChilddiagrams(), columnChilddiagrams());
        setupEps(_epsMap, new EpsAttributes(), columnAttributes());
        setupEps(_epsMap, new EpsMethods(), columnMethods());
        setupEps(_epsMap, new EpsImagetype(), columnImagetype());
        setupEps(_epsMap, new EpsPaging(), columnPaging());
        setupEps(_epsMap, new EpsIntro(), columnIntro());
        setupEps(_epsMap, new EpsResources(), columnResources());
        setupEps(_epsMap, new EpsConstraints(), columnConstraints());
        setupEps(_epsMap, new EpsTagged(), columnTagged());
        setupEps(_epsMap, new EpsShowtag(), columnShowtag());
        setupEps(_epsMap, new EpsShowalias(), columnShowalias());
        setupEps(_epsMap, new EpsPdata1(), columnPdata1());
        setupEps(_epsMap, new EpsPdata2(), columnPdata2());
        setupEps(_epsMap, new EpsPdata3(), columnPdata3());
        setupEps(_epsMap, new EpsPdata4(), columnPdata4());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((TRtfreport)entity, value);
    }
    
    public static class EpsTemplateid implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setTemplateid((String)v); }
    }
    public static class EpsRootpackage implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setRootpackage((java.lang.Integer)v); }
    }
    public static class EpsFilename implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setFilename((String)v); }
    }
    public static class EpsDetails implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setDetails((Boolean)v); }
    }
    public static class EpsProcesschildren implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setProcesschildren((Boolean)v); }
    }
    public static class EpsShowdiagrams implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setShowdiagrams((Boolean)v); }
    }
    public static class EpsHeading implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setHeading((String)v); }
    }
    public static class EpsRequirements implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setRequirements((Boolean)v); }
    }
    public static class EpsAssociations implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setAssociations((Boolean)v); }
    }
    public static class EpsScenarios implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setScenarios((Boolean)v); }
    }
    public static class EpsChilddiagrams implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setChilddiagrams((Boolean)v); }
    }
    public static class EpsAttributes implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setAttributes((Boolean)v); }
    }
    public static class EpsMethods implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setMethods((Boolean)v); }
    }
    public static class EpsImagetype implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setImagetype((java.lang.Integer)v); }
    }
    public static class EpsPaging implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setPaging((Boolean)v); }
    }
    public static class EpsIntro implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setIntro((String)v); }
    }
    public static class EpsResources implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setResources((Boolean)v); }
    }
    public static class EpsConstraints implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setConstraints((Boolean)v); }
    }
    public static class EpsTagged implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setTagged((Boolean)v); }
    }
    public static class EpsShowtag implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setShowtag((Boolean)v); }
    }
    public static class EpsShowalias implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setShowalias((Boolean)v); }
    }
    public static class EpsPdata1 implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setPdata1((String)v); }
    }
    public static class EpsPdata2 implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setPdata2((String)v); }
    }
    public static class EpsPdata3 implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setPdata3((String)v); }
    }
    public static class EpsPdata4 implements Eps<TRtfreport> {
        public void setup(TRtfreport e, Object v) { e.setPdata4((String)v); }
    }
}
