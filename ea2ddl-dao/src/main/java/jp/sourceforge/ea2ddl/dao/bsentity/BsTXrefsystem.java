package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_xrefsystem that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     XrefID, ToolID, Name, Type, Visibility, Namespace, Requirement, Constraint, Behavior, Partition, Description, Client, Supplier, Link
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
public abstract class BsTXrefsystem implements Entity, Serializable {

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
    /** XrefID: {UQ : VARCHAR(255)} */
    protected String _xrefid;

    /** ToolID: {VARCHAR(50)} */
    protected String _toolid;

    /** Name: {VARCHAR(255)} */
    protected String _name;

    /** Type: {VARCHAR(255)} */
    protected String _type;

    /** Visibility: {VARCHAR(255)} */
    protected String _visibility;

    /** Namespace: {VARCHAR(255)} */
    protected String _namespace;

    /** Requirement: {VARCHAR(255)} */
    protected String _requirement;

    /** Constraint: {VARCHAR(255)} */
    protected String _constraint;

    /** Behavior: {VARCHAR(255)} */
    protected String _behavior;

    /** Partition: {VARCHAR(255)} */
    protected String _partition;

    /** Description: {LONGCHAR(2147483647)} */
    protected String _description;

    /** Client: {VARCHAR(255)} */
    protected String _client;

    /** Supplier: {VARCHAR(255)} */
    protected String _supplier;

