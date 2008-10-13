package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_snapshot(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     SnapshotID, SeriesID, Position, SnapshotName, Notes, Style, ElementID, ElementType, StrContent, BinContent1, BinContent2
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
public abstract class BsTSnapshot implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_snapshot. */
    public static final String TABLE = "t_snapshot";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'SnapshotID'. {UQ : VARCHAR(40)} */
    protected String _snapshotid;

    /** The attribute of the column 'SeriesID'. {VARCHAR(40)} */
    protected String _seriesid;

    /** The attribute of the column 'Position'. {INTEGER} */
    protected java.lang.Integer _position;

    /** The attribute of the column 'SnapshotName'. {VARCHAR(100)} */
    protected String _snapshotname;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'Style'. {VARCHAR(255)} */
    protected String _style;

    /** The attribute of the column 'ElementID'. {VARCHAR(40)} */
    protected String _elementid;

    /** The attribute of the column 'ElementType'. {VARCHAR(50)} */
    protected String _elementtype;

    /** The attribute of the column 'StrContent'. {LONGCHAR(2147483647)} */
    protected String _strcontent;

    /** The attribute of the column 'BinContent1'. {LONGBINARY} */
    protected byte[] _bincontent1;

    /** The attribute of the column 'BinContent2'. {LONGBINARY} */
    protected byte[] _bincontent2;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSnapshot() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_snapshot";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TSnapshot";
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
        if (other == null || !(other instanceof BsTSnapshot)) { return false; }
        final BsTSnapshot otherEntity = (BsTSnapshot)other;
        if (!helpComparingValue(getSnapshotid(), otherEntity.getSnapshotid())) { return false; }
        if (!helpComparingValue(getSeriesid(), otherEntity.getSeriesid())) { return false; }
        if (!helpComparingValue(getPosition(), otherEntity.getPosition())) { return false; }
        if (!helpComparingValue(getSnapshotname(), otherEntity.getSnapshotname())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getStyle(), otherEntity.getStyle())) { return false; }
        if (!helpComparingValue(getElementid(), otherEntity.getElementid())) { return false; }
        if (!helpComparingValue(getElementtype(), otherEntity.getElementtype())) { return false; }
        if (!helpComparingValue(getStrcontent(), otherEntity.getStrcontent())) { return false; }
        if (!helpComparingValue(getBincontent1(), otherEntity.getBincontent1())) { return false; }
        if (!helpComparingValue(getBincontent2(), otherEntity.getBincontent2())) { return false; }
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
        if (this.getSnapshotid() != null) { result = result + this.getSnapshotid().hashCode(); }
        if (this.getSeriesid() != null) { result = result + this.getSeriesid().hashCode(); }
        if (this.getPosition() != null) { result = result + this.getPosition().hashCode(); }
        if (this.getSnapshotname() != null) { result = result + this.getSnapshotname().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getStyle() != null) { result = result + this.getStyle().hashCode(); }
        if (this.getElementid() != null) { result = result + this.getElementid().hashCode(); }
        if (this.getElementtype() != null) { result = result + this.getElementtype().hashCode(); }
        if (this.getStrcontent() != null) { result = result + this.getStrcontent().hashCode(); }
        if (this.getBincontent1() != null) { result = result + this.getBincontent1().hashCode(); }
        if (this.getBincontent2() != null) { result = result + this.getBincontent2().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getSnapshotid());
        sb.append(delimiter).append(getSeriesid());
        sb.append(delimiter).append(getPosition());
        sb.append(delimiter).append(getSnapshotname());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getStyle());
        sb.append(delimiter).append(getElementid());
        sb.append(delimiter).append(getElementtype());
        sb.append(delimiter).append(getStrcontent());
        sb.append(delimiter).append(getBincontent1());
        sb.append(delimiter).append(getBincontent2());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : VARCHAR(40)} */
    public static final String snapshotid_COLUMN = "SnapshotID";

    /**
     * Get the value of the column 'SnapshotID'. <br />
     * {UQ : VARCHAR(40)}
     * @return The value of the column 'SnapshotID'. (Nullable)
     */
    public String getSnapshotid() {
        return _snapshotid;
    }

    /**
     * Set the value of the column 'SnapshotID'. <br />
     * {UQ : VARCHAR(40)}
     * @param snapshotid The value of the column 'SnapshotID'. (Nullable)
     */
    public void setSnapshotid(String snapshotid) {
        _modifiedProperties.addPropertyName("snapshotid");
        this._snapshotid = snapshotid;
    }

    /** The column annotation for S2Dao. {VARCHAR(40)} */
    public static final String seriesid_COLUMN = "SeriesID";

    /**
     * Get the value of the column 'SeriesID'. <br />
     * {VARCHAR(40)}
     * @return The value of the column 'SeriesID'. (Nullable)
     */
    public String getSeriesid() {
        return _seriesid;
    }

    /**
     * Set the value of the column 'SeriesID'. <br />
     * {VARCHAR(40)}
     * @param seriesid The value of the column 'SeriesID'. (Nullable)
     */
    public void setSeriesid(String seriesid) {
        _modifiedProperties.addPropertyName("seriesid");
        this._seriesid = seriesid;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String position_COLUMN = "Position";

    /**
     * Get the value of the column 'Position'. <br />
     * {INTEGER}
     * @return The value of the column 'Position'. (Nullable)
     */
    public java.lang.Integer getPosition() {
        return _position;
    }

    /**
     * Set the value of the column 'Position'. <br />
     * {INTEGER}
     * @param position The value of the column 'Position'. (Nullable)
     */
    public void setPosition(java.lang.Integer position) {
        _modifiedProperties.addPropertyName("position");
        this._position = position;
    }

    /** The column annotation for S2Dao. {VARCHAR(100)} */
    public static final String snapshotname_COLUMN = "SnapshotName";

    /**
     * Get the value of the column 'SnapshotName'. <br />
     * {VARCHAR(100)}
     * @return The value of the column 'SnapshotName'. (Nullable)
     */
    public String getSnapshotname() {
        return _snapshotname;
    }

    /**
     * Set the value of the column 'SnapshotName'. <br />
     * {VARCHAR(100)}
     * @param snapshotname The value of the column 'SnapshotName'. (Nullable)
     */
    public void setSnapshotname(String snapshotname) {
        _modifiedProperties.addPropertyName("snapshotname");
        this._snapshotname = snapshotname;
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
    public static final String bincontent1_COLUMN = "BinContent1";

    /**
     * Get the value of the column 'BinContent1'. <br />
     * {LONGBINARY}
     * @return The value of the column 'BinContent1'. (Nullable)
     */
    public byte[] getBincontent1() {
        return _bincontent1;
    }

    /**
     * Set the value of the column 'BinContent1'. <br />
     * {LONGBINARY}
     * @param bincontent1 The value of the column 'BinContent1'. (Nullable)
     */
    public void setBincontent1(byte[] bincontent1) {
        _modifiedProperties.addPropertyName("bincontent1");
        this._bincontent1 = bincontent1;
    }

    /** The column annotation for S2Dao. {LONGBINARY} */
    public static final String bincontent2_COLUMN = "BinContent2";

    /**
     * Get the value of the column 'BinContent2'. <br />
     * {LONGBINARY}
     * @return The value of the column 'BinContent2'. (Nullable)
     */
    public byte[] getBincontent2() {
        return _bincontent2;
    }

    /**
     * Set the value of the column 'BinContent2'. <br />
     * {LONGBINARY}
     * @param bincontent2 The value of the column 'BinContent2'. (Nullable)
     */
    public void setBincontent2(byte[] bincontent2) {
        _modifiedProperties.addPropertyName("bincontent2");
        this._bincontent2 = bincontent2;
    }

}
