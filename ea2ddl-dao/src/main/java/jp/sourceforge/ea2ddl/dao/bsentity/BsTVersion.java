package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_version that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     ElementID, VersionID, ElementType, Flags, ExternalFile, Notes, Owner, VersionDate, Branch, ElementXML
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
public abstract class BsTVersion implements Entity, Serializable {

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
    /** ElementID: {UQ : VARCHAR(50)} */
    protected String _elementid;

    /** VersionID: {UQ : VARCHAR(255)} */
    protected String _versionid;

    /** ElementType: {VARCHAR(100)} */
    protected String _elementtype;

    /** Flags: {VARCHAR(255)} */
    protected String _flags;

    /** ExternalFile: {VARCHAR(255)} */
    protected String _externalfile;

    /** Notes: {VARCHAR(255)} */
    protected String _notes;

    /** Owner: {VARCHAR(255)} */
    protected String _owner;

    /** VersionDate: {DATETIME} */
    protected java.sql.Timestamp _versiondate;

    /** Branch: {VARCHAR(255)} */
    protected String _branch;

    /** ElementXML: {LONGCHAR(2147483647)} */
    protected String _elementxml;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_version";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TVersion";
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
        if (other == null || !(other instanceof BsTVersion)) { return false; }
        final BsTVersion otherEntity = (BsTVersion)other;
        if (!helpComparingValue(getElementid(), otherEntity.getElementid())) { return false; }
        if (!helpComparingValue(getVersionid(), otherEntity.getVersionid())) { return false; }
        if (!helpComparingValue(getElementtype(), otherEntity.getElementtype())) { return false; }
        if (!helpComparingValue(getFlags(), otherEntity.getFlags())) { return false; }
        if (!helpComparingValue(getExternalfile(), otherEntity.getExternalfile())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getOwner(), otherEntity.getOwner())) { return false; }
        if (!helpComparingValue(getVersiondate(), otherEntity.getVersiondate())) { return false; }
        if (!helpComparingValue(getBranch(), otherEntity.getBranch())) { return false; }
        if (!helpComparingValue(getElementxml(), otherEntity.getElementxml())) { return false; }
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
        if (this.getElementid() != null) { result = result + this.getElementid().hashCode(); }
        if (this.getVersionid() != null) { result = result + this.getVersionid().hashCode(); }
        if (this.getElementtype() != null) { result = result + this.getElementtype().hashCode(); }
        if (this.getFlags() != null) { result = result + this.getFlags().hashCode(); }
        if (this.getExternalfile() != null) { result = result + this.getExternalfile().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getOwner() != null) { result = result + this.getOwner().hashCode(); }
        if (this.getVersiondate() != null) { result = result + this.getVersiondate().hashCode(); }
        if (this.getBranch() != null) { result = result + this.getBranch().hashCode(); }
        if (this.getElementxml() != null) { result = result + this.getElementxml().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getElementid());
        sb.append(delimiter).append(getVersionid());
        sb.append(delimiter).append(getElementtype());
        sb.append(delimiter).append(getFlags());
        sb.append(delimiter).append(getExternalfile());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getOwner());
        sb.append(delimiter).append(getVersiondate());
        sb.append(delimiter).append(getBranch());
        sb.append(delimiter).append(getElementxml());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * ElementID: {UQ : VARCHAR(50)} <br />
     * @return The value of the column 'ElementID'. (Nullable)
     */
    public String getElementid() {
        return _elementid;
    }

    /**
     * ElementID: {UQ : VARCHAR(50)} <br />
     * @param elementid The value of the column 'ElementID'. (Nullable)
     */
    public void setElementid(String elementid) {
        _modifiedProperties.addPropertyName("elementid");
        this._elementid = elementid;
    }

    /**
     * VersionID: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'VersionID'. (Nullable)
     */
    public String getVersionid() {
        return _versionid;
    }

    /**
     * VersionID: {UQ : VARCHAR(255)} <br />
     * @param versionid The value of the column 'VersionID'. (Nullable)
     */
    public void setVersionid(String versionid) {
        _modifiedProperties.addPropertyName("versionid");
        this._versionid = versionid;
    }

    /**
     * ElementType: {VARCHAR(100)} <br />
     * @return The value of the column 'ElementType'. (Nullable)
     */
    public String getElementtype() {
        return _elementtype;
    }

    /**
     * ElementType: {VARCHAR(100)} <br />
     * @param elementtype The value of the column 'ElementType'. (Nullable)
     */
    public void setElementtype(String elementtype) {
        _modifiedProperties.addPropertyName("elementtype");
        this._elementtype = elementtype;
    }

    /**
     * Flags: {VARCHAR(255)} <br />
     * @return The value of the column 'Flags'. (Nullable)
     */
    public String getFlags() {
        return _flags;
    }

    /**
     * Flags: {VARCHAR(255)} <br />
     * @param flags The value of the column 'Flags'. (Nullable)
     */
    public void setFlags(String flags) {
        _modifiedProperties.addPropertyName("flags");
        this._flags = flags;
    }

    /**
     * ExternalFile: {VARCHAR(255)} <br />
     * @return The value of the column 'ExternalFile'. (Nullable)
     */
    public String getExternalfile() {
        return _externalfile;
    }

    /**
     * ExternalFile: {VARCHAR(255)} <br />
     * @param externalfile The value of the column 'ExternalFile'. (Nullable)
     */
    public void setExternalfile(String externalfile) {
        _modifiedProperties.addPropertyName("externalfile");
        this._externalfile = externalfile;
    }

    /**
     * Notes: {VARCHAR(255)} <br />
     * @return The value of the column 'Notes'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * Notes: {VARCHAR(255)} <br />
     * @param notes The value of the column 'Notes'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

    /**
     * Owner: {VARCHAR(255)} <br />
     * @return The value of the column 'Owner'. (Nullable)
     */
    public String getOwner() {
        return _owner;
    }

    /**
     * Owner: {VARCHAR(255)} <br />
     * @param owner The value of the column 'Owner'. (Nullable)
     */
    public void setOwner(String owner) {
        _modifiedProperties.addPropertyName("owner");
        this._owner = owner;
    }

    /**
     * VersionDate: {DATETIME} <br />
     * @return The value of the column 'VersionDate'. (Nullable)
     */
    public java.sql.Timestamp getVersiondate() {
        return _versiondate;
    }

    /**
     * VersionDate: {DATETIME} <br />
     * @param versiondate The value of the column 'VersionDate'. (Nullable)
     */
    public void setVersiondate(java.sql.Timestamp versiondate) {
        _modifiedProperties.addPropertyName("versiondate");
        this._versiondate = versiondate;
    }

    /**
     * Branch: {VARCHAR(255)} <br />
     * @return The value of the column 'Branch'. (Nullable)
     */
    public String getBranch() {
        return _branch;
    }

    /**
     * Branch: {VARCHAR(255)} <br />
     * @param branch The value of the column 'Branch'. (Nullable)
     */
    public void setBranch(String branch) {
        _modifiedProperties.addPropertyName("branch");
        this._branch = branch;
    }

    /**
     * ElementXML: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'ElementXML'. (Nullable)
     */
    public String getElementxml() {
        return _elementxml;
    }

    /**
     * ElementXML: {LONGCHAR(2147483647)} <br />
     * @param elementxml The value of the column 'ElementXML'. (Nullable)
     */
    public void setElementxml(String elementxml) {
        _modifiedProperties.addPropertyName("elementxml");
        this._elementxml = elementxml;
    }
}
