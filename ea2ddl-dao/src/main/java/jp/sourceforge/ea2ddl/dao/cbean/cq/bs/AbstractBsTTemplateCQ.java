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
 * The abstract condition-query of t_template.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTemplateCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTemplateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_template";
    }
    
    public String getTableSqlName() {
        return "t_template";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(40)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param templatetype The value of templatetype as equal.
     */
    public void setTemplatetype_Equal(String templatetype) {
        regTemplatetype(CK_EQ, fRES(templatetype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templatetype The value of templatetype as notEqual.
     */
    public void setTemplatetype_NotEqual(String templatetype) {
        regTemplatetype(CK_NE, fRES(templatetype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templatetype The value of templatetype as greaterThan.
     */
    public void setTemplatetype_GreaterThan(String templatetype) {
        regTemplatetype(CK_GT, fRES(templatetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templatetype The value of templatetype as lessThan.
     */
    public void setTemplatetype_LessThan(String templatetype) {
        regTemplatetype(CK_LT, fRES(templatetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templatetype The value of templatetype as greaterEqual.
     */
    public void setTemplatetype_GreaterEqual(String templatetype) {
        regTemplatetype(CK_GE, fRES(templatetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templatetype The value of templatetype as lessEqual.
     */
    public void setTemplatetype_LessEqual(String templatetype) {
        regTemplatetype(CK_LE, fRES(templatetype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templatetype The value of templatetype as prefixSearch.
     */
    public void setTemplatetype_PrefixSearch(String templatetype) {
        regTemplatetype(CK_PS, fRES(templatetype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param templatetypeList The collection of templatetype as inScope.
     */
    public void setTemplatetype_InScope(Collection<String> templatetypeList) {
        regTemplatetype(CK_INS, cTL(templatetypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param templatetype The value of templatetype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTemplatetype_LikeSearch(String templatetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(templatetype), getCValueTemplatetype(), "TemplateType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param templatetype The value of templatetype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTemplatetype_NotLikeSearch(String templatetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(templatetype), getCValueTemplatetype(), "TemplateType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTemplatetype_IsNull() { regTemplatetype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTemplatetype_IsNotNull() { regTemplatetype(CK_ISNN, DOBJ); }

    protected void regTemplatetype(ConditionKey k, Object v) { regQ(k, v, getCValueTemplatetype(), "TemplateType"); }
    abstract protected ConditionValue getCValueTemplatetype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(100)}
     * @param templatename The value of templatename as equal.
     */
    public void setTemplatename_Equal(String templatename) {
        regTemplatename(CK_EQ, fRES(templatename));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templatename The value of templatename as notEqual.
     */
    public void setTemplatename_NotEqual(String templatename) {
        regTemplatename(CK_NE, fRES(templatename));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templatename The value of templatename as greaterThan.
     */
    public void setTemplatename_GreaterThan(String templatename) {
        regTemplatename(CK_GT, fRES(templatename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templatename The value of templatename as lessThan.
     */
    public void setTemplatename_LessThan(String templatename) {
        regTemplatename(CK_LT, fRES(templatename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templatename The value of templatename as greaterEqual.
     */
    public void setTemplatename_GreaterEqual(String templatename) {
        regTemplatename(CK_GE, fRES(templatename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templatename The value of templatename as lessEqual.
     */
    public void setTemplatename_LessEqual(String templatename) {
        regTemplatename(CK_LE, fRES(templatename));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param templatename The value of templatename as prefixSearch.
     */
    public void setTemplatename_PrefixSearch(String templatename) {
        regTemplatename(CK_PS, fRES(templatename));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param templatenameList The collection of templatename as inScope.
     */
    public void setTemplatename_InScope(Collection<String> templatenameList) {
        regTemplatename(CK_INS, cTL(templatenameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param templatename The value of templatename as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTemplatename_LikeSearch(String templatename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(templatename), getCValueTemplatename(), "TemplateName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param templatename The value of templatename as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTemplatename_NotLikeSearch(String templatename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(templatename), getCValueTemplatename(), "TemplateName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTemplatename_IsNull() { regTemplatename(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTemplatename_IsNotNull() { regTemplatename(CK_ISNN, DOBJ); }

    protected void regTemplatename(ConditionKey k, Object v) { regQ(k, v, getCValueTemplatename(), "TemplateName"); }
    abstract protected ConditionValue getCValueTemplatename();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(String notes) {
        regNotes(CK_EQ, fRES(notes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(String notes) {
        regNotes(CK_NE, fRES(notes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(String notes) {
        regNotes(CK_PS, fRES(notes));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(Collection<String> notesList) {
        regNotes(CK_INS, cTL(notesList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey k, Object v) { regQ(k, v, getCValueNotes(), "Notes"); }
    abstract protected ConditionValue getCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param template The value of template as equal.
     */
    public void setTemplate_Equal(String template) {
        regTemplate(CK_EQ, fRES(template));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param template The value of template as notEqual.
     */
    public void setTemplate_NotEqual(String template) {
        regTemplate(CK_NE, fRES(template));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param template The value of template as greaterThan.
     */
    public void setTemplate_GreaterThan(String template) {
        regTemplate(CK_GT, fRES(template));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param template The value of template as lessThan.
     */
    public void setTemplate_LessThan(String template) {
        regTemplate(CK_LT, fRES(template));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param template The value of template as greaterEqual.
     */
    public void setTemplate_GreaterEqual(String template) {
        regTemplate(CK_GE, fRES(template));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param template The value of template as lessEqual.
     */
    public void setTemplate_LessEqual(String template) {
        regTemplate(CK_LE, fRES(template));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param template The value of template as prefixSearch.
     */
    public void setTemplate_PrefixSearch(String template) {
        regTemplate(CK_PS, fRES(template));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param templateList The collection of template as inScope.
     */
    public void setTemplate_InScope(Collection<String> templateList) {
        regTemplate(CK_INS, cTL(templateList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param template The value of template as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTemplate_LikeSearch(String template, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(template), getCValueTemplate(), "Template", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param template The value of template as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTemplate_NotLikeSearch(String template, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(template), getCValueTemplate(), "Template", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTemplate_IsNull() { regTemplate(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTemplate_IsNotNull() { regTemplate(CK_ISNN, DOBJ); }

    protected void regTemplate(ConditionKey k, Object v) { regQ(k, v, getCValueTemplate(), "Template"); }
    abstract protected ConditionValue getCValueTemplate();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TTemplateCB.class.getName(); }
    String xCQ() { return TTemplateCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
