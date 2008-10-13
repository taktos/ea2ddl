package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_diagramtypes(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Diagram_Type, Name, Package_ID
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
public abstract class BsTDiagramtypes implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_diagramtypes. */
    public static final String TABLE = "t_diagramtypes";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Diagram_Type'. {UQ : VARCHAR(50)} */
    protected String _diagramType;

    /** The attribute of the column 'Name'. {VARCHAR(255)} */
    protected String _name;

    /** The attribute of the column 'Package_ID'. {INTEGER} */
    protected java.lang.Integer _packageId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTDiagramtypes() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_diagramtypes";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TDiagramtypes";
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
        if (other == null || !(other instanceof BsTDiagramtypes)) { return false; }
        final BsTDiagramtypes otherEntity = (BsTDiagramtypes)other;
        if (!helpComparingValue(getDiagramType(), otherEntity.getDiagramType())) { return false; }
        if (!helpComparingValue(getName(), otherEntity.getName())) { return false; }
        if (!helpComparingValue(getPackageId(), otherEntity.getPackageId())) { return false; }
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
        if (this.getDiagramType() != null) { result = result + this.getDiagramType().hashCode(); }
        if (this.getName() != null) { result = result + this.getName().hashCode(); }
        if (this.getPackageId() != null) { result = result + this.getPackageId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getDiagramType());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getPackageId());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : VARCHAR(50)} */
    public static final String diagramType_COLUMN = "Diagram_Type";

    /**
     * Get the value of the column 'Diagram_Type'. <br />
     * {UQ : VARCHAR(50)}
     * @return The value of the column 'Diagram_Type'. (Nullable)
     */
    public String getDiagramType() {
        return _diagramType;
    }

    /**
     * Set the value of the column 'Diagram_Type'. <br />
     * {UQ : VARCHAR(50)}
     * @param diagramType The value of the column 'Diagram_Type'. (Nullable)
     */
    public void setDiagramType(String diagramType) {
        _modifiedProperties.addPropertyName("diagramType");
        this._diagramType = diagramType;
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

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String packageId_COLUMN = "Package_ID";

    /**
     * Get the value of the column 'Package_ID'. <br />
     * {INTEGER}
     * @return The value of the column 'Package_ID'. (Nullable)
     */
    public java.lang.Integer getPackageId() {
        return _packageId;
    }

    /**
     * Set the value of the column 'Package_ID'. <br />
     * {INTEGER}
     * @param packageId The value of the column 'Package_ID'. (Nullable)
     */
    public void setPackageId(java.lang.Integer packageId) {
        _modifiedProperties.addPropertyName("packageId");
        this._packageId = packageId;
    }

}
