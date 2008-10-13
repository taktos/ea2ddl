package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_rtf.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTRtfCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTRtfCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_rtf";
    }
    
    public String getTableSqlName() {
        return "t_rtf";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param type The value of type as equal.
     */
    public void setType_Equal(String type) {
        regType(CK_EQ, fRES(type));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as notEqual.
     */
    public void setType_NotEqual(String type) {
        regType(CK_NE, fRES(type));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as greaterThan.
     */
    public void setType_GreaterThan(String type) {
        regType(CK_GT, fRES(type));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as lessThan.
     */
    public void setType_LessThan(String type) {
        regType(CK_LT, fRES(type));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as greaterEqual.
     */
    public void setType_GreaterEqual(String type) {
        regType(CK_GE, fRES(type));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as lessEqual.
     */
    public void setType_LessEqual(String type) {
        regType(CK_LE, fRES(type));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param type The value of type as prefixSearch.
     */
    public void setType_PrefixSearch(String type) {
        regType(CK_PS, fRES(type));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param type The value of type as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setType_LikeSearch(String type, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(type), getCValueType(), "Type", "Type", "type", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeList The collection of type as inScope.
     */
    public void setType_InScope(Collection<String> typeList) {
        regType(CK_INS, cTL(typeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param type The collection of type as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setType_InScope(String type, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(type), getCValueType(), "Type", "Type", "type", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setType_IsNull() { regType(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setType_IsNotNull() { regType(CK_ISNN, DUMMY_OBJECT); }

    protected void regType(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueType(), "Type", "Type", "type");
    }
    protected void registerInlineType(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueType(), "Type", "Type", "type");
    }
    abstract protected ConditionValue getCValueType();

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
    protected String getConditionBeanClassNameInternally() { return TRtfCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TRtfCQ.class.getName(); }
}
