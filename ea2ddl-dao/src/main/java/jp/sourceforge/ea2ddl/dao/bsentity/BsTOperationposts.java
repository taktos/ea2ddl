package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_operationposts that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     OperationID, PostCondition, Type, Notes
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
public abstract class BsTOperationposts implements Entity, Serializable {

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
    /** OperationID: {UQ : INTEGER} */
    protected java.lang.Integer _operationid;

    /** PostCondition: {UQ : VARCHAR(255)} */
    protected String _postcondition;

    /** Type: {VARCHAR(255)} */
    protected String _type;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_operationposts";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TOperationposts";
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
        if (other == null || !(other instanceof BsTOperationposts)) { return false; }
        final BsTOperationposts otherEntity = (BsTOperationposts)other;
        if (!helpComparingValue(getOperationid(), otherEntity.getOperationid())) { return false; }
        if (!helpComparingValue(getPostcondition(), otherEntity.getPostcondition())) { return false; }
        if (!helpComparingValue(getType(), otherEntity.getType())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
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
        if (this.getOperationid() != null) { result = result + this.getOperationid().hashCode(); }
        if (this.getPostcondition() != null) { result = result + this.getPostcondition().hashCode(); }
        if (this.getType() != null) { result = result + this.getType().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getOperationid());
        sb.append(delimiter).append(getPostcondition());
        sb.append(delimiter).append(getType());
        sb.append(delimiter).append(getNotes());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * OperationID: {UQ : INTEGER} <br />
     * @return The value of the column 'OperationID'. (Nullable)
     */
    public java.lang.Integer getOperationid() {
        return _operationid;
    }

    /**
     * OperationID: {UQ : INTEGER} <br />
     * @param operationid The value of the column 'OperationID'. (Nullable)
     */
    public void setOperationid(java.lang.Integer operationid) {
        _modifiedProperties.addPropertyName("operationid");
        this._operationid = operationid;
    }

    /**
     * PostCondition: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'PostCondition'. (Nullable)
     */
    public String getPostcondition() {
        return _postcondition;
    }

    /**
     * PostCondition: {UQ : VARCHAR(255)} <br />
     * @param postcondition The value of the column 'PostCondition'. (Nullable)
     */
    public void setPostcondition(String postcondition) {
        _modifiedProperties.addPropertyName("postcondition");
        this._postcondition = postcondition;
    }

    /**
     * Type: {VARCHAR(255)} <br />
     * @return The value of the column 'Type'. (Nullable)
     */
    public String getType() {
        return _type;
    }

    /**
     * Type: {VARCHAR(255)} <br />
     * @param type The value of the column 'Type'. (Nullable)
     */
    public void setType(String type) {
        _modifiedProperties.addPropertyName("type");
        this._type = type;
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
}
