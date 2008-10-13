package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_objectscenarios(TABLE).
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
@SuppressWarnings("unchecked")
public abstract class BsTObjectscenarios implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_objectscenarios. */
    public static final String TABLE = "t_objectscenarios";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Object_ID'. {UQ : INTEGER} */
    protected java.lang.Integer _objectId;

    /** The attribute of the column 'Scenario'. {UQ : VARCHAR(255)} */
    protected String _scenario;

    /** The attribute of the column 'ScenarioType'. {VARCHAR(12)} */
    protected String _scenariotype;

    /** The attribute of the column 'EValue'. {DOUBLE} */
    protected java.math.BigDecimal _evalue;

    /** The attribute of the column 'Notes'. {LONGCHAR(2147483647)} */
    protected String _notes;

    /** The attribute of the column 'XMLContent'. {LONGCHAR(2147483647)} */
    protected String _xmlcontent;

    /** The attribute of the column 'ea_guid'. {VARCHAR(40)} */
    protected String _eaGuid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectscenarios() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectscenarios";
    }

    public String getTablePropertyName() {// as JavaBeansRule
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
    public static final String scenario_COLUMN = "Scenario";

    /**
     * Get the value of the column 'Scenario'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'Scenario'. (Nullable)
     */
    public String getScenario() {
        return _scenario;
    }

    /**
     * Set the value of the column 'Scenario'. <br />
     * {UQ : VARCHAR(255)}
     * @param scenario The value of the column 'Scenario'. (Nullable)
     */
    public void setScenario(String scenario) {
        _modifiedProperties.addPropertyName("scenario");
        this._scenario = scenario;
    }

    /** The column annotation for S2Dao. {VARCHAR(12)} */
    public static final String scenariotype_COLUMN = "ScenarioType";

    /**
     * Get the value of the column 'ScenarioType'. <br />
     * {VARCHAR(12)}
     * @return The value of the column 'ScenarioType'. (Nullable)
     */
    public String getScenariotype() {
        return _scenariotype;
    }

    /**
     * Set the value of the column 'ScenarioType'. <br />
     * {VARCHAR(12)}
     * @param scenariotype The value of the column 'ScenarioType'. (Nullable)
     */
    public void setScenariotype(String scenariotype) {
        _modifiedProperties.addPropertyName("scenariotype");
        this._scenariotype = scenariotype;
    }

    /** The column annotation for S2Dao. {DOUBLE} */
    public static final String evalue_COLUMN = "EValue";

    /**
     * Get the value of the column 'EValue'. <br />
     * {DOUBLE}
     * @return The value of the column 'EValue'. (Nullable)
     */
    public java.math.BigDecimal getEvalue() {
        return _evalue;
    }

    /**
     * Set the value of the column 'EValue'. <br />
     * {DOUBLE}
     * @param evalue The value of the column 'EValue'. (Nullable)
     */
    public void setEvalue(java.math.BigDecimal evalue) {
        _modifiedProperties.addPropertyName("evalue");
        this._evalue = evalue;
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

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String xmlcontent_COLUMN = "XMLContent";

    /**
     * Get the value of the column 'XMLContent'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'XMLContent'. (Nullable)
     */
    public String getXmlcontent() {
        return _xmlcontent;
    }

    /**
     * Set the value of the column 'XMLContent'. <br />
     * {LONGCHAR(2147483647)}
     * @param xmlcontent The value of the column 'XMLContent'. (Nullable)
     */
    public void setXmlcontent(String xmlcontent) {
        _modifiedProperties.addPropertyName("xmlcontent");
        this._xmlcontent = xmlcontent;
    }

    /** The column annotation for S2Dao. {VARCHAR(40)} */
    public static final String eaGuid_COLUMN = "ea_guid";

    /**
     * Get the value of the column 'ea_guid'. <br />
     * {VARCHAR(40)}
     * @return The value of the column 'ea_guid'. (Nullable)
     */
    public String getEaGuid() {
        return _eaGuid;
    }

    /**
     * Set the value of the column 'ea_guid'. <br />
     * {VARCHAR(40)}
     * @param eaGuid The value of the column 'ea_guid'. (Nullable)
     */
    public void setEaGuid(String eaGuid) {
        _modifiedProperties.addPropertyName("eaGuid");
        this._eaGuid = eaGuid;
    }

}
