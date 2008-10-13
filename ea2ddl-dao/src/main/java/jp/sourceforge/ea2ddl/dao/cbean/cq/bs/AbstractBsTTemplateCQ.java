package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_template.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTTemplateCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTemplateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(40)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param templatetype The value of templatetype as equal.
     */
    public void setTemplatetype_Equal(String templatetype) {
        regTemplatetype(CK_EQ, fRES(templatetype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param templatetype The value of templatetype as notEqual.
     */
    public void setTemplatetype_NotEqual(String templatetype) {
        regTemplatetype(CK_NE, fRES(templatetype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param templatetype The value of templatetype as greaterThan.
     */
    public void setTemplatetype_GreaterThan(String templatetype) {
        regTemplatetype(CK_GT, fRES(templatetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param templatetype The value of templatetype as lessThan.
     */
    public void setTemplatetype_LessThan(String templatetype) {
        regTemplatetype(CK_LT, fRES(templatetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param templatetype The value of templatetype as greaterEqual.
     */
    public void setTemplatetype_GreaterEqual(String templatetype) {
        regTemplatetype(CK_GE, fRES(templatetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param templatetype The value of templatetype as lessEqual.
     */
    public void setTemplatetype_LessEqual(String templatetype) {
        regTemplatetype(CK_LE, fRES(templatetype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param templatetype The value of templatetype as prefixSearch.
     */
    public void setTemplatetype_PrefixSearch(String templatetype) {
        regTemplatetype(CK_PS, fRES(templatetype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param templatetype The value of templatetype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTemplatetype_LikeSearch(String templatetype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(templatetype), getCValueTemplatetype(), "TemplateType", "Templatetype", "templatetype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param templatetypeList The collection of templatetype as inScope.
     */
    public void setTemplatetype_InScope(Collection<String> templatetypeList) {
        regTemplatetype(CK_INS, cTL(templatetypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param templatetype The collection of templatetype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTemplatetype_InScope(String templatetype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(templatetype), getCValueTemplatetype(), "TemplateType", "Templatetype", "templatetype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTemplatetype_IsNull() { regTemplatetype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTemplatetype_IsNotNull() { regTemplatetype(CK_ISNN, DUMMY_OBJECT); }

    protected void regTemplatetype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTemplatetype(), "TemplateType", "Templatetype", "templatetype");
    }
    protected void registerInlineTemplatetype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTemplatetype(), "TemplateType", "Templatetype", "templatetype");
    }
    abstract protected ConditionValue getCValueTemplatetype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(100)}
     * @param templatename The value of templatename as equal.
     */
    public void setTemplatename_Equal(String templatename) {
        regTemplatename(CK_EQ, fRES(templatename));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param templatename The value of templatename as notEqual.
     */
    public void setTemplatename_NotEqual(String templatename) {
        regTemplatename(CK_NE, fRES(templatename));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param templatename The value of templatename as greaterThan.
     */
    public void setTemplatename_GreaterThan(String templatename) {
        regTemplatename(CK_GT, fRES(templatename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param templatename The value of templatename as lessThan.
     */
    public void setTemplatename_LessThan(String templatename) {
        regTemplatename(CK_LT, fRES(templatename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param templatename The value of templatename as greaterEqual.
     */
    public void setTemplatename_GreaterEqual(String templatename) {
        regTemplatename(CK_GE, fRES(templatename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param templatename The value of templatename as lessEqual.
     */
    public void setTemplatename_LessEqual(String templatename) {
        regTemplatename(CK_LE, fRES(templatename));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param templatename The value of templatename as prefixSearch.
     */
    public void setTemplatename_PrefixSearch(String templatename) {
        regTemplatename(CK_PS, fRES(templatename));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param templatename The value of templatename as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTemplatename_LikeSearch(String templatename, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(templatename), getCValueTemplatename(), "TemplateName", "Templatename", "templatename", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param templatenameList The collection of templatename as inScope.
     */
    public void setTemplatename_InScope(Collection<String> templatenameList) {
        regTemplatename(CK_INS, cTL(templatenameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param templatename The collection of templatename as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTemplatename_InScope(String templatename, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(templatename), getCValueTemplatename(), "TemplateName", "Templatename", "templatename", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTemplatename_IsNull() { regTemplatename(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTemplatename_IsNotNull() { regTemplatename(CK_ISNN, DUMMY_OBJECT); }

    protected void regTemplatename(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTemplatename(), "TemplateName", "Templatename", "templatename");
    }
    protected void registerInlineTemplatename(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTemplatename(), "TemplateName", "Templatename", "templatename");
    }
    abstract protected ConditionValue getCValueTemplatename();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(String notes) {
        regNotes(CK_EQ, fRES(notes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(String notes) {
        regNotes(CK_NE, fRES(notes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(String notes) {
        regNotes(CK_PS, fRES(notes));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(notes), getCValueNotes(), "Notes", "Notes", "notes", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(Collection<String> notesList) {
        regNotes(CK_INS, cTL(notesList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notes The collection of notes as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setNotes_InScope(String notes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(notes), getCValueNotes(), "Notes", "Notes", "notes", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DUMMY_OBJECT); }

    protected void regNotes(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNotes(), "Notes", "Notes", "notes");
    }
    protected void registerInlineNotes(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNotes(), "Notes", "Notes", "notes");
    }
    abstract protected ConditionValue getCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param template The value of template as equal.
     */
    public void setTemplate_Equal(String template) {
        regTemplate(CK_EQ, fRES(template));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param template The value of template as notEqual.
     */
    public void setTemplate_NotEqual(String template) {
        regTemplate(CK_NE, fRES(template));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param template The value of template as greaterThan.
     */
    public void setTemplate_GreaterThan(String template) {
        regTemplate(CK_GT, fRES(template));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param template The value of template as lessThan.
     */
    public void setTemplate_LessThan(String template) {
        regTemplate(CK_LT, fRES(template));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param template The value of template as greaterEqual.
     */
    public void setTemplate_GreaterEqual(String template) {
        regTemplate(CK_GE, fRES(template));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param template The value of template as lessEqual.
     */
    public void setTemplate_LessEqual(String template) {
        regTemplate(CK_LE, fRES(template));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param template The value of template as prefixSearch.
     */
    public void setTemplate_PrefixSearch(String template) {
        regTemplate(CK_PS, fRES(template));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param template The value of template as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTemplate_LikeSearch(String template, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(template), getCValueTemplate(), "Template", "Template", "template", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param templateList The collection of template as inScope.
     */
    public void setTemplate_InScope(Collection<String> templateList) {
        regTemplate(CK_INS, cTL(templateList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param template The collection of template as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setTemplate_InScope(String template, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(template), getCValueTemplate(), "Template", "Template", "template", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTemplate_IsNull() { regTemplate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTemplate_IsNotNull() { regTemplate(CK_ISNN, DUMMY_OBJECT); }

    protected void regTemplate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTemplate(), "Template", "Template", "template");
    }
    protected void registerInlineTemplate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTemplate(), "Template", "Template", "template");
    }
    abstract protected ConditionValue getCValueTemplate();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TTemplateCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TTemplateCQ.class.getName(); }
}
