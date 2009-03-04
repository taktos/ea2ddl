package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_rtfreport that the type is TABLE. <br />
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
public abstract class BsTRtfreport implements Entity, Serializable {

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
    /** TemplateID: {UQ : VARCHAR(200)} */
    protected String _templateid;

    /** RootPackage: {INTEGER} */
    protected java.lang.Integer _rootpackage;

    /** Filename: {VARCHAR(255)} */
    protected String _filename;

    /** Details: {NotNull : BIT} */
    protected Boolean _details;

    /** ProcessChildren: {NotNull : BIT} */
    protected Boolean _processchildren;

    /** ShowDiagrams: {NotNull : BIT} */
    protected Boolean _showdiagrams;

    /** Heading: {VARCHAR(255)} */
    protected String _heading;

    /** Requirements: {NotNull : BIT} */
    protected Boolean _requirements;

    /** Associations: {NotNull : BIT} */
    protected Boolean _associations;

    /** Scenarios: {NotNull : BIT} */
    protected Boolean _scenarios;

    /** ChildDiagrams: {NotNull : BIT} */
    protected Boolean _childdiagrams;

    /** Attributes: {NotNull : BIT} */
    protected Boolean _attributes;

    /** Methods: {NotNull : BIT} */
    protected Boolean _methods;

    /** ImageType: {INTEGER} */
    protected java.lang.Integer _imagetype;

    /** Paging: {NotNull : BIT} */
    protected Boolean _paging;

    /** Intro: {LONGCHAR(2147483647)} */
    protected String _intro;

    /** Resources: {NotNull : BIT} */
    protected Boolean _resources;

    /** Constraints: {NotNull : BIT} */
    protected Boolean _constraints;

    /** Tagged: {NotNull : BIT} */
    protected Boolean _tagged;

    /** ShowTag: {NotNull : BIT} */
    protected Boolean _showtag;

    /** ShowAlias: {NotNull : BIT} */
    protected Boolean _showalias;

    /** PDATA1: {VARCHAR(255)} */
    protected String _pdata1;

    /** PDATA2: {VARCHAR(255)} */
    protected String _pdata2;

    /** PDATA3: {VARCHAR(255)} */
    protected String _pdata3;

