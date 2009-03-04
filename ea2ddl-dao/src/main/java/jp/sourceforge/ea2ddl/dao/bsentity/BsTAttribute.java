package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;
import jp.sourceforge.ea2ddl.dao.exentity.*;

/**
 * The entity of t_attribute that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_ID, Name, Scope, Stereotype, Containment, IsStatic, IsCollection, IsOrdered, AllowDuplicates, LowerBound, UpperBound, Container, Notes, Derived, ID, Pos, GenOption, Length, Precision, Scale, Style, Classifier, Type, ea_guid, StyleEx
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
 *     
 * 
 * [foreign-property]
 *     tObject
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTAttribute implements Entity, Serializable {

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
    /** Object_ID: {INTEGER : FK to t_object} */
    protected java.lang.Integer _objectId;

    /** Name: {VARCHAR(255)} */
    protected String _name;

    /** Scope: {VARCHAR(50)} */
    protected String _scope;

    /** Stereotype: {VARCHAR(50)} */
    protected String _stereotype;

    /** Containment: {VARCHAR(50)} */
    protected String _containment;

    /** IsStatic: {INTEGER} */
    protected java.lang.Integer _isstatic;

    /** IsCollection: {INTEGER} */
    protected java.lang.Integer _iscollection;

    /** IsOrdered: {INTEGER} */
    protected java.lang.Integer _isordered;

    /** AllowDuplicates: {INTEGER} */
    protected java.lang.Integer _allowduplicates;

    /** LowerBound: {VARCHAR(50)} */
    protected String _lowerbound;

    /** UpperBound: {VARCHAR(50)} */
    protected String _upperbound;

    /** Container: {VARCHAR(50)} */
    protected String _container;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** Derived: {VARCHAR(1)} */
    protected String _derived;

    /** ID: {UQ : NotNull : COUNTER} */
    protected java.lang.Integer _id;

    /** Pos: {INTEGER} */
    protected java.lang.Integer _pos;

    /** GenOption: {LONGCHAR(2147483647)} */
    protected String _genoption;

    /** Length: {INTEGER} */
    protected java.lang.Integer _length;

    /** Precision: {INTEGER} */
    protected java.lang.Integer _precision;

    /** Scale: {INTEGER} */
    protected java.lang.Integer _scale;

    /** Style: {VARCHAR(255)} */
    protected String _style;

    /** Classifier: {VARCHAR(50)} */
    protected String _classifier;

    /** Type: {VARCHAR(255)} */
    protected String _type;

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
        return "t_attribute";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TAttribute";
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
        if (other == null || !(other instanceof BsTAttribute)) { return false; }
        final BsTAttribute otherEntity = (BsTAttribute)other;
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getScope(), otherEntity.getScope())) { return false; }
        if (!helpComparingValue(getStereotype(), otherEntity.getStereotype())) { return false; }
        if (!helpComparingValue(getContainment(), otherEntity.getContainment())) { return false; }
        if (!helpComparingValue(getIsstatic(), otherEntity.getIsstatic())) { return false; }
        if (!helpComparingValue(getIscollection(), otherEntity.getIscollection())) { return false; }
        if (!helpComparingValue(getIsordered(), otherEntity.getIsordered())) { return false; }
        if (!helpComparingValue(getAllowduplicates(), otherEntity.getAllowduplicates())) { return false; }
        if (!helpComparingValue(getLowerbound(), otherEntity.getLowerbound())) { return false; }
        if (!helpComparingValue(getUpperbound(), otherEntity.getUpperbound())) { return false; }
        if (!helpComparingValue(getContainer(), otherEntity.getContainer())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getDerived(), otherEntity.getDerived())) { return false; }
        if (!helpComparingValue(getId(), otherEntity.getId())) { return false; }
        if (!helpComparingValue(getPos(), otherEntity.getPos())) { return false; }
        if (!helpComparingValue(getGenoption(), otherEntity.getGenoption())) { return false; }
        if (!helpComparingValue(getLength(), otherEntity.getLength())) { return false; }
        if (!helpComparingValue(getPrecision(), otherEntity.getPrecision())) { return false; }
        if (!helpComparingValue(getScale(), otherEntity.getScale())) { return false; }
        if (!helpComparingValue(getStyle(), otherEntity.getStyle())) { return false; }
        if (!helpComparingValue(getClassifier(), otherEntity.getClassifier())) { return false; }
        if (!helpComparingValue(getType(), otherEntity.getType())) { return false; }
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
        if (this.getObjectId() != null) { result = result + this.getObjectId().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getScope() != null) { result = result + this.getScope().hashCode(); }
        if (this.getStereotype() != null) { result = result + this.getStereotype().hashCode(); }
        if (this.getContainment() != null) { result = result + this.getContainment().hashCode(); }
        if (this.getIsstatic() != null) { result = result + this.getIsstatic().hashCode(); }
        if (this.getIscollection() != null) { result = result + this.getIscollection().hashCode(); }
        if (this.getIsordered() != null) { result = result + this.getIsordered().hashCode(); }
        if (this.getAllowduplicates() != null) { result = result + this.getAllowduplicates().hashCode(); }
        if (this.getLowerbound() != null) { result = result + this.getLowerbound().hashCode(); }
        if (this.getUpperbound() != null) { result = result + this.getUpperbound().hashCode(); }
        if (this.getContainer() != null) { result = result + this.getContainer().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getDerived() != null) { result = result + this.getDerived().hashCode(); }
        if (this.getId() != null) { result = result + this.getId().hashCode(); }
        if (this.getPos() != null) { result = result + this.getPos().hashCode(); }
        if (this.getGenoption() != null) { result = result + this.getGenoption().hashCode(); }
        if (this.getLength() != null) { result = result + this.getLength().hashCode(); }
        if (this.getPrecision() != null) { result = result + this.getPrecision().hashCode(); }
        if (this.getScale() != null) { result = result + this.getScale().hashCode(); }
        if (this.getStyle() != null) { result = result + this.getStyle().hashCode(); }
        if (this.getClassifier() != null) { result = result + this.getClassifier().hashCode(); }
        if (this.getType() != null) { result = result + this.getType().hashCode(); }
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
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getScope());
        sb.append(delimiter).append(getStereotype());
        sb.append(delimiter).append(getContainment());
        sb.append(delimiter).append(getIsstatic());
        sb.append(delimiter).append(getIscollection());
        sb.append(delimiter).append(getIsordered());
        sb.append(delimiter).append(getAllowduplicates());
        sb.append(delimiter).append(getLowerbound());
        sb.append(delimiter).append(getUpperbound());
        sb.append(delimiter).append(getContainer());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getDerived());
        sb.append(delimiter).append(getId());
        sb.append(delimiter).append(getPos());
        sb.append(delimiter).append(getGenoption());
        sb.append(delimiter).append(getLength());
        sb.append(delimiter).append(getPrecision());
        sb.append(delimiter).append(getScale());
        sb.append(delimiter).append(getStyle());
        sb.append(delimiter).append(getClassifier());
        sb.append(delimiter).append(getType());
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
     * Object_ID: {INTEGER : FK to t_object} <br />
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Object_ID: {INTEGER : FK to t_object} <br />
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
     * Containment: {VARCHAR(50)} <br />
     * @return The value of the column 'Containment'. (Nullable)
     */
    public String getContainment() {
        return _containment;
    }

    /**
     * Containment: {VARCHAR(50)} <br />
     * @param containment The value of the column 'Containment'. (Nullable)
     */
    public void setContainment(String containment) {
        _modifiedProperties.addPropertyName("containment");
        this._containment = containment;
    }

    /**
     * IsStatic: {INTEGER} <br />
     * @return The value of the column 'IsStatic'. (Nullable)
     */
    public java.lang.Integer getIsstatic() {
        return _isstatic;
    }

    /**
     * IsStatic: {INTEGER} <br />
     * @param isstatic The value of the column 'IsStatic'. (Nullable)
     */
    public void setIsstatic(java.lang.Integer isstatic) {
        _modifiedProperties.addPropertyName("isstatic");
        this._isstatic = isstatic;
    }

    /**
     * IsCollection: {INTEGER} <br />
     * @return The value of the column 'IsCollection'. (Nullable)
     */
    public java.lang.Integer getIscollection() {
        return _iscollection;
    }

    /**
     * IsCollection: {INTEGER} <br />
     * @param iscollection The value of the column 'IsCollection'. (Nullable)
     */
    public void setIscollection(java.lang.Integer iscollection) {
        _modifiedProperties.addPropertyName("iscollection");
        this._iscollection = iscollection;
    }

    /**
     * IsOrdered: {INTEGER} <br />
     * @return The value of the column 'IsOrdered'. (Nullable)
     */
    public java.lang.Integer getIsordered() {
        return _isordered;
    }

    /**
     * IsOrdered: {INTEGER} <br />
     * @param isordered The value of the column 'IsOrdered'. (Nullable)
     */
    public void setIsordered(java.lang.Integer isordered) {
        _modifiedProperties.addPropertyName("isordered");
        this._isordered = isordered;
    }

    /**
     * AllowDuplicates: {INTEGER} <br />
     * @return The value of the column 'AllowDuplicates'. (Nullable)
     */
    public java.lang.Integer getAllowduplicates() {
        return _allowduplicates;
    }

    /**
     * AllowDuplicates: {INTEGER} <br />
     * @param allowduplicates The value of the column 'AllowDuplicates'. (Nullable)
     */
    public void setAllowduplicates(java.lang.Integer allowduplicates) {
        _modifiedProperties.addPropertyName("allowduplicates");
        this._allowduplicates = allowduplicates;
    }

    /**
     * LowerBound: {VARCHAR(50)} <br />
     * @return The value of the column 'LowerBound'. (Nullable)
     */
    public String getLowerbound() {
        return _lowerbound;
    }

    /**
     * LowerBound: {VARCHAR(50)} <br />
     * @param lowerbound The value of the column 'LowerBound'. (Nullable)
     */
    public void setLowerbound(String lowerbound) {
        _modifiedProperties.addPropertyName("lowerbound");
        this._lowerbound = lowerbound;
    }

    /**
     * UpperBound: {VARCHAR(50)} <br />
     * @return The value of the column 'UpperBound'. (Nullable)
     */
    public String getUpperbound() {
        return _upperbound;
    }

    /**
     * UpperBound: {VARCHAR(50)} <br />
     * @param upperbound The value of the column 'UpperBound'. (Nullable)
     */
    public void setUpperbound(String upperbound) {
        _modifiedProperties.addPropertyName("upperbound");
        this._upperbound = upperbound;
    }

    /**
     * Container: {VARCHAR(50)} <br />
     * @return The value of the column 'Container'. (Nullable)
     */
    public String getContainer() {
        return _container;
    }

    /**
     * Container: {VARCHAR(50)} <br />
     * @param container The value of the column 'Container'. (Nullable)
     */
    public void setContainer(String container) {
        _modifiedProperties.addPropertyName("container");
        this._container = container;
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
     * Derived: {VARCHAR(1)} <br />
     * @return The value of the column 'Derived'. (Nullable)
     */
    public String getDerived() {
        return _derived;
    }

    /**
     * Derived: {VARCHAR(1)} <br />
     * @param derived The value of the column 'Derived'. (Nullable)
     */
    public void setDerived(String derived) {
        _modifiedProperties.addPropertyName("derived");
        this._derived = derived;
    }

    /**
     * ID: {UQ : NotNull : COUNTER} <br />
     * @return The value of the column 'ID'. (Nullable)
     */
    public java.lang.Integer getId() {
        return _id;
    }

    /**
     * ID: {UQ : NotNull : COUNTER} <br />
     * @param id The value of the column 'ID'. (Nullable)
     */
    public void setId(java.lang.Integer id) {
        _modifiedProperties.addPropertyName("id");
        this._id = id;
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
     * Length: {INTEGER} <br />
     * @return The value of the column 'Length'. (Nullable)
     */
    public java.lang.Integer getLength() {
        return _length;
    }

    /**
     * Length: {INTEGER} <br />
     * @param length The value of the column 'Length'. (Nullable)
     */
    public void setLength(java.lang.Integer length) {
        _modifiedProperties.addPropertyName("length");
        this._length = length;
    }

    /**
     * Precision: {INTEGER} <br />
     * @return The value of the column 'Precision'. (Nullable)
     */
    public java.lang.Integer getPrecision() {
        return _precision;
    }

    /**
     * Precision: {INTEGER} <br />
     * @param precision The value of the column 'Precision'. (Nullable)
     */
    public void setPrecision(java.lang.Integer precision) {
        _modifiedProperties.addPropertyName("precision");
        this._precision = precision;
    }

    /**
     * Scale: {INTEGER} <br />
     * @return The value of the column 'Scale'. (Nullable)
     */
    public java.lang.Integer getScale() {
        return _scale;
    }

    /**
     * Scale: {INTEGER} <br />
     * @param scale The value of the column 'Scale'. (Nullable)
     */
    public void setScale(java.lang.Integer scale) {
        _modifiedProperties.addPropertyName("scale");
        this._scale = scale;
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
