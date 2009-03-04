package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_files that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     FileID, AppliesTo, Category, Name, File, Notes, FileDate, FileSize
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
public abstract class BsTFiles implements Entity, Serializable {

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
    /** FileID: {UQ : VARCHAR(50)} */
    protected String _fileid;

    /** AppliesTo: {VARCHAR(50)} */
    protected String _appliesto;

    /** Category: {VARCHAR(100)} */
    protected String _category;

    /** Name: {VARCHAR(150)} */
    protected String _name;

    /** File: {VARCHAR(255)} */
    protected String _file;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** FileDate: {DATETIME} */
    protected java.sql.Timestamp _filedate;

    /** FileSize: {INTEGER} */
    protected java.lang.Integer _filesize;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_files";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TFiles";
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
        if (other == null || !(other instanceof BsTFiles)) { return false; }
        final BsTFiles otherEntity = (BsTFiles)other;
        if (!helpComparingValue(getFileid(), otherEntity.getFileid())) { return false; }
        if (!helpComparingValue(getAppliesto(), otherEntity.getAppliesto())) { return false; }
        if (!helpComparingValue(getCategory(), otherEntity.getCategory())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getFile(), otherEntity.getFile())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getFiledate(), otherEntity.getFiledate())) { return false; }
        if (!helpComparingValue(getFilesize(), otherEntity.getFilesize())) { return false; }
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
        if (this.getFileid() != null) { result = result + this.getFileid().hashCode(); }
        if (this.getAppliesto() != null) { result = result + this.getAppliesto().hashCode(); }
        if (this.getCategory() != null) { result = result + this.getCategory().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getFile() != null) { result = result + this.getFile().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getFiledate() != null) { result = result + this.getFiledate().hashCode(); }
        if (this.getFilesize() != null) { result = result + this.getFilesize().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getFileid());
        sb.append(delimiter).append(getAppliesto());
        sb.append(delimiter).append(getCategory());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getFile());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getFiledate());
        sb.append(delimiter).append(getFilesize());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * FileID: {UQ : VARCHAR(50)} <br />
     * @return The value of the column 'FileID'. (Nullable)
     */
    public String getFileid() {
        return _fileid;
    }

    /**
     * FileID: {UQ : VARCHAR(50)} <br />
     * @param fileid The value of the column 'FileID'. (Nullable)
     */
    public void setFileid(String fileid) {
        _modifiedProperties.addPropertyName("fileid");
        this._fileid = fileid;
    }

    /**
     * AppliesTo: {VARCHAR(50)} <br />
     * @return The value of the column 'AppliesTo'. (Nullable)
     */
    public String getAppliesto() {
        return _appliesto;
    }

    /**
     * AppliesTo: {VARCHAR(50)} <br />
     * @param appliesto The value of the column 'AppliesTo'. (Nullable)
     */
    public void setAppliesto(String appliesto) {
        _modifiedProperties.addPropertyName("appliesto");
        this._appliesto = appliesto;
    }

    /**
     * Category: {VARCHAR(100)} <br />
     * @return The value of the column 'Category'. (Nullable)
     */
    public String getCategory() {
        return _category;
    }

    /**
     * Category: {VARCHAR(100)} <br />
     * @param category The value of the column 'Category'. (Nullable)
     */
    public void setCategory(String category) {
        _modifiedProperties.addPropertyName("category");
        this._category = category;
    }

    /**
     * Name: {VARCHAR(150)} <br />
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Name: {VARCHAR(150)} <br />
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /**
     * File: {VARCHAR(255)} <br />
     * @return The value of the column 'File'. (Nullable)
     */
    public String getFile() {
        return _file;
    }

    /**
     * File: {VARCHAR(255)} <br />
     * @param file The value of the column 'File'. (Nullable)
     */
    public void setFile(String file) {
        _modifiedProperties.addPropertyName("file");
        this._file = file;
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
     * FileDate: {DATETIME} <br />
     * @return The value of the column 'FileDate'. (Nullable)
     */
    public java.sql.Timestamp getFiledate() {
        return _filedate;
    }

    /**
     * FileDate: {DATETIME} <br />
     * @param filedate The value of the column 'FileDate'. (Nullable)
     */
    public void setFiledate(java.sql.Timestamp filedate) {
        _modifiedProperties.addPropertyName("filedate");
        this._filedate = filedate;
    }

    /**
     * FileSize: {INTEGER} <br />
     * @return The value of the column 'FileSize'. (Nullable)
     */
    public java.lang.Integer getFilesize() {
        return _filesize;
    }

    /**
     * FileSize: {INTEGER} <br />
     * @param filesize The value of the column 'FileSize'. (Nullable)
     */
    public void setFilesize(java.lang.Integer filesize) {
        _modifiedProperties.addPropertyName("filesize");
        this._filesize = filesize;
    }
}
