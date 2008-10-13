package jp.sourceforge.ea2ddl.dao.allcommon.dbmeta;

import java.util.Collections;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;

import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleAssertUtil;

/**
 * DBMeta instance handler.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class DBMetaInstanceHandler {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Table DB-name instance map. */
    protected static final Map<String, DBMeta> _tableDbNameInstanceMap = new LinkedHashMap<String, DBMeta>();

    /** The map of table DB-name and class name. */
    protected static final Map<String, String> _tableDbNameClassNameMap;
    static {
        Map<String, String> tmpMap = new LinkedHashMap<String, String>();

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

    /** The key-to-lower map of DB-name and property-name for table. */
    protected static final Map<String, String> _tableDbNamePropertyNameKeyToLowerMap;
    static {
        Map<String, String> tmpMap = new LinkedHashMap<String, String>();

        tmpMap.put("t_attribute".toLowerCase(), "TAttribute");
        tmpMap.put("t_attributeconstraints".toLowerCase(), "TAttributeconstraints");
        tmpMap.put("t_attributetag".toLowerCase(), "TAttributetag");
        tmpMap.put("t_authors".toLowerCase(), "TAuthors");
        tmpMap.put("t_cardinality".toLowerCase(), "TCardinality");
        tmpMap.put("t_category".toLowerCase(), "TCategory");
        tmpMap.put("t_clients".toLowerCase(), "TClients");
        tmpMap.put("t_complexitytypes".toLowerCase(), "TComplexitytypes");
        tmpMap.put("t_connector".toLowerCase(), "TConnector");
        tmpMap.put("t_connectorconstraint".toLowerCase(), "TConnectorconstraint");
        tmpMap.put("t_connectortag".toLowerCase(), "TConnectortag");
        tmpMap.put("t_connectortypes".toLowerCase(), "TConnectortypes");
        tmpMap.put("t_constants".toLowerCase(), "TConstants");
        tmpMap.put("t_constrainttypes".toLowerCase(), "TConstrainttypes");
        tmpMap.put("t_datatypes".toLowerCase(), "TDatatypes");
        tmpMap.put("t_diagram".toLowerCase(), "TDiagram");
        tmpMap.put("t_diagramlinks".toLowerCase(), "TDiagramlinks");
        tmpMap.put("t_diagramobjects".toLowerCase(), "TDiagramobjects");
        tmpMap.put("t_diagramtypes".toLowerCase(), "TDiagramtypes");
        tmpMap.put("t_document".toLowerCase(), "TDocument");
        tmpMap.put("t_ecf".toLowerCase(), "TEcf");
        tmpMap.put("t_efforttypes".toLowerCase(), "TEfforttypes");
        tmpMap.put("t_files".toLowerCase(), "TFiles");
        tmpMap.put("t_genopt".toLowerCase(), "TGenopt");
        tmpMap.put("t_glossary".toLowerCase(), "TGlossary");
        tmpMap.put("t_html".toLowerCase(), "THtml");
        tmpMap.put("t_image".toLowerCase(), "TImage");
        tmpMap.put("t_implement".toLowerCase(), "TImplement");
        tmpMap.put("t_issues".toLowerCase(), "TIssues");
        tmpMap.put("t_lists".toLowerCase(), "TLists");
        tmpMap.put("t_mainttypes".toLowerCase(), "TMainttypes");
        tmpMap.put("t_method".toLowerCase(), "TMethod");
        tmpMap.put("t_metrictypes".toLowerCase(), "TMetrictypes");
        tmpMap.put("t_object".toLowerCase(), "TObject");
        tmpMap.put("t_objectconstraint".toLowerCase(), "TObjectconstraint");
        tmpMap.put("t_objecteffort".toLowerCase(), "TObjecteffort");
        tmpMap.put("t_objectfiles".toLowerCase(), "TObjectfiles");
        tmpMap.put("t_objectmetrics".toLowerCase(), "TObjectmetrics");
        tmpMap.put("t_objectproblems".toLowerCase(), "TObjectproblems");
        tmpMap.put("t_objectproperties".toLowerCase(), "TObjectproperties");
        tmpMap.put("t_objectrequires".toLowerCase(), "TObjectrequires");
        tmpMap.put("t_objectresource".toLowerCase(), "TObjectresource");
        tmpMap.put("t_objectrisks".toLowerCase(), "TObjectrisks");
        tmpMap.put("t_objectscenarios".toLowerCase(), "TObjectscenarios");
        tmpMap.put("t_objecttests".toLowerCase(), "TObjecttests");
        tmpMap.put("t_objecttrx".toLowerCase(), "TObjecttrx");
        tmpMap.put("t_objecttypes".toLowerCase(), "TObjecttypes");
        tmpMap.put("t_ocf".toLowerCase(), "TOcf");
        tmpMap.put("t_operation".toLowerCase(), "TOperation");
        tmpMap.put("t_operationparams".toLowerCase(), "TOperationparams");
        tmpMap.put("t_operationposts".toLowerCase(), "TOperationposts");
        tmpMap.put("t_operationpres".toLowerCase(), "TOperationpres");
        tmpMap.put("t_operationtag".toLowerCase(), "TOperationtag");
        tmpMap.put("t_package".toLowerCase(), "TPackage");
        tmpMap.put("t_palette".toLowerCase(), "TPalette");
        tmpMap.put("t_paletteitem".toLowerCase(), "TPaletteitem");
        tmpMap.put("t_phase".toLowerCase(), "TPhase");
        tmpMap.put("t_primitives".toLowerCase(), "TPrimitives");
        tmpMap.put("t_problemtypes".toLowerCase(), "TProblemtypes");
        tmpMap.put("t_projectroles".toLowerCase(), "TProjectroles");
        tmpMap.put("t_propertytypes".toLowerCase(), "TPropertytypes");
        tmpMap.put("t_requiretypes".toLowerCase(), "TRequiretypes");
        tmpMap.put("t_resources".toLowerCase(), "TResources");
        tmpMap.put("t_risktypes".toLowerCase(), "TRisktypes");
        tmpMap.put("t_roleconstraint".toLowerCase(), "TRoleconstraint");
        tmpMap.put("t_rtf".toLowerCase(), "TRtf");
        tmpMap.put("t_rtfreport".toLowerCase(), "TRtfreport");
        tmpMap.put("t_rules".toLowerCase(), "TRules");
        tmpMap.put("t_scenariotypes".toLowerCase(), "TScenariotypes");
        tmpMap.put("t_script".toLowerCase(), "TScript");
        tmpMap.put("t_secgroup".toLowerCase(), "TSecgroup");
        tmpMap.put("t_secgrouppermission".toLowerCase(), "TSecgrouppermission");
        tmpMap.put("t_seclocks".toLowerCase(), "TSeclocks");
        tmpMap.put("t_secpermission".toLowerCase(), "TSecpermission");
        tmpMap.put("t_secpolicies".toLowerCase(), "TSecpolicies");
        tmpMap.put("t_secuser".toLowerCase(), "TSecuser");
        tmpMap.put("t_secusergroup".toLowerCase(), "TSecusergroup");
        tmpMap.put("t_secuserpermission".toLowerCase(), "TSecuserpermission");
        tmpMap.put("t_snapshot".toLowerCase(), "TSnapshot");
        tmpMap.put("t_statustypes".toLowerCase(), "TStatustypes");
        tmpMap.put("t_stereotypes".toLowerCase(), "TStereotypes");
        tmpMap.put("t_taggedvalue".toLowerCase(), "TTaggedvalue");
        tmpMap.put("t_tasks".toLowerCase(), "TTasks");
        tmpMap.put("t_tcf".toLowerCase(), "TTcf");
        tmpMap.put("t_template".toLowerCase(), "TTemplate");
        tmpMap.put("t_testclass".toLowerCase(), "TTestclass");
        tmpMap.put("t_testplans".toLowerCase(), "TTestplans");
        tmpMap.put("t_testtypes".toLowerCase(), "TTesttypes");
        tmpMap.put("t_trxtypes".toLowerCase(), "TTrxtypes");
        tmpMap.put("t_umlpattern".toLowerCase(), "TUmlpattern");
        tmpMap.put("t_version".toLowerCase(), "TVersion");
        tmpMap.put("t_xref".toLowerCase(), "TXref");
        tmpMap.put("t_xrefsystem".toLowerCase(), "TXrefsystem");
        tmpMap.put("t_xrefuser".toLowerCase(), "TXrefuser");
        tmpMap.put("usys_system".toLowerCase(), "usysSystem");
        tmpMap.put("usysOldTables".toLowerCase(), "usysoldtables");
        tmpMap.put("usysQueries".toLowerCase(), "usysqueries");
        tmpMap.put("usysTables".toLowerCase(), "usystables");

        _tableDbNamePropertyNameKeyToLowerMap = Collections.unmodifiableMap(tmpMap);
    }

    /** The key-to-lower map of property-name and DB-name for table. */
    protected static final Map<String, String> _tablePropertyNameDbNameKeyToLowerMap;
    static {
        Map<String, String> tmpMap = new LinkedHashMap<String, String>();

        tmpMap.put("TAttribute".toLowerCase(), "t_attribute");
        tmpMap.put("TAttributeconstraints".toLowerCase(), "t_attributeconstraints");
        tmpMap.put("TAttributetag".toLowerCase(), "t_attributetag");
        tmpMap.put("TAuthors".toLowerCase(), "t_authors");
        tmpMap.put("TCardinality".toLowerCase(), "t_cardinality");
        tmpMap.put("TCategory".toLowerCase(), "t_category");
        tmpMap.put("TClients".toLowerCase(), "t_clients");
        tmpMap.put("TComplexitytypes".toLowerCase(), "t_complexitytypes");
        tmpMap.put("TConnector".toLowerCase(), "t_connector");
        tmpMap.put("TConnectorconstraint".toLowerCase(), "t_connectorconstraint");
        tmpMap.put("TConnectortag".toLowerCase(), "t_connectortag");
        tmpMap.put("TConnectortypes".toLowerCase(), "t_connectortypes");
        tmpMap.put("TConstants".toLowerCase(), "t_constants");
        tmpMap.put("TConstrainttypes".toLowerCase(), "t_constrainttypes");
        tmpMap.put("TDatatypes".toLowerCase(), "t_datatypes");
        tmpMap.put("TDiagram".toLowerCase(), "t_diagram");
        tmpMap.put("TDiagramlinks".toLowerCase(), "t_diagramlinks");
        tmpMap.put("TDiagramobjects".toLowerCase(), "t_diagramobjects");
        tmpMap.put("TDiagramtypes".toLowerCase(), "t_diagramtypes");
        tmpMap.put("TDocument".toLowerCase(), "t_document");
        tmpMap.put("TEcf".toLowerCase(), "t_ecf");
        tmpMap.put("TEfforttypes".toLowerCase(), "t_efforttypes");
        tmpMap.put("TFiles".toLowerCase(), "t_files");
        tmpMap.put("TGenopt".toLowerCase(), "t_genopt");
        tmpMap.put("TGlossary".toLowerCase(), "t_glossary");
        tmpMap.put("THtml".toLowerCase(), "t_html");
        tmpMap.put("TImage".toLowerCase(), "t_image");
        tmpMap.put("TImplement".toLowerCase(), "t_implement");
        tmpMap.put("TIssues".toLowerCase(), "t_issues");
        tmpMap.put("TLists".toLowerCase(), "t_lists");
        tmpMap.put("TMainttypes".toLowerCase(), "t_mainttypes");
        tmpMap.put("TMethod".toLowerCase(), "t_method");
        tmpMap.put("TMetrictypes".toLowerCase(), "t_metrictypes");
        tmpMap.put("TObject".toLowerCase(), "t_object");
        tmpMap.put("TObjectconstraint".toLowerCase(), "t_objectconstraint");
        tmpMap.put("TObjecteffort".toLowerCase(), "t_objecteffort");
        tmpMap.put("TObjectfiles".toLowerCase(), "t_objectfiles");
        tmpMap.put("TObjectmetrics".toLowerCase(), "t_objectmetrics");
        tmpMap.put("TObjectproblems".toLowerCase(), "t_objectproblems");
        tmpMap.put("TObjectproperties".toLowerCase(), "t_objectproperties");
        tmpMap.put("TObjectrequires".toLowerCase(), "t_objectrequires");
        tmpMap.put("TObjectresource".toLowerCase(), "t_objectresource");
        tmpMap.put("TObjectrisks".toLowerCase(), "t_objectrisks");
        tmpMap.put("TObjectscenarios".toLowerCase(), "t_objectscenarios");
        tmpMap.put("TObjecttests".toLowerCase(), "t_objecttests");
        tmpMap.put("TObjecttrx".toLowerCase(), "t_objecttrx");
        tmpMap.put("TObjecttypes".toLowerCase(), "t_objecttypes");
        tmpMap.put("TOcf".toLowerCase(), "t_ocf");
        tmpMap.put("TOperation".toLowerCase(), "t_operation");
        tmpMap.put("TOperationparams".toLowerCase(), "t_operationparams");
        tmpMap.put("TOperationposts".toLowerCase(), "t_operationposts");
        tmpMap.put("TOperationpres".toLowerCase(), "t_operationpres");
        tmpMap.put("TOperationtag".toLowerCase(), "t_operationtag");
        tmpMap.put("TPackage".toLowerCase(), "t_package");
        tmpMap.put("TPalette".toLowerCase(), "t_palette");
        tmpMap.put("TPaletteitem".toLowerCase(), "t_paletteitem");
        tmpMap.put("TPhase".toLowerCase(), "t_phase");
        tmpMap.put("TPrimitives".toLowerCase(), "t_primitives");
        tmpMap.put("TProblemtypes".toLowerCase(), "t_problemtypes");
        tmpMap.put("TProjectroles".toLowerCase(), "t_projectroles");
        tmpMap.put("TPropertytypes".toLowerCase(), "t_propertytypes");
        tmpMap.put("TRequiretypes".toLowerCase(), "t_requiretypes");
        tmpMap.put("TResources".toLowerCase(), "t_resources");
        tmpMap.put("TRisktypes".toLowerCase(), "t_risktypes");
        tmpMap.put("TRoleconstraint".toLowerCase(), "t_roleconstraint");
        tmpMap.put("TRtf".toLowerCase(), "t_rtf");
        tmpMap.put("TRtfreport".toLowerCase(), "t_rtfreport");
        tmpMap.put("TRules".toLowerCase(), "t_rules");
        tmpMap.put("TScenariotypes".toLowerCase(), "t_scenariotypes");
        tmpMap.put("TScript".toLowerCase(), "t_script");
        tmpMap.put("TSecgroup".toLowerCase(), "t_secgroup");
        tmpMap.put("TSecgrouppermission".toLowerCase(), "t_secgrouppermission");
        tmpMap.put("TSeclocks".toLowerCase(), "t_seclocks");
        tmpMap.put("TSecpermission".toLowerCase(), "t_secpermission");
        tmpMap.put("TSecpolicies".toLowerCase(), "t_secpolicies");
        tmpMap.put("TSecuser".toLowerCase(), "t_secuser");
        tmpMap.put("TSecusergroup".toLowerCase(), "t_secusergroup");
        tmpMap.put("TSecuserpermission".toLowerCase(), "t_secuserpermission");
        tmpMap.put("TSnapshot".toLowerCase(), "t_snapshot");
        tmpMap.put("TStatustypes".toLowerCase(), "t_statustypes");
        tmpMap.put("TStereotypes".toLowerCase(), "t_stereotypes");
        tmpMap.put("TTaggedvalue".toLowerCase(), "t_taggedvalue");
        tmpMap.put("TTasks".toLowerCase(), "t_tasks");
        tmpMap.put("TTcf".toLowerCase(), "t_tcf");
        tmpMap.put("TTemplate".toLowerCase(), "t_template");
        tmpMap.put("TTestclass".toLowerCase(), "t_testclass");
        tmpMap.put("TTestplans".toLowerCase(), "t_testplans");
        tmpMap.put("TTesttypes".toLowerCase(), "t_testtypes");
        tmpMap.put("TTrxtypes".toLowerCase(), "t_trxtypes");
        tmpMap.put("TUmlpattern".toLowerCase(), "t_umlpattern");
        tmpMap.put("TVersion".toLowerCase(), "t_version");
        tmpMap.put("TXref".toLowerCase(), "t_xref");
        tmpMap.put("TXrefsystem".toLowerCase(), "t_xrefsystem");
        tmpMap.put("TXrefuser".toLowerCase(), "t_xrefuser");
        tmpMap.put("usysSystem".toLowerCase(), "usys_system");
        tmpMap.put("usysoldtables".toLowerCase(), "usysOldTables");
        tmpMap.put("usysqueries".toLowerCase(), "usysQueries");
        tmpMap.put("usystables".toLowerCase(), "usysTables");

        _tablePropertyNameDbNameKeyToLowerMap = Collections.unmodifiableMap(tmpMap);
    }

    protected static DBMeta getDBMeta(String className) {
        try {
            Class clazz = Class.forName(className);
            java.lang.reflect.Method methoz = clazz.getMethod("getInstance", (Class[])null);
            Object result = methoz.invoke(null, (Object[])null);
            return (DBMeta)result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @return The initialized map that contains all instances of dbmeta. (NotNull & NotEmpty)
     */
    public static Map<String, DBMeta> getDBMetaMap() {
        initializeDBMetaMap();
        return _tableDbNameInstanceMap;
    }
    
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
     * Find dbmeta by table flexible-name.
     * <pre>
     * If the table name is 'ORDER_DETAIL', you can find the dbmeta by ...(as follows)
     *     'ORDER_DETAIL', 'ORDer_DeTAiL', 'order_detail'
     *     , 'OrderDetail', 'orderdetail', 'oRderDetaIl'
     * </pre>
     * @param tableFlexibleName Table flexible-name. (NotNull)
     * @return The instance of dbmeta. (NotNull)
     * @exception DBMetaNotFoundException When the dbmeta is not found.
     */
    public static DBMeta findDBMeta(String tableFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        if (_tableDbNameInstanceMap.containsKey(tableFlexibleName)) {
            return byTableDbName(tableFlexibleName);
        }
        String toLowerKey = tableFlexibleName.toLowerCase();
        if (_tableDbNamePropertyNameKeyToLowerMap.containsKey(toLowerKey)) {
            String propertyName = (String)_tableDbNamePropertyNameKeyToLowerMap.get(toLowerKey);
            String dbName = (String)_tablePropertyNameDbNameKeyToLowerMap.get(propertyName.toLowerCase());
            return byTableDbName(dbName);
        }
        if (_tablePropertyNameDbNameKeyToLowerMap.containsKey(toLowerKey)) {
            String dbName = (String)_tablePropertyNameDbNameKeyToLowerMap.get(toLowerKey);
            return byTableDbName(dbName);
        }
        final int dotLastIndex = tableFlexibleName.lastIndexOf(".");
        if (dotLastIndex >= 0) {
            try {
                return findDBMeta(tableFlexibleName.substring(dotLastIndex + 1));
            } catch (DBMetaNotFoundException e) {
                // Nothing
            }
        }
        String msg = "The instance map returned null by the key: key=" + tableFlexibleName + " instanceMap=" + _tableDbNameInstanceMap;
        throw new DBMetaNotFoundException(msg);
    }

    public static class DBMetaNotFoundException extends IllegalStateException {
        private static final long serialVersionUID = 1L;
        public DBMetaNotFoundException(String msg) {
            super(msg);
        }
    }

    /**
     * Get instance by table DB-name.
     * @param tableDbName Table DB-name. (NotNull)
     * @return Instance. (NotNull)
     */
    protected static DBMeta byTableDbName(String tableDbName) {
        assertStringNotNullAndNotTrimmedEmpty("tableDbName", tableDbName);
        DBMeta instance = getCachedDBMeta(tableDbName);
        if (instance == null) {
            String msg = "The instance map returned null by the key: key=" + tableDbName + " instanceMap=" + _tableDbNameInstanceMap;
            throw new DBMetaNotFoundException(msg);
        }
        return instance;
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

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    protected static void assertObjectNotNull(String variableName, Object value) {
	    SimpleAssertUtil.assertObjectNotNull(variableName, value);
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    protected static void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
	    SimpleAssertUtil.assertStringNotNullAndNotTrimmedEmpty(variableName, value);
    }
}
