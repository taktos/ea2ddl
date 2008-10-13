package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_xrefuser(TABLE).
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
@SuppressWarnings("unchecked")
public abstract class BsTXrefuser implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_xrefuser. */
    public static final String TABLE = "t_xrefuser";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'XrefID'. {UQ : VARCHAR(255)} */
    protected String _xrefid;

    /** The attribute of the column 'ToolID'. {VARCHAR(50)} */
    protected String _toolid;

    /** The attribute of the column 'Name'. {VARCHAR(255)} */
    protected String _name;

    /** The attribute of the column 'Type'. {VARCHAR(255)} */
    protected String _type;

    /** The attribute of the column 'Visibility'. {VARCHAR(255)} */
    protected String _visibility;

    /** The attribute of the column 'Namespace'. {VARCHAR(255)} */
    protected String _namespace;

    /** The attribute of the column 'Requirement'. {VARCHAR(255)} */
    protected String _requirement;

    /** The attribute of the column 'Constraint'. {VARCHAR(255)} */
    protected String _constraint;

    /** The attribute of the column 'Behavior'. {VARCHAR(255)} */
    protected String _behavior;

    /** The attribute of the column 'Partition'. {VARCHAR(255)} */
    protected String _partition;

    /** The attribute of the column 'Description'. {LONGCHAR(2147483647)} */
    protected String _description;

    /** The attribute of the column 'Client'. {VARCHAR(255)} */
    protected String _client;

    /** The attribute of the column 'Supplier'. {VARCHAR(255)} */
    protected String _supplier;

    /** The attribute of the column 'Link'. {VARCHAR(255)} */
    protected String _link;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTXrefuser() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_xrefuser";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TXrefuser";
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
        if (other == null || !(other instanceof BsTXrefuser)) { return false; }
        final BsTXrefuser otherEntity = (BsTXrefuser)other;
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

    /** The column annotation for S2Dao. {UQ : VARCHAR(255)} */
    public static final String xrefid_COLUMN = "XrefID";

    /**
     * Get the value of the column 'XrefID'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'XrefID'. (Nullable)
     */
    public String getXrefid() {
        return _xrefid;
    }

    /**
     * Set the value of the column 'XrefID'. <br />
     * {UQ : VARCHAR(255)}
     * @param xrefid The value of the column 'XrefID'. (Nullable)
     */
    public void setXrefid(String xrefid) {
        _modifiedProperties.addPropertyName("xrefid");
        this._xrefid = xrefid;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String toolid_COLUMN = "ToolID";

    /**
     * Get the value of the column 'ToolID'. <br />
     * {VARCHAR(50)}
     * @return The value of the column 'ToolID'. (Nullable)
     */
    public String getToolid() {
        return _toolid;
    }

    /**
     * Set the value of the column 'ToolID'. <br />
     * {VARCHAR(50)}
     * @param toolid The value of the column 'ToolID'. (Nullable)
     */
    public void setToolid(String toolid) {
        _modifiedProperties.addPropertyName("toolid");
        this._toolid = toolid;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String name_COLUMN = "Name";

    /**
     * Get the value of the column 'Name'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Name'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Set the value of the column 'Name'. <br />
     * {VARCHAR(255)}
     * @param name The value of the column 'Name'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String type_COLUMN = "Type";

    /**
     * Get the value of the column 'Type'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Type'. (Nullable)
     */
    public String getType() {
        return _type;
    }

    /**
     * Set the value of the column 'Type'. <br />
     * {VARCHAR(255)}
     * @param type The value of the column 'Type'. (Nullable)
     */
    public void setType(String type) {
        _modifiedProperties.addPropertyName("type");
        this._type = type;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String visibility_COLUMN = "Visibility";

    /**
     * Get the value of the column 'Visibility'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Visibility'. (Nullable)
     */
    public String getVisibility() {
        return _visibility;
    }

    /**
     * Set the value of the column 'Visibility'. <br />
     * {VARCHAR(255)}
     * @param visibility The value of the column 'Visibility'. (Nullable)
     */
    public void setVisibility(String visibility) {
        _modifiedProperties.addPropertyName("visibility");
        this._visibility = visibility;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String namespace_COLUMN = "Namespace";

    /**
     * Get the value of the column 'Namespace'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Namespace'. (Nullable)
     */
    public String getNamespace() {
        return _namespace;
    }

    /**
     * Set the value of the column 'Namespace'. <br />
     * {VARCHAR(255)}
     * @param namespace The value of the column 'Namespace'. (Nullable)
     */
    public void setNamespace(String namespace) {
        _modifiedProperties.addPropertyName("namespace");
        this._namespace = namespace;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String requirement_COLUMN = "Requirement";

    /**
     * Get the value of the column 'Requirement'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Requirement'. (Nullable)
     */
    public String getRequirement() {
        return _requirement;
    }

    /**
     * Set the value of the column 'Requirement'. <br />
     * {VARCHAR(255)}
     * @param requirement The value of the column 'Requirement'. (Nullable)
     */
    public void setRequirement(String requirement) {
        _modifiedProperties.addPropertyName("requirement");
        this._requirement = requirement;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String constraint_COLUMN = "Constraint";

    /**
     * Get the value of the column 'Constraint'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Constraint'. (Nullable)
     */
    public String getConstraint() {
        return _constraint;
    }

    /**
     * Set the value of the column 'Constraint'. <br />
     * {VARCHAR(255)}
     * @param constraint The value of the column 'Constraint'. (Nullable)
     */
    public void setConstraint(String constraint) {
        _modifiedProperties.addPropertyName("constraint");
        this._constraint = constraint;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String behavior_COLUMN = "Behavior";

    /**
     * Get the value of the column 'Behavior'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Behavior'. (Nullable)
     */
    public String getBehavior() {
        return _behavior;
    }

    /**
     * Set the value of the column 'Behavior'. <br />
     * {VARCHAR(255)}
     * @param behavior The value of the column 'Behavior'. (Nullable)
     */
    public void setBehavior(String behavior) {
        _modifiedProperties.addPropertyName("behavior");
        this._behavior = behavior;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String partition_COLUMN = "Partition";

    /**
     * Get the value of the column 'Partition'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Partition'. (Nullable)
     */
    public String getPartition() {
        return _partition;
    }

    /**
     * Set the value of the column 'Partition'. <br />
     * {VARCHAR(255)}
     * @param partition The value of the column 'Partition'. (Nullable)
     */
    public void setPartition(String partition) {
        _modifiedProperties.addPropertyName("partition");
        this._partition = partition;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String description_COLUMN = "Description";

    /**
     * Get the value of the column 'Description'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Description'. (Nullable)
     */
    public String getDescription() {
        return _description;
    }

    /**
     * Set the value of the column 'Description'. <br />
     * {LONGCHAR(2147483647)}
     * @param description The value of the column 'Description'. (Nullable)
     */
    public void setDescription(String description) {
        _modifiedProperties.addPropertyName("description");
        this._description = description;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String client_COLUMN = "Client";

    /**
     * Get the value of the column 'Client'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Client'. (Nullable)
     */
    public String getClient() {
        return _client;
    }

    /**
     * Set the value of the column 'Client'. <br />
     * {VARCHAR(255)}
     * @param client The value of the column 'Client'. (Nullable)
     */
    public void setClient(String client) {
        _modifiedProperties.addPropertyName("client");
        this._client = client;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String supplier_COLUMN = "Supplier";

    /**
     * Get the value of the column 'Supplier'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Supplier'. (Nullable)
     */
    public String getSupplier() {
        return _supplier;
    }

    /**
     * Set the value of the column 'Supplier'. <br />
     * {VARCHAR(255)}
     * @param supplier The value of the column 'Supplier'. (Nullable)
     */
    public void setSupplier(String supplier) {
        _modifiedProperties.addPropertyName("supplier");
        this._supplier = supplier;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String link_COLUMN = "Link";

    /**
     * Get the value of the column 'Link'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Link'. (Nullable)
     */
    public String getLink() {
        return _link;
    }

    /**
     * Set the value of the column 'Link'. <br />
     * {VARCHAR(255)}
     * @param link The value of the column 'Link'. (Nullable)
     */
    public void setLink(String link) {
        _modifiedProperties.addPropertyName("link");
        this._link = link;
    }

}
