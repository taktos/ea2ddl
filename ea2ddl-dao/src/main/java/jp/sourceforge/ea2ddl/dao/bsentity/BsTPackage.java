package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_package that the type is TABLE. <br />
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
public abstract class BsTPackage implements Entity, Serializable {

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
    /** Package_ID: {UQ : NotNull : COUNTER} */
    protected java.lang.Integer _packageId;

    /** Name: {VARCHAR(255)} */
    protected String _name;

    /** Parent_ID: {INTEGER} */
    protected java.lang.Integer _parentId;

    /** CreatedDate: {DATETIME} */
    protected java.sql.Timestamp _createddate;

    /** ModifiedDate: {DATETIME} */
    protected java.sql.Timestamp _modifieddate;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** ea_guid: {UQ : VARCHAR(40)} */
    protected String _eaGuid;

    /** XMLPath: {VARCHAR(255)} */
    protected String _xmlpath;

    /** IsControlled: {NotNull : BIT} */
    protected Boolean _iscontrolled;

    /** LastLoadDate: {DATETIME} */
    protected java.sql.Timestamp _lastloaddate;

    /** LastSaveDate: {DATETIME} */
    protected java.sql.Timestamp _lastsavedate;

    /** Version: {VARCHAR(50)} */
    protected String _version;

    /** PkgOwner: {VARCHAR(255)} */
    protected String _pkgowner;

    /** UMLVersion: {VARCHAR(50)} */
    protected String _umlversion;

    /** UseDTD: {NotNull : BIT} */
    protected Boolean _usedtd;

    /** LogXML: {NotNull : BIT} */
    protected Boolean _logxml;

    /** CodePath: {VARCHAR(255)} */
    protected String _codepath;

    /** Namespace: {VARCHAR(50)} */
    protected String _namespace;

    /** TPos: {INTEGER} */
    protected java.lang.Integer _tpos;

    /** PackageFlags: {VARCHAR(255)} */
    protected String _packageflags;

    /** BatchSave: {INTEGER} */
    protected java.lang.Integer _batchsave;

