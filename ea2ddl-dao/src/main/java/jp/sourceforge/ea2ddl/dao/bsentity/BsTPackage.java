package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_package(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Package_ID, Name, Parent_ID, CreatedDate, ModifiedDate, Notes, ea_guid, XMLPath, IsControlled, LastLoadDate, LastSaveDate, Version, PkgOwner, UMLVersion, UseDTD, LogXML, CodePath, Namespace, TPos, PackageFlags, BatchSave, BatchLoad
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
public abstract class BsTPackage implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_package. */
    public static final String TABLE = "t_package";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Package_ID'. {UQ : COUNTER : NotNull} */
    protected java.lang.Integer _packageId;

    /** The attribute of the column 'Name'. {VARCHAR(255)} */
    protected String _name;

    /** The attribute of the column 'Parent_ID'. {INTEGER} */
    protected java.lang.Integer _parentId;

    /** The attribute of the column 'CreatedDate'. {DATETIME} */
    protected java.sql.Timestamp _createddate;

    /** The attribute of the column 'ModifiedDate'. {DATETIME} */
    protected java.sql.Timestamp _modifieddate;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'ea_guid'. {UQ : VARCHAR(40)} */
    protected String _eaGuid;

    /** The attribute of the column 'XMLPath'. {VARCHAR(255)} */
    protected String _xmlpath;

    /** The attribute of the column 'IsControlled'. {BIT : NotNull} */
    protected Boolean _iscontrolled;

    /** The attribute of the column 'LastLoadDate'. {DATETIME} */
    protected java.sql.Timestamp _lastloaddate;

    /** The attribute of the column 'LastSaveDate'. {DATETIME} */
    protected java.sql.Timestamp _lastsavedate;

    /** The attribute of the column 'Version'. {VARCHAR(50)} */
    protected String _version;

    /** The attribute of the column 'PkgOwner'. {VARCHAR(255)} */
    protected String _pkgowner;

    /** The attribute of the column 'UMLVersion'. {VARCHAR(50)} */
    protected String _umlversion;

    /** The attribute of the column 'UseDTD'. {BIT : NotNull} */
    protected Boolean _usedtd;

    /** The attribute of the column 'LogXML'. {BIT : NotNull} */
    protected Boolean _logxml;

    /** The attribute of the column 'CodePath'. {VARCHAR(255)} */
    protected String _codepath;

    /** The attribute of the column 'Namespace'. {VARCHAR(50)} */
    protected String _namespace;

    /** The attribute of the column 'TPos'. {INTEGER} */
    protected java.lang.Integer _tpos;

    /** The attribute of the column 'PackageFlags'. {VARCHAR(255)} */
    protected String _packageflags;

    /** The attribute of the column 'BatchSave'. {INTEGER} */
    protected java.lang.Integer _batchsave;

    /** The attribute of the column 'BatchLoad'. {INTEGER} */
    protected java.lang.Integer _batchload;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPackage() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_package";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TPackage";
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
        if (other == null || !(other instanceof BsTPackage)) { return false; }
        final BsTPackage otherEntity = (BsTPackage)other;
        if (!helpComparingValue(getPackageId(), otherEntity.getPackageId())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getParentId(), otherEntity.getParentId())) { return false; }
        if (!helpComparingValue(getCreateddate(), otherEntity.getCreateddate())) { return false; }
        if (!helpComparingValue(getModifieddate(), otherEntity.getModifieddate())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getEaGuid(), otherEntity.getEaGuid())) { return false; }
        if (!helpComparingValue(getXmlpath(), otherEntity.getXmlpath())) { return false; }
        if (!helpComparingValue(getIscontrolled(), otherEntity.getIscontrolled())) { return false; }
        if (!helpComparingValue(getLastloaddate(), otherEntity.getLastloaddate())) { return false; }
        if (!helpComparingValue(getLastsavedate(), otherEntity.getLastsavedate())) { return false; }
        if (!helpComparingValue(getVersion(), otherEntity.getVersion())) { return false; }
        if (!helpComparingValue(getPkgowner(), otherEntity.getPkgowner())) { return false; }
        if (!helpComparingValue(getUmlversion(), otherEntity.getUmlversion())) { return false; }
        if (!helpComparingValue(getUsedtd(), otherEntity.getUsedtd())) { return false; }
        if (!helpComparingValue(getLogxml(), otherEntity.getLogxml())) { return false; }
        if (!helpComparingValue(getCodepath(), otherEntity.getCodepath())) { return false; }
        if (!helpComparingValue(getNamespace(), otherEntity.getNamespace())) { return false; }
        if (!helpComparingValue(getTpos(), otherEntity.getTpos())) { return false; }
        if (!helpComparingValue(getPackageflags(), otherEntity.getPackageflags())) { return false; }
        if (!helpComparingValue(getBatchsave(), otherEntity.getBatchsave())) { return false; }
        if (!helpComparingValue(getBatchload(), otherEntity.getBatchload())) { return false; }
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
        if (this.getPackageId() != null) { result = result + this.getPackageId().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getParentId() != null) { result = result + this.getParentId().hashCode(); }
        if (this.getCreateddate() != null) { result = result + this.getCreateddate().hashCode(); }
        if (this.getModifieddate() != null) { result = result + this.getModifieddate().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getEaGuid() != null) { result = result + this.getEaGuid().hashCode(); }
        if (this.getXmlpath() != null) { result = result + this.getXmlpath().hashCode(); }
        if (this.getIscontrolled() != null) { result = result + this.getIscontrolled().hashCode(); }
        if (this.getLastloaddate() != null) { result = result + this.getLastloaddate().hashCode(); }
        if (this.getLastsavedate() != null) { result = result + this.getLastsavedate().hashCode(); }
        if (this.getVersion() != null) { result = result + this.getVersion().hashCode(); }
        if (this.getPkgowner() != null) { result = result + this.getPkgowner().hashCode(); }
        if (this.getUmlversion() != null) { result = result + this.getUmlversion().hashCode(); }
        if (this.getUsedtd() != null) { result = result + this.getUsedtd().hashCode(); }
        if (this.getLogxml() != null) { result = result + this.getLogxml().hashCode(); }
        if (this.getCodepath() != null) { result = result + this.getCodepath().hashCode(); }
        if (this.getNamespace() != null) { result = result + this.getNamespace().hashCode(); }
        if (this.getTpos() != null) { result = result + this.getTpos().hashCode(); }
        if (this.getPackageflags() != null) { result = result + this.getPackageflags().hashCode(); }
        if (this.getBatchsave() != null) { result = result + this.getBatchsave().hashCode(); }
        if (this.getBatchload() != null) { result = result + this.getBatchload().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getPackageId());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getParentId());
        sb.append(delimiter).append(getCreateddate());
        sb.append(delimiter).append(getModifieddate());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getEaGuid());
        sb.append(delimiter).append(getXmlpath());
        sb.append(delimiter).append(getIscontrolled());
        sb.append(delimiter).append(getLastloaddate());
        sb.append(delimiter).append(getLastsavedate());
        sb.append(delimiter).append(getVersion());
        sb.append(delimiter).append(getPkgowner());
        sb.append(delimiter).append(getUmlversion());
        sb.append(delimiter).append(getUsedtd());
        sb.append(delimiter).append(getLogxml());
        sb.append(delimiter).append(getCodepath());
        sb.append(delimiter).append(getNamespace());
        sb.append(delimiter).append(getTpos());
        sb.append(delimiter).append(getPackageflags());
        sb.append(delimiter).append(getBatchsave());
        sb.append(delimiter).append(getBatchload());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : COUNTER : NotNull} */
    public static final String packageId_COLUMN = "Package_ID";

    /**
     * Get the value of the column 'Package_ID'. <br />
     * {UQ : COUNTER : NotNull}
     * @return The value of the column 'Package_ID'. (Nullable)
     */
    public java.lang.Integer getPackageId() {
        return _packageId;
    }

    /**
     * Set the value of the column 'Package_ID'. <br />
     * {UQ : COUNTER : NotNull}
     * @param packageId The value of the column 'Package_ID'. (Nullable)
     */
    public void setPackageId(java.lang.Integer packageId) {
        _modifiedProperties.addPropertyName("packageId");
        this._packageId = packageId;
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

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String parentId_COLUMN = "Parent_ID";

    /**
     * Get the value of the column 'Parent_ID'. <br />
     * {INTEGER}
     * @return The value of the column 'Parent_ID'. (Nullable)
     */
    public java.lang.Integer getParentId() {
        return _parentId;
    }

    /**
     * Set the value of the column 'Parent_ID'. <br />
     * {INTEGER}
     * @param parentId The value of the column 'Parent_ID'. (Nullable)
     */
    public void setParentId(java.lang.Integer parentId) {
        _modifiedProperties.addPropertyName("parentId");
        this._parentId = parentId;
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

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String xmlpath_COLUMN = "XMLPath";

    /**
     * Get the value of the column 'XMLPath'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'XMLPath'. (Nullable)
     */
    public String getXmlpath() {
        return _xmlpath;
    }

    /**
     * Set the value of the column 'XMLPath'. <br />
     * {VARCHAR(255)}
     * @param xmlpath The value of the column 'XMLPath'. (Nullable)
     */
    public void setXmlpath(String xmlpath) {
        _modifiedProperties.addPropertyName("xmlpath");
        this._xmlpath = xmlpath;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String iscontrolled_COLUMN = "IsControlled";

    /**
     * Get the value of the column 'IsControlled'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'IsControlled'. (Nullable)
     */
    public Boolean getIscontrolled() {
        return _iscontrolled;
    }

    /**
     * Set the value of the column 'IsControlled'. <br />
     * {BIT : NotNull}
     * @param iscontrolled The value of the column 'IsControlled'. (Nullable)
     */
    public void setIscontrolled(Boolean iscontrolled) {
        _modifiedProperties.addPropertyName("iscontrolled");
        this._iscontrolled = iscontrolled;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String lastloaddate_COLUMN = "LastLoadDate";

    /**
     * Get the value of the column 'LastLoadDate'. <br />
     * {DATETIME}
     * @return The value of the column 'LastLoadDate'. (Nullable)
     */
    public java.sql.Timestamp getLastloaddate() {
        return _lastloaddate;
    }

    /**
     * Set the value of the column 'LastLoadDate'. <br />
     * {DATETIME}
     * @param lastloaddate The value of the column 'LastLoadDate'. (Nullable)
     */
    public void setLastloaddate(java.sql.Timestamp lastloaddate) {
        _modifiedProperties.addPropertyName("lastloaddate");
        this._lastloaddate = lastloaddate;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String lastsavedate_COLUMN = "LastSaveDate";

    /**
     * Get the value of the column 'LastSaveDate'. <br />
     * {DATETIME}
     * @return The value of the column 'LastSaveDate'. (Nullable)
     */
    public java.sql.Timestamp getLastsavedate() {
        return _lastsavedate;
    }

    /**
     * Set the value of the column 'LastSaveDate'. <br />
     * {DATETIME}
     * @param lastsavedate The value of the column 'LastSaveDate'. (Nullable)
     */
    public void setLastsavedate(java.sql.Timestamp lastsavedate) {
        _modifiedProperties.addPropertyName("lastsavedate");
        this._lastsavedate = lastsavedate;
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
    public static final String pkgowner_COLUMN = "PkgOwner";

    /**
     * Get the value of the column 'PkgOwner'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PkgOwner'. (Nullable)
     */
    public String getPkgowner() {
        return _pkgowner;
    }

    /**
     * Set the value of the column 'PkgOwner'. <br />
     * {VARCHAR(255)}
     * @param pkgowner The value of the column 'PkgOwner'. (Nullable)
     */
    public void setPkgowner(String pkgowner) {
        _modifiedProperties.addPropertyName("pkgowner");
        this._pkgowner = pkgowner;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String umlversion_COLUMN = "UMLVersion";

    /**
     * Get the value of the column 'UMLVersion'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'UMLVersion'. (Nullable)
     */
    public String getUmlversion() {
        return _umlversion;
    }

    /**
     * Set the value of the column 'UMLVersion'. <br />
     * {VARCHAR(50)}
     * @param umlversion The value of the column 'UMLVersion'. (Nullable)
     */
    public void setUmlversion(String umlversion) {
        _modifiedProperties.addPropertyName("umlversion");
        this._umlversion = umlversion;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String usedtd_COLUMN = "UseDTD";

    /**
     * Get the value of the column 'UseDTD'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'UseDTD'. (Nullable)
     */
    public Boolean getUsedtd() {
        return _usedtd;
    }

    /**
     * Set the value of the column 'UseDTD'. <br />
     * {BIT : NotNull}
     * @param usedtd The value of the column 'UseDTD'. (Nullable)
     */
    public void setUsedtd(Boolean usedtd) {
        _modifiedProperties.addPropertyName("usedtd");
        this._usedtd = usedtd;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String logxml_COLUMN = "LogXML";

    /**
     * Get the value of the column 'LogXML'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'LogXML'. (Nullable)
     */
    public Boolean getLogxml() {
        return _logxml;
    }

    /**
     * Set the value of the column 'LogXML'. <br />
     * {BIT : NotNull}
     * @param logxml The value of the column 'LogXML'. (Nullable)
     */
    public void setLogxml(Boolean logxml) {
        _modifiedProperties.addPropertyName("logxml");
        this._logxml = logxml;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String codepath_COLUMN = "CodePath";

    /**
     * Get the value of the column 'CodePath'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'CodePath'. (Nullable)
     */
    public String getCodepath() {
        return _codepath;
    }

    /**
     * Set the value of the column 'CodePath'. <br />
     * {VARCHAR(255)}
     * @param codepath The value of the column 'CodePath'. (Nullable)
     */
    public void setCodepath(String codepath) {
        _modifiedProperties.addPropertyName("codepath");
        this._codepath = codepath;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String namespace_COLUMN = "Namespace";

    /**
     * Get the value of the column 'Namespace'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Namespace'. (Nullable)
     */
    public String getNamespace() {
        return _namespace;
    }

    /**
     * Set the value of the column 'Namespace'. <br />
     * {VARCHAR(50)}
     * @param namespace The value of the column 'Namespace'. (Nullable)
     */
    public void setNamespace(String namespace) {
        _modifiedProperties.addPropertyName("namespace");
        this._namespace = namespace;
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

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String batchsave_COLUMN = "BatchSave";

    /**
     * Get the value of the column 'BatchSave'. <br />
     * {INTEGER}
     * @return The value of the column 'BatchSave'. (Nullable)
     */
    public java.lang.Integer getBatchsave() {
        return _batchsave;
    }

    /**
     * Set the value of the column 'BatchSave'. <br />
     * {INTEGER}
     * @param batchsave The value of the column 'BatchSave'. (Nullable)
     */
    public void setBatchsave(java.lang.Integer batchsave) {
        _modifiedProperties.addPropertyName("batchsave");
        this._batchsave = batchsave;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String batchload_COLUMN = "BatchLoad";

    /**
     * Get the value of the column 'BatchLoad'. <br />
     * {INTEGER}
     * @return The value of the column 'BatchLoad'. (Nullable)
     */
    public java.lang.Integer getBatchload() {
        return _batchload;
    }

    /**
     * Set the value of the column 'BatchLoad'. <br />
     * {INTEGER}
     * @param batchload The value of the column 'BatchLoad'. (Nullable)
     */
    public void setBatchload(java.lang.Integer batchload) {
        _modifiedProperties.addPropertyName("batchload");
        this._batchload = batchload;
    }

}
