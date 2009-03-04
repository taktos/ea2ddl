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
 * The abstract condition-query of t_cardinality.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTCardinalityCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTCardinalityCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_cardinality";
    }
    
    public String getTableSqlName() {
        return "t_cardinality";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(50)}
     * @param cardinality The value of cardinality as equal.
     */
    public void setCardinality_Equal(String cardinality) {
        regCardinality(CK_EQ, fRES(cardinality));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param cardinality The value of cardinality as notEqual.
     */
    public void setCardinality_NotEqual(String cardinality) {
        regCardinality(CK_NE, fRES(cardinality));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param cardinality The value of cardinality as greaterThan.
     */
    public void setCardinality_GreaterThan(String cardinality) {
        regCardinality(CK_GT, fRES(cardinality));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param cardinality The value of cardinality as lessThan.
     */
    public void setCardinality_LessThan(String cardinality) {
        regCardinality(CK_LT, fRES(cardinality));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param cardinality The value of cardinality as greaterEqual.
     */
    public void setCardinality_GreaterEqual(String cardinality) {
        regCardinality(CK_GE, fRES(cardinality));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param cardinality The value of cardinality as lessEqual.
     */
    public void setCardinality_LessEqual(String cardinality) {
        regCardinality(CK_LE, fRES(cardinality));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param cardinality The value of cardinality as prefixSearch.
     */
    public void setCardinality_PrefixSearch(String cardinality) {
        regCardinality(CK_PS, fRES(cardinality));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param cardinalityList The collection of cardinality as inScope.
     */
    public void setCardinality_InScope(Collection<String> cardinalityList) {
        regCardinality(CK_INS, cTL(cardinalityList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param cardinality The value of cardinality as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardinality_LikeSearch(String cardinality, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardinality), getCValueCardinality(), "Cardinality", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param cardinality The value of cardinality as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardinality_NotLikeSearch(String cardinality, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardinality), getCValueCardinality(), "Cardinality", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setCardinality_IsNull() { regCardinality(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setCardinality_IsNotNull() { regCardinality(CK_ISNN, DOBJ); }

    protected void regCardinality(ConditionKey k, Object v) { regQ(k, v, getCValueCardinality(), "Cardinality"); }
    abstract protected ConditionValue getCValueCardinality();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TCardinalityCB.class.getName(); }
    String xCQ() { return TCardinalityCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
