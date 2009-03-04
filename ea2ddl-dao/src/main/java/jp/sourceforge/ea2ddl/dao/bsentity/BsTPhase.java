package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_phase that the type is TABLE. <br />
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
public abstract class BsTPhase implements Entity, Serializable {

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
    /** PhaseID: {UQ : VARCHAR(40)} */
    protected String _phaseid;

    /** PhaseName: {VARCHAR(100)} */
    protected String _phasename;

    /** PhaseNotes: {LONGCHAR(2147483647)} */
    protected String _phasenotes;

    /** PhaseStyle: {VARCHAR(255)} */
    protected String _phasestyle;

    /** StartDate: {DATETIME} */
    protected java.sql.Timestamp _startdate;

    /** EndDate: {DATETIME} */
    protected java.sql.Timestamp _enddate;

    /** PhaseContent: {LONGCHAR(2147483647)} */
    protected String _phasecontent;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_phase";
    }

    public String getTablePropertyName() { // as JavaBeansRule
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
    /**
     * PhaseID: {UQ : VARCHAR(40)} <br />
     * @return The value of the column 'PhaseID'. (Nullable)
     */
    public String getPhaseid() {
        return _phaseid;
    }

    /**
     * PhaseID: {UQ : VARCHAR(40)} <br />
     * @param phaseid The value of the column 'PhaseID'. (Nullable)
     */
    public void setPhaseid(String phaseid) {
        _modifiedProperties.addPropertyName("phaseid");
        this._phaseid = phaseid;
    }

    /**
     * PhaseName: {VARCHAR(100)} <br />
     * @return The value of the column 'PhaseName'. (Nullable)
     */
    public String getPhasename() {
        return _phasename;
    }

    /**
     * PhaseName: {VARCHAR(100)} <br />
     * @param phasename The value of the column 'PhaseName'. (Nullable)
     */
    public void setPhasename(String phasename) {
        _modifiedProperties.addPropertyName("phasename");
        this._phasename = phasename;
    }

    /**
     * PhaseNotes: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'PhaseNotes'. (Nullable)
     */
    public String getPhasenotes() {
        return _phasenotes;
    }

    /**
     * PhaseNotes: {LONGCHAR(2147483647)} <br />
     * @param phasenotes The value of the column 'PhaseNotes'. (Nullable)
     */
    public void setPhasenotes(String phasenotes) {
        _modifiedProperties.addPropertyName("phasenotes");
        this._phasenotes = phasenotes;
    }

    /**
     * PhaseStyle: {VARCHAR(255)} <br />
     * @return The value of the column 'PhaseStyle'. (Nullable)
     */
    public String getPhasestyle() {
        return _phasestyle;
    }

    /**
     * PhaseStyle: {VARCHAR(255)} <br />
     * @param phasestyle The value of the column 'PhaseStyle'. (Nullable)
     */
    public void setPhasestyle(String phasestyle) {
        _modifiedProperties.addPropertyName("phasestyle");
        this._phasestyle = phasestyle;
    }

    /**
     * StartDate: {DATETIME} <br />
     * @return The value of the column 'StartDate'. (Nullable)
     */
    public java.sql.Timestamp getStartdate() {
        return _startdate;
    }

    /**
     * StartDate: {DATETIME} <br />
     * @param startdate The value of the column 'StartDate'. (Nullable)
     */
    public void setStartdate(java.sql.Timestamp startdate) {
        _modifiedProperties.addPropertyName("startdate");
        this._startdate = startdate;
    }

    /**
     * EndDate: {DATETIME} <br />
     * @return The value of the column 'EndDate'. (Nullable)
     */
    public java.sql.Timestamp getEnddate() {
        return _enddate;
    }

    /**
     * EndDate: {DATETIME} <br />
     * @param enddate The value of the column 'EndDate'. (Nullable)
     */
    public void setEnddate(java.sql.Timestamp enddate) {
        _modifiedProperties.addPropertyName("enddate");
        this._enddate = enddate;
    }

    /**
     * PhaseContent: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'PhaseContent'. (Nullable)
     */
    public String getPhasecontent() {
        return _phasecontent;
    }

    /**
     * PhaseContent: {LONGCHAR(2147483647)} <br />
     * @param phasecontent The value of the column 'PhaseContent'. (Nullable)
     */
    public void setPhasecontent(String phasecontent) {
        _modifiedProperties.addPropertyName("phasecontent");
        this._phasecontent = phasecontent;
    }
}
