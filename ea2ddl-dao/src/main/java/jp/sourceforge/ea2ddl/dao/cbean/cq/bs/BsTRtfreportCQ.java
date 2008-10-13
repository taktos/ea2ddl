package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_rtfreport.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTRtfreportCQ extends AbstractBsTRtfreportCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TRtfreportCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTRtfreportCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_rtfreport) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TRtfreportCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TRtfreportCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_rtfreport on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TRtfreportCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TRtfreportCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _templateid;
    public ConditionValue getTemplateid() {
        if (_templateid == null) { _templateid = new ConditionValue(); }
        return _templateid;
    }
    protected ConditionValue getCValueTemplateid() { return getTemplateid(); }
    
    public BsTRtfreportCQ addOrderBy_Templateid_Asc() { regOBA("TemplateID"); return this; }
    public BsTRtfreportCQ addOrderBy_Templateid_Desc() { regOBD("TemplateID"); return this; }

    protected ConditionValue _rootpackage;
    public ConditionValue getRootpackage() {
        if (_rootpackage == null) { _rootpackage = new ConditionValue(); }
        return _rootpackage;
    }
    protected ConditionValue getCValueRootpackage() { return getRootpackage(); }
          
    public BsTRtfreportCQ addOrderBy_Rootpackage_Asc() { regOBA("RootPackage"); return this; }
    public BsTRtfreportCQ addOrderBy_Rootpackage_Desc() { regOBD("RootPackage"); return this; }

    protected ConditionValue _filename;
    public ConditionValue getFilename() {
        if (_filename == null) { _filename = new ConditionValue(); }
        return _filename;
    }
    protected ConditionValue getCValueFilename() { return getFilename(); }
    
    public BsTRtfreportCQ addOrderBy_Filename_Asc() { regOBA("Filename"); return this; }
    public BsTRtfreportCQ addOrderBy_Filename_Desc() { regOBD("Filename"); return this; }

    protected ConditionValue _details;
    public ConditionValue getDetails() {
        if (_details == null) { _details = new ConditionValue(); }
        return _details;
    }
    protected ConditionValue getCValueDetails() { return getDetails(); }
    
    public BsTRtfreportCQ addOrderBy_Details_Asc() { regOBA("Details"); return this; }
    public BsTRtfreportCQ addOrderBy_Details_Desc() { regOBD("Details"); return this; }

    protected ConditionValue _processchildren;
    public ConditionValue getProcesschildren() {
        if (_processchildren == null) { _processchildren = new ConditionValue(); }
        return _processchildren;
    }
    protected ConditionValue getCValueProcesschildren() { return getProcesschildren(); }
    
    public BsTRtfreportCQ addOrderBy_Processchildren_Asc() { regOBA("ProcessChildren"); return this; }
    public BsTRtfreportCQ addOrderBy_Processchildren_Desc() { regOBD("ProcessChildren"); return this; }

    protected ConditionValue _showdiagrams;
    public ConditionValue getShowdiagrams() {
        if (_showdiagrams == null) { _showdiagrams = new ConditionValue(); }
        return _showdiagrams;
    }
    protected ConditionValue getCValueShowdiagrams() { return getShowdiagrams(); }
    
    public BsTRtfreportCQ addOrderBy_Showdiagrams_Asc() { regOBA("ShowDiagrams"); return this; }
    public BsTRtfreportCQ addOrderBy_Showdiagrams_Desc() { regOBD("ShowDiagrams"); return this; }

    protected ConditionValue _heading;
    public ConditionValue getHeading() {
        if (_heading == null) { _heading = new ConditionValue(); }
        return _heading;
    }
    protected ConditionValue getCValueHeading() { return getHeading(); }
    
    public BsTRtfreportCQ addOrderBy_Heading_Asc() { regOBA("Heading"); return this; }
    public BsTRtfreportCQ addOrderBy_Heading_Desc() { regOBD("Heading"); return this; }

    protected ConditionValue _requirements;
    public ConditionValue getRequirements() {
        if (_requirements == null) { _requirements = new ConditionValue(); }
        return _requirements;
    }
    protected ConditionValue getCValueRequirements() { return getRequirements(); }
    
    public BsTRtfreportCQ addOrderBy_Requirements_Asc() { regOBA("Requirements"); return this; }
    public BsTRtfreportCQ addOrderBy_Requirements_Desc() { regOBD("Requirements"); return this; }

    protected ConditionValue _associations;
    public ConditionValue getAssociations() {
        if (_associations == null) { _associations = new ConditionValue(); }
        return _associations;
    }
    protected ConditionValue getCValueAssociations() { return getAssociations(); }
    
    public BsTRtfreportCQ addOrderBy_Associations_Asc() { regOBA("Associations"); return this; }
    public BsTRtfreportCQ addOrderBy_Associations_Desc() { regOBD("Associations"); return this; }

    protected ConditionValue _scenarios;
    public ConditionValue getScenarios() {
        if (_scenarios == null) { _scenarios = new ConditionValue(); }
        return _scenarios;
    }
    protected ConditionValue getCValueScenarios() { return getScenarios(); }
    
    public BsTRtfreportCQ addOrderBy_Scenarios_Asc() { regOBA("Scenarios"); return this; }
    public BsTRtfreportCQ addOrderBy_Scenarios_Desc() { regOBD("Scenarios"); return this; }

    protected ConditionValue _childdiagrams;
    public ConditionValue getChilddiagrams() {
        if (_childdiagrams == null) { _childdiagrams = new ConditionValue(); }
        return _childdiagrams;
    }
    protected ConditionValue getCValueChilddiagrams() { return getChilddiagrams(); }
    
    public BsTRtfreportCQ addOrderBy_Childdiagrams_Asc() { regOBA("ChildDiagrams"); return this; }
    public BsTRtfreportCQ addOrderBy_Childdiagrams_Desc() { regOBD("ChildDiagrams"); return this; }

    protected ConditionValue _attributes;
    public ConditionValue getAttributes() {
        if (_attributes == null) { _attributes = new ConditionValue(); }
        return _attributes;
    }
    protected ConditionValue getCValueAttributes() { return getAttributes(); }
    
    public BsTRtfreportCQ addOrderBy_Attributes_Asc() { regOBA("Attributes"); return this; }
    public BsTRtfreportCQ addOrderBy_Attributes_Desc() { regOBD("Attributes"); return this; }

    protected ConditionValue _methods;
    public ConditionValue getMethods() {
        if (_methods == null) { _methods = new ConditionValue(); }
        return _methods;
    }
    protected ConditionValue getCValueMethods() { return getMethods(); }
    
    public BsTRtfreportCQ addOrderBy_Methods_Asc() { regOBA("Methods"); return this; }
    public BsTRtfreportCQ addOrderBy_Methods_Desc() { regOBD("Methods"); return this; }

    protected ConditionValue _imagetype;
    public ConditionValue getImagetype() {
        if (_imagetype == null) { _imagetype = new ConditionValue(); }
        return _imagetype;
    }
    protected ConditionValue getCValueImagetype() { return getImagetype(); }
          
    public BsTRtfreportCQ addOrderBy_Imagetype_Asc() { regOBA("ImageType"); return this; }
    public BsTRtfreportCQ addOrderBy_Imagetype_Desc() { regOBD("ImageType"); return this; }

    protected ConditionValue _paging;
    public ConditionValue getPaging() {
        if (_paging == null) { _paging = new ConditionValue(); }
        return _paging;
    }
    protected ConditionValue getCValuePaging() { return getPaging(); }
    
    public BsTRtfreportCQ addOrderBy_Paging_Asc() { regOBA("Paging"); return this; }
    public BsTRtfreportCQ addOrderBy_Paging_Desc() { regOBD("Paging"); return this; }

    protected ConditionValue _intro;
    public ConditionValue getIntro() {
        if (_intro == null) { _intro = new ConditionValue(); }
        return _intro;
    }
    protected ConditionValue getCValueIntro() { return getIntro(); }
    
    public BsTRtfreportCQ addOrderBy_Intro_Asc() { regOBA("Intro"); return this; }
    public BsTRtfreportCQ addOrderBy_Intro_Desc() { regOBD("Intro"); return this; }

    protected ConditionValue _resources;
    public ConditionValue getResources() {
        if (_resources == null) { _resources = new ConditionValue(); }
        return _resources;
    }
    protected ConditionValue getCValueResources() { return getResources(); }
    
    public BsTRtfreportCQ addOrderBy_Resources_Asc() { regOBA("Resources"); return this; }
    public BsTRtfreportCQ addOrderBy_Resources_Desc() { regOBD("Resources"); return this; }

    protected ConditionValue _constraints;
    public ConditionValue getConstraints() {
        if (_constraints == null) { _constraints = new ConditionValue(); }
        return _constraints;
    }
    protected ConditionValue getCValueConstraints() { return getConstraints(); }
    
    public BsTRtfreportCQ addOrderBy_Constraints_Asc() { regOBA("Constraints"); return this; }
    public BsTRtfreportCQ addOrderBy_Constraints_Desc() { regOBD("Constraints"); return this; }

    protected ConditionValue _tagged;
    public ConditionValue getTagged() {
        if (_tagged == null) { _tagged = new ConditionValue(); }
        return _tagged;
    }
    protected ConditionValue getCValueTagged() { return getTagged(); }
    
    public BsTRtfreportCQ addOrderBy_Tagged_Asc() { regOBA("Tagged"); return this; }
    public BsTRtfreportCQ addOrderBy_Tagged_Desc() { regOBD("Tagged"); return this; }

    protected ConditionValue _showtag;
    public ConditionValue getShowtag() {
        if (_showtag == null) { _showtag = new ConditionValue(); }
        return _showtag;
    }
    protected ConditionValue getCValueShowtag() { return getShowtag(); }
    
    public BsTRtfreportCQ addOrderBy_Showtag_Asc() { regOBA("ShowTag"); return this; }
    public BsTRtfreportCQ addOrderBy_Showtag_Desc() { regOBD("ShowTag"); return this; }

    protected ConditionValue _showalias;
    public ConditionValue getShowalias() {
        if (_showalias == null) { _showalias = new ConditionValue(); }
        return _showalias;
    }
    protected ConditionValue getCValueShowalias() { return getShowalias(); }
    
    public BsTRtfreportCQ addOrderBy_Showalias_Asc() { regOBA("ShowAlias"); return this; }
    public BsTRtfreportCQ addOrderBy_Showalias_Desc() { regOBD("ShowAlias"); return this; }

    protected ConditionValue _pdata1;
    public ConditionValue getPdata1() {
        if (_pdata1 == null) { _pdata1 = new ConditionValue(); }
        return _pdata1;
    }
    protected ConditionValue getCValuePdata1() { return getPdata1(); }
    
    public BsTRtfreportCQ addOrderBy_Pdata1_Asc() { regOBA("PDATA1"); return this; }
    public BsTRtfreportCQ addOrderBy_Pdata1_Desc() { regOBD("PDATA1"); return this; }

    protected ConditionValue _pdata2;
    public ConditionValue getPdata2() {
        if (_pdata2 == null) { _pdata2 = new ConditionValue(); }
        return _pdata2;
    }
    protected ConditionValue getCValuePdata2() { return getPdata2(); }
    
    public BsTRtfreportCQ addOrderBy_Pdata2_Asc() { regOBA("PDATA2"); return this; }
    public BsTRtfreportCQ addOrderBy_Pdata2_Desc() { regOBD("PDATA2"); return this; }

    protected ConditionValue _pdata3;
    public ConditionValue getPdata3() {
        if (_pdata3 == null) { _pdata3 = new ConditionValue(); }
        return _pdata3;
    }
    protected ConditionValue getCValuePdata3() { return getPdata3(); }
    
    public BsTRtfreportCQ addOrderBy_Pdata3_Asc() { regOBA("PDATA3"); return this; }
    public BsTRtfreportCQ addOrderBy_Pdata3_Desc() { regOBD("PDATA3"); return this; }

    protected ConditionValue _pdata4;
    public ConditionValue getPdata4() {
        if (_pdata4 == null) { _pdata4 = new ConditionValue(); }
        return _pdata4;
    }
    protected ConditionValue getCValuePdata4() { return getPdata4(); }
    
    public BsTRtfreportCQ addOrderBy_Pdata4_Asc() { regOBA("PDATA4"); return this; }
    public BsTRtfreportCQ addOrderBy_Pdata4_Desc() { regOBD("PDATA4"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTRtfreportCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTRtfreportCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TRtfreportCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
