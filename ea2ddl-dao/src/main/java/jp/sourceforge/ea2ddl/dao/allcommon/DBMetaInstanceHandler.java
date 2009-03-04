package jp.sourceforge.ea2ddl.dao.allcommon;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.exception.DBMetaNotFoundException;
import org.seasar.dbflute.helper.StringKeyMap;
import org.seasar.dbflute.util.DfAssertUtil;

/**
 * The handler of the instance of DB meta.
 * @author DBFlute(AutoGenerator)
 */
public class DBMetaInstanceHandler implements DBMetaProvider {

    // ===================================================================================
    //                                                                        Resource Map
    //                                                                        ============
    /** Table DB-name instance map. */
    protected static final Map<String, DBMeta> _tableDbNameInstanceMap = newConcurrentHashMap();

    /** The map of table DB name and class name. This is for initialization. */
    protected static final Map<String, String> _tableDbNameClassNameMap;
    static {
        final Map<String, String> tmpMap = newConcurrentHashMap();
        tmpMap.put("t_attribute", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TAttributeDbm");
        tmpMap.put("t_attributeconstraints", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TAttributeconstraintsDbm");
        tmpMap.put("t_attributetag", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TAttributetagDbm");
        tmpMap.put("t_authors", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TAuthorsDbm");
        tmpMap.put("t_cardinality", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TCardinalityDbm");
        tmpMap.put("t_category", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TCategoryDbm");
        tmpMap.put("t_clients", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TClientsDbm");
        tmpMap.put("t_complexitytypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TComplexitytypesDbm");
        tmpMap.put("t_connector", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TConnectorDbm");
        tmpMap.put("t_connectorconstraint", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TConnectorconstraintDbm");
        tmpMap.put("t_connectortag", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TConnectortagDbm");
        tmpMap.put("t_connectortypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TConnectortypesDbm");
        tmpMap.put("t_constants", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TConstantsDbm");
        tmpMap.put("t_constrainttypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TConstrainttypesDbm");
        tmpMap.put("t_datatypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TDatatypesDbm");
        tmpMap.put("t_diagram", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TDiagramDbm");
        tmpMap.put("t_diagramlinks", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TDiagramlinksDbm");
        tmpMap.put("t_diagramobjects", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TDiagramobjectsDbm");
        tmpMap.put("t_diagramtypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TDiagramtypesDbm");
        tmpMap.put("t_document", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TDocumentDbm");
        tmpMap.put("t_ecf", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TEcfDbm");
        tmpMap.put("t_efforttypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TEfforttypesDbm");
        tmpMap.put("t_files", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TFilesDbm");
        tmpMap.put("t_genopt", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TGenoptDbm");
        tmpMap.put("t_glossary", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TGlossaryDbm");
        tmpMap.put("t_html", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.THtmlDbm");
        tmpMap.put("t_image", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TImageDbm");
        tmpMap.put("t_implement", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TImplementDbm");
        tmpMap.put("t_issues", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TIssuesDbm");
        tmpMap.put("t_lists", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TListsDbm");
        tmpMap.put("t_mainttypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TMainttypesDbm");
        tmpMap.put("t_method", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TMethodDbm");
        tmpMap.put("t_metrictypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TMetrictypesDbm");
        tmpMap.put("t_object", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjectDbm");
        tmpMap.put("t_objectconstraint", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjectconstraintDbm");
        tmpMap.put("t_objecteffort", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjecteffortDbm");
        tmpMap.put("t_objectfiles", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjectfilesDbm");
        tmpMap.put("t_objectmetrics", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjectmetricsDbm");
        tmpMap.put("t_objectproblems", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjectproblemsDbm");
        tmpMap.put("t_objectproperties", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjectpropertiesDbm");
        tmpMap.put("t_objectrequires", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjectrequiresDbm");
        tmpMap.put("t_objectresource", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjectresourceDbm");
        tmpMap.put("t_objectrisks", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjectrisksDbm");
        tmpMap.put("t_objectscenarios", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjectscenariosDbm");
        tmpMap.put("t_objecttests", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjecttestsDbm");
        tmpMap.put("t_objecttrx", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjecttrxDbm");
        tmpMap.put("t_objecttypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TObjecttypesDbm");
        tmpMap.put("t_ocf", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TOcfDbm");
        tmpMap.put("t_operation", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TOperationDbm");
        tmpMap.put("t_operationparams", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TOperationparamsDbm");
        tmpMap.put("t_operationposts", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TOperationpostsDbm");
        tmpMap.put("t_operationpres", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TOperationpresDbm");
        tmpMap.put("t_operationtag", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TOperationtagDbm");
        tmpMap.put("t_package", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TPackageDbm");
        tmpMap.put("t_palette", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TPaletteDbm");
        tmpMap.put("t_paletteitem", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TPaletteitemDbm");
        tmpMap.put("t_phase", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TPhaseDbm");
        tmpMap.put("t_primitives", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TPrimitivesDbm");
        tmpMap.put("t_problemtypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TProblemtypesDbm");
        tmpMap.put("t_projectroles", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TProjectrolesDbm");
        tmpMap.put("t_propertytypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TPropertytypesDbm");
        tmpMap.put("t_requiretypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TRequiretypesDbm");
        tmpMap.put("t_resources", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TResourcesDbm");
        tmpMap.put("t_risktypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TRisktypesDbm");
        tmpMap.put("t_roleconstraint", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TRoleconstraintDbm");
        tmpMap.put("t_rtf", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TRtfDbm");
        tmpMap.put("t_rtfreport", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TRtfreportDbm");
        tmpMap.put("t_rules", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TRulesDbm");
        tmpMap.put("t_scenariotypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TScenariotypesDbm");
        tmpMap.put("t_script", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TScriptDbm");
        tmpMap.put("t_secgroup", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TSecgroupDbm");
        tmpMap.put("t_secgrouppermission", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TSecgrouppermissionDbm");
        tmpMap.put("t_seclocks", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TSeclocksDbm");
        tmpMap.put("t_secpermission", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TSecpermissionDbm");
        tmpMap.put("t_secpolicies", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TSecpoliciesDbm");
        tmpMap.put("t_secuser", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TSecuserDbm");
        tmpMap.put("t_secusergroup", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TSecusergroupDbm");
        tmpMap.put("t_secuserpermission", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TSecuserpermissionDbm");
        tmpMap.put("t_snapshot", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TSnapshotDbm");
        tmpMap.put("t_statustypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TStatustypesDbm");
        tmpMap.put("t_stereotypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TStereotypesDbm");
        tmpMap.put("t_taggedvalue", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TTaggedvalueDbm");
        tmpMap.put("t_tasks", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TTasksDbm");
        tmpMap.put("t_tcf", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TTcfDbm");
        tmpMap.put("t_template", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TTemplateDbm");
        tmpMap.put("t_testclass", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TTestclassDbm");
        tmpMap.put("t_testplans", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TTestplansDbm");
        tmpMap.put("t_testtypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TTesttypesDbm");
        tmpMap.put("t_trxtypes", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TTrxtypesDbm");
        tmpMap.put("t_umlpattern", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TUmlpatternDbm");
        tmpMap.put("t_version", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TVersionDbm");
        tmpMap.put("t_xref", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TXrefDbm");
        tmpMap.put("t_xrefsystem", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TXrefsystemDbm");
        tmpMap.put("t_xrefuser", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.TXrefuserDbm");
        tmpMap.put("usys_system", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.UsysSystemDbm");
        tmpMap.put("usysOldTables", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.UsysoldtablesDbm");
        tmpMap.put("usysQueries", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.UsysqueriesDbm");
        tmpMap.put("usysTables", "jp.sourceforge.ea2ddl.dao.bsentity.dbmeta.UsystablesDbm");
        _tableDbNameClassNameMap = Collections.unmodifiableMap(tmpMap);
    }

    /** The flexible map of table DB name. This is for conversion at finding. */
    protected static final Map<String, String> _tableDbNameFlexibleMap = StringKeyMap.createAsFlexibleConcurrent();
    static {
        final Set<String> tableDbNameSet = _tableDbNameClassNameMap.keySet();
        for (String tableDbName : tableDbNameSet) {
            _tableDbNameFlexibleMap.put(tableDbName, tableDbName);
        }
    }

    /**
     * @return The initialized map that contains all instances of DB meta. (NotNull & NotEmpty)
     */
    public static Map<String, DBMeta> getDBMetaMap() {
        initializeDBMetaMap();
        return _tableDbNameInstanceMap;
    }

    /**
     * Initialize the map of DB meta.
     */
    protected static void initializeDBMetaMap() {
        if (isInitialized()) {
            return;
        }
        final Set<String> tableDbNameSet = _tableDbNameClassNameMap.keySet();
        for (String tableDbName : tableDbNameSet) {
            findDBMeta(tableDbName); // Initialize!
        }
        if (!isInitialized()) {
            String msg = "Failed to initialize tableDbNameInstanceMap:";
            msg = msg + " tableDbNameInstanceMap=" + _tableDbNameInstanceMap;
            throw new IllegalStateException(msg);
        }
    }

    protected static boolean isInitialized() {
        return _tableDbNameInstanceMap.size() == _tableDbNameClassNameMap.size();
    }

    // ===================================================================================
    //                                                                         Main Method
    //                                                                         ===========
    /**
     * Find DB meta by table flexible name.
     * <pre>
     * If the table name is 'ORDER_DETAIL', you can find the DB meta by ...(as follows)
     *     'ORDER_DETAIL', 'ORDer_DeTAiL', 'order_detail'
     *     , 'OrderDetail', 'orderdetail', 'oRderDetaIl'
     * </pre>
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @exception ${glPackageBaseCommonException}.${glDBMetaNotFoundException} When the DB meta is not found.
     */
    public static DBMeta findDBMeta(String tableFlexibleName) {
        DBMeta dbmeta = byTableFlexibleName(tableFlexibleName);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the table flexible name: " + tableFlexibleName;
            msg = msg + " key=" + tableFlexibleName + " instanceMap=" + _tableDbNameInstanceMap;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (Nullable: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableFlexibleName(String tableFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        final int dotLastIndex = tableFlexibleName.lastIndexOf(".");
        if (dotLastIndex >= 0) {
            tableFlexibleName = tableFlexibleName.substring(dotLastIndex + ".".length());
        }
        final String tableDbName = _tableDbNameFlexibleMap.get(tableFlexibleName);
        if (tableDbName != null) {
            return byTableDbName(tableDbName);
        }
        return null;
    }

    /**
     * @param tableDbName The DB name of table. (NotNull)
     * @return The instance of DB meta. (Nullable: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableDbName(String tableDbName) {
        assertStringNotNullAndNotTrimmedEmpty("tableDbName", tableDbName);
        return getCachedDBMeta(tableDbName);
    }
    
    protected static DBMeta getCachedDBMeta(String tableName) {// For lazy-load! Thank you koyak!
        if (_tableDbNameInstanceMap.containsKey(tableName)) {
            return _tableDbNameInstanceMap.get(tableName);
        }
        synchronized (_tableDbNameInstanceMap) {
            if (_tableDbNameInstanceMap.containsKey(tableName)) {
                return _tableDbNameInstanceMap.get(tableName);
            }
            String entityName = _tableDbNameClassNameMap.get(tableName);
            _tableDbNameInstanceMap.put(tableName, getDBMeta(entityName));
        }
        return _tableDbNameInstanceMap.get(tableName);
    }

    protected static DBMeta getDBMeta(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            Method methoz = clazz.getMethod("getInstance", (Class[])null);
            Object result = methoz.invoke(null, (Object[])null);
            return (DBMeta)result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ===================================================================================
    //                                                             Provider Implementation
    //                                                             =======================
    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (Nullable: If the DB meta is not found, it returns null)
     */
    public DBMeta provideDBMeta(String tableFlexibleName) {
        return byTableFlexibleName(tableFlexibleName);
    }

    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @exception ${glPackageBaseCommonException}.${glDBMetaNotFoundException} When the DB meta is not found.
     */
    public DBMeta provideDBMetaChecked(String tableFlexibleName) {
        return findDBMeta(tableFlexibleName);
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected static <KEY, VALUE> ConcurrentHashMap<KEY, VALUE> newConcurrentHashMap() {
        return new ConcurrentHashMap<KEY, VALUE>();
    }

    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    protected static void assertObjectNotNull(String variableName, Object value) {
        DfAssertUtil.assertObjectNotNull(variableName, value);
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    protected static void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        DfAssertUtil.assertStringNotNullAndNotTrimmedEmpty(variableName, value);
    }
}
