package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_rtfreport.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTRtfreportCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTRtfreportCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_rtfreport";
    }
    
    public String getTableSqlName() {
        return "t_rtfreport";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(200)}
     * @param templateid The value of templateid as equal.
     */
    public void setTemplateid_Equal(String templateid) {
        regTemplateid(CK_EQ, fRES(templateid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param templateid The value of templateid as notEqual.
     */
    public void setTemplateid_NotEqual(String templateid) {
        regTemplateid(CK_NE, fRES(templateid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param templateid The value of templateid as greaterThan.
     */
    public void setTemplateid_GreaterThan(String templateid) {
        regTemplateid(CK_GT, fRES(templateid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param templateid The value of templateid as lessThan.
     */
    public void setTemplateid_LessThan(String templateid) {
        regTemplateid(CK_LT, fRES(templateid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param templateid The value of templateid as greaterEqual.
     */
    public void setTemplateid_GreaterEqual(String templateid) {
        regTemplateid(CK_GE, fRES(templateid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param templateid The value of templateid as lessEqual.
     */
    public void setTemplateid_LessEqual(String templateid) {
        regTemplateid(CK_LE, fRES(templateid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param templateid The value of templateid as prefixSearch.
     */
    public void setTemplateid_PrefixSearch(String templateid) {
        regTemplateid(CK_PS, fRES(templateid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param templateid The value of templateid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTemplateid_LikeSearch(String templateid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(templateid), getCValueTemplateid(), "TemplateID", "Templateid", "templateid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param templateidList The collection of templateid as inScope.
     */
    public void setTemplateid_InScope(Collection<String> templateidList) {
        regTemplateid(CK_INS, cTL(templateidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param templateid The collection of templateid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTemplateid_InScope(String templateid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(templateid), getCValueTemplateid(), "TemplateID", "Templateid", "templateid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTemplateid_IsNull() { regTemplateid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTemplateid_IsNotNull() { regTemplateid(CK_ISNN, DUMMY_OBJECT); }

    protected void regTemplateid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTemplateid(), "TemplateID", "Templateid", "templateid");
    }
    protected void registerInlineTemplateid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTemplateid(), "TemplateID", "Templateid", "templateid");
    }
    abstract protected ConditionValue getCValueTemplateid();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param rootpackage The value of rootpackage as equal.
     */
    public void setRootpackage_Equal(java.lang.Integer rootpackage) {
        regRootpackage(CK_EQ, rootpackage);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param rootpackage The value of rootpackage as notEqual.
     */
    public void setRootpackage_NotEqual(java.lang.Integer rootpackage) {
        regRootpackage(CK_NE, rootpackage);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param rootpackage The value of rootpackage as greaterThan.
     */
    public void setRootpackage_GreaterThan(java.lang.Integer rootpackage) {
        regRootpackage(CK_GT, rootpackage);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param rootpackage The value of rootpackage as lessThan.
     */
    public void setRootpackage_LessThan(java.lang.Integer rootpackage) {
        regRootpackage(CK_LT, rootpackage);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param rootpackage The value of rootpackage as greaterEqual.
     */
    public void setRootpackage_GreaterEqual(java.lang.Integer rootpackage) {
        regRootpackage(CK_GE, rootpackage);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param rootpackage The value of rootpackage as lessEqual.
     */
    public void setRootpackage_LessEqual(java.lang.Integer rootpackage) {
        regRootpackage(CK_LE, rootpackage);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param rootpackageList The collection of rootpackage as inScope.
     */
    public void setRootpackage_InScope(Collection<java.lang.Integer> rootpackageList) {
        regRootpackage(CK_INS, cTL(rootpackageList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRootpackage_IsNull() { regRootpackage(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRootpackage_IsNotNull() { regRootpackage(CK_ISNN, DUMMY_OBJECT); }

    protected void regRootpackage(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRootpackage(), "RootPackage", "Rootpackage", "rootpackage");
    }
    protected void registerInlineRootpackage(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRootpackage(), "RootPackage", "Rootpackage", "rootpackage");
    }
    abstract protected ConditionValue getCValueRootpackage();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param filename The value of filename as equal.
     */
    public void setFilename_Equal(String filename) {
        regFilename(CK_EQ, fRES(filename));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param filename The value of filename as notEqual.
     */
    public void setFilename_NotEqual(String filename) {
        regFilename(CK_NE, fRES(filename));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param filename The value of filename as greaterThan.
     */
    public void setFilename_GreaterThan(String filename) {
        regFilename(CK_GT, fRES(filename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param filename The value of filename as lessThan.
     */
    public void setFilename_LessThan(String filename) {
        regFilename(CK_LT, fRES(filename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param filename The value of filename as greaterEqual.
     */
    public void setFilename_GreaterEqual(String filename) {
        regFilename(CK_GE, fRES(filename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param filename The value of filename as lessEqual.
     */
    public void setFilename_LessEqual(String filename) {
        regFilename(CK_LE, fRES(filename));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param filename The value of filename as prefixSearch.
     */
    public void setFilename_PrefixSearch(String filename) {
        regFilename(CK_PS, fRES(filename));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param filename The value of filename as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFilename_LikeSearch(String filename, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(filename), getCValueFilename(), "Filename", "Filename", "filename", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param filenameList The collection of filename as inScope.
     */
    public void setFilename_InScope(Collection<String> filenameList) {
        regFilename(CK_INS, cTL(filenameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param filename The collection of filename as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setFilename_InScope(String filename, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(filename), getCValueFilename(), "Filename", "Filename", "filename", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setFilename_IsNull() { regFilename(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setFilename_IsNotNull() { regFilename(CK_ISNN, DUMMY_OBJECT); }

    protected void regFilename(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueFilename(), "Filename", "Filename", "filename");
    }
    protected void registerInlineFilename(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueFilename(), "Filename", "Filename", "filename");
    }
    abstract protected ConditionValue getCValueFilename();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param details The value of details as equal.
     */
    public void setDetails_Equal(Boolean details) {
        regDetails(CK_EQ, details);
    }

    protected void regDetails(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDetails(), "Details", "Details", "details");
    }
    protected void registerInlineDetails(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDetails(), "Details", "Details", "details");
    }
    abstract protected ConditionValue getCValueDetails();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param processchildren The value of processchildren as equal.
     */
    public void setProcesschildren_Equal(Boolean processchildren) {
        regProcesschildren(CK_EQ, processchildren);
    }

    protected void regProcesschildren(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueProcesschildren(), "ProcessChildren", "Processchildren", "processchildren");
    }
    protected void registerInlineProcesschildren(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueProcesschildren(), "ProcessChildren", "Processchildren", "processchildren");
    }
    abstract protected ConditionValue getCValueProcesschildren();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param showdiagrams The value of showdiagrams as equal.
     */
    public void setShowdiagrams_Equal(Boolean showdiagrams) {
        regShowdiagrams(CK_EQ, showdiagrams);
    }

    protected void regShowdiagrams(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueShowdiagrams(), "ShowDiagrams", "Showdiagrams", "showdiagrams");
    }
    protected void registerInlineShowdiagrams(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueShowdiagrams(), "ShowDiagrams", "Showdiagrams", "showdiagrams");
    }
    abstract protected ConditionValue getCValueShowdiagrams();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param heading The value of heading as equal.
     */
    public void setHeading_Equal(String heading) {
        regHeading(CK_EQ, fRES(heading));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param heading The value of heading as notEqual.
     */
    public void setHeading_NotEqual(String heading) {
        regHeading(CK_NE, fRES(heading));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param heading The value of heading as greaterThan.
     */
    public void setHeading_GreaterThan(String heading) {
        regHeading(CK_GT, fRES(heading));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param heading The value of heading as lessThan.
     */
    public void setHeading_LessThan(String heading) {
        regHeading(CK_LT, fRES(heading));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param heading The value of heading as greaterEqual.
     */
    public void setHeading_GreaterEqual(String heading) {
        regHeading(CK_GE, fRES(heading));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param heading The value of heading as lessEqual.
     */
    public void setHeading_LessEqual(String heading) {
        regHeading(CK_LE, fRES(heading));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param heading The value of heading as prefixSearch.
     */
    public void setHeading_PrefixSearch(String heading) {
        regHeading(CK_PS, fRES(heading));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param heading The value of heading as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeading_LikeSearch(String heading, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(heading), getCValueHeading(), "Heading", "Heading", "heading", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param headingList The collection of heading as inScope.
     */
    public void setHeading_InScope(Collection<String> headingList) {
        regHeading(CK_INS, cTL(headingList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param heading The collection of heading as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setHeading_InScope(String heading, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(heading), getCValueHeading(), "Heading", "Heading", "heading", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setHeading_IsNull() { regHeading(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setHeading_IsNotNull() { regHeading(CK_ISNN, DUMMY_OBJECT); }

    protected void regHeading(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueHeading(), "Heading", "Heading", "heading");
    }
    protected void registerInlineHeading(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueHeading(), "Heading", "Heading", "heading");
    }
    abstract protected ConditionValue getCValueHeading();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param requirements The value of requirements as equal.
     */
    public void setRequirements_Equal(Boolean requirements) {
        regRequirements(CK_EQ, requirements);
    }

    protected void regRequirements(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRequirements(), "Requirements", "Requirements", "requirements");
    }
    protected void registerInlineRequirements(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRequirements(), "Requirements", "Requirements", "requirements");
    }
    abstract protected ConditionValue getCValueRequirements();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param associations The value of associations as equal.
     */
    public void setAssociations_Equal(Boolean associations) {
        regAssociations(CK_EQ, associations);
    }

    protected void regAssociations(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAssociations(), "Associations", "Associations", "associations");
    }
    protected void registerInlineAssociations(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAssociations(), "Associations", "Associations", "associations");
    }
    abstract protected ConditionValue getCValueAssociations();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param scenarios The value of scenarios as equal.
     */
    public void setScenarios_Equal(Boolean scenarios) {
        regScenarios(CK_EQ, scenarios);
    }

    protected void regScenarios(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueScenarios(), "Scenarios", "Scenarios", "scenarios");
    }
    protected void registerInlineScenarios(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueScenarios(), "Scenarios", "Scenarios", "scenarios");
    }
    abstract protected ConditionValue getCValueScenarios();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param childdiagrams The value of childdiagrams as equal.
     */
    public void setChilddiagrams_Equal(Boolean childdiagrams) {
        regChilddiagrams(CK_EQ, childdiagrams);
    }

    protected void regChilddiagrams(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueChilddiagrams(), "ChildDiagrams", "Childdiagrams", "childdiagrams");
    }
    protected void registerInlineChilddiagrams(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueChilddiagrams(), "ChildDiagrams", "Childdiagrams", "childdiagrams");
    }
    abstract protected ConditionValue getCValueChilddiagrams();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param attributes The value of attributes as equal.
     */
    public void setAttributes_Equal(Boolean attributes) {
        regAttributes(CK_EQ, attributes);
    }

    protected void regAttributes(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAttributes(), "Attributes", "Attributes", "attributes");
    }
    protected void registerInlineAttributes(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAttributes(), "Attributes", "Attributes", "attributes");
    }
    abstract protected ConditionValue getCValueAttributes();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param methods The value of methods as equal.
     */
    public void setMethods_Equal(Boolean methods) {
        regMethods(CK_EQ, methods);
    }

    protected void regMethods(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueMethods(), "Methods", "Methods", "methods");
    }
    protected void registerInlineMethods(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueMethods(), "Methods", "Methods", "methods");
    }
    abstract protected ConditionValue getCValueMethods();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param imagetype The value of imagetype as equal.
     */
    public void setImagetype_Equal(java.lang.Integer imagetype) {
        regImagetype(CK_EQ, imagetype);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param imagetype The value of imagetype as notEqual.
     */
    public void setImagetype_NotEqual(java.lang.Integer imagetype) {
        regImagetype(CK_NE, imagetype);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param imagetype The value of imagetype as greaterThan.
     */
    public void setImagetype_GreaterThan(java.lang.Integer imagetype) {
        regImagetype(CK_GT, imagetype);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param imagetype The value of imagetype as lessThan.
     */
    public void setImagetype_LessThan(java.lang.Integer imagetype) {
        regImagetype(CK_LT, imagetype);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param imagetype The value of imagetype as greaterEqual.
     */
    public void setImagetype_GreaterEqual(java.lang.Integer imagetype) {
        regImagetype(CK_GE, imagetype);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param imagetype The value of imagetype as lessEqual.
     */
    public void setImagetype_LessEqual(java.lang.Integer imagetype) {
        regImagetype(CK_LE, imagetype);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param imagetypeList The collection of imagetype as inScope.
     */
    public void setImagetype_InScope(Collection<java.lang.Integer> imagetypeList) {
        regImagetype(CK_INS, cTL(imagetypeList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setImagetype_IsNull() { regImagetype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setImagetype_IsNotNull() { regImagetype(CK_ISNN, DUMMY_OBJECT); }

    protected void regImagetype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueImagetype(), "ImageType", "Imagetype", "imagetype");
    }
    protected void registerInlineImagetype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueImagetype(), "ImageType", "Imagetype", "imagetype");
    }
    abstract protected ConditionValue getCValueImagetype();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param paging The value of paging as equal.
     */
    public void setPaging_Equal(Boolean paging) {
        regPaging(CK_EQ, paging);
    }

    protected void regPaging(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePaging(), "Paging", "Paging", "paging");
    }
    protected void registerInlinePaging(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePaging(), "Paging", "Paging", "paging");
    }
    abstract protected ConditionValue getCValuePaging();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param intro The value of intro as equal.
     */
    public void setIntro_Equal(String intro) {
        regIntro(CK_EQ, fRES(intro));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param intro The value of intro as notEqual.
     */
    public void setIntro_NotEqual(String intro) {
        regIntro(CK_NE, fRES(intro));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param intro The value of intro as greaterThan.
     */
    public void setIntro_GreaterThan(String intro) {
        regIntro(CK_GT, fRES(intro));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param intro The value of intro as lessThan.
     */
    public void setIntro_LessThan(String intro) {
        regIntro(CK_LT, fRES(intro));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param intro The value of intro as greaterEqual.
     */
    public void setIntro_GreaterEqual(String intro) {
        regIntro(CK_GE, fRES(intro));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param intro The value of intro as lessEqual.
     */
    public void setIntro_LessEqual(String intro) {
        regIntro(CK_LE, fRES(intro));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param intro The value of intro as prefixSearch.
     */
    public void setIntro_PrefixSearch(String intro) {
        regIntro(CK_PS, fRES(intro));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param intro The value of intro as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIntro_LikeSearch(String intro, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(intro), getCValueIntro(), "Intro", "Intro", "intro", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param introList The collection of intro as inScope.
     */
    public void setIntro_InScope(Collection<String> introList) {
        regIntro(CK_INS, cTL(introList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param intro The collection of intro as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setIntro_InScope(String intro, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(intro), getCValueIntro(), "Intro", "Intro", "intro", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setIntro_IsNull() { regIntro(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setIntro_IsNotNull() { regIntro(CK_ISNN, DUMMY_OBJECT); }

    protected void regIntro(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIntro(), "Intro", "Intro", "intro");
    }
    protected void registerInlineIntro(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIntro(), "Intro", "Intro", "intro");
    }
    abstract protected ConditionValue getCValueIntro();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param resources The value of resources as equal.
     */
    public void setResources_Equal(Boolean resources) {
        regResources(CK_EQ, resources);
    }

    protected void regResources(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueResources(), "Resources", "Resources", "resources");
    }
    protected void registerInlineResources(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueResources(), "Resources", "Resources", "resources");
    }
    abstract protected ConditionValue getCValueResources();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param constraints The value of constraints as equal.
     */
    public void setConstraints_Equal(Boolean constraints) {
        regConstraints(CK_EQ, constraints);
    }

    protected void regConstraints(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueConstraints(), "Constraints", "Constraints", "constraints");
    }
    protected void registerInlineConstraints(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueConstraints(), "Constraints", "Constraints", "constraints");
    }
    abstract protected ConditionValue getCValueConstraints();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param tagged The value of tagged as equal.
     */
    public void setTagged_Equal(Boolean tagged) {
        regTagged(CK_EQ, tagged);
    }

    protected void regTagged(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTagged(), "Tagged", "Tagged", "tagged");
    }
    protected void registerInlineTagged(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTagged(), "Tagged", "Tagged", "tagged");
    }
    abstract protected ConditionValue getCValueTagged();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param showtag The value of showtag as equal.
     */
    public void setShowtag_Equal(Boolean showtag) {
        regShowtag(CK_EQ, showtag);
    }

    protected void regShowtag(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueShowtag(), "ShowTag", "Showtag", "showtag");
    }
    protected void registerInlineShowtag(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueShowtag(), "ShowTag", "Showtag", "showtag");
    }
    abstract protected ConditionValue getCValueShowtag();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param showalias The value of showalias as equal.
     */
    public void setShowalias_Equal(Boolean showalias) {
        regShowalias(CK_EQ, showalias);
    }

    protected void regShowalias(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueShowalias(), "ShowAlias", "Showalias", "showalias");
    }
    protected void registerInlineShowalias(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueShowalias(), "ShowAlias", "Showalias", "showalias");
    }
    abstract protected ConditionValue getCValueShowalias();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata1 The value of pdata1 as equal.
     */
    public void setPdata1_Equal(String pdata1) {
        regPdata1(CK_EQ, fRES(pdata1));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as notEqual.
     */
    public void setPdata1_NotEqual(String pdata1) {
        regPdata1(CK_NE, fRES(pdata1));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as greaterThan.
     */
    public void setPdata1_GreaterThan(String pdata1) {
        regPdata1(CK_GT, fRES(pdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as lessThan.
     */
    public void setPdata1_LessThan(String pdata1) {
        regPdata1(CK_LT, fRES(pdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as greaterEqual.
     */
    public void setPdata1_GreaterEqual(String pdata1) {
        regPdata1(CK_GE, fRES(pdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as lessEqual.
     */
    public void setPdata1_LessEqual(String pdata1) {
        regPdata1(CK_LE, fRES(pdata1));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as prefixSearch.
     */
    public void setPdata1_PrefixSearch(String pdata1) {
        regPdata1(CK_PS, fRES(pdata1));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata1 The value of pdata1 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata1_LikeSearch(String pdata1, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata1), getCValuePdata1(), "PDATA1", "Pdata1", "pdata1", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata1List The collection of pdata1 as inScope.
     */
    public void setPdata1_InScope(Collection<String> pdata1List) {
        regPdata1(CK_INS, cTL(pdata1List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata1 The collection of pdata1 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata1_InScope(String pdata1, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata1), getCValuePdata1(), "PDATA1", "Pdata1", "pdata1", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata1_IsNull() { regPdata1(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata1_IsNotNull() { regPdata1(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata1(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata1(), "PDATA1", "Pdata1", "pdata1");
    }
    protected void registerInlinePdata1(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata1(), "PDATA1", "Pdata1", "pdata1");
    }
    abstract protected ConditionValue getCValuePdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata2 The value of pdata2 as equal.
     */
    public void setPdata2_Equal(String pdata2) {
        regPdata2(CK_EQ, fRES(pdata2));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as notEqual.
     */
    public void setPdata2_NotEqual(String pdata2) {
        regPdata2(CK_NE, fRES(pdata2));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as greaterThan.
     */
    public void setPdata2_GreaterThan(String pdata2) {
        regPdata2(CK_GT, fRES(pdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as lessThan.
     */
    public void setPdata2_LessThan(String pdata2) {
        regPdata2(CK_LT, fRES(pdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as greaterEqual.
     */
    public void setPdata2_GreaterEqual(String pdata2) {
        regPdata2(CK_GE, fRES(pdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as lessEqual.
     */
    public void setPdata2_LessEqual(String pdata2) {
        regPdata2(CK_LE, fRES(pdata2));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as prefixSearch.
     */
    public void setPdata2_PrefixSearch(String pdata2) {
        regPdata2(CK_PS, fRES(pdata2));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata2 The value of pdata2 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata2_LikeSearch(String pdata2, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata2), getCValuePdata2(), "PDATA2", "Pdata2", "pdata2", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata2List The collection of pdata2 as inScope.
     */
    public void setPdata2_InScope(Collection<String> pdata2List) {
        regPdata2(CK_INS, cTL(pdata2List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata2 The collection of pdata2 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata2_InScope(String pdata2, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata2), getCValuePdata2(), "PDATA2", "Pdata2", "pdata2", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata2_IsNull() { regPdata2(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata2_IsNotNull() { regPdata2(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata2(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata2(), "PDATA2", "Pdata2", "pdata2");
    }
    protected void registerInlinePdata2(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata2(), "PDATA2", "Pdata2", "pdata2");
    }
    abstract protected ConditionValue getCValuePdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata3 The value of pdata3 as equal.
     */
    public void setPdata3_Equal(String pdata3) {
        regPdata3(CK_EQ, fRES(pdata3));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as notEqual.
     */
    public void setPdata3_NotEqual(String pdata3) {
        regPdata3(CK_NE, fRES(pdata3));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as greaterThan.
     */
    public void setPdata3_GreaterThan(String pdata3) {
        regPdata3(CK_GT, fRES(pdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as lessThan.
     */
    public void setPdata3_LessThan(String pdata3) {
        regPdata3(CK_LT, fRES(pdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as greaterEqual.
     */
    public void setPdata3_GreaterEqual(String pdata3) {
        regPdata3(CK_GE, fRES(pdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as lessEqual.
     */
    public void setPdata3_LessEqual(String pdata3) {
        regPdata3(CK_LE, fRES(pdata3));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as prefixSearch.
     */
    public void setPdata3_PrefixSearch(String pdata3) {
        regPdata3(CK_PS, fRES(pdata3));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata3 The value of pdata3 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata3_LikeSearch(String pdata3, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata3), getCValuePdata3(), "PDATA3", "Pdata3", "pdata3", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata3List The collection of pdata3 as inScope.
     */
    public void setPdata3_InScope(Collection<String> pdata3List) {
        regPdata3(CK_INS, cTL(pdata3List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata3 The collection of pdata3 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata3_InScope(String pdata3, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata3), getCValuePdata3(), "PDATA3", "Pdata3", "pdata3", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata3_IsNull() { regPdata3(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata3_IsNotNull() { regPdata3(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata3(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata3(), "PDATA3", "Pdata3", "pdata3");
    }
    protected void registerInlinePdata3(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata3(), "PDATA3", "Pdata3", "pdata3");
    }
    abstract protected ConditionValue getCValuePdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param pdata4 The value of pdata4 as equal.
     */
    public void setPdata4_Equal(String pdata4) {
        regPdata4(CK_EQ, fRES(pdata4));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as notEqual.
     */
    public void setPdata4_NotEqual(String pdata4) {
        regPdata4(CK_NE, fRES(pdata4));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as greaterThan.
     */
    public void setPdata4_GreaterThan(String pdata4) {
        regPdata4(CK_GT, fRES(pdata4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as lessThan.
     */
    public void setPdata4_LessThan(String pdata4) {
        regPdata4(CK_LT, fRES(pdata4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as greaterEqual.
     */
    public void setPdata4_GreaterEqual(String pdata4) {
        regPdata4(CK_GE, fRES(pdata4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as lessEqual.
     */
    public void setPdata4_LessEqual(String pdata4) {
        regPdata4(CK_LE, fRES(pdata4));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as prefixSearch.
     */
    public void setPdata4_PrefixSearch(String pdata4) {
        regPdata4(CK_PS, fRES(pdata4));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata4 The value of pdata4 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata4_LikeSearch(String pdata4, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata4), getCValuePdata4(), "PDATA4", "Pdata4", "pdata4", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata4List The collection of pdata4 as inScope.
     */
    public void setPdata4_InScope(Collection<String> pdata4List) {
        regPdata4(CK_INS, cTL(pdata4List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata4 The collection of pdata4 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata4_InScope(String pdata4, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata4), getCValuePdata4(), "PDATA4", "Pdata4", "pdata4", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata4_IsNull() { regPdata4(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata4_IsNotNull() { regPdata4(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata4(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata4(), "PDATA4", "Pdata4", "pdata4");
    }
    protected void registerInlinePdata4(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata4(), "PDATA4", "Pdata4", "pdata4");
    }
    abstract protected ConditionValue getCValuePdata4();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TRtfreportCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TRtfreportCQ.class.getName(); }
}
