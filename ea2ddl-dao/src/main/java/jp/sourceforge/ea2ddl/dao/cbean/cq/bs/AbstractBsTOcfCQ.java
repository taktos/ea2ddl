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
 * The abstract condition-query of t_ocf.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTOcfCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTOcfCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_ocf";
    }
    
    public String getTableSqlName() {
        return "t_ocf";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param objecttype The value of objecttype as equal.
     */
    public void setObjecttype_Equal(String objecttype) {
        regObjecttype(CK_EQ, fRES(objecttype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objecttype The value of objecttype as notEqual.
     */
    public void setObjecttype_NotEqual(String objecttype) {
        regObjecttype(CK_NE, fRES(objecttype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objecttype The value of objecttype as greaterThan.
     */
    public void setObjecttype_GreaterThan(String objecttype) {
        regObjecttype(CK_GT, fRES(objecttype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objecttype The value of objecttype as lessThan.
     */
    public void setObjecttype_LessThan(String objecttype) {
        regObjecttype(CK_LT, fRES(objecttype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objecttype The value of objecttype as greaterEqual.
     */
    public void setObjecttype_GreaterEqual(String objecttype) {
        regObjecttype(CK_GE, fRES(objecttype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objecttype The value of objecttype as lessEqual.
     */
    public void setObjecttype_LessEqual(String objecttype) {
        regObjecttype(CK_LE, fRES(objecttype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objecttype The value of objecttype as prefixSearch.
     */
    public void setObjecttype_PrefixSearch(String objecttype) {
        regObjecttype(CK_PS, fRES(objecttype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param objecttypeList The collection of objecttype as inScope.
     */
    public void setObjecttype_InScope(Collection<String> objecttypeList) {
        regObjecttype(CK_INS, cTL(objecttypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param objecttype The value of objecttype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setObjecttype_LikeSearch(String objecttype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(objecttype), getCValueObjecttype(), "ObjectType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param objecttype The value of objecttype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setObjecttype_NotLikeSearch(String objecttype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(objecttype), getCValueObjecttype(), "ObjectType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setObjecttype_IsNull() { regObjecttype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setObjecttype_IsNotNull() { regObjecttype(CK_ISNN, DOBJ); }

    protected void regObjecttype(ConditionKey k, Object v) { regQ(k, v, getCValueObjecttype(), "ObjectType"); }
    abstract protected ConditionValue getCValueObjecttype();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DOUBLE}
     * @param complexityweight The value of complexityweight as equal.
     */
    public void setComplexityweight_Equal(java.math.BigDecimal complexityweight) {
        regComplexityweight(CK_EQ, complexityweight);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param complexityweight The value of complexityweight as notEqual.
     */
    public void setComplexityweight_NotEqual(java.math.BigDecimal complexityweight) {
        regComplexityweight(CK_NE, complexityweight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param complexityweight The value of complexityweight as greaterThan.
     */
    public void setComplexityweight_GreaterThan(java.math.BigDecimal complexityweight) {
        regComplexityweight(CK_GT, complexityweight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param complexityweight The value of complexityweight as lessThan.
     */
    public void setComplexityweight_LessThan(java.math.BigDecimal complexityweight) {
        regComplexityweight(CK_LT, complexityweight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param complexityweight The value of complexityweight as greaterEqual.
     */
    public void setComplexityweight_GreaterEqual(java.math.BigDecimal complexityweight) {
        regComplexityweight(CK_GE, complexityweight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setComplexityweight_IsNull() { regComplexityweight(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setComplexityweight_IsNotNull() { regComplexityweight(CK_ISNN, DOBJ); }

    protected void regComplexityweight(ConditionKey k, Object v) { regQ(k, v, getCValueComplexityweight(), "ComplexityWeight"); }
    abstract protected ConditionValue getCValueComplexityweight();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TOcfCB.class.getName(); }
    String xCQ() { return TOcfCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
