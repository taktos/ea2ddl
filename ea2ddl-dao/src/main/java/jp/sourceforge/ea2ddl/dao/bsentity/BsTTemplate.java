package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_template that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     TemplateID, TemplateType, TemplateName, Notes, Style, Template
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
public abstract class BsTTemplate implements Entity, Serializable {

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
    /** TemplateID: {UQ : VARCHAR(40)} */
    protected String _templateid;

    /** TemplateType: {VARCHAR(50)} */
    protected String _templatetype;

    /** TemplateName: {VARCHAR(100)} */
    protected String _templatename;

    /** Notes: {VARCHAR(255)} */
    protected String _notes;

    /** Style: {VARCHAR(255)} */
    protected String _style;

    /** Template: {LONGCHAR(2147483647)} */
    protected String _template;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_template";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TTemplate";
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
        if (other == null || !(other instanceof BsTTemplate)) { return false; }
        final BsTTemplate otherEntity = (BsTTemplate)other;
        if (!helpComparingValue(getTemplateid(), otherEntity.getTemplateid())) { return false; }
        if (!helpComparingValue(getTemplatetype(), otherEntity.getTemplatetype())) { return false; }
        if (!helpComparingValue(getTemplatename(), otherEntity.getTemplatename())) { return false; }
        if (!helpComparingValue(getNotes(), otherEntity.getNotes())) { return false; }
        if (!helpComparingValue(getStyle(), otherEntity.getStyle())) { return false; }
        if (!helpComparingValue(getTemplate(), otherEntity.getTemplate())) { return false; }
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
        if (this.getTemplateid() != null) { result = result + this.getTemplateid().hashCode(); }
        if (this.getTemplatetype() != null) { result = result + this.getTemplatetype().hashCode(); }
        if (this.getTemplatename() != null) { result = result + this.getTemplatename().hashCode(); }
        if (this.getNotes() != null) { result = result + this.getNotes().hashCode(); }
        if (this.getStyle() != null) { result = result + this.getStyle().hashCode(); }
        if (this.getTemplate() != null) { result = result + this.getTemplate().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getTemplateid());
        sb.append(delimiter).append(getTemplatetype());
        sb.append(delimiter).append(getTemplatename());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getStyle());
        sb.append(delimiter).append(getTemplate());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * TemplateID: {UQ : VARCHAR(40)} <br />
     * @return The value of the column 'TemplateID'. (Nullable)
     */
    public String getTemplateid() {
        return _templateid;
    }

    /**
     * TemplateID: {UQ : VARCHAR(40)} <br />
     * @param templateid The value of the column 'TemplateID'. (Nullable)
     */
    public void setTemplateid(String templateid) {
        _modifiedProperties.addPropertyName("templateid");
        this._templateid = templateid;
    }

    /**
     * TemplateType: {VARCHAR(50)} <br />
     * @return The value of the column 'TemplateType'. (Nullable)
     */
    public String getTemplatetype() {
        return _templatetype;
    }

    /**
     * TemplateType: {VARCHAR(50)} <br />
     * @param templatetype The value of the column 'TemplateType'. (Nullable)
     */
    public void setTemplatetype(String templatetype) {
        _modifiedProperties.addPropertyName("templatetype");
        this._templatetype = templatetype;
    }

    /**
     * TemplateName: {VARCHAR(100)} <br />
     * @return The value of the column 'TemplateName'. (Nullable)
     */
    public String getTemplatename() {
        return _templatename;
    }

    /**
     * TemplateName: {VARCHAR(100)} <br />
     * @param templatename The value of the column 'TemplateName'. (Nullable)
     */
    public void setTemplatename(String templatename) {
        _modifiedProperties.addPropertyName("templatename");
        this._templatename = templatename;
    }

    /**
     * Notes: {VARCHAR(255)} <br />
     * @return The value of the column 'Notes'. (Nullable)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * Notes: {VARCHAR(255)} <br />
     * @param notes The value of the column 'Notes'. (Nullable)
     */
    public void setNotes(String notes) {
        _modifiedProperties.addPropertyName("notes");
        this._notes = notes;
    }

    /**
     * Style: {VARCHAR(255)} <br />
     * @return The value of the column 'Style'. (Nullable)
     */
    public String getStyle() {
        return _style;
    }

    /**
     * Style: {VARCHAR(255)} <br />
     * @param style The value of the column 'Style'. (Nullable)
     */
    public void setStyle(String style) {
        _modifiedProperties.addPropertyName("style");
        this._style = style;
    }

    /**
     * Template: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Template'. (Nullable)
     */
    public String getTemplate() {
        return _template;
    }

    /**
     * Template: {LONGCHAR(2147483647)} <br />
     * @param template The value of the column 'Template'. (Nullable)
     */
    public void setTemplate(String template) {
        _modifiedProperties.addPropertyName("template");
        this._template = template;
    }
}
