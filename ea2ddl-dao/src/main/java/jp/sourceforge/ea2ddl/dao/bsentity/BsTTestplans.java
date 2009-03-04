package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_testplans that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PlanID, Category, Name, Author, Notes, TestPlan
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
public abstract class BsTTestplans implements Entity, Serializable {

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
    /** PlanID: {UQ : VARCHAR(50)} */
    protected String _planid;

    /** Category: {VARCHAR(100)} */
    protected String _category;

    /** Name: {VARCHAR(150)} */
    protected String _name;

    /** Author: {VARCHAR(255)} */
    protected String _author;

    /** Notes: {LONGCHAR(2147483647)} */
    protected String _notes;

    /** TestPlan: {LONGCHAR(2147483647)} */
    protected String _testplan;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_testplans";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TTestplans";
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
        if (other == null || !(other instanceof BsTTestplans)) { return false; }
        final BsTTestplans otherEntity = (BsTTestplans)other;
        if (!helpComparingValue(getPlanid(), otherEntity.getPlanid())) { return false; }
        if (!helpComparingValue(getCategory(), otherEntity.getCategory())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getAuthor(), otherEntity.getAuthor())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getTestplan(), otherEntity.getTestplan())) { return false; }
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
        if (this.getPlanid() != null) { result = result + this.getPlanid().hashCode(); }
        if (this.getCategory() != null) { result = result + this.getCategory().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getAuthor() != null) { result = result + this.getAuthor().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getTestplan() != null) { result = result + this.getTestplan().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getPlanid());
        sb.append(delimiter).append(getCategory());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getAuthor());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getTestplan());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * PlanID: {UQ : VARCHAR(50)} <br />
     * @return The value of the column 'PlanID'. (Nullable)
     */
    public String getPlanid() {
        return _planid;
    }

    /**
     * PlanID: {UQ : VARCHAR(50)} <br />
     * @param planid The value of the column 'PlanID'. (Nullable)
     */
    public void setPlanid(String planid) {
        _modifiedProperties.addPropertyName("planid");
        this._planid = planid;
    }

    /**
     * Category: {VARCHAR(100)} <br />
     * @return The value of the column 'Category'. (Nullable)
     */
    public String getCategory() {
        return _category;
    }

    /**
     * Category: {VARCHAR(100)} <br />
     * @param category The value of the column 'Category'. (Nullable)
     */
    public void setCategory(String category) {
        _modifiedProperties.addPropertyName("category");
        this._category = category;
    }

    /**
     * Name: {VARCHAR(150)} <br />
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Name: {VARCHAR(150)} <br />
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /**
     * Author: {VARCHAR(255)} <br />
     * @return The value of the column 'Author'. (Nullable)
     */
    public String getAuthor() {
        return _author;
    }

    /**
     * Author: {VARCHAR(255)} <br />
     * @param author The value of the column 'Author'. (Nullable)
     */
    public void setAuthor(String author) {
        _modifiedProperties.addPropertyName("author");
        this._author = author;
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
     * TestPlan: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'TestPlan'. (Nullable)
     */
    public String getTestplan() {
        return _testplan;
    }

    /**
     * TestPlan: {LONGCHAR(2147483647)} <br />
     * @param testplan The value of the column 'TestPlan'. (Nullable)
     */
    public void setTestplan(String testplan) {
        _modifiedProperties.addPropertyName("testplan");
        this._testplan = testplan;
    }
}
