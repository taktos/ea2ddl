package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import jp.sourceforge.ea2ddl.dao.allcommon.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_rtfreport.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTRtfreportCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTRtfreportCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return _dbmetaProvider;
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(200)}
     * @param templateid The value of templateid as equal.
     */
    public void setTemplateid_Equal(String templateid) {
        regTemplateid(CK_EQ, fRES(templateid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templateid The value of templateid as notEqual.
     */
    public void setTemplateid_NotEqual(String templateid) {
        regTemplateid(CK_NE, fRES(templateid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templateid The value of templateid as greaterThan.
     */
    public void setTemplateid_GreaterThan(String templateid) {
        regTemplateid(CK_GT, fRES(templateid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templateid The value of templateid as lessThan.
     */
    public void setTemplateid_LessThan(String templateid) {
        regTemplateid(CK_LT, fRES(templateid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templateid The value of templateid as greaterEqual.
     */
    public void setTemplateid_GreaterEqual(String templateid) {
        regTemplateid(CK_GE, fRES(templateid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templateid The value of templateid as lessEqual.
     */
    public void setTemplateid_LessEqual(String templateid) {
        regTemplateid(CK_LE, fRES(templateid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templateid The value of templateid as prefixSearch.
     */
    public void setTemplateid_PrefixSearch(String templateid) {
        regTemplateid(CK_PS, fRES(templateid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param templateidList The collection of templateid as inScope.
     */
    public void setTemplateid_InScope(Collection<String> templateidList) {
        regTemplateid(CK_INS, cTL(templateidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param templateid The value of templateid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTemplateid_LikeSearch(String templateid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(templateid), getCValueTemplateid(), "TemplateID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param templateid The value of templateid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTemplateid_NotLikeSearch(String templateid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(templateid), getCValueTemplateid(), "TemplateID", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTemplateid_IsNull() { regTemplateid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTemplateid_IsNotNull() { regTemplateid(CK_ISNN, DOBJ); }

    protected void regTemplateid(ConditionKey k, Object v) { regQ(k, v, getCValueTemplateid(), "TemplateID"); }
    abstract protected ConditionValue getCValueTemplateid();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param rootpackage The value of rootpackage as equal.
     */
    public void setRootpackage_Equal(java.lang.Integer rootpackage) {
        regRootpackage(CK_EQ, rootpackage);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param rootpackage The value of rootpackage as notEqual.
     */
    public void setRootpackage_NotEqual(java.lang.Integer rootpackage) {
        regRootpackage(CK_NE, rootpackage);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param rootpackage The value of rootpackage as greaterThan.
     */
    public void setRootpackage_GreaterThan(java.lang.Integer rootpackage) {
        regRootpackage(CK_GT, rootpackage);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param rootpackage The value of rootpackage as lessThan.
     */
    public void setRootpackage_LessThan(java.lang.Integer rootpackage) {
        regRootpackage(CK_LT, rootpackage);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param rootpackage The value of rootpackage as greaterEqual.
     */
    public void setRootpackage_GreaterEqual(java.lang.Integer rootpackage) {
        regRootpackage(CK_GE, rootpackage);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRootpackage_IsNull() { regRootpackage(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRootpackage_IsNotNull() { regRootpackage(CK_ISNN, DOBJ); }

    protected void regRootpackage(ConditionKey k, Object v) { regQ(k, v, getCValueRootpackage(), "RootPackage"); }
    abstract protected ConditionValue getCValueRootpackage();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param filename The value of filename as equal.
     */
    public void setFilename_Equal(String filename) {
        regFilename(CK_EQ, fRES(filename));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filename The value of filename as notEqual.
     */
    public void setFilename_NotEqual(String filename) {
        regFilename(CK_NE, fRES(filename));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filename The value of filename as greaterThan.
     */
    public void setFilename_GreaterThan(String filename) {
        regFilename(CK_GT, fRES(filename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filename The value of filename as lessThan.
     */
    public void setFilename_LessThan(String filename) {
        regFilename(CK_LT, fRES(filename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filename The value of filename as greaterEqual.
     */
    public void setFilename_GreaterEqual(String filename) {
        regFilename(CK_GE, fRES(filename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filename The value of filename as lessEqual.
     */
    public void setFilename_LessEqual(String filename) {
        regFilename(CK_LE, fRES(filename));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param filename The value of filename as prefixSearch.
     */
    public void setFilename_PrefixSearch(String filename) {
        regFilename(CK_PS, fRES(filename));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param filenameList The collection of filename as inScope.
     */
    public void setFilename_InScope(Collection<String> filenameList) {
        regFilename(CK_INS, cTL(filenameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param filename The value of filename as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFilename_LikeSearch(String filename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(filename), getCValueFilename(), "Filename", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param filename The value of filename as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFilename_NotLikeSearch(String filename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(filename), getCValueFilename(), "Filename", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setFilename_IsNull() { regFilename(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setFilename_IsNotNull() { regFilename(CK_ISNN, DOBJ); }

    protected void regFilename(ConditionKey k, Object v) { regQ(k, v, getCValueFilename(), "Filename"); }
    abstract protected ConditionValue getCValueFilename();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param details The value of details as equal.
     */
    public void setDetails_Equal(Boolean details) {
        regDetails(CK_EQ, details);
    }

    protected void regDetails(ConditionKey k, Object v) { regQ(k, v, getCValueDetails(), "Details"); }
    abstract protected ConditionValue getCValueDetails();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param processchildren The value of processchildren as equal.
     */
    public void setProcesschildren_Equal(Boolean processchildren) {
        regProcesschildren(CK_EQ, processchildren);
    }

    protected void regProcesschildren(ConditionKey k, Object v) { regQ(k, v, getCValueProcesschildren(), "ProcessChildren"); }
    abstract protected ConditionValue getCValueProcesschildren();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param showdiagrams The value of showdiagrams as equal.
     */
    public void setShowdiagrams_Equal(Boolean showdiagrams) {
        regShowdiagrams(CK_EQ, showdiagrams);
    }

    protected void regShowdiagrams(ConditionKey k, Object v) { regQ(k, v, getCValueShowdiagrams(), "ShowDiagrams"); }
    abstract protected ConditionValue getCValueShowdiagrams();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param heading The value of heading as equal.
     */
    public void setHeading_Equal(String heading) {
        regHeading(CK_EQ, fRES(heading));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param heading The value of heading as notEqual.
     */
    public void setHeading_NotEqual(String heading) {
        regHeading(CK_NE, fRES(heading));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param heading The value of heading as greaterThan.
     */
    public void setHeading_GreaterThan(String heading) {
        regHeading(CK_GT, fRES(heading));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param heading The value of heading as lessThan.
     */
    public void setHeading_LessThan(String heading) {
        regHeading(CK_LT, fRES(heading));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param heading The value of heading as greaterEqual.
     */
    public void setHeading_GreaterEqual(String heading) {
        regHeading(CK_GE, fRES(heading));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param heading The value of heading as lessEqual.
     */
    public void setHeading_LessEqual(String heading) {
        regHeading(CK_LE, fRES(heading));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param heading The value of heading as prefixSearch.
     */
    public void setHeading_PrefixSearch(String heading) {
        regHeading(CK_PS, fRES(heading));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param headingList The collection of heading as inScope.
     */
    public void setHeading_InScope(Collection<String> headingList) {
        regHeading(CK_INS, cTL(headingList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param heading The value of heading as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeading_LikeSearch(String heading, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(heading), getCValueHeading(), "Heading", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param heading The value of heading as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHeading_NotLikeSearch(String heading, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(heading), getCValueHeading(), "Heading", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setHeading_IsNull() { regHeading(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setHeading_IsNotNull() { regHeading(CK_ISNN, DOBJ); }

    protected void regHeading(ConditionKey k, Object v) { regQ(k, v, getCValueHeading(), "Heading"); }
    abstract protected ConditionValue getCValueHeading();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param requirements The value of requirements as equal.
     */
    public void setRequirements_Equal(Boolean requirements) {
        regRequirements(CK_EQ, requirements);
    }

    protected void regRequirements(ConditionKey k, Object v) { regQ(k, v, getCValueRequirements(), "Requirements"); }
    abstract protected ConditionValue getCValueRequirements();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param associations The value of associations as equal.
     */
    public void setAssociations_Equal(Boolean associations) {
        regAssociations(CK_EQ, associations);
    }

    protected void regAssociations(ConditionKey k, Object v) { regQ(k, v, getCValueAssociations(), "Associations"); }
    abstract protected ConditionValue getCValueAssociations();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param scenarios The value of scenarios as equal.
     */
    public void setScenarios_Equal(Boolean scenarios) {
        regScenarios(CK_EQ, scenarios);
    }

    protected void regScenarios(ConditionKey k, Object v) { regQ(k, v, getCValueScenarios(), "Scenarios"); }
    abstract protected ConditionValue getCValueScenarios();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param childdiagrams The value of childdiagrams as equal.
     */
    public void setChilddiagrams_Equal(Boolean childdiagrams) {
        regChilddiagrams(CK_EQ, childdiagrams);
    }

    protected void regChilddiagrams(ConditionKey k, Object v) { regQ(k, v, getCValueChilddiagrams(), "ChildDiagrams"); }
    abstract protected ConditionValue getCValueChilddiagrams();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param attributes The value of attributes as equal.
     */
    public void setAttributes_Equal(Boolean attributes) {
        regAttributes(CK_EQ, attributes);
    }

    protected void regAttributes(ConditionKey k, Object v) { regQ(k, v, getCValueAttributes(), "Attributes"); }
    abstract protected ConditionValue getCValueAttributes();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param methods The value of methods as equal.
     */
    public void setMethods_Equal(Boolean methods) {
        regMethods(CK_EQ, methods);
    }

    protected void regMethods(ConditionKey k, Object v) { regQ(k, v, getCValueMethods(), "Methods"); }
    abstract protected ConditionValue getCValueMethods();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param imagetype The value of imagetype as equal.
     */
    public void setImagetype_Equal(java.lang.Integer imagetype) {
        regImagetype(CK_EQ, imagetype);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param imagetype The value of imagetype as notEqual.
     */
    public void setImagetype_NotEqual(java.lang.Integer imagetype) {
        regImagetype(CK_NE, imagetype);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param imagetype The value of imagetype as greaterThan.
     */
    public void setImagetype_GreaterThan(java.lang.Integer imagetype) {
        regImagetype(CK_GT, imagetype);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param imagetype The value of imagetype as lessThan.
     */
    public void setImagetype_LessThan(java.lang.Integer imagetype) {
        regImagetype(CK_LT, imagetype);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param imagetype The value of imagetype as greaterEqual.
     */
    public void setImagetype_GreaterEqual(java.lang.Integer imagetype) {
        regImagetype(CK_GE, imagetype);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setImagetype_IsNull() { regImagetype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setImagetype_IsNotNull() { regImagetype(CK_ISNN, DOBJ); }

    protected void regImagetype(ConditionKey k, Object v) { regQ(k, v, getCValueImagetype(), "ImageType"); }
    abstract protected ConditionValue getCValueImagetype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param paging The value of paging as equal.
     */
    public void setPaging_Equal(Boolean paging) {
        regPaging(CK_EQ, paging);
    }

    protected void regPaging(ConditionKey k, Object v) { regQ(k, v, getCValuePaging(), "Paging"); }
    abstract protected ConditionValue getCValuePaging();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param intro The value of intro as equal.
     */
    public void setIntro_Equal(String intro) {
        regIntro(CK_EQ, fRES(intro));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param intro The value of intro as notEqual.
     */
    public void setIntro_NotEqual(String intro) {
        regIntro(CK_NE, fRES(intro));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param intro The value of intro as greaterThan.
     */
    public void setIntro_GreaterThan(String intro) {
        regIntro(CK_GT, fRES(intro));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param intro The value of intro as lessThan.
     */
    public void setIntro_LessThan(String intro) {
        regIntro(CK_LT, fRES(intro));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param intro The value of intro as greaterEqual.
     */
    public void setIntro_GreaterEqual(String intro) {
        regIntro(CK_GE, fRES(intro));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param intro The value of intro as lessEqual.
     */
    public void setIntro_LessEqual(String intro) {
        regIntro(CK_LE, fRES(intro));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param intro The value of intro as prefixSearch.
     */
    public void setIntro_PrefixSearch(String intro) {
        regIntro(CK_PS, fRES(intro));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param introList The collection of intro as inScope.
     */
    public void setIntro_InScope(Collection<String> introList) {
        regIntro(CK_INS, cTL(introList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param intro The value of intro as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIntro_LikeSearch(String intro, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(intro), getCValueIntro(), "Intro", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param intro The value of intro as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIntro_NotLikeSearch(String intro, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(intro), getCValueIntro(), "Intro", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setIntro_IsNull() { regIntro(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setIntro_IsNotNull() { regIntro(CK_ISNN, DOBJ); }

    protected void regIntro(ConditionKey k, Object v) { regQ(k, v, getCValueIntro(), "Intro"); }
    abstract protected ConditionValue getCValueIntro();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param resources The value of resources as equal.
     */
    public void setResources_Equal(Boolean resources) {
        regResources(CK_EQ, resources);
    }

    protected void regResources(ConditionKey k, Object v) { regQ(k, v, getCValueResources(), "Resources"); }
    abstract protected ConditionValue getCValueResources();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param constraints The value of constraints as equal.
     */
    public void setConstraints_Equal(Boolean constraints) {
        regConstraints(CK_EQ, constraints);
    }

    protected void regConstraints(ConditionKey k, Object v) { regQ(k, v, getCValueConstraints(), "Constraints"); }
    abstract protected ConditionValue getCValueConstraints();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param tagged The value of tagged as equal.
     */
    public void setTagged_Equal(Boolean tagged) {
        regTagged(CK_EQ, tagged);
    }

    protected void regTagged(ConditionKey k, Object v) { regQ(k, v, getCValueTagged(), "Tagged"); }
    abstract protected ConditionValue getCValueTagged();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param showtag The value of showtag as equal.
     */
    public void setShowtag_Equal(Boolean showtag) {
        regShowtag(CK_EQ, showtag);
    }

    protected void regShowtag(ConditionKey k, Object v) { regQ(k, v, getCValueShowtag(), "ShowTag"); }
    abstract protected ConditionValue getCValueShowtag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param showalias The value of showalias as equal.
     */
    public void setShowalias_Equal(Boolean showalias) {
        regShowalias(CK_EQ, showalias);
    }

    protected void regShowalias(ConditionKey k, Object v) { regQ(k, v, getCValueShowalias(), "ShowAlias"); }
    abstract protected ConditionValue getCValueShowalias();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param pdata1 The value of pdata1 as equal.
     */
    public void setPdata1_Equal(String pdata1) {
        regPdata1(CK_EQ, fRES(pdata1));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as notEqual.
     */
    public void setPdata1_NotEqual(String pdata1) {
        regPdata1(CK_NE, fRES(pdata1));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as greaterThan.
     */
    public void setPdata1_GreaterThan(String pdata1) {
        regPdata1(CK_GT, fRES(pdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as lessThan.
     */
    public void setPdata1_LessThan(String pdata1) {
        regPdata1(CK_LT, fRES(pdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as greaterEqual.
     */
    public void setPdata1_GreaterEqual(String pdata1) {
        regPdata1(CK_GE, fRES(pdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as lessEqual.
     */
    public void setPdata1_LessEqual(String pdata1) {
        regPdata1(CK_LE, fRES(pdata1));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as prefixSearch.
     */
    public void setPdata1_PrefixSearch(String pdata1) {
        regPdata1(CK_PS, fRES(pdata1));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata1List The collection of pdata1 as inScope.
     */
    public void setPdata1_InScope(Collection<String> pdata1List) {
        regPdata1(CK_INS, cTL(pdata1List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata1 The value of pdata1 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata1_LikeSearch(String pdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata1), getCValuePdata1(), "PDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata1 The value of pdata1 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata1_NotLikeSearch(String pdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata1), getCValuePdata1(), "PDATA1", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata1_IsNull() { regPdata1(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata1_IsNotNull() { regPdata1(CK_ISNN, DOBJ); }

    protected void regPdata1(ConditionKey k, Object v) { regQ(k, v, getCValuePdata1(), "PDATA1"); }
    abstract protected ConditionValue getCValuePdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param pdata2 The value of pdata2 as equal.
     */
    public void setPdata2_Equal(String pdata2) {
        regPdata2(CK_EQ, fRES(pdata2));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as notEqual.
     */
    public void setPdata2_NotEqual(String pdata2) {
        regPdata2(CK_NE, fRES(pdata2));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as greaterThan.
     */
    public void setPdata2_GreaterThan(String pdata2) {
        regPdata2(CK_GT, fRES(pdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as lessThan.
     */
    public void setPdata2_LessThan(String pdata2) {
        regPdata2(CK_LT, fRES(pdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as greaterEqual.
     */
    public void setPdata2_GreaterEqual(String pdata2) {
        regPdata2(CK_GE, fRES(pdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as lessEqual.
     */
    public void setPdata2_LessEqual(String pdata2) {
        regPdata2(CK_LE, fRES(pdata2));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as prefixSearch.
     */
    public void setPdata2_PrefixSearch(String pdata2) {
        regPdata2(CK_PS, fRES(pdata2));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata2List The collection of pdata2 as inScope.
     */
    public void setPdata2_InScope(Collection<String> pdata2List) {
        regPdata2(CK_INS, cTL(pdata2List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata2 The value of pdata2 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata2_LikeSearch(String pdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata2), getCValuePdata2(), "PDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata2 The value of pdata2 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata2_NotLikeSearch(String pdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata2), getCValuePdata2(), "PDATA2", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata2_IsNull() { regPdata2(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata2_IsNotNull() { regPdata2(CK_ISNN, DOBJ); }

    protected void regPdata2(ConditionKey k, Object v) { regQ(k, v, getCValuePdata2(), "PDATA2"); }
    abstract protected ConditionValue getCValuePdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param pdata3 The value of pdata3 as equal.
     */
    public void setPdata3_Equal(String pdata3) {
        regPdata3(CK_EQ, fRES(pdata3));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as notEqual.
     */
    public void setPdata3_NotEqual(String pdata3) {
        regPdata3(CK_NE, fRES(pdata3));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as greaterThan.
     */
    public void setPdata3_GreaterThan(String pdata3) {
        regPdata3(CK_GT, fRES(pdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as lessThan.
     */
    public void setPdata3_LessThan(String pdata3) {
        regPdata3(CK_LT, fRES(pdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as greaterEqual.
     */
    public void setPdata3_GreaterEqual(String pdata3) {
        regPdata3(CK_GE, fRES(pdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as lessEqual.
     */
    public void setPdata3_LessEqual(String pdata3) {
        regPdata3(CK_LE, fRES(pdata3));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as prefixSearch.
     */
    public void setPdata3_PrefixSearch(String pdata3) {
        regPdata3(CK_PS, fRES(pdata3));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata3List The collection of pdata3 as inScope.
     */
    public void setPdata3_InScope(Collection<String> pdata3List) {
        regPdata3(CK_INS, cTL(pdata3List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata3 The value of pdata3 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata3_LikeSearch(String pdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata3), getCValuePdata3(), "PDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata3 The value of pdata3 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata3_NotLikeSearch(String pdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata3), getCValuePdata3(), "PDATA3", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata3_IsNull() { regPdata3(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata3_IsNotNull() { regPdata3(CK_ISNN, DOBJ); }

    protected void regPdata3(ConditionKey k, Object v) { regQ(k, v, getCValuePdata3(), "PDATA3"); }
    abstract protected ConditionValue getCValuePdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param pdata4 The value of pdata4 as equal.
     */
    public void setPdata4_Equal(String pdata4) {
        regPdata4(CK_EQ, fRES(pdata4));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as notEqual.
     */
    public void setPdata4_NotEqual(String pdata4) {
        regPdata4(CK_NE, fRES(pdata4));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as greaterThan.
     */
    public void setPdata4_GreaterThan(String pdata4) {
        regPdata4(CK_GT, fRES(pdata4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as lessThan.
     */
    public void setPdata4_LessThan(String pdata4) {
        regPdata4(CK_LT, fRES(pdata4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as greaterEqual.
     */
    public void setPdata4_GreaterEqual(String pdata4) {
        regPdata4(CK_GE, fRES(pdata4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as lessEqual.
     */
    public void setPdata4_LessEqual(String pdata4) {
        regPdata4(CK_LE, fRES(pdata4));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as prefixSearch.
     */
    public void setPdata4_PrefixSearch(String pdata4) {
        regPdata4(CK_PS, fRES(pdata4));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata4List The collection of pdata4 as inScope.
     */
    public void setPdata4_InScope(Collection<String> pdata4List) {
        regPdata4(CK_INS, cTL(pdata4List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata4 The value of pdata4 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata4_LikeSearch(String pdata4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata4), getCValuePdata4(), "PDATA4", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata4 The value of pdata4 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata4_NotLikeSearch(String pdata4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata4), getCValuePdata4(), "PDATA4", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata4_IsNull() { regPdata4(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata4_IsNotNull() { regPdata4(CK_ISNN, DOBJ); }

    protected void regPdata4(ConditionKey k, Object v) { regQ(k, v, getCValuePdata4(), "PDATA4"); }
    abstract protected ConditionValue getCValuePdata4();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TRtfreportCB.class.getName(); }
    String xCQ() { return TRtfreportCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
