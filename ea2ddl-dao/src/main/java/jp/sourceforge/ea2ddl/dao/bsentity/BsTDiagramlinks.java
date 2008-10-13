package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_diagramlinks(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     DiagramID, ConnectorID, Geometry, Style, Hidden, Path, Instance_ID
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
public abstract class BsTDiagramlinks implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_diagramlinks. */
    public static final String TABLE = "t_diagramlinks";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'DiagramID'. {INTEGER} */
    protected java.lang.Integer _diagramid;

    /** The attribute of the column 'ConnectorID'. {INTEGER} */
    protected java.lang.Integer _connectorid;

    /** The attribute of the column 'Geometry'. {LONGCHAR(2147483647)} */
    protected String _geometry;

    /** The attribute of the column 'Style'. {VARCHAR(255)} */
    protected String _style;

    /** The attribute of the column 'Hidden'. {BIT : NotNull} */
    protected Boolean _hidden;

    /** The attribute of the column 'Path'. {VARCHAR(255)} */
    protected String _path;

    /** The attribute of the column 'Instance_ID'. {UQ : COUNTER : NotNull} */
    protected java.lang.Integer _instanceId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTDiagramlinks() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_diagramlinks";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TDiagramlinks";
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
        if (other == null || !(other instanceof BsTDiagramlinks)) { return false; }
        final BsTDiagramlinks otherEntity = (BsTDiagramlinks)other;
        if (!helpComparingValue(getDiagramid(), otherEntity.getDiagramid())) { return false; }
        if (!helpComparingValue(getConnectorid(), otherEntity.getConnectorid())) { return false; }
        if (!helpComparingValue(getGeometry(), otherEntity.getGeometry())) { return false; }
        if (!helpComparingValue(getStyle(), otherEntity.getStyle())) { return false; }
        if (!helpComparingValue(getHidden(), otherEntity.getHidden())) { return false; }
        if (!helpComparingValue(getPath(), otherEntity.getPath())) { return false; }
        if (!helpComparingValue(getInstanceId(), otherEntity.getInstanceId())) { return false; }
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
        if (this.getDiagramid() != null) { result = result + this.getDiagramid().hashCode(); }
        if (this.getConnectorid() != null) { result = result + this.getConnectorid().hashCode(); }
        if (this.getGeometry() != null) { result = result + this.getGeometry().hashCode(); }
        if (this.getStyle() != null) { result = result + this.getStyle().hashCode(); }
        if (this.getHidden() != null) { result = result + this.getHidden().hashCode(); }
        if (this.getPath() != null) { result = result + this.getPath().hashCode(); }
        if (this.getInstanceId() != null) { result = result + this.getInstanceId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getDiagramid());
        sb.append(delimiter).append(getConnectorid());
        sb.append(delimiter).append(getGeometry());
        sb.append(delimiter).append(getStyle());
        sb.append(delimiter).append(getHidden());
        sb.append(delimiter).append(getPath());
        sb.append(delimiter).append(getInstanceId());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String diagramid_COLUMN = "DiagramID";

    /**
     * Get the value of the column 'DiagramID'. <br />
     * {INTEGER}
     * @return The value of the column 'DiagramID'. (Nullable)
     */
    public java.lang.Integer getDiagramid() {
        return _diagramid;
    }

    /**
     * Set the value of the column 'DiagramID'. <br />
     * {INTEGER}
     * @param diagramid The value of the column 'DiagramID'. (Nullable)
     */
    public void setDiagramid(java.lang.Integer diagramid) {
        _modifiedProperties.addPropertyName("diagramid");
        this._diagramid = diagramid;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String connectorid_COLUMN = "ConnectorID";

    /**
     * Get the value of the column 'ConnectorID'. <br />
     * {INTEGER}
     * @return The value of the column 'ConnectorID'. (Nullable)
     */
    public java.lang.Integer getConnectorid() {
        return _connectorid;
    }

    /**
     * Set the value of the column 'ConnectorID'. <br />
     * {INTEGER}
     * @param connectorid The value of the column 'ConnectorID'. (Nullable)
     */
    public void setConnectorid(java.lang.Integer connectorid) {
        _modifiedProperties.addPropertyName("connectorid");
        this._connectorid = connectorid;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String geometry_COLUMN = "Geometry";

    /**
     * Get the value of the column 'Geometry'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Geometry'. (Nullable)
     */
    public String getGeometry() {
        return _geometry;
    }

    /**
     * Set the value of the column 'Geometry'. <br />
     * {LONGCHAR(2147483647)}
     * @param geometry The value of the column 'Geometry'. (Nullable)
     */
    public void setGeometry(String geometry) {
        _modifiedProperties.addPropertyName("geometry");
        this._geometry = geometry;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String style_COLUMN = "Style";

    /**
     * Get the value of the column 'Style'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Style'. (Nullable)
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Set the value of the column 'Style'. <br />
     * {VARCHAR(255)}
     * @param style The value of the column 'Style'. (Nullable)
     */
    public void setStyle(String style) {
        _modifiedProperties.addPropertyName("style");
        this._style = style;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String hidden_COLUMN = "Hidden";

    /**
     * Get the value of the column 'Hidden'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Hidden'. (Nullable)
     */
    public Boolean getHidden() {
        return _hidden;
    }

    /**
     * Set the value of the column 'Hidden'. <br />
     * {BIT : NotNull}
     * @param hidden The value of the column 'Hidden'. (Nullable)
     */
    public void setHidden(Boolean hidden) {
        _modifiedProperties.addPropertyName("hidden");
        this._hidden = hidden;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String path_COLUMN = "Path";

    /**
     * Get the value of the column 'Path'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Path'. (Nullable)
     */
    public String getPath() {
        return _path;
    }

    /**
     * Set the value of the column 'Path'. <br />
     * {VARCHAR(255)}
     * @param path The value of the column 'Path'. (Nullable)
     */
    public void setPath(String path) {
        _modifiedProperties.addPropertyName("path");
        this._path = path;
    }

    /** The column annotation for S2Dao. {UQ : COUNTER : NotNull} */
    public static final String instanceId_COLUMN = "Instance_ID";

    /**
     * Get the value of the column 'Instance_ID'. <br />
     * {UQ : COUNTER : NotNull}
     * @return The value of the column 'Instance_ID'. (Nullable)
     */
    public java.lang.Integer getInstanceId() {
        return _instanceId;
    }

    /**
     * Set the value of the column 'Instance_ID'. <br />
     * {UQ : COUNTER : NotNull}
     * @param instanceId The value of the column 'Instance_ID'. (Nullable)
     */
    public void setInstanceId(java.lang.Integer instanceId) {
        _modifiedProperties.addPropertyName("instanceId");
        this._instanceId = instanceId;
    }

}
