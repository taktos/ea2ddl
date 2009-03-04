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
 * The abstract condition-query of t_rtf.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTRtfCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTRtfCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_rtf";
    }
    
    public String getTableSqlName() {
        return "t_rtf";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param type The value of type as equal.
     */
    public void setType_Equal(String type) {
        regType(CK_EQ, fRES(type));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as notEqual.
     */
    public void setType_NotEqual(String type) {
        regType(CK_NE, fRES(type));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as greaterThan.
     */
    public void setType_GreaterThan(String type) {
        regType(CK_GT, fRES(type));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as lessThan.
     */
    public void setType_LessThan(String type) {
        regType(CK_LT, fRES(type));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as greaterEqual.
     */
    public void setType_GreaterEqual(String type) {
        regType(CK_GE, fRES(type));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as lessEqual.
     */
    public void setType_LessEqual(String type) {
        regType(CK_LE, fRES(type));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param type The value of type as prefixSearch.
     */
    public void setType_PrefixSearch(String type) {
        regType(CK_PS, fRES(type));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeList The collection of type as inScope.
     */
    public void setType_InScope(Collection<String> typeList) {
        regType(CK_INS, cTL(typeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param type The value of type as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setType_LikeSearch(String type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(type), getCValueType(), "Type", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param type The value of type as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setType_NotLikeSearch(String type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(type), getCValueType(), "Type", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setType_IsNull() { regType(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setType_IsNotNull() { regType(CK_ISNN, DOBJ); }

    protected void regType(ConditionKey k, Object v) { regQ(k, v, getCValueType(), "Type"); }
    abstract protected ConditionValue getCValueType();

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
    String xCB() { return TRtfCB.class.getName(); }
    String xCQ() { return TRtfCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
