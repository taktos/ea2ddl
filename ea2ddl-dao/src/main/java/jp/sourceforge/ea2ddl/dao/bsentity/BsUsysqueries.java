package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of usysQueries that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     QueryName, NewName, FixCode
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
public abstract class BsUsysqueries implements Entity, Serializable {

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
    /** QueryName: {VARCHAR(50)} */
    protected String _queryname;

    /** NewName: {VARCHAR(50)} */
    protected String _newname;

    /** FixCode: {NotNull : BIT} */
    protected Boolean _fixcode;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "usysQueries";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "usysqueries";
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
        if (other == null || !(other instanceof BsUsysqueries)) { return false; }
        final BsUsysqueries otherEntity = (BsUsysqueries)other;
        if (!helpComparingValue(getQueryname(), otherEntity.getQueryname())) { return false; }
        if (!helpComparingValue(getNewname(), otherEntity.getNewname())) { return false; }
        if (!helpComparingValue(getFixcode(), otherEntity.getFixcode())) { return false; }
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
        if (this.getQueryname() != null) { result = result + this.getQueryname().hashCode(); }
        if (this.getNewname() != null) { result = result + this.getNewname().hashCode(); }
        if (this.getFixcode() != null) { result = result + this.getFixcode().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getQueryname());
        sb.append(delimiter).append(getNewname());
        sb.append(delimiter).append(getFixcode());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * QueryName: {VARCHAR(50)} <br />
     * @return The value of the column 'QueryName'. (Nullable)
     */
    public String getQueryname() {
        return _queryname;
    }

    /**
     * QueryName: {VARCHAR(50)} <br />
     * @param queryname The value of the column 'QueryName'. (Nullable)
     */
    public void setQueryname(String queryname) {
        _modifiedProperties.addPropertyName("queryname");
        this._queryname = queryname;
    }

    /**
     * NewName: {VARCHAR(50)} <br />
     * @return The value of the column 'NewName'. (Nullable)
     */
    public String getNewname() {
        return _newname;
    }

    /**
     * NewName: {VARCHAR(50)} <br />
     * @param newname The value of the column 'NewName'. (Nullable)
     */
    public void setNewname(String newname) {
        _modifiedProperties.addPropertyName("newname");
        this._newname = newname;
    }

    /**
     * FixCode: {NotNull : BIT} <br />
     * @return The value of the column 'FixCode'. (Nullable)
     */
    public Boolean getFixcode() {
        return _fixcode;
    }

    /**
     * FixCode: {NotNull : BIT} <br />
     * @param fixcode The value of the column 'FixCode'. (Nullable)
     */
    public void setFixcode(Boolean fixcode) {
        _modifiedProperties.addPropertyName("fixcode");
        this._fixcode = fixcode;
    }
}
