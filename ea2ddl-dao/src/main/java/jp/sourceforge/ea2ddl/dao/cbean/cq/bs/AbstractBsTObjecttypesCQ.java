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
 * The abstract condition-query of t_objecttypes.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTObjecttypesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjecttypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_objecttypes";
    }
    
    public String getTableSqlName() {
        return "t_objecttypes";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(50)}
     * @param objectType The value of objectType as equal.
     */
    public void setObjectType_Equal(String objectType) {
        regObjectType(CK_EQ, fRES(objectType));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectType The value of objectType as notEqual.
     */
    public void setObjectType_NotEqual(String objectType) {
        regObjectType(CK_NE, fRES(objectType));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectType The value of objectType as greaterThan.
     */
    public void setObjectType_GreaterThan(String objectType) {
        regObjectType(CK_GT, fRES(objectType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectType The value of objectType as lessThan.
     */
    public void setObjectType_LessThan(String objectType) {
        regObjectType(CK_LT, fRES(objectType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectType The value of objectType as greaterEqual.
     */
    public void setObjectType_GreaterEqual(String objectType) {
        regObjectType(CK_GE, fRES(objectType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectType The value of objectType as lessEqual.
     */
    public void setObjectType_LessEqual(String objectType) {
        regObjectType(CK_LE, fRES(objectType));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectType The value of objectType as prefixSearch.
     */
    public void setObjectType_PrefixSearch(String objectType) {
        regObjectType(CK_PS, fRES(objectType));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param objectTypeList The collection of objectType as inScope.
     */
    public void setObjectType_InScope(Collection<String> objectTypeList) {
        regObjectType(CK_INS, cTL(objectTypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param objectType The value of objectType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setObjectType_LikeSearch(String objectType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(objectType), getCValueObjectType(), "Object_Type", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param objectType The value of objectType as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setObjectType_NotLikeSearch(String objectType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(objectType), getCValueObjectType(), "Object_Type", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setObjectType_IsNull() { regObjectType(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setObjectType_IsNotNull() { regObjectType(CK_ISNN, DOBJ); }

    protected void regObjectType(ConditionKey k, Object v) { regQ(k, v, getCValueObjectType(), "Object_Type"); }
    abstract protected ConditionValue getCValueObjectType();

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
     * @param designobject The value of designobject as equal.
     */
    public void setDesignobject_Equal(Boolean designobject) {
        regDesignobject(CK_EQ, designobject);
    }

    protected void regDesignobject(ConditionKey k, Object v) { regQ(k, v, getCValueDesignobject(), "DesignObject"); }
    abstract protected ConditionValue getCValueDesignobject();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {SMALLINT}
     * @param imageid The value of imageid as equal.
     */
    public void setImageid_Equal(java.lang.Integer imageid) {
        regImageid(CK_EQ, imageid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param imageid The value of imageid as notEqual.
     */
    public void setImageid_NotEqual(java.lang.Integer imageid) {
        regImageid(CK_NE, imageid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param imageid The value of imageid as greaterThan.
     */
    public void setImageid_GreaterThan(java.lang.Integer imageid) {
        regImageid(CK_GT, imageid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param imageid The value of imageid as lessThan.
     */
    public void setImageid_LessThan(java.lang.Integer imageid) {
        regImageid(CK_LT, imageid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param imageid The value of imageid as greaterEqual.
     */
    public void setImageid_GreaterEqual(java.lang.Integer imageid) {
        regImageid(CK_GE, imageid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param imageid The value of imageid as lessEqual.
     */
    public void setImageid_LessEqual(java.lang.Integer imageid) {
        regImageid(CK_LE, imageid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param imageidList The collection of imageid as inScope.
     */
    public void setImageid_InScope(Collection<java.lang.Integer> imageidList) {
        regImageid(CK_INS, cTL(imageidList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setImageid_IsNull() { regImageid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setImageid_IsNotNull() { regImageid(CK_ISNN, DOBJ); }

    protected void regImageid(ConditionKey k, Object v) { regQ(k, v, getCValueImageid(), "ImageID"); }
    abstract protected ConditionValue getCValueImageid();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TObjecttypesCB.class.getName(); }
    String xCQ() { return TObjecttypesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
