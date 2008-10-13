package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_operation(TABLE).
 * <pre>
 * [primary-key]
 *     
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
 *     
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsTOperation implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_operation. */
    public static final String TABLE = "t_operation";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'OperationID'. {UQ : COUNTER : NotNull} */
    protected java.lang.Integer _operationid;

    /** The attribute of the column 'Object_ID'. {INTEGER} */
    protected java.lang.Integer _objectId;

    /** The attribute of the column 'Name'. {VARCHAR(255)} */
    protected String _name;

    /** The attribute of the column 'Scope'. {VARCHAR(50)} */
    protected String _scope;

    /** The attribute of the column 'Type'. {VARCHAR(255)} */
    protected String _type;

    /** The attribute of the column 'ReturnArray'. {VARCHAR(1)} */
    protected String _returnarray;

    /** The attribute of the column 'Stereotype'. {VARCHAR(50)} */
    protected String _stereotype;

    /** The attribute of the column 'IsStatic'. {VARCHAR(1)} */
    protected String _isstatic;

    /** The attribute of the column 'Concurrency'. {VARCHAR(50)} */
    protected String _concurrency;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'Behaviour'. {LONGCHAR(2147483647)} */
    protected String _behaviour;

    /** The attribute of the column 'GenOption'. {LONGCHAR(2147483647)} */
    protected String _genoption;

    /** The attribute of the column 'Pos'. {INTEGER} */
    protected java.lang.Integer _pos;

    /** The attribute of the column 'Style'. {VARCHAR(255)} */
    protected String _style;

    /** The attribute of the column 'Pure'. {BIT : NotNull} */
    protected Boolean _pure;

    /** The attribute of the column 'Classifier'. {VARCHAR(50)} */
    protected String _classifier;

    /** The attribute of the column 'Code'. {LONGCHAR(2147483647)} */
    protected String _code;

    /** The attribute of the column 'IsRoot'. {BIT : NotNull} */
    protected Boolean _isroot;

    /** The attribute of the column 'IsLeaf'. {BIT : NotNull} */
    protected Boolean _isleaf;

    /** The attribute of the column 'IsQuery'. {BIT : NotNull} */
    protected Boolean _isquery;

    /** The attribute of the column 'StateFlags'. {VARCHAR(255)} */
    protected String _stateflags;

    /** The attribute of the column 'ea_guid'. {VARCHAR(50)} */
    protected String _eaGuid;

    /** The attribute of the column 'StyleEx'. {LONGCHAR(2147483647)} */
    protected String _styleex;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTOperation() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_operation";
    }

    public String getTablePropertyName() {// as JavaBeansRule
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        return false;
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
     * If the all-column value of the other is same as this one, returns true.
     * @param other Other entity. (Nullable)
     * @return Comparing result. If other is null, returns false.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTOperation)) { return false; }
        final BsTOperation otherEntity = (BsTOperation)other;
        if (!helpComparingValue(getOperationid(), otherEntity.getOperationid())) { return false; }
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getScope(), otherEntity.getScope())) { return false; }
        if (!helpComparingValue(getType(), otherEntity.getType())) { return false; }
        if (!helpComparingValue(getReturnarray(), otherEntity.getReturnarray())) { return false; }
        if (!helpComparingValue(getStereotype(), otherEntity.getStereotype())) { return false; }
        if (!helpComparingValue(getIsstatic(), otherEntity.getIsstatic())) { return false; }
        if (!helpComparingValue(getConcurrency(), otherEntity.getConcurrency())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getBehaviour(), otherEntity.getBehaviour())) { return false; }
        if (!helpComparingValue(getGenoption(), otherEntity.getGenoption())) { return false; }
        if (!helpComparingValue(getPos(), otherEntity.getPos())) { return false; }
        if (!helpComparingValue(getStyle(), otherEntity.getStyle())) { return false; }
        if (!helpComparingValue(getPure(), otherEntity.getPure())) { return false; }
        if (!helpComparingValue(getClassifier(), otherEntity.getClassifier())) { return false; }
        if (!helpComparingValue(getCode(), otherEntity.getCode())) { return false; }
        if (!helpComparingValue(getIsroot(), otherEntity.getIsroot())) { return false; }
        if (!helpComparingValue(getIsleaf(), otherEntity.getIsleaf())) { return false; }
        if (!helpComparingValue(getIsquery(), otherEntity.getIsquery())) { return false; }
        if (!helpComparingValue(getStateflags(), otherEntity.getStateflags())) { return false; }
        if (!helpComparingValue(getEaGuid(), otherEntity.getEaGuid())) { return false; }
        if (!helpComparingValue(getStyleex(), otherEntity.getStyleex())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * Calculates hash-code from all columns.
     * @return Hash-code from all-columns.
     */
    public int hashCode() {
        int result = 17;
        if (this.getOperationid() != null) { result = result + this.getOperationid().hashCode(); }
        if (this.getObjectId() != null) { result = result + this.getObjectId().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getScope() != null) { result = result + this.getScope().hashCode(); }
        if (this.getType() != null) { result = result + this.getType().hashCode(); }
        if (this.getReturnarray() != null) { result = result + this.getReturnarray().hashCode(); }
        if (this.getStereotype() != null) { result = result + this.getStereotype().hashCode(); }
        if (this.getIsstatic() != null) { result = result + this.getIsstatic().hashCode(); }
        if (this.getConcurrency() != null) { result = result + this.getConcurrency().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getBehaviour() != null) { result = result + this.getBehaviour().hashCode(); }
        if (this.getGenoption() != null) { result = result + this.getGenoption().hashCode(); }
        if (this.getPos() != null) { result = result + this.getPos().hashCode(); }
        if (this.getStyle() != null) { result = result + this.getStyle().hashCode(); }
        if (this.getPure() != null) { result = result + this.getPure().hashCode(); }
        if (this.getClassifier() != null) { result = result + this.getClassifier().hashCode(); }
        if (this.getCode() != null) { result = result + this.getCode().hashCode(); }
        if (this.getIsroot() != null) { result = result + this.getIsroot().hashCode(); }
        if (this.getIsleaf() != null) { result = result + this.getIsleaf().hashCode(); }
        if (this.getIsquery() != null) { result = result + this.getIsquery().hashCode(); }
        if (this.getStateflags() != null) { result = result + this.getStateflags().hashCode(); }
        if (this.getEaGuid() != null) { result = result + this.getEaGuid().hashCode(); }
        if (this.getStyleex() != null) { result = result + this.getStyleex().hashCode(); }
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

    /** The column annotation for S2Dao. {UQ : COUNTER : NotNull} */
    public static final String operationid_COLUMN = "OperationID";

    /**
     * Get the value of the column 'OperationID'. <br />
     * {UQ : COUNTER : NotNull}
     * @return The value of the column 'OperationID'. (Nullable)
     */
    public java.lang.Integer getOperationid() {
        return _operationid;
    }

    /**
     * Set the value of the column 'OperationID'. <br />
     * {UQ : COUNTER : NotNull}
     * @param operationid The value of the column 'OperationID'. (Nullable)
     */
    public void setOperationid(java.lang.Integer operationid) {
        _modifiedProperties.addPropertyName("operationid");
        this._operationid = operationid;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String objectId_COLUMN = "Object_ID";

    /**
     * Get the value of the column 'Object_ID'. <br />
     * {INTEGER}
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Set the value of the column 'Object_ID'. <br />
     * {INTEGER}
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
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

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String scope_COLUMN = "Scope";

    /**
     * Get the value of the column 'Scope'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Scope'. (Nullable)
     */
    public String getScope() {
        return _scope;
    }

    /**
     * Set the value of the column 'Scope'. <br />
     * {VARCHAR(50)}
     * @param scope The value of the column 'Scope'. (Nullable)
     */
    public void setScope(String scope) {
        _modifiedProperties.addPropertyName("scope");
        this._scope = scope;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String type_COLUMN = "Type";

    /**
     * Get the value of the column 'Type'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Type'. (Nullable)
     */
    public String getType() {
        return _type;
    }

    /**
     * Set the value of the column 'Type'. <br />
     * {VARCHAR(255)}
     * @param type The value of the column 'Type'. (Nullable)
     */
    public void setType(String type) {
        _modifiedProperties.addPropertyName("type");
        this._type = type;
    }

    /** The column annotation for S2Dao. {VARCHAR(1)} */
    public static final String returnarray_COLUMN = "ReturnArray";

    /**
     * Get the value of the column 'ReturnArray'. <br />
     * {VARCHAR(1)}
     * @return The value of the column 'ReturnArray'. (Nullable)
     */
    public String getReturnarray() {
        return _returnarray;
    }

    /**
     * Set the value of the column 'ReturnArray'. <br />
     * {VARCHAR(1)}
     * @param returnarray The value of the column 'ReturnArray'. (Nullable)
     */
    public void setReturnarray(String returnarray) {
        _modifiedProperties.addPropertyName("returnarray");
        this._returnarray = returnarray;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String stereotype_COLUMN = "Stereotype";

    /**
     * Get the value of the column 'Stereotype'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Stereotype'. (Nullable)
     */
    public String getStereotype() {
        return _stereotype;
    }

    /**
     * Set the value of the column 'Stereotype'. <br />
     * {VARCHAR(50)}
     * @param stereotype The value of the column 'Stereotype'. (Nullable)
     */
    public void setStereotype(String stereotype) {
        _modifiedProperties.addPropertyName("stereotype");
        this._stereotype = stereotype;
    }

    /** The column annotation for S2Dao. {VARCHAR(1)} */
    public static final String isstatic_COLUMN = "IsStatic";

    /**
     * Get the value of the column 'IsStatic'. <br />
     * {VARCHAR(1)}
     * @return The value of the column 'IsStatic'. (Nullable)
     */
    public String getIsstatic() {
        return _isstatic;
    }

    /**
     * Set the value of the column 'IsStatic'. <br />
     * {VARCHAR(1)}
     * @param isstatic The value of the column 'IsStatic'. (Nullable)
     */
    public void setIsstatic(String isstatic) {
        _modifiedProperties.addPropertyName("isstatic");
        this._isstatic = isstatic;
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

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String notes_COLUMN = "Notes";

    /**
     * Get the value of the column 'Notes'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Notes'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * Set the value of the column 'Notes'. <br />
     * {LONGCHAR(2147483647)}
     * @param notes The value of the column 'Notes'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String behaviour_COLUMN = "Behaviour";

    /**
     * Get the value of the column 'Behaviour'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Behaviour'. (Nullable)
     */
    public String getBehaviour() {
        return _behaviour;
    }

    /**
     * Set the value of the column 'Behaviour'. <br />
     * {LONGCHAR(2147483647)}
     * @param behaviour The value of the column 'Behaviour'. (Nullable)
     */
    public void setBehaviour(String behaviour) {
        _modifiedProperties.addPropertyName("behaviour");
        this._behaviour = behaviour;
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

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String pos_COLUMN = "Pos";

    /**
     * Get the value of the column 'Pos'. <br />
     * {INTEGER}
     * @return The value of the column 'Pos'. (Nullable)
     */
    public java.lang.Integer getPos() {
        return _pos;
    }

    /**
     * Set the value of the column 'Pos'. <br />
     * {INTEGER}
     * @param pos The value of the column 'Pos'. (Nullable)
     */
    public void setPos(java.lang.Integer pos) {
        _modifiedProperties.addPropertyName("pos");
        this._pos = pos;
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

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String pure_COLUMN = "Pure";

    /**
     * Get the value of the column 'Pure'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Pure'. (Nullable)
     */
    public Boolean getPure() {
        return _pure;
    }

    /**
     * Set the value of the column 'Pure'. <br />
     * {BIT : NotNull}
     * @param pure The value of the column 'Pure'. (Nullable)
     */
    public void setPure(Boolean pure) {
        _modifiedProperties.addPropertyName("pure");
        this._pure = pure;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String classifier_COLUMN = "Classifier";

    /**
     * Get the value of the column 'Classifier'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Classifier'. (Nullable)
     */
    public String getClassifier() {
        return _classifier;
    }

    /**
     * Set the value of the column 'Classifier'. <br />
     * {VARCHAR(50)}
     * @param classifier The value of the column 'Classifier'. (Nullable)
     */
    public void setClassifier(String classifier) {
        _modifiedProperties.addPropertyName("classifier");
        this._classifier = classifier;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String code_COLUMN = "Code";

    /**
     * Get the value of the column 'Code'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Code'. (Nullable)
     */
    public String getCode() {
        return _code;
    }

    /**
     * Set the value of the column 'Code'. <br />
     * {LONGCHAR(2147483647)}
     * @param code The value of the column 'Code'. (Nullable)
     */
    public void setCode(String code) {
        _modifiedProperties.addPropertyName("code");
        this._code = code;
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
    public static final String isquery_COLUMN = "IsQuery";

    /**
     * Get the value of the column 'IsQuery'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'IsQuery'. (Nullable)
     */
    public Boolean getIsquery() {
        return _isquery;
    }

    /**
     * Set the value of the column 'IsQuery'. <br />
     * {BIT : NotNull}
     * @param isquery The value of the column 'IsQuery'. (Nullable)
     */
    public void setIsquery(Boolean isquery) {
        _modifiedProperties.addPropertyName("isquery");
        this._isquery = isquery;
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

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String eaGuid_COLUMN = "ea_guid";

    /**
     * Get the value of the column 'ea_guid'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * Set the value of the column 'ea_guid'. <br />
     * {VARCHAR(50)}
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
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

}
