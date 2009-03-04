package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_document that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     DocID, DocName, Notes, Style, ElementID, ElementType, StrContent, BinContent, DocType, Author, Version, IsActive, Sequence, DocDate
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
public abstract class BsTDocument implements Entity, Serializable {

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
    /** DocID: {UQ : VARCHAR(40)} */
    protected String _docid;

    /** DocName: {VARCHAR(100)} */
    protected String _docname;

    /** Notes: {VARCHAR(255)} */
    protected String _notes;

    /** Style: {VARCHAR(255)} */
    protected String _style;

    /** ElementID: {VARCHAR(40)} */
    protected String _elementid;

    /** ElementType: {VARCHAR(50)} */
    protected String _elementtype;

    /** StrContent: {LONGCHAR(2147483647)} */
    protected String _strcontent;

    /** BinContent: {LONGBINARY} */
    protected byte[] _bincontent;

    /** DocType: {VARCHAR(100)} */
    protected String _doctype;

    /** Author: {VARCHAR(255)} */
    protected String _author;

    /** Version: {VARCHAR(50)} */
    protected String _version;

    /** IsActive: {INTEGER} */
    protected java.lang.Integer _isactive;

    /** Sequence: {INTEGER} */
    protected java.lang.Integer _sequence;

    /** DocDate: {DATETIME} */
    protected java.sql.Timestamp _docdate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_document";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TDocument";
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
        if (other == null || !(other instanceof BsTDocument)) { return false; }
        final BsTDocument otherEntity = (BsTDocument)other;
        if (!helpComparingValue(getDocid(), otherEntity.getDocid())) { return false; }
        if (!helpComparingValue(getDocname(), otherEntity.getDocname())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getStyle(), otherEntity.getStyle())) { return false; }
        if (!helpComparingValue(getElementid(), otherEntity.getElementid())) { return false; }
        if (!helpComparingValue(getElementtype(), otherEntity.getElementtype())) { return false; }
        if (!helpComparingValue(getStrcontent(), otherEntity.getStrcontent())) { return false; }
        if (!helpComparingValue(getBincontent(), otherEntity.getBincontent())) { return false; }
        if (!helpComparingValue(getDoctype(), otherEntity.getDoctype())) { return false; }
        if (!helpComparingValue(getAuthor(), otherEntity.getAuthor())) { return false; }
        if (!helpComparingValue(getVersion(), otherEntity.getVersion())) { return false; }
        if (!helpComparingValue(getIsactive(), otherEntity.getIsactive())) { return false; }
        if (!helpComparingValue(getSequence(), otherEntity.getSequence())) { return false; }
        if (!helpComparingValue(getDocdate(), otherEntity.getDocdate())) { return false; }
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
        if (this.getDocid() != null) { result = result + this.getDocid().hashCode(); }
        if (this.getDocname() != null) { result = result + this.getDocname().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getStyle() != null) { result = result + this.getStyle().hashCode(); }
        if (this.getElementid() != null) { result = result + this.getElementid().hashCode(); }
        if (this.getElementtype() != null) { result = result + this.getElementtype().hashCode(); }
        if (this.getStrcontent() != null) { result = result + this.getStrcontent().hashCode(); }
        if (this.getBincontent() != null) { result = result + this.getBincontent().hashCode(); }
        if (this.getDoctype() != null) { result = result + this.getDoctype().hashCode(); }
        if (this.getAuthor() != null) { result = result + this.getAuthor().hashCode(); }
        if (this.getVersion() != null) { result = result + this.getVersion().hashCode(); }
        if (this.getIsactive() != null) { result = result + this.getIsactive().hashCode(); }
        if (this.getSequence() != null) { result = result + this.getSequence().hashCode(); }
        if (this.getDocdate() != null) { result = result + this.getDocdate().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getDocid());
        sb.append(delimiter).append(getDocname());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getStyle());
        sb.append(delimiter).append(getElementid());
        sb.append(delimiter).append(getElementtype());
        sb.append(delimiter).append(getStrcontent());
        sb.append(delimiter).append(getBincontent());
        sb.append(delimiter).append(getDoctype());
        sb.append(delimiter).append(getAuthor());
        sb.append(delimiter).append(getVersion());
        sb.append(delimiter).append(getIsactive());
        sb.append(delimiter).append(getSequence());
        sb.append(delimiter).append(getDocdate());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * DocID: {UQ : VARCHAR(40)} <br />
     * @return The value of the column 'DocID'. (Nullable)
     */
    public String getDocid() {
        return _docid;
    }

    /**
     * DocID: {UQ : VARCHAR(40)} <br />
     * @param docid The value of the column 'DocID'. (Nullable)
     */
    public void setDocid(String docid) {
        _modifiedProperties.addPropertyName("docid");
        this._docid = docid;
    }

    /**
     * DocName: {VARCHAR(100)} <br />
     * @return The value of the column 'DocName'. (Nullable)
     */
    public String getDocname() {
        return _docname;
    }

    /**
     * DocName: {VARCHAR(100)} <br />
     * @param docname The value of the column 'DocName'. (Nullable)
     */
    public void setDocname(String docname) {
        _modifiedProperties.addPropertyName("docname");
        this._docname = docname;
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
     * ElementID: {VARCHAR(40)} <br />
     * @return The value of the column 'ElementID'. (Nullable)
     */
    public String getElementid() {
        return _elementid;
    }

    /**
     * ElementID: {VARCHAR(40)} <br />
     * @param elementid The value of the column 'ElementID'. (Nullable)
     */
    public void setElementid(String elementid) {
        _modifiedProperties.addPropertyName("elementid");
        this._elementid = elementid;
    }

    /**
     * ElementType: {VARCHAR(50)} <br />
     * @return The value of the column 'ElementType'. (Nullable)
     */
    public String getElementtype() {
        return _elementtype;
    }

    /**
     * ElementType: {VARCHAR(50)} <br />
     * @param elementtype The value of the column 'ElementType'. (Nullable)
     */
    public void setElementtype(String elementtype) {
        _modifiedProperties.addPropertyName("elementtype");
        this._elementtype = elementtype;
    }

    /**
     * StrContent: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'StrContent'. (Nullable)
     */
    public String getStrcontent() {
        return _strcontent;
    }

    /**
     * StrContent: {LONGCHAR(2147483647)} <br />
     * @param strcontent The value of the column 'StrContent'. (Nullable)
     */
    public void setStrcontent(String strcontent) {
        _modifiedProperties.addPropertyName("strcontent");
        this._strcontent = strcontent;
    }

    /**
     * BinContent: {LONGBINARY} <br />
     * @return The value of the column 'BinContent'. (Nullable)
     */
    public byte[] getBincontent() {
        return _bincontent;
    }

    /**
     * BinContent: {LONGBINARY} <br />
     * @param bincontent The value of the column 'BinContent'. (Nullable)
     */
    public void setBincontent(byte[] bincontent) {
        _modifiedProperties.addPropertyName("bincontent");
        this._bincontent = bincontent;
    }

    /**
     * DocType: {VARCHAR(100)} <br />
     * @return The value of the column 'DocType'. (Nullable)
     */
    public String getDoctype() {
        return _doctype;
    }

    /**
     * DocType: {VARCHAR(100)} <br />
     * @param doctype The value of the column 'DocType'. (Nullable)
     */
    public void setDoctype(String doctype) {
        _modifiedProperties.addPropertyName("doctype");
        this._doctype = doctype;
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
     * IsActive: {INTEGER} <br />
     * @return The value of the column 'IsActive'. (Nullable)
     */
    public java.lang.Integer getIsactive() {
        return _isactive;
    }

    /**
     * IsActive: {INTEGER} <br />
     * @param isactive The value of the column 'IsActive'. (Nullable)
     */
    public void setIsactive(java.lang.Integer isactive) {
        _modifiedProperties.addPropertyName("isactive");
        this._isactive = isactive;
    }

    /**
     * Sequence: {INTEGER} <br />
     * @return The value of the column 'Sequence'. (Nullable)
     */
    public java.lang.Integer getSequence() {
        return _sequence;
    }

    /**
     * Sequence: {INTEGER} <br />
     * @param sequence The value of the column 'Sequence'. (Nullable)
     */
    public void setSequence(java.lang.Integer sequence) {
        _modifiedProperties.addPropertyName("sequence");
        this._sequence = sequence;
    }

    /**
     * DocDate: {DATETIME} <br />
     * @return The value of the column 'DocDate'. (Nullable)
     */
    public java.sql.Timestamp getDocdate() {
        return _docdate;
    }

    /**
     * DocDate: {DATETIME} <br />
     * @param docdate The value of the column 'DocDate'. (Nullable)
     */
    public void setDocdate(java.sql.Timestamp docdate) {
        _modifiedProperties.addPropertyName("docdate");
        this._docdate = docdate;
    }
}
