package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_files(TABLE).
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
@SuppressWarnings("unchecked")
public abstract class BsTFiles implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_files. */
    public static final String TABLE = "t_files";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'FileID'. {UQ : VARCHAR(50)} */
    protected String _fileid;

    /** The attribute of the column 'AppliesTo'. {VARCHAR(50)} */
    protected String _appliesto;

    /** The attribute of the column 'Category'. {VARCHAR(100)} */
    protected String _category;

    /** The attribute of the column 'Name'. {VARCHAR(150)} */
    protected String _name;

    /** The attribute of the column 'File'. {VARCHAR(255)} */
    protected String _file;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'FileDate'. {DATETIME} */
    protected java.sql.Timestamp _filedate;

    /** The attribute of the column 'FileSize'. {INTEGER} */
    protected java.lang.Integer _filesize;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTFiles() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_files";
    }

    public String getTablePropertyName() {// as JavaBeansRule
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

    /** The column annotation for S2Dao. {UQ : VARCHAR(50)} */
    public static final String fileid_COLUMN = "FileID";

    /**
     * Get the value of the column 'FileID'. <br />
     * {UQ : VARCHAR(50)}
     * @return The value of the column 'FileID'. (Nullable)
     */
    public String getFileid() {
        return _fileid;
    }

    /**
     * Set the value of the column 'FileID'. <br />
     * {UQ : VARCHAR(50)}
     * @param fileid The value of the column 'FileID'. (Nullable)
     */
    public void setFileid(String fileid) {
        _modifiedProperties.addPropertyName("fileid");
        this._fileid = fileid;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String appliesto_COLUMN = "AppliesTo";

    /**
     * Get the value of the column 'AppliesTo'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'AppliesTo'. (Nullable)
     */
    public String getAppliesto() {
        return _appliesto;
    }

    /**
     * Set the value of the column 'AppliesTo'. <br />
     * {VARCHAR(50)}
     * @param appliesto The value of the column 'AppliesTo'. (Nullable)
     */
    public void setAppliesto(String appliesto) {
        _modifiedProperties.addPropertyName("appliesto");
        this._appliesto = appliesto;
    }

    /** The column annotation for S2Dao. {VARCHAR(100)} */
    public static final String category_COLUMN = "Category";

    /**
     * Get the value of the column 'Category'. <br />
     * {VARCHAR(100)}
     * @return The value of the column 'Category'. (Nullable)
     */
    public String getCategory() {
        return _category;
    }

    /**
     * Set the value of the column 'Category'. <br />
     * {VARCHAR(100)}
     * @param category The value of the column 'Category'. (Nullable)
     */
    public void setCategory(String category) {
        _modifiedProperties.addPropertyName("category");
        this._category = category;
    }

    /** The column annotation for S2Dao. {VARCHAR(150)} */
    public static final String name_COLUMN = "Name";

    /**
     * Get the value of the column 'Name'. <br />
     * {VARCHAR(150)}
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Set the value of the column 'Name'. <br />
     * {VARCHAR(150)}
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String file_COLUMN = "File";

    /**
     * Get the value of the column 'File'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'File'. (Nullable)
     */
    public String getFile() {
        return _file;
    }

    /**
     * Set the value of the column 'File'. <br />
     * {VARCHAR(255)}
     * @param file The value of the column 'File'. (Nullable)
     */
    public void setFile(String file) {
        _modifiedProperties.addPropertyName("file");
        this._file = file;
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

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String filedate_COLUMN = "FileDate";

    /**
     * Get the value of the column 'FileDate'. <br />
     * {DATETIME}
     * @return The value of the column 'FileDate'. (Nullable)
     */
    public java.sql.Timestamp getFiledate() {
        return _filedate;
    }

    /**
     * Set the value of the column 'FileDate'. <br />
     * {DATETIME}
     * @param filedate The value of the column 'FileDate'. (Nullable)
     */
    public void setFiledate(java.sql.Timestamp filedate) {
        _modifiedProperties.addPropertyName("filedate");
        this._filedate = filedate;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String filesize_COLUMN = "FileSize";

    /**
     * Get the value of the column 'FileSize'. <br />
     * {INTEGER}
     * @return The value of the column 'FileSize'. (Nullable)
     */
    public java.lang.Integer getFilesize() {
        return _filesize;
    }

    /**
     * Set the value of the column 'FileSize'. <br />
     * {INTEGER}
     * @param filesize The value of the column 'FileSize'. (Nullable)
     */
    public void setFilesize(java.lang.Integer filesize) {
        _modifiedProperties.addPropertyName("filesize");
        this._filesize = filesize;
    }

}
