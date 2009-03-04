package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;
import jp.sourceforge.ea2ddl.dao.exentity.*;

/**
 * The entity of t_operation that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     OperationID
 * 
 * [column]
 *     OperationID, Object_ID, Name, Scope, Type, ReturnArray, Stereotype, IsStatic, Concurrency, Notes, Behaviour, GenOption, Pos, Style, Pure, Classifier, Code, IsRoot, IsLeaf, IsQuery, StateFlags, ea_guid, StyleEx
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
 *     t_object
 * 
 * [referrer-table]
 *     t_operationparams
 * 
 * [foreign-property]
 *     tObject
 * 
 * [referrer-property]
 *     tOperationparamsList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTOperation implements Entity, Serializable {

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
    /** OperationID: {PK : UQ : NotNull : COUNTER} */
    protected java.lang.Integer _operationid;

    /** Object_ID: {INTEGER} */
    protected java.lang.Integer _objectId;

    /** Name: {VARCHAR(255)} */
    protected String _name;

    /** Scope: {VARCHAR(50)} */
    protected String _scope;

    /** Type: {VARCHAR(255)} */
    protected String _type;

    /** ReturnArray: {VARCHAR(1)} */
    protected String _returnarray;

    /** Stereotype: {VARCHAR(50)} */
    protected String _stereotype;

    /** IsStatic: {VARCHAR(1)} */
    protected String _isstatic;

    /** Concurrency: {VARCHAR(50)} */
    protected String _concurrency;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** Behaviour: {LONGCHAR(2147483647)} */
    protected String _behaviour;

    /** GenOption: {LONGCHAR(2147483647)} */
    protected String _genoption;

    /** Pos: {INTEGER} */
    protected java.lang.Integer _pos;

    /** Style: {VARCHAR(255)} */
    protected String _style;

    /** Pure: {NotNull : BIT} */
    protected Boolean _pure;

    /** Classifier: {VARCHAR(50)} */
    protected String _classifier;

    /** Code: {LONGCHAR(2147483647)} */
    protected String _code;

    /** IsRoot: {NotNull : BIT} */
    protected Boolean _isroot;

    /** IsLeaf: {NotNull : BIT} */
    protected Boolean _isleaf;

    /** IsQuery: {NotNull : BIT} */
    protected Boolean _isquery;

    /** StateFlags: {VARCHAR(255)} */
    protected String _stateflags;

    /** ea_guid: {VARCHAR(50)} */
    protected String _eaGuid;

    /** StyleEx: {LONGCHAR(2147483647)} */
    protected String _styleex;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_operation";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TOperation";
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
    /** t_object as 'TObject'. */
    protected TObject _parentTObject;

    /**
     * t_object as 'TObject'. {without lazy-load}
     * @return The entity of foreign property 'TObject'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public TObject getTObject() {
        return _parentTObject;
    }

    /**
     * t_object as 'TObject'.
     * @param tObject The entity of foreign property 'TObject'. (Nullable)
     */
    public void setTObject(TObject tObject) {
        _parentTObject = tObject;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_operationparams as 'TOperationparamsList'. */
    protected List<TOperationparams> _childrenTOperationparamsList;

    /**
     * t_operationparams as 'TOperationparamsList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'TOperationparamsList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TOperationparams> getTOperationparamsList() {
        if (_childrenTOperationparamsList == null) { _childrenTOperationparamsList = new ArrayList<TOperationparams>(); }
        return _childrenTOperationparamsList;
    }

    /**
     * t_operationparams as 'TOperationparamsList'.
     * @param tOperationparamsList The entity list of referrer property 'TOperationparamsList'. (Nullable)
     */
    public void setTOperationparamsList(List<TOperationparams> tOperationparamsList) {
        _childrenTOperationparamsList = tOperationparamsList;
    }

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        if (_operationid == null) { return false; }
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
        if (other == null || !(other instanceof BsTOperation)) { return false; }
        BsTOperation otherEntity = (BsTOperation)other;
        if (!helpComparingValue(getOperationid(), otherEntity.getOperationid())) { return false; }
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
        if (this.getOperationid() != null) { result = result + getOperationid().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getOperationid());
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getScope());
        sb.append(delimiter).append(getType());
        sb.append(delimiter).append(getReturnarray());
        sb.append(delimiter).append(getStereotype());
        sb.append(delimiter).append(getIsstatic());
        sb.append(delimiter).append(getConcurrency());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getBehaviour());
        sb.append(delimiter).append(getGenoption());
        sb.append(delimiter).append(getPos());
        sb.append(delimiter).append(getStyle());
        sb.append(delimiter).append(getPure());
        sb.append(delimiter).append(getClassifier());
        sb.append(delimiter).append(getCode());
        sb.append(delimiter).append(getIsroot());
        sb.append(delimiter).append(getIsleaf());
        sb.append(delimiter).append(getIsquery());
        sb.append(delimiter).append(getStateflags());
        sb.append(delimiter).append(getEaGuid());
        sb.append(delimiter).append(getStyleex());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * OperationID: {PK : UQ : NotNull : COUNTER} <br />
     * @return The value of the column 'OperationID'. (Nullable)
     */
    public java.lang.Integer getOperationid() {
        return _operationid;
    }

    /**
     * OperationID: {PK : UQ : NotNull : COUNTER} <br />
     * @param operationid The value of the column 'OperationID'. (Nullable)
     */
    public void setOperationid(java.lang.Integer operationid) {
        _modifiedProperties.addPropertyName("operationid");
        this._operationid = operationid;
    }

    /**
     * Object_ID: {INTEGER} <br />
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Object_ID: {INTEGER} <br />
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
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
     * Scope: {VARCHAR(50)} <br />
     * @return The value of the column 'Scope'. (Nullable)
     */
    public String getScope() {
        return _scope;
    }

    /**
     * Scope: {VARCHAR(50)} <br />
     * @param scope The value of the column 'Scope'. (Nullable)
     */
    public void setScope(String scope) {
        _modifiedProperties.addPropertyName("scope");
        this._scope = scope;
    }

    /**
     * Type: {VARCHAR(255)} <br />
     * @return The value of the column 'Type'. (Nullable)
     */
    public String getType() {
        return _type;
    }

    /**
     * Type: {VARCHAR(255)} <br />
     * @param type The value of the column 'Type'. (Nullable)
     */
    public void setType(String type) {
        _modifiedProperties.addPropertyName("type");
        this._type = type;
    }

    /**
     * ReturnArray: {VARCHAR(1)} <br />
     * @return The value of the column 'ReturnArray'. (Nullable)
     */
    public String getReturnarray() {
        return _returnarray;
    }

    /**
     * ReturnArray: {VARCHAR(1)} <br />
     * @param returnarray The value of the column 'ReturnArray'. (Nullable)
     */
    public void setReturnarray(String returnarray) {
        _modifiedProperties.addPropertyName("returnarray");
        this._returnarray = returnarray;
    }

    /**
     * Stereotype: {VARCHAR(50)} <br />
     * @return The value of the column 'Stereotype'. (Nullable)
     */
    public String getStereotype() {
        return _stereotype;
    }

    /**
     * Stereotype: {VARCHAR(50)} <br />
     * @param stereotype The value of the column 'Stereotype'. (Nullable)
     */
    public void setStereotype(String stereotype) {
        _modifiedProperties.addPropertyName("stereotype");
        this._stereotype = stereotype;
    }

    /**
     * IsStatic: {VARCHAR(1)} <br />
     * @return The value of the column 'IsStatic'. (Nullable)
     */
    public String getIsstatic() {
        return _isstatic;
    }

    /**
     * IsStatic: {VARCHAR(1)} <br />
     * @param isstatic The value of the column 'IsStatic'. (Nullable)
     */
    public void setIsstatic(String isstatic) {
        _modifiedProperties.addPropertyName("isstatic");
        this._isstatic = isstatic;
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
     * Notes: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Notes'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * Notes: {LONGCHAR(2147483647)} <br />
     * @param notes The value of the column 'Notes'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

    /**
     * Behaviour: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Behaviour'. (Nullable)
     */
    public String getBehaviour() {
        return _behaviour;
    }

    /**
     * Behaviour: {LONGCHAR(2147483647)} <br />
     * @param behaviour The value of the column 'Behaviour'. (Nullable)
     */
    public void setBehaviour(String behaviour) {
        _modifiedProperties.addPropertyName("behaviour");
        this._behaviour = behaviour;
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
     * Pos: {INTEGER} <br />
     * @return The value of the column 'Pos'. (Nullable)
     */
    public java.lang.Integer getPos() {
        return _pos;
    }

    /**
     * Pos: {INTEGER} <br />
     * @param pos The value of the column 'Pos'. (Nullable)
     */
    public void setPos(java.lang.Integer pos) {
        _modifiedProperties.addPropertyName("pos");
        this._pos = pos;
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
     * Pure: {NotNull : BIT} <br />
     * @return The value of the column 'Pure'. (Nullable)
     */
    public Boolean getPure() {
        return _pure;
    }

    /**
     * Pure: {NotNull : BIT} <br />
     * @param pure The value of the column 'Pure'. (Nullable)
     */
    public void setPure(Boolean pure) {
        _modifiedProperties.addPropertyName("pure");
        this._pure = pure;
    }

    /**
     * Classifier: {VARCHAR(50)} <br />
     * @return The value of the column 'Classifier'. (Nullable)
     */
    public String getClassifier() {
        return _classifier;
    }

    /**
     * Classifier: {VARCHAR(50)} <br />
     * @param classifier The value of the column 'Classifier'. (Nullable)
     */
    public void setClassifier(String classifier) {
        _modifiedProperties.addPropertyName("classifier");
        this._classifier = classifier;
    }

    /**
     * Code: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Code'. (Nullable)
     */
    public String getCode() {
        return _code;
    }

    /**
     * Code: {LONGCHAR(2147483647)} <br />
     * @param code The value of the column 'Code'. (Nullable)
     */
    public void setCode(String code) {
        _modifiedProperties.addPropertyName("code");
        this._code = code;
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
     * IsQuery: {NotNull : BIT} <br />
     * @return The value of the column 'IsQuery'. (Nullable)
     */
    public Boolean getIsquery() {
        return _isquery;
    }

    /**
     * IsQuery: {NotNull : BIT} <br />
     * @param isquery The value of the column 'IsQuery'. (Nullable)
     */
    public void setIsquery(Boolean isquery) {
        _modifiedProperties.addPropertyName("isquery");
        this._isquery = isquery;
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
     * ea_guid: {VARCHAR(50)} <br />
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * ea_guid: {VARCHAR(50)} <br />
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
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
}
