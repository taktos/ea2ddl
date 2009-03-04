package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of usysTables that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     TableName, RelOrder, DisplayName, FromVer, ToVer
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
public abstract class BsUsystables implements Entity, Serializable {

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
    /** TableName: {UQ : VARCHAR(50)} */
    protected String _tablename;

    /** RelOrder: {INTEGER} */
    protected java.lang.Integer _relorder;

    /** DisplayName: {VARCHAR(50)} */
    protected String _displayname;

    /** FromVer: {VARCHAR(50)} */
    protected String _fromver;

    /** ToVer: {VARCHAR(50)} */
    protected String _tover;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "usysTables";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "usystables";
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
        if (other == null || !(other instanceof BsUsystables)) { return false; }
        final BsUsystables otherEntity = (BsUsystables)other;
        if (!helpComparingValue(getTablename(), otherEntity.getTablename())) { return false; }
        if (!helpComparingValue(getRelorder(), otherEntity.getRelorder())) { return false; }
        if (!helpComparingValue(getDisplayname(), otherEntity.getDisplayname())) { return false; }
        if (!helpComparingValue(getFromver(), otherEntity.getFromver())) { return false; }
        if (!helpComparingValue(getTover(), otherEntity.getTover())) { return false; }
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
        if (this.getTablename() != null) { result = result + this.getTablename().hashCode(); }
        if (this.getRelorder() != null) { result = result + this.getRelorder().hashCode(); }
        if (this.getDisplayname() != null) { result = result + this.getDisplayname().hashCode(); }
        if (this.getFromver() != null) { result = result + this.getFromver().hashCode(); }
        if (this.getTover() != null) { result = result + this.getTover().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getTablename());
        sb.append(delimiter).append(getRelorder());
        sb.append(delimiter).append(getDisplayname());
        sb.append(delimiter).append(getFromver());
        sb.append(delimiter).append(getTover());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * TableName: {UQ : VARCHAR(50)} <br />
     * @return The value of the column 'TableName'. (Nullable)
     */
    public String getTablename() {
        return _tablename;
    }

    /**
     * TableName: {UQ : VARCHAR(50)} <br />
     * @param tablename The value of the column 'TableName'. (Nullable)
     */
    public void setTablename(String tablename) {
        _modifiedProperties.addPropertyName("tablename");
        this._tablename = tablename;
    }

    /**
     * RelOrder: {INTEGER} <br />
     * @return The value of the column 'RelOrder'. (Nullable)
     */
    public java.lang.Integer getRelorder() {
        return _relorder;
    }

    /**
     * RelOrder: {INTEGER} <br />
     * @param relorder The value of the column 'RelOrder'. (Nullable)
     */
    public void setRelorder(java.lang.Integer relorder) {
        _modifiedProperties.addPropertyName("relorder");
        this._relorder = relorder;
    }

    /**
     * DisplayName: {VARCHAR(50)} <br />
     * @return The value of the column 'DisplayName'. (Nullable)
     */
    public String getDisplayname() {
        return _displayname;
    }

    /**
     * DisplayName: {VARCHAR(50)} <br />
     * @param displayname The value of the column 'DisplayName'. (Nullable)
     */
    public void setDisplayname(String displayname) {
        _modifiedProperties.addPropertyName("displayname");
        this._displayname = displayname;
    }

    /**
     * FromVer: {VARCHAR(50)} <br />
     * @return The value of the column 'FromVer'. (Nullable)
     */
    public String getFromver() {
        return _fromver;
    }

    /**
     * FromVer: {VARCHAR(50)} <br />
     * @param fromver The value of the column 'FromVer'. (Nullable)
     */
    public void setFromver(String fromver) {
        _modifiedProperties.addPropertyName("fromver");
        this._fromver = fromver;
    }

    /**
     * ToVer: {VARCHAR(50)} <br />
     * @return The value of the column 'ToVer'. (Nullable)
     */
    public String getTover() {
        return _tover;
    }

    /**
     * ToVer: {VARCHAR(50)} <br />
     * @param tover The value of the column 'ToVer'. (Nullable)
     */
    public void setTover(String tover) {
        _modifiedProperties.addPropertyName("tover");
        this._tover = tover;
    }
}
