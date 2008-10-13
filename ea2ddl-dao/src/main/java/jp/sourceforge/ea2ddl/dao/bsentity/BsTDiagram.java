package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_diagram(TABLE).
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
@SuppressWarnings("unchecked")
public abstract class BsTDiagram implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_diagram. */
    public static final String TABLE = "t_diagram";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Diagram_ID'. {UQ : COUNTER : NotNull} */
    protected java.lang.Integer _diagramId;

    /** The attribute of the column 'Package_ID'. {INTEGER} */
    protected java.lang.Integer _packageId;

    /** The attribute of the column 'ParentID'. {INTEGER} */
    protected java.lang.Integer _parentid;

    /** The attribute of the column 'Diagram_Type'. {VARCHAR(50)} */
    protected String _diagramType;

    /** The attribute of the column 'Name'. {VARCHAR(255)} */
    protected String _name;

    /** The attribute of the column 'Version'. {VARCHAR(50)} */
    protected String _version;

    /** The attribute of the column 'Author'. {VARCHAR(255)} */
    protected String _author;

    /** The attribute of the column 'ShowDetails'. {INTEGER} */
    protected java.lang.Integer _showdetails;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'Stereotype'. {VARCHAR(50)} */
    protected String _stereotype;

    /** The attribute of the column 'AttPub'. {BIT : NotNull} */
    protected Boolean _attpub;

    /** The attribute of the column 'AttPri'. {BIT : NotNull} */
    protected Boolean _attpri;

    /** The attribute of the column 'AttPro'. {BIT : NotNull} */
    protected Boolean _attpro;

    /** The attribute of the column 'Orientation'. {VARCHAR(1)} */
    protected String _orientation;

    /** The attribute of the column 'cx'. {INTEGER} */
    protected java.lang.Integer _cx;

    /** The attribute of the column 'cy'. {INTEGER} */
    protected java.lang.Integer _cy;

    /** The attribute of the column 'Scale'. {INTEGER} */
    protected java.lang.Integer _scale;

    /** The attribute of the column 'CreatedDate'. {DATETIME} */
    protected java.sql.Timestamp _createddate;

    /** The attribute of the column 'ModifiedDate'. {DATETIME} */
    protected java.sql.Timestamp _modifieddate;

    /** The attribute of the column 'HTMLPath'. {VARCHAR(255)} */
    protected String _htmlpath;

    /** The attribute of the column 'ShowForeign'. {BIT : NotNull} */
    protected Boolean _showforeign;

    /** The attribute of the column 'ShowBorder'. {BIT : NotNull} */
    protected Boolean _showborder;

    /** The attribute of the column 'ShowPackageContents'. {BIT : NotNull} */
    protected Boolean _showpackagecontents;

    /** The attribute of the column 'PDATA'. {VARCHAR(255)} */
    protected String _pdata;

    /** The attribute of the column 'Locked'. {BIT : NotNull} */
    protected Boolean _locked;

    /** The attribute of the column 'ea_guid'. {UQ : VARCHAR(40)} */
    protected String _eaGuid;

    /** The attribute of the column 'TPos'. {INTEGER} */
    protected java.lang.Integer _tpos;

    /** The attribute of the column 'Swimlanes'. {VARCHAR(255)} */
    protected String _swimlanes;

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
    public BsTDiagram() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_diagram";
    }

    public String getTablePropertyName() {// as JavaBeansRule
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

    /** The column annotation for S2Dao. {UQ : COUNTER : NotNull} */
    public static final String diagramId_COLUMN = "Diagram_ID";

    /**
     * Get the value of the column 'Diagram_ID'. <br />
     * {UQ : COUNTER : NotNull}
     * @return The value of the column 'Diagram_ID'. (Nullable)
     */
    public java.lang.Integer getDiagramId() {
        return _diagramId;
    }

    /**
     * Set the value of the column 'Diagram_ID'. <br />
     * {UQ : COUNTER : NotNull}
     * @param diagramId The value of the column 'Diagram_ID'. (Nullable)
     */
    public void setDiagramId(java.lang.Integer diagramId) {
        _modifiedProperties.addPropertyName("diagramId");
        this._diagramId = diagramId;
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

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String diagramType_COLUMN = "Diagram_Type";

    /**
     * Get the value of the column 'Diagram_Type'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Diagram_Type'. (Nullable)
     */
    public String getDiagramType() {
        return _diagramType;
    }

    /**
     * Set the value of the column 'Diagram_Type'. <br />
     * {VARCHAR(50)}
     * @param diagramType The value of the column 'Diagram_Type'. (Nullable)
     */
    public void setDiagramType(String diagramType) {
        _modifiedProperties.addPropertyName("diagramType");
        this._diagramType = diagramType;
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

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String showdetails_COLUMN = "ShowDetails";

    /**
     * Get the value of the column 'ShowDetails'. <br />
     * {INTEGER}
     * @return The value of the column 'ShowDetails'. (Nullable)
     */
    public java.lang.Integer getShowdetails() {
        return _showdetails;
    }

    /**
     * Set the value of the column 'ShowDetails'. <br />
     * {INTEGER}
     * @param showdetails The value of the column 'ShowDetails'. (Nullable)
     */
    public void setShowdetails(java.lang.Integer showdetails) {
        _modifiedProperties.addPropertyName("showdetails");
        this._showdetails = showdetails;
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

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String attpub_COLUMN = "AttPub";

    /**
     * Get the value of the column 'AttPub'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'AttPub'. (Nullable)
     */
    public Boolean getAttpub() {
        return _attpub;
    }

    /**
     * Set the value of the column 'AttPub'. <br />
     * {BIT : NotNull}
     * @param attpub The value of the column 'AttPub'. (Nullable)
     */
    public void setAttpub(Boolean attpub) {
        _modifiedProperties.addPropertyName("attpub");
        this._attpub = attpub;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String attpri_COLUMN = "AttPri";

    /**
     * Get the value of the column 'AttPri'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'AttPri'. (Nullable)
     */
    public Boolean getAttpri() {
        return _attpri;
    }

    /**
     * Set the value of the column 'AttPri'. <br />
     * {BIT : NotNull}
     * @param attpri The value of the column 'AttPri'. (Nullable)
     */
    public void setAttpri(Boolean attpri) {
        _modifiedProperties.addPropertyName("attpri");
        this._attpri = attpri;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String attpro_COLUMN = "AttPro";

    /**
     * Get the value of the column 'AttPro'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'AttPro'. (Nullable)
     */
    public Boolean getAttpro() {
        return _attpro;
    }

    /**
     * Set the value of the column 'AttPro'. <br />
     * {BIT : NotNull}
     * @param attpro The value of the column 'AttPro'. (Nullable)
     */
    public void setAttpro(Boolean attpro) {
        _modifiedProperties.addPropertyName("attpro");
        this._attpro = attpro;
    }

    /** The column annotation for S2Dao. {VARCHAR(1)} */
    public static final String orientation_COLUMN = "Orientation";

    /**
     * Get the value of the column 'Orientation'. <br />
     * {VARCHAR(1)}
     * @return The value of the column 'Orientation'. (Nullable)
     */
    public String getOrientation() {
        return _orientation;
    }

    /**
     * Set the value of the column 'Orientation'. <br />
     * {VARCHAR(1)}
     * @param orientation The value of the column 'Orientation'. (Nullable)
     */
    public void setOrientation(String orientation) {
        _modifiedProperties.addPropertyName("orientation");
        this._orientation = orientation;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String cx_COLUMN = "cx";

    /**
     * Get the value of the column 'cx'. <br />
     * {INTEGER}
     * @return The value of the column 'cx'. (Nullable)
     */
    public java.lang.Integer getCx() {
        return _cx;
    }

    /**
     * Set the value of the column 'cx'. <br />
     * {INTEGER}
     * @param cx The value of the column 'cx'. (Nullable)
     */
    public void setCx(java.lang.Integer cx) {
        _modifiedProperties.addPropertyName("cx");
        this._cx = cx;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String cy_COLUMN = "cy";

    /**
     * Get the value of the column 'cy'. <br />
     * {INTEGER}
     * @return The value of the column 'cy'. (Nullable)
     */
    public java.lang.Integer getCy() {
        return _cy;
    }

    /**
     * Set the value of the column 'cy'. <br />
     * {INTEGER}
     * @param cy The value of the column 'cy'. (Nullable)
     */
    public void setCy(java.lang.Integer cy) {
        _modifiedProperties.addPropertyName("cy");
        this._cy = cy;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String scale_COLUMN = "Scale";

    /**
     * Get the value of the column 'Scale'. <br />
     * {INTEGER}
     * @return The value of the column 'Scale'. (Nullable)
     */
    public java.lang.Integer getScale() {
        return _scale;
    }

    /**
     * Set the value of the column 'Scale'. <br />
     * {INTEGER}
     * @param scale The value of the column 'Scale'. (Nullable)
     */
    public void setScale(java.lang.Integer scale) {
        _modifiedProperties.addPropertyName("scale");
        this._scale = scale;
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

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String htmlpath_COLUMN = "HTMLPath";

    /**
     * Get the value of the column 'HTMLPath'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'HTMLPath'. (Nullable)
     */
    public String getHtmlpath() {
        return _htmlpath;
    }

    /**
     * Set the value of the column 'HTMLPath'. <br />
     * {VARCHAR(255)}
     * @param htmlpath The value of the column 'HTMLPath'. (Nullable)
     */
    public void setHtmlpath(String htmlpath) {
        _modifiedProperties.addPropertyName("htmlpath");
        this._htmlpath = htmlpath;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String showforeign_COLUMN = "ShowForeign";

    /**
     * Get the value of the column 'ShowForeign'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'ShowForeign'. (Nullable)
     */
    public Boolean getShowforeign() {
        return _showforeign;
    }

    /**
     * Set the value of the column 'ShowForeign'. <br />
     * {BIT : NotNull}
     * @param showforeign The value of the column 'ShowForeign'. (Nullable)
     */
    public void setShowforeign(Boolean showforeign) {
        _modifiedProperties.addPropertyName("showforeign");
        this._showforeign = showforeign;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String showborder_COLUMN = "ShowBorder";

    /**
     * Get the value of the column 'ShowBorder'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'ShowBorder'. (Nullable)
     */
    public Boolean getShowborder() {
        return _showborder;
    }

    /**
     * Set the value of the column 'ShowBorder'. <br />
     * {BIT : NotNull}
     * @param showborder The value of the column 'ShowBorder'. (Nullable)
     */
    public void setShowborder(Boolean showborder) {
        _modifiedProperties.addPropertyName("showborder");
        this._showborder = showborder;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String showpackagecontents_COLUMN = "ShowPackageContents";

    /**
     * Get the value of the column 'ShowPackageContents'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'ShowPackageContents'. (Nullable)
     */
    public Boolean getShowpackagecontents() {
        return _showpackagecontents;
    }

    /**
     * Set the value of the column 'ShowPackageContents'. <br />
     * {BIT : NotNull}
     * @param showpackagecontents The value of the column 'ShowPackageContents'. (Nullable)
     */
    public void setShowpackagecontents(Boolean showpackagecontents) {
        _modifiedProperties.addPropertyName("showpackagecontents");
        this._showpackagecontents = showpackagecontents;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata_COLUMN = "PDATA";

    /**
     * Get the value of the column 'PDATA'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA'. (Nullable)
     */
    public String getPdata() {
        return _pdata;
    }

    /**
     * Set the value of the column 'PDATA'. <br />
     * {VARCHAR(255)}
     * @param pdata The value of the column 'PDATA'. (Nullable)
     */
    public void setPdata(String pdata) {
        _modifiedProperties.addPropertyName("pdata");
        this._pdata = pdata;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String locked_COLUMN = "Locked";

    /**
     * Get the value of the column 'Locked'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Locked'. (Nullable)
     */
    public Boolean getLocked() {
        return _locked;
    }

    /**
     * Set the value of the column 'Locked'. <br />
     * {BIT : NotNull}
     * @param locked The value of the column 'Locked'. (Nullable)
     */
    public void setLocked(Boolean locked) {
        _modifiedProperties.addPropertyName("locked");
        this._locked = locked;
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

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String swimlanes_COLUMN = "Swimlanes";

    /**
     * Get the value of the column 'Swimlanes'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Swimlanes'. (Nullable)
     */
    public String getSwimlanes() {
        return _swimlanes;
    }

    /**
     * Set the value of the column 'Swimlanes'. <br />
     * {VARCHAR(255)}
     * @param swimlanes The value of the column 'Swimlanes'. (Nullable)
     */
    public void setSwimlanes(String swimlanes) {
        _modifiedProperties.addPropertyName("swimlanes");
        this._swimlanes = swimlanes;
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
