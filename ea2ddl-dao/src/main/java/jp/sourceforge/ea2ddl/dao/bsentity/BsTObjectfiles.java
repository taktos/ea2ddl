package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_objectfiles that the type is TABLE. <br />
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
public abstract class BsTObjectfiles implements Entity, Serializable {

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
    /** Object_ID: {UQ : INTEGER} */
    protected java.lang.Integer _objectId;

    /** FileName: {UQ : VARCHAR(255)} */
    protected String _filename;

    /** Type: {VARCHAR(50)} */
    protected String _type;

    /** Note: {LONGCHAR(2147483647)} */
    protected String _note;

    /** FileSize: {VARCHAR(255)} */
    protected String _filesize;

    /** FileDate: {VARCHAR(255)} */
    protected String _filedate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectfiles";
    }

    public String getTablePropertyName() { // as JavaBeansRule
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
    /**
     * Object_ID: {UQ : INTEGER} <br />
     * @return The value of the column 'Object_ID'. (Nullable)
     */
    public java.lang.Integer getObjectId() {
        return _objectId;
    }

    /**
     * Object_ID: {UQ : INTEGER} <br />
     * @param objectId The value of the column 'Object_ID'. (Nullable)
     */
    public void setObjectId(java.lang.Integer objectId) {
        _modifiedProperties.addPropertyName("objectId");
        this._objectId = objectId;
    }

    /**
     * FileName: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'FileName'. (Nullable)
     */
    public String getFilename() {
        return _filename;
    }

    /**
     * FileName: {UQ : VARCHAR(255)} <br />
     * @param filename The value of the column 'FileName'. (Nullable)
     */
    public void setFilename(String filename) {
        _modifiedProperties.addPropertyName("filename");
        this._filename = filename;
    }

    /**
     * Type: {VARCHAR(50)} <br />
     * @return The value of the column 'Type'. (Nullable)
     */
    public String getType() {
        return _type;
    }

    /**
     * Type: {VARCHAR(50)} <br />
     * @param type The value of the column 'Type'. (Nullable)
     */
    public void setType(String type) {
        _modifiedProperties.addPropertyName("type");
        this._type = type;
    }

    /**
     * Note: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Note'. (Nullable)
     */
    public String getNote() {
        return _note;
    }

    /**
     * Note: {LONGCHAR(2147483647)} <br />
     * @param note The value of the column 'Note'. (Nullable)
     */
    public void setNote(String note) {
        _modifiedProperties.addPropertyName("note");
        this._note = note;
    }

    /**
     * FileSize: {VARCHAR(255)} <br />
     * @return The value of the column 'FileSize'. (Nullable)
     */
    public String getFilesize() {
        return _filesize;
    }

    /**
     * FileSize: {VARCHAR(255)} <br />
     * @param filesize The value of the column 'FileSize'. (Nullable)
     */
    public void setFilesize(String filesize) {
        _modifiedProperties.addPropertyName("filesize");
        this._filesize = filesize;
    }

    /**
     * FileDate: {VARCHAR(255)} <br />
     * @return The value of the column 'FileDate'. (Nullable)
     */
    public String getFiledate() {
        return _filedate;
    }

    /**
     * FileDate: {VARCHAR(255)} <br />
     * @param filedate The value of the column 'FileDate'. (Nullable)
     */
    public void setFiledate(String filedate) {
        _modifiedProperties.addPropertyName("filedate");
        this._filedate = filedate;
    }
}