    /** Link: {VARCHAR(255)} */
    protected String _link;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_xrefsystem";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TXrefsystem";
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
        if (other == null || !(other instanceof BsTXrefsystem)) { return false; }
        final BsTXrefsystem otherEntity = (BsTXrefsystem)other;
        if (!helpComparingValue(getXrefid(), otherEntity.getXrefid())) { return false; }
        if (!helpComparingValue(getToolid(), otherEntity.getToolid())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getType(), otherEntity.getType())) { return false; }
        if (!helpComparingValue(getVisibility(), otherEntity.getVisibility())) { return false; }
        if (!helpComparingValue(getNamespace(), otherEntity.getNamespace())) { return false; }
        if (!helpComparingValue(getRequirement(), otherEntity.getRequirement())) { return false; }
        if (!helpComparingValue(getConstraint(), otherEntity.getConstraint())) { return false; }
        if (!helpComparingValue(getBehavior(), otherEntity.getBehavior())) { return false; }
        if (!helpComparingValue(getPartition(), otherEntity.getPartition())) { return false; }
        if (!helpComparingValue(getDescription(), otherEntity.getDescription())) { return false; }
        if (!helpComparingValue(getClient(), otherEntity.getClient())) { return false; }
        if (!helpComparingValue(getSupplier(), otherEntity.getSupplier())) { return false; }
        if (!helpComparingValue(getLink(), otherEntity.getLink())) { return false; }
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
        if (this.getXrefid() != null) { result = result + this.getXrefid().hashCode(); }
        if (this.getToolid() != null) { result = result + this.getToolid().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getType() != null) { result = result + this.getType().hashCode(); }
        if (this.getVisibility() != null) { result = result + this.getVisibility().hashCode(); }
        if (this.getNamespace() != null) { result = result + this.getNamespace().hashCode(); }
        if (this.getRequirement() != null) { result = result + this.getRequirement().hashCode(); }
        if (this.getConstraint() != null) { result = result + this.getConstraint().hashCode(); }
        if (this.getBehavior() != null) { result = result + this.getBehavior().hashCode(); }
        if (this.getPartition() != null) { result = result + this.getPartition().hashCode(); }
        if (this.getDescription() != null) { result = result + this.getDescription().hashCode(); }
        if (this.getClient() != null) { result = result + this.getClient().hashCode(); }
        if (this.getSupplier() != null) { result = result + this.getSupplier().hashCode(); }
        if (this.getLink() != null) { result = result + this.getLink().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getXrefid());
        sb.append(delimiter).append(getToolid());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getType());
        sb.append(delimiter).append(getVisibility());
        sb.append(delimiter).append(getNamespace());
        sb.append(delimiter).append(getRequirement());
        sb.append(delimiter).append(getConstraint());
        sb.append(delimiter).append(getBehavior());
        sb.append(delimiter).append(getPartition());
        sb.append(delimiter).append(getDescription());
        sb.append(delimiter).append(getClient());
        sb.append(delimiter).append(getSupplier());
        sb.append(delimiter).append(getLink());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * XrefID: {UQ : VARCHAR(255)} <br />
     * @return The value of the column 'XrefID'. (Nullable)
     */
    public String getXrefid() {
        return _xrefid;
    }

    /**
     * XrefID: {UQ : VARCHAR(255)} <br />
     * @param xrefid The value of the column 'XrefID'. (Nullable)
     */
    public void setXrefid(String xrefid) {
        _modifiedProperties.addPropertyName("xrefid");
        this._xrefid = xrefid;
    }

    /**
     * ToolID: {VARCHAR(50)} <br />
     * @return The value of the column 'ToolID'. (Nullable)
     */
    public String getToolid() {
        return _toolid;
    }

    /**
     * ToolID: {VARCHAR(50)} <br />
     * @param toolid The value of the column 'ToolID'. (Nullable)
     */
    public void setToolid(String toolid) {
        _modifiedProperties.addPropertyName("toolid");
        this._toolid = toolid;
    }

    /**
     * Name: {VARCHAR(255)} <br />
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Name: {VARCHAR(255)} <br />
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
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
     * Visibility: {VARCHAR(255)} <br />
     * @return The value of the column 'Visibility'. (Nullable)
     */
    public String getVisibility() {
        return _visibility;
    }

    /**
     * Visibility: {VARCHAR(255)} <br />
     * @param visibility The value of the column 'Visibility'. (Nullable)
     */
    public void setVisibility(String visibility) {
        _modifiedProperties.addPropertyName("visibility");
        this._visibility = visibility;
    }

    /**
     * Namespace: {VARCHAR(255)} <br />
     * @return The value of the column 'Namespace'. (Nullable)
     */
    public String getNamespace() {
        return _namespace;
    }

    /**
     * Namespace: {VARCHAR(255)} <br />
     * @param namespace The value of the column 'Namespace'. (Nullable)
     */
    public void setNamespace(String namespace) {
        _modifiedProperties.addPropertyName("namespace");
        this._namespace = namespace;
    }

    /**
     * Requirement: {VARCHAR(255)} <br />
     * @return The value of the column 'Requirement'. (Nullable)
     */
    public String getRequirement() {
        return _requirement;
    }

    /**
     * Requirement: {VARCHAR(255)} <br />
     * @param requirement The value of the column 'Requirement'. (Nullable)
     */
    public void setRequirement(String requirement) {
        _modifiedProperties.addPropertyName("requirement");
        this._requirement = requirement;
    }

    /**
     * Constraint: {VARCHAR(255)} <br />
     * @return The value of the column 'Constraint'. (Nullable)
     */
    public String getConstraint() {
        return _constraint;
    }

    /**
     * Constraint: {VARCHAR(255)} <br />
     * @param constraint The value of the column 'Constraint'. (Nullable)
     */
    public void setConstraint(String constraint) {
        _modifiedProperties.addPropertyName("constraint");
        this._constraint = constraint;
    }

    /**
     * Behavior: {VARCHAR(255)} <br />
     * @return The value of the column 'Behavior'. (Nullable)
     */
    public String getBehavior() {
        return _behavior;
    }

    /**
     * Behavior: {VARCHAR(255)} <br />
     * @param behavior The value of the column 'Behavior'. (Nullable)
     */
    public void setBehavior(String behavior) {
        _modifiedProperties.addPropertyName("behavior");
        this._behavior = behavior;
    }

    /**
     * Partition: {VARCHAR(255)} <br />
     * @return The value of the column 'Partition'. (Nullable)
     */
    public String getPartition() {
        return _partition;
    }

    /**
     * Partition: {VARCHAR(255)} <br />
     * @param partition The value of the column 'Partition'. (Nullable)
     */
    public void setPartition(String partition) {
        _modifiedProperties.addPropertyName("partition");
        this._partition = partition;
    }

    /**
     * Description: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Description'. (Nullable)
     */
    public String getDescription() {
        return _description;
    }

    /**
     * Description: {LONGCHAR(2147483647)} <br />
     * @param description The value of the column 'Description'. (Nullable)
     */
    public void setDescription(String description) {
        _modifiedProperties.addPropertyName("description");
        this._description = description;
    }

    /**
     * Client: {VARCHAR(255)} <br />
     * @return The value of the column 'Client'. (Nullable)
     */
    public String getClient() {
        return _client;
    }

    /**
     * Client: {VARCHAR(255)} <br />
     * @param client The value of the column 'Client'. (Nullable)
     */
    public void setClient(String client) {
        _modifiedProperties.addPropertyName("client");
        this._client = client;
    }

    /**
     * Supplier: {VARCHAR(255)} <br />
     * @return The value of the column 'Supplier'. (Nullable)
     */
    public String getSupplier() {
        return _supplier;
    }

    /**
     * Supplier: {VARCHAR(255)} <br />
     * @param supplier The value of the column 'Supplier'. (Nullable)
     */
    public void setSupplier(String supplier) {
        _modifiedProperties.addPropertyName("supplier");
        this._supplier = supplier;
    }

    /**
     * Link: {VARCHAR(255)} <br />
     * @return The value of the column 'Link'. (Nullable)
     */
    public String getLink() {
        return _link;
    }

    /**
     * Link: {VARCHAR(255)} <br />
     * @param link The value of the column 'Link'. (Nullable)
     */
    public void setLink(String link) {
        _modifiedProperties.addPropertyName("link");
        this._link = link;
    }
}
