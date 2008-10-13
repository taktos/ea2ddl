package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_rtfreport(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     TemplateID, RootPackage, Filename, Details, ProcessChildren, ShowDiagrams, Heading, Requirements, Associations, Scenarios, ChildDiagrams, Attributes, Methods, ImageType, Paging, Intro, Resources, Constraints, Tagged, ShowTag, ShowAlias, PDATA1, PDATA2, PDATA3, PDATA4
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
public abstract class BsTRtfreport implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_rtfreport. */
    public static final String TABLE = "t_rtfreport";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'TemplateID'. {UQ : VARCHAR(200)} */
    protected String _templateid;

    /** The attribute of the column 'RootPackage'. {INTEGER} */
    protected java.lang.Integer _rootpackage;

    /** The attribute of the column 'Filename'. {VARCHAR(255)} */
    protected String _filename;

    /** The attribute of the column 'Details'. {BIT : NotNull} */
    protected Boolean _details;

    /** The attribute of the column 'ProcessChildren'. {BIT : NotNull} */
    protected Boolean _processchildren;

    /** The attribute of the column 'ShowDiagrams'. {BIT : NotNull} */
    protected Boolean _showdiagrams;

    /** The attribute of the column 'Heading'. {VARCHAR(255)} */
    protected String _heading;

    /** The attribute of the column 'Requirements'. {BIT : NotNull} */
    protected Boolean _requirements;

    /** The attribute of the column 'Associations'. {BIT : NotNull} */
    protected Boolean _associations;

    /** The attribute of the column 'Scenarios'. {BIT : NotNull} */
    protected Boolean _scenarios;

    /** The attribute of the column 'ChildDiagrams'. {BIT : NotNull} */
    protected Boolean _childdiagrams;

    /** The attribute of the column 'Attributes'. {BIT : NotNull} */
    protected Boolean _attributes;

    /** The attribute of the column 'Methods'. {BIT : NotNull} */
    protected Boolean _methods;

    /** The attribute of the column 'ImageType'. {INTEGER} */
    protected java.lang.Integer _imagetype;

    /** The attribute of the column 'Paging'. {BIT : NotNull} */
    protected Boolean _paging;

    /** The attribute of the column 'Intro'. {LONGCHAR(2147483647)} */
    protected String _intro;

    /** The attribute of the column 'Resources'. {BIT : NotNull} */
    protected Boolean _resources;

    /** The attribute of the column 'Constraints'. {BIT : NotNull} */
    protected Boolean _constraints;

    /** The attribute of the column 'Tagged'. {BIT : NotNull} */
    protected Boolean _tagged;

    /** The attribute of the column 'ShowTag'. {BIT : NotNull} */
    protected Boolean _showtag;

    /** The attribute of the column 'ShowAlias'. {BIT : NotNull} */
    protected Boolean _showalias;

    /** The attribute of the column 'PDATA1'. {VARCHAR(255)} */
    protected String _pdata1;

    /** The attribute of the column 'PDATA2'. {VARCHAR(255)} */
    protected String _pdata2;

    /** The attribute of the column 'PDATA3'. {VARCHAR(255)} */
    protected String _pdata3;

    /** The attribute of the column 'PDATA4'. {LONGCHAR(2147483647)} */
    protected String _pdata4;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTRtfreport() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_rtfreport";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TRtfreport";
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
        if (other == null || !(other instanceof BsTRtfreport)) { return false; }
        final BsTRtfreport otherEntity = (BsTRtfreport)other;
        if (!helpComparingValue(getTemplateid(), otherEntity.getTemplateid())) { return false; }
        if (!helpComparingValue(getRootpackage(), otherEntity.getRootpackage())) { return false; }
        if (!helpComparingValue(getFilename(), otherEntity.getFilename())) { return false; }
        if (!helpComparingValue(getDetails(), otherEntity.getDetails())) { return false; }
        if (!helpComparingValue(getProcesschildren(), otherEntity.getProcesschildren())) { return false; }
        if (!helpComparingValue(getShowdiagrams(), otherEntity.getShowdiagrams())) { return false; }
        if (!helpComparingValue(getHeading(), otherEntity.getHeading())) { return false; }
        if (!helpComparingValue(getRequirements(), otherEntity.getRequirements())) { return false; }
        if (!helpComparingValue(getAssociations(), otherEntity.getAssociations())) { return false; }
        if (!helpComparingValue(getScenarios(), otherEntity.getScenarios())) { return false; }
        if (!helpComparingValue(getChilddiagrams(), otherEntity.getChilddiagrams())) { return false; }
        if (!helpComparingValue(getAttributes(), otherEntity.getAttributes())) { return false; }
        if (!helpComparingValue(getMethods(), otherEntity.getMethods())) { return false; }
        if (!helpComparingValue(getImagetype(), otherEntity.getImagetype())) { return false; }
        if (!helpComparingValue(getPaging(), otherEntity.getPaging())) { return false; }
        if (!helpComparingValue(getIntro(), otherEntity.getIntro())) { return false; }
        if (!helpComparingValue(getResources(), otherEntity.getResources())) { return false; }
        if (!helpComparingValue(getConstraints(), otherEntity.getConstraints())) { return false; }
        if (!helpComparingValue(getTagged(), otherEntity.getTagged())) { return false; }
        if (!helpComparingValue(getShowtag(), otherEntity.getShowtag())) { return false; }
        if (!helpComparingValue(getShowalias(), otherEntity.getShowalias())) { return false; }
        if (!helpComparingValue(getPdata1(), otherEntity.getPdata1())) { return false; }
        if (!helpComparingValue(getPdata2(), otherEntity.getPdata2())) { return false; }
        if (!helpComparingValue(getPdata3(), otherEntity.getPdata3())) { return false; }
        if (!helpComparingValue(getPdata4(), otherEntity.getPdata4())) { return false; }
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
        if (this.getRootpackage() != null) { result = result + this.getRootpackage().hashCode(); }
        if (this.getFilename() != null) { result = result + this.getFilename().hashCode(); }
        if (this.getDetails() != null) { result = result + this.getDetails().hashCode(); }
        if (this.getProcesschildren() != null) { result = result + this.getProcesschildren().hashCode(); }
        if (this.getShowdiagrams() != null) { result = result + this.getShowdiagrams().hashCode(); }
        if (this.getHeading() != null) { result = result + this.getHeading().hashCode(); }
        if (this.getRequirements() != null) { result = result + this.getRequirements().hashCode(); }
        if (this.getAssociations() != null) { result = result + this.getAssociations().hashCode(); }
        if (this.getScenarios() != null) { result = result + this.getScenarios().hashCode(); }
        if (this.getChilddiagrams() != null) { result = result + this.getChilddiagrams().hashCode(); }
        if (this.getAttributes() != null) { result = result + this.getAttributes().hashCode(); }
        if (this.getMethods() != null) { result = result + this.getMethods().hashCode(); }
        if (this.getImagetype() != null) { result = result + this.getImagetype().hashCode(); }
        if (this.getPaging() != null) { result = result + this.getPaging().hashCode(); }
        if (this.getIntro() != null) { result = result + this.getIntro().hashCode(); }
        if (this.getResources() != null) { result = result + this.getResources().hashCode(); }
        if (this.getConstraints() != null) { result = result + this.getConstraints().hashCode(); }
        if (this.getTagged() != null) { result = result + this.getTagged().hashCode(); }
        if (this.getShowtag() != null) { result = result + this.getShowtag().hashCode(); }
        if (this.getShowalias() != null) { result = result + this.getShowalias().hashCode(); }
        if (this.getPdata1() != null) { result = result + this.getPdata1().hashCode(); }
        if (this.getPdata2() != null) { result = result + this.getPdata2().hashCode(); }
        if (this.getPdata3() != null) { result = result + this.getPdata3().hashCode(); }
        if (this.getPdata4() != null) { result = result + this.getPdata4().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getTemplateid());
        sb.append(delimiter).append(getRootpackage());
        sb.append(delimiter).append(getFilename());
        sb.append(delimiter).append(getDetails());
        sb.append(delimiter).append(getProcesschildren());
        sb.append(delimiter).append(getShowdiagrams());
        sb.append(delimiter).append(getHeading());
        sb.append(delimiter).append(getRequirements());
        sb.append(delimiter).append(getAssociations());
        sb.append(delimiter).append(getScenarios());
        sb.append(delimiter).append(getChilddiagrams());
        sb.append(delimiter).append(getAttributes());
        sb.append(delimiter).append(getMethods());
        sb.append(delimiter).append(getImagetype());
        sb.append(delimiter).append(getPaging());
        sb.append(delimiter).append(getIntro());
        sb.append(delimiter).append(getResources());
        sb.append(delimiter).append(getConstraints());
        sb.append(delimiter).append(getTagged());
        sb.append(delimiter).append(getShowtag());
        sb.append(delimiter).append(getShowalias());
        sb.append(delimiter).append(getPdata1());
        sb.append(delimiter).append(getPdata2());
        sb.append(delimiter).append(getPdata3());
        sb.append(delimiter).append(getPdata4());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : VARCHAR(200)} */
    public static final String templateid_COLUMN = "TemplateID";

    /**
     * Get the value of the column 'TemplateID'. <br />
     * {UQ : VARCHAR(200)}
     * @return The value of the column 'TemplateID'. (Nullable)
     */
    public String getTemplateid() {
        return _templateid;
    }

    /**
     * Set the value of the column 'TemplateID'. <br />
     * {UQ : VARCHAR(200)}
     * @param templateid The value of the column 'TemplateID'. (Nullable)
     */
    public void setTemplateid(String templateid) {
        _modifiedProperties.addPropertyName("templateid");
        this._templateid = templateid;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String rootpackage_COLUMN = "RootPackage";

    /**
     * Get the value of the column 'RootPackage'. <br />
     * {INTEGER}
     * @return The value of the column 'RootPackage'. (Nullable)
     */
    public java.lang.Integer getRootpackage() {
        return _rootpackage;
    }

    /**
     * Set the value of the column 'RootPackage'. <br />
     * {INTEGER}
     * @param rootpackage The value of the column 'RootPackage'. (Nullable)
     */
    public void setRootpackage(java.lang.Integer rootpackage) {
        _modifiedProperties.addPropertyName("rootpackage");
        this._rootpackage = rootpackage;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String filename_COLUMN = "Filename";

    /**
     * Get the value of the column 'Filename'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Filename'. (Nullable)
     */
    public String getFilename() {
        return _filename;
    }

    /**
     * Set the value of the column 'Filename'. <br />
     * {VARCHAR(255)}
     * @param filename The value of the column 'Filename'. (Nullable)
     */
    public void setFilename(String filename) {
        _modifiedProperties.addPropertyName("filename");
        this._filename = filename;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String details_COLUMN = "Details";

    /**
     * Get the value of the column 'Details'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Details'. (Nullable)
     */
    public Boolean getDetails() {
        return _details;
    }

    /**
     * Set the value of the column 'Details'. <br />
     * {BIT : NotNull}
     * @param details The value of the column 'Details'. (Nullable)
     */
    public void setDetails(Boolean details) {
        _modifiedProperties.addPropertyName("details");
        this._details = details;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String processchildren_COLUMN = "ProcessChildren";

    /**
     * Get the value of the column 'ProcessChildren'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'ProcessChildren'. (Nullable)
     */
    public Boolean getProcesschildren() {
        return _processchildren;
    }

    /**
     * Set the value of the column 'ProcessChildren'. <br />
     * {BIT : NotNull}
     * @param processchildren The value of the column 'ProcessChildren'. (Nullable)
     */
    public void setProcesschildren(Boolean processchildren) {
        _modifiedProperties.addPropertyName("processchildren");
        this._processchildren = processchildren;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String showdiagrams_COLUMN = "ShowDiagrams";

    /**
     * Get the value of the column 'ShowDiagrams'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'ShowDiagrams'. (Nullable)
     */
    public Boolean getShowdiagrams() {
        return _showdiagrams;
    }

    /**
     * Set the value of the column 'ShowDiagrams'. <br />
     * {BIT : NotNull}
     * @param showdiagrams The value of the column 'ShowDiagrams'. (Nullable)
     */
    public void setShowdiagrams(Boolean showdiagrams) {
        _modifiedProperties.addPropertyName("showdiagrams");
        this._showdiagrams = showdiagrams;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String heading_COLUMN = "Heading";

    /**
     * Get the value of the column 'Heading'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Heading'. (Nullable)
     */
    public String getHeading() {
        return _heading;
    }

    /**
     * Set the value of the column 'Heading'. <br />
     * {VARCHAR(255)}
     * @param heading The value of the column 'Heading'. (Nullable)
     */
    public void setHeading(String heading) {
        _modifiedProperties.addPropertyName("heading");
        this._heading = heading;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String requirements_COLUMN = "Requirements";

    /**
     * Get the value of the column 'Requirements'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Requirements'. (Nullable)
     */
    public Boolean getRequirements() {
        return _requirements;
    }

    /**
     * Set the value of the column 'Requirements'. <br />
     * {BIT : NotNull}
     * @param requirements The value of the column 'Requirements'. (Nullable)
     */
    public void setRequirements(Boolean requirements) {
        _modifiedProperties.addPropertyName("requirements");
        this._requirements = requirements;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String associations_COLUMN = "Associations";

    /**
     * Get the value of the column 'Associations'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Associations'. (Nullable)
     */
    public Boolean getAssociations() {
        return _associations;
    }

    /**
     * Set the value of the column 'Associations'. <br />
     * {BIT : NotNull}
     * @param associations The value of the column 'Associations'. (Nullable)
     */
    public void setAssociations(Boolean associations) {
        _modifiedProperties.addPropertyName("associations");
        this._associations = associations;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String scenarios_COLUMN = "Scenarios";

    /**
     * Get the value of the column 'Scenarios'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Scenarios'. (Nullable)
     */
    public Boolean getScenarios() {
        return _scenarios;
    }

    /**
     * Set the value of the column 'Scenarios'. <br />
     * {BIT : NotNull}
     * @param scenarios The value of the column 'Scenarios'. (Nullable)
     */
    public void setScenarios(Boolean scenarios) {
        _modifiedProperties.addPropertyName("scenarios");
        this._scenarios = scenarios;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String childdiagrams_COLUMN = "ChildDiagrams";

    /**
     * Get the value of the column 'ChildDiagrams'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'ChildDiagrams'. (Nullable)
     */
    public Boolean getChilddiagrams() {
        return _childdiagrams;
    }

    /**
     * Set the value of the column 'ChildDiagrams'. <br />
     * {BIT : NotNull}
     * @param childdiagrams The value of the column 'ChildDiagrams'. (Nullable)
     */
    public void setChilddiagrams(Boolean childdiagrams) {
        _modifiedProperties.addPropertyName("childdiagrams");
        this._childdiagrams = childdiagrams;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String attributes_COLUMN = "Attributes";

    /**
     * Get the value of the column 'Attributes'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Attributes'. (Nullable)
     */
    public Boolean getAttributes() {
        return _attributes;
    }

    /**
     * Set the value of the column 'Attributes'. <br />
     * {BIT : NotNull}
     * @param attributes The value of the column 'Attributes'. (Nullable)
     */
    public void setAttributes(Boolean attributes) {
        _modifiedProperties.addPropertyName("attributes");
        this._attributes = attributes;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String methods_COLUMN = "Methods";

    /**
     * Get the value of the column 'Methods'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Methods'. (Nullable)
     */
    public Boolean getMethods() {
        return _methods;
    }

    /**
     * Set the value of the column 'Methods'. <br />
     * {BIT : NotNull}
     * @param methods The value of the column 'Methods'. (Nullable)
     */
    public void setMethods(Boolean methods) {
        _modifiedProperties.addPropertyName("methods");
        this._methods = methods;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String imagetype_COLUMN = "ImageType";

    /**
     * Get the value of the column 'ImageType'. <br />
     * {INTEGER}
     * @return The value of the column 'ImageType'. (Nullable)
     */
    public java.lang.Integer getImagetype() {
        return _imagetype;
    }

    /**
     * Set the value of the column 'ImageType'. <br />
     * {INTEGER}
     * @param imagetype The value of the column 'ImageType'. (Nullable)
     */
    public void setImagetype(java.lang.Integer imagetype) {
        _modifiedProperties.addPropertyName("imagetype");
        this._imagetype = imagetype;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String paging_COLUMN = "Paging";

    /**
     * Get the value of the column 'Paging'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Paging'. (Nullable)
     */
    public Boolean getPaging() {
        return _paging;
    }

    /**
     * Set the value of the column 'Paging'. <br />
     * {BIT : NotNull}
     * @param paging The value of the column 'Paging'. (Nullable)
     */
    public void setPaging(Boolean paging) {
        _modifiedProperties.addPropertyName("paging");
        this._paging = paging;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String intro_COLUMN = "Intro";

    /**
     * Get the value of the column 'Intro'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Intro'. (Nullable)
     */
    public String getIntro() {
        return _intro;
    }

    /**
     * Set the value of the column 'Intro'. <br />
     * {LONGCHAR(2147483647)}
     * @param intro The value of the column 'Intro'. (Nullable)
     */
    public void setIntro(String intro) {
        _modifiedProperties.addPropertyName("intro");
        this._intro = intro;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String resources_COLUMN = "Resources";

    /**
     * Get the value of the column 'Resources'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Resources'. (Nullable)
     */
    public Boolean getResources() {
        return _resources;
    }

    /**
     * Set the value of the column 'Resources'. <br />
     * {BIT : NotNull}
     * @param resources The value of the column 'Resources'. (Nullable)
     */
    public void setResources(Boolean resources) {
        _modifiedProperties.addPropertyName("resources");
        this._resources = resources;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String constraints_COLUMN = "Constraints";

    /**
     * Get the value of the column 'Constraints'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Constraints'. (Nullable)
     */
    public Boolean getConstraints() {
        return _constraints;
    }

    /**
     * Set the value of the column 'Constraints'. <br />
     * {BIT : NotNull}
     * @param constraints The value of the column 'Constraints'. (Nullable)
     */
    public void setConstraints(Boolean constraints) {
        _modifiedProperties.addPropertyName("constraints");
        this._constraints = constraints;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String tagged_COLUMN = "Tagged";

    /**
     * Get the value of the column 'Tagged'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'Tagged'. (Nullable)
     */
    public Boolean getTagged() {
        return _tagged;
    }

    /**
     * Set the value of the column 'Tagged'. <br />
     * {BIT : NotNull}
     * @param tagged The value of the column 'Tagged'. (Nullable)
     */
    public void setTagged(Boolean tagged) {
        _modifiedProperties.addPropertyName("tagged");
        this._tagged = tagged;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String showtag_COLUMN = "ShowTag";

    /**
     * Get the value of the column 'ShowTag'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'ShowTag'. (Nullable)
     */
    public Boolean getShowtag() {
        return _showtag;
    }

    /**
     * Set the value of the column 'ShowTag'. <br />
     * {BIT : NotNull}
     * @param showtag The value of the column 'ShowTag'. (Nullable)
     */
    public void setShowtag(Boolean showtag) {
        _modifiedProperties.addPropertyName("showtag");
        this._showtag = showtag;
    }

    /** The column annotation for S2Dao. {BIT : NotNull} */
    public static final String showalias_COLUMN = "ShowAlias";

    /**
     * Get the value of the column 'ShowAlias'. <br />
     * {BIT : NotNull}
     * @return The value of the column 'ShowAlias'. (Nullable)
     */
    public Boolean getShowalias() {
        return _showalias;
    }

    /**
     * Set the value of the column 'ShowAlias'. <br />
     * {BIT : NotNull}
     * @param showalias The value of the column 'ShowAlias'. (Nullable)
     */
    public void setShowalias(Boolean showalias) {
        _modifiedProperties.addPropertyName("showalias");
        this._showalias = showalias;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata1_COLUMN = "PDATA1";

    /**
     * Get the value of the column 'PDATA1'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA1'. (Nullable)
     */
    public String getPdata1() {
        return _pdata1;
    }

    /**
     * Set the value of the column 'PDATA1'. <br />
     * {VARCHAR(255)}
     * @param pdata1 The value of the column 'PDATA1'. (Nullable)
     */
    public void setPdata1(String pdata1) {
        _modifiedProperties.addPropertyName("pdata1");
        this._pdata1 = pdata1;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata2_COLUMN = "PDATA2";

    /**
     * Get the value of the column 'PDATA2'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA2'. (Nullable)
     */
    public String getPdata2() {
        return _pdata2;
    }

    /**
     * Set the value of the column 'PDATA2'. <br />
     * {VARCHAR(255)}
     * @param pdata2 The value of the column 'PDATA2'. (Nullable)
     */
    public void setPdata2(String pdata2) {
        _modifiedProperties.addPropertyName("pdata2");
        this._pdata2 = pdata2;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String pdata3_COLUMN = "PDATA3";

    /**
     * Get the value of the column 'PDATA3'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'PDATA3'. (Nullable)
     */
    public String getPdata3() {
        return _pdata3;
    }

    /**
     * Set the value of the column 'PDATA3'. <br />
     * {VARCHAR(255)}
     * @param pdata3 The value of the column 'PDATA3'. (Nullable)
     */
    public void setPdata3(String pdata3) {
        _modifiedProperties.addPropertyName("pdata3");
        this._pdata3 = pdata3;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String pdata4_COLUMN = "PDATA4";

    /**
     * Get the value of the column 'PDATA4'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'PDATA4'. (Nullable)
     */
    public String getPdata4() {
        return _pdata4;
    }

    /**
     * Set the value of the column 'PDATA4'. <br />
     * {LONGCHAR(2147483647)}
     * @param pdata4 The value of the column 'PDATA4'. (Nullable)
     */
    public void setPdata4(String pdata4) {
        _modifiedProperties.addPropertyName("pdata4");
        this._pdata4 = pdata4;
    }

}
