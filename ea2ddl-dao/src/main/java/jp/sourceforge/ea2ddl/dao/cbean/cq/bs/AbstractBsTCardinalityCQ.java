package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_cardinality.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTCardinalityCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTCardinalityCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_cardinality";
    }
    
    public String getTableSqlName() {
        return "t_cardinality";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(50)}
     * @param cardinality The value of cardinality as equal.
     */
    public void setCardinality_Equal(String cardinality) {
        regCardinality(CK_EQ, fRES(cardinality));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param cardinality The value of cardinality as notEqual.
     */
    public void setCardinality_NotEqual(String cardinality) {
        regCardinality(CK_NE, fRES(cardinality));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param cardinality The value of cardinality as greaterThan.
     */
    public void setCardinality_GreaterThan(String cardinality) {
        regCardinality(CK_GT, fRES(cardinality));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param cardinality The value of cardinality as lessThan.
     */
    public void setCardinality_LessThan(String cardinality) {
        regCardinality(CK_LT, fRES(cardinality));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param cardinality The value of cardinality as greaterEqual.
     */
    public void setCardinality_GreaterEqual(String cardinality) {
        regCardinality(CK_GE, fRES(cardinality));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param cardinality The value of cardinality as lessEqual.
     */
    public void setCardinality_LessEqual(String cardinality) {
        regCardinality(CK_LE, fRES(cardinality));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param cardinality The value of cardinality as prefixSearch.
     */
    public void setCardinality_PrefixSearch(String cardinality) {
        regCardinality(CK_PS, fRES(cardinality));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param cardinality The value of cardinality as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardinality_LikeSearch(String cardinality, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(cardinality), getCValueCardinality(), "Cardinality", "Cardinality", "cardinality", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param cardinalityList The collection of cardinality as inScope.
     */
    public void setCardinality_InScope(Collection<String> cardinalityList) {
        regCardinality(CK_INS, cTL(cardinalityList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param cardinality The collection of cardinality as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setCardinality_InScope(String cardinality, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(cardinality), getCValueCardinality(), "Cardinality", "Cardinality", "cardinality", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCardinality_IsNull() { regCardinality(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCardinality_IsNotNull() { regCardinality(CK_ISNN, DUMMY_OBJECT); }

    protected void regCardinality(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCardinality(), "Cardinality", "Cardinality", "cardinality");
    }
    protected void registerInlineCardinality(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCardinality(), "Cardinality", "Cardinality", "cardinality");
    }
    abstract protected ConditionValue getCValueCardinality();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TCardinalityCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TCardinalityCQ.class.getName(); }
}
