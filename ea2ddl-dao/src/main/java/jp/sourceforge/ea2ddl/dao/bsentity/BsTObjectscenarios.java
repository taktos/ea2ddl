package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_objectscenarios that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Object_ID, Scenario, ScenarioType, EValue, Notes, XMLContent, ea_guid
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
public abstract class BsTObjectscenarios implements Entity, Serializable {

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

    /** Scenario: {UQ : VARCHAR(255)} */
    protected String _scenario;

    /** ScenarioType: {VARCHAR(12)} */
    protected String _scenariotype;

    /** EValue: {DOUBLE} */
    protected java.math.BigDecimal _evalue;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** XMLContent: {LONGCHAR(2147483647)} */
    protected String _xmlcontent;

    /** ea_guid: {VARCHAR(40)} */
    protected String _eaGuid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectscenarios";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TObjectscenarios";
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
        if (other == null || !(other instanceof BsTObjectscenarios)) { return false; }
        final BsTObjectscenarios otherEntity = (BsTObjectscenarios)other;
        if (!helpComparingValue(getObjectId(), otherEntity.getObjectId())) { return false; }
        if (!helpComparingValue(getScenario(), otherEntity.getScenario())) { return false; }
        if (!helpComparingValue(getScenariotype(), otherEntity.getScenariotype())) { return false; }
        if (!helpComparingValue(getEvalue(), otherEntity.getEvalue())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getXmlcontent(), otherEntity.getXmlcontent())) { return false; }
        if (!helpComparingValue(getEaGuid(), otherEntity.getEaGuid())) { return false; }
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
        if (this.getScenario() != null) { result = result + this.getScenario().hashCode(); }
        if (this.getScenariotype() != null) { result = result + this.getScenariotype().hashCode(); }
        if (this.getEvalue() != null) { result = result + this.getEvalue().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getXmlcontent() != null) { result = result + this.getXmlcontent().hashCode(); }
        if (this.getEaGuid() != null) { result = result + this.getEaGuid().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getObjectId());
        sb.append(delimiter).append(getScenario());
        sb.append(delimiter).append(getScenariotype());
        sb.append(delimiter).append(getEvalue());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getXmlcontent());
        sb.append(delimiter).append(getEaGuid());
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
     * Scenario: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'Scenario'. (Nullable)
     */
    public String getScenario() {
        return _scenario;
    }

    /**
     * Scenario: {UQ : VARCHAR(255)} <br />
     * @param scenario The value of the column 'Scenario'. (Nullable)
     */
    public void setScenario(String scenario) {
        _modifiedProperties.addPropertyName("scenario");
        this._scenario = scenario;
    }

    /**
     * ScenarioType: {VARCHAR(12)} <br />
     * @return The value of the column 'ScenarioType'. (Nullable)
     */
    public String getScenariotype() {
        return _scenariotype;
    }

    /**
     * ScenarioType: {VARCHAR(12)} <br />
     * @param scenariotype The value of the column 'ScenarioType'. (Nullable)
     */
    public void setScenariotype(String scenariotype) {
        _modifiedProperties.addPropertyName("scenariotype");
        this._scenariotype = scenariotype;
    }

    /**
     * EValue: {DOUBLE} <br />
     * @return The value of the column 'EValue'. (Nullable)
     */
    public java.math.BigDecimal getEvalue() {
        return _evalue;
    }

    /**
     * EValue: {DOUBLE} <br />
     * @param evalue The value of the column 'EValue'. (Nullable)
     */
    public void setEvalue(java.math.BigDecimal evalue) {
        _modifiedProperties.addPropertyName("evalue");
        this._evalue = evalue;
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
     * XMLContent: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'XMLContent'. (Nullable)
     */
    public String getXmlcontent() {
        return _xmlcontent;
    }

    /**
     * XMLContent: {LONGCHAR(2147483647)} <br />
     * @param xmlcontent The value of the column 'XMLContent'. (Nullable)
     */
    public void setXmlcontent(String xmlcontent) {
        _modifiedProperties.addPropertyName("xmlcontent");
        this._xmlcontent = xmlcontent;
    }

    /**
     * ea_guid: {VARCHAR(40)} <br />
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * ea_guid: {VARCHAR(40)} <br />
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
    }
}
