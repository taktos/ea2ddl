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
 * The abstract condition-query of t_stereotypes.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTStereotypesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTStereotypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_stereotypes";
    }
    
    public String getTableSqlName() {
        return "t_stereotypes";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(255)}
     * @param stereotype The value of stereotype as equal.
     */
    public void setStereotype_Equal(String stereotype) {
        regStereotype(CK_EQ, fRES(stereotype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as notEqual.
     */
    public void setStereotype_NotEqual(String stereotype) {
        regStereotype(CK_NE, fRES(stereotype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as greaterThan.
     */
    public void setStereotype_GreaterThan(String stereotype) {
        regStereotype(CK_GT, fRES(stereotype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as lessThan.
     */
    public void setStereotype_LessThan(String stereotype) {
        regStereotype(CK_LT, fRES(stereotype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as greaterEqual.
     */
    public void setStereotype_GreaterEqual(String stereotype) {
        regStereotype(CK_GE, fRES(stereotype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as lessEqual.
     */
    public void setStereotype_LessEqual(String stereotype) {
        regStereotype(CK_LE, fRES(stereotype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as prefixSearch.
     */
    public void setStereotype_PrefixSearch(String stereotype) {
        regStereotype(CK_PS, fRES(stereotype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stereotypeList The collection of stereotype as inScope.
     */
    public void setStereotype_InScope(Collection<String> stereotypeList) {
        regStereotype(CK_INS, cTL(stereotypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stereotype The value of stereotype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStereotype_LikeSearch(String stereotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stereotype), getCValueStereotype(), "Stereotype", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stereotype The value of stereotype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStereotype_NotLikeSearch(String stereotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stereotype), getCValueStereotype(), "Stereotype", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStereotype_IsNull() { regStereotype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStereotype_IsNotNull() { regStereotype(CK_ISNN, DOBJ); }

    protected void regStereotype(ConditionKey k, Object v) { regQ(k, v, getCValueStereotype(), "Stereotype"); }
    abstract protected ConditionValue getCValueStereotype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(255)}
     * @param appliesto The value of appliesto as equal.
     */
    public void setAppliesto_Equal(String appliesto) {
        regAppliesto(CK_EQ, fRES(appliesto));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as notEqual.
     */
    public void setAppliesto_NotEqual(String appliesto) {
        regAppliesto(CK_NE, fRES(appliesto));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as greaterThan.
     */
    public void setAppliesto_GreaterThan(String appliesto) {
        regAppliesto(CK_GT, fRES(appliesto));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as lessThan.
     */
    public void setAppliesto_LessThan(String appliesto) {
        regAppliesto(CK_LT, fRES(appliesto));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as greaterEqual.
     */
    public void setAppliesto_GreaterEqual(String appliesto) {
        regAppliesto(CK_GE, fRES(appliesto));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as lessEqual.
     */
    public void setAppliesto_LessEqual(String appliesto) {
        regAppliesto(CK_LE, fRES(appliesto));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param appliesto The value of appliesto as prefixSearch.
     */
    public void setAppliesto_PrefixSearch(String appliesto) {
        regAppliesto(CK_PS, fRES(appliesto));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param appliestoList The collection of appliesto as inScope.
     */
    public void setAppliesto_InScope(Collection<String> appliestoList) {
        regAppliesto(CK_INS, cTL(appliestoList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param appliesto The value of appliesto as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAppliesto_LikeSearch(String appliesto, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(appliesto), getCValueAppliesto(), "AppliesTo", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param appliesto The value of appliesto as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAppliesto_NotLikeSearch(String appliesto, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(appliesto), getCValueAppliesto(), "AppliesTo", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setAppliesto_IsNull() { regAppliesto(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setAppliesto_IsNotNull() { regAppliesto(CK_ISNN, DOBJ); }

    protected void regAppliesto(ConditionKey k, Object v) { regQ(k, v, getCValueAppliesto(), "AppliesTo"); }
    abstract protected ConditionValue getCValueAppliesto();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param description The value of description as equal.
     */
    public void setDescription_Equal(String description) {
        regDescription(CK_EQ, fRES(description));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as notEqual.
     */
    public void setDescription_NotEqual(String description) {
        regDescription(CK_NE, fRES(description));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as greaterThan.
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as lessThan.
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as greaterEqual.
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as lessEqual.
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param description The value of description as prefixSearch.
     */
    public void setDescription_PrefixSearch(String description) {
        regDescription(CK_PS, fRES(description));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param descriptionList The collection of description as inScope.
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        regDescription(CK_INS, cTL(descriptionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), getCValueDescription(), "Description", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), getCValueDescription(), "Description", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDescription_IsNull() { regDescription(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDescription_IsNotNull() { regDescription(CK_ISNN, DOBJ); }

    protected void regDescription(ConditionKey k, Object v) { regQ(k, v, getCValueDescription(), "Description"); }
    abstract protected ConditionValue getCValueDescription();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : BIT}
     * @param mfenabled The value of mfenabled as equal.
     */
    public void setMfenabled_Equal(Boolean mfenabled) {
        regMfenabled(CK_EQ, mfenabled);
    }

    protected void regMfenabled(ConditionKey k, Object v) { regQ(k, v, getCValueMfenabled(), "MFEnabled"); }
    abstract protected ConditionValue getCValueMfenabled();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param mfpath The value of mfpath as equal.
     */
    public void setMfpath_Equal(String mfpath) {
        regMfpath(CK_EQ, fRES(mfpath));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param mfpath The value of mfpath as notEqual.
     */
    public void setMfpath_NotEqual(String mfpath) {
        regMfpath(CK_NE, fRES(mfpath));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param mfpath The value of mfpath as greaterThan.
     */
    public void setMfpath_GreaterThan(String mfpath) {
        regMfpath(CK_GT, fRES(mfpath));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param mfpath The value of mfpath as lessThan.
     */
    public void setMfpath_LessThan(String mfpath) {
        regMfpath(CK_LT, fRES(mfpath));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param mfpath The value of mfpath as greaterEqual.
     */
    public void setMfpath_GreaterEqual(String mfpath) {
        regMfpath(CK_GE, fRES(mfpath));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param mfpath The value of mfpath as lessEqual.
     */
    public void setMfpath_LessEqual(String mfpath) {
        regMfpath(CK_LE, fRES(mfpath));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param mfpath The value of mfpath as prefixSearch.
     */
    public void setMfpath_PrefixSearch(String mfpath) {
        regMfpath(CK_PS, fRES(mfpath));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param mfpathList The collection of mfpath as inScope.
     */
    public void setMfpath_InScope(Collection<String> mfpathList) {
        regMfpath(CK_INS, cTL(mfpathList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param mfpath The value of mfpath as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMfpath_LikeSearch(String mfpath, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mfpath), getCValueMfpath(), "MFPath", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param mfpath The value of mfpath as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMfpath_NotLikeSearch(String mfpath, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mfpath), getCValueMfpath(), "MFPath", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setMfpath_IsNull() { regMfpath(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setMfpath_IsNotNull() { regMfpath(CK_ISNN, DOBJ); }

    protected void regMfpath(ConditionKey k, Object v) { regQ(k, v, getCValueMfpath(), "MFPath"); }
    abstract protected ConditionValue getCValueMfpath();

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setMetafile_IsNull() { regMetafile(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setMetafile_IsNotNull() { regMetafile(CK_ISNN, DOBJ); }

    protected void regMetafile(ConditionKey k, Object v) { regQ(k, v, getCValueMetafile(), "Metafile"); }
    abstract protected ConditionValue getCValueMetafile();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param style The value of style as equal.
     */
    public void setStyle_Equal(String style) {
        regStyle(CK_EQ, fRES(style));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as notEqual.
     */
    public void setStyle_NotEqual(String style) {
        regStyle(CK_NE, fRES(style));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as greaterThan.
     */
    public void setStyle_GreaterThan(String style) {
        regStyle(CK_GT, fRES(style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as lessThan.
     */
    public void setStyle_LessThan(String style) {
        regStyle(CK_LT, fRES(style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as greaterEqual.
     */
    public void setStyle_GreaterEqual(String style) {
        regStyle(CK_GE, fRES(style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as lessEqual.
     */
    public void setStyle_LessEqual(String style) {
        regStyle(CK_LE, fRES(style));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as prefixSearch.
     */
    public void setStyle_PrefixSearch(String style) {
        regStyle(CK_PS, fRES(style));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleList The collection of style as inScope.
     */
    public void setStyle_InScope(Collection<String> styleList) {
        regStyle(CK_INS, cTL(styleList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param style The value of style as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStyle_LikeSearch(String style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(style), getCValueStyle(), "Style", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param style The value of style as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStyle_NotLikeSearch(String style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(style), getCValueStyle(), "Style", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStyle_IsNull() { regStyle(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStyle_IsNotNull() { regStyle(CK_ISNN, DOBJ); }

    protected void regStyle(ConditionKey k, Object v) { regQ(k, v, getCValueStyle(), "Style"); }
    abstract protected ConditionValue getCValueStyle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param eaGuid The value of eaGuid as equal.
     */
    public void setEaGuid_Equal(String eaGuid) {
        regEaGuid(CK_EQ, fRES(eaGuid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as notEqual.
     */
    public void setEaGuid_NotEqual(String eaGuid) {
        regEaGuid(CK_NE, fRES(eaGuid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as greaterThan.
     */
    public void setEaGuid_GreaterThan(String eaGuid) {
        regEaGuid(CK_GT, fRES(eaGuid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as lessThan.
     */
    public void setEaGuid_LessThan(String eaGuid) {
        regEaGuid(CK_LT, fRES(eaGuid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as greaterEqual.
     */
    public void setEaGuid_GreaterEqual(String eaGuid) {
        regEaGuid(CK_GE, fRES(eaGuid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as lessEqual.
     */
    public void setEaGuid_LessEqual(String eaGuid) {
        regEaGuid(CK_LE, fRES(eaGuid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as prefixSearch.
     */
    public void setEaGuid_PrefixSearch(String eaGuid) {
        regEaGuid(CK_PS, fRES(eaGuid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuidList The collection of eaGuid as inScope.
     */
    public void setEaGuid_InScope(Collection<String> eaGuidList) {
        regEaGuid(CK_INS, cTL(eaGuidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEaGuid_LikeSearch(String eaGuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEaGuid_NotLikeSearch(String eaGuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEaGuid_IsNull() { regEaGuid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEaGuid_IsNotNull() { regEaGuid(CK_ISNN, DOBJ); }

    protected void regEaGuid(ConditionKey k, Object v) { regQ(k, v, getCValueEaGuid(), "ea_guid"); }
    abstract protected ConditionValue getCValueEaGuid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(100)}
     * @param visualtype The value of visualtype as equal.
     */
    public void setVisualtype_Equal(String visualtype) {
        regVisualtype(CK_EQ, fRES(visualtype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visualtype The value of visualtype as notEqual.
     */
    public void setVisualtype_NotEqual(String visualtype) {
        regVisualtype(CK_NE, fRES(visualtype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visualtype The value of visualtype as greaterThan.
     */
    public void setVisualtype_GreaterThan(String visualtype) {
        regVisualtype(CK_GT, fRES(visualtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visualtype The value of visualtype as lessThan.
     */
    public void setVisualtype_LessThan(String visualtype) {
        regVisualtype(CK_LT, fRES(visualtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visualtype The value of visualtype as greaterEqual.
     */
    public void setVisualtype_GreaterEqual(String visualtype) {
        regVisualtype(CK_GE, fRES(visualtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visualtype The value of visualtype as lessEqual.
     */
    public void setVisualtype_LessEqual(String visualtype) {
        regVisualtype(CK_LE, fRES(visualtype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visualtype The value of visualtype as prefixSearch.
     */
    public void setVisualtype_PrefixSearch(String visualtype) {
        regVisualtype(CK_PS, fRES(visualtype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param visualtypeList The collection of visualtype as inScope.
     */
    public void setVisualtype_InScope(Collection<String> visualtypeList) {
        regVisualtype(CK_INS, cTL(visualtypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param visualtype The value of visualtype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVisualtype_LikeSearch(String visualtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(visualtype), getCValueVisualtype(), "VisualType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param visualtype The value of visualtype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVisualtype_NotLikeSearch(String visualtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(visualtype), getCValueVisualtype(), "VisualType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setVisualtype_IsNull() { regVisualtype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setVisualtype_IsNotNull() { regVisualtype(CK_ISNN, DOBJ); }

    protected void regVisualtype(ConditionKey k, Object v) { regQ(k, v, getCValueVisualtype(), "VisualType"); }
    abstract protected ConditionValue getCValueVisualtype();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TStereotypesCB.class.getName(); }
    String xCQ() { return TStereotypesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
