package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;
import jp.sourceforge.ea2ddl.dao.exentity.*;

/**
 * The entity of t_object that the type is TABLE. <br />
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
public abstract class BsTObject implements Entity, Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** Object_ID: {PK : UQ : NotNull : COUNTER} */
    protected java.lang.Integer _objectId;

    /** Object_Type: {VARCHAR(255)} */
    protected String _objectType;

    /** Diagram_ID: {INTEGER} */
    protected java.lang.Integer _diagramId;

    /** Name: {VARCHAR(255)} */
    protected String _name;

    /** Alias: {VARCHAR(255)} */
    protected String _alias;

    /** Author: {VARCHAR(255)} */
    protected String _author;

    /** Version: {VARCHAR(50)} */
    protected String _version;

    /** Note: {LONGCHAR(2147483647)} */
    protected String _note;

    /** Package_ID: {INTEGER} */
    protected java.lang.Integer _packageId;

    /** Stereotype: {VARCHAR(255)} */
    protected String _stereotype;

    /** NType: {INTEGER} */
    protected java.lang.Integer _ntype;

    /** Complexity: {VARCHAR(50)} */
    protected String _complexity;

    /** Effort: {INTEGER} */
    protected java.lang.Integer _effort;

    /** Style: {VARCHAR(255)} */
    protected String _style;

    /** Backcolor: {INTEGER} */
    protected java.lang.Integer _backcolor;

    /** BorderStyle: {INTEGER} */
    protected java.lang.Integer _borderstyle;

    /** BorderWidth: {INTEGER} */
    protected java.lang.Integer _borderwidth;

    /** Fontcolor: {INTEGER} */
    protected java.lang.Integer _fontcolor;

    /** Bordercolor: {INTEGER} */
    protected java.lang.Integer _bordercolor;

    /** CreatedDate: {DATETIME} */
    protected java.sql.Timestamp _createddate;

    /** ModifiedDate: {DATETIME} */
    protected java.sql.Timestamp _modifieddate;

    /** Status: {VARCHAR(50)} */
    protected String _status;

    /** Tagged: {INTEGER} */
    protected java.lang.Integer _tagged;

    /** PDATA1: {VARCHAR(255)} */
    protected String _pdata1;

    /** PDATA2: {VARCHAR(255)} */
    protected String _pdata2;

    /** PDATA3: {VARCHAR(255)} */
    protected String _pdata3;

    /** PDATA4: {VARCHAR(255)} */
    protected String _pdata4;

    /** PDATA5: {VARCHAR(255)} */
    protected String _pdata5;

    /** Concurrency: {VARCHAR(50)} */
    protected String _concurrency;

    /** Visibility: {VARCHAR(50)} */
    protected String _visibility;

    /** Persistence: {VARCHAR(50)} */
    protected String _persistence;

    /** Cardinality: {VARCHAR(50)} */
    protected String _cardinality;

    /** GenType: {VARCHAR(50)} */
    protected String _gentype;

    /** GenFile: {VARCHAR(255)} */
    protected String _genfile;

    /** Header1: {LONGCHAR(2147483647)} */
    protected String _header1;

    /** Header2: {LONGCHAR(2147483647)} */
    protected String _header2;

    /** Phase: {VARCHAR(50)} */
    protected String _phase;

    /** Scope: {VARCHAR(25)} */
    protected String _scope;

    /** GenOption: {LONGCHAR(2147483647)} */
    protected String _genoption;

    /** GenLinks: {LONGCHAR(2147483647)} */
    protected String _genlinks;

    /** Classifier: {INTEGER} */
    protected java.lang.Integer _classifier;

    /** ea_guid: {UQ : VARCHAR(40)} */
    protected String _eaGuid;

    /** ParentID: {INTEGER} */
    protected java.lang.Integer _parentid;

    /** RunState: {LONGCHAR(2147483647)} */
    protected String _runstate;

    /** Classifier_guid: {VARCHAR(40)} */
    protected String _classifierGuid;

    /** TPos: {INTEGER} */
    protected java.lang.Integer _tpos;

    /** IsRoot: {NotNull : BIT} */
    protected Boolean _isroot;

    /** IsLeaf: {NotNull : BIT} */
    protected Boolean _isleaf;

    /** IsSpec: {NotNull : BIT} */
    protected Boolean _isspec;

    /** IsActive: {NotNull : BIT} */
    protected Boolean _isactive;

    /** StateFlags: {VARCHAR(255)} */
    protected String _stateflags;

    /** PackageFlags: {VARCHAR(255)} */
    protected String _packageflags;

    /** Multiplicity: {VARCHAR(50)} */
    protected String _multiplicity;

    /** StyleEx: {LONGCHAR(2147483647)} */
    protected String _styleex;

    /** ActionFlags: {VARCHAR(255)} */
    protected String _actionflags;

    /** EventFlags: {VARCHAR(255)} */
    protected String _eventflags;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_object";
    }

    public String getTablePropertyName() { // as JavaBeansRule
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
    /** t_objectproperties as 'TObjectpropertiesList'. */
    protected List<TObjectproperties> _childrenTObjectpropertiesList;

    /**
     * t_objectproperties as 'TObjectpropertiesList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'TObjectpropertiesList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TObjectproperties> getTObjectpropertiesList() {
        if (_childrenTObjectpropertiesList == null) { _childrenTObjectpropertiesList = new ArrayList<TObjectproperties>(); }
        return _childrenTObjectpropertiesList;
    }

    /**
     * t_objectproperties as 'TObjectpropertiesList'.
     * @param tObjectpropertiesList The entity list of referrer property 'TObjectpropertiesList'. (Nullable)
     */
    public void setTObjectpropertiesList(List<TObjectproperties> tObjectpropertiesList) {
        _childrenTObjectpropertiesList = tObjectpropertiesList;
    }

    /** t_attribute as 'TAttributeList'. */
    protected List<TAttribute> _childrenTAttributeList;

    /**
     * t_attribute as 'TAttributeList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'TAttributeList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TAttribute> getTAttributeList() {
        if (_childrenTAttributeList == null) { _childrenTAttributeList = new ArrayList<TAttribute>(); }
        return _childrenTAttributeList;
    }

    /**
     * t_attribute as 'TAttributeList'.
     * @param tAttributeList The entity list of referrer property 'TAttributeList'. (Nullable)
     */
    public void setTAttributeList(List<TAttribute> tAttributeList) {
        _childrenTAttributeList = tAttributeList;
    }

    /** t_operation as 'TOperationList'. */
    protected List<TOperation> _childrenTOperationList;

    /**
     * t_operation as 'TOperationList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'TOperationList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TOperation> getTOperationList() {
        if (_childrenTOperationList == null) { _childrenTOperationList = new ArrayList<TOperation>(); }
        return _childrenTOperationList;
    }

    /**
     * t_operation as 'TOperationList'.
     * @param tOperationList The entity list of referrer property 'TOperationList'. (Nullable)
     */
    public void setTOperationList(List<TOperation> tOperationList) {
        _childrenTOperationList = tOperationList;
    }

    /** t_connector as 'TConnectorByStartObjectIdList'. */
    protected List<TConnector> _childrenTConnectorByStartObjectIdList;

    /**
     * t_connector as 'TConnectorByStartObjectIdList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'TConnectorByStartObjectIdList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TConnector> getTConnectorByStartObjectIdList() {
        if (_childrenTConnectorByStartObjectIdList == null) { _childrenTConnectorByStartObjectIdList = new ArrayList<TConnector>(); }
        return _childrenTConnectorByStartObjectIdList;
    }

    /**
     * t_connector as 'TConnectorByStartObjectIdList'.
     * @param tConnectorByStartObjectIdList The entity list of referrer property 'TConnectorByStartObjectIdList'. (Nullable)
     */
    public void setTConnectorByStartObjectIdList(List<TConnector> tConnectorByStartObjectIdList) {
        _childrenTConnectorByStartObjectIdList = tConnectorByStartObjectIdList;
    }

    /** t_connector as 'TConnectorByEndObjectIdList'. */
    protected List<TConnector> _childrenTConnectorByEndObjectIdList;

    /**
     * t_connector as 'TConnectorByEndObjectIdList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'TConnectorByEndObjectIdList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TConnector> getTConnectorByEndObjectIdList() {
        if (_childrenTConnectorByEndObjectIdList == null) { _childrenTConnectorByEndObjectIdList = new ArrayList<TConnector>(); }
        return _childrenTConnectorByEndObjectIdList;
    }

    /**
     * t_connector as 'TConnectorByEndObjectIdList'.
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
    /**
     * Object_ID: {PK : UQ : NotNull : COUNTER} <br />
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Object_ID: {PK : UQ : NotNull : COUNTER} <br />
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /**
     * Object_Type: {VARCHAR(255)} <br />
     * @return The value of the column 'Object_Type'. (Nullable)
     */
    public String getObjectType() {
        return _objectType;
    }

    /**
     * Object_Type: {VARCHAR(255)} <br />
     * @param objectType The value of the column 'Object_Type'. (Nullable)
     */
    public void setObjectType(String objectType) {
        _modifiedProperties.addPropertyName("objectType");
        this._objectType = objectType;
    }

    /**
     * Diagram_ID: {INTEGER} <br />
     * @return The value of the column 'Diagram_ID'. (Nullable)
     */
    public java.lang.Integer getDiagramId() {
        return _diagramId;
    }

    /**
     * Diagram_ID: {INTEGER} <br />
     * @param diagramId The value of the column 'Diagram_ID'. (Nullable)
     */
    public void setDiagramId(java.lang.Integer diagramId) {
        _modifiedProperties.addPropertyName("diagramId");
        this._diagramId = diagramId;
    }

    /**
     * Name: {VARCHAR(255)} <br />
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Name: {VARCHAR(255)} <br />
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /**
     * Alias: {VARCHAR(255)} <br />
     * @return The value of the column 'Alias'. (Nullable)
     */
    public String getAlias() {
        return _alias;
    }

    /**
     * Alias: {VARCHAR(255)} <br />
     * @param alias The value of the column 'Alias'. (Nullable)
     */
    public void setAlias(String alias) {
        _modifiedProperties.addPropertyName("alias");
        this._alias = alias;
    }

    /**
     * Author: {VARCHAR(255)} <br />
     * @return The value of the column 'Author'. (Nullable)
     */
    public String getAuthor() {
        return _author;
    }

    /**
     * Author: {VARCHAR(255)} <br />
     * @param author The value of the column 'Author'. (Nullable)
     */
    public void setAuthor(String author) {
        _modifiedProperties.addPropertyName("author");
        this._author = author;
    }

    /**
     * Version: {VARCHAR(50)} <br />
     * @return The value of the column 'Version'. (Nullable)
     */
    public String getVersion() {
        return _version;
    }

    /**
     * Version: {VARCHAR(50)} <br />
     * @param version The value of the column 'Version'. (Nullable)
     */
    public void setVersion(String version) {
        _modifiedProperties.addPropertyName("version");
        this._version = version;
    }

    /**
     * Note: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Note'. (Nullable)
     */
    public String getNote() {
        return _note;
    }

    /**
     * Note: {LONGCHAR(2147483647)} <br />
     * @param note The value of the column 'Note'. (Nullable)
     */
    public void setNote(String note) {
        _modifiedProperties.addPropertyName("note");
        this._note = note;
    }

    /**
     * Package_ID: {INTEGER} <br />
     * @return The value of the column 'Package_ID'. (Nullable)
     */
    public java.lang.Integer getPackageId() {
        return _packageId;
    }

    /**
     * Package_ID: {INTEGER} <br />
     * @param packageId The value of the column 'Package_ID'. (Nullable)
     */
    public void setPackageId(java.lang.Integer packageId) {
        _modifiedProperties.addPropertyName("packageId");
        this._packageId = packageId;
    }

    /**
     * Stereotype: {VARCHAR(255)} <br />
     * @return The value of the column 'Stereotype'. (Nullable)
     */
    public String getStereotype() {
        return _stereotype;
    }

    /**
     * Stereotype: {VARCHAR(255)} <br />
     * @param stereotype The value of the column 'Stereotype'. (Nullable)
     */
    public void setStereotype(String stereotype) {
        _modifiedProperties.addPropertyName("stereotype");
        this._stereotype = stereotype;
    }

    /**
     * NType: {INTEGER} <br />
     * @return The value of the column 'NType'. (Nullable)
     */
    public java.lang.Integer getNtype() {
        return _ntype;
    }

    /**
     * NType: {INTEGER} <br />
     * @param ntype The value of the column 'NType'. (Nullable)
     */
    public void setNtype(java.lang.Integer ntype) {
        _modifiedProperties.addPropertyName("ntype");
        this._ntype = ntype;
    }

    /**
     * Complexity: {VARCHAR(50)} <br />
     * @return The value of the column 'Complexity'. (Nullable)
     */
    public String getComplexity() {
        return _complexity;
    }

    /**
     * Complexity: {VARCHAR(50)} <br />
     * @param complexity The value of the column 'Complexity'. (Nullable)
     */
    public void setComplexity(String complexity) {
        _modifiedProperties.addPropertyName("complexity");
        this._complexity = complexity;
    }

    /**
     * Effort: {INTEGER} <br />
     * @return The value of the column 'Effort'. (Nullable)
     */
    public java.lang.Integer getEffort() {
        return _effort;
    }

    /**
     * Effort: {INTEGER} <br />
     * @param effort The value of the column 'Effort'. (Nullable)
     */
    public void setEffort(java.lang.Integer effort) {
        _modifiedProperties.addPropertyName("effort");
        this._effort = effort;
    }

    /**
     * Style: {VARCHAR(255)} <br />
     * @return The value of the column 'Style'. (Nullable)
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Style: {VARCHAR(255)} <br />
     * @param style The value of the column 'Style'. (Nullable)
     */
    public void setStyle(String style) {
        _modifiedProperties.addPropertyName("style");
        this._style = style;
    }

    /**
     * Backcolor: {INTEGER} <br />
     * @return The value of the column 'Backcolor'. (Nullable)
     */
    public java.lang.Integer getBackcolor() {
        return _backcolor;
    }

    /**
     * Backcolor: {INTEGER} <br />
     * @param backcolor The value of the column 'Backcolor'. (Nullable)
     */
    public void setBackcolor(java.lang.Integer backcolor) {
        _modifiedProperties.addPropertyName("backcolor");
        this._backcolor = backcolor;
    }

    /**
     * BorderStyle: {INTEGER} <br />
     * @return The value of the column 'BorderStyle'. (Nullable)
     */
    public java.lang.Integer getBorderstyle() {
        return _borderstyle;
    }

    /**
     * BorderStyle: {INTEGER} <br />
     * @param borderstyle The value of the column 'BorderStyle'. (Nullable)
     */
    public void setBorderstyle(java.lang.Integer borderstyle) {
        _modifiedProperties.addPropertyName("borderstyle");
        this._borderstyle = borderstyle;
    }

    /**
     * BorderWidth: {INTEGER} <br />
     * @return The value of the column 'BorderWidth'. (Nullable)
     */
    public java.lang.Integer getBorderwidth() {
        return _borderwidth;
    }

    /**
     * BorderWidth: {INTEGER} <br />
     * @param borderwidth The value of the column 'BorderWidth'. (Nullable)
     */
    public void setBorderwidth(java.lang.Integer borderwidth) {
        _modifiedProperties.addPropertyName("borderwidth");
        this._borderwidth = borderwidth;
    }

    /**
     * Fontcolor: {INTEGER} <br />
     * @return The value of the column 'Fontcolor'. (Nullable)
     */
    public java.lang.Integer getFontcolor() {
        return _fontcolor;
    }

    /**
     * Fontcolor: {INTEGER} <br />
     * @param fontcolor The value of the column 'Fontcolor'. (Nullable)
     */
    public void setFontcolor(java.lang.Integer fontcolor) {
        _modifiedProperties.addPropertyName("fontcolor");
        this._fontcolor = fontcolor;
    }

    /**
     * Bordercolor: {INTEGER} <br />
     * @return The value of the column 'Bordercolor'. (Nullable)
     */
    public java.lang.Integer getBordercolor() {
        return _bordercolor;
    }

    /**
     * Bordercolor: {INTEGER} <br />
     * @param bordercolor The value of the column 'Bordercolor'. (Nullable)
     */
    public void setBordercolor(java.lang.Integer bordercolor) {
        _modifiedProperties.addPropertyName("bordercolor");
        this._bordercolor = bordercolor;
    }

    /**
     * CreatedDate: {DATETIME} <br />
     * @return The value of the column 'CreatedDate'. (Nullable)
     */
    public java.sql.Timestamp getCreateddate() {
        return _createddate;
    }

    /**
     * CreatedDate: {DATETIME} <br />
     * @param createddate The value of the column 'CreatedDate'. (Nullable)
     */
    public void setCreateddate(java.sql.Timestamp createddate) {
        _modifiedProperties.addPropertyName("createddate");
        this._createddate = createddate;
    }

    /**
     * ModifiedDate: {DATETIME} <br />
     * @return The value of the column 'ModifiedDate'. (Nullable)
     */
    public java.sql.Timestamp getModifieddate() {
        return _modifieddate;
    }

    /**
     * ModifiedDate: {DATETIME} <br />
     * @param modifieddate The value of the column 'ModifiedDate'. (Nullable)
     */
    public void setModifieddate(java.sql.Timestamp modifieddate) {
        _modifiedProperties.addPropertyName("modifieddate");
        this._modifieddate = modifieddate;
    }

    /**
     * Status: {VARCHAR(50)} <br />
     * @return The value of the column 'Status'. (Nullable)
     */
    public String getStatus() {
        return _status;
    }

    /**
     * Status: {VARCHAR(50)} <br />
     * @param status The value of the column 'Status'. (Nullable)
     */
    public void setStatus(String status) {
        _modifiedProperties.addPropertyName("status");
        this._status = status;
    }

    /**
     * Tagged: {INTEGER} <br />
     * @return The value of the column 'Tagged'. (Nullable)
     */
    public java.lang.Integer getTagged() {
        return _tagged;
    }

    /**
     * Tagged: {INTEGER} <br />
     * @param tagged The value of the column 'Tagged'. (Nullable)
     */
    public void setTagged(java.lang.Integer tagged) {
        _modifiedProperties.addPropertyName("tagged");
        this._tagged = tagged;
    }

    /**
     * PDATA1: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA1'. (Nullable)
     */
    public String getPdata1() {
        return _pdata1;
    }

    /**
     * PDATA1: {VARCHAR(255)} <br />
     * @param pdata1 The value of the column 'PDATA1'. (Nullable)
     */
    public void setPdata1(String pdata1) {
        _modifiedProperties.addPropertyName("pdata1");
        this._pdata1 = pdata1;
    }

    /**
     * PDATA2: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA2'. (Nullable)
     */
    public String getPdata2() {
        return _pdata2;
    }

    /**
     * PDATA2: {VARCHAR(255)} <br />
     * @param pdata2 The value of the column 'PDATA2'. (Nullable)
     */
    public void setPdata2(String pdata2) {
        _modifiedProperties.addPropertyName("pdata2");
        this._pdata2 = pdata2;
    }

    /**
     * PDATA3: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA3'. (Nullable)
     */
    public String getPdata3() {
        return _pdata3;
    }

    /**
     * PDATA3: {VARCHAR(255)} <br />
     * @param pdata3 The value of the column 'PDATA3'. (Nullable)
     */
    public void setPdata3(String pdata3) {
        _modifiedProperties.addPropertyName("pdata3");
        this._pdata3 = pdata3;
    }

    /**
     * PDATA4: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA4'. (Nullable)
     */
    public String getPdata4() {
        return _pdata4;
    }

    /**
     * PDATA4: {VARCHAR(255)} <br />
     * @param pdata4 The value of the column 'PDATA4'. (Nullable)
     */
    public void setPdata4(String pdata4) {
        _modifiedProperties.addPropertyName("pdata4");
        this._pdata4 = pdata4;
    }

    /**
     * PDATA5: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA5'. (Nullable)
     */
    public String getPdata5() {
        return _pdata5;
    }

    /**
     * PDATA5: {VARCHAR(255)} <br />
     * @param pdata5 The value of the column 'PDATA5'. (Nullable)
     */
    public void setPdata5(String pdata5) {
        _modifiedProperties.addPropertyName("pdata5");
        this._pdata5 = pdata5;
    }

    /**
     * Concurrency: {VARCHAR(50)} <br />
     * @return The value of the column 'Concurrency'. (Nullable)
     */
    public String getConcurrency() {
        return _concurrency;
    }

    /**
     * Concurrency: {VARCHAR(50)} <br />
     * @param concurrency The value of the column 'Concurrency'. (Nullable)
     */
    public void setConcurrency(String concurrency) {
        _modifiedProperties.addPropertyName("concurrency");
        this._concurrency = concurrency;
    }

    /**
     * Visibility: {VARCHAR(50)} <br />
     * @return The value of the column 'Visibility'. (Nullable)
     */
    public String getVisibility() {
        return _visibility;
    }

    /**
     * Visibility: {VARCHAR(50)} <br />
     * @param visibility The value of the column 'Visibility'. (Nullable)
     */
    public void setVisibility(String visibility) {
        _modifiedProperties.addPropertyName("visibility");
        this._visibility = visibility;
    }

    /**
     * Persistence: {VARCHAR(50)} <br />
     * @return The value of the column 'Persistence'. (Nullable)
     */
    public String getPersistence() {
        return _persistence;
    }

    /**
     * Persistence: {VARCHAR(50)} <br />
     * @param persistence The value of the column 'Persistence'. (Nullable)
     */
    public void setPersistence(String persistence) {
        _modifiedProperties.addPropertyName("persistence");
        this._persistence = persistence;
    }

    /**
     * Cardinality: {VARCHAR(50)} <br />
     * @return The value of the column 'Cardinality'. (Nullable)
     */
    public String getCardinality() {
        return _cardinality;
    }

    /**
     * Cardinality: {VARCHAR(50)} <br />
     * @param cardinality The value of the column 'Cardinality'. (Nullable)
     */
    public void setCardinality(String cardinality) {
        _modifiedProperties.addPropertyName("cardinality");
        this._cardinality = cardinality;
    }

    /**
     * GenType: {VARCHAR(50)} <br />
     * @return The value of the column 'GenType'. (Nullable)
     */
    public String getGentype() {
        return _gentype;
    }

    /**
     * GenType: {VARCHAR(50)} <br />
     * @param gentype The value of the column 'GenType'. (Nullable)
     */
    public void setGentype(String gentype) {
        _modifiedProperties.addPropertyName("gentype");
        this._gentype = gentype;
    }

    /**
     * GenFile: {VARCHAR(255)} <br />
     * @return The value of the column 'GenFile'. (Nullable)
     */
    public String getGenfile() {
        return _genfile;
    }

    /**
     * GenFile: {VARCHAR(255)} <br />
     * @param genfile The value of the column 'GenFile'. (Nullable)
     */
    public void setGenfile(String genfile) {
        _modifiedProperties.addPropertyName("genfile");
        this._genfile = genfile;
    }

    /**
     * Header1: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Header1'. (Nullable)
     */
    public String getHeader1() {
        return _header1;
    }

    /**
     * Header1: {LONGCHAR(2147483647)} <br />
     * @param header1 The value of the column 'Header1'. (Nullable)
     */
    public void setHeader1(String header1) {
        _modifiedProperties.addPropertyName("header1");
        this._header1 = header1;
    }

    /**
     * Header2: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Header2'. (Nullable)
     */
    public String getHeader2() {
        return _header2;
    }

    /**
     * Header2: {LONGCHAR(2147483647)} <br />
     * @param header2 The value of the column 'Header2'. (Nullable)
     */
    public void setHeader2(String header2) {
        _modifiedProperties.addPropertyName("header2");
        this._header2 = header2;
    }

    /**
     * Phase: {VARCHAR(50)} <br />
     * @return The value of the column 'Phase'. (Nullable)
     */
    public String getPhase() {
        return _phase;
    }

    /**
     * Phase: {VARCHAR(50)} <br />
     * @param phase The value of the column 'Phase'. (Nullable)
     */
    public void setPhase(String phase) {
        _modifiedProperties.addPropertyName("phase");
        this._phase = phase;
    }

    /**
     * Scope: {VARCHAR(25)} <br />
     * @return The value of the column 'Scope'. (Nullable)
     */
    public String getScope() {
        return _scope;
    }

    /**
     * Scope: {VARCHAR(25)} <br />
     * @param scope The value of the column 'Scope'. (Nullable)
     */
    public void setScope(String scope) {
        _modifiedProperties.addPropertyName("scope");
        this._scope = scope;
    }

    /**
     * GenOption: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'GenOption'. (Nullable)
     */
    public String getGenoption() {
        return _genoption;
    }

    /**
     * GenOption: {LONGCHAR(2147483647)} <br />
     * @param genoption The value of the column 'GenOption'. (Nullable)
     */
    public void setGenoption(String genoption) {
        _modifiedProperties.addPropertyName("genoption");
        this._genoption = genoption;
    }

    /**
     * GenLinks: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'GenLinks'. (Nullable)
     */
    public String getGenlinks() {
        return _genlinks;
    }

    /**
     * GenLinks: {LONGCHAR(2147483647)} <br />
     * @param genlinks The value of the column 'GenLinks'. (Nullable)
     */
    public void setGenlinks(String genlinks) {
        _modifiedProperties.addPropertyName("genlinks");
        this._genlinks = genlinks;
    }

    /**
     * Classifier: {INTEGER} <br />
     * @return The value of the column 'Classifier'. (Nullable)
     */
    public java.lang.Integer getClassifier() {
        return _classifier;
    }

    /**
     * Classifier: {INTEGER} <br />
     * @param classifier The value of the column 'Classifier'. (Nullable)
     */
    public void setClassifier(java.lang.Integer classifier) {
        _modifiedProperties.addPropertyName("classifier");
        this._classifier = classifier;
    }

    /**
     * ea_guid: {UQ : VARCHAR(40)} <br />
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * ea_guid: {UQ : VARCHAR(40)} <br />
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
    }

    /**
     * ParentID: {INTEGER} <br />
     * @return The value of the column 'ParentID'. (Nullable)
     */
    public java.lang.Integer getParentid() {
        return _parentid;
    }

    /**
     * ParentID: {INTEGER} <br />
     * @param parentid The value of the column 'ParentID'. (Nullable)
     */
    public void setParentid(java.lang.Integer parentid) {
        _modifiedProperties.addPropertyName("parentid");
        this._parentid = parentid;
    }

    /**
     * RunState: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'RunState'. (Nullable)
     */
    public String getRunstate() {
        return _runstate;
    }

    /**
     * RunState: {LONGCHAR(2147483647)} <br />
     * @param runstate The value of the column 'RunState'. (Nullable)
     */
    public void setRunstate(String runstate) {
        _modifiedProperties.addPropertyName("runstate");
        this._runstate = runstate;
    }

    /**
     * Classifier_guid: {VARCHAR(40)} <br />
     * @return The value of the column 'Classifier_guid'. (Nullable)
     */
    public String getClassifierGuid() {
        return _classifierGuid;
    }

    /**
     * Classifier_guid: {VARCHAR(40)} <br />
     * @param classifierGuid The value of the column 'Classifier_guid'. (Nullable)
     */
    public void setClassifierGuid(String classifierGuid) {
        _modifiedProperties.addPropertyName("classifierGuid");
        this._classifierGuid = classifierGuid;
    }

    /**
     * TPos: {INTEGER} <br />
     * @return The value of the column 'TPos'. (Nullable)
     */
    public java.lang.Integer getTpos() {
        return _tpos;
    }

    /**
     * TPos: {INTEGER} <br />
     * @param tpos The value of the column 'TPos'. (Nullable)
     */
    public void setTpos(java.lang.Integer tpos) {
        _modifiedProperties.addPropertyName("tpos");
        this._tpos = tpos;
    }

    /**
     * IsRoot: {NotNull : BIT} <br />
     * @return The value of the column 'IsRoot'. (Nullable)
     */
    public Boolean getIsroot() {
        return _isroot;
    }

    /**
     * IsRoot: {NotNull : BIT} <br />
     * @param isroot The value of the column 'IsRoot'. (Nullable)
     */
    public void setIsroot(Boolean isroot) {
        _modifiedProperties.addPropertyName("isroot");
        this._isroot = isroot;
    }

    /**
     * IsLeaf: {NotNull : BIT} <br />
     * @return The value of the column 'IsLeaf'. (Nullable)
     */
    public Boolean getIsleaf() {
        return _isleaf;
    }

    /**
     * IsLeaf: {NotNull : BIT} <br />
     * @param isleaf The value of the column 'IsLeaf'. (Nullable)
     */
    public void setIsleaf(Boolean isleaf) {
        _modifiedProperties.addPropertyName("isleaf");
        this._isleaf = isleaf;
    }

    /**
     * IsSpec: {NotNull : BIT} <br />
     * @return The value of the column 'IsSpec'. (Nullable)
     */
    public Boolean getIsspec() {
        return _isspec;
    }

    /**
     * IsSpec: {NotNull : BIT} <br />
     * @param isspec The value of the column 'IsSpec'. (Nullable)
     */
    public void setIsspec(Boolean isspec) {
        _modifiedProperties.addPropertyName("isspec");
        this._isspec = isspec;
    }

    /**
     * IsActive: {NotNull : BIT} <br />
     * @return The value of the column 'IsActive'. (Nullable)
     */
    public Boolean getIsactive() {
        return _isactive;
    }

    /**
     * IsActive: {NotNull : BIT} <br />
     * @param isactive The value of the column 'IsActive'. (Nullable)
     */
    public void setIsactive(Boolean isactive) {
        _modifiedProperties.addPropertyName("isactive");
        this._isactive = isactive;
    }

    /**
     * StateFlags: {VARCHAR(255)} <br />
     * @return The value of the column 'StateFlags'. (Nullable)
     */
    public String getStateflags() {
        return _stateflags;
    }

    /**
     * StateFlags: {VARCHAR(255)} <br />
     * @param stateflags The value of the column 'StateFlags'. (Nullable)
     */
    public void setStateflags(String stateflags) {
        _modifiedProperties.addPropertyName("stateflags");
        this._stateflags = stateflags;
    }

    /**
     * PackageFlags: {VARCHAR(255)} <br />
     * @return The value of the column 'PackageFlags'. (Nullable)
     */
    public String getPackageflags() {
        return _packageflags;
    }

    /**
     * PackageFlags: {VARCHAR(255)} <br />
     * @param packageflags The value of the column 'PackageFlags'. (Nullable)
     */
    public void setPackageflags(String packageflags) {
        _modifiedProperties.addPropertyName("packageflags");
        this._packageflags = packageflags;
    }

    /**
     * Multiplicity: {VARCHAR(50)} <br />
     * @return The value of the column 'Multiplicity'. (Nullable)
     */
    public String getMultiplicity() {
        return _multiplicity;
    }

    /**
     * Multiplicity: {VARCHAR(50)} <br />
     * @param multiplicity The value of the column 'Multiplicity'. (Nullable)
     */
    public void setMultiplicity(String multiplicity) {
        _modifiedProperties.addPropertyName("multiplicity");
        this._multiplicity = multiplicity;
    }

    /**
     * StyleEx: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'StyleEx'. (Nullable)
     */
    public String getStyleex() {
        return _styleex;
    }

    /**
     * StyleEx: {LONGCHAR(2147483647)} <br />
     * @param styleex The value of the column 'StyleEx'. (Nullable)
     */
    public void setStyleex(String styleex) {
        _modifiedProperties.addPropertyName("styleex");
        this._styleex = styleex;
    }

    /**
     * ActionFlags: {VARCHAR(255)} <br />
     * @return The value of the column 'ActionFlags'. (Nullable)
     */
    public String getActionflags() {
        return _actionflags;
    }

    /**
     * ActionFlags: {VARCHAR(255)} <br />
     * @param actionflags The value of the column 'ActionFlags'. (Nullable)
     */
    public void setActionflags(String actionflags) {
        _modifiedProperties.addPropertyName("actionflags");
        this._actionflags = actionflags;
    }

    /**
     * EventFlags: {VARCHAR(255)} <br />
     * @return The value of the column 'EventFlags'. (Nullable)
     */
    public String getEventflags() {
        return _eventflags;
    }

    /**
     * EventFlags: {VARCHAR(255)} <br />
     * @param eventflags The value of the column 'EventFlags'. (Nullable)
     */
    public void setEventflags(String eventflags) {
        _modifiedProperties.addPropertyName("eventflags");
        this._eventflags = eventflags;
    }
}