    /** BatchLoad: {INTEGER} */
    protected java.lang.Integer _batchload;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_package";
    }

    public String getTablePropertyName() { // as JavaBeansRule
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
    /**
     * Package_ID: {UQ : NotNull : COUNTER} <br />
     * @return The value of the column 'Package_ID'. (Nullable)
     */
    public java.lang.Integer getPackageId() {
        return _packageId;
    }

    /**
     * Package_ID: {UQ : NotNull : COUNTER} <br />
     * @param packageId The value of the column 'Package_ID'. (Nullable)
     */
    public void setPackageId(java.lang.Integer packageId) {
        _modifiedProperties.addPropertyName("packageId");
        this._packageId = packageId;
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
     * Parent_ID: {INTEGER} <br />
     * @return The value of the column 'Parent_ID'. (Nullable)
     */
    public java.lang.Integer getParentId() {
        return _parentId;
    }

    /**
     * Parent_ID: {INTEGER} <br />
     * @param parentId The value of the column 'Parent_ID'. (Nullable)
     */
    public void setParentId(java.lang.Integer parentId) {
        _modifiedProperties.addPropertyName("parentId");
        this._parentId = parentId;
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
     * XMLPath: {VARCHAR(255)} <br />
     * @return The value of the column 'XMLPath'. (Nullable)
     */
    public String getXmlpath() {
        return _xmlpath;
    }

    /**
     * XMLPath: {VARCHAR(255)} <br />
     * @param xmlpath The value of the column 'XMLPath'. (Nullable)
     */
    public void setXmlpath(String xmlpath) {
        _modifiedProperties.addPropertyName("xmlpath");
        this._xmlpath = xmlpath;
    }

    /**
     * IsControlled: {NotNull : BIT} <br />
     * @return The value of the column 'IsControlled'. (Nullable)
     */
    public Boolean getIscontrolled() {
        return _iscontrolled;
    }

    /**
     * IsControlled: {NotNull : BIT} <br />
     * @param iscontrolled The value of the column 'IsControlled'. (Nullable)
     */
    public void setIscontrolled(Boolean iscontrolled) {
        _modifiedProperties.addPropertyName("iscontrolled");
        this._iscontrolled = iscontrolled;
    }

    /**
     * LastLoadDate: {DATETIME} <br />
     * @return The value of the column 'LastLoadDate'. (Nullable)
     */
    public java.sql.Timestamp getLastloaddate() {
        return _lastloaddate;
    }

    /**
     * LastLoadDate: {DATETIME} <br />
     * @param lastloaddate The value of the column 'LastLoadDate'. (Nullable)
     */
    public void setLastloaddate(java.sql.Timestamp lastloaddate) {
        _modifiedProperties.addPropertyName("lastloaddate");
        this._lastloaddate = lastloaddate;
    }

    /**
     * LastSaveDate: {DATETIME} <br />
     * @return The value of the column 'LastSaveDate'. (Nullable)
     */
    public java.sql.Timestamp getLastsavedate() {
        return _lastsavedate;
    }

    /**
     * LastSaveDate: {DATETIME} <br />
     * @param lastsavedate The value of the column 'LastSaveDate'. (Nullable)
     */
    public void setLastsavedate(java.sql.Timestamp lastsavedate) {
        _modifiedProperties.addPropertyName("lastsavedate");
        this._lastsavedate = lastsavedate;
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
     * PkgOwner: {VARCHAR(255)} <br />
     * @return The value of the column 'PkgOwner'. (Nullable)
     */
    public String getPkgowner() {
        return _pkgowner;
    }

    /**
     * PkgOwner: {VARCHAR(255)} <br />
     * @param pkgowner The value of the column 'PkgOwner'. (Nullable)
     */
    public void setPkgowner(String pkgowner) {
        _modifiedProperties.addPropertyName("pkgowner");
        this._pkgowner = pkgowner;
    }

    /**
     * UMLVersion: {VARCHAR(50)} <br />
     * @return The value of the column 'UMLVersion'. (Nullable)
     */
    public String getUmlversion() {
        return _umlversion;
    }

    /**
     * UMLVersion: {VARCHAR(50)} <br />
     * @param umlversion The value of the column 'UMLVersion'. (Nullable)
     */
    public void setUmlversion(String umlversion) {
        _modifiedProperties.addPropertyName("umlversion");
        this._umlversion = umlversion;
    }

    /**
     * UseDTD: {NotNull : BIT} <br />
     * @return The value of the column 'UseDTD'. (Nullable)
     */
    public Boolean getUsedtd() {
        return _usedtd;
    }

    /**
     * UseDTD: {NotNull : BIT} <br />
     * @param usedtd The value of the column 'UseDTD'. (Nullable)
     */
    public void setUsedtd(Boolean usedtd) {
        _modifiedProperties.addPropertyName("usedtd");
        this._usedtd = usedtd;
    }

    /**
     * LogXML: {NotNull : BIT} <br />
     * @return The value of the column 'LogXML'. (Nullable)
     */
    public Boolean getLogxml() {
        return _logxml;
    }

    /**
     * LogXML: {NotNull : BIT} <br />
     * @param logxml The value of the column 'LogXML'. (Nullable)
     */
    public void setLogxml(Boolean logxml) {
        _modifiedProperties.addPropertyName("logxml");
        this._logxml = logxml;
    }

    /**
     * CodePath: {VARCHAR(255)} <br />
     * @return The value of the column 'CodePath'. (Nullable)
     */
    public String getCodepath() {
        return _codepath;
    }

    /**
     * CodePath: {VARCHAR(255)} <br />
     * @param codepath The value of the column 'CodePath'. (Nullable)
     */
    public void setCodepath(String codepath) {
        _modifiedProperties.addPropertyName("codepath");
        this._codepath = codepath;
    }

    /**
     * Namespace: {VARCHAR(50)} <br />
     * @return The value of the column 'Namespace'. (Nullable)
     */
    public String getNamespace() {
        return _namespace;
    }

    /**
     * Namespace: {VARCHAR(50)} <br />
     * @param namespace The value of the column 'Namespace'. (Nullable)
     */
    public void setNamespace(String namespace) {
        _modifiedProperties.addPropertyName("namespace");
        this._namespace = namespace;
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
     * BatchSave: {INTEGER} <br />
     * @return The value of the column 'BatchSave'. (Nullable)
     */
    public java.lang.Integer getBatchsave() {
        return _batchsave;
    }

    /**
     * BatchSave: {INTEGER} <br />
     * @param batchsave The value of the column 'BatchSave'. (Nullable)
     */
    public void setBatchsave(java.lang.Integer batchsave) {
        _modifiedProperties.addPropertyName("batchsave");
        this._batchsave = batchsave;
    }

    /**
     * BatchLoad: {INTEGER} <br />
     * @return The value of the column 'BatchLoad'. (Nullable)
     */
    public java.lang.Integer getBatchload() {
        return _batchload;
    }

    /**
     * BatchLoad: {INTEGER} <br />
     * @param batchload The value of the column 'BatchLoad'. (Nullable)
     */
    public void setBatchload(java.lang.Integer batchload) {
        _modifiedProperties.addPropertyName("batchload");
        this._batchload = batchload;
    }
}
