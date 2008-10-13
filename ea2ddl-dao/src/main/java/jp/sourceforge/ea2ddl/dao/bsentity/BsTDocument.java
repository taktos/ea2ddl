package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_document(TABLE).
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
@SuppressWarnings("unchecked")
public abstract class BsTDocument implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_document. */
    public static final String TABLE = "t_document";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'DocID'. {UQ : VARCHAR(40)} */
    protected String _docid;

    /** The attribute of the column 'DocName'. {VARCHAR(100)} */
    protected String _docname;

    /** The attribute of the column 'Notes'. {VARCHAR(255)} */
    protected String _notes;

    /** The attribute of the column 'Style'. {VARCHAR(255)} */
    protected String _style;

    /** The attribute of the column 'ElementID'. {VARCHAR(40)} */
    protected String _elementid;

    /** The attribute of the column 'ElementType'. {VARCHAR(50)} */
    protected String _elementtype;

    /** The attribute of the column 'StrContent'. {LONGCHAR(2147483647)} */
    protected String _strcontent;

    /** The attribute of the column 'BinContent'. {LONGBINARY} */
    protected byte[] _bincontent;

    /** The attribute of the column 'DocType'. {VARCHAR(100)} */
    protected String _doctype;

    /** The attribute of the column 'Author'. {VARCHAR(255)} */
    protected String _author;

    /** The attribute of the column 'Version'. {VARCHAR(50)} */
    protected String _version;

    /** The attribute of the column 'IsActive'. {INTEGER} */
    protected java.lang.Integer _isactive;

    /** The attribute of the column 'Sequence'. {INTEGER} */
    protected java.lang.Integer _sequence;

    /** The attribute of the column 'DocDate'. {DATETIME} */
    protected java.sql.Timestamp _docdate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTDocument() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_document";
    }

    public String getTablePropertyName() {// as JavaBeansRule
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

    /** The column annotation for S2Dao. {UQ : VARCHAR(40)} */
    public static final String docid_COLUMN = "DocID";

    /**
     * Get the value of the column 'DocID'. <br />
     * {UQ : VARCHAR(40)}
     * @return The value of the column 'DocID'. (Nullable)
     */
    public String getDocid() {
        return _docid;
    }

    /**
     * Set the value of the column 'DocID'. <br />
     * {UQ : VARCHAR(40)}
     * @param docid The value of the column 'DocID'. (Nullable)
     */
    public void setDocid(String docid) {
        _modifiedProperties.addPropertyName("docid");
        this._docid = docid;
    }

    /** The column annotation for S2Dao. {VARCHAR(100)} */
    public static final String docname_COLUMN = "DocName";

    /**
     * Get the value of the column 'DocName'. <br />
     * {VARCHAR(100)}
     * @return The value of the column 'DocName'. (Nullable)
     */
    public String getDocname() {
        return _docname;
    }

    /**
     * Set the value of the column 'DocName'. <br />
     * {VARCHAR(100)}
     * @param docname The value of the column 'DocName'. (Nullable)
     */
    public void setDocname(String docname) {
        _modifiedProperties.addPropertyName("docname");
        this._docname = docname;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String notes_COLUMN = "Notes";

    /**
     * Get the value of the column 'Notes'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Notes'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * Set the value of the column 'Notes'. <br />
     * {VARCHAR(255)}
     * @param notes The value of the column 'Notes'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String style_COLUMN = "Style";

    /**
     * Get the value of the column 'Style'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Style'. (Nullable)
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Set the value of the column 'Style'. <br />
     * {VARCHAR(255)}
     * @param style The value of the column 'Style'. (Nullable)
     */
    public void setStyle(String style) {
        _modifiedProperties.addPropertyName("style");
        this._style = style;
    }

    /** The column annotation for S2Dao. {VARCHAR(40)} */
    public static final String elementid_COLUMN = "ElementID";

    /**
     * Get the value of the column 'ElementID'. <br />
     * {VARCHAR(40)}
     * @return The value of the column 'ElementID'. (Nullable)
     */
    public String getElementid() {
        return _elementid;
    }

    /**
     * Set the value of the column 'ElementID'. <br />
     * {VARCHAR(40)}
     * @param elementid The value of the column 'ElementID'. (Nullable)
     */
    public void setElementid(String elementid) {
        _modifiedProperties.addPropertyName("elementid");
        this._elementid = elementid;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String elementtype_COLUMN = "ElementType";

    /**
     * Get the value of the column 'ElementType'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'ElementType'. (Nullable)
     */
    public String getElementtype() {
        return _elementtype;
    }

    /**
     * Set the value of the column 'ElementType'. <br />
     * {VARCHAR(50)}
     * @param elementtype The value of the column 'ElementType'. (Nullable)
     */
    public void setElementtype(String elementtype) {
        _modifiedProperties.addPropertyName("elementtype");
        this._elementtype = elementtype;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String strcontent_COLUMN = "StrContent";

    /**
     * Get the value of the column 'StrContent'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'StrContent'. (Nullable)
     */
    public String getStrcontent() {
        return _strcontent;
    }

    /**
     * Set the value of the column 'StrContent'. <br />
     * {LONGCHAR(2147483647)}
     * @param strcontent The value of the column 'StrContent'. (Nullable)
     */
    public void setStrcontent(String strcontent) {
        _modifiedProperties.addPropertyName("strcontent");
        this._strcontent = strcontent;
    }

    /** The column annotation for S2Dao. {LONGBINARY} */
    public static final String bincontent_COLUMN = "BinContent";

    /**
     * Get the value of the column 'BinContent'. <br />
     * {LONGBINARY}
     * @return The value of the column 'BinContent'. (Nullable)
     */
    public byte[] getBincontent() {
        return _bincontent;
    }

    /**
     * Set the value of the column 'BinContent'. <br />
     * {LONGBINARY}
     * @param bincontent The value of the column 'BinContent'. (Nullable)
     */
    public void setBincontent(byte[] bincontent) {
        _modifiedProperties.addPropertyName("bincontent");
        this._bincontent = bincontent;
    }

    /** The column annotation for S2Dao. {VARCHAR(100)} */
    public static final String doctype_COLUMN = "DocType";

    /**
     * Get the value of the column 'DocType'. <br />
     * {VARCHAR(100)}
     * @return The value of the column 'DocType'. (Nullable)
     */
    public String getDoctype() {
        return _doctype;
    }

    /**
     * Set the value of the column 'DocType'. <br />
     * {VARCHAR(100)}
     * @param doctype The value of the column 'DocType'. (Nullable)
     */
    public void setDoctype(String doctype) {
        _modifiedProperties.addPropertyName("doctype");
        this._doctype = doctype;
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

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String isactive_COLUMN = "IsActive";

    /**
     * Get the value of the column 'IsActive'. <br />
     * {INTEGER}
     * @return The value of the column 'IsActive'. (Nullable)
     */
    public java.lang.Integer getIsactive() {
        return _isactive;
    }

    /**
     * Set the value of the column 'IsActive'. <br />
     * {INTEGER}
     * @param isactive The value of the column 'IsActive'. (Nullable)
     */
    public void setIsactive(java.lang.Integer isactive) {
        _modifiedProperties.addPropertyName("isactive");
        this._isactive = isactive;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String sequence_COLUMN = "Sequence";

    /**
     * Get the value of the column 'Sequence'. <br />
     * {INTEGER}
     * @return The value of the column 'Sequence'. (Nullable)
     */
    public java.lang.Integer getSequence() {
        return _sequence;
    }

    /**
     * Set the value of the column 'Sequence'. <br />
     * {INTEGER}
     * @param sequence The value of the column 'Sequence'. (Nullable)
     */
    public void setSequence(java.lang.Integer sequence) {
        _modifiedProperties.addPropertyName("sequence");
        this._sequence = sequence;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String docdate_COLUMN = "DocDate";

    /**
     * Get the value of the column 'DocDate'. <br />
     * {DATETIME}
     * @return The value of the column 'DocDate'. (Nullable)
     */
    public java.sql.Timestamp getDocdate() {
        return _docdate;
    }

    /**
     * Set the value of the column 'DocDate'. <br />
     * {DATETIME}
     * @param docdate The value of the column 'DocDate'. (Nullable)
     */
    public void setDocdate(java.sql.Timestamp docdate) {
        _modifiedProperties.addPropertyName("docdate");
        this._docdate = docdate;
    }

}
