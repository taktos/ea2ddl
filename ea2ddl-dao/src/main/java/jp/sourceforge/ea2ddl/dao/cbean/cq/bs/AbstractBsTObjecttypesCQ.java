package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_objecttypes.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTObjecttypesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjecttypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(50)}
     * @param objectType The value of objectType as equal.
     */
    public void setObjectType_Equal(String objectType) {
        regObjectType(CK_EQ, fRES(objectType));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectType The value of objectType as notEqual.
     */
    public void setObjectType_NotEqual(String objectType) {
        regObjectType(CK_NE, fRES(objectType));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectType The value of objectType as greaterThan.
     */
    public void setObjectType_GreaterThan(String objectType) {
        regObjectType(CK_GT, fRES(objectType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectType The value of objectType as lessThan.
     */
    public void setObjectType_LessThan(String objectType) {
        regObjectType(CK_LT, fRES(objectType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectType The value of objectType as greaterEqual.
     */
    public void setObjectType_GreaterEqual(String objectType) {
        regObjectType(CK_GE, fRES(objectType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectType The value of objectType as lessEqual.
     */
    public void setObjectType_LessEqual(String objectType) {
        regObjectType(CK_LE, fRES(objectType));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectType The value of objectType as prefixSearch.
     */
    public void setObjectType_PrefixSearch(String objectType) {
        regObjectType(CK_PS, fRES(objectType));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param objectType The value of objectType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setObjectType_LikeSearch(String objectType, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(objectType), getCValueObjectType(), "Object_Type", "ObjectType", "objectType", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param objectTypeList The collection of objectType as inScope.
     */
    public void setObjectType_InScope(Collection<String> objectTypeList) {
        regObjectType(CK_INS, cTL(objectTypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param objectType The collection of objectType as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setObjectType_InScope(String objectType, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(objectType), getCValueObjectType(), "Object_Type", "ObjectType", "objectType", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setObjectType_IsNull() { regObjectType(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setObjectType_IsNotNull() { regObjectType(CK_ISNN, DUMMY_OBJECT); }

    protected void regObjectType(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueObjectType(), "Object_Type", "ObjectType", "objectType");
    }
    protected void registerInlineObjectType(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueObjectType(), "Object_Type", "ObjectType", "objectType");
    }
    abstract protected ConditionValue getCValueObjectType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param description The value of description as equal.
     */
    public void setDescription_Equal(String description) {
        regDescription(CK_EQ, fRES(description));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as notEqual.
     */
    public void setDescription_NotEqual(String description) {
        regDescription(CK_NE, fRES(description));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as greaterThan.
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as lessThan.
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as greaterEqual.
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as lessEqual.
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param description The value of description as prefixSearch.
     */
    public void setDescription_PrefixSearch(String description) {
        regDescription(CK_PS, fRES(description));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param description The value of description as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(description), getCValueDescription(), "Description", "Description", "description", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param descriptionList The collection of description as inScope.
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        regDescription(CK_INS, cTL(descriptionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param description The collection of description as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDescription_InScope(String description, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(description), getCValueDescription(), "Description", "Description", "description", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDescription_IsNull() { regDescription(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDescription_IsNotNull() { regDescription(CK_ISNN, DUMMY_OBJECT); }

    protected void regDescription(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDescription(), "Description", "Description", "description");
    }
    protected void registerInlineDescription(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDescription(), "Description", "Description", "description");
    }
    abstract protected ConditionValue getCValueDescription();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param designobject The value of designobject as equal.
     */
    public void setDesignobject_Equal(Boolean designobject) {
        regDesignobject(CK_EQ, designobject);
    }

    protected void regDesignobject(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDesignobject(), "DesignObject", "Designobject", "designobject");
    }
    protected void registerInlineDesignobject(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDesignobject(), "DesignObject", "Designobject", "designobject");
    }
    abstract protected ConditionValue getCValueDesignobject();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {SMALLINT}
     * @param imageid The value of imageid as equal.
     */
    public void setImageid_Equal(java.lang.Integer imageid) {
        regImageid(CK_EQ, imageid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param imageid The value of imageid as notEqual.
     */
    public void setImageid_NotEqual(java.lang.Integer imageid) {
        regImageid(CK_NE, imageid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param imageid The value of imageid as greaterThan.
     */
    public void setImageid_GreaterThan(java.lang.Integer imageid) {
        regImageid(CK_GT, imageid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param imageid The value of imageid as lessThan.
     */
    public void setImageid_LessThan(java.lang.Integer imageid) {
        regImageid(CK_LT, imageid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param imageid The value of imageid as greaterEqual.
     */
    public void setImageid_GreaterEqual(java.lang.Integer imageid) {
        regImageid(CK_GE, imageid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setImageid_IsNull() { regImageid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setImageid_IsNotNull() { regImageid(CK_ISNN, DUMMY_OBJECT); }

    protected void regImageid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueImageid(), "ImageID", "Imageid", "imageid");
    }
    protected void registerInlineImageid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueImageid(), "ImageID", "Imageid", "imageid");
    }
    abstract protected ConditionValue getCValueImageid();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TObjecttypesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TObjecttypesCQ.class.getName(); }
}
