package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_objectfiles(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_ID, FileName, Type, Note, FileSize, FileDate
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
public abstract class BsTObjectfiles implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_objectfiles. */
    public static final String TABLE = "t_objectfiles";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Object_ID'. {UQ : INTEGER} */
    protected java.lang.Integer _objectId;

    /** The attribute of the column 'FileName'. {UQ : VARCHAR(255)} */
    protected String _filename;

    /** The attribute of the column 'Type'. {VARCHAR(50)} */
    protected String _type;

    /** The attribute of the column 'Note'. {LONGCHAR(2147483647)} */
    protected String _note;

    /** The attribute of the column 'FileSize'. {VARCHAR(255)} */
    protected String _filesize;

    /** The attribute of the column 'FileDate'. {VARCHAR(255)} */
    protected String _filedate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectfiles() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectfiles";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TObjectfiles";
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
        if (other == null || !(other instanceof BsTObjectfiles)) { return false; }
        final BsTObjectfiles otherEntity = (BsTObjectfiles)other;
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getFilename(), otherEntity.getFilename())) { return false; }
        if (!helpComparingValue(getType(), otherEntity.getType())) { return false; }
        if (!helpComparingValue(getNote(), otherEntity.getNote())) { return false; }
        if (!helpComparingValue(getFilesize(), otherEntity.getFilesize())) { return false; }
        if (!helpComparingValue(getFiledate(), otherEntity.getFiledate())) { return false; }
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
        if (this.getFilename() != null) { result = result + this.getFilename().hashCode(); }
        if (this.getType() != null) { result = result + this.getType().hashCode(); }
        if (this.getNote() != null) { result = result + this.getNote().hashCode(); }
        if (this.getFilesize() != null) { result = result + this.getFilesize().hashCode(); }
        if (this.getFiledate() != null) { result = result + this.getFiledate().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getFilename());
        sb.append(delimiter).append(getType());
        sb.append(delimiter).append(getNote());
        sb.append(delimiter).append(getFilesize());
        sb.append(delimiter).append(getFiledate());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : INTEGER} */
    public static final String objectId_COLUMN = "Object_ID";

    /**
     * Get the value of the column 'Object_ID'. <br />
     * {UQ : INTEGER}
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Set the value of the column 'Object_ID'. <br />
     * {UQ : INTEGER}
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /** The column annotation for S2Dao. {UQ : VARCHAR(255)} */
    public static final String filename_COLUMN = "FileName";

    /**
     * Get the value of the column 'FileName'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'FileName'. (Nullable)
     */
    public String getFilename() {
        return _filename;
    }

    /**
     * Set the value of the column 'FileName'. <br />
     * {UQ : VARCHAR(255)}
     * @param filename The value of the column 'FileName'. (Nullable)
     */
    public void setFilename(String filename) {
        _modifiedProperties.addPropertyName("filename");
        this._filename = filename;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String type_COLUMN = "Type";

    /**
     * Get the value of the column 'Type'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'Type'. (Nullable)
     */
    public String getType() {
        return _type;
    }

    /**
     * Set the value of the column 'Type'. <br />
     * {VARCHAR(50)}
     * @param type The value of the column 'Type'. (Nullable)
     */
    public void setType(String type) {
        _modifiedProperties.addPropertyName("type");
        this._type = type;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String note_COLUMN = "Note";

    /**
     * Get the value of the column 'Note'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Note'. (Nullable)
     */
    public String getNote() {
        return _note;
    }

    /**
     * Set the value of the column 'Note'. <br />
     * {LONGCHAR(2147483647)}
     * @param note The value of the column 'Note'. (Nullable)
     */
    public void setNote(String note) {
        _modifiedProperties.addPropertyName("note");
        this._note = note;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String filesize_COLUMN = "FileSize";

    /**
     * Get the value of the column 'FileSize'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'FileSize'. (Nullable)
     */
    public String getFilesize() {
        return _filesize;
    }

    /**
     * Set the value of the column 'FileSize'. <br />
     * {VARCHAR(255)}
     * @param filesize The value of the column 'FileSize'. (Nullable)
     */
    public void setFilesize(String filesize) {
        _modifiedProperties.addPropertyName("filesize");
        this._filesize = filesize;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String filedate_COLUMN = "FileDate";

    /**
     * Get the value of the column 'FileDate'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'FileDate'. (Nullable)
     */
    public String getFiledate() {
        return _filedate;
    }

    /**
     * Set the value of the column 'FileDate'. <br />
     * {VARCHAR(255)}
     * @param filedate The value of the column 'FileDate'. (Nullable)
     */
    public void setFiledate(String filedate) {
        _modifiedProperties.addPropertyName("filedate");
        this._filedate = filedate;
    }

}
