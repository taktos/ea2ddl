package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_diagram.
 * @author DBFlute(AutoGenerator)
 */
public class BsTDiagramCQ extends AbstractBsTDiagramCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TDiagramCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTDiagramCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_diagram) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TDiagramCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TDiagramCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_diagram on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TDiagramCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TDiagramCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _diagramId;
    public ConditionValue getDiagramId() {
        if (_diagramId == null) { _diagramId = new ConditionValue(); }
        return _diagramId;
    }
    protected ConditionValue getCValueDiagramId() { return getDiagramId(); }

    public BsTDiagramCQ addOrderBy_DiagramId_Asc() { regOBA("Diagram_ID"); return this; }
    public BsTDiagramCQ addOrderBy_DiagramId_Desc() { regOBD("Diagram_ID"); return this; }

    protected ConditionValue _packageId;
    public ConditionValue getPackageId() {
        if (_packageId == null) { _packageId = new ConditionValue(); }
        return _packageId;
    }
    protected ConditionValue getCValuePackageId() { return getPackageId(); }

    public BsTDiagramCQ addOrderBy_PackageId_Asc() { regOBA("Package_ID"); return this; }
    public BsTDiagramCQ addOrderBy_PackageId_Desc() { regOBD("Package_ID"); return this; }

    protected ConditionValue _parentid;
    public ConditionValue getParentid() {
        if (_parentid == null) { _parentid = new ConditionValue(); }
        return _parentid;
    }
    protected ConditionValue getCValueParentid() { return getParentid(); }

    public BsTDiagramCQ addOrderBy_Parentid_Asc() { regOBA("ParentID"); return this; }
    public BsTDiagramCQ addOrderBy_Parentid_Desc() { regOBD("ParentID"); return this; }

    protected ConditionValue _diagramType;
    public ConditionValue getDiagramType() {
        if (_diagramType == null) { _diagramType = new ConditionValue(); }
        return _diagramType;
    }
    protected ConditionValue getCValueDiagramType() { return getDiagramType(); }

    public BsTDiagramCQ addOrderBy_DiagramType_Asc() { regOBA("Diagram_Type"); return this; }
    public BsTDiagramCQ addOrderBy_DiagramType_Desc() { regOBD("Diagram_Type"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    public BsTDiagramCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTDiagramCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _version;
    public ConditionValue getVersion() {
        if (_version == null) { _version = new ConditionValue(); }
        return _version;
    }
    protected ConditionValue getCValueVersion() { return getVersion(); }

    public BsTDiagramCQ addOrderBy_Version_Asc() { regOBA("Version"); return this; }
    public BsTDiagramCQ addOrderBy_Version_Desc() { regOBD("Version"); return this; }

    protected ConditionValue _author;
    public ConditionValue getAuthor() {
        if (_author == null) { _author = new ConditionValue(); }
        return _author;
    }
    protected ConditionValue getCValueAuthor() { return getAuthor(); }

    public BsTDiagramCQ addOrderBy_Author_Asc() { regOBA("Author"); return this; }
    public BsTDiagramCQ addOrderBy_Author_Desc() { regOBD("Author"); return this; }

    protected ConditionValue _showdetails;
    public ConditionValue getShowdetails() {
        if (_showdetails == null) { _showdetails = new ConditionValue(); }
        return _showdetails;
    }
    protected ConditionValue getCValueShowdetails() { return getShowdetails(); }

    public BsTDiagramCQ addOrderBy_Showdetails_Asc() { regOBA("ShowDetails"); return this; }
    public BsTDiagramCQ addOrderBy_Showdetails_Desc() { regOBD("ShowDetails"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTDiagramCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTDiagramCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _stereotype;
    public ConditionValue getStereotype() {
        if (_stereotype == null) { _stereotype = new ConditionValue(); }
        return _stereotype;
    }
    protected ConditionValue getCValueStereotype() { return getStereotype(); }

    public BsTDiagramCQ addOrderBy_Stereotype_Asc() { regOBA("Stereotype"); return this; }
    public BsTDiagramCQ addOrderBy_Stereotype_Desc() { regOBD("Stereotype"); return this; }

    protected ConditionValue _attpub;
    public ConditionValue getAttpub() {
        if (_attpub == null) { _attpub = new ConditionValue(); }
        return _attpub;
    }
    protected ConditionValue getCValueAttpub() { return getAttpub(); }

    public BsTDiagramCQ addOrderBy_Attpub_Asc() { regOBA("AttPub"); return this; }
    public BsTDiagramCQ addOrderBy_Attpub_Desc() { regOBD("AttPub"); return this; }

    protected ConditionValue _attpri;
    public ConditionValue getAttpri() {
        if (_attpri == null) { _attpri = new ConditionValue(); }
        return _attpri;
    }
    protected ConditionValue getCValueAttpri() { return getAttpri(); }

    public BsTDiagramCQ addOrderBy_Attpri_Asc() { regOBA("AttPri"); return this; }
    public BsTDiagramCQ addOrderBy_Attpri_Desc() { regOBD("AttPri"); return this; }

    protected ConditionValue _attpro;
    public ConditionValue getAttpro() {
        if (_attpro == null) { _attpro = new ConditionValue(); }
        return _attpro;
    }
    protected ConditionValue getCValueAttpro() { return getAttpro(); }

    public BsTDiagramCQ addOrderBy_Attpro_Asc() { regOBA("AttPro"); return this; }
    public BsTDiagramCQ addOrderBy_Attpro_Desc() { regOBD("AttPro"); return this; }

    protected ConditionValue _orientation;
    public ConditionValue getOrientation() {
        if (_orientation == null) { _orientation = new ConditionValue(); }
        return _orientation;
    }
    protected ConditionValue getCValueOrientation() { return getOrientation(); }

    public BsTDiagramCQ addOrderBy_Orientation_Asc() { regOBA("Orientation"); return this; }
    public BsTDiagramCQ addOrderBy_Orientation_Desc() { regOBD("Orientation"); return this; }

    protected ConditionValue _cx;
    public ConditionValue getCx() {
        if (_cx == null) { _cx = new ConditionValue(); }
        return _cx;
    }
    protected ConditionValue getCValueCx() { return getCx(); }

    public BsTDiagramCQ addOrderBy_Cx_Asc() { regOBA("cx"); return this; }
    public BsTDiagramCQ addOrderBy_Cx_Desc() { regOBD("cx"); return this; }

    protected ConditionValue _cy;
    public ConditionValue getCy() {
        if (_cy == null) { _cy = new ConditionValue(); }
        return _cy;
    }
    protected ConditionValue getCValueCy() { return getCy(); }

    public BsTDiagramCQ addOrderBy_Cy_Asc() { regOBA("cy"); return this; }
    public BsTDiagramCQ addOrderBy_Cy_Desc() { regOBD("cy"); return this; }

    protected ConditionValue _scale;
    public ConditionValue getScale() {
        if (_scale == null) { _scale = new ConditionValue(); }
        return _scale;
    }
    protected ConditionValue getCValueScale() { return getScale(); }

    public BsTDiagramCQ addOrderBy_Scale_Asc() { regOBA("Scale"); return this; }
    public BsTDiagramCQ addOrderBy_Scale_Desc() { regOBD("Scale"); return this; }

    protected ConditionValue _createddate;
    public ConditionValue getCreateddate() {
        if (_createddate == null) { _createddate = new ConditionValue(); }
        return _createddate;
    }
    protected ConditionValue getCValueCreateddate() { return getCreateddate(); }

    public BsTDiagramCQ addOrderBy_Createddate_Asc() { regOBA("CreatedDate"); return this; }
    public BsTDiagramCQ addOrderBy_Createddate_Desc() { regOBD("CreatedDate"); return this; }

    protected ConditionValue _modifieddate;
    public ConditionValue getModifieddate() {
        if (_modifieddate == null) { _modifieddate = new ConditionValue(); }
        return _modifieddate;
    }
    protected ConditionValue getCValueModifieddate() { return getModifieddate(); }

    public BsTDiagramCQ addOrderBy_Modifieddate_Asc() { regOBA("ModifiedDate"); return this; }
    public BsTDiagramCQ addOrderBy_Modifieddate_Desc() { regOBD("ModifiedDate"); return this; }

    protected ConditionValue _htmlpath;
    public ConditionValue getHtmlpath() {
        if (_htmlpath == null) { _htmlpath = new ConditionValue(); }
        return _htmlpath;
    }
    protected ConditionValue getCValueHtmlpath() { return getHtmlpath(); }

    public BsTDiagramCQ addOrderBy_Htmlpath_Asc() { regOBA("HTMLPath"); return this; }
    public BsTDiagramCQ addOrderBy_Htmlpath_Desc() { regOBD("HTMLPath"); return this; }

    protected ConditionValue _showforeign;
    public ConditionValue getShowforeign() {
        if (_showforeign == null) { _showforeign = new ConditionValue(); }
        return _showforeign;
    }
    protected ConditionValue getCValueShowforeign() { return getShowforeign(); }

    public BsTDiagramCQ addOrderBy_Showforeign_Asc() { regOBA("ShowForeign"); return this; }
    public BsTDiagramCQ addOrderBy_Showforeign_Desc() { regOBD("ShowForeign"); return this; }

    protected ConditionValue _showborder;
    public ConditionValue getShowborder() {
        if (_showborder == null) { _showborder = new ConditionValue(); }
        return _showborder;
    }
    protected ConditionValue getCValueShowborder() { return getShowborder(); }

    public BsTDiagramCQ addOrderBy_Showborder_Asc() { regOBA("ShowBorder"); return this; }
    public BsTDiagramCQ addOrderBy_Showborder_Desc() { regOBD("ShowBorder"); return this; }

    protected ConditionValue _showpackagecontents;
    public ConditionValue getShowpackagecontents() {
        if (_showpackagecontents == null) { _showpackagecontents = new ConditionValue(); }
        return _showpackagecontents;
    }
    protected ConditionValue getCValueShowpackagecontents() { return getShowpackagecontents(); }

    public BsTDiagramCQ addOrderBy_Showpackagecontents_Asc() { regOBA("ShowPackageContents"); return this; }
    public BsTDiagramCQ addOrderBy_Showpackagecontents_Desc() { regOBD("ShowPackageContents"); return this; }

    protected ConditionValue _pdata;
    public ConditionValue getPdata() {
        if (_pdata == null) { _pdata = new ConditionValue(); }
        return _pdata;
    }
    protected ConditionValue getCValuePdata() { return getPdata(); }

    public BsTDiagramCQ addOrderBy_Pdata_Asc() { regOBA("PDATA"); return this; }
    public BsTDiagramCQ addOrderBy_Pdata_Desc() { regOBD("PDATA"); return this; }

    protected ConditionValue _locked;
    public ConditionValue getLocked() {
        if (_locked == null) { _locked = new ConditionValue(); }
        return _locked;
    }
    protected ConditionValue getCValueLocked() { return getLocked(); }

    public BsTDiagramCQ addOrderBy_Locked_Asc() { regOBA("Locked"); return this; }
    public BsTDiagramCQ addOrderBy_Locked_Desc() { regOBD("Locked"); return this; }

    protected ConditionValue _eaGuid;
    public ConditionValue getEaGuid() {
        if (_eaGuid == null) { _eaGuid = new ConditionValue(); }
        return _eaGuid;
    }
    protected ConditionValue getCValueEaGuid() { return getEaGuid(); }

    public BsTDiagramCQ addOrderBy_EaGuid_Asc() { regOBA("ea_guid"); return this; }
    public BsTDiagramCQ addOrderBy_EaGuid_Desc() { regOBD("ea_guid"); return this; }

    protected ConditionValue _tpos;
    public ConditionValue getTpos() {
        if (_tpos == null) { _tpos = new ConditionValue(); }
        return _tpos;
    }
    protected ConditionValue getCValueTpos() { return getTpos(); }

    public BsTDiagramCQ addOrderBy_Tpos_Asc() { regOBA("TPos"); return this; }
    public BsTDiagramCQ addOrderBy_Tpos_Desc() { regOBD("TPos"); return this; }

    protected ConditionValue _swimlanes;
    public ConditionValue getSwimlanes() {
        if (_swimlanes == null) { _swimlanes = new ConditionValue(); }
        return _swimlanes;
    }
    protected ConditionValue getCValueSwimlanes() { return getSwimlanes(); }

    public BsTDiagramCQ addOrderBy_Swimlanes_Asc() { regOBA("Swimlanes"); return this; }
    public BsTDiagramCQ addOrderBy_Swimlanes_Desc() { regOBD("Swimlanes"); return this; }

    protected ConditionValue _styleex;
    public ConditionValue getStyleex() {
        if (_styleex == null) { _styleex = new ConditionValue(); }
        return _styleex;
    }
    protected ConditionValue getCValueStyleex() { return getStyleex(); }

    public BsTDiagramCQ addOrderBy_Styleex_Asc() { regOBA("StyleEx"); return this; }
    public BsTDiagramCQ addOrderBy_Styleex_Desc() { regOBD("StyleEx"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTDiagramCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTDiagramCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TDiagramCB.class.getName(); }
    String xCQ() { return TDiagramCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
