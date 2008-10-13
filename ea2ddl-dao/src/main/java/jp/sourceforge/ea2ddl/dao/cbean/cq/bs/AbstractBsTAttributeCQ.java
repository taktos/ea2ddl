package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_attribute.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTAttributeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTAttributeCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_attribute";
    }
    
    public String getTableSqlName() {
        return "t_attribute";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param objectId The value of objectId as equal.
     */
    public void setObjectId_Equal(java.lang.Integer objectId) {
        regObjectId(CK_EQ, objectId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as notEqual.
     */
    public void setObjectId_NotEqual(java.lang.Integer objectId) {
        regObjectId(CK_NE, objectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as greaterThan.
     */
    public void setObjectId_GreaterThan(java.lang.Integer objectId) {
        regObjectId(CK_GT, objectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as lessThan.
     */
    public void setObjectId_LessThan(java.lang.Integer objectId) {
        regObjectId(CK_LT, objectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as greaterEqual.
     */
    public void setObjectId_GreaterEqual(java.lang.Integer objectId) {
        regObjectId(CK_GE, objectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as lessEqual.
     */
    public void setObjectId_LessEqual(java.lang.Integer objectId) {
        regObjectId(CK_LE, objectId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param objectIdList The collection of objectId as inScope.
     */
    public void setObjectId_InScope(Collection<java.lang.Integer> objectIdList) {
        regObjectId(CK_INS, cTL(objectIdList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setObjectId_IsNull() { regObjectId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setObjectId_IsNotNull() { regObjectId(CK_ISNN, DUMMY_OBJECT); }

    protected void regObjectId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueObjectId(), "Object_ID", "ObjectId", "objectId");
    }
    protected void registerInlineObjectId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueObjectId(), "Object_ID", "ObjectId", "objectId");
    }
    abstract protected ConditionValue getCValueObjectId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param name The value of name as equal.
     */
    public void setName_Equal(String name) {
        regName(CK_EQ, fRES(name));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as notEqual.
     */
    public void setName_NotEqual(String name) {
        regName(CK_NE, fRES(name));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(String name) {
        regName(CK_PS, fRES(name));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(name), getCValueName(), "Name", "Name", "name", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param nameList The collection of name as inScope.
     */
    public void setName_InScope(Collection<String> nameList) {
        regName(CK_INS, cTL(nameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param name The collection of name as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setName_InScope(String name, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(name), getCValueName(), "Name", "Name", "name", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setName_IsNull() { regName(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DUMMY_OBJECT); }

    protected void regName(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueName(), "Name", "Name", "name");
    }
    protected void registerInlineName(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueName(), "Name", "Name", "name");
    }
    abstract protected ConditionValue getCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param scope The value of scope as equal.
     */
    public void setScope_Equal(String scope) {
        regScope(CK_EQ, fRES(scope));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param scope The value of scope as notEqual.
     */
    public void setScope_NotEqual(String scope) {
        regScope(CK_NE, fRES(scope));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param scope The value of scope as greaterThan.
     */
    public void setScope_GreaterThan(String scope) {
        regScope(CK_GT, fRES(scope));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param scope The value of scope as lessThan.
     */
    public void setScope_LessThan(String scope) {
        regScope(CK_LT, fRES(scope));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param scope The value of scope as greaterEqual.
     */
    public void setScope_GreaterEqual(String scope) {
        regScope(CK_GE, fRES(scope));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param scope The value of scope as lessEqual.
     */
    public void setScope_LessEqual(String scope) {
        regScope(CK_LE, fRES(scope));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param scope The value of scope as prefixSearch.
     */
    public void setScope_PrefixSearch(String scope) {
        regScope(CK_PS, fRES(scope));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scope The value of scope as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScope_LikeSearch(String scope, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(scope), getCValueScope(), "Scope", "Scope", "scope", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param scopeList The collection of scope as inScope.
     */
    public void setScope_InScope(Collection<String> scopeList) {
        regScope(CK_INS, cTL(scopeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param scope The collection of scope as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setScope_InScope(String scope, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(scope), getCValueScope(), "Scope", "Scope", "scope", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setScope_IsNull() { regScope(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setScope_IsNotNull() { regScope(CK_ISNN, DUMMY_OBJECT); }

    protected void regScope(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueScope(), "Scope", "Scope", "scope");
    }
    protected void registerInlineScope(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueScope(), "Scope", "Scope", "scope");
    }
    abstract protected ConditionValue getCValueScope();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param stereotype The value of stereotype as equal.
     */
    public void setStereotype_Equal(String stereotype) {
        regStereotype(CK_EQ, fRES(stereotype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as notEqual.
     */
    public void setStereotype_NotEqual(String stereotype) {
        regStereotype(CK_NE, fRES(stereotype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as greaterThan.
     */
    public void setStereotype_GreaterThan(String stereotype) {
        regStereotype(CK_GT, fRES(stereotype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as lessThan.
     */
    public void setStereotype_LessThan(String stereotype) {
        regStereotype(CK_LT, fRES(stereotype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as greaterEqual.
     */
    public void setStereotype_GreaterEqual(String stereotype) {
        regStereotype(CK_GE, fRES(stereotype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as lessEqual.
     */
    public void setStereotype_LessEqual(String stereotype) {
        regStereotype(CK_LE, fRES(stereotype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param stereotype The value of stereotype as prefixSearch.
     */
    public void setStereotype_PrefixSearch(String stereotype) {
        regStereotype(CK_PS, fRES(stereotype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stereotype The value of stereotype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStereotype_LikeSearch(String stereotype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(stereotype), getCValueStereotype(), "Stereotype", "Stereotype", "stereotype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stereotypeList The collection of stereotype as inScope.
     */
    public void setStereotype_InScope(Collection<String> stereotypeList) {
        regStereotype(CK_INS, cTL(stereotypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stereotype The collection of stereotype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStereotype_InScope(String stereotype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(stereotype), getCValueStereotype(), "Stereotype", "Stereotype", "stereotype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStereotype_IsNull() { regStereotype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStereotype_IsNotNull() { regStereotype(CK_ISNN, DUMMY_OBJECT); }

    protected void regStereotype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStereotype(), "Stereotype", "Stereotype", "stereotype");
    }
    protected void registerInlineStereotype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStereotype(), "Stereotype", "Stereotype", "stereotype");
    }
    abstract protected ConditionValue getCValueStereotype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param containment The value of containment as equal.
     */
    public void setContainment_Equal(String containment) {
        regContainment(CK_EQ, fRES(containment));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param containment The value of containment as notEqual.
     */
    public void setContainment_NotEqual(String containment) {
        regContainment(CK_NE, fRES(containment));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param containment The value of containment as greaterThan.
     */
    public void setContainment_GreaterThan(String containment) {
        regContainment(CK_GT, fRES(containment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param containment The value of containment as lessThan.
     */
    public void setContainment_LessThan(String containment) {
        regContainment(CK_LT, fRES(containment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param containment The value of containment as greaterEqual.
     */
    public void setContainment_GreaterEqual(String containment) {
        regContainment(CK_GE, fRES(containment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param containment The value of containment as lessEqual.
     */
    public void setContainment_LessEqual(String containment) {
        regContainment(CK_LE, fRES(containment));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param containment The value of containment as prefixSearch.
     */
    public void setContainment_PrefixSearch(String containment) {
        regContainment(CK_PS, fRES(containment));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param containment The value of containment as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setContainment_LikeSearch(String containment, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(containment), getCValueContainment(), "Containment", "Containment", "containment", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param containmentList The collection of containment as inScope.
     */
    public void setContainment_InScope(Collection<String> containmentList) {
        regContainment(CK_INS, cTL(containmentList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param containment The collection of containment as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setContainment_InScope(String containment, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(containment), getCValueContainment(), "Containment", "Containment", "containment", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setContainment_IsNull() { regContainment(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setContainment_IsNotNull() { regContainment(CK_ISNN, DUMMY_OBJECT); }

    protected void regContainment(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueContainment(), "Containment", "Containment", "containment");
    }
    protected void registerInlineContainment(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueContainment(), "Containment", "Containment", "containment");
    }
    abstract protected ConditionValue getCValueContainment();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param isstatic The value of isstatic as equal.
     */
    public void setIsstatic_Equal(java.lang.Integer isstatic) {
        regIsstatic(CK_EQ, isstatic);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param isstatic The value of isstatic as notEqual.
     */
    public void setIsstatic_NotEqual(java.lang.Integer isstatic) {
        regIsstatic(CK_NE, isstatic);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param isstatic The value of isstatic as greaterThan.
     */
    public void setIsstatic_GreaterThan(java.lang.Integer isstatic) {
        regIsstatic(CK_GT, isstatic);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param isstatic The value of isstatic as lessThan.
     */
    public void setIsstatic_LessThan(java.lang.Integer isstatic) {
        regIsstatic(CK_LT, isstatic);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param isstatic The value of isstatic as greaterEqual.
     */
    public void setIsstatic_GreaterEqual(java.lang.Integer isstatic) {
        regIsstatic(CK_GE, isstatic);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param isstatic The value of isstatic as lessEqual.
     */
    public void setIsstatic_LessEqual(java.lang.Integer isstatic) {
        regIsstatic(CK_LE, isstatic);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param isstaticList The collection of isstatic as inScope.
     */
    public void setIsstatic_InScope(Collection<java.lang.Integer> isstaticList) {
        regIsstatic(CK_INS, cTL(isstaticList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setIsstatic_IsNull() { regIsstatic(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setIsstatic_IsNotNull() { regIsstatic(CK_ISNN, DUMMY_OBJECT); }

    protected void regIsstatic(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIsstatic(), "IsStatic", "Isstatic", "isstatic");
    }
    protected void registerInlineIsstatic(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIsstatic(), "IsStatic", "Isstatic", "isstatic");
    }
    abstract protected ConditionValue getCValueIsstatic();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param iscollection The value of iscollection as equal.
     */
    public void setIscollection_Equal(java.lang.Integer iscollection) {
        regIscollection(CK_EQ, iscollection);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param iscollection The value of iscollection as notEqual.
     */
    public void setIscollection_NotEqual(java.lang.Integer iscollection) {
        regIscollection(CK_NE, iscollection);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param iscollection The value of iscollection as greaterThan.
     */
    public void setIscollection_GreaterThan(java.lang.Integer iscollection) {
        regIscollection(CK_GT, iscollection);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param iscollection The value of iscollection as lessThan.
     */
    public void setIscollection_LessThan(java.lang.Integer iscollection) {
        regIscollection(CK_LT, iscollection);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param iscollection The value of iscollection as greaterEqual.
     */
    public void setIscollection_GreaterEqual(java.lang.Integer iscollection) {
        regIscollection(CK_GE, iscollection);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param iscollection The value of iscollection as lessEqual.
     */
    public void setIscollection_LessEqual(java.lang.Integer iscollection) {
        regIscollection(CK_LE, iscollection);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param iscollectionList The collection of iscollection as inScope.
     */
    public void setIscollection_InScope(Collection<java.lang.Integer> iscollectionList) {
        regIscollection(CK_INS, cTL(iscollectionList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setIscollection_IsNull() { regIscollection(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setIscollection_IsNotNull() { regIscollection(CK_ISNN, DUMMY_OBJECT); }

    protected void regIscollection(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIscollection(), "IsCollection", "Iscollection", "iscollection");
    }
    protected void registerInlineIscollection(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIscollection(), "IsCollection", "Iscollection", "iscollection");
    }
    abstract protected ConditionValue getCValueIscollection();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param isordered The value of isordered as equal.
     */
    public void setIsordered_Equal(java.lang.Integer isordered) {
        regIsordered(CK_EQ, isordered);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param isordered The value of isordered as notEqual.
     */
    public void setIsordered_NotEqual(java.lang.Integer isordered) {
        regIsordered(CK_NE, isordered);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param isordered The value of isordered as greaterThan.
     */
    public void setIsordered_GreaterThan(java.lang.Integer isordered) {
        regIsordered(CK_GT, isordered);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param isordered The value of isordered as lessThan.
     */
    public void setIsordered_LessThan(java.lang.Integer isordered) {
        regIsordered(CK_LT, isordered);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param isordered The value of isordered as greaterEqual.
     */
    public void setIsordered_GreaterEqual(java.lang.Integer isordered) {
        regIsordered(CK_GE, isordered);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param isordered The value of isordered as lessEqual.
     */
    public void setIsordered_LessEqual(java.lang.Integer isordered) {
        regIsordered(CK_LE, isordered);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param isorderedList The collection of isordered as inScope.
     */
    public void setIsordered_InScope(Collection<java.lang.Integer> isorderedList) {
        regIsordered(CK_INS, cTL(isorderedList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setIsordered_IsNull() { regIsordered(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setIsordered_IsNotNull() { regIsordered(CK_ISNN, DUMMY_OBJECT); }

    protected void regIsordered(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueIsordered(), "IsOrdered", "Isordered", "isordered");
    }
    protected void registerInlineIsordered(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIsordered(), "IsOrdered", "Isordered", "isordered");
    }
    abstract protected ConditionValue getCValueIsordered();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param allowduplicates The value of allowduplicates as equal.
     */
    public void setAllowduplicates_Equal(java.lang.Integer allowduplicates) {
        regAllowduplicates(CK_EQ, allowduplicates);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param allowduplicates The value of allowduplicates as notEqual.
     */
    public void setAllowduplicates_NotEqual(java.lang.Integer allowduplicates) {
        regAllowduplicates(CK_NE, allowduplicates);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param allowduplicates The value of allowduplicates as greaterThan.
     */
    public void setAllowduplicates_GreaterThan(java.lang.Integer allowduplicates) {
        regAllowduplicates(CK_GT, allowduplicates);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param allowduplicates The value of allowduplicates as lessThan.
     */
    public void setAllowduplicates_LessThan(java.lang.Integer allowduplicates) {
        regAllowduplicates(CK_LT, allowduplicates);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param allowduplicates The value of allowduplicates as greaterEqual.
     */
    public void setAllowduplicates_GreaterEqual(java.lang.Integer allowduplicates) {
        regAllowduplicates(CK_GE, allowduplicates);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param allowduplicates The value of allowduplicates as lessEqual.
     */
    public void setAllowduplicates_LessEqual(java.lang.Integer allowduplicates) {
        regAllowduplicates(CK_LE, allowduplicates);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param allowduplicatesList The collection of allowduplicates as inScope.
     */
    public void setAllowduplicates_InScope(Collection<java.lang.Integer> allowduplicatesList) {
        regAllowduplicates(CK_INS, cTL(allowduplicatesList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setAllowduplicates_IsNull() { regAllowduplicates(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setAllowduplicates_IsNotNull() { regAllowduplicates(CK_ISNN, DUMMY_OBJECT); }

    protected void regAllowduplicates(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAllowduplicates(), "AllowDuplicates", "Allowduplicates", "allowduplicates");
    }
    protected void registerInlineAllowduplicates(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAllowduplicates(), "AllowDuplicates", "Allowduplicates", "allowduplicates");
    }
    abstract protected ConditionValue getCValueAllowduplicates();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param lowerbound The value of lowerbound as equal.
     */
    public void setLowerbound_Equal(String lowerbound) {
        regLowerbound(CK_EQ, fRES(lowerbound));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param lowerbound The value of lowerbound as notEqual.
     */
    public void setLowerbound_NotEqual(String lowerbound) {
        regLowerbound(CK_NE, fRES(lowerbound));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param lowerbound The value of lowerbound as greaterThan.
     */
    public void setLowerbound_GreaterThan(String lowerbound) {
        regLowerbound(CK_GT, fRES(lowerbound));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param lowerbound The value of lowerbound as lessThan.
     */
    public void setLowerbound_LessThan(String lowerbound) {
        regLowerbound(CK_LT, fRES(lowerbound));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param lowerbound The value of lowerbound as greaterEqual.
     */
    public void setLowerbound_GreaterEqual(String lowerbound) {
        regLowerbound(CK_GE, fRES(lowerbound));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param lowerbound The value of lowerbound as lessEqual.
     */
    public void setLowerbound_LessEqual(String lowerbound) {
        regLowerbound(CK_LE, fRES(lowerbound));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param lowerbound The value of lowerbound as prefixSearch.
     */
    public void setLowerbound_PrefixSearch(String lowerbound) {
        regLowerbound(CK_PS, fRES(lowerbound));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param lowerbound The value of lowerbound as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLowerbound_LikeSearch(String lowerbound, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(lowerbound), getCValueLowerbound(), "LowerBound", "Lowerbound", "lowerbound", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param lowerboundList The collection of lowerbound as inScope.
     */
    public void setLowerbound_InScope(Collection<String> lowerboundList) {
        regLowerbound(CK_INS, cTL(lowerboundList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param lowerbound The collection of lowerbound as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setLowerbound_InScope(String lowerbound, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(lowerbound), getCValueLowerbound(), "LowerBound", "Lowerbound", "lowerbound", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setLowerbound_IsNull() { regLowerbound(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setLowerbound_IsNotNull() { regLowerbound(CK_ISNN, DUMMY_OBJECT); }

    protected void regLowerbound(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueLowerbound(), "LowerBound", "Lowerbound", "lowerbound");
    }
    protected void registerInlineLowerbound(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLowerbound(), "LowerBound", "Lowerbound", "lowerbound");
    }
    abstract protected ConditionValue getCValueLowerbound();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param upperbound The value of upperbound as equal.
     */
    public void setUpperbound_Equal(String upperbound) {
        regUpperbound(CK_EQ, fRES(upperbound));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param upperbound The value of upperbound as notEqual.
     */
    public void setUpperbound_NotEqual(String upperbound) {
        regUpperbound(CK_NE, fRES(upperbound));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param upperbound The value of upperbound as greaterThan.
     */
    public void setUpperbound_GreaterThan(String upperbound) {
        regUpperbound(CK_GT, fRES(upperbound));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param upperbound The value of upperbound as lessThan.
     */
    public void setUpperbound_LessThan(String upperbound) {
        regUpperbound(CK_LT, fRES(upperbound));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param upperbound The value of upperbound as greaterEqual.
     */
    public void setUpperbound_GreaterEqual(String upperbound) {
        regUpperbound(CK_GE, fRES(upperbound));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param upperbound The value of upperbound as lessEqual.
     */
    public void setUpperbound_LessEqual(String upperbound) {
        regUpperbound(CK_LE, fRES(upperbound));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param upperbound The value of upperbound as prefixSearch.
     */
    public void setUpperbound_PrefixSearch(String upperbound) {
        regUpperbound(CK_PS, fRES(upperbound));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param upperbound The value of upperbound as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpperbound_LikeSearch(String upperbound, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(upperbound), getCValueUpperbound(), "UpperBound", "Upperbound", "upperbound", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param upperboundList The collection of upperbound as inScope.
     */
    public void setUpperbound_InScope(Collection<String> upperboundList) {
        regUpperbound(CK_INS, cTL(upperboundList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param upperbound The collection of upperbound as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setUpperbound_InScope(String upperbound, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(upperbound), getCValueUpperbound(), "UpperBound", "Upperbound", "upperbound", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setUpperbound_IsNull() { regUpperbound(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setUpperbound_IsNotNull() { regUpperbound(CK_ISNN, DUMMY_OBJECT); }

    protected void regUpperbound(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueUpperbound(), "UpperBound", "Upperbound", "upperbound");
    }
    protected void registerInlineUpperbound(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueUpperbound(), "UpperBound", "Upperbound", "upperbound");
    }
    abstract protected ConditionValue getCValueUpperbound();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param container The value of container as equal.
     */
    public void setContainer_Equal(String container) {
        regContainer(CK_EQ, fRES(container));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param container The value of container as notEqual.
     */
    public void setContainer_NotEqual(String container) {
        regContainer(CK_NE, fRES(container));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param container The value of container as greaterThan.
     */
    public void setContainer_GreaterThan(String container) {
        regContainer(CK_GT, fRES(container));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param container The value of container as lessThan.
     */
    public void setContainer_LessThan(String container) {
        regContainer(CK_LT, fRES(container));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param container The value of container as greaterEqual.
     */
    public void setContainer_GreaterEqual(String container) {
        regContainer(CK_GE, fRES(container));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param container The value of container as lessEqual.
     */
    public void setContainer_LessEqual(String container) {
        regContainer(CK_LE, fRES(container));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param container The value of container as prefixSearch.
     */
    public void setContainer_PrefixSearch(String container) {
        regContainer(CK_PS, fRES(container));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param container The value of container as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setContainer_LikeSearch(String container, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(container), getCValueContainer(), "Container", "Container", "container", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param containerList The collection of container as inScope.
     */
    public void setContainer_InScope(Collection<String> containerList) {
        regContainer(CK_INS, cTL(containerList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param container The collection of container as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setContainer_InScope(String container, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(container), getCValueContainer(), "Container", "Container", "container", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setContainer_IsNull() { regContainer(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setContainer_IsNotNull() { regContainer(CK_ISNN, DUMMY_OBJECT); }

    protected void regContainer(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueContainer(), "Container", "Container", "container");
    }
    protected void registerInlineContainer(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueContainer(), "Container", "Container", "container");
    }
    abstract protected ConditionValue getCValueContainer();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(1)}
     * @param derived The value of derived as equal.
     */
    public void setDerived_Equal(String derived) {
        regDerived(CK_EQ, fRES(derived));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param derived The value of derived as notEqual.
     */
    public void setDerived_NotEqual(String derived) {
        regDerived(CK_NE, fRES(derived));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param derived The value of derived as greaterThan.
     */
    public void setDerived_GreaterThan(String derived) {
        regDerived(CK_GT, fRES(derived));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param derived The value of derived as lessThan.
     */
    public void setDerived_LessThan(String derived) {
        regDerived(CK_LT, fRES(derived));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param derived The value of derived as greaterEqual.
     */
    public void setDerived_GreaterEqual(String derived) {
        regDerived(CK_GE, fRES(derived));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param derived The value of derived as lessEqual.
     */
    public void setDerived_LessEqual(String derived) {
        regDerived(CK_LE, fRES(derived));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param derived The value of derived as prefixSearch.
     */
    public void setDerived_PrefixSearch(String derived) {
        regDerived(CK_PS, fRES(derived));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param derived The value of derived as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDerived_LikeSearch(String derived, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(derived), getCValueDerived(), "Derived", "Derived", "derived", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param derivedList The collection of derived as inScope.
     */
    public void setDerived_InScope(Collection<String> derivedList) {
        regDerived(CK_INS, cTL(derivedList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param derived The collection of derived as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDerived_InScope(String derived, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(derived), getCValueDerived(), "Derived", "Derived", "derived", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDerived_IsNull() { regDerived(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDerived_IsNotNull() { regDerived(CK_ISNN, DUMMY_OBJECT); }

    protected void regDerived(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDerived(), "Derived", "Derived", "derived");
    }
    protected void registerInlineDerived(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDerived(), "Derived", "Derived", "derived");
    }
    abstract protected ConditionValue getCValueDerived();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : COUNTER : NotNull}
     * @param id The value of id as equal.
     */
    public void setId_Equal(java.lang.Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param id The value of id as notEqual.
     */
    public void setId_NotEqual(java.lang.Integer id) {
        regId(CK_NE, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param id The value of id as greaterThan.
     */
    public void setId_GreaterThan(java.lang.Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param id The value of id as lessThan.
     */
    public void setId_LessThan(java.lang.Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param id The value of id as greaterEqual.
     */
    public void setId_GreaterEqual(java.lang.Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param id The value of id as lessEqual.
     */
    public void setId_LessEqual(java.lang.Integer id) {
        regId(CK_LE, id);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param idList The collection of id as inScope.
     */
    public void setId_InScope(Collection<java.lang.Integer> idList) {
        regId(CK_INS, cTL(idList));
    }

    protected void regId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueId(), "ID", "Id", "id");
    }
    protected void registerInlineId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueId(), "ID", "Id", "id");
    }
    abstract protected ConditionValue getCValueId();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param pos The value of pos as equal.
     */
    public void setPos_Equal(java.lang.Integer pos) {
        regPos(CK_EQ, pos);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param pos The value of pos as notEqual.
     */
    public void setPos_NotEqual(java.lang.Integer pos) {
        regPos(CK_NE, pos);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param pos The value of pos as greaterThan.
     */
    public void setPos_GreaterThan(java.lang.Integer pos) {
        regPos(CK_GT, pos);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param pos The value of pos as lessThan.
     */
    public void setPos_LessThan(java.lang.Integer pos) {
        regPos(CK_LT, pos);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param pos The value of pos as greaterEqual.
     */
    public void setPos_GreaterEqual(java.lang.Integer pos) {
        regPos(CK_GE, pos);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param pos The value of pos as lessEqual.
     */
    public void setPos_LessEqual(java.lang.Integer pos) {
        regPos(CK_LE, pos);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param posList The collection of pos as inScope.
     */
    public void setPos_InScope(Collection<java.lang.Integer> posList) {
        regPos(CK_INS, cTL(posList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPos_IsNull() { regPos(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPos_IsNotNull() { regPos(CK_ISNN, DUMMY_OBJECT); }

    protected void regPos(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePos(), "Pos", "Pos", "pos");
    }
    protected void registerInlinePos(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePos(), "Pos", "Pos", "pos");
    }
    abstract protected ConditionValue getCValuePos();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param genoption The value of genoption as equal.
     */
    public void setGenoption_Equal(String genoption) {
        regGenoption(CK_EQ, fRES(genoption));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param genoption The value of genoption as notEqual.
     */
    public void setGenoption_NotEqual(String genoption) {
        regGenoption(CK_NE, fRES(genoption));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param genoption The value of genoption as greaterThan.
     */
    public void setGenoption_GreaterThan(String genoption) {
        regGenoption(CK_GT, fRES(genoption));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param genoption The value of genoption as lessThan.
     */
    public void setGenoption_LessThan(String genoption) {
        regGenoption(CK_LT, fRES(genoption));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param genoption The value of genoption as greaterEqual.
     */
    public void setGenoption_GreaterEqual(String genoption) {
        regGenoption(CK_GE, fRES(genoption));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param genoption The value of genoption as lessEqual.
     */
    public void setGenoption_LessEqual(String genoption) {
        regGenoption(CK_LE, fRES(genoption));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param genoption The value of genoption as prefixSearch.
     */
    public void setGenoption_PrefixSearch(String genoption) {
        regGenoption(CK_PS, fRES(genoption));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genoption The value of genoption as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenoption_LikeSearch(String genoption, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(genoption), getCValueGenoption(), "GenOption", "Genoption", "genoption", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genoptionList The collection of genoption as inScope.
     */
    public void setGenoption_InScope(Collection<String> genoptionList) {
        regGenoption(CK_INS, cTL(genoptionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genoption The collection of genoption as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setGenoption_InScope(String genoption, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(genoption), getCValueGenoption(), "GenOption", "Genoption", "genoption", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setGenoption_IsNull() { regGenoption(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setGenoption_IsNotNull() { regGenoption(CK_ISNN, DUMMY_OBJECT); }

    protected void regGenoption(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueGenoption(), "GenOption", "Genoption", "genoption");
    }
    protected void registerInlineGenoption(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueGenoption(), "GenOption", "Genoption", "genoption");
    }
    abstract protected ConditionValue getCValueGenoption();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param length The value of length as equal.
     */
    public void setLength_Equal(java.lang.Integer length) {
        regLength(CK_EQ, length);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param length The value of length as notEqual.
     */
    public void setLength_NotEqual(java.lang.Integer length) {
        regLength(CK_NE, length);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param length The value of length as greaterThan.
     */
    public void setLength_GreaterThan(java.lang.Integer length) {
        regLength(CK_GT, length);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param length The value of length as lessThan.
     */
    public void setLength_LessThan(java.lang.Integer length) {
        regLength(CK_LT, length);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param length The value of length as greaterEqual.
     */
    public void setLength_GreaterEqual(java.lang.Integer length) {
        regLength(CK_GE, length);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param length The value of length as lessEqual.
     */
    public void setLength_LessEqual(java.lang.Integer length) {
        regLength(CK_LE, length);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param lengthList The collection of length as inScope.
     */
    public void setLength_InScope(Collection<java.lang.Integer> lengthList) {
        regLength(CK_INS, cTL(lengthList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setLength_IsNull() { regLength(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setLength_IsNotNull() { regLength(CK_ISNN, DUMMY_OBJECT); }

    protected void regLength(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueLength(), "Length", "Length", "length");
    }
    protected void registerInlineLength(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLength(), "Length", "Length", "length");
    }
    abstract protected ConditionValue getCValueLength();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param precision The value of precision as equal.
     */
    public void setPrecision_Equal(java.lang.Integer precision) {
        regPrecision(CK_EQ, precision);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param precision The value of precision as notEqual.
     */
    public void setPrecision_NotEqual(java.lang.Integer precision) {
        regPrecision(CK_NE, precision);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param precision The value of precision as greaterThan.
     */
    public void setPrecision_GreaterThan(java.lang.Integer precision) {
        regPrecision(CK_GT, precision);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param precision The value of precision as lessThan.
     */
    public void setPrecision_LessThan(java.lang.Integer precision) {
        regPrecision(CK_LT, precision);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param precision The value of precision as greaterEqual.
     */
    public void setPrecision_GreaterEqual(java.lang.Integer precision) {
        regPrecision(CK_GE, precision);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param precision The value of precision as lessEqual.
     */
    public void setPrecision_LessEqual(java.lang.Integer precision) {
        regPrecision(CK_LE, precision);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param precisionList The collection of precision as inScope.
     */
    public void setPrecision_InScope(Collection<java.lang.Integer> precisionList) {
        regPrecision(CK_INS, cTL(precisionList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPrecision_IsNull() { regPrecision(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPrecision_IsNotNull() { regPrecision(CK_ISNN, DUMMY_OBJECT); }

    protected void regPrecision(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePrecision(), "Precision", "Precision", "precision");
    }
    protected void registerInlinePrecision(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePrecision(), "Precision", "Precision", "precision");
    }
    abstract protected ConditionValue getCValuePrecision();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param scale The value of scale as equal.
     */
    public void setScale_Equal(java.lang.Integer scale) {
        regScale(CK_EQ, scale);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param scale The value of scale as notEqual.
     */
    public void setScale_NotEqual(java.lang.Integer scale) {
        regScale(CK_NE, scale);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param scale The value of scale as greaterThan.
     */
    public void setScale_GreaterThan(java.lang.Integer scale) {
        regScale(CK_GT, scale);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param scale The value of scale as lessThan.
     */
    public void setScale_LessThan(java.lang.Integer scale) {
        regScale(CK_LT, scale);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param scale The value of scale as greaterEqual.
     */
    public void setScale_GreaterEqual(java.lang.Integer scale) {
        regScale(CK_GE, scale);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param scale The value of scale as lessEqual.
     */
    public void setScale_LessEqual(java.lang.Integer scale) {
        regScale(CK_LE, scale);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param scaleList The collection of scale as inScope.
     */
    public void setScale_InScope(Collection<java.lang.Integer> scaleList) {
        regScale(CK_INS, cTL(scaleList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setScale_IsNull() { regScale(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setScale_IsNotNull() { regScale(CK_ISNN, DUMMY_OBJECT); }

    protected void regScale(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueScale(), "Scale", "Scale", "scale");
    }
    protected void registerInlineScale(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueScale(), "Scale", "Scale", "scale");
    }
    abstract protected ConditionValue getCValueScale();

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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param classifier The value of classifier as equal.
     */
    public void setClassifier_Equal(String classifier) {
        regClassifier(CK_EQ, fRES(classifier));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifier The value of classifier as notEqual.
     */
    public void setClassifier_NotEqual(String classifier) {
        regClassifier(CK_NE, fRES(classifier));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifier The value of classifier as greaterThan.
     */
    public void setClassifier_GreaterThan(String classifier) {
        regClassifier(CK_GT, fRES(classifier));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifier The value of classifier as lessThan.
     */
    public void setClassifier_LessThan(String classifier) {
        regClassifier(CK_LT, fRES(classifier));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifier The value of classifier as greaterEqual.
     */
    public void setClassifier_GreaterEqual(String classifier) {
        regClassifier(CK_GE, fRES(classifier));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifier The value of classifier as lessEqual.
     */
    public void setClassifier_LessEqual(String classifier) {
        regClassifier(CK_LE, fRES(classifier));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param classifier The value of classifier as prefixSearch.
     */
    public void setClassifier_PrefixSearch(String classifier) {
        regClassifier(CK_PS, fRES(classifier));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param classifier The value of classifier as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassifier_LikeSearch(String classifier, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(classifier), getCValueClassifier(), "Classifier", "Classifier", "classifier", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param classifierList The collection of classifier as inScope.
     */
    public void setClassifier_InScope(Collection<String> classifierList) {
        regClassifier(CK_INS, cTL(classifierList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param classifier The collection of classifier as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setClassifier_InScope(String classifier, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(classifier), getCValueClassifier(), "Classifier", "Classifier", "classifier", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setClassifier_IsNull() { regClassifier(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setClassifier_IsNotNull() { regClassifier(CK_ISNN, DUMMY_OBJECT); }

    protected void regClassifier(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueClassifier(), "Classifier", "Classifier", "classifier");
    }
    protected void registerInlineClassifier(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueClassifier(), "Classifier", "Classifier", "classifier");
    }
    abstract protected ConditionValue getCValueClassifier();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param eaGuid The value of eaGuid as equal.
     */
    public void setEaGuid_Equal(String eaGuid) {
        regEaGuid(CK_EQ, fRES(eaGuid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as notEqual.
     */
    public void setEaGuid_NotEqual(String eaGuid) {
        regEaGuid(CK_NE, fRES(eaGuid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as greaterThan.
     */
    public void setEaGuid_GreaterThan(String eaGuid) {
        regEaGuid(CK_GT, fRES(eaGuid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as lessThan.
     */
    public void setEaGuid_LessThan(String eaGuid) {
        regEaGuid(CK_LT, fRES(eaGuid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as greaterEqual.
     */
    public void setEaGuid_GreaterEqual(String eaGuid) {
        regEaGuid(CK_GE, fRES(eaGuid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as lessEqual.
     */
    public void setEaGuid_LessEqual(String eaGuid) {
        regEaGuid(CK_LE, fRES(eaGuid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param eaGuid The value of eaGuid as prefixSearch.
     */
    public void setEaGuid_PrefixSearch(String eaGuid) {
        regEaGuid(CK_PS, fRES(eaGuid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEaGuid_LikeSearch(String eaGuid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuidList The collection of eaGuid as inScope.
     */
    public void setEaGuid_InScope(Collection<String> eaGuidList) {
        regEaGuid(CK_INS, cTL(eaGuidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuid The collection of eaGuid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setEaGuid_InScope(String eaGuid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setEaGuid_IsNull() { regEaGuid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setEaGuid_IsNotNull() { regEaGuid(CK_ISNN, DUMMY_OBJECT); }

    protected void regEaGuid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid");
    }
    protected void registerInlineEaGuid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueEaGuid(), "ea_guid", "EaGuid", "eaGuid");
    }
    abstract protected ConditionValue getCValueEaGuid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
     * @param styleex The value of styleex as equal.
     */
    public void setStyleex_Equal(String styleex) {
        regStyleex(CK_EQ, fRES(styleex));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param styleex The value of styleex as notEqual.
     */
    public void setStyleex_NotEqual(String styleex) {
        regStyleex(CK_NE, fRES(styleex));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param styleex The value of styleex as greaterThan.
     */
    public void setStyleex_GreaterThan(String styleex) {
        regStyleex(CK_GT, fRES(styleex));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param styleex The value of styleex as lessThan.
     */
    public void setStyleex_LessThan(String styleex) {
        regStyleex(CK_LT, fRES(styleex));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param styleex The value of styleex as greaterEqual.
     */
    public void setStyleex_GreaterEqual(String styleex) {
        regStyleex(CK_GE, fRES(styleex));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param styleex The value of styleex as lessEqual.
     */
    public void setStyleex_LessEqual(String styleex) {
        regStyleex(CK_LE, fRES(styleex));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param styleex The value of styleex as prefixSearch.
     */
    public void setStyleex_PrefixSearch(String styleex) {
        regStyleex(CK_PS, fRES(styleex));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param styleex The value of styleex as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStyleex_LikeSearch(String styleex, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(styleex), getCValueStyleex(), "StyleEx", "Styleex", "styleex", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleexList The collection of styleex as inScope.
     */
    public void setStyleex_InScope(Collection<String> styleexList) {
        regStyleex(CK_INS, cTL(styleexList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleex The collection of styleex as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setStyleex_InScope(String styleex, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(styleex), getCValueStyleex(), "StyleEx", "Styleex", "styleex", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setStyleex_IsNull() { regStyleex(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setStyleex_IsNotNull() { regStyleex(CK_ISNN, DUMMY_OBJECT); }

    protected void regStyleex(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueStyleex(), "StyleEx", "Styleex", "styleex");
    }
    protected void registerInlineStyleex(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueStyleex(), "StyleEx", "Styleex", "styleex");
    }
    abstract protected ConditionValue getCValueStyleex();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TAttributeCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TAttributeCQ.class.getName(); }
}
