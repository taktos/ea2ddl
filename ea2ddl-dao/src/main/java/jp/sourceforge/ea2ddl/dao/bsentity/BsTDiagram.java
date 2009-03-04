package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_diagram that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Diagram_ID, Package_ID, ParentID, Diagram_Type, Name, Version, Author, ShowDetails, Notes, Stereotype, AttPub, AttPri, AttPro, Orientation, cx, cy, Scale, CreatedDate, ModifiedDate, HTMLPath, ShowForeign, ShowBorder, ShowPackageContents, PDATA, Locked, ea_guid, TPos, Swimlanes, StyleEx
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
public abstract class BsTDiagram implements Entity, Serializable {

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
    /** Diagram_ID: {UQ : NotNull : COUNTER} */
    protected java.lang.Integer _diagramId;

    /** Package_ID: {INTEGER} */
    protected java.lang.Integer _packageId;

    /** ParentID: {INTEGER} */
    protected java.lang.Integer _parentid;

    /** Diagram_Type: {VARCHAR(50)} */
    protected String _diagramType;

    /** Name: {VARCHAR(255)} */
    protected String _name;

    /** Version: {VARCHAR(50)} */
    protected String _version;

    /** Author: {VARCHAR(255)} */
    protected String _author;

    /** ShowDetails: {INTEGER} */
    protected java.lang.Integer _showdetails;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** Stereotype: {VARCHAR(50)} */
    protected String _stereotype;

    /** AttPub: {NotNull : BIT} */
    protected Boolean _attpub;

    /** AttPri: {NotNull : BIT} */
    protected Boolean _attpri;

    /** AttPro: {NotNull : BIT} */
    protected Boolean _attpro;

    /** Orientation: {VARCHAR(1)} */
    protected String _orientation;

    /** cx: {INTEGER} */
    protected java.lang.Integer _cx;

    /** cy: {INTEGER} */
    protected java.lang.Integer _cy;

    /** Scale: {INTEGER} */
    protected java.lang.Integer _scale;

    /** CreatedDate: {DATETIME} */
    protected java.sql.Timestamp _createddate;

    /** ModifiedDate: {DATETIME} */
    protected java.sql.Timestamp _modifieddate;

    /** HTMLPath: {VARCHAR(255)} */
    protected String _htmlpath;

    /** ShowForeign: {NotNull : BIT} */
    protected Boolean _showforeign;

    /** ShowBorder: {NotNull : BIT} */
    protected Boolean _showborder;

    /** ShowPackageContents: {NotNull : BIT} */
    protected Boolean _showpackagecontents;

    /** PDATA: {VARCHAR(255)} */
    protected String _pdata;

    /** Locked: {NotNull : BIT} */
    protected Boolean _locked;

    /** ea_guid: {UQ : VARCHAR(40)} */
    protected String _eaGuid;

    /** TPos: {INTEGER} */
    protected java.lang.Integer _tpos;

