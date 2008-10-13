package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_ocf.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTOcfCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTOcfCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_ocf";
    }
    
    public String getTableSqlName() {
        return "t_ocf";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param objecttype The value of objecttype as equal.
     */
    public void setObjecttype_Equal(String objecttype) {
        regObjecttype(CK_EQ, fRES(objecttype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param objecttype The value of objecttype as notEqual.
     */
    public void setObjecttype_NotEqual(String objecttype) {
        regObjecttype(CK_NE, fRES(objecttype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param objecttype The value of objecttype as greaterThan.
     */
    public void setObjecttype_GreaterThan(String objecttype) {
        regObjecttype(CK_GT, fRES(objecttype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param objecttype The value of objecttype as lessThan.
     */
    public void setObjecttype_LessThan(String objecttype) {
        regObjecttype(CK_LT, fRES(objecttype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param objecttype The value of objecttype as greaterEqual.
     */
    public void setObjecttype_GreaterEqual(String objecttype) {
        regObjecttype(CK_GE, fRES(objecttype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param objecttype The value of objecttype as lessEqual.
     */
    public void setObjecttype_LessEqual(String objecttype) {
        regObjecttype(CK_LE, fRES(objecttype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param objecttype The value of objecttype as prefixSearch.
     */
    public void setObjecttype_PrefixSearch(String objecttype) {
        regObjecttype(CK_PS, fRES(objecttype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param objecttype The value of objecttype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setObjecttype_LikeSearch(String objecttype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(objecttype), getCValueObjecttype(), "ObjectType", "Objecttype", "objecttype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param objecttypeList The collection of objecttype as inScope.
     */
    public void setObjecttype_InScope(Collection<String> objecttypeList) {
        regObjecttype(CK_INS, cTL(objecttypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param objecttype The collection of objecttype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setObjecttype_InScope(String objecttype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(objecttype), getCValueObjecttype(), "ObjectType", "Objecttype", "objecttype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setObjecttype_IsNull() { regObjecttype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setObjecttype_IsNotNull() { regObjecttype(CK_ISNN, DUMMY_OBJECT); }

    protected void regObjecttype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueObjecttype(), "ObjectType", "Objecttype", "objecttype");
    }
    protected void registerInlineObjecttype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueObjecttype(), "ObjectType", "Objecttype", "objecttype");
    }
    abstract protected ConditionValue getCValueObjecttype();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DOUBLE}
     * @param complexityweight The value of complexityweight as equal.
     */
    public void setComplexityweight_Equal(java.math.BigDecimal complexityweight) {
        regComplexityweight(CK_EQ, complexityweight);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param complexityweight The value of complexityweight as notEqual.
     */
    public void setComplexityweight_NotEqual(java.math.BigDecimal complexityweight) {
        regComplexityweight(CK_NE, complexityweight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param complexityweight The value of complexityweight as greaterThan.
     */
    public void setComplexityweight_GreaterThan(java.math.BigDecimal complexityweight) {
        regComplexityweight(CK_GT, complexityweight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param complexityweight The value of complexityweight as lessThan.
     */
    public void setComplexityweight_LessThan(java.math.BigDecimal complexityweight) {
        regComplexityweight(CK_LT, complexityweight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param complexityweight The value of complexityweight as greaterEqual.
     */
    public void setComplexityweight_GreaterEqual(java.math.BigDecimal complexityweight) {
        regComplexityweight(CK_GE, complexityweight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param complexityweight The value of complexityweight as lessEqual.
     */
    public void setComplexityweight_LessEqual(java.math.BigDecimal complexityweight) {
        regComplexityweight(CK_LE, complexityweight);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param complexityweightList The collection of complexityweight as inScope.
     */
    public void setComplexityweight_InScope(Collection<java.math.BigDecimal> complexityweightList) {
        regComplexityweight(CK_INS, cTL(complexityweightList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setComplexityweight_IsNull() { regComplexityweight(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setComplexityweight_IsNotNull() { regComplexityweight(CK_ISNN, DUMMY_OBJECT); }

    protected void regComplexityweight(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueComplexityweight(), "ComplexityWeight", "Complexityweight", "complexityweight");
    }
    protected void registerInlineComplexityweight(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueComplexityweight(), "ComplexityWeight", "Complexityweight", "complexityweight");
    }
    abstract protected ConditionValue getCValueComplexityweight();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TOcfCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TOcfCQ.class.getName(); }
}
