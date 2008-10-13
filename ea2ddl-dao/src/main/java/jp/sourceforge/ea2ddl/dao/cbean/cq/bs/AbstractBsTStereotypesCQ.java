package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_stereotypes.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTStereotypesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTStereotypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_stereotypes";
    }
    
    public String getTableSqlName() {
        return "t_stereotypes";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(255)}
     * @param stereotype The value of stereotype as equal.
     */
    public void setStereotype_Equal(String stereotype) {
        regStereotype(CK_EQ, fRES(stereotype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as notEqual.
     */
    public void setStereotype_NotEqual(String stereotype) {
        regStereotype(CK_NE, fRES(stereotype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as greaterThan.
     */
    public void setStereotype_GreaterThan(String stereotype) {
        regStereotype(CK_GT, fRES(stereotype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as lessThan.
     */
    public void setStereotype_LessThan(String stereotype) {
        regStereotype(CK_LT, fRES(stereotype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as greaterEqual.
     */
    public void setStereotype_GreaterEqual(String stereotype) {
        regStereotype(CK_GE, fRES(stereotype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as lessEqual.
     */
    public void setStereotype_LessEqual(String stereotype) {
        regStereotype(CK_LE, fRES(stereotype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as prefixSearch.
     */
    public void setStereotype_PrefixSearch(String stereotype) {
        regStereotype(CK_PS, fRES(stereotype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stereotype The value of stereotype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStereotype_LikeSearch(String stereotype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(stereotype), getCValueStereotype(), "Stereotype", "Stereotype", "stereotype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stereotypeList The collection of stereotype as inScope.
     */
    public void setStereotype_InScope(Collection<String> stereotypeList) {
        regStereotype(CK_INS, cTL(stereotypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stereotype The collection of stereotype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStereotype_InScope(String stereotype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(stereotype), getCValueStereotype(), "Stereotype", "Stereotype", "stereotype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStereotype_IsNull() { regStereotype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStereotype_IsNotNull() { regStereotype(CK_ISNN, DUMMY_OBJECT); }

    protected void regStereotype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStereotype(), "Stereotype", "Stereotype", "stereotype");
    }
    protected void registerInlineStereotype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStereotype(), "Stereotype", "Stereotype", "stereotype");
    }
    abstract protected ConditionValue getCValueStereotype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(255)}
     * @param appliesto The value of appliesto as equal.
     */
    public void setAppliesto_Equal(String appliesto) {
        regAppliesto(CK_EQ, fRES(appliesto));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as notEqual.
     */
    public void setAppliesto_NotEqual(String appliesto) {
        regAppliesto(CK_NE, fRES(appliesto));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as greaterThan.
     */
    public void setAppliesto_GreaterThan(String appliesto) {
        regAppliesto(CK_GT, fRES(appliesto));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as lessThan.
     */
    public void setAppliesto_LessThan(String appliesto) {
        regAppliesto(CK_LT, fRES(appliesto));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as greaterEqual.
     */
    public void setAppliesto_GreaterEqual(String appliesto) {
        regAppliesto(CK_GE, fRES(appliesto));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as lessEqual.
     */
    public void setAppliesto_LessEqual(String appliesto) {
        regAppliesto(CK_LE, fRES(appliesto));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param appliesto The value of appliesto as prefixSearch.
     */
    public void setAppliesto_PrefixSearch(String appliesto) {
        regAppliesto(CK_PS, fRES(appliesto));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param appliesto The value of appliesto as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAppliesto_LikeSearch(String appliesto, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(appliesto), getCValueAppliesto(), "AppliesTo", "Appliesto", "appliesto", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param appliestoList The collection of appliesto as inScope.
     */
    public void setAppliesto_InScope(Collection<String> appliestoList) {
        regAppliesto(CK_INS, cTL(appliestoList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param appliesto The collection of appliesto as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setAppliesto_InScope(String appliesto, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(appliesto), getCValueAppliesto(), "AppliesTo", "Appliesto", "appliesto", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setAppliesto_IsNull() { regAppliesto(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setAppliesto_IsNotNull() { regAppliesto(CK_ISNN, DUMMY_OBJECT); }

    protected void regAppliesto(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAppliesto(), "AppliesTo", "Appliesto", "appliesto");
    }
    protected void registerInlineAppliesto(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAppliesto(), "AppliesTo", "Appliesto", "appliesto");
    }
    abstract protected ConditionValue getCValueAppliesto();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param description The value of description as equal.
     */
    public void setDescription_Equal(String description) {
        regDescription(CK_EQ, fRES(description));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as notEqual.
     */
    public void setDescription_NotEqual(String description) {
        regDescription(CK_NE, fRES(description));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as greaterThan.
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as lessThan.
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as greaterEqual.
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as lessEqual.
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as prefixSearch.
     */
    public void setDescription_PrefixSearch(String description) {
        regDescription(CK_PS, fRES(description));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(description), getCValueDescription(), "Description", "Description", "description", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param descriptionList The collection of description as inScope.
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        regDescription(CK_INS, cTL(descriptionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param description The collection of description as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDescription_InScope(String description, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(description), getCValueDescription(), "Description", "Description", "description", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDescription_IsNull() { regDescription(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDescription_IsNotNull() { regDescription(CK_ISNN, DUMMY_OBJECT); }

    protected void regDescription(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDescription(), "Description", "Description", "description");
    }
    protected void registerInlineDescription(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDescription(), "Description", "Description", "description");
    }
    abstract protected ConditionValue getCValueDescription();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param mfenabled The value of mfenabled as equal.
     */
    public void setMfenabled_Equal(Boolean mfenabled) {
        regMfenabled(CK_EQ, mfenabled);
    }

    protected void regMfenabled(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueMfenabled(), "MFEnabled", "Mfenabled", "mfenabled");
    }
    protected void registerInlineMfenabled(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueMfenabled(), "MFEnabled", "Mfenabled", "mfenabled");
    }
    abstract protected ConditionValue getCValueMfenabled();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param mfpath The value of mfpath as equal.
     */
    public void setMfpath_Equal(String mfpath) {
        regMfpath(CK_EQ, fRES(mfpath));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param mfpath The value of mfpath as notEqual.
     */
    public void setMfpath_NotEqual(String mfpath) {
        regMfpath(CK_NE, fRES(mfpath));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param mfpath The value of mfpath as greaterThan.
     */
    public void setMfpath_GreaterThan(String mfpath) {
        regMfpath(CK_GT, fRES(mfpath));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param mfpath The value of mfpath as lessThan.
     */
    public void setMfpath_LessThan(String mfpath) {
        regMfpath(CK_LT, fRES(mfpath));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param mfpath The value of mfpath as greaterEqual.
     */
    public void setMfpath_GreaterEqual(String mfpath) {
        regMfpath(CK_GE, fRES(mfpath));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param mfpath The value of mfpath as lessEqual.
     */
    public void setMfpath_LessEqual(String mfpath) {
        regMfpath(CK_LE, fRES(mfpath));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param mfpath The value of mfpath as prefixSearch.
     */
    public void setMfpath_PrefixSearch(String mfpath) {
        regMfpath(CK_PS, fRES(mfpath));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param mfpath The value of mfpath as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMfpath_LikeSearch(String mfpath, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(mfpath), getCValueMfpath(), "MFPath", "Mfpath", "mfpath", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param mfpathList The collection of mfpath as inScope.
     */
    public void setMfpath_InScope(Collection<String> mfpathList) {
        regMfpath(CK_INS, cTL(mfpathList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param mfpath The collection of mfpath as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setMfpath_InScope(String mfpath, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(mfpath), getCValueMfpath(), "MFPath", "Mfpath", "mfpath", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setMfpath_IsNull() { regMfpath(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setMfpath_IsNotNull() { regMfpath(CK_ISNN, DUMMY_OBJECT); }

    protected void regMfpath(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueMfpath(), "MFPath", "Mfpath", "mfpath");
    }
    protected void registerInlineMfpath(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueMfpath(), "MFPath", "Mfpath", "mfpath");
    }
    abstract protected ConditionValue getCValueMfpath();

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setMetafile_IsNull() { regMetafile(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setMetafile_IsNotNull() { regMetafile(CK_ISNN, DUMMY_OBJECT); }

    protected void regMetafile(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueMetafile(), "Metafile", "Metafile", "metafile");
    }
    protected void registerInlineMetafile(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueMetafile(), "Metafile", "Metafile", "metafile");
    }
    abstract protected ConditionValue getCValueMetafile();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param style The value of style as equal.
     */
    public void setStyle_Equal(String style) {
        regStyle(CK_EQ, fRES(style));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as notEqual.
     */
    public void setStyle_NotEqual(String style) {
        regStyle(CK_NE, fRES(style));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as greaterThan.
     */
    public void setStyle_GreaterThan(String style) {
        regStyle(CK_GT, fRES(style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as lessThan.
     */
    public void setStyle_LessThan(String style) {
        regStyle(CK_LT, fRES(style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as greaterEqual.
     */
    public void setStyle_GreaterEqual(String style) {
        regStyle(CK_GE, fRES(style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as lessEqual.
     */
    public void setStyle_LessEqual(String style) {
        regStyle(CK_LE, fRES(style));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param style The value of style as prefixSearch.
     */
    public void setStyle_PrefixSearch(String style) {
        regStyle(CK_PS, fRES(style));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param style The value of style as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStyle_LikeSearch(String style, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(style), getCValueStyle(), "Style", "Style", "style", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleList The collection of style as inScope.
     */
    public void setStyle_InScope(Collection<String> styleList) {
        regStyle(CK_INS, cTL(styleList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param style The collection of style as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStyle_InScope(String style, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(style), getCValueStyle(), "Style", "Style", "style", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStyle_IsNull() { regStyle(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStyle_IsNotNull() { regStyle(CK_ISNN, DUMMY_OBJECT); }

    protected void regStyle(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStyle(), "Style", "Style", "style");
    }
    protected void registerInlineStyle(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStyle(), "Style", "Style", "style");
    }
    abstract protected ConditionValue getCValueStyle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param eaGuid The value of eaGuid as equal.
     */
    public void setEaGuid_Equal(String eaGuid) {
        regEaGuid(CK_EQ, fRES(eaGuid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as notEqual.
     */
    public void setEaGuid_NotEqual(String eaGuid) {
        regEaGuid(CK_NE, fRES(eaGuid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as greaterThan.
     */
    public void setEaGuid_GreaterThan(String eaGuid) {
        regEaGuid(CK_GT, fRES(eaGuid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as lessThan.
     */
    public void setEaGuid_LessThan(String eaGuid) {
        regEaGuid(CK_LT, fRES(eaGuid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as greaterEqual.
     */
    public void setEaGuid_GreaterEqual(String eaGuid) {
        regEaGuid(CK_GE, fRES(eaGuid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as lessEqual.
     */
    public void setEaGuid_LessEqual(String eaGuid) {
        regEaGuid(CK_LE, fRES(eaGuid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as prefixSearch.
     */
    public void setEaGuid_PrefixSearch(String eaGuid) {
        regEaGuid(CK_PS, fRES(eaGuid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEaGuid_LikeSearch(String eaGuid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuidList The collection of eaGuid as inScope.
     */
    public void setEaGuid_InScope(Collection<String> eaGuidList) {
        regEaGuid(CK_INS, cTL(eaGuidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuid The collection of eaGuid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setEaGuid_InScope(String eaGuid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setEaGuid_IsNull() { regEaGuid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setEaGuid_IsNotNull() { regEaGuid(CK_ISNN, DUMMY_OBJECT); }

    protected void regEaGuid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid");
    }
    protected void registerInlineEaGuid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid");
    }
    abstract protected ConditionValue getCValueEaGuid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param visualtype The value of visualtype as equal.
     */
    public void setVisualtype_Equal(String visualtype) {
        regVisualtype(CK_EQ, fRES(visualtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param visualtype The value of visualtype as notEqual.
     */
    public void setVisualtype_NotEqual(String visualtype) {
        regVisualtype(CK_NE, fRES(visualtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param visualtype The value of visualtype as greaterThan.
     */
    public void setVisualtype_GreaterThan(String visualtype) {
        regVisualtype(CK_GT, fRES(visualtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param visualtype The value of visualtype as lessThan.
     */
    public void setVisualtype_LessThan(String visualtype) {
        regVisualtype(CK_LT, fRES(visualtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param visualtype The value of visualtype as greaterEqual.
     */
    public void setVisualtype_GreaterEqual(String visualtype) {
        regVisualtype(CK_GE, fRES(visualtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param visualtype The value of visualtype as lessEqual.
     */
    public void setVisualtype_LessEqual(String visualtype) {
        regVisualtype(CK_LE, fRES(visualtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param visualtype The value of visualtype as prefixSearch.
     */
    public void setVisualtype_PrefixSearch(String visualtype) {
        regVisualtype(CK_PS, fRES(visualtype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param visualtype The value of visualtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVisualtype_LikeSearch(String visualtype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(visualtype), getCValueVisualtype(), "VisualType", "Visualtype", "visualtype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param visualtypeList The collection of visualtype as inScope.
     */
    public void setVisualtype_InScope(Collection<String> visualtypeList) {
        regVisualtype(CK_INS, cTL(visualtypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param visualtype The collection of visualtype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setVisualtype_InScope(String visualtype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(visualtype), getCValueVisualtype(), "VisualType", "Visualtype", "visualtype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setVisualtype_IsNull() { regVisualtype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setVisualtype_IsNotNull() { regVisualtype(CK_ISNN, DUMMY_OBJECT); }

    protected void regVisualtype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueVisualtype(), "VisualType", "Visualtype", "visualtype");
    }
    protected void registerInlineVisualtype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueVisualtype(), "VisualType", "Visualtype", "visualtype");
    }
    abstract protected ConditionValue getCValueVisualtype();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TStereotypesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TStereotypesCQ.class.getName(); }
}
