package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;
import jp.sourceforge.ea2ddl.dao.exentity.*;

/**
 * The entity of t_object(TABLE).
 * <pre>
 * [primary-key]
 *     Object_ID
 * 
 * [column]
 *     Object_ID, Object_Type, Diagram_ID, Name, Alias, Author, Version, Note, Package_ID, Stereotype, NType, Complexity, Effort, Style, Backcolor, BorderStyle, BorderWidth, Fontcolor, Bordercolor, CreatedDate, ModifiedDate, Status, Tagged, PDATA1, PDATA2, PDATA3, PDATA4, PDATA5, Concurrency, Visibility, Persistence, Cardinality, GenType, GenFile, Header1, Header2, Phase, Scope, GenOption, GenLinks, Classifier, ea_guid, ParentID, RunState, Classifier_guid, TPos, IsRoot, IsLeaf, IsSpec, IsActive, StateFlags, PackageFlags, Multiplicity, StyleEx, ActionFlags, EventFlags
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     t_objectproperties, t_attribute, t_operation, t_connector
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     tObjectpropertiesList, tAttributeList, tOperationList, tConnectorByStartObjectIdList, tConnectorByEndObjectIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsTObject implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_object. */
    public static final String TABLE = "t_object";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Object_ID'. {PK : UQ : COUNTER : NotNull} */
    protected java.lang.Integer _objectId;

    /** The attribute of the column 'Object_Type'. {VARCHAR(255)} */
    protected String _objectType;

    /** The attribute of the column 'Diagram_ID'. {INTEGER} */
    protected java.lang.Integer _diagramId;

    /** The attribute of the column 'Name'. {VARCHAR(255)} */
    protected String _name;

    /** The attribute of the column 'Alias'. {VARCHAR(255)} */
    protected String _alias;

    /** The attribute of the column 'Author'. {VARCHAR(255)} */
    protected String _author;

    /** The attribute of the column 'Version'. {VARCHAR(50)} */
    protected String _version;

    /** The attribute of the column 'Note'. {LONGCHAR(2147483647)} */
    protected String _note;

    /** The attribute of the column 'Package_ID'. {INTEGER} */
    protected java.lang.Integer _packageId;

    /** The attribute of the column 'Stereotype'. {VARCHAR(255)} */
    protected String _stereotype;

    /** The attribute of the column 'NType'. {INTEGER} */
    protected java.lang.Integer _ntype;

    /** The attribute of the column 'Complexity'. {VARCHAR(50)} */
    protected String _complexity;

    /** The attribute of the column 'Effort'. {INTEGER} */
    protected java.lang.Integer _effort;

    /** The attribute of the column 'Style'. {VARCHAR(255)} */
    protected String _style;

    /** The attribute of the column 'Backcolor'. {INTEGER} */
    protected java.lang.Integer _backcolor;

    /** The attribute of the column 'BorderStyle'. {INTEGER} */
    protected java.lang.Integer _borderstyle;

    /** The attribute of the column 'BorderWidth'. {INTEGER} */
    protected java.lang.Integer _borderwidth;

    /** The attribute of the column 'Fontcolor'. {INTEGER} */
    protected java.lang.Integer _fontcolor;

    /** The attribute of the column 'Bordercolor'. {INTEGER} */
    protected java.lang.Integer _bordercolor;

    /** The attribute of the column 'CreatedDate'. {DATETIME} */
    protected java.sql.Timestamp _createddate;

    /** The attribute of the column 'ModifiedDate'. {DATETIME} */
    protected java.sql.Timestamp _modifieddate;

    /** The attribute of the column 'Status'. {VARCHAR(50)} */
    protected String _status;

    /** The attribute of the column 'Tagged'. {INTEGER} */
    protected java.lang.Integer _tagged;

    /** The attribute of the column 'PDATA1'. {VARCHAR(255)} */
    protected String _pdata1;

    /** The attribute of the column 'PDATA2'. {VARCHAR(255)} */
    protected String _pdata2;

    /** The attribute of the column 'PDATA3'. {VARCHAR(255)} */
    protected String _pdata3;

    /** The attribute of the column 'PDATA4'. {VARCHAR(255)} */
    protected String _pdata4;

    /** The attribute of the column 'PDATA5'. {VARCHAR(255)} */
    protected String _pdata5;

    /** The attribute of the column 'Concurrency'. {VARCHAR(50)} */
    protected String _concurrency;

    /** The attribute of the column 'Visibility'. {VARCHAR(50)} */
    protected String _visibility;

    /** The attribute of the column 'Persistence'. {VARCHAR(50)} */
    protected String _persistence;

    /** The attribute of the column 'Cardinality'. {VARCHAR(50)} */
    protected String _cardinality;

    /** The attribute of the column 'GenType'. {VARCHAR(50)} */
    protected String _gentype;

    /** The attribute of the column 'GenFile'. {VARCHAR(255)} */
    protected String _genfile;

    /** The attribute of the column 'Header1'. {LONGCHAR(2147483647)} */
    protected String _header1;

    /** The attribute of the column 'Header2'. {LONGCHAR(2147483647)} */
    protected String _header2;

    /** The attribute of the column 'Phase'. {VARCHAR(50)} */
    protected String _phase;

    /** The attribute of the column 'Scope'. {VARCHAR(25)} */
    protected String _scope;

    /** The attribute of the column 'GenOption'. {LONGCHAR(2147483647)} */
    protected String _genoption;

    /** The attribute of the column 'GenLinks'. {LONGCHAR(2147483647)} */
    protected String _genlinks;

    /** The attribute of the column 'Classifier'. {INTEGER} */
    protected java.lang.Integer _classifier;

    /** The attribute of the column 'ea_guid'. {UQ : VARCHAR(40)} */
    protected String _eaGuid;

    /** The attribute of the column 'ParentID'. {INTEGER} */
    protected java.lang.Integer _parentid;

    /** The attribute of the column 'RunState'. {LONGCHAR(2147483647)} */
    protected String _runstate;

    /** The attribute of the column 'Classifier_guid'. {VARCHAR(40)} */
    protected String _classifierGuid;

    /** The attribute of the column 'TPos'. {INTEGER} */
    protected java.lang.Integer _tpos;

    /** The attribute of the column 'IsRoot'. {BIT : NotNull} */
    protected Boolean _isroot;

    /** The attribute of the column 'IsLeaf'. {BIT : NotNull} */
    protected Boolean _isleaf;

    /** The attribute of the column 'IsSpec'. {BIT : NotNull} */
    protected Boolean _isspec;

    /** The attribute of the column 'IsActive'. {BIT : NotNull} */
    protected Boolean _isactive;

    /** The attribute of the column 'StateFlags'. {VARCHAR(255)} */
    protected String _stateflags;

    /** The attribute of the column 'PackageFlags'. {VARCHAR(255)} */
    protected String _packageflags;

    /** The attribute of the column 'Multiplicity'. {VARCHAR(50)} */
    protected String _multiplicity;

    /** The attribute of the column 'StyleEx'. {LONGCHAR(2147483647)} */
    protected String _styleex;

    /** The attribute of the column 'ActionFlags'. {VARCHAR(255)} */
    protected String _actionflags;

    /** The attribute of the column 'EventFlags'. {VARCHAR(255)} */
    protected String _eventflags;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObject() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_object";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TObject";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                          Classification Classifying
    //                                                          ==========================
    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [TObjectpropertiesList]
    // * * * * * * * * */

    /** The entity list of referrer property 'TObjectpropertiesList'. */
    protected List<TObjectproperties> _childrenTObjectpropertiesList;

    /**
     * Get the entity list of referrer property 'TObjectpropertiesList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'TObjectpropertiesList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TObjectproperties> getTObjectpropertiesList() {
        if (_childrenTObjectpropertiesList == null) { _childrenTObjectpropertiesList = new ArrayList<TObjectproperties>(); }
        return _childrenTObjectpropertiesList;
    }

    /**
     * Set the entity list of referrer property 'TObjectpropertiesList'.
     * @param tObjectpropertiesList The entity list of referrer property 'TObjectpropertiesList'. (Nullable)
     */
    public void setTObjectpropertiesList(List<TObjectproperties> tObjectpropertiesList) {
        _childrenTObjectpropertiesList = tObjectpropertiesList;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [TAttributeList]
    // * * * * * * * * */

    /** The entity list of referrer property 'TAttributeList'. */
    protected List<TAttribute> _childrenTAttributeList;

    /**
     * Get the entity list of referrer property 'TAttributeList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'TAttributeList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TAttribute> getTAttributeList() {
        if (_childrenTAttributeList == null) { _childrenTAttributeList = new ArrayList<TAttribute>(); }
        return _childrenTAttributeList;
    }

    /**
     * Set the entity list of referrer property 'TAttributeList'.
     * @param tAttributeList The entity list of referrer property 'TAttributeList'. (Nullable)
     */
    public void setTAttributeList(List<TAttribute> tAttributeList) {
        _childrenTAttributeList = tAttributeList;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [TOperationList]
    // * * * * * * * * */

    /** The entity list of referrer property 'TOperationList'. */
    protected List<TOperation> _childrenTOperationList;

    /**
     * Get the entity list of referrer property 'TOperationList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'TOperationList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TOperation> getTOperationList() {
        if (_childrenTOperationList == null) { _childrenTOperationList = new ArrayList<TOperation>(); }
        return _childrenTOperationList;
    }

    /**
     * Set the entity list of referrer property 'TOperationList'.
     * @param tOperationList The entity list of referrer property 'TOperationList'. (Nullable)
     */
    public void setTOperationList(List<TOperation> tOperationList) {
        _childrenTOperationList = tOperationList;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [TConnectorByStartObjectIdList]
    // * * * * * * * * */

    /** The entity list of referrer property 'TConnectorByStartObjectIdList'. */
    protected List<TConnector> _childrenTConnectorByStartObjectIdList;

    /**
     * Get the entity list of referrer property 'TConnectorByStartObjectIdList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'TConnectorByStartObjectIdList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TConnector> getTConnectorByStartObjectIdList() {
        if (_childrenTConnectorByStartObjectIdList == null) { _childrenTConnectorByStartObjectIdList = new ArrayList<TConnector>(); }
        return _childrenTConnectorByStartObjectIdList;
    }

    /**
     * Set the entity list of referrer property 'TConnectorByStartObjectIdList'.
     * @param tConnectorByStartObjectIdList The entity list of referrer property 'TConnectorByStartObjectIdList'. (Nullable)
     */
    public void setTConnectorByStartObjectIdList(List<TConnector> tConnectorByStartObjectIdList) {
        _childrenTConnectorByStartObjectIdList = tConnectorByStartObjectIdList;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [TConnectorByEndObjectIdList]
    // * * * * * * * * */

    /** The entity list of referrer property 'TConnectorByEndObjectIdList'. */
    protected List<TConnector> _childrenTConnectorByEndObjectIdList;

    /**
     * Get the entity list of referrer property 'TConnectorByEndObjectIdList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'TConnectorByEndObjectIdList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TConnector> getTConnectorByEndObjectIdList() {
        if (_childrenTConnectorByEndObjectIdList == null) { _childrenTConnectorByEndObjectIdList = new ArrayList<TConnector>(); }
        return _childrenTConnectorByEndObjectIdList;
    }

    /**
     * Set the entity list of referrer property 'TConnectorByEndObjectIdList'.
     * @param tConnectorByEndObjectIdList The entity list of referrer property 'TConnectorByEndObjectIdList'. (Nullable)
     */
    public void setTConnectorByEndObjectIdList(List<TConnector> tConnectorByEndObjectIdList) {
        _childrenTConnectorByEndObjectIdList = tConnectorByEndObjectIdList;
    }


    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        if (_objectId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> getModifiedPropertyNames() {
        return _modifiedProperties.getPropertyNames();
    }

    protected EntityModifiedProperties newEntityModifiedProperties() {
        return new EntityModifiedProperties();
    }

    public void clearModifiedPropertyNames() {
        _modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !_modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * If the primary-key of the other is same as this one, returns true.
     * @param other Other entity.
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTObject)) { return false; }
        BsTObject otherEntity = (BsTObject)other;
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * Calculates hash-code from primary-key.
     * @return Hash-code from primary-keys.
     */
    public int hashCode() {
        int result = 17;
        if (this.getObjectId() != null) { result = result + getObjectId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getObjectType());
        sb.append(delimiter).append(getDiagramId());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getAlias());
        sb.append(delimiter).append(getAuthor());
        sb.append(delimiter).append(getVersion());
        sb.append(delimiter).append(getNote());
        sb.append(delimiter).append(getPackageId());
        sb.append(delimiter).append(getStereotype());
        sb.append(delimiter).append(getNtype());
        sb.append(delimiter).append(getComplexity());
        sb.append(delimiter).append(getEffort());
        sb.append(delimiter).append(getStyle());
        sb.append(delimiter).append(getBackcolor());
        sb.append(delimiter).append(getBorderstyle());
        sb.append(delimiter).append(getBorderwidth());
        sb.append(delimiter).append(getFontcolor());
        sb.append(delimiter).append(getBordercolor());
        sb.append(delimiter).append(getCreateddate());
        sb.append(delimiter).append(getModifieddate());
        sb.append(delimiter).append(getStatus());
        sb.append(delimiter).append(getTagged());
        sb.append(delimiter).append(getPdata1());
        sb.append(delimiter).append(getPdata2());
        sb.append(delimiter).append(getPdata3());
        sb.append(delimiter).append(getPdata4());
        sb.append(delimiter).append(getPdata5());
        sb.append(delimiter).append(getConcurrency());
        sb.append(delimiter).append(getVisibility());
        sb.append(delimiter).append(getPersistence());
        sb.append(delimiter).append(getCardinality());
        sb.append(delimiter).append(getGentype());
        sb.append(delimiter).append(getGenfile());
        sb.append(delimiter).append(getHeader1());
        sb.append(delimiter).append(getHeader2());
        sb.append(delimiter).append(getPhase());
        sb.append(delimiter).append(getScope());
        sb.append(delimiter).append(getGenoption());
        sb.append(delimiter).append(getGenlinks());
        sb.append(delimiter).append(getClassifier());
        sb.append(delimiter).append(getEaGuid());
        sb.append(delimiter).append(getParentid());
        sb.append(delimiter).append(getRunstate());
        sb.append(delimiter).append(getClassifierGuid());
        sb.append(delimiter).append(getTpos());
        sb.append(delimiter).append(getIsroot());
        sb.append(delimiter).append(getIsleaf());
        sb.append(delimiter).append(getIsspec());
        sb.append(delimiter).append(getIsactive());
        sb.append(delimiter).append(getStateflags());
        sb.append(delimiter).append(getPackageflags());
        sb.append(delimiter).append(getMultiplicity());
        sb.append(delimiter).append(getStyleex());
        sb.append(delimiter).append(getActionflags());
        sb.append(delimiter).append(getEventflags());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {PK : UQ : COUNTER : NotNull} */
    public static final String objectId_COLUMN = "Object_ID";

    /**
     * Get the value of the column 'Object_ID'. <br />
     * {PK : UQ : COUNTER : NotNull}
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Set the value of the column 'Object_ID'. <br />
     * {PK : UQ : COUNTER : NotNull}
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String objectType_COLUMN = "Object_Type";

    /**
     * Get the value of the column 'Object_Type'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Object_Type'. (Nullable)
     */
    public String getObjectType() {
        return _objectType;
    }

    /**
     * Set the value of the column 'Object_Type'. <br />
     * {VARCHAR(255)}
     * @param objectType The value of the column 'Object_Type'. (Nullable)
     */
    public void setObjectType(String objectType) {
        _modifiedProperties.addPropertyName("objectType");
        this._objectType = objectType;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String diagramId_COLUMN = "Diagram_ID";

    /**
     * Get the value of the column 'Diagram_ID'. <br />
     * {INTEGER}
     * @return The value of the column 'Diagram_ID'. (Nullable)
     */
    public java.lang.Integer getDiagramId() {
        return _diagramId;
    }

    /**
     * Set the value of the column 'Diagram_ID'. <br />
     * {INTEGER}
     * @param diagramId The value of the column 'Diagram_ID'. (Nullable)
     */
    public void setDiagramId(java.lang.Integer diagramId) {
        _modifiedProperties.addPropertyName("diagramId");
        this._diagramId = diagramId;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String name_COLUMN = "Name";

    /**
     * Get the value of the column 'Name'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Set the value of the column 'Name'. <br />
     * {VARCHAR(255)}
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String alias_COLUMN = "Alias";

    /**
     * Get the value of the column 'Alias'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Alias'. (Nullable)
     */
    public String getAlias() {
        return _alias;
    }

    /**
     * Set the value of the column 'Alias'. <br />
     * {VARCHAR(255)}
     * @param alias The value of the column 'Alias'. (Nullable)
     */
    public void setAlias(String alias) {
        _modifiedProperties.addPropertyName("alias");
        this._alias = alias;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String author_COLUMN = "Author";

    /**
     * Get the value of the column 'Author'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Author'. (Nullable)
     */
    public String getAuthor() {
        return _author;
    }

    /**
     * Set the value of the column 'Author'. <br />
     * {VARCHAR(255)}
     * @param author The value of the column 'Author'. (Nullable)
     */
    public void setAuthor(String author) {
        _modifiedProperties.addPropertyName("author");
        this._author = author;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String version_COLUMN = "Version";

    /**
     * Get the value of the column 'Version'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Version'. (Nullable)
     */
    public String getVersion() {
        return _version;
    }

    /**
     * Set the value of the column 'Version'. <br />
     * {VARCHAR(50)}
     * @param version The value of the column 'Version'. (Nullable)
     */
    public void setVersion(String version) {
        _modifiedProperties.addPropertyName("version");
        this._version = version;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String note_COLUMN = "Note";

    /**
     * Get the value of the column 'Note'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Note'. (Nullable)
     */
    public String getNote() {
        return _note;
    }

    /**
     * Set the value of the column 'Note'. <br />
     * {LONGCHAR(2147483647)}
     * @param note The value of the column 'Note'. (Nullable)
     */
    public void setNote(String note) {
        _modifiedProperties.addPropertyName("note");
        this._note = note;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String packageId_COLUMN = "Package_ID";

    /**
     * Get the value of the column 'Package_ID'. <br />
     * {INTEGER}
     * @return The value of the column 'Package_ID'. (Nullable)
     */
    public java.lang.Integer getPackageId() {
        return _packageId;
    }

    /**
     * Set the value of the column 'Package_ID'. <br />
     * {INTEGER}
     * @param packageId The value of the column 'Package_ID'. (Nullable)
     */
    public void setPackageId(java.lang.Integer packageId) {
        _modifiedProperties.addPropertyName("packageId");
        this._packageId = packageId;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String stereotype_COLUMN = "Stereotype";

    /**
     * Get the value of the column 'Stereotype'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Stereotype'. (Nullable)
     */
    public String getStereotype() {
        return _stereotype;
    }

    /**
     * Set the value of the column 'Stereotype'. <br />
     * {VARCHAR(255)}
     * @param stereotype The value of the column 'Stereotype'. (Nullable)
     */
    public void setStereotype(String stereotype) {
        _modifiedProperties.addPropertyName("stereotype");
        this._stereotype = stereotype;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String ntype_COLUMN = "NType";

    /**
     * Get the value of the column 'NType'. <br />
     * {INTEGER}
     * @return The value of the column 'NType'. (Nullable)
     */
    public java.lang.Integer getNtype() {
        return _ntype;
    }

    /**
     * Set the value of the column 'NType'. <br />
     * {INTEGER}
     * @param ntype The value of the column 'NType'. (Nullable)
     */
    public void setNtype(java.lang.Integer ntype) {
        _modifiedProperties.addPropertyName("ntype");
        this._ntype = ntype;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String complexity_COLUMN = "Complexity";

    /**
     * Get the value of the column 'Complexity'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Complexity'. (Nullable)
     */
    public String getComplexity() {
        return _complexity;
    }

    /**
     * Set the value of the column 'Complexity'. <br />
     * {VARCHAR(50)}
     * @param complexity The value of the column 'Complexity'. (Nullable)
     */
    public void setComplexity(String complexity) {
        _modifiedProperties.addPropertyName("complexity");
        this._complexity = complexity;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String effort_COLUMN = "Effort";

    /**
     * Get the value of the column 'Effort'. <br />
     * {INTEGER}
     * @return The value of the column 'Effort'. (Nullable)
     */
    public java.lang.Integer getEffort() {
        return _effort;
    }

    /**
     * Set the value of the column 'Effort'. <br />
     * {INTEGER}
     * @param effort The value of the column 'Effort'. (Nullable)
     */
    public void setEffort(java.lang.Integer effort) {
        _modifiedProperties.addPropertyName("effort");
        this._effort = effort;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String style_COLUMN = "Style";

    /**
     * Get the value of the column 'Style'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Style'. (Nullable)
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Set the value of the column 'Style'. <br />
     * {VARCHAR(255)}
     * @param style The value of the column 'Style'. (Nullable)
     */
    public void setStyle(String style) {
        _modifiedProperties.addPropertyName("style");
        this._style = style;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String backcolor_COLUMN = "Backcolor";

    /**
     * Get the value of the column 'Backcolor'. <br />
     * {INTEGER}
     * @return The value of the column 'Backcolor'. (Nullable)
     */
    public java.lang.Integer getBackcolor() {
        return _backcolor;
    }

    /**
     * Set the value of the column 'Backcolor'. <br />
     * {INTEGER}
     * @param backcolor The value of the column 'Backcolor'. (Nullable)
     */
    public void setBackcolor(java.lang.Integer backcolor) {
        _modifiedProperties.addPropertyName("backcolor");
        this._backcolor = backcolor;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String borderstyle_COLUMN = "BorderStyle";

    /**
     * Get the value of the column 'BorderStyle'. <br />
     * {INTEGER}
     * @return The value of the column 'BorderStyle'. (Nullable)
     */
    public java.lang.Integer getBorderstyle() {
        return _borderstyle;
    }

    /**
     * Set the value of the column 'BorderStyle'. <br />
     * {INTEGER}
     * @param borderstyle The value of the column 'BorderStyle'. (Nullable)
     */
    public void setBorderstyle(java.lang.Integer borderstyle) {
        _modifiedProperties.addPropertyName("borderstyle");
        this._borderstyle = borderstyle;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String borderwidth_COLUMN = "BorderWidth";

    /**
     * Get the value of the column 'BorderWidth'. <br />
     * {INTEGER}
     * @return The value of the column 'BorderWidth'. (Nullable)
     */
    public java.lang.Integer getBorderwidth() {
        return _borderwidth;
    }

    /**
     * Set the value of the column 'BorderWidth'. <br />
     * {INTEGER}
     * @param borderwidth The value of the column 'BorderWidth'. (Nullable)
     */
    public void setBorderwidth(java.lang.Integer borderwidth) {
        _modifiedProperties.addPropertyName("borderwidth");
        this._borderwidth = borderwidth;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String fontcolor_COLUMN = "Fontcolor";

    /**
     * Get the value of the column 'Fontcolor'. <br />
     * {INTEGER}
     * @return The value of the column 'Fontcolor'. (Nullable)
     */
    public java.lang.Integer getFontcolor() {
        return _fontcolor;
    }

    /**
     * Set the value of the column 'Fontcolor'. <br />
     * {INTEGER}
     * @param fontcolor The value of the column 'Fontcolor'. (Nullable)
     */
    public void setFontcolor(java.lang.Integer fontcolor) {
        _modifiedProperties.addPropertyName("fontcolor");
        this._fontcolor = fontcolor;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String bordercolor_COLUMN = "Bordercolor";

    /**
     * Get the value of the column 'Bordercolor'. <br />
     * {INTEGER}
     * @return The value of the column 'Bordercolor'. (Nullable)
     */
    public java.lang.Integer getBordercolor() {
        return _bordercolor;
    }

    /**
     * Set the value of the column 'Bordercolor'. <br />
     * {INTEGER}
     * @param bordercolor The value of the column 'Bordercolor'. (Nullable)
     */
    public void setBordercolor(java.lang.Integer bordercolor) {
        _modifiedProperties.addPropertyName("bordercolor");
        this._bordercolor = bordercolor;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String createddate_COLUMN = "CreatedDate";

    /**
     * Get the value of the column 'CreatedDate'. <br />
     * {DATETIME}
     * @return The value of the column 'CreatedDate'. (Nullable)
     */
    public java.sql.Timestamp getCreateddate() {
        return _createddate;
    }

    /**
     * Set the value of the column 'CreatedDate'. <br />
     * {DATETIME}
     * @param createddate The value of the column 'CreatedDate'. (Nullable)
     */
    public void setCreateddate(java.sql.Timestamp createddate) {
        _modifiedProperties.addPropertyName("createddate");
        this._createddate = createddate;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String modifieddate_COLUMN = "ModifiedDate";

    /**
     * Get the value of the column 'ModifiedDate'. <br />
     * {DATETIME}
     * @return The value of the column 'ModifiedDate'. (Nullable)
     */
    public java.sql.Timestamp getModifieddate() {
        return _modifieddate;
    }

    /**
     * Set the value of the column 'ModifiedDate'. <br />
     * {DATETIME}
     * @param modifieddate The value of the column 'ModifiedDate'. (Nullable)
     */
    public void setModifieddate(java.sql.Timestamp modifieddate) {
        _modifiedProperties.addPropertyName("modifieddate");
        this._modifieddate = modifieddate;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String status_COLUMN = "Status";

    /**
     * Get the value of the column 'Status'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Status'. (Nullable)
     */
    public String getStatus() {
        return _status;
    }

    /**
     * Set the value of the column 'Status'. <br />
     * {VARCHAR(50)}
     * @param status The value of the column 'Status'. (Nullable)
     */
    public void setStatus(String status) {
        _modifiedProperties.addPropertyName("status");
        this._status = status;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String tagged_COLUMN = "Tagged";

    /**
     * Get the value of the column 'Tagged'. <br />
     * {INTEGER}
     * @return The value of the column 'Tagged'. (Nullable)
     */
    public java.lang.Integer getTagged() {
        return _tagged;
    }

    /**
     * Set the value of the column 'Tagged'. <br />
     * {INTEGER}
     * @param tagged The value of the column 'Tagged'. (Nullable)
     */
    public void setTagged(java.lang.Integer tagged) {
        _modifiedProperties.addPropertyName("tagged");
        this._tagged = tagged;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata1_COLUMN = "PDATA1";

    /**
     * Get the value of the column 'PDATA1'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA1'. (Nullable)
     */
    public String getPdata1() {
        return _pdata1;
    }

    /**
     * Set the value of the column 'PDATA1'. <br />
     * {VARCHAR(255)}
     * @param pdata1 The value of the column 'PDATA1'. (Nullable)
     */
    public void setPdata1(String pdata1) {
        _modifiedProperties.addPropertyName("pdata1");
        this._pdata1 = pdata1;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata2_COLUMN = "PDATA2";

    /**
     * Get the value of the column 'PDATA2'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA2'. (Nullable)
     */
    public String getPdata2() {
        return _pdata2;
    }

    /**
     * Set the value of the column 'PDATA2'. <br />
     * {VARCHAR(255)}
     * @param pdata2 The value of the column 'PDATA2'. (Nullable)
     */
    public void setPdata2(String pdata2) {
        _modifiedProperties.addPropertyName("pdata2");
        this._pdata2 = pdata2;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata3_COLUMN = "PDATA3";

    /**
     * Get the value of the column 'PDATA3'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA3'. (Nullable)
     */
    public String getPdata3() {
        return _pdata3;
    }

    /**
     * Set the value of the column 'PDATA3'. <br />
     * {VARCHAR(255)}
     * @param pdata3 The value of the column 'PDATA3'. (Nullable)
     */
    public void setPdata3(String pdata3) {
        _modifiedProperties.addPropertyName("pdata3");
        this._pdata3 = pdata3;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata4_COLUMN = "PDATA4";

    /**
     * Get the value of the column 'PDATA4'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA4'. (Nullable)
     */
    public String getPdata4() {
        return _pdata4;
    }

    /**
     * Set the value of the column 'PDATA4'. <br />
     * {VARCHAR(255)}
     * @param pdata4 The value of the column 'PDATA4'. (Nullable)
     */
    public void setPdata4(String pdata4) {
        _modifiedProperties.addPropertyName("pdata4");
        this._pdata4 = pdata4;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata5_COLUMN = "PDATA5";

    /**
     * Get the value of the column 'PDATA5'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA5'. (Nullable)
     */
    public String getPdata5() {
        return _pdata5;
    }

    /**
     * Set the value of the column 'PDATA5'. <br />
     * {VARCHAR(255)}
     * @param pdata5 The value of the column 'PDATA5'. (Nullable)
     */
    public void setPdata5(String pdata5) {
        _modifiedProperties.addPropertyName("pdata5");
        this._pdata5 = pdata5;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String concurrency_COLUMN = "Concurrency";

    /**
     * Get the value of the column 'Concurrency'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Concurrency'. (Nullable)
     */
    public String getConcurrency() {
        return _concurrency;
    }

    /**
     * Set the value of the column 'Concurrency'. <br />
     * {VARCHAR(50)}
     * @param concurrency The value of the column 'Concurrency'. (Nullable)
     */
    public void setConcurrency(String concurrency) {
        _modifiedProperties.addPropertyName("concurrency");
        this._concurrency = concurrency;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String visibility_COLUMN = "Visibility";

    /**
     * Get the value of the column 'Visibility'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Visibility'. (Nullable)
     */
    public String getVisibility() {
        return _visibility;
    }

    /**
     * Set the value of the column 'Visibility'. <br />
     * {VARCHAR(50)}
     * @param visibility The value of the column 'Visibility'. (Nullable)
     */
    public void setVisibility(String visibility) {
        _modifiedProperties.addPropertyName("visibility");
        this._visibility = visibility;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String persistence_COLUMN = "Persistence";

    /**
     * Get the value of the column 'Persistence'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Persistence'. (Nullable)
     */
    public String getPersistence() {
        return _persistence;
    }

    /**
     * Set the value of the column 'Persistence'. <br />
     * {VARCHAR(50)}
     * @param persistence The value of the column 'Persistence'. (Nullable)
     */
    public void setPersistence(String persistence) {
        _modifiedProperties.addPropertyName("persistence");
        this._persistence = persistence;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String cardinality_COLUMN = "Cardinality";

    /**
     * Get the value of the column 'Cardinality'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Cardinality'. (Nullable)
     */
    public String getCardinality() {
        return _cardinality;
    }

    /**
     * Set the value of the column 'Cardinality'. <br />
     * {VARCHAR(50)}
     * @param cardinality The value of the column 'Cardinality'. (Nullable)
     */
    public void setCardinality(String cardinality) {
        _modifiedProperties.addPropertyName("cardinality");
        this._cardinality = cardinality;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String gentype_COLUMN = "GenType";

    /**
     * Get the value of the column 'GenType'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'GenType'. (Nullable)
     */
    public String getGentype() {
        return _gentype;
    }

    /**
     * Set the value of the column 'GenType'. <br />
     * {VARCHAR(50)}
     * @param gentype The value of the column 'GenType'. (Nullable)
     */
    public void setGentype(String gentype) {
        _modifiedProperties.addPropertyName("gentype");
        this._gentype = gentype;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String genfile_COLUMN = "GenFile";

    /**
     * Get the value of the column 'GenFile'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'GenFile'. (Nullable)
     */
    public String getGenfile() {
        return _genfile;
    }

    /**
     * Set the value of the column 'GenFile'. <br />
     * {VARCHAR(255)}
     * @param genfile The value of the column 'GenFile'. (Nullable)
     */
    public void setGenfile(String genfile) {
        _modifiedProperties.addPropertyName("genfile");
        this._genfile = genfile;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String header1_COLUMN = "Header1";

    /**
     * Get the value of the column 'Header1'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Header1'. (Nullable)
     */
    public String getHeader1() {
        return _header1;
    }

    /**
     * Set the value of the column 'Header1'. <br />
     * {LONGCHAR(2147483647)}
     * @param header1 The value of the column 'Header1'. (Nullable)
     */
    public void setHeader1(String header1) {
        _modifiedProperties.addPropertyName("header1");
        this._header1 = header1;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String header2_COLUMN = "Header2";

    /**
     * Get the value of the column 'Header2'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Header2'. (Nullable)
     */
    public String getHeader2() {
        return _header2;
    }

    /**
     * Set the value of the column 'Header2'. <br />
     * {LONGCHAR(2147483647)}
     * @param header2 The value of the column 'Header2'. (Nullable)
     */
    public void setHeader2(String header2) {
        _modifiedProperties.addPropertyName("header2");
        this._header2 = header2;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String phase_COLUMN = "Phase";

    /**
     * Get the value of the column 'Phase'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Phase'. (Nullable)
     */
    public String getPhase() {
        return _phase;
    }

    /**
     * Set the value of the column 'Phase'. <br />
     * {VARCHAR(50)}
     * @param phase The value of the column 'Phase'. (Nullable)
     */
    public void setPhase(String phase) {
        _modifiedProperties.addPropertyName("phase");
        this._phase = phase;
    }

    /** The column annotation for S2Dao. {VARCHAR(25)} */
    public static final String scope_COLUMN = "Scope";

    /**
     * Get the value of the column 'Scope'. <br />
     * {VARCHAR(25)}
     * @return The value of the column 'Scope'. (Nullable)
     */
    public String getScope() {
        return _scope;
    }

    /**
     * Set the value of the column 'Scope'. <br />
     * {VARCHAR(25)}
     * @param scope The value of the column 'Scope'. (Nullable)
     */
    public void setScope(String scope) {
        _modifiedProperties.addPropertyName("scope");
        this._scope = scope;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String genoption_COLUMN = "GenOption";

    /**
     * Get the value of the column 'GenOption'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'GenOption'. (Nullable)
     */
    public String getGenoption() {
        return _genoption;
    }

    /**
     * Set the value of the column 'GenOption'. <br />
     * {LONGCHAR(2147483647)}
     * @param genoption The value of the column 'GenOption'. (Nullable)
     */
    public void setGenoption(String genoption) {
        _modifiedProperties.addPropertyName("genoption");
        this._genoption = genoption;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String genlinks_COLUMN = "GenLinks";

    /**
     * Get the value of the column 'GenLinks'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'GenLinks'. (Nullable)
     */
    public String getGenlinks() {
        return _genlinks;
    }

    /**
     * Set the value of the column 'GenLinks'. <br />
     * {LONGCHAR(2147483647)}
     * @param genlinks The value of the column 'GenLinks'. (Nullable)
     */
    public void setGenlinks(String genlinks) {
        _modifiedProperties.addPropertyName("genlinks");
        this._genlinks = genlinks;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String classifier_COLUMN = "Classifier";

    /**
     * Get the value of the column 'Classifier'. <br />
     * {INTEGER}
     * @return The value of the column 'Classifier'. (Nullable)
     */
    public java.lang.Integer getClassifier() {
        return _classifier;
    }

    /**
     * Set the value of the column 'Classifier'. <br />
     * {INTEGER}
     * @param classifier The value of the column 'Classifier'. (Nullable)
     */
    public void setClassifier(java.lang.Integer classifier) {
        _modifiedProperties.addPropertyName("classifier");
        this._classifier = classifier;
    }

    /** The column annotation for S2Dao. {UQ : VARCHAR(40)} */
    public static final String eaGuid_COLUMN = "ea_guid";

    /**
     * Get the value of the column 'ea_guid'. <br />
     * {UQ : VARCHAR(40)}
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * Set the value of the column 'ea_guid'. <br />
     * {UQ : VARCHAR(40)}
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String parentid_COLUMN = "ParentID";

    /**
     * Get the value of the column 'ParentID'. <br />
     * {INTEGER}
     * @return The value of the column 'ParentID'. (Nullable)
     */
    public java.lang.Integer getParentid() {
        return _parentid;
    }

    /**
     * Set the value of the column 'ParentID'. <br />
     * {INTEGER}
     * @param parentid The value of the column 'ParentID'. (Nullable)
     */
    public void setParentid(java.lang.Integer parentid) {
        _modifiedProperties.addPropertyName("parentid");
        this._parentid = parentid;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String runstate_COLUMN = "RunState";

    /**
     * Get the value of the column 'RunState'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'RunState'. (Nullable)
     */
    public String getRunstate() {
        return _runstate;
    }

    /**
     * Set the value of the column 'RunState'. <br />
     * {LONGCHAR(2147483647)}
     * @param runstate The value of the column 'RunState'. (Nullable)
     */
    public void setRunstate(String runstate) {
        _modifiedProperties.addPropertyName("runstate");
        this._runstate = runstate;
    }

    /** The column annotation for S2Dao. {VARCHAR(40)} */
    public static final String classifierGuid_COLUMN = "Classifier_guid";

    /**
     * Get the value of the column 'Classifier_guid'. <br />
     * {VARCHAR(40)}
     * @return The value of the column 'Classifier_guid'. (Nullable)
     */
    public String getClassifierGuid() {
        return _classifierGuid;
    }

    /**
     * Set the value of the column 'Classifier_guid'. <br />
     * {VARCHAR(40)}
     * @param classifierGuid The value of the column 'Classifier_guid'. (Nullable)
     */
    public void setClassifierGuid(String classifierGuid) {
        _modifiedProperties.addPropertyName("classifierGuid");
        this._classifierGuid = classifierGuid;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String tpos_COLUMN = "TPos";

    /**
     * Get the value of the column 'TPos'. <br />
     * {INTEGER}
     * @return The value of the column 'TPos'. (Nullable)
     */
    public java.lang.Integer getTpos() {
        return _tpos;
    }

    /**
     * Set the value of the column 'TPos'. <br />
     * {INTEGER}
     * @param tpos The value of the column 'TPos'. (Nullable)
     */
    public void setTpos(java.lang.Integer tpos) {
        _modifiedProperties.addPropertyName("tpos");
        this._tpos = tpos;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String isroot_COLUMN = "IsRoot";

    /**
     * Get the value of the column 'IsRoot'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'IsRoot'. (Nullable)
     */
    public Boolean getIsroot() {
        return _isroot;
    }

    /**
     * Set the value of the column 'IsRoot'. <br />
     * {BIT : NotNull}
     * @param isroot The value of the column 'IsRoot'. (Nullable)
     */
    public void setIsroot(Boolean isroot) {
        _modifiedProperties.addPropertyName("isroot");
        this._isroot = isroot;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String isleaf_COLUMN = "IsLeaf";

    /**
     * Get the value of the column 'IsLeaf'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'IsLeaf'. (Nullable)
     */
    public Boolean getIsleaf() {
        return _isleaf;
    }

    /**
     * Set the value of the column 'IsLeaf'. <br />
     * {BIT : NotNull}
     * @param isleaf The value of the column 'IsLeaf'. (Nullable)
     */
    public void setIsleaf(Boolean isleaf) {
        _modifiedProperties.addPropertyName("isleaf");
        this._isleaf = isleaf;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String isspec_COLUMN = "IsSpec";

    /**
     * Get the value of the column 'IsSpec'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'IsSpec'. (Nullable)
     */
    public Boolean getIsspec() {
        return _isspec;
    }

    /**
     * Set the value of the column 'IsSpec'. <br />
     * {BIT : NotNull}
     * @param isspec The value of the column 'IsSpec'. (Nullable)
     */
    public void setIsspec(Boolean isspec) {
        _modifiedProperties.addPropertyName("isspec");
        this._isspec = isspec;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String isactive_COLUMN = "IsActive";

    /**
     * Get the value of the column 'IsActive'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'IsActive'. (Nullable)
     */
    public Boolean getIsactive() {
        return _isactive;
    }

    /**
     * Set the value of the column 'IsActive'. <br />
     * {BIT : NotNull}
     * @param isactive The value of the column 'IsActive'. (Nullable)
     */
    public void setIsactive(Boolean isactive) {
        _modifiedProperties.addPropertyName("isactive");
        this._isactive = isactive;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String stateflags_COLUMN = "StateFlags";

    /**
     * Get the value of the column 'StateFlags'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'StateFlags'. (Nullable)
     */
    public String getStateflags() {
        return _stateflags;
    }

    /**
     * Set the value of the column 'StateFlags'. <br />
     * {VARCHAR(255)}
     * @param stateflags The value of the column 'StateFlags'. (Nullable)
     */
    public void setStateflags(String stateflags) {
        _modifiedProperties.addPropertyName("stateflags");
        this._stateflags = stateflags;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String packageflags_COLUMN = "PackageFlags";

    /**
     * Get the value of the column 'PackageFlags'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PackageFlags'. (Nullable)
     */
    public String getPackageflags() {
        return _packageflags;
    }

    /**
     * Set the value of the column 'PackageFlags'. <br />
     * {VARCHAR(255)}
     * @param packageflags The value of the column 'PackageFlags'. (Nullable)
     */
    public void setPackageflags(String packageflags) {
        _modifiedProperties.addPropertyName("packageflags");
        this._packageflags = packageflags;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String multiplicity_COLUMN = "Multiplicity";

    /**
     * Get the value of the column 'Multiplicity'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Multiplicity'. (Nullable)
     */
    public String getMultiplicity() {
        return _multiplicity;
    }

    /**
     * Set the value of the column 'Multiplicity'. <br />
     * {VARCHAR(50)}
     * @param multiplicity The value of the column 'Multiplicity'. (Nullable)
     */
    public void setMultiplicity(String multiplicity) {
        _modifiedProperties.addPropertyName("multiplicity");
        this._multiplicity = multiplicity;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String styleex_COLUMN = "StyleEx";

    /**
     * Get the value of the column 'StyleEx'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'StyleEx'. (Nullable)
     */
    public String getStyleex() {
        return _styleex;
    }

    /**
     * Set the value of the column 'StyleEx'. <br />
     * {LONGCHAR(2147483647)}
     * @param styleex The value of the column 'StyleEx'. (Nullable)
     */
    public void setStyleex(String styleex) {
        _modifiedProperties.addPropertyName("styleex");
        this._styleex = styleex;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String actionflags_COLUMN = "ActionFlags";

    /**
     * Get the value of the column 'ActionFlags'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'ActionFlags'. (Nullable)
     */
    public String getActionflags() {
        return _actionflags;
    }

    /**
     * Set the value of the column 'ActionFlags'. <br />
     * {VARCHAR(255)}
     * @param actionflags The value of the column 'ActionFlags'. (Nullable)
     */
    public void setActionflags(String actionflags) {
        _modifiedProperties.addPropertyName("actionflags");
        this._actionflags = actionflags;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String eventflags_COLUMN = "EventFlags";

    /**
     * Get the value of the column 'EventFlags'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'EventFlags'. (Nullable)
     */
    public String getEventflags() {
        return _eventflags;
    }

    /**
     * Set the value of the column 'EventFlags'. <br />
     * {VARCHAR(255)}
     * @param eventflags The value of the column 'EventFlags'. (Nullable)
     */
    public void setEventflags(String eventflags) {
        _modifiedProperties.addPropertyName("eventflags");
        this._eventflags = eventflags;
    }

}