    /** PDATA4: {LONGCHAR(2147483647)} */
    protected String _pdata4;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_rtfreport";
    }

    public String getTablePropertyName() { // as JavaBeansRule
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
    /**
     * TemplateID: {UQ : VARCHAR(200)} <br />
     * @return The value of the column 'TemplateID'. (Nullable)
     */
    public String getTemplateid() {
        return _templateid;
    }

    /**
     * TemplateID: {UQ : VARCHAR(200)} <br />
     * @param templateid The value of the column 'TemplateID'. (Nullable)
     */
    public void setTemplateid(String templateid) {
        _modifiedProperties.addPropertyName("templateid");
        this._templateid = templateid;
    }

    /**
     * RootPackage: {INTEGER} <br />
     * @return The value of the column 'RootPackage'. (Nullable)
     */
    public java.lang.Integer getRootpackage() {
        return _rootpackage;
    }

    /**
     * RootPackage: {INTEGER} <br />
     * @param rootpackage The value of the column 'RootPackage'. (Nullable)
     */
    public void setRootpackage(java.lang.Integer rootpackage) {
        _modifiedProperties.addPropertyName("rootpackage");
        this._rootpackage = rootpackage;
    }

    /**
     * Filename: {VARCHAR(255)} <br />
     * @return The value of the column 'Filename'. (Nullable)
     */
    public String getFilename() {
        return _filename;
    }

    /**
     * Filename: {VARCHAR(255)} <br />
     * @param filename The value of the column 'Filename'. (Nullable)
     */
    public void setFilename(String filename) {
        _modifiedProperties.addPropertyName("filename");
        this._filename = filename;
    }

    /**
     * Details: {NotNull : BIT} <br />
     * @return The value of the column 'Details'. (Nullable)
     */
    public Boolean getDetails() {
        return _details;
    }

    /**
     * Details: {NotNull : BIT} <br />
     * @param details The value of the column 'Details'. (Nullable)
     */
    public void setDetails(Boolean details) {
        _modifiedProperties.addPropertyName("details");
        this._details = details;
    }

    /**
     * ProcessChildren: {NotNull : BIT} <br />
     * @return The value of the column 'ProcessChildren'. (Nullable)
     */
    public Boolean getProcesschildren() {
        return _processchildren;
    }

    /**
     * ProcessChildren: {NotNull : BIT} <br />
     * @param processchildren The value of the column 'ProcessChildren'. (Nullable)
     */
    public void setProcesschildren(Boolean processchildren) {
        _modifiedProperties.addPropertyName("processchildren");
        this._processchildren = processchildren;
    }

    /**
     * ShowDiagrams: {NotNull : BIT} <br />
     * @return The value of the column 'ShowDiagrams'. (Nullable)
     */
    public Boolean getShowdiagrams() {
        return _showdiagrams;
    }

    /**
     * ShowDiagrams: {NotNull : BIT} <br />
     * @param showdiagrams The value of the column 'ShowDiagrams'. (Nullable)
     */
    public void setShowdiagrams(Boolean showdiagrams) {
        _modifiedProperties.addPropertyName("showdiagrams");
        this._showdiagrams = showdiagrams;
    }

    /**
     * Heading: {VARCHAR(255)} <br />
     * @return The value of the column 'Heading'. (Nullable)
     */
    public String getHeading() {
        return _heading;
    }

    /**
     * Heading: {VARCHAR(255)} <br />
     * @param heading The value of the column 'Heading'. (Nullable)
     */
    public void setHeading(String heading) {
        _modifiedProperties.addPropertyName("heading");
        this._heading = heading;
    }

    /**
     * Requirements: {NotNull : BIT} <br />
     * @return The value of the column 'Requirements'. (Nullable)
     */
    public Boolean getRequirements() {
        return _requirements;
    }

    /**
     * Requirements: {NotNull : BIT} <br />
     * @param requirements The value of the column 'Requirements'. (Nullable)
     */
    public void setRequirements(Boolean requirements) {
        _modifiedProperties.addPropertyName("requirements");
        this._requirements = requirements;
    }

    /**
     * Associations: {NotNull : BIT} <br />
     * @return The value of the column 'Associations'. (Nullable)
     */
    public Boolean getAssociations() {
        return _associations;
    }

    /**
     * Associations: {NotNull : BIT} <br />
     * @param associations The value of the column 'Associations'. (Nullable)
     */
    public void setAssociations(Boolean associations) {
        _modifiedProperties.addPropertyName("associations");
        this._associations = associations;
    }

    /**
     * Scenarios: {NotNull : BIT} <br />
     * @return The value of the column 'Scenarios'. (Nullable)
     */
    public Boolean getScenarios() {
        return _scenarios;
    }

    /**
     * Scenarios: {NotNull : BIT} <br />
     * @param scenarios The value of the column 'Scenarios'. (Nullable)
     */
    public void setScenarios(Boolean scenarios) {
        _modifiedProperties.addPropertyName("scenarios");
        this._scenarios = scenarios;
    }

    /**
     * ChildDiagrams: {NotNull : BIT} <br />
     * @return The value of the column 'ChildDiagrams'. (Nullable)
     */
    public Boolean getChilddiagrams() {
        return _childdiagrams;
    }

    /**
     * ChildDiagrams: {NotNull : BIT} <br />
     * @param childdiagrams The value of the column 'ChildDiagrams'. (Nullable)
     */
    public void setChilddiagrams(Boolean childdiagrams) {
        _modifiedProperties.addPropertyName("childdiagrams");
        this._childdiagrams = childdiagrams;
    }

    /**
     * Attributes: {NotNull : BIT} <br />
     * @return The value of the column 'Attributes'. (Nullable)
     */
    public Boolean getAttributes() {
        return _attributes;
    }

    /**
     * Attributes: {NotNull : BIT} <br />
     * @param attributes The value of the column 'Attributes'. (Nullable)
     */
    public void setAttributes(Boolean attributes) {
        _modifiedProperties.addPropertyName("attributes");
        this._attributes = attributes;
    }

    /**
     * Methods: {NotNull : BIT} <br />
     * @return The value of the column 'Methods'. (Nullable)
     */
    public Boolean getMethods() {
        return _methods;
    }

    /**
     * Methods: {NotNull : BIT} <br />
     * @param methods The value of the column 'Methods'. (Nullable)
     */
    public void setMethods(Boolean methods) {
        _modifiedProperties.addPropertyName("methods");
        this._methods = methods;
    }

    /**
     * ImageType: {INTEGER} <br />
     * @return The value of the column 'ImageType'. (Nullable)
     */
    public java.lang.Integer getImagetype() {
        return _imagetype;
    }

    /**
     * ImageType: {INTEGER} <br />
     * @param imagetype The value of the column 'ImageType'. (Nullable)
     */
    public void setImagetype(java.lang.Integer imagetype) {
        _modifiedProperties.addPropertyName("imagetype");
        this._imagetype = imagetype;
    }

    /**
     * Paging: {NotNull : BIT} <br />
     * @return The value of the column 'Paging'. (Nullable)
     */
    public Boolean getPaging() {
        return _paging;
    }

    /**
     * Paging: {NotNull : BIT} <br />
     * @param paging The value of the column 'Paging'. (Nullable)
     */
    public void setPaging(Boolean paging) {
        _modifiedProperties.addPropertyName("paging");
        this._paging = paging;
    }

    /**
     * Intro: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'Intro'. (Nullable)
     */
    public String getIntro() {
        return _intro;
    }

    /**
     * Intro: {LONGCHAR(2147483647)} <br />
     * @param intro The value of the column 'Intro'. (Nullable)
     */
    public void setIntro(String intro) {
        _modifiedProperties.addPropertyName("intro");
        this._intro = intro;
    }

    /**
     * Resources: {NotNull : BIT} <br />
     * @return The value of the column 'Resources'. (Nullable)
     */
    public Boolean getResources() {
        return _resources;
    }

    /**
     * Resources: {NotNull : BIT} <br />
     * @param resources The value of the column 'Resources'. (Nullable)
     */
    public void setResources(Boolean resources) {
        _modifiedProperties.addPropertyName("resources");
        this._resources = resources;
    }

    /**
     * Constraints: {NotNull : BIT} <br />
     * @return The value of the column 'Constraints'. (Nullable)
     */
    public Boolean getConstraints() {
        return _constraints;
    }

    /**
     * Constraints: {NotNull : BIT} <br />
     * @param constraints The value of the column 'Constraints'. (Nullable)
     */
    public void setConstraints(Boolean constraints) {
        _modifiedProperties.addPropertyName("constraints");
        this._constraints = constraints;
    }

    /**
     * Tagged: {NotNull : BIT} <br />
     * @return The value of the column 'Tagged'. (Nullable)
     */
    public Boolean getTagged() {
        return _tagged;
    }

    /**
     * Tagged: {NotNull : BIT} <br />
     * @param tagged The value of the column 'Tagged'. (Nullable)
     */
    public void setTagged(Boolean tagged) {
        _modifiedProperties.addPropertyName("tagged");
        this._tagged = tagged;
    }

    /**
     * ShowTag: {NotNull : BIT} <br />
     * @return The value of the column 'ShowTag'. (Nullable)
     */
    public Boolean getShowtag() {
        return _showtag;
    }

    /**
     * ShowTag: {NotNull : BIT} <br />
     * @param showtag The value of the column 'ShowTag'. (Nullable)
     */
    public void setShowtag(Boolean showtag) {
        _modifiedProperties.addPropertyName("showtag");
        this._showtag = showtag;
    }

    /**
     * ShowAlias: {NotNull : BIT} <br />
     * @return The value of the column 'ShowAlias'. (Nullable)
     */
    public Boolean getShowalias() {
        return _showalias;
    }

    /**
     * ShowAlias: {NotNull : BIT} <br />
     * @param showalias The value of the column 'ShowAlias'. (Nullable)
     */
    public void setShowalias(Boolean showalias) {
        _modifiedProperties.addPropertyName("showalias");
        this._showalias = showalias;
    }

    /**
     * PDATA1: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA1'. (Nullable)
     */
    public String getPdata1() {
        return _pdata1;
    }

    /**
     * PDATA1: {VARCHAR(255)} <br />
     * @param pdata1 The value of the column 'PDATA1'. (Nullable)
     */
    public void setPdata1(String pdata1) {
        _modifiedProperties.addPropertyName("pdata1");
        this._pdata1 = pdata1;
    }

    /**
     * PDATA2: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA2'. (Nullable)
     */
    public String getPdata2() {
        return _pdata2;
    }

    /**
     * PDATA2: {VARCHAR(255)} <br />
     * @param pdata2 The value of the column 'PDATA2'. (Nullable)
     */
    public void setPdata2(String pdata2) {
        _modifiedProperties.addPropertyName("pdata2");
        this._pdata2 = pdata2;
    }

    /**
     * PDATA3: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA3'. (Nullable)
     */
    public String getPdata3() {
        return _pdata3;
    }

    /**
     * PDATA3: {VARCHAR(255)} <br />
     * @param pdata3 The value of the column 'PDATA3'. (Nullable)
     */
    public void setPdata3(String pdata3) {
        _modifiedProperties.addPropertyName("pdata3");
        this._pdata3 = pdata3;
    }

    /**
     * PDATA4: {LONGCHAR(2147483647)} <br />
     * @return The value of the column 'PDATA4'. (Nullable)
     */
    public String getPdata4() {
        return _pdata4;
    }

    /**
     * PDATA4: {LONGCHAR(2147483647)} <br />
     * @param pdata4 The value of the column 'PDATA4'. (Nullable)
     */
    public void setPdata4(String pdata4) {
        _modifiedProperties.addPropertyName("pdata4");
        this._pdata4 = pdata4;
    }
}
