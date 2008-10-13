package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_phase(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PhaseID, PhaseName, PhaseNotes, PhaseStyle, StartDate, EndDate, PhaseContent
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
public abstract class BsTPhase implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_phase. */
    public static final String TABLE = "t_phase";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'PhaseID'. {UQ : VARCHAR(40)} */
    protected String _phaseid;

    /** The attribute of the column 'PhaseName'. {VARCHAR(100)} */
    protected String _phasename;

    /** The attribute of the column 'PhaseNotes'. {LONGCHAR(2147483647)} */
    protected String _phasenotes;

    /** The attribute of the column 'PhaseStyle'. {VARCHAR(255)} */
    protected String _phasestyle;

    /** The attribute of the column 'StartDate'. {DATETIME} */
    protected java.sql.Timestamp _startdate;

    /** The attribute of the column 'EndDate'. {DATETIME} */
    protected java.sql.Timestamp _enddate;

    /** The attribute of the column 'PhaseContent'. {LONGCHAR(2147483647)} */
    protected String _phasecontent;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPhase() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_phase";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TPhase";
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
        if (other == null || !(other instanceof BsTPhase)) { return false; }
        final BsTPhase otherEntity = (BsTPhase)other;
        if (!helpComparingValue(getPhaseid(), otherEntity.getPhaseid())) { return false; }
        if (!helpComparingValue(getPhasename(), otherEntity.getPhasename())) { return false; }
        if (!helpComparingValue(getPhasenotes(), otherEntity.getPhasenotes())) { return false; }
        if (!helpComparingValue(getPhasestyle(), otherEntity.getPhasestyle())) { return false; }
        if (!helpComparingValue(getStartdate(), otherEntity.getStartdate())) { return false; }
        if (!helpComparingValue(getEnddate(), otherEntity.getEnddate())) { return false; }
        if (!helpComparingValue(getPhasecontent(), otherEntity.getPhasecontent())) { return false; }
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
        if (this.getPhaseid() != null) { result = result + this.getPhaseid().hashCode(); }
        if (this.getPhasename() != null) { result = result + this.getPhasename().hashCode(); }
        if (this.getPhasenotes() != null) { result = result + this.getPhasenotes().hashCode(); }
        if (this.getPhasestyle() != null) { result = result + this.getPhasestyle().hashCode(); }
        if (this.getStartdate() != null) { result = result + this.getStartdate().hashCode(); }
        if (this.getEnddate() != null) { result = result + this.getEnddate().hashCode(); }
        if (this.getPhasecontent() != null) { result = result + this.getPhasecontent().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getPhaseid());
        sb.append(delimiter).append(getPhasename());
        sb.append(delimiter).append(getPhasenotes());
        sb.append(delimiter).append(getPhasestyle());
        sb.append(delimiter).append(getStartdate());
        sb.append(delimiter).append(getEnddate());
        sb.append(delimiter).append(getPhasecontent());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : VARCHAR(40)} */
    public static final String phaseid_COLUMN = "PhaseID";

    /**
     * Get the value of the column 'PhaseID'. <br />
     * {UQ : VARCHAR(40)}
     * @return The value of the column 'PhaseID'. (Nullable)
     */
    public String getPhaseid() {
        return _phaseid;
    }

    /**
     * Set the value of the column 'PhaseID'. <br />
     * {UQ : VARCHAR(40)}
     * @param phaseid The value of the column 'PhaseID'. (Nullable)
     */
    public void setPhaseid(String phaseid) {
        _modifiedProperties.addPropertyName("phaseid");
        this._phaseid = phaseid;
    }

    /** The column annotation for S2Dao. {VARCHAR(100)} */
    public static final String phasename_COLUMN = "PhaseName";

    /**
     * Get the value of the column 'PhaseName'. <br />
     * {VARCHAR(100)}
     * @return The value of the column 'PhaseName'. (Nullable)
     */
    public String getPhasename() {
        return _phasename;
    }

    /**
     * Set the value of the column 'PhaseName'. <br />
     * {VARCHAR(100)}
     * @param phasename The value of the column 'PhaseName'. (Nullable)
     */
    public void setPhasename(String phasename) {
        _modifiedProperties.addPropertyName("phasename");
        this._phasename = phasename;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String phasenotes_COLUMN = "PhaseNotes";

    /**
     * Get the value of the column 'PhaseNotes'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'PhaseNotes'. (Nullable)
     */
    public String getPhasenotes() {
        return _phasenotes;
    }

    /**
     * Set the value of the column 'PhaseNotes'. <br />
     * {LONGCHAR(2147483647)}
     * @param phasenotes The value of the column 'PhaseNotes'. (Nullable)
     */
    public void setPhasenotes(String phasenotes) {
        _modifiedProperties.addPropertyName("phasenotes");
        this._phasenotes = phasenotes;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String phasestyle_COLUMN = "PhaseStyle";

    /**
     * Get the value of the column 'PhaseStyle'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PhaseStyle'. (Nullable)
     */
    public String getPhasestyle() {
        return _phasestyle;
    }

    /**
     * Set the value of the column 'PhaseStyle'. <br />
     * {VARCHAR(255)}
     * @param phasestyle The value of the column 'PhaseStyle'. (Nullable)
     */
    public void setPhasestyle(String phasestyle) {
        _modifiedProperties.addPropertyName("phasestyle");
        this._phasestyle = phasestyle;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String startdate_COLUMN = "StartDate";

    /**
     * Get the value of the column 'StartDate'. <br />
     * {DATETIME}
     * @return The value of the column 'StartDate'. (Nullable)
     */
    public java.sql.Timestamp getStartdate() {
        return _startdate;
    }

    /**
     * Set the value of the column 'StartDate'. <br />
     * {DATETIME}
     * @param startdate The value of the column 'StartDate'. (Nullable)
     */
    public void setStartdate(java.sql.Timestamp startdate) {
        _modifiedProperties.addPropertyName("startdate");
        this._startdate = startdate;
    }

    /** The column annotation for S2Dao. {DATETIME} */
    public static final String enddate_COLUMN = "EndDate";

    /**
     * Get the value of the column 'EndDate'. <br />
     * {DATETIME}
     * @return The value of the column 'EndDate'. (Nullable)
     */
    public java.sql.Timestamp getEnddate() {
        return _enddate;
    }

    /**
     * Set the value of the column 'EndDate'. <br />
     * {DATETIME}
     * @param enddate The value of the column 'EndDate'. (Nullable)
     */
    public void setEnddate(java.sql.Timestamp enddate) {
        _modifiedProperties.addPropertyName("enddate");
        this._enddate = enddate;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String phasecontent_COLUMN = "PhaseContent";

    /**
     * Get the value of the column 'PhaseContent'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'PhaseContent'. (Nullable)
     */
    public String getPhasecontent() {
        return _phasecontent;
    }

    /**
     * Set the value of the column 'PhaseContent'. <br />
     * {LONGCHAR(2147483647)}
     * @param phasecontent The value of the column 'PhaseContent'. (Nullable)
     */
    public void setPhasecontent(String phasecontent) {
        _modifiedProperties.addPropertyName("phasecontent");
        this._phasecontent = phasecontent;
    }

}
