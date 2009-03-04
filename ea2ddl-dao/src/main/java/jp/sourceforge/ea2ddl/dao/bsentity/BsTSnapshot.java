package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_snapshot that the type is TABLE. <br />
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
public abstract class BsTSnapshot implements Entity, Serializable {

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
    /** SnapshotID: {UQ : VARCHAR(40)} */
    protected String _snapshotid;

    /** SeriesID: {VARCHAR(40)} */
    protected String _seriesid;

    /** Position: {INTEGER} */
    protected java.lang.Integer _position;

    /** SnapshotName: {VARCHAR(100)} */
    protected String _snapshotname;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** Style: {VARCHAR(255)} */
    protected String _style;

    /** ElementID: {VARCHAR(40)} */
    protected String _elementid;

    /** ElementType: {VARCHAR(50)} */
    protected String _elementtype;

    /** StrContent: {LONGCHAR(2147483647)} */
    protected String _strcontent;

    /** BinContent1: {LONGBINARY} */
    protected byte[] _bincontent1;

    /** BinContent2: {LONGBINARY} */
    protected byte[] _bincontent2;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_snapshot";
    }

    public String getTablePropertyName() { // as JavaBeansRule
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
    /**
     * SnapshotID: {UQ : VARCHAR(40)} <br />
     * @return The value of the column 'SnapshotID'. (Nullable)
     */
    public String getSnapshotid() {
        return _snapshotid;
    }

    /**
     * SnapshotID: {UQ : VARCHAR(40)} <br />
     * @param snapshotid The value of the column 'SnapshotID'. (Nullable)
     */
    public void setSnapshotid(String snapshotid) {
        _modifiedProperties.addPropertyName("snapshotid");
        this._snapshotid = snapshotid;
    }

    /**
     * SeriesID: {VARCHAR(40)} <br />
     * @return The value of the column 'SeriesID'. (Nullable)
     */
    public String getSeriesid() {
        return _seriesid;
    }

    /**
     * SeriesID: {VARCHAR(40)} <br />
     * @param seriesid The value of the column 'SeriesID'. (Nullable)
     */
    public void setSeriesid(String seriesid) {
        _modifiedProperties.addPropertyName("seriesid");
        this._seriesid = seriesid;
    }

    /**
     * Position: {INTEGER} <br />
     * @return The value of the column 'Position'. (Nullable)
     */
    public java.lang.Integer getPosition() {
        return _position;
    }

    /**
     * Position: {INTEGER} <br />
     * @param position The value of the column 'Position'. (Nullable)
     */
    public void setPosition(java.lang.Integer position) {
        _modifiedProperties.addPropertyName("position");
        this._position = position;
    }

    /**
     * SnapshotName: {VARCHAR(100)} <br />
     * @return The value of the column 'SnapshotName'. (Nullable)
     */
    public String getSnapshotname() {
        return _snapshotname;
    }

    /**
     * SnapshotName: {VARCHAR(100)} <br />
     * @param snapshotname The value of the column 'SnapshotName'. (Nullable)
     */
    public void setSnapshotname(String snapshotname) {
        _modifiedProperties.addPropertyName("snapshotname");
        this._snapshotname = snapshotname;
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
     * BinContent1: {LONGBINARY} <br />
     * @return The value of the column 'BinContent1'. (Nullable)
     */
    public byte[] getBincontent1() {
        return _bincontent1;
    }

    /**
     * BinContent1: {LONGBINARY} <br />
     * @param bincontent1 The value of the column 'BinContent1'. (Nullable)
     */
    public void setBincontent1(byte[] bincontent1) {
        _modifiedProperties.addPropertyName("bincontent1");
        this._bincontent1 = bincontent1;
    }

    /**
     * BinContent2: {LONGBINARY} <br />
     * @return The value of the column 'BinContent2'. (Nullable)
     */
    public byte[] getBincontent2() {
        return _bincontent2;
    }

    /**
     * BinContent2: {LONGBINARY} <br />
     * @param bincontent2 The value of the column 'BinContent2'. (Nullable)
     */
    public void setBincontent2(byte[] bincontent2) {
        _modifiedProperties.addPropertyName("bincontent2");
        this._bincontent2 = bincontent2;
    }
}
