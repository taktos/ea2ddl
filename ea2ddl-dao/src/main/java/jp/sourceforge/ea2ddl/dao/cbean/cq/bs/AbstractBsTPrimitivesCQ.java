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
 * The abstract condition-query of t_primitives.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPrimitivesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPrimitivesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_primitives";
    }
    
    public String getTableSqlName() {
        return "t_primitives";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(50)}
     * @param datatype The value of datatype as equal.
     */
    public void setDatatype_Equal(String datatype) {
        regDatatype(CK_EQ, fRES(datatype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param datatype The value of datatype as notEqual.
     */
    public void setDatatype_NotEqual(String datatype) {
        regDatatype(CK_NE, fRES(datatype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param datatype The value of datatype as greaterThan.
     */
    public void setDatatype_GreaterThan(String datatype) {
        regDatatype(CK_GT, fRES(datatype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param datatype The value of datatype as lessThan.
     */
    public void setDatatype_LessThan(String datatype) {
        regDatatype(CK_LT, fRES(datatype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param datatype The value of datatype as greaterEqual.
     */
    public void setDatatype_GreaterEqual(String datatype) {
        regDatatype(CK_GE, fRES(datatype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param datatype The value of datatype as lessEqual.
     */
    public void setDatatype_LessEqual(String datatype) {
        regDatatype(CK_LE, fRES(datatype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param datatype The value of datatype as prefixSearch.
     */
    public void setDatatype_PrefixSearch(String datatype) {
        regDatatype(CK_PS, fRES(datatype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param datatypeList The collection of datatype as inScope.
     */
    public void setDatatype_InScope(Collection<String> datatypeList) {
        regDatatype(CK_INS, cTL(datatypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param datatype The value of datatype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDatatype_LikeSearch(String datatype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(datatype), getCValueDatatype(), "Datatype", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param datatype The value of datatype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDatatype_NotLikeSearch(String datatype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(datatype), getCValueDatatype(), "Datatype", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDatatype_IsNull() { regDatatype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDatatype_IsNotNull() { regDatatype(CK_ISNN, DOBJ); }

    protected void regDatatype(ConditionKey k, Object v) { regQ(k, v, getCValueDatatype(), "Datatype"); }
    abstract protected ConditionValue getCValueDatatype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
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

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TPrimitivesCB.class.getName(); }
    String xCQ() { return TPrimitivesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