    /** Swimlanes: {VARCHAR(255)} */
    protected String _swimlanes;

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
        return "t_diagram";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TDiagram";
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
        if (other == null || !(other instanceof BsTDiagram)) { return false; }
        final BsTDiagram otherEntity = (BsTDiagram)other;
        if (!helpComparingValue(getDiagramId(), otherEntity.getDiagramId())) { return false; }
        if (!helpComparingValue(getPackageId(), otherEntity.getPackageId())) { return false; }
        if (!helpComparingValue(getParentid(), otherEntity.getParentid())) { return false; }
        if (!helpComparingValue(getDiagramType(), otherEntity.getDiagramType())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getVersion(), otherEntity.getVersion())) { return false; }
        if (!helpComparingValue(getAuthor(), otherEntity.getAuthor())) { return false; }
        if (!helpComparingValue(getShowdetails(), otherEntity.getShowdetails())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getStereotype(), otherEntity.getStereotype())) { return false; }
        if (!helpComparingValue(getAttpub(), otherEntity.getAttpub())) { return false; }
        if (!helpComparingValue(getAttpri(), otherEntity.getAttpri())) { return false; }
        if (!helpComparingValue(getAttpro(), otherEntity.getAttpro())) { return false; }
        if (!helpComparingValue(getOrientation(), otherEntity.getOrientation())) { return false; }
        if (!helpComparingValue(getCx(), otherEntity.getCx())) { return false; }
        if (!helpComparingValue(getCy(), otherEntity.getCy())) { return false; }
        if (!helpComparingValue(getScale(), otherEntity.getScale())) { return false; }
        if (!helpComparingValue(getCreateddate(), otherEntity.getCreateddate())) { return false; }
        if (!helpComparingValue(getModifieddate(), otherEntity.getModifieddate())) { return false; }
        if (!helpComparingValue(getHtmlpath(), otherEntity.getHtmlpath())) { return false; }
        if (!helpComparingValue(getShowforeign(), otherEntity.getShowforeign())) { return false; }
        if (!helpComparingValue(getShowborder(), otherEntity.getShowborder())) { return false; }
        if (!helpComparingValue(getShowpackagecontents(), otherEntity.getShowpackagecontents())) { return false; }
        if (!helpComparingValue(getPdata(), otherEntity.getPdata())) { return false; }
        if (!helpComparingValue(getLocked(), otherEntity.getLocked())) { return false; }
        if (!helpComparingValue(getEaGuid(), otherEntity.getEaGuid())) { return false; }
        if (!helpComparingValue(getTpos(), otherEntity.getTpos())) { return false; }
        if (!helpComparingValue(getSwimlanes(), otherEntity.getSwimlanes())) { return false; }
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
        if (this.getDiagramId() != null) { result = result + this.getDiagramId().hashCode(); }
        if (this.getPackageId() != null) { result = result + this.getPackageId().hashCode(); }
        if (this.getParentid() != null) { result = result + this.getParentid().hashCode(); }
        if (this.getDiagramType() != null) { result = result + this.getDiagramType().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getVersion() != null) { result = result + this.getVersion().hashCode(); }
        if (this.getAuthor() != null) { result = result + this.getAuthor().hashCode(); }
        if (this.getShowdetails() != null) { result = result + this.getShowdetails().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getStereotype() != null) { result = result + this.getStereotype().hashCode(); }
        if (this.getAttpub() != null) { result = result + this.getAttpub().hashCode(); }
        if (this.getAttpri() != null) { result = result + this.getAttpri().hashCode(); }
        if (this.getAttpro() != null) { result = result + this.getAttpro().hashCode(); }
        if (this.getOrientation() != null) { result = result + this.getOrientation().hashCode(); }
        if (this.getCx() != null) { result = result + this.getCx().hashCode(); }
        if (this.getCy() != null) { result = result + this.getCy().hashCode(); }
        if (this.getScale() != null) { result = result + this.getScale().hashCode(); }
        if (this.getCreateddate() != null) { result = result + this.getCreateddate().hashCode(); }
        if (this.getModifieddate() != null) { result = result + this.getModifieddate().hashCode(); }
        if (this.getHtmlpath() != null) { result = result + this.getHtmlpath().hashCode(); }
        if (this.getShowforeign() != null) { result = result + this.getShowforeign().hashCode(); }
        if (this.getShowborder() != null) { result = result + this.getShowborder().hashCode(); }
        if (this.getShowpackagecontents() != null) { result = result + this.getShowpackagecontents().hashCode(); }
        if (this.getPdata() != null) { result = result + this.getPdata().hashCode(); }
        if (this.getLocked() != null) { result = result + this.getLocked().hashCode(); }
        if (this.getEaGuid() != null) { result = result + this.getEaGuid().hashCode(); }
        if (this.getTpos() != null) { result = result + this.getTpos().hashCode(); }
        if (this.getSwimlanes() != null) { result = result + this.getSwimlanes().hashCode(); }
        if (this.getStyleex() != null) { result = result + this.getStyleex().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getDiagramId());
        sb.append(delimiter).append(getPackageId());
        sb.append(delimiter).append(getParentid());
        sb.append(delimiter).append(getDiagramType());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getVersion());
        sb.append(delimiter).append(getAuthor());
        sb.append(delimiter).append(getShowdetails());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getStereotype());
        sb.append(delimiter).append(getAttpub());
        sb.append(delimiter).append(getAttpri());
        sb.append(delimiter).append(getAttpro());
        sb.append(delimiter).append(getOrientation());
        sb.append(delimiter).append(getCx());
        sb.append(delimiter).append(getCy());
        sb.append(delimiter).append(getScale());
        sb.append(delimiter).append(getCreateddate());
        sb.append(delimiter).append(getModifieddate());
        sb.append(delimiter).append(getHtmlpath());
        sb.append(delimiter).append(getShowforeign());
        sb.append(delimiter).append(getShowborder());
        sb.append(delimiter).append(getShowpackagecontents());
        sb.append(delimiter).append(getPdata());
        sb.append(delimiter).append(getLocked());
        sb.append(delimiter).append(getEaGuid());
        sb.append(delimiter).append(getTpos());
        sb.append(delimiter).append(getSwimlanes());
        sb.append(delimiter).append(getStyleex());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Diagram_ID: {UQ : NotNull : COUNTER} <br />
     * @return The value of the column 'Diagram_ID'. (Nullable)
     */
    public java.lang.Integer getDiagramId() {
        return _diagramId;
    }

    /**
     * Diagram_ID: {UQ : NotNull : COUNTER} <br />
     * @param diagramId The value of the column 'Diagram_ID'. (Nullable)
     */
    public void setDiagramId(java.lang.Integer diagramId) {
        _modifiedProperties.addPropertyName("diagramId");
        this._diagramId = diagramId;
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
     * Diagram_Type: {VARCHAR(50)} <br />
     * @return The value of the column 'Diagram_Type'. (Nullable)
     */
    public String getDiagramType() {
        return _diagramType;
    }

    /**
     * Diagram_Type: {VARCHAR(50)} <br />
     * @param diagramType The value of the column 'Diagram_Type'. (Nullable)
     */
    public void setDiagramType(String diagramType) {
        _modifiedProperties.addPropertyName("diagramType");
        this._diagramType = diagramType;
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
     * ShowDetails: {INTEGER} <br />
     * @return The value of the column 'ShowDetails'. (Nullable)
     */
    public java.lang.Integer getShowdetails() {
        return _showdetails;
    }

    /**
     * ShowDetails: {INTEGER} <br />
     * @param showdetails The value of the column 'ShowDetails'. (Nullable)
     */
    public void setShowdetails(java.lang.Integer showdetails) {
        _modifiedProperties.addPropertyName("showdetails");
        this._showdetails = showdetails;
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
     * AttPub: {NotNull : BIT} <br />
     * @return The value of the column 'AttPub'. (Nullable)
     */
    public Boolean getAttpub() {
        return _attpub;
    }

    /**
     * AttPub: {NotNull : BIT} <br />
     * @param attpub The value of the column 'AttPub'. (Nullable)
     */
    public void setAttpub(Boolean attpub) {
        _modifiedProperties.addPropertyName("attpub");
        this._attpub = attpub;
    }

    /**
     * AttPri: {NotNull : BIT} <br />
     * @return The value of the column 'AttPri'. (Nullable)
     */
    public Boolean getAttpri() {
        return _attpri;
    }

    /**
     * AttPri: {NotNull : BIT} <br />
     * @param attpri The value of the column 'AttPri'. (Nullable)
     */
    public void setAttpri(Boolean attpri) {
        _modifiedProperties.addPropertyName("attpri");
        this._attpri = attpri;
    }

    /**
     * AttPro: {NotNull : BIT} <br />
     * @return The value of the column 'AttPro'. (Nullable)
     */
    public Boolean getAttpro() {
        return _attpro;
    }

    /**
     * AttPro: {NotNull : BIT} <br />
     * @param attpro The value of the column 'AttPro'. (Nullable)
     */
    public void setAttpro(Boolean attpro) {
        _modifiedProperties.addPropertyName("attpro");
        this._attpro = attpro;
    }

    /**
     * Orientation: {VARCHAR(1)} <br />
     * @return The value of the column 'Orientation'. (Nullable)
     */
    public String getOrientation() {
        return _orientation;
    }

    /**
     * Orientation: {VARCHAR(1)} <br />
     * @param orientation The value of the column 'Orientation'. (Nullable)
     */
    public void setOrientation(String orientation) {
        _modifiedProperties.addPropertyName("orientation");
        this._orientation = orientation;
    }

    /**
     * cx: {INTEGER} <br />
     * @return The value of the column 'cx'. (Nullable)
     */
    public java.lang.Integer getCx() {
        return _cx;
    }

    /**
     * cx: {INTEGER} <br />
     * @param cx The value of the column 'cx'. (Nullable)
     */
    public void setCx(java.lang.Integer cx) {
        _modifiedProperties.addPropertyName("cx");
        this._cx = cx;
    }

    /**
     * cy: {INTEGER} <br />
     * @return The value of the column 'cy'. (Nullable)
     */
    public java.lang.Integer getCy() {
        return _cy;
    }

    /**
     * cy: {INTEGER} <br />
     * @param cy The value of the column 'cy'. (Nullable)
     */
    public void setCy(java.lang.Integer cy) {
        _modifiedProperties.addPropertyName("cy");
        this._cy = cy;
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
     * HTMLPath: {VARCHAR(255)} <br />
     * @return The value of the column 'HTMLPath'. (Nullable)
     */
    public String getHtmlpath() {
        return _htmlpath;
    }

    /**
     * HTMLPath: {VARCHAR(255)} <br />
     * @param htmlpath The value of the column 'HTMLPath'. (Nullable)
     */
    public void setHtmlpath(String htmlpath) {
        _modifiedProperties.addPropertyName("htmlpath");
        this._htmlpath = htmlpath;
    }

    /**
     * ShowForeign: {NotNull : BIT} <br />
     * @return The value of the column 'ShowForeign'. (Nullable)
     */
    public Boolean getShowforeign() {
        return _showforeign;
    }

    /**
     * ShowForeign: {NotNull : BIT} <br />
     * @param showforeign The value of the column 'ShowForeign'. (Nullable)
     */
    public void setShowforeign(Boolean showforeign) {
        _modifiedProperties.addPropertyName("showforeign");
        this._showforeign = showforeign;
    }

    /**
     * ShowBorder: {NotNull : BIT} <br />
     * @return The value of the column 'ShowBorder'. (Nullable)
     */
    public Boolean getShowborder() {
        return _showborder;
    }

    /**
     * ShowBorder: {NotNull : BIT} <br />
     * @param showborder The value of the column 'ShowBorder'. (Nullable)
     */
    public void setShowborder(Boolean showborder) {
        _modifiedProperties.addPropertyName("showborder");
        this._showborder = showborder;
    }

    /**
     * ShowPackageContents: {NotNull : BIT} <br />
     * @return The value of the column 'ShowPackageContents'. (Nullable)
     */
    public Boolean getShowpackagecontents() {
        return _showpackagecontents;
    }

    /**
     * ShowPackageContents: {NotNull : BIT} <br />
     * @param showpackagecontents The value of the column 'ShowPackageContents'. (Nullable)
     */
    public void setShowpackagecontents(Boolean showpackagecontents) {
        _modifiedProperties.addPropertyName("showpackagecontents");
        this._showpackagecontents = showpackagecontents;
    }

    /**
     * PDATA: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA'. (Nullable)
     */
    public String getPdata() {
        return _pdata;
    }

    /**
     * PDATA: {VARCHAR(255)} <br />
     * @param pdata The value of the column 'PDATA'. (Nullable)
     */
    public void setPdata(String pdata) {
        _modifiedProperties.addPropertyName("pdata");
        this._pdata = pdata;
    }

    /**
     * Locked: {NotNull : BIT} <br />
     * @return The value of the column 'Locked'. (Nullable)
     */
    public Boolean getLocked() {
        return _locked;
    }

    /**
     * Locked: {NotNull : BIT} <br />
     * @param locked The value of the column 'Locked'. (Nullable)
     */
    public void setLocked(Boolean locked) {
        _modifiedProperties.addPropertyName("locked");
        this._locked = locked;
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
     * Swimlanes: {VARCHAR(255)} <br />
     * @return The value of the column 'Swimlanes'. (Nullable)
     */
    public String getSwimlanes() {
        return _swimlanes;
    }

    /**
     * Swimlanes: {VARCHAR(255)} <br />
     * @param swimlanes The value of the column 'Swimlanes'. (Nullable)
     */
    public void setSwimlanes(String swimlanes) {
        _modifiedProperties.addPropertyName("swimlanes");
        this._swimlanes = swimlanes;
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
