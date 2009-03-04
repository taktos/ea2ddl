package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_taggedvalue that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PropertyID, ElementID, BaseClass, TagValue, Notes
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
public abstract class BsTTaggedvalue implements Entity, Serializable {

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
    /** PropertyID: {UQ : VARCHAR(40)} */
    protected String _propertyid;

    /** ElementID: {VARCHAR(40)} */
    protected String _elementid;

    /** BaseClass: {VARCHAR(100)} */
    protected String _baseclass;

    /** TagValue: {LONGCHAR(2147483647)} */
    protected String _tagvalue;

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
        return "t_taggedvalue";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TTaggedvalue";
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
        if (other == null || !(other instanceof BsTTaggedvalue)) { return false; }
        final BsTTaggedvalue otherEntity = (BsTTaggedvalue)other;
        if (!helpComparingValue(getPropertyid(), otherEntity.getPropertyid())) { return false; }
        if (!helpComparingValue(getElementid(), otherEntity.getElementid())) { return false; }
        if (!helpComparingValue(getBaseclass(), otherEntity.getBaseclass())) { return false; }
        if (!helpComparingValue(getTagvalue(), otherEntity.getTagvalue())) { return false; }
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
        if (this.getPropertyid() != null) { result = result + this.getPropertyid().hashCode(); }
        if (this.getElementid() != null) { result = result + this.getElementid().hashCode(); }
        if (this.getBaseclass() != null) { result = result + this.getBaseclass().hashCode(); }
        if (this.getTagvalue() != null) { result = result + this.getTagvalue().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getPropertyid());
        sb.append(delimiter).append(getElementid());
        sb.append(delimiter).append(getBaseclass());
        sb.append(delimiter).append(getTagvalue());
        sb.append(delimiter).append(getNotes());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * PropertyID: {UQ : VARCHAR(40)} <br />
     * @return The value of the column 'PropertyID'. (Nullable)
     */
    public String getPropertyid() {
        return _propertyid;
    }

    /**
     * PropertyID: {UQ : VARCHAR(40)} <br />
     * @param propertyid The value of the column 'PropertyID'. (Nullable)
     */
    public void setPropertyid(String propertyid) {
        _modifiedProperties.addPropertyName("propertyid");
        this._propertyid = propertyid;
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
     * BaseClass: {VARCHAR(100)} <br />
     * @return The value of the column 'BaseClass'. (Nullable)
     */
    public String getBaseclass() {
        return _baseclass;
    }

    /**
     * BaseClass: {VARCHAR(100)} <br />
     * @param baseclass The value of the column 'BaseClass'. (Nullable)
     */
    public void setBaseclass(String baseclass) {
        _modifiedProperties.addPropertyName("baseclass");
        this._baseclass = baseclass;
    }

    /**
     * TagValue: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'TagValue'. (Nullable)
     */
    public String getTagvalue() {
        return _tagvalue;
    }

    /**
     * TagValue: {LONGCHAR(2147483647)} <br />
     * @param tagvalue The value of the column 'TagValue'. (Nullable)
     */
    public void setTagvalue(String tagvalue) {
        _modifiedProperties.addPropertyName("tagvalue");
        this._tagvalue = tagvalue;
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
